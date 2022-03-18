package com.ss.android.lark.moments.impl.hitpoint;

import android.text.TextUtils;
import com.bytedance.lark.pb.moments.v1.Notification;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.utils.C57859q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/hitpoint/MomentsHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.e.c */
public final class MomentsHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f119720a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\r\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0010\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0016\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0017\u001a\u00020\nJ\u0010\u0010\u0018\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\"\u0010\u0019\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004JB\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J8\u0010!\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J8\u0010\"\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u001a\u0010#\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0018\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¨\u0006&"}, d2 = {"Lcom/ss/android/lark/moments/impl/hitpoint/MomentsHitPoint$Companion;", "", "()V", "convertToShareSource", "", ShareHitPoint.f121868c, "getNotificationType", ShareHitPoint.f121869d, "", "sendDetailPageView", "", "postId", "sendEnterCommunityProfile", "sendEnterLarkProfile", "sendFeedCardClick", "sendFeedCardView", "sendFeedView", "sendNotificationCardView", "sendNotificationItemClick", "sendNotificationPageView", "sendNotificationTab", "toPage", "sendPostPageView", "sendPostSendBtnClick", "sendPostSendClick", "sendTabFollow", "isFollow", "", "followUserId", "sendTabReaction", "reactionAction", "action", "commentId", "sendTabReply", "sendTabReplySend", "sendTabShare", "sendTabShareSend", "on", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.e.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo166833a() {
            Statistics.sendEvent("community_tab_send_post");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo166834a(int i) {
            Statistics.sendEvent("community_notification_interaction_card_view", new JSONObject().put(ShareHitPoint.f121869d, m188087c(i)));
        }

        /* renamed from: b */
        public final void mo166840b(int i) {
            Statistics.sendEvent("community_notification_entry_click", new JSONObject().put(ShareHitPoint.f121869d, m188087c(i)));
        }

        /* renamed from: c */
        public final void mo166844c(String str) {
            Statistics.sendEvent("community_notification_page_view", new JSONObject().put(ShareHitPoint.f121869d, str));
        }

        /* renamed from: d */
        public final void mo166846d(String str) {
            Statistics.sendEvent("community_tab_send_post_click", new JSONObject().put(ShareHitPoint.f121868c, str));
        }

        /* renamed from: e */
        public final void mo166848e(String str) {
            Statistics.sendEvent("community_send_post_page_view", new JSONObject().put(ShareHitPoint.f121868c, str));
        }

        /* renamed from: f */
        public final void mo166849f(String str) {
            Statistics.sendEvent("community_enter_lark_profile", new JSONObject().put(ShareHitPoint.f121868c, str));
        }

        /* renamed from: g */
        public final void mo166850g(String str) {
            Statistics.sendEvent("community_enter_community_profile_view", new JSONObject().put(ShareHitPoint.f121868c, str));
        }

        /* renamed from: h */
        private final String m188088h(String str) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (str == null) {
                return str;
            }
            int hashCode = str.hashCode();
            if (hashCode != -2050191939) {
                if (hashCode == -1643902832 && str.equals("feed_page")) {
                    return "feed_page";
                }
                return str;
            } else if (str.equals("detail_page")) {
                return "detail_page";
            } else {
                return str;
            }
        }

        /* renamed from: a */
        public final void mo166835a(String str) {
            Statistics.sendEvent("community_feed_page_view", new JSONObject().put(ShareHitPoint.f121868c, str));
        }

        /* renamed from: b */
        public final void mo166841b(String str) {
            Statistics.sendEvent("community_tab_notification", new JSONObject().put("to_page", str));
        }

        /* renamed from: c */
        private final String m188087c(int i) {
            if (i == Notification.Type.FOLLOWER.ordinal()) {
                return "follow";
            }
            if (i == Notification.Type.POST_REACTION.ordinal()) {
                return "post_reaction";
            }
            if (i == Notification.Type.COMMENT_REACTION.ordinal()) {
                return "comment_reaction";
            }
            if (i == Notification.Type.COMMENT.ordinal()) {
                return "post_reply";
            }
            if (i == Notification.Type.REPLY.ordinal()) {
                return "comment_reply";
            }
            if (i == Notification.Type.AT_IN_POST.ordinal()) {
                return "post_mention";
            }
            if (i == Notification.Type.AT_IN_COMMENT.ordinal()) {
                return "comment_mention";
            }
            return "unknown";
        }

        /* renamed from: c */
        public final void mo166845c(String str, String str2) {
            Statistics.sendEvent("community_detail_page_view", new JSONObject().put(ShareHitPoint.f121868c, str2).put("post_id", str));
        }

        /* renamed from: d */
        public final void mo166847d(String str, String str2) {
            Statistics.sendEvent("community_tab_share", new JSONObject().put(ShareHitPoint.f121868c, m188088h(str)).put("post_id", str2));
        }

        /* renamed from: a */
        public final void mo166836a(String str, String str2) {
            Statistics.sendEvent("community_feed_card_view", new JSONObject().put("post_id", str).put(ShareHitPoint.f121868c, str2));
        }

        /* renamed from: b */
        public final void mo166842b(String str, String str2) {
            Statistics.sendEvent("community_feed_card_click", new JSONObject().put("post_id", str).put(ShareHitPoint.f121868c, str2));
        }

        /* renamed from: a */
        public final void mo166839a(String str, boolean z, String str2) {
            String str3;
            JSONObject put = new JSONObject().put(ShareHitPoint.f121868c, str);
            if (z) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            Statistics.sendEvent("community_tab_follow", put.put("action", str3).put("follow_uid", C57859q.m224565a(str2)));
        }

        /* renamed from: a */
        public final void mo166837a(String str, String str2, String str3, String str4, String str5) {
            Statistics.sendEvent("community_tab_reply", new JSONObject().put("action", str).put(ShareHitPoint.f121869d, str2).put(ShareHitPoint.f121868c, str3).put("comment_id", str4).put("post_id", str5));
        }

        /* renamed from: b */
        public final void mo166843b(String str, String str2, String str3, String str4, String str5) {
            Statistics.sendEvent("community_tab_reply_send", new JSONObject().put("action", str).put(ShareHitPoint.f121869d, str2).put(ShareHitPoint.f121868c, str3).put("comment_id", str4).put("post_id", str5));
        }

        /* renamed from: a */
        public final void mo166838a(String str, String str2, String str3, String str4, String str5, String str6) {
            Statistics.sendEvent("community_tab_reaction", new JSONObject().put("reaction_action", str).put(ShareHitPoint.f121869d, str2).put("action", str4).put(ShareHitPoint.f121868c, str3).put("comment_id", str5).put("post_id", str6));
        }
    }
}
