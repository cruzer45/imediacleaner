/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediacleaner;

import java.io.File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrogers
 */
public class RecursiveScanner
{

    static final int MAX_DEPTH = 20;  // Max 20 levels (directory nesting)
    static final String INDENT_STR = "   ";                 // Single indent.
    static final String[] INDENTS = new String[MAX_DEPTH]; // Indent array.
    static ArrayList<String> fileExtensions = new ArrayList<String>();
    static ArrayList<File> discoveredFiles = new ArrayList<File>();
    private static boolean isScanning = false;

    /**
     * @return the isScanning
     */
    public static boolean isIsScanning()
    {
        return isScanning;
    }

    /**
     * @param aIsScanning the isScanning to set
     */
    public static void setIsScanning(boolean aIsScanning)
    {
        isScanning = aIsScanning;
    }

    public RecursiveScanner(String directory)
    {
        isScanning = true;
        discoveredFiles = new ArrayList<File>();

        //... Initialize array of indentations.
        INDENTS[0] = INDENT_STR;
        for (int i = 1; i < MAX_DEPTH; i++)
        {
            INDENTS[i] = INDENTS[i - 1] + INDENT_STR;
        }

        File root = new File(directory);
        if (root != null && root.isDirectory())
        {
            listRecursively(root, 0);
        }
        else
        {
            System.out.println("Not a directory: " + root);
        }
        isScanning = false;
    }

    /**
     * This method will recursively scan through all files and folders in a given directory
     * @param fdir
     * @param depth
     */
    public static void listRecursively(File fdir, int depth)
    {
        if (fdir.isDirectory() && depth < MAX_DEPTH)
        {
            for (File f : fdir.listFiles())
            {  // Go over each file/subdirectory.
                listRecursively(f, depth + 1);
            }
        }
        else if (fdir.isFile())
        {
            //FrmScanDirectory.currentlyScanning(fdir.getAbsolutePath());
            String fileName = fdir.getName().toString();

            if (!fdir.getAbsolutePath().contains("WINDOWS") && !fdir.getAbsolutePath().contains("Program Files"))
            {
                if (checkFileType(fileName))
                {
                    discoveredFiles.add(fdir);
                }
            }
        }
    } //end listRecursively(File fdir, int depth)

    /**
     * This method checks if the file type is on the blacklist.
     * @param fileName
     */
    private static boolean checkFileType(String fileName)
    {
        //Loop through all the selected file types.
        for (String extension : fileExtensions)
        {
            //If the file extensions matches one on the list then the file is flagged
            if (fileName.toLowerCase().endsWith(extension.toLowerCase()))
            {
                return true;
            }
        }
        return false;
    }

    public static void addExtension(String extension)
    {
        fileExtensions.add(extension);
    }

    public static void removeExtension(String extension)
    {
        fileExtensions.remove(extension);
    }

    public static void removeAllExtensions()
    {
        fileExtensions = new ArrayList<String>();
    }

    public static DefaultTableModel loadResults()
    {
        DefaultTableModel model = new DefaultTableModel()
        {

            @Override
            public Class getColumnClass(int columnIndex)
            {
                Object o = getValueAt(0, columnIndex);
                if (o == null)
                {
                    return Object.class;
                }
                else
                {
                    return o.getClass();
                }
            }
        };

        model.addColumn("Delete");
        model.addColumn("File Name");
        model.addColumn("Path");

        for (int i = 0; i < discoveredFiles.size(); i++)
        {
            File currentfile = discoveredFiles.get(i);

            model.addRow(new Object[]
                    {
                        true, currentfile.getName(), currentfile.getAbsolutePath()
                    });
        }
        return model;
    }

    public static int noOfFiles()
    {
        return discoveredFiles.size();
    }

    public static ArrayList<File> getDiscoveredFiles()
    {
        return discoveredFiles;
    }
}
