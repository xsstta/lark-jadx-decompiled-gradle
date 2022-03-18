package com.bytedance.ee.bear.drive.report;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\r\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/drive/report/DriveReportPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "alreadyReport", "", "handler", "Landroid/os/Handler;", "onAttachPreview", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachFromHost", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onDetachPreview", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveReportPlugin extends AbsDrivePlugin {
    public boolean alreadyReport;
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        DrivePluginHost aVar = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        C6891a.m27229a(aVar).mo27904a(((DrivePluginHost) getHost()).mo27261l().getFileModel());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.report.DriveReportPlugin$a */
    static final class RunnableC7124a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveReportPlugin f19192a;

        RunnableC7124a(DriveReportPlugin driveReportPlugin) {
            this.f19192a = driveReportPlugin;
        }

        public final void run() {
            if (!this.f19192a.isUIContainerDetached()) {
                LiveData<Integer> livePreviewType = ((DrivePluginHost) this.f19192a.getHost()).mo27261l().livePreviewType();
                Intrinsics.checkExpressionValueIsNotNull(livePreviewType, "host.driveViewModel.livePreviewType()");
                Integer b = livePreviewType.mo5927b();
                if (b != null && b.intValue() == 3) {
                    DrivePluginHost aVar = (DrivePluginHost) this.f19192a.getHost();
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
                    C6891a.m27229a(aVar).mo27920a("card", ((DrivePluginHost) this.f19192a.getHost()).mo27261l().getOpenEntity());
                    this.f19192a.alreadyReport = true;
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        super.onAttachPreview();
        DrivePluginHost aVar = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        HashMap<String, Object> a = C6891a.m27229a(aVar).mo27899a(((DrivePluginHost) getHost()).mo27261l().getOpenEntity());
        Intrinsics.checkExpressionValueIsNotNull(a, "host.driveReport().getCo…riveViewModel.openEntity)");
        TitleBar titleBar = getTitleBar();
        Intrinsics.checkExpressionValueIsNotNull(titleBar, "titleBar");
        titleBar.mo19508a().setTag(R.id.title_bar_common_params, a);
        if (!this.alreadyReport) {
            this.handler.postDelayed(new RunnableC7124a(this), 3000);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/report/DriveReportPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.report.DriveReportPlugin$b */
    public static final class C7125b extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f19193a;

        C7125b(DrivePluginHost aVar) {
            this.f19193a = aVar;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            if (infoCode == InfoCode.FileInfoSuccess && (t instanceof AbstractC6946a)) {
                C6891a.m27234b(this.f19193a).mo27874a((AbstractC6946a) t, 3);
            } else if (infoCode == InfoCode.HitCache && (t instanceof AbstractC6946a)) {
                C6891a.m27234b(this.f19193a).mo27874a((AbstractC6946a) t, 3);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachFromHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onDetachFromHost(aVar);
        if (aVar.mo27261l().getFileModel() != null) {
            C7128a b = C6891a.m27234b(aVar);
            BaseOpenEntity openEntity = aVar.mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
            b.mo27894b(C6891a.m27231a(openEntity));
        }
        C7128a b2 = C6891a.m27234b(aVar);
        BaseOpenEntity openEntity2 = aVar.mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity2, "host.driveViewModel.openEntity");
        b2.mo27879a(C6891a.m27231a(openEntity2), 3);
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C7128a b = C6891a.m27234b(aVar);
        BaseOpenEntity openEntity = aVar.mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
        String a = C6891a.m27231a(openEntity);
        BaseOpenEntity openEntity2 = aVar.mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity2, "host.driveViewModel.openEntity");
        String a2 = C6892d.m27241a(openEntity2.getPreviewFrom());
        BaseOpenEntity openEntity3 = aVar.mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity3, "host.driveViewModel.openEntity");
        String appId = openEntity3.getAppId();
        BaseOpenEntity openEntity4 = aVar.mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity4, "host.driveViewModel.openEntity");
        Bundle extras = openEntity4.getExtras();
        BaseOpenEntity openEntity5 = aVar.mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity5, "host.driveViewModel.openEntity");
        b.mo27883a(a, 3, a2, appId, extras, openEntity5.getBizType());
        aVar.mo27262m().mo27297a(new C7125b(aVar));
        C7555f d = C6891a.m27236d(aVar);
        C6937b l = aVar.mo27261l();
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        C7130c a3 = f.mo27166a();
        C6920b f2 = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f2, "DriveConfigServiceImpl.getInstance()");
        C7129b.m28575a(d, l, a3, f2.mo27167b());
    }

    public void onDetachFromUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        this.handler.removeCallbacksAndMessages(null);
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
    }
}
