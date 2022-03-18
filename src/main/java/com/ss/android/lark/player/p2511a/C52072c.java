package com.ss.android.lark.player.p2511a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.player.a.c */
public class C52072c {

    /* renamed from: a */
    private FrameLayout f129228a;

    /* renamed from: b */
    private List<AbstractC52084f> f129229b = new ArrayList();

    /* renamed from: b */
    private ViewGroup.LayoutParams m202014b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    /* renamed from: a */
    public void mo178445a() {
        this.f129229b.clear();
        this.f129228a.removeAllViews();
    }

    /* renamed from: b */
    private boolean m202015b(AbstractC52084f fVar) {
        if (fVar == null || fVar.mo178431g() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public View mo178444a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f129228a = frameLayout;
        frameLayout.setBackgroundColor(0);
        return this.f129228a;
    }

    /* renamed from: a */
    public void mo178446a(AbstractC52084f fVar) {
        if (m202015b(fVar)) {
            this.f129229b.add(fVar);
            this.f129228a.addView(fVar.mo178431g(), m202014b());
        }
    }
}
