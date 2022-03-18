package com.larksuite.framework.section;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.AbstractC1142af;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.section.IActionHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0015\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u000b\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016JU\u0010\u0012\u001a\u00020\u000f2M\u0010\u0013\u001aI\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000f0\u0014R\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/larksuite/framework/section/ViewModelSection;", "M", "Landroidx/lifecycle/ViewModel;", "Lcom/larksuite/framework/section/IActionHandler;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "modelData", "getModelData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getContext", "Landroid/content/Context;", "getModelStore", "initViewData", "", "initViewModel", "onDestroy", "registerActivityResult", "block", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.a.i */
public abstract class ViewModelSection<M> extends AbstractC1142af implements IActionHandler {
    private final M modelData;
    private final IViewModelAbility<M> viewModelAbility;

    public abstract void initViewData();

    public void initViewModel() {
    }

    public void onDestroy() {
    }

    public final M getModelData() {
        return this.modelData;
    }

    public final Context getContext() {
        return this.viewModelAbility.mo92048a();
    }

    public final M getModelStore() {
        return this.viewModelAbility.mo92076e();
    }

    public void handleAction(int i) {
        IActionHandler.C25883a.m93676a(this, i);
    }

    public final void registerActivityResult(Function3<? super Integer, ? super Integer, ? super Intent, Unit> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "block");
        this.viewModelAbility.mo92049a(oVar);
    }

    public ViewModelSection(IViewModelAbility<M> gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
        this.viewModelAbility = gVar;
        this.modelData = gVar.mo92076e();
    }

    public void handleViewAction(int i, int i2) {
        IActionHandler.C25883a.m93682b(this, i, i2);
    }

    public void handleAction(int i, int i2) {
        IActionHandler.C25883a.m93677a(this, i, i2);
    }

    public void handleAction(int i, IActionData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
        IActionHandler.C25883a.m93678a((IActionHandler) this, i, bVar);
    }

    public void handleAction(int i, Object obj) {
        IActionHandler.C25883a.m93679a(this, i, obj);
    }

    public void handleAction(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionData");
        IActionHandler.C25883a.m93680a((IActionHandler) this, i, str);
    }

    public void handleAction(int i, boolean z) {
        IActionHandler.C25883a.m93681a(this, i, z);
    }
}
