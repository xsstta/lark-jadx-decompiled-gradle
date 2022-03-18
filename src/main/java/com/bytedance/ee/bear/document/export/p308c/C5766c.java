package com.bytedance.ee.bear.document.export.p308c;

import com.bytedance.ee.bear.document.export.p308c.AbstractC5762a;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;

/* renamed from: com.bytedance.ee.bear.document.export.c.c */
public class C5766c extends AbstractC5762a<AbstractC5767a> {

    /* renamed from: com.bytedance.ee.bear.document.export.c.c$a */
    public interface AbstractC5767a extends AbstractC5762a.AbstractC5763a {
        /* renamed from: a */
        void mo23211a(AbstractC6054a aVar);

        /* renamed from: a */
        boolean mo23212a();

        /* renamed from: b */
        void mo23213b();

        /* renamed from: b */
        void mo23214b(AbstractC6054a aVar);
    }

    public void onClickSheetLongImage() {
        if (this.delegate != null) {
            ((AbstractC5767a) this.delegate).mo23213b();
        }
    }

    public boolean shouldShowLongImage() {
        if (this.delegate != null) {
            return ((AbstractC5767a) this.delegate).mo23212a();
        }
        return false;
    }

    public void onOrientationSupportPanelDismiss(AbstractC6054a aVar) {
        if (this.delegate != null) {
            ((AbstractC5767a) this.delegate).mo23214b(aVar);
        }
    }

    public void onOrientationSupportPanelShowing(AbstractC6054a aVar) {
        if (this.delegate != null) {
            ((AbstractC5767a) this.delegate).mo23211a(aVar);
        }
    }
}
