package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure;

import androidx.lifecycle.LiveData;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.b */
public interface AbstractC7479b<Content> {
    void changeCollapseStatus(String str, boolean z);

    String getActive();

    LiveData<Content> getContent();

    void scrollTo(String str);

    void setActive(String str);
}
