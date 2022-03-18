package com.ss.android.lark.fastqrcode.widget;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.zxing.common.p1002a.C23210a;
import com.ss.android.lark.fastqrcode.C37040a;
import com.ss.android.lark.fastqrcode.C37051b;
import com.ss.android.lark.fastqrcode.p1834d.C37059b;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.fastqrcode.widget.b */
public class SurfaceHolder$CallbackC37069b extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: a */
    public Camera f95283a;

    /* renamed from: b */
    public boolean f95284b;

    /* renamed from: c */
    public boolean f95285c = true;

    /* renamed from: d */
    public boolean f95286d;

    /* renamed from: e */
    public Runnable f95287e = new Runnable() {
        /* class com.ss.android.lark.fastqrcode.widget.SurfaceHolder$CallbackC37069b.RunnableC370701 */

        public void run() {
            if (SurfaceHolder$CallbackC37069b.this.f95283a != null && SurfaceHolder$CallbackC37069b.this.f95284b && SurfaceHolder$CallbackC37069b.this.f95285c && SurfaceHolder$CallbackC37069b.this.f95286d) {
                try {
                    SurfaceHolder$CallbackC37069b.this.f95283a.autoFocus(SurfaceHolder$CallbackC37069b.this.f95288f);
                } catch (Exception unused) {
                }
            }
        }
    };

    /* renamed from: f */
    Camera.AutoFocusCallback f95288f = new Camera.AutoFocusCallback() {
        /* class com.ss.android.lark.fastqrcode.widget.SurfaceHolder$CallbackC37069b.C370712 */

        public void onAutoFocus(boolean z, Camera camera) {
            SurfaceHolder$CallbackC37069b bVar = SurfaceHolder$CallbackC37069b.this;
            bVar.postDelayed(bVar.f95287e, 1000);
        }
    };

    /* renamed from: g */
    private C37068a f95289g;

    /* renamed from: h */
    private GestureDetector f95290h;

    /* renamed from: i */
    private float f95291i;

    /* renamed from: j */
    private boolean f95292j;

    /* renamed from: k */
    private boolean f95293k;

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    /* renamed from: b */
    public void mo136688b() {
        if (this.f95283a != null) {
            try {
                removeCallbacks(this.f95287e);
                this.f95284b = false;
                this.f95283a.cancelAutoFocus();
                this.f95283a.stopPreview();
            } catch (Exception e) {
                C37051b.m146152c("CameraPreview", e.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo136686a() {
        Camera camera = this.f95283a;
        if (camera != null) {
            try {
                this.f95284b = true;
                camera.setPreviewDisplay(getHolder());
                this.f95289g.mo136685b(this.f95283a);
                this.f95283a.startPreview();
                if (this.f95285c) {
                    this.f95283a.autoFocus(this.f95288f);
                }
            } catch (Exception e) {
                C37051b.m146152c("CameraPreview", e.toString());
            }
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f95286d = true;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f95286d = false;
        mo136688b();
    }

    public SurfaceHolder$CallbackC37069b(Context context) {
        super(context);
        this.f95293k = C37040a.m146121a(context);
        this.f95290h = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            /* class com.ss.android.lark.fastqrcode.widget.SurfaceHolder$CallbackC37069b.C370723 */

            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (SurfaceHolder$CallbackC37069b.this.f95283a != null) {
                    try {
                        Camera.Parameters parameters = SurfaceHolder$CallbackC37069b.this.f95283a.getParameters();
                        if (parameters.isZoomSupported()) {
                            int zoom = parameters.getZoom();
                            int maxZoom = parameters.getMaxZoom();
                            if (zoom >= maxZoom / 2) {
                                parameters.setZoom(0);
                            } else if (zoom < maxZoom / 2) {
                                parameters.setZoom(maxZoom / 2);
                            }
                            SurfaceHolder$CallbackC37069b.this.f95283a.setParameters(parameters);
                        }
                    } catch (Exception unused) {
                    }
                }
                return super.onDoubleTap(motionEvent);
            }
        });
    }

    /* renamed from: a */
    private static float m146240a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            return C23210a.m84049a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
        }
        return -1.0f;
    }

    public void setCamera(Camera camera) {
        this.f95283a = camera;
        if (camera != null) {
            C37068a aVar = new C37068a(getContext());
            this.f95289g = aVar;
            aVar.mo136684a(this.f95283a);
            if (!this.f95284b) {
                mo136686a();
            }
            post(new Runnable() {
                /* class com.ss.android.lark.fastqrcode.widget.SurfaceHolder$CallbackC37069b.RunnableC370734 */

                public void run() {
                    SurfaceHolder$CallbackC37069b.this.requestLayout();
                }
            });
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f95290h.onTouchEvent(motionEvent);
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount == 1) {
            try {
                m146243b(motionEvent.getX(), motionEvent.getY(), null);
            } catch (Exception unused) {
            }
        } else if (pointerCount >= 2) {
            int action = motionEvent.getAction() & 255;
            if (action == 2) {
                float a = m146240a(motionEvent);
                float f = this.f95291i;
                if (a > f) {
                    m146242a(true);
                } else if (a < f) {
                    m146242a(false);
                }
                this.f95291i = a;
            } else if (action == 5) {
                this.f95292j = true;
                this.f95291i = m146240a(motionEvent);
            } else if (action == 6) {
                this.f95292j = false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m146242a(boolean z) {
        Camera camera = this.f95283a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (parameters.isZoomSupported()) {
                    int maxZoom = parameters.getMaxZoom();
                    int zoom = parameters.getZoom();
                    if (z) {
                        if (zoom < maxZoom) {
                            zoom++;
                        }
                    } else if (zoom > 0) {
                        zoom--;
                    }
                    parameters.setZoom(zoom);
                    this.f95283a.setParameters(parameters);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = getDefaultSize(getSuggestedMinimumHeight(), i2);
        C37068a aVar = this.f95289g;
        if (aVar == null || aVar.mo136683a() == null) {
            super.onMeasure(i, i2);
            return;
        }
        Point a = this.f95289g.mo136683a();
        if (this.f95293k) {
            i3 = a.y;
            i4 = a.x;
        } else {
            i3 = a.x;
            i4 = a.y;
        }
        float f = (float) defaultSize;
        float f2 = (float) defaultSize2;
        float f3 = (float) i3;
        float f4 = (float) i4;
        float f5 = (f3 * 1.0f) / f4;
        if ((f * 1.0f) / f2 < f5) {
            defaultSize = (int) ((f2 / ((f4 * 1.0f) / f3)) + 0.5f);
        } else {
            defaultSize2 = (int) ((f / f5) + 0.5f);
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    /* renamed from: a */
    public void mo136687a(float f, float f2, Camera.AutoFocusCallback autoFocusCallback) {
        try {
            m146243b(f, f2, autoFocusCallback);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m146243b(float f, float f2, Camera.AutoFocusCallback autoFocusCallback) {
        int i;
        if (this.f95283a != null) {
            Rect a = m146241a(f, f2, C37059b.m146192b(C37040a.m146119a()), C37059b.m146196c(C37040a.m146119a()));
            this.f95283a.cancelAutoFocus();
            Camera.Parameters parameters = this.f95283a.getParameters();
            if (parameters != null) {
                ArrayList arrayList = new ArrayList();
                int i2 = 800;
                if (parameters.getMaxNumFocusAreas() > 800) {
                    i = 800;
                } else {
                    i = parameters.getMaxNumFocusAreas();
                }
                arrayList.add(new Camera.Area(a, i));
                if (parameters.getMaxNumFocusAreas() > 0) {
                    parameters.setFocusAreas(arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                if (parameters.getMaxNumMeteringAreas() <= 800) {
                    i2 = parameters.getMaxNumMeteringAreas();
                }
                arrayList2.add(new Camera.Area(a, i2));
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    parameters.setMeteringAreas(arrayList2);
                }
                List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                if (supportedFocusModes.contains("auto")) {
                    parameters.setFocusMode("auto");
                } else if (supportedFocusModes.contains("macro")) {
                    parameters.setFocusMode("macro");
                }
                try {
                    this.f95283a.setParameters(parameters);
                    removeCallbacks(this.f95287e);
                    if (autoFocusCallback == null) {
                        this.f95283a.autoFocus(new Camera.AutoFocusCallback() {
                            /* class com.ss.android.lark.fastqrcode.widget.SurfaceHolder$CallbackC37069b.C370745 */

                            public void onAutoFocus(boolean z, Camera camera) {
                            }
                        });
                    } else {
                        this.f95283a.autoFocus(autoFocusCallback);
                    }
                } catch (Exception unused) {
                    C37051b.m146152c("CameraPreview", "set parameter error");
                }
            }
        }
    }

    /* renamed from: a */
    private Rect m146241a(float f, float f2, int i, int i2) {
        int i3 = (int) (((f / ((float) i)) * 2000.0f) - 1000.0f);
        int i4 = (int) (((f2 / ((float) i2)) * 2000.0f) - 1000.0f);
        return new Rect(C23210a.m84050a(i3 - 150, IByteRtcError.BRERR_INVALID_TOKEN, 1000), C23210a.m84050a(i4 - 150, IByteRtcError.BRERR_INVALID_TOKEN, 1000), C23210a.m84050a(i3 + 150, IByteRtcError.BRERR_INVALID_TOKEN, 1000), C23210a.m84050a(i4 + 150, IByteRtcError.BRERR_INVALID_TOKEN, 1000));
    }
}
