package com.bytedance.ee.bear.drive.biz.preview.uicallback;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BinderOpenLifecycle;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/uicallback/DriveOpenLifecyclePlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachPreview", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachFromHost", "onDetachPreview", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveOpenLifecyclePlugin extends AbsDrivePlugin {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/uicallback/DriveOpenLifecyclePlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.uicallback.DriveOpenLifecyclePlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        BinderOpenLifecycle binderOpenLifecycle;
        super.onAttachPreview();
        BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
        if (openEntity != null && (binderOpenLifecycle = openEntity.getBinderOpenLifecycle()) != null) {
            try {
                C13479a.m54764b("DriveOpenLifecyclePlugin", "loadStart()#onAttachPreview() start");
                binderOpenLifecycle.onVisibleChange(true);
            } catch (Throwable th) {
                C13479a.m54759a("DriveOpenLifecyclePlugin", "loadStart()#onAttachData() err=", th);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        BinderOpenLifecycle binderOpenLifecycle;
        super.onDetachPreview();
        BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
        if (openEntity != null && (binderOpenLifecycle = openEntity.getBinderOpenLifecycle()) != null) {
            try {
                C13479a.m54764b("DriveOpenLifecyclePlugin", "onDetachPreview()#binderOpenLifecycle start");
                binderOpenLifecycle.onVisibleChange(false);
            } catch (Throwable th) {
                C13479a.m54759a("DriveOpenLifecyclePlugin", "onDetachPreview()#binderOpenLifecycle err=", th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.uicallback.DriveOpenLifecyclePlugin$b */
    public static final class C6716b<T> implements AbstractC1178x<Void> {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f18302a;

        C6716b(DrivePluginHost aVar) {
            this.f18302a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Void r1) {
            C6891a.m27235c(this.f18302a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/uicallback/DriveOpenLifecyclePlugin$onAttachToHost$showListener$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.uicallback.DriveOpenLifecyclePlugin$c */
    public static final class C6717c extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f18303a;

        C6717c(DrivePluginHost aVar) {
            this.f18303a = aVar;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            if (infoCode == InfoCode.LoadStart) {
                this.f18303a.mo27262m().mo27299b(this);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        aVar.mo27262m().mo27297a(new C6717c(aVar));
        C6891a.m27236d(aVar).liveInnerClosePage().mo5923a(getLifecycleOwner(), new C6716b(aVar));
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachFromHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onDetachFromHost(aVar);
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        if (f.mo27178g() != null && C13726a.m55676b(getActivity())) {
            C6920b f2 = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f2, "DriveConfigServiceImpl.getInstance()");
            f2.mo27178g().mo28223a();
        }
        try {
            BaseOpenEntity openEntity = aVar.mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
            BinderOpenLifecycle binderOpenLifecycle = openEntity.getBinderOpenLifecycle();
            if (binderOpenLifecycle != null) {
                binderOpenLifecycle.onClose();
            }
        } catch (Throwable th) {
            C13479a.m54759a("DriveComponent", "DriveOpenLifecyclePlugin#onDetachFromHost() err=", th);
        }
    }
}
