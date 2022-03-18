package com.ss.video.rtc.base.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;

public class RtcSurfaceHelper {

    static class RtcSurfaceTextureListener implements TextureView.SurfaceTextureListener {
        private long nativeCallbackHandle;
        private Surface surface;

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void resetCallback() {
            this.nativeCallbackHandle = 0;
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            long j = this.nativeCallbackHandle;
            if (j != 0) {
                RtcNativeFunctions.nativeNotifySurfaceDestroyed(j, this.surface, true);
            }
            this.surface = null;
            return true;
        }

        RtcSurfaceTextureListener(SurfaceTexture surfaceTexture, long j) {
            Surface surface2;
            if (surfaceTexture != null) {
                surface2 = new Surface(surfaceTexture);
            } else {
                surface2 = null;
            }
            this.surface = surface2;
            this.nativeCallbackHandle = j;
            if (surface2 != null && j != 0) {
                RtcNativeFunctions.nativeNotifySurfaceAvailable(j, surface2, true);
            }
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            long j = this.nativeCallbackHandle;
            if (j != 0) {
                RtcNativeFunctions.nativeNotifySurfaceSizeChanged(j);
            }
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (this.nativeCallbackHandle != 0) {
                Surface surface2 = new Surface(surfaceTexture);
                this.surface = surface2;
                RtcNativeFunctions.nativeNotifySurfaceAvailable(this.nativeCallbackHandle, surface2, true);
            }
        }
    }

    static class RtcSurfaceViewListener implements SurfaceHolder.Callback {
        private long nativeCallbackHandle;
        private Surface surface;

        public void resetCallback() {
            this.nativeCallbackHandle = 0;
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (this.nativeCallbackHandle != 0) {
                Surface surface2 = surfaceHolder.getSurface();
                this.surface = surface2;
                RtcNativeFunctions.nativeNotifySurfaceAvailable(this.nativeCallbackHandle, surface2, false);
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            long j = this.nativeCallbackHandle;
            if (j != 0) {
                RtcNativeFunctions.nativeNotifySurfaceDestroyed(j, surfaceHolder.getSurface(), false);
            }
            this.surface = null;
        }

        RtcSurfaceViewListener(Surface surface2, long j) {
            this.surface = surface2;
            this.nativeCallbackHandle = j;
            if (surface2 != null && j != 0) {
                RtcNativeFunctions.nativeNotifySurfaceAvailable(j, surface2, false);
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            long j = this.nativeCallbackHandle;
            if (j != 0) {
                RtcNativeFunctions.nativeNotifySurfaceSizeChanged(j);
            }
        }
    }

    public static Object registerSurfaceCallback(Object obj, long j) {
        if (obj instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView) obj;
            RtcSurfaceViewListener rtcSurfaceViewListener = new RtcSurfaceViewListener(surfaceView.getHolder().getSurface(), j);
            surfaceView.getHolder().addCallback(rtcSurfaceViewListener);
            return rtcSurfaceViewListener;
        } else if (!(obj instanceof TextureView)) {
            return null;
        } else {
            TextureView textureView = (TextureView) obj;
            RtcSurfaceTextureListener rtcSurfaceTextureListener = new RtcSurfaceTextureListener(textureView.getSurfaceTexture(), j);
            textureView.setSurfaceTextureListener(rtcSurfaceTextureListener);
            return rtcSurfaceTextureListener;
        }
    }

    public static void unRegisterSurfaceCallback(View view, Object obj) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            if (obj != null) {
                ((RtcSurfaceTextureListener) obj).resetCallback();
            }
            textureView.setSurfaceTextureListener(null);
        } else if (view instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView) view;
            if (obj != null) {
                ((RtcSurfaceViewListener) obj).resetCallback();
            }
            surfaceView.getHolder().removeCallback((SurfaceHolder.Callback) obj);
        }
    }
}
