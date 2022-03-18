package dagger.hilt.android.internal;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: dagger.hilt.android.internal.a */
public final class C68120a {
    /* renamed from: a */
    public static Application m264754a(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }
}
