package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.more.itemv2.DeleteItemV2;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;

public class MyRootFolderDeleteItemV2 extends DeleteItemV2 {
    private final boolean mIsGrid;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem, com.bytedance.ee.bear.list.more.itemv2.DeleteItemV2
    public boolean isVisible() {
        return this.mIsGrid;
    }

    @Override // com.bytedance.ee.bear.list.more.itemv2.DeleteItemV2, com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        ShareFolderUserPermission A;
        if (!C5084ad.m20847d().mo20038b().mo20041b()) {
            return false;
        }
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null && moreInfo.mo39036e() != C8275a.f22370c.mo32555b() && !DocVersion.isDocV2(moreInfo.mo39031c())) {
            return true;
        }
        if (moreInfo instanceof DocMoreInfo) {
            return ((DocMoreInfo) moreInfo).mo39005A().mo38591a().canOperateEntity();
        }
        if (!(moreInfo instanceof FolderMoreInfo) || (A = ((FolderMoreInfo) moreInfo).mo39060A()) == null || !A.canBeMoved()) {
            return false;
        }
        return true;
    }

    public MyRootFolderDeleteItemV2(Document document, boolean z, int i, AbstractC8544i.AbstractC8545a aVar) {
        super(document, i, aVar);
        this.mIsGrid = z;
    }
}
