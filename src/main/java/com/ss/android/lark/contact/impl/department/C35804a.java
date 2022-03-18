package com.ss.android.lark.contact.impl.department;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.department.DepartmentStructureView;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.contact.impl.department.a */
public class C35804a extends BaseFragment {

    /* renamed from: a */
    public View f92571a;

    /* renamed from: b */
    private C35806b f92572b;

    /* renamed from: c */
    private DepartmentStructureView.AbstractC35803a f92573c = new DepartmentStructureView.AbstractC35803a() {
        /* class com.ss.android.lark.contact.impl.department.C35804a.C358051 */

        @Override // com.ss.android.lark.contact.impl.department.DepartmentStructureView.AbstractC35803a
        /* renamed from: a */
        public void mo131731a() {
            C35804a.this.finish();
        }

        @Override // com.ss.android.lark.contact.impl.department.DepartmentStructureView.AbstractC35803a
        /* renamed from: a */
        public void mo131733a(Bitmap bitmap) {
            al.m95028a().mo93366a("key_department_search_title", bitmap);
            C35358a.m138143a().mo130166k().mo130253b(C35804a.this.mContext, "key_department_search_title", UIHelper.dp2px(54.0f));
        }

        @Override // com.ss.android.lark.contact.impl.department.DepartmentStructureView.AbstractC35803a
        /* renamed from: a */
        public void mo131734a(Chatter chatter) {
            C35358a.m138143a().mo130154c(C35804a.this.getActivity(), chatter);
        }

        @Override // com.ss.android.lark.contact.impl.department.DepartmentStructureView.AbstractC35803a
        /* renamed from: a */
        public void mo131735a(DepartmentStructureView departmentStructureView) {
            ButterKnife.bind(departmentStructureView, C35804a.this.f92571a);
        }

        @Override // com.ss.android.lark.contact.impl.department.DepartmentStructureView.AbstractC35803a
        /* renamed from: a */
        public void mo131732a(Context context, String str, String str2, int i) {
            C35358a.m138143a().mo130158e().mo130218b(context, str);
        }
    };

    /* renamed from: a */
    public void mo131736a() {
        this.f92572b.mo131737a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f92572b.destroy();
        super.onDestroy();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.f92572b.mo131738a(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    private void m140133a(Bundle bundle, Bundle bundle2) {
        C35806b bVar = new C35806b(getActivity(), this.f92573c, bundle, bundle2);
        this.f92572b = bVar;
        bVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f92571a = layoutInflater.inflate(R.layout.department_struct_activity, viewGroup, false);
        m140133a(getArguments(), bundle);
        ContactHitPoint.m140783a();
        ContactHitPoint.m140816q();
        return this.f92571a;
    }
}
