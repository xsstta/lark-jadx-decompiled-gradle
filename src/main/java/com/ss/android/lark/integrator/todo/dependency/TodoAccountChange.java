package com.ss.android.lark.integrator.todo.dependency;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.todo.dependency.idependency.IAccountChangeDependency;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoAccountChange;", "Lcom/ss/android/lark/todo/dependency/idependency/IAccountChangeDependency;", "()V", "mListenerList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/todo/dependency/idependency/IAccountChangeDependency$IAccountChangeListener;", "getMListenerList", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "mListenerList$delegate", "Lkotlin/Lazy;", "onUserSwitchListener", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/OnUserSwitchListener;", "registerAccountChangeListener", "", "listener", "unRegisterAccountChangeListener", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.a */
public final class TodoAccountChange implements IAccountChangeDependency {

    /* renamed from: a */
    private AbstractC49379a f101781a;

    /* renamed from: b */
    private final Lazy f101782b = LazyKt.lazy(C40043a.INSTANCE);

    /* renamed from: a */
    public final CopyOnWriteArrayList<IAccountChangeDependency.IAccountChangeListener> mo145356a() {
        return (CopyOnWriteArrayList) this.f101782b.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/todo/dependency/idependency/IAccountChangeDependency$IAccountChangeListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.a.a$a */
    static final class C40043a extends Lambda implements Function0<CopyOnWriteArrayList<IAccountChangeDependency.IAccountChangeListener>> {
        public static final C40043a INSTANCE = new C40043a();

        C40043a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CopyOnWriteArrayList<IAccountChangeDependency.IAccountChangeListener> invoke() {
            return new CopyOnWriteArrayList<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "onUserSwitchSuccess"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.a.a$b */
    static final class C40044b implements AbstractC49379a {

        /* renamed from: a */
        final /* synthetic */ TodoAccountChange f101783a;

        C40044b(TodoAccountChange aVar) {
            this.f101783a = aVar;
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
            UICallbackExecutor.post(new Runnable(this) {
                /* class com.ss.android.lark.integrator.todo.dependency.TodoAccountChange.C40044b.RunnableC400451 */

                /* renamed from: a */
                final /* synthetic */ C40044b f101784a;

                {
                    this.f101784a = r1;
                }

                public final void run() {
                    Iterator<IAccountChangeDependency.IAccountChangeListener> it = this.f101784a.f101783a.mo145356a().iterator();
                    while (it.hasNext()) {
                        it.next().mo191727a();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IAccountChangeDependency
    /* renamed from: a */
    public void mo145357a(IAccountChangeDependency.IAccountChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        mo145356a().add(aVar);
        if (this.f101781a == null) {
            this.f101781a = new C40044b(this);
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerUserSwitchListener(this.f101781a);
        }
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IAccountChangeDependency
    /* renamed from: b */
    public void mo145358b(IAccountChangeDependency.IAccountChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        mo145356a().remove(aVar);
        if (this.f101781a != null && mo145356a().size() == 0) {
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).unregisterUserSwitchListener(this.f101781a);
            this.f101781a = null;
        }
    }
}
