package com.bytedance.ee.bear.list.folder;

import android.view.View;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.folder.complaint.FolderForbiddenView;
import com.bytedance.ee.bear.list.list.AbstractC8544i;

/* renamed from: com.bytedance.ee.bear.list.folder.ac */
public interface AbstractC8317ac extends ao, AbstractC8544i<AbstractC8318a> {

    /* renamed from: com.bytedance.ee.bear.list.folder.ac$a */
    public interface AbstractC8318a extends FolderForbiddenView.AbstractC8342a, AbstractC8544i.AbstractC8545a {
        /* renamed from: a */
        void mo32649a(View view, int i, Document document, boolean z);
    }

    /* renamed from: a */
    void mo32713a(Document document);

    /* renamed from: a */
    void mo32714a(FolderForbiddenView.ForbiddenState forbiddenState);
}
