package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC0743j;
import androidx.core.view.C0905g;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.C1135ac;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ak;
import androidx.loader.p045a.AbstractC1181a;
import androidx.savedstate.C1442a;
import androidx.savedstate.C1445b;
import androidx.savedstate.SavedStateRegistryOwner;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, HasDefaultViewModelProviderFactory, LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {
    static final Object USE_DEFAULT_TRANSITION = new Object();
    boolean mAdded;
    C1001a mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    private C1144ai.AbstractC1146b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC1035g<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    LifecycleRegistry mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C1445b mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    C1066s mViewLifecycleOwner;
    C1177w<LifecycleOwner> mViewLifecycleOwnerLiveData;
    String mWho;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$b */
    public interface AbstractC1002b {
        /* renamed from: a */
        void mo5246a();

        /* renamed from: b */
        void mo5247b();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public final String getTag() {
        return this.mTag;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public AbstractC1181a getLoaderManager() {
        return AbstractC1181a.m5421a(this);
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final C1442a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo7625a();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void noteStateNotSaved() {
        this.mChildFragmentManager.noteStateNotSaved();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f3844p = true;
    }

    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$a */
    public static class C1001a {

        /* renamed from: a */
        View f3829a;

        /* renamed from: b */
        Animator f3830b;

        /* renamed from: c */
        int f3831c;

        /* renamed from: d */
        int f3832d;

        /* renamed from: e */
        int f3833e;

        /* renamed from: f */
        Object f3834f;

        /* renamed from: g */
        Object f3835g = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: h */
        Object f3836h;

        /* renamed from: i */
        Object f3837i = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: j */
        Object f3838j;

        /* renamed from: k */
        Object f3839k = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: l */
        Boolean f3840l;

        /* renamed from: m */
        Boolean f3841m;

        /* renamed from: n */
        AbstractC0743j f3842n;

        /* renamed from: o */
        AbstractC0743j f3843o;

        /* renamed from: p */
        boolean f3844p;

        /* renamed from: q */
        AbstractC1002b f3845q;

        /* renamed from: r */
        boolean f3846r;

        C1001a() {
        }
    }

    private C1001a ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C1001a();
        }
        return this.mAnimationInfo;
    }

    public final FragmentActivity getActivity() {
        AbstractC1035g<?> gVar = this.mHost;
        if (gVar == null) {
            return null;
        }
        return (FragmentActivity) gVar.mo5556f();
    }

    /* access modifiers changed from: package-private */
    public View getAnimatingAway() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3829a;
    }

    /* access modifiers changed from: package-private */
    public Animator getAnimator() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3830b;
    }

    public Context getContext() {
        AbstractC1035g<?> gVar = this.mHost;
        if (gVar == null) {
            return null;
        }
        return gVar.mo5557g();
    }

    public Object getEnterTransition() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3834f;
    }

    /* access modifiers changed from: package-private */
    public AbstractC0743j getEnterTransitionCallback() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3842n;
    }

    public Object getExitTransition() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3836h;
    }

    /* access modifiers changed from: package-private */
    public AbstractC0743j getExitTransitionCallback() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3843o;
    }

    public final Object getHost() {
        AbstractC1035g<?> gVar = this.mHost;
        if (gVar == null) {
            return null;
        }
        return gVar.mo5285e();
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater == null) {
            return performGetLayoutInflater(null);
        }
        return layoutInflater;
    }

    /* access modifiers changed from: package-private */
    public int getNextAnim() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.f3832d;
    }

    /* access modifiers changed from: package-private */
    public int getNextTransition() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.f3833e;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public Object getSharedElementEnterTransition() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3838j;
    }

    /* access modifiers changed from: package-private */
    public int getStateAfterAnimating() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.f3831c;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        C1066s sVar = this.mViewLifecycleOwner;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final boolean isAdded() {
        if (this.mHost == null || !this.mAdded) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isHideReplaced() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return false;
        }
        return aVar.f3846r;
    }

    /* access modifiers changed from: package-private */
    public boolean isPostponed() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return false;
        }
        return aVar.f3844p;
    }

    public final boolean isResumed() {
        if (this.mState >= 4) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.isStateSaved();
    }

    /* access modifiers changed from: package-private */
    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.dispatchLowMemory();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = C1445b.m6595a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.mLifecycleRegistry.addObserver(new AbstractC1168n() {
                /* class androidx.fragment.app.Fragment.C09972 */

                @Override // androidx.lifecycle.AbstractC1168n
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_STOP && Fragment.this.mView != null) {
                        Fragment.this.mView.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void callStartTransitionListener() {
        C1001a aVar = this.mAnimationInfo;
        AbstractC1002b bVar = null;
        if (aVar != null) {
            aVar.f3844p = false;
            AbstractC1002b bVar2 = this.mAnimationInfo.f3845q;
            this.mAnimationInfo.f3845q = null;
            bVar = bVar2;
        }
        if (bVar != null) {
            bVar.mo5246a();
        }
    }

    public boolean getAllowEnterTransitionOverlap() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null || aVar.f3841m == null) {
            return true;
        }
        return this.mAnimationInfo.f3841m.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null || aVar.f3840l == null) {
            return true;
        }
        return this.mAnimationInfo.f3840l.booleanValue();
    }

    public Object getReenterTransition() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        if (aVar.f3837i == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return this.mAnimationInfo.f3837i;
    }

    public Object getReturnTransition() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        if (aVar.f3835g == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return this.mAnimationInfo.f3835g;
    }

    public Object getSharedElementReturnTransition() {
        C1001a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        if (aVar.f3839k == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return this.mAnimationInfo.f3839k;
    }

    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.findActiveFragment(str);
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ak getViewModelStore() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager.getViewModelStore(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        if (!this.mMenuVisible || ((fragmentManager = this.mFragmentManager) != null && !fragmentManager.isParentMenuVisible(this.mParentFragment))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (!parentFragment.isRemoving() && !parentFragment.isRemovingParent())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performPrimaryNavigationFragmentChanged() {
        boolean isPrimaryNavigation = this.mFragmentManager.isPrimaryNavigation(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != isPrimaryNavigation) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(isPrimaryNavigation);
            onPrimaryNavigationFragmentChanged(isPrimaryNavigation);
            this.mChildFragmentManager.dispatchPrimaryNavigationFragmentChanged();
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C1039j();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() {
            /* class androidx.fragment.app.Fragment.RunnableC09961 */

            public void run() {
                Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C1177w<>();
        initLifecycle();
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public C1144ai.AbstractC1146b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new C1135ac(requireActivity().getApplication(), this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* access modifiers changed from: package-private */
    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C1039j();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isVisible() {
        View view;
        if (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performAttach() {
        this.mChildFragmentManager.attachController(this.mHost, new AbstractC1032d() {
            /* class androidx.fragment.app.Fragment.C09994 */

            @Override // androidx.fragment.app.AbstractC1032d
            /* renamed from: a */
            public boolean mo5237a() {
                if (Fragment.this.mView != null) {
                    return true;
                }
                return false;
            }

            @Override // androidx.fragment.app.AbstractC1032d
            /* renamed from: a */
            public View mo5236a(int i) {
                if (Fragment.this.mView != null) {
                    return Fragment.this.mView.findViewById(i);
                }
                throw new IllegalStateException("Fragment " + this + " does not have a view");
            }
        }, this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.mo5557g());
        if (!this.mCalled) {
            throw new C1072v("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroy() {
        this.mChildFragmentManager.dispatchDestroy();
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C1072v("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void startPostponedEnterTransition() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || fragmentManager.mHost == null) {
            ensureAnimationInfo().f3844p = false;
        } else if (Looper.myLooper() != this.mFragmentManager.mHost.mo5558h().getLooper()) {
            this.mFragmentManager.mHost.mo5558h().postAtFrontOfQueue(new Runnable() {
                /* class androidx.fragment.app.Fragment.RunnableC09983 */

                public void run() {
                    Fragment.this.callStartTransitionListener();
                }
            });
        } else {
            callStartTransitionListener();
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroyView() {
        this.mChildFragmentManager.dispatchDestroyView();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo5688a(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC1181a.m5421a(this).mo6047a();
            this.mPerformedCreateView = false;
            return;
        }
        throw new C1072v("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C1072v("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.isDestroyed()) {
            this.mChildFragmentManager.dispatchDestroy();
            this.mChildFragmentManager = new C1039j();
        }
    }

    /* access modifiers changed from: package-private */
    public void performPause() {
        this.mChildFragmentManager.dispatchPause();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo5688a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C1072v("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performResume() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo5688a(Lifecycle.Event.ON_RESUME);
            }
            this.mChildFragmentManager.dispatchResume();
            return;
        }
        throw new C1072v("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void performStart() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo5688a(Lifecycle.Event.ON_START);
            }
            this.mChildFragmentManager.dispatchStart();
            return;
        }
        throw new C1072v("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public void performStop() {
        this.mChildFragmentManager.dispatchStop();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo5688a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C1072v("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) SmActions.ACTION_ONTHECALL_EXIT);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        sb.append(")");
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.fragment.app.Fragment.SavedState.C10001 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        final Bundle f3828a;

        public int describeContents() {
            return 0;
        }

        SavedState(Bundle bundle) {
            this.f3828a = bundle;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f3828a);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f3828a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    /* access modifiers changed from: package-private */
    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f3829a = view;
    }

    /* access modifiers changed from: package-private */
    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f3830b = animator;
    }

    public void setEnterSharedElementCallback(AbstractC0743j jVar) {
        ensureAnimationInfo().f3842n = jVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f3834f = obj;
    }

    public void setExitSharedElementCallback(AbstractC0743j jVar) {
        ensureAnimationInfo().f3843o = jVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f3836h = obj;
    }

    /* access modifiers changed from: package-private */
    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f3846r = z;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f3837i = obj;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f3835g = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f3838j = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f3839k = obj;
    }

    /* access modifiers changed from: package-private */
    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().f3831c = i;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* access modifiers changed from: package-private */
    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.findFragmentByWho(str);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    /* access modifiers changed from: package-private */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.dispatchConfigurationChanged(configuration);
    }

    /* access modifiers changed from: package-private */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.dispatchMultiWindowModeChanged(z);
    }

    /* access modifiers changed from: package-private */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.dispatchPictureInPictureModeChanged(z);
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f3841m = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f3840l = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().f3832d = i;
        }
    }

    /* access modifiers changed from: package-private */
    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f3833e = i;
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC1035g<?> gVar = this.mHost;
        if (gVar != null) {
            return gVar.mo5280a(str);
        }
        return false;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC1035g<?> gVar = this.mHost;
        if (gVar != null) {
            LayoutInflater b = gVar.mo5281b();
            C0905g.m4353a(b, this.mChildFragmentManager.getLayoutInflaterFactory());
            return b;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        AbstractC1035g<?> gVar = this.mHost;
        if (gVar == null) {
            activity = null;
        } else {
            activity = gVar.mo5556f();
        }
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.isStateAtLeast(1)) {
            this.mChildFragmentManager.dispatchCreate();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!onContextItemSelected(menuItem) && !this.mChildFragmentManager.dispatchContextItemSelected(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if ((!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) && !this.mChildFragmentManager.dispatchOptionsItemSelected(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.dispatchOptionsMenuClosed(menu);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: package-private */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo7627b(bundle);
        Parcelable saveAllState = this.mChildFragmentManager.saveAllState();
        if (saveAllState != null) {
            bundle.putParcelable("android:support:fragments", saveAllState);
        }
    }

    /* access modifiers changed from: package-private */
    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.restoreSaveState(parcelable);
            this.mChildFragmentManager.dispatchCreate();
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo5284d();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || savedState.f3828a == null) {
                bundle = null;
            } else {
                bundle = savedState.f3828a;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo5284d();
            }
        }
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.addRetainedFragment(this);
        } else {
            fragmentManager.removeRetainedFragment(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            this.mChildFragmentManager.dispatchActivityCreated();
            return;
        }
        throw new C1072v("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 1;
        this.mCalled = false;
        this.mSavedStateRegistryController.mo7626a(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new C1072v("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C1072v("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.mo5688a(Lifecycle.Event.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnStartEnterTransitionListener(AbstractC1002b bVar) {
        ensureAnimationInfo();
        if (bVar != this.mAnimationInfo.f3845q) {
            if (bVar == null || this.mAnimationInfo.f3845q == null) {
                if (this.mAnimationInfo.f3844p) {
                    this.mAnimationInfo.f3845q = bVar;
                }
                if (bVar != null) {
                    bVar.mo5247b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public void setUserVisibleHint(boolean z) {
        boolean z2;
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.performPendingDeferredStart(this);
        }
        this.mUserVisibleHint = z;
        if (this.mState >= 3 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    /* access modifiers changed from: package-private */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuInflater);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f3844p = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.mHost.mo5558h();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final void requestPermissions(String[] strArr, int i) {
        AbstractC1035g<?> gVar = this.mHost;
        if (gVar != null) {
            gVar.mo5277a(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC1035g<?> gVar = this.mHost;
        if (gVar != null) {
            gVar.mo5275a(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void setTargetFragment(Fragment fragment, int i) {
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
                if (fragment2 == this) {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.mCalled = true;
        AbstractC1035g<?> gVar = this.mHost;
        if (gVar == null) {
            activity = null;
        } else {
            activity = gVar.mo5556f();
        }
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C1066s();
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.mo5687a();
            this.mViewLifecycleOwnerLiveData.mo5929b(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.mo5690b()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        AbstractC1035g<?> gVar = this.mHost;
        if (gVar != null) {
            gVar.mo5275a(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C1034f.loadFragmentClass(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            AbstractC1181a.m5421a(this).mo6049a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.dump(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC1035g<?> gVar = this.mHost;
        if (gVar != null) {
            gVar.mo5276a(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
}
