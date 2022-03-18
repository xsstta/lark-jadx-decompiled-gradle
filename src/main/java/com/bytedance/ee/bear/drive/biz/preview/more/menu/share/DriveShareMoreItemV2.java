package com.bytedance.ee.bear.drive.biz.preview.more.menu.share;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class DriveShareMoreItemV2 extends BaseMoreItem implements IGridMoreItem {
    private final FragmentActivity mActivity;
    private final C6937b mDriveViewModel;
    private final boolean mIsVcFollowMode;
    DriveMGPermissionVM mPermissionVM;
    DrivePluginHost pluginHost;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_share_label_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "shareV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_More_Share);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        if (getMoreInfo() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public void onClick() {
        C13479a.m54772d("DriveShareMoreItemV2", "onItemClick: moreInfo = " + getMoreInfo());
        C6689a.m26419a(this.mActivity, this.mDriveViewModel, this.mPermissionVM.livePerm().mo5927b(), this.pluginHost);
        if (getMoreInfo() != null) {
            C7130c a = C6920b.m27342f().mo27166a();
            IMoreInfo moreInfo = getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), false, moreInfo.mo39038f(), "share", "ccm_permission_share_view", "", "", "", false, a.mo27977l());
        }
        getHost().mo39166c();
    }

    public DriveShareMoreItemV2(FragmentActivity fragmentActivity, C6937b bVar, DriveMGPermissionVM aVar, boolean z, DrivePluginHost aVar2) {
        this.mActivity = fragmentActivity;
        this.mDriveViewModel = bVar;
        this.mIsVcFollowMode = z;
        this.mPermissionVM = aVar;
        this.pluginHost = aVar2;
    }
}
