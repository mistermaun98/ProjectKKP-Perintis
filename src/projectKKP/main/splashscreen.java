/*
 * PROGRAM KKP Perpustakaan SMK Perintis 1 Depok
 * Created by:
 * 1. Muhammad Ilham Sunardi
 * 2. Muhammad Alwi
 * Do not copy without permission !
 */
package projectKKP.main;
import projectKKP.UI.login;
import projectKKP.UI.splashscreenUI;

public class splashscreen {
    public static void main(String [] args) throws InterruptedException {
        splashscreenUI sp = new splashscreenUI();
        for (int i = 0; i <= 100; i++) {
            Thread.sleep(50);
            sp.setVisible(true);
            sp.loadingBar.setValue(i);
            
            if (i == 100) {
                login log = new login();
                sp.dispose();
                log.setVisible(true);
                
            }
        }
    }
}
