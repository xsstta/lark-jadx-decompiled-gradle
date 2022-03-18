package com.ss.android.lark.invitation.v2.feat.member.contact;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.contact.entity.mobile.item.ContactMobileItem;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity;
import com.ss.android.lark.inv.export.util.C40124o;
import com.ss.android.lark.inv.export.util.C40145x;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.inv.export.util.InvAppreciableUtils;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InviteMemberContactActivity extends InvBaseFragmentActivity implements ContactMobileApi.AbstractC35403b {

    /* renamed from: a */
    private Fragment f102504a;

    /* renamed from: b */
    private boolean f102505b;

    /* renamed from: c */
    private boolean f102506c;

    /* renamed from: d */
    private String f102507d;

    /* renamed from: a */
    public Context mo146234a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo146235a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo146236a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159905a(this, context);
    }

    /* renamed from: b */
    public void mo146237b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo146238c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159901a(this, configuration);
    }

    public AssetManager getAssets() {
        return m159909c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159902a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159908b(this);
    }

    @Override // com.ss.android.lark.contact.entity.api.ContactMobileApi.AbstractC35403b
    /* renamed from: a */
    public void mo130581a(List<ContactMobileBean> list) {
        if (list == null || list.size() <= 0) {
            finish();
        } else {
            m159912e();
        }
    }

    /* renamed from: d */
    private void m159911d() {
        C57783ah.m224245a().mo196092a(ContactMobileApi.C35405d.UiMessageContactMobileUpdateItem, (C57783ah.AbstractC57787c) new C57783ah.AbstractC57787c() {
            /* class com.ss.android.lark.invitation.v2.feat.member.contact.$$Lambda$InviteMemberContactActivity$HRxKZxfzwAno2WdfCXGVr6SvQAs */

            @Override // com.ss.android.lark.utils.C57783ah.AbstractC57787c
            public final void handleMessage(C57783ah.C57786b bVar) {
                InviteMemberContactActivity.lambda$HRxKZxfzwAno2WdfCXGVr6SvQAs(InviteMemberContactActivity.this, bVar);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C57783ah.m224245a().mo196094b(ContactMobileApi.C35405d.UiMessageContactMobileUpdateItem);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        if (getIntent().getBooleanExtra("is_close", false)) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
        }
        return super.getEnterAnimationConfig();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        if (this.f102506c) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
        }
        return super.getEnterAnimationConfig();
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        Fragment fragment = this.f102504a;
        if (!(fragment instanceof ContactMobileApi.AbstractC35404c) || !((ContactMobileApi.AbstractC35404c) fragment).mo130583a()) {
            super.onBackPressed();
        }
    }

    /* renamed from: e */
    private void m159912e() {
        new C25639g(this).mo89247e(true).mo89248g(R.string.Lark_Invitation_AddMembersRefreshDialogTitle).mo89238b(true).mo89254m(R.string.Lark_Invitation_QuitBatch).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Invitation_AddMembersRefreshDialogCancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.contact.InviteMemberContactActivity.DialogInterface$OnClickListenerC403506 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Invitation_AddMembersRefreshDialogConfirm, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.contact.InviteMemberContactActivity.DialogInterface$OnClickListenerC403495 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                InviteMemberContactActivity.this.finish();
            }
        }).mo89239c();
    }

    /* renamed from: c */
    public void mo146239c(List<ContactMobileBean> list) {
        finish();
        if (!list.isEmpty()) {
            C40351a.m159929a(list, this.f102505b);
        }
    }

    /* renamed from: a */
    public static Resources m159902a(InviteMemberContactActivity inviteMemberContactActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberContactActivity);
        }
        return inviteMemberContactActivity.mo146235a();
    }

    /* renamed from: c */
    public static AssetManager m159909c(InviteMemberContactActivity inviteMemberContactActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberContactActivity);
        }
        return inviteMemberContactActivity.mo146238c();
    }

    /* renamed from: b */
    public static void m159908b(InviteMemberContactActivity inviteMemberContactActivity) {
        inviteMemberContactActivity.mo146237b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteMemberContactActivity inviteMemberContactActivity2 = inviteMemberContactActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteMemberContactActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: d */
    private String m159910d(List<ContactMobileBean> list) {
        String str;
        int min = Math.min(list.size(), 5);
        if (C40147z.m159160a().isEnLanguage()) {
            str = ", ";
        } else {
            str = "、";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
            sb.append(str);
            sb.append(list.get(i).getName());
        }
        sb.delete(0, str.length());
        return sb.toString();
    }

    @Override // com.ss.android.lark.contact.entity.api.ContactMobileApi.AbstractC35403b
    /* renamed from: b */
    public void mo130582b(List<ContactMobileBean> list) {
        InvHitPoint.m160383g(this.f102507d);
        InvHitPoint.m160344W(this.f102507d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.f102505b) {
            for (ContactMobileBean contactMobileBean : list) {
                if (contactMobileBean.isRightEmail()) {
                    arrayList2.add(contactMobileBean);
                } else {
                    arrayList.add(contactMobileBean);
                }
            }
        } else {
            for (ContactMobileBean contactMobileBean2 : list) {
                if (contactMobileBean2.isRightPhone()) {
                    arrayList2.add(contactMobileBean2);
                } else {
                    arrayList.add(contactMobileBean2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            mo146239c(list);
        } else {
            m159907a(arrayList2, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        ContactMobileApi.ContactType contactType;
        super.onCreate(bundle);
        InvAppreciableUtils.f101934a.mo145661c(true);
        setContentView(R.layout.inv_invite_member_contact_activity);
        this.f102505b = getIntent().getBooleanExtra("invite_msg", false);
        this.f102507d = getIntent().getStringExtra("from");
        this.f102506c = getIntent().getBooleanExtra("is_close", false);
        Log.m165389i("InvitationModule", "onCreate InviteMemberContactActivity isEmail: " + this.f102505b + ", from: " + this.f102507d);
        InvHitPoint.m160381f(this.f102507d);
        m159911d();
        IInvitationModuleDependency.AbstractC40086b contactDependency = C40147z.m159160a().getContactDependency();
        if (this.f102505b) {
            contactType = ContactMobileApi.ContactType.EMAIL;
        } else {
            contactType = ContactMobileApi.ContactType.PHONE;
        }
        Fragment a = contactDependency.mo145576a(contactType, ContactMobileApi.C35402a.m138369a(UIHelper.getString(R.string.Lark_Legacy_Send), this.f102506c), "invite_member");
        this.f102504a = a;
        C40124o.m159088a((FragmentActivity) this, (int) R.id.imcFragmentContainer, a, false, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m159906a(C57783ah.C57786b bVar) {
        if (bVar.mo196098b() instanceof ContactMobileApi.C35405d) {
            final List<ContactMobileItem> a = ((ContactMobileApi.C35405d) bVar.mo196098b()).mo130584a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (ContactMobileItem aVar : a) {
                ContactMobileBean contactMobileBean = aVar.f91461a;
                if (contactMobileBean != null) {
                    if (contactMobileBean.isRightEmail()) {
                        arrayList.add(contactMobileBean.getEmail());
                    }
                    if (contactMobileBean.isRightPhone()) {
                        arrayList2.add(contactMobileBean.getPhoneE164());
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                C40147z.m159162b().checkContactUsingApp(arrayList, arrayList2, new UIGetDataCallback(new IGetDataCallback<Map<String, Boolean>>() {
                    /* class com.ss.android.lark.invitation.v2.feat.member.contact.InviteMemberContactActivity.C403462 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("InvitationModule", errorResult.getDebugMsg());
                    }

                    /* renamed from: a */
                    public void onSuccess(Map<String, Boolean> map) {
                        if (!map.isEmpty()) {
                            for (ContactMobileItem aVar : a) {
                                ContactMobileBean contactMobileBean = aVar.f91461a;
                                Boolean bool = map.get(contactMobileBean == null ? null : contactMobileBean.getEmailOrPhoneE164());
                                if (bool == null || !bool.booleanValue()) {
                                    aVar.mo130631a((String) null);
                                } else {
                                    aVar.mo130631a(UIHelper.mustacheFormat((int) R.string.Lark_InviteMembers_ImportFromContacts_FeishuUser, "APP_DISPLAY_NAME", C40145x.m159157a()));
                                }
                            }
                        }
                    }
                }));
            }
        }
    }

    @Override // com.ss.android.lark.contact.entity.api.ContactMobileApi.AbstractC35403b
    /* renamed from: a */
    public void mo130580a(long j) {
        Log.m165389i("InvitationModule", j + "");
        InvAppreciableUtils.f101934a.mo145661c(false);
    }

    /* renamed from: a */
    public static Context m159901a(InviteMemberContactActivity inviteMemberContactActivity, Configuration configuration) {
        Context a = inviteMemberContactActivity.mo146234a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m159905a(InviteMemberContactActivity inviteMemberContactActivity, Context context) {
        inviteMemberContactActivity.mo146236a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberContactActivity);
        }
    }

    /* renamed from: a */
    private void m159907a(final List<ContactMobileBean> list, List<ContactMobileBean> list2) {
        int i;
        HashMap hashMap = new HashMap();
        hashMap.put("INVALID_NUM", String.valueOf(list2.size()));
        hashMap.put("CONTACT_LIST", m159910d(list2));
        if (this.f102505b) {
            i = R.string.Lark_Invitation_AddMembersChannelEmail;
        } else {
            i = R.string.Lark_Invitation_AcceptInvtationVerifyChannelPhone;
        }
        hashMap.put("INVITE_CHANNEL", UIHelper.getString(i));
        new C25639g(this).mo89247e(false).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Invitation_MembersBatchInvalidFormat, hashMap)).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.contact.InviteMemberContactActivity.DialogInterface$OnClickListenerC403484 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                InvHitPoint.m160392l();
            }
        }).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Invitation_MembersBatchInvalidFormatContinue, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.contact.InviteMemberContactActivity.DialogInterface$OnClickListenerC403473 */

            public void onClick(DialogInterface dialogInterface, int i) {
                InviteMemberContactActivity.this.mo146239c(list);
                InvHitPoint.m160390k();
            }
        }).mo89239c();
        InvHitPoint.m160388j();
    }

    /* renamed from: a */
    public static void m159903a(Activity activity, boolean z, String str, String str2, String str3) {
        m159904a(activity, z, str, str2, str3, false);
    }

    /* renamed from: a */
    public static void m159904a(final Activity activity, final boolean z, final String str, final String str2, final String str3, final boolean z2) {
        C57805b.m224332c(activity, new C57805b.AbstractC57809a() {
            /* class com.ss.android.lark.invitation.v2.feat.member.contact.InviteMemberContactActivity.C403451 */

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public void permissionGranted(boolean z) {
                if (z) {
                    InvApmUtils.m158971b("contact_opt_permission_allow");
                    C40351a.m159927a(activity, z, str2);
                    Intent intent = new Intent(activity, InviteMemberContactActivity.class);
                    Log.m165389i("InvitationModule", "start InviteMemberContactActivity isEmail: " + z + ", from: " + str);
                    intent.putExtra("invite_msg", z);
                    intent.putExtra("from", str);
                    intent.putExtra("is_close", z2);
                    activity.startActivity(intent);
                    InvHitPoint.m160346Y(str3);
                    return;
                }
                InvApmUtils.m158971b("contact_opt_permission_deny");
            }
        });
    }
}
