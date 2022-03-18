package com.bytedance.ee.bear.drive.biz.cache;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.biz.preview.pdf.StreamingCache;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.dao.p351a.C6956b;
import com.bytedance.ee.bear.drive.loader.model.C7088b;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/cache/DriveImFileCachePlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveImFileCachePlugin extends AbsDrivePlugin {
    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27236d(aVar).liveInnerSaveCache().mo5923a(getLifecycleOwner(), new C6324a(aVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dataSource", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.cache.DriveImFileCachePlugin$a */
    public static final class C6324a<T> implements AbstractC1178x<Object> {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f17526a;

        C6324a(DrivePluginHost aVar) {
            this.f17526a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            if (obj == null || this.f17526a.mo27261l() == null) {
                C13479a.m54758a("DriveImAttachmentDefaultPreviewModelStatePlugin", "dataSource is null");
            } else if (obj instanceof String) {
                C13479a.m54764b("DriveImAttachmentDefaultPreviewModelStatePlugin", "liveInnerSaveCache() ds=String");
                C6332c.m25430a((C7088b) this.f17526a.mo27261l().getFileModel(), (String) obj);
            } else if (obj instanceof byte[]) {
                C13479a.m54764b("DriveSdk", "liveInnerSaveCache() ds=byte[]");
                C6332c.m25431a((C7088b) this.f17526a.mo27261l().getFileModel(), (byte[]) obj);
            } else if (obj instanceof C6956b) {
                C13479a.m54764b("DriveSdk", "liveInnerSaveCache() ds=ExcelSubCacheModel");
                C6332c.m25429a((C7088b) this.f17526a.mo27261l().getFileModel());
            } else if (obj instanceof StreamingCache) {
                C13479a.m54764b("DriveComponent", "liveInnerSaveCache() ds=StreamingCache]");
                C6331b.m25420a(C6891a.m27228a(this.f17526a.mo27261l()), this.f17526a.mo27261l().getIFileModel(), (StreamingCache) obj);
            }
        }
    }
}
