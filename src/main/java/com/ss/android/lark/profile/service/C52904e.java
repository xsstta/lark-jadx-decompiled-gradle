package com.ss.android.lark.profile.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ax;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.func.add_friend.AddFriendActivity;
import com.ss.android.lark.profile.func.add_friend.AddFriendFragment;
import com.ss.android.lark.profile.func.edit_profile.EditAliasActivity;
import com.ss.android.lark.profile.func.edit_profile.EditAliasFragment;
import com.ss.android.lark.profile.func.friend_request.C52276a;
import com.ss.android.lark.profile.func.friend_request.ReasonEditActivity;
import com.ss.android.lark.profile.func.group_profile.C52316d;
import com.ss.android.lark.profile.func.medal.detail.MedalDetailActivity;
import com.ss.android.lark.profile.func.medal.detail.MedalDetailSource;
import com.ss.android.lark.profile.func.medal.wall.MedalWallActivity;
import com.ss.android.lark.profile.func.share_profile.C52459a;
import com.ss.android.lark.profile.func.share_profile.ShareProfileActivity;
import com.ss.android.lark.profile.func.user_profile.UserProfileActivity;
import com.ss.android.lark.profile.func.user_profile.UserProfileFragment;
import com.ss.android.lark.profile.func.v3.edit_profile.EditAliasActivityV3;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileActivityV3;
import com.ss.android.lark.profile.statistics.ProfileSlardarHitPoint;
import com.ss.android.lark.profile.statistics.UserProfilePerceptionErrorCostTimeHitPoint;
import com.ss.android.lark.widget.listener.C58546g;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.profile.service.e */
public class C52904e implements AbstractC29542ad {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.profile.service.e$a */
    public static class C52908a {

        /* renamed from: a */
        static C52904e f130726a = new C52904e();
    }

