package com.tt.miniapp.video.view.widget;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

public class VideoTextureView extends TextureView {

    /* renamed from: a */
    public TextureView.SurfaceTextureListener f169243a;

    /* renamed from: b */
    public boolean f169244b;

    /* renamed from: c */
    public Surface f169245c;

    /* renamed from: d */
    public SurfaceTexture f169246d;

    /* renamed from: e */
    private final String f169247e;

    /* renamed from: f */
    private int f169248f;

    /* renamed from: g */
    private int f169249g;

    /* renamed from: h */
    private String f169250h;

    /* renamed from: a */
    private void m261717a() {
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.tt.miniapp.video.view.widget.VideoTextureView.TextureView$SurfaceTextureListenerC671321 */

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (VideoTextureView.this.f169243a != null) {
                    VideoTextureView.this.f169243a.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z;
                if (!VideoTextureView.this.f169244b && VideoTextureView.this.f169245c != null) {
                    VideoTextureView.this.f169245c.release();
                    VideoTextureView.this.f169245c = null;
                    VideoTextureView.this.f169246d = null;
                }
                if (VideoTextureView.this.f169243a == null || !VideoTextureView.this.f169243a.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    VideoTextureView.this.mo233413a(false);
                }
                return z;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (VideoTextureView.this.f169243a != null) {
                    VideoTextureView.this.f169243a.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (VideoTextureView.this.f169245c != null && (!VideoTextureView.this.f169244b || !VideoTextureView.this.f169245c.isValid())) {
                    VideoTextureView.this.f169245c.release();
                    VideoTextureView.this.f169245c = null;
                    VideoTextureView.this.f169246d = null;
                }
                if (VideoTextureView.this.f169245c == null) {
                    VideoTextureView.this.f169245c = new Surface(surfaceTexture);
                    VideoTextureView.this.f169246d = surfaceTexture;
                } else {
                    try {
                        if (VideoTextureView.this.f169246d != null) {
                            VideoTextureView videoTextureView = VideoTextureView.this;
                            videoTextureView.setSurfaceTexture(videoTextureView.f169246d);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                VideoTextureView.this.f169244b = true;
                if (VideoTextureView.this.f169243a != null) {
                    VideoTextureView.this.f169243a.onSurfaceTextureAvailable(VideoTextureView.this.f169246d, i, i2);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f169243a = surfaceTextureListener;
    }

    public VideoTextureView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo233413a(boolean z) {
        if (z) {
            SurfaceTexture surfaceTexture = this.f169246d;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.f169246d = null;
            }
            Surface surface = this.f169245c;
            if (surface != null) {
                surface.release();
                this.f169245c = null;
            }
        }
        this.f169244b = false;
        this.f169245c = null;
        this.f169246d = null;
    }

    public void setObjectFit(String str) {
        if (!TextUtils.equals(this.f169250h, str) && str != null) {
            this.f169250h = str;
            requestLayout();
        }
    }

    public VideoTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f169247e = "TextureVideoView";
        this.f169250h = "contain";
        m261717a();
    }

    /* renamed from: a */
    public void mo233412a(int i, int i2) {
        AppBrandLogger.m52828d("TextureVideoView", "setVideoSize actualViewWidth:", Integer.valueOf(i), "actualViewHeight:", Integer.valueOf(i2));
        if (this.f169248f != i || this.f169249g != i2) {
            this.f169248f = i;
            this.f169249g = i2;
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        AppBrandLogger.m52828d("TextureVideoView", "onMeasure");
        if (TextUtils.equals(this.f169250h, "fill")) {
            super.onMeasure(i, i2);
        } else if (this.f169248f == 0 || this.f169249g == 0) {
            setMeasuredDimension(i, i2);
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            String str = this.f169250h;
            str.hashCode();
            if (!str.equals("cover")) {
                float f = (float) size;
                float f2 = (float) size2;
                int i3 = this.f169248f;
                int i4 = this.f169249g;
                if (f / f2 > ((float) i3) / ((float) i4)) {
                    size = (int) ((((float) i3) / ((float) i4)) * f2);
                } else {
                    size2 = (int) ((f * ((float) i4)) / ((float) i3));
                }
                setMeasuredDimension(size, size2);
                return;
            }
            float f3 = (float) size;
            float f4 = (float) size2;
            int i5 = this.f169248f;
            int i6 = this.f169249g;
            if (f3 / f4 > ((float) i5) / ((float) i6)) {
                size2 = (int) ((f3 * ((float) i6)) / ((float) i5));
            } else {
                size = (int) ((((float) i5) / ((float) i6)) * f4);
            }
            setMeasuredDimension(size, size2);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
