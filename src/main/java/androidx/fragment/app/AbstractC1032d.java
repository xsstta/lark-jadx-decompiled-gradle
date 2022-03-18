package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.fragment.app.d */
public abstract class AbstractC1032d {
    /* renamed from: a */
    public abstract View mo5236a(int i);

    /* renamed from: a */
    public abstract boolean mo5237a();

    /* renamed from: a */
    public Fragment mo5531a(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }
}
