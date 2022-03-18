package com.p078b.p079a;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import io.supercharge.shimmerlayout.ShimmerLayout;

/* renamed from: com.b.a.g */
public class C2057g implements AbstractC2055e {

    /* renamed from: a */
    private static final String f7057a = "com.b.a.g";

    /* renamed from: b */
    private final C2056f f7058b;

    /* renamed from: c */
    private final View f7059c;

    /* renamed from: d */
    private final int f7060d;

    /* renamed from: e */
    private final int f7061e;

    /* renamed from: f */
    private final boolean f7062f;

    /* renamed from: g */
    private final int f7063g;

    /* renamed from: h */
    private final int f7064h;

    /* renamed from: com.b.a.g$a */
    public static class C2059a {

        /* renamed from: a */
        public final View f7067a;

        /* renamed from: b */
        public int f7068b;

        /* renamed from: c */
        public boolean f7069c = true;

        /* renamed from: d */
        public int f7070d;

        /* renamed from: e */
        public int f7071e = 1000;

        /* renamed from: f */
        public int f7072f = 20;

        /* renamed from: a */
        public C2057g mo10153a() {
            C2057g gVar = new C2057g(this);
            gVar.mo10129a();
            return gVar;
        }

        /* renamed from: a */
        public C2059a mo10151a(int i) {
            this.f7068b = i;
            return this;
        }

        /* renamed from: c */
        public C2059a mo10155c(int i) {
            this.f7071e = i;
            return this;
        }

        /* renamed from: d */
        public C2059a mo10156d(int i) {
            this.f7072f = i;
            return this;
        }

        /* renamed from: a */
        public C2059a mo10152a(boolean z) {
            this.f7069c = z;
            return this;
        }

        /* renamed from: b */
        public C2059a mo10154b(int i) {
            this.f7070d = ContextCompat.getColor(this.f7067a.getContext(), i);
            return this;
        }

        public C2059a(View view) {
            this.f7067a = view;
            this.f7070d = ContextCompat.getColor(view.getContext(), R.color.shimmer_color);
        }
    }

    @Override // com.p078b.p079a.AbstractC2055e
    /* renamed from: a */
    public void mo10129a() {
        View c = m8975c();
        if (c != null) {
            this.f7058b.mo10147a(c);
        }
    }

    @Override // com.p078b.p079a.AbstractC2055e
    /* renamed from: b */
    public void mo10130b() {
        if (this.f7058b.mo10148b() instanceof ShimmerLayout) {
            ((ShimmerLayout) this.f7058b.mo10148b()).mo238796b();
        }
        this.f7058b.mo10146a();
    }

    /* renamed from: c */
    private View m8975c() {
        ViewParent parent = this.f7059c.getParent();
        if (parent == null) {
            Log.e(f7057a, "the source view have not attach to any view");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (this.f7062f) {
            return m8974a(viewGroup);
        }
        return LayoutInflater.from(this.f7059c.getContext()).inflate(this.f7060d, viewGroup, false);
    }

    private C2057g(C2059a aVar) {
        this.f7059c = aVar.f7067a;
        this.f7060d = aVar.f7068b;
        this.f7062f = aVar.f7069c;
        this.f7063g = aVar.f7071e;
        this.f7064h = aVar.f7072f;
        this.f7061e = aVar.f7070d;
        this.f7058b = new C2056f(aVar.f7067a);
    }

    /* renamed from: a */
    private ShimmerLayout m8974a(ViewGroup viewGroup) {
        final ShimmerLayout shimmerLayout = (ShimmerLayout) LayoutInflater.from(this.f7059c.getContext()).inflate(R.layout.layout_shimmer, viewGroup, false);
        shimmerLayout.setShimmerColor(this.f7061e);
        shimmerLayout.setShimmerAngle(this.f7064h);
        shimmerLayout.setShimmerAnimationDuration(this.f7063g);
        View inflate = LayoutInflater.from(this.f7059c.getContext()).inflate(this.f7060d, (ViewGroup) shimmerLayout, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            shimmerLayout.setLayoutParams(layoutParams);
        }
        shimmerLayout.addView(inflate);
        shimmerLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.p078b.p079a.C2057g.View$OnAttachStateChangeListenerC20581 */

            public void onViewAttachedToWindow(View view) {
                shimmerLayout.mo238795a();
            }

            public void onViewDetachedFromWindow(View view) {
                shimmerLayout.mo238796b();
            }
        });
        shimmerLayout.mo238795a();
        return shimmerLayout;
    }
}
