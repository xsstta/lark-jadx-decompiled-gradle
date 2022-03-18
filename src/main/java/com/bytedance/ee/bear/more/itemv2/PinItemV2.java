package com.bytedance.ee.bear.more.itemv2;

import android.os.Bundle;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class PinItemV2 extends BaseMoreItem implements IGridMoreItem {
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
        return CommonMoreItemId.PIN.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        if (isPined()) {
            return R.drawable.ud_icon_cancel_buzz_outlined;
        }
        return R.drawable.ud_icon_buzz_outlined;
    }

    private boolean isFromSpace() {
        Bundle arguments = getHost().mo39165b().getArguments();
        if (arguments == null || arguments.getInt("more_scene", -1) != 0) {
            return false;
        }
        return true;
    }

    private boolean isPined() {
        if (getMoreInfo() == null || !getMoreInfo().mo39052s()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        int i;
        if (isPined()) {
            i = R.string.Doc_Facade_RemovePin;
        } else {
            i = R.string.Doc_More_AddPin;
        }
        return getString(i);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        if (getMoreInfo() == null || (getMoreInfo().mo39036e() == C8275a.f22377j.mo32555b() && getMoreInfo().mo39014J())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
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
        String str;
        String str2;
        String str3;
        String str4;
        IMoreInfo moreInfo = getMoreInfo();
        C13479a.m54772d("PinItemV2", "onItemClick: docInfoData = " + moreInfo);
        if (moreInfo != null) {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31514b(C10236c.m42701a(moreInfo), C10236c.m42702b(moreInfo), moreInfo.mo39052s());
            IMoreInfo moreInfo2 = getMoreInfo();
            if (isPined()) {
                str = "add_quickaccess";
            } else {
                str = "remove_quickaccess";
            }
            C10196b.m42465a(moreInfo2, str);
            if (isFromSpace()) {
                str2 = "none";
            } else {
                str2 = "ccm_docs_page_view";
            }
            if (moreInfo instanceof FolderMoreInfo) {
                FolderMoreInfo bVar = (FolderMoreInfo) moreInfo;
                Bundle arguments = getHost().mo39165b().getArguments();
                String h = moreInfo.mo39041h();
                int e = moreInfo.mo39036e();
                boolean isShareFolder = FolderVersion.isShareFolder(bVar.mo39067y().getOwnerType(), bVar.mo39009E());
                String f = moreInfo.mo39038f();
                if (isPined()) {
                    str4 = "remove_from_quickaccess";
                } else {
                    str4 = "add_to_quickaccess";
                }
                C10196b.m42463a(arguments, h, e, isShareFolder, f, str4, str2, "", "", "", false, false);
            } else if (moreInfo instanceof DocMoreInfo) {
                Bundle arguments2 = getHost().mo39165b().getArguments();
                String h2 = moreInfo.mo39041h();
                int e2 = moreInfo.mo39036e();
                String f2 = moreInfo.mo39038f();
                if (isPined()) {
                    str3 = "remove_from_quickaccess";
                } else {
                    str3 = "add_to_quickaccess";
                }
                C10196b.m42463a(arguments2, h2, e2, false, f2, str3, str2, "", "", "", moreInfo instanceof WikiMoreInfo, ((DocMoreInfo) moreInfo).mo39008D());
            }
            getHost().mo39166c();
        }
    }
}
