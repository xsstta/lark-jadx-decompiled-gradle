package com.ss.texturerender;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.util.ArrayList;
import java.util.Iterator;

public class VsyncHelper implements Handler.Callback, Choreographer.FrameCallback {
    public Choreographer choreographer;
    private ArrayList<VsyncCallback> mCallbackList = new ArrayList<>();
    private Handler mainHandler;
    private volatile long vsyncDurationNs;
    private final WindowManager windowManager;

    public long getVsyncDurationNs() {
        return this.vsyncDurationNs;
    }

    public static class VsyncCallback {
        public Handler mHandler;

        public void notifyVsync() {
            this.mHandler.sendEmptyMessage(28);
        }

        public VsyncCallback(Handler handler) {
            this.mHandler = handler;
        }
    }

    private void updateDefaultDisplayRefreshRateParams() {
        Display display;
        WindowManager windowManager2 = this.windowManager;
        if (windowManager2 != null) {
            display = windowManager2.getDefaultDisplay();
        } else {
            display = null;
        }
        if (display != null) {
            this.vsyncDurationNs = (long) (1.0E9d / ((double) display.getRefreshRate()));
        } else {
            this.vsyncDurationNs = 16666666;
        }
        TextureRenderLog.m256492d("VsyncHelper", "vsyncDurationNs:" + this.vsyncDurationNs + "defaultDisplay:" + display);
    }

    private void removeObserverInternal(Message message) {
        Choreographer choreographer2;
        this.mCallbackList.remove(message.obj);
        if (this.mCallbackList.size() == 0 && (choreographer2 = this.choreographer) != null) {
            choreographer2.removeFrameCallback(this);
        }
    }

    public void addObserver(VsyncCallback vsyncCallback) {
        TextureRenderLog.m256492d("VsyncHelper", "addObserver");
        if (vsyncCallback != null) {
            Message obtainMessage = this.mainHandler.obtainMessage(29);
            obtainMessage.obj = vsyncCallback;
            obtainMessage.sendToTarget();
        }
    }

    public void doFrame(long j) {
        Iterator<VsyncCallback> it = this.mCallbackList.iterator();
        while (it.hasNext()) {
            it.next().notifyVsync();
        }
        this.choreographer.postFrameCallback(this);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                break;
            case 29:
                addObserverInternal(message);
                break;
            case 30:
                removeObserverInternal(message);
                return true;
            default:
                return false;
        }
        return true;
    }

    public void removeObserver(VsyncCallback vsyncCallback) {
        TextureRenderLog.m256492d("VsyncHelper", "removeObserver");
        if (vsyncCallback != null) {
            Message obtainMessage = this.mainHandler.obtainMessage(30);
            obtainMessage.obj = vsyncCallback;
            obtainMessage.sendToTarget();
        }
    }

    public VsyncHelper(Context context) {
        Handler handler = new Handler(Looper.getMainLooper(), this);
        this.mainHandler = handler;
        handler.post(new Runnable() {
            /* class com.ss.texturerender.VsyncHelper.RunnableC654081 */

            public void run() {
                VsyncHelper.this.choreographer = Choreographer.getInstance();
            }
        });
        if (context != null) {
            this.windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        } else {
            this.windowManager = null;
        }
        updateDefaultDisplayRefreshRateParams();
    }

    private void addObserverInternal(Message message) {
        Choreographer choreographer2;
        if (!this.mCallbackList.contains((VsyncCallback) message.obj)) {
            this.mCallbackList.add((VsyncCallback) message.obj);
        }
        if (this.mCallbackList.size() == 1 && (choreographer2 = this.choreographer) != null) {
            choreographer2.postFrameCallback(this);
        }
    }
}
