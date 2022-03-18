package com.bytedance.ee.bear.drive.biz.preview.more.menu.record;

import android.content.Context;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.AbstractC6677b;
import com.bytedance.ee.bear.drive.p325b.C6319a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class RecordItemV2 extends BaseMoreItem implements AbstractC6677b, ITextMoreItem {
    private Context mContext;
    private C7130c mDriveReport;
    private String mFileExt;
    private IMoreInfo mMoreInfo;
    private String mVersion;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_history_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "item_recordV2";
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

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Drive_Drive_HistoryRecordPageTitle);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        IMoreInfo dVar = this.mMoreInfo;
        if (dVar == null || !dVar.mo39049p()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.AbstractC6677b
    public void onDetach() {
        this.mContext = null;
        this.mFileExt = null;
        this.mVersion = null;
        this.mMoreInfo = null;
        this.mDriveReport = null;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        if (this.mContext != null) {
            IMoreInfo moreInfo = getMoreInfo();
            if (moreInfo == null || this.mDriveReport == null) {
                C13479a.m54758a("RecordItemV2", "record menu param error, doc info is empty");
            } else {
                C6319a.m25393a(this.mContext, moreInfo.mo39041h(), this.mFileExt, this.mVersion);
                this.mDriveReport.mo27967h(moreInfo.mo39041h(), this.mFileExt);
                ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), false, moreInfo.mo39038f(), "history_version", "ccm_docs_history_page_view", "", "", "", false, this.mDriveReport.mo27977l());
            }
            getHost().mo39166c();
        }
    }

    public RecordItemV2(Context context, IMoreInfo dVar, String str, String str2, C7130c cVar) {
        this.mContext = context;
        this.mFileExt = str;
        this.mVersion = str2;
        this.mMoreInfo = dVar;
        this.mDriveReport = cVar;
    }
}
