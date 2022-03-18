package com.p078b.p079a;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

/* renamed from: com.b.a.a */
public class C2048a implements AbstractC2055e {

    /* renamed from: a */
    private final RecyclerView f7028a;

    /* renamed from: b */
    private final RecyclerView.Adapter f7029b;

    /* renamed from: c */
    private final C2053d f7030c;

    /* renamed from: d */
    private final boolean f7031d;

    @Override // com.p078b.p079a.AbstractC2055e
    /* renamed from: b */
    public void mo10130b() {
        this.f7028a.setAdapter(this.f7029b);
    }

    /* renamed from: com.b.a.a$a */
    public static class C2050a {

        /* renamed from: a */
        public RecyclerView.Adapter f7032a;

        /* renamed from: b */
        public final RecyclerView f7033b;

        /* renamed from: c */
        public boolean f7034c = true;

        /* renamed from: d */
        public int f7035d = 10;

        /* renamed from: e */
        public int f7036e = R.layout.layout_default_item_skeleton;

        /* renamed from: f */
        public int f7037f;

        /* renamed from: g */
        public int f7038g = 1000;

        /* renamed from: h */
        public int f7039h = 20;

        /* renamed from: i */
        public boolean f7040i = true;

        /* renamed from: a */
        public C2048a mo10134a() {
            C2048a aVar = new C2048a(this);
            aVar.mo10129a();
            return aVar;
        }

        /* renamed from: a */
        public C2050a mo10131a(int i) {
            this.f7035d = i;
            return this;
        }

        /* renamed from: b */
        public C2050a mo10135b(int i) {
            this.f7038g = i;
            return this;
        }

        /* renamed from: d */
        public C2050a mo10138d(int i) {
            this.f7039h = i;
            return this;
        }

        /* renamed from: e */
        public C2050a mo10139e(int i) {
            this.f7036e = i;
            return this;
        }

        /* renamed from: a */
        public C2050a mo10132a(RecyclerView.Adapter adapter) {
            this.f7032a = adapter;
            return this;
        }

        /* renamed from: b */
        public C2050a mo10136b(boolean z) {
            this.f7040i = z;
            return this;
        }

        /* renamed from: a */
        public C2050a mo10133a(boolean z) {
            this.f7034c = z;
            return this;
        }

        /* renamed from: c */
        public C2050a mo10137c(int i) {
            this.f7037f = ContextCompat.getColor(this.f7033b.getContext(), i);
            return this;
        }

        public C2050a(RecyclerView recyclerView) {
            this.f7033b = recyclerView;
            this.f7037f = ContextCompat.getColor(recyclerView.getContext(), R.color.shimmer_color);
        }
    }

    @Override // com.p078b.p079a.AbstractC2055e
    /* renamed from: a */
    public void mo10129a() {
        this.f7028a.setAdapter(this.f7030c);
        if (!this.f7028a.isComputingLayout() && this.f7031d) {
            this.f7028a.setLayoutFrozen(true);
        }
    }

    private C2048a(C2050a aVar) {
        this.f7028a = aVar.f7033b;
        this.f7029b = aVar.f7032a;
        C2053d dVar = new C2053d();
        this.f7030c = dVar;
        dVar.mo10142b(aVar.f7035d);
        dVar.mo10140a(aVar.f7036e);
        dVar.mo10141a(aVar.f7034c);
        dVar.mo10143c(aVar.f7037f);
        dVar.mo10145e(aVar.f7039h);
        dVar.mo10144d(aVar.f7038g);
        this.f7031d = aVar.f7040i;
    }
}
