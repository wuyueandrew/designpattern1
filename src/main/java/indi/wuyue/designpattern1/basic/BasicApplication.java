package indi.wuyue.designpattern1.basic;

public class BasicApplication {

    public static void main(String[] args) {
        WinForm winForm = new WinForm("WINDOW窗口");
        Picture logo = new Picture("LOGO图片");
        Button login = new Button( "登陆");
        Button register = new Button( "注册");
        Frame frame = new Frame( "FRAME1");
        winForm.addSubNode(logo);
        winForm.addSubNode(login);
        winForm.addSubNode(register);
        winForm.addSubNode(frame);

        Label username = new Label("用户名");
        TextBox textBox = new TextBox("文本框");
        Label password = new Label("密码");
        PasswordBox passwordBox = new PasswordBox("密码框");
        CheckBox checkBox = new CheckBox("复选框");
        TextBox remember = new TextBox("记住用户名");
        LinkLabel forget = new LinkLabel("忘记密码");

        frame.addSubNode(username);
        frame.addSubNode(textBox);
        frame.addSubNode(password);
        frame.addSubNode(passwordBox);
        frame.addSubNode(checkBox);
        frame.addSubNode(remember);
        frame.addSubNode(forget);

        winForm.printNode();

    }
}
