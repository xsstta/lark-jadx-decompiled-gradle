package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* access modifiers changed from: package-private */
public class as implements AbstractC1527at {

    /* renamed from: a */
    private final WindowId f5376a;

    public int hashCode() {
        return this.f5376a.hashCode();
    }

    as(View view) {
        this.f5376a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof as) || !((as) obj).f5376a.equals(this.f5376a)) {
            return false;
        }
        return true;
    }
}
