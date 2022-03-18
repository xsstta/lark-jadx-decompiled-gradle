package com.ss.android.lark.chatsetting.impl.group.ownership.v1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.C34456a;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListActivity;
import com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListFragment;
import com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableActivity;
import com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveFragment;
import com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveHistoryActivity;
import com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryActivity;
import com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryFragment;
import com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34832a;
import com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView;
import com.ss.android.lark.chatsetting.impl.post.PostTypeSettingActivity;
import com.ss.android.lark.chatsetting.impl.post.PostTypeSettingFragment;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.b */
public class C34834b extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    AbstractC34461c.AbstractC34466e f89983a = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: b */
    private C34844d f89984b;

    /* renamed from: c */
    private GroupOwnershipView.AbstractC34831c f89985c = new GroupOwnershipView.AbstractC34831c() {
        /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34834b.C348351 */

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34831c
        /* renamed from: a */
        public void mo128567a(GroupOwnershipView groupOwnershipView) {
            ButterKnife.bind(groupOwnershipView, C34834b.this.getView());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34831c
        /* renamed from: b */
        public void mo128571b(Chat chat) {
            C34456a.m133684b(C34834b.this.getActivity(), chat);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34831c
        /* renamed from: a */
        public void mo128566a(Chat chat) {
            ChatSettingModule.m133639a().mo127281k().mo127406a(C34834b.this, chat.getId(), 1002, chat.isThread());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34831c
        /* renamed from: b */
        public void mo128572b(String str) {
            int i;
            Intent intent = new Intent();
            intent.putExtra("owner_id", str);
            C34834b bVar = C34834b.this;
            if (str != null) {
                i = -1;
            } else {
                i = 0;
            }
            bVar.setResult(i, intent);
            C34834b.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34831c
        /* renamed from: c */
        public void mo128574c(String str) {
            C34834b.this.f89983a.mo127318a(C34834b.this.getContext(), str);
            C34834b.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34831c
        /* renamed from: d */
        public void mo128576d(String str) {
            ChatSettingModule.m133639a().mo127281k().mo127403a((Activity) C34834b.this.requireActivity(), str, false);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34831c
        /* renamed from: a */
        public void mo128568a(final String str) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34834b.C348351.RunnableC348361 */

                public void run() {
                    if (str != null) {
                        LKUIToast.show(C34834b.this.getContext(), str);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34831c
        /* renamed from: d */
        public void mo128577d(String str, boolean z) {
            Intent intent = new Intent(C34834b.this.getActivity(), GroupSearchEnableActivity.class);
            intent.putExtra("chat_id", str);
            intent.putExtra("is_thread", z);
            C34834b.this.startActivity(intent);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34831c
        /* renamed from: b */
        public void mo128573b(String str, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putString("key_params_chat_id", str);
            bundle.putBoolean("key_params_is_thread", z);
            if (DesktopUtil.m144301a((Context) C34834b.this.getActivity())) {
                FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
                SharingHistoryFragment gVar = new SharingHistoryFragment();
                gVar.setArguments(bundle);
                C36512a.m144041a().mo134762a(gVar, a);
                return;
            }
            Intent intent = new Intent(C34834b.this.getActivity(), SharingHistoryActivity.class);
            intent.putExtras(bundle);
            C34834b.this.startActivity(intent);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34831c
        /* renamed from: c */
        public void mo128575c(String str, boolean z) {
            if (DesktopUtil.m144301a((Context) C34834b.this.getActivity())) {
                JoinLeaveFragment cVar = new JoinLeaveFragment();
                Bundle bundle = new Bundle();
                bundle.putString("param_chat_id", str);
                bundle.putBoolean("param_is_thread", z);
                cVar.setArguments(bundle);
                FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
                cVar.setFragmentParams(a);
                C36512a.m144041a().mo134762a(cVar, a);
                return;
            }
            Intent intent = new Intent(C34834b.this.getActivity(), JoinLeaveHistoryActivity.class);
            intent.putExtra("param_chat_id", str);
            intent.putExtra("param_is_thread", z);
            C34834b.this.startActivity(intent);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34831c
        /* renamed from: a */
        public void mo128570a(String str, boolean z) {
            if (!DesktopUtil.m144301a((Context) C34834b.this.getActivity())) {
                Intent intent = new Intent(C34834b.this.getActivity(), ApplicantListActivity.class);
                intent.putExtra("key_params_chat_id", str);
                intent.putExtra("key_params_is_thread", z);
                C34834b.this.startActivity(intent);
                return;
            }
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("ApplicantListActivity").mo134930b();
            ApplicantListFragment cVar = new ApplicantListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key_params_chat_id", str);
            bundle.putBoolean("key_params_is_thread", z);
            cVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(cVar, a);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34831c
        /* renamed from: a */
        public void mo128569a(String str, String str2, Chat.PostType postType, boolean z) {
            if (!DesktopUtil.m144301a((Context) C34834b.this.getActivity())) {
                Intent intent = new Intent(C34834b.this.getActivity(), PostTypeSettingActivity.class);
                intent.putExtra("extra_chat_id", str);
                intent.putExtra("extra_owner_id", str2);
                intent.putExtra("extra_post_type", postType);
                intent.putExtra("extra_is_thread_chat", z);
                C34834b.this.startActivity(intent);
                return;
            }
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("PostTypeSettingActivity").mo134930b();
            PostTypeSettingFragment bVar = new PostTypeSettingFragment();
            Bundle bundle = new Bundle();
            bundle.putString("extra_chat_id", str);
            bundle.putString("extra_owner_id", str2);
            bundle.putSerializable("extra_post_type", postType);
            bundle.putBoolean("extra_is_thread_chat", z);
            bVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(bVar, a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C34844d dVar = this.f89984b;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private void m135472a() {
        if (getArguments() == null) {
            Log.m165383e("GroupOwnershipFragment", "startGroupshipFragment failed， argument is null");
            finish();
            return;
        }
        Chat chat = (Chat) getArguments().getSerializable("key_group_management_chat");
        C34844d dVar = new C34844d(new C34838c(new C34832a.AbstractC34833a() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34834b.C348372 */
        }), new GroupOwnershipView(this.f89985c, chat));
        this.f89984b = dVar;
        dVar.create();
        this.f89984b.mo128609a(chat);
        this.f89984b.mo128611a(getArguments().getBoolean("key_group_management_need_scroll_bottom", false));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m135472a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_group_management_new, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Chat chat;
        if (i == 1002 && i2 == -1) {
            this.f89984b.mo128610a((Chatter) intent.getSerializableExtra("key_group_new_owner"));
        } else if ((i == 1003 || i == 1004) && i2 == -1 && (chat = (Chat) getArguments().getSerializable("key_group_management_chat")) != null) {
            this.f89984b.mo128612b(chat);
        }
    }
}
