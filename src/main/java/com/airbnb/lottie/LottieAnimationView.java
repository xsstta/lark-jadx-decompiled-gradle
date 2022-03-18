package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.p071c.C1787d;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.p072d.AbstractC1797e;
import com.airbnb.lottie.p072d.C1794b;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottieAnimationView extends AppCompatImageView {
    public static final AbstractC1807g<Throwable> DEFAULT_FAILURE_LISTENER = new AbstractC1807g<Throwable>() {
        /* class com.airbnb.lottie.LottieAnimationView.C17171 */

        /* renamed from: a */
        public void mo8835a(Throwable th) {
            if (C1791h.m8023a(th)) {
                C1787d.m7972a("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    };
    private static final String TAG = "LottieAnimationView";
    private String animationName;
    private int animationResId;
    private boolean autoPlay = false;
    private int buildDrawingCacheDepth = 0;
    private boolean cacheComposition = true;
    private C1792d composition;
    private C1812l<C1792d> compositionTask;
    public AbstractC1807g<Throwable> failureListener;
    public int fallbackResource = 0;
    private boolean isInitialized;
    private final AbstractC1807g<C1792d> loadedListener = new AbstractC1807g<C1792d>() {
        /* class com.airbnb.lottie.LottieAnimationView.C17182 */

        /* renamed from: a */
        public void mo8835a(C1792d dVar) {
            LottieAnimationView.this.setComposition(dVar);
        }
    };
    private final LottieDrawable lottieDrawable = new LottieDrawable();
    private Set<AbstractC1809i> lottieOnCompositionLoadedListeners = new HashSet();
    private boolean playAnimationWhenShown = false;
    private RenderMode renderMode = RenderMode.AUTOMATIC;
    private boolean wasAnimatingWhenDetached = false;
    private boolean wasAnimatingWhenNotShown = false;
    private final AbstractC1807g<Throwable> wrappedFailureListener = new AbstractC1807g<Throwable>() {
        /* class com.airbnb.lottie.LottieAnimationView.C17193 */

        /* renamed from: a */
        public void mo8835a(Throwable th) {
            AbstractC1807g<Throwable> gVar;
            if (LottieAnimationView.this.fallbackResource != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
            }
            if (LottieAnimationView.this.failureListener == null) {
                gVar = LottieAnimationView.DEFAULT_FAILURE_LISTENER;
            } else {
                gVar = LottieAnimationView.this.failureListener;
            }
            gVar.mo8835a(th);
        }
    };

    public C1792d getComposition() {
        return this.composition;
    }

    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.mo8893g();
    }

    public int getFrame() {
        return this.lottieDrawable.mo8918t();
    }

    public String getImageAssetsFolder() {
        return this.lottieDrawable.mo8889e();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.mo8908o();
    }

    public float getMinFrame() {
        return this.lottieDrawable.mo8907n();
    }

    public C1815m getPerformanceTracker() {
        return this.lottieDrawable.mo8892f();
    }

    public float getProgress() {
        return this.lottieDrawable.mo8848D();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.mo8921v();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.mo8919u();
    }

    public float getScale() {
        return this.lottieDrawable.mo8925z();
    }

    public float getSpeed() {
        return this.lottieDrawable.mo8910q();
    }

    public boolean hasMasks() {
        return this.lottieDrawable.mo8867a();
    }

    public boolean hasMatte() {
        return this.lottieDrawable.mo8875b();
    }

    public boolean isAnimating() {
        return this.lottieDrawable.mo8922w();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.mo8886d();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.mo8912s();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.mo8911r();
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.mo8909p();
    }

    private void clearComposition() {
        this.composition = null;
        this.lottieDrawable.mo8899i();
    }

    public void cancelAnimation() {
        this.wasAnimatingWhenDetached = false;
        this.wasAnimatingWhenNotShown = false;
        this.playAnimationWhenShown = false;
        this.lottieDrawable.mo8846B();
        enableOrDisableHardwareLayer();
    }

    public long getDuration() {
        C1792d dVar = this.composition;
        if (dVar != null) {
            return (long) dVar.mo9063e();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (isAnimating()) {
            cancelAnimation();
            this.wasAnimatingWhenDetached = true;
        }
        super.onDetachedFromWindow();
    }

    private void cancelLoaderTask() {
        C1812l<C1792d> lVar = this.compositionTask;
        if (lVar != null) {
            lVar.mo9118b(this.loadedListener);
            this.compositionTask.mo9120d(this.wrappedFailureListener);
        }
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.wasAnimatingWhenDetached = false;
        this.wasAnimatingWhenNotShown = false;
        this.playAnimationWhenShown = false;
        this.lottieDrawable.mo8847C();
        enableOrDisableHardwareLayer();
    }

    public void playAnimation() {
        if (isShown()) {
            this.lottieDrawable.mo8904k();
            enableOrDisableHardwareLayer();
            return;
        }
        this.playAnimationWhenShown = true;
    }

    public void resumeAnimation() {
        if (isShown()) {
            this.lottieDrawable.mo8906m();
            enableOrDisableHardwareLayer();
            return;
        }
        this.playAnimationWhenShown = false;
        this.wasAnimatingWhenNotShown = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.LottieAnimationView$5 */
    public static /* synthetic */ class C17215 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5843a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.RenderMode[] r0 = com.airbnb.lottie.RenderMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.airbnb.lottie.LottieAnimationView.C17215.f5843a = r0
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.airbnb.lottie.LottieAnimationView.C17215.f5843a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.airbnb.lottie.LottieAnimationView.C17215.f5843a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.C17215.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.autoPlay || this.wasAnimatingWhenDetached) {
            playAnimation();
            this.autoPlay = false;
            this.wasAnimatingWhenDetached = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r3 != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void enableOrDisableHardwareLayer() {
        /*
            r5 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.C17215.f5843a
            com.airbnb.lottie.RenderMode r1 = r5.renderMode
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x003d
            if (r0 == r1) goto L_0x0013
            r3 = 3
            if (r0 == r3) goto L_0x0015
        L_0x0013:
            r1 = 1
            goto L_0x003d
        L_0x0015:
            com.airbnb.lottie.d r0 = r5.composition
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.mo9056a()
            if (r0 == 0) goto L_0x0027
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L_0x0027
            goto L_0x003b
        L_0x0027:
            com.airbnb.lottie.d r0 = r5.composition
            if (r0 == 0) goto L_0x0033
            int r0 = r0.mo9057b()
            r4 = 4
            if (r0 <= r4) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 >= r4) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r3 = 1
        L_0x003b:
            if (r3 == 0) goto L_0x0013
        L_0x003d:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L_0x0047
            r0 = 0
            r5.setLayerType(r1, r0)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.enableOrDisableHardwareLayer():void");
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5844a = this.animationName;
        savedState.f5845b = this.animationResId;
        savedState.f5846c = this.lottieDrawable.mo8848D();
        if (this.lottieDrawable.mo8922w() || (!ViewCompat.m4015I(this) && this.wasAnimatingWhenDetached)) {
            z = true;
        } else {
            z = false;
        }
        savedState.f5847d = z;
        savedState.f5848e = this.lottieDrawable.mo8889e();
        savedState.f5849f = this.lottieDrawable.mo8919u();
        savedState.f5850g = this.lottieDrawable.mo8921v();
        return savedState;
    }

    public void setCacheComposition(boolean z) {
        this.cacheComposition = z;
    }

    public void setFailureListener(AbstractC1807g<Throwable> gVar) {
        this.failureListener = gVar;
    }

    public void setFallbackResource(int i) {
        this.fallbackResource = i;
    }

    /* access modifiers changed from: private */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.airbnb.lottie.LottieAnimationView.SavedState.C17221 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        String f5844a;

        /* renamed from: b */
        int f5845b;

        /* renamed from: c */
        float f5846c;

        /* renamed from: d */
        boolean f5847d;

        /* renamed from: e */
        String f5848e;

        /* renamed from: f */
        int f5849f;

        /* renamed from: g */
        int f5850g;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f5844a = parcel.readString();
            this.f5846c = parcel.readFloat();
            this.f5847d = parcel.readInt() != 1 ? false : true;
            this.f5848e = parcel.readString();
            this.f5849f = parcel.readInt();
            this.f5850g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f5844a);
            parcel.writeFloat(this.f5846c);
            parcel.writeInt(this.f5847d ? 1 : 0);
            parcel.writeString(this.f5848e);
            parcel.writeInt(this.f5849f);
            parcel.writeInt(this.f5850g);
        }
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.mo8856a(animatorListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.mo8857a(animatorUpdateListener);
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.lottieDrawable.mo8866a(z);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.mo8871b(animatorListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(AbstractC1809i iVar) {
        return this.lottieOnCompositionLoadedListeners.remove(iVar);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.mo8872b(animatorUpdateListener);
    }

    public List<C1847d> resolveKeyPath(C1847d dVar) {
        return this.lottieDrawable.mo8851a(dVar);
    }

    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.lottieDrawable.mo8880c(z);
    }

    public void setFontAssetDelegate(C1733a aVar) {
        this.lottieDrawable.mo8859a(aVar);
    }

    public void setFrame(int i) {
        this.lottieDrawable.mo8878c(i);
    }

    public void setImageAssetDelegate(AbstractC1780b bVar) {
        this.lottieDrawable.mo8860a(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.mo8864a(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageResource(int i) {
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.mo8870b(i);
    }

    public void setMaxProgress(float f) {
        this.lottieDrawable.mo8869b(f);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.mo8854a(i);
    }

    public void setMinProgress(float f) {
        this.lottieDrawable.mo8852a(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.lottieDrawable.mo8874b(z);
    }

    public void setProgress(float f) {
        this.lottieDrawable.mo8882d(f);
    }

    public void setRenderMode(RenderMode renderMode2) {
        this.renderMode = renderMode2;
        enableOrDisableHardwareLayer();
    }

    public void setRepeatCount(int i) {
        this.lottieDrawable.mo8891e(i);
    }

    public void setRepeatMode(int i) {
        this.lottieDrawable.mo8883d(i);
    }

    public void setSafeMode(boolean z) {
        this.lottieDrawable.mo8885d(z);
    }

    public void setSpeed(float f) {
        this.lottieDrawable.mo8877c(f);
    }

    public void setTextDelegate(C1868o oVar) {
        this.lottieDrawable.mo8862a(oVar);
    }

    public boolean addLottieOnCompositionLoadedListener(AbstractC1809i iVar) {
        C1792d dVar = this.composition;
        if (dVar != null) {
            iVar.mo9109a(dVar);
        }
        return this.lottieOnCompositionLoadedListeners.add(iVar);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable2 = this.lottieDrawable;
        if (drawable2 == lottieDrawable2) {
            super.invalidateDrawable(lottieDrawable2);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void loop(boolean z) {
        int i;
        LottieDrawable lottieDrawable2 = this.lottieDrawable;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        lottieDrawable2.mo8891e(i);
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.mo8879c(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.mo8884d(str);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.mo8873b(str);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        LottieDrawable lottieDrawable2 = this.lottieDrawable;
        if (lottieDrawable2 != null) {
            lottieDrawable2.mo8858a(scaleType);
        }
    }

    private void setCompositionTask(C1812l<C1792d> lVar) {
        clearComposition();
        cancelLoaderTask();
        this.compositionTask = lVar.mo9114a(this.loadedListener).mo9119c(this.wrappedFailureListener);
    }

    public void setAnimation(int i) {
        C1812l<C1792d> lVar;
        this.animationResId = i;
        this.animationName = null;
        if (this.cacheComposition) {
            lVar = C1798e.m8067a(getContext(), i);
        } else {
            lVar = C1798e.m8068a(getContext(), i, (String) null);
        }
        setCompositionTask(lVar);
    }

    public void setAnimationFromUrl(String str) {
        C1812l<C1792d> lVar;
        if (this.cacheComposition) {
            lVar = C1798e.m8069a(getContext(), str);
        } else {
            lVar = C1798e.m8070a(getContext(), str, (String) null);
        }
        setCompositionTask(lVar);
    }

    public void setScale(float f) {
        this.lottieDrawable.mo8890e(f);
        if (getDrawable() == this.lottieDrawable) {
            setImageDrawable(null);
            setImageDrawable(this.lottieDrawable);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        init(null, R.attr.lottieAnimationViewStyle);
    }

    public void buildDrawingCache(boolean z) {
        C1783c.m7956a("buildDrawingCache");
        this.buildDrawingCacheDepth++;
        super.buildDrawingCache(z);
        if (this.buildDrawingCacheDepth == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.buildDrawingCacheDepth--;
        C1783c.m7957b("buildDrawingCache");
    }

    public void setAnimation(String str) {
        C1812l<C1792d> lVar;
        this.animationName = str;
        this.animationResId = 0;
        if (this.cacheComposition) {
            lVar = C1798e.m8078b(getContext(), str);
        } else {
            lVar = C1798e.m8079b(getContext(), str, (String) null);
        }
        setCompositionTask(lVar);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f5844a;
        this.animationName = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.animationName);
        }
        int i = savedState.f5845b;
        this.animationResId = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f5846c);
        if (savedState.f5847d) {
            playAnimation();
        }
        this.lottieDrawable.mo8864a(savedState.f5848e);
        setRepeatMode(savedState.f5849f);
        setRepeatCount(savedState.f5850g);
    }

    public void setComposition(C1792d dVar) {
        if (C1783c.f6104a) {
            String str = TAG;
            Log.v(str, "Set Composition \n" + dVar);
        }
        this.lottieDrawable.setCallback(this);
        this.composition = dVar;
        boolean a = this.lottieDrawable.mo8868a(dVar);
        enableOrDisableHardwareLayer();
        if (getDrawable() != this.lottieDrawable || a) {
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (AbstractC1809i iVar : this.lottieOnCompositionLoadedListeners) {
                iVar.mo9109a(dVar);
            }
        }
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(C1798e.m8071a(inputStream, str));
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.mo8855a(i, i2);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.lottieDrawable.mo8853a(f, f2);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        return this.lottieDrawable.mo8849a(str, bitmap);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(C1798e.m8070a(getContext(), str, str2));
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        if (this.isInitialized) {
            if (isShown()) {
                if (this.wasAnimatingWhenNotShown) {
                    resumeAnimation();
                } else if (this.playAnimationWhenShown) {
                    playAnimation();
                }
                this.wasAnimatingWhenNotShown = false;
                this.playAnimationWhenShown = false;
            } else if (isAnimating()) {
                pauseAnimation();
                this.wasAnimatingWhenNotShown = true;
            }
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    private void init(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.lottie_autoPlay, R.attr.lottie_cacheComposition, R.attr.lottie_colorFilter, R.attr.lottie_enableMergePathsForKitKatAndAbove, R.attr.lottie_fallbackRes, R.attr.lottie_fileName, R.attr.lottie_imageAssetsFolder, R.attr.lottie_loop, R.attr.lottie_progress, R.attr.lottie_rawRes, R.attr.lottie_renderMode, R.attr.lottie_repeatCount, R.attr.lottie_repeatMode, R.attr.lottie_scale, R.attr.lottie_speed, R.attr.lottie_url}, i, 0);
        if (!isInEditMode()) {
            this.cacheComposition = obtainStyledAttributes.getBoolean(1, true);
            boolean hasValue = obtainStyledAttributes.hasValue(9);
            boolean hasValue2 = obtainStyledAttributes.hasValue(5);
            boolean hasValue3 = obtainStyledAttributes.hasValue(15);
            if (!hasValue || !hasValue2) {
                if (hasValue) {
                    int resourceId = obtainStyledAttributes.getResourceId(9, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else if (hasValue2) {
                    String string2 = obtainStyledAttributes.getString(5);
                    if (string2 != null) {
                        setAnimation(string2);
                    }
                } else if (hasValue3 && (string = obtainStyledAttributes.getString(15)) != null) {
                    setAnimationFromUrl(string);
                }
                setFallbackResource(obtainStyledAttributes.getResourceId(4, 0));
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.wasAnimatingWhenDetached = true;
            this.autoPlay = true;
        }
        if (obtainStyledAttributes.getBoolean(7, false)) {
            this.lottieDrawable.mo8891e(-1);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            setRepeatMode(obtainStyledAttributes.getInt(12, 1));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            setRepeatCount(obtainStyledAttributes.getInt(11, -1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            setSpeed(obtainStyledAttributes.getFloat(14, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(6));
        setProgress(obtainStyledAttributes.getFloat(8, BitmapDescriptorFactory.HUE_RED));
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(3, false));
        if (obtainStyledAttributes.hasValue(2)) {
            addValueCallback(new C1847d("**"), AbstractC1810j.f6196C, new C1795c(new C1865n(obtainStyledAttributes.getColor(2, 0))));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            this.lottieDrawable.mo8890e(obtainStyledAttributes.getFloat(13, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            int i2 = obtainStyledAttributes.getInt(10, RenderMode.AUTOMATIC.ordinal());
            if (i2 >= RenderMode.values().length) {
                i2 = RenderMode.AUTOMATIC.ordinal();
            }
            setRenderMode(RenderMode.values()[i2]);
        }
        if (getScaleType() != null) {
            this.lottieDrawable.mo8858a(getScaleType());
        }
        obtainStyledAttributes.recycle();
        LottieDrawable lottieDrawable2 = this.lottieDrawable;
        if (C1791h.m8012a(getContext()) != BitmapDescriptorFactory.HUE_RED) {
            z = true;
        }
        lottieDrawable2.mo8863a(Boolean.valueOf(z));
        enableOrDisableHardwareLayer();
        this.isInitialized = true;
    }

    public <T> void addValueCallback(C1847d dVar, T t, C1795c<T> cVar) {
        this.lottieDrawable.mo8861a(dVar, t, cVar);
    }

    public <T> void addValueCallback(C1847d dVar, T t, final AbstractC1797e<T> eVar) {
        this.lottieDrawable.mo8861a(dVar, t, new C1795c<T>() {
            /* class com.airbnb.lottie.LottieAnimationView.C17204 */

            @Override // com.airbnb.lottie.p072d.C1795c
            /* renamed from: a */
            public T mo8839a(C1794b<T> bVar) {
                return (T) eVar.getValue(bVar);
            }
        });
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.lottieDrawable.mo8865a(str, str2, z);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i);
    }
}
