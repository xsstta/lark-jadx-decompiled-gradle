package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.p029a.C0864d;
import androidx.core.view.p029a.C0869e;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.view.a */
public class C0859a {

    /* renamed from: a */
    private static final View.AccessibilityDelegate f3347a = new View.AccessibilityDelegate();

    /* renamed from: b */
    private final View.AccessibilityDelegate f3348b;

    /* renamed from: c */
    private final View.AccessibilityDelegate f3349c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View.AccessibilityDelegate mo4531a() {
        return this.f3349c;
    }

    public C0859a() {
        this(f3347a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.a$a */
    public static final class C0860a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0859a f3350a;

        C0860a(C0859a aVar) {
            this.f3350a = aVar;
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0869e a = this.f3350a.mo4532a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.mo4630a();
            }
            return null;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3350a.mo4538b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3350a.mo4540d(view, accessibilityEvent);
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3350a.mo4539c(view, accessibilityEvent);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f3350a.mo4533a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3350a.mo4534a(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0864d a = C0864d.m4171a(accessibilityNodeInfo);
            a.mo4606n(ViewCompat.m4018L(view));
            a.mo4610p(ViewCompat.m4020N(view));
            a.mo4591h(ViewCompat.m4019M(view));
            this.f3350a.mo4535a(view, a);
            a.mo4558a(accessibilityNodeInfo.getText(), view);
            List<C0864d.C0865a> b = C0859a.m4153b(view);
            for (int i = 0; i < b.size(); i++) {
                a.mo4555a(b.get(i));
            }
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3350a.mo4537a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f3350a.mo4536a(view, i, bundle);
        }
    }

    public C0859a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3348b = accessibilityDelegate;
        this.f3349c = new C0860a(this);
    }

    /* renamed from: b */
    static List<C0864d.C0865a> m4153b(View view) {
        List<C0864d.C0865a> list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: a */
    public C0869e mo4532a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f3348b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0869e(accessibilityNodeProvider);
    }

    /* renamed from: a */
    public void mo4533a(View view, int i) {
        this.f3348b.sendAccessibilityEvent(view, i);
    }

    /* renamed from: b */
    public boolean mo4538b(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3348b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo4539c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3348b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo4540d(View view, AccessibilityEvent accessibilityEvent) {
        this.f3348b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo4534a(View view, AccessibilityEvent accessibilityEvent) {
        this.f3348b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: a */
    private boolean m4151a(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m4152a(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    private boolean m4152a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] d = C0864d.m4178d(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (d != null && i < d.length) {
                if (clickableSpan.equals(d[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo4535a(View view, C0864d dVar) {
        this.f3348b.onInitializeAccessibilityNodeInfo(view, dVar.mo4551a());
    }

    /* renamed from: a */
    public boolean mo4536a(View view, int i, Bundle bundle) {
        List<C0864d.C0865a> b = m4153b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b.size()) {
                break;
            }
            C0864d.C0865a aVar = b.get(i2);
            if (aVar.mo4623a() == i) {
                z = aVar.mo4625a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f3348b.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span) {
            return z;
        }
        return m4151a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: a */
    public boolean mo4537a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3348b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
