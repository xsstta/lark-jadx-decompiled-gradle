package com.ss.android.lark.profile.statistics;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.profile.statistics.EditAliasExtraParams;
import com.ss.android.lark.profile.statistics.UserProfileExtraParams;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.extensions.IParam;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p000.MedalExtraParams;
import p000.SpecialFocusParams;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileHitPointV3;", "", "()V", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.statistics.f */
public final class UserProfileHitPointV3 {

    /* renamed from: a */
    public static UserProfileExtraParams.ContactTypeParam f130744a = UserProfileExtraParams.ContactTypeParam.INTERNAL;

    /* renamed from: b */
    public static UserProfileExtraParams.ToUserIdParam f130745b = new UserProfileExtraParams.ToUserIdParam(null, 1, null);

    /* renamed from: c */
    public static final Companion f130746c = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m204752a() {
        f130746c.mo180604w();
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m204753b() {
        f130746c.mo180605x();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0010H\u0007J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u001e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012J\b\u0010\u001e\u001a\u00020\u0010H\u0007J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0010J \u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010)\u001a\u00020\u0010J\u000e\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020'J\u000e\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0012J\u0006\u0010.\u001a\u00020\u0010J\u000e\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020'J\u0016\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00122\u0006\u00100\u001a\u00020'J\u000e\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u0012J\u000e\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u001bJ\u000e\u00107\u001a\u00020\u00102\u0006\u00100\u001a\u00020'J\u000e\u00108\u001a\u00020\u00102\u0006\u00100\u001a\u00020'J\u001e\u00109\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u0012J\u000e\u0010;\u001a\u00020\u00102\u0006\u00100\u001a\u00020'J\u0016\u0010<\u001a\u00020\u00102\u0006\u00100\u001a\u00020'2\u0006\u0010-\u001a\u00020\u0012J\u000e\u0010=\u001a\u00020\u00102\u0006\u00100\u001a\u00020'J\u0006\u0010>\u001a\u00020\u0010J\u0006\u0010?\u001a\u00020\u0010J\u000e\u0010@\u001a\u00020\u00102\u0006\u0010A\u001a\u00020\u0012J\u0006\u0010B\u001a\u00020\u0010J\u0006\u0010C\u001a\u00020\u0010J\u000e\u0010D\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u0012J\u0010\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020HH\u0002J\u0001\u0010I\u001a\u00020\u00102\u0006\u0010J\u001a\u00020'2\u0006\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00122\u0006\u0010M\u001a\u00020'2\u0006\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u00122\u0006\u0010P\u001a\u00020'2\u0006\u0010Q\u001a\u00020'2\u0006\u0010R\u001a\u00020\u00122\u0006\u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u001b2\u0006\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020\u00122\u0017\u0010X\u001a\u0013\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020Z0Y¢\u0006\u0002\b[J\u0006\u0010\\\u001a\u00020\u0010J\u0006\u0010]\u001a\u00020\u0010J\u0006\u0010^\u001a\u00020\u0010J\u0006\u0010_\u001a\u00020\u0010J\u0006\u0010`\u001a\u00020\u0010J\u0006\u0010a\u001a\u00020\u0010J\u0006\u0010b\u001a\u00020\u0010J\u0006\u0010c\u001a\u00020\u0010J\u000e\u0010d\u001a\u00020\u00102\u0006\u0010e\u001a\u00020\u001bJ\u0006\u0010f\u001a\u00020\u0010J\u0006\u0010g\u001a\u00020\u0010J\u0006\u0010h\u001a\u00020\u0010J\u0006\u0010i\u001a\u00020\u0010J\u000e\u0010j\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010k\u001a\u00020\u0010J\u0006\u0010l\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006m"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileHitPointV3$Companion;", "", "()V", "contactTypeParam", "Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$ContactTypeParam;", "getContactTypeParam", "()Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$ContactTypeParam;", "setContactTypeParam", "(Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$ContactTypeParam;)V", "toUserIdParam", "Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$ToUserIdParam;", "getToUserIdParam", "()Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$ToUserIdParam;", "setToUserIdParam", "(Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$ToUserIdParam;)V", "sendAcceptContactClick", "", "hasVerification", "", "isVerified", "sendAddContactClick", "sendAliasSettingSaveClick", "sendAliasSettingV3AddClick", "sendAliasSettingV3CancelClick", "sendAliasSettingV3ImageClick", "sendAliasSettingV3View", "nameLength", "", "descriptionLength", "hasPic", "sendAliasSettingView", "sendAvatarActionSheetAvatarClick", "sendAvatarActionSheetCancelClick", "sendAvatarActionSheetMedalClick", "sendAvatarActionSheetView", "sendBackgroundMainView", "sendBlockActionClick", "sendContactRequestSendClick", "reason", "", "sendContactRequestView", "sendDeleteUserClick", "sendFieldItemClick", ShareHitPoint.f121869d, "sendFocusConfirmClick", "isConfirm", "sendFocusConfirmView", "sendMedalDetailClick", "medalId", "sendMedalDetailView", "isValid", "sendMedalWallBackClick", "hasWornMedal", "sendMedalWallEntryClick", "validCount", "sendMedalWallMedalClick", "sendMedalWallTakeOffClick", "sendMedalWallView", "inValidCount", "sendMedalWallWearClick", "sendMedalWearConfirmClick", "sendMedalWearConfirmView", "sendMoreActionView", "sendPhoneCallClick", "sendProfileAvatarClick", "isMedalShow", "sendProfileCommonInfoClick", "sendProfileCoverClick", "sendProfileFocusClick", "isSpecialFocus", "sendProfileMainClick", "param", "Lcom/ss/android/lark/statistics/extensions/IParam;", "sendProfileMainView", "gender", "isUserOnLeaveTagShown", "isUserNoDisturbTagShown", "accountTag", "isCustomImageFieldShown", "isMomentsTabShown", "friendConversion", "contactType", "isPrivacySet", "verificationShowen", "toUserid", "signatureLength", "isAvatarMedalShow", "isMedalWallEntryShow", "extraSetter", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "Lkotlin/ExtensionFunctionType;", "sendProfileMessageClick", "sendProfileMomentsClick", "sendProfileMoreClick", "sendProfileMsgHistoryClick", "sendProfilePersonalStatusClick", "sendProfilePicDetailView", "sendProfileSecretClick", "sendProfileShareClick", "sendProfileSignatureClick", "length", "sendProfileVideoClick", "sendProfileVoiceClick", "sendReportActionClick", "sendUnBlockActionClick", "sendVerificationClick", "sendVoiceCallClick", "sendVoiceCallView", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.statistics.f$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final UserProfileExtraParams.ContactTypeParam mo180558a() {
            return UserProfileHitPointV3.f130744a;
        }

        /* renamed from: b */
        public final UserProfileExtraParams.ToUserIdParam mo180570b() {
            return UserProfileHitPointV3.f130745b;
        }

        /* renamed from: a */
        public final void mo180567a(boolean z) {
            UserProfileExtraParams.Target target;
            UserProfileExtraParams.Click click = UserProfileExtraParams.Click.AVATAR;
            if (z) {
                target = UserProfileExtraParams.Target.PROFILE_AVATAR_ACTION_SHEET_VIEW;
            } else {
                target = UserProfileExtraParams.Target.IM_AVATAR_MAIN_VIEW;
            }
            Statistics.sendEvent("profile_main_click", click.plus(target).plus(mo180570b()).toJson());
        }

        /* renamed from: a */
        public final void mo180569a(boolean z, boolean z2) {
            UserProfileExtraParams.Click click = UserProfileExtraParams.Click.CONTACT_ADD;
            UserProfileExtraParams.Target target = UserProfileExtraParams.Target.PROFILE_CONTACT_REQUEST_VIEW;
            UserProfileExtraParams.Param dVar = new UserProfileExtraParams.Param("verification", String.valueOf(z));
            m204754a(click.plus(target).plus(dVar).plus(new UserProfileExtraParams.Param("is_verified", String.valueOf(z2))));
        }

        /* renamed from: a */
        public final void mo180568a(boolean z, String str) {
            MedalExtraParams.IsValid isValid;
            Intrinsics.checkParameterIsNotNull(str, "medalId");
            if (z) {
                isValid = MedalExtraParams.IsValid.TRUE;
            } else {
                isValid = MedalExtraParams.IsValid.FALSE;
            }
            Statistics.sendEvent("profile_avatar_medal_detail_view", isValid.plus(new MedalExtraParams.MedalId(str, null, 2, null)).plus(mo180570b()).toJson());
        }

        /* renamed from: G */
        public final void mo180557G() {
            Statistics.sendEvent("im_special_attention_confirm_view");
        }

        /* renamed from: B */
        public final void mo180552B() {
            Companion aVar = this;
            Statistics.sendEvent("profile_pic_detail_view", aVar.mo180558a().plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: C */
        public final void mo180553C() {
            Statistics.sendEvent("profile_avatar_action_sheet_view", mo180570b().toJson());
        }

        /* renamed from: D */
        public final void mo180554D() {
            Statistics.sendEvent("profile_avatar_action_sheet_click", MedalExtraParams.Click.CHECK_AVATAR.plus(MedalExtraParams.Target.IM_AVATAR_MAIN_VIEW).toJson());
        }

        /* renamed from: E */
        public final void mo180555E() {
            Statistics.sendEvent("profile_avatar_action_sheet_click", MedalExtraParams.Click.MEDAL_DETAIL.plus(MedalExtraParams.Target.PROFILE_AVATAR_MEDAL_DETAIL_VIEW).toJson());
        }

        /* renamed from: F */
        public final void mo180556F() {
            Statistics.sendEvent("profile_avatar_action_sheet_click", MedalExtraParams.Click.CANCEL.plus(MedalExtraParams.Target.PROFILE_MAIN_VIEW).toJson());
        }

        /* renamed from: c */
        public final void mo180576c() {
            m204754a(UserProfileExtraParams.Click.SHARE.plus(UserProfileExtraParams.Target.PUBLIC_MULTI_SELECT_SHARE_VIEW));
        }

        /* renamed from: d */
        public final void mo180580d() {
            m204754a(UserProfileExtraParams.Click.MORE.plus(UserProfileExtraParams.Target.PROFILE_MORE_ACTION_VIEW));
        }

        /* renamed from: e */
        public final void mo180583e() {
            m204754a(UserProfileExtraParams.Click.BACKGROUND.plus(UserProfileExtraParams.Target.PROFILE_BACKGROUND_MAIN_VIEW));
        }

        /* renamed from: f */
        public final void mo180586f() {
            m204754a(UserProfileExtraParams.Click.MOMENTS_TAB.plus(UserProfileExtraParams.Target.MOMENTS_PROFILE_VIEW));
        }

        /* renamed from: g */
        public final void mo180588g() {
            m204754a(UserProfileExtraParams.Click.MESSAGE.plus(UserProfileExtraParams.Target.IM_CHAT_MAIN_VIEW));
        }

        /* renamed from: h */
        public final void mo180589h() {
            m204754a(UserProfileExtraParams.Click.VOICE_CALL.plus(UserProfileExtraParams.Target.PROFILE_VOICE_CALL_SELECT_VIEW));
        }

        /* renamed from: i */
        public final void mo180590i() {
            m204754a(UserProfileExtraParams.Click.VIDEO_CALL.plus(UserProfileExtraParams.Target.VC_MEETING_CALLING_VIEW));
        }

        /* renamed from: j */
        public final void mo180591j() {
            m204754a(UserProfileExtraParams.Click.SECRET_MESSAGE.plus(UserProfileExtraParams.Target.IM_CHAT_MAIN_VIEW));
        }

        /* renamed from: k */
        public final void mo180592k() {
            m204754a(UserProfileExtraParams.Click.MESSAGE_HISTORY.plus(UserProfileExtraParams.Target.IM_CHAT_MAIN_VIEW));
        }

        /* renamed from: l */
        public final void mo180593l() {
            m204754a(UserProfileExtraParams.Click.BASIC_INFORMATION_TAB.plus(UserProfileExtraParams.Target.NONE));
        }

        /* renamed from: m */
        public final void mo180594m() {
            Statistics.sendEvent("profile_main_click", UserProfileExtraParams.Click.PERSONAL_STATUS.plus(UserProfileExtraParams.Target.SETTING_PERSONAL_STATUS_VIEW).toJson());
        }

        /* renamed from: n */
        public final void mo180595n() {
            Companion aVar = this;
            Statistics.sendEvent("profile_more_action_view", aVar.mo180558a().plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: s */
        public final void mo180600s() {
            Companion aVar = this;
            Statistics.sendEvent("profile_voice_call_select_view", aVar.mo180558a().plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: v */
        public final void mo180603v() {
            Companion aVar = this;
            Statistics.sendEvent("profile_background_main_view", aVar.mo180558a().plus(aVar.mo180570b()).toJson());
        }

        @JvmStatic
        /* renamed from: w */
        public final void mo180604w() {
            Companion aVar = this;
            Statistics.sendEvent("profile_alias_setting_view", aVar.mo180558a().plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: A */
        public final void mo180551A() {
            Companion aVar = this;
            Statistics.sendEvent("profile_alias_setting_click", EditAliasExtraParams.Click.PIC_ADD.plus(EditAliasExtraParams.Target.NONE).plus(aVar.mo180558a()).plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: o */
        public final void mo180596o() {
            Companion aVar = this;
            Statistics.sendEvent("profile_more_action_click", UserProfileExtraParams.Click.REPORT.plus(UserProfileExtraParams.Target.NONE).plus(aVar.mo180558a()).plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: p */
        public final void mo180597p() {
            Companion aVar = this;
            Statistics.sendEvent("profile_more_action_click", UserProfileExtraParams.Click.BLOCK.plus(UserProfileExtraParams.Target.NONE).plus(aVar.mo180558a()).plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: q */
        public final void mo180598q() {
            Companion aVar = this;
            Statistics.sendEvent("profile_more_action_click", UserProfileExtraParams.Click.UNBLOCK.plus(UserProfileExtraParams.Target.NONE).plus(aVar.mo180558a()).plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: r */
        public final void mo180599r() {
            Companion aVar = this;
            Statistics.sendEvent("profile_more_action_click", UserProfileExtraParams.Click.DELETE.plus(UserProfileExtraParams.Target.NONE).plus(aVar.mo180558a()).plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: t */
        public final void mo180601t() {
            Companion aVar = this;
            Statistics.sendEvent("profile_voice_call_select_click", UserProfileExtraParams.Click.PHONE_CALL.plus(UserProfileExtraParams.Target.NONE).plus(aVar.mo180558a()).plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: u */
        public final void mo180602u() {
            Companion aVar = this;
            Statistics.sendEvent("profile_voice_call_select_click", UserProfileExtraParams.Click.VOICE_CALL.plus(UserProfileExtraParams.Target.VC_MEETING_CALLING_VIEW).plus(aVar.mo180558a()).plus(aVar.mo180570b()).toJson());
        }

        @JvmStatic
        /* renamed from: x */
        public final void mo180605x() {
            Companion aVar = this;
            Statistics.sendEvent("profile_alias_setting_click", UserProfileExtraParams.Click.SAVE.plus(UserProfileExtraParams.Target.PROFILE_MAIN_VIEW).plus(aVar.mo180558a()).plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: y */
        public final void mo180606y() {
            Companion aVar = this;
            Statistics.sendEvent("profile_alias_setting_click", EditAliasExtraParams.Click.CANCEL.plus(EditAliasExtraParams.Target.PROFILE_MAIN_VIEW).plus(aVar.mo180558a()).plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: z */
        public final void mo180607z() {
            Companion aVar = this;
            Statistics.sendEvent("profile_alias_setting_click", EditAliasExtraParams.Click.PIC_DETAIL.plus(EditAliasExtraParams.Target.PROFILE_PIC_DETAIL_VIEW).plus(aVar.mo180558a()).plus(aVar.mo180570b()).toJson());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo180561a(UserProfileExtraParams.ContactTypeParam contactTypeParam) {
            Intrinsics.checkParameterIsNotNull(contactTypeParam, "<set-?>");
            UserProfileHitPointV3.f130744a = contactTypeParam;
        }

        /* renamed from: a */
        public final void mo180562a(UserProfileExtraParams.ToUserIdParam fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "<set-?>");
            UserProfileHitPointV3.f130745b = fVar;
        }

        /* renamed from: a */
        public final void mo180559a(int i) {
            UserProfileExtraParams.Click click = UserProfileExtraParams.Click.SIGNATURE;
            UserProfileExtraParams.Target target = UserProfileExtraParams.Target.PROFILE_SIGNATURE_SETTING_VIEW;
            m204754a(click.plus(target).plus(new UserProfileExtraParams.SignatureLengthParam(String.valueOf(i))));
        }

        /* renamed from: a */
        private final void m204754a(IParam cVar) {
            Companion aVar = this;
            Statistics.sendEvent("profile_main_click", cVar.plus(aVar.mo180558a()).plus(aVar.mo180570b()).toJson());
        }

        /* renamed from: b */
        public final void mo180571b(int i) {
            Statistics.sendEvent("profile_main_click", new JSONObject().put("click", "medal_wall_entry").put("target", "profile_avatar_medal_wall_view").put("valid_medal_count", i).put("to_user_id", mo180570b().getValue()));
        }

        /* renamed from: c */
        public final void mo180577c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "medalId");
            MedalExtraParams.Click click = MedalExtraParams.Click.MEDAL_PUT_OFF;
            MedalExtraParams.Target target = MedalExtraParams.Target.NONE;
            Statistics.sendEvent("profile_avatar_medal_wall_click", click.plus(target).plus(mo180570b()).plus(new MedalExtraParams.MedalId(str, null, 2, null)).toJson());
        }

        /* renamed from: d */
        public final void mo180581d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "medalId");
            MedalExtraParams.Click click = MedalExtraParams.Click.MEDAL_ICON;
            MedalExtraParams.Target target = MedalExtraParams.Target.PROFILE_AVATAR_MEDAL_DETAIL_VIEW;
            Statistics.sendEvent("profile_avatar_medal_wall_click", click.plus(target).plus(mo180570b()).plus(new MedalExtraParams.MedalId(str, null, 2, null)).toJson());
        }

        /* renamed from: e */
        public final void mo180584e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "medalId");
            Statistics.sendEvent("profile_avatar_medal_put_on_confirm_view", new MedalExtraParams.MedalId(str, null, 2, null).toJson());
        }

        /* renamed from: f */
        public final void mo180587f(String str) {
            Intrinsics.checkParameterIsNotNull(str, "medalId");
            MedalExtraParams.Click click = MedalExtraParams.Click.BACK;
            MedalExtraParams.Target target = MedalExtraParams.Target.PROFILE_AVATAR_MEDAL_WALL_VIEW;
            Statistics.sendEvent("profile_avatar_medal_detail_click", click.plus(target).plus(new MedalExtraParams.MedalId(str, null, 2, null)).toJson());
        }

        /* renamed from: c */
        public final void mo180578c(boolean z) {
            MedalExtraParams.IsMedalPutOn isMedalPutOn;
            MedalExtraParams.Click click = MedalExtraParams.Click.BACK;
            MedalExtraParams.Target target = MedalExtraParams.Target.PROFILE_MAIN_VIEW;
            if (z) {
                isMedalPutOn = MedalExtraParams.IsMedalPutOn.TRUE;
            } else {
                isMedalPutOn = MedalExtraParams.IsMedalPutOn.FALSE;
            }
            Statistics.sendEvent("profile_avatar_medal_wall_click", click.plus(target).plus(isMedalPutOn).plus(mo180570b()).toJson());
        }

        /* renamed from: d */
        public final void mo180582d(boolean z) {
            SpecialFocusParams.Behavior behavior;
            SpecialFocusParams.Click click = SpecialFocusParams.Click.SPECIAL_ATTENTION;
            SpecialFocusParams.Target target = SpecialFocusParams.Target.NONE;
            SpecialFocusParams.IsFirstSetup isFirstSetup = SpecialFocusParams.IsFirstSetup.TRUE;
            if (z) {
                behavior = SpecialFocusParams.Behavior.CANCEL_SPECIAL_ATTENTION;
            } else {
                behavior = SpecialFocusParams.Behavior.ADD_SPECIAL_ATTENTION;
            }
            m204754a(click.plus(target).plus(isFirstSetup).plus(behavior));
        }

        /* renamed from: e */
        public final void mo180585e(boolean z) {
            SpecialFocusParams.Click click;
            if (z) {
                click = SpecialFocusParams.Click.CONFIRM;
            } else {
                click = SpecialFocusParams.Click.CANCEL;
            }
            Statistics.sendEvent("im_special_attention_confirm_click", click.plus(SpecialFocusParams.Target.PROFILE_MAIN_VIEW).toJson());
        }

        /* renamed from: a */
        public final void mo180563a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            UserProfileExtraParams.Click click = UserProfileExtraParams.Click.BASIC_INFORMATION_FIELDS;
            UserProfileExtraParams.Target target = UserProfileExtraParams.Target.NONE;
            m204754a(click.plus(target).plus(new UserProfileExtraParams.Param(ShareHitPoint.f121869d, str)));
        }

        /* renamed from: b */
        public final void mo180573b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "medalId");
            MedalExtraParams.Click click = MedalExtraParams.Click.MEDAL_PUT_ON;
            MedalExtraParams.Target target = MedalExtraParams.Target.PROFILE_AVATAR_MEDAL_PUT_ON_CONFIRM_VIEW;
            Statistics.sendEvent("profile_avatar_medal_wall_click", click.plus(target).plus(mo180570b()).plus(new MedalExtraParams.MedalId(str, null, 2, null)).toJson());
        }

        /* renamed from: b */
        public final void mo180574b(boolean z) {
            UserProfileExtraParams.Click click = UserProfileExtraParams.Click.CERTIFICATION;
            UserProfileExtraParams.Target target = UserProfileExtraParams.Target.ADMIN_FEISHU_CERTIFICATE_H5_DETAIL_VIEW;
            UserProfileExtraParams.Param dVar = new UserProfileExtraParams.Param("verification", "true");
            m204754a(click.plus(target).plus(dVar).plus(new UserProfileExtraParams.Param("is_verified", String.valueOf(z))));
        }

        /* renamed from: c */
        public final void mo180579c(boolean z, boolean z2) {
            Statistics.sendEvent("profile_contact_request_view", new UserProfileExtraParams.Param("verification", String.valueOf(z)).plus(new UserProfileExtraParams.Param("is_verified", String.valueOf(z2))).plus(mo180570b()).toJson());
        }

        /* renamed from: a */
        public final void mo180564a(String str, boolean z) {
            MedalExtraParams.Click click;
            Intrinsics.checkParameterIsNotNull(str, "medalId");
            if (z) {
                click = MedalExtraParams.Click.CONFIRM;
            } else {
                click = MedalExtraParams.Click.CANCEL;
            }
            MedalExtraParams.Target target = MedalExtraParams.Target.PROFILE_AVATAR_MEDAL_WALL_VIEW;
            Statistics.sendEvent("profile_avatar_medal_put_on_confirm_click", click.plus(target).plus(new MedalExtraParams.MedalId(str, null, 2, null)).toJson());
        }

        /* renamed from: b */
        public final void mo180575b(boolean z, boolean z2) {
            UserProfileExtraParams.Click click = UserProfileExtraParams.Click.CONTACT_AGREE;
            UserProfileExtraParams.Target target = UserProfileExtraParams.Target.PROFILE_MAIN_VIEW;
            UserProfileExtraParams.Param dVar = new UserProfileExtraParams.Param("verification", String.valueOf(z));
            m204754a(click.plus(target).plus(dVar).plus(new UserProfileExtraParams.Param("is_verified", String.valueOf(z2))));
        }

        /* renamed from: a */
        public final void mo180560a(int i, int i2, boolean z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("to_user_id", UserProfileHitPointV3.f130746c.mo180570b().getValue());
            jSONObject.put("contact_type", UserProfileHitPointV3.f130746c.mo180558a().getValue());
            jSONObject.put("name_length", i);
            jSONObject.put("description_length", i2);
            jSONObject.put("has_pic", String.valueOf(z));
            Statistics.sendEvent("profile_alias_setting_view", jSONObject);
        }

        /* renamed from: b */
        public final void mo180572b(int i, int i2, boolean z) {
            Statistics.sendEvent("profile_avatar_medal_wall_view", new JSONObject().put("valid_medal_count", i).put("invalid_medal_count", i2).put("is_medal_put_on", String.valueOf(z)).put("to_user_id", mo180570b().getValue()));
        }

        /* renamed from: a */
        public final void mo180565a(String str, boolean z, boolean z2) {
            boolean z3;
            UserProfileExtraParams.IsReasonApply isReasonApply;
            UserProfileExtraParams.Click click = UserProfileExtraParams.Click.SEND;
            UserProfileExtraParams.Target target = UserProfileExtraParams.Target.NONE;
            UserProfileExtraParams.Param dVar = new UserProfileExtraParams.Param("verification", String.valueOf(z));
            UserProfileExtraParams.Param dVar2 = new UserProfileExtraParams.Param("is_verified", String.valueOf(z2));
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                isReasonApply = UserProfileExtraParams.IsReasonApply.FALSE;
            } else {
                isReasonApply = UserProfileExtraParams.IsReasonApply.TRUE;
            }
            Statistics.sendEvent("profile_contact_request_click", click.plus(target).plus(dVar).plus(dVar2).plus(mo180570b()).plus(isReasonApply).toJson());
        }

        /* renamed from: a */
        public final void mo180566a(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, String str3, String str4, boolean z5, boolean z6, String str5, boolean z7, int i, boolean z8, boolean z9, Function1<? super JSONObject, ? extends JSONObject> function1) {
            Intrinsics.checkParameterIsNotNull(str, "gender");
            Intrinsics.checkParameterIsNotNull(str2, "accountTag");
            Intrinsics.checkParameterIsNotNull(str3, "friendConversion");
            Intrinsics.checkParameterIsNotNull(str4, "contactType");
            Intrinsics.checkParameterIsNotNull(str5, "toUserid");
            Intrinsics.checkParameterIsNotNull(function1, "extraSetter");
            JSONObject put = new JSONObject().put("gender_tag", str).put("is_user_on_leave_tag_shown", String.valueOf(z)).put("is_user_no_disturb_tag_shown", String.valueOf(z2)).put("account_status_tag", str2).put("is_custom_image_field_shown", String.valueOf(z3)).put("is_moments_tab_shown", String.valueOf(z4)).put("friend_conversion", str3).put("contact_type", str4).put("is_privacy_set", String.valueOf(z5)).put("verification", String.valueOf(z6)).put("to_user_id", str5).put("is_verified", String.valueOf(z7)).put("signature_length", i).put("is_avatar_medal_shown", String.valueOf(z8)).put("is_medal_wall_entry_shown", String.valueOf(z9));
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\"gender…WallEntryShow.toString())");
            Statistics.sendEvent("profile_main_view", (JSONObject) function1.invoke(put));
        }
    }
}
