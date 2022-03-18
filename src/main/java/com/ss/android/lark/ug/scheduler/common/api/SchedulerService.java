package com.ss.android.lark.ug.scheduler.common.api;

import com.bytedance.lark.pb.ugreach.v1.LocalRule;
import com.bytedance.lark.pb.ugreach.v1.ScenarioContext;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointState;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 !2\u00020\u0001:\u0001!J\b\u0010\u0002\u001a\u00020\u0003H&J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u001e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0010H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\""}, d2 = {"Lcom/ss/android/lark/ug/scheduler/common/api/SchedulerService;", "", "clear", "", "handleEventAction", "", "reachPointAction", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "pbLocalRule", "Lcom/bytedance/lark/pb/ugreach/v1/LocalRule;", "Lcom/ss/android/lark/ug/scheduler/common/PBLocalRule;", "onReachPointUpdate", "reachPointState", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointState;", "reachPointIds", "", "", "onScenarioEnter", "scenarioContext", "Lcom/bytedance/lark/pb/ugreach/v1/ScenarioContext;", "onScenarioLeave", "scenarioId", "onScenarioUpdate", "registerOnSchedulerCallback", "onSchedulerCallback", "Lcom/ss/android/lark/ug/scheduler/common/api/OnSchedulerCallback;", "setLogger", "logger", "Lcom/ss/android/lark/ug/scheduler/common/api/Logger;", "setStorage", "storage", "Lcom/ss/android/lark/ug/scheduler/common/api/Storage;", "unregisterOnSchedulerCallback", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.common.a.c */
public interface SchedulerService {

    /* renamed from: a */
    public static final Companion f141770a = Companion.f141771a;

    /* renamed from: a */
    void mo195264a();

    /* renamed from: a */
    void mo195265a(ScenarioContext scenarioContext);

    /* renamed from: a */
    void mo195266a(OnSchedulerCallback bVar);

    /* renamed from: a */
    void mo195267a(ReachPointState reachPointState, Collection<String> collection);

    /* renamed from: a */
    boolean mo195268a(ReachPointAction aVar, LocalRule localRule);

    /* renamed from: b */
    void mo195269b(OnSchedulerCallback bVar);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/common/api/SchedulerService$Companion;", "", "()V", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.common.a.c$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f141771a = new Companion();

        private Companion() {
        }
    }
}
