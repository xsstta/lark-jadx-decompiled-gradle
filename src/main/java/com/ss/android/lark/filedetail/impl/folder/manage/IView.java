package com.ss.android.lark.filedetail.impl.folder.manage;

import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FilePreviewInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0018\u0010\u0007\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/IView$Delegate;", "finishLoadMore", "", "handlerBackPressed", "showError", "updateFileList", "list", "", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "Delegate", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.e */
public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "canDoLoadMore", "", "getCurFolderKey", "", "getFileLayoutType", "", "onLoadFileInfo", "", "key", "onLoadMore", "saveFileLayoutType", ShareHitPoint.f121869d, "updateLoadStep", "step", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.e$a */
    public interface Delegate extends IView.IViewDelegate {
        /* renamed from: a */
        void mo139923a();

        /* renamed from: a */
        void mo139924a(int i);

        /* renamed from: a */
        void mo139925a(String str);

        /* renamed from: b */
        void mo139926b(int i);

        /* renamed from: b */
        boolean mo139927b();

        /* renamed from: c */
        String mo139928c();

        /* renamed from: d */
        int mo139929d();
    }

    /* renamed from: a */
    void mo139861a(List<FilePreviewInfo> list);

    /* renamed from: d */
    void mo139864d();

    /* renamed from: e */
    void mo139865e();

    /* renamed from: f */
    void mo139866f();
}
