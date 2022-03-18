package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0859a;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.core.view.p029a.C0869e;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.t */
public class C1406t extends C0859a {

    /* renamed from: a */
    final RecyclerView f4952a;

    /* renamed from: b */
    private final C1407a f4953b;

    /* renamed from: c */
    public C0859a mo7479c() {
        return this.f4953b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo7478b() {
        return this.f4952a.hasPendingAdapterUpdates();
    }

    /* renamed from: androidx.recyclerview.widget.t$a */
    public static class C1407a extends C0859a {

        /* renamed from: a */
        final C1406t f4954a;

        /* renamed from: b */
        private Map<View, C0859a> f4955b = new WeakHashMap();

        public C1407a(C1406t tVar) {
            this.f4954a = tVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo7480c(View view) {
            C0859a b = ViewCompat.m4055b(view);
            if (b != null && b != this) {
                this.f4955b.put(view, b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0859a mo7481d(View view) {
            return this.f4955b.remove(view);
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public C0869e mo4532a(View view) {
            C0859a aVar = this.f4955b.get(view);
            if (aVar != null) {
                return aVar.mo4532a(view);
            }
            return super.mo4532a(view);
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: b */
        public boolean mo4538b(View view, AccessibilityEvent accessibilityEvent) {
            C0859a aVar = this.f4955b.get(view);
            if (aVar != null) {
                return aVar.mo4538b(view, accessibilityEvent);
            }
            return super.mo4538b(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: c */
        public void mo4539c(View view, AccessibilityEvent accessibilityEvent) {
            C0859a aVar = this.f4955b.get(view);
            if (aVar != null) {
                aVar.mo4539c(view, accessibilityEvent);
            } else {
                super.mo4539c(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: d */
        public void mo4540d(View view, AccessibilityEvent accessibilityEvent) {
            C0859a aVar = this.f4955b.get(view);
            if (aVar != null) {
                aVar.mo4540d(view, accessibilityEvent);
            } else {
                super.mo4540d(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public void mo4533a(View view, int i) {
            C0859a aVar = this.f4955b.get(view);
            if (aVar != null) {
                aVar.mo4533a(view, i);
            } else {
                super.mo4533a(view, i);
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public void mo4534a(View view, AccessibilityEvent accessibilityEvent) {
            C0859a aVar = this.f4955b.get(view);
            if (aVar != null) {
                aVar.mo4534a(view, accessibilityEvent);
            } else {
                super.mo4534a(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public void mo4535a(View view, C0864d dVar) {
            if (this.f4954a.mo7478b() || this.f4954a.f4952a.getLayoutManager() == null) {
                super.mo4535a(view, dVar);
                return;
            }
            this.f4954a.f4952a.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, dVar);
            C0859a aVar = this.f4955b.get(view);
            if (aVar != null) {
                aVar.mo4535a(view, dVar);
            } else {
                super.mo4535a(view, dVar);
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public boolean mo4536a(View view, int i, Bundle bundle) {
            if (this.f4954a.mo7478b() || this.f4954a.f4952a.getLayoutManager() == null) {
                return super.mo4536a(view, i, bundle);
            }
            C0859a aVar = this.f4955b.get(view);
            if (aVar != null) {
                if (aVar.mo4536a(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo4536a(view, i, bundle)) {
                return true;
            }
            return this.f4954a.f4952a.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public boolean mo4537a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0859a aVar = this.f4955b.get(viewGroup);
            if (aVar != null) {
                return aVar.mo4537a(viewGroup, view, accessibilityEvent);
            }
            return super.mo4537a(viewGroup, view, accessibilityEvent);
        }
    }

    public C1406t(RecyclerView recyclerView) {
        this.f4952a = recyclerView;
        C0859a c = mo7479c();
        if (c == null || !(c instanceof C1407a)) {
            this.f4953b = new C1407a(this);
        } else {
            this.f4953b = (C1407a) c;
        }
    }

    @Override // androidx.core.view.C0859a
    /* renamed from: a */
    public void mo4535a(View view, C0864d dVar) {
        super.mo4535a(view, dVar);
        if (!mo7478b() && this.f4952a.getLayoutManager() != null) {
            this.f4952a.getLayoutManager().onInitializeAccessibilityNodeInfo(dVar);
        }
    }

    @Override // androidx.core.view.C0859a
    /* renamed from: d */
    public void mo4540d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4540d(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo7478b()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.view.C0859a
    /* renamed from: a */
    public boolean mo4536a(View view, int i, Bundle bundle) {
        if (super.mo4536a(view, i, bundle)) {
            return true;
        }
        if (mo7478b() || this.f4952a.getLayoutManager() == null) {
            return false;
        }
        return this.f4952a.getLayoutManager().performAccessibilityAction(i, bundle);
    }
}
