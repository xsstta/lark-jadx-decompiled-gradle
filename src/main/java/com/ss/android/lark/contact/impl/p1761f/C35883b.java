package com.ss.android.lark.contact.impl.p1761f;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.controller.IInactiveParentListControl;
import com.ss.android.lark.contact.entity.SelectedData;
import com.ss.android.lark.contact.impl.contacts_email.BusinessCardsActivity;
import com.ss.android.lark.contact.impl.contacts_email.edit.CardEditActivity;
import com.ss.android.lark.contact.impl.contacts_external.ExternalContactActivity;
import com.ss.android.lark.contact.impl.contacts_focus.SpecialFocusActivity;
import com.ss.android.lark.contact.impl.contacts_group.C35593b;
import com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupActivity;
import com.ss.android.lark.contact.impl.contacts_new.C35700b;
import com.ss.android.lark.contact.impl.contacts_new.NewContactActivity;
import com.ss.android.lark.contact.impl.contacts_robot.C35723b;
import com.ss.android.lark.contact.impl.contacts_robot.RobotActivity;
import com.ss.android.lark.contact.impl.department.C35804a;
import com.ss.android.lark.contact.impl.department.DepartmentStructureActivity;
import com.ss.android.lark.contact.impl.invite.InviteInactiveParentListActivity;
import com.ss.android.lark.contact.impl.selected_confirm.C35962b;
import com.ss.android.lark.contact.impl.selected_confirm.SelectedConfirmActivity;
import com.ss.android.lark.contact.impl.setting.C35991b;
import com.ss.android.lark.contact.impl.setting.PrivacySettingActivity;
import com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListActivity;
import com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListFragment;
import com.ss.android.lark.contact.impl.setting.one_way_contact.permission.ChatPermissionActivity;
import com.ss.android.lark.contact.impl.setting.one_way_contact.permission.ChatPermissionFragment;
import com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.PrivacySettingActivityV2;
import com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.PrivacySettingFragmentV2;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1735d.AbstractC35388c;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.f.b */
public class C35883b implements AbstractC35388c {

    /* renamed from: com.ss.android.lark.contact.impl.f.b$a */
    private static class C35886a {

        /* renamed from: a */
        static C35883b f92820a = new C35883b();
    }

    /* renamed from: a */
    public static C35883b m140625a() {
        return C35886a.f92820a;
    }

