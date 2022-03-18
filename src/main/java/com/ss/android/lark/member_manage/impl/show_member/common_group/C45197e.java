package com.ss.android.lark.member_manage.impl.show_member.common_group;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.member_manage.impl.base.mvp.C45081c;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.e */
public class C45197e extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    private C45225j f114390a;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C45225j jVar = this.f114390a;
        if (jVar != null) {
            jVar.destroy();
        }
    }

    /* renamed from: a */
    private boolean m179389a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("key_chat_id");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("key_chatter_ids");
        if (!TextUtils.isEmpty(string) || !CollectionUtils.isEmpty(stringArrayList)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (!m179389a(arguments)) {
            finish();
            return;
        }
        C45225j jVar = new C45225j(getActivity(), arguments, new C45081c(getActivity()) {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45197e.C451981 */

            @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
            /* renamed from: a */
            public void mo159423a() {
                C45197e.this.finish();
            }

            @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
            /* renamed from: a */
            public void mo159429a(IGroupMemberBaseContract.AbstractC45066b bVar) {
                ButterKnife.bind(bVar, C45197e.this.getView());
            }

            @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
            /* renamed from: a */
            public void mo159431a(List<ChatChatter> list) {
                Intent intent = new Intent();
                intent.putExtra("result_key_checked_chatters", (Serializable) list);
                C45197e.this.setResult(-1, intent);
                C45197e.this.finish();
            }
        });
        this.f114390a = jVar;
        jVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_show_group_member, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        C45225j jVar;
        super.onActivityResult(i, i2, intent);
        if ((i == 10006 || i == 10007) && (jVar = this.f114390a) != null && i2 == -1) {
            jVar.mo159806b();
        }
        if (i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }
}
