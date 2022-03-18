package com.ss.android.lark.setting.service.usersetting.p2674b;

import android.util.Log;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.pb.ai.CorrectionSetting;
import com.ss.android.lark.pb.ai.FeatureSetting;
import com.ss.android.lark.pb.ai.FeatureType;
import com.ss.android.lark.pb.ai.GetCorrectionSettingRequest;
import com.ss.android.lark.pb.ai.GetCorrectionSettingResponse;
import com.ss.android.lark.pb.ai.GetUserASSettingRequest;
import com.ss.android.lark.pb.ai.GetUserASSettingResponse;
import com.ss.android.lark.pb.ai.PushCorrectionSetting;
import com.ss.android.lark.pb.ai.PushUserASSetting;
import com.ss.android.lark.pb.ai.SetCorrectionSettingRequest;
import com.ss.android.lark.pb.ai.SetUserASSettingRequest;
import com.ss.android.lark.pb.ai.UserASSetting;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.setting.service.usersetting.b.a */
public class C54655a implements AbstractC54661b {

    /* renamed from: a */
    public final C54662c f135046a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<AbstractC1178x<PushUserASSetting>> f135047b;

    /* renamed from: c */
    private final CopyOnWriteArrayList<AbstractC1178x<CorrectionSetting>> f135048c;

    /* renamed from: d */
    private final AtomicBoolean f135049d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.service.usersetting.b.a$a */
    public static class C54660a {

