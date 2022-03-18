package com.bytedance.ee.bear.document.imageviewer.diagram;

import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5181a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\"\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0013\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "mDelegate", "Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramViewModel$Delegate;", "mDiagramBase64DataRequestListener", "Lcom/bytedance/ee/bear/contract/imageviewer/delegate/DiagramDataDelegate$DiagramBase64DataRequestListener;", "notifyDiagramBase64DataResult", "", "uuid", "", "base64String", "registerDiagramBase64DataRequestListener", "requestDiagramSVGData", "index", "", "listener", "Lcom/bytedance/ee/bear/contract/imageviewer/delegate/DiagramDataDelegate$DiagramSVGDataRequestListener;", "setDelegate", "unregisterDiagramBase64DataRequestListener", "Delegate", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.imageviewer.diagram.a */
public final class DiagramViewModel extends AbstractC1142af {
    private Delegate mDelegate;
    private AbstractC5181a.AbstractC5182a mDiagramBase64DataRequestListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramViewModel$Delegate;", "", "onRequestDiagramSVGData", "", "uuid", "", "index", "", "listener", "Lcom/bytedance/ee/bear/contract/imageviewer/delegate/DiagramDataDelegate$DiagramSVGDataRequestListener;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.imageviewer.diagram.a$a */
    public interface Delegate {
        /* renamed from: a */
        void mo23535a(String str, int i, AbstractC5181a.AbstractC5183b bVar);
    }

    public final void unregisterDiagramBase64DataRequestListener() {
        this.mDiagramBase64DataRequestListener = null;
    }

    public final void registerDiagramBase64DataRequestListener(AbstractC5181a.AbstractC5182a aVar) {
        this.mDiagramBase64DataRequestListener = aVar;
    }

    public final void setDelegate(Delegate aVar) {
        this.mDelegate = aVar;
    }

    public final void notifyDiagramBase64DataResult(String str, String str2) {
        AbstractC5181a.AbstractC5182a aVar = this.mDiagramBase64DataRequestListener;
        if (aVar != null) {
            aVar.onDataReceived(str, str2);
        }
    }

    public final void requestDiagramSVGData(String str, int i, AbstractC5181a.AbstractC5183b bVar) {
        Delegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo23535a(str, i, bVar);
        }
    }
}
