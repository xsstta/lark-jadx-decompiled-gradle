package com.bytedance.ee.bear.document.toolbar.selectcolor.p322a;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;

/* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.i */
public class C6265i extends AbstractC1142af {
    private AbstractC6266a delegate;
    private C1177w<Highlight> highlightLiveData;

    /* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.i$a */
    public interface AbstractC6266a {
        void onColorSelected(Highlight.ColorItem colorItem, Highlight.ColorItem colorItem2, Highlight.ColorItem colorItem3, Highlight.ColorItem colorItem4);
    }

    /* access modifiers changed from: package-private */
    public LiveData<Highlight> getHighlightLiveData() {
        if (this.highlightLiveData == null) {
            this.highlightLiveData = new C1177w<>();
        }
        return this.highlightLiveData;
    }

    public void setDelegate(AbstractC6266a aVar) {
        this.delegate = aVar;
    }

    public void updateHighlight(Highlight highlight) {
        ((C1177w) getHighlightLiveData()).mo5929b(highlight);
    }

    /* access modifiers changed from: package-private */
    public void selectColor(Highlight.ColorItem colorItem, Highlight.ColorItem colorItem2, Highlight.ColorItem colorItem3, Highlight.ColorItem colorItem4) {
        AbstractC6266a aVar = this.delegate;
        if (aVar != null) {
            aVar.onColorSelected(colorItem, colorItem2, colorItem3, colorItem4);
        }
    }
}
