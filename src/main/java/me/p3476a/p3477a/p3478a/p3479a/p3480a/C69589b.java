package me.p3476a.p3477a.p3478a.p3479a.p3480a;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: me.a.a.a.a.a.b */
public class C69589b implements AbstractC69588a {

    /* renamed from: a */
    protected final RecyclerView f173976a;

    /* renamed from: b */
    protected final AbstractC69590a f173977b;

    /* renamed from: c */
    protected boolean f173978c;

    /* renamed from: me.a.a.a.a.a.b$a */
    protected interface AbstractC69590a {
        /* renamed from: a */
        boolean mo243152a();

        /* renamed from: b */
        boolean mo243153b();
    }

    @Override // me.p3476a.p3477a.p3478a.p3479a.p3480a.AbstractC69588a
    /* renamed from: a */
    public View mo243149a() {
        return this.f173976a;
    }

    /* renamed from: me.a.a.a.a.a.b$b */
    protected class C69591b implements AbstractC69590a {
        @Override // me.p3476a.p3477a.p3478a.p3479a.p3480a.C69589b.AbstractC69590a
        /* renamed from: a */
        public boolean mo243152a() {
            return !C69589b.this.f173976a.canScrollHorizontally(-1);
        }

        @Override // me.p3476a.p3477a.p3478a.p3479a.p3480a.C69589b.AbstractC69590a
        /* renamed from: b */
        public boolean mo243153b() {
            return !C69589b.this.f173976a.canScrollHorizontally(1);
        }

        protected C69591b() {
        }
    }

    /* renamed from: me.a.a.a.a.a.b$c */
    protected class C69592c implements AbstractC69590a {
        @Override // me.p3476a.p3477a.p3478a.p3479a.p3480a.C69589b.AbstractC69590a
        /* renamed from: a */
        public boolean mo243152a() {
            return !C69589b.this.f173976a.canScrollVertically(-1);
        }

        @Override // me.p3476a.p3477a.p3478a.p3479a.p3480a.C69589b.AbstractC69590a
        /* renamed from: b */
        public boolean mo243153b() {
            return !C69589b.this.f173976a.canScrollVertically(1);
        }

        protected C69592c() {
        }
    }

    @Override // me.p3476a.p3477a.p3478a.p3479a.p3480a.AbstractC69588a
    /* renamed from: b */
    public boolean mo243150b() {
        if (this.f173978c || !this.f173977b.mo243152a()) {
            return false;
        }
        return true;
    }

    @Override // me.p3476a.p3477a.p3478a.p3479a.p3480a.AbstractC69588a
    /* renamed from: c */
    public boolean mo243151c() {
        if (this.f173978c || !this.f173977b.mo243153b()) {
            return false;
        }
        return true;
    }

    public C69589b(RecyclerView recyclerView) {
        int i;
        this.f173976a = recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        boolean z = layoutManager instanceof LinearLayoutManager;
        if (z || (layoutManager instanceof StaggeredGridLayoutManager)) {
            if (z) {
                i = ((LinearLayoutManager) layoutManager).getOrientation();
            } else {
                i = ((StaggeredGridLayoutManager) layoutManager).mo7272k();
            }
            if (i == 0) {
                this.f173977b = new C69591b();
            } else {
                this.f173977b = new C69592c();
            }
        } else {
            throw new IllegalArgumentException("Recycler views with custom layout managers are not supported by this adapter out of the box.Try implementing and providing an explicit 'impl' parameter to the other c'tors, or otherwise create a custom adapter subclass of your own.");
        }
    }
}
