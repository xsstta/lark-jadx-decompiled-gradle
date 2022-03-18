package com.ss.android.lark.feed.app.statistics.feed;

import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.statistics.Statistics;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004-./0B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0014H\u0007J2\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00192\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007J\u0019\u0010\u001d\u001a\u00020\u00142\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0019H\u0007J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\"H\u0007J\b\u0010#\u001a\u00020\u0014H\u0007J\u001a\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020'H\u0007J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020)H\u0007J\u0018\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/feed/app/statistics/feed/FeedHitPointNew;", "", "()V", "AB_VERSION_ID", "", "CHAT_ID", "CLICK", "FALSE", "FILE_ID", "IS_AB_TEST", "NONE", "TARGET", "TRUE", "curFilter", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "getCurFilter", "()Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "filterTabNum", "", "sendFeedDelayedPopUpClick", "", "param", "Lcom/ss/android/lark/feed/app/statistics/feed/FeedHitPointNew$FeedDelayedPopupClickParam;", "sendFeedDelayedPopUpView", "sendFeedMainClick", "Lcom/ss/android/lark/feed/app/statistics/feed/FeedHitPointNew$FeedMainClickParam;", "extraParam", "", "targetTab", "sendFeedMainView", "tabNum", "(Ljava/lang/Integer;)V", "sendFeedMoreTabClick", "sendFeedPlusClick", "Lcom/ss/android/lark/feed/app/statistics/feed/FeedHitPointNew$FeedPlusClickParam;", "sendFeedPlusView", "sendFeedTopClick", "id", "isDoc", "", "sendNavigationTopClick", "Lcom/ss/android/lark/feed/app/statistics/feed/FeedHitPointNew$NavigationTopClickParam;", "sendOnboardingTeamGuideABTestStatusServer", "isABTest", "versionId", "FeedDelayedPopupClickParam", "FeedMainClickParam", "FeedPlusClickParam", "NavigationTopClickParam", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FeedHitPointNew {

    /* renamed from: a */
    public static final FeedHitPointNew f97025a = new FeedHitPointNew();

    /* renamed from: b */
    private static int f97026b = -1;

    @JvmStatic
    /* renamed from: a */
    public static final void m148845a() {
        m148854a((Integer) null, 1, (Object) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148848a(FeedMainClickParam feedMainClickParam, Map<String, ? extends Object> map) {
        m148850a(feedMainClickParam, map, null, 4, null);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m148858b(FeedMainClickParam feedMainClickParam) {
        m148850a(feedMainClickParam, null, null, 6, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/feed/app/statistics/feed/FeedHitPointNew$FeedDelayedPopupClickParam;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "ESC", "OPEN", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum FeedDelayedPopupClickParam {
        ESC("esc", "feed_main_view"),
        OPEN("open", "feed_grouping_edit_view");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private FeedDelayedPopupClickParam(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/feed/app/statistics/feed/FeedHitPointNew$FeedMainClickParam;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "FEED_GROUPING_TAB", "FEED_MORE_TAB_MOBILE", "FEED_LEFTCLICK_CHAT", "FEED_LEFTCLICK_DOC", "FEED_LEFTSLIDE", "FEED_RIGHTSLIDE", "FEED_DONE_MOBILE", "MESSAGE_SETTING", "FEED_MORE_TAB_TO_SETTING", "FEED_MORE_TAB_TO_EDIT", "FEED_MORE_TAB_TO_CANCEL", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum FeedMainClickParam {
        FEED_GROUPING_TAB("feed_grouping_tab", "none"),
        FEED_MORE_TAB_MOBILE("feed_more_tab_mobile", "feed_grouping_edit_view"),
        FEED_LEFTCLICK_CHAT("feed_leftclick_chat", "im_chat_main_view"),
        FEED_LEFTCLICK_DOC("feed_leftclick_doc", "ccm_docs_page_view"),
        FEED_LEFTSLIDE("feed_leftslide", "feed_leftslide_detail_view"),
        FEED_RIGHTSLIDE("feed_rightslide", "feed_rightslide_detail_view"),
        FEED_DONE_MOBILE("feed_done_mobile", ""),
        MESSAGE_SETTING("message_setting", "setting_main_view"),
        FEED_MORE_TAB_TO_SETTING("grouping_setting", "setting_detail_view"),
        FEED_MORE_TAB_TO_EDIT("feed_grouping_edit", "feed_grouping_edit_view"),
        FEED_MORE_TAB_TO_CANCEL("cancel", "none");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private FeedMainClickParam(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/feed/app/statistics/feed/FeedHitPointNew$FeedPlusClickParam;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "GROUP_CREATE", "SCAN_QR_CODE", "IM_CONTACT_ADD_EXTERNAL_VIEW", "CREATE_DOCS", "NEW_MEETING", "JOIN_MEETING", "SHARE_SCREEN", "CREATE_TEAM", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum FeedPlusClickParam {
        GROUP_CREATE("group_create", "im_group_create_view"),
        SCAN_QR_CODE("scan_QR_code", "lark_app_add_external_contact_scan_qrcode_view"),
        IM_CONTACT_ADD_EXTERNAL_VIEW("im_contact_add_external_view", "contact_add_external_view"),
        CREATE_DOCS("create_docs", "ccm_docs_page_view"),
        NEW_MEETING("new_meeting", "vc_meeting_pre_view"),
        JOIN_MEETING("join_meeting", "vc_meeting_pre_view"),
        SHARE_SCREEN("share_screen", "vc_meeting_sharewindow_view"),
        CREATE_TEAM("mobile_create_team", "feed_create_team_type_view");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private FeedPlusClickParam(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/feed/app/statistics/feed/FeedHitPointNew$NavigationTopClickParam;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "SEARCH", "FEED_PLUS", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum NavigationTopClickParam {
        SEARCH("search", "search_main_view"),
        FEED_PLUS("feed_plus", "feed_plus_view");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private NavigationTopClickParam(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    private FeedHitPointNew() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148855a(String str, boolean z) {
        JSONObject jSONObject;
        if (z) {
            jSONObject = new JSONObject().put("click", "top_icon_doc_leftclick").put("target", "im_chat_main_view").put("file_id", str);
        } else {
            jSONObject = new JSONObject().put("click", "top_icon_chat_leftclick").put("target", "ccm_docs_page_view").put("chat_id", str);
        }
        Statistics.sendEvent("feed_top_click", jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m148854a(Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        m148853a(num);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148856a(boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "versionId");
        Statistics.sendEvent("onboarding_team_guide_ab_test_status_server", new JSONObject().put("is_ab_test", z ? "true" : "false").put("ab_version_id", str));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m148857b() {
        Statistics.sendEvent("feed_plus_view");
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m148859c() {
        Statistics.sendEvent("feed_delayed_popup_view");
    }

    /* renamed from: d */
    private final FeedFilter m148860d() {
        C37548b a = C37548b.m147657a();
        Intrinsics.checkExpressionValueIsNotNull(a, "FilterStatusManager.inst()");
        FeedFilter b = a.mo137792b();
        if (b != null) {
            return b;
        }
        return FeedFilter.INBOX;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148846a(FeedDelayedPopupClickParam feedDelayedPopupClickParam) {
        Intrinsics.checkParameterIsNotNull(feedDelayedPopupClickParam, "param");
        Statistics.sendEvent("feed_delayed_popup_click", new JSONObject().put("click", feedDelayedPopupClickParam.getAction()).put("target", feedDelayedPopupClickParam.getTarget()));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148847a(FeedMainClickParam feedMainClickParam) {
        Intrinsics.checkParameterIsNotNull(feedMainClickParam, "param");
        Statistics.sendEvent("feed_more_tab_detail_click", new JSONObject().put("click", feedMainClickParam.getAction()).put("target", feedMainClickParam.getTarget()));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148851a(FeedPlusClickParam feedPlusClickParam) {
        Intrinsics.checkParameterIsNotNull(feedPlusClickParam, "param");
        Statistics.sendEvent("feed_plus_click", new JSONObject().put("click", feedPlusClickParam.getAction()).put("target", feedPlusClickParam.getTarget()));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148852a(NavigationTopClickParam navigationTopClickParam) {
        Intrinsics.checkParameterIsNotNull(navigationTopClickParam, "param");
        Statistics.sendEvent("navigation_top_click", new JSONObject().put("click", navigationTopClickParam.getAction()).put("target", navigationTopClickParam.getTarget()));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148853a(Integer num) {
        int i;
        String str;
        if (num != null) {
            i = num.intValue();
        } else {
            i = RangesKt.coerceAtLeast(f97026b, 0);
        }
        f97026b = i;
        JSONObject put = new JSONObject().put("feed_grouping_tab_num", f97026b);
        if (f97026b > 0) {
            str = "true";
        } else {
            str = "false";
        }
        Statistics.sendEvent("feed_main_view", put.put("is_feed_grouping_tab_show", str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m148849a(FeedMainClickParam feedMainClickParam, Map<String, ? extends Object> map, FeedFilter feedFilter) {
        Intrinsics.checkParameterIsNotNull(feedMainClickParam, "param");
        Intrinsics.checkParameterIsNotNull(feedFilter, "targetTab");
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        JSONObject put = new JSONObject(map).put("click", feedMainClickParam.getAction());
        String name = f97025a.m148860d().name();
        Locale locale = Locale.ROOT;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
        if (name != null) {
            String lowerCase = name.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            JSONObject put2 = put.put("belonged_tab", lowerCase).put("target", feedMainClickParam.getTarget());
            String name2 = feedFilter.name();
            Locale locale2 = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.ROOT");
            if (name2 != null) {
                String lowerCase2 = name2.toLowerCase(locale2);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                Statistics.sendEvent("feed_main_click", put2.put("target_tab", lowerCase2));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static /* synthetic */ void m148850a(FeedMainClickParam feedMainClickParam, Map map, FeedFilter feedFilter, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            feedFilter = f97025a.m148860d();
        }
        m148849a(feedMainClickParam, map, feedFilter);
    }
}
