package com.ss.android.lark.integrator.todo.dependency;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.ao;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56259u;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoTimeFormatDependency;", "Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency;", "()V", "mChangeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency$ITimeFormatChangeListener;", "getMChangeListeners", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "mChangeListeners$delegate", "Lkotlin/Lazy;", "mSettingObserver", "Lcom/ss/android/lark/biz/core/api/ITimeFormatSettingObserver;", "isTwentyFourHours", "", "registerTimeFormatChangeListener", "", "newListener", "unRegisterTimeFormatChangeListener", "listener", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.v */
public final class TodoTimeFormatDependency implements AbstractC56259u {

    /* renamed from: a */
    private ao f101809a;

    /* renamed from: b */
    private final Lazy f101810b = LazyKt.lazy(C40059a.INSTANCE);

    /* renamed from: a */
    public final CopyOnWriteArrayList<AbstractC56259u.AbstractC56260a> mo145431a() {
        return (CopyOnWriteArrayList) this.f101810b.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency$ITimeFormatChangeListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.a.v$a */
    static final class C40059a extends Lambda implements Function0<CopyOnWriteArrayList<AbstractC56259u.AbstractC56260a>> {
        public static final C40059a INSTANCE = new C40059a();

        C40059a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CopyOnWriteArrayList<AbstractC56259u.AbstractC56260a> invoke() {
            return new CopyOnWriteArrayList<>();
        }
    }

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56259u
    /* renamed from: b */
    public boolean mo145434b() {
        boolean z;
        Object api = ApiUtils.getApi(ICoreApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICoreApi::class.java)");
        TimeFormatSetting localTimeFormat = ((ICoreApi) api).getLocalTimeFormat();
        if (localTimeFormat == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (z) {
                throw new NoWhenBranchMatchedException();
            } else if (localTimeFormat.mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/biz/core/api/TimeFormatSetting;", "kotlin.jvm.PlatformType", "onTimeFormatChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.a.v$b */
    static final class C40060b implements ao {

        /* renamed from: a */
        final /* synthetic */ TodoTimeFormatDependency f101811a;

        C40060b(TodoTimeFormatDependency vVar) {
            this.f101811a = vVar;
        }

        @Override // com.ss.android.lark.biz.core.api.ao
        public final void onTimeFormatChange(TimeFormatSetting timeFormatSetting) {
            UICallbackExecutor.post(new Runnable(this) {
                /* class com.ss.android.lark.integrator.todo.dependency.TodoTimeFormatDependency.C40060b.RunnableC400611 */

                /* renamed from: a */
                final /* synthetic */ C40060b f101812a;

                {
                    this.f101812a = r1;
                }

                public final void run() {
                    Iterator<AbstractC56259u.AbstractC56260a> it = this.f101812a.f101811a.mo145431a().iterator();
                    while (it.hasNext()) {
                        it.next().mo191729a();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56259u
    /* renamed from: a */
    public void mo145432a(AbstractC56259u.AbstractC56260a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "newListener");
        mo145431a().add(aVar);
        if (this.f101809a == null) {
            this.f101809a = new C40060b(this);
            ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            if (iCoreApi != null) {
                iCoreApi.registerTimeFormatSettingObserver(this.f101809a);
            }
        }
    }

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56259u
    /* renamed from: b */
    public void mo145433b(AbstractC56259u.AbstractC56260a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        mo145431a().remove(aVar);
        if (this.f101809a != null && mo145431a().size() == 0) {
            ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            if (iCoreApi != null) {
                iCoreApi.unRegisterTimeFormatSettingObserver(this.f101809a);
            }
            this.f101809a = null;
        }
    }
}
