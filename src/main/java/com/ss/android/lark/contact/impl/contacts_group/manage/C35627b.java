package com.ss.android.lark.contact.impl.contacts_group.manage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.contact.impl.contacts_group.AbstractC35602f;
import com.ss.android.lark.contact.impl.contacts_group.manage.MyManageGroupView;
import com.ss.android.lark.monitor.p2372a.C48211b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_group.manage.b */
public class C35627b extends BaseFragment {

    /* renamed from: a */
    private C35630d f92124a;

    /* renamed from: b */
    private MyManageGroupView.AbstractC35622a f92125b = new MyManageGroupView.AbstractC35622a() {
        /* class com.ss.android.lark.contact.impl.contacts_group.manage.$$Lambda$b$2BkwVFVMq3GZDVNrK7UfVMFptg */

        @Override // com.ss.android.lark.contact.impl.contacts_group.manage.MyManageGroupView.AbstractC35622a
        public final void injectView(MyManageGroupView myManageGroupView) {
            C35627b.this.m139450a((C35627b) myManageGroupView);
        }
    };

    /* renamed from: c */
    private boolean f92126c = false;

    /* renamed from: d */
    private List<String> f92127d = new ArrayList();

    /* renamed from: e */
    private AbstractC35602f f92128e = null;

    /* renamed from: f */
    private PickType f92129f;

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f92124a.destroy();
    }

    /* renamed from: a */
    private void m139449a() {
        C35630d dVar = new C35630d(new C35628c(), new MyManageGroupView(this.f92125b, this.f92126c, this.f92127d, this.f92128e, this.f92129f));
        this.f92124a = dVar;
        dVar.create();
    }

    /* renamed from: a */
    public void mo131310a(AbstractC35602f fVar) {
        this.f92128e = fVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m139450a(MyManageGroupView myManageGroupView) {
        ButterKnife.bind(myManageGroupView, getView());
    }

    /* renamed from: b */
    public void mo131313b(List<String> list) {
        this.f92124a.mo131321b(list);
    }

    /* renamed from: a */
    public void mo131309a(PickType pickType) {
        this.f92129f = pickType;
        this.f92124a.mo131319a(pickType);
    }

    /* renamed from: a */
    public void mo131311a(List<String> list) {
        this.f92124a.mo131320a(list);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m139449a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C48211b.m190251a().mo168689b("MyManageGroup");
        View inflate = layoutInflater.inflate(R.layout.fragment_contacts_my_manage_group, viewGroup, false);
        C48211b.m190251a().mo168691c("MyManageGroup");
        return inflate;
    }

    /* renamed from: a */
    public void mo131312a(boolean z, List<String> list, PickType pickType) {
        this.f92126c = z;
        this.f92129f = pickType;
        this.f92127d.clear();
        this.f92127d.addAll(list);
    }
}
