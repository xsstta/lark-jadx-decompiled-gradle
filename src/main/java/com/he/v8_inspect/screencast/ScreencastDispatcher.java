package com.he.v8_inspect.screencast;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64OutputStream;
import android.view.View;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.he.v8_inspect.jsonrpc.protocol.JsonRpcPeer;
import com.he.v8_inspect.protocol.module.Page;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import java.io.ByteArrayOutputStream;

public final class ScreencastDispatcher {
    public final ActivityTracker mActivityTracker = ActivityTracker.get();
    public Handler mBackgroundHandler;
    public Bitmap mBitmap;
    public final BitmapFetchRunnable mBitmapFetchRunnable = new BitmapFetchRunnable();
    public Canvas mCanvas;
    public Page.ScreencastFrameEvent mEvent = new Page.ScreencastFrameEvent();
    public final EventDispatchRunnable mEventDispatchRunnable = new EventDispatchRunnable();
    public HandlerThread mHandlerThread;
    public boolean mIsRunning;
    public final Handler mMainHandler = new Handler(Looper.getMainLooper());
    public Page.ScreencastFrameEventMetadata mMetadata = new Page.ScreencastFrameEventMetadata();
    public JsonRpcPeer mPeer;
    public Page.StartScreencastRequest mRequest;
    public ByteArrayOutputStream mStream;
    public final RectF mTempDst = new RectF();
    public final RectF mTempSrc = new RectF();

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: private */
    public class BitmapFetchRunnable implements Runnable {
        public void run() {
            updateScreenBitmap();
            ScreencastDispatcher.this.mBackgroundHandler.post(ScreencastDispatcher.this.mEventDispatchRunnable.withEndAction(this));
        }

        private void updateScreenBitmap() {
            Activity tryGetTopActivity;
            if (ScreencastDispatcher.this.mIsRunning && (tryGetTopActivity = ScreencastDispatcher.this.mActivityTracker.tryGetTopActivity()) != null) {
                View decorView = tryGetTopActivity.getWindow().getDecorView();
                try {
                    if (ScreencastDispatcher.this.mBitmap == null) {
                        float width = (float) decorView.getWidth();
                        float height = (float) decorView.getHeight();
                        float min = Math.min(((float) ScreencastDispatcher.this.mRequest.maxWidth) / width, ((float) ScreencastDispatcher.this.mRequest.maxHeight) / height);
                        int i = (int) (width * min);
                        int i2 = (int) (min * height);
                        ScreencastDispatcher.this.mBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                        ScreencastDispatcher.this.mCanvas = new Canvas(ScreencastDispatcher.this.mBitmap);
                        Matrix matrix = new Matrix();
                        ScreencastDispatcher.this.mTempSrc.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
                        ScreencastDispatcher.this.mTempDst.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i2);
                        matrix.setRectToRect(ScreencastDispatcher.this.mTempSrc, ScreencastDispatcher.this.mTempDst, Matrix.ScaleToFit.CENTER);
                        ScreencastDispatcher.this.mCanvas.setMatrix(matrix);
                    }
                    decorView.draw(ScreencastDispatcher.this.mCanvas);
                } catch (OutOfMemoryError unused) {
                    Log.m165397w("ScreencastDispatcher", "Out of memory trying to allocate screencast Bitmap.");
                }
            }
        }

        private BitmapFetchRunnable() {
        }
    }

    public void stopScreencast() {
        Log.m165379d("ScreencastDispatcher", "Stopping screencast");
        this.mBackgroundHandler.post(new CancellationRunnable());
    }

    /* access modifiers changed from: private */
    public class CancellationRunnable implements Runnable {
        public void run() {
            ScreencastDispatcher.this.mHandlerThread.interrupt();
            ScreencastDispatcher.this.mMainHandler.removeCallbacks(ScreencastDispatcher.this.mBitmapFetchRunnable);
            ScreencastDispatcher.this.mBackgroundHandler.removeCallbacks(ScreencastDispatcher.this.mEventDispatchRunnable);
            ScreencastDispatcher.this.mIsRunning = false;
            ScreencastDispatcher.this.mHandlerThread = null;
            ScreencastDispatcher.this.mBitmap = null;
            ScreencastDispatcher.this.mCanvas = null;
            ScreencastDispatcher.this.mStream = null;
        }

        private CancellationRunnable() {
        }
    }

    private class EventDispatchRunnable implements Runnable {
        private Runnable mEndAction;

        public void run() {
            if (ScreencastDispatcher.this.mIsRunning && ScreencastDispatcher.this.mBitmap != null) {
                int width = ScreencastDispatcher.this.mBitmap.getWidth();
                int height = ScreencastDispatcher.this.mBitmap.getHeight();
                ScreencastDispatcher.this.mStream.reset();
                Base64OutputStream base64OutputStream = new Base64OutputStream(ScreencastDispatcher.this.mStream, 0);
                ScreencastDispatcher.this.mBitmap.compress(Bitmap.CompressFormat.valueOf(ScreencastDispatcher.this.mRequest.format.toUpperCase()), ScreencastDispatcher.this.mRequest.quality, base64OutputStream);
                ScreencastDispatcher.this.mEvent.data = ScreencastDispatcher.this.mStream.toString();
                ScreencastDispatcher.this.mMetadata.pageScaleFactor = 1;
                ScreencastDispatcher.this.mMetadata.deviceWidth = width;
                ScreencastDispatcher.this.mMetadata.deviceHeight = height;
                ScreencastDispatcher.this.mEvent.metadata = ScreencastDispatcher.this.mMetadata;
                ScreencastDispatcher.this.mPeer.invokeMethod("Page.screencastFrame", ScreencastDispatcher.this.mEvent, null);
                ScreencastDispatcher.this.mMainHandler.postDelayed(this.mEndAction, 33);
            }
        }

        public EventDispatchRunnable withEndAction(Runnable runnable) {
            this.mEndAction = runnable;
            return this;
        }

        private EventDispatchRunnable() {
        }
    }

    public void startScreencast(JsonRpcPeer jsonRpcPeer, Page.StartScreencastRequest startScreencastRequest) {
        Log.m165379d("ScreencastDispatcher", "Starting screencast");
        this.mRequest = startScreencastRequest;
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("Screencast Thread");
        this.mHandlerThread = new_android_os_HandlerThread_by_knot;
        new_android_os_HandlerThread_by_knot.start();
        this.mPeer = jsonRpcPeer;
        this.mIsRunning = true;
        this.mStream = new ByteArrayOutputStream();
        this.mBackgroundHandler = new Handler(this.mHandlerThread.getLooper());
        this.mMainHandler.postDelayed(this.mBitmapFetchRunnable, 33);
    }
}
