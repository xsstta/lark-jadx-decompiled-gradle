package com.ss.android.lark.integrator.moments.dependency;

import com.bytedance.ee.bear.contract.drive.AbstractC5138b;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.moments.dependency.idependency.IDriveDependency;
import com.ss.android.lark.moments.dependency.idependency.IMomentsDriveUploadCallback;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsDriveModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IDriveDependency;", "()V", "driveUpload", "", "localPath", "fileName", "mountNodePoint", "mountPoint", "callback", "Lcom/ss/android/lark/moments/dependency/idependency/IMomentsDriveUploadCallback;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.f */
public final class MomentsDriveModule implements IDriveDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J>\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/integrator/moments/dependency/MomentsDriveModule$driveUpload$driveCallback$1", "Lcom/bytedance/ee/bear/contract/drive/IDriveUploadDownProxy$DriveUploadCallback;", "onFailed", "", "key", "", "errorCode", "", "updateProgress", UpdateKey.STATUS, "bytesTransferred", "", "bytesTotal", "fileToken", "filePath", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.a.f$a */
    public static final class C39897a implements AbstractC5138b.AbstractC5140b {

        /* renamed from: a */
        final /* synthetic */ IMomentsDriveUploadCallback f101580a;

        C39897a(IMomentsDriveUploadCallback oVar) {
            this.f101580a = oVar;
        }

        @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b.AbstractC5140b
        /* renamed from: a */
        public boolean mo20428a(String str, int i) {
            return this.f101580a.mo165896a();
        }

        @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b.AbstractC5140b
        /* renamed from: a */
        public boolean mo20429a(String str, int i, long j, long j2, String str2, String str3) {
            if (i == DriveFile.Status.SUCCESS.value()) {
                return this.f101580a.mo165897a(str2);
            }
            return true;
        }
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IDriveDependency
    /* renamed from: a */
    public String mo144708a(String str, String str2, String str3, String str4, IMomentsDriveUploadCallback oVar) {
        Intrinsics.checkParameterIsNotNull(str, "localPath");
        Intrinsics.checkParameterIsNotNull(str2, "fileName");
        Intrinsics.checkParameterIsNotNull(str3, "mountNodePoint");
        Intrinsics.checkParameterIsNotNull(str4, "mountPoint");
        Intrinsics.checkParameterIsNotNull(oVar, "callback");
        String driveUpload = ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).driveUpload(str, str2, str3, str4, new C39897a(oVar));
        Intrinsics.checkExpressionValueIsNotNull(driveUpload, "ApiUtils.getApi(ICCMApi:…ountPoint, driveCallback)");
        return driveUpload;
    }
}