    /* renamed from: a */
    public void mo132105a(Context context, String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putString("department_id", str);
        if (DesktopUtil.m144301a(context)) {
            C35804a aVar = new C35804a();
            aVar.setArguments(bundle2);
            C36512a.m144041a().mo134763a(aVar, new MainWindowParams.C36570a(ContainerType.Right).mo134958a(C35881a.m140622a().mo130264b()).mo134930b());
            return;
        }
        Intent intent = new Intent(context, DepartmentStructureActivity.class);
        intent.putExtras(bundle2);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo132106a(Context context, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("department_id", str);
        bundle.putString("school_parent_contact_extra", str2);
        bundle.putBoolean("is_edu", true);
        bundle.putBoolean("get_inactive_parent", true);
        Intent intent = new Intent(context, DepartmentStructureActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo132107a(Context context, String str, String str2, String str3, int i) {
        Bundle bundle = new Bundle();
        IInactiveParentListControl.Companion aVar = IInactiveParentListControl.f91411a;
        bundle.putString("key_department_id", str);
        IInactiveParentListControl.Companion aVar2 = IInactiveParentListControl.f91411a;
        bundle.putString("key_chatter_id", str2);
        IInactiveParentListControl.Companion aVar3 = IInactiveParentListControl.f91411a;
        bundle.putString("key_sub_title", str3);
        IInactiveParentListControl.Companion aVar4 = IInactiveParentListControl.f91411a;
        bundle.putInt("key_inactiveParentCount", i);
        Intent intent = new Intent(context, InviteInactiveParentListActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo132108a(C36516a aVar, int i) {
        C36512a.m144041a().mo134759a(aVar, new ChatPermissionFragment(), new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_NORMAL_C1).mo134930b(), i);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35388c
    /* renamed from: a */
    public void mo130269a(Context context, String str, String str2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("key_enter_mode", "mode_create");
        bundle.putString("card_id", "");
        bundle.putString("name", str);
        bundle.putString("email", str2);
        m140626a(context, bundle, i);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35388c
    /* renamed from: a */
    public void mo130270a(Fragment fragment, List<SelectedData> list, int i) {
        if (fragment.getContext() == null || DesktopUtil.m144301a(fragment.getContext())) {
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
            C35962b bVar = new C35962b();
            Bundle bundle = new Bundle();
            bundle.putSerializable(C35358a.f91400a, new ArrayList(list));
            bVar.setArguments(bundle);
            C36512a.m144041a().mo134760a((C36516a) fragment, bVar, a, i);
            return;
        }
        Intent intent = new Intent(fragment.getContext(), SelectedConfirmActivity.class);
        intent.putExtra(C35358a.f91400a, new ArrayList(list));
        fragment.startActivityForResult(intent, i);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35388c
    /* renamed from: e */
    public void mo130273e(Context context) {
        context.startActivity(new Intent(context, ExternalContactActivity.class));
    }

    /* renamed from: f */
    public void mo132114f(Context context) {
        if (!DesktopUtil.m144301a(context)) {
            context.startActivity(new Intent(context, BusinessCardsActivity.class));
        }
    }

    /* renamed from: a */
    public void mo132101a(Activity activity) {
        if (DesktopUtil.m144301a((Context) activity)) {
            C36512a.m144041a().mo134763a(new C35700b(), new MainWindowParams.C36570a(ContainerType.Right).mo134958a(C35881a.m140622a().mo130264b()).mo134930b());
            return;
        }
        activity.startActivity(new Intent(activity, NewContactActivity.class));
    }

    /* renamed from: b */
    public void mo132109b(Activity activity) {
        if (!DesktopUtil.m144301a((Context) activity)) {
            activity.startActivity(new Intent(activity, SpecialFocusActivity.class));
        }
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35388c
    /* renamed from: c */
    public void mo130272c(Context context) {
        if (C35358a.m138143a().mo130150b().mo130208a("lark.client.contact.opt")) {
            m140629g(context);
        } else {
            mo132113d(context);
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35883b.RunnableC358841 */

            public void run() {
                ContactHitPoint.m140805h();
            }
        });
    }

    /* renamed from: g */
    private void m140629g(Context context) {
        if (DesktopUtil.m144301a(context)) {
            MainWindowParams a = new MainWindowParams.C36570a(ContainerType.Right).mo134958a(C35358a.m138143a().mo130162g().mo130255b()).mo134930b();
            C36512a.m144041a().mo134763a(new PrivacySettingFragmentV2(), a);
            return;
        }
        Intent intent = new Intent(context, PrivacySettingActivityV2.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: b */
    public void mo132110b(Context context) {
        if (DesktopUtil.m144301a(context)) {
            C36512a.m144041a().mo134763a(new C35723b(), new MainWindowParams.C36570a(ContainerType.Right).mo134958a(C35881a.m140622a().mo130264b()).mo134930b());
            return;
        }
        context.startActivity(new Intent(context, RobotActivity.class));
    }

    /* renamed from: d */
    public void mo132113d(Context context) {
        if (DesktopUtil.m144301a(context)) {
            C36512a.m144041a().mo134763a(new C35991b(), new MainWindowParams.C36570a(ContainerType.Right).mo134958a(C35358a.m138143a().mo130162g().mo130255b()).mo134930b());
            return;
        }
        Intent intent = new Intent(context, PrivacySettingActivity.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo132102a(Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("b2b_connect", true);
        if (DesktopUtil.m144301a(context)) {
            C35804a aVar = new C35804a();
            aVar.setArguments(bundle);
            C36512a.m144041a().mo134763a(aVar, new MainWindowParams.C36570a(ContainerType.Right).mo134958a(C35881a.m140622a().mo130264b()).mo134930b());
            return;
        }
        Intent intent = new Intent(context, DepartmentStructureActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo132104a(Context context, String str) {
        mo132105a(context, str, (Bundle) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m140628c(C36516a aVar, int i) {
        C36512a.m144041a().mo134760a(aVar, new PrivacyBlockListFragment(), new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b(), i);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35388c
    /* renamed from: a */
    public void mo130267a(Context context, Message message) {
        Intent intent = new Intent(context, ContactsMyGroupActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("SELECT_GROUP_MSG", message);
        context.startActivity(intent);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35388c
    /* renamed from: b */
    public void mo130271b(Context context, String str) {
        if (DesktopUtil.m144301a(context)) {
            C36512a.m144041a().mo134763a(new C35593b(), new MainWindowParams.C36570a(ContainerType.Right).mo134958a(C35881a.m140622a().mo130264b()).mo134930b());
            return;
        }
        Intent intent = new Intent(context, ContactsMyGroupActivity.class);
        if (str != null) {
            intent.putExtra("APPRECIABLE_KEY_CONTACTS_MY_GROUP", str);
            intent.putExtra("IS_FROM_CONTACT_TAB", true);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    private void m140626a(Context context, Bundle bundle, int i) {
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, CardEditActivity.class);
            intent.putExtras(bundle);
            if (context != null) {
                ((Activity) context).startActivityForResult(intent, i);
            }
        }
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35388c
    /* renamed from: a */
    public void mo130266a(Activity activity, List<SelectedData> list, int i) {
        Intent intent = new Intent(activity, SelectedConfirmActivity.class);
        intent.putExtra(C35358a.f91400a, new ArrayList(list));
        activity.startActivityForResult(intent, i);
    }

    /* renamed from: c */
    public void mo132112c(Context context, C36516a aVar, int i) {
        if (DesktopUtil.m144301a(context)) {
            UICallbackExecutor.execute(new Runnable(aVar, i) {
                /* class com.ss.android.lark.contact.impl.p1761f.$$Lambda$b$h6Fmxk4lBE6K_o3yNPWtGKsaL4A */
                public final /* synthetic */ C36516a f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C35883b.this.m140628c(this.f$1, this.f$2);
                }
            });
            return;
        }
        Intent intent = new Intent(context, PrivacyBlockListActivity.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: b */
    public void mo132111b(Context context, final C36516a aVar, final int i) {
        if (DesktopUtil.m144301a(context)) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.contact.impl.p1761f.C35883b.RunnableC358852 */

                public void run() {
                    C35883b.this.mo132108a(aVar, i);
                }
            });
            return;
        }
        Intent intent = new Intent(context, ChatPermissionActivity.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo132103a(Context context, C36516a aVar, int i) {
        if (DesktopUtil.m144301a(context)) {
            C36512a.m144041a().mo134759a(aVar, new C35991b(), new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_NORMAL_C1).mo134930b(), i);
            return;
        }
        Intent intent = new Intent(context, PrivacySettingActivity.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35388c
    /* renamed from: a */
    public void mo130268a(Context context, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("key_enter_mode", "mode_edit");
        bundle.putString("card_id", str);
        m140626a(context, bundle, i);
    }
}
