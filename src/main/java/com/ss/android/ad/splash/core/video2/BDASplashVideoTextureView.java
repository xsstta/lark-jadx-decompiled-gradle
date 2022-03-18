package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;

public class BDASplashVideoTextureView extends TextureView {

    /* renamed from: a */
    public TextureView.SurfaceTextureListener f68510a;

    /* renamed from: b */
    public boolean f68511b;

    /* renamed from: c */
    public boolean f68512c;

    /* renamed from: d */
    public boolean f68513d;

    /* renamed from: e */
    public Surface f68514e;

    /* renamed from: f */
    public SurfaceTexture f68515f;

    /* renamed from: g */
    private final String f68516g;

    /* renamed from: h */
    private Context f68517h;

    /* renamed from: i */
    private int f68518i;

    /* renamed from: j */
    private int f68519j;

    /* renamed from: k */
    private boolean f68520k;

    /* renamed from: a */
    public boolean mo97893a() {
        return this.f68520k;
    }

    public Surface getSurface() {
        return this.f68514e;
    }

    /* renamed from: c */
    private void m100041c() {
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.ad.splash.core.video2.BDASplashVideoTextureView.TextureView$SurfaceTextureListenerC274091 */

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (BDASplashVideoTextureView.this.f68510a != null) {
                    BDASplashVideoTextureView.this.f68510a.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z;
                if (BDASplashVideoTextureView.this.mo97893a() && !BDASplashVideoTextureView.this.f68511b && BDASplashVideoTextureView.this.f68514e != null) {
                    BDASplashVideoTextureView.this.f68514e.release();
                    BDASplashVideoTextureView.this.f68514e = null;
                    BDASplashVideoTextureView.this.f68515f = null;
                }
                BDASplashVideoTextureView.this.f68513d = false;
                if (BDASplashVideoTextureView.this.f68510a == null || !BDASplashVideoTextureView.this.f68510a.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    BDASplashVideoTextureView.this.mo97892a(false);
                }
                return z;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (BDASplashVideoTextureView.this.f68510a != null) {
                    BDASplashVideoTextureView.this.f68510a.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (BDASplashVideoTextureView.this.mo97893a()) {
                    BDASplashVideoTextureView.this.f68512c = true;
                    if (BDASplashVideoTextureView.this.f68514e != null && (!BDASplashVideoTextureView.this.f68511b || !BDASplashVideoTextureView.this.f68514e.isValid())) {
                        BDASplashVideoTextureView.this.f68514e.release();
                        BDASplashVideoTextureView.this.f68514e = null;
                        BDASplashVideoTextureView.this.f68515f = null;
                    }
                    if (BDASplashVideoTextureView.this.f68514e == null) {
                        BDASplashVideoTextureView.this.f68514e = new Surface(surfaceTexture);
                        BDASplashVideoTextureView.this.f68515f = surfaceTexture;
                    } else {
                        try {
                            if (Build.VERSION.SDK_INT >= 16) {
                                if (BDASplashVideoTextureView.this.f68515f != null) {
                                    BDASplashVideoTextureView bDASplashVideoTextureView = BDASplashVideoTextureView.this;
                                    bDASplashVideoTextureView.setSurfaceTexture(bDASplashVideoTextureView.f68515f);
                                }
                            } else if (BDASplashVideoTextureView.this.f68515f != null) {
                                BDASplashVideoTextureView.this.f68514e = new Surface(surfaceTexture);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    BDASplashVideoTextureView.this.f68513d = true;
                    BDASplashVideoTextureView.this.f68511b = true;
                } else {
                    BDASplashVideoTextureView.this.f68514e = new Surface(surfaceTexture);
                    BDASplashVideoTextureView.this.f68515f = surfaceTexture;
                }
                if (BDASplashVideoTextureView.this.f68510a != null) {
                    BDASplashVideoTextureView.this.f68510a.onSurfaceTextureAvailable(BDASplashVideoTextureView.this.f68515f, i, i2);
                }
            }
        });
    }

    /* renamed from: b */
    public boolean mo97894b() {
        if (!mo97893a() || !this.f68512c) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f68510a = surfaceTextureListener;
    }

    public BDASplashVideoTextureView(Context context) {
        this(context, null);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24 && drawable != null) {
            setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    private void m100040a(Context context) {
        this.f68517h = context;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f68519j = displayMetrics.heightPixels;
        this.f68518i = displayMetrics.widthPixels;
    }

    /* renamed from: a */
    public void mo97892a(boolean z) {
        if (z && mo97893a()) {
            SurfaceTexture surfaceTexture = this.f68515f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.f68515f = null;
            }
            Surface surface = this.f68514e;
            if (surface != null) {
                surface.release();
                this.f68514e = null;
            }
        }
        this.f68511b = false;
        this.f68512c = false;
        this.f68514e = null;
        this.f68515f = null;
    }

    public BDASplashVideoTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68516g = "TextureVideoView";
        this.f68520k = true;
        m100040a(context);
        m100041c();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
