package com.davemorrissey.labs.subscaleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SubsamplingScaleImageView extends View {
    public static final String TAG = "SubsamplingScaleImageView";
    public static final List<Integer> VALID_EASING_STYLES = Arrays.asList(2, 1);
    private static final List<Integer> VALID_ORIENTATIONS = Arrays.asList(0, 90, 180, 270, -1);
    private static final List<Integer> VALID_PAN_LIMITS = Arrays.asList(1, 2, 3);
    private static final List<Integer> VALID_SCALE_TYPES = Arrays.asList(2, 1, 3, 4);
    private static final List<Integer> VALID_ZOOM_STYLES = Arrays.asList(1, 2, 3);
    private static Bitmap.Config preferredBitmapConfig;
    public Anim anim;
    private Bitmap bitmap;
    private DecoderFactory<? extends ImageDecoder> bitmapDecoderFactory;
    private boolean bitmapIsCached;
    private boolean bitmapIsPreview;
    private Paint bitmapPaint;
    private boolean debug;
    private Paint debugLinePaint;
    private Paint debugTextPaint;
    private ImageRegionDecoder decoder;
    public final ReadWriteLock decoderLock;
    private final float density;
    private GestureDetector detector;
    private int doubleTapZoomDuration;
    private float doubleTapZoomScale;
    private int doubleTapZoomStyle;
    private final float[] dstArray;
    private boolean eagerLoadingEnabled;
    private Executor executor;
    private int fullImageSampleSize;
    private final Handler handler;
    private boolean imageLoadedSent;
    private boolean isPanning;
    public boolean isQuickScaling;
    public boolean isZooming;
    private Matrix matrix;
    private float maxScale;
    private int maxTileHeight;
    private int maxTileWidth;
    public int maxTouchCount;
    private float minScale;
    private int minimumScaleType;
    private int minimumTileDpi;
    public OnImageEventListener onImageEventListener;
    public View.OnLongClickListener onLongClickListener;
    private OnStateChangedListener onStateChangedListener;
    private int orientation;
    private Rect pRegion;
    public boolean panEnabled;
    private int panLimit;
    private Float pendingScale;
    public boolean quickScaleEnabled;
    public float quickScaleLastDistance;
    public boolean quickScaleMoved;
    public PointF quickScaleSCenter;
    private final float quickScaleThreshold;
    public PointF quickScaleVLastPoint;
    public PointF quickScaleVStart;
    public boolean readySent;
    private DecoderFactory<? extends ImageRegionDecoder> regionDecoderFactory;
    private int sHeight;
    private int sOrientation;
    private PointF sPendingCenter;
    private RectF sRect;
    public Rect sRegion;
    private PointF sRequestedCenter;
    private int sWidth;
    private ScaleAndTranslate satTemp;
    public float scale;
    public float scaleStart;
    private GestureDetector singleDetector;
    private final float[] srcArray;
    private Paint tileBgPaint;
    private Map<Integer, List<Tile>> tileMap;
    private Uri uri;
    public PointF vCenterStart;
    private float vDistStart;
    public PointF vTranslate;
    private PointF vTranslateBefore;
    public PointF vTranslateStart;
    public boolean zoomEnabled;

    public static class DefaultOnAnimationEventListener implements OnAnimationEventListener {
        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
        public void onComplete() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
        public void onInterruptedByNewAnim() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
        public void onInterruptedByUser() {
        }
    }

    public static class DefaultOnImageEventListener implements OnImageEventListener {
        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoadError(Exception exc) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoaded() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewLoadError(Exception exc) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewReleased() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onReady() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onTileLoadError(Exception exc) {
        }
    }

    public static class DefaultOnStateChangedListener implements OnStateChangedListener {
        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onCenterChanged(PointF pointF, int i) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onScaleChanged(float f, int i) {
        }
    }

    public interface OnAnimationEventListener {
        void onComplete();

        void onInterruptedByNewAnim();

        void onInterruptedByUser();
    }

    public interface OnImageEventListener {
        void onImageLoadError(Exception exc);

        void onImageLoaded();

        void onPreviewLoadError(Exception exc);

        void onPreviewReleased();

        void onReady();

        void onTileLoadError(Exception exc);
    }

    public interface OnStateChangedListener {
        void onCenterChanged(PointF pointF, int i);

        void onScaleChanged(float f, int i);
    }

    private float easeInOutQuad(long j, float f, float f2, long j2) {
        float f3;
        float f4 = ((float) j) / (((float) j2) / 2.0f);
        if (f4 < 1.0f) {
            f3 = (f2 / 2.0f) * f4;
        } else {
            float f5 = f4 - 1.0f;
            f3 = (-f2) / 2.0f;
            f4 = (f5 * (f5 - 2.0f)) - 1.0f;
        }
        return (f3 * f4) + f;
    }

    private float easeOutQuad(long j, float f, float f2, long j2) {
        float f3 = ((float) j) / ((float) j2);
        return ((-f2) * f3 * (f3 - 2.0f)) + f;
    }

    /* access modifiers changed from: protected */
    public void onImageLoaded() {
    }

    /* access modifiers changed from: protected */
    public void onReady() {
    }

    /* access modifiers changed from: private */
    public static class Tile {
        public Bitmap bitmap;
        public Rect fileSRect;
        public boolean loading;
        public Rect sRect;
        public int sampleSize;
        public Rect vRect;
        public boolean visible;

        private Tile() {
        }
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return preferredBitmapConfig;
    }

    public float getMaxScale() {
        return this.maxScale;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getSHeight() {
        return this.sHeight;
    }

    public final int getSWidth() {
        return this.sWidth;
    }

    public final float getScale() {
        return this.scale;
    }

    public final boolean isImageLoaded() {
        return this.imageLoadedSent;
    }

    public final boolean isPanEnabled() {
        return this.panEnabled;
    }

    public final boolean isQuickScaleEnabled() {
        return this.quickScaleEnabled;
    }

    public final boolean isReady() {
        return this.readySent;
    }

    public final boolean isZoomEnabled() {
        return this.zoomEnabled;
    }

    private int getRequiredRotation() {
        int i = this.orientation;
        if (i == -1) {
            return this.sOrientation;
        }
        return i;
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final float getMinScale() {
        return minScale();
    }

    public boolean hasImage() {
        if (this.uri == null && this.bitmap == null) {
            return false;
        }
        return true;
    }

    public void recycle() {
        reset(true);
        this.bitmapPaint = null;
        this.debugTextPaint = null;
        this.debugLinePaint = null;
        this.tileBgPaint = null;
    }

    /* access modifiers changed from: private */
    public static class Anim {
        public long duration;
        public int easing;
        public boolean interruptible;
        public OnAnimationEventListener listener;
        public int origin;
        public PointF sCenterEnd;
        public PointF sCenterEndRequested;
        public PointF sCenterStart;
        public float scaleEnd;
        public float scaleStart;
        public long time;
        public PointF vFocusEnd;
        public PointF vFocusStart;

        private Anim() {
            this.duration = 500;
            this.interruptible = true;
            this.easing = 2;
            this.origin = 1;
            this.time = System.currentTimeMillis();
        }
    }

    private boolean checkImageLoaded() {
        boolean isBaseLayerReady = isBaseLayerReady();
        if (!this.imageLoadedSent && isBaseLayerReady) {
            preDraw();
            this.imageLoadedSent = true;
            onImageLoaded();
            OnImageEventListener onImageEventListener2 = this.onImageEventListener;
            if (onImageEventListener2 != null) {
                onImageEventListener2.onImageLoaded();
            }
        }
        return isBaseLayerReady;
    }

    private int sHeight() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation == 90 || requiredRotation == 270) {
            return this.sWidth;
        }
        return this.sHeight;
    }

    private int sWidth() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation == 90 || requiredRotation == 270) {
            return this.sHeight;
        }
        return this.sWidth;
    }

    public final PointF getCenter() {
        return viewToSourceCoord((float) (getWidth() / 2), (float) (getHeight() / 2));
    }

    public final ImageViewState getState() {
        if (this.vTranslate == null || this.sWidth <= 0 || this.sHeight <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    private boolean checkReady() {
        boolean z;
        if (getWidth() <= 0 || getHeight() <= 0 || this.sWidth <= 0 || this.sHeight <= 0 || (this.bitmap == null && !isBaseLayerReady())) {
            z = false;
        } else {
            z = true;
        }
        if (!this.readySent && z) {
            preDraw();
            this.readySent = true;
            onReady();
            OnImageEventListener onImageEventListener2 = this.onImageEventListener;
            if (onImageEventListener2 != null) {
                onImageEventListener2.onReady();
            }
        }
        return z;
    }

    public synchronized void onTileLoaded() {
        Bitmap bitmap2;
        debug("onTileLoaded", new Object[0]);
        checkReady();
        checkImageLoaded();
        if (isBaseLayerReady() && (bitmap2 = this.bitmap) != null) {
            if (!this.bitmapIsCached) {
                bitmap2.recycle();
            }
            this.bitmap = null;
            OnImageEventListener onImageEventListener2 = this.onImageEventListener;
            if (onImageEventListener2 != null && this.bitmapIsCached) {
                onImageEventListener2.onPreviewReleased();
            }
            this.bitmapIsPreview = false;
            this.bitmapIsCached = false;
        }
        invalidate();
    }

    public final void resetScaleAndCenter() {
        this.anim = null;
        this.pendingScale = Float.valueOf(limitedScale(BitmapDescriptorFactory.HUE_RED));
        if (isReady()) {
            this.sPendingCenter = new PointF((float) (sWidth() / 2), (float) (sHeight() / 2));
        } else {
            this.sPendingCenter = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        invalidate();
    }

    private void createPaints() {
        if (this.bitmapPaint == null) {
            Paint paint = new Paint();
            this.bitmapPaint = paint;
            paint.setAntiAlias(true);
            this.bitmapPaint.setFilterBitmap(true);
            this.bitmapPaint.setDither(true);
        }
        if ((this.debugTextPaint == null || this.debugLinePaint == null) && this.debug) {
            Paint paint2 = new Paint();
            this.debugTextPaint = paint2;
            paint2.setTextSize((float) px(12));
            this.debugTextPaint.setColor(-65281);
            this.debugTextPaint.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.debugLinePaint = paint3;
            paint3.setColor(-65281);
            this.debugLinePaint.setStyle(Paint.Style.STROKE);
            this.debugLinePaint.setStrokeWidth((float) px(1));
        }
    }

    private boolean isBaseLayerReady() {
        boolean z = true;
        if (!(this.bitmap == null || this.bitmapIsPreview)) {
            return true;
        }
        Map<Integer, List<Tile>> map = this.tileMap;
        if (map == null) {
            return false;
        }
        for (Map.Entry<Integer, List<Tile>> entry : map.entrySet()) {
            if (entry.getKey().intValue() == this.fullImageSampleSize) {
                for (Tile tile : entry.getValue()) {
                    if (tile.loading || tile.bitmap == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    private float minScale() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i = this.minimumScaleType;
        if (i == 2 || i == 4) {
            return Math.max(((float) (getWidth() - paddingLeft)) / ((float) sWidth()), ((float) (getHeight() - paddingBottom)) / ((float) sHeight()));
        }
        if (i == 3) {
            float f = this.minScale;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                return f;
            }
        }
        return Math.min(((float) (getWidth() - paddingLeft)) / ((float) sWidth()), ((float) (getHeight() - paddingBottom)) / ((float) sHeight()));
    }

    private void preDraw() {
        Float f;
        if (getWidth() != 0 && getHeight() != 0 && this.sWidth > 0 && this.sHeight > 0) {
            if (!(this.sPendingCenter == null || (f = this.pendingScale) == null)) {
                this.scale = f.floatValue();
                if (this.vTranslate == null) {
                    this.vTranslate = new PointF();
                }
                this.vTranslate.x = ((float) (getWidth() / 2)) - (this.scale * this.sPendingCenter.x);
                this.vTranslate.y = ((float) (getHeight() / 2)) - (this.scale * this.sPendingCenter.y);
                this.sPendingCenter = null;
                this.pendingScale = null;
                fitToBounds(true);
                refreshRequiredTiles(true);
            }
            fitToBounds(false);
        }
    }

    public final class AnimationBuilder {
        private long duration;
        private int easing;
        private boolean interruptible;
        private OnAnimationEventListener listener;
        private int origin;
        private boolean panLimited;
        private final PointF targetSCenter;
        private final float targetScale;
        private final PointF vFocus;

        public void start() {
            PointF pointF;
            if (!(SubsamplingScaleImageView.this.anim == null || SubsamplingScaleImageView.this.anim.listener == null)) {
                try {
                    SubsamplingScaleImageView.this.anim.listener.onInterruptedByNewAnim();
                } catch (Exception e) {
                    Log.w(SubsamplingScaleImageView.TAG, "Error thrown by animation listener", e);
                }
            }
            int paddingLeft = SubsamplingScaleImageView.this.getPaddingLeft() + (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2);
            int paddingTop = SubsamplingScaleImageView.this.getPaddingTop() + (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2);
            float limitedScale = SubsamplingScaleImageView.this.limitedScale(this.targetScale);
            if (this.panLimited) {
                pointF = SubsamplingScaleImageView.this.limitedSCenter(this.targetSCenter.x, this.targetSCenter.y, limitedScale, new PointF());
            } else {
                pointF = this.targetSCenter;
            }
            SubsamplingScaleImageView.this.anim = new Anim();
            SubsamplingScaleImageView.this.anim.scaleStart = SubsamplingScaleImageView.this.scale;
            SubsamplingScaleImageView.this.anim.scaleEnd = limitedScale;
            SubsamplingScaleImageView.this.anim.time = System.currentTimeMillis();
            SubsamplingScaleImageView.this.anim.sCenterEndRequested = pointF;
            SubsamplingScaleImageView.this.anim.sCenterStart = SubsamplingScaleImageView.this.getCenter();
            SubsamplingScaleImageView.this.anim.sCenterEnd = pointF;
            SubsamplingScaleImageView.this.anim.vFocusStart = SubsamplingScaleImageView.this.sourceToViewCoord(pointF);
            SubsamplingScaleImageView.this.anim.vFocusEnd = new PointF((float) paddingLeft, (float) paddingTop);
            SubsamplingScaleImageView.this.anim.duration = this.duration;
            SubsamplingScaleImageView.this.anim.interruptible = this.interruptible;
            SubsamplingScaleImageView.this.anim.easing = this.easing;
            SubsamplingScaleImageView.this.anim.origin = this.origin;
            SubsamplingScaleImageView.this.anim.time = System.currentTimeMillis();
            SubsamplingScaleImageView.this.anim.listener = this.listener;
            PointF pointF2 = this.vFocus;
            if (pointF2 != null) {
                float f = pointF2.x - (SubsamplingScaleImageView.this.anim.sCenterStart.x * limitedScale);
                float f2 = this.vFocus.y - (SubsamplingScaleImageView.this.anim.sCenterStart.y * limitedScale);
                ScaleAndTranslate scaleAndTranslate = new ScaleAndTranslate(limitedScale, new PointF(f, f2));
                SubsamplingScaleImageView.this.fitToBounds(true, scaleAndTranslate);
                SubsamplingScaleImageView.this.anim.vFocusEnd = new PointF(this.vFocus.x + (scaleAndTranslate.vTranslate.x - f), this.vFocus.y + (scaleAndTranslate.vTranslate.y - f2));
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        public AnimationBuilder withDuration(long j) {
            this.duration = j;
            return this;
        }

        public AnimationBuilder withInterruptible(boolean z) {
            this.interruptible = z;
            return this;
        }

        public AnimationBuilder withOnAnimationEventListener(OnAnimationEventListener onAnimationEventListener) {
            this.listener = onAnimationEventListener;
            return this;
        }

        public AnimationBuilder withOrigin(int i) {
            this.origin = i;
            return this;
        }

        public AnimationBuilder withPanLimited(boolean z) {
            this.panLimited = z;
            return this;
        }

        public AnimationBuilder withEasing(int i) {
            if (SubsamplingScaleImageView.VALID_EASING_STYLES.contains(Integer.valueOf(i))) {
                this.easing = i;
                return this;
            }
            throw new IllegalArgumentException("Unknown easing type: " + i);
        }

        private AnimationBuilder(float f) {
            this.duration = 500;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f;
            this.targetSCenter = SubsamplingScaleImageView.this.getCenter();
            this.vFocus = null;
        }

        private AnimationBuilder(PointF pointF) {
            this.duration = 500;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = SubsamplingScaleImageView.this.scale;
            this.targetSCenter = pointF;
        }

        private AnimationBuilder(float f, PointF pointF) {
            this.duration = 500;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f;
            this.targetSCenter = pointF;
        }

        private AnimationBuilder(float f, PointF pointF, PointF pointF2) {
            this.duration = 500;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f;
            this.targetSCenter = pointF;
            this.vFocus = pointF2;
        }
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        preferredBitmapConfig = config;
    }

    public final void setDebug(boolean z) {
        this.debug = z;
    }

    public final void setDoubleTapZoomScale(float f) {
        this.doubleTapZoomScale = f;
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.eagerLoadingEnabled = z;
    }

    public final void setMaxScale(float f) {
        this.maxScale = f;
    }

    public final void setMinScale(float f) {
        this.minScale = f;
    }

    public void setOnImageEventListener(OnImageEventListener onImageEventListener2) {
        this.onImageEventListener = onImageEventListener2;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener2) {
        this.onLongClickListener = onLongClickListener2;
    }

    public void setOnStateChangedListener(OnStateChangedListener onStateChangedListener2) {
        this.onStateChangedListener = onStateChangedListener2;
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.quickScaleEnabled = z;
    }

    public final void setZoomEnabled(boolean z) {
        this.zoomEnabled = z;
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }

    private int px(int i) {
        return (int) (this.density * ((float) i));
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.doubleTapZoomDuration = Math.max(0, i);
    }

    public void setExecutor(Executor executor2) {
        Objects.requireNonNull(executor2, "Executor must not be null");
        this.executor = executor2;
    }

    public final void setImage(ImageSource imageSource) {
        setImage(imageSource, null, null);
    }

    public void setMaxTileSize(int i) {
        this.maxTileWidth = i;
        this.maxTileHeight = i;
    }

    private void execute(AsyncTask<Void, Void, ?> asyncTask) {
        asyncTask.executeOnExecutor(this.executor, new Void[0]);
    }

    private void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private float sourceToViewX(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.scale) + pointF.x;
    }

    private float sourceToViewY(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.scale) + pointF.y;
    }

    private float viewToSourceX(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.scale;
    }

    private float viewToSourceY(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.scale;
    }

    public AnimationBuilder animateCenter(PointF pointF) {
        if (!isReady()) {
            return null;
        }
        return new AnimationBuilder(pointF);
    }

    public AnimationBuilder animateScale(float f) {
        if (!isReady()) {
            return null;
        }
        return new AnimationBuilder(f);
    }

    public float limitedScale(float f) {
        return Math.min(this.maxScale, Math.max(minScale(), f));
    }

    public final void setBitmapDecoderFactory(DecoderFactory<? extends ImageDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.bitmapDecoderFactory = decoderFactory;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setRegionDecoderFactory(DecoderFactory<? extends ImageRegionDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.regionDecoderFactory = decoderFactory;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    private Point getMaxBitmapDimensions(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), this.maxTileWidth), Math.min(canvas.getMaximumBitmapHeight(), this.maxTileHeight));
    }

    public final void setBitmapDecoderClass(Class<? extends ImageDecoder> cls) {
        if (cls != null) {
            this.bitmapDecoderFactory = new CompatDecoderFactory(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public void setGestureDetector(final Context context) {
        this.detector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            /* class com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.C209562 */

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (!SubsamplingScaleImageView.this.zoomEnabled || !SubsamplingScaleImageView.this.readySent || SubsamplingScaleImageView.this.vTranslate == null) {
                    return super.onDoubleTapEvent(motionEvent);
                }
                SubsamplingScaleImageView.this.setGestureDetector(context);
                if (SubsamplingScaleImageView.this.quickScaleEnabled) {
                    SubsamplingScaleImageView.this.vCenterStart = new PointF(motionEvent.getX(), motionEvent.getY());
                    SubsamplingScaleImageView.this.vTranslateStart = new PointF(SubsamplingScaleImageView.this.vTranslate.x, SubsamplingScaleImageView.this.vTranslate.y);
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    subsamplingScaleImageView.scaleStart = subsamplingScaleImageView.scale;
                    SubsamplingScaleImageView.this.isQuickScaling = true;
                    SubsamplingScaleImageView.this.isZooming = true;
                    SubsamplingScaleImageView.this.quickScaleLastDistance = -1.0f;
                    SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                    subsamplingScaleImageView2.quickScaleSCenter = subsamplingScaleImageView2.viewToSourceCoord(subsamplingScaleImageView2.vCenterStart);
                    SubsamplingScaleImageView.this.quickScaleVStart = new PointF(motionEvent.getX(), motionEvent.getY());
                    SubsamplingScaleImageView.this.quickScaleVLastPoint = new PointF(SubsamplingScaleImageView.this.quickScaleSCenter.x, SubsamplingScaleImageView.this.quickScaleSCenter.y);
                    SubsamplingScaleImageView.this.quickScaleMoved = false;
                    return false;
                }
                SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
                subsamplingScaleImageView3.doubleTapZoom(subsamplingScaleImageView3.viewToSourceCoord(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                return true;
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!SubsamplingScaleImageView.this.panEnabled || !SubsamplingScaleImageView.this.readySent || SubsamplingScaleImageView.this.vTranslate == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.isZooming))) {
                    return super.onFling(motionEvent, motionEvent2, f, f2);
                }
                PointF pointF = new PointF(SubsamplingScaleImageView.this.vTranslate.x + (f * 0.25f), SubsamplingScaleImageView.this.vTranslate.y + (f2 * 0.25f));
                new AnimationBuilder(new PointF((((float) (SubsamplingScaleImageView.this.getWidth() / 2)) - pointF.x) / SubsamplingScaleImageView.this.scale, (((float) (SubsamplingScaleImageView.this.getHeight() / 2)) - pointF.y) / SubsamplingScaleImageView.this.scale)).withEasing(1).withPanLimited(false).withOrigin(3).start();
                return true;
            }
        });
        this.singleDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            /* class com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.C209573 */

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setRegionDecoderClass(Class<? extends ImageRegionDecoder> cls) {
        if (cls != null) {
            this.regionDecoderFactory = new CompatDecoderFactory(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.tileBgPaint = null;
        } else {
            Paint paint = new Paint();
            this.tileBgPaint = paint;
            paint.setStyle(Paint.Style.FILL);
            this.tileBgPaint.setColor(i);
        }
        invalidate();
    }

    public void visibleFileRect(Rect rect) {
        if (this.vTranslate != null && this.readySent) {
            rect.set(0, 0, getWidth(), getHeight());
            viewToFileRect(rect, rect);
        }
    }

    /* access modifiers changed from: private */
    public static class BitmapLoadTask extends AsyncTask<Void, Void, Integer> {
        private Bitmap bitmap;
        private final WeakReference<Context> contextRef;
        private final WeakReference<DecoderFactory<? extends ImageDecoder>> decoderFactoryRef;
        private Exception exception;
        private final boolean preview;
        private final Uri source;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        /* access modifiers changed from: protected */
        public void onPostExecute(Integer num) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap2 = this.bitmap;
                if (bitmap2 == null || num == null) {
                    if (this.exception != null && subsamplingScaleImageView.onImageEventListener != null) {
                        if (this.preview) {
                            subsamplingScaleImageView.onImageEventListener.onPreviewLoadError(this.exception);
                        } else {
                            subsamplingScaleImageView.onImageEventListener.onImageLoadError(this.exception);
                        }
                    }
                } else if (this.preview) {
                    subsamplingScaleImageView.onPreviewLoaded(bitmap2);
                } else {
                    subsamplingScaleImageView.onImageLoaded(bitmap2, num.intValue(), false);
                }
            }
        }

        /* access modifiers changed from: protected */
        public Integer doInBackground(Void... voidArr) {
            try {
                String uri = this.source.toString();
                Context context = this.contextRef.get();
                DecoderFactory<? extends ImageDecoder> decoderFactory = this.decoderFactoryRef.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                if (context == null || decoderFactory == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.debug("BitmapLoadTask.doInBackground", new Object[0]);
                this.bitmap = ((ImageDecoder) decoderFactory.make()).decode(context, this.source);
                return Integer.valueOf(subsamplingScaleImageView.getExifOrientation(context, uri));
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to load bitmap", e);
                this.exception = e;
                return null;
            } catch (OutOfMemoryError e2) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to load bitmap - OutOfMemoryError", e2);
                this.exception = new RuntimeException(e2);
                return null;
            }
        }

        BitmapLoadTask(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageDecoder> decoderFactory, Uri uri, boolean z) {
            this.viewRef = new WeakReference<>(subsamplingScaleImageView);
            this.contextRef = new WeakReference<>(context);
            this.decoderFactoryRef = new WeakReference<>(decoderFactory);
            this.source = uri;
            this.preview = z;
        }
    }

    /* access modifiers changed from: private */
    public static class TileLoadTask extends AsyncTask<Void, Void, Bitmap> {
        private final WeakReference<ImageRegionDecoder> decoderRef;
        private Exception exception;
        private final WeakReference<Tile> tileRef;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        /* access modifiers changed from: protected */
        public void onPostExecute(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            Tile tile = this.tileRef.get();
            if (subsamplingScaleImageView != null && tile != null) {
                if (bitmap != null) {
                    tile.bitmap = bitmap;
                    tile.loading = false;
                    subsamplingScaleImageView.onTileLoaded();
                } else if (this.exception != null && subsamplingScaleImageView.onImageEventListener != null) {
                    subsamplingScaleImageView.onImageEventListener.onTileLoadError(this.exception);
                }
            }
        }

        /* access modifiers changed from: protected */
        public Bitmap doInBackground(Void... voidArr) {
            try {
                SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                ImageRegionDecoder imageRegionDecoder = this.decoderRef.get();
                Tile tile = this.tileRef.get();
                if (imageRegionDecoder != null && tile != null && subsamplingScaleImageView != null && imageRegionDecoder.isReady() && tile.visible) {
                    subsamplingScaleImageView.debug("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", tile.sRect, Integer.valueOf(tile.sampleSize));
                    subsamplingScaleImageView.decoderLock.readLock().lock();
                    try {
                        if (imageRegionDecoder.isReady()) {
                            subsamplingScaleImageView.fileSRect(tile.sRect, tile.fileSRect);
                            if (subsamplingScaleImageView.sRegion != null) {
                                tile.fileSRect.offset(subsamplingScaleImageView.sRegion.left, subsamplingScaleImageView.sRegion.top);
                            }
                            return imageRegionDecoder.decodeRegion(tile.fileSRect, tile.sampleSize);
                        }
                        tile.loading = false;
                        subsamplingScaleImageView.decoderLock.readLock().unlock();
                        return null;
                    } finally {
                        subsamplingScaleImageView.decoderLock.readLock().unlock();
                    }
                } else if (tile == null) {
                    return null;
                } else {
                    tile.loading = false;
                    return null;
                }
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to decode tile", e);
                this.exception = e;
                return null;
            } catch (OutOfMemoryError e2) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to decode tile - OutOfMemoryError", e2);
                this.exception = new RuntimeException(e2);
                return null;
            }
        }

        TileLoadTask(SubsamplingScaleImageView subsamplingScaleImageView, ImageRegionDecoder imageRegionDecoder, Tile tile) {
            this.viewRef = new WeakReference<>(subsamplingScaleImageView);
            this.decoderRef = new WeakReference<>(imageRegionDecoder);
            this.tileRef = new WeakReference<>(tile);
            tile.loading = true;
        }
    }

    /* access modifiers changed from: private */
    public static class TilesInitTask extends AsyncTask<Void, Void, int[]> {
        private final WeakReference<Context> contextRef;
        private ImageRegionDecoder decoder;
        private final WeakReference<DecoderFactory<? extends ImageRegionDecoder>> decoderFactoryRef;
        private Exception exception;
        private final Uri source;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        /* access modifiers changed from: protected */
        public void onPostExecute(int[] iArr) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            if (subsamplingScaleImageView != null) {
                ImageRegionDecoder imageRegionDecoder = this.decoder;
                if (imageRegionDecoder != null && iArr != null && iArr.length == 3) {
                    subsamplingScaleImageView.onTilesInited(imageRegionDecoder, iArr[0], iArr[1], iArr[2]);
                } else if (this.exception != null && subsamplingScaleImageView.onImageEventListener != null) {
                    subsamplingScaleImageView.onImageEventListener.onImageLoadError(this.exception);
                }
            }
        }

        /* access modifiers changed from: protected */
        public int[] doInBackground(Void... voidArr) {
            try {
                String uri = this.source.toString();
                Context context = this.contextRef.get();
                DecoderFactory<? extends ImageRegionDecoder> decoderFactory = this.decoderFactoryRef.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                if (context == null || decoderFactory == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.debug("TilesInitTask.doInBackground", new Object[0]);
                ImageRegionDecoder imageRegionDecoder = (ImageRegionDecoder) decoderFactory.make();
                this.decoder = imageRegionDecoder;
                Point init = imageRegionDecoder.init(context, this.source);
                int i = init.x;
                int i2 = init.y;
                int exifOrientation = subsamplingScaleImageView.getExifOrientation(context, uri);
                if (subsamplingScaleImageView.sRegion != null) {
                    subsamplingScaleImageView.sRegion.left = Math.max(0, subsamplingScaleImageView.sRegion.left);
                    subsamplingScaleImageView.sRegion.top = Math.max(0, subsamplingScaleImageView.sRegion.top);
                    subsamplingScaleImageView.sRegion.right = Math.min(i, subsamplingScaleImageView.sRegion.right);
                    subsamplingScaleImageView.sRegion.bottom = Math.min(i2, subsamplingScaleImageView.sRegion.bottom);
                    i = subsamplingScaleImageView.sRegion.width();
                    i2 = subsamplingScaleImageView.sRegion.height();
                }
                return new int[]{i, i2, exifOrientation};
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to initialise bitmap decoder", e);
                this.exception = e;
                return null;
            }
        }

        TilesInitTask(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageRegionDecoder> decoderFactory, Uri uri) {
            this.viewRef = new WeakReference<>(subsamplingScaleImageView);
            this.contextRef = new WeakReference<>(context);
            this.decoderFactoryRef = new WeakReference<>(decoderFactory);
            this.source = uri;
        }
    }

    private void restoreState(ImageViewState imageViewState) {
        if (imageViewState != null && VALID_ORIENTATIONS.contains(Integer.valueOf(imageViewState.getOrientation()))) {
            this.orientation = imageViewState.getOrientation();
            this.pendingScale = Float.valueOf(imageViewState.getScale());
            this.sPendingCenter = imageViewState.getCenter();
            invalidate();
        }
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (VALID_ZOOM_STYLES.contains(Integer.valueOf(i))) {
            this.doubleTapZoomStyle = i;
            return;
        }
        throw new IllegalArgumentException("Invalid zoom style: " + i);
    }

    public final void setMinimumScaleType(int i) {
        if (VALID_SCALE_TYPES.contains(Integer.valueOf(i))) {
            this.minimumScaleType = i;
            if (isReady()) {
                fitToBounds(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid scale type: " + i);
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.minimumTileDpi = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, (float) i);
        if (isReady()) {
            reset(false);
            invalidate();
        }
    }

    public final void setOrientation(int i) {
        if (VALID_ORIENTATIONS.contains(Integer.valueOf(i))) {
            this.orientation = i;
            reset(false);
            invalidate();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i);
    }

    public final void setPanLimit(int i) {
        if (VALID_PAN_LIMITS.contains(Integer.valueOf(i))) {
            this.panLimit = i;
            if (isReady()) {
                fitToBounds(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid pan limit: " + i);
    }

    public final PointF sourceToViewCoord(PointF pointF) {
        return sourceToViewCoord(pointF.x, pointF.y, new PointF());
    }

    public final PointF viewToSourceCoord(PointF pointF) {
        return viewToSourceCoord(pointF.x, pointF.y, new PointF());
    }

    private int calculateInSampleSize(float f) {
        int i;
        if (this.minimumTileDpi > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= ((float) this.minimumTileDpi) / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int sWidth2 = (int) (((float) sWidth()) * f);
        int sHeight2 = (int) (((float) sHeight()) * f);
        if (sWidth2 == 0 || sHeight2 == 0) {
            return 32;
        }
        int i2 = 1;
        if (sHeight() > sHeight2 || sWidth() > sWidth2) {
            i = Math.round(((float) sHeight()) / ((float) sHeight2));
            int round = Math.round(((float) sWidth()) / ((float) sWidth2));
            if (i >= round) {
                i = round;
            }
        } else {
            i = 1;
        }
        while (true) {
            int i3 = i2 * 2;
            if (i3 >= i) {
                return i2;
            }
            i2 = i3;
        }
    }

    private void fitToBounds(boolean z) {
        boolean z2;
        if (this.vTranslate == null) {
            z2 = true;
            this.vTranslate = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            z2 = false;
        }
        if (this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        }
        this.satTemp.scale = this.scale;
        this.satTemp.vTranslate.set(this.vTranslate);
        fitToBounds(z, this.satTemp);
        this.scale = this.satTemp.scale;
        this.vTranslate.set(this.satTemp.vTranslate);
        if (z2 && this.minimumScaleType != 4) {
            this.vTranslate.set(vTranslateForSCenter((float) (sWidth() / 2), (float) (sHeight() / 2), this.scale));
        }
    }

    private boolean tileVisible(Tile tile) {
        float viewToSourceX = viewToSourceX(BitmapDescriptorFactory.HUE_RED);
        float viewToSourceX2 = viewToSourceX((float) getWidth());
        float viewToSourceY = viewToSourceY(BitmapDescriptorFactory.HUE_RED);
        float viewToSourceY2 = viewToSourceY((float) getHeight());
        if (viewToSourceX > ((float) tile.sRect.right) || ((float) tile.sRect.left) > viewToSourceX2 || viewToSourceY > ((float) tile.sRect.bottom) || ((float) tile.sRect.top) > viewToSourceY2) {
            return false;
        }
        return true;
    }

    public synchronized void onPreviewLoaded(Bitmap bitmap2) {
        debug("onPreviewLoaded", new Object[0]);
        if (this.bitmap == null) {
            if (!this.imageLoadedSent) {
                Rect rect = this.pRegion;
                if (rect != null) {
                    this.bitmap = Bitmap.createBitmap(bitmap2, rect.left, this.pRegion.top, this.pRegion.width(), this.pRegion.height());
                } else {
                    this.bitmap = bitmap2;
                }
                this.bitmapIsPreview = true;
                if (checkReady()) {
                    invalidate();
                    requestLayout();
                }
                return;
            }
        }
        bitmap2.recycle();
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.panEnabled = z;
        if (!z && (pointF = this.vTranslate) != null) {
            pointF.x = ((float) (getWidth() / 2)) - (this.scale * ((float) (sWidth() / 2)));
            this.vTranslate.y = ((float) (getHeight() / 2)) - (this.scale * ((float) (sHeight() / 2)));
            if (isReady()) {
                refreshRequiredTiles(true);
                invalidate();
            }
        }
    }

    private synchronized void initialiseBaseLayer(Point point) {
        debug("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        ScaleAndTranslate scaleAndTranslate = new ScaleAndTranslate(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        this.satTemp = scaleAndTranslate;
        fitToBounds(true, scaleAndTranslate);
        int calculateInSampleSize = calculateInSampleSize(this.satTemp.scale);
        this.fullImageSampleSize = calculateInSampleSize;
        if (calculateInSampleSize > 1) {
            this.fullImageSampleSize = calculateInSampleSize / 2;
        }
        if (this.fullImageSampleSize != 1 || this.sRegion != null || sWidth() >= point.x || sHeight() >= point.y) {
            initialiseTileMap(point);
            for (Tile tile : this.tileMap.get(Integer.valueOf(this.fullImageSampleSize))) {
                execute(new TileLoadTask(this, this.decoder, tile));
            }
            refreshRequiredTiles(true);
        } else {
            this.decoder.recycle();
            this.decoder = null;
            execute(new BitmapLoadTask(this, getContext(), this.bitmapDecoderFactory, this.uri, false));
        }
    }

    private void initialiseTileMap(Point point) {
        boolean z;
        int i;
        int i2;
        int i3 = 1;
        debug("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        this.tileMap = new LinkedHashMap();
        int i4 = this.fullImageSampleSize;
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int sWidth2 = sWidth() / i5;
            int sHeight2 = sHeight() / i6;
            int i7 = sWidth2 / i4;
            int i8 = sHeight2 / i4;
            while (true) {
                if (i7 + i5 + i3 > point.x || (((double) i7) > ((double) getWidth()) * 1.25d && i4 < this.fullImageSampleSize)) {
                    i5++;
                    sWidth2 = sWidth() / i5;
                    i7 = sWidth2 / i4;
                    i3 = 1;
                }
            }
            while (true) {
                if (i8 + i6 + i3 > point.y || (((double) i8) > ((double) getHeight()) * 1.25d && i4 < this.fullImageSampleSize)) {
                    i6++;
                    sHeight2 = sHeight() / i6;
                    i8 = sHeight2 / i4;
                    i3 = 1;
                }
            }
            ArrayList arrayList = new ArrayList(i5 * i6);
            for (int i9 = 0; i9 < i5; i9++) {
                for (int i10 = 0; i10 < i6; i10++) {
                    Tile tile = new Tile();
                    tile.sampleSize = i4;
                    if (i4 == this.fullImageSampleSize) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tile.visible = z;
                    int i11 = i9 * sWidth2;
                    int i12 = i10 * sHeight2;
                    if (i9 == i5 - 1) {
                        i = sWidth();
                    } else {
                        i = (i9 + 1) * sWidth2;
                    }
                    if (i10 == i6 - 1) {
                        i2 = sHeight();
                    } else {
                        i2 = (i10 + 1) * sHeight2;
                    }
                    tile.sRect = new Rect(i11, i12, i, i2);
                    tile.vRect = new Rect(0, 0, 0, 0);
                    tile.fileSRect = new Rect(tile.sRect);
                    arrayList.add(tile);
                }
            }
            this.tileMap.put(Integer.valueOf(i4), arrayList);
            if (i4 != 1) {
                i4 /= 2;
                i3 = 1;
            } else {
                return;
            }
        }
    }

    private void refreshRequiredTiles(boolean z) {
        if (!(this.decoder == null || this.tileMap == null)) {
            int min = Math.min(this.fullImageSampleSize, calculateInSampleSize(this.scale));
            for (Map.Entry<Integer, List<Tile>> entry : this.tileMap.entrySet()) {
                for (Tile tile : entry.getValue()) {
                    if (tile.sampleSize < min || (tile.sampleSize > min && tile.sampleSize != this.fullImageSampleSize)) {
                        tile.visible = false;
                        if (tile.bitmap != null) {
                            tile.bitmap.recycle();
                            tile.bitmap = null;
                        }
                    }
                    if (tile.sampleSize == min) {
                        if (tileVisible(tile)) {
                            tile.visible = true;
                            if (!tile.loading && tile.bitmap == null && z) {
                                execute(new TileLoadTask(this, this.decoder, tile));
                            }
                        } else if (tile.sampleSize != this.fullImageSampleSize) {
                            tile.visible = false;
                            if (tile.bitmap != null) {
                                tile.bitmap.recycle();
                                tile.bitmap = null;
                            }
                        }
                    } else if (tile.sampleSize == this.fullImageSampleSize) {
                        tile.visible = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void reset(boolean z) {
        OnImageEventListener onImageEventListener2;
        debug("reset newImage=" + z, new Object[0]);
        this.scale = BitmapDescriptorFactory.HUE_RED;
        this.scaleStart = BitmapDescriptorFactory.HUE_RED;
        this.vTranslate = null;
        this.vTranslateStart = null;
        this.vTranslateBefore = null;
        this.pendingScale = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        this.sPendingCenter = null;
        this.sRequestedCenter = null;
        this.isZooming = false;
        this.isPanning = false;
        this.isQuickScaling = false;
        this.maxTouchCount = 0;
        this.fullImageSampleSize = 0;
        this.vCenterStart = null;
        this.vDistStart = BitmapDescriptorFactory.HUE_RED;
        this.quickScaleLastDistance = BitmapDescriptorFactory.HUE_RED;
        this.quickScaleMoved = false;
        this.quickScaleSCenter = null;
        this.quickScaleVLastPoint = null;
        this.quickScaleVStart = null;
        this.anim = null;
        this.satTemp = null;
        this.matrix = null;
        this.sRect = null;
        if (z) {
            this.uri = null;
            this.decoderLock.writeLock().lock();
            try {
                ImageRegionDecoder imageRegionDecoder = this.decoder;
                if (imageRegionDecoder != null) {
                    imageRegionDecoder.recycle();
                    this.decoder = null;
                }
                this.decoderLock.writeLock().unlock();
                Bitmap bitmap2 = this.bitmap;
                if (bitmap2 != null && !this.bitmapIsCached) {
                    bitmap2.recycle();
                }
                if (!(this.bitmap == null || !this.bitmapIsCached || (onImageEventListener2 = this.onImageEventListener) == null)) {
                    onImageEventListener2.onPreviewReleased();
                }
                this.sWidth = 0;
                this.sHeight = 0;
                this.sOrientation = 0;
                this.sRegion = null;
                this.pRegion = null;
                this.readySent = false;
                this.imageLoadedSent = false;
                this.bitmap = null;
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
            } catch (Throwable th) {
                this.decoderLock.writeLock().unlock();
                throw th;
            }
        }
        Map<Integer, List<Tile>> map = this.tileMap;
        if (map != null) {
            for (Map.Entry<Integer, List<Tile>> entry : map.entrySet()) {
                for (Tile tile : entry.getValue()) {
                    tile.visible = false;
                    if (tile.bitmap != null) {
                        tile.bitmap.recycle();
                        tile.bitmap = null;
                    }
                }
            }
            this.tileMap = null;
        }
        setGestureDetector(getContext());
    }

    public final void getPanRemaining(RectF rectF) {
        if (isReady()) {
            float sWidth2 = this.scale * ((float) sWidth());
            float sHeight2 = this.scale * ((float) sHeight());
            int i = this.panLimit;
            if (i == 3) {
                rectF.top = Math.max((float) BitmapDescriptorFactory.HUE_RED, -(this.vTranslate.y - ((float) (getHeight() / 2))));
                rectF.left = Math.max((float) BitmapDescriptorFactory.HUE_RED, -(this.vTranslate.x - ((float) (getWidth() / 2))));
                rectF.bottom = Math.max((float) BitmapDescriptorFactory.HUE_RED, this.vTranslate.y - (((float) (getHeight() / 2)) - sHeight2));
                rectF.right = Math.max((float) BitmapDescriptorFactory.HUE_RED, this.vTranslate.x - (((float) (getWidth() / 2)) - sWidth2));
            } else if (i == 2) {
                rectF.top = Math.max((float) BitmapDescriptorFactory.HUE_RED, -(this.vTranslate.y - ((float) getHeight())));
                rectF.left = Math.max((float) BitmapDescriptorFactory.HUE_RED, -(this.vTranslate.x - ((float) getWidth())));
                rectF.bottom = Math.max((float) BitmapDescriptorFactory.HUE_RED, this.vTranslate.y + sHeight2);
                rectF.right = Math.max((float) BitmapDescriptorFactory.HUE_RED, this.vTranslate.x + sWidth2);
            } else {
                rectF.top = Math.max((float) BitmapDescriptorFactory.HUE_RED, -this.vTranslate.y);
                rectF.left = Math.max((float) BitmapDescriptorFactory.HUE_RED, -this.vTranslate.x);
                rectF.bottom = Math.max((float) BitmapDescriptorFactory.HUE_RED, (sHeight2 + this.vTranslate.y) - ((float) getHeight()));
                rectF.right = Math.max((float) BitmapDescriptorFactory.HUE_RED, (sWidth2 + this.vTranslate.x) - ((float) getWidth()));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        Anim anim2 = this.anim;
        if (anim2 == null || anim2.interruptible) {
            Anim anim3 = this.anim;
            if (!(anim3 == null || anim3.listener == null)) {
                try {
                    this.anim.listener.onInterruptedByUser();
                } catch (Exception e) {
                    Log.w(TAG, "Error thrown by animation listener", e);
                }
            }
            this.anim = null;
            if (this.vTranslate == null) {
                GestureDetector gestureDetector2 = this.singleDetector;
                if (gestureDetector2 != null) {
                    gestureDetector2.onTouchEvent(motionEvent);
                }
                return true;
            } else if (this.isQuickScaling || ((gestureDetector = this.detector) != null && !gestureDetector.onTouchEvent(motionEvent))) {
                if (this.vTranslateStart == null) {
                    this.vTranslateStart = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                if (this.vTranslateBefore == null) {
                    this.vTranslateBefore = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                if (this.vCenterStart == null) {
                    this.vCenterStart = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                float f = this.scale;
                this.vTranslateBefore.set(this.vTranslate);
                boolean onTouchEventInternal = onTouchEventInternal(motionEvent);
                sendStateChanged(f, this.vTranslateBefore, 2);
                if (onTouchEventInternal || super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            } else {
                this.isZooming = false;
                this.isPanning = false;
                this.maxTouchCount = 0;
                return true;
            }
        } else {
            requestDisallowInterceptTouchEvent(true);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r1 != 262) goto L_0x03ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean onTouchEventInternal(android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 1244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.onTouchEventInternal(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        int i3;
        Tile tile;
        boolean z;
        boolean z2;
        super.onDraw(canvas);
        createPaints();
        if (!(this.sWidth == 0 || this.sHeight == 0 || getWidth() == 0 || getHeight() == 0)) {
            if (this.tileMap == null && this.decoder != null) {
                initialiseBaseLayer(getMaxBitmapDimensions(canvas));
            }
            if (checkReady()) {
                preDraw();
                Anim anim2 = this.anim;
                if (!(anim2 == null || anim2.vFocusStart == null)) {
                    float f2 = this.scale;
                    if (this.vTranslateBefore == null) {
                        this.vTranslateBefore = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    }
                    this.vTranslateBefore.set(this.vTranslate);
                    long currentTimeMillis = System.currentTimeMillis() - this.anim.time;
                    if (currentTimeMillis > this.anim.duration) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long min = Math.min(currentTimeMillis, this.anim.duration);
                    this.scale = ease(this.anim.easing, min, this.anim.scaleStart, this.anim.scaleEnd - this.anim.scaleStart, this.anim.duration);
                    float ease = ease(this.anim.easing, min, this.anim.vFocusStart.x, this.anim.vFocusEnd.x - this.anim.vFocusStart.x, this.anim.duration);
                    float ease2 = ease(this.anim.easing, min, this.anim.vFocusStart.y, this.anim.vFocusEnd.y - this.anim.vFocusStart.y, this.anim.duration);
                    this.vTranslate.x -= sourceToViewX(this.anim.sCenterEnd.x) - ease;
                    this.vTranslate.y -= sourceToViewY(this.anim.sCenterEnd.y) - ease2;
                    if (z || this.anim.scaleStart == this.anim.scaleEnd) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    fitToBounds(z2);
                    sendStateChanged(f2, this.vTranslateBefore, this.anim.origin);
                    refreshRequiredTiles(z);
                    if (z) {
                        if (this.anim.listener != null) {
                            try {
                                this.anim.listener.onComplete();
                            } catch (Exception e) {
                                Log.w(TAG, "Error thrown by animation listener", e);
                            }
                        }
                        this.anim = null;
                    }
                    invalidate();
                }
                if (this.tileMap == null || !isBaseLayerReady()) {
                    i = 35;
                    Bitmap bitmap2 = this.bitmap;
                    if (bitmap2 != null) {
                        float f3 = this.scale;
                        if (this.bitmapIsPreview) {
                            f3 *= ((float) this.sWidth) / ((float) bitmap2.getWidth());
                            f = this.scale * (((float) this.sHeight) / ((float) this.bitmap.getHeight()));
                        } else {
                            f = f3;
                        }
                        if (this.matrix == null) {
                            this.matrix = new Matrix();
                        }
                        this.matrix.reset();
                        this.matrix.postScale(f3, f);
                        this.matrix.postRotate((float) getRequiredRotation());
                        this.matrix.postTranslate(this.vTranslate.x, this.vTranslate.y);
                        if (getRequiredRotation() == 180) {
                            Matrix matrix2 = this.matrix;
                            float f4 = this.scale;
                            matrix2.postTranslate(((float) this.sWidth) * f4, f4 * ((float) this.sHeight));
                        } else if (getRequiredRotation() == 90) {
                            this.matrix.postTranslate(this.scale * ((float) this.sHeight), BitmapDescriptorFactory.HUE_RED);
                        } else if (getRequiredRotation() == 270) {
                            this.matrix.postTranslate(BitmapDescriptorFactory.HUE_RED, this.scale * ((float) this.sWidth));
                        }
                        if (this.tileBgPaint != null) {
                            if (this.sRect == null) {
                                this.sRect = new RectF();
                            }
                            RectF rectF = this.sRect;
                            if (this.bitmapIsPreview) {
                                i2 = this.bitmap.getWidth();
                            } else {
                                i2 = this.sWidth;
                            }
                            float f5 = (float) i2;
                            if (this.bitmapIsPreview) {
                                i3 = this.bitmap.getHeight();
                            } else {
                                i3 = this.sHeight;
                            }
                            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, (float) i3);
                            this.matrix.mapRect(this.sRect);
                            canvas.drawRect(this.sRect, this.tileBgPaint);
                        }
                        canvas.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
                    }
                } else {
                    int min2 = Math.min(this.fullImageSampleSize, calculateInSampleSize(this.scale));
                    boolean z3 = false;
                    for (Map.Entry<Integer, List<Tile>> entry : this.tileMap.entrySet()) {
                        if (entry.getKey().intValue() == min2) {
                            for (Tile tile2 : entry.getValue()) {
                                if (tile2.visible && (tile2.loading || tile2.bitmap == null)) {
                                    z3 = true;
                                }
                            }
                        }
                    }
                    for (Map.Entry<Integer, List<Tile>> entry2 : this.tileMap.entrySet()) {
                        if (entry2.getKey().intValue() == min2 || z3) {
                            for (Tile tile3 : entry2.getValue()) {
                                sourceToViewRect(tile3.sRect, tile3.vRect);
                                if (tile3.loading || tile3.bitmap == null) {
                                    tile = tile3;
                                    if (tile.loading && this.debug) {
                                        canvas.drawText("LOADING", (float) (tile.vRect.left + px(5)), (float) (tile.vRect.top + px(35)), this.debugTextPaint);
                                        if (tile.visible && this.debug) {
                                            canvas.drawText("ISS " + tile.sampleSize + " RECT " + tile.sRect.top + "," + tile.sRect.left + "," + tile.sRect.bottom + "," + tile.sRect.right, (float) (tile.vRect.left + px(5)), (float) (tile.vRect.top + px(15)), this.debugTextPaint);
                                        }
                                    }
                                } else {
                                    if (this.tileBgPaint != null) {
                                        canvas.drawRect(tile3.vRect, this.tileBgPaint);
                                    }
                                    if (this.matrix == null) {
                                        this.matrix = new Matrix();
                                    }
                                    this.matrix.reset();
                                    tile = tile3;
                                    setMatrixArray(this.srcArray, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) tile3.bitmap.getWidth(), BitmapDescriptorFactory.HUE_RED, (float) tile3.bitmap.getWidth(), (float) tile3.bitmap.getHeight(), BitmapDescriptorFactory.HUE_RED, (float) tile3.bitmap.getHeight());
                                    if (getRequiredRotation() == 0) {
                                        setMatrixArray(this.dstArray, (float) tile.vRect.left, (float) tile.vRect.top, (float) tile.vRect.right, (float) tile.vRect.top, (float) tile.vRect.right, (float) tile.vRect.bottom, (float) tile.vRect.left, (float) tile.vRect.bottom);
                                    } else if (getRequiredRotation() == 90) {
                                        setMatrixArray(this.dstArray, (float) tile.vRect.right, (float) tile.vRect.top, (float) tile.vRect.right, (float) tile.vRect.bottom, (float) tile.vRect.left, (float) tile.vRect.bottom, (float) tile.vRect.left, (float) tile.vRect.top);
                                    } else if (getRequiredRotation() == 180) {
                                        setMatrixArray(this.dstArray, (float) tile.vRect.right, (float) tile.vRect.bottom, (float) tile.vRect.left, (float) tile.vRect.bottom, (float) tile.vRect.left, (float) tile.vRect.top, (float) tile.vRect.right, (float) tile.vRect.top);
                                    } else if (getRequiredRotation() == 270) {
                                        setMatrixArray(this.dstArray, (float) tile.vRect.left, (float) tile.vRect.bottom, (float) tile.vRect.left, (float) tile.vRect.top, (float) tile.vRect.right, (float) tile.vRect.top, (float) tile.vRect.right, (float) tile.vRect.bottom);
                                    }
                                    this.matrix.setPolyToPoly(this.srcArray, 0, this.dstArray, 0, 4);
                                    canvas.drawBitmap(tile.bitmap, this.matrix, this.bitmapPaint);
                                    if (this.debug) {
                                        canvas.drawRect(tile.vRect, this.debugLinePaint);
                                    }
                                }
                                canvas.drawText("ISS " + tile.sampleSize + " RECT " + tile.sRect.top + "," + tile.sRect.left + "," + tile.sRect.bottom + "," + tile.sRect.right, (float) (tile.vRect.left + px(5)), (float) (tile.vRect.top + px(15)), this.debugTextPaint);
                            }
                        }
                    }
                    i = 35;
                }
                if (this.debug) {
                    canvas.drawText("Scale: " + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(this.scale)) + " (" + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(minScale())) + " - " + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(this.maxScale)) + ")", (float) px(5), (float) px(15), this.debugTextPaint);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Translate: ");
                    sb.append(String.format(Locale.ENGLISH, "%.2f", Float.valueOf(this.vTranslate.x)));
                    sb.append(":");
                    sb.append(String.format(Locale.ENGLISH, "%.2f", Float.valueOf(this.vTranslate.y)));
                    canvas.drawText(sb.toString(), (float) px(5), (float) px(30), this.debugTextPaint);
                    PointF center = getCenter();
                    canvas.drawText("Source center: " + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(center.x)) + ":" + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(center.y)), (float) px(5), (float) px(45), this.debugTextPaint);
                    Anim anim3 = this.anim;
                    if (anim3 != null) {
                        PointF sourceToViewCoord = sourceToViewCoord(anim3.sCenterStart);
                        PointF sourceToViewCoord2 = sourceToViewCoord(this.anim.sCenterEndRequested);
                        PointF sourceToViewCoord3 = sourceToViewCoord(this.anim.sCenterEnd);
                        canvas.drawCircle(sourceToViewCoord.x, sourceToViewCoord.y, (float) px(10), this.debugLinePaint);
                        this.debugLinePaint.setColor(-65536);
                        canvas.drawCircle(sourceToViewCoord2.x, sourceToViewCoord2.y, (float) px(20), this.debugLinePaint);
                        this.debugLinePaint.setColor(-16776961);
                        canvas.drawCircle(sourceToViewCoord3.x, sourceToViewCoord3.y, (float) px(25), this.debugLinePaint);
                        this.debugLinePaint.setColor(-16711681);
                        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) px(30), this.debugLinePaint);
                    }
                    if (this.vCenterStart != null) {
                        this.debugLinePaint.setColor(-65536);
                        canvas.drawCircle(this.vCenterStart.x, this.vCenterStart.y, (float) px(20), this.debugLinePaint);
                    }
                    if (this.quickScaleSCenter != null) {
                        this.debugLinePaint.setColor(-16776961);
                        canvas.drawCircle(sourceToViewX(this.quickScaleSCenter.x), sourceToViewY(this.quickScaleSCenter.y), (float) px(i), this.debugLinePaint);
                    }
                    if (this.quickScaleVStart != null && this.isQuickScaling) {
                        this.debugLinePaint.setColor(-16711681);
                        canvas.drawCircle(this.quickScaleVStart.x, this.quickScaleVStart.y, (float) px(30), this.debugLinePaint);
                    }
                    this.debugLinePaint.setColor(-65281);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class ScaleAndTranslate {
        public float scale;
        public final PointF vTranslate;

        private ScaleAndTranslate(float f, PointF pointF) {
            this.scale = f;
            this.vTranslate = pointF;
        }
    }

    public AnimationBuilder animateScaleAndCenter(float f, PointF pointF) {
        if (!isReady()) {
            return null;
        }
        return new AnimationBuilder(f, pointF);
    }

    public void debug(String str, Object... objArr) {
        if (this.debug) {
            Log.d(TAG, String.format(str, objArr));
        }
    }

    public final void setImage(ImageSource imageSource, ImageSource imageSource2) {
        setImage(imageSource, imageSource2, null);
    }

    public void setMaxTileSize(int i, int i2) {
        this.maxTileWidth = i;
        this.maxTileHeight = i2;
    }

    public final PointF sourceToViewCoord(float f, float f2) {
        return sourceToViewCoord(f, f2, new PointF());
    }

    public final PointF viewToSourceCoord(float f, float f2) {
        return viewToSourceCoord(f, f2, new PointF());
    }

    public final void setImage(ImageSource imageSource, ImageViewState imageViewState) {
        setImage(imageSource, null, imageViewState);
    }

    public final void setScaleAndCenter(float f, PointF pointF) {
        this.anim = null;
        this.pendingScale = Float.valueOf(f);
        this.sPendingCenter = pointF;
        this.sRequestedCenter = pointF;
        invalidate();
    }

    private void sourceToViewRect(Rect rect, Rect rect2) {
        rect2.set((int) sourceToViewX((float) rect.left), (int) sourceToViewY((float) rect.top), (int) sourceToViewX((float) rect.right), (int) sourceToViewY((float) rect.bottom));
    }

    public void fileSRect(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
        } else if (getRequiredRotation() == 90) {
            rect2.set(rect.top, this.sHeight - rect.right, rect.bottom, this.sHeight - rect.left);
        } else if (getRequiredRotation() == 180) {
            rect2.set(this.sWidth - rect.right, this.sHeight - rect.bottom, this.sWidth - rect.left, this.sHeight - rect.top);
        } else {
            rect2.set(this.sWidth - rect.bottom, rect.left, this.sWidth - rect.top, rect.right);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z2 = true;
        if (mode != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (mode2 == 1073741824) {
            z2 = false;
        }
        if (this.sWidth > 0 && this.sHeight > 0) {
            if (z && z2) {
                size = sWidth();
                size2 = sHeight();
            } else if (z2) {
                size2 = (int) ((((double) sHeight()) / ((double) sWidth())) * ((double) size));
            } else if (z) {
                size = (int) ((((double) sWidth()) / ((double) sHeight())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    public final PointF sourceToViewCoord(PointF pointF, PointF pointF2) {
        return sourceToViewCoord(pointF.x, pointF.y, pointF2);
    }

    public void viewToFileRect(Rect rect, Rect rect2) {
        if (this.vTranslate != null && this.readySent) {
            rect2.set((int) viewToSourceX((float) rect.left), (int) viewToSourceY((float) rect.top), (int) viewToSourceX((float) rect.right), (int) viewToSourceY((float) rect.bottom));
            fileSRect(rect2, rect2);
            rect2.set(Math.max(0, rect2.left), Math.max(0, rect2.top), Math.min(this.sWidth, rect2.right), Math.min(this.sHeight, rect2.bottom));
            Rect rect3 = this.sRegion;
            if (rect3 != null) {
                rect2.offset(rect3.left, this.sRegion.top);
            }
        }
    }

    public final PointF viewToSourceCoord(PointF pointF, PointF pointF2) {
        return viewToSourceCoord(pointF.x, pointF.y, pointF2);
    }

    public void doubleTapZoom(PointF pointF, PointF pointF2) {
        boolean z;
        if (!this.panEnabled) {
            PointF pointF3 = this.sRequestedCenter;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = this.sRequestedCenter.y;
            } else {
                pointF.x = (float) (sWidth() / 2);
                pointF.y = (float) (sHeight() / 2);
            }
        }
        float min = Math.min(this.maxScale, this.doubleTapZoomScale);
        float f = this.scale;
        if (((double) f) <= ((double) min) * 0.9d || f == this.minScale) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            min = minScale();
        }
        int i = this.doubleTapZoomStyle;
        if (i == 3) {
            setScaleAndCenter(min, pointF);
        } else if (i == 2 || !z || !this.panEnabled) {
            new AnimationBuilder(min, pointF).withInterruptible(false).withDuration((long) this.doubleTapZoomDuration).withOrigin(4).start();
        } else if (i == 1) {
            new AnimationBuilder(min, pointF, pointF2).withInterruptible(false).withDuration((long) this.doubleTapZoomDuration).withOrigin(4).start();
        }
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        android.util.Log.w(com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.TAG, "Could not get orientation of image from media store");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r0 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getExifOrientation(android.content.Context r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.getExifOrientation(android.content.Context, java.lang.String):int");
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        String string;
        this.maxScale = 2.0f;
        this.minScale = minScale();
        this.minimumTileDpi = -1;
        this.panLimit = 1;
        this.minimumScaleType = 1;
        this.maxTileWidth = Integer.MAX_VALUE;
        this.maxTileHeight = Integer.MAX_VALUE;
        this.executor = AsyncTask.THREAD_POOL_EXECUTOR;
        this.eagerLoadingEnabled = true;
        this.panEnabled = true;
        this.zoomEnabled = true;
        this.quickScaleEnabled = true;
        this.doubleTapZoomScale = 1.0f;
        this.doubleTapZoomStyle = 1;
        this.doubleTapZoomDuration = ParticipantRepo.f117150c;
        this.decoderLock = new ReentrantReadWriteLock(true);
        this.bitmapDecoderFactory = new CompatDecoderFactory(SkiaImageDecoder.class);
        this.regionDecoderFactory = new CompatDecoderFactory(SkiaImageRegionDecoder.class);
        this.srcArray = new float[8];
        this.dstArray = new float[8];
        this.density = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.handler = new Handler(new Handler.Callback() {
            /* class com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.C209551 */

            public boolean handleMessage(Message message) {
                if (message.what == 1 && SubsamplingScaleImageView.this.onLongClickListener != null) {
                    SubsamplingScaleImageView.this.maxTouchCount = 0;
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.onLongClickListener);
                    SubsamplingScaleImageView.this.performLongClick();
                    SubsamplingScaleImageView.super.setOnLongClickListener(null);
                }
                return true;
            }
        });
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.assetName, R.attr.panEnabled, R.attr.quickScaleEnabled, R.attr.src, R.attr.tileBackgroundColor, R.attr.zoomEnabled});
            if (obtainStyledAttributes.hasValue(0) && (string = obtainStyledAttributes.getString(0)) != null && string.length() > 0) {
                setImage(ImageSource.asset(string).tilingEnabled());
            }
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
                setImage(ImageSource.resource(resourceId).tilingEnabled());
            }
            if (obtainStyledAttributes.hasValue(1)) {
                setPanEnabled(obtainStyledAttributes.getBoolean(1, true));
            }
            if (obtainStyledAttributes.hasValue(5)) {
                setZoomEnabled(obtainStyledAttributes.getBoolean(5, true));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                setQuickScaleEnabled(obtainStyledAttributes.getBoolean(2, true));
            }
            if (obtainStyledAttributes.hasValue(4)) {
                setTileBackgroundColor(obtainStyledAttributes.getColor(4, Color.argb(0, 0, 0, 0)));
            }
            obtainStyledAttributes.recycle();
        }
        this.quickScaleThreshold = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    public void fitToBounds(boolean z, ScaleAndTranslate scaleAndTranslate) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.panLimit == 2 && isReady()) {
            z = false;
        }
        PointF pointF = scaleAndTranslate.vTranslate;
        float limitedScale = limitedScale(scaleAndTranslate.scale);
        float sWidth2 = ((float) sWidth()) * limitedScale;
        float sHeight2 = ((float) sHeight()) * limitedScale;
        if (this.panLimit == 3 && isReady()) {
            pointF.x = Math.max(pointF.x, ((float) (getWidth() / 2)) - sWidth2);
            pointF.y = Math.max(pointF.y, ((float) (getHeight() / 2)) - sHeight2);
        } else if (z) {
            pointF.x = Math.max(pointF.x, ((float) getWidth()) - sWidth2);
            pointF.y = Math.max(pointF.y, ((float) getHeight()) - sHeight2);
        } else {
            pointF.x = Math.max(pointF.x, -sWidth2);
            pointF.y = Math.max(pointF.y, -sHeight2);
        }
        float f4 = 0.5f;
        if (getPaddingLeft() > 0 || getPaddingRight() > 0) {
            f = ((float) getPaddingLeft()) / ((float) (getPaddingLeft() + getPaddingRight()));
        } else {
            f = 0.5f;
        }
        if (getPaddingTop() > 0 || getPaddingBottom() > 0) {
            f4 = ((float) getPaddingTop()) / ((float) (getPaddingTop() + getPaddingBottom()));
        }
        if (this.panLimit == 3 && isReady()) {
            f2 = (float) Math.max(0, getWidth() / 2);
            i = Math.max(0, getHeight() / 2);
        } else if (z) {
            f2 = Math.max((float) BitmapDescriptorFactory.HUE_RED, (((float) getWidth()) - sWidth2) * f);
            f3 = Math.max((float) BitmapDescriptorFactory.HUE_RED, (((float) getHeight()) - sHeight2) * f4);
            pointF.x = Math.min(pointF.x, f2);
            pointF.y = Math.min(pointF.y, f3);
            scaleAndTranslate.scale = limitedScale;
        } else {
            f2 = (float) Math.max(0, getWidth());
            i = Math.max(0, getHeight());
        }
        f3 = (float) i;
        pointF.x = Math.min(pointF.x, f2);
        pointF.y = Math.min(pointF.y, f3);
        scaleAndTranslate.scale = limitedScale;
    }

    public final PointF sourceToViewCoord(float f, float f2, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(sourceToViewX(f), sourceToViewY(f2));
        return pointF;
    }

    public final PointF viewToSourceCoord(float f, float f2, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(viewToSourceX(f), viewToSourceY(f2));
        return pointF;
    }

    private void sendStateChanged(float f, PointF pointF, int i) {
        OnStateChangedListener onStateChangedListener2 = this.onStateChangedListener;
        if (onStateChangedListener2 != null) {
            float f2 = this.scale;
            if (f2 != f) {
                onStateChangedListener2.onScaleChanged(f2, i);
            }
        }
        if (this.onStateChangedListener != null && !this.vTranslate.equals(pointF)) {
            this.onStateChangedListener.onCenterChanged(getCenter(), i);
        }
    }

    private PointF vTranslateForSCenter(float f, float f2, float f3) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        }
        this.satTemp.scale = f3;
        this.satTemp.vTranslate.set(((float) paddingLeft) - (f * f3), ((float) paddingTop) - (f2 * f3));
        fitToBounds(true, this.satTemp);
        return this.satTemp.vTranslate;
    }

    public synchronized void onImageLoaded(Bitmap bitmap2, int i, boolean z) {
        OnImageEventListener onImageEventListener2;
        debug("onImageLoaded", new Object[0]);
        int i2 = this.sWidth;
        if (i2 > 0 && this.sHeight > 0 && !(i2 == bitmap2.getWidth() && this.sHeight == bitmap2.getHeight())) {
            reset(false);
        }
        Bitmap bitmap3 = this.bitmap;
        if (bitmap3 != null && !this.bitmapIsCached) {
            bitmap3.recycle();
        }
        if (!(this.bitmap == null || !this.bitmapIsCached || (onImageEventListener2 = this.onImageEventListener) == null)) {
            onImageEventListener2.onPreviewReleased();
        }
        this.bitmapIsPreview = false;
        this.bitmapIsCached = z;
        this.bitmap = bitmap2;
        this.sWidth = bitmap2.getWidth();
        this.sHeight = bitmap2.getHeight();
        this.sOrientation = i;
        boolean checkReady = checkReady();
        boolean checkImageLoaded = checkImageLoaded();
        if (checkReady || checkImageLoaded) {
            invalidate();
            requestLayout();
        }
    }

    public final void setImage(ImageSource imageSource, ImageSource imageSource2, ImageViewState imageViewState) {
        Objects.requireNonNull(imageSource, "imageSource must not be null");
        reset(true);
        if (imageViewState != null) {
            restoreState(imageViewState);
        }
        if (imageSource2 != null) {
            if (imageSource.getBitmap() != null) {
                throw new IllegalArgumentException("Preview image cannot be used when a bitmap is provided for the main image");
            } else if (imageSource.getSWidth() <= 0 || imageSource.getSHeight() <= 0) {
                throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
            } else {
                this.sWidth = imageSource.getSWidth();
                this.sHeight = imageSource.getSHeight();
                this.pRegion = imageSource2.getSRegion();
                if (imageSource2.getBitmap() != null) {
                    this.bitmapIsCached = imageSource2.isCached();
                    onPreviewLoaded(imageSource2.getBitmap());
                } else {
                    Uri uri2 = imageSource2.getUri();
                    if (uri2 == null && imageSource2.getResource() != null) {
                        uri2 = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + imageSource2.getResource());
                    }
                    execute(new BitmapLoadTask(this, getContext(), this.bitmapDecoderFactory, uri2, true));
                }
            }
        }
        if (imageSource.getBitmap() != null && imageSource.getSRegion() != null) {
            onImageLoaded(Bitmap.createBitmap(imageSource.getBitmap(), imageSource.getSRegion().left, imageSource.getSRegion().top, imageSource.getSRegion().width(), imageSource.getSRegion().height()), 0, false);
        } else if (imageSource.getBitmap() != null) {
            onImageLoaded(imageSource.getBitmap(), 0, imageSource.isCached());
        } else {
            this.sRegion = imageSource.getSRegion();
            Uri uri3 = imageSource.getUri();
            this.uri = uri3;
            if (uri3 == null && imageSource.getResource() != null) {
                this.uri = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + imageSource.getResource());
            }
            if (imageSource.getTile() || this.sRegion != null) {
                execute(new TilesInitTask(this, getContext(), this.regionDecoderFactory, this.uri));
            } else {
                execute(new BitmapLoadTask(this, getContext(), this.bitmapDecoderFactory, this.uri, false));
            }
        }
    }

    private float distance(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    public PointF limitedSCenter(float f, float f2, float f3, PointF pointF) {
        PointF vTranslateForSCenter = vTranslateForSCenter(f, f2, f3);
        pointF.set((((float) (getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2))) - vTranslateForSCenter.x) / f3, (((float) (getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2))) - vTranslateForSCenter.y) / f3);
        return pointF;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        debug("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        PointF center = getCenter();
        if (this.readySent && center != null) {
            this.anim = null;
            this.pendingScale = Float.valueOf(this.scale);
            this.sPendingCenter = center;
        }
    }

    public synchronized void onTilesInited(ImageRegionDecoder imageRegionDecoder, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        debug("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.orientation));
        int i7 = this.sWidth;
        if (i7 > 0 && (i6 = this.sHeight) > 0 && !(i7 == i && i6 == i2)) {
            reset(false);
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null) {
                if (!this.bitmapIsCached) {
                    bitmap2.recycle();
                }
                this.bitmap = null;
                OnImageEventListener onImageEventListener2 = this.onImageEventListener;
                if (onImageEventListener2 != null && this.bitmapIsCached) {
                    onImageEventListener2.onPreviewReleased();
                }
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
            }
        }
        this.decoder = imageRegionDecoder;
        this.sWidth = i;
        this.sHeight = i2;
        this.sOrientation = i3;
        checkReady();
        if (!checkImageLoaded() && (i4 = this.maxTileWidth) > 0 && i4 != Integer.MAX_VALUE && (i5 = this.maxTileHeight) > 0 && i5 != Integer.MAX_VALUE && getWidth() > 0 && getHeight() > 0) {
            initialiseBaseLayer(new Point(this.maxTileWidth, this.maxTileHeight));
        }
        invalidate();
        requestLayout();
    }

    private float ease(int i, long j, float f, float f2, long j2) {
        if (i == 1) {
            return easeOutQuad(j, f, f2, j2);
        }
        if (i == 2) {
            return easeInOutQuad(j, f, f2, j2);
        }
        throw new IllegalStateException("Unexpected easing type: " + i);
    }

    private void setMatrixArray(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }
}
