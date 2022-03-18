package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import pl.droidsonroids.gif.AbstractC70158f;
import pl.droidsonroids.gif.C70155e;

public class GifTextureView extends TextureView {

    /* renamed from: d */
    private static final ImageView.ScaleType[] f175231d = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: a */
    public AbstractC70158f f175232a;

    /* renamed from: b */
    public float f175233b = 1.0f;

    /* renamed from: c */
    public C70155e.C70157b f175234c;

    /* renamed from: e */
    private ImageView.ScaleType f175235e = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: f */
    private final Matrix f175236f = new Matrix();

    /* renamed from: g */
    private TextureView$SurfaceTextureListenerC70143b f175237g;

    /* renamed from: pl.droidsonroids.gif.GifTextureView$a */
    public interface AbstractC70142a {
        /* renamed from: a */
        void mo247249a(Canvas canvas);
    }

    public TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return null;
    }

    public ImageView.ScaleType getScaleType() {
        return this.f175235e;
    }

    public IOException getIOException() {
        if (this.f175237g.f175241c != null) {
            return this.f175237g.f175241c;
        }
        return GifIOException.fromCode(this.f175237g.f175240b.mo247207f());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f175237g.mo247250a(this, null);
        super.onDetachedFromWindow();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public Parcelable onSaveInstanceState() {
        long[] jArr;
        TextureView$SurfaceTextureListenerC70143b bVar = this.f175237g;
        bVar.f175242d = bVar.f175240b.mo247217o();
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (this.f175234c.f175274c) {
            jArr = this.f175237g.f175242d;
        } else {
            jArr = null;
        }
        return new GifViewSavedState(onSaveInstanceState, jArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pl.droidsonroids.gif.GifTextureView$1 */
    public static /* synthetic */ class C701411 {

        /* renamed from: a */
        static final /* synthetic */ int[] f175238a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                pl.droidsonroids.gif.GifTextureView.C701411.f175238a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.C701411.f175238a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.C701411.f175238a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.C701411.f175238a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.C701411.f175238a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.C701411.f175238a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.C701411.f175238a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.C701411.f175238a     // Catch:{ NoSuchFieldError -> 0x0060 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.GifTextureView.C701411.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: pl.droidsonroids.gif.GifTextureView$b */
    public static class TextureView$SurfaceTextureListenerC70143b extends Thread implements TextureView.SurfaceTextureListener {

        /* renamed from: a */
        final C70148b f175239a = new C70148b();

        /* renamed from: b */
        public GifInfoHandle f175240b = new GifInfoHandle();

        /* renamed from: c */
        public IOException f175241c;

        /* renamed from: d */
        long[] f175242d;

        /* renamed from: e */
        private final WeakReference<GifTextureView> f175243e;

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void run() {
            try {
                GifTextureView gifTextureView = this.f175243e.get();
                if (gifTextureView != null) {
                    GifInfoHandle a = gifTextureView.f175232a.mo247311a();
                    this.f175240b = a;
                    a.mo247198a((char) 1, gifTextureView.isOpaque());
                    if (gifTextureView.f175234c.f175275d >= 0) {
                        this.f175240b.mo247200a(gifTextureView.f175234c.f175275d);
                    }
                    final GifTextureView gifTextureView2 = this.f175243e.get();
                    if (gifTextureView2 == null) {
                        this.f175240b.mo247197a();
                        return;
                    }
                    gifTextureView2.setSuperSurfaceTextureListener(this);
                    boolean isAvailable = gifTextureView2.isAvailable();
                    this.f175239a.mo247267a(isAvailable);
                    if (isAvailable) {
                        gifTextureView2.post(new Runnable() {
                            /* class pl.droidsonroids.gif.GifTextureView.TextureView$SurfaceTextureListenerC70143b.RunnableC701441 */

                            public void run() {
                                gifTextureView2.mo247230a(TextureView$SurfaceTextureListenerC70143b.this.f175240b);
                            }
                        });
                    }
                    this.f175240b.mo247199a(gifTextureView2.f175233b);
                    while (!isInterrupted()) {
                        try {
                            this.f175239a.mo247269c();
                            GifTextureView gifTextureView3 = this.f175243e.get();
                            if (gifTextureView3 == null) {
                                break;
                            }
                            SurfaceTexture surfaceTexture = gifTextureView3.getSurfaceTexture();
                            if (surfaceTexture != null) {
                                Surface surface = new Surface(surfaceTexture);
                                try {
                                    this.f175240b.mo247202a(surface, this.f175242d);
                                } finally {
                                    surface.release();
                                }
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    this.f175240b.mo247197a();
                    this.f175240b = new GifInfoHandle();
                }
            } catch (IOException e) {
                this.f175241c = e;
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f175239a.mo247268b();
            this.f175240b.mo247216n();
            interrupt();
            return true;
        }

        TextureView$SurfaceTextureListenerC70143b(GifTextureView gifTextureView) {
            super("GifRenderThread");
            this.f175243e = new WeakReference<>(gifTextureView);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo247250a(GifTextureView gifTextureView, AbstractC70142a aVar) {
            TextureView$SurfaceTextureListenerC70166j jVar;
            this.f175239a.mo247268b();
            if (aVar != null) {
                jVar = new TextureView$SurfaceTextureListenerC70166j(aVar);
            } else {
                jVar = null;
            }
            gifTextureView.setSuperSurfaceTextureListener(jVar);
            this.f175240b.mo247216n();
            interrupt();
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            GifTextureView gifTextureView = this.f175243e.get();
            if (gifTextureView != null) {
                gifTextureView.mo247230a(this.f175240b);
            }
            this.f175239a.mo247266a();
        }
    }

    public void setImageMatrix(Matrix matrix) {
        setTransform(matrix);
    }

    public void setSuperSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        super.setSurfaceTextureListener(surfaceTextureListener);
    }

    public void setFreezesAnimation(boolean z) {
        this.f175234c.f175274c = z;
    }

    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        throw new UnsupportedOperationException("Changing SurfaceTexture is not supported");
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Changing SurfaceTextureListener is not supported");
    }

    public Matrix getTransform(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        }
        matrix.set(this.f175236f);
        return matrix;
    }

    public synchronized void setInputSource(AbstractC70158f fVar) {
        mo247231a(fVar, null);
    }

    public void setOpaque(boolean z) {
        if (z != isOpaque()) {
            super.setOpaque(z);
            setInputSource(this.f175232a);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        this.f175235e = scaleType;
        mo247230a(this.f175237g.f175240b);
    }

    public void setSpeed(float f) {
        this.f175233b = f;
        this.f175237g.f175240b.mo247199a(f);
    }

    public void setTransform(Matrix matrix) {
        this.f175236f.set(matrix);
        mo247230a(this.f175237g.f175240b);
    }

    public GifTextureView(Context context) {
        super(context);
        m268914a(null, 0, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        this.f175237g.f175242d = gifViewSavedState.f175246a[0];
    }

    /* renamed from: a */
    private static AbstractC70158f m268913a(TypedArray typedArray) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(0, typedValue)) {
            return null;
        }
        if (typedValue.resourceId != 0) {
            String resourceTypeName = typedArray.getResources().getResourceTypeName(typedValue.resourceId);
            if (C70155e.f175271a.contains(resourceTypeName)) {
                return new AbstractC70158f.C70161b(typedArray.getResources(), typedValue.resourceId);
            }
            if (!"string".equals(resourceTypeName)) {
                throw new IllegalArgumentException("Expected string, drawable, mipmap or raw resource type. '" + resourceTypeName + "' is not supported");
            }
        }
        return new AbstractC70158f.C70160a(typedArray.getResources().getAssets(), typedValue.string.toString());
    }

    /* renamed from: a */
    public void mo247230a(GifInfoHandle gifInfoHandle) {
        Matrix matrix = new Matrix();
        float width = (float) getWidth();
        float height = (float) getHeight();
        float p = ((float) gifInfoHandle.mo247218p()) / width;
        float q = ((float) gifInfoHandle.mo247219q()) / height;
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) gifInfoHandle.mo247218p(), (float) gifInfoHandle.mo247219q());
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
        float f = 1.0f;
        switch (C701411.f175238a[this.f175235e.ordinal()]) {
            case 1:
                matrix.setScale(p, q, width / 2.0f, height / 2.0f);
                break;
            case 2:
                float min = 1.0f / Math.min(p, q);
                matrix.setScale(p * min, min * q, width / 2.0f, height / 2.0f);
                break;
            case 3:
                if (((float) gifInfoHandle.mo247218p()) > width || ((float) gifInfoHandle.mo247219q()) > height) {
                    f = Math.min(1.0f / p, 1.0f / q);
                }
                matrix.setScale(p * f, f * q, width / 2.0f, height / 2.0f);
                break;
            case 4:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                matrix.preScale(p, q);
                break;
            case 5:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                matrix.preScale(p, q);
                break;
            case 6:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                matrix.preScale(p, q);
                break;
            case 7:
                return;
            case 8:
                matrix.set(this.f175236f);
                matrix.preScale(p, q);
                break;
        }
        super.setTransform(matrix);
    }

    public GifTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m268914a(attributeSet, 0, 0);
    }

    /* renamed from: a */
    public synchronized void mo247231a(AbstractC70158f fVar, AbstractC70142a aVar) {
        this.f175237g.mo247250a(this, aVar);
        try {
            this.f175237g.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.f175232a = fVar;
        TextureView$SurfaceTextureListenerC70143b bVar = new TextureView$SurfaceTextureListenerC70143b(this);
        this.f175237g = bVar;
        if (fVar != null) {
            bVar.start();
        }
    }

    public GifTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m268914a(attributeSet, i, 0);
    }

    /* renamed from: a */
    private void m268914a(AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "scaleType", -1);
            if (attributeIntValue >= 0) {
                ImageView.ScaleType[] scaleTypeArr = f175231d;
                if (attributeIntValue < scaleTypeArr.length) {
                    this.f175235e = scaleTypeArr[attributeIntValue];
                }
            }
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.gifSource, R.attr.isOpaque}, i, i2);
            this.f175232a = m268913a(obtainStyledAttributes);
            super.setOpaque(obtainStyledAttributes.getBoolean(1, false));
            obtainStyledAttributes.recycle();
            this.f175234c = new C70155e.C70157b(this, attributeSet, i, i2);
        } else {
            super.setOpaque(false);
            this.f175234c = new C70155e.C70157b();
        }
        if (!isInEditMode()) {
            TextureView$SurfaceTextureListenerC70143b bVar = new TextureView$SurfaceTextureListenerC70143b(this);
            this.f175237g = bVar;
            if (this.f175232a != null) {
                bVar.start();
            }
        }
    }
}
