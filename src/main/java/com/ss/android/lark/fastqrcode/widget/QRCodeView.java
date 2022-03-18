package com.ss.android.lark.fastqrcode.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.hardware.Camera;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.qrcode.AbstractC23215a;
import com.larksuite.suite.R;
import com.ss.android.lark.fastqrcode.C37040a;
import com.ss.android.lark.fastqrcode.C37051b;
import com.ss.android.lark.fastqrcode.C37055c;
import com.ss.android.lark.fastqrcode.p1831a.C37046a;
import com.ss.android.lark.fastqrcode.p1831a.CallableC37047b;
import com.ss.android.lark.fastqrcode.p1832b.C37054a;
import com.ss.android.lark.fastqrcode.p1833c.C37056a;
import com.ss.android.lark.fastqrcode.p1834d.C37059b;
import com.ss.android.lark.fastqrcode.p1834d.ExecutorC37058a;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

public class QRCodeView extends RelativeLayout implements Camera.PreviewCallback, SurfaceHolder.Callback {

    /* renamed from: a */
    protected Camera f95255a;

    /* renamed from: b */
    protected SurfaceHolder$CallbackC37069b f95256b;

    /* renamed from: c */
    protected IScanBoxView f95257c;

    /* renamed from: d */
    protected AbstractC37065a f95258d;

    /* renamed from: e */
    protected Handler f95259e;

    /* renamed from: f */
    protected AtomicBoolean f95260f;

    /* renamed from: g */
    protected BarcodeFormat[] f95261g;

    /* renamed from: h */
    public AtomicBoolean f95262h;

    /* renamed from: i */
    private ExecutorC37058a f95263i;

    /* renamed from: j */
    private long f95264j;

    /* renamed from: k */
    private long f95265k;

    /* renamed from: l */
    private int f95266l;

    /* renamed from: m */
    private boolean f95267m;

    /* renamed from: n */
    private Runnable f95268n;

    /* renamed from: o */
    private AbstractC37066b f95269o;

    /* renamed from: p */
    private AbstractC23215a f95270p;

    /* renamed from: com.ss.android.lark.fastqrcode.widget.QRCodeView$a */
    public interface AbstractC37065a {
        /* renamed from: a */
        void mo136562a();

        /* renamed from: a */
        void mo136563a(C37054a aVar);
    }

    /* renamed from: com.ss.android.lark.fastqrcode.widget.QRCodeView$b */
    private interface AbstractC37066b extends AbstractC37065a {
        @Override // com.ss.android.lark.fastqrcode.widget.QRCodeView.AbstractC37065a
        /* renamed from: a */
        void mo136563a(C37054a aVar);

        /* renamed from: b */
        void mo136679b();
    }

    /* renamed from: g */
    public void mo136665g() {
        mo136658a();
    }

    public Camera getCamera() {
        return this.f95255a;
    }

