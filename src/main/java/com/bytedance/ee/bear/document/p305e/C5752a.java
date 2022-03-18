package com.bytedance.ee.bear.document.p305e;

import androidx.lifecycle.AbstractC1142af;

/* renamed from: com.bytedance.ee.bear.document.e.a */
public class C5752a extends AbstractC1142af {
    private AbstractC5753a delegate;

    /* renamed from: com.bytedance.ee.bear.document.e.a$a */
    public interface AbstractC5753a {
        /* renamed from: a */
        void mo18707a(int i);
    }

    public void hideFab() {
        AbstractC5753a aVar = this.delegate;
        if (aVar != null) {
            aVar.mo18707a(8);
        }
    }

    public void showFab() {
        AbstractC5753a aVar = this.delegate;
        if (aVar != null) {
            aVar.mo18707a(0);
        }
    }

    public void setDelegate(AbstractC5753a aVar) {
        this.delegate = aVar;
    }
}
