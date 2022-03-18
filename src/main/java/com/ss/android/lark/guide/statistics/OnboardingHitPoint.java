package com.ss.android.lark.guide.statistics;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.ug.attribution.C57347a;
import com.ss.android.vesdk.p3188b.C63954b;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Deprecated(message = "Old hit point", replaceWith = @ReplaceWith(expression = "OnboardingHitPointNew", imports = {}))
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/guide/statistics/OnboardingHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "NodePath", "UserType", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class OnboardingHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f99379a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/guide/statistics/OnboardingHitPoint$UserType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", ShareHitPoint.f121869d, "getType", "()Ljava/lang/String;", "StandardUser", "SimpleUser", "Customer", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum UserType {
        StandardUser("B"),
        SimpleUser(C63954b.f161494a),
        Customer("C");
        
        private String value;

        public final String getType() {
            return this.value;
        }

        private UserType(String str) {
            this.value = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\"\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0019\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0006J\u0016\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010%\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u000bJ\u000e\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0012J\u000e\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0012J\u000e\u00102\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0012J\u000e\u00103\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0012J\u0006\u00104\u001a\u00020\u0006J\u0006\u00105\u001a\u00020\u0006J\u0018\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u0002082\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0006\u00109\u001a\u00020\u0006J\u0006\u0010:\u001a\u00020\u0006J\u000e\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u000bJ\u000e\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0004J\u000e\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0004J\u000e\u0010@\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0004J\u0006\u0010A\u001a\u00020\u0006J\u0006\u0010B\u001a\u00020\u0006J\u000e\u0010C\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010D\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010E\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010F\u001a\u00020\u0006J\u0006\u0010G\u001a\u00020\u0006J\u0006\u0010H\u001a\u00020\u0006J\u0018\u0010I\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J2\u0010K\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010L\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0010\u0010M\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/ss/android/lark/guide/statistics/OnboardingHitPoint$Companion;", "", "()V", "KEY_UG_COLD_SCENE", "", "appendUgColdScene", "", "jsonObject", "Lorg/json/JSONObject;", "getSwitchTeamNoticeCardClickKey", "actively", "", "getSwitchTeamNoticeCardShowKey", "sendAddContactConfirm", "sendAddContactShow", "sendAddContactSkip", "sendGuideAddMemberClickEvent", "duration", "", "action", "hitFrom", "sendGuideAddMemberDomainClickEvent", "toChecked", ApiHandler.API_CALLBACK_ERRMSG, "sendGuideAddMemberDomainShowEvent", "sendGuideAddMemberShowEvent", "sendGuideIntroClickPlayEvent", "sendGuideIntroClickSkipEvent", "sendGuideIntroShowEvent", "sendGuideIntroVideoBarEvent", "dragFrom", "dragTo", "sendGuideIntroVideoClickReloadEvent", "sendGuideIntroVideoClickSkipEvent", "sendGuideIntroVideoClickStartEvent", "sendGuideIntroVideoPauseEvent", "sendGuideIntroVideoPlayEvent", "sendGuideIntroVideoReplayEvent", "sendGuideIntroVideoShowEvent", "success", "sendGuideIntroVideoVolumeEvent", "volumeInt", "", "sendGuideIntroVideoZoomEvent", "fullScreen", "sendGuideJumpShow", "jumpType", "sendGuideTipsCloseEvent", "introNum", "sendGuideTipsNextEvent", "sendGuideTipsPrevEvent", "sendGuideTipsShowEvent", "sendGuideVCShow", "sendJoinMeeting", "sendJoinTeamClickEvent", "userType", "Lcom/ss/android/lark/guide/statistics/OnboardingHitPoint$UserType;", "sendLdrCongratesBannerClick", "sendLdrCongratesClick", "sendLdrCongratesShow", "bannerShow", "sendPushAlertDialogClick", "flowId", "sendPushAlertDialogClosed", "sendPushAlertDialogShow", "sendSwitchTeamGuidanceClick", "sendSwitchTeamGuidanceShow", "sendSwitchTeamNoticeCardClickLater", "sendSwitchTeamNoticeCardClickSwitch", "sendSwitchTeamNoticeCardShow", "sendSysAddressRequestAgree", "sendSysAddressRequestDisagree", "sendSysAddressRequestShow", "sendTeamNameShowEvent", "from", "sendTeamNameSubmitEvent", "change", "sendUpdateTeamClickEvent", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.statistics.OnboardingHitPoint$a */
    public static final class Companion {
        /* renamed from: g */
        private final String m152566g(boolean z) {
            return z ? "mobile_switch_team_notice_card_actively_show" : "mobile_switch_team_notice_card_passively_show";
        }

        /* renamed from: h */
        private final String m152567h(boolean z) {
            return z ? "mobile_switch_team_notice_card_actively_click" : "mobile_switch_team_notice_card_passively_click";
        }

        private Companion() {
        }

        /* renamed from: a */
        public final void mo141604a(boolean z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("video_status", z ? "success" : "fail");
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_video_show", jSONObject);
        }

        /* renamed from: a */
        public final void mo141605a(boolean z, String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_action", z ? "check" : "uncheck");
            String str3 = str;
            if (str3 == null || str3.length() == 0) {
                str = "success";
            }
            jSONObject.put("result", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("path", str2);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_addmember_domain_click", jSONObject);
        }

        /* renamed from: c */
        public final void mo141610c() {
            Statistics.sendEvent("onboarding_system_addressrequest_show");
        }

        /* renamed from: d */
        public final void mo141614d() {
            Statistics.sendEvent("onboarding_system_addressrequest_agree");
        }

        /* renamed from: e */
        public final void mo141618e() {
            Statistics.sendEvent("onboarding_system_addressrequest_disagree");
        }

        /* renamed from: f */
        public final void mo141622f() {
            Statistics.sendEvent("onboarding_addcontact_show");
        }

        /* renamed from: i */
        public final void mo141631i() {
            Statistics.sendEvent("mobile_switch_team_guidance_show");
        }

        /* renamed from: j */
        public final void mo141633j() {
            Statistics.sendEvent("mobile_switch_team_guidance_click");
        }

        /* renamed from: k */
        public final void mo141635k() {
            Statistics.sendEvent("onboarding_guide_addmember_congrates_click");
        }

        /* renamed from: a */
        public final void mo141597a() {
            JSONObject jSONObject = new JSONObject();
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_show", jSONObject);
        }

        /* renamed from: b */
        public final void mo141606b() {
            JSONObject jSONObject = new JSONObject();
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_video_replay", jSONObject);
        }

        /* renamed from: g */
        public final void mo141626g() {
            Statistics.sendEvent("onboarding_addcontact_skip");
        }

        /* renamed from: h */
        public final void mo141629h() {
            Statistics.sendEvent("onboarding_addcontact_confirm");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final void mo141613c(boolean z) {
            Statistics.sendEvent(m152566g(z));
        }

        /* renamed from: a */
        private final void m152565a(JSONObject jSONObject) {
            C57347a a = C57347a.m222308a();
            Intrinsics.checkExpressionValueIsNotNull(a, "AttributionFacade.getInstance()");
            jSONObject.put("ug_cold_scene", a.mo194493c());
        }

        /* renamed from: b */
        public final void mo141608b(String str) {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("path", str);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_addmember_domain_show", jSONObject);
        }

        /* renamed from: c */
        public final void mo141611c(int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_video", i / 1000);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_video_play", jSONObject);
        }

        /* renamed from: d */
        public final void mo141615d(int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_video", i / 1000);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_video_pause", jSONObject);
        }

        /* renamed from: e */
        public final void mo141619e(int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_action", "skip");
            jSONObject.put("duration_video", i / 1000);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_video_click", jSONObject);
        }

        /* renamed from: f */
        public final void mo141623f(int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_action", "start");
            jSONObject.put("duration_video", i / 1000);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_video_click", jSONObject);
        }

        /* renamed from: g */
        public final void mo141627g(int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_action", "reload");
            jSONObject.put("duration_video", i / 1000);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_video_click", jSONObject);
        }

        /* renamed from: h */
        public final void mo141630h(int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("intro_number", i);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_tips_next", jSONObject);
        }

        /* renamed from: i */
        public final void mo141632i(int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("intro_number", i);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_tips_previous", jSONObject);
        }

        /* renamed from: j */
        public final void mo141634j(int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("intro_number", i);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_tips_close", jSONObject);
        }

        /* renamed from: a */
        public final void mo141598a(float f) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("volume_int", Float.valueOf(f));
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_video_volume", jSONObject);
        }

        /* renamed from: b */
        public final void mo141607b(int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_welcome", i / 1000);
            jSONObject.put("duration_video", 0);
            jSONObject.put("click_action", "play");
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_click", jSONObject);
        }

        /* renamed from: c */
        public final void mo141612c(String str) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", NodePath.m152607a(str, "select_page"));
            Statistics.sendEvent("guide_update_dialog_click", jSONObject);
        }

        /* renamed from: d */
        public final void mo141616d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "jumpType");
            JSONObject jSONObject = new JSONObject();
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_jump_show", jSONObject);
        }

        /* renamed from: e */
        public final void mo141620e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "flowId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("flow_id", str);
            Statistics.sendEvent("ug_notification_show", jSONObject);
        }

        /* renamed from: f */
        public final void mo141624f(String str) {
            Intrinsics.checkParameterIsNotNull(str, "flowId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("flow_id", str);
            Statistics.sendEvent("ug_notification_click", jSONObject);
        }

        /* renamed from: g */
        public final void mo141628g(String str) {
            Intrinsics.checkParameterIsNotNull(str, "flowId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("flow_id", str);
            Statistics.sendEvent("ug_notification_closed", jSONObject);
        }

        /* renamed from: a */
        public final void mo141599a(int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_welcome", i / 1000);
            jSONObject.put("duration_video", 0);
            jSONObject.put("click_action", "skip");
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_click", jSONObject);
        }

        /* renamed from: b */
        public final void mo141609b(boolean z) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "in";
            } else {
                str = "out";
            }
            jSONObject.put("zoom_type", str);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_video_zoom", jSONObject);
        }

        /* renamed from: d */
        public final void mo141617d(boolean z) {
            String h = m152567h(z);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ug_click_type", "later");
            Statistics.sendEvent(h, jSONObject);
        }

        /* renamed from: e */
        public final void mo141621e(boolean z) {
            String h = m152567h(z);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ug_click_type", "switch");
            Statistics.sendEvent(h, jSONObject);
        }

        /* renamed from: f */
        public final void mo141625f(boolean z) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "ldr";
            } else {
                str = "none";
            }
            jSONObject.put("banners_show", str);
            Statistics.sendEvent("onboarding_guide_addmember_congrates_show", jSONObject);
        }

        /* renamed from: a */
        public final void mo141603a(String str) {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("path", str);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_addmember_show", jSONObject);
        }

        /* renamed from: a */
        public final void mo141600a(int i, int i2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("drag_from", i / 1000);
            jSONObject.put("drag_to", i2 / 1000);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_intro_video_bar", jSONObject);
        }

        /* renamed from: a */
        public final void mo141602a(UserType userType, String str) {
            Intrinsics.checkParameterIsNotNull(userType, "userType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("usertype", userType.getType());
            jSONObject.put("path", NodePath.m152607a(str, "select_page"));
            Statistics.sendEvent("dispatch_next_click_join_tenant", jSONObject);
        }

        /* renamed from: a */
        public final void mo141601a(int i, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "action");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_addmember", i / 1000);
            jSONObject.put("click_action", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("path", str2);
            OnboardingHitPoint.f99379a.m152565a(jSONObject);
            Statistics.sendEvent("guide_addmember_click", jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/guide/statistics/OnboardingHitPoint$NodePath;", "", "()V", "SELECT_PAGE", "", "getPath", "hitFrom", "nodePath", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.statistics.OnboardingHitPoint$b */
    public static final class NodePath {

        /* renamed from: a */
        public static final NodePath f99380a = new NodePath();

        private NodePath() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final String m152607a(String str, String str2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str2, "nodePath");
            String str3 = str;
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return str2;
            }
            return str + '-' + str2;
        }
    }
}
