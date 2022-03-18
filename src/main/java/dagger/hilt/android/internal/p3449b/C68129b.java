package dagger.hilt.android.internal.p3449b;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import dagger.internal.AbstractC68174b;
import dagger.internal.C68177e;
import javax.inject.Provider;

/* renamed from: dagger.hilt.android.internal.b.b */
public final class C68129b implements AbstractC68174b<FragmentActivity> {

    /* renamed from: a */
    private final Provider<Activity> f171366a;

    /* renamed from: a */
    public FragmentActivity mo47880b() {
        return m264769a(this.f171366a.mo47880b());
    }

    /* renamed from: a */
    public static FragmentActivity m264769a(Activity activity) {
        return (FragmentActivity) C68177e.m264826b(AbstractC68128a.m264768a(activity));
    }
}
