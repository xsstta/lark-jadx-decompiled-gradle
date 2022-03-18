package com.bytedance.ee.bear.list.folderselect;

import android.view.View;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import io.reactivex.AbstractC68307f;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.folderselect.e */
public interface AbstractC8403e {

    /* renamed from: com.bytedance.ee.bear.list.folderselect.e$a */
    public interface AbstractC8404a extends IModel {
        /* renamed from: a */
        AbstractC68307f<DocumentListInfo> mo32853a();
    }

    /* renamed from: com.bytedance.ee.bear.list.folderselect.e$b */
    public interface AbstractC8405b extends IView<AbstractC8406a> {

        /* renamed from: com.bytedance.ee.bear.list.folderselect.e$b$a */
        public interface AbstractC8406a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo32855a();

            /* renamed from: a */
            void mo32856a(View view, int i, Document document);

            /* renamed from: b */
            void mo32857b();

            /* renamed from: c */
            void mo32858c();
        }

        /* renamed from: a */
        void mo32854a(List<Document> list);
    }
}
