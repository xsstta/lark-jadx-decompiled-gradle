package com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile;

import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.contract.AbstractC5080aa;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.extra_info.DriveSpaceFileExtraInfoViewPlugin;
import com.bytedance.ee.bear.drive.biz.extra_info.FileExtraInfoView;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.rn.AbstractC10638e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0015J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/ownerdeletefile/DriveSpaceOwnerDeleteFilePlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/error/ownerdeletefile/DriveOwnerDeletedFilePlugin;", "()V", "mFileDeletePushSDK", "Lcom/bytedance/ee/bear/rn/RnFileDeleteProtocol;", "handleOwnerDeleteFile", "", "onAttachPreview", "onDetachPreview", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceOwnerDeleteFilePlugin extends DriveOwnerDeletedFilePlugin {
    public static final Companion Companion = new Companion(null);
    private AbstractC10638e mFileDeletePushSDK;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile.DriveSpaceOwnerDeleteFilePlugin$c */
    public static final class C6586c<T> implements Consumer<Boolean> {

        /* renamed from: a */
        public static final C6586c f18080a = new C6586c();

        C6586c() {
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/ownerdeletefile/DriveSpaceOwnerDeleteFilePlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile.DriveSpaceOwnerDeleteFilePlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        AbstractC10638e eVar = this.mFileDeletePushSDK;
        if (eVar != null) {
            eVar.mo40334a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/koin/core/parameter/DefinitionParameters;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile.DriveSpaceOwnerDeleteFilePlugin$e */
    static final class C6588e extends Lambda implements Function0<DefinitionParameters> {
        final /* synthetic */ DriveSpaceOwnerDeleteFilePlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6588e(DriveSpaceOwnerDeleteFilePlugin driveSpaceOwnerDeleteFilePlugin) {
            super(0);
            this.this$0 = driveSpaceOwnerDeleteFilePlugin;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefinitionParameters invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("NOTICE_");
            C8275a aVar = C8275a.f22375h;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
            sb.append(aVar.mo32555b());
            sb.append("_");
            return C70039b.m268661a(sb.toString(), C6891a.m27230a((BasePlugin<DrivePluginHost>) this.this$0));
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        super.onAttachPreview();
        AbstractC10638e eVar = (AbstractC10638e) KoinJavaComponent.m268612a(AbstractC10638e.class, null, new C6588e(this));
        this.mFileDeletePushSDK = eVar;
        if (eVar != null) {
            eVar.mo40335a(new C6589f(this));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile.DriveOwnerDeletedFilePlugin
    public void handleOwnerDeleteFile() {
        FileExtraInfoView fileExtraView;
        super.handleOwnerDeleteFile();
        Intrinsics.checkExpressionValueIsNotNull(ar.f14811a.mo41508c(AbstractC5080aa.class).mo238020d(new C6585b(this)).mo238001b(C6586c.f18080a, C6587d.f18081a), "ServiceHolder.serviceCon… Log.e(TAG, throwable) })");
        BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
        ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31522e(openEntity.getFileId());
        DriveSpaceFileExtraInfoViewPlugin driveSpaceFileExtraInfoViewPlugin = (DriveSpaceFileExtraInfoViewPlugin) findPlugin(DriveSpaceFileExtraInfoViewPlugin.class);
        if (driveSpaceFileExtraInfoViewPlugin != null && (fileExtraView = driveSpaceFileExtraInfoViewPlugin.getFileExtraView()) != null) {
            fileExtraView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile.DriveSpaceOwnerDeleteFilePlugin$d */
    public static final class C6587d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C6587d f18081a = new C6587d();

        C6587d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("DriveSpaceOwnerDeleteFilePlugin", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "badgeService", "Lcom/bytedance/ee/bear/contract/BadgeService;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile.DriveSpaceOwnerDeleteFilePlugin$b */
    public static final class C6585b<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceOwnerDeleteFilePlugin f18079a;

        C6585b(DriveSpaceOwnerDeleteFilePlugin driveSpaceOwnerDeleteFilePlugin) {
            this.f18079a = driveSpaceOwnerDeleteFilePlugin;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo26200a((AbstractC5080aa) obj));
        }

        /* renamed from: a */
        public final boolean mo26200a(AbstractC5080aa aaVar) {
            Intrinsics.checkParameterIsNotNull(aaVar, "badgeService");
            BaseOpenEntity openEntity = ((DrivePluginHost) this.f18079a.getHost()).mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
            aaVar.remove(openEntity.getFileId());
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "didReceivePush"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile.DriveSpaceOwnerDeleteFilePlugin$f */
    static final class C6589f implements AbstractC10638e.AbstractC10639a {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceOwnerDeleteFilePlugin f18082a;

        C6589f(DriveSpaceOwnerDeleteFilePlugin driveSpaceOwnerDeleteFilePlugin) {
            this.f18082a = driveSpaceOwnerDeleteFilePlugin;
        }

        @Override // com.bytedance.ee.bear.rn.AbstractC10638e.AbstractC10639a
        /* renamed from: a */
        public final void mo26203a(String str) {
            C13479a.m54764b("DriveComponent", "receive file delete push");
            C13748k.m55732a(new Runnable(this) {
                /* class com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile.DriveSpaceOwnerDeleteFilePlugin.C6589f.RunnableC65901 */

                /* renamed from: a */
                final /* synthetic */ C6589f f18083a;

                {
                    this.f18083a = r1;
                }

                public final void run() {
                    if (!this.f18083a.f18082a.isUIContainerDetached()) {
                        this.f18083a.f18082a.handleOwnerDeleteFile();
                    }
                }
            });
        }
    }
}
