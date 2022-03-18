package com.bytedance.ee.bear.drive.biz.preview.more;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity;
import com.bytedance.ee.bear.drive.biz.external.C6414b;
import com.bytedance.ee.bear.drive.biz.external.C6418d;
import com.bytedance.ee.bear.drive.biz.importfile.p328b.C6476a;
import com.bytedance.ee.bear.drive.biz.preview.more.MoreMenuActionExecuteHelper;
import com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile.SpaceFileDownloadManager;
import com.bytedance.ee.bear.drive.biz.save2space.DriveSpaceFileAttachmentExecutor;
import com.bytedance.ee.bear.drive.biz.save2space.SaveToSpaceErrorUtils;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6947b;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.p325b.C6319a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.DownloadMenu;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenu;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenuV2;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToSpaceMenu;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.p567a.C11816b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0000J\u0006\u0010\u0017\u001a\u00020\u0000J\u0006\u0010\u0018\u001a\u00020\u0019J\u001e\u0010\u001a\u001a\u00020\u00002\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e2\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\nR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/DriveAttachmentMoreMenuCreator;", "", "context", "Landroidx/fragment/app/FragmentActivity;", "vm", "Lcom/bytedance/ee/bear/drive/core/DriveViewModel;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Landroidx/fragment/app/FragmentActivity;Lcom/bytedance/ee/bear/drive/core/DriveViewModel;Lio/reactivex/disposables/CompositeDisposable;)V", "actionSheet", "Lcom/bytedance/ee/bear/widgets/ActionSheet;", "kotlin.jvm.PlatformType", "injectDefaultActionMap", "", "Ljava/lang/Class;", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/menu/BaseMoreMenuAction;", "Lcom/bytedance/ee/bear/drive/biz/preview/more/Action;", "addCancelItem", "buildDownloadMenuItem", "buildImportFileMenuItemForSpaceAttachment", "buildOpenMenuItems", "", "buildOpenOtherAppMenuItem", "buildSaveToSpaceMenuItemForSpaceFile", "hasMenuItem", "", "injectDefaultMenuAction", "clazz", "action", "show", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.b */
public final class DriveAttachmentMoreMenuCreator {

    /* renamed from: a */
    public final Map<Class<? extends BaseMoreMenuAction>, Action> f18155a = new HashMap();

    /* renamed from: b */
    public final FragmentActivity f18156b;

    /* renamed from: c */
    public final C6937b f18157c;

    /* renamed from: d */
    public final C68289a f18158d;

    /* renamed from: e */
    private final C11811a f18159e;

    /* renamed from: e */
    public final DriveAttachmentMoreMenuCreator mo26311e() {
        this.f18159e.mo45213a();
        return this;
    }

