/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmScanDirectory.java
 *
 * Created on Sep 27, 2010, 11:55:02 AM
 */
package mediacleaner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.jdesktop.application.Action;
import org.jdesktop.application.Task;

/**
 *
 * @author m.rogers
 */
public class FrmScanDirectory extends javax.swing.JInternalFrame
{

    File selectedFile;
  

    /** Creates new form FrmScanDirectory */
    public FrmScanDirectory()
    {
        initComponents();
        initializeExtensions();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scanTabbedPane = new javax.swing.JTabbedPane();
        directoryPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSelectedDirectory = new javax.swing.JTextField();
        cmdBrowse = new javax.swing.JButton();
        cmdCancel = new javax.swing.JButton();
        cmdNext = new javax.swing.JButton();
        fileTypesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        extensionsPanel = new javax.swing.JPanel();
        musicPanel = new javax.swing.JPanel();
        chkMP3 = new javax.swing.JCheckBox();
        chkWMA = new javax.swing.JCheckBox();
        chkWAV = new javax.swing.JCheckBox();
        chkOGG = new javax.swing.JCheckBox();
        chkM4A = new javax.swing.JCheckBox();
        chkAAC = new javax.swing.JCheckBox();
        chkMP4 = new javax.swing.JCheckBox();
        videoPanel = new javax.swing.JPanel();
        chkAVI = new javax.swing.JCheckBox();
        chkMPG = new javax.swing.JCheckBox();
        chkVOB = new javax.swing.JCheckBox();
        chkMOV = new javax.swing.JCheckBox();
        chk3GP = new javax.swing.JCheckBox();
        playlistPanel = new javax.swing.JPanel();
        chkPLS = new javax.swing.JCheckBox();
        chkWPL = new javax.swing.JCheckBox();
        chkM3U = new javax.swing.JCheckBox();
        cmdCancel2 = new javax.swing.JButton();
        cmdNext2 = new javax.swing.JButton();
        scanPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();
        cmdClose = new javax.swing.JButton();
        cmdDeleteFile = new javax.swing.JButton();
        cmdScan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCuttrentlyScanning = new javax.swing.JTextField();
        cmdExport = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(mediacleaner.MediaCleanerApp.class).getContext().getResourceMap(FrmScanDirectory.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setToolTipText(resourceMap.getString("Form.toolTipText")); // NOI18N
        setFrameIcon(resourceMap.getIcon("Form.frameIcon")); // NOI18N
        setName("Form"); // NOI18N

        scanTabbedPane.setName("scanTabbedPane"); // NOI18N

        directoryPanel.setName("directoryPanel"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        txtSelectedDirectory.setEditable(false);
        txtSelectedDirectory.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSelectedDirectory.setText(resourceMap.getString("txtSelectedDirectory.text")); // NOI18N
        txtSelectedDirectory.setName("txtSelectedDirectory"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(mediacleaner.MediaCleanerApp.class).getContext().getActionMap(FrmScanDirectory.class, this);
        cmdBrowse.setAction(actionMap.get("browse")); // NOI18N
        cmdBrowse.setIcon(resourceMap.getIcon("cmdBrowse.icon")); // NOI18N
        cmdBrowse.setText(resourceMap.getString("cmdBrowse.text")); // NOI18N
        cmdBrowse.setName("cmdBrowse"); // NOI18N

        cmdCancel.setAction(actionMap.get("cancel")); // NOI18N
        cmdCancel.setText(resourceMap.getString("cmdCancel.text")); // NOI18N
        cmdCancel.setName("cmdCancel"); // NOI18N

        cmdNext.setAction(actionMap.get("Next")); // NOI18N
        cmdNext.setIcon(resourceMap.getIcon("cmdNext.icon")); // NOI18N
        cmdNext.setText(resourceMap.getString("cmdNext.text")); // NOI18N
        cmdNext.setName("cmdNext"); // NOI18N

        javax.swing.GroupLayout directoryPanelLayout = new javax.swing.GroupLayout(directoryPanel);
        directoryPanel.setLayout(directoryPanelLayout);
        directoryPanelLayout.setHorizontalGroup(
            directoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(directoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(directoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(directoryPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSelectedDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdBrowse))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, directoryPanelLayout.createSequentialGroup()
                        .addComponent(cmdNext)
                        .addGap(18, 18, 18)
                        .addComponent(cmdCancel)))
                .addContainerGap())
        );
        directoryPanelLayout.setVerticalGroup(
            directoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(directoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(directoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSelectedDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdBrowse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                .addGroup(directoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCancel)
                    .addComponent(cmdNext))
                .addContainerGap())
        );

        scanTabbedPane.addTab(resourceMap.getString("directoryPanel.TabConstraints.tabTitle"), resourceMap.getIcon("directoryPanel.TabConstraints.tabIcon"), directoryPanel, resourceMap.getString("directoryPanel.TabConstraints.tabToolTip")); // NOI18N

        fileTypesPanel.setName("fileTypesPanel"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        extensionsPanel.setName("extensionsPanel"); // NOI18N

        musicPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), resourceMap.getString("musicPanel.border.title"))); // NOI18N
        musicPanel.setName("musicPanel"); // NOI18N

