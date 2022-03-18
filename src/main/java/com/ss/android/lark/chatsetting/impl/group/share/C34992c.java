package com.ss.android.lark.chatsetting.impl.group.share;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chatsetting.impl.group.share.GroupShareView;
import com.ss.android.lark.ui.AbstractC57604f;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.share.c */
public class C34992c extends BaseFragment implements AbstractC57604f {

    /* renamed from: a */
    public View f90318a;

    /* renamed from: b */
    private C35001g f90319b;

    /* renamed from: c */
    private GroupShareView.AbstractC34987b f90320c = new GroupShareView.AbstractC34987b() {
        /* class com.ss.android.lark.chatsetting.impl.group.share.C34992c.C349931 */

        @Override // com.ss.android.lark.chatsetting.impl.group.share.GroupShareView.AbstractC34987b
        /* renamed from: a */
        public FragmentManager mo128959a() {
            return C34992c.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.share.GroupShareView.AbstractC34987b
        /* renamed from: b */
        public void mo128961b() {
            C34992c.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.share.GroupShareView.AbstractC34987b
        /* renamed from: a */
        public void mo128960a(GroupShareView groupShareView) {
            ButterKnife.bind(groupShareView, C34992c.this.f90318a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C35001g gVar = this.f90319b;
        if (gVar != null) {
            gVar.destroy();
            this.f90319b = null;
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private void m136255a() {
        C35001g gVar = new C35001g(new C35000f(getArguments()), new GroupShareView(this.mContext, this.f90320c));
        this.f90319b = gVar;
        gVar.create();
    }

    /* renamed from: a */
    public static C34992c m136254a(Bundle bundle) {
        C34992c cVar = new C34992c();
        cVar.setArguments(bundle);
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m136255a();
    }

    @Override // com.ss.android.lark.ui.AbstractC57604f
    /* renamed from: a */
    public void mo128968a(String str, Bundle bundle) {
        if (this.f90319b != null) {
            this.f90319b.getView().mo128957b(bundle.getString("actionName"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C35001g gVar = this.f90319b;
        if (gVar != null) {
            gVar.mo128999a(i, i2, intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_group_share_layout, viewGroup, false);
        this.f90318a = inflate;
        return inflate;
    }
}
