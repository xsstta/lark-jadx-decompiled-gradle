package com.larksuite.component.ui.dialog;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0017\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\bH\u0004R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/larksuite/component/ui/dialog/LKUIGlobalDialog;", "Lcom/larksuite/component/ui/dialog/ILKUIGlobalDialog;", "lkuiDialogBuilder", "Lcom/larksuite/component/ui/dialog/LKUIDialogBuilder;", "(Lcom/larksuite/component/ui/dialog/LKUIDialogBuilder;)V", "getLkuiDialogBuilder$suite_ui_release", "()Lcom/larksuite/component/ui/dialog/LKUIDialogBuilder;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mDialog", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "getMDialog$suite_ui_release", "()Lcom/larksuite/component/ui/dialog/LKUIDialog;", "setMDialog$suite_ui_release", "(Lcom/larksuite/component/ui/dialog/LKUIDialog;)V", "mIsShown", "", "getMIsShown$suite_ui_release", "()Z", "setMIsShown$suite_ui_release", "(Z)V", "dismiss", "", "getContext", "isShown", "setContext", "context", "setContext$suite_ui_release", "show", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.dialog.i */
public final class LKUIGlobalDialog implements ILKUIGlobalDialog {

    /* renamed from: a */
    private Context f62601a;

    /* renamed from: b */
    private boolean f62602b;

    /* renamed from: c */
    private DialogC25637f f62603c;

    /* renamed from: d */
    private final C25639g<?> f62604d;

    /* renamed from: c */
    public final C25639g<?> mo89279c() {
        return this.f62604d;
    }

    @Override // com.larksuite.component.ui.dialog.ILKUIGlobalDialog
    /* renamed from: b */
    public boolean mo89213b() {
        return this.f62602b;
    }

    @Override // com.larksuite.component.ui.dialog.ILKUIGlobalDialog
    /* renamed from: a */
    public void mo89212a() {
        this.f62602b = false;
        DialogC25637f fVar = this.f62603c;
        if (fVar != null) {
            fVar.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo89276a(DialogC25637f fVar) {
        this.f62603c = fVar;
    }

    /* renamed from: b */
    public final void mo89278b(Context context) {
        this.f62601a = context;
    }

    /* renamed from: a */
    public final void mo89277a(boolean z) {
        this.f62602b = z;
    }

    public LKUIGlobalDialog(C25639g<?> gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "lkuiDialogBuilder");
        this.f62604d = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo89275a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        LKUIGlobalDialogActivity.f62570b.mo89192a(this);
        Intent intent = new Intent(context, LKUIGlobalDialogActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
