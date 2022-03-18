package com.bytedance.ee.bear.list.more.itemv2;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import org.koin.java.KoinJavaComponent;

public class OpenFileItemV2 extends BaseMoreItem implements ITextMoreItem {
    private AccountService.Account mAccount;
    private Context mContext;
    private Document mDocument;
    private boolean mIsNetworkAvailable;
    private String mModule;
    private C10917c mServiceContext;
    private String mSource;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_leaveroom_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "open_externalV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Facade_OpenInOtherApp);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return this.mContext.getString(R.string.CreationMobile_ECM_AdminDisableToast);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        return C8292f.m34164a(this.mDocument, getMoreInfo());
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        if (!(getMoreInfo() instanceof DocMoreInfo)) {
            return false;
        }
        DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
        if (!aVar.mo39010F() || !aVar.mo39006B()) {
            return ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36546e(aVar.mo39057x(), this.mDocument.mo32472o());
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        boolean z;
        ((IAuditApi) KoinJavaComponent.m268610a(IAuditApi.class)).mo37701a(3, 13, this.mDocument.mo32472o());
        if (C36808a.m145211c() == 1) {
            C13479a.m54764b("open_externalV2", "open external in list, file CIPHER_ON is true");
            Context context = this.mContext;
            Toast.showText(context, context.getString(R.string.CreationMobile_ECM_ShareSecuritySettingKAToast), 1);
        } else {
            C8292f.m34144a(this.mContext, this.mServiceContext, this.mDocument, this.mIsNetworkAvailable, this.mAccount, this.mSource, this.mModule);
        }
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            AbstractC10194a aVar = (AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class);
            Bundle arguments = getHost().mo39165b().getArguments();
            String h = moreInfo.mo39041h();
            int e = moreInfo.mo39036e();
            String f = moreInfo.mo39038f();
            if (moreInfo.mo39036e() == C8275a.f22377j.mo32555b()) {
                z = true;
            } else {
                z = false;
            }
            aVar.mo38968a(arguments, h, e, false, f, "open_in_other_apps", "none", "", "", "", z, false);
        }
        getHost().mo39166c();
    }

    public OpenFileItemV2(Context context, C10917c cVar, Document document, boolean z, AccountService.Account account, String str, String str2) {
        this.mContext = context;
        this.mServiceContext = cVar;
        this.mDocument = document;
        this.mIsNetworkAvailable = z;
        this.mAccount = account;
        this.mSource = str;
        this.mModule = str2;
    }
}
