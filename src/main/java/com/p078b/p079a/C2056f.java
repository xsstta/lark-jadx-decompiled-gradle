package com.p078b.p079a;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.b.a.f */
public class C2056f {

    /* renamed from: a */
    private static final String f7048a = "com.b.a.f";

    /* renamed from: b */
    private final View f7049b;

    /* renamed from: c */
    private View f7050c;

    /* renamed from: d */
    private int f7051d = -1;

    /* renamed from: e */
    private View f7052e;

    /* renamed from: f */
    private ViewGroup f7053f;

    /* renamed from: g */
    private final ViewGroup.LayoutParams f7054g;

    /* renamed from: h */
    private int f7055h;

    /* renamed from: i */
    private final int f7056i;

    /* renamed from: b */
    public View mo10148b() {
        return this.f7050c;
    }

    /* renamed from: a */
    public void mo10146a() {
        ViewGroup viewGroup = this.f7053f;
        if (viewGroup != null) {
            viewGroup.removeView(this.f7052e);
            this.f7053f.addView(this.f7049b, this.f7055h, this.f7054g);
            this.f7052e = this.f7049b;
            this.f7050c = null;
            this.f7051d = -1;
        }
    }

    /* renamed from: c */
    private boolean m8970c() {
        if (this.f7053f != null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) this.f7049b.getParent();
        this.f7053f = viewGroup;
        if (viewGroup == null) {
            Log.e(f7048a, "the source view have not attach to any view");
            return false;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (this.f7049b == this.f7053f.getChildAt(i)) {
                this.f7055h = i;
                return true;
            }
        }
        return true;
    }

    public C2056f(View view) {
        this.f7049b = view;
        this.f7054g = view.getLayoutParams();
        this.f7052e = view;
        this.f7056i = view.getId();
    }

    /* renamed from: a */
    public void mo10147a(View view) {
        if (this.f7052e != view) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (m8970c()) {
                this.f7050c = view;
                this.f7053f.removeView(this.f7052e);
                this.f7050c.setId(this.f7056i);
                this.f7053f.addView(this.f7050c, this.f7055h, this.f7054g);
                this.f7052e = this.f7050c;
            }
        }
    }
}
