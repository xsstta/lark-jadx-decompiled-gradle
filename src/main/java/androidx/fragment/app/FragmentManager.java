package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.AbstractC0203c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.collection.C0513a;
import androidx.core.os.C0797c;
import androidx.core.util.C0841b;
import androidx.fragment.app.C1025c;
import androidx.fragment.app.C1047p;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ak;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class FragmentManager {
    private static boolean DEBUG;
    ArrayList<C1020a> mBackStack;
    private ArrayList<AbstractC1011c> mBackStackChangeListeners;
    private final AtomicInteger mBackStackIndex = new AtomicInteger();
    AbstractC1032d mContainer;
    private ArrayList<Fragment> mCreatedMenus;
    int mCurState = -1;
    private boolean mDestroyed;
    private Runnable mExecCommit = new Runnable() {
        /* class androidx.fragment.app.FragmentManager.RunnableC10074 */

        public void run() {
            FragmentManager.this.execPendingActions(true);
        }
    };
    private boolean mExecutingActions;
    private ConcurrentHashMap<Fragment, HashSet<C0797c>> mExitAnimationCancellationSignals = new ConcurrentHashMap<>();
    private C1034f mFragmentFactory = null;
    private final C1046o mFragmentStore = new C1046o();
    private final C1047p.AbstractC1054a mFragmentTransitionCallback = new C1047p.AbstractC1054a() {
        /* class androidx.fragment.app.FragmentManager.C10052 */

        @Override // androidx.fragment.app.C1047p.AbstractC1054a
        /* renamed from: a */
        public void mo5394a(Fragment fragment, C0797c cVar) {
            FragmentManager.this.addCancellationSignal(fragment, cVar);
        }

        @Override // androidx.fragment.app.C1047p.AbstractC1054a
        /* renamed from: b */
        public void mo5395b(Fragment fragment, C0797c cVar) {
            if (!cVar.mo4386a()) {
                FragmentManager.this.removeCancellationSignal(fragment, cVar);
            }
        }
    };
    private boolean mHavePendingDeferredStart;
    AbstractC1035g<?> mHost;
    private C1034f mHostFragmentFactory = new C1034f() {
        /* class androidx.fragment.app.FragmentManager.C10063 */

        @Override // androidx.fragment.app.C1034f
        public Fragment instantiate(ClassLoader classLoader, String str) {
            return FragmentManager.this.mHost.mo5531a(FragmentManager.this.mHost.mo5557g(), str, (Bundle) null);
        }
    };
    private final LayoutInflater$Factory2C1036h mLayoutInflaterFactory = new LayoutInflater$Factory2C1036h(this);
    private final C1037i mLifecycleCallbacksDispatcher = new C1037i(this);
    private boolean mNeedMenuInvalidate;
    private C1041l mNonConfig;
    private final AbstractC0203c mOnBackPressedCallback = new AbstractC0203c(false) {
        /* class androidx.fragment.app.FragmentManager.C10041 */

        @Override // androidx.activity.AbstractC0203c
        public void handleOnBackPressed() {
            FragmentManager.this.handleOnBackPressed();
        }
    };
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private Fragment mParent;
    private final ArrayList<AbstractC1012d> mPendingActions = new ArrayList<>();
    private ArrayList<C1014f> mPostponedTransactions;
    Fragment mPrimaryNav;
    private boolean mStateSaved;
    private boolean mStopped;
    private ArrayList<Fragment> mTmpAddedFragments;
    private ArrayList<Boolean> mTmpIsPop;
    private ArrayList<C1020a> mTmpRecords;

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    public interface AbstractC1009a {
        /* renamed from: d */
        String mo5399d();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    public static abstract class AbstractC1010b {
        /* renamed from: a */
        public void mo5400a(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: a */
        public void mo5401a(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: a */
        public void mo5402a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo5403a(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo5404b(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: b */
        public void mo5405b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: b */
        public void mo5406b(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo5407c(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: c */
        public void mo5408c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo5409d(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: d */
        public void mo5410d(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: e */
        public void mo5411e(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: f */
        public void mo5412f(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: g */
        public void mo5413g(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    public interface AbstractC1011c {
        /* renamed from: a */
        void mo5414a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$d */
    public interface AbstractC1012d {
        /* renamed from: a */
        boolean mo5415a(ArrayList<C1020a> arrayList, ArrayList<Boolean> arrayList2);
    }

    static int reverseTransit(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 getLayoutInflaterFactory() {
        return this.mLayoutInflaterFactory;
    }

    /* access modifiers changed from: package-private */
    public C1037i getLifecycleCallbacksDispatcher() {
        return this.mLifecycleCallbacksDispatcher;
    }

    /* access modifiers changed from: package-private */
    public Fragment getParent() {
        return this.mParent;
    }

    public Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$f */
    public static class C1014f implements Fragment.AbstractC1002b {

        /* renamed from: a */
        final boolean f3863a;

        /* renamed from: b */
        final C1020a f3864b;

        /* renamed from: c */
        private int f3865c;

        @Override // androidx.fragment.app.Fragment.AbstractC1002b
        /* renamed from: b */
        public void mo5247b() {
            this.f3865c++;
        }

        /* renamed from: c */
        public boolean mo5416c() {
            if (this.f3865c == 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5418e() {
            this.f3864b.f3904a.completeExecute(this.f3864b, this.f3863a, false, false);
        }

        @Override // androidx.fragment.app.Fragment.AbstractC1002b
        /* renamed from: a */
        public void mo5246a() {
            int i = this.f3865c - 1;
            this.f3865c = i;
            if (i == 0) {
                this.f3864b.f3904a.scheduleCommit();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5417d() {
            boolean z;
            if (this.f3865c > 0) {
                z = true;
            } else {
                z = false;
            }
            for (Fragment fragment : this.f3864b.f3904a.getFragments()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            this.f3864b.f3904a.completeExecute(this.f3864b, this.f3863a, !z, true);
        }

        C1014f(C1020a aVar, boolean z) {
            this.f3863a = z;
            this.f3864b = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public int allocBackStackIndex() {
        return this.mBackStackIndex.getAndIncrement();
    }

    public FragmentTransaction beginTransaction() {
        return new C1020a(this);
    }

    /* access modifiers changed from: package-private */
    public void dispatchDestroyView() {
        dispatchStateChange(1);
    }

    /* access modifiers changed from: package-private */
    public void dispatchPause() {
        dispatchStateChange(3);
    }

    /* access modifiers changed from: package-private */
    public void dispatchStop() {
        this.mStopped = true;
        dispatchStateChange(2);
    }

    /* access modifiers changed from: package-private */
    public int getActiveFragmentCount() {
        return this.mFragmentStore.mo5636g();
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> getActiveFragments() {
        return this.mFragmentStore.mo5635f();
    }

    public List<Fragment> getFragments() {
        return this.mFragmentStore.mo5634e();
    }

    public FragmentTransaction openTransaction() {
        return beginTransaction();
    }

    public boolean popBackStackImmediate() {
        return popBackStackImmediate(null, -1, 0);
    }

    private void checkStateLoss() {
        if (isStateSaved()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    private void doPendingDeferredStart() {
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(2);
    }

    /* access modifiers changed from: package-private */
    public void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(1);
    }

    /* access modifiers changed from: package-private */
    public void dispatchPrimaryNavigationFragmentChanged() {
        updateOnBackPressedCallbackEnabled();
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    /* access modifiers changed from: package-private */
    public void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(4);
    }

    /* access modifiers changed from: package-private */
    public void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(3);
    }

    public boolean executePendingTransactions() {
        boolean execPendingActions = execPendingActions(true);
        forcePostponedTransactions();
        return execPendingActions;
    }

    public int getBackStackEntryCount() {
        ArrayList<C1020a> arrayList = this.mBackStack;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public boolean isStateSaved() {
        if (this.mStateSaved || this.mStopped) {
            return true;
        }
        return false;
    }

    public void popBackStack() {
        enqueueAction(new C1013e(null, -1, 0), false);
    }

    private void forcePostponedTransactions() {
        if (this.mPostponedTransactions != null) {
            while (!this.mPostponedTransactions.isEmpty()) {
                this.mPostponedTransactions.remove(0).mo5417d();
            }
        }
    }

    private void reportBackStackChanged() {
        if (this.mBackStackChangeListeners != null) {
            for (int i = 0; i < this.mBackStackChangeListeners.size(); i++) {
                this.mBackStackChangeListeners.get(i).mo5414a();
            }
        }
    }

    private void startPendingDeferredFragments() {
        for (Fragment fragment : this.mFragmentStore.mo5635f()) {
            if (fragment != null) {
                performPendingDeferredStart(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions(true);
        endAnimatingAwayFragments();
        dispatchStateChange(-1);
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            this.mOnBackPressedCallback.remove();
            this.mOnBackPressedDispatcher = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchLowMemory() {
        for (Fragment fragment : this.mFragmentStore.mo5634e()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public C1034f getFragmentFactory() {
        C1034f fVar = this.mFragmentFactory;
        if (fVar != null) {
            return fVar;
        }
        Fragment fragment = this.mParent;
        if (fragment != null) {
            return fragment.mFragmentManager.getFragmentFactory();
        }
        return this.mHostFragmentFactory;
    }

    /* access modifiers changed from: package-private */
    public void handleOnBackPressed() {
        execPendingActions(true);
        if (this.mOnBackPressedCallback.isEnabled()) {
            popBackStackImmediate();
        } else {
            this.mOnBackPressedDispatcher.onBackPressed();
        }
    }

    /* access modifiers changed from: package-private */
    public C1040k retainNonConfig() {
        if (this.mHost instanceof ViewModelStoreOwner) {
            throwException(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.mNonConfig.getSnapshot();
    }

    private void endAnimatingAwayFragments() {
        if (!this.mExitAnimationCancellationSignals.isEmpty()) {
            for (Fragment fragment : this.mExitAnimationCancellationSignals.keySet()) {
                cancelExitAnimation(fragment);
                moveToState(fragment, fragment.getStateAfterAnimating());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (getBackStackEntryCount() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (isPrimaryNavigation(r3.mParent) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.setEnabled(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.mOnBackPressedCallback;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$d> r0 = r3.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$d> r1 = r3.mPendingActions     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.c r1 = r3.mOnBackPressedCallback     // Catch:{ all -> 0x002a }
            r1.setEnabled(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.c r0 = r3.mOnBackPressedCallback
            int r1 = r3.getBackStackEntryCount()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.mParent
            boolean r1 = r3.isPrimaryNavigation(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.setEnabled(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.updateOnBackPressedCallbackEnabled():void");
    }

    /* access modifiers changed from: package-private */
    public boolean checkForMenus() {
        boolean z = false;
        for (Fragment fragment : this.mFragmentStore.mo5635f()) {
            if (fragment != null) {
                z = isMenuAvailable(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void noteStateNotSaved() {
        if (this.mHost != null) {
            this.mStateSaved = false;
            this.mStopped = false;
            for (Fragment fragment : this.mFragmentStore.mo5634e()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void scheduleCommit() {
        boolean z;
        synchronized (this.mPendingActions) {
            ArrayList<C1014f> arrayList = this.mPostponedTransactions;
            boolean z2 = false;
            if (arrayList == null || arrayList.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (this.mPendingActions.size() == 1) {
                z2 = true;
            }
            if (z || z2) {
                this.mHost.mo5558h().removeCallbacks(this.mExecCommit);
                this.mHost.mo5558h().post(this.mExecCommit);
                updateOnBackPressedCallbackEnabled();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) SmActions.ACTION_ONTHECALL_EXIT);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.mParent;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.mParent)));
            sb.append("}");
        } else {
            AbstractC1035g<?> gVar = this.mHost;
            if (gVar != null) {
                sb.append(gVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.mHost)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public Parcelable saveAllState() {
        int size;
        forcePostponedTransactions();
        endAnimatingAwayFragments();
        execPendingActions(true);
        this.mStateSaved = true;
        ArrayList<FragmentState> c = this.mFragmentStore.mo5630c();
        BackStackState[] backStackStateArr = null;
        if (c.isEmpty()) {
            if (isLoggingEnabled(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> d = this.mFragmentStore.mo5632d();
        ArrayList<C1020a> arrayList = this.mBackStack;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i = 0; i < size; i++) {
                backStackStateArr[i] = new BackStackState(this.mBackStack.get(i));
                if (isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.mBackStack.get(i));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f3866a = c;
        fragmentManagerState.f3867b = d;
        fragmentManagerState.f3868c = backStackStateArr;
        fragmentManagerState.f3869d = this.mBackStackIndex.get();
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null) {
            fragmentManagerState.f3870e = fragment.mWho;
        }
        return fragmentManagerState;
    }

    public static void enableDebugLogging(boolean z) {
        DEBUG = z;
    }

    public void setFragmentFactory(C1034f fVar) {
        this.mFragmentFactory = fVar;
    }

    private C1041l getChildNonConfig(Fragment fragment) {
        return this.mNonConfig.getChildNonConfig(fragment);
    }

    /* access modifiers changed from: package-private */
    public Fragment findActiveFragment(String str) {
        return this.mFragmentStore.mo5633e(str);
    }

    public Fragment findFragmentById(int i) {
        return this.mFragmentStore.mo5623b(i);
    }

    public Fragment findFragmentByTag(String str) {
        return this.mFragmentStore.mo5616a(str);
    }

    /* access modifiers changed from: package-private */
    public Fragment findFragmentByWho(String str) {
        return this.mFragmentStore.mo5631d(str);
    }

    /* access modifiers changed from: package-private */
    public ak getViewModelStore(Fragment fragment) {
        return this.mNonConfig.getViewModelStore(fragment);
    }

    /* access modifiers changed from: package-private */
    public boolean isStateAtLeast(int i) {
        if (this.mCurState >= i) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void moveToState(Fragment fragment) {
        moveToState(fragment, this.mCurState);
    }

    public void removeOnBackStackChangedListener(AbstractC1011c cVar) {
        ArrayList<AbstractC1011c> arrayList = this.mBackStackChangeListeners;
        if (arrayList != null) {
            arrayList.remove(cVar);
        }
    }

    public void unregisterFragmentLifecycleCallbacks(AbstractC1010b bVar) {
        this.mLifecycleCallbacksDispatcher.mo5565a(bVar);
    }

    static Fragment getViewFragment(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public AbstractC1009a getBackStackEntryAt(int i) {
        return this.mBackStack.get(i);
    }

    /* access modifiers changed from: package-private */
    public boolean isParentMenuVisible(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    private void destroyFragmentView(Fragment fragment) {
        fragment.performDestroyView();
        this.mLifecycleCallbacksDispatcher.mo5574e(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.mo5929b((LifecycleOwner) null);
        fragment.mInLayout = false;
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(Fragment fragment) {
        if (fragment != null && fragment.equals(findActiveFragment(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* JADX INFO: finally extract failed */
    private void dispatchStateChange(int i) {
        try {
            this.mExecutingActions = true;
            this.mFragmentStore.mo5618a(i);
            moveToState(i, false);
            this.mExecutingActions = false;
            execPendingActions(true);
        } catch (Throwable th) {
            this.mExecutingActions = false;
            throw th;
        }
    }

    private static Fragment findViewFragment(View view) {
        while (view != null) {
            Fragment viewFragment = getViewFragment(view);
            if (viewFragment != null) {
                return viewFragment;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    private ViewGroup getFragmentContainer(Fragment fragment) {
        if (fragment.mContainerId > 0 && this.mContainer.mo5237a()) {
            View a = this.mContainer.mo5236a(fragment.mContainerId);
            if (a instanceof ViewGroup) {
                return (ViewGroup) a;
            }
        }
        return null;
    }

    static boolean isLoggingEnabled(int i) {
        if (DEBUG || Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    private boolean isMenuAvailable(Fragment fragment) {
        if ((!fragment.mHasMenu || !fragment.mMenuVisible) && !fragment.mChildFragmentManager.checkForMenus()) {
            return false;
        }
        return true;
    }

    private void setVisibleRemovingFragment(Fragment fragment) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null) {
            if (fragmentContainer.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                fragmentContainer.setTag(R.id.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) fragmentContainer.getTag(R.id.visible_removing_fragment_view_tag)).setNextAnim(fragment.getNextAnim());
        }
    }

    /* access modifiers changed from: package-private */
    public void addBackStackState(C1020a aVar) {
        if (this.mBackStack == null) {
            this.mBackStack = new ArrayList<>();
        }
        this.mBackStack.add(aVar);
    }

    public void addOnBackStackChangedListener(AbstractC1011c cVar) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new ArrayList<>();
        }
        this.mBackStackChangeListeners.add(cVar);
    }

    /* access modifiers changed from: package-private */
    public void dispatchConfigurationChanged(Configuration configuration) {
        for (Fragment fragment : this.mFragmentStore.mo5634e()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchMultiWindowModeChanged(boolean z) {
        for (Fragment fragment : this.mFragmentStore.mo5634e()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchPictureInPictureModeChanged(boolean z) {
        for (Fragment fragment : this.mFragmentStore.mo5634e()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isPrimaryNavigation(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.getPrimaryNavigationFragment()) || !isPrimaryNavigation(fragmentManager.mParent)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performPendingDeferredStart(Fragment fragment) {
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.mExecutingActions) {
            this.mHavePendingDeferredStart = true;
            return;
        }
        fragment.mDeferStart = false;
        moveToState(fragment, this.mCurState);
    }

    private void addAddedFragments(C0513a<Fragment> aVar) {
        int i = this.mCurState;
        if (i >= 1) {
            int min = Math.min(i, 3);
            for (Fragment fragment : this.mFragmentStore.mo5634e()) {
                if (fragment.mState < min) {
                    moveToState(fragment, min);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        aVar.add(fragment);
                    }
                }
            }
        }
    }

    private void cancelExitAnimation(Fragment fragment) {
        HashSet<C0797c> hashSet = this.mExitAnimationCancellationSignals.get(fragment);
        if (hashSet != null) {
            Iterator<C0797c> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().mo4388c();
            }
            hashSet.clear();
            destroyFragmentView(fragment);
            this.mExitAnimationCancellationSignals.remove(fragment);
        }
    }

    public static <F extends Fragment> F findFragment(View view) {
        F f = (F) findViewFragment(view);
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private void makeInactive(C1043m mVar) {
        Fragment a = mVar.mo5596a();
        if (this.mFragmentStore.mo5627b(a.mWho)) {
            if (isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Removed fragment from active set " + a);
            }
            this.mFragmentStore.mo5626b(mVar);
            removeRetainedFragment(a);
        }
    }

    private void makeRemovedFragmentsInvisible(C0513a<Fragment> aVar) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            Fragment b = aVar.mo2942b(i);
            if (!b.mAdded) {
                View requireView = b.requireView();
                b.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    private void throwException(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0841b("FragmentManager"));
        AbstractC1035g<?> gVar = this.mHost;
        if (gVar != null) {
            try {
                gVar.mo5278a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                dump("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* access modifiers changed from: package-private */
    public void addFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        makeActive(fragment);
        if (!fragment.mDetached) {
            this.mFragmentStore.mo5619a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void addRetainedFragment(Fragment fragment) {
        if (isStateSaved()) {
            if (isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.mNonConfig.addRetainedFragment(fragment) && isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchContextItemSelected(MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.mo5634e()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.mo5634e()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void dispatchOptionsMenuClosed(Menu menu) {
        if (this.mCurState >= 1) {
            for (Fragment fragment : this.mFragmentStore.mo5634e()) {
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.mo5634e()) {
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean execPendingActions(boolean z) {
        ensureExecReady(z);
        boolean z2 = false;
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                cleanupExec();
                z2 = true;
            } catch (Throwable th) {
                cleanupExec();
                throw th;
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.mo5624b();
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void hideFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            setVisibleRemovingFragment(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void removeRetainedFragment(Fragment fragment) {
        if (isStateSaved()) {
            if (isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.mNonConfig.removeRetainedFragment(fragment) && isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
        C1043m c = this.mFragmentStore.mo5629c(fragment.mWho);
        if (c == null || !c.mo5596a().equals(fragment)) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return c.mo5613l();
    }

    /* access modifiers changed from: package-private */
    public void showFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    private void ensureExecReady(boolean z) {
        if (this.mExecutingActions) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.mHost == null) {
            if (this.mDestroyed) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.mHost.mo5558h().getLooper()) {
            if (!z) {
                checkStateLoss();
            }
            if (this.mTmpRecords == null) {
                this.mTmpRecords = new ArrayList<>();
                this.mTmpIsPop = new ArrayList<>();
            }
            this.mExecutingActions = true;
            try {
                executePostponedTransaction(null, null);
            } finally {
                this.mExecutingActions = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    static FragmentManager findFragmentManager(View view) {
        Fragment findViewFragment = findViewFragment(view);
        if (findViewFragment != null) {
            return findViewFragment.getChildFragmentManager();
        }
        Context context = view.getContext();
        FragmentActivity fragmentActivity = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    /* access modifiers changed from: package-private */
    public void attachFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.mFragmentStore.mo5619a(fragment);
                if (isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void detachFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.mFragmentStore.mo5625b(fragment);
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
                setVisibleRemovingFragment(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void makeActive(Fragment fragment) {
        if (!this.mFragmentStore.mo5627b(fragment.mWho)) {
            C1043m mVar = new C1043m(this.mLifecycleCallbacksDispatcher, fragment);
            mVar.mo5602a(this.mHost.mo5557g().getClassLoader());
            this.mFragmentStore.mo5620a(mVar);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    addRetainedFragment(fragment);
                } else {
                    removeRetainedFragment(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            mVar.mo5597a(this.mCurState);
            if (isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void removeFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.mFragmentStore.mo5625b(fragment);
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mRemoving = true;
            setVisibleRemovingFragment(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void setPrimaryNavigationFragment(Fragment fragment) {
        if (fragment == null || (fragment.equals(findActiveFragment(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.mPrimaryNav;
            this.mPrimaryNav = fragment;
            dispatchParentPrimaryNavigationFragmentChanged(fragment2);
            dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    private void completeShowHideFragment(final Fragment fragment) {
        int i;
        if (fragment.mView != null) {
            C1025c.C1030a a = C1025c.m4983a(this.mHost.mo5557g(), this.mContainer, fragment, !fragment.mHidden);
            if (a == null || a.f3936b == null) {
                if (a != null) {
                    fragment.mView.startAnimation(a.f3935a);
                    a.f3935a.start();
                }
                if (!fragment.mHidden || fragment.isHideReplaced()) {
                    i = 0;
                } else {
                    i = 8;
                }
                fragment.mView.setVisibility(i);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                a.f3936b.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    final ViewGroup viewGroup = fragment.mContainer;
                    final View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    a.f3936b.addListener(new AnimatorListenerAdapter() {
                        /* class androidx.fragment.app.FragmentManager.C10085 */

                        public void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fragment.mView != null && fragment.mHidden) {
                                fragment.mView.setVisibility(8);
                            }
                        }
                    });
                }
                a.f3936b.start();
            }
        }
        if (fragment.mAdded && isMenuAvailable(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* access modifiers changed from: package-private */
    public void moveFragmentToExpectedState(Fragment fragment) {
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (this.mFragmentStore.mo5627b(fragment.mWho)) {
            moveToState(fragment);
            if (fragment.mView != null) {
                Fragment c = this.mFragmentStore.mo5628c(fragment);
                if (c != null && (indexOfChild2 = viewGroup.indexOfChild(fragment.mView)) < (indexOfChild = (viewGroup = fragment.mContainer).indexOfChild(c.mView))) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.mView, indexOfChild);
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    if (fragment.mPostponedAlpha > BitmapDescriptorFactory.HUE_RED) {
                        fragment.mView.setAlpha(fragment.mPostponedAlpha);
                    }
                    fragment.mPostponedAlpha = BitmapDescriptorFactory.HUE_RED;
                    fragment.mIsNewlyAdded = false;
                    C1025c.C1030a a = C1025c.m4983a(this.mHost.mo5557g(), this.mContainer, fragment, true);
                    if (a != null) {
                        if (a.f3935a != null) {
                            fragment.mView.startAnimation(a.f3935a);
                        } else {
                            a.f3936b.setTarget(fragment.mView);
                            a.f3936b.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                completeShowHideFragment(fragment);
            }
        } else if (isLoggingEnabled(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.mCurState + "since it is not added to " + this);
        }
    }

    /* access modifiers changed from: package-private */
    public void restoreSaveState(Parcelable parcelable) {
        C1043m mVar;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f3866a != null) {
                this.mFragmentStore.mo5617a();
                Iterator<FragmentState> it = fragmentManagerState.f3866a.iterator();
                while (it.hasNext()) {
                    FragmentState next = it.next();
                    if (next != null) {
                        Fragment findRetainedFragmentByWho = this.mNonConfig.findRetainedFragmentByWho(next.f3872b);
                        if (findRetainedFragmentByWho != null) {
                            if (isLoggingEnabled(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + findRetainedFragmentByWho);
                            }
                            mVar = new C1043m(this.mLifecycleCallbacksDispatcher, findRetainedFragmentByWho, next);
                        } else {
                            mVar = new C1043m(this.mLifecycleCallbacksDispatcher, this.mHost.mo5557g().getClassLoader(), getFragmentFactory(), next);
                        }
                        Fragment a = mVar.mo5596a();
                        a.mFragmentManager = this;
                        if (isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + a.mWho + "): " + a);
                        }
                        mVar.mo5602a(this.mHost.mo5557g().getClassLoader());
                        this.mFragmentStore.mo5620a(mVar);
                        mVar.mo5597a(this.mCurState);
                    }
                }
                for (Fragment fragment : this.mNonConfig.getRetainedFragments()) {
                    if (!this.mFragmentStore.mo5627b(fragment.mWho)) {
                        if (isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f3866a);
                        }
                        moveToState(fragment, 1);
                        fragment.mRemoving = true;
                        moveToState(fragment, -1);
                    }
                }
                this.mFragmentStore.mo5622a(fragmentManagerState.f3867b);
                if (fragmentManagerState.f3868c != null) {
                    this.mBackStack = new ArrayList<>(fragmentManagerState.f3868c.length);
                    for (int i = 0; i < fragmentManagerState.f3868c.length; i++) {
                        C1020a a2 = fragmentManagerState.f3868c[i].mo5062a(this);
                        if (isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + a2.f3906c + "): " + a2);
                            PrintWriter printWriter = new PrintWriter(new C0841b("FragmentManager"));
                            a2.mo5501a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.mBackStack.add(a2);
                    }
                } else {
                    this.mBackStack = null;
                }
                this.mBackStackIndex.set(fragmentManagerState.f3869d);
                if (fragmentManagerState.f3870e != null) {
                    Fragment findActiveFragment = findActiveFragment(fragmentManagerState.f3870e);
                    this.mPrimaryNav = findActiveFragment;
                    dispatchParentPrimaryNavigationFragmentChanged(findActiveFragment);
                }
            }
        }
    }

    public void registerFragmentLifecycleCallbacks(AbstractC1010b bVar, boolean z) {
        this.mLifecycleCallbacksDispatcher.mo5566a(bVar, z);
    }

    public boolean popBackStackImmediate(String str, int i) {
        return popBackStackImmediate(str, -1, i);
    }

    /* access modifiers changed from: package-private */
    public void addCancellationSignal(Fragment fragment, C0797c cVar) {
        if (this.mExitAnimationCancellationSignals.get(fragment) == null) {
            this.mExitAnimationCancellationSignals.put(fragment, new HashSet<>());
        }
        this.mExitAnimationCancellationSignals.get(fragment).add(cVar);
    }

    public void popBackStack(String str, int i) {
        enqueueAction(new C1013e(str, -1, i), false);
    }

    public boolean popBackStackImmediate(int i, int i2) {
        if (i >= 0) {
            return popBackStackImmediate(null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    public void restoreAllState(Parcelable parcelable, C1040k kVar) {
        if (this.mHost instanceof ViewModelStoreOwner) {
            throwException(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.mNonConfig.restoreFromSnapshot(kVar);
        restoreSaveState(parcelable);
    }

    /* access modifiers changed from: package-private */
    public void setExitAnimationOrder(Fragment fragment, boolean z) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null && (fragmentContainer instanceof FragmentContainerView)) {
            ((FragmentContainerView) fragmentContainer).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.FragmentManager$e */
    public class C1013e implements AbstractC1012d {

        /* renamed from: a */
        final String f3859a;

        /* renamed from: b */
        final int f3860b;

        /* renamed from: c */
        final int f3861c;

        @Override // androidx.fragment.app.FragmentManager.AbstractC1012d
        /* renamed from: a */
        public boolean mo5415a(ArrayList<C1020a> arrayList, ArrayList<Boolean> arrayList2) {
            if (FragmentManager.this.mPrimaryNav == null || this.f3860b >= 0 || this.f3859a != null || !FragmentManager.this.mPrimaryNav.getChildFragmentManager().popBackStackImmediate()) {
                return FragmentManager.this.popBackStackState(arrayList, arrayList2, this.f3859a, this.f3860b, this.f3861c);
            }
            return false;
        }

        C1013e(String str, int i, int i2) {
            this.f3859a = str;
            this.f3860b = i;
            this.f3861c = i2;
        }
    }

    private boolean generateOpsForPendingActions(ArrayList<C1020a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.mPendingActions) {
            if (this.mPendingActions.isEmpty()) {
                return false;
            }
            int size = this.mPendingActions.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.mPendingActions.get(i).mo5415a(arrayList, arrayList2);
            }
            this.mPendingActions.clear();
            this.mHost.mo5558h().removeCallbacks(this.mExecCommit);
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    public void enqueueAction(AbstractC1012d dVar, boolean z) {
        if (!z) {
            if (this.mHost != null) {
                checkStateLoss();
            } else if (this.mDestroyed) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.mPendingActions) {
            if (this.mHost != null) {
                this.mPendingActions.add(dVar);
                scheduleCommit();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void execSingleAction(AbstractC1012d dVar, boolean z) {
        if (!z || (this.mHost != null && !this.mDestroyed)) {
            ensureExecReady(z);
            if (dVar.mo5415a(this.mTmpRecords, this.mTmpIsPop)) {
                this.mExecutingActions = true;
                try {
                    removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                } finally {
                    cleanupExec();
                }
            }
            updateOnBackPressedCallbackEnabled();
            doPendingDeferredStart();
            this.mFragmentStore.mo5624b();
        }
    }

    public Fragment getFragment(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment findActiveFragment = findActiveFragment(string);
        if (findActiveFragment == null) {
            throwException(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return findActiveFragment;
    }

    public void popBackStack(int i, int i2) {
        if (i >= 0) {
            enqueueAction(new C1013e(null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    public void removeCancellationSignal(Fragment fragment, C0797c cVar) {
        HashSet<C0797c> hashSet = this.mExitAnimationCancellationSignals.get(fragment);
        if (hashSet != null && hashSet.remove(cVar) && hashSet.isEmpty()) {
            this.mExitAnimationCancellationSignals.remove(fragment);
            if (fragment.mState < 3) {
                destroyFragmentView(fragment);
                moveToState(fragment, fragment.getStateAfterAnimating());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        if (!fragment.equals(findActiveFragment(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = state;
    }

    private void removeRedundantOperationsAndExecute(ArrayList<C1020a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                executePostponedTransaction(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).mReorderingAllowed) {
                        if (i2 != i) {
                            executeOpsTogether(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).mReorderingAllowed) {
                                i2++;
                            }
                        }
                        executeOpsTogether(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    executeOpsTogether(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.mCurState < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.mFragmentStore.mo5634e()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i = 0; i < this.mCreatedMenus.size(); i++) {
                Fragment fragment2 = this.mCreatedMenus.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z;
    }

    /* access modifiers changed from: package-private */
    public void moveToState(int i, boolean z) {
        AbstractC1035g<?> gVar;
        if (this.mHost == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.mCurState) {
            this.mCurState = i;
            for (Fragment fragment : this.mFragmentStore.mo5634e()) {
                moveFragmentToExpectedState(fragment);
            }
            for (Fragment fragment2 : this.mFragmentStore.mo5635f()) {
                if (fragment2 != null && !fragment2.mIsNewlyAdded) {
                    moveFragmentToExpectedState(fragment2);
                }
            }
            startPendingDeferredFragments();
            if (this.mNeedMenuInvalidate && (gVar = this.mHost) != null && this.mCurState == 4) {
                gVar.mo5284d();
                this.mNeedMenuInvalidate = false;
            }
        }
    }

    private void executePostponedTransaction(ArrayList<C1020a> arrayList, ArrayList<Boolean> arrayList2) {
        int i;
        int indexOf;
        int indexOf2;
        ArrayList<C1014f> arrayList3 = this.mPostponedTransactions;
        if (arrayList3 == null) {
            i = 0;
        } else {
            i = arrayList3.size();
        }
        int i2 = 0;
        while (i2 < i) {
            C1014f fVar = this.mPostponedTransactions.get(i2);
            if (arrayList != null && !fVar.f3863a && (indexOf2 = arrayList.indexOf(fVar.f3864b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.mPostponedTransactions.remove(i2);
                i2--;
                i--;
                fVar.mo5418e();
            } else if (fVar.mo5416c() || (arrayList != null && fVar.f3864b.mo5502a(arrayList, 0, arrayList.size()))) {
                this.mPostponedTransactions.remove(i2);
                i2--;
                i--;
                if (arrayList == null || fVar.f3863a || (indexOf = arrayList.indexOf(fVar.f3864b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    fVar.mo5417d();
                } else {
                    fVar.mo5418e();
                }
            }
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r2 != 3) goto L_0x0209;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void moveToState(androidx.fragment.app.Fragment r13, int r14) {
        /*
        // Method dump skipped, instructions count: 572
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.moveToState(androidx.fragment.app.Fragment, int):void");
    }

    public void putFragment(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    private boolean popBackStackImmediate(String str, int i, int i2) {
        execPendingActions(false);
        ensureExecReady(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean popBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i, i2);
        if (popBackStackState) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.mo5624b();
        return popBackStackState;
    }

    /* access modifiers changed from: package-private */
    public void attachController(AbstractC1035g<?> gVar, AbstractC1032d dVar, Fragment fragment) {
        if (this.mHost == null) {
            this.mHost = gVar;
            this.mContainer = dVar;
            this.mParent = fragment;
            if (fragment != null) {
                updateOnBackPressedCallbackEnabled();
            }
            if (gVar instanceof OnBackPressedDispatcherOwner) {
                OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) gVar;
                OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
                this.mOnBackPressedDispatcher = onBackPressedDispatcher;
                LifecycleOwner lifecycleOwner = onBackPressedDispatcherOwner;
                if (fragment != null) {
                    lifecycleOwner = fragment;
                }
                onBackPressedDispatcher.addCallback(lifecycleOwner, this.mOnBackPressedCallback);
            }
            if (fragment != null) {
                this.mNonConfig = fragment.mFragmentManager.getChildNonConfig(fragment);
            } else if (gVar instanceof ViewModelStoreOwner) {
                this.mNonConfig = C1041l.getInstance(((ViewModelStoreOwner) gVar).getViewModelStore());
            } else {
                this.mNonConfig = new C1041l(false);
            }
        } else {
            throw new IllegalStateException("Already attached");
        }
    }

    private static void executeOps(ArrayList<C1020a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C1020a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo5498a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo5505b(z);
            } else {
                aVar.mo5498a(1);
                aVar.mo5504b();
            }
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public void completeExecute(C1020a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo5505b(z3);
        } else {
            aVar.mo5504b();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C1047p.m5104a(this, arrayList, arrayList2, 0, 1, true, this.mFragmentTransitionCallback);
        }
        if (z3) {
            moveToState(this.mCurState, true);
        }
        for (Fragment fragment : this.mFragmentStore.mo5635f()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.mo5506b(fragment.mContainerId)) {
                if (fragment.mPostponedAlpha > BitmapDescriptorFactory.HUE_RED) {
                    fragment.mView.setAlpha(fragment.mPostponedAlpha);
                }
                if (z3) {
                    fragment.mPostponedAlpha = BitmapDescriptorFactory.HUE_RED;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    private void executeOpsTogether(ArrayList<C1020a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4 = i;
        boolean z = arrayList.get(i4).mReorderingAllowed;
        ArrayList<Fragment> arrayList3 = this.mTmpAddedFragments;
        if (arrayList3 == null) {
            this.mTmpAddedFragments = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.mTmpAddedFragments.addAll(this.mFragmentStore.mo5634e());
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        boolean z2 = false;
        for (int i5 = i4; i5 < i2; i5++) {
            C1020a aVar = arrayList.get(i5);
            if (!arrayList2.get(i5).booleanValue()) {
                primaryNavigationFragment = aVar.mo5496a(this.mTmpAddedFragments, primaryNavigationFragment);
            } else {
                primaryNavigationFragment = aVar.mo5503b(this.mTmpAddedFragments, primaryNavigationFragment);
            }
            if (z2 || aVar.mAddToBackStack) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.mTmpAddedFragments.clear();
        if (!z) {
            C1047p.m5104a(this, arrayList, arrayList2, i, i2, false, this.mFragmentTransitionCallback);
        }
        executeOps(arrayList, arrayList2, i, i2);
        if (z) {
            C0513a<Fragment> aVar2 = new C0513a<>();
            addAddedFragments(aVar2);
            int postponePostponableTransactions = postponePostponableTransactions(arrayList, arrayList2, i, i2, aVar2);
            makeRemovedFragmentsInvisible(aVar2);
            i3 = postponePostponableTransactions;
        } else {
            i3 = i2;
        }
        if (i3 != i4 && z) {
            C1047p.m5104a(this, arrayList, arrayList2, i, i3, true, this.mFragmentTransitionCallback);
            moveToState(this.mCurState, true);
        }
        while (i4 < i2) {
            C1020a aVar3 = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue() && aVar3.f3906c >= 0) {
                aVar3.f3906c = -1;
            }
            aVar3.mo5497a();
            i4++;
        }
        if (z2) {
            reportBackStackChanged();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.mFragmentStore.mo5621a(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.mCreatedMenus;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.mCreatedMenus.get(i).toString());
            }
        }
        ArrayList<C1020a> arrayList2 = this.mBackStack;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C1020a aVar = this.mBackStack.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo5500a(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.mBackStackIndex.get());
        synchronized (this.mPendingActions) {
            int size3 = this.mPendingActions.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.mPendingActions.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
    }

    private int postponePostponableTransactions(ArrayList<C1020a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0513a<Fragment> aVar) {
        boolean z;
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C1020a aVar2 = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (!aVar2.mo5507c() || aVar2.mo5502a(arrayList, i4 + 1, i2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.mPostponedTransactions == null) {
                    this.mPostponedTransactions = new ArrayList<>();
                }
                C1014f fVar = new C1014f(aVar2, booleanValue);
                this.mPostponedTransactions.add(fVar);
                aVar2.mo5499a(fVar);
                if (booleanValue) {
                    aVar2.mo5504b();
                } else {
                    aVar2.mo5505b(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar2);
                }
                addAddedFragments(aVar);
            }
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    public boolean popBackStackState(ArrayList<C1020a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C1020a> arrayList3 = this.mBackStack;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.mBackStack.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C1020a aVar = this.mBackStack.get(size2);
                    if ((str != null && str.equals(aVar.mo5399d())) || (i >= 0 && i == aVar.f3906c)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C1020a aVar2 = this.mBackStack.get(size2);
                        if ((str == null || !str.equals(aVar2.mo5399d())) && (i < 0 || i != aVar2.f3906c)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.mBackStack.size() - 1) {
                return false;
            }
            for (int size3 = this.mBackStack.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.mBackStack.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }
}
