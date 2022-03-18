package com.ss.android.lark.ug.scheduler.coordinator.entity;

import com.bytedance.lark.pb.ugreach.v1.ReachPointRelation;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DefenseStrategy;", "", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "ROUND_ABORT", "GIVE_UP", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum DefenseStrategy {
    UNKNOWN,
    ROUND_ABORT,
    GIVE_UP;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DefenseStrategy$Companion;", "", "()V", "parse", "Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DefenseStrategy;", "defenseStrategy", "Lcom/bytedance/lark/pb/ugreach/v1/ReachPointRelation$DefenseStrategy;", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.coordinator.entity.DefenseStrategy$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DefenseStrategy mo195295a(ReachPointRelation.DefenseStrategy defenseStrategy) {
            if (defenseStrategy == null) {
                return DefenseStrategy.UNKNOWN;
            }
            int i = C57542b.f141799a[defenseStrategy.ordinal()];
            if (i == 1) {
                return DefenseStrategy.GIVE_UP;
            }
            if (i != 2) {
                return DefenseStrategy.UNKNOWN;
            }
            return DefenseStrategy.ROUND_ABORT;
        }
    }
}
