package com.ss.android.lark.main.app.fragment;

import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.main.app.tab.C44364l;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.main.app.fragment.i */
public class C44281i extends C44364l.AbstractC44365a {

    /* renamed from: a */
    private int f112290a = C25653b.m91893a(UIHelper.getColor(R.color.ud_N00), (float) BitmapDescriptorFactory.HUE_RED);

    /* renamed from: b */
    private int f112291b = UIHelper.getColor(R.color.bg_mask);

    /* renamed from: c */
    private TypeEvaluator<Integer> f112292c = new ArgbEvaluator();

    /* renamed from: d */
    private View f112293d;

    @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
    /* renamed from: b */
    public void mo157360b(View view) {
        this.f112293d.setVisibility(0);
    }

    @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
    /* renamed from: c */
    public void mo157361c(View view) {
        this.f112293d.setVisibility(8);
    }

    @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
    /* renamed from: e */
    public void mo157363e(View view) {
        this.f112293d.setVisibility(0);
    }

    public C44281i(View view) {
        this.f112293d = view;
    }

    @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
    /* renamed from: a */
    public void mo157358a(View view) {
        this.f112293d.setBackgroundColor(this.f112292c.evaluate(1.0f, Integer.valueOf(this.f112290a), Integer.valueOf(this.f112291b)).intValue());
        this.f112293d.setVisibility(0);
    }

    @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
    /* renamed from: d */
    public void mo157362d(View view) {
        this.f112293d.setBackgroundColor(this.f112292c.evaluate(BitmapDescriptorFactory.HUE_RED, Integer.valueOf(this.f112290a), Integer.valueOf(this.f112291b)).intValue());
        this.f112293d.setVisibility(8);
    }

    @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
    /* renamed from: a */
    public void mo157359a(View view, float f) {
        this.f112293d.setBackgroundColor(this.f112292c.evaluate(Math.max((float) BitmapDescriptorFactory.HUE_RED, f), Integer.valueOf(this.f112290a), Integer.valueOf(this.f112291b)).intValue());
    }
}
