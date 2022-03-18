package com.bytedance.ee.bear.more.itemv2;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13614b;
import com.larksuite.suite.R;

public class CopyLinkItemV2 extends BaseMoreItem implements ITextMoreItem {
    private String mModule;
    private String mSource;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_link_copy_outlined;
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

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return CommonMoreItemId.COPY_LINK.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_List_Copy_Link);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        onCopyLinkClicked(getHost().mo39165b().getContext(), getMoreInfo());
        getHost().mo39166c();
    }

    public CopyLinkItemV2(String str, String str2) {
        this.mSource = str;
        this.mModule = str2;
    }

    private boolean copyLink(Context context, String str) {
        if (str != null) {
            try {
                C13614b.m55259a(context, Uri.parse(str).buildUpon().clearQuery().toString());
                return true;
            } catch (Exception e) {
                C13479a.m54761a("CopyLinkItemV2", e);
            }
        }
        return false;
    }

    private void onCopyLinkClicked(Context context, IMoreInfo dVar) {
        if (dVar == null || context == null) {
            C13479a.m54758a("CopyLinkItemV2", "onCopyLinkClicked()..., more info or context== null");
            return;
        }
        if (copyLink(context, dVar.mo39040g())) {
            Toast.showSuccessText(context, (int) R.string.Doc_Facade_CopyLinkSuccessfully);
        } else {
            Toast.showFailureText(context, (int) R.string.Doc_Facade_CopyLinkFailed);
        }
        C10196b.m42466a(dVar, this.mSource, this.mModule);
        if (dVar instanceof FolderMoreInfo) {
            FolderMoreInfo bVar = (FolderMoreInfo) dVar;
            C10196b.m42463a(getHost().mo39165b().getArguments(), dVar.mo39041h(), dVar.mo39036e(), FolderVersion.isShareFolder(bVar.mo39067y().getOwnerType(), bVar.mo39009E()), dVar.mo39038f(), "copy_link", "none", "", "", "", false, false);
        } else if (dVar instanceof DocMoreInfo) {
            C10196b.m42463a(getHost().mo39165b().getArguments(), dVar.mo39041h(), dVar.mo39036e(), false, dVar.mo39038f(), "copy_link", "none", "", "", "", dVar instanceof WikiMoreInfo, ((DocMoreInfo) dVar).mo39008D());
        }
    }
}
