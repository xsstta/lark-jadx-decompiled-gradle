package com.ss.android.photoeditor.ve.crop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.ve.crop.p3015a.C59851a;
import com.ss.android.photoeditor.ve.crop.view.CropImageView;
import com.ss.android.photoeditor.ve.p3018e.C59898c;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class CropOverlayView extends View {

    /* renamed from: a */
    public static int f149018a = 50;

    /* renamed from: b */
    public static int f149019b = 500;

    /* renamed from: c */
    public static int f149020c = 50;

    /* renamed from: A */
    private float f149021A;

    /* renamed from: B */
    private float f149022B;

    /* renamed from: C */
    private CropWindowMoveHandler f149023C;

    /* renamed from: D */
    private boolean f149024D;

    /* renamed from: E */
    private int f149025E;

    /* renamed from: F */
    private int f149026F;

    /* renamed from: G */
    private float f149027G;

    /* renamed from: H */
    private CropImageView.Guidelines f149028H;

    /* renamed from: I */
    private CropImageView.CropShape f149029I;

    /* renamed from: J */
    private final Rect f149030J;

    /* renamed from: K */
    private boolean f149031K;

    /* renamed from: L */
    private HandlerC59876b f149032L;

    /* renamed from: M */
    private Integer f149033M;

    /* renamed from: N */
    private Bitmap f149034N;

    /* renamed from: O */
    private Canvas f149035O;

    /* renamed from: P */
    private Paint f149036P;

    /* renamed from: Q */
    private Paint f149037Q;

    /* renamed from: R */
    private boolean f149038R;

    /* renamed from: d */
    public final C59896a f149039d;

    /* renamed from: e */
    public boolean f149040e;

    /* renamed from: f */
    private boolean f149041f;

    /* renamed from: g */
    private boolean f149042g;

    /* renamed from: h */
    private ScaleGestureDetector f149043h;

    /* renamed from: i */
    private boolean f149044i;

    /* renamed from: j */
    private AbstractC59877c f149045j;

    /* renamed from: k */
    private AbstractC59875a f149046k;

    /* renamed from: l */
    private C59851a f149047l;

    /* renamed from: m */
    private final RectF f149048m;

    /* renamed from: n */
    private Paint f149049n;

    /* renamed from: o */
    private Paint f149050o;

    /* renamed from: p */
    private Paint f149051p;

    /* renamed from: q */
    private Paint f149052q;

    /* renamed from: r */
    private Paint f149053r;

    /* renamed from: s */
    private Path f149054s;

    /* renamed from: t */
    private final float[] f149055t;

    /* renamed from: u */
    private float[] f149056u;

    /* renamed from: v */
    private final RectF f149057v;

    /* renamed from: w */
    private int f149058w;

    /* renamed from: x */
    private int f149059x;

    /* renamed from: y */
    private float f149060y;

    /* renamed from: z */
    private float f149061z;

    /* renamed from: com.ss.android.photoeditor.ve.crop.view.CropOverlayView$a */
    public interface AbstractC59875a {
        /* renamed from: a */
        void mo203830a(boolean z);
    }

    /* renamed from: com.ss.android.photoeditor.ve.crop.view.CropOverlayView$c */
    public interface AbstractC59877c {
        /* renamed from: a */
        void mo203828a();

        /* renamed from: a */
        void mo203829a(boolean z);
    }

    public void setSnapRadius(float f) {
    }

    /* renamed from: c */
    public boolean mo203850c() {
        return this.f149024D;
    }

    public int getAspectRatioX() {
        return this.f149025E;
    }

    public int getAspectRatioY() {
        return this.f149026F;
    }

    public CropImageView.CropShape getCropShape() {
        return this.f149029I;
    }

    public CropImageView.Guidelines getGuidelines() {
        return this.f149028H;
    }

    public Rect getInitialCropWindowRect() {
        return this.f149030J;
    }

    /* renamed from: j */
    private void m232290j() {
        try {
            AbstractC59877c cVar = this.f149045j;
            if (cVar != null) {
                cVar.mo203828a();
            }
        } catch (Exception unused) {
        }
    }

    public RectF getCropWindowRect() {
        return this.f149039d.mo203953a();
    }

    /* renamed from: b */
    public void mo203848b() {
        if (this.f149031K) {
            setCropWindowRect(C59898c.f149202b);
            m232287g();
            invalidate();
        }
    }

    /* renamed from: i */
    private boolean m232289i() {
        float[] fArr = this.f149055t;
        if (fArr[0] == fArr[6] || fArr[1] == fArr[7]) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo203851d() {
        if (this.f149032L.hasMessages(ConnectionResult.RESOLUTION_REQUIRED)) {
            this.f149032L.removeMessages(ConnectionResult.RESOLUTION_REQUIRED);
            this.f149040e = true;
        }
    }

    /* renamed from: e */
    public boolean mo203852e() {
        boolean z = this.f149040e;
        if (z) {
            this.f149032L.removeMessages(ConnectionResult.RESOLUTION_REQUIRED);
            this.f149032L.sendEmptyMessageDelayed(ConnectionResult.RESOLUTION_REQUIRED, 600);
        }
        this.f149040e = false;
        return z;
    }

    /* renamed from: f */
    public void mo203853f() {
        setGuidelines(CropImageView.Guidelines.OFF);
        m232284c(false);
        mo203849b(true);
        invalidate();
    }

    /* renamed from: h */
    private void m232288h() {
        if (this.f149023C != null) {
            this.f149023C = null;
            if (this.f149032L == null) {
                this.f149032L = new HandlerC59876b(this);
            }
            this.f149032L.removeMessages(ConnectionResult.RESOLUTION_REQUIRED);
            this.f149032L.sendEmptyMessageDelayed(ConnectionResult.RESOLUTION_REQUIRED, 600);
        }
    }

    /* renamed from: a */
    public void mo203844a() {
        RectF cropWindowRect = getCropWindowRect();
        m232279a(cropWindowRect);
        this.f149039d.mo203956a(cropWindowRect);
    }

    /* renamed from: g */
    private void m232287g() {
        float max = Math.max(C59898c.m232448a(this.f149055t), (float) BitmapDescriptorFactory.HUE_RED);
        float max2 = Math.max(C59898c.m232459b(this.f149055t), (float) BitmapDescriptorFactory.HUE_RED);
        float min = Math.min(C59898c.m232460c(this.f149055t), (float) getWidth());
        float min2 = Math.min(C59898c.m232461d(this.f149055t), (float) getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.f149031K = true;
            float f = this.f149021A;
            float f2 = min - max;
            float f3 = f * f2;
            float f4 = min2 - max2;
            float f5 = f * f4;
            if (this.f149030J.width() > 0 && this.f149030J.height() > 0) {
                rectF.left = (((float) this.f149030J.left) / this.f149039d.mo203962f()) + max;
                rectF.top = (((float) this.f149030J.top) / this.f149039d.mo203963g()) + max2;
                rectF.right = rectF.left + (((float) this.f149030J.width()) / this.f149039d.mo203962f());
                rectF.bottom = rectF.top + (((float) this.f149030J.height()) / this.f149039d.mo203963g());
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (!this.f149024D || min <= max || min2 <= max2) {
                rectF.left = max + f3;
                rectF.top = max2 + f5;
                rectF.right = min - f3;
                rectF.bottom = min2 - f5;
            } else if (f2 / f4 > this.f149027G) {
                rectF.top = max2 + f5;
                rectF.bottom = min2 - f5;
                float width = ((float) getWidth()) / 2.0f;
                this.f149027G = ((float) this.f149025E) / ((float) this.f149026F);
                float max3 = Math.max(this.f149039d.mo203958b(), rectF.height() * this.f149027G) / 2.0f;
                rectF.left = width - max3;
                rectF.right = width + max3;
            } else {
                rectF.left = max + f3;
                rectF.right = min - f3;
                float height = ((float) f149018a) + (((float) ((getHeight() - f149018a) - f149019b)) / 2.0f);
                float max4 = Math.max(this.f149039d.mo203959c(), rectF.width() / this.f149027G) / 2.0f;
                rectF.top = height - max4;
                rectF.bottom = height + max4;
            }
            m232279a(rectF);
            this.f149039d.mo203956a(rectF);
        }
    }

    public void setActionChangeListener(AbstractC59875a aVar) {
        this.f149046k = aVar;
    }

    public void setCropWindowChangeListener(AbstractC59877c cVar) {
        this.f149045j = cVar;
    }

    public void setRotationRectPoints(float[] fArr) {
        this.f149056u = fArr;
    }

    public void setShowMaskImageViewEnable(boolean z) {
        this.f149041f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.ve.crop.view.CropOverlayView$d */
    public static class C59878d {

        /* renamed from: a */
        private static WeakReference<CropOverlayView> f149063a;

        /* renamed from: a */
        static void m232304a(CropOverlayView cropOverlayView) {
            f149063a = new WeakReference<>(cropOverlayView);
        }

        /* renamed from: a */
        static boolean m232305a(RectF rectF) {
            CropOverlayView cropOverlayView = f149063a.get();
            if (cropOverlayView != null && !Float.isNaN(rectF.bottom) && !Float.isNaN(rectF.left) && !Float.isNaN(rectF.right) && !Float.isNaN(rectF.top) && rectF.bottom <= ((float) ((cropOverlayView.getHeight() + 1) - CropOverlayView.f149019b)) && rectF.top >= ((float) (CropOverlayView.f149018a - 1)) && rectF.left >= ((float) (CropOverlayView.f149020c - 1)) && rectF.right <= ((float) ((cropOverlayView.getWidth() - CropOverlayView.f149020c) + 1))) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.photoeditor.ve.crop.view.CropOverlayView$e */
    public class C59879e extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C59879e() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF a = CropOverlayView.this.f149039d.mo203953a();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f = focusY - currentSpanY;
            float f2 = focusX - currentSpanX;
            float f3 = focusX + currentSpanX;
            float f4 = focusY + currentSpanY;
            if (f2 >= f3 || f > f4 || f2 < BitmapDescriptorFactory.HUE_RED || f3 > CropOverlayView.this.f149039d.mo203960d() || f < BitmapDescriptorFactory.HUE_RED || f4 > CropOverlayView.this.f149039d.mo203961e()) {
                return true;
            }
            a.set(f2, f, f3, f4);
            CropOverlayView.this.f149039d.mo203956a(a);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    /* renamed from: c */
    private void m232284c(boolean z) {
        try {
            AbstractC59877c cVar = this.f149045j;
            if (cVar != null) {
                cVar.mo203829a(z);
            }
        } catch (Exception unused) {
        }
    }

    public void setBackgroundAlpha(int i) {
        this.f149053r.setAlpha(i);
    }

    public void setCropWindowRect(RectF rectF) {
        this.f149039d.mo203956a(rectF);
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.f149024D != z) {
            this.f149024D = z;
        }
    }

    public void setLeftAndRightMargin(int i) {
        if (i > 0) {
            f149020c = i;
        }
    }

    public void setMarginBottom(int i) {
        if (i > 0) {
            f149019b = i;
        }
    }

    public void setMarginUp(int i) {
        if (i > 0) {
            f149018a = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.photoeditor.ve.crop.view.CropOverlayView$b */
    public static class HandlerC59876b extends Handler {

        /* renamed from: a */
        private WeakReference<CropOverlayView> f149062a;

        HandlerC59876b(CropOverlayView cropOverlayView) {
            this.f149062a = new WeakReference<>(cropOverlayView);
        }

        public void handleMessage(Message message) {
            CropOverlayView cropOverlayView;
            if (message.what == 9001 && (cropOverlayView = this.f149062a.get()) != null) {
                cropOverlayView.mo203853f();
            }
        }
    }

    /* renamed from: a */
    private static Paint m232276a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    public void setGuidelines(CropImageView.Guidelines guidelines) {
        if (this.f149028H != guidelines) {
            this.f149028H = guidelines;
            if (this.f149031K) {
                invalidate();
            }
        }
    }

    public CropOverlayView(Context context) {
        this(context, null);
        C59878d.m232304a(this);
        if (this.f149032L == null) {
            this.f149032L = new HandlerC59876b(this);
        }
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f149030J;
        if (rect == null) {
            rect = C59898c.f149201a;
        }
        rect2.set(rect);
        if (this.f149031K) {
            m232287g();
            invalidate();
            m232284c(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m232281b(canvas);
        if (this.f149039d.mo203964h() && this.f149042g) {
            if (this.f149028H == CropImageView.Guidelines.ON) {
                m232283c(canvas);
            } else if (this.f149028H == CropImageView.Guidelines.ON_TOUCH && this.f149023C != null) {
                m232283c(canvas);
            }
        }
        m232285d(canvas);
        m232286e(canvas);
        m232278a(canvas);
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f149025E != i) {
            this.f149025E = i;
            this.f149027G = ((float) i) / ((float) this.f149026F);
            if (this.f149031K) {
                m232287g();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f149026F != i) {
            this.f149026F = i;
            this.f149027G = ((float) this.f149025E) / ((float) i);
            if (this.f149031K) {
                m232287g();
                invalidate();
            }
        }
    }

    public void setBordersPaintAlpha(int i) {
        Paint paint = this.f149049n;
        if (paint != null) {
            paint.setAlpha(i);
            if (i == 0) {
                this.f149049n.setShadowLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -2013265920);
            } else {
                this.f149049n.setShadowLayer(6.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -2013265920);
            }
        }
        Paint paint2 = this.f149050o;
        if (paint2 != null) {
            paint2.setAlpha(i);
        }
    }

    public void setCropShape(CropImageView.CropShape cropShape) {
        if (this.f149029I != cropShape) {
            this.f149029I = cropShape;
            if (Build.VERSION.SDK_INT <= 17) {
                if (this.f149029I == CropImageView.CropShape.OVAL) {
                    Integer valueOf = Integer.valueOf(getLayerType());
                    this.f149033M = valueOf;
                    if (valueOf.intValue() != 1) {
                        setLayerType(1, null);
                    } else {
                        this.f149033M = null;
                    }
                } else {
                    Integer num = this.f149033M;
                    if (num != null) {
                        setLayerType(num.intValue(), null);
                        this.f149033M = null;
                    }
                }
            }
            invalidate();
        }
    }

    /* renamed from: d */
    private void m232285d(Canvas canvas) {
        if (!this.f149038R) {
            Paint paint = this.f149052q;
            if (paint != null) {
                paint.getStrokeWidth();
                RectF a = this.f149039d.mo203953a();
                if (this.f149029I == CropImageView.CropShape.RECTANGLE) {
                    canvas.drawRect(a, this.f149052q);
                } else {
                    canvas.drawOval(a, this.f149052q);
                }
            }
            Paint paint2 = this.f149049n;
            if (paint2 != null && paint2.getAlpha() != 0) {
                float strokeWidth = this.f149049n.getStrokeWidth();
                RectF a2 = this.f149039d.mo203953a();
                float f = strokeWidth / 2.0f;
                a2.inset(f, f);
                if (this.f149029I == CropImageView.CropShape.RECTANGLE) {
                    canvas.drawRect(a2, this.f149049n);
                } else {
                    canvas.drawOval(a2, this.f149049n);
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    m232280b(motionEvent.getX(), motionEvent.getY());
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                } else if (action != 3) {
                    return false;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            m232288h();
            return true;
        }
        m232277a(motionEvent.getX(), motionEvent.getY());
        if (this.f149023C == null) {
            return false;
        }
        return true;
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        this.f149039d.mo203957a(cropImageOptions);
        setCropShape(cropImageOptions.f148934a);
        setSnapRadius(cropImageOptions.f148935b);
        setGuidelines(cropImageOptions.f148937d);
        setFixedAspectRatio(cropImageOptions.f148945l);
        setAspectRatioX(cropImageOptions.f148946m);
        setAspectRatioY(cropImageOptions.f148947n);
        mo203847a(cropImageOptions.f148942i);
        this.f149022B = cropImageOptions.f148936c;
        this.f149021A = cropImageOptions.f148944k;
        this.f149049n = m232275a(2.0f, -1);
        this.f149052q = m232275a(20.0f, 536870912);
        this.f149060y = -3.0f;
        this.f149061z = 60.0f;
        this.f149050o = m232275a(6.0f, -1);
        this.f149051p = m232275a(2.0f, -1427576600);
        this.f149053r = m232276a(-2013265920);
    }

    /* renamed from: a */
    private void m232278a(Canvas canvas) {
        if (this.f149038R) {
            if (this.f149036P == null) {
                Paint paint = new Paint();
                this.f149036P = paint;
                paint.setColor(-1);
                this.f149036P.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            float[] fArr = this.f149056u;
            if (fArr != null && fArr.length >= 8) {
                Rect rect = new Rect(0, 0, getWidth(), getHeight());
                Paint paint2 = new Paint();
                paint2.setColor(-16777216);
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                this.f149035O.drawRect(rect, paint2);
                Path path = new Path();
                float[] fArr2 = this.f149056u;
                path.moveTo(fArr2[0], fArr2[1]);
                float[] fArr3 = this.f149056u;
                path.lineTo(fArr3[2], fArr3[3]);
                float[] fArr4 = this.f149056u;
                path.lineTo(fArr4[4], fArr4[5]);
                float[] fArr5 = this.f149056u;
                path.lineTo(fArr5[6], fArr5[7]);
                float[] fArr6 = this.f149056u;
                path.lineTo(fArr6[0], fArr6[1]);
                path.close();
                this.f149035O.drawPath(path, this.f149036P);
                if (this.f149037Q == null) {
                    Paint paint3 = new Paint();
                    this.f149037Q = paint3;
                    paint3.setAlpha(SmActions.ACTION_ONTHECALL_ENTRY);
                }
                canvas.drawBitmap(this.f149034N, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f149037Q);
            }
        }
    }

    /* renamed from: c */
    private void m232283c(Canvas canvas) {
        float f;
        if (this.f149051p != null) {
            Paint paint = this.f149049n;
            if (paint != null) {
                f = paint.getStrokeWidth();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            RectF a = this.f149039d.mo203953a();
            a.inset(f, f);
            float width = a.width() / 3.0f;
            float height = a.height() / 3.0f;
            if (this.f149029I == CropImageView.CropShape.OVAL) {
                float width2 = (a.width() / 2.0f) - f;
                float height2 = (a.height() / 2.0f) - f;
                float f2 = a.left + width;
                float f3 = a.right - width;
                float sin = (float) (((double) height2) * Math.sin(Math.acos((double) ((width2 - width) / width2))));
                canvas.drawLine(f2, (a.top + height2) - sin, f2, (a.bottom - height2) + sin, this.f149051p);
                canvas.drawLine(f3, (a.top + height2) - sin, f3, (a.bottom - height2) + sin, this.f149051p);
                float f4 = a.top + height;
                float f5 = a.bottom - height;
                float cos = (float) (((double) width2) * Math.cos(Math.asin((double) ((height2 - height) / height2))));
                canvas.drawLine((a.left + width2) - cos, f4, (a.right - width2) + cos, f4, this.f149051p);
                canvas.drawLine((a.left + width2) - cos, f5, (a.right - width2) + cos, f5, this.f149051p);
                return;
            }
            float f6 = a.left + width;
            float f7 = a.right - width;
            canvas.drawLine(f6, a.top, f6, a.bottom, this.f149051p);
            canvas.drawLine(f7, a.top, f7, a.bottom, this.f149051p);
            float f8 = a.top + height;
            float f9 = a.bottom - height;
            canvas.drawLine(a.left, f8, a.right, f8, this.f149051p);
            canvas.drawLine(a.left, f9, a.right, f9, this.f149051p);
        }
    }

    /* renamed from: e */
    private void m232286e(Canvas canvas) {
        Paint paint;
        float f;
        if (!this.f149038R && (paint = this.f149050o) != null && paint.getAlpha() != 0) {
            Paint paint2 = this.f149049n;
            if (paint2 != null) {
                f = paint2.getStrokeWidth();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            float strokeWidth = this.f149050o.getStrokeWidth();
            float f2 = strokeWidth / 2.0f;
            RectF a = this.f149039d.mo203953a();
            float f3 = -(this.f149060y + f2);
            a.inset(f3, f3);
            float f4 = (strokeWidth - f) / 2.0f;
            float f5 = f2 + f4;
            canvas.drawLine(a.left - f4, a.top - f5, a.left - f4, a.top + this.f149061z, this.f149050o);
            canvas.drawLine(a.left - f5, a.top - f4, a.left + this.f149061z, a.top - f4, this.f149050o);
            canvas.drawLine(a.right + f4, a.top - f5, a.right + f4, a.top + this.f149061z, this.f149050o);
            canvas.drawLine(a.right + f5, a.top - f4, a.right - this.f149061z, a.top - f4, this.f149050o);
            canvas.drawLine(a.left - f4, a.bottom + f5, a.left - f4, a.bottom - this.f149061z, this.f149050o);
            canvas.drawLine(a.left - f5, a.bottom + f4, a.left + this.f149061z, a.bottom + f4, this.f149050o);
            canvas.drawLine(a.right + f4, a.bottom + f5, a.right + f4, a.bottom - this.f149061z, this.f149050o);
            canvas.drawLine(a.right + f5, a.bottom + f4, a.right - this.f149061z, a.bottom + f4, this.f149050o);
        }
    }

    /* renamed from: b */
    public void mo203849b(boolean z) {
        if (this.f149041f) {
            if (z) {
                if (this.f149047l == null) {
                    C59851a aVar = new C59851a(this, 200);
                    this.f149047l = aVar;
                    aVar.mo203749a(SmActions.ACTION_ONTHECALL_EXIT, 255);
                }
                AbstractC59875a aVar2 = this.f149046k;
                if (aVar2 != null) {
                    aVar2.mo203830a(z);
                }
                this.f149047l.setStartDelay(300);
                this.f149047l.start();
                this.f149049n.setAlpha(0);
            } else if (this.f149053r.getAlpha() != 0) {
                C59851a aVar3 = this.f149047l;
                if (aVar3 != null && aVar3.isRunning()) {
                    this.f149047l.cancel();
                }
                C59851a aVar4 = new C59851a(this, 200);
                aVar4.mo203749a(255, SmActions.ACTION_ONTHECALL_EXIT);
                aVar4.start();
                AbstractC59875a aVar5 = this.f149046k;
                if (aVar5 != null) {
                    aVar5.mo203830a(z);
                }
                this.f149049n.setAlpha(255);
            }
        } else if (z) {
            C59851a aVar6 = new C59851a(this);
            aVar6.mo203749a(0, SmActions.ACTION_ONTHECALL_ENTRY);
            aVar6.start();
        } else if (this.f149053r.getAlpha() != 0) {
            C59851a aVar7 = new C59851a(this);
            aVar7.mo203749a(SmActions.ACTION_ONTHECALL_ENTRY, 0);
            aVar7.start();
        }
    }

    /* renamed from: a */
    private void m232279a(RectF rectF) {
        if (rectF.width() < this.f149039d.mo203958b()) {
            float b = (this.f149039d.mo203958b() - rectF.width()) / 2.0f;
            rectF.left -= b;
            rectF.right += b;
        }
        if (rectF.height() < this.f149039d.mo203959c()) {
            float c = (this.f149039d.mo203959c() - rectF.height()) / 2.0f;
            rectF.top -= c;
            rectF.bottom += c;
        }
        if (rectF.width() > this.f149039d.mo203960d()) {
            float width = (rectF.width() - this.f149039d.mo203960d()) / 2.0f;
            rectF.left += width;
            rectF.right -= width;
        }
        if (rectF.height() > this.f149039d.mo203961e()) {
            float height = (rectF.height() - this.f149039d.mo203961e()) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        m232282b(rectF);
        if (this.f149057v.width() > BitmapDescriptorFactory.HUE_RED && this.f149057v.height() > BitmapDescriptorFactory.HUE_RED) {
            float max = Math.max(this.f149057v.left, (float) BitmapDescriptorFactory.HUE_RED);
            float max2 = Math.max(this.f149057v.top, (float) BitmapDescriptorFactory.HUE_RED);
            float min = Math.min(this.f149057v.right, (float) getWidth());
            float min2 = Math.min(this.f149057v.bottom, (float) getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.f149024D && ((double) Math.abs(rectF.width() - (rectF.height() * this.f149027G))) > 0.1d) {
            if (rectF.width() > rectF.height() * this.f149027G) {
                float abs = Math.abs((rectF.height() * this.f149027G) - rectF.width()) / 2.0f;
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.f149027G) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    /* renamed from: b */
    private void m232281b(Canvas canvas) {
        Paint paint;
        if (!this.f149038R && (paint = this.f149053r) != null && paint.getAlpha() != 0) {
            RectF a = this.f149039d.mo203953a();
            float width = (float) getWidth();
            float height = (float) getHeight();
            if (this.f149029I != CropImageView.CropShape.RECTANGLE) {
                this.f149054s.reset();
                if (Build.VERSION.SDK_INT > 17 || this.f149029I != CropImageView.CropShape.OVAL) {
                    this.f149048m.set(a.left, a.top, a.right, a.bottom);
                } else {
                    this.f149048m.set(a.left + 2.0f, a.top + 2.0f, a.right - 2.0f, a.bottom - 2.0f);
                }
                this.f149054s.addOval(this.f149048m, Path.Direction.CW);
                canvas.save();
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipOutPath(this.f149054s);
                } else {
                    canvas.clipPath(this.f149054s, Region.Op.XOR);
                }
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height, this.f149053r);
                canvas.restore();
            } else if (!m232289i() || Build.VERSION.SDK_INT <= 17) {
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, a.top, this.f149053r);
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, a.bottom, width, height, this.f149053r);
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, a.top, a.left, a.bottom, this.f149053r);
                canvas.drawRect(a.right, a.top, width, a.bottom, this.f149053r);
            } else {
                this.f149054s.reset();
                Path path = this.f149054s;
                float[] fArr = this.f149055t;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f149054s;
                float[] fArr2 = this.f149055t;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f149054s;
                float[] fArr3 = this.f149055t;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f149054s;
                float[] fArr4 = this.f149055t;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f149054s.close();
                canvas.save();
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipOutPath(this.f149054s);
                } else {
                    canvas.clipPath(this.f149054s, Region.Op.INTERSECT);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipRect(a);
                } else {
                    canvas.clipRect(a, Region.Op.XOR);
                }
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height, this.f149053r);
                canvas.restore();
            }
        }
    }

    /* renamed from: b */
    private boolean m232282b(RectF rectF) {
        float a = C59898c.m232448a(this.f149055t);
        float b = C59898c.m232459b(this.f149055t);
        float c = C59898c.m232460c(this.f149055t);
        float d = C59898c.m232461d(this.f149055t);
        if (!m232289i()) {
            this.f149057v.set(a, b, c, d);
            return false;
        }
        float[] fArr = this.f149055t;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[4];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[7];
        if (fArr[7] < fArr[1]) {
            if (fArr[1] < fArr[3]) {
                f = fArr[6];
                f2 = fArr[7];
                f3 = fArr[2];
                f4 = fArr[3];
                f5 = fArr[4];
                f6 = fArr[5];
            } else {
                f = fArr[4];
                f2 = fArr[5];
                f3 = fArr[0];
                f4 = fArr[1];
                f5 = fArr[2];
                f6 = fArr[3];
            }
        } else if (fArr[1] > fArr[3]) {
            f = fArr[2];
            f2 = fArr[3];
            f3 = fArr[6];
            f4 = fArr[7];
            f5 = fArr[0];
            f6 = fArr[1];
        }
        float f7 = (f6 - f2) / (f5 - f);
        float f8 = -1.0f / f7;
        float f9 = f2 - (f7 * f);
        float f10 = f2 - (f * f8);
        float f11 = f4 - (f7 * f3);
        float f12 = f4 - (f3 * f8);
        float centerY = (rectF.centerY() - rectF.top) / (rectF.centerX() - rectF.left);
        float f13 = -centerY;
        float f14 = rectF.top - (rectF.left * centerY);
        float f15 = rectF.top - (rectF.right * f13);
        float f16 = f7 - centerY;
        float f17 = (f14 - f9) / f16;
        if (f17 >= rectF.right) {
            f17 = a;
        }
        float max = Math.max(a, f17);
        float f18 = (f14 - f10) / (f8 - centerY);
        if (f18 >= rectF.right) {
            f18 = max;
        }
        float max2 = Math.max(max, f18);
        float f19 = f8 - f13;
        float f20 = (f15 - f12) / f19;
        if (f20 >= rectF.right) {
            f20 = max2;
        }
        float max3 = Math.max(max2, f20);
        float f21 = (f15 - f10) / f19;
        if (f21 <= rectF.left) {
            f21 = c;
        }
        float min = Math.min(c, f21);
        float f22 = (f15 - f11) / (f7 - f13);
        if (f22 <= rectF.left) {
            f22 = min;
        }
        float min2 = Math.min(min, f22);
        float f23 = (f14 - f11) / f16;
        if (f23 <= rectF.left) {
            f23 = min2;
        }
        float min3 = Math.min(min2, f23);
        float max4 = Math.max(b, Math.max((f7 * max3) + f9, (f8 * min3) + f10));
        float min4 = Math.min(d, Math.min((f8 * max3) + f12, (f7 * min3) + f11));
        this.f149057v.left = max3;
        this.f149057v.top = max4;
        this.f149057v.right = min3;
        this.f149057v.bottom = min4;
        return true;
    }

    /* renamed from: a */
    public boolean mo203847a(boolean z) {
        if (this.f149044i == z) {
            return false;
        }
        this.f149044i = z;
        if (!z || this.f149043h != null) {
            return true;
        }
        this.f149043h = new ScaleGestureDetector(getContext(), new C59879e());
        return true;
    }

    /* renamed from: a */
    private static Paint m232275a(float f, int i) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    /* renamed from: a */
    private void m232277a(float f, float f2) {
        CropWindowMoveHandler a = this.f149039d.mo203954a(f, f2, this.f149022B, this.f149029I);
        this.f149023C = a;
        if (a != null) {
            if (this.f149032L == null) {
                this.f149032L = new HandlerC59876b(this);
            }
            setGuidelines(CropImageView.Guidelines.ON);
            this.f149032L.removeMessages(ConnectionResult.RESOLUTION_REQUIRED);
            mo203849b(false);
            invalidate();
            m232290j();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap createBitmap = Bitmap.createBitmap(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2), Bitmap.Config.ARGB_8888);
        this.f149034N = createBitmap;
        createBitmap.setHasAlpha(true);
        this.f149035O = new Canvas(this.f149034N);
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149042g = true;
        this.f149039d = new C59896a();
        this.f149048m = new RectF();
        this.f149054s = new Path();
        this.f149055t = new float[8];
        this.f149056u = new float[8];
        this.f149057v = new RectF();
        this.f149026F = 1;
        this.f149027G = ((float) this.f149025E) / ((float) 1);
        this.f149030J = new Rect();
        this.f149038R = false;
        this.f149040e = false;
        C59878d.m232304a(this);
        if (this.f149032L == null) {
            this.f149032L = new HandlerC59876b(this);
        }
    }

    /* renamed from: b */
    private void m232280b(float f, float f2) {
        float f3;
        if (this.f149023C != null) {
            if (f > ((float) (getWidth() - f149020c))) {
                f = (float) (getWidth() - f149020c);
            }
            int i = f149020c;
            if (f < ((float) i)) {
                f = (float) i;
            }
            int i2 = f149018a;
            if (f2 < ((float) i2)) {
                f2 = (float) i2;
            }
            if (f2 > ((float) (getHeight() - f149019b))) {
                f3 = (float) (getHeight() - f149019b);
            } else {
                f3 = f2;
            }
            RectF a = this.f149039d.mo203953a();
            m232282b(a);
            this.f149023C.mo203883a(a, f, f3, this.f149057v, getWidth(), getHeight(), BitmapDescriptorFactory.HUE_RED, this.f149024D, this.f149027G);
            this.f149039d.mo203956a(a);
            m232284c(true);
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo203846a(float[] fArr, int i, int i2) {
        if (fArr == null || !Arrays.equals(this.f149055t, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f149055t, (float) BitmapDescriptorFactory.HUE_RED);
            } else {
                System.arraycopy(fArr, 0, this.f149055t, 0, fArr.length);
            }
            this.f149058w = i;
            this.f149059x = i2;
            RectF a = this.f149039d.mo203953a();
            if (a.width() == BitmapDescriptorFactory.HUE_RED || a.height() == BitmapDescriptorFactory.HUE_RED) {
                m232287g();
            }
        }
    }

    /* renamed from: a */
    public void mo203845a(float f, float f2, float f3, float f4) {
        this.f149039d.mo203955a(f, f2, f3, f4);
    }
}
