package com.bytedance.ee.bear.document.export.p307b;

import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.export.AbstractC5168a;
import com.bytedance.ee.bear.contract.export.C5169b;
import com.bytedance.ee.bear.contract.export.ExportFormatEnum;
import com.bytedance.ee.bear.document.export.C5754a;
import com.bytedance.ee.bear.document.export.p308c.AbstractC5762a;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.ConfirmStorageDialog;
import com.bytedance.ee.bear.widgets.OpenLoadingView;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p710m.AbstractC13707b;
import com.bytedance.ee.util.p710m.C13708c;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13746i;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26285l;
import com.larksuite.suite.R;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import okhttp3.internal.http2.StreamResetException;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.export.b.a */
public abstract class AbstractC5756a<ExportViewModel extends AbstractC5762a> extends DialogInterface$OnCancelListenerC1021b implements AbstractC5168a {

    /* renamed from: c */
    protected ExportViewModel f16225c;

    /* renamed from: d */
    public FrameLayout f16226d;

    /* renamed from: e */
    private CommonActionPanelLayout f16227e;

    /* renamed from: f */
    private OpenLoadingView f16228f;

    /* renamed from: g */
    private ExportFormatEnum f16229g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23182a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: f */
    public int mo23184f() {
        return -1;
    }

    /* renamed from: g */
    public void mo23185g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract ExportViewModel mo23186h();

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C13479a.m54772d("BaseExportDialogFragmen", "onDestroy");
        super.onDestroy();
        this.f16225c.onDestroy();
    }

    @Override // com.bytedance.ee.bear.contract.export.AbstractC5168a
    public void n_() {
        if (!isAdded()) {
            C13479a.m54772d("BaseExportDialogFragmen", "onStartPolling, is detach");
            return;
        }
        OpenLoadingView openLoadingView = this.f16228f;
        if (openLoadingView != null) {
            openLoadingView.setProgress(10);
        }
    }

    @Override // com.bytedance.ee.bear.contract.export.AbstractC5168a
    public void o_() {
        if (!isAdded()) {
            C13479a.m54772d("BaseExportDialogFragmen", "onStartDownload, is detach");
            return;
        }
        OpenLoadingView openLoadingView = this.f16228f;
        if (openLoadingView != null) {
            openLoadingView.setProgress(20);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.export.b.a$3 */
    public static /* synthetic */ class C57593 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16232a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.ee.bear.contract.export.ExportFormatEnum[] r0 = com.bytedance.ee.bear.contract.export.ExportFormatEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.document.export.p307b.AbstractC5756a.C57593.f16232a = r0
                com.bytedance.ee.bear.contract.export.ExportFormatEnum r1 = com.bytedance.ee.bear.contract.export.ExportFormatEnum.DOCX     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.document.export.p307b.AbstractC5756a.C57593.f16232a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.contract.export.ExportFormatEnum r1 = com.bytedance.ee.bear.contract.export.ExportFormatEnum.XLSX     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.document.export.p307b.AbstractC5756a.C57593.f16232a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.contract.export.ExportFormatEnum r1 = com.bytedance.ee.bear.contract.export.ExportFormatEnum.PDF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.export.p307b.AbstractC5756a.C57593.<clinit>():void");
        }
    }

    /* renamed from: i */
    private void mo23187i() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.document_export_default_height);
        float f = (float) dimensionPixelSize;
        this.f16227e.mo45436a(BitmapDescriptorFactory.HUE_RED, f, f);
        this.f16227e.setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
            /* class com.bytedance.ee.bear.document.export.p307b.AbstractC5756a.C57582 */

            @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
            /* renamed from: c */
            public void mo18786c() {
                AbstractC5756a.this.mo23185g();
                AbstractC5756a.this.mo5513b();
            }

            @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
            /* renamed from: d */
            public void mo18838d() {
                AbstractC5756a.this.mo23185g();
                AbstractC5756a.this.mo5513b();
            }
        });
        C13742g.m55705a(new Runnable(dimensionPixelSize) {
            /* class com.bytedance.ee.bear.document.export.p307b.$$Lambda$a$yXLgXCMaWffJ8knozLm7B61png */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractC5756a.m269237lambda$yXLgXCMaWffJ8knozLm7B61png(AbstractC5756a.this, this.f$1);
            }
        });
    }

    /* renamed from: j */
    private void m23255j() {
        OpenLoadingView openLoadingView = new OpenLoadingView(getContext());
        this.f16228f = openLoadingView;
        openLoadingView.setCancelClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.document.export.p307b.$$Lambda$a$LiJeq0N98FSDEZbmOzMk2_LK6Zg */

            public final void onClick(View view) {
                AbstractC5756a.lambda$LiJeq0N98FSDEZbmOzMk2_LK6Zg(AbstractC5756a.this, view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ((ViewGroup) getView()).addView(this.f16228f, layoutParams);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = v_().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.windowAnimations = R.style.ActionSheetWindowStyle;
        attributes.y = C13746i.m55722a(getContext());
        attributes.flags |= Integer.MIN_VALUE;
        window.setAttributes(attributes);
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m23249a(View view) {
        this.f16225c.reportExportCanceled(m23251b(this.f16229g));
        mo5513b();
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m23253c(ExportFormatEnum exportFormatEnum) {
        this.f16229g = exportFormatEnum;
        this.f16225c.exportDocument(exportFormatEnum, new C5169b(this));
        m23255j();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16225c = mo23186h();
    }

    /* renamed from: b */
    private String m23251b(ExportFormatEnum exportFormatEnum) {
        int i = C57593.f16232a[exportFormatEnum.ordinal()];
        if (i == 1) {
            return "word";
        }
        if (i == 2) {
            return "excel";
        }
        if (i != 3) {
            return "unknown";
        }
        return "pdf";
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m23252c(int i) {
        int measuredHeight = this.f16226d.getMeasuredHeight();
        if (measuredHeight != 0) {
            i = measuredHeight;
        }
        float f = (float) i;
        this.f16227e.mo45436a(BitmapDescriptorFactory.HUE_RED, f, f);
    }

    @Override // com.bytedance.ee.bear.contract.export.AbstractC5168a
    /* renamed from: a */
    public void mo20643a(int i) {
        if (!isAdded()) {
            C13479a.m54772d("BaseExportDialogFragmen", "onPolling, is detach");
            return;
        }
        OpenLoadingView openLoadingView = this.f16228f;
        if (openLoadingView != null) {
            openLoadingView.setProgress(Math.min((i * 5) + 10, 20));
        }
    }

    @Override // com.bytedance.ee.bear.contract.export.AbstractC5168a
    /* renamed from: b */
    public void mo20646b(int i) {
        if (!isAdded()) {
            C13479a.m54772d("BaseExportDialogFragmen", "onDownloading, is detach");
            return;
        }
        OpenLoadingView openLoadingView = this.f16228f;
        if (openLoadingView != null) {
            openLoadingView.setProgress((int) ((((double) i) * 0.8d) + 20.0d));
        }
    }

    @Override // com.bytedance.ee.bear.contract.export.AbstractC5168a
    /* renamed from: a */
    public void mo20644a(Uri uri) {
        if (!isAdded()) {
            C13479a.m54772d("BaseExportDialogFragmen", "onExportSuccess, is detach");
            return;
        }
        this.f16225c.reportExportSuccess(m23251b(this.f16229g));
        OpenLoadingView openLoadingView = this.f16228f;
        if (openLoadingView != null) {
            openLoadingView.setProgress(100);
        }
        C26285l.m95188a(getContext(), uri, null);
        mo5513b();
    }

    /* renamed from: a */
    public void mo23183a(ExportFormatEnum exportFormatEnum) {
        this.f16226d.setVisibility(8);
        if (C36808a.m145211c() == 1) {
            Toast.showText(getContext(), getString(R.string.CreationMobile_ECM_SecuritySettingKAToast), 1, true);
        } else {
            C13708c.m55598a(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE", getString(R.string.Doc_Facade_PermissionStorage), new AbstractC13707b(exportFormatEnum) {
                /* class com.bytedance.ee.bear.document.export.p307b.$$Lambda$a$mLLCAgC58RyRCPU7M7UeW4TC0gE */
                public final /* synthetic */ ExportFormatEnum f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.util.p710m.AbstractC13707b
                public final void onCheckResult(boolean z) {
                    AbstractC5756a.lambda$mLLCAgC58RyRCPU7M7UeW4TC0gE(AbstractC5756a.this, this.f$1, z);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.contract.export.AbstractC5168a
    /* renamed from: a */
    public void mo20645a(Throwable th) {
        if (!isAdded()) {
            C13479a.m54772d("BaseExportDialogFragmen", "onExportFail, is detach");
        } else if (!(th instanceof StreamResetException)) {
            this.f16225c.reportExportFailed(m23251b(this.f16229g));
            int i = R.string.Doc_Document_ExportError;
            if (th instanceof NetService.ServerErrorException) {
                i = C5754a.m23243a(((NetService.ServerErrorException) th).getCode());
            }
            Toast.showFailureText(getContext(), i);
            mo5513b();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m23250a(ExportFormatEnum exportFormatEnum, boolean z) {
        if (!z) {
            C13479a.m54775e("BaseExportDialogFragmen", "export fail, permission deny");
            mo5513b();
        } else if (isAdded()) {
            ConfirmStorageDialog bVar = new ConfirmStorageDialog(getContext(), new ConfirmStorageDialog.ConfirmCallBack(exportFormatEnum) {
                /* class com.bytedance.ee.bear.document.export.p307b.$$Lambda$a$Qv9huqG7TNLQc7aFHPvKvfEn7uU */
                public final /* synthetic */ ExportFormatEnum f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.widgets.ConfirmStorageDialog.ConfirmCallBack
                public final void onContinue() {
                    AbstractC5756a.lambda$Qv9huqG7TNLQc7aFHPvKvfEn7uU(AbstractC5756a.this, this.f$1);
                }
            });
            bVar.mo45265d();
            bVar.mo45261a(new ConfirmStorageDialog.DismissCallBack() {
                /* class com.bytedance.ee.bear.document.export.p307b.$$Lambda$nTMXrpjnfyR4hcDJWnmwuTekST4 */

                @Override // com.bytedance.ee.bear.widgets.ConfirmStorageDialog.DismissCallBack
                public final void onCancel() {
                    AbstractC5756a.this.mo5513b();
                }
            });
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40644a(bVar.mo45264c());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.document.export.p307b.AbstractC5756a.C57571 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (AbstractC5756a.this.f16226d.getVisibility() == 0) {
                    AbstractC5756a.this.mo23185g();
                    AbstractC5756a.this.mo5513b();
                }
            }
        });
        this.f16226d = (FrameLayout) view.findViewById(R.id.export_root);
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40646a(this.f16226d);
        this.f16227e = (CommonActionPanelLayout) view.findViewById(R.id.panel_layout);
        mo23187i();
        int f = mo23184f();
        if (f != -1) {
            this.f16227e.setTitle(getResources().getString(f));
        }
        mo23182a(getLayoutInflater(), (ViewGroup) view.findViewById(R.id.export_container));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.document_export_dialog_fragment, viewGroup, false);
    }
}
