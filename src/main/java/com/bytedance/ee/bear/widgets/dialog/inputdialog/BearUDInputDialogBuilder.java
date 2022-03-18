package com.bytedance.ee.bear.widgets.dialog.inputdialog;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002^_B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\fJ\u0010\u0010G\u001a\u00020\u00002\b\b\u0001\u0010I\u001a\u00020\u0012J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\fJ\u0010\u0010J\u001a\u00020\u00002\b\b\u0001\u0010I\u001a\u00020\u0012J\u000e\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0006J\u0010\u0010M\u001a\u00020\u00002\b\u0010L\u001a\u0004\u0018\u00010\fJ\u0010\u0010N\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\u0012J\u0010\u0010O\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\u0012J\u000e\u0010P\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\fJ\u0010\u0010P\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\u0012J\u0010\u0010Q\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\u0012J\u000e\u0010R\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0012J&\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020\u0012J\u000e\u0010X\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0012J\u000e\u0010Y\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0012J\u0010\u0010Z\u001a\u00020\u00002\b\u0010L\u001a\u0004\u0018\u000106J\u000e\u0010[\u001a\u00020\u00002\u0006\u0010L\u001a\u00020<J\u000e\u0010\\\u001a\u00020\u00002\u0006\u0010L\u001a\u00020<J\u000e\u0010]\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001e\u0010\u001d\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010#\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001a\u0010&\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\u001a\u0010)\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R\u001a\u0010,\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\u001a\u0010/\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u0010\u0016R\u001a\u00102\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R\u001c\u00105\u001a\u0004\u0018\u000106X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\u001a\u0010D\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\b\"\u0004\bF\u0010\n¨\u0006`"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mDisablePrimaryBtnWhenInputEmpty", "", "getMDisablePrimaryBtnWhenInputEmpty$ccm_widget_release", "()Z", "setMDisablePrimaryBtnWhenInputEmpty$ccm_widget_release", "(Z)V", "mEditText", "", "getMEditText$ccm_widget_release", "()Ljava/lang/CharSequence;", "setMEditText$ccm_widget_release", "(Ljava/lang/CharSequence;)V", "mEditTextBackgroundRes", "", "getMEditTextBackgroundRes$ccm_widget_release", "()I", "setMEditTextBackgroundRes$ccm_widget_release", "(I)V", "mEditTextColor", "getMEditTextColor$ccm_widget_release", "setMEditTextColor$ccm_widget_release", "mEditTextHint", "getMEditTextHint$ccm_widget_release", "setMEditTextHint$ccm_widget_release", "mEditTextHintColor", "getMEditTextHintColor$ccm_widget_release", "setMEditTextHintColor$ccm_widget_release", "mEditTextMaxLine", "getMEditTextMaxLine$ccm_widget_release", "setMEditTextMaxLine$ccm_widget_release", "mEditTextPaddingBottom", "getMEditTextPaddingBottom$ccm_widget_release", "setMEditTextPaddingBottom$ccm_widget_release", "mEditTextPaddingLeft", "getMEditTextPaddingLeft$ccm_widget_release", "setMEditTextPaddingLeft$ccm_widget_release", "mEditTextPaddingRight", "getMEditTextPaddingRight$ccm_widget_release", "setMEditTextPaddingRight$ccm_widget_release", "mEditTextPaddingTop", "getMEditTextPaddingTop$ccm_widget_release", "setMEditTextPaddingTop$ccm_widget_release", "mEditTextSelection", "getMEditTextSelection$ccm_widget_release", "setMEditTextSelection$ccm_widget_release", "mInputType", "getMInputType$ccm_widget_release", "setMInputType$ccm_widget_release", "mOnTextChangedListener", "Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnTextChangedListener;", "getMOnTextChangedListener$ccm_widget_release", "()Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnTextChangedListener;", "setMOnTextChangedListener$ccm_widget_release", "(Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnTextChangedListener;)V", "mPrimaryBtnClickListener", "Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnBtnClickListener;", "getMPrimaryBtnClickListener$ccm_widget_release", "()Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnBtnClickListener;", "setMPrimaryBtnClickListener$ccm_widget_release", "(Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnBtnClickListener;)V", "mSecondaryBtnClickListener", "getMSecondaryBtnClickListener$ccm_widget_release", "setMSecondaryBtnClickListener$ccm_widget_release", "mShowClearBtn", "getMShowClearBtn$ccm_widget_release", "setMShowClearBtn$ccm_widget_release", "addPrimaryActionButton", "text", "textRes", "addSecondaryActionButton", "disablePrimaryBtnWhenEmpty", "value", "editText", "editTextBackground", "editTextColor", "editTextHint", "editTextHintColor", "editTextMaxLine", "editTextPadding", "left", "top", "right", "bottom", "editTextSelection", "inputType", "onEditTextChanged", "setPrimaryBtnClickListener", "setSecondaryBtnClickListener", "showClearBtn", "OnBtnClickListener", "OnTextChangedListener", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.widgets.dialog.b.a */
public final class BearUDInputDialogBuilder extends UDBaseDialogBuilder<BearUDInputDialogBuilder> {

    /* renamed from: a */
    private int f31931a = -1;

    /* renamed from: b */
    private int f31932b = -1;

    /* renamed from: c */
    private int f31933c = -1;

    /* renamed from: d */
    private int f31934d = -1;

    /* renamed from: e */
    private int f31935e = -1;

    /* renamed from: f */
    private int f31936f = -1;

    /* renamed from: g */
    private int f31937g = -1;

    /* renamed from: h */
    private int f31938h = -1;

