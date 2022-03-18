package com.bytedance.ee.bear.drive.biz.cache;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.biz.preview.pdf.StreamingCache;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.config.strategy.C6932i;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.dao.p351a.C6956b;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/cache/DriveSpaceFileCachePlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceFileCachePlugin extends AbsDrivePlugin {
    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27236d(aVar).liveInnerSaveCache().mo5923a(getLifecycleOwner(), new C6325a(this, C6932i.m27446a(aVar.mo27261l()), aVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dataSource", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.cache.DriveSpaceFileCachePlugin$a */
    public static final class C6325a<T> implements AbstractC1178x<Object> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileCachePlugin f17527a;

        /* renamed from: b */
        final /* synthetic */ AbstractC6927d f17528b;

        /* renamed from: c */
        final /* synthetic */ DrivePluginHost f17529c;

        C6325a(DriveSpaceFileCachePlugin driveSpaceFileCachePlugin, AbstractC6927d dVar, DrivePluginHost aVar) {
            this.f17527a = driveSpaceFileCachePlugin;
            this.f17528b = dVar;
            this.f17529c = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            if (obj instanceof String) {
                C13479a.m54764b("DriveComponent", "liveInnerSaveCache() ds=String");
                C6333d.m25445a(this.f17528b, (C7086a) this.f17529c.mo27261l().getFileModel(), (String) obj);
            } else if (obj instanceof byte[]) {
                C13479a.m54764b("DriveComponent", "liveInnerSaveCache() ds=byte[]");
                C6333d.m25443a(this.f17527a.getContext(), this.f17528b, (C7086a) this.f17529c.mo27261l().getFileModel(), (byte[]) obj);
            } else if (obj instanceof C6956b) {
                C13479a.m54764b("DriveComponent", "liveInnerSaveCache() ds=ExcelSubCacheModel]");
                C6333d.m25444a(this.f17528b, (C7086a) this.f17529c.mo27261l().getFileModel());
            } else if (obj instanceof StreamingCache) {
                C13479a.m54764b("DriveComponent", "liveInnerSaveCache() ds=StreamingCache]");
                C6331b.m25420a(C6891a.m27228a(this.f17529c.mo27261l()), this.f17529c.mo27261l().getIFileModel(), (StreamingCache) obj);
            }
        }
    }
}
