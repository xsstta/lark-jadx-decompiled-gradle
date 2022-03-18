package com.ss.android.lark.upgrade.impl;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.C26320t;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ay;
import com.ss.android.lark.biz.core.api.az;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.enity.UpgradeInfo;
import com.ss.android.lark.upgrade.enity.UpgradePlan;
import com.ss.android.lark.upgrade.enity.VersionData;
import com.ss.android.lark.upgrade.p2893a.AbstractC57608a;
import com.ss.android.lark.upgrade.p2894b.C57620a;
import com.ss.android.lark.upgrade.p2895c.AbstractC57625c;
import com.ss.android.lark.upgrade.p2896d.C57626a;
import com.ss.android.lark.upgrade.service.impl.C57660b;
import com.ss.android.lark.upgrade.service.impl.NewVersionResponse;
import com.ss.android.lark.upgrade.silent.C57709a;
import com.ss.android.lark.upgrade.statistics.UpgradeHitPoint;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.p2908e.C57823a;
import com.ss.android.lark.utils.rxjava.AbstractC57864b;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.lark.upgrade.impl.b */
public class C57642b {

    /* renamed from: a */
    List<az> f142045a = new ArrayList();

    /* renamed from: b */
    public Set<String> f142046b = new HashSet();

    /* renamed from: c */
    public UpgradeInfo f142047c;

    /* renamed from: d */
    public WeakReference<Context> f142048d;

    /* renamed from: e */
    public long f142049e;

    /* renamed from: f */
    private long f142050f;

    /* renamed from: g */
    private String f142051g;

    /* renamed from: h */
    private AbstractC57625c f142052h;

    /* renamed from: i */
    private DialogC57630a f142053i;

    /* renamed from: j */
    private boolean f142054j = true;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.upgrade.impl.b$a */
    public static final class C57657a {

        /* renamed from: a */
        public static final C57642b f142106a = new C57642b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.upgrade.impl.b$b */
    public interface AbstractC57658b {
        /* renamed from: a */
        void mo195738a(boolean z);
    }

    /* renamed from: n */
    private boolean m223820n() {
        return false;
    }

    /* renamed from: g */
    public int mo195735g() {
        return R.drawable.ic_notify;
    }

    /* renamed from: h */
    public int mo195736h() {
        return R.mipmap.app_launcher;
    }

    /* renamed from: a */
    public static C57642b m223804a() {
        return C57657a.f142106a;
    }

    /* renamed from: a */
    public void mo195715a(UpgradeInfo upgradeInfo) {
        this.f142047c = upgradeInfo;
        if (upgradeInfo.isShouldStrongNotice()) {
            m223815j();
        } else {
            m223817k();
        }
        if (upgradeInfo.isHasNew()) {
            m223818l();
        } else {
            m223819m();
        }
    }

