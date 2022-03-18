package com.bytedance.ee.bear.list.folder;

import android.content.Context;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.more.itemv2.MoveItemV2;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;

public class MyRootFolderMoveItemV2 extends MoveItemV2 {
    @Override // com.bytedance.ee.bear.list.more.itemv2.MoveItemV2, com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        if (this.mDocument.mo32483t() != C8275a.f22370c.mo32555b()) {
            return FolderVersion.isShareFolderV2(this.mDocument.an());
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.list.more.itemv2.MoveItemV2, com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        if (this.mDocument.mo32483t() == C8275a.f22370c.mo32555b() && !FolderVersion.isShareFolderV2(this.mDocument.an()) && this.mDocument.aq()) {
            return false;
        }
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo instanceof DocMoreInfo) {
            DocMoreInfo aVar = (DocMoreInfo) moreInfo;
            if (aVar.mo39010F()) {
                return aVar.mo39018N().canMoveThisNode();
            }
            return aVar.mo39005A().mo38591a().canMoveThisNode();
        } else if (!(moreInfo instanceof FolderMoreInfo)) {
            return false;
        } else {
            FolderMoreInfo bVar = (FolderMoreInfo) moreInfo;
            if (!bVar.mo39010F()) {
                ShareFolderUserPermission A = bVar.mo39060A();
                if (A == null || !A.canBeMoved()) {
                    return false;
                }
                return true;
            } else if (bVar.mo39062C() == null || !bVar.mo39062C().canMoveThisNode()) {
                return false;
            } else {
                return true;
            }
        }
    }

    public MyRootFolderMoveItemV2(Context context, Document document, AccountService.Account account, boolean z, String str, String str2) {
        super(context, document, account, z, "", str, str2);
    }
}
