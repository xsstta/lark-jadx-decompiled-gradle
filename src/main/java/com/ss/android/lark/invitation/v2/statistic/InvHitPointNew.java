package com.ss.android.lark.invitation.v2.statistic;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/invitation/v2/statistic/InvHitPointNew;", "", "()V", "CLICK", "", "NONE", "TARGET", "sendOnboardingTeamAddMemberGuideClick", "", "param", "Lcom/ss/android/lark/invitation/v2/statistic/InvHitPointNew$OnboardingTeamAddMemberGuideClickParam;", "sendOnboardingTeamAddMemberGuideView", "sendOnboardingTeamCreateJoinGuideClick", "Lcom/ss/android/lark/invitation/v2/statistic/InvHitPointNew$OnboardingTeamCreateJoinGuideClickParam;", "sendOnboardingTeamCreateJoinGuideSkipClick", "Lcom/ss/android/lark/invitation/v2/statistic/InvHitPointNew$OnboardingTeamCreateJoinGuideSkipClickParam;", "sendOnboardingTeamCreateJoinGuideSkipView", "sendOnboardingTeamCreateJoinGuideView", "OnboardingTeamAddMemberGuideClickParam", "OnboardingTeamCreateJoinGuideClickParam", "OnboardingTeamCreateJoinGuideSkipClickParam", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InvHitPointNew {

    /* renamed from: a */
    public static final InvHitPointNew f102936a = new InvHitPointNew();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/invitation/v2/statistic/InvHitPointNew$OnboardingTeamAddMemberGuideClickParam;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "SAVE", "SHARE", "LINK_COPY", "LINK_SHARE", "ADDRESS_BOOK", "NEXT", "LINK_COPY_LARK", "EMAIL_INVITATION", "IMPORT_CONTACTS", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum OnboardingTeamAddMemberGuideClickParam {
        SAVE("mobile_qrcode_save", "none"),
        SHARE("mobile_qrcode_share", "none"),
        LINK_COPY("mobile_link_copy", "none"),
        LINK_SHARE("mobile_link_share", "none"),
        ADDRESS_BOOK("team_addmember_addressbook", "onboarding_team_addmember_addressbook_view"),
        NEXT("next", "onboarding_operating_activities_view"),
        LINK_COPY_LARK("link_copy", "none"),
        EMAIL_INVITATION("mobile_email_invitation", "none"),
        IMPORT_CONTACTS("mobile_import_contacts", "none");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private OnboardingTeamAddMemberGuideClickParam(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/invitation/v2/statistic/InvHitPointNew$OnboardingTeamCreateJoinGuideClickParam;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "CREATETEAM", "MOBILE_JOINTEAM", "SKIP", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum OnboardingTeamCreateJoinGuideClickParam {
        CREATETEAM("createteam", "onboarding_team_complete_team_info_view"),
        MOBILE_JOINTEAM("mobile_jointeam", "onboarding_team_mobile_jointeam_view"),
        SKIP("skip", "team_create_join_guide_skip");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private OnboardingTeamCreateJoinGuideClickParam(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/invitation/v2/statistic/InvHitPointNew$OnboardingTeamCreateJoinGuideSkipClickParam;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "NEXT", "REMOVE", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum OnboardingTeamCreateJoinGuideSkipClickParam {
        NEXT("next", "none"),
        REMOVE("remove", "onboarding_team_create_join_guide_view");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private OnboardingTeamCreateJoinGuideSkipClickParam(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    private InvHitPointNew() {
    }

    /* renamed from: a */
    public final void mo146629a() {
        Statistics.sendEvent("onboarding_team_create_join_guide_view");
    }

    /* renamed from: b */
    public final void mo146633b() {
        Statistics.sendEvent("onboarding_team_create_join_guide_skip_view");
    }

    /* renamed from: c */
    public final void mo146634c() {
        Statistics.sendEvent("onboarding_team_addmember_guide_view");
    }

    /* renamed from: a */
    public final void mo146630a(OnboardingTeamAddMemberGuideClickParam onboardingTeamAddMemberGuideClickParam) {
        Intrinsics.checkParameterIsNotNull(onboardingTeamAddMemberGuideClickParam, "param");
        Statistics.sendEvent("onboarding_team_addmember_guide_click", new JSONObject().put("click", onboardingTeamAddMemberGuideClickParam.getAction()).put("target", onboardingTeamAddMemberGuideClickParam.getTarget()));
    }

    /* renamed from: a */
    public final void mo146631a(OnboardingTeamCreateJoinGuideClickParam onboardingTeamCreateJoinGuideClickParam) {
        Intrinsics.checkParameterIsNotNull(onboardingTeamCreateJoinGuideClickParam, "param");
        Statistics.sendEvent("onboarding_team_create_join_guide_click", new JSONObject().put("click", onboardingTeamCreateJoinGuideClickParam.getAction()).put("target", onboardingTeamCreateJoinGuideClickParam.getTarget()));
    }

    /* renamed from: a */
    public final void mo146632a(OnboardingTeamCreateJoinGuideSkipClickParam onboardingTeamCreateJoinGuideSkipClickParam) {
        Intrinsics.checkParameterIsNotNull(onboardingTeamCreateJoinGuideSkipClickParam, "param");
        Statistics.sendEvent("onboarding_team_create_join_guide_skip_click", new JSONObject().put("click", onboardingTeamCreateJoinGuideSkipClickParam.getAction()).put("target", onboardingTeamCreateJoinGuideSkipClickParam.getTarget()));
    }
}
