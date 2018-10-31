package com.gkaraffa.cremonatoolkit.control;

import com.gkaraffa.cremona.quickaccess.QuickAccess;
import com.gkaraffa.cremona.theoretical.scale.Scale;
import com.gkaraffa.cremonatoolkit.ui.MainWindow;

public class Application {

  public static void main(String[] args) {
    Application application = new Application();
    application.startApplication();
  }

  public String testQuickAccess() throws IllegalArgumentException {
    QuickAccess qA = QuickAccess.getInstance();
    StringBuffer sB = new StringBuffer();

    Scale scale = qA.getScale("C", "Pentatonic Minor");
    sB.append(scale.getText());
    sB.append("\n" + scale.getScaleNomenclature().getText());
    sB.append("\n" + scale.getToneCollection().getSpellingString());

    return sB.toString();
  }

  public void shutDown() {
    System.exit(0);
  }

  private void startApplication() {
    MainWindow mainWindow = new MainWindow(this);
    mainWindow.setVisible(true);
  }



}
