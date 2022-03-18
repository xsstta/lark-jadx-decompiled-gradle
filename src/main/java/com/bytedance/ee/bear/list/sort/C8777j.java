package com.bytedance.ee.bear.list.sort;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.sort.AbstractC8757c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.sort.j */
public class C8777j extends C7667e implements AbstractC8757c {

    /* renamed from: a */
    private String f23632a;

    /* renamed from: b */
    private String f23633b;

    /* renamed from: c */
    private String f23634c;

    /* renamed from: d */
    private String f23635d;

    /* renamed from: e */
    private boolean f23636e = true;

    /* renamed from: f */
    private boolean f23637f = true;

    /* renamed from: g */
    private boolean f23638g = true;

    /* renamed from: h */
    private boolean f23639h = true;

    /* renamed from: i */
    private boolean f23640i;

    /* renamed from: j */
    private int f23641j;

    /* renamed from: k */
    private int f23642k;

    /* renamed from: l */
    private int f23643l;

    /* renamed from: m */
    private FolderSortStrategy f23644m;

    /* renamed from: n */
    private AbstractC8757c.AbstractC8758a f23645n;

    /* renamed from: o */
    private View f23646o;

    /* renamed from: p */
    private C8779l f23647p;

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8757c
    /* renamed from: a */
    public void mo33803a() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f23647p.destroy();
    }

    /* renamed from: b */
    private void m36822b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f23632a = arguments.getString("key_module", "");
            this.f23633b = arguments.getString("key_sub_module", "");
            this.f23634c = arguments.getString("key_token", "");
            this.f23635d = arguments.getString("key_path", "");
            this.f23636e = arguments.getBoolean("key_type_filter_enable", true);
            this.f23639h = arguments.getBoolean("key_reset_enable", true);
            this.f23637f = arguments.getBoolean("key_sort_filter_enable", true);
            this.f23638g = arguments.getBoolean("key_sort_asc_enable", true);
            this.f23641j = arguments.getInt("key_default_type_pos", this.f23641j);
            this.f23642k = arguments.getInt("key_default_sort_pos", this.f23642k);
            this.f23643l = arguments.getInt("key_sort_title_res", 0);
            this.f23644m = (FolderSortStrategy) arguments.getParcelable("key_sort_strategy");
            this.f23640i = arguments.getBoolean("key_filter_folder");
        }
    }

    /* renamed from: c */
    private void m36823c() {
        C8779l lVar = new C8779l(this, new C8782m(this.f23646o, getContext(), ar.m20936a(), this.f23636e, this.f23637f, this.f23638g, this.f23639h, this.f23641j, this.f23642k, this.f23632a, this.f23633b, this.f23635d, this.f23634c, this.f23643l), C8778k.m36826a(ar.m20936a(), this.f23634c, this.f23640i), this.f23645n, ar.m20936a(), this.f23632a, this.f23633b, this.f23635d, this.f23644m);
        this.f23647p = lVar;
        lVar.create();
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8757c
    /* renamed from: a */
    public void mo33804a(AbstractC8757c.AbstractC8758a aVar) {
        this.f23645n = aVar;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m36822b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m36823c();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_fragment_sort_and_filter, viewGroup, false);
        this.f23646o = inflate;
        return inflate;
    }
}
