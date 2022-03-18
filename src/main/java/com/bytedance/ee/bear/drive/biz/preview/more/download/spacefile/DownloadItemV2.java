package com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.AbstractC6677b;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001aB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/download/spacefile/DownloadItemV2;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/ITextMoreItem;", "Lcom/bytedance/ee/bear/drive/biz/preview/more/menu/IDetachable;", "mContext", "Landroid/content/Context;", "mVM", "Lcom/bytedance/ee/bear/drive/core/DriveViewModel;", "mMoreInfo", "Lcom/bytedance/ee/bear/more/export/IMoreInfo;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/drive/core/DriveViewModel;Lcom/bytedance/ee/bear/more/export/IMoreInfo;)V", "downloadHandler", "Lcom/bytedance/ee/bear/drive/biz/preview/more/download/spacefile/SpaceFileDownloadManager;", "getIcon", "", "getIconTint", "getId", "", "getTitle", "getUnableTips", "isEnable", "", "isVisible", "onClick", "", "onDetach", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DownloadItemV2 extends BaseMoreItem implements AbstractC6677b, ITextMoreItem {
    public static final Companion Companion = new Companion(null);
    private final SpaceFileDownloadManager downloadHandler;
    private final Context mContext;
    private final IMoreInfo mMoreInfo;
    private final C6937b mVM;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_download_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "item_downloadV2";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/download/spacefile/DownloadItemV2$Companion;", "", "()V", "ID_DOWNLOAD", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile.DownloadItemV2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return ITextMoreItem.C10238a.m42707c(this);
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.AbstractC6677b
    public void onDetach() {
        this.downloadHandler.mo26341b();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        String string = this.mContext.getString(R.string.CreationMobile_ECM_AdminDisableToast);
        Intrinsics.checkExpressionValueIsNotNull(string, "mContext.getString(R.str…le_ECM_AdminDisableToast)");
        return string;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        IMoreInfo dVar = this.mMoreInfo;
        if (dVar == null || !dVar.mo39051r()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        String string = this.mContext.getResources().getString(R.string.CreationMobile_ECM_SaveToLocal_option);
        Intrinsics.checkExpressionValueIsNotNull(string, "mContext.resources.getSt…e_ECM_SaveToLocal_option)");
        return string;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        if (this.mMoreInfo == null) {
            return false;
        }
        return ((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36546e(this.mMoreInfo.mo39057x(), this.mMoreInfo.mo39041h());
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        getHost().mo39166c();
        this.downloadHandler.mo26339a();
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            C6920b f = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
            C7130c a = f.mo27166a();
            AbstractC10194a aVar = (AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null);
            Bundle arguments = getHost().mo39165b().getArguments();
            String h = moreInfo.mo39041h();
            int e = moreInfo.mo39036e();
            String f2 = moreInfo.mo39038f();
            Intrinsics.checkExpressionValueIsNotNull(a, "driveReport");
            aVar.mo38968a(arguments, h, e, false, f2, "save_to_local", "none", "", "", "", false, a.mo27977l());
        }
    }

    public DownloadItemV2(Context context, C6937b bVar, IMoreInfo dVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mVM");
        this.mContext = context;
        this.mVM = bVar;
        this.mMoreInfo = dVar;
        BaseOpenEntity openEntity = bVar.getOpenEntity();
        if (openEntity != null) {
            this.downloadHandler = new SpaceFileDownloadManager(context, (BaseSpaceOpenEntity) openEntity, bVar.getFileModel());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity");
    }
}
