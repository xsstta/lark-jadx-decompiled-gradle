package com.bytedance.ee.android.file.picker.lib.local;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.android.file.picker.lib.base.BaseFragment;
import com.bytedance.ee.android.file.picker.lib.dependency.Statistics;
import com.bytedance.ee.android.file.picker.lib.local.C4073f;
import com.bytedance.ee.android.file.picker.lib.local.C4079g;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.android.file.picker.lib.local.d */
public class C4067d extends BaseFragment {

    /* renamed from: a */
    public View f12349a;

    /* renamed from: b */
    private C4073f.AbstractC4078b f12350b;

    /* renamed from: c */
    private C4073f f12351c;

    /* renamed from: d */
    private boolean f12352d;

    /* renamed from: e */
    private int f12353e;

    /* renamed from: f */
    private int f12354f;

    /* renamed from: g */
    private String f12355g;

    /* renamed from: h */
    private C4079g.AbstractC4083a f12356h = new C4079g.AbstractC4083a() {
        /* class com.bytedance.ee.android.file.picker.lib.local.C4067d.C40681 */

        @Override // com.bytedance.ee.android.file.picker.lib.local.C4079g.AbstractC4083a
        /* renamed from: a */
        public Fragment mo15976a() {
            return C4067d.this;
        }

        @Override // com.bytedance.ee.android.file.picker.lib.local.C4079g.AbstractC4083a
        /* renamed from: a */
        public void mo15977a(C4079g gVar) {
            gVar.f12377a = (RecyclerView) C4067d.this.f12349a.findViewById(R.id.rv_file);
            gVar.f12378b = (TextView) C4067d.this.f12349a.findViewById(R.id.select_file_count);
            gVar.f12379c = C4067d.this.f12349a.findViewById(R.id.layout_send);
            gVar.f12380d = (TextView) C4067d.this.f12349a.findViewById(R.id.btn_send);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f12350b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C4073f fVar = this.f12351c;
        if (fVar != null) {
            fVar.mo15856c();
        }
        super.onDestroyView();
    }

    /* renamed from: a */
    private void m16965a() {
        if (getParentFragment() instanceof C4073f.AbstractC4078b) {
            this.f12350b = (C4073f.AbstractC4078b) getParentFragment();
        }
        C4079g gVar = new C4079g(this.f12356h, this.f12353e, this.f12355g);
        C4073f fVar = new C4073f(this.f12350b, new C4069e(), gVar, getLoaderManager());
        this.f12351c = fVar;
        fVar.j_();
        this.f12351c.mo15984a(getActivity(), this.f12354f);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && !this.f12352d) {
            this.f12352d = true;
            Statistics.f12298b.mo15886a("show_attach_localdisk");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f12353e = arguments.getInt("action", 0);
        this.f12354f = arguments.getInt("extra.file.type", 202000);
        this.f12355g = arguments.getString("extra.custom.send.btn", null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        m16965a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        C4073f fVar = this.f12351c;
        if (fVar != null) {
            fVar.mo15983a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.file_picker_activity_file_chooser, viewGroup, false);
        this.f12349a = inflate;
        return inflate;
    }

    /* renamed from: a */
    public static C4067d m16964a(int i, int i2, String str) {
        C4067d dVar = new C4067d();
        Bundle bundle = new Bundle();
        bundle.putInt("action", i);
        bundle.putString("extra.custom.send.btn", str);
        bundle.putInt("extra.file.type", i2);
        dVar.setArguments(bundle);
        return dVar;
    }
}
