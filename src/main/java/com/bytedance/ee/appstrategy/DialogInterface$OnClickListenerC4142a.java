package com.bytedance.ee.appstrategy;

import android.content.DialogInterface;
import com.bytedance.ee.appstrategy.C4149b;

/* renamed from: com.bytedance.ee.appstrategy.a */
class DialogInterface$OnClickListenerC4142a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private C4149b.C4150a f12593a;

    /* renamed from: b */
    private AbstractC4152d f12594b;

    public DialogInterface$OnClickListenerC4142a(C4149b.C4150a aVar, AbstractC4152d dVar) {
        this.f12593a = aVar;
        this.f12594b = dVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f12593a.f12612b;
        if (i2 == 2) {
            this.f12594b.mo16255a(this.f12593a.f12613c);
        } else if (i2 == 3) {
            this.f12594b.mo16256a(this.f12593a.f12615e, this.f12593a.f12614d);
        } else if (i2 == 4) {
            this.f12594b.mo16254a();
        }
        this.f12594b.mo16257a(this.f12593a.f12616f);
    }
}
