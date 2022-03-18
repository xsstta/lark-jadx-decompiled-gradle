package com.tt.miniapp.launchaction;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.google.gson.Gson;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import com.tt.miniapp.launchaction.bean.TopNotificationResult;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.util.C67590h;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3456d.C68279a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tt.miniapp.launchaction.c */
public abstract class AbstractC66304c {

    /* renamed from: a */
    private UDNotice f167335a;

    /* renamed from: b */
    private FragmentActivity f167336b;

    /* renamed from: c */
    private IAppContext f167337c;

    /* renamed from: d */
    private Disposable f167338d;

    /* renamed from: e */
    private C66309f f167339e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ViewStub mo231757a(Activity activity, boolean z);

    /* renamed from: a */
    public void mo231758a(String str, boolean z, int i) {
        AppBrandLogger.m52830i("BaseTopNotification", "tryShowNotification: ", str, " isCustomTitleBar:", Boolean.valueOf(z), " delay:", Integer.valueOf(i));
        if (mo231759a()) {
            this.f167338d = Observable.timer((long) i, TimeUnit.MILLISECONDS).flatMap(new Function(str) {
                /* class com.tt.miniapp.launchaction.$$Lambda$c$lLVPrmYhbuQfbAQlPN2lVrFqNjo */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return AbstractC66304c.this.m259404a(this.f$1, (Long) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(str, z) {
                /* class com.tt.miniapp.launchaction.$$Lambda$c$a5VRE1e8HaIcMmqsPZoFET9nGM */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbstractC66304c.this.m259414a((AbstractC66304c) this.f$1, (String) this.f$2, (boolean) ((TopNotificationResult) obj));
                }
            }, $$Lambda$c$kwVE32Gq8OL3kTFpSNXDOCvcBrg.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m259414a(String str, boolean z, TopNotificationResult topNotificationResult) throws Exception {
        if (!topNotificationResult.isSuccess() || !m259416a(this.f167336b, str, topNotificationResult.getNotificationDetail())) {
            AppBrandLogger.m52830i("BaseTopNotification", "rawData:", topNotificationResult.getMsg());
            return;
        }
        m259409a(topNotificationResult.getNotificationDetail(), str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m259415a(Throwable th) throws Exception {
        AppBrandLogger.m52830i("BaseTopNotification", th.getLocalizedMessage());
    }

    /* renamed from: a */
    private boolean m259416a(Context context, String str, TopNotificationResult.NotificationDetail notificationDetail) {
        boolean z = m259419b(context, str, notificationDetail) && notificationDetail.isEffectiveTime();
        AppBrandLogger.m52830i("BaseTopNotification", "shouldShow:", Boolean.valueOf(z));
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo231759a() {
        boolean featureGating = HostDependManager.getInst().getFeatureGating("openplatform.gadget.notice.enable", false);
        AppBrandLogger.m52830i("BaseTopNotification", "isFgOpen:", Boolean.valueOf(featureGating));
        return featureGating;
    }

    /* renamed from: a */
    private boolean m259417a(Context context, String str, String str2) {
        SharedPreferences a = C12899a.m53203a(context, "MiniAppTopNotification");
        return !a.getBoolean(str + "_" + str2, false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m259413a(String str, String str2, View view) {
        this.f167335a.setVisibility(8);
        new C67500a("openplatform_in_app_notification_click", this.f167337c).addCategoryValue("click", "close").addCategoryValue("notification_id", str).addCategoryValue("application_id", str2).reportPlatform(4).flush();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m259411a(String str, ObservableEmitter observableEmitter) throws Exception {
        String format = String.format("https://%s/oapi/app_interface/api/notification", LarkExtensionManager.getInstance().getExtension().mo49585a(DomainSettings.Alias.OPEN_APP_INTERFACE));
        AppBrandLogger.m52830i("BaseTopNotification", "url:", format);
        C12827e eVar = new C12827e(format, "POST");
        eVar.mo48433a("locale", (Object) C67479c.m262467a().mo234231d());
        eVar.mo48433a("client_id", (Object) str);
        C12830f a = C66434g.m259707a().mo231984a(eVar, this.f167337c);
        String d = a.mo48466d();
        if (!TextUtils.isEmpty(d)) {
            AppBrandLogger.m52830i("BaseTopNotification", "rawData:", d);
            observableEmitter.onNext(new Gson().fromJson(d, TopNotificationResult.class));
        } else if (a.mo48468f() != null) {
            AppBrandLogger.m52829e("BaseTopNotification", "getNotifyInfo error and root cause:", a.mo48468f().getLocalizedMessage());
            observableEmitter.onError(a.mo48468f());
        } else {
            observableEmitter.onError(new Exception("null data"));
        }
    }

    /* renamed from: a */
    private Observable<TopNotificationResult> m259403a(String str) {
        return Observable.create(new ObservableOnSubscribe(str) {
            /* class com.tt.miniapp.launchaction.$$Lambda$c$e4Adko_TSUQMKO8PYY0w4VzRVkM */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                AbstractC66304c.this.m259411a((AbstractC66304c) this.f$1, (String) observableEmitter);
            }
        }).subscribeOn(C68279a.m265023b());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ ObservableSource m259404a(String str, Long l) throws Exception {
        return m259403a(str);
    }

    /* renamed from: a */
    private void m259412a(String str, String str2) {
        this.f167335a.setIconButtonListener(new View.OnClickListener(str, str2) {
            /* class com.tt.miniapp.launchaction.$$Lambda$c$ARySMe7PXQIPfSspGukuX8tEirY */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                AbstractC66304c.this.m259413a((AbstractC66304c) this.f$1, this.f$2, (String) view);
            }
        });
    }

    public AbstractC66304c(FragmentActivity fragmentActivity, IAppContext iAppContext) {
        this.f167336b = fragmentActivity;
        fragmentActivity.getLifecycle().addObserver(new AbstractC1168n() {
            /* class com.tt.miniapp.launchaction.$$Lambda$c$QGnunhFrz_v4Mt2uOgOu3BLAUtI */

            @Override // androidx.lifecycle.AbstractC1168n
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                AbstractC66304c.this.m259406a((AbstractC66304c) lifecycleOwner, (LifecycleOwner) event);
            }
        });
        this.f167337c = iAppContext;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m259406a(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Disposable disposable;
        if (event == Lifecycle.Event.ON_DESTROY && (disposable = this.f167338d) != null) {
            disposable.dispose();
            C66309f fVar = this.f167339e;
            if (fVar != null && fVar.isShowing()) {
                this.f167339e.dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m259407a(UDNotice uDNotice, View view) {
        if (this.f167339e == null) {
            this.f167339e = new C66309f(this.f167336b);
        }
        this.f167339e.setAnimationStyle(0);
        this.f167339e.showAsDropDown(uDNotice);
    }

    /* renamed from: b */
    private boolean m259419b(Context context, String str, TopNotificationResult.NotificationDetail notificationDetail) {
        if (!notificationDetail.isJustFirstTimeShow()) {
            return true;
        }
        boolean a = m259417a(context, str, notificationDetail.getUuid());
        AppBrandLogger.m52830i("BaseTopNotification", "neverShown:", Boolean.valueOf(a));
        return a;
    }

    /* renamed from: a */
    private void m259405a(Activity activity, TopNotificationResult.NotificationDetail notificationDetail, boolean z) {
        if (this.f167335a == null) {
            String content = notificationDetail.getContent();
            String url = notificationDetail.getUrl();
            ViewStub a = mo231757a(activity, z);
            if (a == null) {
                AppBrandLogger.m52830i("BaseTopNotification", "inflate TopNotificationView null:");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f167335a = (UDNotice) a.inflate();
            m259412a(notificationDetail.getUuid(), this.f167337c.getAppId());
            m259408a(this.f167335a, content, url, activity);
            AppBrandLogger.m52830i("BaseTopNotification", "inflate TopNotificationView duration:" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: b */
    private void m259418b(Context context, String str, String str2) {
        new C67500a("openplatform_in_app_notification_view", this.f167337c).addCategoryValue("notification_id", str2).addCategoryValue("application_id", str).reportPlatform(4).flush();
        SharedPreferences.Editor edit = C12899a.m53203a(context, "MiniAppTopNotification").edit();
        edit.putBoolean(str + "_" + str2, true).apply();
    }

    /* renamed from: a */
    private void m259409a(TopNotificationResult.NotificationDetail notificationDetail, String str, boolean z) {
        m259405a(this.f167336b, notificationDetail, z);
        UDNotice uDNotice = this.f167335a;
        if (uDNotice != null) {
            uDNotice.setVisibility(0);
            m259418b(this.f167336b, str, notificationDetail.getUuid());
            AppBrandLogger.m52830i("BaseTopNotification", "TopNotificationView VISIBLE:");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m259410a(String str, Context context, View view) {
        AppBrandLogger.m52830i("BaseTopNotification", "open url", str);
        AbstractC67724a aVar = (AbstractC67724a) this.f167337c.findServiceByInterface(AbstractC67724a.class);
        if (aVar.mo50464f(str)) {
            aVar.mo50442a(context, str);
        } else {
            aVar.mo50440a((Activity) context, str, (String) null);
        }
    }

    /* renamed from: a */
    private void m259408a(UDNotice uDNotice, String str, String str2, Context context) {
        String a = C67590h.m263073a((int) R.string.SuiteAdminFrontend_Workplace_AdminNotif2);
        String a2 = C67590h.m263073a((int) R.string.SuiteAdminFrontend_Workplace_ViewNotifDetailsBtn);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(": ");
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" ");
            sb.append(a2);
        }
        uDNotice.setText(sb.toString());
        uDNotice.mo91029a(0, a.length(), new View.OnClickListener(uDNotice) {
            /* class com.tt.miniapp.launchaction.$$Lambda$c$Btc1Y0aMHAwCUgH26LDfkq_yWzo */
            public final /* synthetic */ UDNotice f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                AbstractC66304c.this.m259407a((AbstractC66304c) this.f$1, (UDNotice) view);
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            uDNotice.mo91029a(sb.length() - a2.length(), sb.length(), new View.OnClickListener(str2, context) {
                /* class com.tt.miniapp.launchaction.$$Lambda$c$OmuSQKqyjM8sVKTsuaKzhj97mRc */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    AbstractC66304c.this.m259410a((AbstractC66304c) this.f$1, (String) this.f$2, (Context) view);
                }
            });
        }
    }
}
