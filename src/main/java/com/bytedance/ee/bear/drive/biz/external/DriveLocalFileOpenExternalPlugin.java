package com.bytedance.ee.bear.drive.biz.external;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.OpenExternalMenu;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p702e.C13657b;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/external/DriveLocalFileOpenExternalPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveLocalFileOpenExternalPlugin extends AbsDrivePlugin {
    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        BaseOpenEntity openEntity = aVar.mo27261l().getOpenEntity();
        if (openEntity != null) {
            C6891a.m27236d(aVar).liveInnerOpenExternal().mo5923a(getLifecycleOwner(), new C6410a(this, (LocalOpenEntity) openEntity, aVar));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.external.DriveLocalFileOpenExternalPlugin$a */
    public static final class C6410a<T> implements AbstractC1178x<Void> {

        /* renamed from: a */
        final /* synthetic */ DriveLocalFileOpenExternalPlugin f17717a;

        /* renamed from: b */
        final /* synthetic */ LocalOpenEntity f17718b;

        /* renamed from: c */
        final /* synthetic */ DrivePluginHost f17719c;

        C6410a(DriveLocalFileOpenExternalPlugin driveLocalFileOpenExternalPlugin, LocalOpenEntity localOpenEntity, DrivePluginHost aVar) {
            this.f17717a = driveLocalFileOpenExternalPlugin;
            this.f17718b = localOpenEntity;
            this.f17719c = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Void r8) {
            if (!TextUtils.isEmpty(this.f17718b.getFileId())) {
                IAuditApi cVar = (IAuditApi) KoinJavaComponent.m268613a(IAuditApi.class, null, null, 6, null);
                String appId = this.f17718b.getAppId();
                String fileId = this.f17718b.getFileId();
                Intrinsics.checkExpressionValueIsNotNull(fileId, "openEntity.fileId");
                cVar.mo37702a(16, 13, appId, fileId, (Boolean) true, this.f17718b.getThirdPartyAppID());
            }
            BaseOpenEntity openEntity = this.f17719c.mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
            if (!C13657b.m55421a(openEntity.getMoreMenuActions())) {
                BaseOpenEntity openEntity2 = this.f17719c.mo27261l().getOpenEntity();
                Intrinsics.checkExpressionValueIsNotNull(openEntity2, "host.driveViewModel.openEntity");
                Iterator<BaseMoreMenuAction> it = openEntity2.getMoreMenuActions().iterator();
                while (it.hasNext()) {
                    BaseMoreMenuAction next = it.next();
                    if ((next instanceof OpenExternalMenu) && next.mo20438b() != null) {
                        try {
                            BinderMenuAction b = next.mo20438b();
                            if (b != null) {
                                b.action(new Bundle());
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            C13479a.m54759a("DriveComponent", "liveInnerOpenExternal() custom OpenExternalMenu action error", e);
                            return;
                        }
                    }
                }
            }
            C13675f.m55495a(this.f17717a.getContext(), new File(this.f17718b.getLocalFilePath()), "");
        }
    }
}
