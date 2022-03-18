package com.ss.android.lark.filedetail.impl.folder.manage;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FilePreviewInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH&J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH&J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/IModel;", "Lcom/larksuite/framework/mvp/IModel;", "canDoLoadMoreFile", "", "getCurFolderCount", "", "getCurFolderKey", "", "getFileLayoutType", "", "loadMoreFileInfo", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "folderKey", "saveFileLayoutType", ShareHitPoint.f121869d, "updateLoadStep", "step", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.d */
public interface IModel extends com.larksuite.framework.mvp.IModel {
    /* renamed from: a */
    String mo139909a();

    /* renamed from: a */
    void mo139910a(int i);

    /* renamed from: a */
    void mo139911a(IGetDataCallback<List<FilePreviewInfo>> iGetDataCallback);

    /* renamed from: a */
    void mo139912a(String str, IGetDataCallback<List<FilePreviewInfo>> iGetDataCallback);

    /* renamed from: b */
    void mo139913b(int i);

    /* renamed from: b */
    boolean mo139914b();

    /* renamed from: c */
    long mo139915c();

    /* renamed from: d */
    int mo139916d();
}
