package com.bytedance.ee.bear.drive.biz.permission;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.drive.biz.p326a.C6322a;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/permission/DriveSpaceAttachmentMGPermissionVM;", "Landroidx/lifecycle/ViewModel;", "()V", "executor", "Lcom/bytedance/ee/bear/drive/biz/docinfo/DocInfoDataFetchExecutor;", "livePerm", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "fetchPermission", "", "objToken", "", "url", "Landroidx/lifecycle/LiveData;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.permission.c */
public final class DriveSpaceAttachmentMGPermissionVM extends AbstractC1142af {
    private final C6322a executor = new C6322a((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null));
    public final C1177w<C6522b> livePerm = new C1177w<>();

    public final LiveData<C6522b> livePerm() {
        return this.livePerm;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/biz/permission/DriveSpaceAttachmentMGPermissionVM$fetchPermission$1", "Lcom/bytedance/ee/bear/drive/biz/docinfo/DocInfoDataFetchExecutor$IDrivePermissionRequestListener;", "onFailure", "", "throwable", "", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.c$a */
    public static final class C6515a implements C6322a.AbstractC6323a {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceAttachmentMGPermissionVM f17951a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6515a(DriveSpaceAttachmentMGPermissionVM cVar) {
            this.f17951a = cVar;
        }

        @Override // com.bytedance.ee.bear.drive.biz.p326a.C6322a.AbstractC6323a
        /* renamed from: a */
        public void mo25420a(C6522b bVar) {
            this.f17951a.livePerm.mo5926a(bVar);
        }

        @Override // com.bytedance.ee.bear.drive.biz.p326a.C6322a.AbstractC6323a
        /* renamed from: a */
        public void mo25421a(Throwable th) {
            this.f17951a.livePerm.mo5926a((C6522b) null);
            C13479a.m54759a("DriveComponent", "fetchPermission() failed", th);
        }
    }

    public final void fetchPermission(String str, String str2) {
        this.executor.mo25418a(str, str2, new C6515a(this));
    }
}
