package com.ss.android.lark.integrator.calendar.dependency;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.ao;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalTimeFormatDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/ITimeFormatDependency;", "()V", "mChangeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/calendar/dependency/idependency/ITimeFormatDependency$ITimeFormatChangeListener;", "getMChangeListeners", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "mChangeListeners$delegate", "Lkotlin/Lazy;", "mSettingObserver", "Lcom/ss/android/lark/biz/core/api/ITimeFormatSettingObserver;", "isTwentyFourHours", "", "registerTimeFormatChangeListener", "", "newListener", "unRegisterTimeFormatChangeListener", "listener", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.af */
public final class CalTimeFormatDependency implements AbstractC30037ag {

    /* renamed from: a */
    private ao f100477a;

    /* renamed from: b */
    private final Lazy f100478b = LazyKt.lazy(C39194a.INSTANCE);

    /* renamed from: b */
    public final CopyOnWriteArrayList<AbstractC30037ag.AbstractC30038a> mo143027b() {
        return (CopyOnWriteArrayList) this.f100478b.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/calendar/dependency/idependency/ITimeFormatDependency$ITimeFormatChangeListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.af$a */
    static final class C39194a extends Lambda implements Function0<CopyOnWriteArrayList<AbstractC30037ag.AbstractC30038a>> {
        public static final C39194a INSTANCE = new C39194a();

        C39194a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CopyOnWriteArrayList<AbstractC30037ag.AbstractC30038a> invoke() {
            return new CopyOnWriteArrayList<>();
        }
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag
    /* renamed from: a */
    public boolean mo108189a() {
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
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.af$b */
    static final class C39195b implements ao {

        /* renamed from: a */
        final /* synthetic */ CalTimeFormatDependency f100479a;

        C39195b(CalTimeFormatDependency afVar) {
            this.f100479a = afVar;
        }

        @Override // com.ss.android.lark.biz.core.api.ao
        public final void onTimeFormatChange(TimeFormatSetting timeFormatSetting) {
            UICallbackExecutor.post(new Runnable(this) {
                /* class com.ss.android.lark.integrator.calendar.dependency.CalTimeFormatDependency.C39195b.RunnableC391961 */

                /* renamed from: a */
                final /* synthetic */ C39195b f100480a;

                {
                    this.f100480a = r1;
                }

                public final void run() {
                    Iterator<AbstractC30037ag.AbstractC30038a> it = this.f100480a.f100479a.mo143027b().iterator();
                    while (it.hasNext()) {
                        it.next().mo108191a();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag
    /* renamed from: a */
    public void mo108188a(AbstractC30037ag.AbstractC30038a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "newListener");
        mo143027b().add(aVar);
        if (this.f100477a == null) {
            this.f100477a = new C39195b(this);
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerTimeFormatSettingObserver(this.f100477a);
        }
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag
    /* renamed from: b */
    public void mo108190b(AbstractC30037ag.AbstractC30038a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        mo143027b().remove(aVar);
        if (this.f100477a != null && mo143027b().size() == 0) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterTimeFormatSettingObserver(this.f100477a);
            this.f100477a = null;
        }
    }
}
