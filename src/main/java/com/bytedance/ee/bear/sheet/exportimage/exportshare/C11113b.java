package com.bytedance.ee.bear.sheet.exportimage.exportshare;

import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.export.AbstractC5168a;
import com.bytedance.ee.bear.contract.export.ExportFormatEnum;
import com.bytedance.ee.bear.document.export.p308c.AbstractC5762a;

/* renamed from: com.bytedance.ee.bear.sheet.exportimage.exportshare.b */
public class C11113b extends AbstractC5762a<AbstractC11114a> {
    private C1177w<Boolean> active = new C1177w<>();
    private AbstractC11114a exportShareDelegate;
    private C1177w<String[]> shareItems = new C1177w<>();

    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.exportshare.b$a */
    public interface AbstractC11114a extends AbstractC5762a.AbstractC5763a {

        /* renamed from: com.bytedance.ee.bear.sheet.exportimage.exportshare.b$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(AbstractC11114a aVar, ExportFormatEnum exportFormatEnum, AbstractC5168a aVar2) {
            }

            public static void $default$a(AbstractC11114a aVar, String str) {
            }

            public static void $default$b(AbstractC11114a aVar, String str) {
            }

            public static void $default$c(AbstractC11114a aVar) {
            }

            public static void $default$c(AbstractC11114a aVar, String str) {
            }
        }

        @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
        /* renamed from: a */
        void mo23197a(ExportFormatEnum exportFormatEnum, AbstractC5168a aVar);

        @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
        /* renamed from: a */
        void mo23198a(String str);

        @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
        /* renamed from: b */
        void mo23199b(String str);

        @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
        /* renamed from: c */
        void mo23200c();

        @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
        /* renamed from: c */
        void mo23201c(String str);

        /* renamed from: d */
        void mo42379d(String str);
    }

    public LiveData<Boolean> getActive() {
        return this.active;
    }

    public C1177w<String[]> getShareItems() {
        return this.shareItems;
    }

    public void onCancel() {
        AbstractC11114a aVar = this.exportShareDelegate;
        if (aVar != null) {
            aVar.mo42379d("close");
        }
        setActiveValue(false);
    }

    public void setExportShareDelegate(AbstractC11114a aVar) {
        this.exportShareDelegate = aVar;
    }

    public void setShareItems(String[] strArr) {
        this.shareItems.mo5929b(strArr);
    }

    public void onClickItem(String str) {
        AbstractC11114a aVar = this.exportShareDelegate;
        if (aVar != null) {
            aVar.mo42379d(str);
        }
        setActiveValue(false);
    }

    public void setActiveValue(boolean z) {
        this.active.mo5929b(Boolean.valueOf(z));
    }
}
