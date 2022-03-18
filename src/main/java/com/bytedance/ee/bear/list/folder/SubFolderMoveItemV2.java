package com.bytedance.ee.bear.list.folder;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.more.itemv2.MoveItemV2;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;

public class SubFolderMoveItemV2 extends MoveItemV2 {
    private final ShareFolderUserPermission mParentPermission;
    private final boolean mParentShareFolder;

    @Override // com.bytedance.ee.bear.list.more.itemv2.MoveItemV2, com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        String str;
        if (!this.mDocument.mo32402R()) {
            return !TextUtils.equals(this.mParentToken, this.mDocument.mo32472o());
        }
        String k = this.mDocument.mo32457k();
        if (this.mAccount != null) {
            str = this.mAccount.f14584a;
        } else {
            str = "";
        }
        return TextUtils.equals(k, str);
    }

    @Override // com.bytedance.ee.bear.list.more.itemv2.MoveItemV2, com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        if (TextUtils.equals(this.mParentToken, this.mDocument.mo32472o())) {
            ShareFolderUserPermission shareFolderUserPermission = this.mParentPermission;
            if (shareFolderUserPermission == null || !shareFolderUserPermission.canBeMoved()) {
                return false;
            }
            return true;
        }
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo instanceof DocMoreInfo) {
            DocMoreInfo aVar = (DocMoreInfo) moreInfo;
            if (aVar.mo39010F()) {
                ShareFolderUserPermission shareFolderUserPermission2 = this.mParentPermission;
                if (shareFolderUserPermission2 == null || !shareFolderUserPermission2.canMoveSubNode() || !aVar.mo39018N().canMoveThisNode()) {
                    return false;
                }
                return true;
            }
            ShareFolderUserPermission shareFolderUserPermission3 = this.mParentPermission;
            if (shareFolderUserPermission3 == null || !shareFolderUserPermission3.canMoveSubNode() || !aVar.mo39005A().mo38591a().canMoveThisNode()) {
                return false;
            }
            return true;
        } else if (!(moreInfo instanceof FolderMoreInfo)) {
            return false;
        } else {
            FolderMoreInfo bVar = (FolderMoreInfo) moreInfo;
            if (bVar.mo39010F()) {
                ShareFolderUserPermission shareFolderUserPermission4 = this.mParentPermission;
                if (shareFolderUserPermission4 == null || !shareFolderUserPermission4.canMoveSubNode() || bVar.mo39062C() == null || !bVar.mo39062C().canMoveThisNode()) {
                    return false;
                }
                return true;
            }
            ShareFolderUserPermission A = bVar.mo39060A();
            ShareFolderUserPermission shareFolderUserPermission5 = this.mParentPermission;
            if (shareFolderUserPermission5 == null || !shareFolderUserPermission5.canMoveSubNode() || A == null || !A.canBeMoved()) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.more.itemv2.MoveItemV2
    public DocOperateBean getDocOperateBean(boolean z) {
        DocOperateBean docOperateBean = super.getDocOperateBean(z);
        docOperateBean.mo20974a(this.mParentShareFolder);
        return docOperateBean;
    }

    public SubFolderMoveItemV2(Context context, Document document, AccountService.Account account, boolean z, String str, ShareFolderUserPermission shareFolderUserPermission, boolean z2, String str2, String str3) {
        super(context, document, account, z, str, str2, str3);
        this.mParentPermission = shareFolderUserPermission;
        this.mParentShareFolder = z2;
    }
}
