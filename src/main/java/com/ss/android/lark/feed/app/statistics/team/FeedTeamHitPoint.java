package com.ss.android.lark.feed.app.statistics.team;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020\u0018H\u0007J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0003J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0018\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001dH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/feed/app/statistics/team/FeedTeamHitPoint;", "", "()V", "CHAT_ID", "", "CHAT_UNREAD_NUM", "CLICK", "CLICK_CLICK_CHAT", "CLICK_CLICK_TEAM", "CLICK_CREATE_TEAM", "CLICK_MORE_TEAM", "EVENT_FEED_TEAM_CLICK", "FALSE", "IS_DEFAULT", "IS_DEFAULT_CHAT", "IS_NARROW", "NONE", "TARGET", "TARGET_FEED_CREATE_TEAM_VIEW", "TARGET_FEED_TEAM_MORE_VIEW", "TARGET_IM_CHAT_MAIN_VIEW", "TEAM_ID", "TRUE", "sendChatClick", "", "teamId", "", "chatId", "isDefaultChat", "", "chatUnreadNum", "", "sendEmptyCreateClick", "sendFeedTeamClick", "jsonObject", "Lorg/json/JSONObject;", "sendMoreTeamClick", "sendTeamClick", "isNarrow", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.statistics.c.a */
public final class FeedTeamHitPoint {

    /* renamed from: a */
    public static final FeedTeamHitPoint f97024a = new FeedTeamHitPoint();

    private FeedTeamHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148840a() {
        JSONObject put = new JSONObject().put("click", "create_team").put("target", "feed_create_team_view").put("is_default", "true");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject()\n           …   .put(IS_DEFAULT, TRUE)");
        m148844a(put);
    }

    @JvmStatic
    /* renamed from: a */
    private static final void m148844a(JSONObject jSONObject) {
        Statistics.sendEvent("feed_team_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148841a(long j) {
        JSONObject put = new JSONObject().put("click", "more_team").put("target", "feed_team_more_view").put("team_id", j);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject()\n           …    .put(TEAM_ID, teamId)");
        m148844a(put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148843a(long j, boolean z) {
        String str;
        JSONObject put = new JSONObject().put("click", "click_team").put("target", "none").put("team_id", j);
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        JSONObject put2 = put.put("is_narrow", str);
        Intrinsics.checkExpressionValueIsNotNull(put2, "JSONObject()\n           …sNarrow) TRUE else FALSE)");
        m148844a(put2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148842a(long j, long j2, boolean z, int i) {
        String str;
        JSONObject put = new JSONObject().put("click", "click_chat").put("target", "im_chat_main_view").put("team_id", j).put("chat_id", j2);
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        JSONObject put2 = put.put("is_default_chat", str).put("chat_unread_num", i);
        Intrinsics.checkExpressionValueIsNotNull(put2, "JSONObject()\n           …NREAD_NUM, chatUnreadNum)");
        m148844a(put2);
    }
}