        chkMP3.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkMP3.setSelected(true);
        chkMP3.setText(resourceMap.getString("chkMP3.text")); // NOI18N
        chkMP3.setToolTipText(resourceMap.getString("chkMP3.toolTipText")); // NOI18N
        chkMP3.setName("chkMP3"); // NOI18N

        chkWMA.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkWMA.setSelected(true);
        chkWMA.setText(resourceMap.getString("chkWMA.text")); // NOI18N
        chkWMA.setToolTipText(resourceMap.getString("chkWMA.toolTipText")); // NOI18N
        chkWMA.setName("chkWMA"); // NOI18N

        chkWAV.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkWAV.setSelected(true);
        chkWAV.setText(resourceMap.getString("chkWAV.text")); // NOI18N
        chkWAV.setToolTipText(resourceMap.getString("chkWAV.toolTipText")); // NOI18N
        chkWAV.setName("chkWAV"); // NOI18N

        chkOGG.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkOGG.setSelected(true);
        chkOGG.setText(resourceMap.getString("chkOGG.text")); // NOI18N
        chkOGG.setName("chkOGG"); // NOI18N

        chkM4A.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkM4A.setSelected(true);
        chkM4A.setText(resourceMap.getString("chkM4A.text")); // NOI18N
        chkM4A.setName("chkM4A"); // NOI18N

        chkAAC.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkAAC.setSelected(true);
        chkAAC.setText(resourceMap.getString("chkAAC.text")); // NOI18N
        chkAAC.setName("chkAAC"); // NOI18N

        chkMP4.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkMP4.setSelected(true);
        chkMP4.setText(resourceMap.getString("chkMP4.text")); // NOI18N
        chkMP4.setName("chkMP4"); // NOI18N

