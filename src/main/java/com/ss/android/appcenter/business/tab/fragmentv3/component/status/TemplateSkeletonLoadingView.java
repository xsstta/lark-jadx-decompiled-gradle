package com.ss.android.appcenter.business.tab.fragmentv3.component.status;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2052c;
import com.p078b.p079a.C2056f;
import com.p078b.p079a.C2057g;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.vesdk.p3188b.C63954b;
import java.lang.reflect.Field;

public class TemplateSkeletonLoadingView extends FrameLayout {

    /* renamed from: a */
    public static final int f70301a = C28209p.m103291a(72.0f);

    /* renamed from: b */
    public static final int f70302b = C28209p.m103291a(100.0f);

    /* renamed from: c */
    public static final int f70303c = C28209p.m103291a(200.0f);

    /* renamed from: d */
    private C2057g f70304d;

    /* renamed from: e */
    private int f70305e;

    /* renamed from: f */
    private boolean f70306f;

    /* renamed from: c */
    public void mo99961c() {
        C2057g gVar = this.f70304d;
        if (gVar != null) {
            gVar.mo10130b();
        }
    }

    /* renamed from: a */
    public void mo99959a() {
        if (!this.f70306f) {
            this.f70306f = true;
            this.f70304d = C2052c.m8961a(LayoutInflater.from(getContext()).inflate(R.layout.workplace_skeleton_loading_view, (ViewGroup) this, true)).mo10151a(R.layout.workplace_common_loading_skeleton).mo10152a(UIUtils.canShowSkeleton()).mo10155c(2000).mo10153a();
        }
    }

    /* renamed from: b */
    public void mo99960b() {
        mo99959a();
        C2057g gVar = this.f70304d;
        if (gVar != null) {
            gVar.mo10129a();
        }
        try {
            Field declaredField = C2057g.class.getDeclaredField(C63954b.f161494a);
            declaredField.setAccessible(true);
            Field declaredField2 = C2056f.class.getDeclaredField("e");
            declaredField2.setAccessible(true);
            m102651a((View) declaredField2.get((C2056f) declaredField.get(this.f70304d)));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public void setStatusHeight(int i) {
        this.f70305e = i;
    }

    public TemplateSkeletonLoadingView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m102651a(View view) {
        View findViewById = view.findViewById(R.id.container);
        View findViewById2 = view.findViewById(R.id.v_skeleton_0);
        int i = this.f70305e;
        if (i > f70303c) {
            view.findViewById(R.id.v_skeleton_1).setVisibility(0);
            view.findViewById(R.id.v_skeleton_2).setVisibility(0);
            view.findViewById(R.id.v_skeleton_3).setVisibility(0);
            m102652a(findViewById, findViewById2, true);
        } else if (i > f70302b) {
            view.findViewById(R.id.v_skeleton_1).setVisibility(0);
            view.findViewById(R.id.v_skeleton_2).setVisibility(8);
            view.findViewById(R.id.v_skeleton_3).setVisibility(0);
            m102652a(findViewById, findViewById2, true);
        } else if (i >= f70301a) {
            view.findViewById(R.id.v_skeleton_1).setVisibility(8);
            view.findViewById(R.id.v_skeleton_2).setVisibility(8);
            view.findViewById(R.id.v_skeleton_3).setVisibility(0);
            m102652a(findViewById, findViewById2, true);
        } else {
            view.findViewById(R.id.v_skeleton_1).setVisibility(8);
            view.findViewById(R.id.v_skeleton_2).setVisibility(8);
            view.findViewById(R.id.v_skeleton_3).setVisibility(8);
            m102652a(findViewById, findViewById2, false);
        }
    }

    public TemplateSkeletonLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TemplateSkeletonLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m102652a(View view, View view2, boolean z) {
        int a = C28209p.m103291a(16.0f);
        if (z) {
            view.setPadding(a, a, a, a);
            C28209p.m103299a(view2, -2);
            return;
        }
        view.setPadding(a, 0, a, 0);
        C28209p.m103299a(view2, -1);
    }
}
