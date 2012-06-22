/*
 *
 *  BarcodeOverIP-Server (Java) Version 0.7.x
 *  Copyright (C) 2012, Tyler H. Jones (me@tylerjones.me)
 *  http://boip.tylerjones.me
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  Filename: MainFrame.java
 *  Package Name: com.tylerhjones.boip.server
 *  Created By: Tyler H. Jones on Feb 25, 2012, 10:40:16 AM
 *
 *  Description: This is the settings window GUI class. The GUI is configured
 *  and run from this class.
 *
 */

package com.tylerhjones.boip.server;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarFile;
import javax.swing.JOptionPane;


// MainFrame class
public class MainFrame extends javax.swing.JFrame {

    private String TAG = "MainFrame";

    private static final String NO = "NO";
    private static final String OK = "OK";

    private ServerCore Server = new ServerCore();

    private Settings SET = new Settings();

    private TrayIcon SysTrayIcon;

    public static JarFile jar;
    public static String basePath = "";
    public static InetAddress localAddr;

    private Toolkit toolkit;

    private Thread serverThread = new Thread(Server);

    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        btnApply = new javax.swing.JButton();
        btnToggleServer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnAbout = new javax.swing.JButton();
        chkAppendNL = new javax.swing.JCheckBox();
        frameAdvanced = new javax.swing.JPanel();
        txtHost = new javax.swing.JTextField();
        lblHostTitle = new javax.swing.JLabel();
        lblPortTitle = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        chkAutoSet = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        lblLastClient = new javax.swing.JLabel();
        lblHost = new javax.swing.JLabel();
        lblPort = new javax.swing.JLabel();

        setTitle("BarcodeOverIP-Server");
        setAlwaysOnTop(true);
        setName("MainWindow"); // NOI18N
        setResizable(false);

