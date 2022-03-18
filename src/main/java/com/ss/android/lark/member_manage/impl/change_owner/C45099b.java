package com.ss.android.lark.member_manage.impl.change_owner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.member_manage.impl.base.mvp.C45081c;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.change_owner.C45110f;

/* renamed from: com.ss.android.lark.member_manage.impl.change_owner.b */
public class C45099b extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    private C45105e f114205a;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C45105e eVar = this.f114205a;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.change_owner.b$a */
    private class C45100a extends C45081c implements C45110f.AbstractC45113a {
        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159423a() {
            C45099b.this.setResult(0, new Intent());
            C45099b.this.finish();
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159429a(IGroupMemberBaseContract.AbstractC45066b bVar) {
            ButterKnife.bind(bVar, C45099b.this.getView());
        }

        @Override // com.ss.android.lark.member_manage.impl.change_owner.C45110f.AbstractC45113a
        /* renamed from: b */
        public void mo159582b(Chatter chatter) {
            Intent intent = new Intent();
            intent.putExtra("key_group_new_owner", chatter);
            C45099b.this.setResult(-1, intent);
            C45099b.this.finish();
        }

        public C45100a(Activity activity) {
            super(activity);
        }
    }

    /* renamed from: a */
    private boolean m178987a(Bundle bundle) {
        if (bundle != null && !TextUtils.isEmpty(bundle.getString("key_chat_id"))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (!m178987a(arguments)) {
            finish();
            return;
        }
        C45105e eVar = new C45105e(getActivity(), arguments, new C45100a(getActivity()));
        this.f114205a = eVar;
        eVar.create();
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
        return layoutInflater.inflate(R.layout.activity_show_group_member, viewGroup, false);
    }
}
