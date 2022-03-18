package com.bytedance.ee.bear.document.export.p308c;

import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.document.export.p308c.AbstractC5762a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.export.c.b */
public class C5764b extends AbstractC5762a<AbstractC5765a> {

    /* renamed from: com.bytedance.ee.bear.document.export.c.b$a */
    public interface AbstractC5765a extends AbstractC5762a.AbstractC5763a {
        /* renamed from: a */
        boolean mo23205a();

        /* renamed from: b */
        void mo23206b();
    }

    public AbstractC5765a getDelegate() {
        return (AbstractC5765a) this.delegate;
    }

    public boolean shouldShowDocShot() {
        if (this.delegate != null) {
            return ((AbstractC5765a) this.delegate).mo23205a();
        }
        return false;
    }

    public void startDocShot(AbstractC5089af.AbstractC5092c cVar) {
        ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20189a(ShareType.ExportImage.name(), cVar);
    }
}