        btnExit.setText("Exit");
        btnExit.setToolTipText("Exit the server application and close all connections.");
        btnExit.setMaximumSize(new java.awt.Dimension(85, 29));
        btnExit.setMinimumSize(new java.awt.Dimension(65, 29));
        btnExit.setPreferredSize(new java.awt.Dimension(85, 29));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnOk.setText("Hide");
        btnOk.setToolTipText("Hide this window and let the server run in the system tray.");
        btnOk.setMaximumSize(new java.awt.Dimension(85, 29));
        btnOk.setMinimumSize(new java.awt.Dimension(65, 29));
        btnOk.setPreferredSize(new java.awt.Dimension(85, 29));
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnApply.setText("Apply");
        btnApply.setToolTipText("Save changes to server configuraton");
        btnApply.setMaximumSize(new java.awt.Dimension(85, 29));
        btnApply.setMinimumSize(new java.awt.Dimension(65, 29));
        btnApply.setPreferredSize(new java.awt.Dimension(85, 29));
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        btnToggleServer.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        btnToggleServer.setText("Deactivate Server");
        btnToggleServer.setToolTipText("Deactivate the server to prevent barcodes being received and typed");
        btnToggleServer.setMaximumSize(new java.awt.Dimension(402, 29));
        btnToggleServer.setMinimumSize(new java.awt.Dimension(402, 29));
        btnToggleServer.setPreferredSize(new java.awt.Dimension(402, 29));
        btnToggleServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToggleServerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 14));
        jLabel1.setText("<html>Enter the IP and Port given below into your BarcodeOverIP Client app to scan and send barcodes to this computer. It's that easy!</html>");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setFocusable(false);
        jLabel1.setMaximumSize(new java.awt.Dimension(402, 45));
        jLabel1.setMinimumSize(new java.awt.Dimension(402, 45));
        jLabel1.setPreferredSize(new java.awt.Dimension(402, 45));

        jLabel4.setLabelFor(txtPassword);
        jLabel4.setText("Password (Optional):");
        jLabel4.setFocusable(false);

        txtPassword.setToolTipText("Set a password to limit access to the server. Make blank to remove the password requirement.");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnAbout.setText("About");
        btnAbout.setToolTipText("Click for info about BarcodeOverIP-Server");
        btnAbout.setMaximumSize(new java.awt.Dimension(85, 29));
        btnAbout.setMinimumSize(new java.awt.Dimension(65, 29));
        btnAbout.setPreferredSize(new java.awt.Dimension(85, 29));
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        chkAppendNL.setSelected(true);
        chkAppendNL.setText("Append a cairrage return (enter key) to received barcodes");
        chkAppendNL.setToolTipText("Adds a simulated press of the enter key after the barcode is received and typed by the system. Defualt is TRUE.");

        frameAdvanced.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Advanced Settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        frameAdvanced.setEnabled(false);
        frameAdvanced.setFocusable(false);
        frameAdvanced.setName("Advanced Settings"); // NOI18N

        txtHost.setText("0.0.0.0");
        txtHost.setToolTipText("Default = 0.0.0.0 (All interfaces)");
        txtHost.setEnabled(false);

        lblHostTitle.setLabelFor(txtHost);
        lblHostTitle.setText("Host/IP:");
        lblHostTitle.setEnabled(false);
        lblHostTitle.setFocusable(false);

        lblPortTitle.setLabelFor(lblPortTitle);
        lblPortTitle.setText("Port:");
        lblPortTitle.setEnabled(false);
        lblPortTitle.setFocusable(false);

        txtPort.setText("41788");
        txtPort.setToolTipText("Default = 41788");
        txtPort.setEnabled(false);

        javax.swing.GroupLayout frameAdvancedLayout = new javax.swing.GroupLayout(frameAdvanced);
        frameAdvanced.setLayout(frameAdvancedLayout);
        frameAdvancedLayout.setHorizontalGroup(
            frameAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAdvancedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHostTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPortTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        frameAdvancedLayout.setVerticalGroup(
            frameAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAdvancedLayout.createSequentialGroup()
                .addGroup(frameAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHostTitle)
                    .addComponent(lblPortTitle)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chkAutoSet.setSelected(true);
        chkAutoSet.setText("Automatically determine server IP & port number");
        chkAutoSet.setToolTipText("BoIP will look at you system's nerwork configuration and assign a port and an IP to listen for connections on.");
        chkAutoSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutoSetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabel2.setLabelFor(lblLastClient);
        jLabel2.setText("Last Client:");
        jLabel2.setToolTipText("(IP, UPC, When (Min/Hrs))");

        lblLastClient.setLabelFor(btnExit);
        lblLastClient.setText("NONE!");

        lblHost.setFont(new java.awt.Font("DejaVu Sans", 1, 36));
        lblHost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHost.setText("IP = 0.0.0.0");

        lblPort.setFont(new java.awt.Font("DejaVu Sans", 1, 36));
        lblPort.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPort.setText("Port = 41788");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLastClient, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(frameAdvanced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkAutoSet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                            .addComponent(chkAppendNL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                            .addComponent(btnToggleServer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPort, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHost, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHost, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(chkAutoSet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnToggleServer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(7, 7, 7)
                .addComponent(chkAppendNL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frameAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblLastClient))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnToggleServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToggleServerActionPerformed
        if(btnToggleServer.getText().equals("Activate Server")) {
            setServerState(true);
            btnToggleServer.setText("Deactivate Server");
            btnToggleServer.setToolTipText("Deactivate the server to prevent barcodes being sent and typed in");
            LogI(TAG, "Activated the server.");
        } else {
            setServerState(false);
            btnToggleServer.setText("Activate Server");
            btnToggleServer.setToolTipText("Activate the server to allow barcodes to be sent and typed in");
            LogI(TAG, "Deactivated the server.");
        }
    }//GEN-LAST:event_btnToggleServerActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int n = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm quit", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        this.saveChanges();
    }//GEN-LAST:event_btnApplyActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.saveChanges();
        this.setVisible(false);
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        JOptionPane.showConfirmDialog(this, "Written by Tyler H. Jones (http://tylerjones.me) -- BarcodeOverIP Project Site: http://boip.tylerjones.me", "About BarcodeOverIP-Server " + SET.VERSION, JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnAboutActionPerformed

    private void chkAutoSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutoSetActionPerformed
        if(chkAutoSet.isSelected()) {
            lblHostTitle.setEnabled(false);
            txtHost.setEnabled(false);
            lblPortTitle.setEnabled(false);
            txtPort.setEnabled(false);
        } else {
            lblHostTitle.setEnabled(true);
            txtHost.setEnabled(true);
            lblPortTitle.setEnabled(true);
            txtPort.setEnabled(true);
        }
    }//GEN-LAST:event_chkAutoSetActionPerformed


    public void init() {
        serverThread.start();
        Server.setInfoLabel(lblLastClient);

        // Get the size of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        // Move the window
        this.setLocation(x, y);

        txtHost.setText(SET.getHost());
        txtPassword.setText(SET.getPass());
        txtPort.setText(String.valueOf(SET.getPort()));
        chkAppendNL.setSelected(Boolean.valueOf(SET.getAppendNL()));

        String ip = this.FindSystemIP();
        if(ip.equals(NO)) {
            JOptionPane.showMessageDialog(this.getParent(), "The IP address of the current system could not be determined.\nEither there is no network connection or you need to set the IP manually.", "Can't Determine IP Address", JOptionPane.WARNING_MESSAGE);
            chkAutoSet.setSelected(false);
            lblHostTitle.setEnabled(true);
            txtHost.setEnabled(true);
            lblPortTitle.setEnabled(true);
            txtPort.setEnabled(true);
        } else {
            chkAutoSet.setSelected(true);
            lblHostTitle.setEnabled(false);
            txtHost.setEnabled(false);
            lblPortTitle.setEnabled(false);
            txtPort.setEnabled(false);
            SET.setHost(ip);
            SET.setPort(41788);
            lblHost.setText("IP = " + ip);
            lblPort.setText("Port = 41788");
        }
    }

    public void setTrayIcon(TrayIcon ico) {
        this.SysTrayIcon = ico;
        this.SysTrayIcon.setToolTip("BarcodeOverIP " + SET.VERSION + " - Active\n(Right or Left click to show settings window)\nHost:Port - " + SET.getHost() + ":" + String.valueOf(SET.getPort()));
        //this.setIconImage(getImage("/icon24.ico"));
    }

    private String FindSystemIP() {
        String sHost;
	try {
            localAddr = InetAddress.getLocalHost();
            if (localAddr.isLoopbackAddress()) {
                localAddr = getLocalHost_nix();
            }
            sHost = localAddr.getHostAddress();
        } catch (UnknownHostException ex) {
            Server.pln("Error finding local IP.");
            return NO;
        }
        return sHost;
    }

    private String validateValues() {
        if(!chkAutoSet.isSelected()) {
            if(txtHost.getText().trim().length() < 1 || txtHost.getText().trim().equals("") || txtHost.getText().trim() == null) {
                return "Invalid or empty Host/IP Address!";
            }
            if(txtPort.getText().trim().length() < 1 || txtPort.getText().trim().equals("") || txtPort.getText().trim() == null) {
                txtPort.setText("41788");
            } else {
                boolean validport;
                try {
                    int i = Integer.parseInt(txtPort.getText());
                    if(i < 65535 && i > 1023) {
                        validport = true;
                    } else {
                        return "Given port is out of range. Must be: <65535 and >1023!";
                    }
                } catch(NumberFormatException nme) {
                    validport = false;
                }
                if(!validport) { return "Given port value is not a valid number!"; }
            }
        }
        if(txtPassword.getText().trim().toUpperCase().equals("CHECK") || txtPassword.getText().trim().toUpperCase().equals("VERSION")) { 
            return "Given password conflicts with the syntax of the client-server comm protocol. Please pick another password!"; }
        if(txtPassword.getText().trim().length() < 4 && !txtPassword.getText().trim().equals("")) { return "Given password is too short! Must be > 4 characters long!"; }
        if(txtPassword.getText().trim().length() > 32) { return "Given password is too long! Must be < 32 characters long!"; }
        return OK; //All is ok
    }

    private boolean saveChanges() {
        String validres = validateValues();
        if(!validres.equals(OK)) {
            JOptionPane.showMessageDialog(this, validres, "Invalid Value!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if(!chkAutoSet.isSelected()) {
            SET.setHost(txtHost.getText().trim());
            SET.setPort(Integer.valueOf(txtPort.getText().trim()));
        } else {
            txtPort.setText("41788");
            txtHost.setText(this.FindSystemIP());
            SET.setHost(txtHost.getText().trim());
            SET.setPort(Integer.valueOf(txtPort.getText().trim()));
        }
        SET.setAppendNL(chkAppendNL.isSelected());
        SET.setPass(txtPassword.getText().trim());
        LogI(TAG, "Changes successfully saved!");

        lblHost.setText("IP = " + SET.getHost());
        lblPort.setText("Port = " + SET.getPort());

        //Start and stop the server to force it to take the changes
        Server.stopListener();
        Server.startListener();

        return true;
    }

    private boolean setServerState(boolean val) {  // TRUE = Active
        if(val) {
            Server.activate();
            this.btnToggleServer.setToolTipText("Activate the server to allow barcodes to be received and typed");
            this.SysTrayIcon.setToolTip("BarcodeOverIP " + SET.VERSION + " - Active\n(Right or Left click to show settings window)\nHost:Port - " + SET.getHost() + ":" + String.valueOf(SET.getPort()));
        } else {
            Server.deactivate();
            this.btnToggleServer.setToolTipText("Deactivate the server to prevent barcodes being received and typed");
            this.SysTrayIcon.setToolTip("BarcodeOverIP " + SET.VERSION + " - Inactive\n(Right or Left click to show settings window)\nHost:Port - " + SET.getHost() + ":" + String.valueOf(SET.getPort()));
        }
        return val;
    }

    public void LogD(String tag, String info) { Log(tag, info, 0); }
    public void LogI(String tag, String info) { Log(tag, info, 1); }
    public void LogW(String tag, String info) { Log(tag, info, 2); }
    public void LogE(String tag, String info) { Log(tag, info, 3); }
    public void LogF(String tag, String info) { Log(tag, info, 4); }
    public void Log(String tag, String info, int level) { //Levels: 0 = debug, 1 = info, 2 = warning, 3 = error, 4 = fatal
        String a = "";
        if(level == 2) { a = "WARN: "; }
        if(level == 3) { a = "*ERR*: "; }
        if(level == 4) { a = "**FATAL**: "; }
        Server.pln(a + tag + " -- " + info);
    }

    public static InetAddress getLocalHost_nix() throws UnknownHostException {
            InetAddress localHost = InetAddress.getLocalHost();
            if(!localHost.isLoopbackAddress()) return localHost;
            InetAddress[] addrs = getAllLocalUsingNetworkInterface_nix();
            for(int i=0; i<addrs.length; i++) {
                    //Check for "." to ensure IPv4
                    if(!addrs[i].isLoopbackAddress() && addrs[i].getHostAddress().contains(".")) return addrs[i];
            }
            return localHost;
    }

    public static InetAddress[] getAllLocal_nix() throws UnknownHostException {
            InetAddress[] iAddresses = InetAddress.getAllByName("127.0.0.1");
            if(iAddresses.length != 1) return iAddresses;
            if(!iAddresses[0].isLoopbackAddress()) return iAddresses;
            return getAllLocalUsingNetworkInterface_nix();
    }

    private static InetAddress[] getAllLocalUsingNetworkInterface_nix() throws UnknownHostException {
            ArrayList addresses = new ArrayList();
            Enumeration e = null;
            try {
                    e = NetworkInterface.getNetworkInterfaces();
            } catch (SocketException ex) {
                    throw new UnknownHostException("127.0.0.1");
            }
            while(e.hasMoreElements()) {
                    NetworkInterface ni = (NetworkInterface)e.nextElement();
                    for(Enumeration e2 = ni.getInetAddresses(); e2.hasMoreElements();) {
                            addresses.add(e2.nextElement());
                    }
            }
            InetAddress[] iAddresses = new InetAddress[addresses.size()];
            for(int i=0; i<iAddresses.length; i++) {
                    iAddresses[i] = (InetAddress)addresses.get(i);
            }
            return iAddresses;
    }

    public Image getImage(String sImage) {
        Image imgReturn = this.toolkit.createImage(this.getClass().getClassLoader().getResource(sImage));
        return imgReturn;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnToggleServer;
    private javax.swing.JCheckBox chkAppendNL;
    private javax.swing.JCheckBox chkAutoSet;
    private javax.swing.JPanel frameAdvanced;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblHost;
    private javax.swing.JLabel lblHostTitle;
    private javax.swing.JLabel lblLastClient;
    private javax.swing.JLabel lblPort;
    private javax.swing.JLabel lblPortTitle;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables

}