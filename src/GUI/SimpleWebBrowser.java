package GUI;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleWebBrowser extends JFrame{

    public void run(String URL) {
        NativeInterface.open();
        JPanel panel = new JPanel();
        this.setContentPane(panel);
        JWebBrowser browser = new JWebBrowser();
        browser.setBarsVisible(false);
        browser.setStatusBarVisible(false);
        browser.setPreferredSize(new Dimension(800, 600));
        panel.add(browser);
        browser.navigate("URL");
        this.pack();
        this.setVisible(true);
    }
}
