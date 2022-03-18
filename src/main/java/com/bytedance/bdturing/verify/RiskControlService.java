package com.bytedance.bdturing.verify;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.bdturing.AbstractC3526b;
import com.bytedance.bdturing.DialogC3559k;
import com.bytedance.bdturing.EventReport;
import com.bytedance.bdturing.LogUtil;
import com.bytedance.bdturing.setting.SettingUpdateRequest;
import com.bytedance.bdturing.setting.SettingsManager;
import com.bytedance.bdturing.verify.request.AbstractRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/bdturing/verify/RiskControlService;", "Lcom/bytedance/bdturing/verify/IVerifyService;", "()V", "mDialogShowing", "Lcom/bytedance/bdturing/VerifyDialog;", "dismissVerifyDialog", "", "execute", "", "request", "Lcom/bytedance/bdturing/verify/request/AbstractRequest;", "callback", "Lcom/bytedance/bdturing/BdTuringCallback;", "isProcess", "verifyType", "", "BdTuringSdk_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.f.b */
public final class RiskControlService implements AbstractC3544a {

    /* renamed from: a */
    public DialogC3559k f11217a;

    @Override // com.bytedance.bdturing.p210f.AbstractC3544a
    /* renamed from: a */
    public boolean mo14336a(int i) {
        return i == 1 || i == 2 || i == 3 || i == 5 || i == 12;
    }

    /* renamed from: a */
    public final void mo14353a() {
        DialogC3559k kVar = this.f11217a;
        if (kVar != null) {
            if (kVar == null) {
                Intrinsics.throwNpe();
            }
            if (kVar.isShowing()) {
                DialogC3559k kVar2 = this.f11217a;
                if (kVar2 == null) {
                    Intrinsics.throwNpe();
                }
                kVar2.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/bdturing/verify/RiskControlService$execute$1", "Lcom/bytedance/bdturing/setting/SettingUpdateRequest$Callback;", "onResponse", "", "responseCode", "", "responseContent", "", "duration", "", "BdTuringSdk_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.bdturing.f.b$a */
    public static final class C3545a implements SettingUpdateRequest.Callback {

        /* renamed from: a */
        final /* synthetic */ RiskControlService f11218a;

        /* renamed from: b */
        final /* synthetic */ AbstractRequest f11219b;

        /* renamed from: c */
        final /* synthetic */ AbstractC3526b f11220c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.bdturing.f.b$a$a */
        static final class RunnableC3546a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C3545a f11221a;

            RunnableC3546a(C3545a aVar) {
                this.f11221a = aVar;
            }

            public final void run() {
                EventReport.m14805a();
                this.f11221a.f11218a.f11217a = new DialogC3559k(this.f11221a.f11219b, this.f11221a.f11220c);
                DialogC3559k kVar = this.f11221a.f11218a.f11217a;
                if (kVar != null) {
                    kVar.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
                        /* class com.bytedance.bdturing.verify.RiskControlService.C3545a.RunnableC3546a.DialogInterface$OnDismissListenerC35471 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC3546a f11222a;

                        {
                            this.f11222a = r1;
                        }

                        public final void onDismiss(DialogInterface dialogInterface) {
                            if (dialogInterface == this.f11222a.f11221a.f11218a.f11217a) {
                                this.f11222a.f11221a.f11218a.f11217a = null;
                            }
                        }
                    });
                }
                DialogC3559k kVar2 = this.f11221a.f11218a.f11217a;
                if (kVar2 != null) {
                    kVar2.show();
                }
                EventReport.m14812b();
            }
        }

        C3545a(RiskControlService bVar, AbstractRequest aVar, AbstractC3526b bVar2) {
            this.f11218a = bVar;
            this.f11219b = aVar;
            this.f11220c = bVar2;
        }

        @Override // com.bytedance.bdturing.setting.SettingUpdateRequest.Callback
        /* renamed from: a */
        public void mo14278a(int i, String str, long j) {
            Activity a;
            Activity a2 = this.f11219b.mo14338a();
            if ((a2 == null || !a2.isFinishing()) && (a = this.f11219b.mo14338a()) != null) {
                a.runOnUiThread(new RunnableC3546a(this));
            }
        }
    }

    @Override // com.bytedance.bdturing.p210f.AbstractC3544a
    /* renamed from: a */
    public boolean mo14337a(AbstractRequest aVar, AbstractC3526b bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "request");
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        DialogC3559k kVar = this.f11217a;
        if (kVar != null) {
            if (kVar == null) {
                Intrinsics.throwNpe();
            }
            if (kVar.isShowing()) {
                LogUtil.m14895a("BdTuring", "verifyDialog still showing skip this request");
                bVar.mo14293a(998, null);
                return true;
            }
        }
        SettingsManager.f11297a.mo14398a(false, (SettingUpdateRequest.Callback) new C3545a(this, aVar, bVar));
        return true;
    }
}
