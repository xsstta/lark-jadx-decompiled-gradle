package com.ss.android.lark.profile.statistics;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.dto.ProfileChat;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.vesdk.C64034n;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u001a\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0007J\u0012\u0010!\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0012\u0010!\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\"H\u0007J\b\u0010#\u001a\u00020\u0017H\u0007J\b\u0010$\u001a\u00020\u0017H\u0007J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020'H\u0007J\u0018\u0010(\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004H\u0007J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0006H\u0007J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0004H\u0007J\u0010\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0004H\u0007J\u0018\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0007J\u0010\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u0006H\u0007J\u0010\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u0006H\u0007J\u0010\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0004H\u0007J\u0010\u00108\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0004H\u0007J\u0010\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u0004H\u0007J\b\u0010;\u001a\u00020\u0017H\u0007J\b\u0010<\u001a\u00020\u0017H\u0007J\b\u0010=\u001a\u00020\u0017H\u0007J\b\u0010>\u001a\u00020\u0017H\u0007J\b\u0010?\u001a\u00020\u0017H\u0007J\b\u0010@\u001a\u00020\u0017H\u0007J\b\u0010A\u001a\u00020\u0017H\u0007J\b\u0010B\u001a\u00020\u0017H\u0007J\b\u0010C\u001a\u00020\u0017H\u0007J(\u0010D\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\u0019H\u0007J\u0010\u0010G\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u0019H\u0007J\u0010\u0010I\u001a\u00020\u00172\u0006\u0010J\u001a\u00020\u0019H\u0007J \u0010K\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\b\u0010L\u001a\u00020\u0017H\u0007J\u0010\u0010M\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\b\u0010N\u001a\u00020\u0017H\u0007J\b\u0010O\u001a\u00020\u0017H\u0007J\u0010\u0010P\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u0006H\u0007J\b\u0010Q\u001a\u00020\u0017H\u0007J\b\u0010R\u001a\u00020\u0017H\u0007J\b\u0010S\u001a\u00020\u0017H\u0007J\u0010\u0010T\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\b\u0010U\u001a\u00020\u0017H\u0007J\b\u0010V\u001a\u00020\u0017H\u0007JY\u0010W\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020\u00062\u0017\u0010[\u001a\u0013\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020]0\\¢\u0006\u0002\b^H\u0007J\u0018\u0010_\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u0004H\u0007J\u0010\u0010`\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\b\u0010a\u001a\u00020\u0017H\u0007J\b\u0010b\u001a\u00020\u0017H\u0007J\b\u0010c\u001a\u00020\u0017H\u0007J\b\u0010d\u001a\u00020\u0017H\u0007J\b\u0010e\u001a\u00020\u0017H\u0007J\b\u0010f\u001a\u00020\u0017H\u0007J\b\u0010g\u001a\u00020\u0017H\u0007J\b\u0010h\u001a\u00020\u0017H\u0007J\b\u0010i\u001a\u00020\u0017H\u0007J\u0010\u0010j\u001a\u00020\u00172\u0006\u0010k\u001a\u00020\u0019H\u0007J\u0010\u0010l\u001a\u00020\u00172\u0006\u0010k\u001a\u00020\u0019H\u0007J\u0010\u0010m\u001a\u00020\u00172\u0006\u0010n\u001a\u00020\u0019H\u0007J@\u0010o\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020\u0006H\u0007J\b\u0010p\u001a\u00020\u0017H\u0007J\u0016\u0010q\u001a\u00020\u00172\u0006\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\u0019J\u0010\u0010r\u001a\u00020\u00172\u0006\u0010F\u001a\u00020\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006s"}, d2 = {"Lcom/ss/android/lark/profile/statistics/ProfileHitPoint;", "", "()V", "ACTION", "", "APPLY_CLASS", "", "CREATE_PRESONAL_TENANT", "CREATE_PRESONAL_TENANT_ENSURE", "ENTRANCE_PROFILE", "IS_NOTE", "IS_VERIFIED", "JOIN_GROUP", "JOIN_ORGANIZATION", "NORMAL", "NO_PERMISSON", "PROFILE_PAGE", "SOURCE", "SWITCH_ORGANIZATION", "SWITCH_PERSONAL_TENANT", "TYPE", "VERIFICATION", "applyToJoinGroupByGroupCard", "", "reasonIsEmpty", "", "applyToJoinGroupByQRCode", "convertSourceType", ShareHitPoint.f121869d, "joinGroupByGroupCard", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isInChat", "joinGroupByQRCode", "Lcom/ss/android/lark/profile/dto/ProfileChat;", "sendAddFriendApplicationEntry", "sendAddGroupViaLinkEvent", "sendAfterAddFriend", ShareHitPoint.f121868c, "Lcom/ss/android/lark/biz/core/api/ContactSource;", "sendAuthorizeCollaborationRequest", "userId", "sendChatHomeSchoolGroupProfile", "eventType", "sendContactBlock", "toUserId", "sendContactUnblock", "sendDepartmentNameShowMore", "deartmentLength", "rowCount", "sendDepartmentsToolongTotal", "length", "sendDepartmentsTotal", "total", "sendGroupProfileButtonClick", "param", "sendGroupProfileJoinOrganizationEvent", "sendInviteMemberCodeSave", "location", "sendOnClickCall", "sendOnClickCancel", "sendOnClickEnterprise", "sendOnClickPhone", "sendOnClickVideo", "sendOnClickVoice", "sendOnClickVoip", "sendProfileAddExternalContactsClick", "sendProfileAddExternalContactsCollaborationConfirm", "sendProfileAddFriend", "isHasTenantCertification", "isTenantCertification", "sendProfileAlias", "aliasIsEmpty", "sendProfileAliasInGroup", "nickNameIsEmpty", "sendProfileClickHrefLink", "sendProfileContactCardsAdd", "sendProfileCtaClick", "sendProfileCtaPhoneCallClick", "sendProfileDeleteExternalContactsClick", "sendProfileDepartmentFieldLocation", "sendProfileDetailMoreClick", "sendProfileEditAlias", "sendProfileEmailClick", "sendProfileEntryClick", "sendProfileFriendLink", "sendProfileLeadClick", "sendProfileMainView", "contactType", "isSelf", "friendStatus", "extrasSetter", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "Lkotlin/ExtensionFunctionType;", "sendProfileMessageClick", "sendProfileMoreBtnClick", "sendProfileMoreClick", "sendProfilePeopleMoreClick", "sendProfilePermissionSettingCollaborationClick", "sendProfilePermissionSettingOnlyChatClick", "sendProfilePhoneActionCallClick", "sendProfilePhoneAreaClick", "sendProfilePhoneShowClick", "sendProfilePictureClick", "sendProfileReportClick", "sendProfileSecretConfirmClick", "isExternal", "sendProfileSecretMessageClick", "sendProfileSignature", "descriptionIsEmpty", "sendProfileView", "sendProfileViewHistoryChatClick", "sendTenantCertificationAfterAcceptBtnClick", "sendTenantCertificationClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.statistics.c */
public final class ProfileHitPoint {

    /* renamed from: a */
    public static final ProfileHitPoint f130738a = new ProfileHitPoint();

    /* renamed from: b */
    private final String m204709b(int i) {
        switch (i) {
            case 1:
                return "link";
            case 2:
                return "chat";
            case 3:
                return "event";
            case 4:
                return "docs";
            case 5:
                return "vc";
            case 6:
                return "email";
            case 7:
                return "namecard";
            case 8:
                return "search_phone";
            case 9:
                return "search_email";
            case 10:
                return "contacts";
            case 11:
                return "community";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "external_contact";
            case 13:
                return "new_contact";
            case 14:
                return "contactcards";
            default:
                return "others";
        }
    }

    private ProfileHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204704a(ProfileChat profileChat) {
        String str;
        if (profileChat == null) {
            str = "";
        } else {
            str = !profileChat.mo178844g() ? profileChat.mo178845h() ? "public" : "private" : "external";
        }
        Statistics.sendEvent("join_group_by_QRcode", new JSONObject().put(ShareHitPoint.f121869d, str).put("action", "joinnewgroup"));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204702a(Chat chat) {
        String str;
        if (chat == null) {
            str = "";
        } else {
            str = !chat.isCrossTenant() ? chat.isPublic() ? "public" : "private" : "external";
        }
        Statistics.sendEvent("join_group_by_QRcode", new JSONObject().put(ShareHitPoint.f121869d, str).put("action", "joinnewgroup"));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204703a(Chat chat, boolean z) {
        String str;
        if (chat == null) {
            str = "";
        } else {
            str = !chat.isCrossTenant() ? chat.isPublic() ? "public" : "private" : "external";
        }
        Statistics.sendEvent("join_group_by_group_card", new JSONObject().put(ShareHitPoint.f121869d, str).put("action", z ? "enterjoinedgroup" : "joinnewgroup"));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204708a(boolean z) {
        Statistics.sendEvent("apply_to_join_group_by_QRcode", new JSONObject().put("is_note", z ? C64034n.f161683a : "y"));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204705a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "location");
        Statistics.sendEvent("invite_member_code_save_new", new JSONObject().put("location", str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204707a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "toUserId");
        Intrinsics.checkParameterIsNotNull(str2, "contactType");
        Statistics.sendEvent("profile_message_click", new JSONObject().put("contact_type", str2).put("to_user_id", str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204706a(String str, int i, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "toUserId");
        Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
        Statistics.sendEvent("component_profile_click_profile_details", new JSONObject().put(ShareHitPoint.f121868c, f130738a.m204709b(i)).put("to_user_id", str).put(ShareHitPoint.f121869d, str2));
    }

    /* renamed from: a */
    public final void mo180539a(boolean z, boolean z2) {
        Statistics.sendEvent("profile_agree_friend_request", new JSONObject().put("verification", z).put("is_verified", z2));
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m204727h() {
        Statistics.sendEvent("chat_link_click_through");
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m204717d() {
        Statistics.sendEvent("profile_detail_more_click", new JSONObject());
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m204720e() {
        Statistics.sendEvent("profile_picture", new JSONObject());
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m204723f() {
        Statistics.sendEvent("profile_viewhistorychat", new JSONObject());
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m204725g() {
        Statistics.sendEvent("profile_phone_call_click", new JSONObject());
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m204729i() {
        Statistics.sendEvent("profile_phone_area", new JSONObject());
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m204730j() {
        Statistics.sendEvent("profile_phone_show", new JSONObject());
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m204731k() {
        Statistics.sendEvent("profile_phone_action_call", new JSONObject());
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m204733m() {
        Statistics.sendEvent("profile_add_externalcontacts_click", new JSONObject());
    }

    @JvmStatic
    /* renamed from: n */
    public static final void m204734n() {
        Statistics.sendEvent("profile_add_externalcontacts_collaboration_confirm", new JSONObject());
    }

    @JvmStatic
    /* renamed from: o */
    public static final void m204735o() {
        Statistics.sendEvent("profile_delete_externalcontacts_click", new JSONObject());
    }

    @JvmStatic
    /* renamed from: p */
    public static final void m204736p() {
        Statistics.sendEvent("profile_report_click", new JSONObject());
    }

    @JvmStatic
    /* renamed from: q */
    public static final void m204737q() {
        Statistics.sendEvent("profile_more_click", new JSONObject());
    }

    @JvmStatic
    /* renamed from: r */
    public static final void m204738r() {
        Statistics.sendEvent("profile_edit_alias", new JSONObject());
    }

    @JvmStatic
    /* renamed from: s */
    public static final void m204739s() {
        Statistics.sendEvent("profile_contactcards_add", new JSONObject());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204695a() {
        Statistics.sendEvent("chat_call_voice_click", new JSONObject().put("from", "profile"));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m204710b() {
        Statistics.sendEvent("profile_voice_call_select_click", new JSONObject().put("click", "office_call").put("target", (Object) null));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m204714c() {
        Statistics.sendEvent("chat_call_phone_click", new JSONObject().put("from", "profile"));
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m204732l() {
        Statistics.sendEvent("invite_people_entrance", new JSONObject().put("entrance", "profile_page"));
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m204718d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "toUserId");
        Statistics.sendEvent("contact_block", new JSONObject().put(ShareHitPoint.f121868c, "profile_block").put("to_user_id", str));
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m204721e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "toUserId");
        Statistics.sendEvent("contact_unblock", new JSONObject().put(ShareHitPoint.f121868c, "profile_unblock").put("to_user_id", str));
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m204724f(String str) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Statistics.sendEvent("profile_cta_click", new JSONObject().put(ShareHitPoint.f121869d, str));
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m204726g(String str) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Statistics.sendEvent("profile_entry_click", new JSONObject().put(ShareHitPoint.f121869d, str));
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m204728h(String str) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Statistics.sendEvent("profile_more_btn_click", new JSONObject().put(ShareHitPoint.f121869d, str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204696a(int i) {
        Statistics.sendEvent("im_chat_home_school_group_profile", new JSONObject().put("b_name", i));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m204711b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "param");
        Statistics.sendEvent("Scan_QRcode_Group_NotIn_Detail", new JSONObject().put("click_button", str));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m204715c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "param");
        Statistics.sendEvent("Scan_QRcode_Group_NotIn_Detail_Join_Organization", new JSONObject().put("page_type", str));
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m204719d(boolean z) {
        String str;
        if (z) {
            str = "external";
        } else {
            str = "internal";
        }
        Statistics.sendEvent("direct_secret_chat_confirm", new JSONObject().put(ShareHitPoint.f121868c, "profile").put(ShareHitPoint.f121869d, str));
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m204722e(boolean z) {
        Statistics.sendEvent("profile_certification_click", new JSONObject().put("is_verified", z));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m204716c(boolean z) {
        String str;
        if (z) {
            str = "external";
        } else {
            str = "internal";
        }
        Statistics.sendEvent("profile_secret_message_click", new JSONObject().put(ShareHitPoint.f121868c, "profile").put(ShareHitPoint.f121869d, str));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m204713b(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = C64034n.f161683a;
        } else {
            str = "y";
        }
        Statistics.sendEvent("apply_to_join_group_by_group_card", jSONObject.put("is_note", str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204701a(ContactSource contactSource) {
        Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
        Statistics.sendEvent("profile_addfirend_click", new JSONObject().put(ShareHitPoint.f121868c, GetSourceTypeName.f130733a.mo180529a(contactSource.getSourceType())));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204697a(int i, int i2) {
        Statistics.sendEvent("profile_detail_department_name_show_more", new JSONObject().put("click_area", "text").put("department_char_length", i).put("char_overflow_row_numbers", i2));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m204712b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("number", 1);
        jSONObject.put("scene", str);
        jSONObject.put("to_user_ids", CollectionsKt.listOf(str2));
        Statistics.sendEvent("authorize_collaboration_request", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204700a(int i, String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "toUserId");
        Statistics.sendEvent("profile_add", new JSONObject().put(ShareHitPoint.f121868c, f130738a.m204709b(i)).put("to_user_id", str).put("verification", z).put("is_verified", z2));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204698a(int i, String str, String str2, boolean z, boolean z2, boolean z3, int i2) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "toUserId");
        Intrinsics.checkParameterIsNotNull(str2, "contactType");
        if (i2 == 3) {
            str3 = "agree";
        } else if (i2 != 4) {
            str3 = "neither";
        } else {
            str3 = "invite";
        }
        try {
            Statistics.sendEvent("profile_view", new JSONObject().put("profile_type", "people").put(ShareHitPoint.f121868c, f130738a.m204709b(i)).put("to_user_id", str).put("contact_type", str2).put("is_self", z).put("verification", z2).put("is_verified", z3).put("friend_conversion", str3));
        } catch (Throwable th) {
            Log.m165382e(th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m204699a(int i, String str, String str2, boolean z, boolean z2, boolean z3, int i2, Function1<? super JSONObject, ? extends JSONObject> function1) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "toUserId");
        Intrinsics.checkParameterIsNotNull(str2, "contactType");
        Intrinsics.checkParameterIsNotNull(function1, "extrasSetter");
        if (i2 == 3) {
            str3 = "agree";
        } else if (i2 != 4) {
            str3 = "neither";
        } else {
            str3 = "invite";
        }
        try {
            JSONObject put = new JSONObject().put("profile_type", "people").put(ShareHitPoint.f121868c, f130738a.m204709b(i)).put("to_user_id", str).put("contact_type", str2).put("is_self", String.valueOf(z)).put("verification", String.valueOf(z2)).put("is_verified", String.valueOf(z3)).put("friend_conversion", str3);
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\"profil…ion\", paramsFriendStatus)");
            Statistics.sendEvent("profile_main_view", (JSONObject) function1.invoke(put));
        } catch (Throwable th) {
            Log.m165382e(th.getMessage());
        }
    }
}
