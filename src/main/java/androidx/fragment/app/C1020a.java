package androidx.fragment.app;

import android.util.Log;
import androidx.core.util.C0841b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.PrintWriter;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.a */
public final class C1020a extends FragmentTransaction implements FragmentManager.AbstractC1009a, FragmentManager.AbstractC1012d {

    /* renamed from: a */
    final FragmentManager f3904a;

    /* renamed from: b */
    boolean f3905b;

    /* renamed from: c */
    int f3906c;

    @Override // androidx.fragment.app.FragmentManager.AbstractC1009a
    /* renamed from: d */
    public String mo5399d() {
        return this.mName;
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC1012d
    /* renamed from: a */
    public boolean mo5415a(ArrayList<C1020a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.mAddToBackStack) {
            return true;
        }
        this.f3904a.addBackStackState(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo5502a(ArrayList<C1020a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.mOps.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            FragmentTransaction.C1019a aVar = (FragmentTransaction.C1019a) this.mOps.get(i4);
            int i5 = aVar.f3897b != null ? aVar.f3897b.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C1020a aVar2 = arrayList.get(i6);
                    int size2 = aVar2.mOps.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        FragmentTransaction.C1019a aVar3 = (FragmentTransaction.C1019a) aVar2.mOps.get(i7);
                        if ((aVar3.f3897b != null ? aVar3.f3897b.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commit() {
        return mo5495a(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commitAllowingStateLoss() {
        return mo5495a(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNow() {
        disallowAddToBackStack();
        this.f3904a.execSingleAction(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.f3904a.execSingleAction(this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo5507c() {
        for (int i = 0; i < this.mOps.size(); i++) {
            if (m4957a((FragmentTransaction.C1019a) this.mOps.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo5497a() {
        if (this.mCommitRunnables != null) {
            for (int i = 0; i < this.mCommitRunnables.size(); i++) {
                ((Runnable) this.mCommitRunnables.get(i)).run();
            }
            this.mCommitRunnables = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) SmActions.ACTION_ONTHECALL_EXIT);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3906c >= 0) {
            sb.append(" #");
            sb.append(this.f3906c);
        }
        if (this.mName != null) {
            sb.append(" ");
            sb.append(this.mName);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5504b() {
        int size = this.mOps.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.C1019a aVar = (FragmentTransaction.C1019a) this.mOps.get(i);
            Fragment fragment = aVar.f3897b;
            if (fragment != null) {
                fragment.setNextTransition(this.mTransition);
            }
            switch (aVar.f3896a) {
                case 1:
                    fragment.setNextAnim(aVar.f3898c);
                    this.f3904a.setExitAnimationOrder(fragment, false);
                    this.f3904a.addFragment(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3896a);
                case 3:
                    fragment.setNextAnim(aVar.f3899d);
                    this.f3904a.removeFragment(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f3899d);
                    this.f3904a.hideFragment(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f3898c);
                    this.f3904a.setExitAnimationOrder(fragment, false);
                    this.f3904a.showFragment(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f3899d);
                    this.f3904a.detachFragment(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f3898c);
                    this.f3904a.setExitAnimationOrder(fragment, false);
                    this.f3904a.attachFragment(fragment);
                    break;
                case 8:
                    this.f3904a.setPrimaryNavigationFragment(fragment);
                    break;
                case 9:
                    this.f3904a.setPrimaryNavigationFragment(null);
                    break;
                case 10:
                    this.f3904a.setMaxLifecycle(fragment, aVar.f3903h);
                    break;
            }
            if (!(this.mReorderingAllowed || aVar.f3896a == 1 || fragment == null)) {
                this.f3904a.moveFragmentToExpectedState(fragment);
            }
        }
        if (!this.mReorderingAllowed) {
            FragmentManager fragmentManager = this.f3904a;
            fragmentManager.moveToState(fragmentManager.mCurState, true);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C1020a(androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            androidx.fragment.app.f r0 = r3.getFragmentFactory()
            androidx.fragment.app.g<?> r1 = r3.mHost
            if (r1 == 0) goto L_0x0013
            androidx.fragment.app.g<?> r1 = r3.mHost
            android.content.Context r1 = r1.mo5557g()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f3906c = r0
            r2.f3904a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1020a.<init>(androidx.fragment.app.FragmentManager):void");
    }

    /* renamed from: a */
    private static boolean m4957a(FragmentTransaction.C1019a aVar) {
        Fragment fragment = aVar.f3897b;
        if (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo5506b(int i) {
        int i2;
        int size = this.mOps.size();
        for (int i3 = 0; i3 < size; i3++) {
            FragmentTransaction.C1019a aVar = (FragmentTransaction.C1019a) this.mOps.get(i3);
            if (aVar.f3897b != null) {
                i2 = aVar.f3897b.mContainerId;
            } else {
                i2 = 0;
            }
            if (i2 != 0 && i2 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction detach(Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.f3904a) {
            return super.detach(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction hide(Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.f3904a) {
            return super.hide(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction remove(Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.f3904a) {
            return super.remove(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        if (fragment == null || fragment.mFragmentManager == null || fragment.mFragmentManager == this.f3904a) {
            return super.setPrimaryNavigationFragment(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction show(Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.f3904a) {
            return super.show(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo5495a(boolean z) {
        if (!this.f3905b) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C0841b("FragmentManager"));
                mo5500a("  ", printWriter);
                printWriter.close();
            }
            this.f3905b = true;
            if (this.mAddToBackStack) {
                this.f3906c = this.f3904a.allocBackStackIndex();
            } else {
                this.f3906c = -1;
            }
            this.f3904a.enqueueAction(this, z);
            return this.f3906c;
        }
        throw new IllegalStateException("commit already called");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5498a(int i) {
        if (this.mAddToBackStack) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.mOps.size();
            for (int i2 = 0; i2 < size; i2++) {
                FragmentTransaction.C1019a aVar = (FragmentTransaction.C1019a) this.mOps.get(i2);
                if (aVar.f3897b != null) {
                    aVar.f3897b.mBackStackNesting += i;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3897b + " to " + aVar.f3897b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5505b(boolean z) {
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            FragmentTransaction.C1019a aVar = (FragmentTransaction.C1019a) this.mOps.get(size);
            Fragment fragment = aVar.f3897b;
            if (fragment != null) {
                fragment.setNextTransition(FragmentManager.reverseTransit(this.mTransition));
            }
            switch (aVar.f3896a) {
                case 1:
                    fragment.setNextAnim(aVar.f3901f);
                    this.f3904a.setExitAnimationOrder(fragment, true);
                    this.f3904a.removeFragment(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3896a);
                case 3:
                    fragment.setNextAnim(aVar.f3900e);
                    this.f3904a.addFragment(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f3900e);
                    this.f3904a.showFragment(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f3901f);
                    this.f3904a.setExitAnimationOrder(fragment, true);
                    this.f3904a.hideFragment(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f3900e);
                    this.f3904a.attachFragment(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f3901f);
                    this.f3904a.setExitAnimationOrder(fragment, true);
                    this.f3904a.detachFragment(fragment);
                    break;
                case 8:
                    this.f3904a.setPrimaryNavigationFragment(null);
                    break;
                case 9:
                    this.f3904a.setPrimaryNavigationFragment(fragment);
                    break;
                case 10:
                    this.f3904a.setMaxLifecycle(fragment, aVar.f3902g);
                    break;
            }
            if (!(this.mReorderingAllowed || aVar.f3896a == 3 || fragment == null)) {
                this.f3904a.moveFragmentToExpectedState(fragment);
            }
        }
        if (!this.mReorderingAllowed && z) {
            FragmentManager fragmentManager = this.f3904a;
            fragmentManager.moveToState(fragmentManager.mCurState, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5499a(Fragment.AbstractC1002b bVar) {
        for (int i = 0; i < this.mOps.size(); i++) {
            FragmentTransaction.C1019a aVar = (FragmentTransaction.C1019a) this.mOps.get(i);
            if (m4957a(aVar)) {
                aVar.f3897b.setOnStartEnterTransitionListener(bVar);
            }
        }
    }

    /* renamed from: a */
    public void mo5500a(String str, PrintWriter printWriter) {
        mo5501a(str, printWriter, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Fragment mo5503b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            FragmentTransaction.C1019a aVar = (FragmentTransaction.C1019a) this.mOps.get(size);
            int i = aVar.f3896a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3897b;
                            break;
                        case 10:
                            aVar.f3903h = aVar.f3902g;
                            break;
                    }
                }
                arrayList.add(aVar.f3897b);
            }
            arrayList.remove(aVar.f3897b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager != this.f3904a) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f3904a);
        } else if (state.isAtLeast(Lifecycle.State.CREATED)) {
            return super.setMaxLifecycle(fragment, state);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + Lifecycle.State.CREATED);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment mo5496a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.mOps.size()) {
            FragmentTransaction.C1019a aVar = (FragmentTransaction.C1019a) this.mOps.get(i);
            int i2 = aVar.f3896a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f3897b;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.mOps.add(i, new FragmentTransaction.C1019a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                FragmentTransaction.C1019a aVar2 = new FragmentTransaction.C1019a(3, fragment4);
                                aVar2.f3898c = aVar.f3898c;
                                aVar2.f3900e = aVar.f3900e;
                                aVar2.f3899d = aVar.f3899d;
                                aVar2.f3901f = aVar.f3901f;
                                this.mOps.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.mOps.remove(i);
                        i--;
                    } else {
                        aVar.f3896a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.f3897b);
                    if (aVar.f3897b == fragment2) {
                        this.mOps.add(i, new FragmentTransaction.C1019a(9, aVar.f3897b));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.mOps.add(i, new FragmentTransaction.C1019a(9, fragment2));
                        i++;
                        fragment2 = aVar.f3897b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.f3897b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: a */
    public void mo5501a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.mName);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3906c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3905b);
            if (this.mTransition != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.mTransition));
            }
            if (!(this.mEnterAnim == 0 && this.mExitAnim == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mEnterAnim));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.mExitAnim));
            }
            if (!(this.mPopEnterAnim == 0 && this.mPopExitAnim == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mPopEnterAnim));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.mPopExitAnim));
            }
            if (!(this.mBreadCrumbTitleRes == 0 && this.mBreadCrumbTitleText == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbTitleRes));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.mBreadCrumbTitleText);
            }
            if (!(this.mBreadCrumbShortTitleRes == 0 && this.mBreadCrumbShortTitleText == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbShortTitleRes));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.mBreadCrumbShortTitleText);
            }
        }
        if (!this.mOps.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.mOps.size();
            for (int i = 0; i < size; i++) {
                FragmentTransaction.C1019a aVar = (FragmentTransaction.C1019a) this.mOps.get(i);
                switch (aVar.f3896a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3896a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3897b);
                if (z) {
                    if (!(aVar.f3898c == 0 && aVar.f3899d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3898c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3899d));
                    }
                    if (aVar.f3900e != 0 || aVar.f3901f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3900e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3901f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.fragment.app.FragmentTransaction
    public void doAddOp(int i, Fragment fragment, String str, int i2) {
        super.doAddOp(i, fragment, str, i2);
        fragment.mFragmentManager = this.f3904a;
    }
}
