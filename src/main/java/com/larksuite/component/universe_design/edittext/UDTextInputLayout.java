package com.larksuite.component.universe_design.edittext;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 42\u00020\u0001:\u00014B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ \u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u0004\u0018\u00010\u0010J\b\u0010&\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020\u001fH\u0002J\b\u0010(\u001a\u00020\u001fH\u0002J\b\u0010)\u001a\u00020\u001fH\u0002J\u001a\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010\u00122\u0006\u0010,\u001a\u00020\u0014H\u0002J\u001a\u0010-\u001a\u00020\u001f2\b\u0010.\u001a\u0004\u0018\u00010\u00122\u0006\u0010,\u001a\u00020\u0007H\u0002J\u0006\u0010/\u001a\u00020\u001fJ\u0010\u0010/\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u00010\u0012J\u0018\u0010/\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u00010\u00122\u0006\u0010,\u001a\u00020\u0007J\u0006\u00101\u001a\u00020\u001fJ\u0010\u00101\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u00010\u0012J\u0018\u00101\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u00010\u00122\u0006\u0010,\u001a\u00020\u0014J\u0018\u00101\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u00010\u00122\u0006\u0010,\u001a\u00020\u0007J\u0010\u00103\u001a\u00020\u001f2\b\u0010.\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/larksuite/component/universe_design/edittext/UDTextInputLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mBottomInputMargin", "mBottomTextSize", "", "mBottomTextView", "Landroid/widget/TextView;", "mEditText", "Landroid/widget/EditText;", "mErrorText", "", "mErrorTextColor", "Landroid/content/res/ColorStateList;", "mHelperText", "mHelperTextColor", "mInputFrame", "Landroid/widget/FrameLayout;", "mTitleInputMargin", "mTitleText", "mTitleTextColor", "mTitleTextSize", "mTopTextView", "addView", "", "child", "Landroid/view/View;", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "getEditText", "initBottomTextView", "initInputFrame", "initTopTextView", "initView", "refreshBottomText", "showText", "textColor", "refreshTitleText", "titleText", "showErrorText", "errorText", "showHelperText", "helperText", "showTitleText", "Companion", "universe-ui-edittext_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDTextInputLayout extends LinearLayout {

    /* renamed from: a */
    public static final Companion f63414a = new Companion(null);

    /* renamed from: b */
    private CharSequence f63415b;

    /* renamed from: c */
    private int f63416c;

    /* renamed from: d */
    private float f63417d;

    /* renamed from: e */
    private int f63418e;

    /* renamed from: f */
    private CharSequence f63419f;

    /* renamed from: g */
    private ColorStateList f63420g;

    /* renamed from: h */
    private float f63421h;

    /* renamed from: i */
    private int f63422i;

    /* renamed from: j */
    private CharSequence f63423j;

    /* renamed from: k */
    private ColorStateList f63424k;

    /* renamed from: l */
    private FrameLayout f63425l;

    /* renamed from: m */
    private EditText f63426m;

    /* renamed from: n */
    private TextView f63427n;

    /* renamed from: o */
    private TextView f63428o;

    public UDTextInputLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public UDTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public UDTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/larksuite/component/universe_design/edittext/UDTextInputLayout$Companion;", "", "()V", "TEXT_SIZE_14", "", "TEXT_SIZE_16", "TITLE_INPUT_MARGIN", "", "universe-ui-edittext_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.edittext.UDTextInputLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final EditText getEditText() {
        return this.f63426m;
    }

    /* renamed from: a */
    private final void m92839a() {
        m92844d();
        m92843c();
        m92842b();
    }

    /* renamed from: c */
    private final void m92843c() {
        FrameLayout frameLayout = this.f63425l;
        frameLayout.setAddStatesFromChildren(true);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(this.f63425l);
    }

    /* renamed from: b */
    private final void m92842b() {
        this.f63428o.setTextSize(0, this.f63421h);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.f63422i;
        addView(this.f63428o, layoutParams);
        m92841a(this.f63419f, this.f63420g);
    }

    /* renamed from: d */
    private final void m92844d() {
        this.f63427n.setTextSize(0, this.f63417d);
        this.f63427n.setTextColor(this.f63416c);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = this.f63418e;
        if (!TextUtils.isEmpty(this.f63415b)) {
            this.f63427n.setText(this.f63415b);
            this.f63427n.setVisibility(0);
        } else {
            this.f63427n.setVisibility(8);
        }
        addView(this.f63427n, layoutParams);
    }

    /* renamed from: a */
    public final void mo90944a(CharSequence charSequence) {
        this.f63415b = charSequence;
        m92840a(charSequence, this.f63416c);
    }

    /* renamed from: b */
    public final void mo90946b(CharSequence charSequence) {
        this.f63423j = charSequence;
        m92841a(charSequence, this.f63424k);
    }

    /* renamed from: a */
    private final void m92840a(CharSequence charSequence, int i) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f63427n.setText(charSequence);
            this.f63427n.setTextColor(i);
            this.f63427n.setVisibility(0);
            return;
        }
        this.f63427n.setVisibility(8);
    }

    /* renamed from: a */
    private final void m92841a(CharSequence charSequence, ColorStateList colorStateList) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f63428o.setText(charSequence);
            this.f63428o.setTextColor(colorStateList);
            this.f63428o.setVisibility(0);
            return;
        }
        this.f63428o.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(view, "child");
        Intrinsics.checkParameterIsNotNull(layoutParams, "params");
        if (view instanceof EditText) {
            if (this.f63426m == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f63426m = (EditText) view;
                this.f63425l.addView(view, layoutParams);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one".toString());
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        ColorStateList valueOf = ColorStateList.valueOf(0);
        Intrinsics.checkExpressionValueIsNotNull(valueOf, "ColorStateList.valueOf(0)");
        this.f63420g = valueOf;
        ColorStateList valueOf2 = ColorStateList.valueOf(0);
        Intrinsics.checkExpressionValueIsNotNull(valueOf2, "ColorStateList.valueOf(0)");
        this.f63424k = valueOf2;
        this.f63425l = new FrameLayout(context);
        this.f63427n = new TextView(context);
        this.f63428o = new TextView(context);
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_inputLayout_bottomTextInputMargin, R.attr.ud_inputLayout_bottomTextSize, R.attr.ud_inputLayout_errorText, R.attr.ud_inputLayout_errorTextColor, R.attr.ud_inputLayout_helperText, R.attr.ud_inputLayout_helperTextColor, R.attr.ud_inputLayout_titleInputMargin, R.attr.ud_inputLayout_titleText, R.attr.ud_inputLayout_titleTextColor, R.attr.ud_inputLayout_titleTextSize}, i, i2);
        this.f63415b = obtainStyledAttributes.getString(7);
        this.f63416c = obtainStyledAttributes.getColor(8, UDColorUtils.getColor(context, R.color.text_title));
        this.f63417d = obtainStyledAttributes.getDimension(9, UDDimenUtils.m93307a(context, 16.0f));
        float f = (float) 8;
        this.f63418e = obtainStyledAttributes.getDimensionPixelSize(6, (int) UDDimenUtils.m93307a(context, f));
        this.f63419f = obtainStyledAttributes.getString(4);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(5);
        this.f63420g = colorStateList == null ? UDColorUtils.getColorStateList(context, R.color.ud_edittext_hint) : colorStateList;
        this.f63423j = obtainStyledAttributes.getString(2);
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(3);
        this.f63424k = colorStateList2 == null ? UDColorUtils.getColorStateList(context, R.color.function_danger_500) : colorStateList2;
        this.f63421h = obtainStyledAttributes.getDimension(1, UDDimenUtils.m93307a(context, 14.0f));
        this.f63422i = obtainStyledAttributes.getDimensionPixelSize(0, (int) UDDimenUtils.m93307a(context, f));
        obtainStyledAttributes.recycle();
        m92839a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UDTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
