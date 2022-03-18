package com.ss.android.lark.chatsetting.impl.group.info;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.C34456a;
import com.ss.android.lark.chatsetting.impl.group.info.GroupInfoView;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.d */
public class C34624d extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    public Context f89388a;

    /* renamed from: b */
    private C34614b f89389b;

    /* renamed from: c */
    private GroupInfoView.AbstractC34610a f89390c = new GroupInfoView.AbstractC34610a() {
        /* class com.ss.android.lark.chatsetting.impl.group.info.C34624d.C346251 */

        @Override // com.ss.android.lark.chatsetting.impl.group.info.GroupInfoView.AbstractC34610a
        /* renamed from: a */
        public void mo127874a() {
            C34624d.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.GroupInfoView.AbstractC34610a
        /* renamed from: a */
        public void mo127875a(Chat chat) {
            C34456a.m133679a(C34624d.this.f89388a, chat);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.GroupInfoView.AbstractC34610a
        /* renamed from: a */
        public void mo127876a(GroupInfoView groupInfoView) {
            ButterKnife.bind(groupInfoView, C34624d.this.getView());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.GroupInfoView.AbstractC34610a
        /* renamed from: a */
        public void mo127877a(String str) {
            LKUIToast.show(C34624d.this.f89388a, str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.GroupInfoView.AbstractC34610a
        /* renamed from: a */
        public void mo127878a(String str, int i) {
            C34456a.m133677a(C34624d.this.getActivity(), C34624d.this, str, i, (String) null);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C34614b bVar = this.f89389b;
        if (bVar != null) {
            bVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private boolean m134536a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("curr_chat")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!m134536a(getArguments())) {
            Log.m165382e("Open group info failed");
            finish();
            return;
        }
        this.f89388a = getContext();
        m134535a((Chat) getArguments().get("curr_chat"), getArguments().getBoolean("group_is_default_chat", false));
    }

    /* renamed from: a */
    private void m134535a(Chat chat, boolean z) {
        C34614b bVar = new C34614b(this.f89390c, this.f89388a, chat, z, this);
        this.f89389b = bVar;
        bVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10002 && i2 == 1) {
            this.f89389b.mo127900a(intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_group_info, viewGroup, false);
    }
}
