package com.bytedance.ee.bear.drive.biz.external;

import android.content.Context;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.AbstractC6677b;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class OpenExternalItemV2 extends BaseMoreItem implements AbstractC6677b, ITextMoreItem {
    private Context mContext;
    private C7086a mFileModel;
    private IMoreInfo mMoreInfo;
    private C6418d mOpenExternalHelper;

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
        return "item_openexternalV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    public void cancelOpenTask() {
        this.mOpenExternalHelper.mo25755f();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Drive_Drive_OpenWithOtherApps);
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.AbstractC6677b
    public void onDetach() {
        this.mOpenExternalHelper.mo25756g();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return this.mContext.getString(R.string.CreationMobile_ECM_AdminDisableToast);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        IMoreInfo dVar = this.mMoreInfo;
        if (dVar == null || !dVar.mo39051r()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        if (this.mMoreInfo == null) {
            return false;
        }
        return ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36546e(this.mMoreInfo.mo39057x(), this.mMoreInfo.mo39041h());
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        getHost().mo39166c();
        ((IAuditApi) KoinJavaComponent.m268610a(IAuditApi.class)).mo37701a(3, 13, this.mFileModel.mo27322a().f18785a);
        this.mOpenExternalHelper.mo25745a(this.mFileModel.mo27322a().f18787c, this.mFileModel.mo27322a().f18785a, this.mFileModel.mo27322a().mo27363f(), this.mFileModel.mo27322a().f19095n, (C6414b) null);
        if (getMoreInfo() != null) {
            IMoreInfo moreInfo = getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), false, moreInfo.mo39038f(), "open_in_other_apps", "none", "", "", "", false, C6920b.m27342f().mo27166a().mo27977l());
        }
    }

    public OpenExternalItemV2(Context context, C10917c cVar, C7086a aVar, IMoreInfo dVar) {
        this.mContext = context;
        this.mFileModel = aVar;
        this.mMoreInfo = dVar;
        this.mOpenExternalHelper = new C6418d(context, cVar, new C6425e());
    }
}
