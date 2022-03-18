package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

public class ReportFragment extends Fragment {

    /* renamed from: a */
    private AbstractC1123a f4210a;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.ReportFragment$a */
    public interface AbstractC1123a {
        /* renamed from: a */
        void mo5952a();

        /* renamed from: b */
        void mo5953b();

        /* renamed from: c */
        void mo5954c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.ReportFragment$b */
    public static class C1124b implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        C1124b() {
        }

        public void onActivityPostResumed(Activity activity) {
            ReportFragment.m5309a(activity, Lifecycle.Event.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            ReportFragment.m5309a(activity, Lifecycle.Event.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            ReportFragment.m5309a(activity, Lifecycle.Event.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            ReportFragment.m5309a(activity, Lifecycle.Event.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            ReportFragment.m5309a(activity, Lifecycle.Event.ON_STOP);
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C1124b());
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            ReportFragment.m5309a(activity, Lifecycle.Event.ON_CREATE);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        m5310a(Lifecycle.Event.ON_DESTROY);
        this.f4210a = null;
    }

    public void onPause() {
        super.onPause();
        m5310a(Lifecycle.Event.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m5314d(this.f4210a);
        m5310a(Lifecycle.Event.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m5313c(this.f4210a);
        m5310a(Lifecycle.Event.ON_START);
    }

    public void onStop() {
        super.onStop();
        m5310a(Lifecycle.Event.ON_STOP);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5945a(AbstractC1123a aVar) {
        this.f4210a = aVar;
    }

    /* renamed from: b */
    private void m5312b(AbstractC1123a aVar) {
        if (aVar != null) {
            aVar.mo5952a();
        }
    }

    /* renamed from: c */
    private void m5313c(AbstractC1123a aVar) {
        if (aVar != null) {
            aVar.mo5953b();
        }
    }

    /* renamed from: d */
    private void m5314d(AbstractC1123a aVar) {
        if (aVar != null) {
            aVar.mo5954c();
        }
    }

    /* renamed from: a */
    private void m5310a(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            m5309a(getActivity(), event);
        }
    }

    /* renamed from: b */
    static ReportFragment m5311b(Activity activity) {
        return (ReportFragment) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m5312b(this.f4210a);
        m5310a(Lifecycle.Event.ON_CREATE);
    }

    /* renamed from: a */
    public static void m5308a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1124b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    static void m5309a(Activity activity, Lifecycle.Event event) {
        if (activity instanceof AbstractC1171q) {
            ((AbstractC1171q) activity).mo6039a().handleLifecycleEvent(event);
        } else if (activity instanceof LifecycleOwner) {
            Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
            if (lifecycle instanceof LifecycleRegistry) {
                ((LifecycleRegistry) lifecycle).handleLifecycleEvent(event);
            }
        }
    }
}
