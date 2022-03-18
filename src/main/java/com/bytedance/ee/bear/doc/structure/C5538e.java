package com.bytedance.ee.bear.doc.structure;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.doc.structure.AbstractC5535c;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.log.C13479a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.Locale;

/* renamed from: com.bytedance.ee.bear.doc.structure.e */
public class C5538e extends AbstractC1142af implements AbstractC5535c<Structure> {
    private View.OnTouchListener contentTouchDispatcher = new View.OnTouchListener() {
        /* class com.bytedance.ee.bear.doc.structure.$$Lambda$e$rJu3rYC0s2RPy4AElpnMXkC_dhs */

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return C5538e.this.dispatchContentTouch(view, motionEvent);
        }
    };
    private View.OnTouchListener contentTouchListener;
    private boolean fixMode;
    private String floatingActiveContentId;
    private C1177w<Boolean> floatingStructureVisible = new C1177w<>();
    private boolean isUpdateActiveByFixedStructure;
    private final int[] scrollConsumed = new int[2];
    private DocBridgeWebViewV2.AbstractC5605c scrollDispatchProxy = new DocBridgeWebViewV2.AbstractC5605c() {
        /* class com.bytedance.ee.bear.doc.structure.$$Lambda$e$qHzaNg7Obp1sNeyKLF9uzMfOeQ */

        @Override // com.bytedance.ee.bear.document.DocBridgeWebViewV2.AbstractC5605c
        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            C5538e.this.dispatchScroll(view, i, i2, i3, i4);
        }
    };
    private AbstractC5535c.AbstractC5536a scrollListener;
    private final int[] scrollOffset = new int[2];
    private C1177w<Structure> structure;
    private C5537d structureAnalytic = new C5537d();
    private AbstractC4931i web;

    public C1177w<Boolean> floatingStructureVisible() {
        return this.floatingStructureVisible;
    }

    /* access modifiers changed from: package-private */
    public C5537d getStructureAnalytic() {
        return this.structureAnalytic;
    }

    /* access modifiers changed from: package-private */
    public boolean isFixMode() {
        return this.fixMode;
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public boolean isUpdateActiveByFixedStructure() {
        return this.isUpdateActiveByFixedStructure;
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public int computeContentHeight() {
        return contentHeight(true);
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public String getActive() {
        String str = this.floatingActiveContentId;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public int getContentHeight() {
        return contentHeight(false);
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public LiveData<Structure> getContent() {
        if (this.structure == null) {
            this.structure = new C1177w<>();
        }
        return this.structure;
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public int getContentScroll() {
        AbstractC4931i iVar = this.web;
        if (iVar != null) {
            return iVar.mo19435b().getScrollY();
        }
        return 0;
    }

    public int getHeight() {
        AbstractC4931i iVar = this.web;
        if (iVar == null) {
            return 0;
        }
        return iVar.mo19435b().getHeight();
    }

    /* access modifiers changed from: package-private */
    public void onDetach() {
        this.web.mo19436b(this.contentTouchDispatcher);
        ((DocBridgeWebViewV2) this.web.mo19435b()).mo22339b(this.scrollDispatchProxy);
        setStructure(null);
        this.web = null;
        this.floatingActiveContentId = null;
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public void setActive(String str) {
        this.floatingActiveContentId = str;
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public void setContentScrollListener(AbstractC5535c.AbstractC5536a aVar) {
        this.scrollListener = aVar;
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public void setContentTouchListener(View.OnTouchListener onTouchListener) {
        this.contentTouchListener = onTouchListener;
    }

    /* access modifiers changed from: package-private */
    public void setFixMode(boolean z) {
        this.fixMode = z;
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public void setIsUpdateActiveByFixedStructure(boolean z) {
        this.isUpdateActiveByFixedStructure = z;
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public void scrollTo(String str) {
        if (this.web != null) {
            String format = String.format(Locale.ENGLISH, "window.lark.biz.navigation.jump", new Object[0]);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("hash", (Object) str);
            this.web.mo19428a(format, jSONObject);
        }
    }

    /* access modifiers changed from: package-private */
    public void setWeb(AbstractC4931i iVar) {
        this.web = iVar;
        iVar.mo19422a(this.contentTouchDispatcher);
        ((DocBridgeWebViewV2) iVar.mo19435b()).mo22327a(this.scrollDispatchProxy);
    }

    private int contentHeight(boolean z) {
        int i;
        AbstractC4931i iVar = this.web;
        if (iVar == null) {
            return 0;
        }
        if (z) {
            i = ((DocBridgeWebViewV2) iVar.mo19435b()).computeVerticalScrollRange();
        } else {
            i = ((DocBridgeWebViewV2) iVar.mo19435b()).getLastVerticalScrollRange();
        }
        return i - getHeight();
    }

    private void updateWebViewScrollBarStyle(boolean z) {
        C13479a.m54772d("StructureViewModel", "updateWebViewScrollBarStyle:" + z);
        AbstractC4931i iVar = this.web;
        if (iVar != null) {
            iVar.mo19435b().setVerticalScrollBarEnabled(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void setStructure(Structure structure2) {
        C1177w wVar = (C1177w) getContent();
        boolean z = true;
        boolean z2 = !Structure.equals((Structure) wVar.mo5927b(), structure2);
        C13479a.m54764b("StructureViewModel", "setStructure diff?" + z2);
        if (z2) {
            wVar.mo5929b(structure2);
            if (structure2 != null) {
                z = false;
            }
            updateWebViewScrollBarStyle(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void resetAnalytic(DocViewModel docViewModel, AbstractC5233x xVar) {
        this.structureAnalytic.mo22103a(docViewModel, xVar);
    }

    /* access modifiers changed from: private */
    public boolean dispatchContentTouch(View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.contentTouchListener;
        if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public void changeCollapseStatus(String str, boolean z) {
        String format = String.format(Locale.ENGLISH, "window.lark.biz.headings.switchHeading", new Object[0]);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hash", (Object) str);
        jSONObject.put(UpdateKey.STATUS, (Object) Boolean.valueOf(z));
        this.web.mo19428a(format, jSONObject);
    }

    @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c
    public void scrollTo(int i, int i2) {
        AbstractC4931i iVar = this.web;
        if (iVar != null) {
            WebView b = iVar.mo19435b();
            b.startNestedScroll(2);
            if (b.dispatchNestedPreScroll(0, i2 - i, this.scrollConsumed, this.scrollOffset)) {
                i2 -= this.scrollConsumed[1];
            }
            b.stopNestedScroll();
            b.scrollTo(0, i2);
        }
    }

    /* access modifiers changed from: private */
    public void dispatchScroll(View view, int i, int i2, int i3, int i4) {
        AbstractC5535c.AbstractC5536a aVar = this.scrollListener;
        if (aVar != null) {
            aVar.onContentScrolled(view, i, i2, i3, i4);
        }
    }
}
