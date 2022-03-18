package com.larksuite.component.universe_design.dialog;

import android.content.Context;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.dimension.UDDimension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0012J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDCheckBoxDialogBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checkedChangeListener", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "getCheckedChangeListener$universe_ui_dialog_release", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "setCheckedChangeListener$universe_ui_dialog_release", "(Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;)V", "mHint", "", "getMHint$universe_ui_dialog_release", "()Ljava/lang/CharSequence;", "setMHint$universe_ui_dialog_release", "(Ljava/lang/CharSequence;)V", "mIsChecked", "", "getMIsChecked$universe_ui_dialog_release", "()Z", "setMIsChecked$universe_ui_dialog_release", "(Z)V", "mRequireCheck", "getMRequireCheck$universe_ui_dialog_release", "setMRequireCheck$universe_ui_dialog_release", "checkBoxHint", "value", "listener", "isChecked", "requireCheck", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.dialog.c */
public final class UDCheckBoxDialogBuilder extends UDBaseDialogBuilder<UDCheckBoxDialogBuilder> {

    /* renamed from: a */
    private boolean f63315a;

    /* renamed from: b */
    private CharSequence f63316b = "";

    /* renamed from: c */
    private boolean f63317c;

    /* renamed from: d */
    private UDCheckBox.OnCheckedChangeListener f63318d;

    /* renamed from: a */
    public final boolean mo90894a() {
        return this.f63315a;
    }

    /* renamed from: b */
    public final CharSequence mo90895b() {
        return this.f63316b;
    }

    /* renamed from: c */
    public final boolean mo90896c() {
        return this.f63317c;
    }

    /* renamed from: d */
    public final UDCheckBox.OnCheckedChangeListener mo90897d() {
        return this.f63318d;
    }

    /* renamed from: a */
    public final UDCheckBoxDialogBuilder mo90891a(UDCheckBox.OnCheckedChangeListener gVar) {
        UDCheckBoxDialogBuilder cVar = this;
        cVar.f63318d = gVar;
        return cVar;
    }

    /* renamed from: a */
    public final UDCheckBoxDialogBuilder mo90892a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "value");
        UDCheckBoxDialogBuilder cVar = this;
        cVar.f63316b = charSequence;
        return cVar;
    }

    /* renamed from: a */
    public final UDCheckBoxDialogBuilder mo90893a(boolean z) {
        UDCheckBoxDialogBuilder cVar = this;
        cVar.f63315a = z;
        return cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDCheckBoxDialogBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setMController$universe_ui_dialog_release(new UDCheckBoxDialogController(context));
        setMMarginInDp$universe_ui_dialog_release(36);
        setMMaxWidth$universe_ui_dialog_release(new UDDimension.Dp(303));
    }
}