    /* renamed from: f */
    public final C11811a mo26312f() {
        this.f18159e.mo45231c();
        C11811a aVar = this.f18159e;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "actionSheet");
        return aVar;
    }

    /* renamed from: a */
    public final DriveAttachmentMoreMenuCreator mo26306a() {
        float f;
        BaseOpenEntity openEntity = this.f18157c.getOpenEntity();
        C8275a aVar = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
        int b = aVar.mo32555b();
        Intrinsics.checkExpressionValueIsNotNull(openEntity, "openEntity");
        boolean e = ((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36546e(b, openEntity.getFileId());
        C11811a aVar2 = this.f18159e;
        C11816b.C11818a a = C11816b.m49006a().mo45254a(this.f18156b.getText(R.string.Drive_Drive_OpenWithOtherApps));
        if (e) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        aVar2.mo45219a(a.mo45250a(f).mo45253a(new View$OnClickListenerC6654d(this, e, openEntity)).mo45257a());
        return this;
    }

    /* renamed from: b */
    public final DriveAttachmentMoreMenuCreator mo26308b() {
        if (!(this.f18157c.getOpenEntity() instanceof BaseSpaceOpenEntity)) {
            return this;
        }
        BaseOpenEntity openEntity = this.f18157c.getOpenEntity();
        if (openEntity != null) {
            BaseSpaceOpenEntity baseSpaceOpenEntity = (BaseSpaceOpenEntity) openEntity;
            if (!C13657b.m55421a(baseSpaceOpenEntity.getMoreMenuActions())) {
                Iterator<BaseMoreMenuAction> it = baseSpaceOpenEntity.getMoreMenuActions().iterator();
                while (it.hasNext()) {
                    BaseMoreMenuAction next = it.next();
                    if ((next instanceof SaveToSpaceMenu) && !((SaveToSpaceMenu) next).mo20446g()) {
                        C13479a.m54764b("DriveComponent", "buildSaveToSpaceMenuItemForSpaceFile() is not visible, ignore add menu");
                        return this;
                    }
                }
            }
            this.f18159e.mo45221a(this.f18156b.getResources().getString(R.string.Drive_Drive_SaveToSpace), new View$OnClickListenerC6657e(this, baseSpaceOpenEntity));
            return this;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity");
    }

    /* renamed from: c */
    public final DriveAttachmentMoreMenuCreator mo26309c() {
        if (!(this.f18157c.getOpenEntity() instanceof BaseSpaceOpenEntity)) {
            return this;
        }
        BaseOpenEntity openEntity = this.f18157c.getOpenEntity();
        if (openEntity != null) {
            BaseSpaceOpenEntity baseSpaceOpenEntity = (BaseSpaceOpenEntity) openEntity;
            C7086a aVar = (C7086a) this.f18157c.getFileModel();
            if (C6476a.m26022a(aVar)) {
                View$OnClickListenerC6652b bVar = new View$OnClickListenerC6652b(this, baseSpaceOpenEntity, aVar);
                if (((AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null)).mo38977a("item_import_fileV2")) {
                    this.f18159e.mo45229c(C6476a.m26024b(aVar), bVar);
                } else {
                    this.f18159e.mo45221a(this.f18156b.getResources().getString(C6476a.m26024b(aVar)), bVar);
                }
                ((AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null)).mo38980b("item_import_fileV2");
            }
            return this;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity");
    }

    /* renamed from: d */
    public final DriveAttachmentMoreMenuCreator mo26310d() {
        float f;
        BaseOpenEntity openEntity = this.f18157c.getOpenEntity();
        C8275a aVar = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
        int b = aVar.mo32555b();
        Intrinsics.checkExpressionValueIsNotNull(openEntity, "openEntity");
        boolean b2 = ((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36543b(b, openEntity.getFileId());
        C11811a aVar2 = this.f18159e;
        C11816b.C11818a a = C11816b.m49006a().mo45254a(this.f18156b.getText(R.string.CreationMobile_ECM_SaveToLocal_option));
        if (b2) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        aVar2.mo45219a(a.mo45250a(f).mo45253a(new View$OnClickListenerC6651a(this, openEntity)).mo45257a());
        return this;
    }

    /* renamed from: g */
    private final void m26347g() {
        float f;
        BaseOpenEntity openEntity = this.f18157c.getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity, "vm.openEntity");
        if (!C13657b.m55421a(openEntity.getMoreMenuActions())) {
            BaseOpenEntity openEntity2 = this.f18157c.getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity2, "vm.openEntity");
            Iterator<BaseMoreMenuAction> it = openEntity2.getMoreMenuActions().iterator();
            while (it.hasNext()) {
                BaseMoreMenuAction next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "menuAction");
                if (next.mo20433a() == 0) {
                    C13479a.m54758a("DriveSdk", "initMenuActions menuAction name empty!!!, class=" + next.getClass());
                } else if (!next.mo20446g() || !next.mo20447h()) {
                    C13479a.m54775e("DriveSdk", "initMenuActions menuAction not isVisible!!!, class=" + next.getClass() + ", isAddByDefault=" + next.mo20447h());
                } else {
                    next.mo20436a(this.f18157c.getOpenEntity());
                    boolean e = next.mo20444e();
                    C11811a aVar = this.f18159e;
                    C11816b.C11818a a = C11816b.m49006a().mo45254a(this.f18156b.getText(next.mo20433a()));
                    if (e) {
                        f = 1.0f;
                    } else {
                        f = 0.3f;
                    }
                    aVar.mo45219a(a.mo45250a(f).mo45253a(new View$OnClickListenerC6653c(this, e, next)).mo45257a());
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.b$a */
    static final class View$OnClickListenerC6651a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DriveAttachmentMoreMenuCreator f18160a;

        /* renamed from: b */
        final /* synthetic */ BaseOpenEntity f18161b;

        View$OnClickListenerC6651a(DriveAttachmentMoreMenuCreator bVar, BaseOpenEntity baseOpenEntity) {
            this.f18160a = bVar;
            this.f18161b = baseOpenEntity;
        }

        public final void onClick(View view) {
            FragmentActivity fragmentActivity = this.f18160a.f18156b;
            BaseOpenEntity baseOpenEntity = this.f18161b;
            if (baseOpenEntity != null) {
                new SpaceFileDownloadManager(fragmentActivity, baseOpenEntity, this.f18160a.f18157c.getFileModel()).mo26339a();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.b$b */
    static final class View$OnClickListenerC6652b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DriveAttachmentMoreMenuCreator f18162a;

        /* renamed from: b */
        final /* synthetic */ BaseSpaceOpenEntity f18163b;

        /* renamed from: c */
        final /* synthetic */ C7086a f18164c;

        View$OnClickListenerC6652b(DriveAttachmentMoreMenuCreator bVar, BaseSpaceOpenEntity baseSpaceOpenEntity, C7086a aVar) {
            this.f18162a = bVar;
            this.f18163b = baseSpaceOpenEntity;
            this.f18164c = aVar;
        }

        public final void onClick(View view) {
            String str;
            C7086a.C7087a x;
            String fileId = this.f18163b.getFileId();
            C7086a aVar = this.f18164c;
            if (aVar == null || (x = aVar.mo27322a()) == null) {
                str = null;
            } else {
                str = x.mo27358a();
            }
            ImportFileEntity importFileEntity = new ImportFileEntity(fileId, str);
            importFileEntity.f18858a = new DriveAttachmentMoreMenuCreator$buildImportFileMenuItemForSpaceAttachment$listener$1$1();
            C6319a.m25392a(this.f18162a.f18156b, importFileEntity);
            C6920b f = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
            f.mo27166a().mo27931b(this.f18164c, "import_as", "ccm_docs_page_view");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.b$c */
    public static final class View$OnClickListenerC6653c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DriveAttachmentMoreMenuCreator f18165a;

        /* renamed from: b */
        final /* synthetic */ boolean f18166b;

        /* renamed from: c */
        final /* synthetic */ BaseMoreMenuAction f18167c;

        View$OnClickListenerC6653c(DriveAttachmentMoreMenuCreator bVar, boolean z, BaseMoreMenuAction baseMoreMenuAction) {
            this.f18165a = bVar;
            this.f18166b = z;
            this.f18167c = baseMoreMenuAction;
        }

        public final void onClick(View view) {
            if (!this.f18166b) {
                BaseMoreMenuAction baseMoreMenuAction = this.f18167c;
                Intrinsics.checkExpressionValueIsNotNull(baseMoreMenuAction, "menuAction");
                if (baseMoreMenuAction.mo20445f() != -1) {
                    BaseMoreMenuAction baseMoreMenuAction2 = this.f18167c;
                    Intrinsics.checkExpressionValueIsNotNull(baseMoreMenuAction2, "menuAction");
                    Toast.showText(C13615c.f35773a, baseMoreMenuAction2.mo20445f());
                    return;
                }
            }
            BaseMoreMenuAction baseMoreMenuAction3 = this.f18167c;
            if ((baseMoreMenuAction3 instanceof DownloadMenu) || (baseMoreMenuAction3 instanceof SaveToLocalMenu) || (baseMoreMenuAction3 instanceof SaveToLocalMenuV2)) {
                MoreMenuActionExecuteHelper.f18177a.mo26321a(this.f18165a.f18158d, this.f18165a.f18156b, this.f18167c, this.f18165a.f18155a.get(this.f18167c.getClass()));
                return;
            }
            MoreMenuActionExecuteHelper.Companion aVar = MoreMenuActionExecuteHelper.f18177a;
            C68289a aVar2 = this.f18165a.f18158d;
            BaseMoreMenuAction baseMoreMenuAction4 = this.f18167c;
            Intrinsics.checkExpressionValueIsNotNull(baseMoreMenuAction4, "menuAction");
            aVar.mo26322a(aVar2, baseMoreMenuAction4, this.f18165a.f18155a.get(this.f18167c.getClass()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.b$e */
    public static final class View$OnClickListenerC6657e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DriveAttachmentMoreMenuCreator f18173a;

        /* renamed from: b */
        final /* synthetic */ BaseSpaceOpenEntity f18174b;

        View$OnClickListenerC6657e(DriveAttachmentMoreMenuCreator bVar, BaseSpaceOpenEntity baseSpaceOpenEntity) {
            this.f18173a = bVar;
            this.f18174b = baseSpaceOpenEntity;
        }

        public final void onClick(View view) {
            AbstractC6946a aVar = null;
            this.f18173a.f18158d.mo237937a(new DriveSpaceFileAttachmentExecutor((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo26533a(this.f18174b.getFileId(), this.f18174b.getMountPoint(), this.f18173a.f18157c.getFileName(), this.f18174b.getApiExtra()).mo238001b(new Consumer<DriveSpaceFileAttachmentExecutor.AttachSaveResponse>(this) {
                /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveAttachmentMoreMenuCreator.View$OnClickListenerC6657e.C66581 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC6657e f18175a;

                {
                    this.f18175a = r1;
                }

                /* renamed from: a */
                public final void accept(DriveSpaceFileAttachmentExecutor.AttachSaveResponse attachSaveResponse) {
                    C13479a.m54764b("DriveComponent", "saveToSpace success");
                    Toast.showSuccessText(this.f18175a.f18173a.f18156b, this.f18175a.f18173a.f18156b.getResources().getString(R.string.Drive_Drive_SaveSuccess), 0);
                }
            }, new Consumer<Throwable>(this) {
                /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveAttachmentMoreMenuCreator.View$OnClickListenerC6657e.C66592 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC6657e f18176a;

                {
                    this.f18176a = r1;
                }

                /* renamed from: a */
                public final void accept(Throwable th) {
                    Long l;
                    AbstractC6947b a;
                    AbstractC6946a fileModel = this.f18176a.f18173a.f18157c.getFileModel();
                    if (fileModel == null || (a = fileModel.mo27322a()) == null) {
                        l = null;
                    } else {
                        l = Long.valueOf(a.f18787c);
                    }
                    C13479a.m54759a("DriveComponent", "saveToSpace fileSize = " + l + ", error", th);
                    if (!SaveToSpaceErrorUtils.f18351a.mo26540a(th, this.f18176a.f18173a.f18156b, l)) {
                        Toast.showFailureText(this.f18176a.f18173a.f18156b, this.f18176a.f18173a.f18156b.getResources().getString(R.string.Drive_Drive_SaveFailed), 0);
                    }
                }
            }));
            C6920b f = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
            C7130c a = f.mo27166a();
            AbstractC6949c iFileModel = this.f18173a.f18157c.getIFileModel();
            if (iFileModel != null) {
                aVar = iFileModel.mo27371a();
            }
            a.mo27931b(aVar, "save_to_drive", "none");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.b$d */
    static final class View$OnClickListenerC6654d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DriveAttachmentMoreMenuCreator f18168a;

        /* renamed from: b */
        final /* synthetic */ boolean f18169b;

        /* renamed from: c */
        final /* synthetic */ BaseOpenEntity f18170c;

        View$OnClickListenerC6654d(DriveAttachmentMoreMenuCreator bVar, boolean z, BaseOpenEntity baseOpenEntity) {
            this.f18168a = bVar;
            this.f18169b = z;
            this.f18170c = baseOpenEntity;
        }

        public final void onClick(View view) {
            long j;
            if (!this.f18169b) {
                Toast.showText(C13615c.f35773a, (int) R.string.CreationMobile_ECM_AdminDisableToast);
                return;
            }
            AbstractC6946a aVar = null;
            BaseOpenEntity baseOpenEntity = this.f18170c;
            Intrinsics.checkExpressionValueIsNotNull(baseOpenEntity, "openEntity");
            String fileId = baseOpenEntity.getFileId();
            Intrinsics.checkExpressionValueIsNotNull(fileId, "openEntity.fileId");
            ((IAuditApi) KoinJavaComponent.m268613a(IAuditApi.class, null, null, 6, null)).mo37701a(3, 13, fileId);
            C6418d a = C6418d.m25763a(this.f18168a.f18157c.getBizType(), this.f18168a.f18156b, ar.f14811a);
            a.mo25748a(new C6418d.AbstractC6422a(this) {
                /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveAttachmentMoreMenuCreator.View$OnClickListenerC6654d.C66551 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC6654d f18171a;

                @Override // com.bytedance.ee.bear.drive.biz.external.C6418d.AbstractC6422a
                /* renamed from: a */
                public void mo25739a() {
                }

                @Override // com.bytedance.ee.bear.drive.biz.external.C6418d.AbstractC6422a
                /* renamed from: a */
                public void mo25740a(AbstractC6946a aVar) {
                }

                @Override // com.bytedance.ee.bear.drive.biz.external.C6418d.AbstractC6422a
                /* renamed from: b */
                public void mo25741b() {
                }

                @Override // com.bytedance.ee.bear.drive.biz.external.C6418d.AbstractC6422a
                /* renamed from: c */
                public void mo25742c() {
                    C13748k.m55732a(new RunnableC6656a(this));
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
                /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.b$d$1$a */
                static final class RunnableC6656a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C66551 f18172a;

                    RunnableC6656a(C66551 r1) {
                        this.f18172a = r1;
                    }

                    public final void run() {
                        Toast.showText(this.f18172a.f18171a.f18168a.f18156b, (int) R.string.Drive_Drive_OpenFile_Fail);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f18171a = r1;
                }
            });
            AbstractC6949c iFileModel = this.f18168a.f18157c.getIFileModel();
            if (iFileModel != null) {
                j = iFileModel.mo27377g();
            } else {
                j = 0;
            }
            BaseOpenEntity baseOpenEntity2 = this.f18170c;
            Intrinsics.checkExpressionValueIsNotNull(baseOpenEntity2, "openEntity");
            String fileId2 = baseOpenEntity2.getFileId();
            BaseOpenEntity baseOpenEntity3 = this.f18170c;
            Intrinsics.checkExpressionValueIsNotNull(baseOpenEntity3, "openEntity");
            String apiExtra = baseOpenEntity3.getApiExtra();
            BaseOpenEntity baseOpenEntity4 = this.f18170c;
            Intrinsics.checkExpressionValueIsNotNull(baseOpenEntity4, "openEntity");
            a.mo25745a(j, fileId2, apiExtra, baseOpenEntity4.getMountPoint(), (C6414b) null);
            C6920b f = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
            C7130c a2 = f.mo27166a();
            if (iFileModel != null) {
                aVar = iFileModel.mo27371a();
            }
            a2.mo27931b(aVar, "open_in_other_apps", "none");
        }
    }

    /* renamed from: a */
    public final DriveAttachmentMoreMenuCreator mo26307a(Class<? extends BaseMoreMenuAction> cls, Action aVar) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(aVar, "action");
        this.f18155a.put(cls, aVar);
        return this;
    }

    public DriveAttachmentMoreMenuCreator(FragmentActivity fragmentActivity, C6937b bVar, C68289a aVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "vm");
        Intrinsics.checkParameterIsNotNull(aVar, "compositeDisposable");
        this.f18156b = fragmentActivity;
        this.f18157c = bVar;
        this.f18158d = aVar;
        this.f18159e = C11811a.m48976a(fragmentActivity);
        m26347g();
    }
}
