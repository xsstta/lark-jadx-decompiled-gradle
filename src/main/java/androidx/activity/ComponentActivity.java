package androidx.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.contextaware.AbstractC0205b;
import androidx.activity.contextaware.C0204a;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.result.AbstractC0208a;
import androidx.activity.result.AbstractC0210b;
import androidx.activity.result.AbstractC0211c;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.p016a.AbstractC0209a;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.C1135ac;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ak;
import androidx.lifecycle.al;
import androidx.lifecycle.am;
import androidx.p041h.C1091a;
import androidx.savedstate.C1442a;
import androidx.savedstate.C1445b;
import androidx.savedstate.C1446c;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements OnBackPressedDispatcherOwner, ContextAware, ActivityResultCaller, ActivityResultRegistryOwner, HasDefaultViewModelProviderFactory, LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {
    private final AbstractC0211c mActivityResultRegistry;
    private int mContentLayoutId;
    final C0204a mContextAwareHelper;
    private C1144ai.AbstractC1146b mDefaultFactory;
    private final LifecycleRegistry mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final C1445b mSavedStateRegistryController;
    private ak mViewModelStore;

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$a */
    public static final class C0199a {

        /* renamed from: a */
        Object f430a;

        /* renamed from: b */
        ak f431b;

        C0199a() {
        }
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    public final AbstractC0211c getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final C1442a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo7625a();
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.onBackPressed();
    }

    @Override // androidx.activity.contextaware.ContextAware
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.mo630a();
    }

    public Object getLastCustomNonConfigurationInstance() {
        C0199a aVar = (C0199a) getLastNonConfigurationInstance();
        if (aVar != null) {
            return aVar.f430a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0199a aVar = (C0199a) getLastNonConfigurationInstance();
            if (aVar != null) {
                this.mViewModelStore = aVar.f431b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new ak();
            }
        }
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ak getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    private void initViewTreeOwners() {
        al.m5372a(getWindow().getDecorView(), this);
        am.m5373a(getWindow().getDecorView(), this);
        C1446c.m6599a(getWindow().getDecorView(), this);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public C1144ai.AbstractC1146b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                Application application = getApplication();
                if (getIntent() != null) {
                    bundle = getIntent().getExtras();
                } else {
                    bundle = null;
                }
                this.mDefaultFactory = new C1135ac(application, this, bundle);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final Object onRetainNonConfigurationInstance() {
        C0199a aVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ak akVar = this.mViewModelStore;
        if (akVar == null && (aVar = (C0199a) getLastNonConfigurationInstance()) != null) {
            akVar = aVar.f431b;
        }
        if (akVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0199a aVar2 = new C0199a();
        aVar2.f430a = onRetainCustomNonConfigurationInstance;
        aVar2.f431b = akVar;
        return aVar2;
    }

    public void reportFullyDrawn() {
        try {
            if (C1091a.m5199a()) {
                C1091a.m5197a("reportFullyDrawn() for " + getComponentName());
            }
            if (Build.VERSION.SDK_INT > 19) {
                super.reportFullyDrawn();
            } else if (Build.VERSION.SDK_INT == 19 && ContextCompat.checkSelfPermission(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
        } finally {
            C1091a.m5200b();
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new C0204a();
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = C1445b.m6595a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() {
            /* class androidx.activity.ComponentActivity.RunnableC01941 */

            public void run() {
                try {
                    ComponentActivity.super.onBackPressed();
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                }
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new AbstractC0211c() {
            /* class androidx.activity.ComponentActivity.C01952 */
        };
        if (getLifecycle() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                getLifecycle().addObserver(new AbstractC1168n() {
                    /* class androidx.activity.ComponentActivity.C01963 */

                    @Override // androidx.lifecycle.AbstractC1168n
                    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        View view;
                        if (event == Lifecycle.Event.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            if (window != null) {
                                view = window.peekDecorView();
                            } else {
                                view = null;
                            }
                            if (view != null) {
                                view.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            getLifecycle().addObserver(new AbstractC1168n() {
                /* class androidx.activity.ComponentActivity.C01974 */

                @Override // androidx.lifecycle.AbstractC1168n
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.mo633b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().mo6010b();
                        }
                    }
                }
            });
            getLifecycle().addObserver(new AbstractC1168n() {
                /* class androidx.activity.ComponentActivity.C01985 */

                @Override // androidx.lifecycle.AbstractC1168n
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().removeObserver(this);
                }
            });
            if (19 <= Build.VERSION.SDK_INT && Build.VERSION.SDK_INT <= 23) {
                getLifecycle().addObserver(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(AbstractC0205b bVar) {
        this.mContextAwareHelper.mo632a(bVar);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(AbstractC0205b bVar) {
        this.mContextAwareHelper.mo634b(bVar);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.ComponentActivity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.mo7626a(bundle);
        this.mContextAwareHelper.mo631a(this);
        super.onCreate(bundle);
        this.mActivityResultRegistry.mo657b(bundle);
        ReportFragment.m5308a(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.ComponentActivity
    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo7627b(bundle);
        this.mActivityResultRegistry.mo654a(bundle);
    }

    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> AbstractC0210b<I> registerForActivityResult(AbstractC0209a<I, O> aVar, AbstractC0208a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.mo656a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> AbstractC0210b<I> registerForActivityResult(AbstractC0209a<I, O> aVar, AbstractC0211c cVar, AbstractC0208a<O> aVar2) {
        return cVar.mo653a("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, aVar2);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.mo656a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
