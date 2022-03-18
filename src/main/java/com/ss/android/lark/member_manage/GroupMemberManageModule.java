package com.ss.android.lark.member_manage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.AutoCompleteTextView;
import androidx.fragment.app.Fragment;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberLauncher;
import com.ss.android.lark.member_manage.impl.add_member.C44931a;
import com.ss.android.lark.member_manage.impl.atselector.AtSelectActivity;
import com.ss.android.lark.member_manage.impl.atselector.bean.AtSelectInitData;
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import com.ss.android.lark.member_manage.impl.atselector.list.C44998c;
import com.ss.android.lark.member_manage.impl.calendar_pick_member.CalendarPickMemberActivity;
import com.ss.android.lark.member_manage.impl.calendar_pick_member.CalendarPickMemberFragment;
import com.ss.android.lark.member_manage.impl.change_owner.C45099b;
import com.ss.android.lark.member_manage.impl.change_owner.ChangeOwnerActivity;
import com.ss.android.lark.member_manage.impl.chat_admin.ChatAdminActivity;
import com.ss.android.lark.member_manage.impl.chat_admin.ChatAdminFragment;
import com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.AddChatAdminActivity;
import com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.AddChatAdminFragment;
import com.ss.android.lark.member_manage.impl.join_group.JoinGroupChatUtil;
import com.ss.android.lark.member_manage.impl.pick_member.PickWhiteListActivity;
import com.ss.android.lark.member_manage.impl.pick_member.PickWhiteListFragment;
import com.ss.android.lark.member_manage.impl.select_ding_member.C45172i;
import com.ss.android.lark.member_manage.impl.share_contact_card.C45181b;
import com.ss.android.lark.member_manage.impl.show_member.ShowGroupMemberLauncher;
import com.ss.android.lark.member_manage.impl.show_member.common_group.C45197e;
import com.ss.android.lark.member_manage.impl.show_member.common_group.PickMemberProxyFragment;
import com.ss.android.lark.member_manage.impl.show_member.common_group.ShowGroupMemberActivity;
import com.ss.android.lark.member_manage.impl.statistics.AtSelectPerceptionErrorCostTimeHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class GroupMemberManageModule {

    public interface IItemContainer {

        @Retention(RetentionPolicy.SOURCE)
        public @interface SelectMode {
        }

        /* renamed from: com.ss.android.lark.member_manage.GroupMemberManageModule$IItemContainer$a */
        public interface AbstractC44875a {
            /* renamed from: a */
            void mo158810a(BaseAtBean baseAtBean);

            /* renamed from: b */
            void mo158811b(BaseAtBean baseAtBean);

            /* renamed from: c */
            void mo158812c(BaseAtBean baseAtBean);
        }

        /* renamed from: a */
        int mo158806a();

        /* renamed from: b */
        AbstractC44875a mo158807b();

        int getItemCount();

        List<BaseAtBean> getItems();
    }

    /* renamed from: com.ss.android.lark.member_manage.GroupMemberManageModule$a */
    public interface AbstractC44876a {
    }

    /* renamed from: com.ss.android.lark.member_manage.GroupMemberManageModule$b */
    public interface AbstractC44877b {
        /* renamed from: a */
        void mo158813a(Chat chat);
    }

    /* renamed from: b */
    public String mo158802b() {
        return "key_chatter_ids";
    }

    /* renamed from: c */
    public void mo158805c() {
        C44998c.m178447b();
    }

    /* renamed from: a */
    public void mo158784a(Activity activity, C36516a<?> aVar, String str, Chat chat, boolean z, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("key_select_title", str);
        bundle.putSerializable("extra_key_chat", chat);
        bundle.putBoolean("key_multi_select_mode", z);
        C45181b.m179301a(activity, aVar, bundle, i);
    }

    /* renamed from: a */
    public void mo158792a(Activity activity, String str, boolean z, boolean z2) {
        mo158793a(activity, str, z, z2, false);
    }

    /* renamed from: a */
    public void mo158793a(Activity activity, String str, boolean z, boolean z2, boolean z3) {
        ShowGroupMemberLauncher.f114375a.mo159718a(activity, str, z, z2, z3);
    }

    /* renamed from: a */
    public void mo158799a(BaseFragment baseFragment, String str, List<String> list, int i) {
        Intent a = m177900a(baseFragment, str, list, false, i);
        if (a != null) {
            m177903a(baseFragment.getActivity(), a, i);
        }
    }

    /* renamed from: a */
    public void mo158791a(Activity activity, String str, boolean z, IGetDataCallback<List<ChatChatter>> iGetDataCallback) {
        Intent a = m177898a(activity, str, (List<String>) null, true, z);
        if (a != null) {
            m177904a(activity, a, iGetDataCallback);
        }
    }

    /* renamed from: a */
    public void mo158794a(Activity activity, List<String> list, IGetDataCallback<List<ChatChatter>> iGetDataCallback) {
        Intent a = m177899a(activity, list);
        if (a != null) {
            m177904a(activity, a, iGetDataCallback);
        }
    }

    /* renamed from: a */
    public void mo158783a(Activity activity, Chat chat, boolean z, int i, String str) {
        AddGroupMemberLauncher.f113807a.mo159062a(activity, chat, z, i, str);
    }

    /* renamed from: a */
    public void mo158800a(C36516a aVar, String str, int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("key_chat_id", str);
        bundle.putBoolean("key_is_thread", z);
        if (!DesktopUtil.m144301a(aVar.getContext())) {
            Intent intent = new Intent(aVar.getContext(), ChangeOwnerActivity.class);
            intent.putExtras(bundle);
            aVar.startActivityForResult(intent, i);
            return;
        }
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("PickWhiteListActivity").mo134930b();
        C45099b bVar = new C45099b();
        bVar.setArguments(bundle);
        C36512a.m144041a().mo134760a(aVar, bVar, a, i);
    }

    /* renamed from: a */
    public void mo158787a(Activity activity, String str, int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("key_chat_id", str);
        bundle.putBoolean("key_is_thread", z);
        Intent intent = new Intent(activity, ChangeOwnerActivity.class);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public void mo158788a(Activity activity, String str, Boolean bool, int i) {
        AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159940c();
        AtSelectInitData atSelectInitData = new AtSelectInitData(str);
        atSelectInitData.setIsInterruptAtAll(bool);
        Intent intent = new Intent(activity, AtSelectActivity.class);
        intent.putExtra("extra.init.data", atSelectInitData);
        activity.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public void mo158789a(Activity activity, String str, ArrayList<String> arrayList, int i) {
        Intent intent = new Intent(activity, CalendarPickMemberActivity.class);
        intent.putExtra("key_chat_id", str);
        intent.putExtra("key_checked_ids", arrayList);
        activity.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public void mo158801a(C36516a aVar, String str, ArrayList<String> arrayList, int i) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_chat_id", str);
        bundle.putSerializable("key_checked_ids", arrayList);
        CalendarPickMemberFragment cVar = new CalendarPickMemberFragment();
        cVar.setArguments(bundle);
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
        cVar.setFragmentParams(a);
        C36512a.m144041a().mo134760a(aVar, cVar, a, i);
    }

    /* renamed from: a */
    public void mo158795a(Context context, String str, List<String> list, int i, AbstractC44896a aVar) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str2 : list) {
            arrayList.add(new PickChatEntity(1, str2));
        }
        JoinGroupChatUtil.f113676b.mo158916a(context, str, arrayList, Integer.valueOf(i), aVar);
    }

    /* renamed from: a */
    public void mo158796a(Context context, String str, List<String> list, String str2, String str3, AbstractC44896a aVar) {
        JoinGroupChatUtil.f113676b.mo158918a(context, str, list, str2, str3, aVar);
    }

    /* renamed from: a */
    public void mo158797a(Context context, String str, List<String> list, String str2, String str3, boolean z, AbstractC44896a aVar) {
        JoinGroupChatUtil.f113676b.mo158915a(context, str, str3, list, str2, z, aVar);
    }

    /* renamed from: a */
    public void mo158782a(int i, String str, boolean z, AutoCompleteTextView autoCompleteTextView, PreferenceManager.OnActivityResultListener onActivityResultListener) {
        new C44998c(i, str, z, autoCompleteTextView, onActivityResultListener).mo159234a();
    }

    /* renamed from: a */
    public void mo158790a(Activity activity, String str, boolean z) {
        if (DesktopUtil.m144301a((Context) activity)) {
            FloatWindowParams a = new FloatWindowParams.C36567a().mo134930b();
            ChatAdminFragment aVar = new ChatAdminFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key_chat_id", str);
            bundle.putBoolean("key_support_search", false);
            bundle.putBoolean("keu.is.remove", z);
            aVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(aVar, a);
            return;
        }
        Intent intent = new Intent(activity, ChatAdminActivity.class);
        intent.putExtra("key_chat_id", str);
        intent.putExtra("key_support_search", false);
        intent.putExtra("keu.is.remove", z);
        activity.startActivityForResult(intent, 1003);
    }

    /* renamed from: a */
    public void mo158786a(Activity activity, String str, int i) {
        if (DesktopUtil.m144301a((Context) activity)) {
            FloatWindowParams a = new FloatWindowParams.C36567a().mo134930b();
            AddChatAdminFragment bVar = new AddChatAdminFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key_chat_id", str);
            bVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(bVar, a);
            return;
        }
        Intent intent = new Intent(activity, AddChatAdminActivity.class);
        intent.putExtra("key_chat_id", str);
        intent.putExtra("key_chat_admin_count", i);
        activity.startActivityForResult(intent, 1004);
    }

    /* renamed from: a */
    public void mo158798a(Context context, String str, List<String> list, boolean z, int i, AbstractC44896a aVar) {
        JoinGroupChatUtil.f113676b.mo158919a(context, str, list, z, i, aVar);
    }

    /* renamed from: a */
    public static IGroupMemberManageModuleDependency m177902a() {
        return (IGroupMemberManageModuleDependency) ClaymoreServiceLoader.loadFirst(IGroupMemberManageModuleDependency.class);
    }

    /* renamed from: a */
    public Fragment mo158781a(Bundle bundle) {
        C44931a aVar = new C44931a();
        aVar.setArguments(bundle);
        return aVar;
    }

    /* renamed from: a */
    private Intent m177899a(Activity activity, List<String> list) {
        if (activity == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (list == null) {
            list = new ArrayList<>();
        }
        if (list.isEmpty()) {
            list.add(m177902a().getChatterDependency().mo143779a().getId());
        }
        bundle.putStringArrayList("key_chatter_ids", new ArrayList<>(list));
        if (list.size() < 10) {
            bundle.putBoolean("key_support_search", false);
        }
        bundle.putBoolean("key_single_choice", true);
        bundle.putInt("key.type", 7);
        if (DesktopUtil.m144301a((Context) activity)) {
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("ShowGroupMemberActivity").mo134930b();
            C45197e eVar = new C45197e();
            eVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(eVar, a);
            return null;
        }
        Intent intent = new Intent(activity, ShowGroupMemberActivity.class);
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: b */
    private Intent m177905b(Activity activity, List<String> list) {
        if (activity == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (list == null) {
            list = new ArrayList<>();
        }
        if (list.isEmpty()) {
            list.add(m177902a().getChatterDependency().mo143779a().getId());
        }
        bundle.putStringArrayList("key_chatter_ids", new ArrayList<>(list));
        if (list.size() < 10) {
            bundle.putBoolean("key_support_search", false);
        }
        bundle.putBoolean("key_single_choice", true);
        bundle.putInt("key.type", 11);
        Intent intent = new Intent(activity, ShowGroupMemberActivity.class);
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: b */
    public void mo158803b(Activity activity, List<String> list, IGetDataCallback<List<ChatChatter>> iGetDataCallback) {
        Intent b = m177905b(activity, list);
        if (b != null) {
            m177904a(activity, b, iGetDataCallback);
        }
    }

    /* renamed from: a */
    private void m177903a(Activity activity, Intent intent, int i) {
        if (activity != null && intent != null) {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    private void m177904a(Activity activity, Intent intent, IGetDataCallback<List<ChatChatter>> iGetDataCallback) {
        PickMemberProxyFragment pickMemberProxyFragment;
        if (activity != null && intent != null && iGetDataCallback != null) {
            android.app.Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("PickMemberProxyFragment");
            if (findFragmentByTag == null || !(findFragmentByTag instanceof PickMemberProxyFragment)) {
                pickMemberProxyFragment = new PickMemberProxyFragment();
                activity.getFragmentManager().beginTransaction().add(pickMemberProxyFragment, "PickMemberProxyFragment").commitAllowingStateLoss();
                activity.getFragmentManager().executePendingTransactions();
            } else {
                pickMemberProxyFragment = (PickMemberProxyFragment) findFragmentByTag;
            }
            if (pickMemberProxyFragment != null) {
                pickMemberProxyFragment.mo159733a(iGetDataCallback, intent);
            }
        }
    }

    /* renamed from: a */
    public int mo158780a(String str, boolean z, boolean z2) {
        IGroupMemberManageModuleDependency.IChatDependency chatDependency;
        Chat b;
        if (z) {
            return 1;
        }
        if (z2 || (b = (chatDependency = m177902a().getChatDependency()).mo143763b(str)) == null) {
            return -1;
        }
        if (b.getType() == Chat.Type.GROUP || b.getType() == Chat.Type.TOPIC_GROUP || ((b.getType() == Chat.Type.P2P && !chatDependency.mo143762a(b)) || (b.getType() == Chat.Type.P2P && TextUtils.equals(m177902a().getAccountDependency().mo143795b(), b.getP2pChatterId())))) {
            return 0;
        }
        return -1;
    }

    /* renamed from: b */
    public void mo158804b(C36516a aVar, String str, ArrayList<String> arrayList, int i) {
        if (!DesktopUtil.m144301a(aVar.getContext())) {
            Intent intent = new Intent(aVar.getContext(), PickWhiteListActivity.class);
            intent.putExtra("key_chat_id", str);
            if (arrayList != null) {
                intent.putStringArrayListExtra("key_checked_ids", arrayList);
            }
            aVar.startActivityForResult(intent, i);
            return;
        }
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("PickWhiteListActivity").mo134930b();
        PickWhiteListFragment cVar = new PickWhiteListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_chat_id", str);
        if (arrayList != null) {
            bundle.putStringArrayList("key_checked_ids", arrayList);
        }
        cVar.setArguments(bundle);
        C36512a.m144041a().mo134760a(aVar, cVar, a, i);
    }

    /* renamed from: a */
    private Bundle m177901a(String str, List<String> list, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString("key_chat_id", str);
        bundle.putInt("key.type", 7);
        if (z) {
            bundle.putBoolean("key_single_choice", true);
        } else {
            bundle.putStringArrayList("key_checked_ids", new ArrayList<>(list));
        }
        if (z2) {
            bundle.putBoolean("key_filter_bot", true);
        }
        return bundle;
    }

    /* renamed from: a */
    public void mo158785a(Activity activity, C36516a aVar, String str, String str2, int i) {
        C45172i.m179275a(activity, aVar, str, str2, i);
    }

    /* renamed from: a */
    private Intent m177898a(Activity activity, String str, List<String> list, boolean z, boolean z2) {
        if (activity == null) {
            return null;
        }
        Bundle a = m177901a(str, list, z, z2);
        if (DesktopUtil.m144301a((Context) activity)) {
            FloatWindowParams a2 = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("ShowGroupMemberActivity").mo134930b();
            C45197e eVar = new C45197e();
            eVar.setArguments(a);
            C36512a.m144041a().mo134762a(eVar, a2);
            return null;
        }
        Intent intent = new Intent(activity, ShowGroupMemberActivity.class);
        intent.putExtras(a);
        return intent;
    }

    /* renamed from: a */
    private Intent m177900a(BaseFragment baseFragment, String str, List<String> list, boolean z, int i) {
        if (baseFragment == null || baseFragment.getContext() == null) {
            return null;
        }
        Bundle a = m177901a(str, list, z, false);
        if (DesktopUtil.m144301a(baseFragment.getContext())) {
            FloatWindowParams a2 = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("ShowGroupMemberActivity").mo134930b();
            C45197e eVar = new C45197e();
            eVar.setArguments(a);
            C36512a.m144041a().mo134760a(baseFragment, eVar, a2, i);
            return null;
        }
        Intent intent = new Intent(baseFragment.getContext(), ShowGroupMemberActivity.class);
        intent.putExtras(a);
        return intent;
    }
}