    public SurfaceHolder$CallbackC37069b getCameraPreview() {
        return this.f95256b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo136669i() {
        C37046a.m146133b();
    }

    /* renamed from: j */
    private void m146212j() {
        m146209a(0);
    }

    /* renamed from: f */
    public void mo136664f() {
        mo136663e();
        mo136660b();
    }

    private ExecutorC37058a getHandlerExecutor() {
        if (this.f95263i == null) {
            this.f95263i = ExecutorC37058a.m146175a("QR_Code_Open_Camera");
        }
        return this.f95263i;
    }

    /* renamed from: a */
    public void mo136658a() {
        IScanBoxView iScanBoxView = this.f95257c;
        if (iScanBoxView != null) {
            iScanBoxView.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo136660b() {
        IScanBoxView iScanBoxView = this.f95257c;
        if (iScanBoxView != null) {
            iScanBoxView.setVisibility(8);
        }
    }

    /* renamed from: k */
    private void m146213k() {
        if (C37055c.f95199b) {
            getHandlerExecutor().mo136586a().post(new Runnable() {
                /* class com.ss.android.lark.fastqrcode.widget.QRCodeView.RunnableC370644 */

                public void run() {
                    QRCodeView.this.mo136662d();
                }
            });
        } else {
            mo136662d();
        }
    }

    /* renamed from: d */
    public void mo136662d() {
        this.f95264j = System.currentTimeMillis();
        this.f95260f.set(true);
        this.f95262h.set(false);
        m146212j();
        setOneShotPreviewCallback(0);
    }

    /* renamed from: h */
    public void mo136668h() {
        mo136661c();
        mo136664f();
        this.f95259e = null;
        this.f95258d = null;
        this.f95268n = null;
        ExecutorC37058a aVar = this.f95263i;
        if (aVar != null) {
            aVar.mo136588c();
            this.f95263i = null;
        }
    }

    /* renamed from: com.ss.android.lark.fastqrcode.widget.QRCodeView$c */
    private static class C37067c extends FutureTask<C37054a> {

        /* renamed from: a */
        private WeakReference<AbstractC37066b> f95277a;

        /* renamed from: b */
        private int f95278b;

        /* access modifiers changed from: protected */
        public void done() {
            WeakReference<AbstractC37066b> weakReference = this.f95277a;
            if (weakReference != null && weakReference.get() != null) {
                AbstractC37066b bVar = this.f95277a.get();
                try {
                    C37054a aVar = (C37054a) get();
                    if (aVar == null || TextUtils.isEmpty(aVar.f95196a)) {
                        bVar.mo136679b();
                        return;
                    }
                    C37056a.m146161a(this.f95278b);
                    bVar.mo136563a(aVar);
                } catch (Exception e) {
                    C37051b.m146152c("DetectQRCodeFutureTask", e.getMessage());
                    bVar.mo136679b();
                }
            }
        }

        public C37067c(Callable<C37054a> callable, AbstractC37066b bVar, int i) {
            super(callable);
            this.f95277a = new WeakReference<>(bVar);
            this.f95278b = i;
        }
    }

    /* renamed from: c */
    public void mo136661c() {
        try {
            if (this.f95255a != null) {
                this.f95256b.mo136688b();
                this.f95256b.setCamera(null);
                this.f95255a.release();
                this.f95255a = null;
            }
        } catch (Exception e) {
            C37051b.m146152c("QRCodeView", e.toString());
        }
    }

    /* renamed from: e */
    public void mo136663e() {
        mo136669i();
        this.f95260f.set(false);
        if (this.f95255a != null) {
            try {
                C37051b.m146150a("QRCodeView", "stopSpot setOneShotPreviewCallback null");
                this.f95255a.setOneShotPreviewCallback(null);
            } catch (Exception unused) {
                C37051b.m146152c("QRCodeView", "stopSpot setOneShotPreviewCallback exception");
            }
        }
        Handler handler = this.f95259e;
        if (handler != null) {
            handler.removeCallbacks(this.f95268n);
        }
        ExecutorC37058a aVar = this.f95263i;
        if (aVar != null) {
            aVar.mo136586a().removeCallbacks(this.f95268n);
        }
    }

    public void setAutoZoomHandler(AbstractC23215a aVar) {
        this.f95270p = aVar;
    }

    public void setDelegate(AbstractC37065a aVar) {
        this.f95258d = aVar;
    }

    public void setFormats(BarcodeFormat[] barcodeFormatArr) {
        this.f95261g = barcodeFormatArr;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f95256b.surfaceDestroyed(surfaceHolder);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        m146213k();
        this.f95256b.surfaceCreated(surfaceHolder);
    }

    /* renamed from: b */
    private void m146211b(int i) {
        try {
            Camera open = Camera.open(i);
            this.f95255a = open;
            this.f95256b.setCamera(open);
        } catch (Exception unused) {
            AbstractC37065a aVar = this.f95258d;
            if (aVar != null) {
                aVar.mo136562a();
            }
        }
    }

    /* renamed from: a */
    private void m146209a(int i) {
        if (this.f95255a == null) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
                try {
                    Camera.getCameraInfo(i2, cameraInfo);
                } catch (Exception unused) {
                }
                if (cameraInfo.facing == i) {
                    m146211b(i2);
                    return;
                }
            }
        }
    }

    public void setOneShotPreviewCallback(long j) {
        if (C37055c.f95199b) {
            getHandlerExecutor().mo136586a().postDelayed(this.f95268n, j);
            return;
        }
        Handler handler = this.f95259e;
        if (handler != null) {
            handler.removeCallbacks(this.f95268n);
            this.f95259e.postDelayed(this.f95268n, j);
        }
    }

    /* renamed from: a */
    public void mo136659a(Camera.AutoFocusCallback autoFocusCallback) {
        SurfaceHolder$CallbackC37069b bVar = this.f95256b;
        if (bVar != null) {
            int[] iArr = new int[2];
            bVar.getLocationInWindow(iArr);
            SurfaceHolder$CallbackC37069b bVar2 = this.f95256b;
            bVar2.mo136687a((float) (iArr[0] + (bVar2.getMeasuredWidth() / 2)), (float) (iArr[1] + (this.f95256b.getMeasuredHeight() / 2)), autoFocusCallback);
        }
    }

    public QRCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m146210a(Context context, AttributeSet attributeSet) {
        SurfaceHolder$CallbackC37069b bVar = new SurfaceHolder$CallbackC37069b(getContext());
        this.f95256b = bVar;
        bVar.setVisibility(4);
        setBackgroundColor(-16777216);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.qrcv_animTime, R.attr.qrcv_barCodeTipText, R.attr.qrcv_barcodeRectHeight, R.attr.qrcv_borderColor, R.attr.qrcv_borderSize, R.attr.qrcv_cornerColor, R.attr.qrcv_cornerLength, R.attr.qrcv_cornerSize, R.attr.qrcv_customGridScanLineDrawable, R.attr.qrcv_customScanLineDrawable, R.attr.qrcv_isBarcode, R.attr.qrcv_isCenterVertical, R.attr.qrcv_isOnlyDecodeScanBoxArea, R.attr.qrcv_isScanLineReverse, R.attr.qrcv_isShowDefaultGridScanLineDrawable, R.attr.qrcv_isShowDefaultScanLineDrawable, R.attr.qrcv_isShowTipBackground, R.attr.qrcv_isShowTipTextAsSingleLine, R.attr.qrcv_isTipTextBelowRect, R.attr.qrcv_maskColor, R.attr.qrcv_qrCodeTipText, R.attr.qrcv_rectWidth, R.attr.qrcv_scanLineColor, R.attr.qrcv_scanLineMargin, R.attr.qrcv_scanLineSize, R.attr.qrcv_tipBackgroundColor, R.attr.qrcv_tipTextColor, R.attr.qrcv_tipTextMargin, R.attr.qrcv_tipTextSize, R.attr.qrcv_toolbarHeight, R.attr.qrcv_topOffset, R.attr.scanBoxLayout});
        try {
            int resourceId = obtainStyledAttributes.getResourceId(31, 0);
            obtainStyledAttributes.recycle();
            this.f95257c = (IScanBoxView) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null, false);
            this.f95256b.setId(R.id.qrcode_camera_preview);
            this.f95256b.getHolder().addCallback(this);
            addView(this.f95256b);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(context, attributeSet);
            layoutParams.addRule(6, this.f95256b.getId());
            layoutParams.addRule(8, this.f95256b.getId());
            View view = this.f95257c;
            if (view != null) {
                addView(view, layoutParams);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        int i;
        int i2;
        int i3;
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = this.f95266l + 1;
        this.f95266l = i4;
        if (i4 == 1) {
            long j = currentTimeMillis - this.f95264j;
            C37056a.m146167e(j);
            C37051b.m146150a("QRCodeView", "first frame cost time: " + j);
        }
        long j2 = ((long) C37055c.f95202e) - (currentTimeMillis - this.f95265k);
        if (j2 > 0) {
            setOneShotPreviewCallback(j2);
            return;
        }
        this.f95265k = currentTimeMillis;
        if (this.f95260f.get()) {
            C37051b.m146150a("QRCodeView", "effective frame, start to recognize");
            try {
                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                if (previewSize != null) {
                    i2 = previewSize.width;
                    i = previewSize.height;
                } else {
                    i2 = C37059b.m146192b(C37040a.m146119a());
                    i = C37059b.m146196c(C37040a.m146119a());
                }
                if (this.f95267m) {
                    i3 = i2;
                } else {
                    i3 = i;
                }
                C37046a.m146132a(new C37067c(new CallableC37047b(bArr, i2, i, this.f95257c.mo136590a(i3), this.f95270p, this.f95261g), this.f95269o, this.f95266l));
            } catch (Exception unused) {
                C37051b.m146152c("QRCodeView", "camera get preview size failed");
            }
        } else {
            C37051b.m146150a("QRCodeView", "recognizing last frame, current frame is invalid");
        }
    }

