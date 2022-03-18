package com.bytedance.ee.bear.drive.biz.extra_info.liked;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.biz.extra_info.DriveSpaceFileExtraInfoViewPlugin;
import com.bytedance.ee.bear.drive.biz.extra_info.FileExtraInfoView;
import com.bytedance.ee.bear.drive.biz.extra_info.LikeCircleImageView;
import com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/extra_info/liked/DriveLikePlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "mLikeWrapper", "Lcom/bytedance/ee/bear/drive/biz/extra_info/liked/LikeWrapper;", "onAttachPreview", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachPreview", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveLikePlugin extends AbsDrivePlugin {
    public C6440a mLikeWrapper;

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        C6440a aVar = this.mLikeWrapper;
        if (aVar != null) {
            aVar.mo25799a();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        FileExtraInfoView fileExtraInfoView;
        LikeInfoView likeInfoView;
        super.onAttachPreview();
        DriveSpaceFileExtraInfoViewPlugin driveSpaceFileExtraInfoViewPlugin = (DriveSpaceFileExtraInfoViewPlugin) findPlugin(DriveSpaceFileExtraInfoViewPlugin.class);
        LikeCircleImageView likeCircleImageView = null;
        if (driveSpaceFileExtraInfoViewPlugin != null) {
            fileExtraInfoView = driveSpaceFileExtraInfoViewPlugin.getFileExtraView();
        } else {
            fileExtraInfoView = null;
        }
        C6937b l = ((DrivePluginHost) getHost()).mo27261l();
        if (fileExtraInfoView != null) {
            likeInfoView = fileExtraInfoView.getLikeInfoView();
        } else {
            likeInfoView = null;
        }
        if (fileExtraInfoView != null) {
            likeCircleImageView = fileExtraInfoView.getLikeCircleImageView();
        }
        C6440a aVar = new C6440a(l, likeInfoView, likeCircleImageView);
        this.mLikeWrapper = aVar;
        if (aVar != null) {
            aVar.mo25804e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.liked.DriveLikePlugin$a */
    public static final class C6439a<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ DriveLikePlugin f17794a;

        C6439a(DriveLikePlugin driveLikePlugin) {
            this.f17794a = driveLikePlugin;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            if (networkState == null || !networkState.mo20041b()) {
                C6440a aVar = this.f17794a.mLikeWrapper;
                if (aVar != null) {
                    aVar.mo25805f();
                    return;
                }
                return;
            }
            C6440a aVar2 = this.f17794a.mLikeWrapper;
            if (aVar2 != null) {
                aVar2.mo25806g();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27232a(this, new C6439a(this));
    }
}
