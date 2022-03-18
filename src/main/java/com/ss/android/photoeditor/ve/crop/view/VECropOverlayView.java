package com.ss.android.photoeditor.ve.crop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
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
import com.ss.android.photoeditor.ve.crop.p3015a.C59854e;
import com.ss.android.photoeditor.ve.crop.view.CropImageView;
import com.ss.android.photoeditor.ve.p3018e.C59898c;
import com.ss.android.ttve.utils.C60275a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class VECropOverlayView extends View {

    /* renamed from: a */
    public static int f149094a = 50;

    /* renamed from: b */
    public static int f149095b = 500;

    /* renamed from: c */
    public static int f149096c = 50;

    /* renamed from: A */
    private float f149097A;

    /* renamed from: B */
    private float f149098B;

    /* renamed from: C */
    private float f149099C;

    /* renamed from: D */
    private VECropWindowMoveHandler f149100D;

    /* renamed from: E */
    private boolean f149101E;

    /* renamed from: F */
    private int f149102F;

    /* renamed from: G */
    private int f149103G;

    /* renamed from: H */
    private float f149104H;

    /* renamed from: I */
    private CropImageView.Guidelines f149105I;

    /* renamed from: J */
    private CropImageView.CropShape f149106J;

    /* renamed from: K */
    private final Rect f149107K;

    /* renamed from: L */
    private boolean f149108L;

    /* renamed from: M */
    private HandlerC59887b f149109M;

    /* renamed from: N */
    private Integer f149110N;

    /* renamed from: O */
    private int f149111O;

    /* renamed from: P */
    private Bitmap f149112P;

    /* renamed from: Q */
    private Canvas f149113Q;

    /* renamed from: R */
    private Paint f149114R;

    /* renamed from: S */
    private Paint f149115S;

    /* renamed from: T */
    private boolean f149116T;

    /* renamed from: d */
    public final C59897b f149117d;

    /* renamed from: e */
    public boolean f149118e;

    /* renamed from: f */
    public boolean f149119f;

    /* renamed from: g */
    private boolean f149120g;

    /* renamed from: h */
    private boolean f149121h;

    /* renamed from: i */
    private ScaleGestureDetector f149122i;

    /* renamed from: j */
    private boolean f149123j;

    /* renamed from: k */
    private AbstractC59888c f149124k;

    /* renamed from: l */
    private AbstractC59886a f149125l;

    /* renamed from: m */
    private C59854e f149126m;

    /* renamed from: n */
    private final RectF f149127n;

    /* renamed from: o */
    private Paint f149128o;

    /* renamed from: p */
    private Paint f149129p;

    /* renamed from: q */
    private Paint f149130q;

    /* renamed from: r */
    private Paint f149131r;

    /* renamed from: s */
    private Paint f149132s;

    /* renamed from: t */
    private Path f149133t;

    /* renamed from: u */
    private final float[] f149134u;

    /* renamed from: v */
    private float[] f149135v;

    /* renamed from: w */
    private final RectF f149136w;

    /* renamed from: x */
    private int f149137x;

    /* renamed from: y */
    private int f149138y;

    /* renamed from: z */
    private float f149139z;

    /* renamed from: com.ss.android.photoeditor.ve.crop.view.VECropOverlayView$a */
    public interface AbstractC59886a {
        /* renamed from: a */
        void mo203929a(boolean z);
    }

    /* renamed from: com.ss.android.photoeditor.ve.crop.view.VECropOverlayView$c */
    public interface AbstractC59888c {
        /* renamed from: a */
        void mo203931a();

        /* renamed from: a */
        void mo203932a(boolean z);
    }

    public void setSnapRadius(float f) {
    }

    public int getAspectRatioX() {
        return this.f149102F;
    }

    public int getAspectRatioY() {
        return this.f149103G;
    }

    public CropImageView.CropShape getCropShape() {
        return this.f149106J;
    }

    public CropImageView.Guidelines getGuidelines() {
        return this.f149105I;
    }

    public Rect getInitialCropWindowRect() {
        return this.f149107K;
    }

    /* renamed from: i */
    private void m232344i() {
        try {
            AbstractC59888c cVar = this.f149124k;
            if (cVar != null) {
                cVar.mo203931a();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public boolean mo203896b() {
        return this.f149101E;
    }

    public RectF getCropWindowRect() {
        return this.f149117d.mo203965a();
    }

    /* renamed from: c */
    public void mo203897c() {
        if (this.f149108L) {
            m232342g();
            invalidate();
            m232340d(false);
        }
    }

    /* renamed from: d */
    public void mo203899d() {
        setGuidelines(CropImageView.Guidelines.ON);
        invalidate();
        mo203898c(false);
        m232344i();
    }

    /* renamed from: f */
    public void mo203901f() {
        m232340d(false);
        mo203898c(true);
        invalidate();
    }

    /* renamed from: h */
    private boolean m232343h() {
        float[] fArr = this.f149134u;
        if (fArr[0] == fArr[6] || fArr[1] == fArr[7]) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo203900e() {
        if (this.f149100D != null) {
            this.f149100D = null;
            if (this.f149109M == null) {
                this.f149109M = new HandlerC59887b(this);
            }
            this.f149109M.removeMessages(ConnectionResult.RESOLUTION_REQUIRED);
            this.f149109M.sendEmptyMessageDelayed(ConnectionResult.RESOLUTION_REQUIRED, 600);
        }
    }

    /* renamed from: g */
    private void m232342g() {
        float max = Math.max(C59898c.m232448a(this.f149134u), (float) BitmapDescriptorFactory.HUE_RED);
        float max2 = Math.max(C59898c.m232459b(this.f149134u), (float) BitmapDescriptorFactory.HUE_RED);
        float min = Math.min(C59898c.m232460c(this.f149134u), (float) getWidth());
        float min2 = Math.min(C59898c.m232461d(this.f149134u), (float) getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.f149108L = true;
            float f = this.f149098B;
            float f2 = min - max;
            float f3 = f * f2;
            float f4 = min2 - max2;
            float f5 = f * f4;
            if (this.f149107K.width() > 0 && this.f149107K.height() > 0) {
                rectF.left = (((float) this.f149107K.left) / this.f149117d.mo203974f()) + max;
                rectF.top = (((float) this.f149107K.top) / this.f149117d.mo203975g()) + max2;
                rectF.right = rectF.left + (((float) this.f149107K.width()) / this.f149117d.mo203974f());
                rectF.bottom = rectF.top + (((float) this.f149107K.height()) / this.f149117d.mo203975g());
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (!this.f149101E || min <= max || min2 <= max2) {
                rectF.left = max + f3;
                rectF.top = max2 + f5;
                rectF.right = min - f3;
                rectF.bottom = min2 - f5;
            } else if (f2 / f4 > this.f149104H) {
                rectF.top = max2 + f5;
                rectF.bottom = min2 - f5;
                float width = ((float) getWidth()) / 2.0f;
                this.f149104H = ((float) this.f149102F) / ((float) this.f149103G);
                float max3 = Math.max(this.f149117d.mo203970b(), rectF.height() * this.f149104H) / 2.0f;
                rectF.left = width - max3;
                rectF.right = width + max3;
            } else {
                rectF.left = max + f3;
                rectF.right = min - f3;
                float height = ((float) f149094a) + (((float) ((getHeight() - f149094a) - f149095b)) / 2.0f);
                float max4 = Math.max(this.f149117d.mo203971c(), rectF.width() / this.f149104H) / 2.0f;
                rectF.top = height - max4;
                rectF.bottom = height + max4;
            }
            m232334a(rectF);
            this.f149117d.mo203968a(rectF);
        }
    }

    /* renamed from: a */
    public void mo203891a() {
        if (this.f149108L) {
            setCropWindowRect(C59898c.f149202b);
            m232342g();
            invalidate();
        }
    }

    /* renamed from: b */
    public void mo203895b(boolean z) {
        this.f149116T = z;
    }

    public void setActionChangeListener(AbstractC59886a aVar) {
        this.f149125l = aVar;
    }

    public void setCropWindowChangeListener(AbstractC59888c cVar) {
        this.f149124k = cVar;
    }

    public void setRotationRectPoints(float[] fArr) {
        this.f149135v = fArr;
    }

    public void setShowMaskImageViewEnable(boolean z) {
        this.f149120g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.ve.crop.view.VECropOverlayView$d */
    public static class C59889d {

        /* renamed from: a */
        private static WeakReference<VECropOverlayView> f149141a;

        /* renamed from: a */
        static void m232359a(VECropOverlayView vECropOverlayView) {
            f149141a = new WeakReference<>(vECropOverlayView);
        }

        /* renamed from: a */
        static boolean m232360a(RectF rectF) {
            VECropOverlayView vECropOverlayView = f149141a.get();
            if (vECropOverlayView != null && !Float.isNaN(rectF.bottom) && !Float.isNaN(rectF.left) && !Float.isNaN(rectF.right) && !Float.isNaN(rectF.top) && rectF.bottom <= ((float) ((vECropOverlayView.getHeight() + 1) - VECropOverlayView.f149095b)) && rectF.top >= ((float) (VECropOverlayView.f149094a - 1)) && rectF.left >= ((float) (VECropOverlayView.f149096c - 1)) && rectF.right <= ((float) ((vECropOverlayView.getWidth() - VECropOverlayView.f149096c) + 1))) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.photoeditor.ve.crop.view.VECropOverlayView$e */
    public class C59890e extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C59890e() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF a = VECropOverlayView.this.f149117d.mo203965a();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f = focusY - currentSpanY;
            float f2 = focusX - currentSpanX;
            float f3 = focusX + currentSpanX;
            float f4 = focusY + currentSpanY;
            if (f2 >= f3 || f > f4 || f2 < BitmapDescriptorFactory.HUE_RED || f3 > VECropOverlayView.this.f149117d.mo203972d() || f < BitmapDescriptorFactory.HUE_RED || f4 > VECropOverlayView.this.f149117d.mo203973e()) {
                return true;
            }
            a.set(f2, f, f3, f4);
            VECropOverlayView.this.f149117d.mo203968a(a);
            VECropOverlayView.this.invalidate();
            return true;
        }
    }

    public VECropOverlayView(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private void m232340d(boolean z) {
        try {
            AbstractC59888c cVar = this.f149124k;
            if (cVar != null) {
                cVar.mo203932a(z);
            }
        } catch (Exception unused) {
        }
    }

    public void setBackgroundAlpha(int i) {
        this.f149132s.setAlpha(i);
    }

    public void setCropWindowRect(RectF rectF) {
        this.f149117d.mo203968a(rectF);
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.f149101E != z) {
            this.f149101E = z;
        }
    }

    public void setLeftAndRightMargin(int i) {
        if (i > 0) {
            f149096c = i;
        }
    }

    public void setMarginBottom(int i) {
        if (i > 0) {
            f149095b = i;
        }
    }

    public void setMarginUp(int i) {
        if (i > 0) {
            f149094a = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.photoeditor.ve.crop.view.VECropOverlayView$b */
    public static class HandlerC59887b extends Handler {

        /* renamed from: a */
        private WeakReference<VECropOverlayView> f149140a;

        HandlerC59887b(VECropOverlayView vECropOverlayView) {
            this.f149140a = new WeakReference<>(vECropOverlayView);
        }

        public void handleMessage(Message message) {
            VECropOverlayView vECropOverlayView;
            if (message.what == 9001 && (vECropOverlayView = this.f149140a.get()) != null) {
                vECropOverlayView.mo203901f();
            }
        }
    }

    /* renamed from: a */
    private static Paint m232330a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    public void setGuidelines(CropImageView.Guidelines guidelines) {
        if (this.f149105I != guidelines) {
            this.f149105I = guidelines;
            if (this.f149108L) {
                invalidate();
            }
        }
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f149107K;
        if (rect == null) {
            rect = C59898c.f149201a;
        }
        rect2.set(rect);
        if (this.f149108L) {
            m232342g();
            invalidate();
            m232340d(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m232336b(canvas);
        if (this.f149117d.mo203976h() && this.f149121h) {
            if (this.f149105I == CropImageView.Guidelines.ON) {
                m232338c(canvas);
            } else if (this.f149105I == CropImageView.Guidelines.ON_TOUCH && this.f149100D != null) {
                m232338c(canvas);
            }
        }
        m232339d(canvas);
        m232341e(canvas);
        m232332a(canvas);
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f149102F != i) {
            this.f149102F = i;
            this.f149104H = ((float) i) / ((float) this.f149103G);
            if (this.f149108L) {
                m232342g();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f149103G != i) {
            this.f149103G = i;
            this.f149104H = ((float) this.f149102F) / ((float) i);
            if (this.f149108L) {
                m232342g();
                invalidate();
            }
        }
    }

    public void setBordersPaintAlpha(int i) {
        Paint paint = this.f149128o;
        if (paint != null) {
            paint.setAlpha(i);
            if (i == 0) {
                this.f149128o.setShadowLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -2013265920);
            } else {
                this.f149128o.setShadowLayer(6.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -2013265920);
            }
        }
        Paint paint2 = this.f149129p;
        if (paint2 != null) {
            paint2.setAlpha(i);
        }
    }

    public void setCropShape(CropImageView.CropShape cropShape) {
        if (this.f149106J != cropShape) {
            this.f149106J = cropShape;
            if (Build.VERSION.SDK_INT <= 17) {
                if (this.f149106J == CropImageView.CropShape.OVAL) {
                    Integer valueOf = Integer.valueOf(getLayerType());
                    this.f149110N = valueOf;
                    if (valueOf.intValue() != 1) {
                        setLayerType(1, null);
                    } else {
                        this.f149110N = null;
                    }
                } else {
                    Integer num = this.f149110N;
                    if (num != null) {
                        setLayerType(num.intValue(), null);
                        this.f149110N = null;
                    }
                }
            }
            invalidate();
        }
    }

    /* renamed from: a */
    private void m232333a(Paint paint) {
        paint.setPathEffect(new DashPathEffect(new float[]{C60275a.m234185a(getContext(), 2.56f), C60275a.m234185a(getContext(), 2.56f)}, BitmapDescriptorFactory.HUE_RED));
    }

    /* renamed from: d */
    private void m232339d(Canvas canvas) {
        if (!this.f149116T) {
            Paint paint = this.f149131r;
            if (paint != null) {
                paint.getStrokeWidth();
                RectF a = this.f149117d.mo203965a();
                if (this.f149106J == CropImageView.CropShape.RECTANGLE) {
                    canvas.drawRect(a, this.f149131r);
                } else {
                    canvas.drawOval(a, this.f149131r);
                }
            }
            Paint paint2 = this.f149128o;
            if (paint2 != null && paint2.getAlpha() != 0) {
                float strokeWidth = this.f149128o.getStrokeWidth();
                RectF a2 = this.f149117d.mo203965a();
                float f = strokeWidth / 2.0f;
                a2.inset(f, f);
                if (this.f149106J == CropImageView.CropShape.RECTANGLE) {
                    canvas.drawRect(a2, this.f149128o);
                } else {
                    canvas.drawOval(a2, this.f149128o);
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f149118e && isEnabled()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f149111O);
                        if (findPointerIndex < 0) {
                            return false;
                        }
                        m232335b(motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex));
                        return true;
                    } else if (actionMasked != 3) {
                        return false;
                    }
                }
                this.f149111O = -1;
                mo203900e();
                return false;
            }
            int pointerId = motionEvent.getPointerId(0);
            this.f149111O = pointerId;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            m232331a(motionEvent.getX(), motionEvent.getY());
            if (this.f149100D == null || findPointerIndex2 < 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        this.f149117d.mo203969a(cropImageOptions);
        setCropShape(cropImageOptions.f148934a);
        setSnapRadius(cropImageOptions.f148935b);
        setGuidelines(cropImageOptions.f148937d);
        setFixedAspectRatio(cropImageOptions.f148945l);
        setAspectRatioX(cropImageOptions.f148946m);
        setAspectRatioY(cropImageOptions.f148947n);
        mo203894a(cropImageOptions.f148942i);
        this.f149099C = cropImageOptions.f148936c;
        this.f149098B = cropImageOptions.f148944k;
        this.f149128o = m232329a(2.0f, -1);
        this.f149131r = m232329a(6.0f, 536870912);
        this.f149139z = -3.0f;
        this.f149097A = 60.0f;
        this.f149129p = m232329a(6.0f, -1);
        Paint a = m232329a(2.0f, -1427576600);
        this.f149130q = a;
        m232333a(a);
        this.f149132s = m232330a(-1291845632);
    }

    /* renamed from: a */
    private void m232332a(Canvas canvas) {
        if (this.f149116T) {
            if (this.f149114R == null) {
                Paint paint = new Paint();
                this.f149114R = paint;
                paint.setColor(-1);
                this.f149114R.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            float[] fArr = this.f149135v;
            if (fArr != null && fArr.length >= 8) {
                Rect rect = new Rect(0, 0, getWidth(), getHeight());
                Paint paint2 = new Paint();
                paint2.setColor(-16777216);
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                this.f149113Q.drawRect(rect, paint2);
                Path path = new Path();
                float[] fArr2 = this.f149135v;
                path.moveTo(fArr2[0], fArr2[1]);
                float[] fArr3 = this.f149135v;
                path.lineTo(fArr3[2], fArr3[3]);
                float[] fArr4 = this.f149135v;
                path.lineTo(fArr4[4], fArr4[5]);
                float[] fArr5 = this.f149135v;
                path.lineTo(fArr5[6], fArr5[7]);
                float[] fArr6 = this.f149135v;
                path.lineTo(fArr6[0], fArr6[1]);
                path.close();
                this.f149113Q.drawPath(path, this.f149114R);
                if (this.f149115S == null) {
                    Paint paint3 = new Paint();
                    this.f149115S = paint3;
                    paint3.setAlpha(SmActions.ACTION_ONTHECALL_ENTRY);
                }
                canvas.drawBitmap(this.f149112P, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f149115S);
            }
        }
    }

    /* renamed from: c */
    private void m232338c(Canvas canvas) {
        float f;
        if (this.f149130q != null) {
            Paint paint = this.f149128o;
            if (paint != null) {
                f = paint.getStrokeWidth();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            RectF a = this.f149117d.mo203965a();
            a.inset(f, f);
            float width = a.width() / 3.0f;
            float height = a.height() / 3.0f;
            if (this.f149106J == CropImageView.CropShape.OVAL) {
                float width2 = (a.width() / 2.0f) - f;
                float height2 = (a.height() / 2.0f) - f;
                float f2 = a.left + width;
                float f3 = a.right - width;
                float sin = (float) (((double) height2) * Math.sin(Math.acos((double) ((width2 - width) / width2))));
                canvas.drawLine(f2, (a.top + height2) - sin, f2, (a.bottom - height2) + sin, this.f149130q);
                canvas.drawLine(f3, (a.top + height2) - sin, f3, (a.bottom - height2) + sin, this.f149130q);
                float f4 = a.top + height;
                float f5 = a.bottom - height;
                float cos = (float) (((double) width2) * Math.cos(Math.asin((double) ((height2 - height) / height2))));
                canvas.drawLine((a.left + width2) - cos, f4, (a.right - width2) + cos, f4, this.f149130q);
                canvas.drawLine((a.left + width2) - cos, f5, (a.right - width2) + cos, f5, this.f149130q);
                return;
            }
            float f6 = a.left + width;
            float f7 = a.right - width;
            canvas.drawLine(f6, a.top, f6, a.bottom, this.f149130q);
            canvas.drawLine(f7, a.top, f7, a.bottom, this.f149130q);
            float f8 = a.top + height;
            float f9 = a.bottom - height;
            canvas.drawLine(a.left, f8, a.right, f8, this.f149130q);
            canvas.drawLine(a.left, f9, a.right, f9, this.f149130q);
        }
    }

    /* renamed from: e */
    private void m232341e(Canvas canvas) {
        Paint paint;
        float f;
        if (!this.f149116T && (paint = this.f149129p) != null && paint.getAlpha() != 0) {
            Paint paint2 = this.f149128o;
            if (paint2 != null) {
                f = paint2.getStrokeWidth();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            float strokeWidth = this.f149129p.getStrokeWidth();
            float f2 = strokeWidth / 2.0f;
            RectF a = this.f149117d.mo203965a();
            float f3 = -(this.f149139z + f2);
            a.inset(f3, f3);
            float f4 = (strokeWidth - f) / 2.0f;
            float f5 = f2 + f4;
            canvas.drawLine(a.left - f4, a.top - f5, a.left - f4, a.top + this.f149097A, this.f149129p);
            canvas.drawLine(a.left - f5, a.top - f4, a.left + this.f149097A, a.top - f4, this.f149129p);
            canvas.drawLine(a.right + f4, a.top - f5, a.right + f4, a.top + this.f149097A, this.f149129p);
            canvas.drawLine(a.right + f5, a.top - f4, a.right - this.f149097A, a.top - f4, this.f149129p);
            canvas.drawLine(a.left - f4, a.bottom + f5, a.left - f4, a.bottom - this.f149097A, this.f149129p);
            canvas.drawLine(a.left - f5, a.bottom + f4, a.left + this.f149097A, a.bottom + f4, this.f149129p);
            canvas.drawLine(a.right + f4, a.bottom + f5, a.right + f4, a.bottom - this.f149097A, this.f149129p);
            canvas.drawLine(a.right + f5, a.bottom + f4, a.right - this.f149097A, a.bottom + f4, this.f149129p);
        }
    }

    /* renamed from: a */
    private void m232334a(RectF rectF) {
        if (rectF.width() < this.f149117d.mo203970b()) {
            float b = (this.f149117d.mo203970b() - rectF.width()) / 2.0f;
            rectF.left -= b;
            rectF.right += b;
        }
        if (rectF.height() < this.f149117d.mo203971c()) {
            float c = (this.f149117d.mo203971c() - rectF.height()) / 2.0f;
            rectF.top -= c;
            rectF.bottom += c;
        }
        if (rectF.width() > this.f149117d.mo203972d()) {
            float width = (rectF.width() - this.f149117d.mo203972d()) / 2.0f;
            rectF.left += width;
            rectF.right -= width;
        }
        if (rectF.height() > this.f149117d.mo203973e()) {
            float height = (rectF.height() - this.f149117d.mo203973e()) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        m232337b(rectF);
        if (this.f149136w.width() > BitmapDescriptorFactory.HUE_RED && this.f149136w.height() > BitmapDescriptorFactory.HUE_RED) {
            float max = Math.max(this.f149136w.left, (float) BitmapDescriptorFactory.HUE_RED);
            float max2 = Math.max(this.f149136w.top, (float) BitmapDescriptorFactory.HUE_RED);
            float min = Math.min(this.f149136w.right, (float) getWidth());
            float min2 = Math.min(this.f149136w.bottom, (float) getHeight());
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
        if (this.f149101E && ((double) Math.abs(rectF.width() - (rectF.height() * this.f149104H))) > 0.1d) {
            if (rectF.width() > rectF.height() * this.f149104H) {
                float abs = Math.abs((rectF.height() * this.f149104H) - rectF.width()) / 2.0f;
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.f149104H) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    /* renamed from: b */
    private void m232336b(Canvas canvas) {
        Paint paint;
        if (!this.f149116T && (paint = this.f149132s) != null && paint.getAlpha() != 0) {
            RectF a = this.f149117d.mo203965a();
            float width = (float) getWidth();
            float height = (float) getHeight();
            if (this.f149106J != CropImageView.CropShape.RECTANGLE) {
                this.f149133t.reset();
                if (Build.VERSION.SDK_INT > 17 || this.f149106J != CropImageView.CropShape.OVAL) {
                    this.f149127n.set(a.left, a.top, a.right, a.bottom);
                } else {
                    this.f149127n.set(a.left + 2.0f, a.top + 2.0f, a.right - 2.0f, a.bottom - 2.0f);
                }
                this.f149133t.addOval(this.f149127n, Path.Direction.CW);
                canvas.save();
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipOutPath(this.f149133t);
                } else {
                    canvas.clipPath(this.f149133t, Region.Op.XOR);
                }
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height, this.f149132s);
                canvas.restore();
            } else if (!m232343h() || Build.VERSION.SDK_INT <= 17) {
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, a.top, this.f149132s);
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, a.bottom, width, height, this.f149132s);
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, a.top, a.left, a.bottom, this.f149132s);
                canvas.drawRect(a.right, a.top, width, a.bottom, this.f149132s);
            } else {
                this.f149133t.reset();
                Path path = this.f149133t;
                float[] fArr = this.f149134u;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f149133t;
                float[] fArr2 = this.f149134u;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f149133t;
                float[] fArr3 = this.f149134u;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f149133t;
                float[] fArr4 = this.f149134u;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f149133t.close();
                canvas.save();
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipOutPath(this.f149133t);
                } else {
                    canvas.clipPath(this.f149133t, Region.Op.INTERSECT);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipRect(a);
                } else {
                    canvas.clipRect(a, Region.Op.XOR);
                }
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height, this.f149132s);
                canvas.restore();
            }
        }
    }

    /* renamed from: c */
    public void mo203898c(boolean z) {
        if (this.f149120g) {
            if (z) {
                if (this.f149126m == null) {
                    C59854e eVar = new C59854e(this, 200);
                    this.f149126m = eVar;
                    eVar.mo203759a(SmActions.ACTION_ONTHECALL_EXIT, 255);
                }
                AbstractC59886a aVar = this.f149125l;
                if (aVar != null) {
                    aVar.mo203929a(z);
                }
                this.f149126m.setStartDelay(300);
                this.f149126m.start();
                this.f149128o.setAlpha(0);
            } else if (this.f149132s.getAlpha() != 0) {
                C59854e eVar2 = this.f149126m;
                if (eVar2 != null && eVar2.isRunning()) {
                    this.f149126m.cancel();
                }
                C59854e eVar3 = new C59854e(this, 200);
                eVar3.mo203759a(255, SmActions.ACTION_ONTHECALL_EXIT);
                eVar3.start();
                AbstractC59886a aVar2 = this.f149125l;
                if (aVar2 != null) {
                    aVar2.mo203929a(z);
                }
                this.f149128o.setAlpha(255);
            }
        } else if (z) {
            C59854e eVar4 = new C59854e(this);
            eVar4.mo203759a(0, SmActions.ACTION_ONTHECALL_ENTRY);
            eVar4.start();
        } else if (this.f149132s.getAlpha() != 0) {
            C59854e eVar5 = new C59854e(this);
            eVar5.mo203759a(SmActions.ACTION_ONTHECALL_ENTRY, 0);
            eVar5.start();
        }
    }

    /* renamed from: b */
    private boolean m232337b(RectF rectF) {
        float a = C59898c.m232448a(this.f149134u);
        float b = C59898c.m232459b(this.f149134u);
        float c = C59898c.m232460c(this.f149134u);
        float d = C59898c.m232461d(this.f149134u);
        if (!m232343h()) {
            this.f149136w.set(a, b, c, d);
            return false;
        }
        float[] fArr = this.f149134u;
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
        this.f149136w.left = max3;
        this.f149136w.top = max4;
        this.f149136w.right = min3;
        this.f149136w.bottom = min4;
        return true;
    }

    /* renamed from: a */
    public boolean mo203894a(boolean z) {
        if (this.f149123j == z) {
            return false;
        }
        this.f149123j = z;
        if (!z || this.f149122i != null) {
            return true;
        }
        this.f149122i = new ScaleGestureDetector(getContext(), new C59890e());
        return true;
    }

    public VECropOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static Paint m232329a(float f, int i) {
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
    private void m232331a(float f, float f2) {
        VECropWindowMoveHandler a = this.f149117d.mo203966a(f, f2, this.f149099C, this.f149106J);
        this.f149100D = a;
        if (a != null) {
            if (this.f149109M == null) {
                this.f149109M = new HandlerC59887b(this);
            }
            setGuidelines(CropImageView.Guidelines.ON);
            mo203898c(false);
            invalidate();
            this.f149109M.removeMessages(ConnectionResult.RESOLUTION_REQUIRED);
            m232344i();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap createBitmap = Bitmap.createBitmap(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2), Bitmap.Config.ARGB_8888);
        this.f149112P = createBitmap;
        createBitmap.setHasAlpha(true);
        this.f149113Q = new Canvas(this.f149112P);
    }

    /* renamed from: b */
    private void m232335b(float f, float f2) {
        float f3;
        if (this.f149100D != null) {
            if (f > ((float) (getWidth() - f149096c))) {
                f = (float) (getWidth() - f149096c);
            }
            int i = f149096c;
            if (f < ((float) i)) {
                f = (float) i;
            }
            int i2 = f149094a;
            if (f2 < ((float) i2)) {
                f2 = (float) i2;
            }
            if (f2 > ((float) (getHeight() - f149095b))) {
                f3 = (float) (getHeight() - f149095b);
            } else {
                f3 = f2;
            }
            RectF a = this.f149117d.mo203965a();
            m232337b(a);
            this.f149100D.mo203952a(a, f, f3, this.f149136w, getWidth(), getHeight(), BitmapDescriptorFactory.HUE_RED, this.f149101E, this.f149104H);
            this.f149117d.mo203968a(a);
            m232340d(true);
            invalidate();
        }
    }

    public VECropOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f149121h = true;
        this.f149117d = new C59897b();
        this.f149127n = new RectF();
        this.f149133t = new Path();
        this.f149134u = new float[8];
        this.f149135v = new float[8];
        this.f149136w = new RectF();
        this.f149103G = 1;
        this.f149104H = ((float) this.f149102F) / ((float) 1);
        this.f149107K = new Rect();
        this.f149111O = -1;
        this.f149118e = false;
        this.f149116T = false;
        this.f149119f = false;
        C59889d.m232359a(this);
        if (this.f149109M == null) {
            this.f149109M = new HandlerC59887b(this);
        }
    }

    /* renamed from: a */
    public void mo203893a(float[] fArr, int i, int i2) {
        if (fArr == null || !Arrays.equals(this.f149134u, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f149134u, (float) BitmapDescriptorFactory.HUE_RED);
            } else {
                System.arraycopy(fArr, 0, this.f149134u, 0, fArr.length);
            }
            this.f149137x = i;
            this.f149138y = i2;
            RectF a = this.f149117d.mo203965a();
            if (a.width() == BitmapDescriptorFactory.HUE_RED || a.height() == BitmapDescriptorFactory.HUE_RED) {
                m232342g();
            }
        }
    }

    /* renamed from: a */
    public void mo203892a(float f, float f2, float f3, float f4) {
        this.f149117d.mo203967a(f, f2, f3, f4);
    }
}
