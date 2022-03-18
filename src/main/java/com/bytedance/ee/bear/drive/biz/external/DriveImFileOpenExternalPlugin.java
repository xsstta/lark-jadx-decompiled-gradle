package com.bytedance.ee.bear.drive.biz.external;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.preview.more.MoreMenuActionExecuteHelper;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.OpenExternalMenu;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.disposables.C68289a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/external/DriveImFileOpenExternalPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachFromHost", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveImFileOpenExternalPlugin extends AbsDrivePlugin {
    public final C68289a compositeDisposable = new C68289a();

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachFromHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onDetachFromHost(aVar);
        this.compositeDisposable.mo237935a();
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27236d(aVar).liveInnerOpenExternal().mo5923a(getLifecycleOwner(), new C6409a(this, aVar.mo27261l().getOpenEntity(), aVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.external.DriveImFileOpenExternalPlugin$a */
    public static final class C6409a<T> implements AbstractC1178x<Void> {

        /* renamed from: a */
        final /* synthetic */ DriveImFileOpenExternalPlugin f17714a;

        /* renamed from: b */
        final /* synthetic */ BaseOpenEntity f17715b;

        /* renamed from: c */
        final /* synthetic */ DrivePluginHost f17716c;

        C6409a(DriveImFileOpenExternalPlugin driveImFileOpenExternalPlugin, BaseOpenEntity baseOpenEntity, DrivePluginHost aVar) {
            this.f17714a = driveImFileOpenExternalPlugin;
            this.f17715b = baseOpenEntity;
            this.f17716c = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Void r10) {
            BaseOpenEntity baseOpenEntity = this.f17715b;
            Intrinsics.checkExpressionValueIsNotNull(baseOpenEntity, "openEntity");
            if (!TextUtils.isEmpty(baseOpenEntity.getFileId())) {
                IAuditApi cVar = (IAuditApi) KoinJavaComponent.m268613a(IAuditApi.class, null, null, 6, null);
                BaseOpenEntity baseOpenEntity2 = this.f17715b;
                Intrinsics.checkExpressionValueIsNotNull(baseOpenEntity2, "openEntity");
                String appId = baseOpenEntity2.getAppId();
                BaseOpenEntity baseOpenEntity3 = this.f17715b;
                Intrinsics.checkExpressionValueIsNotNull(baseOpenEntity3, "openEntity");
                String fileId = baseOpenEntity3.getFileId();
                Intrinsics.checkExpressionValueIsNotNull(fileId, "openEntity.fileId");
                cVar.mo37702a(16, 13, appId, fileId, (Boolean) false, (String) null);
            }
            BaseOpenEntity openEntity = this.f17716c.mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
            if (!C13657b.m55421a(openEntity.getMoreMenuActions())) {
                BaseOpenEntity openEntity2 = this.f17716c.mo27261l().getOpenEntity();
                Intrinsics.checkExpressionValueIsNotNull(openEntity2, "host.driveViewModel.openEntity");
                Iterator<BaseMoreMenuAction> it = openEntity2.getMoreMenuActions().iterator();
                while (it.hasNext()) {
                    BaseMoreMenuAction next = it.next();
                    if ((next instanceof OpenExternalMenu) && next.mo20438b() != null) {
                        try {
                            MoreMenuActionExecuteHelper.Companion aVar = MoreMenuActionExecuteHelper.f18177a;
                            C68289a aVar2 = this.f17714a.compositeDisposable;
                            FragmentActivity activity = this.f17714a.getActivity();
                            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
                            aVar.mo26321a(aVar2, activity, next, null);
                            return;
                        } catch (Exception e) {
                            C13479a.m54759a("DriveComponent", "liveInnerOpenExternal() custom OpenExternalMenu action error", e);
                            return;
                        }
                    }
                }
            }
        }
    }
}
