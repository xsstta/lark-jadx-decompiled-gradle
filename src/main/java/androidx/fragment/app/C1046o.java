package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.o */
public class C1046o {

    /* renamed from: a */
    private final ArrayList<Fragment> f3967a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C1043m> f3968b = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5617a() {
        this.f3968b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo5636g() {
        return this.f3968b.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5624b() {
        this.f3968b.values().removeAll(Collections.singleton(null));
    }

    C1046o() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<Fragment> mo5634e() {
        ArrayList arrayList;
        if (this.f3967a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3967a) {
            arrayList = new ArrayList(this.f3967a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public List<Fragment> mo5635f() {
        ArrayList arrayList = new ArrayList();
        for (C1043m mVar : this.f3968b.values()) {
            if (mVar != null) {
                arrayList.add(mVar.mo5596a());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ArrayList<FragmentState> mo5630c() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f3968b.size());
        for (C1043m mVar : this.f3968b.values()) {
            if (mVar != null) {
                Fragment a = mVar.mo5596a();
                FragmentState k = mVar.mo5612k();
                arrayList.add(k);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Saved state of " + a + ": " + k.f3883m);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ArrayList<String> mo5632d() {
        synchronized (this.f3967a) {
            if (this.f3967a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3967a.size());
            Iterator<Fragment> it = this.f3967a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo5627b(String str) {
        return this.f3968b.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5620a(C1043m mVar) {
        this.f3968b.put(mVar.mo5596a().mWho, mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1043m mo5629c(String str) {
        return this.f3968b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5625b(Fragment fragment) {
        synchronized (this.f3967a) {
            this.f3967a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Fragment mo5633e(String str) {
        C1043m mVar = this.f3968b.get(str);
        if (mVar != null) {
            return mVar.mo5596a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5618a(int i) {
        Iterator<Fragment> it = this.f3967a.iterator();
        while (it.hasNext()) {
            C1043m mVar = this.f3968b.get(it.next().mWho);
            if (mVar != null) {
                mVar.mo5597a(i);
            }
        }
        for (C1043m mVar2 : this.f3968b.values()) {
            if (mVar2 != null) {
                mVar2.mo5597a(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Fragment mo5623b(int i) {
        for (int size = this.f3967a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3967a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C1043m mVar : this.f3968b.values()) {
            if (mVar != null) {
                Fragment a = mVar.mo5596a();
                if (a.mFragmentId == i) {
                    return a;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Fragment mo5628c(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f3967a.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f3967a.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Fragment mo5631d(String str) {
        Fragment findFragmentByWho;
        for (C1043m mVar : this.f3968b.values()) {
            if (!(mVar == null || (findFragmentByWho = mVar.mo5596a().findFragmentByWho(str)) == null)) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment mo5616a(String str) {
        if (str != null) {
            for (int size = this.f3967a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3967a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C1043m mVar : this.f3968b.values()) {
            if (mVar != null) {
                Fragment a = mVar.mo5596a();
                if (str.equals(a.mTag)) {
                    return a;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5626b(C1043m mVar) {
        Fragment a = mVar.mo5596a();
        for (C1043m mVar2 : this.f3968b.values()) {
            if (mVar2 != null) {
                Fragment a2 = mVar2.mo5596a();
                if (a.mWho.equals(a2.mTargetWho)) {
                    a2.mTarget = a;
                    a2.mTargetWho = null;
                }
            }
        }
        this.f3968b.put(a.mWho, null);
        if (a.mTargetWho != null) {
            a.mTarget = mo5633e(a.mTargetWho);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5619a(Fragment fragment) {
        if (!this.f3967a.contains(fragment)) {
            synchronized (this.f3967a) {
                this.f3967a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5622a(List<String> list) {
        this.f3967a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment e = mo5633e(str);
                if (e != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + e);
                    }
                    mo5619a(e);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5621a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3968b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C1043m mVar : this.f3968b.values()) {
                printWriter.print(str);
                if (mVar != null) {
                    Fragment a = mVar.mo5596a();
                    printWriter.println(a);
                    a.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3967a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3967a.get(i).toString());
            }
        }
    }
}
