package com.bytedance.ee.bear.bitable.card.view.form;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.bitable.card.view.C4561b;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.form.a */
public class View$OnLayoutChangeListenerC4715a extends C4561b implements View.OnLayoutChangeListener, AbstractC10549e {

    /* renamed from: d */
    private AbstractC10550f f13931d;

    /* renamed from: e */
    private View f13932e;

    /* renamed from: a */
    private void m19569a() {
        View findViewById = getView().findViewById(R.id.multi_text_tool_bar_layout);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.bitable.card.view.C4561b
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC10550f fVar = this.f13931d;
        if (fVar != null) {
            fVar.mo39928b(this);
        }
        View view = this.f13932e;
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.bitable.card.view.C4561b
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b(getActivity());
        this.f13931d = b;
        b.mo39924a(this);
        this.f13932e.addOnLayoutChangeListener(this);
        mo17947a(false);
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        if (i == 0) {
            m19569a();
            C10548d.m43697a(getView());
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.bitable.card.view.C4561b
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) onCreateView.getLayoutParams();
        View findViewById = getActivity().findViewById(R.id.doc_appbar_layout);
        this.f13932e = findViewById;
        marginLayoutParams.topMargin = C13749l.m55741a(findViewById);
        onCreateView.setLayoutParams(marginLayoutParams);
        return onCreateView;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view instanceof AppBarLayout) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
            marginLayoutParams.topMargin = i4 - i2;
            getView().setLayoutParams(marginLayoutParams);
        }
    }
}
