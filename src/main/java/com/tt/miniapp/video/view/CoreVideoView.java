package com.tt.miniapp.video.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.miniapp.util.C67024ac;
import com.tt.miniapp.video.p3339b.AbstractC67081a;
import com.tt.miniapp.video.view.widget.VideoTextureView;

public class CoreVideoView extends RelativeLayout implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public VideoTextureView f169232a;

    /* renamed from: b */
    private AbstractC67130a f169233b;

    /* renamed from: c */
    private AbstractC67081a f169234c;

    /* renamed from: d */
    private boolean f169235d;

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: a */
    public boolean mo233396a() {
        return this.f169235d;
    }

    public TextureView getRenderView() {
        return this.f169232a;
    }

    public void setFullScreenCallback(AbstractC67081a aVar) {
        this.f169234c = aVar;
    }

    public void setVideoViewCallback(AbstractC67130a aVar) {
        this.f169233b = aVar;
    }

    public CoreVideoView(Context context) {
        this(context, null, 0);
    }

    public void setObjectFit(String str) {
        VideoTextureView videoTextureView = this.f169232a;
        if (videoTextureView != null) {
            videoTextureView.setObjectFit(str);
        }
    }

    /* renamed from: a */
    private void m261705a(Context context) {
        VideoTextureView videoTextureView = (VideoTextureView) LayoutInflater.from(context).inflate(R.layout.microapp_m_video_core_view, this).findViewById(R.id.microapp_m_texture_video);
        this.f169232a = videoTextureView;
        videoTextureView.setSurfaceTextureListener(this);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo233395a(false);
        AbstractC67130a aVar = this.f169233b;
        if (aVar != null) {
            aVar.mo233260b(new Surface(surfaceTexture));
        }
        return false;
    }

    public void setSurfaceViewVisible(int i) {
        AppBrandLogger.m52828d("tma_CoreVideoView", "setSurfaceViewVisible ", Integer.valueOf(i));
        VideoTextureView videoTextureView = this.f169232a;
        if (videoTextureView != null) {
            videoTextureView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public void mo233393a(Activity activity) {
        m261706a(false, 1);
        m261704a(1, activity);
        C67024ac.m261234a((View) this, true);
    }

    /* renamed from: a */
    public void mo233395a(final boolean z) {
        if (this.f169232a != null) {
            AppBrandLogger.m52828d("tma_CoreVideoView", "setKeepScreenOn#", Boolean.valueOf(z));
            post(new Runnable() {
                /* class com.tt.miniapp.video.view.CoreVideoView.RunnableC671291 */

                public void run() {
                    CoreVideoView.this.f169232a.setKeepScreenOn(z);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo233392a(int i, int i2) {
        this.f169232a.mo233412a(i, i2);
    }

    public CoreVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m261706a(boolean z, int i) {
        if (this.f169235d != z) {
            this.f169235d = z;
            AbstractC67081a aVar = this.f169234c;
            if (aVar != null) {
                aVar.mo230775a(z, i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0026 A[Catch:{ all -> 0x0009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002a A[Catch:{ all -> 0x0009 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m261704a(int r2, android.app.Activity r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x000b
            com.tt.miniapp.video.view.widget.VideoTextureView r3 = r1.f169232a     // Catch:{ all -> 0x0009 }
            android.app.Activity r3 = com.tt.miniapp.util.C67024ac.m261232a(r3)     // Catch:{ all -> 0x0009 }
            goto L_0x000b
        L_0x0009:
            r2 = move-exception
            goto L_0x002e
        L_0x000b:
            if (r3 != 0) goto L_0x000e
            return
        L_0x000e:
            r3.setRequestedOrientation(r2)     // Catch:{ all -> 0x0009 }
            android.view.Window r3 = r3.getWindow()     // Catch:{ all -> 0x0009 }
            if (r3 != 0) goto L_0x0018
            return
        L_0x0018:
            if (r2 == 0) goto L_0x0021
            r0 = 8
            if (r2 != r0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r2 = 0
            goto L_0x0022
        L_0x0021:
            r2 = 1
        L_0x0022:
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x002a
            r3.setFlags(r0, r0)     // Catch:{ all -> 0x0009 }
            goto L_0x0035
        L_0x002a:
            r3.clearFlags(r0)     // Catch:{ all -> 0x0009 }
            goto L_0x0035
        L_0x002e:
            java.lang.String r3 = "tma_CoreVideoView"
            java.lang.String r0 = "requestOrientation"
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.eWithThrowable(r3, r0, r2)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.video.view.CoreVideoView.m261704a(int, android.app.Activity):void");
    }

    /* renamed from: a */
    public void mo233394a(Activity activity, int i) {
        m261706a(true, i);
        m261704a(i, activity);
        C67024ac.m261234a((View) this, false);
    }

    public CoreVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m261705a(context);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        mo233395a(true);
        AbstractC67130a aVar = this.f169233b;
        if (aVar != null) {
            aVar.mo233252a(new Surface(surfaceTexture));
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.i("tma_CoreVideoView", "onSurfaceTextureSizeChanged: width = " + i + " height = " + i2);
        AbstractC67130a aVar = this.f169233b;
        if (aVar != null) {
            aVar.mo233251a(surfaceTexture, i, i2);
        }
    }
}
