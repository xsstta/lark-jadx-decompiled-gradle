package com.ss.ttvideoengine;

import android.view.SurfaceHolder;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;

public class TTVideoEngineSurfaceCallback implements SurfaceHolder.Callback {
    private WeakReference<TTVideoEngine> mEngine;

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void reset() {
        this.mEngine.clear();
    }

    public TTVideoEngineSurfaceCallback(TTVideoEngine tTVideoEngine) {
        this.mEngine = new WeakReference<>(tTVideoEngine);
        TTVideoEngineLog.m256500d("TTVideoEngineSurfaceCallback", "new surface callback:" + this);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        TTVideoEngineLog.m256500d("TTVideoEngineSurfaceCallback", "surfaceCreated, " + surfaceHolder);
        TTVideoEngine tTVideoEngine = this.mEngine.get();
        if (tTVideoEngine != null) {
            tTVideoEngine.setSurfaceSync(surfaceHolder.getSurface());
            VideoSurface textureSurface = tTVideoEngine.getTextureSurface();
            if (textureSurface != null) {
                textureSurface.setIntOption(25, 1);
                TTVideoEngineLog.m256500d("TTVideoEngineSurfaceCallback", "set texturerender force draw");
            }
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        TTVideoEngineLog.m256500d("TTVideoEngineSurfaceCallback", "surfaceDestroyed, " + surfaceHolder);
        TTVideoEngine tTVideoEngine = this.mEngine.get();
        if (tTVideoEngine != null) {
            VideoSurface textureSurface = tTVideoEngine.getTextureSurface();
            if (textureSurface != null) {
                textureSurface.setIntOption(9, 1);
            }
            tTVideoEngine.setSurfaceSync(null);
            if (textureSurface != null) {
                textureSurface.setIntOption(9, 0);
            }
        }
    }
}
