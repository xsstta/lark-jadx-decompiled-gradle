package com.ss.android.lark.chatsetting.impl.group.info.edit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.edit.e */
public class C34652e extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    public Context f89433a;

    /* renamed from: b */
    private C34640c f89434b;

    /* renamed from: c */
    private GroupInfoEditView.AbstractC34632a f89435c = new GroupInfoEditView.AbstractC34632a() {
        /* class com.ss.android.lark.chatsetting.impl.group.info.edit.C34652e.C346531 */

        @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView.AbstractC34632a
        /* renamed from: a */
        public void mo127925a() {
            C34652e.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView.AbstractC34632a
        /* renamed from: a */
        public void mo127926a(int i) {
            C34652e.this.getActivity().getWindow().setSoftInputMode(i);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView.AbstractC34632a
        /* renamed from: a */
        public void mo127927a(Intent intent) {
            C34652e.this.setResult(1, intent);
            C34652e.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView.AbstractC34632a
        /* renamed from: a */
        public void mo127928a(GroupInfoEditView groupInfoEditView) {
            ButterKnife.bind(groupInfoEditView, C34652e.this.getView());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView.AbstractC34632a
        /* renamed from: a */
        public void mo127929a(String str) {
            LKUIToast.show(C34652e.this.f89433a, str);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C34640c cVar = this.f89434b;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private boolean m134628a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("chatID") || !bundle.containsKey("edit_info_type")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!m134628a(getArguments())) {
            Log.m165382e("Open group info edit failed");
            finish();
            return;
        }
        this.f89433a = getContext();
        m134627a(getArguments().getString("chatID"), getArguments().getInt("edit_info_type", 0), getArguments().getString("nickname"));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_group_info_edit, viewGroup, false);
    }

    /* renamed from: a */
    private void m134627a(String str, int i, String str2) {
        C34640c cVar = new C34640c(this.f89435c, this.f89433a, str, i, str2);
        this.f89434b = cVar;
        cVar.create();
    }
}
