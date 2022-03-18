package com.bytedance.ee.bear.list.create;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.create.j */
public class C8247j extends C7667e {

    /* renamed from: a */
    private View f22221a;

    /* renamed from: b */
    private C8249l f22222b;

    /* renamed from: c */
    private SelectCreationMenuConfig f22223c;

    /* renamed from: d */
    private String f22224d;

    /* renamed from: e */
    private String f22225e;

    /* renamed from: f */
    private String f22226f;

    /* renamed from: g */
    private String f22227g;

    /* renamed from: h */
    private String f22228h;

    /* renamed from: i */
    private boolean f22229i;

    /* renamed from: j */
    private boolean f22230j;

    /* renamed from: k */
    private boolean f22231k;

    /* renamed from: a */
    public void mo32346a() {
        C8249l lVar = this.f22222b;
        if (lVar != null) {
            lVar.mo32347a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f22222b.destroy();
    }

    /* renamed from: b */
    private void m33853b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f22223c = (SelectCreationMenuConfig) arguments.getParcelable("key_config");
            this.f22224d = arguments.getString("key_module");
            this.f22225e = arguments.getString("key_parent_token", "");
            this.f22226f = arguments.getString("key_parent_name", "");
            this.f22229i = arguments.getBoolean("key_is_folder", false);
            this.f22230j = arguments.getBoolean("key_is_from_empty", false);
            this.f22227g = arguments.getString("key_sub_module");
            this.f22228h = arguments.getString("key_src_module");
            this.f22231k = arguments.getBoolean("key_folder_version", false);
        }
    }

    /* renamed from: c */
    private void m33854c() {
        C13479a.m54764b("SelectCreationMenuFragment", "initMVP()...");
        C8249l lVar = new C8249l(this, new C8252m(getContext(), this, this.f22221a, getChildFragmentManager(), this.f22224d, this.f22227g, this.f22225e, this.f22229i, this.f22230j), new C8248k(this.f22223c, getContext(), ar.m20936a()), ar.m20936a(), this.f22224d, this.f22225e, this.f22226f, this.f22229i, this.f22230j, this.f22227g, this.f22228h, this.f22231k);
        this.f22222b = lVar;
        lVar.create();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m33853b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m33854c();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_fragment_create_menu, viewGroup, false);
        this.f22221a = inflate;
        return inflate;
    }
}
