/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediacleaner;

import java.io.File;

/**
 *
 * @author mrogers
 */
public class RecursiveScanner
{

    static final int MAX_DEPTH = 20;  // Max 20 levels (directory nesting)
    static final String INDENT_STR = "   ";                 // Single indent.
    static final String[] INDENTS = new String[MAX_DEPTH]; // Indent array.

    public RecursiveScanner(String directory)
    {
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
    }

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
            FrmScanDirectory.currentlyScanning(fdir.getAbsolutePath());
            String fileExtension = fdir.getName().toString();

            if (!fdir.getAbsolutePath().contains("WINDOWS") && !fdir.getAbsolutePath().contains("Program Files"))
            {
                if (fileExtension.endsWith(".mp3")
                        || fileExtension.endsWith(".wma")
                        || fileExtension.endsWith(".mpeg")
                        || fileExtension.endsWith(".mpg")
                        || fileExtension.endsWith(".avi")
                        || fileExtension.endsWith(".mov")
                        || fileExtension.endsWith(".vob")
                        || fileExtension.endsWith(".3gp")
                        || fileExtension.endsWith(".m4a")
                        || fileExtension.endsWith(".aac")
                        || fileExtension.endsWith(".m3u")
                        || fileExtension.endsWith(".pls")
                        || fileExtension.endsWith(".wpl"))
                {
                    //System.out.println("File Found:" + fdir.getName().toString());
                    FrmScanDirectory.addFile(fdir);
                }
            }

        }
    }
}
