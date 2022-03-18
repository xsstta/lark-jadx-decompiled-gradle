package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;
import com.larksuite.suite.R;

/* renamed from: androidx.core.view.t */
public final class C0918t {
    /* renamed from: a */
    public static boolean m4410a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(R.id.tag_transition_group);
        if ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && ViewCompat.m4106u(viewGroup) == null) {
            return false;
        }
        return true;
    }
}
