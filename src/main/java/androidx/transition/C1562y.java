package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.transition.y */
public class C1562y {

    /* renamed from: a */
    public final Map<String, Object> f5458a = new HashMap();

    /* renamed from: b */
    public View f5459b;

    /* renamed from: c */
    final ArrayList<Transition> f5460c = new ArrayList<>();

    public int hashCode() {
        return (this.f5459b.hashCode() * 31) + this.f5458a.hashCode();
    }

    public C1562y() {
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f5459b + "\n") + "    values:";
        for (String str2 : this.f5458a.keySet()) {
            str = str + "    " + str2 + ": " + this.f5458a.get(str2) + "\n";
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1562y)) {
            return false;
        }
        C1562y yVar = (C1562y) obj;
        if (this.f5459b != yVar.f5459b || !this.f5458a.equals(yVar.f5458a)) {
            return false;
        }
        return true;
    }

    public C1562y(View view) {
        this.f5459b = view;
    }
}
