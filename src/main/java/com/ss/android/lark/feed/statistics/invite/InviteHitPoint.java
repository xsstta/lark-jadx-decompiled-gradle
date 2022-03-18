package com.ss.android.lark.feed.statistics.invite;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/feed/statistics/invite/InviteHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "PARAM_ADMIN", "", "PARAM_MEMBER", "PARAM_PERSONAL", "sendAddPeopleEntryFeedExternalClick", "", "userType", "sendAddPeopleEntryFeedMemberClick", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.f.e.a */
public final class InviteHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final InviteHitPoint f97736a = new InviteHitPoint();

    private InviteHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m149824a() {
        Statistics.sendEvent("add_people_entry_feed_member_click");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m149825a(int i) {
        Statistics.sendEvent("add_people_entry_feed_external_click", new JSONObject().put("ug_user_type", i));
    }
}
