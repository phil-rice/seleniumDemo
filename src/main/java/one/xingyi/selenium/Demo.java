package one.xingyi.selenium;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Demo {
    final Context context;
    final Login login;

    public static void main(String[] args) {
        Demo demo = new Demo(Context.create(), new Login());
        demo.firstScript();
    }

    public void firstScript() {
        login.login(context);
    }
}
