package com.ss.android.lark.contact.impl.selected_confirm;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.contact.impl.selected_confirm.AbstractC35958a;

/* renamed from: com.ss.android.lark.contact.impl.selected_confirm.b */
public class C35962b extends BaseFragment {

    /* renamed from: a */
    C35965d f92985a;

    /* renamed from: b */
    AbstractC35967e f92986b = new AbstractC35967e() {
        /* class com.ss.android.lark.contact.impl.selected_confirm.C35962b.C359631 */

        @Override // com.ss.android.lark.contact.impl.selected_confirm.AbstractC35967e
        /* renamed from: a */
        public void mo132307a(AbstractC35958a.AbstractC35960b bVar) {
            ButterKnife.bind(bVar, C35962b.this.getView());
        }

        @Override // com.ss.android.lark.contact.impl.selected_confirm.AbstractC35967e
        /* renamed from: a */
        public void mo132306a(int i, Intent intent) {
            if (i == 0) {
                C35962b.this.setResult(0);
                C35962b.this.mo132305a();
            } else if (i == -1) {
                C35962b.this.setResult(-1, intent);
                C35962b.this.finish();
            }
        }
    };

    /* renamed from: a */
    public void mo132305a() {
        setResult(0);
        finish();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getArguments() == null) {
            finish();
            return;
        }
        C35965d dVar = new C35965d(getContext(), this.f92986b, getArguments());
        this.f92985a = dVar;
        dVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_show_selected, viewGroup, false);
    }
}
