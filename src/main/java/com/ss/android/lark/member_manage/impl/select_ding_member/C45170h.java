package com.ss.android.lark.member_manage.impl.select_ding_member;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.base.mvp.C45081c;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.select_ding_member.C45160c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.h */
public class C45170h extends BaseFragment {

    /* renamed from: a */
    public View f114354a;

    /* renamed from: b */
    private C45173j f114355b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.h$a */
    public class C45171a extends C45081c implements C45160c.AbstractC45162a {
        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159423a() {
            C45170h.this.finish();
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159429a(IGroupMemberBaseContract.AbstractC45066b bVar) {
            ButterKnife.bind(bVar, C45170h.this.f114354a);
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159431a(List<ChatChatter> list) {
            Intent intent = new Intent();
            intent.putExtra("result_key_checked_chatters", (Serializable) list);
            C45170h.this.setResult(-1, intent);
            C45170h.this.finish();
        }

        public C45171a(Activity activity) {
            super(activity);
        }

        @Override // com.ss.android.lark.member_manage.impl.select_ding_member.C45160c.AbstractC45162a
        /* renamed from: a */
        public void mo159700a(List<String> list, Message message) {
            GroupMemberManageModule.m177902a().openSendDingActivity(C45170h.this.getContext(), C45170h.this, message, list, 6);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C45173j jVar = this.f114355b;
        if (jVar != null) {
            jVar.destroy();
        }
        super.onDestroyView();
    }

    /* renamed from: a */
    private void m179269a() {
        Bundle arguments = getArguments();
        if (!m179270a(arguments)) {
            finish();
            return;
        }
        C45173j jVar = new C45173j(getActivity(), arguments, new C45171a(getActivity()));
        this.f114355b = jVar;
        jVar.create();
    }

    /* renamed from: a */
    private boolean m179270a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("key_chat_id");
        String string2 = bundle.getString("key_message_id");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m179269a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_show_group_member, viewGroup, false);
        this.f114354a = inflate;
        return inflate;
    }
}
