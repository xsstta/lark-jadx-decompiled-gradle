package com.ss.android.lark.ding.service.impl.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.ding.service.impl.controller.DingView;
import java.util.List;

/* renamed from: com.ss.android.lark.ding.service.impl.controller.c */
public class C36720c extends BaseFragment {

    /* renamed from: a */
    public View f94395a;

    /* renamed from: b */
    public DingView.AbstractC36705a f94396b = new DingView.AbstractC36705a() {
        /* class com.ss.android.lark.ding.service.impl.controller.C36720c.C367211 */

        @Override // com.ss.android.lark.ding.service.impl.controller.DingView.AbstractC36705a
        /* renamed from: a */
        public void mo135353a() {
            C36720c.this.finish();
        }

        @Override // com.ss.android.lark.ding.service.impl.controller.DingView.AbstractC36705a
        /* renamed from: a */
        public void mo135355a(DingView dingView) {
            ButterKnife.bind(dingView, C36720c.this.f94395a);
        }

        @Override // com.ss.android.lark.ding.service.impl.controller.DingView.AbstractC36705a
        /* renamed from: a */
        public void mo135354a(Message message, DingStatus dingStatus) {
            Intent intent = new Intent();
            intent.putExtra("extra.ding.message", message);
            intent.putExtra("extra.ding.status", dingStatus);
            C36720c.this.setResult(-1, intent);
            C36720c.this.finish();
        }

        @Override // com.ss.android.lark.ding.service.impl.controller.DingView.AbstractC36705a
        /* renamed from: a */
        public void mo135356a(List<Contact> list, int i) {
            C36723d.m144891a(C36720c.this.mContext, list, new IDingModuleDependency.AbstractC36626d.AbstractC36627a() {
                /* class com.ss.android.lark.ding.service.impl.controller.C36720c.C367211.C367221 */

                @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36626d.AbstractC36627a
                /* renamed from: a */
                public void mo135146a() {
                }

                @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36626d.AbstractC36627a
                /* renamed from: b */
                public void mo135148b() {
                }

                @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36626d.AbstractC36627a
                /* renamed from: a */
                public void mo135147a(boolean z, String str) {
                    C36720c.this.f94396b.mo135353a();
                }
            }, i, C36720c.this);
        }
    };

    /* renamed from: c */
    private C36731g f94397c;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C36731g gVar = this.f94397c;
        if (gVar != null) {
            gVar.destroy();
        }
        super.onDestroyView();
    }

    /* renamed from: a */
    private void m144883a() {
        Bundle arguments = getArguments();
        Message message = (Message) arguments.getSerializable("extra.ding.message");
        List list = (List) arguments.getSerializable("extra.ding.chatter.ids");
        boolean z = arguments.getBoolean("extra.ding.isP2p", false);
        if (message == null || CollectionUtils.isEmpty(list)) {
            finish();
            return;
        }
        C36731g gVar = new C36731g(getContext(), this.f94396b, message, list, z);
        this.f94397c = gVar;
        gVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m144883a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C36731g gVar = this.f94397c;
        if (gVar != null) {
            gVar.mo135406a(i, i2, intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_ding, viewGroup, false);
        this.f94395a = inflate;
        return inflate;
    }
}
