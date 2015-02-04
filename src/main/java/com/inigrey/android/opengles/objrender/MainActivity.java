package com.inigrey.android.opengles.objrender;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

/**
 * Created by admin on 2/4/15.
 */
public class MainActivity extends Activity {
    GLSurfaceView glView;
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        glView = new GLSurfaceView(this);
        glView.setRenderer(new MainRenderer());
        setContentView(glView);
    }
}
