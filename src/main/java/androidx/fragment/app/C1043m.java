package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.m */
public class C1043m {

    /* renamed from: a */
    private final C1037i f3956a;

    /* renamed from: b */
    private final Fragment f3957b;

    /* renamed from: c */
    private int f3958c = -1;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment mo5596a() {
        return this.f3957b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Fragment.SavedState mo5613l() {
        Bundle n;
        if (this.f3957b.mState <= -1 || (n = m5048n()) == null) {
            return null;
        }
        return new Fragment.SavedState(n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo5614m() {
        if (this.f3957b.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3957b.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3957b.mSavedViewState = sparseArray;
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$1 */
    static /* synthetic */ class C10441 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3959a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.C1043m.C10441.f3959a = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.fragment.app.C1043m.C10441.f3959a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.fragment.app.C1043m.C10441.f3959a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1043m.C10441.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5606e() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3957b);
        }
        Fragment fragment = this.f3957b;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C1037i iVar = this.f3956a;
        Fragment fragment2 = this.f3957b;
        iVar.mo5570c(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5607f() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this.f3957b);
        }
        if (this.f3957b.mView != null) {
            Fragment fragment = this.f3957b;
            fragment.restoreViewState(fragment.mSavedFragmentState);
        }
        this.f3957b.mSavedFragmentState = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5608g() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3957b);
        }
        this.f3957b.performStart();
        this.f3956a.mo5564a(this.f3957b, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo5609h() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3957b);
        }
        this.f3957b.performResume();
        this.f3956a.mo5569b(this.f3957b, false);
        this.f3957b.mSavedFragmentState = null;
        this.f3957b.mSavedViewState = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5610i() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3957b);
        }
        this.f3957b.performPause();
        this.f3956a.mo5571c(this.f3957b, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5611j() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3957b);
        }
        this.f3957b.performStop();
        this.f3956a.mo5573d(this.f3957b, false);
    }

    /* renamed from: n */
    private Bundle m5048n() {
        Bundle bundle = new Bundle();
        this.f3957b.performSaveInstanceState(bundle);
        this.f3956a.mo5572d(this.f3957b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3957b.mView != null) {
            mo5614m();
        }
        if (this.f3957b.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3957b.mSavedViewState);
        }
        if (!this.f3957b.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3957b.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo5603b() {
        int i = this.f3958c;
        if (this.f3957b.mFromLayout) {
            if (this.f3957b.mInLayout) {
                i = Math.max(this.f3958c, 1);
            } else if (this.f3958c < 2) {
                i = Math.min(i, this.f3957b.mState);
            } else {
                i = Math.min(i, 1);
            }
        }
        if (!this.f3957b.mAdded) {
            i = Math.min(i, 1);
        }
        if (this.f3957b.mRemoving) {
            if (this.f3957b.isInBackStack()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        if (this.f3957b.mDeferStart && this.f3957b.mState < 3) {
            i = Math.min(i, 2);
        }
        int i2 = C10441.f3959a[this.f3957b.mMaxState.ordinal()];
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return Math.min(i, 3);
        }
        if (i2 != 3) {
            return Math.min(i, -1);
        }
        return Math.min(i, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5605d() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3957b);
        }
        if (!this.f3957b.mIsCreated) {
            C1037i iVar = this.f3956a;
            Fragment fragment = this.f3957b;
            iVar.mo5562a(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f3957b;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C1037i iVar2 = this.f3956a;
            Fragment fragment3 = this.f3957b;
            iVar2.mo5568b(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        Fragment fragment4 = this.f3957b;
        fragment4.restoreChildFragmentState(fragment4.mSavedFragmentState);
        this.f3957b.mState = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public FragmentState mo5612k() {
        FragmentState fragmentState = new FragmentState(this.f3957b);
        if (this.f3957b.mState <= -1 || fragmentState.f3883m != null) {
            fragmentState.f3883m = this.f3957b.mSavedFragmentState;
        } else {
            fragmentState.f3883m = m5048n();
            if (this.f3957b.mTargetWho != null) {
                if (fragmentState.f3883m == null) {
                    fragmentState.f3883m = new Bundle();
                }
                fragmentState.f3883m.putString("android:target_state", this.f3957b.mTargetWho);
                if (this.f3957b.mTargetRequestCode != 0) {
                    fragmentState.f3883m.putInt("android:target_req_state", this.f3957b.mTargetRequestCode);
                }
            }
        }
        return fragmentState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5604c() {
        if (this.f3957b.mFromLayout && this.f3957b.mInLayout && !this.f3957b.mPerformedCreateView) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3957b);
            }
            Fragment fragment = this.f3957b;
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, this.f3957b.mSavedFragmentState);
            if (this.f3957b.mView != null) {
                this.f3957b.mView.setSaveFromParentEnabled(false);
                this.f3957b.mView.setTag(R.id.fragment_container_view_tag, this.f3957b);
                if (this.f3957b.mHidden) {
                    this.f3957b.mView.setVisibility(8);
                }
                Fragment fragment2 = this.f3957b;
                fragment2.onViewCreated(fragment2.mView, this.f3957b.mSavedFragmentState);
                C1037i iVar = this.f3956a;
                Fragment fragment3 = this.f3957b;
                iVar.mo5563a(fragment3, fragment3.mView, this.f3957b.mSavedFragmentState, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5597a(int i) {
        this.f3958c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5601a(C1041l lVar) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3957b);
        }
        this.f3957b.performDetach();
        boolean z = false;
        this.f3956a.mo5576g(this.f3957b, false);
        this.f3957b.mState = -1;
        this.f3957b.mHost = null;
        this.f3957b.mParentFragment = null;
        this.f3957b.mFragmentManager = null;
        if (this.f3957b.mRemoving && !this.f3957b.isInBackStack()) {
            z = true;
        }
        if (z || lVar.shouldDestroy(this.f3957b)) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3957b);
            }
            this.f3957b.initState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5598a(AbstractC1032d dVar) {
        String str;
        if (!this.f3957b.mFromLayout) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3957b);
            }
            ViewGroup viewGroup = null;
            if (this.f3957b.mContainer != null) {
                viewGroup = this.f3957b.mContainer;
            } else if (this.f3957b.mContainerId != 0) {
                if (this.f3957b.mContainerId != -1) {
                    viewGroup = (ViewGroup) dVar.mo5236a(this.f3957b.mContainerId);
                    if (viewGroup == null && !this.f3957b.mRestored) {
                        try {
                            str = this.f3957b.getResources().getResourceName(this.f3957b.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3957b.mContainerId) + " (" + str + ") for fragment " + this.f3957b);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f3957b + " for a container view with no id");
                }
            }
            this.f3957b.mContainer = viewGroup;
            Fragment fragment = this.f3957b;
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), viewGroup, this.f3957b.mSavedFragmentState);
            if (this.f3957b.mView != null) {
                boolean z = false;
                this.f3957b.mView.setSaveFromParentEnabled(false);
                this.f3957b.mView.setTag(R.id.fragment_container_view_tag, this.f3957b);
                if (viewGroup != null) {
                    viewGroup.addView(this.f3957b.mView);
                }
                if (this.f3957b.mHidden) {
                    this.f3957b.mView.setVisibility(8);
                }
                ViewCompat.m4108w(this.f3957b.mView);
                Fragment fragment2 = this.f3957b;
                fragment2.onViewCreated(fragment2.mView, this.f3957b.mSavedFragmentState);
                C1037i iVar = this.f3956a;
                Fragment fragment3 = this.f3957b;
                iVar.mo5563a(fragment3, fragment3.mView, this.f3957b.mSavedFragmentState, false);
                Fragment fragment4 = this.f3957b;
                if (fragment4.mView.getVisibility() == 0 && this.f3957b.mContainer != null) {
                    z = true;
                }
                fragment4.mIsNewlyAdded = z;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5602a(ClassLoader classLoader) {
        if (this.f3957b.mSavedFragmentState != null) {
            this.f3957b.mSavedFragmentState.setClassLoader(classLoader);
            Fragment fragment = this.f3957b;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3957b;
            fragment2.mTargetWho = fragment2.mSavedFragmentState.getString("android:target_state");
            if (this.f3957b.mTargetWho != null) {
                Fragment fragment3 = this.f3957b;
                fragment3.mTargetRequestCode = fragment3.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            if (this.f3957b.mSavedUserVisibleHint != null) {
                Fragment fragment4 = this.f3957b;
                fragment4.mUserVisibleHint = fragment4.mSavedUserVisibleHint.booleanValue();
                this.f3957b.mSavedUserVisibleHint = null;
            } else {
                Fragment fragment5 = this.f3957b;
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            if (!this.f3957b.mUserVisibleHint) {
                this.f3957b.mDeferStart = true;
            }
        }
    }

    C1043m(C1037i iVar, Fragment fragment) {
        this.f3956a = iVar;
        this.f3957b = fragment;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5600a(AbstractC1035g<?> gVar, C1041l lVar) {
        boolean z;
        boolean z2;
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3957b);
        }
        boolean z3 = true;
        if (!this.f3957b.mRemoving || this.f3957b.isInBackStack()) {
            z = false;
        } else {
            z = true;
        }
        if (z || lVar.shouldDestroy(this.f3957b)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (gVar instanceof ViewModelStoreOwner) {
                z3 = lVar.isCleared();
            } else if (gVar.mo5557g() instanceof Activity) {
                z3 = true ^ ((Activity) gVar.mo5557g()).isChangingConfigurations();
            }
            if (z || z3) {
                lVar.clearNonConfigState(this.f3957b);
            }
            this.f3957b.performDestroy();
            this.f3956a.mo5575f(this.f3957b, false);
            return;
        }
        this.f3957b.mState = 0;
    }

    C1043m(C1037i iVar, Fragment fragment, FragmentState fragmentState) {
        String str;
        this.f3956a = iVar;
        this.f3957b = fragment;
        fragment.mSavedViewState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        if (fragment.mTarget != null) {
            str = fragment.mTarget.mWho;
        } else {
            str = null;
        }
        fragment.mTargetWho = str;
        fragment.mTarget = null;
        if (fragmentState.f3883m != null) {
            fragment.mSavedFragmentState = fragmentState.f3883m;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5599a(AbstractC1035g<?> gVar, FragmentManager fragmentManager, Fragment fragment) {
        this.f3957b.mHost = gVar;
        this.f3957b.mParentFragment = fragment;
        this.f3957b.mFragmentManager = fragmentManager;
        this.f3956a.mo5561a(this.f3957b, gVar.mo5557g(), false);
        this.f3957b.performAttach();
        if (this.f3957b.mParentFragment == null) {
            gVar.mo5282b(this.f3957b);
        } else {
            this.f3957b.mParentFragment.onAttachFragment(this.f3957b);
        }
        this.f3956a.mo5567b(this.f3957b, gVar.mo5557g(), false);
    }

    C1043m(C1037i iVar, ClassLoader classLoader, C1034f fVar, FragmentState fragmentState) {
        this.f3956a = iVar;
        Fragment instantiate = fVar.instantiate(classLoader, fragmentState.f3871a);
        this.f3957b = instantiate;
        if (fragmentState.f3880j != null) {
            fragmentState.f3880j.setClassLoader(classLoader);
        }
        instantiate.setArguments(fragmentState.f3880j);
        instantiate.mWho = fragmentState.f3872b;
        instantiate.mFromLayout = fragmentState.f3873c;
        instantiate.mRestored = true;
        instantiate.mFragmentId = fragmentState.f3874d;
        instantiate.mContainerId = fragmentState.f3875e;
        instantiate.mTag = fragmentState.f3876f;
        instantiate.mRetainInstance = fragmentState.f3877g;
        instantiate.mRemoving = fragmentState.f3878h;
        instantiate.mDetached = fragmentState.f3879i;
        instantiate.mHidden = fragmentState.f3881k;
        instantiate.mMaxState = Lifecycle.State.values()[fragmentState.f3882l];
        if (fragmentState.f3883m != null) {
            instantiate.mSavedFragmentState = fragmentState.f3883m;
        } else {
            instantiate.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + instantiate);
        }
    }
}