        /* renamed from: a */
        public static C54655a f135060a = new C54655a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Void m212177b(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ Void m212180d(byte[] bArr) throws IOException {
        return null;
    }

    /* renamed from: a */
    public static C54655a m212173a() {
        return C54660a.f135060a;
    }

    @Override // com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b
    /* renamed from: a */
    public void mo186710a(boolean z, final IGetDataCallback<CorrectionSetting> iGetDataCallback) {
        if (!z) {
            iGetDataCallback.onSuccess(this.f135046a.mo186728b());
            return;
        }
        SdkSender.sendPassThroughRequest(Command.GET_GEC_SETTING, new GetCorrectionSettingRequest.C49467a(), new IGetDataCallback<CorrectionSetting>() {
            /* class com.ss.android.lark.setting.service.usersetting.p2674b.C54655a.C546572 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(CorrectionSetting correctionSetting) {
                C54655a.this.f135046a.mo186725a(correctionSetting);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(correctionSetting);
                }
            }
        }, $$Lambda$a$_LSgwMb3crveGKaPtmLPup7y4M.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m212181g() {
        this.f135046a.mo186730c();
        mo186713b(true, null);
        mo186710a(true, (IGetDataCallback<CorrectionSetting>) null);
    }

    /* renamed from: e */
    public boolean mo186718e() {
        return this.f135046a.mo186729b("enterprise_topic_tenant_enable", false);
    }

    private C54655a() {
        this.f135049d = new AtomicBoolean();
        this.f135047b = new CopyOnWriteArrayList<>();
        this.f135048c = new CopyOnWriteArrayList<>();
        this.f135046a = new C54662c();
    }

    @Override // com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b
    /* renamed from: d */
    public boolean mo186717d() {
        boolean b = this.f135046a.mo186729b("enterprise_topic_tenant_enable", false);
        boolean b2 = this.f135046a.mo186729b("enterprise_topic_msg_enable", true);
        if (!b || !b2) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo186719f() {
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.p2674b.$$Lambda$a$vx9FQnREgI4GZjv_pZQugHMaLM */

            public final void run() {
                C54655a.this.m212181g();
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b
    /* renamed from: b */
    public void mo186711b() {
        if (this.f135049d.compareAndSet(false, true)) {
            C53248k.m205912a().mo181700a(Command.PUSH_AS_SETTING, new C53248k.AbstractC53250a() {
                /* class com.ss.android.lark.setting.service.usersetting.p2674b.$$Lambda$a$gkDaJIYFkCjsGvug8k4Du_K703Q */

                @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                    C54655a.this.m212178b(bArr, str, z, z2);
                }
            });
            C53248k.m205912a().mo181700a(Command.PUSH_GEC_SETTING, new C53248k.AbstractC53250a() {
                /* class com.ss.android.lark.setting.service.usersetting.p2674b.$$Lambda$a$A1iVtvY1zS8vhqVVlYRdt7_NJ4U */

                @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                    C54655a.this.m212176a(bArr, str, z, z2);
                }
            });
        }
    }

    /* renamed from: c */
    public boolean mo186715c() {
        return this.f135046a.mo186729b("error_correction_msg_enable", true);
    }

    @Override // com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b
    /* renamed from: a */
    public void mo186705a(AbstractC1178x<CorrectionSetting> xVar) {
        this.f135048c.add(xVar);
    }

    @Override // com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b
    /* renamed from: b */
    public void mo186712b(AbstractC1178x<CorrectionSetting> xVar) {
        this.f135048c.remove(xVar);
    }

    @Override // com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b
    /* renamed from: d */
    public void mo186716d(AbstractC1178x<PushUserASSetting> xVar) {
        this.f135047b.remove(xVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ UserASSetting m212172a(byte[] bArr) throws IOException {
        return GetUserASSettingResponse.ADAPTER.decode(bArr).msetting;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ CorrectionSetting m212179c(byte[] bArr) throws IOException {
        return GetCorrectionSettingResponse.ADAPTER.decode(bArr).mcorrection_setting;
    }

    /* renamed from: a */
    private void m212174a(CorrectionSetting correctionSetting) {
        Iterator<AbstractC1178x<CorrectionSetting>> it = this.f135048c.iterator();
        while (it.hasNext()) {
            it.next().onChanged(correctionSetting);
        }
    }

    @Override // com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b
    /* renamed from: c */
    public void mo186714c(AbstractC1178x<PushUserASSetting> xVar) {
        this.f135047b.add(xVar);
        if (!this.f135049d.get()) {
            mo186711b();
        }
    }

    /* renamed from: a */
    private void m212175a(PushUserASSetting pushUserASSetting) {
        mo186708a(pushUserASSetting.msetting);
        Iterator<AbstractC1178x<PushUserASSetting>> it = this.f135047b.iterator();
        while (it.hasNext()) {
            it.next().onChanged(pushUserASSetting);
        }
    }

    /* renamed from: a */
    public void mo186708a(UserASSetting userASSetting) {
        FeatureSetting featureSetting;
        if (userASSetting != null && (featureSetting = userASSetting.mnautilus_setting) != null) {
            this.f135046a.mo186726a(featureSetting);
        }
    }

    /* renamed from: a */
    public void mo186709a(boolean z) {
        if (z) {
            mo186713b(true, null);
        } else {
            this.f135046a.mo186730c();
        }
    }

    @Override // com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b
    /* renamed from: b */
    public void mo186713b(boolean z, final IGetDataCallback<UserASSetting> iGetDataCallback) {
        if (z) {
            GetUserASSettingRequest.C49483a aVar = new GetUserASSettingRequest.C49483a();
            aVar.mo172632a(FeatureType.DEFAULT);
            SdkSender.sendPassThroughRequest(Command.GET_AS_SETTING, aVar, new IGetDataCallback<UserASSetting>() {
                /* class com.ss.android.lark.setting.service.usersetting.p2674b.C54655a.C546594 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(UserASSetting userASSetting) {
                    C54655a.this.mo186708a(userASSetting);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(userASSetting);
                    }
                }
            }, $$Lambda$a$tFJuk9pxIBfAcHGUJBvJ_0isSwg.INSTANCE);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(this.f135046a.mo186724a());
        }
    }

    @Override // com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b
    /* renamed from: a */
    public void mo186706a(final CorrectionSetting correctionSetting, final IGetDataCallback<CorrectionSetting> iGetDataCallback) {
        SetCorrectionSettingRequest.C49513a aVar = new SetCorrectionSettingRequest.C49513a();
        aVar.mo172701a(correctionSetting);
        SdkSender.sendPassThroughRequest(Command.SET_GEC_SETTING, aVar, new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.setting.service.usersetting.p2674b.C54655a.C546561 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Void r2) {
                C54655a.this.f135046a.mo186725a(correctionSetting);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(correctionSetting);
                }
            }
        }, $$Lambda$a$i6WSr2Lyaz32mG0vB0ysDTWIxHU.INSTANCE);
    }

    @Override // com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b
    /* renamed from: a */
    public void mo186707a(FeatureType featureType, final UserASSetting userASSetting, final IGetDataCallback<Void> iGetDataCallback) {
        SetUserASSettingRequest.C49519a aVar = new SetUserASSettingRequest.C49519a();
        aVar.mo172716a(userASSetting);
        if (featureType != null) {
            aVar.mo172715a(featureType);
        }
        SdkSender.sendPassThroughRequest(Command.SET_AS_SETTING, aVar, new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.setting.service.usersetting.p2674b.C54655a.C546583 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Void r2) {
                if (userASSetting.mnautilus_setting != null) {
                    C54655a.this.f135046a.mo186726a(userASSetting.mnautilus_setting);
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(null);
                }
            }
        }, $$Lambda$a$LofD8OUVKHnVTeLjsMkINf99F4.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m212178b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            m212175a(PushUserASSetting.ADAPTER.decode(bArr));
        } catch (IOException unused) {
            Log.e("ASSettingServiceImpl", "AS setting push error");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m212176a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            m212174a(PushCorrectionSetting.ADAPTER.decode(bArr).mcorrection_setting);
        } catch (IOException unused) {
            Log.e("ASSettingServiceImpl", "Correction setting push error");
        }
    }
}
