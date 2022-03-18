package androidx.transition;

import android.view.ViewGroup;
import com.larksuite.suite.R;

/* renamed from: androidx.transition.q */
public class C1551q {

    /* renamed from: a */
    private ViewGroup f5427a;

    /* renamed from: b */
    private Runnable f5428b;

    /* renamed from: a */
    public void mo8051a() {
        Runnable runnable;
        if (m7112a(this.f5427a) == this && (runnable = this.f5428b) != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static C1551q m7112a(ViewGroup viewGroup) {
        return (C1551q) viewGroup.getTag(R.id.transition_current_scene);
    }

    /* renamed from: a */
    static void m7113a(ViewGroup viewGroup, C1551q qVar) {
        viewGroup.setTag(R.id.transition_current_scene, qVar);
    }
}
