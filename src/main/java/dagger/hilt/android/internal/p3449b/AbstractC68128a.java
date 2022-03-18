package dagger.hilt.android.internal.p3449b;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

/* access modifiers changed from: package-private */
@Module
/* renamed from: dagger.hilt.android.internal.b.a */
public abstract class AbstractC68128a {
    @Provides
    @Reusable
    /* renamed from: a */
    static FragmentActivity m264768a(Activity activity) {
        try {
            return (FragmentActivity) activity;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e);
        }
    }
}
