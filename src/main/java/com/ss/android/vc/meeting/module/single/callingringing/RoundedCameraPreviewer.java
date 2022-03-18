package com.ss.android.vc.meeting.module.single.callingringing;

import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import java.util.List;

public class RoundedCameraPreviewer extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: b */
    private static final float f158939b = ((float) C60773o.m236115a(4.0d));

    /* renamed from: a */
    public float f158940a;

    /* renamed from: c */
    private volatile Camera f158941c;

    /* renamed from: d */
    private volatile int f158942d;

    /* renamed from: e */
    private volatile int f158943e;

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m247019d() {
        m247018c();
        m247017b();
    }

    /* renamed from: a */
    private void m247016a() {
        setSurfaceTextureListener(this);
        setOutlineProvider(new ViewOutlineProvider() {
            /* class com.ss.android.vc.meeting.module.single.callingringing.RoundedCameraPreviewer.C630601 */

            public void getOutline(View view, Outline outline) {
                C60700b.m235851b("RoundedCameraPreviewer@", "[initView]", "width = " + view.getMeasuredWidth() + " , height = " + view.getMeasuredHeight());
                outline.setRoundRect(new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight()), RoundedCameraPreviewer.this.f158940a);
            }
        });
        setClipToOutline(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m247018c() {
        if (this.f158941c != null) {
            try {
                this.f158941c.stopPreview();
            } catch (Exception e) {
                C60700b.m235846a("RoundedCameraPreviewer@", "[stopCameraPreview]" + e.toString(), e);
            }
        }
    }

    /* renamed from: b */
    private void m247017b() {
        if (this.f158941c != null) {
            try {
                Camera.Parameters parameters = this.f158941c.getParameters();
                Camera.Size a = m247015a(getWidth(), getHeight(), parameters.getSupportedPreviewSizes());
                parameters.setPreviewSize(a.width, a.height);
                this.f158941c.setParameters(parameters);
                this.f158941c.setPreviewTexture(getSurfaceTexture());
                if (getContext() instanceof Activity) {
                    setCameraDisplayOrientation((Activity) getContext());
                } else {
                    this.f158941c.setDisplayOrientation(90);
                }
                this.f158941c.startPreview();
            } catch (Exception e) {
                C60700b.m235846a("RoundedCameraPreviewer@", "[showCameraPreview]" + e.toString(), e);
            }
        }
    }

    public RoundedCameraPreviewer(Context context) {
        this(context, null);
    }

    public void setRadius(int i) {
        this.f158940a = (float) i;
        invalidateOutline();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C60735ab.m236013c(new Runnable() {
            /* class com.ss.android.vc.meeting.module.single.callingringing.$$Lambda$RoundedCameraPreviewer$1Ssh3VinhFTgo0X6vhoyQhLvZLg */

            public final void run() {
                RoundedCameraPreviewer.lambda$1Ssh3VinhFTgo0X6vhoyQhLvZLg(RoundedCameraPreviewer.this);
            }
        });
        return true;
    }

    private void setCameraDisplayOrientation(Activity activity) {
        int i;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f158942d, cameraInfo);
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            i = (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        } else {
            i = ((cameraInfo.orientation - i2) + 360) % 360;
        }
        this.f158941c.setDisplayOrientation(i);
    }

    public RoundedCameraPreviewer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f158942d = -1;
        this.f158943e = 1;
        this.f158940a = f158939b;
        m247016a();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture != null) {
            C60735ab.m236013c(new Runnable() {
                /* class com.ss.android.vc.meeting.module.single.callingringing.$$Lambda$RoundedCameraPreviewer$2ZLFuyMDuAJSsK0gYRtCXAg0IfQ */

                public final void run() {
                    RoundedCameraPreviewer.lambda$2ZLFuyMDuAJSsK0gYRtCXAg0IfQ(RoundedCameraPreviewer.this);
                }
            });
        }
    }

    /* renamed from: a */
    private Camera.Size m247015a(int i, int i2, List<Camera.Size> list) {
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        for (Camera.Size size : list) {
            if (size.width == i2 && size.height == i) {
                return size;
            }
        }
        float f = ((float) i2) / ((float) i);
        Camera.Size size2 = null;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        for (Camera.Size size3 : list) {
            float abs = Math.abs((((float) size3.width) / ((float) size3.height)) - f);
            if (size2 == null || f2 > abs) {
                size2 = size3;
                f2 = abs;
            }
        }
        return size2;
    }
}
