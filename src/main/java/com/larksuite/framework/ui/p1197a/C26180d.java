package com.larksuite.framework.ui.p1197a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.larksuite.framework.ui.a.d */
public class C26180d extends AbstractC26178b {

    /* renamed from: a */
    private static int f64661a = -1;

    @Override // com.larksuite.framework.ui.p1197a.AbstractC26178b
    /* renamed from: b */
    public void mo93159b() {
        if (mo93158a() != null) {
            m94707d();
            mo93158a().findViewById(f64661a).setAlpha(0.5f);
        }
    }

    @Override // com.larksuite.framework.ui.p1197a.AbstractC26178b
    /* renamed from: c */
    public void mo93160c() {
        ViewGroup viewGroup = (ViewGroup) mo93158a();
        View findViewById = mo93158a().findViewById(f64661a);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
            f64661a = -1;
        }
    }

    /* renamed from: d */
    private void m94707d() {
        if (f64661a == -1) {
            ViewGroup viewGroup = (ViewGroup) mo93158a();
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            viewGroup.addView(frameLayout, -1, -1);
            frameLayout.setBackgroundColor(-16777216);
            int generateViewId = View.generateViewId();
            f64661a = generateViewId;
            frameLayout.setId(generateViewId);
        }
    }

    C26180d(Context context) {
        super(context);
    }
}
