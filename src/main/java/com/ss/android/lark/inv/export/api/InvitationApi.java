package com.ss.android.lark.inv.export.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.lark.pb.contact.v1.InvitationSource;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.router.AbstractC40091a;
import java.util.Map;

public interface InvitationApi {
    Map<String, AbstractC29186b> getAppLinkHandlers(Context context);

    IInvitationModuleDependency getDependency();

    String getInviteExternalPageTitle();

    Map<String, AbstractC40091a> getRouterMap();

    InvitationServiceApi getService();

    boolean isInvitationUnionEnable();

    boolean isInviteExternalEnable();

    boolean isInviteMemberAdminEnable();

    boolean isInviteMemberEnable();

    boolean isInviteMemberFgEnable();

    void openExternalContactV2Page(Activity activity, String str);

    void openInvitationUnionPage(Context context, String str);

    void openInviteB2bPage(Context context, String str);

    void openInviteExternalPage(Context context, String str, boolean z);

    void openInviteMemberGuidePage(Context context, String str, Bundle bundle);

    void openInviteMemberPageSmart(Context context, String str);

    void openInviteMemberPageSmartWithExtraParams(Context context, String str, Map<String, String> map);

    void openInviteParentChannel(Context context, String str, String str2, InvitationSource invitationSource);

    void openWelcomeToLarkPage(Context context, String str, Bundle bundle);

    void registerH5Plugin(Context context);
}
