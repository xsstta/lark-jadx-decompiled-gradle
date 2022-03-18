package com.ss.android.vc.meeting.module.follow.base;

import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.doc.follow.event.PositionKeeperApiCreatedEvent;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.follow.FollowPatch;
import com.ss.android.vc.entity.follow.FollowState;
import com.ss.android.vc.meeting.module.follow.base.BaseFollowRuntime;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.follow.base.b */
public interface AbstractC61784b {
    /* renamed from: a */
    void mo214001a();

    /* renamed from: a */
    void mo214017a(FollowInfo followInfo);

    /* renamed from: a */
    void mo214020a(Map<String, List<FollowState>> map);

    /* renamed from: b */
    void mo214004b(List<FollowState> list);

    /* renamed from: c */
    void mo214022c();

    /* renamed from: c */
    void mo214006c(List<FollowPatch> list);

    /* renamed from: d */
    void mo214023d();

    /* renamed from: e */
    PositionKeeperApiCreatedEvent.AbstractC5429a mo214025e();

    /* renamed from: f */
    FollowInfo mo214026f();

    /* renamed from: g */
    String mo214027g();

    /* renamed from: h */
    BaseFollowRuntime.RuntimeStatus mo214028h();

    /* renamed from: i */
    Map<String, List<FollowState>> mo214029i();

    /* renamed from: l */
    String mo214032l();

    void l_(boolean z);

    /* renamed from: s */
    BaseFollowRuntime.C61778a mo214040s();

    /* renamed from: u */
    void mo214007u();

    /* renamed from: v */
    void mo214008v();

    /* renamed from: w */
    Fragment mo214009w();

    /* renamed from: x */
    void mo214010x();
}
