package com.ss.android.lark.statistics.thread;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/statistics/thread/ThreadTopicHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.u.a */
public final class ThreadTopicHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f135906a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ&\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\fJ\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\tJ\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\tJ\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\tJ\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tJ\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010$\u001a\u00020\u0004J\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tJ\u0006\u0010'\u001a\u00020\u0004JF\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tJ\u0006\u00102\u001a\u00020\u0004J\u001e\u00103\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u00104\u001a\u00020\tJ\u001e\u00105\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u00104\u001a\u00020\tJ8\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\t2\u0006\u00108\u001a\u00020\f2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tJ\u0016\u00109\u001a\u00020\u00042\u0006\u00101\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tJ\u0016\u0010:\u001a\u00020\u00042\u0006\u00101\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tJ\u0016\u0010;\u001a\u00020\u00042\u0006\u00101\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tJ\u0006\u0010<\u001a\u00020\u0004J\u0006\u0010=\u001a\u00020\u0004J\u000e\u0010>\u001a\u00020\u00042\u0006\u00104\u001a\u00020\tJ\u000e\u0010?\u001a\u00020\u00042\u0006\u00101\u001a\u00020\tJ\u000e\u0010@\u001a\u00020\u00042\u0006\u00101\u001a\u00020\tJ\u0006\u0010A\u001a\u00020\u0004J\u0006\u0010B\u001a\u00020\u0004J\u0006\u0010C\u001a\u00020\u0004J\u0016\u0010D\u001a\u00020\u00042\u0006\u00101\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tJ\u0016\u0010E\u001a\u00020\u00042\u0006\u00101\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010F\u001a\u00020\u00042\u0006\u00104\u001a\u00020\tJ\u000e\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\t¨\u0006I"}, d2 = {"Lcom/ss/android/lark/statistics/thread/ThreadTopicHitPoint$Companion;", "", "()V", "sendChangeToAllTabEvent", "", "sendChangeToFollowTabEvent", "sendClickReplyArea", "sendConnectCreateChannelEvent", ShareHitPoint.f121868c, "", "sendConnectNewPostsEvent", "groupType", "", "channelType", "postType", "sendConnectNewReplyEvent", "replyType", "sendDetailLongPressEvent", "userId", "sendGroupTopicReactionButtonClickEvent", "sendGroupTopicReplyButtonClickEvent", "sendGroupTopicReplyNumClickEvent", "sendGroupsBubbleClickEvent", ShareHitPoint.f121869d, "sendGroupsFilterContainerTabClickEvent", "sendGroupsFilterSubTabClickEvent", "sendGroupsTabClick", "activity", "sendGroupsTabEnterDefaultGroup", "sendGroupsTabEnterGroup", "sendGroupsTabNewPostEditChangGroupEvent", "action", "sendGroupsTabNewPostEditEvent", "sendGroupsTabNewPostEvent", "actionType", "sendGroupsTabNewPostSelectGroupEvent", "sendGroupsTabRecommendGroupsJoin", "sendGroupsTabRecommendGroupsSeeAll", "sendGroupsTabRecommendGroupsSeeAllAction", "sendGroupsTabRefresh", "sendScreenActiveThreadEvent", "threadId", "impressionId", "itemHeight", "itemExposedHeight", "lastActiveTime", "isFastScroll", "", "threadLocation", "chatId", "sendThreadClickFrom", "sendThreadFollow", "location", "sendThreadUnFollow", "sendThreadUserInteractionEvent", "interactionType", "positionInImpression", "sendTopicCloseClickCancelEvent", "sendTopicCloseClickConfirmEvent", "sendTopicCloseClickEvent", "sendTopicDeleteCancelEvent", "sendTopicDeleteConfirmEvent", "sendTopicDeleteEvent", "sendTopicNewAnnouncementClickEvent", "sendTopicNewAnnouncementRemindEvent", "sendTopicRecallCancelEvent", "sendTopicRecallConfirmEvent", "sendTopicRecallEvent", "sendTopicReopenEvent", "sendTopicTitleBarClickEvent", "sendTopicViewReplyEvent", "sendUserDurationCreateContentEvent", "duration", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.u.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo187711a() {
            Statistics.sendEvent("group_topicmode_clickreplybutton");
        }

        /* renamed from: b */
        public final void mo187720b() {
            Statistics.sendEvent("group_topicmode_clickreplynumbutton");
        }

        /* renamed from: c */
        public final void mo187724c() {
            Statistics.sendEvent("group_topicmode_clickfrom");
        }

        /* renamed from: d */
        public final void mo187727d() {
            Statistics.sendEvent("group_topicmode_clickreplyarea");
        }

        /* renamed from: e */
        public final void mo187730e() {
            Statistics.sendEvent("group_topicmode_topic_delete_confirm");
        }

        /* renamed from: f */
        public final void mo187732f() {
            Statistics.sendEvent("group_topicmode_topic_delete_cancel");
        }

        /* renamed from: g */
        public final void mo187734g() {
            Statistics.sendEvent("group_topicmode_topic_message_recall");
        }

        /* renamed from: h */
        public final void mo187736h() {
            Statistics.sendEvent("group_topicmode_topic_message_recall_confirm");
        }

        /* renamed from: i */
        public final void mo187738i() {
            Statistics.sendEvent("group_topicmode_topic_message_recall_cancel");
        }

        /* renamed from: j */
        public final void mo187740j() {
            Statistics.sendEvent("topic_all_to_follow");
        }

        /* renamed from: k */
        public final void mo187742k() {
            Statistics.sendEvent("topic_follow_to_all");
        }

        /* renamed from: l */
        public final void mo187744l() {
            Statistics.sendEvent("groups_tab_recommendgroups_seeall");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo187712a(int i) {
            if (i == 6) {
                Statistics.sendEvent("group_mention_bubble_click");
            } else {
                Statistics.sendEvent("group_reply_bubble_click");
            }
        }

        /* renamed from: b */
        public final void mo187721b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "location");
            Statistics.sendEvent("group_topicmode_topic_delete", new JSONObject().put("location", str));
        }

        /* renamed from: c */
        public final void mo187725c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "location");
            Statistics.sendEvent("group_topicmode_topic_viewreply", new JSONObject().put("location", str));
        }

        /* renamed from: d */
        public final void mo187728d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("group_topicmode_topic_NewAnnouncement_Remind", new JSONObject().put("chat_id", str));
        }

        /* renamed from: e */
        public final void mo187731e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("group_topicmode_topic_NewAnnouncement_click", new JSONObject().put("chat_id", str));
        }

        /* renamed from: f */
        public final void mo187733f(String str) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            Statistics.sendEvent("groups_tab_entedefaultrgroup", new JSONObject().put(ShareHitPoint.f121869d, str));
        }

        /* renamed from: g */
        public final void mo187735g(String str) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            Statistics.sendEvent("groups_tab_entergroup", new JSONObject().put(ShareHitPoint.f121869d, str));
        }

        /* renamed from: h */
        public final void mo187737h(String str) {
            Intrinsics.checkParameterIsNotNull(str, "actionType");
            Statistics.sendEvent("groups_tab_newpost", new JSONObject().put("action_type", str));
        }

        /* renamed from: i */
        public final void mo187739i(String str) {
            Intrinsics.checkParameterIsNotNull(str, "action");
            Statistics.sendEvent("groups_tab_newpost_selectgroup", new JSONObject().put("action", str));
        }

        /* renamed from: j */
        public final void mo187741j(String str) {
            Intrinsics.checkParameterIsNotNull(str, "action");
            Statistics.sendEvent("groups_tab_newpost_edit_changgroup", new JSONObject().put("action", str));
        }

        /* renamed from: k */
        public final void mo187743k(String str) {
            Intrinsics.checkParameterIsNotNull(str, "action");
            Statistics.sendEvent("groups_tab_newpost_edit", new JSONObject().put("action", str));
        }

        /* renamed from: l */
        public final void mo187745l(String str) {
            Intrinsics.checkParameterIsNotNull(str, "duration");
            Statistics.sendEvent("connect_user_duration_create_content", new JSONObject().put("duration", str));
        }

        /* renamed from: a */
        public final void mo187715a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Statistics.sendEvent("group_topicmode_detail_longpress", new JSONObject().put("user_id", str));
        }

        /* renamed from: a */
        public final void mo187713a(int i, int i2) {
            Statistics.sendEvent("connect_new_reply", new JSONObject().put("channel_type", i).put("reply_type", i2));
        }

        /* renamed from: b */
        public final void mo187722b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "threadId");
            Statistics.sendEvent("group_topicmode_topic_reopen_click", new JSONObject().put("chat_id", str).put("topic_id", str2));
        }

        /* renamed from: c */
        public final void mo187726c(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "threadId");
            Statistics.sendEvent("group_topicmode_topic_close_click_confirm", new JSONObject().put("chat_id", str).put("topic_id", str2));
        }

        /* renamed from: d */
        public final void mo187729d(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "threadId");
            Statistics.sendEvent("group_topicmode_topic_close_click_cancel", new JSONObject().put("chat_id", str).put("topic_id", str2));
        }

        /* renamed from: a */
        public final void mo187716a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "threadId");
            Statistics.sendEvent("group_topicmode_topic_close_click", new JSONObject().put("chat_id", str).put("topic_id", str2));
        }

        /* renamed from: b */
        public final void mo187723b(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "threadId");
            Intrinsics.checkParameterIsNotNull(str2, "chatId");
            Intrinsics.checkParameterIsNotNull(str3, "location");
            Statistics.sendEvent("group_topicmode_followtopic_click", new JSONObject().put("topic_id", str).put("chat_id", str2).put("location", str3));
        }

        /* renamed from: a */
        public final void mo187718a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "threadId");
            Intrinsics.checkParameterIsNotNull(str2, "chatId");
            Intrinsics.checkParameterIsNotNull(str3, "location");
            Statistics.sendEvent("group_topicmode_unfollowtopic_click", new JSONObject().put("topic_id", str).put("chat_id", str2).put("location", str3));
        }

        /* renamed from: a */
        public final void mo187714a(int i, String str, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            Statistics.sendEvent("connect_new_posts", new JSONObject().put("group_type", i).put(ShareHitPoint.f121868c, str).put("channel_type", i2).put("post_type", i3));
        }

        /* renamed from: a */
        public final void mo187719a(String str, String str2, String str3, int i, String str4, String str5) {
            Intrinsics.checkParameterIsNotNull(str, "interactionType");
            Intrinsics.checkParameterIsNotNull(str2, "threadId");
            Intrinsics.checkParameterIsNotNull(str4, "threadLocation");
            Intrinsics.checkParameterIsNotNull(str5, "chatId");
            if (str3 == null) {
                str3 = "-1";
            }
            Statistics.sendEvent("thread_user_interaction", new JSONObject().put("interaction_type", str).put("thread_id", str2).put("impression_id", str3).put("position_in_impression", i).put("thread_location", str4).put("chat_id", str5));
        }

        /* renamed from: a */
        public final void mo187717a(String str, String str2, int i, int i2, int i3, boolean z, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "threadId");
            Intrinsics.checkParameterIsNotNull(str2, "impressionId");
            Intrinsics.checkParameterIsNotNull(str3, "threadLocation");
            Intrinsics.checkParameterIsNotNull(str4, "chatId");
            Statistics.sendEvent("screen_active_thread_signal", new JSONObject().put("thread_id", str).put("impression_id", str2).put("item_height", i).put("item_exposed_height", i2).put("last_active_time", i3).put("current_fast_scroll", z ? 1 : 0).put("thread_location", str3).put("chat_id", str4));
        }
    }
}
