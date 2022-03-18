package com.ss.android.lark.ug.scheduler.coordinator.entity;

import com.bytedance.lark.pb.ugreach.v1.ReachPointRelation;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.coordinator.entity.b */
public final /* synthetic */ class C57542b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f141799a;

    static {
        int[] iArr = new int[ReachPointRelation.DefenseStrategy.values().length];
        f141799a = iArr;
        iArr[ReachPointRelation.DefenseStrategy.GIVE_UP.ordinal()] = 1;
        iArr[ReachPointRelation.DefenseStrategy.ROUNDABOUT.ordinal()] = 2;
    }
}
