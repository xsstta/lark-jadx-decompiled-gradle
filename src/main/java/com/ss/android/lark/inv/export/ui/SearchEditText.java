package com.ss.android.lark.inv.export.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;

public class SearchEditText extends EditText {

    /* renamed from: a */
    public AbstractC40097a f101917a;

    /* renamed from: b */
    public String f101918b;

    /* renamed from: c */
    private Runnable f101919c;

    /* renamed from: com.ss.android.lark.inv.export.ui.SearchEditText$a */
    public interface AbstractC40097a {
        /* renamed from: a */
        void mo145636a(String str);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f101919c);
        super.onDetachedFromWindow();
    }

    public void setTextWithoutSpaceChangedListener(AbstractC40097a aVar) {
        this.f101917a = aVar;
    }

    public SearchEditText(Context context) {
        this(context, null);
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f101918b = "";
        this.f101919c = new Runnable() {
            /* class com.ss.android.lark.inv.export.ui.SearchEditText.RunnableC400961 */

            public void run() {
                if (SearchEditText.this.f101917a != null) {
                    String replace = SearchEditText.this.getText().toString().replace(" ", "");
                    if (!TextUtils.equals(SearchEditText.this.f101918b, replace)) {
                        SearchEditText.this.f101918b = replace;
                        SearchEditText.this.f101917a.mo145636a(SearchEditText.this.f101918b);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        removeCallbacks(this.f101919c);
        postDelayed(this.f101919c, 300);
    }
}
