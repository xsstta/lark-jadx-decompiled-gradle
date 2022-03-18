package com.bytedance.ee.bear.drive.biz.external;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.biz.external.C6418d;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.ConfirmStorageDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57805b;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.external.c */
public class C6416c extends C7667e {

    /* renamed from: a */
    private String f17725a;

    /* renamed from: b */
    private String f17726b;

    /* renamed from: c */
    private C6418d f17727c;

    /* renamed from: b */
    private void m25752b() {
        if (getActivity() != null) {
            m25750a(new Runnable() {
                /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$c$Cxjz3SI5lGZfsBDCSu_odAhAK7M */

                public final void run() {
                    C6416c.lambda$Cxjz3SI5lGZfsBDCSu_odAhAK7M(C6416c.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m25754d() {
        this.f17727c.m25778b(this.f17726b, (String) null, "explorer", (C6414b) null);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        this.f17727c.mo25756g();
        super.onDestroy();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.external.c$a */
    public static class C6417a implements C6418d.AbstractC6422a {

        /* renamed from: a */
        private WeakReference<C6416c> f17728a;

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
            if (this.f17728a.get() != null) {
                this.f17728a.get().mo25738a();
            }
        }

        @Override // com.bytedance.ee.bear.drive.biz.external.C6418d.AbstractC6422a
        /* renamed from: c */
        public void mo25742c() {
            if (this.f17728a.get() != null) {
                this.f17728a.get().mo25738a();
            }
        }

        C6417a(C6416c cVar) {
            this.f17728a = new WeakReference<>(cVar);
        }
    }

    /* renamed from: c */
    private void m25753c() {
        this.f17727c = new C6418d(getActivity(), ar.m20936a(), new C6417a(this), new C6425e());
    }

    /* renamed from: a */
    public void mo25738a() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            getActivity().finish();
        }
    }

    /* renamed from: e */
    private void m25755e() {
        Bundle arguments = getArguments();
        Objects.requireNonNull(arguments);
        this.f17725a = arguments.getString("url");
        String str = C6313i.m25327a().mo25399g(this.f17725a).f17447b;
        if (str == null) {
            str = "";
        }
        this.f17726b = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m25756f() {
        ConfirmStorageDialog bVar = new ConfirmStorageDialog(getActivity(), new ConfirmStorageDialog.ConfirmCallBack() {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$c$eFR60o0tNYvxRoRUOSoVrbeY_w */

            @Override // com.bytedance.ee.bear.widgets.ConfirmStorageDialog.ConfirmCallBack
            public final void onContinue() {
                C6416c.m269356lambda$eFR60o0tNYvxRoRUOSoVrbeY_w(C6416c.this);
            }
        });
        bVar.mo45261a(new ConfirmStorageDialog.DismissCallBack() {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$tfVfr7CHUuDWlxSUMojKtZRcJPg */

            @Override // com.bytedance.ee.bear.widgets.ConfirmStorageDialog.DismissCallBack
            public final void onCancel() {
                C6416c.this.mo25738a();
            }
        });
        bVar.mo45265d();
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40644a(bVar.mo45264c());
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m25755e();
        m25753c();
        m25752b();
    }

    /* renamed from: a */
    private void m25750a(Runnable runnable) {
        if (getContext() == null || !(getContext() instanceof Activity)) {
            Toast.showFailureText(getContext(), getContext().getResources().getString(R.string.Drive_Drive_SaveFailed), 0);
            mo25738a();
            return;
        }
        C57805b.m224333d((Activity) getContext(), new C57805b.AbstractC57809a(runnable) {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$c$Po39DAIhU5w39Q_JSab75NY_9vQ */
            public final /* synthetic */ Runnable f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                C6416c.lambda$Po39DAIhU5w39Q_JSab75NY_9vQ(C6416c.this, this.f$1, z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25751a(Runnable runnable, boolean z) {
        if (!z || runnable == null) {
            Toast.showFailureText(getContext(), getContext().getResources().getString(R.string.Drive_Drive_SaveFailed), 0);
            mo25738a();
            return;
        }
        runnable.run();
    }
}
