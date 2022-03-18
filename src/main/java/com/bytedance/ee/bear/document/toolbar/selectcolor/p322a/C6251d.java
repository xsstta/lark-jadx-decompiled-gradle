package com.bytedance.ee.bear.document.toolbar.selectcolor.p322a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.toolbar.AbstractC6207c;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6245a;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6267j;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.d */
public class C6251d extends AbstractC6207c {

    /* renamed from: c */
    static final /* synthetic */ boolean f17341c = true;

    /* renamed from: d */
    private C6267j f17342d;

    /* renamed from: e */
    private TextView f17343e;

    /* renamed from: f */
    private C6245a f17344f;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C6267j mo22132f() {
        return (C6267j) aj.m5366a(getActivity()).mo6005a(C6267j.class);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c
    /* renamed from: i */
    public View mo22135i() {
        Context context = getContext();
        if (f17341c || context != null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.select_color_fragment, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.title);
            this.f17343e = textView;
            textView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6251d.C62521 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    C6251d.this.mo5513b();
                }
            });
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.colorList);
            C6250c cVar = new C6250c(getContext());
            C6245a aVar = new C6245a();
            this.f17344f = aVar;
            recyclerView.setAdapter(aVar);
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 5, 1, false));
            recyclerView.addItemDecoration(cVar);
            this.f17344f.mo25213a(cVar);
            this.f17344f.mo25211a(new C6245a.AbstractC6247a() {
                /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.$$Lambda$d$AvsbqYlnmwTQHS7zY7cuzzhx50c */

                @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6245a.AbstractC6247a
                public final void onColorSelected(String str) {
                    C6251d.this.m25128a((C6251d) str);
                }
            });
            this.f17342d.getSelectParam().mo5923a(this, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.$$Lambda$d$Cai1qyHrMIZzeR5S42YkWOK4EQI */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C6251d.this.m25127a((C6251d) ((C6267j.C6269b) obj));
                }
            });
            return inflate;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25128a(String str) {
        this.f17342d.colorSelected(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25127a(C6267j.C6269b bVar) {
        if (bVar != null) {
            this.f17343e.setText(bVar.f17392a);
            this.f17344f.mo25214a(bVar.f17394c, bVar.f17393b);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f17341c || activity != null) {
            this.f17342d = mo22132f();
            return;
        }
        throw new AssertionError();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        Dialog a = super.mo946a(bundle);
        if (a.getWindow() != null) {
            WindowManager.LayoutParams attributes = a.getWindow().getAttributes();
            attributes.height = (int) (((float) attributes.height) + getResources().getDimension(R.dimen.toolbar_menu_height));
            attributes.height = (int) (((float) attributes.height) + (getResources().getDimension(R.dimen.doc_input_divider_height) * 2.0f));
        }
        return a;
    }
}
