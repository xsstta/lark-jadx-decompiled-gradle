package com.ss.android.lark.moments.impl.hitpoint;

import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.mainview.badge.MomentsNotificationManager;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57859q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/hitpoint/MomentsHitPointNew;", "", "()V", "Companion", "Params", "Value", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.e.d */
public final class MomentsHitPointNew {

    /* renamed from: a */
    public static final Companion f119721a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004J0\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0002J*\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006J6\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018J?\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004J0\u0010#\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0018J\u001e\u0010&\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\u001e\u0010(\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J \u0010*\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u000e\u0010+\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0018¨\u0006."}, d2 = {"Lcom/ss/android/lark/moments/impl/hitpoint/MomentsHitPointNew$Companion;", "", "()V", "sendEditPageClick", "", "click", "", "target", "sendEditPageView", "sendEvent", "eventName", "params", "Lorg/json/JSONObject;", "postId", "pageId", "sendFollowPageClick", "pageType", "userId", "sendFollowPageView", "sendMomentsDetailPageClick", "hashTagId", "followUserId", "sendMomentsDetailPageView", "isFollow", "", "sendMomentsFeedPageClick", "badgeCount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "sendMomentsFeedPageShowClick", "dataList", "", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "sendMomentsFeedPageView", "sendMomentsNavigationClick", "sendMomentsNotificationPageClick", "sendMomentsNotificationPageView", "isInReaction", "sendMsgMenuClick", "sendMsgMenuView", "sendPostMoreClick", "sendPostMoreView", "sendSecretChatConfirmClick", "sendSecretChatConfirmView", "sendSettingDetailClick", "isOpenOperation", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.e.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo166856a(String str, String str2, String str3, String str4, Integer num) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            JSONObject jSONObject = new JSONObject();
            if (MomentsHitHelper.f119719r.mo166824n() == 6) {
                jSONObject.put("profile_user_id", C57859q.m224565a(MomentsHitHelper.f119719r.mo166830r()));
                Object s = MomentsHitHelper.f119719r.mo166831s();
                if (s == null) {
                    s = "none";
                }
                jSONObject.put("is_follow", s);
            }
            jSONObject.put("page_type", MomentsHitHelper.f119719r.mo166824n());
            jSONObject.put("page_detail", MomentsHitHelper.f119719r.mo166826o());
            jSONObject.put("click", str);
            jSONObject.put("target", str2);
            if (str4 != null) {
                jSONObject.put("hashtag_id", str4);
            }
            if (num != null) {
                jSONObject.put("badge_count", num.intValue());
            }
            m188111a(this, "moments_feed_page_click", jSONObject, str3, (String) null, 8, (Object) null);
        }

        /* renamed from: a */
        public final boolean mo166860a(List<? extends IMomentsItemBase> list) {
            Intrinsics.checkParameterIsNotNull(list, "dataList");
            boolean z = false;
            for (T t : list) {
                if (t instanceof MomentsPostVM) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("page_type", MomentsHitHelper.f119719r.mo166824n());
                    jSONObject.put("page_detail", MomentsHitHelper.f119719r.mo166826o());
                    m188111a(MomentsHitPointNew.f119721a, "moments_feed_page_show_click", jSONObject, t.mo166379a(), (String) null, 8, (Object) null);
                    z = true;
                }
            }
            return z;
        }

        /* renamed from: a */
        public final void mo166858a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_follow", z);
            m188112a("moments_detail_page_view", jSONObject, str, MomentsHitHelper.f119719r.mo166829q());
        }

        /* renamed from: a */
        public final void mo166857a(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            Intrinsics.checkParameterIsNotNull(str2, "click");
            Intrinsics.checkParameterIsNotNull(str3, "target");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", str2);
            jSONObject.put("target", str3);
            if (str4 != null) {
                jSONObject.put("hashtag_id", str4);
            }
            if (str5 != null) {
                jSONObject.put("follow_user_id", str5);
            }
            m188112a("moments_detail_page_click", jSONObject, str, MomentsHitHelper.f119719r.mo166829q());
        }

        /* renamed from: a */
        public final void mo166859a(boolean z) {
            MomentsHitHelper.f119719r.mo166813h(z ? "emoji" : "interaction");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("notification_type", MomentsHitHelper.f119719r.mo166816j());
            m188111a(this, "moments_notification_page_view", jSONObject, (String) null, (String) null, 12, (Object) null);
        }

        /* renamed from: a */
        public final void mo166855a(String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str2, "click");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", str2);
            jSONObject.put("notification_type", MomentsHitHelper.f119719r.mo166816j());
            if (str3 != null) {
                jSONObject.put("target", str3);
            }
            if (str4 != null) {
                jSONObject.put("follow_user_id", C57859q.m224565a(str4));
            }
            m188111a(this, "moments_notification_page_click", jSONObject, str, (String) null, 8, (Object) null);
        }

        /* renamed from: a */
        public final void mo166853a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", str);
            jSONObject.put("target", str2);
            m188111a(this, "moments_edit_page_click", jSONObject, (String) null, (String) null, 12, (Object) null);
        }

        /* renamed from: a */
        public final void mo166854a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            Intrinsics.checkParameterIsNotNull(str2, "click");
            Intrinsics.checkParameterIsNotNull(str3, "target");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", str2);
            jSONObject.put("target", str3);
            m188111a(this, "moments_post_more_click", jSONObject, str, (String) null, 8, (Object) null);
        }

        /* renamed from: c */
        public final void mo166866c() {
            m188111a(this, "moments_edit_page_view", (JSONObject) null, (String) null, (String) null, 14, (Object) null);
        }

        /* renamed from: b */
        public final void mo166861b() {
            String str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "moments");
            jSONObject.put("target", "moments_feed_page_view");
            int i = C47452e.f119722a[MomentsDependencyHolder.f118998b.mo165899a().mainDependency().mo144720b("moments").ordinal()];
            String str2 = "none";
            if (i == 1) {
                str = "primary";
            } else if (i != 2) {
                str = str2;
            } else {
                str = "quick";
            }
            jSONObject.put("location", str);
            jSONObject.put("order", MomentsDependencyHolder.f118998b.mo165899a().mainDependency().mo144722c("moments") + 1);
            int h = MomentsNotificationManager.f120258a.mo167395h();
            if (h != 0) {
                str2 = "red_number";
            } else if (MomentsNotificationManager.f120258a.mo167396i()) {
                str2 = "red_dot";
            }
            jSONObject.put("badge_type", str2);
            jSONObject.put("badge_number", h);
            jSONObject.put("is_reminder", !UserGlobalConfigAndSettingsManager.f120180a.mo167308f());
            m188111a(this, "moments_navigation_click", jSONObject, (String) null, (String) null, 12, (Object) null);
        }

        /* renamed from: a */
        public final void mo166851a() {
            JSONObject jSONObject = new JSONObject();
            if (MomentsHitHelper.f119719r.mo166824n() == 6) {
                jSONObject.put("profile_user_id", C57859q.m224565a(MomentsHitHelper.f119719r.mo166830r()));
                Object s = MomentsHitHelper.f119719r.mo166831s();
                if (s == null) {
                    s = "none";
                }
                jSONObject.put("is_follow", s);
            }
            jSONObject.put("page_type", MomentsHitHelper.f119719r.mo166824n());
            jSONObject.put("page_detail", MomentsHitHelper.f119719r.mo166826o());
            m188111a(this, "moments_feed_page_view", jSONObject, (String) null, (String) null, 12, (Object) null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final void mo166862b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            m188111a(this, "moments_msg_menu_view", (JSONObject) null, str, (String) null, 10, (Object) null);
        }

        /* renamed from: c */
        public final void mo166867c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            m188111a(this, "moments_secret_chat_confirm_view", (JSONObject) null, str, (String) null, 10, (Object) null);
        }

        /* renamed from: d */
        public final void mo166869d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "pageType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page_type", str);
            m188111a(this, "moments_follow_page_view", jSONObject, (String) null, (String) null, 12, (Object) null);
        }

        /* renamed from: b */
        public final void mo166865b(boolean z) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "moments_on_notice";
            } else {
                str = "moments_off_notice";
            }
            jSONObject.put("click", str);
            jSONObject.put("target", "none");
            m188111a(this, "setting_detail_click", jSONObject, (String) null, (String) null, 12, (Object) null);
        }

        /* renamed from: a */
        public final void mo166852a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            m188111a(this, "moments_post_more_view", (JSONObject) null, str, (String) null, 10, (Object) null);
        }

        /* renamed from: b */
        public final void mo166863b(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            Intrinsics.checkParameterIsNotNull(str2, "click");
            Intrinsics.checkParameterIsNotNull(str3, "target");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", str2);
            jSONObject.put("target", str3);
            m188111a(this, "moments_msg_menu_click", jSONObject, str, (String) null, 8, (Object) null);
        }

        /* renamed from: c */
        public final void mo166868c(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            Intrinsics.checkParameterIsNotNull(str2, "click");
            Intrinsics.checkParameterIsNotNull(str3, "target");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", str2);
            jSONObject.put("target", str3);
            m188111a(this, "moments_secret_chat_confirm_click", jSONObject, str, (String) null, 8, (Object) null);
        }

        /* renamed from: b */
        public final void mo166864b(String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "pageType");
            Intrinsics.checkParameterIsNotNull(str2, "click");
            Intrinsics.checkParameterIsNotNull(str3, "target");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", str2);
            jSONObject.put("target", str3);
            jSONObject.put("page_type", str);
            if (str4 != null) {
                jSONObject.put("follow_user_id", C57859q.m224565a(str4));
            }
            m188111a(this, "moments_follow_page_click", jSONObject, (String) null, (String) null, 12, (Object) null);
        }

        /* renamed from: a */
        private final void m188112a(String str, JSONObject jSONObject, String str2, String str3) {
            if (str2 == null) {
                str2 = "none";
            }
            jSONObject.put("post_id", str2);
            jSONObject.put("page_id", str3);
            jSONObject.put("circle_id", MomentsHitHelper.f119719r.mo166789a());
            Statistics.sendEvent(str, jSONObject);
        }

        /* renamed from: a */
        public static /* synthetic */ void m188107a(Companion aVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 4) != 0) {
                str3 = "none";
            }
            aVar.mo166868c(str, str2, str3);
        }

        /* renamed from: a */
        public static /* synthetic */ void m188108a(Companion aVar, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 4) != 0) {
                str3 = "none";
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            aVar.mo166855a(str, str2, str3, str4);
        }

        /* renamed from: a */
        static /* synthetic */ void m188111a(Companion aVar, String str, JSONObject jSONObject, String str2, String str3, int i, Object obj) {
            if ((i & 2) != 0) {
                jSONObject = new JSONObject();
            }
            if ((i & 4) != 0) {
                str2 = "none";
            }
            if ((i & 8) != 0) {
                str3 = MomentsHitHelper.f119719r.mo166822m();
            }
            aVar.m188112a(str, jSONObject, str2, str3);
        }

        /* renamed from: a */
        public static /* synthetic */ void m188109a(Companion aVar, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            if ((i & 16) != 0) {
                num = null;
            }
            aVar.mo166856a(str, str2, str3, str4, num);
        }

        /* renamed from: a */
        public static /* synthetic */ void m188110a(Companion aVar, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 8) != 0) {
                str4 = null;
            }
            if ((i & 16) != 0) {
                str5 = null;
            }
            aVar.mo166857a(str, str2, str3, str4, str5);
        }
    }
}
