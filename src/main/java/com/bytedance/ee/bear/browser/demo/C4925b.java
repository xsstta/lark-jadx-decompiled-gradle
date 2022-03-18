package com.bytedance.ee.bear.browser.demo;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;

/* renamed from: com.bytedance.ee.bear.browser.demo.b */
public class C4925b extends AbstractC1142af {
    private C1177w<WebData> webData = new C1177w<>();

    public LiveData<WebData> getWebData() {
        return this.webData;
    }

    public void updateWebData(WebData webData2) {
        this.webData.mo5929b(webData2);
    }
}
