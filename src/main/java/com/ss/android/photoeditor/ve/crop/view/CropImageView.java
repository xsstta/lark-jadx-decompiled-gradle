package com.ss.android.photoeditor.ve.crop.view;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.ve.crop.p3015a.animationAnimation$AnimationListenerC59852b;
import com.ss.android.photoeditor.ve.crop.p3016b.AsyncTaskC59863a;
import com.ss.android.photoeditor.ve.crop.view.CropOverlayView;
import com.ss.android.photoeditor.ve.p3018e.C59898c;
import java.lang.ref.WeakReference;

public class CropImageView extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: A */
    private boolean f148960A;

    /* renamed from: B */
    private boolean f148961B;

    /* renamed from: C */
    private AbstractC59872d f148962C;

    /* renamed from: D */
    private AbstractC59873e f148963D;

    /* renamed from: E */
    private AbstractC59870b f148964E;

    /* renamed from: F */
    private Uri f148965F;

    /* renamed from: G */
    private int f148966G;

    /* renamed from: H */
    private float f148967H;

    /* renamed from: I */
    private float f148968I;

    /* renamed from: J */
    private float f148969J;

    /* renamed from: K */
    private RectF f148970K;

    /* renamed from: L */
    private int f148971L;

    /* renamed from: M */
    private boolean f148972M;

    /* renamed from: N */
    private WeakReference<AsyncTaskC59863a> f148973N;

    /* renamed from: O */
    private ScaleGestureDetector f148974O;

    /* renamed from: P */
    private WeakReference<Object> f148975P;

    /* renamed from: Q */
    private boolean f148976Q;

    /* renamed from: R */
    private float f148977R;

    /* renamed from: S */
    private float f148978S;

    /* renamed from: T */
    private int f148979T;

    /* renamed from: a */
    public final ImageView f148980a;

    /* renamed from: b */
    public final Matrix f148981b;

    /* renamed from: c */
    float f148982c;

    /* renamed from: d */
    public ImageView f148983d;

    /* renamed from: e */
    private final CropOverlayView f148984e;

    /* renamed from: f */
    private final Matrix f148985f;

    /* renamed from: g */
    private final ProgressBar f148986g;

    /* renamed from: h */
    private final float[] f148987h;

    /* renamed from: i */
    private final float[] f148988i;

    /* renamed from: j */
    private final Matrix f148989j;

    /* renamed from: k */
    private final RectF f148990k;

    /* renamed from: l */
    private animationAnimation$AnimationListenerC59852b f148991l;

    /* renamed from: m */
    private animationAnimation$AnimationListenerC59852b f148992m;

    /* renamed from: n */
    private float f148993n;

    /* renamed from: o */
    private float f148994o;

    /* renamed from: p */
    private Bitmap f148995p;

    /* renamed from: q */
    private AbstractC59871c f148996q;

    /* renamed from: r */
    private int f148997r;

    /* renamed from: s */
    private int f148998s;

    /* renamed from: t */
    private boolean f148999t;

    /* renamed from: u */
    private boolean f149000u;

    /* renamed from: v */
    private int f149001v;

    /* renamed from: w */
    private int f149002w;

    /* renamed from: x */
    private int f149003x;

    /* renamed from: y */
    private ScaleType f149004y;

    /* renamed from: z */
    private boolean f149005z;

    public enum CropShape {
        RECTANGLE,
        OVAL
    }

    public enum Guidelines {
        OFF,
        ON_TOUCH,
        ON
    }

    public enum RequestSizeOptions {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    public enum ScaleType {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    /* renamed from: com.ss.android.photoeditor.ve.crop.view.CropImageView$b */
    public interface AbstractC59870b {
    }

    /* renamed from: com.ss.android.photoeditor.ve.crop.view.CropImageView$c */
    public interface AbstractC59871c {
        /* renamed from: a */
        void mo203839a();

        /* renamed from: a */
        void mo203840a(boolean z);

        /* renamed from: b */
        void mo203841b();
    }

    /* renamed from: com.ss.android.photoeditor.ve.crop.view.CropImageView$d */
    public interface AbstractC59872d {
        /* renamed from: a */
        void mo203842a();
    }

    /* renamed from: com.ss.android.photoeditor.ve.crop.view.CropImageView$e */
    public interface AbstractC59873e {
        /* renamed from: a */
        void mo203843a(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* renamed from: com.ss.android.photoeditor.ve.crop.view.CropImageView$a */
    public static class C59869a {

        /* renamed from: a */
        private final Bitmap f149008a;

        /* renamed from: b */
        private final Uri f149009b;

        /* renamed from: c */
        private final Bitmap f149010c;

        /* renamed from: d */
        private final Uri f149011d;

        /* renamed from: e */
        private final Exception f149012e;

        /* renamed from: f */
        private final float[] f149013f;

        /* renamed from: g */
        private final Rect f149014g;

        /* renamed from: h */
        private final Rect f149015h;

        /* renamed from: i */
        private final int f149016i;

        /* renamed from: j */
        private final int f149017j;

        /* renamed from: a */
        public Uri mo203831a() {
            return this.f149009b;
        }

        /* renamed from: b */
        public Uri mo203832b() {
            return this.f149011d;
        }

        /* renamed from: c */
        public Exception mo203833c() {
            return this.f149012e;
        }

        /* renamed from: d */
        public float[] mo203834d() {
            return this.f149013f;
        }

        /* renamed from: e */
        public Rect mo203835e() {
            return this.f149014g;
        }

        /* renamed from: f */
        public Rect mo203836f() {
            return this.f149015h;
        }

        /* renamed from: g */
        public int mo203837g() {
            return this.f149016i;
        }

        /* renamed from: h */
        public int mo203838h() {
            return this.f149017j;
        }

        C59869a(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i, int i2) {
            this.f149008a = bitmap;
            this.f149009b = uri;
            this.f149010c = bitmap2;
            this.f149011d = uri2;
            this.f149012e = exc;
            this.f149013f = fArr;
            this.f149014g = rect;
            this.f149015h = rect2;
            this.f149016i = i;
            this.f149017j = i2;
        }
    }

    public Uri getImageUri() {
        return this.f148965F;
    }

    public int getRotatedDegrees() {
        return this.f148998s;
    }

    public ScaleType getScaleType() {
        return this.f149004y;
    }

    /* renamed from: b */
    public void mo203800b() {
        AbstractC59871c cVar = this.f148996q;
        if (cVar != null) {
            cVar.mo203839a();
        }
    }

    /* renamed from: c */
    public void mo203802c() {
        AbstractC59871c cVar = this.f148996q;
        if (cVar != null) {
            cVar.mo203841b();
        }
    }

    public RectF getCropOverlayRect() {
        return this.f148984e.getCropWindowRect();
    }

    private float getFrameCenterX() {
        return ((float) CropOverlayView.f149020c) + (getMaxFrameWidth() / 2.0f);
    }

    private float getFrameCenterY() {
        return ((float) CropOverlayView.f149018a) + (getMaxFrameHeight() / 2.0f);
    }

    private float getMaxFrameHeight() {
        return (float) ((getHeight() - CropOverlayView.f149018a) - CropOverlayView.f149019b);
    }

    private float getMaxFrameWidth() {
        return (float) (getWidth() - (CropOverlayView.f149020c * 2));
    }

    /* renamed from: f */
    private void m232249f() {
        int i;
        CropOverlayView cropOverlayView = this.f148984e;
        if (cropOverlayView != null) {
            if (!this.f149005z || this.f148995p == null) {
                i = 4;
            } else {
                i = 0;
            }
            cropOverlayView.setVisibility(i);
        }
    }

    /* renamed from: g */
    private void m232250g() {
        boolean z;
        int i = 0;
        if (!this.f148960A || ((this.f148995p != null || this.f148973N == null) && this.f148975P == null)) {
            z = false;
        } else {
            z = true;
        }
        ProgressBar progressBar = this.f148986g;
        if (!z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    private float getImageViewScale() {
        float f;
        float[] fArr = new float[9];
        this.f148981b.getValues(fArr);
        if (fArr[0] == BitmapDescriptorFactory.HUE_RED) {
            f = fArr[1];
        } else {
            f = fArr[0];
        }
        return Math.abs(f);
    }

    private float getMaxFrameRatio() {
        return ((float) ((getHeight() - CropOverlayView.f149018a) - CropOverlayView.f149019b)) / ((float) (getWidth() - (CropOverlayView.f149020c * 2)));
    }

    public RectF getImageRect() {
        float[] fArr = this.f148987h;
        RectF rectF = new RectF();
        rectF.top = C59898c.m232459b(fArr);
        rectF.bottom = C59898c.m232461d(fArr);
        rectF.left = C59898c.m232448a(fArr);
        rectF.right = C59898c.m232460c(fArr);
        return rectF;
    }

    public Rect getWholeImageRect() {
        int i = this.f148966G;
        Bitmap bitmap = this.f148995p;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i, bitmap.getHeight() * i);
    }

    /* renamed from: e */
    private void m232248e() {
        Bitmap bitmap = this.f148995p;
        if (bitmap != null && (this.f149003x > 0 || this.f148965F != null)) {
            bitmap.recycle();
        }
        this.f148995p = null;
        this.f149003x = 0;
        this.f148965F = null;
        this.f148966G = 1;
        this.f148998s = 0;
        this.f148967H = 1.0f;
        this.f148968I = BitmapDescriptorFactory.HUE_RED;
        this.f148969J = BitmapDescriptorFactory.HUE_RED;
        this.f148981b.reset();
        this.f148980a.setImageBitmap(null);
        m232249f();
    }

    public Rect getCropRect() {
        int i = this.f148966G;
        Bitmap bitmap = this.f148995p;
        if (bitmap == null) {
            return null;
        }
        return C59898c.m232455a(getCropPoints(), bitmap.getWidth() * i, i * bitmap.getHeight(), this.f148984e.mo203850c(), this.f148984e.getAspectRatioX(), this.f148984e.getAspectRatioY());
    }

    /* renamed from: h */
    private void m232251h() {
        if (this.f148992m == null) {
            this.f148992m = new animationAnimation$AnimationListenerC59852b(this.f148980a, null, this);
        }
        this.f148992m.mo203752a(this.f148987h, this.f148981b);
        this.f148992m.mo203751a(!this.f148984e.mo203852e());
        m232247d();
        mo203798a(false);
        this.f148992m.mo203754b(this.f148987h, this.f148981b);
        this.f148992m.setInterpolator(PathInterpolatorCompat.create(0.32f, 0.94f, 0.6f, 1.0f));
        this.f148980a.startAnimation(this.f148992m);
    }

    /* renamed from: a */
    public void mo203796a() {
        Bitmap bitmap = this.f148995p;
        if (bitmap != null && !bitmap.isRecycled()) {
            float[] fArr = this.f148987h;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = (float) this.f148995p.getWidth();
            float[] fArr2 = this.f148987h;
            fArr2[3] = 0.0f;
            fArr2[4] = (float) this.f148995p.getWidth();
            this.f148987h[5] = (float) this.f148995p.getHeight();
            float[] fArr3 = this.f148987h;
            fArr3[6] = 0.0f;
            fArr3[7] = (float) this.f148995p.getHeight();
            this.f148981b.mapPoints(this.f148987h);
            float[] fArr4 = this.f148988i;
            fArr4[0] = 0.0f;
            fArr4[1] = 0.0f;
            fArr4[2] = 100.0f;
            fArr4[3] = 0.0f;
            fArr4[4] = 100.0f;
            fArr4[5] = 100.0f;
            fArr4[6] = 0.0f;
            fArr4[7] = 100.0f;
            this.f148981b.mapPoints(fArr4);
        }
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f148984e.getCropWindowRect();
        float[] fArr = {cropWindowRect.left, cropWindowRect.top, cropWindowRect.right, cropWindowRect.top, cropWindowRect.right, cropWindowRect.bottom, cropWindowRect.left, cropWindowRect.bottom};
        this.f148981b.invert(this.f148985f);
        this.f148985f.mapPoints(fArr);
        for (int i = 0; i < 8; i++) {
            fArr[i] = fArr[i] * ((float) this.f148966G);
        }
        return fArr;
    }

    /* renamed from: d */
    private void m232247d() {
        float f;
        float f2;
        RectF cropWindowRect = this.f148984e.getCropWindowRect();
        float max = Math.max(cropWindowRect.width() / C59898c.m232462e(this.f148987h), cropWindowRect.height() / C59898c.m232463f(this.f148987h));
        if (max > 1.0f) {
            this.f148981b.postScale(max, max, C59898c.m232464g(this.f148987h), C59898c.m232465h(this.f148987h));
            mo203796a();
        }
        float b = C59898c.m232459b(this.f148987h);
        float c = C59898c.m232460c(this.f148987h);
        float d = C59898c.m232461d(this.f148987h);
        float a = C59898c.m232448a(this.f148987h);
        if (cropWindowRect.top < b) {
            f = cropWindowRect.top - b;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (cropWindowRect.left < a) {
            f2 = cropWindowRect.left - a;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (cropWindowRect.right > c) {
            f2 = cropWindowRect.right - c;
        }
        if (cropWindowRect.bottom > d) {
            f = cropWindowRect.bottom - d;
        }
        if (f2 == BitmapDescriptorFactory.HUE_RED && f == BitmapDescriptorFactory.HUE_RED) {
            mo203802c();
            return;
        }
        this.f148981b.postTranslate(f2, f);
        mo203796a();
    }

    public void setOnCropImageCompleteListener(AbstractC59870b bVar) {
        this.f148964E = bVar;
    }

    public void setOnCropingListener(AbstractC59871c cVar) {
        this.f148996q = cVar;
    }

    public void setOnSetImageUriCompleteListener(AbstractC59873e eVar) {
        this.f148963D = eVar;
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f148982c = getImageViewScale();
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        mo203801b(true);
    }

    public void setCropOverlayViewEnabled(boolean z) {
        this.f148984e.setEnabled(z);
    }

    public void setFixedAspectRatio(boolean z) {
        this.f148984e.setFixedAspectRatio(z);
    }

    /* renamed from: b */
    public void mo203801b(boolean z) {
        AbstractC59871c cVar = this.f148996q;
        if (cVar != null) {
            cVar.mo203840a(z);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f148976Q) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setMaxScale(float f) {
        this.f148994o = f * getImageViewScale();
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType != this.f149004y) {
            this.f149004y = scaleType;
            this.f148967H = 1.0f;
            this.f148969J = BitmapDescriptorFactory.HUE_RED;
            this.f148968I = BitmapDescriptorFactory.HUE_RED;
            this.f148984e.mo203848b();
            requestLayout();
        }
    }

    public void setImageUriAsync(Uri uri) {
        AsyncTaskC59863a aVar;
        if (uri != null) {
            WeakReference<AsyncTaskC59863a> weakReference = this.f148973N;
            if (weakReference != null) {
                aVar = weakReference.get();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.cancel(true);
            }
            m232248e();
            this.f148970K = null;
            this.f148971L = 0;
            this.f148984e.setInitialCropWindowRect(null);
            WeakReference<AsyncTaskC59863a> weakReference2 = new WeakReference<>(new AsyncTaskC59863a(this, uri));
            this.f148973N = weakReference2;
            weakReference2.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m232250g();
        }
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float imageViewScale = getImageViewScale();
        float f = this.f148982c * scaleFactor;
        if ((f > this.f148994o || f < this.f148993n) && ((f >= this.f148993n || f <= getImageViewScale()) && (f <= this.f148994o || f >= getImageViewScale()))) {
            return false;
        }
        float f2 = f / imageViewScale;
        this.f148981b.postScale(f2, f2, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        mo203796a();
        this.f148980a.setImageMatrix(this.f148981b);
        return false;
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            float min = Math.min(getMaxFrameWidth() / ((float) bitmap.getWidth()), getMaxFrameHeight() / ((float) bitmap.getHeight()));
            float width = 24.0f / (((float) bitmap.getWidth()) * min);
            float height = 24.0f / (((float) bitmap.getHeight()) * min);
            this.f148993n = Math.max(width, height);
            this.f148994o = Math.min(1.0f / width, 1.0f / height);
            m232248e();
            this.f148970K = null;
            this.f148971L = 0;
            this.f148984e.setInitialCropWindowRect(null);
            m232245a(bitmap, 0, null, 1, 0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f148976Q) {
            return true;
        }
        if (motionEvent.getPointerCount() < 2 || !this.f148974O.onTouchEvent(motionEvent)) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            this.f148977R = motionEvent.getX();
                            this.f148978S = motionEvent.getY();
                            return false;
                        }
                    } else if (motionEvent.getPointerId(0) != this.f148979T) {
                        return false;
                    } else {
                        m232246b(motionEvent.getX(), motionEvent.getY());
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
                this.f148984e.mo203849b(true);
                this.f148984e.setGuidelines(Guidelines.OFF);
                this.f148977R = motionEvent.getX();
                this.f148978S = motionEvent.getY();
                m232251h();
                return true;
            }
            this.f148984e.mo203849b(false);
            this.f148984e.setGuidelines(Guidelines.ON);
            this.f148984e.mo203851d();
            this.f148979T = motionEvent.getPointerId(0);
            m232242a(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        this.f148977R = motionEvent.getX();
        this.f148978S = motionEvent.getY();
        return true;
    }

    /* renamed from: a */
    public void mo203797a(AsyncTaskC59863a.C59864a aVar) {
        this.f148973N = null;
        m232250g();
        if (aVar.f148911e == null) {
            this.f148997r = aVar.f148910d;
            m232245a(aVar.f148908b, 0, aVar.f148907a, aVar.f148909c, aVar.f148910d);
        }
        AbstractC59873e eVar = this.f148963D;
        if (eVar != null) {
            eVar.mo203843a(this, aVar.f148907a, aVar.f148911e);
        }
    }

    /* renamed from: a */
    public void mo203798a(boolean z) {
        float[] fArr;
        if (this.f148995p != null && !z) {
            this.f148984e.mo203845a((float) getWidth(), (float) getHeight(), (((float) this.f148966G) * 100.0f) / C59898c.m232462e(this.f148988i), (((float) this.f148966G) * 100.0f) / C59898c.m232463f(this.f148988i));
        }
        CropOverlayView cropOverlayView = this.f148984e;
        if (z) {
            fArr = null;
        } else {
            fArr = this.f148987h;
        }
        cropOverlayView.mo203846a(fArr, getWidth(), getHeight());
    }

    /* renamed from: a */
    private void m232242a(float f, float f2) {
        this.f148977R = f;
        this.f148978S = f2;
        mo203800b();
    }

    /* renamed from: a */
    public static Bundle m232241a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }

    /* renamed from: b */
    private void m232246b(float f, float f2) {
        this.f148981b.postTranslate(f - this.f148977R, f2 - this.f148978S);
        this.f148980a.setImageMatrix(this.f148981b);
        mo203796a();
        mo203798a(false);
        this.f148977R = f;
        this.f148978S = f2;
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intent intent;
        Bundle a;
        this.f148981b = new Matrix();
        this.f148985f = new Matrix();
        this.f148987h = new float[8];
        this.f148988i = new float[8];
        this.f148989j = new Matrix();
        this.f148990k = new RectF();
        this.f148993n = 0.1f;
        this.f148994o = 10.0f;
        this.f149005z = true;
        this.f148960A = true;
        this.f148961B = true;
        this.f148966G = 1;
        this.f148967H = 1.0f;
        this.f148976Q = true;
        this.f148974O = new ScaleGestureDetector(getContext(), this);
        CropImageOptions cropImageOptions = null;
        if (context instanceof Activity) {
            intent = ((Activity) context).getIntent();
        } else {
            intent = null;
        }
        if (!(intent == null || (a = m232241a(intent, "CROP_IMAGE_EXTRA_BUNDLE")) == null)) {
            cropImageOptions = (CropImageOptions) a.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        }
        cropImageOptions = cropImageOptions == null ? new CropImageOptions() : cropImageOptions;
        cropImageOptions.mo203789a();
        this.f149004y = cropImageOptions.f148938e;
        this.f148961B = cropImageOptions.f148941h;
        this.f149005z = cropImageOptions.f148939f;
        this.f148960A = cropImageOptions.f148940g;
        this.f148999t = false;
        this.f149000u = cropImageOptions.f148931T;
        View inflate = LayoutInflater.from(context).inflate(R.layout.crop_image_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.ImageView_image);
        this.f148980a = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        this.f148983d = (ImageView) inflate.findViewById(R.id.default_view);
        CropOverlayView cropOverlayView = (CropOverlayView) inflate.findViewById(R.id.CropOverlayView);
        this.f148984e = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(new CropOverlayView.AbstractC59877c() {
            /* class com.ss.android.photoeditor.ve.crop.view.CropImageView.C598671 */

            @Override // com.ss.android.photoeditor.ve.crop.view.CropOverlayView.AbstractC59877c
            /* renamed from: a */
            public void mo203828a() {
                CropImageView.this.mo203800b();
            }

            @Override // com.ss.android.photoeditor.ve.crop.view.CropOverlayView.AbstractC59877c
            /* renamed from: a */
            public void mo203829a(boolean z) {
                if (!z) {
                    CropImageView.this.mo203801b(true);
                }
                CropImageView.this.mo203799a(z, true);
            }
        });
        cropOverlayView.setActionChangeListener(new CropOverlayView.AbstractC59875a() {
            /* class com.ss.android.photoeditor.ve.crop.view.CropImageView.C598682 */

            @Override // com.ss.android.photoeditor.ve.crop.view.CropOverlayView.AbstractC59875a
            /* renamed from: a */
            public void mo203830a(boolean z) {
                if (z) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(CropImageView.this.f148983d, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
                    ofFloat.setDuration(200L).setStartDelay(300);
                    ofFloat.start();
                    return;
                }
                ObjectAnimator.ofFloat(CropImageView.this.f148983d, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(200L).start();
            }
        });
        cropOverlayView.setInitialAttributeValues(cropImageOptions);
        this.f148986g = (ProgressBar) inflate.findViewById(R.id.CropProgressBar);
        m232250g();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        double d;
        double d2;
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        Bitmap bitmap = this.f148995p;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            if (size < this.f148995p.getWidth()) {
                d = ((double) size) / ((double) this.f148995p.getWidth());
            } else {
                d = Double.POSITIVE_INFINITY;
            }
            if (size2 < this.f148995p.getHeight()) {
                d2 = ((double) size2) / ((double) this.f148995p.getHeight());
            } else {
                d2 = Double.POSITIVE_INFINITY;
            }
            if (d == Double.POSITIVE_INFINITY && d2 == Double.POSITIVE_INFINITY) {
                i4 = this.f148995p.getWidth();
                i3 = this.f148995p.getHeight();
            } else if (d <= d2) {
                i3 = (int) (((double) this.f148995p.getHeight()) * d);
                i4 = size;
            } else {
                i4 = (int) (((double) this.f148995p.getWidth()) * d2);
                i3 = size2;
            }
            int a = m232240a(mode, size, i4);
            int a2 = m232240a(mode2, size2, i3);
            this.f149001v = a;
            this.f149002w = a2;
            setMeasuredDimension(a, a2);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: a */
    public void mo203799a(boolean z, boolean z2) {
        int width = getWidth();
        int height = getHeight();
        if (this.f148995p != null && width > 0 && height > 0) {
            RectF cropWindowRect = this.f148984e.getCropWindowRect();
            boolean z3 = false;
            if (z) {
                if (cropWindowRect.left < BitmapDescriptorFactory.HUE_RED || cropWindowRect.top < BitmapDescriptorFactory.HUE_RED || cropWindowRect.right > ((float) width) || cropWindowRect.bottom > ((float) height)) {
                    m232243a((float) width, (float) height, false);
                }
            } else if (this.f148961B) {
                float min = Math.min(getMaxFrameWidth() / cropWindowRect.width(), getMaxFrameHeight() / cropWindowRect.height());
                if (getFrameCenterX() == cropWindowRect.centerX() && getFrameCenterY() == cropWindowRect.centerY()) {
                    z3 = true;
                }
                if (min <= BitmapDescriptorFactory.HUE_RED || z3) {
                    mo203802c();
                } else {
                    if (z2) {
                        if (this.f148991l == null) {
                            this.f148991l = new animationAnimation$AnimationListenerC59852b(this.f148980a, this.f148984e, this);
                        }
                        this.f148991l.mo203752a(this.f148987h, this.f148981b);
                    }
                    this.f148967H = min;
                    m232243a((float) width, (float) height, z2);
                }
            }
            AbstractC59872d dVar = this.f148962C;
            if (dVar != null && !z) {
                dVar.mo203842a();
            }
        }
    }

    /* renamed from: a */
    private static int m232240a(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        if (i == Integer.MIN_VALUE) {
            return Math.min(i3, i2);
        }
        return i3;
    }

    /* renamed from: a */
    private void m232243a(float f, float f2, boolean z) {
        if (this.f148995p != null && f > BitmapDescriptorFactory.HUE_RED && f2 > BitmapDescriptorFactory.HUE_RED) {
            RectF cropWindowRect = this.f148984e.getCropWindowRect();
            float f3 = this.f148967H;
            this.f148981b.postScale(f3, f3, cropWindowRect.centerX(), cropWindowRect.centerY());
            mo203796a();
            Matrix matrix = new Matrix();
            matrix.postScale(f3, f3, cropWindowRect.centerX(), cropWindowRect.centerY());
            matrix.mapRect(cropWindowRect);
            this.f148968I = getFrameCenterX() - cropWindowRect.centerX();
            float frameCenterY = getFrameCenterY() - cropWindowRect.centerY();
            this.f148969J = frameCenterY;
            this.f148981b.postTranslate(this.f148968I, frameCenterY);
            cropWindowRect.offset(this.f148968I, this.f148969J);
            this.f148984e.setCropWindowRect(cropWindowRect);
            mo203796a();
            this.f148984e.invalidate();
            if (z) {
                this.f148991l.mo203754b(this.f148987h, this.f148981b);
                this.f148980a.startAnimation(this.f148991l);
            } else {
                this.f148980a.setImageMatrix(this.f148981b);
                mo203802c();
            }
            mo203798a(false);
        }
    }

    /* renamed from: a */
    private void m232244a(float f, float f2, int[] iArr) {
        if (this.f148995p != null && f > BitmapDescriptorFactory.HUE_RED && f2 > BitmapDescriptorFactory.HUE_RED) {
            RectF rectF = new RectF();
            rectF.left = BitmapDescriptorFactory.HUE_RED;
            rectF.right = (float) this.f148995p.getWidth();
            rectF.top = BitmapDescriptorFactory.HUE_RED;
            rectF.bottom = (float) this.f148995p.getHeight();
            if (iArr != null && iArr.length >= 2 && iArr[0] > 0 && iArr[1] > 0) {
                if (((float) iArr[0]) * rectF.height() > ((float) iArr[1]) * rectF.width()) {
                    rectF.right = (((float) iArr[0]) * rectF.height()) / ((float) iArr[1]);
                } else {
                    rectF.bottom = (((float) iArr[1]) * rectF.width()) / ((float) iArr[0]);
                }
            }
            this.f148981b.reset();
            this.f148981b.postTranslate((f - ((float) this.f148995p.getWidth())) / 2.0f, (((f2 - ((float) this.f148995p.getHeight())) - ((float) CropOverlayView.f149019b)) + ((float) CropOverlayView.f149018a)) / 2.0f);
            mo203796a();
            float min = Math.min(getMaxFrameWidth() / C59898c.m232462e(this.f148987h), getMaxFrameHeight() / C59898c.m232463f(this.f148987h));
            if (this.f149004y == ScaleType.FIT_CENTER || ((this.f149004y == ScaleType.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.f148961B))) {
                this.f148981b.postScale(min, min, C59898c.m232464g(this.f148987h), C59898c.m232465h(this.f148987h));
                mo203796a();
            }
            mo203796a();
            this.f148981b.mapRect(rectF);
            this.f148984e.setCropWindowRect(rectF);
            this.f148984e.invalidate();
            this.f148980a.setImageMatrix(this.f148981b);
            this.f148989j.set(this.f148981b);
            this.f148990k.set(rectF);
            mo203798a(false);
            mo203801b(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 <= 0 || i4 <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f148972M = z;
    }

    /* renamed from: a */
    private void m232245a(Bitmap bitmap, int i, Uri uri, int i2, int i3) {
        Bitmap bitmap2 = this.f148995p;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.f148980a.clearAnimation();
            m232248e();
            this.f148995p = bitmap;
            this.f148980a.setImageBitmap(bitmap);
            this.f148965F = uri;
            this.f149003x = i;
            this.f148966G = i2;
            this.f148998s = i3;
            m232244a((float) getWidth(), (float) getHeight(), (int[]) null);
            CropOverlayView cropOverlayView = this.f148984e;
            if (cropOverlayView != null) {
                cropOverlayView.mo203848b();
                m232249f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f149001v <= 0 || this.f149002w <= 0) {
            mo203798a(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f149001v;
        layoutParams.height = this.f149002w;
        setLayoutParams(layoutParams);
        if (this.f148995p != null) {
            RectF rectF = this.f148970K;
            if (rectF != null) {
                int i5 = this.f148971L;
                if (i5 != this.f148997r) {
                    this.f148998s = i5;
                }
                this.f148981b.mapRect(rectF);
                this.f148984e.setCropWindowRect(this.f148970K);
                mo203799a(false, false);
                this.f148984e.mo203844a();
                this.f148970K = null;
            } else if (this.f148972M) {
                this.f148972M = false;
                mo203799a(false, false);
            }
        } else {
            mo203798a(true);
        }
    }
}
