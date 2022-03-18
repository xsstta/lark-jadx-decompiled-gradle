package com.bytedance.ee.bear.list.more.itemv2;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.NodeType;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.koin.java.KoinJavaComponent;

public class MoveItemV2 extends BaseMoreItem implements ITextMoreItem {
    protected final AccountService.Account mAccount;
    private final Context mContext;
    protected final Document mDocument;
    private final boolean mIsNetworkAvailable;
    private final String mModule;
    protected final String mParentToken;
    private final String mSource;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_into_item_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "moveV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Facade_MoveTo);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        return C8292f.m34163a(this.mDocument, this.mAccount);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        Context context = this.mContext;
        return C10539a.m43639a(context, R.string.Doc_List_MakeMoveForbidden, ShareHitPoint.f121869d, C8292f.m34168b(context, this.mDocument.mo32483t()));
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        if (this.mDocument.mo32483t() != C8275a.f22370c.mo32555b() || FolderVersion.isShareFolderV2(this.mDocument.an()) || !this.mDocument.aq()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        boolean z;
        boolean z2;
        boolean z3;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo instanceof DocMoreInfo) {
            z = ((DocMoreInfo) moreInfo).mo39005A().mo38594b().externalAccess();
        } else {
            z = false;
        }
        if (!this.mIsNetworkAvailable) {
            Context context = this.mContext;
            Toast.showFailureText(context, context.getString(R.string.Doc_List_OperateFailedNoNet), 0);
            return;
        }
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/folder/select/activity").mo17314a("extra_operate_text", getString(R.string.Doc_Facade_MoveToHere)).mo17311a("EXTRA_OPERATE_BEAN", getDocOperateBean(z)).mo17317a();
        ListAnalysis.m32496a(C5234y.m21391b(), this.mAccount, "moveto", this.mDocument, this.mModule, this.mSource);
        if (moreInfo instanceof FolderMoreInfo) {
            FolderMoreInfo bVar = (FolderMoreInfo) moreInfo;
            AbstractC10194a aVar = (AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class);
            Bundle arguments = getHost().mo39165b().getArguments();
            String h = moreInfo.mo39041h();
            int e = moreInfo.mo39036e();
            boolean isShareFolder = FolderVersion.isShareFolder(bVar.mo39067y().getOwnerType(), bVar.mo39009E());
            String f = moreInfo.mo39038f();
            if (moreInfo.mo39036e() == C8275a.f22377j.mo32555b()) {
                z3 = true;
            } else {
                z3 = false;
            }
            aVar.mo38968a(arguments, h, e, isShareFolder, f, "move_to_folder", "ccm_space_add_to_folder_view", "", "", "", z3, false);
        } else if (moreInfo != null) {
            AbstractC10194a aVar2 = (AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class);
            Bundle arguments2 = getHost().mo39165b().getArguments();
            String h2 = moreInfo.mo39041h();
            int e2 = moreInfo.mo39036e();
            String f2 = moreInfo.mo39038f();
            if (moreInfo.mo39036e() == C8275a.f22377j.mo32555b()) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar2.mo38968a(arguments2, h2, e2, false, f2, "move_to_folder", "ccm_space_add_to_folder_view", "", "", "", z2, false);
        }
        getHost().mo39166c();
    }

    /* access modifiers changed from: protected */
    public DocOperateBean getDocOperateBean(boolean z) {
        return new DocOperateBean(1, this.mDocument.mo32469n(), this.mDocument.mo32475p(), this.mParentToken, this.mDocument.mo32399O(), this.mDocument.mo32483t(), this.mModule, this.mSource, this.mDocument.aj(), FolderVersion.isShareFolderV2(this.mDocument.an()), z, NodeType.isShortcut(this.mDocument.ao()));
    }

    public MoveItemV2(Context context, Document document, AccountService.Account account, boolean z, String str, String str2, String str3) {
        this.mContext = context;
        this.mDocument = document;
        this.mAccount = account;
        this.mIsNetworkAvailable = z;
        this.mParentToken = str;
        this.mModule = str2;
        this.mSource = str3;
    }
}
