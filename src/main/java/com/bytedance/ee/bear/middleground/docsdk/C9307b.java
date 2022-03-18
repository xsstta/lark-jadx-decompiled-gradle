package com.bytedance.ee.bear.middleground.docsdk;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;

/* renamed from: com.bytedance.ee.bear.middleground.docsdk.b */
public class C9307b {

    /* renamed from: g */
    public static final SparseArray<AbstractC10550f> f25033g = new SparseArray<>();

    /* renamed from: h */
    static final /* synthetic */ boolean f25034h = true;

    /* renamed from: a */
    public LifecycleOwner f25035a;

    /* renamed from: b */
    public C4933k f25036b;

    /* renamed from: c */
    public AbstractC4958n f25037c;

    /* renamed from: d */
    public C4943e.AbstractC4945b f25038d;

    /* renamed from: e */
    public C4943e.AbstractC4944a f25039e;

    /* renamed from: f */
    public int f25040f;

    /* renamed from: i */
    private FragmentActivity f25041i;

    /* renamed from: a */
    public static void m38480a() {
    }

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.b$1 */
    static /* synthetic */ class C93081 {

        /* renamed from: a */
        static final /* synthetic */ int[] f25042a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.middleground.docsdk.C9307b.C93081.f25042a = r0
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.middleground.docsdk.C9307b.C93081.f25042a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.middleground.docsdk.C9307b.C93081.f25042a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.docsdk.C9307b.C93081.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.b$a */
    public static class C9309a {

        /* renamed from: a */
        private LifecycleOwner f25043a;

        /* renamed from: b */
        private C4943e.AbstractC4944a f25044b;

        /* renamed from: c */
        private AbstractC4958n f25045c;

        /* renamed from: d */
        private C4943e.AbstractC4945b f25046d;

        /* renamed from: a */
        public C9307b mo35535a() {
            return new C9307b(this.f25043a, this.f25046d, this.f25044b, this.f25045c, null);
        }

        /* renamed from: a */
        public C9309a mo35531a(LifecycleOwner lifecycleOwner) {
            this.f25043a = lifecycleOwner;
            return this;
        }

        /* renamed from: a */
        public C9309a mo35532a(C4943e.AbstractC4944a aVar) {
            this.f25044b = aVar;
            return this;
        }

        /* renamed from: a */
        public C9309a mo35533a(C4943e.AbstractC4945b bVar) {
            this.f25046d = bVar;
            return this;
        }

        /* renamed from: a */
        public C9309a mo35534a(AbstractC4958n nVar) {
            this.f25045c = nVar;
            return this;
        }
    }

    /* renamed from: b */
    private void m38481b() {
        this.f25035a.getLifecycle().addObserver(new DocSDK$1(this));
        SparseArray<AbstractC10550f> sparseArray = f25033g;
        if (sparseArray.indexOfKey(this.f25040f) < 0) {
            sparseArray.put(this.f25040f, AbstractC10550f.AbstractC10551a.m43717b(this.f25041i));
            this.f25041i.getLifecycle().addObserver(new DocSDK$2(this));
        }
    }

    private C9307b(LifecycleOwner lifecycleOwner, C4943e.AbstractC4945b bVar, C4943e.AbstractC4944a aVar, AbstractC4958n nVar) {
        this.f25035a = lifecycleOwner;
        this.f25038d = bVar;
        this.f25039e = aVar;
        this.f25037c = nVar;
        if (lifecycleOwner instanceof Fragment) {
            this.f25041i = ((Fragment) lifecycleOwner).getActivity();
        } else if (lifecycleOwner instanceof FragmentActivity) {
            this.f25041i = (FragmentActivity) lifecycleOwner;
        } else {
            throw new IllegalArgumentException("lifecycleOwner=" + lifecycleOwner + " is neither FragmentActivity nor Fragment!");
        }
        if (f25034h || this.f25041i != null) {
            this.f25040f = this.f25041i.hashCode();
            m38481b();
            return;
        }
        throw new AssertionError();
    }

    /* synthetic */ C9307b(LifecycleOwner lifecycleOwner, C4943e.AbstractC4945b bVar, C4943e.AbstractC4944a aVar, AbstractC4958n nVar, DocSDK$1 docSDK$1) {
        this(lifecycleOwner, bVar, aVar, nVar);
    }
}
