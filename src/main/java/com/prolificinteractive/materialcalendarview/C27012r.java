package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.os.Build;
import android.widget.TextView;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26991h;

/* access modifiers changed from: package-private */
/* renamed from: com.prolificinteractive.materialcalendarview.r */
public class C27012r extends TextView {

    /* renamed from: a */
    private AbstractC26991h f67083a = AbstractC26991h.f67018a;

    /* renamed from: b */
    private int f67084b;

    /* renamed from: a */
    public void mo96113a(int i) {
        this.f67084b = i;
        setText(this.f67083a.mo96013a(i));
    }

    /* renamed from: a */
    public void mo96114a(AbstractC26991h hVar) {
        if (hVar == null) {
            hVar = AbstractC26991h.f67018a;
        }
        this.f67083a = hVar;
        mo96113a(this.f67084b);
    }

    public C27012r(Context context, int i) {
        super(context);
        setGravity(17);
        if (Build.VERSION.SDK_INT >= 17) {
            setTextAlignment(4);
        }
        mo96113a(i);
    }
}
