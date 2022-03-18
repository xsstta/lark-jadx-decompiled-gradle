package com.ss.android.vc.meeting.module.single.callingringing;

import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import java.util.List;

public class CameraPreviewer extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: a */
    private volatile Camera f158933a;

    /* renamed from: b */
    private volatile int f158934b;

    /* renamed from: c */
    private volatile int f158935c;

    /* renamed from: d */
    private AbstractC63059a f158936d;

    /* renamed from: e */
    private Context f158937e;

    /* renamed from: f */
    private int f158938f;

    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.CameraPreviewer$a */
    public interface AbstractC63059a {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    /* renamed from: b */
    private void m247010b() {
        getHolder().addCallback(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m247013e() {
        m247012d();
        m247011c();
    }

    /* renamed from: a */
    public boolean mo217896a() {
        if (this.f158935c == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m247012d() {
        if (this.f158933a != null) {
            try {
                this.f158933a.stopPreview();
            } catch (Exception e) {
                C60700b.m235864f("CameraPreviewer@", "[stopCameraPreview]", e.toString());
            }
        }
    }

    /* renamed from: c */
    private void m247011c() {
        if (this.f158933a != null) {
            try {
                Camera.Parameters parameters = this.f158933a.getParameters();
                Camera.Size a = m247009a(getWidth(), getHeight(), parameters.getSupportedPreviewSizes());
                parameters.setPreviewSize(a.width, a.height);
                this.f158933a.setParameters(parameters);
                this.f158933a.setPreviewDisplay(getHolder());
                if (DesktopUtil.m144307b()) {
                    this.f158933a.setDisplayOrientation(90);
                } else {
                    setCameraDisplayOrientation(this.f158933a);
                }
                this.f158933a.startPreview();
            } catch (Exception e) {
                C60700b.m235864f("CameraPreviewer@", "[showCameraPreview]", e.toString());
            }
        }
    }

    public void setCameraPreviewerCallBack(AbstractC63059a aVar) {
        this.f158936d = aVar;
    }

    public CameraPreviewer(Context context) {
        this(context, null);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C60735ab.m236013c(new Runnable() {
            /* class com.ss.android.vc.meeting.module.single.callingringing.$$Lambda$CameraPreviewer$FufwWskfODyknvkRmO06Edc14o */

            public final void run() {
                CameraPreviewer.m271407lambda$FufwWskfODyknvkRmO06Edc14o(CameraPreviewer.this);
            }
        });
    }

    private void setCameraDisplayOrientation(Camera camera) {
        int i;
        int rotation = ((WindowManager) this.f158937e.getSystemService("window")).getDefaultDisplay().getRotation();
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
        if (mo217896a()) {
            i = (360 - ((this.f158938f + i2) % 360)) % 360;
        } else {
            i = ((this.f158938f - i2) + 360) % 360;
        }
        C60700b.m235851b("CameraPreviewer@", "[setCameraDisplayOrientation]", "orientation = " + this.f158938f + ", degree = " + i2 + ", result = " + i);
        camera.setDisplayOrientation(i);
    }

    public CameraPreviewer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f158934b = -1;
        this.f158935c = 1;
        this.f158937e = context;
        m247010b();
    }

    /* renamed from: a */
    private Camera.Size m247009a(int i, int i2, List<Camera.Size> list) {
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

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder != null && surfaceHolder.getSurface() != null) {
            C60735ab.m236013c(new Runnable() {
                /* class com.ss.android.vc.meeting.module.single.callingringing.$$Lambda$CameraPreviewer$_PMGiWDt0yrQoMTa9e5a4xTg4I */

                public final void run() {
                    CameraPreviewer.m271408lambda$_PMGiWDt0yrQoMTa9e5a4xTg4I(CameraPreviewer.this);
                }
            });
        }
    }
}