    /* renamed from: a */
    public void mo195719a(WeakReference<Context> weakReference, UpgradeInfo upgradeInfo, final ay ayVar) {
        if (this.f142053i != null) {
            Log.m165397w("UpgradeImpl", "mUpgradeDialog has Shown, do nothing");
            return;
        }
        Log.m165389i("UpgradeImpl", "mUpgradeDialog to show");
        Context context = null;
        if (weakReference.get() != null) {
            context = weakReference.get();
        }
        if (context != null) {
            DialogC57630a a = m223803a(context, upgradeInfo, this.f142053i);
            this.f142053i = a;
            a.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.ss.android.lark.upgrade.impl.C57642b.DialogInterface$OnDismissListenerC576505 */

                public void onDismiss(DialogInterface dialogInterface) {
                    ay ayVar = ayVar;
                    if (ayVar != null) {
                        ayVar.mo102558a();
                    }
                }
            });
            UpgradeHitPoint.f141994a.mo195626a("auto", this.f142047c.getUpgradePlan());
        }
    }

    /* renamed from: a */
    public void mo195717a(String str) {
        String string = UserSP.getInstance().getString("sp_key_update_curr_version_name");
        Log.m165389i("UpgradeImpl", "recordUpgradeVersion oldKey= " + string + ", newKey = " + str);
        if (!TextUtils.equals(string, str)) {
            UserSP.getInstance().remove(string);
            UserSP.getInstance().putString("sp_key_update_curr_version_name", str);
            this.f142054j = true;
        }
    }

    /* renamed from: a */
    public void mo195722a(final WeakReference<Context> weakReference, final WeakReference<DialogInterface> weakReference2, final UpgradeInfo upgradeInfo, final boolean z) {
        final File file = new File(C57626a.m223733a(upgradeInfo.getVersion()));
        mo195716a(upgradeInfo, new AbstractC57658b() {
            /* class com.ss.android.lark.upgrade.impl.C57642b.C576516 */

            @Override // com.ss.android.lark.upgrade.impl.C57642b.AbstractC57658b
            /* renamed from: a */
            public void mo195738a(boolean z) {
                DialogInterface dialogInterface;
                if (!z) {
                    C57642b.this.f142046b.remove(upgradeInfo.getDownloadUrl());
                    C57642b.this.mo195728b(weakReference, weakReference2, upgradeInfo, z);
                } else if (!z) {
                    WeakReference weakReference = weakReference2;
                    if (!(weakReference == null || (dialogInterface = (DialogInterface) weakReference.get()) == null)) {
                        dialogInterface.dismiss();
                    }
                    C57642b.this.mo195720a(weakReference, file);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo195723a(boolean z, long j, long j2, boolean z2, String str, String str2) {
        C57709a.m224043a().mo195868b(str);
        long currentTimeMillis = (System.currentTimeMillis() - j2) / 1000;
        if (currentTimeMillis <= 0) {
            Log.m165379d("UpgradeImpl", "durationSeconds: " + currentTimeMillis);
            return;
        }
        long j3 = j / currentTimeMillis;
        StringBuilder sb = new StringBuilder();
        sb.append("Upgrade download END: ");
        sb.append(z ? "Success" : "Fail");
        sb.append(". Time: ");
        sb.append(currentTimeMillis);
        sb.append("s. Speed: ");
        sb.append(j3);
        sb.append("kb/s");
        sb.append(z2 ? " [Silent]" : "");
        Log.m165389i("UpgradeImpl", sb.toString());
        UpgradeHitPoint.f141994a.mo195627a(z ? "success" : "fail", Long.valueOf(j3), z2 ? "silent" : "sdk");
        if (z) {
            C57660b.m223868a().mo195749a(C57607a.m223662a().mo177704a(), str2);
        }
    }

    /* renamed from: a */
    public void mo195721a(final WeakReference<Context> weakReference, final WeakReference<DialogInterface> weakReference2, final UpgradeInfo upgradeInfo) {
        mo195716a(upgradeInfo, new AbstractC57658b() {
            /* class com.ss.android.lark.upgrade.impl.C57642b.C576569 */

            @Override // com.ss.android.lark.upgrade.impl.C57642b.AbstractC57658b
            /* renamed from: a */
            public void mo195738a(boolean z) {
                DialogInterface dialogInterface;
                String a = C57626a.m223733a(upgradeInfo.getVersion());
                File file = new File(a);
                if (z) {
                    WeakReference weakReference = weakReference2;
                    if (!(weakReference == null || (dialogInterface = (DialogInterface) weakReference.get()) == null)) {
                        dialogInterface.dismiss();
                    }
                    C57642b.this.mo195720a(weakReference, file);
                    return;
                }
                Context context = (Context) weakReference.get();
                if (context != null) {
                    LKUIToast.show(context.getApplicationContext(), (int) R.string.Lark_Legacy_InstallFail);
                }
                C26311p.m95291k(a);
            }
        });
    }

    /* renamed from: a */
    public void mo195718a(final WeakReference<Context> weakReference, final UpgradeInfo upgradeInfo) {
        mo195716a(upgradeInfo, new AbstractC57658b() {
            /* class com.ss.android.lark.upgrade.impl.C57642b.AnonymousClass10 */

            @Override // com.ss.android.lark.upgrade.impl.C57642b.AbstractC57658b
            /* renamed from: a */
            public void mo195738a(boolean z) {
                if (!z) {
                    C26311p.m95291k(C57626a.m223733a(upgradeInfo.getVersion()));
                } else if (upgradeInfo.isShouldShowUpgradeDialog()) {
                    C57642b bVar = C57642b.this;
                    bVar.mo195719a(weakReference, bVar.f142047c, (ay) null);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo195720a(WeakReference<Context> weakReference, File file) {
        mo195724a(weakReference.get(), file);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[Catch:{ Exception -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[Catch:{ Exception -> 0x004b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo195724a(android.content.Context r5, java.io.File r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L_0x005f
            boolean r1 = r6.exists()
            if (r1 == 0) goto L_0x005f
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x004b }
            r1.<init>()     // Catch:{ Exception -> 0x004b }
            if (r5 != 0) goto L_0x0018
            com.ss.android.lark.upgrade.a.a r2 = com.ss.android.lark.upgrade.C57607a.m223662a()     // Catch:{ Exception -> 0x004b }
            android.content.Context r5 = r2.mo177704a()     // Catch:{ Exception -> 0x004b }
        L_0x0018:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r2)     // Catch:{ Exception -> 0x004b }
            boolean r2 = com.larksuite.framework.utils.C26311p.m95275a(r5)     // Catch:{ Exception -> 0x004b }
            r3 = 1
            if (r2 != 0) goto L_0x002d
            boolean r2 = com.larksuite.framework.utils.RomUtils.m94953h()     // Catch:{ Exception -> 0x004b }
            if (r2 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r2 = 0
            goto L_0x002e
        L_0x002d:
            r2 = 1
        L_0x002e:
            if (r2 != 0) goto L_0x0038
            android.content.Intent r6 = com.ss.android.lark.upgrade.impl.InstallApkActivity.m223763a(r5, r6)     // Catch:{ Exception -> 0x004b }
            r5.startActivity(r6)     // Catch:{ Exception -> 0x004b }
            return r0
        L_0x0038:
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.setAction(r2)     // Catch:{ Exception -> 0x004b }
            java.lang.String r2 = "android.intent.category.DEFAULT"
            r1.addCategory(r2)     // Catch:{ Exception -> 0x004b }
            java.lang.String r2 = "application/vnd.android.package-archive"
            com.larksuite.framework.utils.C26310o.m95260a(r5, r1, r2, r6, r3)     // Catch:{ Exception -> 0x004b }
            r5.startActivity(r1)     // Catch:{ Exception -> 0x004b }
            return r3
        L_0x004b:
            r6 = move-exception
            java.lang.String r1 = "UpgradeImpl"
            java.lang.String r2 = "installNewVersionApp"
            com.ss.android.lark.log.Log.m165398w(r1, r2, r6)
            if (r5 == 0) goto L_0x005f
            android.content.Context r5 = r5.getApplicationContext()
            r6 = 2131830756(0x7f1127e4, float:1.9294518E38)
            com.larksuite.component.ui.toast.LKUIToast.show(r5, r6)
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.upgrade.impl.C57642b.mo195724a(android.content.Context, java.io.File):boolean");
    }

    /* renamed from: a */
    public boolean mo195725a(File file, String str) {
        if (file == null || !file.exists() || C26311p.m95281c(file) <= 0) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return str.equals(C26320t.m95317a(file));
        }
        return true;
    }

    /* renamed from: a */
    public void mo195716a(final UpgradeInfo upgradeInfo, final AbstractC57658b bVar) {
        final File file = new File(C57626a.m223733a(upgradeInfo.getVersion()));
        final String md5 = upgradeInfo.getMd5();
        C57865c.m224574a(new C57865c.AbstractC57873d<Boolean>() {
            /* class com.ss.android.lark.upgrade.impl.C57642b.C576442 */

            /* renamed from: a */
            public Boolean produce() {
                return Boolean.valueOf(C57642b.this.mo195725a(file, md5));
            }
        }, new C57865c.AbstractC57871b<Boolean>() {
            /* class com.ss.android.lark.upgrade.impl.C57642b.C576453 */

            /* renamed from: a */
            public void consume(Boolean bool) {
                Log.m165389i("UpgradeImpl", "checkApkValid: " + bool);
                upgradeInfo.setApkFileReady(bool.booleanValue());
                bVar.mo195738a(bool.booleanValue());
            }
        });
    }

    /* renamed from: c */
    public boolean mo195731c() {
        UpgradeInfo upgradeInfo = this.f142047c;
        if (upgradeInfo == null || !upgradeInfo.isShouldStrongNotice()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo195732d() {
        UpgradeInfo upgradeInfo = this.f142047c;
        if (upgradeInfo == null || !upgradeInfo.isHasNew()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo195734f() {
        if (!this.f142054j || !mo195730b(this.f142047c)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private void m223815j() {
        for (az azVar : this.f142045a) {
            azVar.mo105622a(true);
        }
    }

    /* renamed from: k */
    private void m223817k() {
        for (az azVar : this.f142045a) {
            azVar.mo105622a(false);
        }
    }

    /* renamed from: l */
    private void m223818l() {
        for (az azVar : this.f142045a) {
            azVar.mo105623b(true);
        }
    }

    /* renamed from: m */
    private void m223819m() {
        for (az azVar : this.f142045a) {
            azVar.mo105623b(false);
        }
    }

    /* renamed from: b */
    public boolean mo195729b() {
        return TextUtils.equals("googleplay", PackageChannelManager.getBuildPackageChannel(C57607a.m223662a().mo177704a()));
    }

    /* renamed from: i */
    private boolean m223814i() {
        String d = C57607a.m223662a().mo177710d();
        if (!TextUtils.equals(d, this.f142051g)) {
            this.f142050f = 0;
            this.f142054j = true;
        }
        this.f142051g = d;
        long currentTimeMillis = System.currentTimeMillis();
        this.f142050f = currentTimeMillis;
        if (currentTimeMillis - this.f142050f < 300000) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo195733e() {
        if (this.f142047c != null) {
            boolean z = true;
            if (!C57607a.m223662a().mo177706a("lark.client.update.silent_notify") && this.f142047c.getUpgradePlan().getNoticePlan() != 0) {
                z = false;
            }
            if (z) {
                m223817k();
                UserSP.getInstance().putString("key_hide_mine_badge_version", this.f142047c.getVersion());
            }
        }
    }

    /* renamed from: b */
    private boolean m223806b(String str) {
        return this.f142046b.contains(str);
    }

    /* renamed from: i */
    private long m223813i(UpgradeInfo upgradeInfo) {
        return UserSP.getInstance().getLong(upgradeInfo.getVersion(), 0);
    }

    /* renamed from: j */
    private boolean m223816j(UpgradeInfo upgradeInfo) {
        if (upgradeInfo == null || !m223806b(upgradeInfo.getDownloadUrl())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo195714a(az azVar) {
        if (azVar != null && !this.f142045a.contains(azVar)) {
            this.f142045a.add(azVar);
        }
    }

    /* renamed from: b */
    public void mo195727b(az azVar) {
        if (azVar != null) {
            this.f142045a.remove(azVar);
        }
    }

    /* renamed from: a */
    private Observable m223805a(final boolean z) {
        Log.m165389i("UpgradeImpl", "fetchVersionInfo");
        return Observable.create(new ObservableOnSubscribe() {
            /* class com.ss.android.lark.upgrade.impl.C57642b.C576548 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(final ObservableEmitter observableEmitter) throws Exception {
                C57660b.m223868a().mo195750a(C57607a.m223662a().mo177704a(), z, new IGetDataCallback<NewVersionResponse>() {
                    /* class com.ss.android.lark.upgrade.impl.C57642b.C576548.C576551 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        observableEmitter.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(NewVersionResponse newVersionResponse) {
                        observableEmitter.onNext(newVersionResponse);
                        observableEmitter.onComplete();
                    }
                });
            }
        });
    }

    /* renamed from: e */
    private boolean m223809e(UpgradeInfo upgradeInfo) {
        if (!m223816j(upgradeInfo) && m223811g(upgradeInfo)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m223810f(UpgradeInfo upgradeInfo) {
        if (!m223816j(upgradeInfo) && !m223812h(upgradeInfo)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m223812h(UpgradeInfo upgradeInfo) {
        if (UserSP.getInstance().getLong(upgradeInfo.getVersion(), 0) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m223807c(UpgradeInfo upgradeInfo) {
        if (!upgradeInfo.isHasNew()) {
            return false;
        }
        if (upgradeInfo.getUpgradePlan().getPopupPlan() == 0) {
            return m223820n();
        }
        if (upgradeInfo.getUpgradePlan().getPopupPlan() == 1) {
            return m223809e(upgradeInfo);
        }
        if (upgradeInfo.getUpgradePlan().getPopupPlan() == 2) {
            return m223810f(upgradeInfo);
        }
        return false;
    }

    /* renamed from: d */
    private boolean m223808d(UpgradeInfo upgradeInfo) {
        if ((!C57607a.m223662a().mo177706a("lark.client.update.silent_notify") || upgradeInfo.getUpgradePlan().getNoticePlan() != 0) && upgradeInfo.isHasNew() && !UserSP.getInstance().getString("key_hide_mine_badge_version").equals(upgradeInfo.getVersion())) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m223811g(UpgradeInfo upgradeInfo) {
        boolean z;
        if (System.currentTimeMillis() - m223813i(upgradeInfo) > 1800000) {
            z = true;
        } else {
            z = false;
        }
        Log.m165389i("UpgradeImpl", "hasBeen30m: " + z);
        return z;
    }

    /* renamed from: b */
    public void mo195726b(int i) {
        Log.m165389i("UpgradeImpl", "triggerStopSilentUpgrade");
        UpgradeInfo upgradeInfo = this.f142047c;
        if (upgradeInfo != null && !TextUtils.isEmpty(upgradeInfo.getDownloadUrl()) && i == this.f142047c.getDownloadUrl().hashCode()) {
            C57626a.m223732a().mo195622b(this.f142047c.getVersion(), this.f142047c.getDownloadUrl());
        }
    }

    /* renamed from: a */
    public void mo195710a(int i) {
        Log.m165389i("UpgradeImpl", "triggerStartSilentUpgrade");
        WeakReference<Context> weakReference = this.f142048d;
        if (weakReference != null && weakReference.get() != null) {
            Context context = this.f142048d.get();
            UpgradeInfo upgradeInfo = this.f142047c;
            if (upgradeInfo != null && !TextUtils.isEmpty(upgradeInfo.getDownloadUrl()) && i == this.f142047c.getDownloadUrl().hashCode()) {
                mo195722a(new WeakReference<>(context), new WeakReference<>(null), this.f142047c, true);
            }
        }
    }

    /* renamed from: b */
    public boolean mo195730b(UpgradeInfo upgradeInfo) {
        AbstractC57608a a = C57607a.m223662a();
        if (mo195729b() || !a.mo177706a("android.update.silent")) {
            return false;
        }
        if (upgradeInfo.isShouldShowUpgradeDialog()) {
            return a.mo177706a("android.update.silent.under.dialog");
        }
        if (!a.mo177706a("android.update.silent.ignore.dialog")) {
            return false;
        }
        if (TextUtils.equals("normal", PackageChannelManager.getBuildPackageChannel(a.mo177704a()))) {
            return true;
        }
        return a.mo177706a("android.update.silent.ignore.channel");
    }

    /* renamed from: a */
    public void mo195711a(Context context) {
        if (this.f142047c != null && context != null) {
            DialogC57630a aVar = new DialogC57630a(context, this.f142047c, "click");
            if (m223806b(this.f142047c.getDownloadUrl()) && !mo195734f()) {
                aVar.mo195697f();
            }
            aVar.show();
            UpgradeHitPoint.f141994a.mo195626a("click", this.f142047c.getUpgradePlan());
        }
    }

    /* renamed from: a */
    public void mo195713a(final IGetDataCallback<Boolean> iGetDataCallback) {
        C57620a.m223723a().mo195612b();
        m223805a(true).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new AbstractC57864b<NewVersionResponse>() {
            /* class com.ss.android.lark.upgrade.impl.C57642b.C576431 */

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
            }

            @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b
            /* renamed from: a */
            public void mo147247a(Throwable th) {
                Log.m165384e("UpgradeImpl", "fetchVersionInfo error", th);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new ErrorResult("fetchVersionInfo error"));
                }
            }

            /* renamed from: a */
            public void onNext(NewVersionResponse newVersionResponse) {
                C57642b bVar = C57642b.this;
                UpgradeInfo a = bVar.mo195709a(newVersionResponse, bVar.mo195729b());
                Log.m165389i("UpgradeImpl", "upgradeInfo: " + a);
                C57642b.this.mo195717a(a.getVersion());
                C57642b.this.mo195715a(a);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(Boolean.valueOf(a.isHasNew()));
                }
            }
        });
    }

    /* renamed from: a */
    public UpgradeInfo mo195709a(NewVersionResponse newVersionResponse, boolean z) {
        UpgradeInfo upgradeInfo = new UpgradeInfo();
        upgradeInfo.setHasNew(newVersionResponse.isHasNew());
        VersionData versionData = newVersionResponse.getVersionData();
        if (newVersionResponse.isHasNew() && versionData != null) {
            String version = versionData.getVersion();
            if (TextUtils.isEmpty(version)) {
                upgradeInfo.setHasNew(false);
            } else if ((version.contains("alpha") || version.contains("beta")) && z) {
                upgradeInfo.setHasNew(false);
            } else {
                upgradeInfo.setUpgradePlan(newVersionResponse.getUpgradePlan());
                upgradeInfo.setVersion(versionData.getVersion());
                upgradeInfo.setReleaseNote(versionData.getReleaseNotes());
                upgradeInfo.setDownloadUrl(versionData.getDownloadUrl());
                upgradeInfo.setMd5(versionData.getDownloadMd5());
            }
        }
        if (newVersionResponse.getUpgradePlan() == null) {
            upgradeInfo.setUpgradePlan(UpgradePlan.buildDefaultPlan());
        }
        upgradeInfo.setShouldShowUpgradeDialog(m223807c(upgradeInfo));
        upgradeInfo.setShouldStrongNotice(m223808d(upgradeInfo));
        return upgradeInfo;
    }

    /* renamed from: a */
    public void mo195712a(Context context, final ay ayVar) {
        C57620a.m223723a().mo195612b();
        if (!m223814i()) {
            Log.m165379d("UpgradeImpl", "Interval too short, no need check new version");
            if (ayVar != null) {
                ayVar.mo102558a();
                return;
            }
            return;
        }
        this.f142048d = new WeakReference<>(context);
        m223805a(false).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new AbstractC57864b<NewVersionResponse>() {
            /* class com.ss.android.lark.upgrade.impl.C57642b.C576464 */

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
            }

            @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b
            /* renamed from: a */
            public void mo147247a(Throwable th) {
                ayVar.mo102558a();
                Log.m165384e("UpgradeImpl", "fetchVersionInfo error", th);
            }

            /* renamed from: a */
            public void onNext(NewVersionResponse newVersionResponse) {
                C57642b bVar = C57642b.this;
                final UpgradeInfo a = bVar.mo195709a(newVersionResponse, bVar.mo195729b());
                Log.m165389i("UpgradeImpl", "upgradeInfo: " + a);
                C57642b.this.mo195717a(a.getVersion());
                boolean b = C57642b.this.mo195730b(a);
                Log.m165389i("UpgradeImpl", "enterSilentMode: " + b);
                if (!a.isShouldShowUpgradeDialog()) {
                    if (b && a.isHasNew()) {
                        C57642b.this.mo195716a(a, new AbstractC57658b() {
                            /* class com.ss.android.lark.upgrade.impl.C57642b.C576464.C576471 */

                            @Override // com.ss.android.lark.upgrade.impl.C57642b.AbstractC57658b
                            /* renamed from: a */
                            public void mo195738a(boolean z) {
                                if (!z) {
                                    C57709a.m224043a().mo195867a(a.getDownloadUrl());
                                }
                            }
                        });
                    }
                } else if (!b) {
                    C57642b.this.mo195716a(a, new AbstractC57658b() {
                        /* class com.ss.android.lark.upgrade.impl.C57642b.C576464.C576482 */

                        @Override // com.ss.android.lark.upgrade.impl.C57642b.AbstractC57658b
                        /* renamed from: a */
                        public void mo195738a(boolean z) {
                            C57642b.this.mo195719a(C57642b.this.f142048d, a, ayVar);
                        }
                    });
                } else {
                    C57642b.this.mo195716a(a, new AbstractC57658b() {
                        /* class com.ss.android.lark.upgrade.impl.C57642b.C576464.C576493 */

                        @Override // com.ss.android.lark.upgrade.impl.C57642b.AbstractC57658b
                        /* renamed from: a */
                        public void mo195738a(boolean z) {
                            boolean enableSnooze = a.getUpgradePlan().enableSnooze();
                            if (z || !enableSnooze) {
                                C57642b.this.mo195719a(C57642b.this.f142048d, a, ayVar);
                            }
                            if (!z) {
                                C57709a.m224043a().mo195867a(a.getDownloadUrl());
                            }
                        }
                    });
                }
                C57642b.this.mo195715a(a);
            }
        });
    }

    /* renamed from: a */
    private DialogC57630a m223803a(Context context, UpgradeInfo upgradeInfo, DialogC57630a aVar) {
        if (upgradeInfo == null || context == null || !(context instanceof Activity)) {
            return null;
        }
        if (aVar == null) {
            aVar = new DialogC57630a(context, upgradeInfo, "auto");
        } else {
            aVar.mo195689a();
        }
        if (m223806b(upgradeInfo.getDownloadUrl()) && !mo195734f()) {
            aVar.mo195697f();
        }
        aVar.show();
        return aVar;
    }

    /* renamed from: b */
    public void mo195728b(final WeakReference<Context> weakReference, final WeakReference<DialogInterface> weakReference2, final UpgradeInfo upgradeInfo, final boolean z) {
        String str;
        this.f142046b.add(upgradeInfo.getDownloadUrl());
        C57626a.m223732a().mo195620a(upgradeInfo.getVersion(), upgradeInfo.getDownloadUrl());
        final Context a = C57607a.m223662a().mo177704a();
        final int uptimeMillis = (int) SystemClock.uptimeMillis();
        final String version = upgradeInfo.getVersion();
        this.f142049e = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("Upgrade download START");
        if (z) {
            str = "[Silent]";
        } else {
            str = "";
        }
        sb.append(str);
        Log.m165389i("UpgradeImpl", sb.toString());
        if (this.f142052h == null) {
            this.f142052h = new AbstractC57625c() {
                /* class com.ss.android.lark.upgrade.impl.C57642b.C576527 */

                /* renamed from: a */
                long f142082a;

                @Override // com.ss.android.lark.upgrade.p2895c.AbstractC57625c
                /* renamed from: b */
                public void mo195617b(long j) {
                    C57642b bVar = C57642b.this;
                    bVar.mo195723a(false, j / 1024, bVar.f142049e, z, C57642b.this.f142047c.getDownloadUrl(), version);
                    C57642b.this.f142046b.remove(upgradeInfo.getDownloadUrl());
                    C57607a.m223662a().mo177712f();
                    DialogC57630a aVar = (DialogC57630a) weakReference2.get();
                    if (aVar != null && aVar.isShowing()) {
                        aVar.mo195698g();
                    }
                }

                @Override // com.ss.android.lark.upgrade.p2895c.AbstractC57625c
                /* renamed from: a */
                public void mo195616a(long j) {
                    C57642b bVar = C57642b.this;
                    bVar.mo195723a(true, j / 1024, bVar.f142049e, z, C57642b.this.f142047c.getDownloadUrl(), version);
                    C57642b.this.f142046b.remove(upgradeInfo.getDownloadUrl());
                    C57607a.m223662a().mo177712f();
                    if (!C57642b.this.mo195734f()) {
                        C57642b.this.mo195721a(weakReference, weakReference2, upgradeInfo);
                    } else {
                        C57642b.this.mo195718a(weakReference, upgradeInfo);
                    }
                }

                @Override // com.ss.android.lark.upgrade.p2895c.AbstractC57625c
                /* renamed from: a */
                public void mo195615a(final int i, long j, long j2) {
                    if (!C57642b.this.mo195734f()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - this.f142082a > 1000) {
                            this.f142082a = currentTimeMillis;
                            final String string = a.getString(R.string.Lark_Legacy_Updating_V2);
                            final String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_title);
                            final int g = C57642b.this.mo195735g();
                            final int h = C57642b.this.mo195736h();
                            Intent intent = new Intent();
                            intent.setFlags(536870912);
                            final PendingIntent activity = PendingIntent.getActivity(a, uptimeMillis, intent, 134217728);
                            UICallbackExecutor.execute(new Runnable() {
                                /* class com.ss.android.lark.upgrade.impl.C57642b.C576527.RunnableC576531 */

                                public void run() {
                                    NotificationParam.C48498a b = new NotificationParam.C48498a(1, null).mo169572a(activity).mo169571a(g).mo169573a(a, h).mo169576a(string).mo169580b(mustacheFormat);
                                    C57823a.m224448a(a).mo196176b(b.mo169583c(i + "%").mo169581b(false).mo169579b(i).mo169578a());
                                }
                            });
                        }
                    }
                }
            };
        }
        this.f142054j &= z;
        C57626a.m223732a().mo195618a(this.f142052h);
    }
}
