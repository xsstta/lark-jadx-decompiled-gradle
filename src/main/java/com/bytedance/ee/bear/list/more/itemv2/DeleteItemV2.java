package com.bytedance.ee.bear.list.more.itemv2;

import android.os.Bundle;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class DeleteItemV2 extends BaseMoreItem implements IGridMoreItem {
    private final AbstractC8544i.AbstractC8545a mDelegate;
    private final int mDeleteRes;
    protected final Document mDocument;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_delete_trash_outlined;
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
        return CommonMoreItemId.DELETE.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(this.mDeleteRes);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        return C5084ad.m20847d().mo20038b().mo20041b();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        if (this.mDeleteRes != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public void onClick() {
        boolean z;
        AbstractC8544i.AbstractC8545a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo33305d(this.mDocument);
        }
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo instanceof FolderMoreInfo) {
            FolderMoreInfo bVar = (FolderMoreInfo) moreInfo;
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), FolderVersion.isShareFolder(bVar.mo39067y().getOwnerType(), bVar.mo39009E()), moreInfo.mo39038f(), "delete", "ccm_space_delete_view", "", "", "", false, false);
        } else if (moreInfo instanceof DocMoreInfo) {
            AbstractC10194a aVar2 = (AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class);
            Bundle arguments = getHost().mo39165b().getArguments();
            String h = moreInfo.mo39041h();
            int e = moreInfo.mo39036e();
            String f = moreInfo.mo39038f();
            if (moreInfo.mo39036e() == C8275a.f22377j.mo32555b()) {
                z = true;
            } else {
                z = false;
            }
            aVar2.mo38968a(arguments, h, e, false, f, "delete", "ccm_space_delete_view", "", "", "", z, false);
        }
        getHost().mo39166c();
    }

    public DeleteItemV2(Document document, int i, AbstractC8544i.AbstractC8545a aVar) {
        this.mDocument = document;
        this.mDeleteRes = i;
        this.mDelegate = aVar;
    }
}
