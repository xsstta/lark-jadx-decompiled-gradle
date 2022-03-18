package com.larksuite.component.universe_design.edittext;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.drawable.UDRoundDrawable;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.radius.UDRadius;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b$\b\u0016\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010C\u001a\u00020DH\u0002J0\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u0007H\u0002J0\u0010L\u001a\u00020D2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u0007H\u0002J0\u0010M\u001a\u00020D2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u0007H\u0002J*\u0010N\u001a\u00020D2\u0006\u0010F\u001a\u00020G2\u0006\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00072\b\u0010Q\u001a\u0004\u0018\u00010RH\u0002J0\u0010S\u001a\u00020D2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u0007H\u0002J8\u0010T\u001a\u00020D2\u0006\u0010U\u001a\u00020V2\u0006\u0010F\u001a\u00020G2\u0006\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0007H\u0002J$\u0010Y\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010Z2\u0006\u0010\\\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\u0007H\u0002J \u0010^\u001a\u00020V2\u0006\u0010_\u001a\u00020\u00122\u0006\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0007H\u0002J\b\u0010`\u001a\u00020\u0012H\u0002J\u0012\u0010a\u001a\u00020\u00072\b\u0010b\u001a\u0004\u0018\u00010cH\u0002J\u0006\u0010d\u001a\u00020\u0007J\b\u0010e\u001a\u0004\u0018\u00010\u0018J\u0018\u0010f\u001a\u00020\u00072\u0006\u0010g\u001a\u00020\u00182\u0006\u0010]\u001a\u00020\u0007H\u0002J\b\u0010h\u001a\u0004\u0018\u00010\u0018J\b\u0010i\u001a\u00020\u0007H\u0002J\u0018\u0010j\u001a\u00020\u00072\u0006\u0010k\u001a\u00020\u00122\u0006\u0010l\u001a\u00020mH\u0002J\b\u0010n\u001a\u00020DH\u0002J\b\u0010o\u001a\u00020DH\u0002J\b\u0010p\u001a\u00020DH\u0002J\u001a\u0010q\u001a\u00020D2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010r\u001a\u00020DH\u0002J\b\u0010s\u001a\u00020DH\u0002J\u001a\u0010t\u001a\u00020D2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010u\u001a\u00020\r2\u0006\u0010v\u001a\u00020wH\u0002J\u0010\u0010x\u001a\u00020\r2\u0006\u0010v\u001a\u00020wH\u0002J\u0010\u0010y\u001a\u00020\r2\u0006\u0010v\u001a\u00020wH\u0002J\u0010\u0010z\u001a\u00020\r2\u0006\u0010v\u001a\u00020wH\u0002J\u0006\u0010{\u001a\u00020\rJ\u0006\u0010|\u001a\u00020\rJ\u0006\u0010}\u001a\u00020\rJ\u0010\u0010~\u001a\u00020D2\u0006\u0010F\u001a\u00020GH\u0014J\u0010\u0010\u001a\u00020\r2\u0006\u0010v\u001a\u00020wH\u0016J!\u0010\u0001\u001a\u00020Z2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\u0007H\u0002J\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\rJ\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\rJ\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0007J\u000f\u0010\u0001\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u0018J\u0012\u0010\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u0001\u001a\u00020\u0007J\u000f\u0010\u0001\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u0018J\u0012\u0010\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u0001\u001a\u00020\u0007J\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u000203J-\u0010\u0001\u001a\u00020D2\u0007\u0010\u0001\u001a\u00020\u00072\u0007\u0010\u0001\u001a\u00020\u00072\u0007\u0010\u0001\u001a\u00020\u00072\u0007\u0010\u0001\u001a\u00020\u0007H\u0016J\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\rJ\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0012J\t\u0010\u0001\u001a\u00020\rH\u0002J\u0007\u0010\u0001\u001a\u00020DJ\u0010\u0010\u0001\u001a\u00020D2\u0007\u0010\u0001\u001a\u00020\u0018J\u0007\u0010\u0001\u001a\u00020DJ\u0010\u0010\u0001\u001a\u00020D2\u0007\u0010\u0001\u001a\u00020\u0018J\t\u0010\u0001\u001a\u00020DH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u00101\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010:\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/larksuite/component/universe_design/edittext/UDEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mActionButtonHeight", "mActionButtonWidth", "mActionIconClicking", "", "mActionIconTouched", "mBgColor", "Landroid/content/res/ColorStateList;", "mBottomTagText", "", "mBottomTextHeight", "mBottomTextMargin", "mCharactersCountIsValid", "mClearBtnEnabled", "mClearIconDrawable", "Landroid/graphics/drawable/Drawable;", "mCornerRadius", "mCounterEnabled", "mCounterMaxLength", "mErrorDrawable", "mErrorStrokeColor", "mExtraPaddingBottom", "mExtraPaddingLeft", "mExtraPaddingRight", "mExtraPaddingTop", "mHidePasswordDrawable", "mIconBgPaint", "Landroid/text/TextPaint;", "mIconHeight", "mIconPadding", "mIconShowPress", "mIconViewClicking", "mIconWidth", "mInnerPaddingBottom", "mInnerPaddingLeft", "mInnerPaddingRight", "mInnerPaddingTop", "mIsErrorState", "mLeftIconDrawable", "mLeftIconMargin", "mLeftIconTint", "mLengthChecker", "Lcom/larksuite/component/universe_design/edittext/ILengthChecker;", "mMinCharacterCount", "mNormalDrawable", "mPasswordIsVisible", "mPasswordToggleEnabled", "mRightIconDrawable", "mRightIconMargin", "mRightIconTint", "mRightTagText", "mShowPasswordDrawable", "mStrokeColor", "mStrokeRadius", "mStrokeWidth", "mTextPaint", "mTextTagHeight", "mTextTagHorizontalPadding", "checkCharactersCount", "", "drawActionButton", "canvas", "Landroid/graphics/Canvas;", "startX", "endX", "startY", "endY", "drawCharacterCounter", "drawIcons", "drawTagDrawable", "dx", "dy", "tagDrawable", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable;", "drawTextTag", "drawTextView", "textView", "Landroid/widget/TextView;", "width", "height", "generateIconBitmap", "Landroid/graphics/Bitmap;", "origin", "iconWidth", "iconHeight", "generateTextView", "textContent", "getCharacterCounterText", "getCharacterLength", "text", "Landroid/text/Editable;", "getCounterMaxLength", "getErrorBg", "getIconTop", "drawable", "getNormalBg", "getRightTagTop", "getTextWidth", "content", "textSizeDp", "", "handleSwitchPasswordInputVisibility", "initBackground", "initEditText", "initInnerPadding", "initPadding", "initTextWatcher", "initView", "insideActionIcon", "event", "Landroid/view/MotionEvent;", "insideClearActionIcon", "insideIconView", "insideShowPasswordActionIcon", "isClearBtnEnabled", "isCounterEnabled", "isPasswordToggleEnabled", "onDraw", "onTouchEvent", "scaleIcon", "setClearBtnEnabled", "enable", "setCounterEnabled", "counterEnabled", "setCounterMaxLength", "max", "setIconLeft", "res", "setIconRight", "setLengthChecker", "lengthChecker", "setPadding", "left", "top", "right", "bottom", "setPasswordToggleEnabled", "setRightTagText", "rightTagText", "showCharacterCount", "showErrorBg", "errorDrawable", "showNormalBg", "normalDrawable", "togglePasswordIconVisibility", "Companion", "universe-ui-edittext_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDEditText extends AppCompatEditText {

    /* renamed from: e */
    public static final Companion f63364e = new Companion(null);

    /* renamed from: A */
    private int f63365A;

    /* renamed from: B */
    private int f63366B;

    /* renamed from: C */
    private int f63367C;

    /* renamed from: D */
    private int f63368D;

    /* renamed from: E */
    private int f63369E;

    /* renamed from: F */
    private int f63370F;

    /* renamed from: G */
    private Drawable f63371G;

    /* renamed from: H */
    private Drawable f63372H;

    /* renamed from: I */
    private int f63373I;

    /* renamed from: J */
    private int f63374J;

    /* renamed from: K */
    private boolean f63375K;

    /* renamed from: L */
    private int f63376L;

    /* renamed from: M */
    private int f63377M;

    /* renamed from: N */
    private TextPaint f63378N;

    /* renamed from: O */
    private TextPaint f63379O;

    /* renamed from: P */
    private boolean f63380P;

    /* renamed from: Q */
    private ILengthChecker f63381Q;

    /* renamed from: R */
    private String f63382R;

    /* renamed from: S */
    private String f63383S;

    /* renamed from: T */
    private int f63384T;

    /* renamed from: U */
    private int f63385U;

    /* renamed from: V */
    private boolean f63386V;

    /* renamed from: W */
    private int f63387W;

    /* renamed from: a */
    private ColorStateList f63388a;
    private boolean aa;
    private boolean ab;
    private boolean ac;

    /* renamed from: b */
    private ColorStateList f63389b;

    /* renamed from: c */
    private int f63390c;

    /* renamed from: d */
    private int f63391d;

    /* renamed from: f */
    private int f63392f;

    /* renamed from: g */
    private int f63393g;

    /* renamed from: h */
    private int f63394h;

    /* renamed from: i */
    private int f63395i;

    /* renamed from: j */
    private int f63396j;

    /* renamed from: k */
    private int f63397k;

    /* renamed from: l */
    private int f63398l;

    /* renamed from: m */
    private int f63399m;

    /* renamed from: n */
    private int f63400n;

    /* renamed from: o */
    private Drawable f63401o;

    /* renamed from: p */
    private Drawable f63402p;

    /* renamed from: q */
    private boolean f63403q;

    /* renamed from: r */
    private boolean f63404r;

    /* renamed from: s */
    private Drawable f63405s;

    /* renamed from: t */
    private boolean f63406t;

    /* renamed from: u */
    private Drawable f63407u;

    /* renamed from: v */
    private Drawable f63408v;

    /* renamed from: w */
    private boolean f63409w;

    /* renamed from: x */
    private int f63410x;

    /* renamed from: y */
    private int f63411y;

    /* renamed from: z */
    private int f63412z;

    public UDEditText(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public UDEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public UDEditText(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/universe_design/edittext/UDEditText$Companion;", "", "()V", "BOTTOM_TEXT_HEIGHT_DP", "", "BOTTOM_TEXT_MARGIN_DP", "ICON_CORNER_RADIUS_DP", "ICON_PADDING_DP", "ICON_SIZE_DP", "LEFT_ICON_MARGIN_DP", "RIGHT_ICON_MARGIN_DP", "TEXT_SIZE_12", "TEXT_SIZE_16", "TEXT_TAG_HORIZONTAL_PADDING_DP", "universe-ui-edittext_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.edittext.UDEditText$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getCounterMaxLength() {
        return this.f63374J;
    }

    public final Drawable getErrorBg() {
        return this.f63402p;
    }

    public final Drawable getNormalBg() {
        return this.f63401o;
    }

    /* renamed from: n */
    public final boolean mo90936n() {
        return this.f63406t;
    }

    /* renamed from: o */
    public final boolean mo90937o() {
        return this.f63375K;
    }

    /* renamed from: a */
    private final boolean m92814a(MotionEvent motionEvent) {
        if (this.f63372H == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int width = getWidth();
        int height = getHeight();
        int i = ((width - this.f63396j) - this.f63411y) - this.f63410x;
        int scrollY = getScrollY();
        if (x < ((float) i) || x >= ((float) width) || y < ((float) scrollY) || y >= ((float) height)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m92812a(Canvas canvas, int i, int i2, UDTagsDrawable uDTagsDrawable) {
        canvas.save();
        canvas.translate((float) i, (float) i2);
        if (uDTagsDrawable != null) {
            uDTagsDrawable.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private final void m92813a(TextView textView, Canvas canvas, int i, int i2, int i3, int i4) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(textView);
        linearLayout.measure(i3, i4);
        linearLayout.layout(0, 0, i3, i4);
        canvas.save();
        canvas.translate((float) i, (float) i2);
        linearLayout.draw(canvas);
        canvas.restore();
    }

    /* renamed from: a */
    public final void mo90927a(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "errorDrawable");
        this.f63402p = drawable;
        setBackground(drawable);
        this.f63403q = true;
    }

    /* renamed from: a */
    public final UDEditText mo90926a(boolean z) {
        this.f63404r = z;
        mo44995f();
        return this;
    }

    /* renamed from: l */
    public final void mo90934l() {
        Drawable drawable = this.f63402p;
        if (drawable != null) {
            mo90927a(drawable);
        }
    }

    /* renamed from: m */
    public final void mo90935m() {
        Drawable drawable = this.f63401o;
        if (drawable != null) {
            mo90929b(drawable);
        }
    }

    /* renamed from: c */
    private final void mo35489c() {
        this.f63409w = !this.f63409w;
        mo35490d();
    }

    /* renamed from: e */
    private final void mo44994e() {
        addTextChangedListener(new C25754b(this));
    }

    /* renamed from: g */
    private final boolean mo44996g() {
        if (this.f63374J <= 0 || !this.f63375K) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final void mo16677b() {
        UDRoundDrawable a = UDRoundDrawable.f63117b.mo90362a(this.f63388a, this.f63390c, this.f63389b, this.f63391d);
        this.f63401o = a;
        setBackground(a);
    }

    /* renamed from: d */
    private final void mo35490d() {
        PasswordTransformationMethod passwordTransformationMethod;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f63409w) {
            passwordTransformationMethod = null;
        } else {
            passwordTransformationMethod = PasswordTransformationMethod.getInstance();
        }
        setTransformationMethod(passwordTransformationMethod);
        setSelection(selectionStart, selectionEnd);
    }

    /* renamed from: k */
    public final void mo90933k() {
        int a;
        int i;
        boolean z = true;
        if (mo44996g() && ((a = m92806a(getText())) < this.f63373I || ((i = this.f63374J) > 0 && a > i))) {
            z = false;
        }
        this.f63380P = z;
    }

    private final String getCharacterCounterText() {
        if (this.f63374J <= 0) {
            return "";
        }
        return String.valueOf(m92806a(getText())) + " / " + this.f63374J;
    }

    private final int getRightTagTop() {
        if (!TextUtils.isEmpty(this.f63383S) || mo44996g()) {
            return (((((getHeight() - this.f63393g) - this.f63394h) - this.f63384T) - this.f63377M) - this.f63376L) / 2;
        }
        return (((getHeight() - this.f63393g) - this.f63394h) - this.f63384T) / 2;
    }

    /* renamed from: f */
    private final void mo44995f() {
        this.f63397k = 0;
        this.f63398l = 0;
        this.f63400n = 0;
        this.f63399m = 0;
        if (this.f63404r) {
            this.f63400n = 0 + this.f63367C + this.f63365A;
        }
        if (this.f63406t) {
            this.f63400n += this.f63367C + this.f63365A;
        }
        if (this.f63372H != null) {
            this.f63400n += this.f63367C + this.f63411y;
        }
        String str = this.f63382R;
        if (str != null) {
            this.f63400n += this.f63367C + m92807a(str, 12.0f) + this.f63385U;
        }
        if (this.f63371G != null) {
            this.f63399m = this.f63411y + this.f63368D;
        }
        if (mo44996g()) {
            this.f63398l += this.f63377M + this.f63376L;
        }
        if (!TextUtils.isEmpty(this.f63383S)) {
            this.f63398l += this.f63384T + this.f63376L;
        }
        super.setPaddingRelative(this.f63395i + this.f63399m, this.f63393g, this.f63396j + this.f63400n, this.f63394h + this.f63398l);
    }

    /* renamed from: a */
    private final void mo16676a() {
        this.f63402p = UDRoundDrawable.f63117b.mo90362a(this.f63388a, this.f63390c, ColorStateList.valueOf(this.f63392f), this.f63391d);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.f63365A = (int) UDDimenUtils.m93307a(context, 20.0f);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        this.f63366B = (int) UDDimenUtils.m93307a(context2, 20.0f);
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        this.f63405s = UDIconUtils.getIconDrawable(context3, (int) R.drawable.ud_icon_close_filled, this.f63370F);
        if (this.f63406t) {
            mo35490d();
        }
        Context context4 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "context");
        this.f63407u = UDIconUtils.getIconDrawable(context4, R.drawable.ic_ud_edittext_show_password);
        Context context5 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context5, "context");
        this.f63408v = UDIconUtils.getIconDrawable(context5, R.drawable.ic_ud_edittext_hide_password);
        Context context6 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context6, "context");
        this.f63376L = (int) UDDimenUtils.m93307a(context6, 2.0f);
        Context context7 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context7, "context");
        this.f63377M = (int) UDDimenUtils.m93307a(context7, 18.0f);
        Context context8 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context8, "context");
        this.f63384T = (int) UDDimenUtils.m93307a(context8, 18.0f);
        Context context9 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context9, "context");
        this.f63385U = ((int) UDDimenUtils.m93307a(context9, 4.0f)) * 2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/larksuite/component/universe_design/edittext/UDEditText$initTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "universe-ui-edittext_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.edittext.UDEditText$b */
    public static final class C25754b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ UDEditText f63413a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25754b(UDEditText uDEditText) {
            this.f63413a = uDEditText;
        }

        public void afterTextChanged(Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "s");
            this.f63413a.mo90933k();
        }
    }

    /* renamed from: a */
    public final UDEditText mo90925a(ILengthChecker aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "lengthChecker");
        this.f63381Q = aVar;
        return this;
    }

    /* renamed from: a */
    public final UDEditText mo90924a(int i) {
        this.f63374J = i;
        mo44995f();
        postInvalidate();
        return this;
    }

    /* renamed from: b */
    public final UDEditText mo90928b(boolean z) {
        this.f63375K = z;
        mo44995f();
        postInvalidate();
        return this;
    }

    /* renamed from: a */
    private final int m92806a(Editable editable) {
        if (editable == null) {
            return 0;
        }
        ILengthChecker aVar = this.f63381Q;
        if (aVar != null) {
            return aVar.mo90948a(editable.toString());
        }
        return editable.length();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        int scrollX = getScrollX();
        int scrollX2 = getScrollX() + getWidth();
        int scrollY = getScrollY();
        int scrollY2 = getScrollY() + getHeight();
        m92820c(canvas, scrollX, scrollX2, scrollY, scrollY2);
        m92811a(canvas, scrollX, scrollX2, scrollY, scrollY2);
        m92823d(canvas, scrollX, scrollX2, scrollY, scrollY2);
        m92817b(canvas, scrollX, scrollX2, scrollY, scrollY2);
        super.onDraw(canvas);
    }

    /* renamed from: c */
    private final boolean m92821c(MotionEvent motionEvent) {
        if (!this.f63404r) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int width = getWidth();
        int height = getHeight();
        int i = ((width - this.f63396j) - this.f63367C) - this.f63365A;
        if (mo90936n()) {
            int i2 = this.f63367C;
            int i3 = this.f63365A;
            i -= i2 + i3;
            width -= (i2 / 2) + i3;
        }
        if (this.f63372H != null) {
            int i4 = this.f63367C;
            int i5 = this.f63411y;
            i -= i4 + i5;
            width -= i4 + i5;
        }
        String str = this.f63382R;
        if (str != null) {
            int a = m92807a(str, 12.0f) + this.f63385U + this.f63367C;
            i -= a;
            width -= a;
        }
        int scrollY = getScrollY();
        if (x < ((float) i) || x >= ((float) width) || y < ((float) scrollY) || y >= ((float) height)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final boolean m92824d(MotionEvent motionEvent) {
        if (!this.f63406t) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int width = getWidth();
        int height = getHeight();
        int i = this.f63367C;
        int i2 = ((width - this.f63396j) - i) - this.f63365A;
        if (this.f63372H != null) {
            int i3 = this.f63411y;
            i2 -= i + i3;
            width -= i + i3;
        }
        String str = this.f63382R;
        if (str != null) {
            int a = m92807a(str, 12.0f) + this.f63385U + this.f63367C;
            i2 -= a;
            width -= a;
        }
        int scrollY = getScrollY();
        if (x < ((float) i2) || x >= ((float) width) || y < ((float) scrollY) || y >= ((float) height)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m92818b(MotionEvent motionEvent) {
        if (m92821c(motionEvent) || m92824d(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (hasFocus() && ((this.f63404r || this.f63406t || this.f63386V) && isEnabled())) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.ab) {
                        if (!m92821c(motionEvent)) {
                            mo35489c();
                        } else if (!TextUtils.isEmpty(getText())) {
                            setText((CharSequence) null);
                        }
                        this.ab = false;
                    }
                    if (this.aa) {
                        this.aa = false;
                        return true;
                    }
                    this.aa = false;
                    if (this.ac) {
                        this.ac = false;
                        invalidate();
                    }
                } else if (action == 2) {
                    if (this.ab && !m92818b(motionEvent)) {
                        this.ab = false;
                    }
                    if (this.aa) {
                        return true;
                    }
                } else if (action == 3) {
                    this.aa = false;
                    this.ab = false;
                    this.ac = false;
                }
            } else if (m92818b(motionEvent)) {
                this.aa = true;
                this.ab = true;
                return true;
            } else {
                if (this.ab && !m92818b(motionEvent)) {
                    this.ab = false;
                }
                if (this.aa) {
                    return true;
                }
                if (m92814a(motionEvent)) {
                    this.ac = true;
                    invalidate();
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public final void mo90929b(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "normalDrawable");
        this.f63401o = drawable;
        setBackground(drawable);
        this.f63403q = false;
    }

    /* renamed from: a */
    private final int m92805a(Drawable drawable, int i) {
        if (!TextUtils.isEmpty(this.f63383S) || mo44996g()) {
            return (((((getHeight() - this.f63393g) - this.f63394h) - i) - this.f63377M) - this.f63376L) / 2;
        }
        return (((getHeight() - this.f63393g) - this.f63394h) - i) / 2;
    }

    /* renamed from: b */
    private final void m92816b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842965, 16842966, 16842967, 16842968, 16842969});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f63395i = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f63393g = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
        this.f63396j = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f63394h = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final int m92807a(String str, float f) {
        TextPaint textPaint = this.f63378N;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        textPaint.setTextSize(UDDimenUtils.m93307a(context, f));
        return (int) this.f63378N.measureText(str);
    }

    /* renamed from: a */
    private final void m92810a(Context context, AttributeSet attributeSet) {
        mo16677b();
        mo16676a();
        m92816b(context, attributeSet);
        mo44995f();
        mo44994e();
        mo90933k();
    }

    /* renamed from: a */
    private final TextView m92808a(String str, int i, int i2) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(1, 12.0f);
        textView.setWidth(i);
        textView.setHeight(i2);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        textView.setTextColor(context.getResources().getColor(R.color.text_placeholder));
        return textView;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f63395i = i;
        this.f63396j = i3;
        this.f63393g = i2;
        this.f63394h = i4;
        mo44995f();
        postInvalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63378N = new TextPaint(1);
        this.f63379O = new TextPaint(1);
        this.f63386V = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_backgroundColor, R.attr.ud_editText_bottomTagText, R.attr.ud_editText_clearBtnEnabled, R.attr.ud_editText_counterEnabled, R.attr.ud_editText_counterMaxLength, R.attr.ud_editText_errorStrokeColor, R.attr.ud_editText_iconHeight, R.attr.ud_editText_iconInputMargin, R.attr.ud_editText_iconShowPressStatus, R.attr.ud_editText_iconWidth, R.attr.ud_editText_leftIcon, R.attr.ud_editText_leftIconTint, R.attr.ud_editText_passwordToggleEnabled, R.attr.ud_editText_rightIcon, R.attr.ud_editText_rightIconTint, R.attr.ud_editText_rightTagText, R.attr.ud_radius, R.attr.ud_strokeColor, R.attr.ud_strokeWidth}, i, i2);
        this.f63388a = obtainStyledAttributes.getColorStateList(0);
        this.f63389b = obtainStyledAttributes.getColorStateList(17);
        this.f63390c = obtainStyledAttributes.getDimensionPixelSize(18, 0);
        int i3 = obtainStyledAttributes.getInt(16, 0);
        this.f63391d = i3;
        if (i3 > 0) {
            this.f63391d = UDRadius.Companion.mo91123a(this.f63391d).getRadiusSize(context);
        }
        this.f63392f = obtainStyledAttributes.getColor(5, UDColorUtils.getColor(context, R.color.function_danger_500));
        this.f63404r = obtainStyledAttributes.getBoolean(2, false);
        this.f63406t = obtainStyledAttributes.getBoolean(12, false);
        this.f63368D = obtainStyledAttributes.getDimensionPixelSize(7, (int) UDDimenUtils.m93307a(context, 8.0f));
        this.f63367C = obtainStyledAttributes.getDimensionPixelSize(7, (int) UDDimenUtils.m93307a(context, 12.0f));
        this.f63411y = obtainStyledAttributes.getDimensionPixelSize(9, (int) UDDimenUtils.m93307a(context, 20.0f));
        this.f63412z = obtainStyledAttributes.getDimensionPixelSize(6, (int) UDDimenUtils.m93307a(context, 20.0f));
        this.f63386V = obtainStyledAttributes.getBoolean(8, true);
        this.f63410x = (int) UDDimenUtils.m93307a(context, 2.0f);
        this.f63387W = (int) UDDimenUtils.m93307a(context, 4.0f);
        this.f63369E = obtainStyledAttributes.getColor(11, UDColorUtils.getColor(context, R.color.icon_n3));
        this.f63370F = obtainStyledAttributes.getColor(14, UDColorUtils.getColor(context, R.color.icon_n2));
        int resourceId = obtainStyledAttributes.getResourceId(10, -1);
        if (resourceId != -1) {
            this.f63371G = UDIconUtils.getIconDrawable(context, resourceId, this.f63369E);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, -1);
        if (resourceId2 != -1) {
            this.f63372H = UDIconUtils.getIconDrawable(context, resourceId2, this.f63370F);
        }
        this.f63382R = obtainStyledAttributes.getString(15);
        this.f63383S = obtainStyledAttributes.getString(1);
        this.f63374J = obtainStyledAttributes.getInt(4, 0);
        this.f63375K = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        m92810a(context, attributeSet);
    }

    /* renamed from: b */
    private final void m92817b(Canvas canvas, int i, int i2, int i3, int i4) {
        if (mo44996g() || !this.f63380P) {
            int a = m92807a(getCharacterCounterText(), 12.0f);
            int i5 = this.f63377M;
            int i6 = (i2 - this.f63396j) - a;
            int i7 = (i4 - this.f63394h) - i5;
            TextView a2 = m92808a(getCharacterCounterText(), a, i5);
            if (this.f63380P) {
                a2.setTextColor(getResources().getColor(R.color.text_placeholder));
                mo90935m();
            } else {
                a2.setTextColor(getResources().getColor(R.color.function_danger_500));
                mo90934l();
            }
            m92813a(a2, canvas, i6, i7, a, i5);
        }
    }

    /* renamed from: c */
    private final void m92820c(Canvas canvas, int i, int i2, int i3, int i4) {
        Drawable drawable = this.f63371G;
        if (drawable != null) {
            int i5 = this.f63395i + i;
            int a = this.f63393g + i3 + m92805a(drawable, this.f63412z);
            drawable.setBounds(i5, a, this.f63411y + i5, this.f63412z + a);
            drawable.draw(canvas);
        }
        if (this.ac) {
            int i6 = this.f63396j;
            int i7 = (i2 - i6) - this.f63411y;
            int i8 = this.f63410x;
            int i9 = i7 - (i8 * 2);
            int i10 = this.f63393g + i3;
            int i11 = this.f63412z + i10 + (i8 * 2);
            TextPaint textPaint = this.f63379O;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            textPaint.setColor(context.getResources().getColor(R.color.udtoken_btn_text_bg_neutral_hover));
            int i12 = this.f63387W;
            canvas.drawRoundRect((float) i9, (float) i10, (float) (i2 - i6), (float) i11, (float) i12, (float) i12, this.f63379O);
        }
        Drawable drawable2 = this.f63372H;
        if (drawable2 != null) {
            int i13 = ((i2 - this.f63396j) - this.f63411y) - this.f63410x;
            int a2 = this.f63393g + i3 + m92805a(drawable2, this.f63412z);
            drawable2.setBounds(i13, a2, this.f63411y + i13, this.f63412z + a2);
            drawable2.draw(canvas);
        }
    }

    /* renamed from: d */
    private final void m92823d(Canvas canvas, int i, int i2, int i3, int i4) {
        Drawable drawable;
        if (hasFocus() && isEnabled() && !TextUtils.isEmpty(getText())) {
            boolean z = this.f63404r;
            if (z || this.f63406t) {
                if (z) {
                    int i5 = (i2 - this.f63396j) - this.f63365A;
                    Drawable drawable2 = this.f63405s;
                    if (drawable2 != null) {
                        if (this.f63372H != null) {
                            i5 -= this.f63411y + this.f63367C;
                        }
                        String str = this.f63382R;
                        if (str != null) {
                            i5 -= (m92807a(str, 12.0f) + this.f63385U) + this.f63367C;
                        }
                        if (this.f63406t) {
                            i5 -= this.f63365A + this.f63367C;
                        }
                        int a = this.f63393g + i3 + m92805a(drawable2, this.f63366B);
                        drawable2.setBounds(i5, a, this.f63365A + i5, this.f63366B + a);
                        drawable2.draw(canvas);
                    }
                }
                if (this.f63406t) {
                    int i6 = (i2 - this.f63396j) - this.f63365A;
                    if (this.f63409w) {
                        drawable = this.f63407u;
                    } else {
                        drawable = this.f63408v;
                    }
                    if (drawable != null) {
                        if (this.f63372H != null) {
                            i6 -= this.f63411y + this.f63367C;
                        }
                        String str2 = this.f63382R;
                        if (str2 != null) {
                            i6 -= (m92807a(str2, 12.0f) + this.f63385U) + this.f63367C;
                        }
                        int a2 = i3 + this.f63393g + m92805a(drawable, this.f63366B);
                        drawable.setBounds(i6, a2, this.f63365A + i6, this.f63366B + a2);
                        drawable.draw(canvas);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m92811a(Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        String str = this.f63382R;
        if (str != null) {
            int a = m92807a(str, 12.0f) + this.f63385U;
            int i7 = this.f63384T;
            if (this.f63372H != null) {
                i6 = (((i2 - this.f63396j) - a) - this.f63411y) - this.f63367C;
            } else {
                i6 = (i2 - this.f63396j) - a;
            }
            int rightTagTop = i3 + this.f63393g + getRightTagTop();
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDTagsDrawable.Builder bVar = new UDTagsDrawable.Builder(context);
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            UDTagsDrawable i8 = bVar.mo91384a(new UDTagsDrawable.TagModel.Builder(context2).mo91418a(str).mo91417a(UDTagsDrawable.TagColorSet.GRAY).mo91427g()).mo91398i();
            if (i8 != null) {
                i8.setBounds(0, 0, a, i7);
            }
            m92812a(canvas, i6, rightTagTop, i8);
        }
        String str2 = this.f63383S;
        if (str2 != null) {
            int a2 = m92807a(str2, 12.0f) + this.f63385U;
            int i9 = this.f63384T;
            if (mo44996g()) {
                i2 = (i2 - this.f63396j) - m92807a(getCharacterCounterText(), 12.0f);
                i5 = this.f63367C;
            } else {
                i5 = this.f63396j;
            }
            int i10 = (i2 - i5) - a2;
            int i11 = (i4 - this.f63394h) - this.f63384T;
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            UDTagsDrawable.Builder bVar2 = new UDTagsDrawable.Builder(context3);
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            UDTagsDrawable i12 = bVar2.mo91384a(new UDTagsDrawable.TagModel.Builder(context4).mo91418a(str2).mo91417a(UDTagsDrawable.TagColorSet.GRAY).mo91427g()).mo91398i();
            if (i12 != null) {
                i12.setBounds(0, 0, a2, i9);
            }
            m92812a(canvas, i10, i11, i12);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UDEditText(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
