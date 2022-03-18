package com.larksuite.component.universe_design.ratingbar;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Property;
import android.widget.RatingBar;
import androidx.appcompat.widget.AppCompatRatingBar;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0002abB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010(\u001a\u0004\u0018\u00010)J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u0004\u0018\u00010\u0013J\u0006\u0010-\u001a\u00020\u0015J\u0013\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010/J\u0006\u00100\u001a\u00020\nJ\b\u00101\u001a\u0004\u0018\u00010\u001dJ\b\u00102\u001a\u00020\u0015H\u0016J\b\u00103\u001a\u0004\u0018\u00010)J\u0006\u00104\u001a\u00020\nJ\u0006\u00105\u001a\u00020\nJ\b\u00106\u001a\u000207H\u0002J\"\u00108\u001a\u0002072\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u00109\u001a\u00020:H\u0002J\u001a\u0010;\u001a\u0004\u0018\u00010\u00172\u0006\u0010&\u001a\u00020'2\u0006\u0010<\u001a\u00020\nH\u0002J\u0010\u0010=\u001a\u0002072\u0006\u0010>\u001a\u00020?H\u0014J\u0018\u0010@\u001a\u0002072\u0006\u0010A\u001a\u00020\n2\u0006\u0010B\u001a\u00020\nH\u0014J\"\u0010C\u001a\u0002072\b\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010F\u001a\u00020:H\u0016J\u0010\u0010G\u001a\u0002072\b\u0010H\u001a\u0004\u0018\u00010)J\u0010\u0010I\u001a\u0002072\b\b\u0001\u0010J\u001a\u00020\nJ\u0010\u0010K\u001a\u0002072\b\b\u0001\u0010L\u001a\u00020\nJ\u000e\u0010M\u001a\u0002072\u0006\u0010N\u001a\u00020\u0013J\u000e\u0010O\u001a\u0002072\u0006\u0010P\u001a\u00020\u0015J\u0010\u0010Q\u001a\u0002072\b\b\u0001\u0010R\u001a\u00020\nJ\u000e\u0010S\u001a\u0002072\u0006\u0010\u0019\u001a\u00020\nJ\u0010\u0010T\u001a\u0002072\u0006\u0010U\u001a\u00020\nH\u0016J\u0010\u0010V\u001a\u0002072\b\u0010W\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010X\u001a\u0002072\u0006\u0010 \u001a\u00020\u0015H\u0016J\u0010\u0010Y\u001a\u0002072\u0006\u0010Z\u001a\u00020\nH\u0016J\u0012\u0010[\u001a\u0002072\b\u0010\\\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010]\u001a\u0002072\b\u0010H\u001a\u0004\u0018\u00010)J\u000e\u0010^\u001a\u0002072\u0006\u0010$\u001a\u00020\nJ\u000e\u0010_\u001a\u0002072\u0006\u0010%\u001a\u00020\nJ\b\u0010`\u001a\u000207H\u0002R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lcom/larksuite/component/universe_design/ratingbar/UDRatingBar;", "Landroidx/appcompat/widget/AppCompatRatingBar;", "Landroid/widget/RatingBar$OnRatingBarChangeListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bgDrawable", "labelTextArray", "", "", "[Ljava/lang/CharSequence;", "labelTextColor", "labelTextDefault", "", "labelTextHeight", "", "labelTextLayout", "Landroid/text/DynamicLayout;", "labelTextSize", "labelTopPadding", "mTextPaint", "Landroid/text/TextPaint;", "ratingBarListener", "Lcom/larksuite/component/universe_design/ratingbar/UDRatingBar$OnUDRatingBarChangeListener;", "ratingDrawable", "Lcom/larksuite/component/universe_design/ratingbar/RatingDrawable;", "scale", "starAnimator", "Landroid/animation/ObjectAnimator;", "starDrawable", "starPadding", "starWidth", "textBuilder", "Landroid/text/SpannableStringBuilder;", "getBgDrawable", "Landroid/graphics/drawable/Drawable;", "getLabelText", "rating", "getLabelTextDefault", "getLabelTextSize", "getLabelTexts", "()[Ljava/lang/CharSequence;", "getLabelTopPadding", "getOnUDRatingBarChangeListener", "getScaleStars", "getStarDrawable", "getStarPadding", "getStarWidth", "initAnimator", "", "initView", "isMainThread", "", "makeLayout", "width", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRatingChanged", "ratingBar", "Landroid/widget/RatingBar;", "fromUser", "setBgDrawable", C63690d.f160779a, "setLabelTextColor", "textColor", "setLabelTextColorRes", "colorRes", "setLabelTextDefault", "defaultText", "setLabelTextSize", "textSize", "setLabelTexts", "textResId", "setLabelTopPadding", "setNumStars", "numStars", "setOnUDRatingBarChangeListener", "listener", "setScaleStars", "setSecondaryProgress", "secondaryProgress", "setStarAnimator", "animator", "setStarDrawable", "setStarPadding", "setStarWidth", "startAnimator", "Companion", "OnUDRatingBarChangeListener", "universe-ui-ratingbar_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDRatingBar extends AppCompatRatingBar implements RatingBar.OnRatingBarChangeListener {

    /* renamed from: a */
    public static final Property<UDRatingBar, Float> f63533a = new C25771b(Float.TYPE, "scaleStar");

    /* renamed from: b */
    public static final Companion f63534b = new Companion(null);

    /* renamed from: c */
    private RatingDrawable f63535c;

    /* renamed from: d */
    private int f63536d;

    /* renamed from: e */
    private int f63537e;

    /* renamed from: f */
    private int f63538f;

    /* renamed from: g */
    private int f63539g;

    /* renamed from: h */
    private DynamicLayout f63540h;

    /* renamed from: i */
    private CharSequence[] f63541i;

    /* renamed from: j */
    private String f63542j;

    /* renamed from: k */
    private float f63543k;

    /* renamed from: l */
    private int f63544l;

    /* renamed from: m */
    private float f63545m;

    /* renamed from: n */
    private int f63546n;

    /* renamed from: o */
    private final TextPaint f63547o;

    /* renamed from: p */
    private float f63548p;

    /* renamed from: q */
    private ObjectAnimator f63549q;

    /* renamed from: r */
    private OnUDRatingBarChangeListener f63550r;

    /* renamed from: s */
    private final SpannableStringBuilder f63551s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/larksuite/component/universe_design/ratingbar/UDRatingBar$OnUDRatingBarChangeListener;", "", "onRatingChanged", "", "ratingBar", "Lcom/larksuite/component/universe_design/ratingbar/UDRatingBar;", "rating", "", "fromUser", "", "universe-ui-ratingbar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.ratingbar.UDRatingBar$c */
    public interface OnUDRatingBarChangeListener {
        void onRatingChanged(UDRatingBar uDRatingBar, float f, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/larksuite/component/universe_design/ratingbar/UDRatingBar$Companion;", "", "()V", "DEFAULT_TEXT_SIZE", "", "SCALE_STAR", "Landroid/util/Property;", "Lcom/larksuite/component/universe_design/ratingbar/UDRatingBar;", "getSCALE_STAR", "()Landroid/util/Property;", "TAG", "", "universe-ui-ratingbar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.ratingbar.UDRatingBar$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getLabelTextDefault() {
        return this.f63542j;
    }

    public final float getLabelTextSize() {
        return this.f63543k;
    }

    public final CharSequence[] getLabelTexts() {
        return this.f63541i;
    }

    public final int getLabelTopPadding() {
        return this.f63546n;
    }

    public final OnUDRatingBarChangeListener getOnUDRatingBarChangeListener() {
        return this.f63550r;
    }

    public float getScaleStars() {
        return this.f63548p;
    }

    public final int getStarPadding() {
        return this.f63539g;
    }

    public final int getStarWidth() {
        return this.f63537e;
    }

    /* renamed from: b */
    private final void m92943b() {
        ObjectAnimator objectAnimator = this.f63549q;
        if (objectAnimator != null) {
            objectAnimator.setAutoCancel(true);
            objectAnimator.start();
        }
    }

    public final Drawable getBgDrawable() {
        RatingDrawable bVar = this.f63535c;
        if (bVar != null) {
            return bVar.mo91172a();
        }
        return null;
    }

    public final Drawable getStarDrawable() {
        RatingDrawable bVar = this.f63535c;
        if (bVar != null) {
            return bVar.mo91176b();
        }
        return null;
    }

    /* renamed from: c */
    private final void m92944c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f63533a, BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f63549q = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(493L);
            ofFloat.setInterpolator(new SpringInterpolator(0.841f));
        }
    }

    /* renamed from: a */
    private final boolean m92942a() {
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
        if (mainLooper.getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public final void setOnUDRatingBarChangeListener(OnUDRatingBarChangeListener cVar) {
        this.f63550r = cVar;
    }

    public final void setBgDrawable(Drawable drawable) {
        RatingDrawable bVar = this.f63535c;
        if (bVar != null) {
            bVar.mo91175a(drawable);
        }
    }

    public final void setLabelTextColor(int i) {
        if (this.f63544l != i) {
            this.f63544l = i;
        }
    }

    public final void setLabelTextDefault(String str) {
        Intrinsics.checkParameterIsNotNull(str, "defaultText");
        this.f63542j = str;
    }

    public final void setStarDrawable(Drawable drawable) {
        RatingDrawable bVar = this.f63535c;
        if (bVar != null) {
            bVar.mo91178b(drawable);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¨\u0006\n"}, d2 = {"com/larksuite/component/universe_design/ratingbar/UDRatingBar$Companion$SCALE_STAR$1", "Landroid/util/Property;", "Lcom/larksuite/component/universe_design/ratingbar/UDRatingBar;", "", "get", "udSwitch", "(Lcom/larksuite/component/universe_design/ratingbar/UDRatingBar;)Ljava/lang/Float;", "set", "", "value", "universe-ui-ratingbar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.ratingbar.UDRatingBar$b */
    public static final class C25771b extends Property<UDRatingBar, Float> {
        /* renamed from: a */
        public Float get(UDRatingBar uDRatingBar) {
            Intrinsics.checkParameterIsNotNull(uDRatingBar, "udSwitch");
            return Float.valueOf(uDRatingBar.getScaleStars());
        }

        C25771b(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public /* synthetic */ void set(UDRatingBar uDRatingBar, Float f) {
            mo91152a(uDRatingBar, f.floatValue());
        }

        /* renamed from: a */
        public void mo91152a(UDRatingBar uDRatingBar, float f) {
            Intrinsics.checkParameterIsNotNull(uDRatingBar, "udSwitch");
            uDRatingBar.setScaleStars(f);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDRatingBar(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setLabelTextColorRes(int i) {
        if (i != 0) {
            this.f63544l = getResources().getColor(i);
            invalidate();
        }
    }

    public final void setLabelTextSize(float f) {
        if (this.f63543k != f) {
            this.f63543k = f;
            invalidate();
        }
    }

    public final void setLabelTexts(int i) {
        if (i != 0) {
            this.f63541i = getResources().getTextArray(i);
            invalidate();
        }
    }

    public final void setLabelTopPadding(int i) {
        if (this.f63546n != i) {
            this.f63546n = i;
            invalidate();
        }
    }

    public void setNumStars(int i) {
        super.setNumStars(i);
        RatingDrawable bVar = this.f63535c;
        if (bVar != null) {
            bVar.mo91174a(i);
        }
    }

    public void setScaleStars(float f) {
        RatingDrawable bVar = this.f63535c;
        if (bVar != null) {
            bVar.mo91173a(f);
        }
        this.f63548p = f;
    }

    public void setStarAnimator(ObjectAnimator objectAnimator) {
        ObjectAnimator objectAnimator2 = this.f63549q;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.f63549q = objectAnimator;
    }

    public final void setStarPadding(int i) {
        if (i != this.f63539g) {
            this.f63539g = i;
            RatingDrawable bVar = this.f63535c;
            if (bVar != null) {
                bVar.mo91179c(i);
            }
            requestLayout();
        }
    }

    public final void setStarWidth(int i) {
        if (i != this.f63537e) {
            this.f63537e = i;
            RatingDrawable bVar = this.f63535c;
            if (bVar != null) {
                bVar.mo91177b(i);
            }
            requestLayout();
        }
    }

    /* renamed from: a */
    private final String m92940a(float f) {
        CharSequence charSequence;
        String obj;
        int i = (int) f;
        if (i == 0) {
            String str = this.f63542j;
            if (str != null) {
                return str;
            }
            return "";
        }
        CharSequence[] charSequenceArr = this.f63541i;
        if (charSequenceArr == null || (charSequence = charSequenceArr[i - 1]) == null || (obj = charSequence.toString()) == null) {
            return "";
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        int save = canvas.save();
        DynamicLayout dynamicLayout = this.f63540h;
        if (dynamicLayout != null) {
            int i = this.f63539g;
            canvas.translate((float) (i / 2), (float) (this.f63537e + i + this.f63546n));
            dynamicLayout.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public synchronized void setSecondaryProgress(int i) {
        RatingDrawable bVar;
        if (!m92942a()) {
            super.setSecondaryProgress(i);
            return;
        }
        if (!(this.f63549q == null || (bVar = this.f63535c) == null)) {
            bVar.mo91173a(BitmapDescriptorFactory.HUE_RED);
        }
        super.setSecondaryProgress(i);
        m92943b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final DynamicLayout m92939a(SpannableStringBuilder spannableStringBuilder, int i) {
        spannableStringBuilder.append((CharSequence) m92940a(getRating()));
        return new DynamicLayout(spannableStringBuilder, this.f63547o, i, Layout.Alignment.ALIGN_CENTER, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatRatingBar
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int a = C69029a.m265652a((double) ((this.f63537e * getNumStars()) + (getNumStars() * this.f63539g)));
        if (this.f63540h == null) {
            this.f63540h = m92939a(this.f63551s, a - this.f63539g);
        }
        setMeasuredDimension(AppCompatRatingBar.resolveSize(a, i), AppCompatRatingBar.resolveSize(C69029a.m265652a((double) (((float) (this.f63537e + this.f63539g)) + this.f63545m + ((float) this.f63546n))), i2));
    }

    public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        this.f63551s.clear();
        this.f63551s.append((CharSequence) m92940a(f));
        OnUDRatingBarChangeListener cVar = this.f63550r;
        if (cVar != null) {
            cVar.onRatingChanged(this, f, z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63547o = new TextPaint();
        this.f63548p = 1.0f;
        this.f63551s = new SpannableStringBuilder();
        m92941a(context, attributeSet, i);
    }

    /* renamed from: a */
    private final void m92941a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.isIndicator, R.attr.numStars, R.attr.rating, R.attr.stepSize, R.attr.ud_ratingBar_bgDrawable, R.attr.ud_ratingBar_labelTextColor, R.attr.ud_ratingBar_labelTextDefault, R.attr.ud_ratingBar_labelTextSize, R.attr.ud_ratingBar_labelTexts, R.attr.ud_ratingBar_labelTopPadding, R.attr.ud_ratingBar_starDrawable, R.attr.ud_ratingBar_starPadding, R.attr.ud_ratingBar_starWidth}, i, R.style.UDRatingBar);
        if (obtainStyledAttributes != null) {
            this.f63536d = obtainStyledAttributes.getResourceId(10, 0);
            this.f63537e = (int) obtainStyledAttributes.getDimension(12, BitmapDescriptorFactory.HUE_RED);
            this.f63538f = obtainStyledAttributes.getResourceId(4, 0);
            this.f63541i = obtainStyledAttributes.getTextArray(8);
            this.f63542j = obtainStyledAttributes.getString(6);
            this.f63543k = obtainStyledAttributes.getDimension(7, (float) UDDimenUtils.m93312c(context, 12.0f));
            this.f63544l = obtainStyledAttributes.getColor(5, 0);
            this.f63546n = (int) obtainStyledAttributes.getDimension(9, BitmapDescriptorFactory.HUE_RED);
            this.f63539g = (int) obtainStyledAttributes.getDimension(11, BitmapDescriptorFactory.HUE_RED);
            setNumStars(obtainStyledAttributes.getInt(1, 5));
            setIsIndicator(obtainStyledAttributes.getBoolean(0, false));
            setRating(obtainStyledAttributes.getFloat(2, BitmapDescriptorFactory.HUE_RED));
            setStepSize(obtainStyledAttributes.getFloat(3, 1.0f));
            obtainStyledAttributes.recycle();
        }
        RatingDrawable bVar = new RatingDrawable(context, this.f63537e, this.f63539g, this.f63536d, this.f63538f, true);
        this.f63535c = bVar;
        if (bVar != null) {
            bVar.mo91174a(getNumStars());
        }
        setProgressDrawableTiled(this.f63535c);
        TextPaint textPaint = this.f63547o;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.f63543k);
        textPaint.setColor(this.f63544l);
        this.f63545m = Math.abs(textPaint.getFontMetrics().top) + Math.abs(textPaint.getFontMetrics().bottom);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), (int) (((float) getPaddingBottom()) + this.f63545m + ((float) this.f63546n)));
        setOnRatingBarChangeListener(this);
        m92944c();
    }
}
