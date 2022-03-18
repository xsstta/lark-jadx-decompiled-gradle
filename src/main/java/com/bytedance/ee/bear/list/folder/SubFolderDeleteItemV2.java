package com.bytedance.ee.bear.list.folder;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.more.itemv2.DeleteItemV2;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.larksuite.suite.R;

public class SubFolderDeleteItemV2 extends DeleteItemV2 {
    private final boolean mIsGrid;
    private final ShareFolderUserPermission mParentPermission;
    private final String mParentToken;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem, com.bytedance.ee.bear.list.more.itemv2.DeleteItemV2
    public boolean isVisible() {
        if (TextUtils.equals(this.mParentToken, this.mDocument.mo32472o())) {
            return false;
        }
        return this.mIsGrid;
    }

    @Override // com.bytedance.ee.bear.list.more.itemv2.DeleteItemV2, com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        if (!C5084ad.m20847d().mo20038b().mo20041b()) {
            return false;
        }
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo instanceof DocMoreInfo) {
            ShareFolderUserPermission shareFolderUserPermission = this.mParentPermission;
            if (shareFolderUserPermission == null || !shareFolderUserPermission.canMoveSubNode() || !moreInfo.mo39026a()) {
                return false;
            }
            return true;
        } else if (!(moreInfo instanceof FolderMoreInfo)) {
            return false;
        } else {
            ShareFolderUserPermission A = ((FolderMoreInfo) moreInfo).mo39060A();
            ShareFolderUserPermission shareFolderUserPermission2 = this.mParentPermission;
            if (shareFolderUserPermission2 == null || !shareFolderUserPermission2.canMoveSubNode() || A == null || !A.canBeMoved()) {
                return false;
            }
            return true;
        }
    }

    public SubFolderDeleteItemV2(Document document, boolean z, String str, ShareFolderUserPermission shareFolderUserPermission, AbstractC8544i.AbstractC8545a aVar) {
        super(document, R.string.Doc_List_Remove, aVar);
        this.mIsGrid = z;
        this.mParentToken = str;
        this.mParentPermission = shareFolderUserPermission;
    }
}