    /* renamed from: i */
    private int f31939i = R.drawable.space_kit_search_bar_float_bg;

    /* renamed from: j */
    private CharSequence f31940j;

    /* renamed from: k */
    private CharSequence f31941k = "";

    /* renamed from: l */
    private int f31942l = -1;

    /* renamed from: m */
    private boolean f31943m = true;

    /* renamed from: n */
    private boolean f31944n;

    /* renamed from: o */
    private OnTextChangedListener f31945o;

    /* renamed from: p */
    private OnBtnClickListener f31946p;

    /* renamed from: q */
    private OnBtnClickListener f31947q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnBtnClickListener;", "", "onClick", "", "text", "", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.dialog.b.a$a */
    public interface OnBtnClickListener {
        void onClick(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnTextChangedListener;", "", "onTextChanged", "", "s", "", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.dialog.b.a$b */
    public interface OnTextChangedListener {
        /* renamed from: a */
        void mo45417a(CharSequence charSequence);
    }

    /* renamed from: a */
    public final int mo45389a() {
        return this.f31931a;
    }

    /* renamed from: b */
    public final int mo45394b() {
        return this.f31932b;
    }

    /* renamed from: c */
    public final int mo45398c() {
        return this.f31933c;
    }

    /* renamed from: d */
    public final int mo45401d() {
        return this.f31934d;
    }

    /* renamed from: e */
    public final int mo45404e() {
        return this.f31935e;
    }

    /* renamed from: f */
    public final int mo45405f() {
        return this.f31936f;
    }

    /* renamed from: g */
    public final int mo45406g() {
        return this.f31937g;
    }

    /* renamed from: h */
    public final int mo45407h() {
        return this.f31938h;
    }

    /* renamed from: i */
    public final int mo45408i() {
        return this.f31939i;
    }

    /* renamed from: j */
    public final CharSequence mo45409j() {
        return this.f31940j;
    }

    /* renamed from: k */
    public final CharSequence mo45410k() {
        return this.f31941k;
    }

    /* renamed from: l */
    public final int mo45411l() {
        return this.f31942l;
    }

    /* renamed from: m */
    public final boolean mo45412m() {
        return this.f31943m;
    }

    /* renamed from: n */
    public final boolean mo45413n() {
        return this.f31944n;
    }

    /* renamed from: o */
    public final OnTextChangedListener mo45414o() {
        return this.f31945o;
    }

    /* renamed from: p */
    public final OnBtnClickListener mo45415p() {
        return this.f31946p;
    }

    /* renamed from: q */
    public final OnBtnClickListener mo45416q() {
        return this.f31947q;
    }

    /* renamed from: a */
    public final BearUDInputDialogBuilder mo45390a(int i) {
        BearUDInputDialogBuilder aVar = this;
        aVar.f31942l = i;
        return aVar;
    }

    /* renamed from: a */
    public final BearUDInputDialogBuilder mo45391a(OnBtnClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "value");
        BearUDInputDialogBuilder aVar2 = this;
        aVar2.f31946p = aVar;
        return aVar2;
    }

    /* renamed from: b */
    public final BearUDInputDialogBuilder mo45395b(int i) {
        BearUDInputDialogBuilder aVar = this;
        aVar.f31940j = aVar.getContext().getString(i);
        return aVar;
    }

    /* renamed from: c */
    public final BearUDInputDialogBuilder mo45399c(int i) {
        BearUDInputDialogBuilder aVar = this;
        aVar.addActionButton(R.id.ud_dialog_btn_primary, i, (DialogInterface.OnClickListener) null);
        return aVar;
    }

    /* renamed from: d */
    public final BearUDInputDialogBuilder mo45402d(int i) {
        BearUDInputDialogBuilder aVar = this;
        aVar.addActionButton(R.id.ud_dialog_btn_secondary, i, (DialogInterface.OnClickListener) null);
        return aVar;
    }

    /* renamed from: a */
    public final BearUDInputDialogBuilder mo45392a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "value");
        BearUDInputDialogBuilder aVar = this;
        aVar.f31940j = charSequence;
        return aVar;
    }

    /* renamed from: b */
    public final BearUDInputDialogBuilder mo45396b(OnBtnClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "value");
        BearUDInputDialogBuilder aVar2 = this;
        aVar2.f31947q = aVar;
        return aVar2;
    }

    /* renamed from: c */
    public final BearUDInputDialogBuilder mo45400c(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        BearUDInputDialogBuilder aVar = this;
        aVar.addActionButton(R.id.ud_dialog_btn_primary, charSequence, (DialogInterface.OnClickListener) null);
        return aVar;
    }

    /* renamed from: d */
    public final BearUDInputDialogBuilder mo45403d(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        BearUDInputDialogBuilder aVar = this;
        aVar.addActionButton(R.id.ud_dialog_btn_secondary, charSequence, (DialogInterface.OnClickListener) null);
        return aVar;
    }

    /* renamed from: a */
    public final BearUDInputDialogBuilder mo45393a(boolean z) {
        BearUDInputDialogBuilder aVar = this;
        aVar.f31944n = z;
        return aVar;
    }

    /* renamed from: b */
    public final BearUDInputDialogBuilder mo45397b(CharSequence charSequence) {
        BearUDInputDialogBuilder aVar = this;
        if (charSequence == null) {
        }
        aVar.f31941k = charSequence;
        return aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BearUDInputDialogBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        controller(new BearUDInputDialogController(context));
        marginInDp(36);
        autoDismiss(true);
        cancelable(false);
        cancelOnTouchOutside(false);
    }
}
