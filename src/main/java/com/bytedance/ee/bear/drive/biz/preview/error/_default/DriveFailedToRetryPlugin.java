package com.bytedance.ee.bear.drive.biz.preview.error._default;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.drive.biz.cache.CacheUtils;
import com.bytedance.ee.bear.drive.biz.external.C6418d;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.biz.preview.DrivePreviewContentPlugin;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM;
import com.bytedance.ee.bear.drive.view.preview.p367c.C7261e;
import com.bytedance.ee.bear.drive.view.preview.retryview.FailedToRetryView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7550b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.PlaceHolderView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/_default/DriveFailedToRetryPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mMimeTypePreloadEnable", "", "getMMimeTypePreloadEnable", "()Z", "reloadDp", "Lio/reactivex/disposables/Disposable;", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachPreview", "showFailedToRetryView", "Lcom/bytedance/ee/bear/drive/view/preview/retryview/FailedToRetryView;", "showFilePreviewFailed", "viewModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewViewModel;", "driveModel", "Lcom/bytedance/ee/bear/drive/core/DriveViewModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public class DriveFailedToRetryPlugin extends AbsDrivePreviewPlugin {
    public final C68289a compositeDisposable = new C68289a();
    private final boolean mMimeTypePreloadEnable = C4211a.m17514a().mo16536a("spacekit.mobile.drive_preview_meta_preload_enable", false);
    public Disposable reloadDp;

    public final boolean getMMimeTypePreloadEnable() {
        return this.mMimeTypePreloadEnable;
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        this.compositeDisposable.mo237935a();
    }

    /* access modifiers changed from: protected */
    public FailedToRetryView showFailedToRetryView() {
        C7261e eVar = new C7261e(getActivity());
        LifecycleOwner lifecycleOwner = getLifecycleOwner();
        DrivePluginHost aVar = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        FailedToRetryView a = eVar.mo28363a(lifecycleOwner, C6891a.m27236d(aVar), true);
        Intrinsics.checkExpressionValueIsNotNull(a, "retryViewManager.getRetr…previewViewModel(), true)");
        removeAndAddPreviewView(a);
        a.mo28993c();
        if (((DriveBlockPreviewVM) viewModel(DriveBlockPreviewVM.class)).isFromBlockPreview()) {
            a.mo28994d();
        }
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/error/_default/DriveFailedToRetryPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onFailed", "", "code", "Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error._default.DriveFailedToRetryPlugin$a */
    public static final class C6569a extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveFailedToRetryPlugin f18055a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6569a(DriveFailedToRetryPlugin driveFailedToRetryPlugin) {
            this.f18055a = driveFailedToRetryPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25511a(ErrCode errCode) {
            AbstractC7549a aVar;
            Intrinsics.checkParameterIsNotNull(errCode, "code");
            DrivePreviewContentPlugin drivePreviewContentPlugin = (DrivePreviewContentPlugin) this.f18055a.findPlugin(DrivePreviewContentPlugin.class);
            if (drivePreviewContentPlugin != null) {
                aVar = drivePreviewContentPlugin.currentPreviewView();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                C13479a.m54764b("DriveComponent", "DriveFailedToRetryPlugin#error in preview, ignore");
                return;
            }
            switch (C6575a.f18064a[errCode.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.f18055a.showFailedToRetryView();
                    return;
                case 6:
                    C13479a.m54764b("DriveComponent", "DriveFailedToRetryPlugin RUST_NOT_LOGIN not show retry and openExternal ");
                    this.f18055a.showFailedToRetryView().mo28988a().mo28992b();
                    return;
                case 7:
                    this.f18055a.showFailedToRetryView().mo28989a(false).setPlaceHolderText(this.f18055a.getResources().getString(R.string.CreationMobile_ECM_CreateLaterToast));
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error._default.DriveFailedToRetryPlugin$b */
    public static final class C6570b<T> implements AbstractC1178x<Void> {

        /* renamed from: a */
        final /* synthetic */ DriveFailedToRetryPlugin f18056a;

        C6570b(DriveFailedToRetryPlugin driveFailedToRetryPlugin) {
            this.f18056a = driveFailedToRetryPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Void r1) {
            this.f18056a.showFailedToRetryView();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error._default.DriveFailedToRetryPlugin$c */
    public static final class C6571c<T> implements AbstractC1178x<Void> {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f18057a;

        C6571c(DrivePluginHost aVar) {
            this.f18057a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Void r1) {
            C6891a.m27235c(this.f18057a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error._default.DriveFailedToRetryPlugin$e */
    public static final class C6574e<T> implements AbstractC1178x<Void> {

        /* renamed from: a */
        final /* synthetic */ DriveFailedToRetryPlugin f18061a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18062b;

        /* renamed from: c */
        final /* synthetic */ C7555f f18063c;

        C6574e(DriveFailedToRetryPlugin driveFailedToRetryPlugin, DrivePluginHost aVar, C7555f fVar) {
            this.f18061a = driveFailedToRetryPlugin;
            this.f18062b = aVar;
            this.f18063c = fVar;
        }

        /* renamed from: a */
        public final void onChanged(Void r3) {
            if (this.f18062b.mo27261l().getFileModel() != null) {
                this.f18063c.liveOuterExportVisible().mo5926a((Boolean) true);
                this.f18061a.showFilePreviewFailed(this.f18063c, this.f18062b.mo27261l());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error._default.DriveFailedToRetryPlugin$d */
    public static final class C6572d<T> implements AbstractC1178x<Void> {

        /* renamed from: a */
        final /* synthetic */ DriveFailedToRetryPlugin f18058a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18059b;

        C6572d(DriveFailedToRetryPlugin driveFailedToRetryPlugin, DrivePluginHost aVar) {
            this.f18058a = driveFailedToRetryPlugin;
            this.f18059b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Void r4) {
            C6891a.m27234b(this.f18059b).mo27893a(C6891a.m27230a((BasePlugin<DrivePluginHost>) this.f18058a), true, 3);
            Disposable disposable = this.f18058a.reloadDp;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f18058a.reloadDp = CacheUtils.f17530a.mo25428a(this.f18059b.mo27261l(), new Runnable(this) {
                /* class com.bytedance.ee.bear.drive.biz.preview.error._default.DriveFailedToRetryPlugin.C6572d.RunnableC65731 */

                /* renamed from: a */
                final /* synthetic */ C6572d f18060a;

                {
                    this.f18060a = r1;
                }

                public final void run() {
                    C13479a.m54764b("DriveComponent", "liveInnerReload() removeCache done start reload. isUIContainerDetached=" + this.f18060a.f18058a.isUIContainerDetached());
                    if (!this.f18060a.f18058a.isUIContainerDetached()) {
                        this.f18060a.f18059b.mo27262m().mo27298b();
                    }
                }
            });
            C68289a aVar = this.f18058a.compositeDisposable;
            Disposable disposable2 = this.f18058a.reloadDp;
            if (disposable2 == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo237937a(disposable2);
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        aVar.mo27262m().mo27297a(new C6569a(this));
        C6891a.m27236d(aVar).liveInnerShowRetryPage().mo5923a(getLifecycleOwner(), new C6570b(this));
        C6891a.m27236d(aVar).liveInnerClosePage().mo5923a(getLifecycleOwner(), new C6571c(aVar));
        C7555f d = C6891a.m27236d(aVar);
        d.liveInnerReload().mo5923a(getLifecycleOwner(), new C6572d(this, aVar));
        d.getLiveInnerShowPreviewFailedPage().mo5923a(getLifecycleOwner(), new C6574e(this, aVar, d));
    }

    /* access modifiers changed from: protected */
    public void showFilePreviewFailed(C7555f fVar, C6937b bVar) {
        AbstractC6946a fileModel;
        boolean z;
        int i;
        Intrinsics.checkParameterIsNotNull(fVar, "viewModel");
        Intrinsics.checkParameterIsNotNull(bVar, "driveModel");
        if (C13726a.m55676b(getActivity()) && (fileModel = bVar.getFileModel()) != null) {
            if (!this.mMimeTypePreloadEnable || fileModel.mo27355u()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = R.string.Drive_Drive_File_Preview_Failed;
            } else {
                i = R.string.CreationMobile_Preview_ExtensionMismatch_placeholder;
            }
            PlaceHolderView placeHolderView = new PlaceHolderView(getContext());
            placeHolderView.setImagePlaceHolder(R.drawable.illustration_empty_neutral_no_preview);
            placeHolderView.setTipsText(getContext().getString(i));
            placeHolderView.setBtnText(getContext().getString(R.string.Drive_Drive_OpenWithOtherApps));
            C7550b bVar2 = new C7550b(getContext(), placeHolderView, C6418d.m25763a(((DrivePluginHost) getHost()).mo27261l().getBizType(), getContext(), ar.m20936a()), new ViewOwner(getHost(), getLifecycleOwner()), fileModel.mo27356v());
            PlaceHolderView a = bVar2.mo29469a();
            Intrinsics.checkExpressionValueIsNotNull(a, "invalidViewWrapper.view");
            removeAndAddPreviewView(a);
            bVar2.mo29470b();
        }
    }
}
