package com.ss.android.lark.integrator.calendar.dependency;

import com.ss.android.lark.calendar.dependency.idependency.IAccountChangeDependency;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalAccountChangeDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/IAccountChangeDependency;", "()V", "mList", "", "Lcom/ss/android/lark/calendar/dependency/idependency/IAccountChangeDependency$IAccountChangeListner;", "getMList", "()Ljava/util/List;", "mList$delegate", "Lkotlin/Lazy;", "registerAccountChangeListner", "", "listner", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.b */
public final class CalAccountChangeDependency implements IAccountChangeDependency {

    /* renamed from: a */
    private final Lazy f100489a = LazyKt.lazy(C39201a.INSTANCE);

    /* renamed from: a */
    public final List<IAccountChangeDependency.IAccountChangeListner> mo143032a() {
        return (List) this.f100489a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/calendar/dependency/idependency/IAccountChangeDependency$IAccountChangeListner;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.b$a */
    static final class C39201a extends Lambda implements Function0<List<IAccountChangeDependency.IAccountChangeListner>> {
        public static final C39201a INSTANCE = new C39201a();

        C39201a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<IAccountChangeDependency.IAccountChangeListner> invoke() {
            return new ArrayList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "onUserSwitchSuccess"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.b$b */
    static final class C39202b implements AbstractC49379a {

        /* renamed from: a */
        final /* synthetic */ CalAccountChangeDependency f100490a;

        C39202b(CalAccountChangeDependency bVar) {
            this.f100490a = bVar;
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
            synchronized (this.f100490a.mo143032a()) {
                Iterator<T> it = this.f100490a.mo143032a().iterator();
                while (it.hasNext()) {
                    it.next().onAccountChange();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.ss.android.lark.calendar.dependency.idependency.IAccountChangeDependency
    /* renamed from: a */
    public void mo108149a(IAccountChangeDependency.IAccountChangeListner aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listner");
        if (mo143032a().size() == 0) {
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerUserSwitchListener(new C39202b(this));
        }
        synchronized (mo143032a()) {
            mo143032a().add(aVar);
        }
    }
}
