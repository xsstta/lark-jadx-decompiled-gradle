package com.larksuite.component.universe_design.dialog;

import android.content.Context;
import com.larksuite.component.universe_design.dimension.UDDimension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001@B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0006J\u0010\u00104\u001a\u00020\u00002\b\b\u0001\u00103\u001a\u00020\fJ\u0010\u00105\u001a\u00020\u00002\b\b\u0001\u00103\u001a\u00020\fJ\u000e\u00106\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0006J\u0010\u00106\u001a\u00020\u00002\b\b\u0001\u00103\u001a\u00020\fJ\u0010\u00107\u001a\u00020\u00002\b\b\u0001\u00103\u001a\u00020\fJ\u000e\u00108\u001a\u00020\u00002\u0006\u00103\u001a\u00020\fJ&\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f2\u0006\u0010=\u001a\u00020\fJ\u000e\u0010>\u001a\u00020\u00002\u0006\u00103\u001a\u00020\fJ\u0010\u0010?\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010-R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001e\u0010\u0017\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\u001a\u0010)\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006A"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDInputDialogBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mEditText", "", "getMEditText$universe_ui_dialog_release", "()Ljava/lang/CharSequence;", "setMEditText$universe_ui_dialog_release", "(Ljava/lang/CharSequence;)V", "mEditTextBackgroundRes", "", "getMEditTextBackgroundRes$universe_ui_dialog_release", "()I", "setMEditTextBackgroundRes$universe_ui_dialog_release", "(I)V", "mEditTextColor", "getMEditTextColor$universe_ui_dialog_release", "setMEditTextColor$universe_ui_dialog_release", "mEditTextHint", "getMEditTextHint$universe_ui_dialog_release", "setMEditTextHint$universe_ui_dialog_release", "mEditTextHintColor", "getMEditTextHintColor$universe_ui_dialog_release", "setMEditTextHintColor$universe_ui_dialog_release", "mEditTextMaxLine", "getMEditTextMaxLine$universe_ui_dialog_release", "setMEditTextMaxLine$universe_ui_dialog_release", "mEditTextPaddingBottom", "getMEditTextPaddingBottom$universe_ui_dialog_release", "setMEditTextPaddingBottom$universe_ui_dialog_release", "mEditTextPaddingLeft", "getMEditTextPaddingLeft$universe_ui_dialog_release", "setMEditTextPaddingLeft$universe_ui_dialog_release", "mEditTextPaddingRight", "getMEditTextPaddingRight$universe_ui_dialog_release", "setMEditTextPaddingRight$universe_ui_dialog_release", "mEditTextPaddingTop", "getMEditTextPaddingTop$universe_ui_dialog_release", "setMEditTextPaddingTop$universe_ui_dialog_release", "mInputType", "getMInputType$universe_ui_dialog_release", "setMInputType$universe_ui_dialog_release", "mOnTextChangedListener", "Lcom/larksuite/component/universe_design/dialog/UDInputDialogBuilder$OnTextChangedListener;", "getMOnTextChangedListener$universe_ui_dialog_release", "()Lcom/larksuite/component/universe_design/dialog/UDInputDialogBuilder$OnTextChangedListener;", "setMOnTextChangedListener$universe_ui_dialog_release", "(Lcom/larksuite/component/universe_design/dialog/UDInputDialogBuilder$OnTextChangedListener;)V", "editText", "value", "editTextBackground", "editTextColor", "editTextHint", "editTextHintColor", "editTextMaxLine", "editTextPadding", "left", "top", "right", "bottom", "inputType", "onEditTextChanged", "OnTextChangedListener", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.dialog.g */
public final class UDInputDialogBuilder extends UDBaseDialogBuilder<UDInputDialogBuilder> {

    /* renamed from: a */
    private int f63327a = -1;

    /* renamed from: b */
    private int f63328b = -1;

    /* renamed from: c */
    private int f63329c = -1;

    /* renamed from: d */
    private int f63330d = -1;

    /* renamed from: e */
    private int f63331e = -1;

    /* renamed from: f */
    private int f63332f = -1;

    /* renamed from: g */
    private int f63333g = -1;

    /* renamed from: h */
    private int f63334h = -1;

    /* renamed from: i */
    private int f63335i = -1;

    /* renamed from: j */
    private CharSequence f63336j;

    /* renamed from: k */
    private CharSequence f63337k = "";

    /* renamed from: l */
    private OnTextChangedListener f63338l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDInputDialogBuilder$OnTextChangedListener;", "", "onTextChanged", "", "s", "", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.g$a */
    public interface OnTextChangedListener {
        /* renamed from: a */
        void mo89293a(CharSequence charSequence);
    }

    /* renamed from: a */
    public final int mo90898a() {
        return this.f63327a;
    }

    /* renamed from: b */
    public final int mo90902b() {
        return this.f63328b;
    }

    /* renamed from: c */
    public final int mo90905c() {
        return this.f63329c;
    }

    /* renamed from: d */
    public final int mo90907d() {
        return this.f63330d;
    }

    /* renamed from: e */
    public final int mo90908e() {
        return this.f63331e;
    }

    /* renamed from: f */
    public final int mo90909f() {
        return this.f63332f;
    }

    /* renamed from: g */
    public final int mo90910g() {
        return this.f63333g;
    }

    /* renamed from: h */
    public final int mo90911h() {
        return this.f63334h;
    }

    /* renamed from: i */
    public final int mo90912i() {
        return this.f63335i;
    }

    /* renamed from: j */
    public final CharSequence mo90913j() {
        return this.f63336j;
    }

    /* renamed from: k */
    public final CharSequence mo90914k() {
        return this.f63337k;
    }

    /* renamed from: l */
    public final OnTextChangedListener mo90915l() {
        return this.f63338l;
    }

    /* renamed from: a */
    public final UDInputDialogBuilder mo90899a(int i) {
        UDInputDialogBuilder gVar = this;
        gVar.f63327a = i;
        return gVar;
    }

    /* renamed from: b */
    public final UDInputDialogBuilder mo90903b(int i) {
        UDInputDialogBuilder gVar = this;
        gVar.f63332f = i;
        return gVar;
    }

    /* renamed from: a */
    public final UDInputDialogBuilder mo90900a(OnTextChangedListener aVar) {
        UDInputDialogBuilder gVar = this;
        gVar.f63338l = aVar;
        return gVar;
    }

    /* renamed from: b */
    public final UDInputDialogBuilder mo90904b(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "value");
        UDInputDialogBuilder gVar = this;
        gVar.f63337k = charSequence;
        return gVar;
    }

    /* renamed from: c */
    public final UDInputDialogBuilder mo90906c(int i) {
        UDInputDialogBuilder gVar = this;
        gVar.f63336j = gVar.getContext().getString(i);
        return gVar;
    }

    /* renamed from: a */
    public final UDInputDialogBuilder mo90901a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "value");
        UDInputDialogBuilder gVar = this;
        gVar.f63336j = charSequence;
        return gVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDInputDialogBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setMController$universe_ui_dialog_release(new UDInputDialogController(context));
        setMMarginInDp$universe_ui_dialog_release(36);
        setMMaxWidth$universe_ui_dialog_release(new UDDimension.Dp(303));
    }
}
