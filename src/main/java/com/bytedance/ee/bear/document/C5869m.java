package com.bytedance.ee.bear.document;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.document.C5632ag;
import com.bytedance.ee.bear.document.p302c.C5682a;
import com.bytedance.ee.bear.document.p302c.C5683b;
import com.bytedance.ee.bear.document.p302c.C5685c;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.log.C13479a;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.m */
public class C5869m extends aj {
    @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
    /* renamed from: b */
    public AbstractC4948i mo19326b() {
        return (AbstractC4948i) KoinJavaComponent.m268610a(AbstractC4948i.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.browser.AbstractC4932j
    /* renamed from: c */
    public TitleBar mo19443c() {
        C5632ag agVar = new C5632ag(new C5632ag.AbstractC5638a() {
            /* class com.bytedance.ee.bear.document.C5869m.C58701 */

            /* renamed from: a */
            static final /* synthetic */ boolean f16431a = true;

            @Override // com.bytedance.ee.bear.document.C5632ag.AbstractC5638a
            /* renamed from: c */
            public LifecycleOwner mo22578c() {
                return C5869m.this;
            }

            @Override // com.bytedance.ee.bear.document.C5632ag.AbstractC5638a
            /* renamed from: a */
            public View mo22576a() {
                return C5869m.this.getView();
            }

            @Override // com.bytedance.ee.bear.document.C5632ag.AbstractC5638a
            /* renamed from: d */
            public FragmentActivity mo22579d() {
                return C5869m.this.getActivity();
            }

            @Override // com.bytedance.ee.bear.document.C5632ag.AbstractC5638a
            /* renamed from: b */
            public AppBarLayout mo22577b() {
                View view = C5869m.this.getView();
                if (f16431a || view != null) {
                    return (AppBarLayout) view.findViewById(R.id.doc_appbar_layout);
                }
                throw new AssertionError();
            }
        }, mo22586k());
        agVar.mo19516b(R.color.facade_selector_icon_n1);
        return agVar;
    }

    /* renamed from: a */
    private static C5682a m23600a(String str) {
        return C5685c.m23051a(str);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
    /* renamed from: a */
    public <T> T mo19325a(Class<T> cls) {
        return (T) ar.m20936a().mo41506a(cls);
    }

    /* renamed from: b */
    private static C5869m m23604b(String str) throws RuntimeException {
        try {
            return (C5869m) m23600a(str).mo22707a().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static C5869m m23601a(BearUrl bearUrl, Bundle bundle) {
        String str = bearUrl.f17450e;
        if (bearUrl == null || bearUrl.f17450e == null) {
            C13479a.m54775e("DocumentFragment", "newInstance URL empty");
            str = "";
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("url", str);
        bundle.putParcelable("bear_url", bearUrl);
        C5869m b = m23604b(bearUrl.f17446a);
        b.setArguments(bundle);
        return b;
    }

    /* renamed from: a */
    public static C5869m m23602a(String str, Bundle bundle) {
        if (str == null) {
            C13479a.m54775e("DocumentFragment", "newInstance URL empty");
            str = "";
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        return m23601a(C6313i.m25327a().mo25399g(C6313i.m25327a().mo25398f(str)), bundle);
    }

    /* renamed from: a */
    public static C5869m m23603a(String str, String str2, Bundle bundle) {
        if (str2 == null) {
            C13479a.m54775e("DocumentFragment", "newInstance URL empty");
            str2 = "";
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("url", str2);
        C5869m b = m23604b(str);
        b.setArguments(bundle);
        return b;
    }

    @Override // com.bytedance.ee.bear.document.aj, androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        String documentType = mo22586k().getDocumentType();
        View a = C5683b.m23041a(getContext(), documentType);
        StringBuilder sb = new StringBuilder();
        sb.append("onCreateView:type:");
        sb.append(documentType);
        sb.append(",hasCache? ");
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b("DocumentFragment", sb.toString());
        if (a != null) {
            return a;
        }
        return C5685c.m23050a(getContext(), viewGroup, m23600a(documentType));
    }
}
