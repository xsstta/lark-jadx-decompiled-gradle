package com.ss.android.lark.filedetail.impl.folder.manage.service;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FolderPreviewLoadParams;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FolderPreviewResponse;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/service/IFolderService;", "", "getFolderBrowseInfo", "", "params", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FolderPreviewLoadParams;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FolderPreviewResponse;", "getUserFileLayoutType", "", "userId", "", "saveUserFileLayoutType", ShareHitPoint.f121869d, "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.a.b */
public interface IFolderService {
    /* renamed from: a */
    int mo139881a(String str);

    /* renamed from: a */
    void mo139883a(FolderPreviewLoadParams bVar, IGetDataCallback<FolderPreviewResponse> iGetDataCallback);

    /* renamed from: a */
    void mo139884a(String str, int i);
}
