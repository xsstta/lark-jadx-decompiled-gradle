package com.ss.android.lark.contact.impl.contacts_home;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29563j;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView;
import com.ss.android.lark.contact.impl.p1761f.C35883b;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.impl.contacts_home.a */
public class C35660a extends BaseFragment {

    /* renamed from: a */
    protected View f92234a;

    /* renamed from: b */
    C35667c f92235b;

    /* renamed from: c */
    Bundle f92236c;

    /* renamed from: d */
    ContactsHomeView.AbstractC35659a f92237d = new ContactsHomeView.AbstractC35659a() {
        /* class com.ss.android.lark.contact.impl.contacts_home.C35660a.C356611 */

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: b */
        public void mo131392b() {
            C35883b.m140625a().mo130273e(C35660a.this.getActivity());
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: c */
        public void mo131393c() {
            C35883b.m140625a().mo132114f(C35660a.this.getActivity());
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: d */
        public void mo131394d() {
            C35883b.m140625a().mo132109b((Activity) C35660a.this.requireActivity());
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: e */
        public void mo131395e() {
            C35883b.m140625a().mo132110b((Context) C35660a.this.getActivity());
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: g */
        public void mo131397g() {
            C35883b.m140625a().mo132101a((Activity) C35660a.this.getActivity());
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: h */
        public void mo131398h() {
            C35883b.m140625a().mo132102a((Context) C35660a.this.getActivity());
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: a */
        public void mo131386a() {
            C35358a.m138143a().mo130145a(C35660a.this.getActivity(), AppreciableKit.m107394b().mo103510a(Biz.Messenger, Scene.Contact, Event.show_oncall_contacts, "ContactsHomeFragment", true, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null));
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: f */
        public void mo131396f() {
            C35883b.m140625a().mo130271b(C35660a.this.getActivity(), AppreciableKit.m107394b().mo103510a(Biz.Messenger, Scene.Contact, Event.show_my_group, "ContactsHomeFragment", true, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null));
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: a */
        public void mo131389a(ContactsHomeView contactsHomeView) {
            ButterKnife.bind(contactsHomeView, C35660a.this.f92234a);
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: a */
        public void mo131388a(Chatter chatter) {
            C35358a.m138143a().mo130144a(C35660a.this.getContext(), chatter);
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: a */
        public void mo131387a(Bitmap bitmap) {
            al.m95028a().mo93366a("key_contact_search_title", bitmap);
            C35358a.m138143a().mo130166k().mo130251a(C35660a.this.mContext, "key_contact_search_title", UIHelper.getDimens(R.dimen.feed_title_height));
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: a */
        public void mo131390a(String str) {
            C35883b.m140625a().mo132104a(C35660a.this.getActivity(), str);
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AbstractC35659a
        /* renamed from: a */
        public void mo131391a(String str, String str2) {
            C35883b.m140625a().mo132106a(C35660a.this.getActivity(), str, str2);
        }
    };

    /* renamed from: e */
    private ITitleController f92238e;

    /* renamed from: f */
    private boolean f92239f;

    /* renamed from: g */
    private boolean f92240g;

    /* renamed from: h */
    private boolean f92241h;

    /* renamed from: i */
    private boolean f92242i;

    /* renamed from: j */
    private boolean f92243j;

    /* renamed from: k */
    private String f92244k;

    /* renamed from: l */
    private AbstractC29563j.AbstractC29564a f92245l;

    /* renamed from: m */
    private List<String> f92246m = new ArrayList();

    /* renamed from: n */
    private List<String> f92247n = new ArrayList();

    /* renamed from: b */
    public void mo131403b() {
        C35667c cVar = this.f92235b;
        if (cVar != null) {
            cVar.mo131422c();
        }
    }

    /* renamed from: c */
    public ITitleInfo mo131404c() {
        C35667c cVar = this.f92235b;
        if (cVar == null) {
            return null;
        }
        return cVar.mo131426e();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C35667c cVar = this.f92235b;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroyView();
    }

    public C35660a() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        mo131399a();
        boolean b = C35358a.m138143a().mo130163h().mo130230b();
        if (this.f92239f != b) {
            this.f92239f = b;
            mo131403b();
        }
    }

    /* renamed from: d */
    private void m139586d() {
        if (this.f92238e == null) {
            C53241h.m205898b("ContactsHomeFragment", "use default title controller");
            this.f92238e = new C35679e();
        }
        C35667c cVar = new C35667c(new C35662b(this.f92244k), new ContactsHomeView(this.f92237d, getActivity(), this, this.f92240g, this.f92241h, this.f92242i, this.f92238e), this.f92243j, this.f92247n);
        this.f92235b = cVar;
        cVar.create();
        this.f92235b.mo131418a(this.f92245l);
        this.f92235b.mo131423c(this.f92246m);
        this.f92235b.mo131425d(this.f92247n);
        this.f92235b.mo131424d();
    }

    /* renamed from: a */
    public void mo131399a() {
        C35667c cVar = this.f92235b;
        if (cVar != null) {
            cVar.mo131424d();
        }
    }

    /* renamed from: a */
    public void mo131400a(AbstractC29563j.AbstractC29564a aVar) {
        this.f92245l = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    public C35660a(ITitleController iTitleController) {
        this.f92238e = iTitleController;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        String str;
        this.f92239f = C35358a.m138143a().mo130163h().mo130230b();
        this.f92236c = bundle;
        super.onCreate(bundle);
        this.mContext = getContext();
        boolean z3 = false;
        if (getArguments() == null) {
            z = false;
        } else {
            z = getArguments().getBoolean("key_hide_header", false);
        }
        this.f92240g = z;
        if (getArguments() == null) {
            z2 = false;
        } else {
            z2 = getArguments().getBoolean("key_show_select", false);
        }
        this.f92241h = z2;
        boolean z4 = true;
        if (getArguments() != null) {
            z4 = getArguments().getBoolean("key_is_multi_select", true);
        }
        this.f92242i = z4;
        if (getArguments() != null) {
            z3 = getArguments().getBoolean("key_hide_contacts", false);
        }
        this.f92243j = z3;
        if (getArguments() == null) {
            str = null;
        } else {
            str = getArguments().getString("key_chat_id");
        }
        this.f92244k = str;
        if (getArguments() == null || !CollectionUtils.isNotEmpty(getArguments().getStringArrayList("key_selected_ids"))) {
            this.f92247n = new ArrayList();
        } else {
            this.f92247n = getArguments().getStringArrayList("key_selected_ids");
        }
    }

    /* renamed from: a */
    public void mo131401a(List<String> list) {
        this.f92247n.addAll(list);
        C35667c cVar = this.f92235b;
        if (cVar != null) {
            cVar.mo131425d(list);
        }
    }

    /* renamed from: a */
    public void mo131402a(boolean z) {
        C35667c cVar = this.f92235b;
        if (cVar != null) {
            cVar.mo131419a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m139586d();
        this.f92235b.mo131427f();
    }

    /* renamed from: a */
    public static C35660a m139581a(boolean z, boolean z2, boolean z3) {
        return m139583a(z, z2, true, z3, null);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_contacts, viewGroup, false);
        this.f92234a = inflate;
        this.f92234a = inflate;
        return inflate;
    }

    /* renamed from: a */
    public static C35660a m139582a(boolean z, boolean z2, boolean z3, ITitleController iTitleController) {
        return m139584a(z, z2, true, z3, (String) null, iTitleController);
    }

    /* renamed from: a */
    public static C35660a m139583a(boolean z, boolean z2, boolean z3, boolean z4, String str) {
        return m139584a(z, z2, z3, z4, str, (ITitleController) null);
    }

    /* renamed from: a */
    private static C35660a m139584a(boolean z, boolean z2, boolean z3, boolean z4, String str, ITitleController iTitleController) {
        C35660a aVar = new C35660a(iTitleController);
        Bundle bundle = new Bundle();
        m139585a(bundle, z, z2, z3, z4, str);
        aVar.setArguments(bundle);
        return aVar;
    }

    /* renamed from: a */
    private static void m139585a(Bundle bundle, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        bundle.putBoolean("key_hide_header", z);
        bundle.putBoolean("key_show_select", z2);
        bundle.putString("key_chat_id", str);
        bundle.putBoolean("key_is_multi_select", z3);
        bundle.putBoolean("key_hide_contacts", z4);
    }
}
