package com.bytedance.ee.bear.widgets.dialog.checkboxdialog;

import android.content.Context;
import android.widget.CompoundButton;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\fJ\u0010\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u0012J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0018J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/checkboxdialog/BearUDCheckBoxDialogBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getMCheckedChangeListener$ccm_widget_release", "()Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setMCheckedChangeListener$ccm_widget_release", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "mHint", "", "getMHint$ccm_widget_release", "()Ljava/lang/CharSequence;", "setMHint$ccm_widget_release", "(Ljava/lang/CharSequence;)V", "mHintColor", "", "getMHintColor$ccm_widget_release", "()I", "setMHintColor$ccm_widget_release", "(I)V", "mIsChecked", "", "getMIsChecked$ccm_widget_release", "()Z", "setMIsChecked$ccm_widget_release", "(Z)V", "mShowCheckbox", "getMShowCheckbox$ccm_widget_release", "setMShowCheckbox$ccm_widget_release", "checkBoxHint", "value", "checkBoxHintColor", "checkChangeListener", "isChecked", "showCheckbox", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.widgets.dialog.a.a */
public final class BearUDCheckBoxDialogBuilder extends UDBaseDialogBuilder<BearUDCheckBoxDialogBuilder> {

    /* renamed from: a */
    private boolean f31918a;

    /* renamed from: b */
    private CharSequence f31919b = "";

    /* renamed from: c */
    private int f31920c = -1;

    /* renamed from: d */
    private boolean f31921d = true;

    /* renamed from: e */
    private CompoundButton.OnCheckedChangeListener f31922e;

    /* renamed from: a */
    public final boolean mo45381a() {
        return this.f31918a;
    }

    /* renamed from: b */
    public final CharSequence mo45383b() {
        return this.f31919b;
    }

    /* renamed from: c */
    public final int mo45384c() {
        return this.f31920c;
    }

    /* renamed from: d */
    public final boolean mo45385d() {
        return this.f31921d;
    }

    /* renamed from: e */
    public final CompoundButton.OnCheckedChangeListener mo45386e() {
        return this.f31922e;
    }

    /* renamed from: a */
    public final BearUDCheckBoxDialogBuilder mo45377a(int i) {
        BearUDCheckBoxDialogBuilder aVar = this;
        aVar.f31920c = i;
        return aVar;
    }

    /* renamed from: b */
    public final BearUDCheckBoxDialogBuilder mo45382b(boolean z) {
        BearUDCheckBoxDialogBuilder aVar = this;
        aVar.f31921d = z;
        return aVar;
    }

    /* renamed from: a */
    public final BearUDCheckBoxDialogBuilder mo45378a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Intrinsics.checkParameterIsNotNull(onCheckedChangeListener, "value");
        BearUDCheckBoxDialogBuilder aVar = this;
        aVar.f31922e = onCheckedChangeListener;
        return aVar;
    }

    /* renamed from: a */
    public final BearUDCheckBoxDialogBuilder mo45379a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "value");
        BearUDCheckBoxDialogBuilder aVar = this;
        aVar.f31919b = charSequence;
        return aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BearUDCheckBoxDialogBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        controller(new BearUDCheckBoxDialogController(context));
        marginInDp(36);
    }

    /* renamed from: a */
    public final BearUDCheckBoxDialogBuilder mo45380a(boolean z) {
        BearUDCheckBoxDialogBuilder aVar = this;
        aVar.f31918a = z;
        return aVar;
    }
}
