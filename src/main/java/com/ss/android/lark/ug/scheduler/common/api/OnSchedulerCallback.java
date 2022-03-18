package com.ss.android.lark.ug.scheduler.common.api;

import com.bytedance.lark.pb.ugreach.v1.ReachPointEntity;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/common/api/OnSchedulerCallback;", "", "onHide", "", "reachPointEntities", "", "Lcom/bytedance/lark/pb/ugreach/v1/ReachPointEntity;", "onShow", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.common.a.b */
public interface OnSchedulerCallback {
    /* renamed from: a */
    void mo195145a(Collection<ReachPointEntity> collection);

    /* renamed from: b */
    void mo195146b(Collection<ReachPointEntity> collection);
}
