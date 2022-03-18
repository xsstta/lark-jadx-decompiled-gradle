package com.ss.android.vc.meeting.module.follow.p3120a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.follow.a.h */
public class C61766h extends C61756a implements AbstractC61770m {

    /* renamed from: c */
    private C61765g f155010c;

    /* renamed from: d */
    private Context f155011d;

    /* renamed from: e */
    private C61303k f155012e;

    /* renamed from: f */
    private ViewGroup f155013f;

    /* renamed from: g */
    private ViewGroup f155014g;

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61770m
    /* renamed from: b */
    public C61303k mo213996b() {
        return this.f155012e;
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61770m
    /* renamed from: a */
    public void mo213994a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f155013f;
        if (viewGroup2 != null && (viewGroup = this.f155014g) != null) {
            viewGroup2.removeView(viewGroup);
        }
    }

    /* renamed from: c */
    private void m241219c() {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.f155011d).inflate(R.layout.follow_top_bar_tip_layout, (ViewGroup) null, false);
        this.f155014g = relativeLayout;
        if (relativeLayout != null) {
            this.f155013f.removeAllViews();
            this.f155013f.addView(this.f155014g);
        }
        this.f155010c = new C61765g(this.f155011d, this.f155013f, this);
        mo213995a(this.f155012e.ab().mo213889o());
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61770m
    /* renamed from: a */
    public void mo213995a(boolean z) {
        this.f155010c.mo213993a(z);
    }

    public C61766h(Context context, C61303k kVar, ViewGroup viewGroup) {
        super(kVar);
        this.f155012e = kVar;
        this.f155011d = context;
        this.f155013f = viewGroup;
        m241219c();
    }
}
