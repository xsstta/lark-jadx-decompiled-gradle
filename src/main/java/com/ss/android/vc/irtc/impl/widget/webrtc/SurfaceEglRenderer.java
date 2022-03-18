package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.view.SurfaceHolder;
import com.ss.android.vc.irtc.C61064p;
import com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils;
import com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;

/* access modifiers changed from: package-private */
public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    private final String TAG = ("SurfaceEglRenderer#" + this);
    private final Object layoutLock = new Object();

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    public SurfaceEglRenderer(String str) {
        super(str);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new Runnable(countDownLatch) {
            /* class com.ss.android.vc.irtc.impl.widget.webrtc.$$Lambda$xXXywdCqM5leaxXkxy473i7s2A */
            public final /* synthetic */ CountDownLatch f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                this.f$0.countDown();
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, null, iArr, glDrawer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        super.init(context, iArr, glDrawer);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        String str = this.TAG;
        C61064p.m237486b(str, "surfaceChanged: size: " + i2 + "x" + i3);
        postInvalidateRender();
    }
}