    /* renamed from: a */
    public static C52904e m204638a() {
        return C52908a.f130726a;
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105572a(Context context, String str, String str2) {
        if (DesktopUtil.m144301a(context)) {
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a(str).mo134930b();
            C36512a.m144041a().mo134762a(new C52459a(), a);
        } else if (C52239a.m202617d().mo133576g(str2)) {
            Intent intent = new Intent(context, ShareProfileActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105568a(Context context, C36516a aVar, String str, String str2, String str3, String str4, ImageSetPassThrough imageSetPassThrough, int i) {
        Intent intent = new Intent(context, EditAliasActivityV3.class);
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putString("user_name", str2);
        bundle.putString("alias_name", str3);
        bundle.putString("alias_description", str4);
        bundle.putSerializable("alias_image", imageSetPassThrough);
        intent.putExtras(bundle);
        aVar.startActivityForResult(intent, i);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105580a(Context context, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, boolean z4, String str5, String str6, boolean z5) {
        C52316d.m202951a(context, str, str2, str3, z, z2, str4, z3, z4, str5, str6, z5);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105569a(Context context, String str) {
        C52316d.m202949a(context, str);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105579a(Context context, String str, String str2, String str3, String str4, boolean z) {
        C52316d.m202950a(context, str, str2, str3, str4, z);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105573a(Context context, String str, String str2, ContactSource contactSource) {
        mo105576a(context, str, str2, contactSource, false);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105574a(Context context, String str, String str2, ContactSource contactSource, int i) {
        mo105565a(context, new ax.C29549a().mo105617a(str).mo105620b(str2).mo105616a(contactSource).mo105618a(false).mo105619a(), (C36516a) null, i);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105576a(Context context, String str, String str2, ContactSource contactSource, boolean z) {
        Log.m165389i("ProfileLauncherService", "start new Profile by userId");
        mo105565a(context, new ax.C29549a().mo105617a(str).mo105620b(str2).mo105616a(contactSource).mo105618a(z).mo105619a(), (C36516a) null, -1);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105570a(Context context, String str, ContactSource contactSource) {
        mo105571a(context, str, contactSource, -1);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105571a(Context context, String str, ContactSource contactSource, int i) {
        Log.m165389i("ProfileLauncherService", "start new Profile by token");
        mo105565a(context, new ax.C29549a().mo105621c(str).mo105616a(contactSource).mo105618a(false).mo105619a(), (C36516a) null, i);
    }

    /* renamed from: a */
    public void mo180526a(Bundle bundle, boolean z, C36516a aVar, int i) {
        C58546g.C58549b bVar;
        if (z) {
            bVar = C58546g.m227072a().mo198457c();
        } else {
            bVar = C58546g.m227072a().mo198456b();
        }
        FloatWindowParams a = new FloatWindowParams.C36567a().mo134944a(bVar.mo198460c(), bVar.mo198461d()).mo134948b(LocationRequest.PRIORITY_INDOOR).mo134949c(495).mo134945a("UserProfileTag").mo134942a(BitmapDescriptorFactory.HUE_RED).mo134943a(51).mo134946a(false).mo134930b();
        UserProfileFragment aVar2 = new UserProfileFragment();
        aVar2.setArguments(bundle);
        if (aVar == null) {
            C36512a.m144041a().mo134762a(aVar2, a);
        } else {
            C36512a.m144041a().mo134760a(aVar, aVar2, a, i);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105577a(Context context, String str, String str2, String str3, String str4, ContactSource contactSource, C36516a aVar, int i) {
        mo105578a(context, str, str2, str3, str4, contactSource, false, false, aVar, i);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105578a(Context context, String str, String str2, String str3, String str4, ContactSource contactSource, Boolean bool, Boolean bool2, C36516a aVar, int i) {
        ContactSource contactSource2;
        if (!C52239a.m202617d().mo133561a("lark.client.contact.opt")) {
            mo180524a(context, aVar, str2, str3, i);
        }
        Bundle bundle = new Bundle();
        bundle.putString("param_key_user_id", str);
        bundle.putString("param_key_user_name", str4);
        if (contactSource == null) {
            contactSource2 = new ContactSource();
            contactSource2.setSourceType(0);
        } else {
            contactSource2 = contactSource;
        }
        bundle.putSerializable("param_key_source", contactSource2);
        bundle.putString("param_key_token", str2);
        bundle.putString("param_key_chat_id", str3);
        bundle.putBoolean("param_key_is_has_tenant_certification", bool.booleanValue());
        bundle.putBoolean("param_key_is_tenant_certification", bool2.booleanValue());
        if (DesktopUtil.m144301a(context)) {
            AddFriendFragment aVar2 = new AddFriendFragment();
            aVar2.setArguments(bundle);
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
            if (aVar == null) {
                C36512a.m144041a().mo134762a(aVar2, a);
            } else {
                C36512a.m144041a().mo134760a(aVar, aVar2, a, i);
            }
        } else {
            Intent intent = new Intent(context, AddFriendActivity.class);
            intent.putExtras(bundle);
            ((Activity) context).startActivityForResult(intent, i);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105575a(Context context, String str, String str2, ContactSource contactSource, int i, C36516a aVar) {
        mo105578a(context, str, "", null, str2, contactSource, false, false, aVar, i);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105581a(Context context, String str, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString("key_user_id", str);
        bundle.putBoolean("key_is_resigned", z);
        bundle.putBoolean("is_same_tenant", z2);
        Intent intent = new Intent(context, MedalWallActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo180525a(Context context, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putString("medal_id", str2);
        bundle.putString("grant_id", str3);
        bundle.putInt("type_source", MedalDetailSource.SOURCE_MEDAL_WALL.getValue());
        Intent intent = new Intent(context, MedalDetailActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private int m204637a(Bundle bundle) {
        Serializable serializable = bundle.getSerializable("param_key_source");
        if (!(serializable instanceof ContactSource) || ((ContactSource) serializable).getSourceType() != 11) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private boolean m204640a(ax axVar) {
        if (axVar == null) {
            Log.m165383e("ProfileLauncherService", "params is null");
            return false;
        } else if (TextUtils.isEmpty(axVar.f73948b) && TextUtils.isEmpty(axVar.f73947a)) {
            Log.m165383e("ProfileLauncherService", "userId and Token are null");
            return false;
        } else if (axVar.f73950d != null) {
            return true;
        } else {
            Log.m165383e("ProfileLauncherService", "Sources are null");
            axVar.f73950d = new ContactSource();
            axVar.f73950d.setSourceType(0);
            return true;
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public Map<String, AbstractC29186b> mo105563a(final Context context) {
        C529051 r0 = new AbstractC29186b() {
            /* class com.ss.android.lark.profile.service.C52904e.C529051 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                String queryParameter = Uri.parse(appLink.mo103435a()).getQueryParameter("token");
                if (queryParameter == null || queryParameter.isEmpty()) {
                    return false;
                }
                if (context == null) {
                    context = context;
                }
                ContactSource contactSource = new ContactSource();
                contactSource.setSourceType(1);
                C52904e.this.mo105570a(context, queryParameter, contactSource);
                return true;
            }
        };
        C529062 r1 = new AbstractC29186b() {
            /* class com.ss.android.lark.profile.service.C52904e.C529062 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                if (context == null) {
                    context = context;
                }
                String c = C52239a.m202617d().mo133591u().mo133642c();
                if (TextUtils.isEmpty(c)) {
                    return false;
                }
                C52904e.this.mo105581a(context, c, false, true);
                return true;
            }
        };
        HashMap hashMap = new HashMap();
        hashMap.put("/client/contact/add_friend", r0);
        hashMap.put("/client/profile/medal", r1);
        return hashMap;
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: b */
    public void mo105582b(Context context, String str) {
        C52316d.m202952b(context, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m204641e(Context context, String str) {
        C52239a.m202617d().mo133557a(context, str, false);
    }

    /* renamed from: d */
    public void mo180527d(Context context, String str) {
        Intent intent = new Intent(context, MedalDetailActivity.class);
        intent.putExtra("user_id", str);
        intent.putExtra("type_source", MedalDetailSource.SOURCE_PROILFE.getValue());
        context.startActivity(intent);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: c */
    public void mo105585c(Context context, String str) {
        Log.m165389i("ProfileLauncherService", "startAppProfileByBotId, botId:" + str);
        if (context == null) {
            Log.m165383e("ProfileLauncherService", "Failed to start app profile, context is null");
        } else if (TextUtils.isEmpty(str)) {
            Log.m165383e("ProfileLauncherService", "Failed to start app profile, botId is empty");
        } else {
            UICallbackExecutor.post(new Runnable(context, str) {
                /* class com.ss.android.lark.profile.service.$$Lambda$e$CLCKHp65o3wNrS_VBpzKPgcjdY */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    C52904e.m204641e(this.f$0, this.f$1);
                }
            });
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105564a(Context context, Bundle bundle, int i) {
        C52316d.m202947a(context, bundle, i);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: b */
    public void mo105583b(Context context, String str, String str2, ContactSource contactSource) {
        mo105584b(context, str, str2, contactSource, -1);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105565a(Context context, ax axVar, C36516a aVar, int i) {
        if (!m204640a(axVar)) {
            Log.m165383e("ProfileLauncherService", "param is invalid");
            return;
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(axVar.f73947a)) {
            bundle.putString("param_key_user_id", axVar.f73947a);
        } else {
            bundle.putString("param_key_token", axVar.f73948b);
        }
        bundle.putString("param_key_chat_id", axVar.f73949c);
        bundle.putSerializable("param_key_source", axVar.f73950d);
        bundle.putBoolean("param_show_at_last", axVar.f73951e);
        m204639a(context, bundle, aVar, i, axVar.f73951e);
    }

    /* renamed from: a */
    public void mo180524a(Context context, C36516a aVar, String str, String str2, int i) {
        mo105566a(context, aVar, str, str2, (ContactSource) null, i);
    }

    /* renamed from: a */
    private void m204639a(Context context, final Bundle bundle, final C36516a aVar, final int i, final boolean z) {
        Intent intent;
        ProfileSlardarHitPoint.f130742b.mo180548b();
        if (!DesktopUtil.m144301a(context)) {
            if (!C52239a.m202617d().mo133561a("messenger.profile.new_structure_5.0") || !UserProfileActivityV3.m204081a(bundle)) {
                UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180610a(1, 0);
                intent = new Intent(context, UserProfileActivity.class);
            } else {
                UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180610a(2, m204637a(bundle));
                intent = new Intent(context, UserProfileActivityV3.class);
            }
            intent.putExtras(bundle);
            boolean z2 = context instanceof Activity;
            if (!z2) {
                intent.addFlags(268435456);
            }
            if (z2) {
                ((Activity) context).startActivityForResult(intent, i);
            } else {
                context.startActivity(intent);
            }
        } else {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.profile.service.C52904e.RunnableC529073 */

                public void run() {
                    C52904e.this.mo180526a(bundle, z, aVar, i);
                }
            });
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: b */
    public void mo105584b(Context context, String str, String str2, ContactSource contactSource, int i) {
        Log.m165389i("ProfileLauncherService", "start new name card Profile by id");
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("param_key_name_card_id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("param_key_email", str2);
            }
            if (contactSource != null) {
                bundle.putSerializable("param_key_source", contactSource);
            }
            m204639a(context, bundle, (C36516a) null, i, false);
            return;
        }
        Log.m165383e("ProfileLauncherService", "startNameCardProfile param is invalid");
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105566a(Context context, C36516a aVar, String str, String str2, ContactSource contactSource, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("contact_add_friend_token", str);
        bundle.putString("contact_from_chat_id", str2);
        if (contactSource != null) {
            bundle.putSerializable("contact_source", contactSource);
        }
        if (DesktopUtil.m144301a(context)) {
            C52276a aVar2 = new C52276a();
            aVar2.setArguments(bundle);
            C36512a.m144041a().mo134760a(aVar, aVar2, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_POPOVER_P1).mo134945a("UserProfileTag").mo134930b(), i);
            return;
        }
        Intent intent = new Intent(context, ReasonEditActivity.class);
        intent.putExtras(bundle);
        ((Activity) context).startActivityForResult(intent, i);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29542ad
    /* renamed from: a */
    public void mo105567a(Context context, C36516a aVar, String str, String str2, String str3, String str4, int i) {
        Intent intent = new Intent(context, EditAliasActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("alias", str4);
        bundle.putString("chatter_id", str);
        bundle.putString("chatter_name", str2);
        bundle.putString("contact_token", str3);
        intent.putExtras(bundle);
        if (DesktopUtil.m144301a(context)) {
            EditAliasFragment editAliasFragment = new EditAliasFragment();
            editAliasFragment.setArguments(bundle);
            C36512a.m144041a().mo134760a(aVar, editAliasFragment, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b(), i);
            return;
        }
        aVar.startActivityForResult(intent, i);
    }
}