        javax.swing.GroupLayout musicPanelLayout = new javax.swing.GroupLayout(musicPanel);
        musicPanel.setLayout(musicPanelLayout);
        musicPanelLayout.setHorizontalGroup(
            musicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musicPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(musicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(musicPanelLayout.createSequentialGroup()
                        .addComponent(chkMP3)
                        .addGap(18, 18, 18)
                        .addComponent(chkOGG)
                        .addGap(18, 18, 18)
                        .addComponent(chkMP4)
                        .addGap(18, 18, 18)
                        .addComponent(chkM4A)
                        .addGap(18, 18, 18)
                        .addComponent(chkWMA)
                        .addGap(18, 18, 18)
                        .addComponent(chkWAV))
                    .addComponent(chkAAC))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        musicPanelLayout.setVerticalGroup(
            musicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musicPanelLayout.createSequentialGroup()
                .addGroup(musicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMP3)
                    .addComponent(chkOGG)
                    .addComponent(chkMP4)
                    .addComponent(chkM4A)
                    .addComponent(chkWMA)
                    .addComponent(chkWAV))
                .addGap(18, 18, 18)
                .addComponent(chkAAC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        videoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), resourceMap.getString("videoPanel.border.title"))); // NOI18N
        videoPanel.setName("videoPanel"); // NOI18N

        chkAVI.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkAVI.setSelected(true);
        chkAVI.setText(resourceMap.getString("chkAVI.text")); // NOI18N
        chkAVI.setToolTipText(resourceMap.getString("chkAVI.toolTipText")); // NOI18N
        chkAVI.setName("chkAVI"); // NOI18N

        chkMPG.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkMPG.setSelected(true);
        chkMPG.setText(resourceMap.getString("chkMPG.text")); // NOI18N
        chkMPG.setToolTipText(resourceMap.getString("chkMPG.toolTipText")); // NOI18N
        chkMPG.setName("chkMPG"); // NOI18N

        chkVOB.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkVOB.setSelected(true);
        chkVOB.setText(resourceMap.getString("chkVOB.text")); // NOI18N
        chkVOB.setToolTipText(resourceMap.getString("chkVOB.toolTipText")); // NOI18N
        chkVOB.setName("chkVOB"); // NOI18N

        chkMOV.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkMOV.setSelected(true);
        chkMOV.setText(resourceMap.getString("chkMOV.text")); // NOI18N
        chkMOV.setName("chkMOV"); // NOI18N

        chk3GP.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chk3GP.setSelected(true);
        chk3GP.setText(resourceMap.getString("chk3GP.text")); // NOI18N
        chk3GP.setName("chk3GP"); // NOI18N

        javax.swing.GroupLayout videoPanelLayout = new javax.swing.GroupLayout(videoPanel);
        videoPanel.setLayout(videoPanelLayout);
        videoPanelLayout.setHorizontalGroup(
            videoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(videoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkAVI)
                .addGap(18, 18, 18)
                .addComponent(chkMOV)
                .addGap(10, 10, 10)
                .addComponent(chkMPG)
                .addGap(18, 18, 18)
                .addComponent(chk3GP)
                .addGap(18, 18, 18)
                .addComponent(chkVOB)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        videoPanelLayout.setVerticalGroup(
            videoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(videoPanelLayout.createSequentialGroup()
                .addGroup(videoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAVI)
                    .addComponent(chkMOV)
                    .addComponent(chkMPG)
                    .addComponent(chk3GP)
                    .addComponent(chkVOB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        playlistPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), resourceMap.getString("playlistPanel.border.title"))); // NOI18N
        playlistPanel.setName("playlistPanel"); // NOI18N

        chkPLS.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkPLS.setSelected(true);
        chkPLS.setText(resourceMap.getString("chkPLS.text")); // NOI18N
        chkPLS.setName("chkPLS"); // NOI18N

        chkWPL.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkWPL.setSelected(true);
        chkWPL.setText(resourceMap.getString("chkWPL.text")); // NOI18N
        chkWPL.setName("chkWPL"); // NOI18N

        chkM3U.setAction(actionMap.get("checkFileExtensions")); // NOI18N
        chkM3U.setSelected(true);
        chkM3U.setText(resourceMap.getString("chkM3U.text")); // NOI18N
        chkM3U.setName("chkM3U"); // NOI18N

        javax.swing.GroupLayout playlistPanelLayout = new javax.swing.GroupLayout(playlistPanel);
        playlistPanel.setLayout(playlistPanelLayout);
        playlistPanelLayout.setHorizontalGroup(
            playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkPLS)
                .addGap(18, 18, 18)
                .addComponent(chkWPL)
                .addGap(18, 18, 18)
                .addComponent(chkM3U)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        playlistPanelLayout.setVerticalGroup(
            playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistPanelLayout.createSequentialGroup()
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPLS)
                    .addComponent(chkWPL)
                    .addComponent(chkM3U))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout extensionsPanelLayout = new javax.swing.GroupLayout(extensionsPanel);
        extensionsPanel.setLayout(extensionsPanelLayout);
        extensionsPanelLayout.setHorizontalGroup(
            extensionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extensionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(extensionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(musicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(videoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playlistPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        extensionsPanelLayout.setVerticalGroup(
            extensionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extensionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(musicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(videoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playlistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(extensionsPanel);

        cmdCancel2.setAction(actionMap.get("cancel")); // NOI18N
        cmdCancel2.setText(resourceMap.getString("cmdCancel2.text")); // NOI18N
        cmdCancel2.setName("cmdCancel2"); // NOI18N

        cmdNext2.setAction(actionMap.get("Next")); // NOI18N
        cmdNext2.setText(resourceMap.getString("cmdNext2.text")); // NOI18N
        cmdNext2.setName("cmdNext2"); // NOI18N

        javax.swing.GroupLayout fileTypesPanelLayout = new javax.swing.GroupLayout(fileTypesPanel);
        fileTypesPanel.setLayout(fileTypesPanelLayout);
        fileTypesPanelLayout.setHorizontalGroup(
            fileTypesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fileTypesPanelLayout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(cmdNext2)
                .addGap(18, 18, 18)
                .addComponent(cmdCancel2)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );
        fileTypesPanelLayout.setVerticalGroup(
            fileTypesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fileTypesPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fileTypesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCancel2)
                    .addComponent(cmdNext2))
                .addContainerGap())
        );

        scanTabbedPane.addTab(resourceMap.getString("fileTypesPanel.TabConstraints.tabTitle"), resourceMap.getIcon("fileTypesPanel.TabConstraints.tabIcon"), fileTypesPanel, resourceMap.getString("fileTypesPanel.TabConstraints.tabToolTip")); // NOI18N

        scanPanel.setName("scanPanel"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        tblResults.setAutoCreateRowSorter(true);
        tblResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delete", "File Name", "Path"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResults.setName("tblResults"); // NOI18N
        jScrollPane2.setViewportView(tblResults);
        tblResults.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("tblResults.columnModel.title0")); // NOI18N
        tblResults.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("tblResults.columnModel.title1")); // NOI18N
        tblResults.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("tblResults.columnModel.title2")); // NOI18N

        cmdClose.setAction(actionMap.get("cancel")); // NOI18N
        cmdClose.setText(resourceMap.getString("cmdClose.text")); // NOI18N
        cmdClose.setName("cmdClose"); // NOI18N

        cmdDeleteFile.setAction(actionMap.get("deleteFiles")); // NOI18N
        cmdDeleteFile.setText(resourceMap.getString("cmdDeleteFile.text")); // NOI18N
        cmdDeleteFile.setName("cmdDeleteFile"); // NOI18N

        cmdScan.setAction(actionMap.get("scan")); // NOI18N
        cmdScan.setText(resourceMap.getString("cmdScan.text")); // NOI18N
        cmdScan.setName("cmdScan"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        txtCuttrentlyScanning.setEditable(false);
        txtCuttrentlyScanning.setText(resourceMap.getString("txtCuttrentlyScanning.text")); // NOI18N
        txtCuttrentlyScanning.setName("txtCuttrentlyScanning"); // NOI18N

        cmdExport.setAction(actionMap.get("exportResult")); // NOI18N
        cmdExport.setText(resourceMap.getString("cmdExport.text")); // NOI18N
        cmdExport.setName("cmdExport"); // NOI18N

        javax.swing.GroupLayout scanPanelLayout = new javax.swing.GroupLayout(scanPanel);
        scanPanel.setLayout(scanPanelLayout);
        scanPanelLayout.setHorizontalGroup(
            scanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addGroup(scanPanelLayout.createSequentialGroup()
                        .addComponent(cmdDeleteFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdExport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(cmdScan)
                        .addGap(18, 18, 18)
                        .addComponent(cmdClose))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, scanPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCuttrentlyScanning, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)))
                .addContainerGap())
        );
        scanPanelLayout.setVerticalGroup(
            scanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCuttrentlyScanning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(scanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdDeleteFile)
                    .addComponent(cmdScan)
                    .addComponent(cmdExport)
                    .addComponent(cmdClose))
                .addContainerGap())
        );

        scanTabbedPane.addTab(resourceMap.getString("scanPanel.TabConstraints.tabTitle"), resourceMap.getIcon("scanPanel.TabConstraints.tabIcon"), scanPanel, resourceMap.getString("scanPanel.TabConstraints.tabToolTip")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scanTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scanTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Action
    public void cancel()
    {
        String message = "Are you sure you want to close this window.";
        int response = JOptionPane.showConfirmDialog(rootPane, message, "iMediaCleaner", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        {
            this.dispose();
        }
    }

    @Action
    public void Next()
    {
        scanTabbedPane.setSelectedIndex(scanTabbedPane.getSelectedIndex() + 1);
    }

    @Action(block = Task.BlockingScope.COMPONENT)
    public Task scan()
    {
        return new ScanTask(org.jdesktop.application.Application.getInstance(mediacleaner.MediaCleanerApp.class));
    }

    private class ScanTask extends org.jdesktop.application.Task<Object, Void>
    {

        String path = "";

        ScanTask(org.jdesktop.application.Application app)
        {
            super(app);
            try
            {
                path = selectedFile.getCanonicalPath();
            }
            catch (IOException ex)
            {
                Logger.getLogger(FrmScanDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        protected Object doInBackground()
        {
            setMessage("Scanning Directory.");
            RecursiveScanner recursiveScanner = new RecursiveScanner(path);
            setMessage("Done Scanning Directory.");
            return null;  // return your result
        }

        @Override
        protected void succeeded(Object result)
        {
            setMessage("Loading Results");

            tblResults.setModel(RecursiveScanner.loadResults());

            tblResults.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            TableColumnAdjuster tca = new TableColumnAdjuster(tblResults);
            tca.adjustColumns();

            //currentlyScanning("Done Scanning!");
            setMessage("Done Loading Results");
        }
    }

    @Action
    public void browse()
    {
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        if (fc.showOpenDialog(rootPane) == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                selectedFile = fc.getSelectedFile();
                txtSelectedDirectory.setText(selectedFile.getCanonicalPath().toString());
            }
            catch (IOException ex)
            {
                Logger.getLogger(FrmScanDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Action
    public Task deleteFiles()
    {
        return new DeleteFilesTask(org.jdesktop.application.Application.getInstance(mediacleaner.MediaCleanerApp.class));
    }

    private class DeleteFilesTask extends org.jdesktop.application.Task<Object, Void>
    {

        ArrayList<Object> fileDeleteList = new ArrayList<Object>();

        DeleteFilesTask(org.jdesktop.application.Application app)
        {
            super(app);

            String message = "Are you sure you want to delete the marked files?";
            int response = JOptionPane.showConfirmDialog(rootPane, message, "iMediaCleaner", JOptionPane.INFORMATION_MESSAGE);

            if (response == JOptionPane.YES_OPTION)
            {
                for (int i = 0; i < tblResults.getRowCount(); i++)
                {
                    if (tblResults.getValueAt(i, 0) == Boolean.TRUE)
                    {
                        fileDeleteList.add(tblResults.getValueAt(i, 2));
                    }
                }
            }
        }

        @Override
        protected Object doInBackground()
        {

            setMessage("Deleting Files.");
            for (int i = 0; i < fileDeleteList.size(); i++)
            {
                File toDelete = new File(fileDeleteList.get(i).toString());
                //System.out.println(toDelete.getAbsolutePath());
                toDelete.delete();
                setProgress(i, 0, fileDeleteList.size());
            }
            setMessage("Done deleting files.");
            return null;  // return your result
        }

        @Override
        protected void succeeded(Object result)
        {
            String message = "The file deletion process has been completed.";
            JOptionPane.showMessageDialog(rootPane, message, "iMediaCleaner", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void initializeExtensions()
    {
        checkFileExtensions();
    }

    @Action
    public void checkFileExtensions()
    {
        //Remove all items from the list
        RecursiveScanner.removeAllExtensions();

        //Music Group
        if (chkM4A.isSelected())
        {
            RecursiveScanner.addExtension(".M4A");
        }
        if (chkAAC.isSelected())
        {
            RecursiveScanner.addExtension(".AAC");
        }
        if (chkMP3.isSelected())
        {
            RecursiveScanner.addExtension(".MP3");
        }
        if (chkOGG.isSelected())
        {
            RecursiveScanner.addExtension(".OGG");
        }
        if (chkWAV.isSelected())
        {
            RecursiveScanner.addExtension(".WAV");
        }
        if (chkWMA.isSelected())
        {
            RecursiveScanner.addExtension(".WMA");
        }

        //Video Group
        if (chk3GP.isSelected())
        {
            RecursiveScanner.addExtension(".3GP");
        }
        if (chkAVI.isSelected())
        {
            RecursiveScanner.addExtension(".AVI");
        }
        if (chkMOV.isSelected())
        {
            RecursiveScanner.addExtension(".MOV");
        }
        if (chkMP4.isSelected())
        {
            RecursiveScanner.addExtension(".MP4");
        }
        if (chkMPG.isSelected())
        {
            RecursiveScanner.addExtension(".MPG");
            RecursiveScanner.addExtension(".MPEG");
        }
        if (chkVOB.isSelected())
        {
            RecursiveScanner.addExtension(".VOB");
        }


        //Playlist Group
        if (chkPLS.isSelected())
        {
            RecursiveScanner.addExtension(".PLS");
        }
        if (chkWPL.isSelected())
        {
            RecursiveScanner.addExtension(".WPL");
        }
        if (chkM3U.isSelected())
        {
            RecursiveScanner.addExtension(".M3U");
        }
    }

    @Action
    public void exportResult()
    {
        File exportFile = null;

        String scanDate = new SimpleDateFormat("MMMMM dd, yyyy hh:mm aaa").format(new java.util.Date());
        String noOfResults = String.valueOf(RecursiveScanner.noOfFiles());
        String computerName = "";
        String ipAddress = "";

        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        if (fc.showSaveDialog(rootPane) == JFileChooser.APPROVE_OPTION)
        {
            exportFile = fc.getSelectedFile();
            try
            {
                computerName = InetAddress.getLocalHost().getHostName();
                ipAddress = InetAddress.getLocalHost().getHostAddress();

                BufferedWriter writer = new BufferedWriter(new FileWriter(exportFile));
                writer.write("iMediaCleaner Scan");
                writer.newLine();
                writer.write("Computer Name: " + computerName);
                writer.newLine();
                writer.write("IP Address: " + ipAddress);
                writer.newLine();
                writer.write("Scan Date: " + scanDate);
                writer.newLine();
                writer.newLine();
                writer.write("The scan found " + noOfResults + " multimedia files.");
                writer.newLine();
                writer.write("Below are those results.");
                writer.newLine();
                writer.newLine();

                ArrayList<File> fileList = RecursiveScanner.getDiscoveredFiles();

                for (int i = 0; i < fileList.size(); i++)
                {
                    File currFile = fileList.get(i);

                    writer.write(String.valueOf(i + 1) + "\t" + currFile.getAbsolutePath());
                    writer.newLine();
                }

                writer.newLine();
                writer.write("--------------- END OF REPORT ---------------");
                writer.close();

                String message = "Export process complete!";
                JOptionPane.showMessageDialog(rootPane, message, "iMediaCleaner", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IOException e)
            {
                String message = "An error ocurred while exporting the results to a file.";
                Logger.getLogger(FrmScanDirectory.class.getName()).log(Level.SEVERE, message, e);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk3GP;
    private javax.swing.JCheckBox chkAAC;
    private javax.swing.JCheckBox chkAVI;
    private javax.swing.JCheckBox chkM3U;
    private javax.swing.JCheckBox chkM4A;
    private javax.swing.JCheckBox chkMOV;
    private javax.swing.JCheckBox chkMP3;
    private javax.swing.JCheckBox chkMP4;
    private javax.swing.JCheckBox chkMPG;
    private javax.swing.JCheckBox chkOGG;
    private javax.swing.JCheckBox chkPLS;
    private javax.swing.JCheckBox chkVOB;
    private javax.swing.JCheckBox chkWAV;
    private javax.swing.JCheckBox chkWMA;
    private javax.swing.JCheckBox chkWPL;
    private javax.swing.JButton cmdBrowse;
    private javax.swing.JButton cmdCancel;
    private javax.swing.JButton cmdCancel2;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdDeleteFile;
    private javax.swing.JButton cmdExport;
    private javax.swing.JButton cmdNext;
    private javax.swing.JButton cmdNext2;
    private javax.swing.JButton cmdScan;
    private javax.swing.JPanel directoryPanel;
    private javax.swing.JPanel extensionsPanel;
    private javax.swing.JPanel fileTypesPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel musicPanel;
    private javax.swing.JPanel playlistPanel;
    private javax.swing.JPanel scanPanel;
    private javax.swing.JTabbedPane scanTabbedPane;
    private javax.swing.JTable tblResults;
    private javax.swing.JTextField txtCuttrentlyScanning;
    private javax.swing.JTextField txtSelectedDirectory;
    private javax.swing.JPanel videoPanel;
    // End of variables declaration//GEN-END:variables
}
