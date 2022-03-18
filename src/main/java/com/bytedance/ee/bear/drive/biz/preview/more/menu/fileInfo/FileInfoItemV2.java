package com.bytedance.ee.bear.drive.biz.preview.more.menu.fileInfo;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.drive.biz.extra_info.C6438a;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.AbstractC6677b;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class FileInfoItemV2 extends BaseMoreItem implements AbstractC6677b, ITextMoreItem {
    private Context mContext;
    private C7130c mDriveReport;
    private C7086a mFileModel;
    private C6438a mFileStatsHelper;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_info_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "item_file_statsV2";
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

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Drive_Drive_FileDetails);
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.AbstractC6677b
    public void onDetach() {
        this.mFileModel = null;
        this.mContext = null;
        this.mFileStatsHelper = null;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        C6438a aVar;
        Context context = this.mContext;
        if (!(context == null || !(context instanceof FragmentActivity) || (aVar = this.mFileStatsHelper) == null)) {
            aVar.mo25794a((FragmentActivity) context, this.mFileModel);
            this.mDriveReport.mo27980o(C7130c.m28587b(this.mFileModel));
            this.mDriveReport.mo27939c(this.mFileModel);
        }
        if (getMoreInfo() != null) {
            IMoreInfo moreInfo = getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), false, moreInfo.mo39038f(), "docs_details", "ccm_space_docs_details_view", "", "", "", false, this.mDriveReport.mo27977l());
        }
        getHost().mo39166c();
    }

    public FileInfoItemV2(Context context, C7086a aVar, C6438a aVar2, C7130c cVar) {
        this.mFileModel = aVar;
        this.mContext = context;
        this.mFileStatsHelper = aVar2;
        this.mDriveReport = cVar;
    }
}
