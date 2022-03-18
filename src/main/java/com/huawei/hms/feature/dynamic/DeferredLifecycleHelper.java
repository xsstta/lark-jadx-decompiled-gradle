package com.huawei.hms.feature.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.feature.dynamic.LifecycleDelegate;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    public static final int STATUS_ONCREATED = 1;
    public static final int STATUS_ONCREATEVIEW = 2;
    public static final int STATUS_ONINFLATE = 0;
    public static final int STATUS_ONRESUME = 5;
    public static final int STATUS_ONSTART = 4;

    /* renamed from: a */
    public static final String f57986a = "DeferredLifecycleHelper";

    /* renamed from: b */
    public T f57987b;

    /* renamed from: c */
    public Bundle f57988c;

    /* renamed from: d */
    public LinkedList<AbstractC23534a> f57989d;

    /* renamed from: e */
    public OnDelegateCreatedListener<T> f57990e = new C23535b();

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$a */
    public interface AbstractC23534a {
        /* renamed from: a */
        void mo82658a(LifecycleDelegate lifecycleDelegate);

        int getState();
    }

    /* renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$b */
    class C23535b implements OnDelegateCreatedListener<T> {
        public C23535b() {
        }

        @Override // com.huawei.hms.feature.dynamic.OnDelegateCreatedListener
        public void onDelegateCreated(T t) {
            DeferredLifecycleHelper.this.f57987b = t;
            Iterator it = DeferredLifecycleHelper.this.f57989d.iterator();
            while (it.hasNext()) {
                ((AbstractC23534a) it.next()).mo82658a(DeferredLifecycleHelper.this.f57987b);
            }
            DeferredLifecycleHelper.this.f57989d.clear();
            DeferredLifecycleHelper.this.f57988c = null;
        }
    }

    /* renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$c */
    class C23536c implements AbstractC23534a {

        /* renamed from: a */
        public final /* synthetic */ Activity f57992a;

        /* renamed from: b */
        public final /* synthetic */ Bundle f57993b;

        /* renamed from: c */
        public final /* synthetic */ Bundle f57994c;

        public C23536c(Activity activity, Bundle bundle, Bundle bundle2) {
            this.f57992a = activity;
            this.f57993b = bundle;
            this.f57994c = bundle2;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.AbstractC23534a
        /* renamed from: a */
        public void mo82658a(LifecycleDelegate lifecycleDelegate) {
            DeferredLifecycleHelper.this.f57987b.onInflate(this.f57992a, this.f57993b, this.f57994c);
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.AbstractC23534a
        public int getState() {
            return 0;
        }
    }

    /* renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$e */
    class C23538e implements AbstractC23534a {

        /* renamed from: a */
        public final /* synthetic */ FrameLayout f57998a;

        /* renamed from: b */
        public final /* synthetic */ LayoutInflater f57999b;

        /* renamed from: c */
        public final /* synthetic */ ViewGroup f58000c;

        /* renamed from: d */
        public final /* synthetic */ Bundle f58001d;

        public C23538e(FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.f57998a = frameLayout;
            this.f57999b = layoutInflater;
            this.f58000c = viewGroup;
            this.f58001d = bundle;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.AbstractC23534a
        /* renamed from: a */
        public void mo82658a(LifecycleDelegate lifecycleDelegate) {
            this.f57998a.removeAllViews();
            this.f57998a.addView(DeferredLifecycleHelper.this.f57987b.onCreateView(this.f57999b, this.f58000c, this.f58001d));
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.AbstractC23534a
        public int getState() {
            return 2;
        }
    }

    /* renamed from: a */
    private void m85330a(int i) {
        while (!this.f57989d.isEmpty() && this.f57989d.getLast().getState() >= i) {
            this.f57989d.removeLast();
        }
    }

    /* renamed from: a */
    private final void m85331a(Bundle bundle, AbstractC23534a aVar) {
        T t = this.f57987b;
        if (t != null) {
            aVar.mo82658a(t);
            return;
        }
        if (this.f57989d == null) {
            this.f57989d = new LinkedList<>();
        }
        this.f57989d.add(aVar);
        if (bundle != null) {
            Bundle bundle2 = this.f57988c;
            if (bundle2 == null) {
                this.f57988c = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.f57990e);
    }

    public abstract void createDelegate(OnDelegateCreatedListener<T> onDelegateCreatedListener);

    public T getDelegate() {
        return this.f57987b;
    }

    public void onCreate(Bundle bundle) {
        m85331a(bundle, new C23537d(bundle));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        m85331a(bundle, new C23538e(frameLayout, layoutInflater, viewGroup, bundle));
        return frameLayout;
    }

    public void onDestroy() {
        T t = this.f57987b;
        if (t != null) {
            t.onDestroy();
        } else {
            m85330a(0);
        }
    }

    public void onDestroyView() {
        T t = this.f57987b;
        if (t != null) {
            t.onDestroyView();
        } else {
            m85330a(1);
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        m85331a(bundle2, new C23536c(activity, bundle, bundle2));
    }

    public void onLowMemory() {
        T t = this.f57987b;
        if (t != null) {
            t.onLowMemory();
        }
    }

    public void onPause() {
        T t = this.f57987b;
        if (t != null) {
            t.onPause();
        } else {
            m85330a(5);
        }
    }

    public void onResume() {
        m85331a((Bundle) null, new C23540g());
    }

    public void onSaveInstanceState(Bundle bundle) {
        T t = this.f57987b;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f57988c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void onStart() {
        m85331a((Bundle) null, new C23539f());
    }

    public void onStop() {
        T t = this.f57987b;
        if (t != null) {
            t.onStop();
        } else {
            m85330a(4);
        }
    }

    /* renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$d */
    class C23537d implements AbstractC23534a {

        /* renamed from: a */
        public final /* synthetic */ Bundle f57996a;

        public C23537d(Bundle bundle) {
            this.f57996a = bundle;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.AbstractC23534a
        public int getState() {
            return 1;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.AbstractC23534a
        /* renamed from: a */
        public void mo82658a(LifecycleDelegate lifecycleDelegate) {
            Log.d(DeferredLifecycleHelper.f57986a, "IDelegateLifeCycleCall onCreate:");
            lifecycleDelegate.onCreate(this.f57996a);
        }
    }

    /* renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$f */
    class C23539f implements AbstractC23534a {
        public C23539f() {
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.AbstractC23534a
        public int getState() {
            return 4;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.AbstractC23534a
        /* renamed from: a */
        public void mo82658a(LifecycleDelegate lifecycleDelegate) {
            Log.d(DeferredLifecycleHelper.f57986a, "IDelegateLifeCycleCall onStart:");
            lifecycleDelegate.onStart();
        }
    }

    /* renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$g */
    class C23540g implements AbstractC23534a {
        public C23540g() {
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.AbstractC23534a
        public int getState() {
            return 5;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.AbstractC23534a
        /* renamed from: a */
        public void mo82658a(LifecycleDelegate lifecycleDelegate) {
            Log.d(DeferredLifecycleHelper.f57986a, "IDelegateLifeCycleCall onResume:");
            lifecycleDelegate.onResume();
        }
    }
}
