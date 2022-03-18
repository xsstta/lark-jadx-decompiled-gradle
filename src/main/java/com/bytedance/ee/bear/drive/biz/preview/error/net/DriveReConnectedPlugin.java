package com.bytedance.ee.bear.drive.biz.preview.error.net;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/net/DriveReConnectedPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveReConnectedPlugin extends AbsDrivePlugin {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.net.DriveReConnectedPlugin$a */
    public static final class C6578a<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f18069a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f18070b;

        /* renamed from: c */
        final /* synthetic */ Ref.BooleanRef f18071c;

        C6578a(DrivePluginHost aVar, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2) {
            this.f18069a = aVar;
            this.f18070b = booleanRef;
            this.f18071c = booleanRef2;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            AbstractC6946a fileModel;
            if (networkState != null) {
                C6891a.m27236d(this.f18069a).liveOuterNetState().mo5926a(Boolean.valueOf(networkState.mo20041b()));
                if (this.f18070b.element && !this.f18071c.element && networkState.mo20041b() && (this.f18069a.mo27261l().getFileModel() == null || ((fileModel = this.f18069a.mo27261l().getFileModel()) != null && fileModel.mo27347n()))) {
                    C13479a.m54764b("DriveComponent", "DriveReConnectedPlugin#recontect start load");
                    this.f18069a.mo27262m().mo27298b();
                }
            }
            this.f18071c.element = false;
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        booleanRef2.element = C4211a.m17514a().mo16536a("spacekit.mobile.drive.reconnected_reload", false);
        C13479a.m54764b("DriveComponent", "DriveReConnectedPlugin fgEnable=" + booleanRef2.element);
        C6891a.m27232a(this, new C6578a(aVar, booleanRef2, booleanRef));
    }
}
