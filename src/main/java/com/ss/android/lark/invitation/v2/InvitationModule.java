package com.ss.android.lark.invitation.v2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.contact.v1.InvitationSource;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.larksuite.suite.R;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.inv.export.api.InvitationApi;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.router.AbstractC40091a;
import com.ss.android.lark.inv.export.util.C40134t;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bActivity;
import com.ss.android.lark.invitation.v2.feat.edu.channel.InviteParentChannelActivity;
import com.ss.android.lark.invitation.v2.feat.entrance.InvitationEntranceActivity;
import com.ss.android.lark.invitation.v2.feat.external.contact.v2.InviteExternalContactV2Activity;
import com.ss.android.lark.invitation.v2.feat.external.main.C40275c;
import com.ss.android.lark.invitation.v2.feat.external.main.InviteExternalActivity;
import com.ss.android.lark.invitation.v2.feat.member.channel.InviteMemberChannelActivity;
import com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideActivity;
import com.ss.android.lark.invitation.v2.feat.member.orientation.InviteMemberOrientationActivity;
import com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity;
import com.ss.android.lark.invitation.v2.p2050a.C40154a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@ClaymoreImpl(InvitationApi.class)
public class InvitationModule implements InvitationApi {
    public static List<AbstractC28490a> getAbTestExperiments() {
        return C40154a.f102005a;
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public Map<String, AbstractC40091a> getRouterMap() {
        return C40134t.f101976a;
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public boolean isInviteMemberEnable() {
        return hasInviteMemberPermission();
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public IInvitationModuleDependency getDependency() {
        return (IInvitationModuleDependency) ApiUtils.getApi(IInvitationModuleDependency.class);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public InvitationServiceApi getService() {
        return (InvitationServiceApi) ApiUtils.getApi(InvitationServiceApi.class);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public boolean isInviteExternalEnable() {
        return getDependency().isFgEnable("invite.external.enable");
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public String getInviteExternalPageTitle() {
        if (C40147z.m159160a().getLoginDependency().mo145589e()) {
            return UIHelper.getString(R.string.Lark_NewContacts_AddContactsb);
        }
        return UIHelper.getString(R.string.Lark_NewContacts_AddExternalContactsB);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public boolean isInvitationUnionEnable() {
        boolean hasInviteMemberPermission = hasInviteMemberPermission();
        boolean isFgEnable = getDependency().isFgEnable("invite.external.enable");
        if (hasInviteMemberPermission || isFgEnable) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public boolean isInviteMemberAdminEnable() {
        boolean hasInviteMemberAdminPermission = hasInviteMemberAdminPermission();
        if (getDependency().getLoginDependency().mo145589e() || !hasInviteMemberAdminPermission) {
            return false;
        }
        return true;
    }

    private boolean hasInviteMemberAdminPermission() {
        if (getDependency().isFgEnable("invite.member.enable")) {
            if (UserSP.getInstance().contains("user_sp_is_admin")) {
                return UserSP.getInstance().getBoolean("user_sp_is_admin");
            }
            getService().isAdmin(null);
        }
        return false;
    }

    private boolean hasInviteMemberPermission() {
        if (getDependency().isFgEnable("invite.member.enable")) {
            if (UserSP.getInstance().contains("invite_member_permission")) {
                return UserSP.getInstance().getBoolean("invite_member_permission");
            }
            getService().checkInviteMemberPermission(null);
        }
        return false;
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public boolean isInviteMemberFgEnable() {
        if (!getDependency().isFgEnable("invite.member.enable") || (!getDependency().isFgEnable("invite.member.phone.enable") && !getDependency().isFgEnable("invite.member.email.enable"))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public Map<String, AbstractC29186b> getAppLinkHandlers(Context context) {
        return C40134t.m159128a(context);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public void registerH5Plugin(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("biz.contact.external.invite");
        H5PluginConfig h5PluginConfig = new H5PluginConfig(new C40275c(), arrayList);
        AbstractC24152a h5Service = getDependency().getH5Service();
        if (h5Service == null) {
            Log.m165383e("InvitationModule", "registerH5Plugin H5Service is null");
        } else {
            h5Service.addPluginConfig(h5PluginConfig);
        }
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public void openExternalContactV2Page(Activity activity, String str) {
        InviteExternalContactV2Activity.m159459a(activity, str);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public void openInviteB2bPage(Context context, String str) {
        InviteB2bActivity.m159193a(context, str);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public void openInviteMemberPageSmart(Context context, String str) {
        openInviteMemberPageSmartWithExtraParams(context, str, Collections.emptyMap());
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public void openInvitationUnionPage(Context context, String str) {
        boolean hasInviteMemberPermission = hasInviteMemberPermission();
        boolean isFgEnable = getDependency().isFgEnable("invite.external.enable");
        if (!hasInviteMemberPermission && !isFgEnable) {
            return;
        }
        if (getDependency().getContactDependency().mo145581b() && isFgEnable) {
            openInviteExternalPage(context, str, false);
            Statistics.sendEvent("invite_people_external_CTA_click");
        } else if (hasInviteMemberPermission && isFgEnable) {
            InvitationEntranceActivity.m159340a(context, str);
        } else if (hasInviteMemberPermission) {
            openInviteMemberPageSmart(context, str);
        } else {
            openInviteExternalPage(context, str, false);
            Statistics.sendEvent("invite_people_external_CTA_click");
        }
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public void openInviteExternalPage(Context context, String str, boolean z) {
        InviteExternalActivity.m159555a(context, str, z);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public void openInviteMemberGuidePage(Context context, String str, Bundle bundle) {
        InviteMemberGuideActivity.m159968a(context, str, bundle);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public void openWelcomeToLarkPage(Context context, String str, Bundle bundle) {
        WelcomeToLarkActivity.m160238a(context, str, bundle);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public void openInviteMemberPageSmartWithExtraParams(final Context context, final String str, final Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        if (!getDependency().isFgEnable("invite.member.channels.page.enable")) {
            InviteMemberOrientationActivity.m160105a(context, str, map);
        } else if (getDependency().isFgEnable("invite.member.non_admin.non_directional.invite.enable")) {
            InviteMemberChannelActivity.m159789a(context, str, "", map);
        } else {
            Activity topActivity = getDependency().getTopActivity();
            if (topActivity == null) {
                topActivity = ViewUtils.m224141a(context);
            }
            C57768af.m224220b(topActivity, new C57768af.AbstractRunnableC57773c<Boolean>() {
                /* class com.ss.android.lark.invitation.v2.InvitationModule.C401492 */

                /* renamed from: a */
                public Boolean mo130916b() {
                    return Boolean.valueOf(InvitationModule.this.getService().isAdmin());
                }

                /* renamed from: a */
                public void mo130914a(Boolean bool) {
                    if (bool.booleanValue()) {
                        InviteMemberChannelActivity.m159789a(context, str, "", map);
                    } else {
                        InviteMemberOrientationActivity.m160105a(context, str, map);
                    }
                }
            }.mo196073a(5000, new Runnable() {
                /* class com.ss.android.lark.invitation.v2.InvitationModule.RunnableC401481 */

                public void run() {
                    InviteMemberOrientationActivity.m160105a(context, str, map);
                }
            }));
        }
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationApi
    public void openInviteParentChannel(Context context, String str, String str2, InvitationSource invitationSource) {
        String str3;
        if (InvitationSource.HOME_SCHOOL_CHAT.equals(invitationSource)) {
            str3 = "edu_chat";
        } else {
            str3 = "edu_contact";
        }
        InviteParentChannelActivity.m159254a(context, str3, str, str2, null);
    }
}
