package com.bytedance.ee.bear.list.sort;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.sort.AbstractC8757c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.sort.o */
public class C8787o extends C7667e implements AbstractC8757c {

    /* renamed from: a */
    private String f23681a;

    /* renamed from: b */
    private int f23682b;

    /* renamed from: c */
    private FolderSortStrategy f23683c;

    /* renamed from: d */
    private boolean f23684d;

    /* renamed from: e */
    private AbstractC8757c.AbstractC8758a f23685e;

    /* renamed from: f */
    private View f23686f;

    /* renamed from: g */
    private C8789q f23687g;

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8757c
    /* renamed from: a */
    public void mo33803a() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f23687g.destroy();
    }

    /* renamed from: b */
    private void m36849b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f23681a = arguments.getString("key_token");
            this.f23682b = arguments.getInt("key_default_sort_pos", this.f23682b);
            this.f23683c = (FolderSortStrategy) arguments.getParcelable("key_sort_strategy");
            this.f23684d = arguments.getBoolean("key_sort_asc_enable", true);
        }
    }

    /* renamed from: c */
    private void m36850c() {
        C8789q qVar = new C8789q(this, new C8796t(this.f23686f, getContext(), this.f23682b, this.f23681a, this.f23684d), C8788p.m36853a(this.f23681a), this.f23685e, this.f23683c);
        this.f23687g = qVar;
        qVar.create();
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8757c
    /* renamed from: a */
    public void mo33804a(AbstractC8757c.AbstractC8758a aVar) {
        this.f23685e = aVar;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m36849b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m36850c();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_fragment_sort, viewGroup, false);
        this.f23686f = inflate;
        return inflate;
    }
}
