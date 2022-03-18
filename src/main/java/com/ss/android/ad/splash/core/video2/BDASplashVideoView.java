package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class BDASplashVideoView extends FrameLayout implements TextureView.SurfaceTextureListener, AbstractC27437g {

    /* renamed from: a */
    private BDASplashVideoTextureView f68522a;

    /* renamed from: b */
    private AbstractC27438h f68523b;

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27437g
    public Context getApplicationContext() {
        return getContext().getApplicationContext();
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27437g
    public Surface getSurface() {
        BDASplashVideoTextureView bDASplashVideoTextureView = this.f68522a;
        if (bDASplashVideoTextureView != null) {
            return bDASplashVideoTextureView.getSurface();
        }
        return null;
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27437g
    public void setVideoViewCallback(AbstractC27438h hVar) {
        this.f68523b = hVar;
    }

    public BDASplashVideoView(Context context) {
        super(context);
        m100045a(context);
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27437g
    /* renamed from: a */
    public void mo97904a(boolean z) {
        BDASplashVideoTextureView bDASplashVideoTextureView = this.f68522a;
        if (bDASplashVideoTextureView != null) {
            bDASplashVideoTextureView.mo97892a(z);
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27437g
    public void setSurfaceLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            this.f68522a.setLayoutParams(layoutParams);
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27437g
    public void setSurfaceViewVisibility(int i) {
        BDASplashVideoTextureView bDASplashVideoTextureView = this.f68522a;
        if (bDASplashVideoTextureView != null) {
            bDASplashVideoTextureView.setVisibility(i);
        }
    }

    public void setTextureViewOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f68522a.setOnTouchListener(onTouchListener);
    }

    /* renamed from: a */
    private void m100045a(Context context) {
        BDASplashVideoTextureView bDASplashVideoTextureView = new BDASplashVideoTextureView(context);
        this.f68522a = bDASplashVideoTextureView;
        bDASplashVideoTextureView.setSurfaceTextureListener(this);
        addView(this.f68522a, new FrameLayout.LayoutParams(-1, -1));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f68522a.setKeepScreenOn(false);
        AbstractC27438h hVar = this.f68523b;
        if (hVar != null) {
            hVar.mo97922a(surfaceTexture);
        }
        return !this.f68522a.mo97894b();
    }

    public BDASplashVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m100045a(context);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f68522a.setKeepScreenOn(true);
        AbstractC27438h hVar = this.f68523b;
        if (hVar != null) {
            hVar.mo97917a(surfaceTexture, i, i2);
        }
    }

    public BDASplashVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m100045a(context);
    }
}
