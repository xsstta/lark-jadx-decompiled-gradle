package com.bytedance.ee.bear.integrator.wiki;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.route.parcelable.AbstractC5226b;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.homepage.AbstractC8476f;
import com.bytedance.ee.bear.list.homepage.title.AbstractC8505c;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
import com.bytedance.ee.bear.wiki.homepage.C11971c;
import com.bytedance.ee.bear.wiki.homepage.WikiTitleBarWrapper;
import com.bytedance.ee.bear.wiki.homepage.p582a.C11967a;
import com.bytedance.ee.bear.wikiv2.home.C12278c;
import com.bytedance.ee.bear.wikiv2.home.C12286e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.process_statistics.C52238a;
import com.ss.android.lark.process_statistics.IProcessLauchReporter;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.integrator.wiki.a */
public class C7926a extends C7667e implements AbstractC8476f {

    /* renamed from: a */
    private ViewGroup f21319a;

    /* renamed from: b */
    private ViewGroup f21320b;

    /* renamed from: c */
    private AbstractC5226b f21321c;

    /* renamed from: d */
    private AbstractC5226b.AbstractC5227a f21322d;

    /* renamed from: e */
    private AbstractC8505c f21323e;

    /* renamed from: f */
    private ITitleController f21324f;

    /* renamed from: g */
    private Boolean f21325g;

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8476f
    public void onMenuCreateClick(View view) {
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8476f
    /* renamed from: c */
    public AbstractC8505c mo30786c() {
        return this.f21323e;
    }

    public C7926a() {
        m31673d();
    }

    /* renamed from: b */
    public void mo30785b() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f21320b;
        if (!(viewGroup2 == null || (viewGroup = this.f21319a) == null)) {
            m31672a(viewGroup2, viewGroup);
        }
        m31674e();
    }

    /* renamed from: d */
    private void m31673d() {
        C52238a aVar = new C52238a();
        aVar.mo178816a(IProcessLauchReporter.LaunchReason.PRELOAD_DOC_TAB);
        aVar.mo178815a(IProcessLauchReporter.BusinessType.DOC, System.currentTimeMillis());
    }

    /* renamed from: e */
    private void m31674e() {
        final View view = getView();
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.bytedance.ee.bear.integrator.wiki.C7926a.ViewTreeObserver$OnPreDrawListenerC79271 */

                public boolean onPreDraw() {
                    ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31520d().mo33056b("wiki");
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            });
        }
    }

    /* renamed from: a */
    public ITitleInfo mo30781a() {
        if (((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c()) {
            return C12286e.m51165a(this.f21323e);
        }
        return WikiTitleBarWrapper.m49534a(this.f21323e);
    }

    /* renamed from: a */
    public void mo30782a(AbstractC5226b.AbstractC5227a aVar) {
        this.f21322d = aVar;
    }

    /* renamed from: a */
    public void mo30783a(ITitleController iTitleController) {
        this.f21324f = iTitleController;
    }

    /* renamed from: a */
    public void mo30784a(TabType tabType) {
        if (tabType == TabType.Main) {
            C11933b.m49480a("lark_tab");
        } else if (tabType == TabType.Navigation) {
            C11933b.m49480a("lark_quick_access");
        }
        AbstractC5226b bVar = this.f21321c;
        if (bVar != null) {
            bVar.mo21073a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m31674e();
    }

    /* renamed from: a */
    private void m31672a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (getActivity() == null) {
            C13479a.m54758a("WikiMainTabFragment", "activity return null. ");
            return;
        }
        boolean c = ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c();
        Boolean bool = this.f21325g;
        if (bool == null || Boolean.compare(bool.booleanValue(), c) != 0) {
            this.f21325g = Boolean.valueOf(c);
            C13479a.m54764b("WikiMainTabFragment", "setupContent, isWikiV2: " + this.f21325g);
            if (this.f21325g.booleanValue()) {
                this.f21323e = C12286e.m51164a(this.f21324f, this.f21322d, getActivity(), viewGroup, viewGroup2);
                this.f21321c = new C12278c();
            } else {
                this.f21323e = WikiTitleBarWrapper.m49533a(this.f21324f, this.f21322d, getActivity(), this, ar.m20936a(), viewGroup, viewGroup2);
                this.f21321c = new C11971c();
            }
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.wiki_main_tab_fragment_container, (Fragment) this.f21321c);
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        C13479a.m54764b("WikiMainTabFragment", "tab equal, return. ");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13479a.m54764b("WikiMainTabFragment", "onCreateView");
        this.f21320b = viewGroup;
        ViewGroup b = C11967a.m49570a().mo45910b();
        this.f21319a = b;
        if (b == null) {
            this.f21319a = (ViewGroup) layoutInflater.inflate(R.layout.wiki_main_tab_fragment, viewGroup, false);
        }
        m31672a(viewGroup, this.f21319a);
        return this.f21319a;
    }
}
