package com.bytedance.ee.bear.more.itemv2;

import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class PermissionItemV2 extends BaseMoreItem implements ITextMoreItem {
    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_setting_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return CommonMoreItemId.PERMISSION.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_More_PublicPermissionSetting);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        boolean z;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            C13479a.m54775e("PermissionItemV2", "isVisible(), more info == null");
            return false;
        }
        if (!(moreInfo instanceof WikiMoreInfo) || !moreInfo.mo39014J() || !((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36640c().mo36636b()) {
            z = false;
        } else {
            z = true;
        }
        boolean o = moreInfo.mo39048o();
        C13479a.m54764b("PermissionItemV2", "isOwner:" + o);
        if ((o || moreInfo.mo39030b()) && !z) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        IMoreInfo moreInfo = getMoreInfo();
        C13479a.m54772d("PermissionItemV2", "onItemClick: docInfoData = " + moreInfo);
        C10196b.m42465a(moreInfo, "public_permission_setting");
        if (moreInfo instanceof DocMoreInfo) {
            DocMoreInfo aVar = (DocMoreInfo) moreInfo;
            IDocPublicPermission b = aVar.mo39005A().mo38594b();
            boolean z = moreInfo instanceof WikiMoreInfo;
            DocPermSetInfo docPermSetInfo = new DocPermSetInfo(moreInfo.mo39040g(), moreInfo.mo39036e(), moreInfo.mo39041h(), z, aVar.mo39007C(), aVar.mo39005A(), aVar.mo39058y(), true, true, moreInfo.mo39014J());
            C10196b.m42463a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), moreInfo.mo39009E(), moreInfo.mo39038f(), "permission_settings", "ccm_permission_set_view", "", "", "", z, aVar.mo39008D());
            ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36641d().mo36654a(moreInfo.mo39041h(), moreInfo.mo39036e(), moreInfo.mo39038f(), z, aVar.mo39005A().mo38591a().getReportJson(), aVar.mo39005A().mo38594b().getReportJson(), aVar.mo39008D(), "", "");
            C13479a.m54764b("PermissionItemV2", "docPublicPermRefactor = " + b);
            ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/share/doc/permission/set/activity").mo17311a("permission_doc_info", docPermSetInfo).mo17314a("permission_module", "more").mo17317a();
            getHost().mo39166c();
        }
    }
}
