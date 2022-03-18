package com.larksuite.component.ui.dialog;

import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/ui/dialog/LifecycleCallbackWrapper;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$LifecycleCallback;", "callback", "Lcom/larksuite/component/ui/dialog/LKUIDialogBuilder$LifecycleCallback;", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "(Lcom/larksuite/component/ui/dialog/LKUIDialogBuilder$LifecycleCallback;)V", "beforeCreate", "", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "onCreated", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.dialog.p */
public final class LifecycleCallbackWrapper implements UDBaseDialogBuilder.LifecycleCallback {

    /* renamed from: a */
    private final C25639g.AbstractC25641b<DialogC25637f> f62610a;

    public LifecycleCallbackWrapper(C25639g.AbstractC25641b<DialogC25637f> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        this.f62610a = bVar;
    }

    @Override // com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder.LifecycleCallback
    /* renamed from: a */
    public void mo89291a(UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        this.f62610a.mo89273a((DialogC25637f) uDDialog);
    }

    @Override // com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder.LifecycleCallback
    /* renamed from: b */
    public void mo89292b(UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        this.f62610a.mo89274b((DialogC25637f) uDDialog);
    }
}
