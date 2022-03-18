package com.bytedance.ee.bear.list.more.itemv2;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class ShareItemV2 extends BaseMoreItem implements IGridMoreItem {
    private AccountService.Account mAccount;
    private FragmentActivity mActivity;
    private Document mDocument;
    private boolean mIsGrid;
    private String mModule;
    private C10917c mServiceContext;
    private String mSubModule;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_share_label_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "shareV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        return this.mIsGrid;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_List_Share);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        if (this.mDocument.aq()) {
            return false;
        }
        if (getMoreInfo() instanceof DocMoreInfo) {
            DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
            if (aVar.mo39010F() && (aVar.mo39006B() || !aVar.mo39005A().mo38591a().canRead())) {
                return false;
            }
        }
        if (getMoreInfo() instanceof FolderMoreInfo) {
            FolderMoreInfo bVar = (FolderMoreInfo) getMoreInfo();
            if (bVar.mo39010F() && (bVar.mo39061B() || !bVar.mo39060A().canView())) {
                return false;
            }
        }
        return C5084ad.m20847d().mo20038b().mo20041b();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public void onClick() {
        boolean z;
        boolean z2;
        C8292f.m34147a(this.mActivity, this.mServiceContext, this.mDocument, this.mAccount, this.mModule, this.mSubModule, C8292f.m34136a(this.mIsGrid));
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo instanceof FolderMoreInfo) {
            FolderMoreInfo bVar = (FolderMoreInfo) moreInfo;
            AbstractC10194a aVar = (AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class);
            Bundle arguments = getHost().mo39165b().getArguments();
            String h = moreInfo.mo39041h();
            int e = moreInfo.mo39036e();
            boolean isShareFolder = FolderVersion.isShareFolder(bVar.mo39067y().getOwnerType(), bVar.mo39009E());
            String f = moreInfo.mo39038f();
            if (moreInfo.mo39036e() == C8275a.f22377j.mo32555b()) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar.mo38968a(arguments, h, e, isShareFolder, f, "share", "ccm_permission_share_view", "", "", "", z2, false);
        } else if (moreInfo != null) {
            AbstractC10194a aVar2 = (AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class);
            Bundle arguments2 = getHost().mo39165b().getArguments();
            String h2 = moreInfo.mo39041h();
            int e2 = moreInfo.mo39036e();
            String f2 = moreInfo.mo39038f();
            if (moreInfo.mo39036e() == C8275a.f22377j.mo32555b()) {
                z = true;
            } else {
                z = false;
            }
            aVar2.mo38968a(arguments2, h2, e2, false, f2, "share", "ccm_permission_share_view", "", "", "", z, false);
        }
        getHost().mo39166c();
    }

    public ShareItemV2(FragmentActivity fragmentActivity, C10917c cVar, Document document, AccountService.Account account, boolean z, String str, String str2) {
        this.mActivity = fragmentActivity;
        this.mServiceContext = cVar;
        this.mDocument = document;
        this.mAccount = account;
        this.mIsGrid = z;
        this.mModule = str;
        this.mSubModule = str2;
    }
}
