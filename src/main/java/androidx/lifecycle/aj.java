package androidx.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1144ai;

public class aj {
    /* renamed from: a */
    public static C1144ai m5364a(Fragment fragment) {
        return new C1144ai(fragment);
    }

    /* renamed from: a */
    public static C1144ai m5366a(FragmentActivity fragmentActivity) {
        return new C1144ai(fragmentActivity);
    }

    /* renamed from: a */
    public static C1144ai m5365a(Fragment fragment, C1144ai.AbstractC1146b bVar) {
        if (bVar == null) {
            bVar = fragment.getDefaultViewModelProviderFactory();
        }
        return new C1144ai(fragment.getViewModelStore(), bVar);
    }

    /* renamed from: a */
    public static C1144ai m5367a(FragmentActivity fragmentActivity, C1144ai.AbstractC1146b bVar) {
        if (bVar == null) {
            bVar = fragmentActivity.getDefaultViewModelProviderFactory();
        }
        return new C1144ai(fragmentActivity.getViewModelStore(), bVar);
    }
}
