package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.C7474a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.TitleBarViewModel;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFOutlinePlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "hasLoad", "", "outlineDialog", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/structure/OutlineStructureFragment;", "hidePdfOutline", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "showPdfOutline", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PDFOutlinePlugin extends AbsDrivePlugin {
    public static final Companion Companion = new Companion(null);
    public boolean hasLoad;
    private C7474a outlineDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFOutlinePlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFOutlinePlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void hidePdfOutline() {
        C13479a.m54764b("PDFOutlineFragment", "hidePdfOutline. ");
        C7474a aVar = this.outlineDialog;
        if (aVar != null) {
            aVar.mo5513b();
        }
        this.outlineDialog = null;
    }

    public final void showPdfOutline() {
        C13479a.m54764b("PDFOutlineFragment", "showPdfOutline. ");
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        f.mo27166a().mo27937c();
        Fragment instantiateFragment = instantiateFragment(C7474a.class);
        Intrinsics.checkExpressionValueIsNotNull(instantiateFragment, "instantiateFragment(Outl…tureFragment::class.java)");
        C7474a aVar = (C7474a) instantiateFragment;
        FragmentTransaction beginTransaction = ((DrivePluginHost) getHost()).mo23794b().getChildFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "host.getFragment().child…anager.beginTransaction()");
        beginTransaction.add(aVar, "PDFOutlineFragment");
        beginTransaction.commitAllowingStateLoss();
        this.outlineDialog = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "active", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFOutlinePlugin$b */
    public static final class C7452b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ PDFOutlinePlugin f20072a;

        C7452b(PDFOutlinePlugin pDFOutlinePlugin) {
            this.f20072a = pDFOutlinePlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "active");
            if (bool.booleanValue()) {
                this.f20072a.showPdfOutline();
            } else {
                this.f20072a.hidePdfOutline();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        TitleBarViewModel hVar = (TitleBarViewModel) viewModel(TitleBarViewModel.class);
        hVar.getOutlineActive().mo5923a(getLifecycleOwner(), new C7452b(this));
        aVar.mo27262m().mo27297a(new C7453c(this, hVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFOutlinePlugin$onAttachToHost$2", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFOutlinePlugin$c */
    public static final class C7453c extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ PDFOutlinePlugin f20073a;

        /* renamed from: b */
        final /* synthetic */ TitleBarViewModel f20074b;

        C7453c(PDFOutlinePlugin pDFOutlinePlugin, TitleBarViewModel hVar) {
            this.f20073a = pDFOutlinePlugin;
            this.f20074b = hVar;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            if (infoCode == InfoCode.LoadStart) {
                if (this.f20073a.hasLoad) {
                    this.f20073a.hidePdfOutline();
                    this.f20074b.hideOutlineMenu();
                }
                this.f20073a.hasLoad = true;
            }
        }
    }
}
