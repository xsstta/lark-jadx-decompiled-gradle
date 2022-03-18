package com.bytedance.ee.bear.drive.biz.preview.vc;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.drive.view.preview.pdf.ExhibitionMode;

/* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.d */
public interface AbstractC6730d {

    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.d$a */
    public interface AbstractC6731a {
        /* renamed from: a */
        void mo26494a();

        /* renamed from: a */
        void mo26495a(int i);

        /* renamed from: a */
        void mo26496a(ExhibitionMode exhibitionMode, int i);
    }

    /* renamed from: a */
    int mo26485a(int i);

    ExhibitionMode getCurrentMode();

    int getCurrentPage();

    RecyclerView getNormalModeFollowView();

    int getPageCount();

    void setCurrentPosition(int i);

    void setExhibitionMode(ExhibitionMode exhibitionMode);

    void setPDFActionListener(AbstractC6731a aVar);

    void setPresentationPage(int i);
}
