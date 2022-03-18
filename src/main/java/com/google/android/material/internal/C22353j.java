package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.p988i.AbstractC22318f;
import com.google.android.material.p988i.C22314d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.internal.j */
public class C22353j {

    /* renamed from: a */
    public boolean f54772a = true;

    /* renamed from: b */
    public WeakReference<AbstractC22355a> f54773b = new WeakReference<>(null);

    /* renamed from: c */
    private final TextPaint f54774c = new TextPaint(1);

    /* renamed from: d */
    private final AbstractC22318f f54775d = new AbstractC22318f() {
        /* class com.google.android.material.internal.C22353j.C223541 */

        @Override // com.google.android.material.p988i.AbstractC22318f
        /* renamed from: a */
        public void mo77071a(int i) {
            C22353j.this.f54772a = true;
            AbstractC22355a aVar = C22353j.this.f54773b.get();
            if (aVar != null) {
                aVar.mo76496e();
            }
        }

        @Override // com.google.android.material.p988i.AbstractC22318f
        /* renamed from: a */
        public void mo77072a(Typeface typeface, boolean z) {
            if (!z) {
                C22353j.this.f54772a = true;
                AbstractC22355a aVar = C22353j.this.f54773b.get();
                if (aVar != null) {
                    aVar.mo76496e();
                }
            }
        }
    };

    /* renamed from: e */
    private float f54776e;

    /* renamed from: f */
    private C22314d f54777f;

    /* renamed from: com.google.android.material.internal.j$a */
    public interface AbstractC22355a {
        /* renamed from: e */
        void mo76496e();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    /* renamed from: a */
    public TextPaint mo77856a() {
        return this.f54774c;
    }

    /* renamed from: b */
    public C22314d mo77861b() {
        return this.f54777f;
    }

    /* renamed from: a */
    public void mo77859a(AbstractC22355a aVar) {
        this.f54773b = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    private float m80984a(CharSequence charSequence) {
        if (charSequence == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return this.f54774c.measureText(charSequence, 0, charSequence.length());
    }

    public C22353j(AbstractC22355a aVar) {
        mo77859a(aVar);
    }

    /* renamed from: a */
    public float mo77855a(String str) {
        if (!this.f54772a) {
            return this.f54776e;
        }
        float a = m80984a((CharSequence) str);
        this.f54776e = a;
        this.f54772a = false;
        return a;
    }

    /* renamed from: a */
    public void mo77857a(Context context) {
        this.f54777f.mo77674b(context, this.f54774c, this.f54775d);
    }

    /* renamed from: a */
    public void mo77860a(boolean z) {
        this.f54772a = z;
    }

    /* renamed from: a */
    public void mo77858a(C22314d dVar, Context context) {
        if (this.f54777f != dVar) {
            this.f54777f = dVar;
            if (dVar != null) {
                dVar.mo77675c(context, this.f54774c, this.f54775d);
                AbstractC22355a aVar = this.f54773b.get();
                if (aVar != null) {
                    this.f54774c.drawableState = aVar.getState();
                }
                dVar.mo77674b(context, this.f54774c, this.f54775d);
                this.f54772a = true;
            }
            AbstractC22355a aVar2 = this.f54773b.get();
            if (aVar2 != null) {
                aVar2.mo76496e();
                aVar2.onStateChange(aVar2.getState());
            }
        }
    }
}
