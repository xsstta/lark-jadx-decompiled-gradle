package com.bytedance.ee.bear.more.itemv2;

import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class AddItemV2 extends BaseMoreItem implements IGridMoreItem {
    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_tool_addblock_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
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
    public String getId() {
        return CommonMoreItemId.ADD.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Facade_AddTo);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        return C5084ad.m20847d().mo20038b().mo20041b();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            C13479a.m54758a("AddItemV2", "moreInfo is null!");
            return false;
        } else if (moreInfo.mo39036e() == C8275a.f22370c.mo32555b() || moreInfo.mo39036e() == C8275a.f22377j.mo32555b() || FolderVersion.isShareFolderV2(moreInfo.mo39031c()) || !((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20777c().f14914a) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public void onClick() {
        boolean z;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            C13479a.m54772d("AddItemV2", "onClick: but more info is null");
            return;
        }
        C10196b.m42465a(moreInfo, "addto");
        boolean z2 = moreInfo instanceof DocMoreInfo;
        if (z2) {
            z = ((DocMoreInfo) moreInfo).mo39005A().mo38594b().externalAccess();
        } else {
            z = false;
        }
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/folder/select/activity").mo17314a("extra_operate_text", getString(R.string.Doc_Facade_AddToHere)).mo17311a("EXTRA_OPERATE_BEAN", new DocOperateBean(0, moreInfo.mo39042i(), moreInfo.mo39041h(), "", "", moreInfo.mo39036e(), "", "innerpage", moreInfo.mo39056w(), FolderVersion.isShareFolderV2(moreInfo.mo39031c()), z, false)).mo17317a();
        if (moreInfo instanceof FolderMoreInfo) {
            FolderMoreInfo bVar = (FolderMoreInfo) moreInfo;
            C10196b.m42463a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), FolderVersion.isShareFolder(bVar.mo39067y().getOwnerType(), bVar.mo39009E()), moreInfo.mo39038f(), "add_to_folder", "ccm_space_add_to_folder_view", "", "", "", false, false);
        } else if (z2) {
            C10196b.m42463a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), false, moreInfo.mo39038f(), "add_to_folder", "ccm_space_add_to_folder_view", "", "", "", moreInfo instanceof WikiMoreInfo, ((DocMoreInfo) moreInfo).mo39008D());
        }
        getHost().mo39166c();
    }
}
