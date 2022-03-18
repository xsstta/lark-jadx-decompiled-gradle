package androidx.appcompat.p019b;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: androidx.appcompat.b.a */
public class C0280a implements TransformationMethod {

    /* renamed from: a */
    private Locale f789a;

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public C0280a(Context context) {
        this.f789a = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f789a);
        }
        return null;
    }
}
