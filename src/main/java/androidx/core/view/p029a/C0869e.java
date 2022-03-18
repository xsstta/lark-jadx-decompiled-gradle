package androidx.core.view.p029a;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.view.a.e */
public class C0869e {

    /* renamed from: a */
    private final Object f3402a;

    /* renamed from: a */
    public C0864d mo4629a(int i) {
        return null;
    }

    /* renamed from: a */
    public List<C0864d> mo4631a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo4632a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C0864d mo4633b(int i) {
        return null;
    }

    /* renamed from: a */
    public Object mo4630a() {
        return this.f3402a;
    }

    public C0869e() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3402a = new C0871b(this);
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f3402a = new C0870a(this);
        } else {
            this.f3402a = null;
        }
    }

    /* renamed from: androidx.core.view.a.e$b */
    static class C0871b extends C0870a {
        C0871b(C0869e eVar) {
            super(eVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C0864d b = this.f3403a.mo4633b(i);
            if (b == null) {
                return null;
            }
            return b.mo4551a();
        }
    }

    /* renamed from: androidx.core.view.a.e$a */
    static class C0870a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0869e f3403a;

        C0870a(C0869e eVar) {
            this.f3403a = eVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0864d a = this.f3403a.mo4629a(i);
            if (a == null) {
                return null;
            }
            return a.mo4551a();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C0864d> a = this.f3403a.mo4631a(str, i);
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(a.get(i2).mo4551a());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f3403a.mo4632a(i, i2, bundle);
        }
    }

    public C0869e(Object obj) {
        this.f3402a = obj;
    }
}
