package com.bytedance.ee.bear.list.rename;

import android.os.Bundle;
import com.bytedance.ee.bear.NodeType;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.koin.java.KoinJavaComponent;

public class RenameItemV2 extends BaseMoreItem implements ITextMoreItem {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final AccountService.Account mAccount;
    private final Document mDocument;
    private final C7718l mFragment;
    private final boolean mIsNetworkAvailable;
    private final String mModule;
    private final C10917c mServiceContext;
    private final String mSource;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_ccm_rename_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return CommonMoreItemId.RENAME.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Facade_Rename);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        if (this.mDocument.mo32483t() == C8275a.f22370c.mo32555b() || NodeType.isShortcut(this.mDocument.ao())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        int i;
        C7718l lVar;
        if (NodeType.isShortcut(this.mDocument.ao())) {
            lVar = this.mFragment;
            i = R.string.CreationMobile_Wiki_Shortcuts_ShortcutLabel_Placeholder;
        } else {
            lVar = this.mFragment;
            i = R.string.Doc_Facade_Folder;
        }
        return C10539a.m43639a(this.mFragment.getContext(), R.string.Doc_Facade_MoreRenameTips, ShareHitPoint.f121869d, lVar.getString(i));
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo instanceof FolderMoreInfo) {
            FolderMoreInfo bVar = (FolderMoreInfo) moreInfo;
            if (!bVar.mo39010F()) {
                ShareFolderUserPermission A = bVar.mo39060A();
                if (A == null || !A.canEdit()) {
                    return false;
                }
                return true;
            } else if (bVar.mo39062C() == null || !bVar.mo39062C().canEdit()) {
                return false;
            } else {
                return true;
            }
        } else if (!(moreInfo instanceof DocMoreInfo)) {
            return false;
        } else {
            DocMoreInfo aVar = (DocMoreInfo) moreInfo;
            if (aVar.mo39010F()) {
                return aVar.mo39018N().canEdit();
            }
            return aVar.mo39005A().mo38591a().canEdit();
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        boolean z;
        C13479a.m54764b("RenameItemV2", "onClick()...");
        if (!this.mIsNetworkAvailable) {
            Toast.showFailureText(this.mFragment.getContext(), this.mFragment.getString(R.string.Doc_List_OperateFailedNoNet), 0);
            return;
        }
        new C8693a(this.mFragment, this.mServiceContext).mo33719a(this.mDocument);
        ListAnalysis.m32496a(C5234y.m21391b(), this.mAccount, "rename", this.mDocument, this.mModule, this.mSource);
        if (getMoreInfo() != null) {
            IMoreInfo moreInfo = getMoreInfo();
            AbstractC10194a aVar = (AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class);
            Bundle arguments = getHost().mo39165b().getArguments();
            String h = moreInfo.mo39041h();
            int e = moreInfo.mo39036e();
            boolean E = moreInfo.mo39009E();
            String f = moreInfo.mo39038f();
            if (moreInfo.mo39036e() == C8275a.f22377j.mo32555b()) {
                z = true;
            } else {
                z = false;
            }
            aVar.mo38968a(arguments, h, e, E, f, "rename", "ccm_space_drive_rename_view", "", "", "", z, false);
        }
        getHost().mo39166c();
    }

    public RenameItemV2(C7718l lVar, C10917c cVar, Document document, boolean z, AccountService.Account account, String str, String str2) {
        this.mFragment = lVar;
        this.mServiceContext = cVar;
        this.mDocument = document;
        this.mIsNetworkAvailable = z;
        this.mAccount = account;
        this.mSource = str;
        this.mModule = str2;
    }
}
