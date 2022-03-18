package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m6701t();
    }

    /* renamed from: t */
    private void m6701t() {
        mo7874a(1);
        mo7933a(new Fade(2)).mo7933a(new ChangeBounds()).mo7933a(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6701t();
    }
}
