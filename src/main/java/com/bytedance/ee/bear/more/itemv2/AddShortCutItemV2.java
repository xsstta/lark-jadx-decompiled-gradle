package com.bytedance.ee.bear.more.itemv2;

import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;

public class AddShortCutItemV2 extends BaseMoreItem implements IGridMoreItem {
    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_new_shortcut_outlined;
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
        return CommonMoreItemId.ADD_SHORT_CUT.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        return C5084ad.m20847d().mo20038b().mo20041b();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        String string = getString(R.string.CreationMobile_ECM_ShortcutsTitle);
        try {
            if (!TextUtils.equals(C4484g.m18494b().mo17252c(), Locale.CHINESE.getLanguage())) {
                return string;
            }
            String substring = string.substring(0, 4);
            String substring2 = string.substring(4);
            return substring + "\n" + substring2;
        } catch (Throwable th) {
            C13479a.m54759a("AddShortCutItemV2", "getTitle()...", th);
            return string;
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            C13479a.m54758a("AddShortCutItemV2", "moreInfo is null!");
            return false;
        } else if (moreInfo.mo39036e() == C8275a.f22370c.mo32555b() || moreInfo.mo39036e() == C8275a.f22377j.mo32555b() || !FolderVersion.isShareFolderV2(moreInfo.mo39031c()) || moreInfo.mo39010F() || !((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20777c().f14914a) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public void onClick() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            C13479a.m54772d("AddShortCutItemV2", "onClick: but more info is null");
            return;
        }
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/folder/select/activity").mo17311a("EXTRA_OPERATE_BEAN", new DocOperateBean(2, moreInfo.mo39042i(), moreInfo.mo39041h(), moreInfo.mo39047n(), moreInfo.mo39059z(), moreInfo.mo39036e(), "", "", moreInfo.mo39056w(), FolderVersion.isShareFolderV2(moreInfo.mo39031c()), true, false)).mo17314a("extra_root_title", getString(R.string.CreationMobile_ECM_ShortcutsTitle)).mo17314a("extra_operate_text", getString(R.string.Doc_Facade_AddToHere)).mo17317a();
        if (moreInfo instanceof DocMoreInfo) {
            DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), aVar.mo39041h(), aVar.mo39036e(), aVar.mo39009E(), aVar.mo39038f(), "create_shortcut", "ccm_space_add_to_folder_view", "", "", "", aVar instanceof WikiMoreInfo, aVar.mo39008D());
        }
        getHost().mo39166c();
    }
}
