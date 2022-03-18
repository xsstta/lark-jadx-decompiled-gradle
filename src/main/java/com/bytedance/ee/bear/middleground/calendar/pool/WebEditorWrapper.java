package com.bytedance.ee.bear.middleground.calendar.pool;

import android.content.Context;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.middleground.calendar.bean.PlaceholderStyle;
import com.bytedance.ee.bear.middleground.calendar.bean.WebEditorStyle;
import com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8921a;
import com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8922b;
import com.bytedance.ee.bear.middleground.calendar.editor.WebEditorToolbar;
import com.bytedance.ee.bear.middleground.calendar.p440a.AbstractC8912c;
import com.bytedance.ee.bear.middleground.calendar.p440a.C8891a;
import com.bytedance.ee.log.C13479a;

public class WebEditorWrapper extends FrameLayout {
    private C8891a editorWebView;
    private OnDetachFromWindowCallback mDetachCallback;

    interface OnDetachFromWindowCallback {
        void onDetachFromWindow();
    }

    public C8891a getCalendarWebView() {
        return this.editorWebView;
    }

    public void clear() {
        C8891a aVar = this.editorWebView;
        if (aVar != null) {
            aVar.mo22336b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OnDetachFromWindowCallback onDetachFromWindowCallback = this.mDetachCallback;
        if (onDetachFromWindowCallback != null) {
            onDetachFromWindowCallback.onDetachFromWindow();
        }
    }

    public void destroy() {
        setRenderProcessListener(null);
        setOnUrlLoadingCallback(null);
        setAnalyticCallback(null);
        this.editorWebView.mo34133c();
        this.editorWebView.destroy();
    }

    public String toString() {
        return "[WebEditorWrapper: " + hashCode() + "]";
    }

    WebEditorWrapper(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public void setDetachCallback(OnDetachFromWindowCallback onDetachFromWindowCallback) {
        this.mDetachCallback = onDetachFromWindowCallback;
    }

    public void bindEditorToolbar(WebEditorToolbar webEditorToolbar) {
        C8891a aVar = this.editorWebView;
        if (aVar != null) {
            aVar.mo34131a(webEditorToolbar);
        }
    }

    public void loadUrl(String str) {
        C8891a aVar = this.editorWebView;
        if (aVar != null) {
            aVar.loadUrl(str);
        }
    }

    public void setAnalyticCallback(AbstractC8912c cVar) {
        C8891a aVar = this.editorWebView;
        if (aVar != null) {
            aVar.setAnalyticCallback(cVar);
        }
    }

    public void setBodyBackgroundColor(int i) {
        C8891a aVar = this.editorWebView;
        if (aVar != null) {
            aVar.setBodyBackgroundColor(i);
        }
    }

    public void setContent(String str) {
        C8891a aVar = this.editorWebView;
        if (aVar != null) {
            aVar.setContent(str);
        }
    }

    public void setCustomStyle(WebEditorStyle webEditorStyle) {
        C8891a aVar = this.editorWebView;
        if (aVar != null) {
            aVar.setCustomStyle(webEditorStyle);
        }
    }

    public void setData(String str) {
        C8891a aVar = this.editorWebView;
        if (aVar != null) {
            aVar.setData(str);
        }
    }

    public void setEditable(boolean z) {
        C8891a aVar = this.editorWebView;
        if (aVar != null) {
            aVar.setEditable(z);
        }
    }

    public void setOnUrlLoadingCallback(AbstractC8922b bVar) {
        C8891a aVar = this.editorWebView;
        if (aVar != null) {
            aVar.setOnUrlLoadingCallback(bVar);
        }
    }

    public void setPlaceHolder(String str) {
        C8891a aVar = this.editorWebView;
        if (aVar != null) {
            aVar.setPlaceHolder(str);
        }
    }

    public void setPlaceholderStyle(PlaceholderStyle placeholderStyle) {
        C8891a aVar = this.editorWebView;
        if (aVar != null) {
            aVar.setPlaceholderStyle(placeholderStyle);
        }
    }

    public void setRenderProcessListener(AbstractC8921a aVar) {
        C8891a aVar2 = this.editorWebView;
        if (aVar2 != null) {
            aVar2.setRenderProcessListener(aVar);
        }
    }

    public void getData(ValueCallback<String> valueCallback) {
        C8891a aVar = this.editorWebView;
        if (aVar != null && valueCallback != null) {
            aVar.mo34134c(valueCallback);
        }
    }

    public void getHtmlText(ValueCallback<String> valueCallback) {
        C8891a aVar = this.editorWebView;
        if (aVar != null && valueCallback != null) {
            aVar.mo34132b(valueCallback);
        }
    }

    public void getText(ValueCallback<String> valueCallback) {
        C8891a aVar = this.editorWebView;
        if (aVar != null && valueCallback != null) {
            aVar.mo34130a(valueCallback);
        }
    }

    public void hasModify(ValueCallback<Boolean> valueCallback) {
        C8891a aVar = this.editorWebView;
        if (aVar != null && valueCallback != null) {
            aVar.mo34135d(valueCallback);
        }
    }

    /* access modifiers changed from: package-private */
    public void setEditor(C8891a aVar) {
        if (aVar != null) {
            this.editorWebView = aVar;
            addView(aVar);
            C13479a.m54764b("WebEditorWrapper", "setEditor(): WebEditorWrapper:" + hashCode());
            return;
        }
        C13479a.m54775e("WebEditorWrapper", "setEditor(): editor == null");
    }
}
