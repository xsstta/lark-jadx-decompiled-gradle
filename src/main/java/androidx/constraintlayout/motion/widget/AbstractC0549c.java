package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.c */
public abstract class AbstractC0549c {

    /* renamed from: a */
    public static int f2095a = -1;

    /* renamed from: b */
    int f2096b;

    /* renamed from: c */
    int f2097c;

    /* renamed from: d */
    String f2098d;

    /* renamed from: e */
    protected int f2099e;

    /* renamed from: f */
    HashMap<String, ConstraintAttribute> f2100f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo3232a(Context context, AttributeSet attributeSet);

    /* renamed from: a */
    public abstract void mo3233a(HashMap<String, AbstractC0588r> hashMap);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo3234a(HashSet<String> hashSet);

    /* renamed from: b */
    public void mo3236b(HashMap<String, Integer> hashMap) {
    }

    public AbstractC0549c() {
        int i = f2095a;
        this.f2096b = i;
        this.f2097c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3235a(String str) {
        String str2 = this.f2098d;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }
}
