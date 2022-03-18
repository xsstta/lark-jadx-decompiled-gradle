package com.ss.android.lark.team.stastics;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57859q;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/team/stastics/TeamMemberHitPoint;", "", "()V", "KEY_CLICK", "", "KEY_NEW_TEAM_OWNER", "KEY_TARGET", "VALUE_CANCEL", "VALUE_TARGET_NONE", "onCancelTransferTeamOwner", "", "onConfirmTransferTeamOwner", "newOwnerId", "onShowTransferTeamOwnerPage", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.e.c */
public final class TeamMemberHitPoint {

    /* renamed from: a */
    public static final TeamMemberHitPoint f136855a = new TeamMemberHitPoint();

    private TeamMemberHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m215092a() {
        Statistics.sendEvent("im_transfer_team_owner_view");
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m215094b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "cancel");
        jSONObject.put("target", "none");
        Statistics.sendEvent("im_transfer_team_owner_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m215093a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "newOwnerId");
        String c = C57859q.m224567c(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "transfer_team_owner_and_exit");
        jSONObject.put("target", "none");
        jSONObject.put("new_team_owner", c);
        Statistics.sendEvent("im_transfer_team_owner_click", jSONObject);
    }
}
