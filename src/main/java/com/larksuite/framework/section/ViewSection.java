package com.larksuite.framework.section;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.section.IActionHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u000b\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0011H&J.\u0010\u0013\u001a\u00020\u0011\"\u0004\b\u0001\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u00020\u00110\u0018J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016JU\u0010\u001b\u001a\u00020\u00112M\u0010\u0017\u001aI\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00110\u001cR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/larksuite/framework/section/ViewSection;", "T", "Lcom/larksuite/framework/section/IActionHandler;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Lcom/larksuite/framework/section/IViewAbility;)V", "getContext", "Landroid/content/Context;", "getDispatcher", "Lcom/larksuite/framework/section/IActionDispatcher;", "getLifeCycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getResources", "Landroid/content/res/Resources;", "getViewDataStore", "()Ljava/lang/Object;", "initViewAction", "", "initViewObserver", "observe", "M", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/lifecycle/LiveData;", "block", "Lkotlin/Function1;", "onDestroy", "onStop", "registerActivityResult", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "requestCode", "resultCode", "Landroid/content/Intent;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.a.j */
public abstract class ViewSection<T> implements IActionHandler {

    /* renamed from: a */
    private final IViewAbility<T> f64039a;

    /* renamed from: f */
    public abstract void mo92109f();

    /* renamed from: g */
    public abstract void mo92110g();

    /* renamed from: h */
    public void mo92111h() {
    }

    /* renamed from: i */
    public void mo92112i() {
    }

    /* renamed from: a */
    public final T mo92096a() {
        return this.f64039a.mo92073b();
    }

    /* renamed from: b */
    public final LifecycleOwner mo92105b() {
        return this.f64039a.mo92074c();
    }

    /* renamed from: c */
    public final Context mo92106c() {
        return this.f64039a.mo92048a();
    }

    /* renamed from: d */
    public final IActionDispatcher mo92107d() {
        return this.f64039a.mo92075d();
    }

    /* renamed from: e */
    public final Resources mo92108e() {
        Resources resources = mo92106c().getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "getContext().resources");
        return resources;
    }

    /* renamed from: a */
    public void mo92097a(int i) {
        IActionHandler.C25883a.m93676a(this, i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "M", "T", "it", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Object;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.a.j$a */
    static final class C25886a<T> implements AbstractC1178x<M> {

        /* renamed from: a */
        final /* synthetic */ Function1 f64040a;

        C25886a(Function1 function1) {
            this.f64040a = function1;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(M m) {
            this.f64040a.invoke(m);
        }
    }

    public ViewSection(IViewAbility<T> fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f64039a = fVar;
    }

    /* renamed from: a */
    public final void mo92104a(Function3<? super Integer, ? super Integer, ? super Intent, Unit> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "block");
        this.f64039a.mo92049a(oVar);
    }

    /* renamed from: a */
    public void mo92098a(int i, int i2) {
        IActionHandler.C25883a.m93677a(this, i, i2);
    }

    /* renamed from: a */
    public void mo92099a(int i, IActionData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
        IActionHandler.C25883a.m93678a((IActionHandler) this, i, bVar);
    }

    /* renamed from: a */
    public void mo92100a(int i, Object obj) {
        IActionHandler.C25883a.m93679a(this, i, obj);
    }

    /* renamed from: a */
    public void mo92101a(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionData");
        IActionHandler.C25883a.m93680a((IActionHandler) this, i, str);
    }

    /* renamed from: a */
    public void mo92102a(int i, boolean z) {
        IActionHandler.C25883a.m93681a(this, i, z);
    }

    /* renamed from: a */
    public final <M> void mo92103a(LiveData<M> liveData, Function1<? super M, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(liveData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(function1, "block");
        liveData.mo5923a(mo92105b(), new C25886a(function1));
    }
}
