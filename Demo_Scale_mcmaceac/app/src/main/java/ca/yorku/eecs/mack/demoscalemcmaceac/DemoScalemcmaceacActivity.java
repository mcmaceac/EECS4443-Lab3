package ca.yorku.eecs.mack.demoscalemcmaceac;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/**
 * Demo_Scale - with modifications by Matthew MacEachern
 *
 * Login ID - mcmaceac
 * Student ID - 213960216
 * Last name - MacEachern
 * First name(s) - Matthew
 */

public class DemoScalemcmaceacActivity extends Activity
{
    PaintPanel imagePanel; // the panel in which to paint the image
    StatusPanel statusPanel; // a status panel the display the image coordinates, size, and scale

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); // hide title bar
        setContentView(R.layout.main);

        // get references to UI components
        imagePanel = (PaintPanel)findViewById(R.id.paintpanel);
        statusPanel = (StatusPanel)findViewById(R.id.statuspanel);

        // give the image panel a reference to the status panel
        imagePanel.setStatusPanel(statusPanel);
    }

    // Called when the "Reset" button is pressed.
    public void clickReset(View view)
    {
        imagePanel.xPosition = 10;
        imagePanel.yPosition = 10;
        imagePanel.scaleFactor = 1f;
        imagePanel.invalidate();
    }
}