package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.i */
public class C1037i {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C1038a> f3949a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final FragmentManager f3950b;

    C1037i(FragmentManager fragmentManager) {
        this.f3950b = fragmentManager;
    }

    /* renamed from: a */
    public void mo5565a(FragmentManager.AbstractC1010b bVar) {
        synchronized (this.f3949a) {
            int i = 0;
            int size = this.f3949a.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f3949a.get(i).f3951a == bVar) {
                    this.f3949a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.i$a */
    public static final class C1038a {

        /* renamed from: a */
        final FragmentManager.AbstractC1010b f3951a;

        /* renamed from: b */
        final boolean f3952b;

        C1038a(FragmentManager.AbstractC1010b bVar, boolean z) {
            this.f3951a = bVar;
            this.f3952b = z;
        }
    }

    /* renamed from: a */
    public void mo5566a(FragmentManager.AbstractC1010b bVar, boolean z) {
        this.f3949a.add(new C1038a(bVar, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5574e(Fragment fragment, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5574e(fragment, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5411e(this.f3950b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5575f(Fragment fragment, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5575f(fragment, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5412f(this.f3950b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5576g(Fragment fragment, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5576g(fragment, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5413g(this.f3950b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5571c(Fragment fragment, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5571c(fragment, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5407c(this.f3950b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5573d(Fragment fragment, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5573d(fragment, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5409d(this.f3950b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5569b(Fragment fragment, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5569b(fragment, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5404b(this.f3950b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5564a(Fragment fragment, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5564a(fragment, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5400a(this.f3950b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5561a(Fragment fragment, Context context, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5561a(fragment, context, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5401a(this.f3950b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5567b(Fragment fragment, Context context, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5567b(fragment, context, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5405b(this.f3950b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5570c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5570c(fragment, bundle, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5408c(this.f3950b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5572d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5572d(fragment, bundle, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5410d(this.f3950b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5562a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5562a(fragment, bundle, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5402a(this.f3950b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5568b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5568b(fragment, bundle, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5406b(this.f3950b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5563a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment parent = this.f3950b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().mo5563a(fragment, view, bundle, true);
        }
        Iterator<C1038a> it = this.f3949a.iterator();
        while (it.hasNext()) {
            C1038a next = it.next();
            if (!z || next.f3952b) {
                next.f3951a.mo5403a(this.f3950b, fragment, view, bundle);
            }
        }
    }
}
