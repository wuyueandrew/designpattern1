package indi.wuyue.designpattern1.gui;

public class GUI {



    public void createGUI() {
        Button login = new Button("登陆", "登陆");
        Button register = new Button("注册", "注册");
        Picture logo = new Picture("LOGO图片", "LOGO");
        Frame frame = new Frame();
        WinForm winForm = new WinForm("WINDOW窗口", logo, login, register, frame);
        winForm.setVisible(true);
    }



//    public void createGUI() {
//        jFrame = new JFrame("test jframe");
//        jFrame.setSize(500, 250);
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        placePanel();
//        placeLogo();
////        JLabel jLabel = new JLabel("test label");
////        jFrame.getContentPane().add(jLabel);
//        jFrame.setVisible(true);
//    }
//
//    private void placePanel() {
//        this.jPanel = new JPanel();
////        jPanel.setSize(500, 250);
//        jPanel.setLayout(new BorderLayout());
//        jPanel.setBackground(Color.green);
//        jPanel.setForeground(Color.green);
//        jPanel.setVisible(true);
//        jFrame.setContentPane(jPanel);
//    }
//
//    private void placeLogo() {
//        JPanel logo = new JPanel();
//        logo.add(new JLabel("LOGO"));
////        JTextArea jTextArea = new JTextArea();
////        jTextArea.append("LOGO");
//        jFrame.getContentPane().add(logo, BorderLayout.NORTH);
//    }

}
