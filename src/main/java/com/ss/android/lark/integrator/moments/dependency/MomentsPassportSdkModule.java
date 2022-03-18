package com.ss.android.lark.integrator.moments.dependency;

import com.ss.android.lark.moments.dependency.idependency.IPassportSdkModuleDependency;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsPassportSdkModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IPassportSdkModuleDependency;", "()V", "mList", "", "Lcom/ss/android/lark/moments/dependency/idependency/IPassportSdkModuleDependency$IAccountChangeListener;", "getMList", "()Ljava/util/List;", "mList$delegate", "Lkotlin/Lazy;", "passportListener", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/OnUserSwitchListener;", "isOverseaTenantBrand", "", "registerAccountChangeListener", "", "listener", "unregisterAccountChangeListener", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.m */
public final class MomentsPassportSdkModule implements IPassportSdkModuleDependency {

    /* renamed from: a */
    private final Lazy f101583a = LazyKt.lazy(C39900a.INSTANCE);

    /* renamed from: b */
    private final AbstractC49379a f101584b = new C39901b(this);

    /* renamed from: a */
    public final List<IPassportSdkModuleDependency.IAccountChangeListener> mo144723a() {
        return (List) this.f101583a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/moments/dependency/idependency/IPassportSdkModuleDependency$IAccountChangeListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.a.m$a */
    static final class C39900a extends Lambda implements Function0<List<IPassportSdkModuleDependency.IAccountChangeListener>> {
        public static final C39900a INSTANCE = new C39900a();

        C39900a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<IPassportSdkModuleDependency.IAccountChangeListener> invoke() {
            return new ArrayList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "onUserSwitchSuccess"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.a.m$b */
    static final class C39901b implements AbstractC49379a {

        /* renamed from: a */
        final /* synthetic */ MomentsPassportSdkModule f101585a;

        C39901b(MomentsPassportSdkModule mVar) {
            this.f101585a = mVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public /* synthetic */ void mo102549a(C49380b bVar) {
            AbstractC49379a.CC.$default$a(this, bVar);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public /* synthetic */ void mo102550a(C49381c cVar) {
            AbstractC49379a.CC.$default$a(this, cVar);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        public final void onUserSwitchSuccess(C49382d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "it");
            Iterator<T> it = this.f101585a.mo144723a().iterator();
            while (it.hasNext()) {
                it.next().mo165898a();
            }
        }
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IPassportSdkModuleDependency
    /* renamed from: a */
    public void mo144724a(IPassportSdkModuleDependency.IAccountChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        if (mo144723a().isEmpty()) {
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerUserSwitchListener(this.f101584b);
        }
        mo144723a().add(aVar);
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IPassportSdkModuleDependency
    /* renamed from: b */
    public void mo144725b(IPassportSdkModuleDependency.IAccountChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        mo144723a().remove(aVar);
        if (mo144723a().isEmpty()) {
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).unregisterUserSwitchListener(this.f101584b);
        }
    }
}
