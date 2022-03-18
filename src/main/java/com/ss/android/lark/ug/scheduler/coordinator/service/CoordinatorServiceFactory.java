package com.ss.android.lark.ug.scheduler.coordinator.service;

import com.ss.android.lark.ug.scheduler.common.api.OnSchedulerCallback;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/coordinator/service/CoordinatorServiceFactory;", "", "()V", "createCoordinatorService", "Lcom/ss/android/lark/ug/scheduler/coordinator/service/CoordinatorServiceImpl;", "onSchedulerCallback", "Lcom/ss/android/lark/ug/scheduler/common/api/OnSchedulerCallback;", "createCoordinatorService$ug_reach_sdk_release", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.coordinator.a.a */
public final class CoordinatorServiceFactory {

    /* renamed from: a */
    public static final CoordinatorServiceFactory f141786a = new CoordinatorServiceFactory();

    private CoordinatorServiceFactory() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final CoordinatorServiceImpl m223434a(OnSchedulerCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onSchedulerCallback");
        return new CoordinatorServiceImpl(bVar);
    }
}
