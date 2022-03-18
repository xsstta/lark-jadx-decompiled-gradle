package com.bytedance.ee.bear.list.folderselect;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import io.reactivex.AbstractC68307f;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.folderselect.f */
public interface AbstractC8407f {

    /* renamed from: com.bytedance.ee.bear.list.folderselect.f$a */
    public interface AbstractC8408a extends IModel {
        /* renamed from: a */
        AbstractC68307f<DocumentListInfo> mo32859a();

        /* renamed from: a */
        void mo32860a(Activity activity, IGetDataCallback<DocumentCreateInfo> iGetDataCallback);

        /* renamed from: b */
        AbstractC68307f<GetMyRootFolderTokenResult> mo32861b();
    }

    /* renamed from: com.bytedance.ee.bear.list.folderselect.f$b */
    public interface AbstractC8409b extends IView<AbstractC8410a> {

        /* renamed from: com.bytedance.ee.bear.list.folderselect.f$b$a */
        public interface AbstractC8410a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo32870a();

            /* renamed from: a */
            void mo32871a(View view, int i, Document document);

            /* renamed from: b */
            void mo32872b();

            /* renamed from: c */
            void mo32873c();

            /* renamed from: d */
            void mo32874d();

            /* renamed from: e */
            void mo32875e();

            /* renamed from: f */
            void mo32876f();

            /* renamed from: g */
            void mo32877g();
        }

        /* renamed from: a */
        void mo32862a();

        /* renamed from: a */
        void mo32863a(Document document);

        /* renamed from: a */
        void mo32864a(ShareFolderUserPermission shareFolderUserPermission);

        /* renamed from: a */
        void mo32865a(Throwable th);

        /* renamed from: a */
        void mo32866a(List<Document> list);

        /* renamed from: a */
        void mo32867a(boolean z);

        /* renamed from: b */
        void mo32868b();

        /* renamed from: c */
        void mo32869c();
    }
}
