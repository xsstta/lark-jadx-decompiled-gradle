package com.bytedance.ee.bear.doc.structure;

import android.view.View;
import androidx.lifecycle.LiveData;

/* renamed from: com.bytedance.ee.bear.doc.structure.c */
public interface AbstractC5535c<Content> {

    /* renamed from: com.bytedance.ee.bear.doc.structure.c$a */
    public interface AbstractC5536a {
        void onContentScrolled(View view, int i, int i2, int i3, int i4);
    }

    void changeCollapseStatus(String str, boolean z);

    int computeContentHeight();

    String getActive();

    LiveData<Content> getContent();

    int getContentHeight();

    int getContentScroll();

    boolean isUpdateActiveByFixedStructure();

    void scrollTo(int i, int i2);

    void scrollTo(String str);

    void setActive(String str);

    void setContentScrollListener(AbstractC5536a aVar);

    void setContentTouchListener(View.OnTouchListener onTouchListener);

    void setIsUpdateActiveByFixedStructure(boolean z);
}