    public QRCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f95259e = new Handler();
        this.f95260f = new AtomicBoolean(false);
        this.f95264j = 0;
        this.f95265k = 0;
        this.f95266l = 0;
        this.f95262h = new AtomicBoolean(false);
        this.f95268n = new Runnable() {
            /* class com.ss.android.lark.fastqrcode.widget.QRCodeView.RunnableC370601 */

            public void run() {
                if (QRCodeView.this.f95255a != null && QRCodeView.this.f95260f.get()) {
                    try {
                        QRCodeView.this.f95255a.setOneShotPreviewCallback(QRCodeView.this);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        this.f95269o = new AbstractC37066b() {
            /* class com.ss.android.lark.fastqrcode.widget.QRCodeView.C370612 */

            @Override // com.ss.android.lark.fastqrcode.widget.QRCodeView.AbstractC37066b
            /* renamed from: b */
            public void mo136679b() {
                QRCodeView.this.setOneShotPreviewCallback(0);
            }

            @Override // com.ss.android.lark.fastqrcode.widget.QRCodeView.AbstractC37065a
            /* renamed from: a */
            public void mo136562a() {
                C37051b.m146152c("QRCodeView", "onScanQRCodeOpenCameraError");
                if (QRCodeView.this.f95258d != null) {
                    QRCodeView.this.f95258d.mo136562a();
                }
            }

            @Override // com.ss.android.lark.fastqrcode.widget.QRCodeView.AbstractC37065a, com.ss.android.lark.fastqrcode.widget.QRCodeView.AbstractC37066b
            /* renamed from: a */
            public void mo136563a(final C37054a aVar) {
                C37051b.m146150a("QRCodeView", "onScanQRCodeSuccess");
                if (QRCodeView.this.f95258d != null && !QRCodeView.this.f95262h.get() && QRCodeView.this.f95259e != null) {
                    QRCodeView.this.f95262h.set(true);
                    QRCodeView.this.f95259e.post(new Runnable() {
                        /* class com.ss.android.lark.fastqrcode.widget.QRCodeView.C370612.RunnableC370621 */

                        public void run() {
                            if (QRCodeView.this.f95258d != null) {
                                QRCodeView.this.f95258d.mo136563a(aVar);
                            }
                        }
                    });
                }
            }
        };
        this.f95270p = new AbstractC23215a() {
            /* class com.ss.android.lark.fastqrcode.widget.QRCodeView.C370633 */

            @Override // com.google.zxing.qrcode.AbstractC23215a
            /* renamed from: a */
            public void mo80524a(float f) {
                Camera camera = QRCodeView.this.getCamera();
                Camera.Parameters parameters = camera.getParameters();
                if (parameters.isZoomSupported()) {
                    parameters.setZoom(Math.min((int) (((float) parameters.getZoom()) * f), parameters.getMaxZoom()));
                    camera.setParameters(parameters);
                }
            }
        };
        this.f95267m = C37040a.m146121a(context);
        C37046a.m146131a();
        m146210a(context, attributeSet);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f95256b.surfaceChanged(surfaceHolder, i, i2, i3);
    }
}
