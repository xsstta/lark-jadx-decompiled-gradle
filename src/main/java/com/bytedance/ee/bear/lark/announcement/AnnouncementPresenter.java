package com.bytedance.ee.bear.lark.announcement;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.IAnnounceSendCallback;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.facade.common.DoWhenInActiveException;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.lark.announcement.AnnouncementPresenter;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.bytedance.ee.bear.onboarding.export.ui.C10403a;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.component.ui.toast.C25707a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import org.koin.java.KoinJavaComponent;

public class AnnouncementPresenter {

    /* renamed from: a */
    public C6095s f21432a;

    /* renamed from: b */
    protected boolean f21433b;

    /* renamed from: c */
    public Runnable f21434c = new Runnable() {
        /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncementPresenter$AWYDoI1IIv9uG8WGA8Mg8gAPAI */

        public final void run() {
            AnnouncementPresenter.this.m31852i();
        }
    };

    /* renamed from: d */
    private Runnable f21435d;

    /* renamed from: e */
    private Runnable f21436e;

    /* renamed from: f */
    private Handler f21437f;

    /* renamed from: g */
    private ThumbnailSyncHelper f21438g;

    /* renamed from: h */
    private Disposable f21439h;

    /* renamed from: a */
    public boolean mo30929a(DocViewModel docViewModel) {
        String url = docViewModel.getUrl();
        if (TextUtils.isEmpty(url)) {
            C13479a.m54775e("AnnouncementPresenter", "can not judge announce type, url is null");
            return false;
        }
        String queryParameter = Uri.parse(url).getQueryParameter("sub_type");
        if (queryParameter != null && "community".equals(queryParameter)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private C10917c m31851h() {
        return this.f21432a.mo24601p();
    }

    /* renamed from: c */
    public DocViewModel mo30932c() {
        return this.f21432a.mo24598m();
    }

    /* access modifiers changed from: private */
    public class AnnounceSendCallback extends IAnnounceSendCallback.Stub {
        private C25707a sendingToast;

        @Override // com.bytedance.ee.bear.contract.IAnnounceSendCallback
        public void onAnnounceSendFailed() throws RemoteException {
            C13479a.m54764b("AnnouncementPresenter", "onAnnounceSendFailed");
            C13748k.m55732a(new Runnable() {
                /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncementPresenter$AnnounceSendCallback$ESSjEfPf0Jk90_3LLXO6g6sonyE */

                public final void run() {
                    AnnouncementPresenter.AnnounceSendCallback.this.lambda$onAnnounceSendFailed$2$AnnouncementPresenter$AnnounceSendCallback();
                }
            });
        }

        @Override // com.bytedance.ee.bear.contract.IAnnounceSendCallback
        public void onAnnounceSendSuccess() throws RemoteException {
            C13479a.m54772d("AnnouncementPresenter", "onAnnounceSendSuccess");
            C13748k.m55732a(new Runnable() {
                /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncementPresenter$AnnounceSendCallback$KqenmJV9qLCuQqMANlV2XpkMygI */

                public final void run() {
                    AnnouncementPresenter.AnnounceSendCallback.this.lambda$onAnnounceSendSuccess$1$AnnouncementPresenter$AnnounceSendCallback();
                }
            });
        }

        @Override // com.bytedance.ee.bear.contract.IAnnounceSendCallback
        public void onAnnounceSending() throws RemoteException {
            C13479a.m54772d("AnnouncementPresenter", "onAnnounceSending");
            C13748k.m55732a(new Runnable() {
                /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncementPresenter$AnnounceSendCallback$z_vxXJJUo7mS27eByz3LUXqKsY */

                public final void run() {
                    AnnouncementPresenter.AnnounceSendCallback.this.lambda$onAnnounceSending$0$AnnouncementPresenter$AnnounceSendCallback();
                }
            });
        }

        public /* synthetic */ void lambda$onAnnounceSendFailed$2$AnnouncementPresenter$AnnounceSendCallback() {
            C25707a aVar = this.sendingToast;
            if (aVar != null) {
                aVar.mo90181a();
            }
            C13748k.m55735c(AnnouncementPresenter.this.f21434c);
            C13748k.m55733a(AnnouncementPresenter.this.f21434c, 1000);
        }

        public /* synthetic */ void lambda$onAnnounceSendSuccess$1$AnnouncementPresenter$AnnounceSendCallback() {
            C25707a aVar = this.sendingToast;
            if (aVar != null) {
                aVar.mo90181a();
            }
            AnnouncementPresenter.this.f21432a.mo19564f().finish();
        }

        public /* synthetic */ void lambda$onAnnounceSending$0$AnnouncementPresenter$AnnounceSendCallback() {
            C25707a newGlobal = LKUIToast.newGlobal(AnnouncementPresenter.this.mo30930b(), AnnouncementPresenter.this.mo30926a(R.string.Doc_Lark_AnnounceSending));
            this.sendingToast = newGlobal;
            newGlobal.mo90186a(R.drawable.doc_announce_sending, LKUIToast.getRotateAnimation());
            this.sendingToast.mo90191c();
        }

        private AnnounceSendCallback() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m31852i() {
        Toast.showFailureText(mo30930b(), (int) R.string.Doc_Lark_AnnounceSendFailed);
    }

    /* renamed from: b */
    public Context mo30930b() {
        return this.f21432a.mo19562e();
    }

    /* renamed from: g */
    private boolean m31850g() {
        if (!((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39517a("mobile_doc_groupAnnouncement_intro")) {
            return true;
        }
        C13479a.m54764b("AnnouncementPresenter", "showGuideTip: had shown");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo30933d() {
        Runnable runnable = this.f21436e;
        if (runnable != null) {
            this.f21437f.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f21435d;
        if (runnable2 != null) {
            this.f21437f.removeCallbacks(runnable2);
        }
    }

    /* renamed from: e */
    private void m31848e() throws DoWhenInActiveException {
        if (this.f21432a.mo19564f() == null) {
            throw new DoWhenInActiveException();
        } else if (this.f21432a.mo19566h().getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            throw new DoWhenInActiveException();
        }
    }

    /* renamed from: f */
    private boolean m31849f() {
        if (((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39517a("mobile_doc_groupAnnouncement_autoSave")) {
            C13479a.m54764b("AnnouncementPresenter", "checkPublishTipCondition: had shown");
            return false;
        } else if (mo30932c().isCanEdit()) {
            return true;
        } else {
            C13479a.m54764b("AnnouncementPresenter", "checkPublishTipCondition: can't edit");
            return false;
        }
    }

    /* renamed from: a */
    public String mo30925a() {
        try {
            m31848e();
            String queryParameter = Uri.parse(mo30932c().getUrl()).getQueryParameter("chat_id");
            if (queryParameter == null) {
                return "";
            }
            return queryParameter;
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30931b(TitleBar titleBar) {
        if (m31849f()) {
            Runnable runnable = this.f21435d;
            if (runnable != null) {
                this.f21437f.removeCallbacks(runnable);
            }
            $$Lambda$AnnouncementPresenter$tlUUzdg7MIzMO9qj67XzyOZGGco r0 = new Runnable(titleBar) {
                /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncementPresenter$tlUUzdg7MIzMO9qj67XzyOZGGco */
                public final /* synthetic */ TitleBar f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    AnnouncementPresenter.this.m31846c(this.f$1);
                }
            };
            this.f21435d = r0;
            this.f21437f.postDelayed(r0, 5000);
        }
    }

    AnnouncementPresenter(C6095s sVar) {
        this.f21432a = sVar;
        this.f21437f = new Handler(Looper.getMainLooper());
        this.f21438g = new ThumbnailSyncHelper(sVar.mo19567i(), mo30932c().getBearUrl());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m31846c(final TitleBar titleBar) {
        try {
            m31848e();
            if (m31849f()) {
                ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39514a(new AbstractC10397d<C10403a>() {
                    /* class com.bytedance.ee.bear.lark.announcement.AnnouncementPresenter.C79792 */

                    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
                    /* renamed from: a */
                    public String mo21350a() {
                        return "doc";
                    }

                    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
                    /* renamed from: b */
                    public String mo21352b() {
                        return "mobile_doc_groupAnnouncement_autoSave";
                    }

                    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
                    /* renamed from: c */
                    public /* synthetic */ String mo21356c() {
                        return AbstractC10397d.CC.$default$c(this);
                    }

                    /* renamed from: a */
                    public boolean mo24400a(C10403a aVar) {
                        int i;
                        FragmentActivity d = aVar.mo39612d();
                        AnnouncementPresenter announcementPresenter = AnnouncementPresenter.this;
                        if (announcementPresenter.mo30929a(announcementPresenter.mo30932c())) {
                            i = R.string.Doc_Lark_Channel_AnnouncementSaveGuide;
                        } else {
                            i = R.string.Doc_Lark_AnnouncementSaveGuide;
                        }
                        String a = AnnouncementPresenter.this.mo30926a(i);
                        View a2 = titleBar.mo19508a().mo45071a("announce");
                        if (a2 == null) {
                            return false;
                        }
                        aVar.mo39611b(d.getWindow(), new C10395e(a, a2), null);
                        return true;
                    }
                }, this.f21432a.mo19564f());
            }
        } catch (DoWhenInActiveException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m31847d(final TitleBar titleBar) {
        try {
            m31848e();
            if (m31850g()) {
                ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39514a(new AbstractC10397d<C10403a>() {
                    /* class com.bytedance.ee.bear.lark.announcement.AnnouncementPresenter.C79781 */

                    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
                    /* renamed from: a */
                    public String mo21350a() {
                        return "doc";
                    }

                    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
                    /* renamed from: b */
                    public String mo21352b() {
                        return "mobile_doc_groupAnnouncement_intro";
                    }

                    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
                    /* renamed from: c */
                    public /* synthetic */ String mo21356c() {
                        return AbstractC10397d.CC.$default$c(this);
                    }

                    /* renamed from: a */
                    public boolean mo24400a(C10403a aVar) {
                        int i;
                        FragmentActivity d = aVar.mo39612d();
                        AnnouncementPresenter announcementPresenter = AnnouncementPresenter.this;
                        if (announcementPresenter.mo30929a(announcementPresenter.mo30932c())) {
                            i = R.string.Doc_Lark_Channel_AnnouncementSupport;
                        } else {
                            i = R.string.Doc_Lark_AnnouncementSupport;
                        }
                        String string = d.getString(i);
                        BaseTitleBar a = titleBar.mo19508a();
                        if (a == null) {
                            return false;
                        }
                        aVar.mo39611b(d.getWindow(), new C10395e(string, a), null);
                        return true;
                    }
                }, this.f21432a.mo19564f());
            }
        } catch (DoWhenInActiveException unused) {
        }
    }

    /* renamed from: a */
    public String mo30926a(int i) {
        return mo30930b().getString(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30927a(TitleBar titleBar) {
        if (m31850g()) {
            Runnable runnable = this.f21436e;
            if (runnable != null) {
                this.f21437f.removeCallbacks(runnable);
            }
            $$Lambda$AnnouncementPresenter$m8TMSPLiThII2U1DM9LSP95Z4tQ r0 = new Runnable(titleBar) {
                /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncementPresenter$m8TMSPLiThII2U1DM9LSP95Z4tQ */
                public final /* synthetic */ TitleBar f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    AnnouncementPresenter.this.m31847d(this.f$1);
                }
            };
            this.f21436e = r0;
            this.f21437f.postDelayed(r0, 5000);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30928a(String str) {
        Disposable disposable = this.f21439h;
        if (disposable != null) {
            disposable.dispose();
            this.f21439h = null;
        }
        AnnounceSendCallback announceSendCallback = new AnnounceSendCallback();
        try {
            announceSendCallback.onAnnounceSending();
        } catch (RemoteException e) {
            C13479a.m54761a("AnnouncementPresenter", e);
        }
        this.f21439h = this.f21438g.mo30939a().mo237985a(C11678b.m48481e()).mo238001b(new Consumer(str, announceSendCallback) {
            /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncementPresenter$XS84VMTeGg5ewXF8EQFkPsraac */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ AnnouncementPresenter.AnnounceSendCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AnnouncementPresenter.this.m31841a((AnnouncementPresenter) this.f$1, (String) this.f$2, (AnnouncementPresenter.AnnounceSendCallback) ((String) obj));
            }
        }, new Consumer(str, announceSendCallback) {
            /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncementPresenter$My2ngsQTfVKj6J0LF6sJwsCypzw */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ AnnouncementPresenter.AnnounceSendCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AnnouncementPresenter.this.m31842a((AnnouncementPresenter) this.f$1, (String) this.f$2, (AnnouncementPresenter.AnnounceSendCallback) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31840a(String str, AnnounceSendCallback announceSendCallback) {
        m31843a(this.f21438g.mo30940b(), str, announceSendCallback);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31841a(String str, AnnounceSendCallback announceSendCallback, String str2) throws Exception {
        C13479a.m54764b("AnnouncementPresenter", "syncThumbnail: url = " + C13598b.m55197d(str2));
        try {
            m31848e();
            m31843a(str2, str, announceSendCallback);
        } catch (DoWhenInActiveException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31842a(String str, AnnounceSendCallback announceSendCallback, Throwable th) throws Exception {
        C13479a.m54773d("AnnouncementPresenter", "accept: ", th);
        try {
            m31848e();
            ((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39503c(mo30930b(), th, new Runnable(str, announceSendCallback) {
                /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncementPresenter$YBfkrkqSlzXOqH9Da6cgjqTPU */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ AnnouncementPresenter.AnnounceSendCallback f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    AnnouncementPresenter.this.m31840a(this.f$1, this.f$2);
                }
            });
        } catch (DoWhenInActiveException unused) {
        }
    }

    /* renamed from: a */
    private void m31843a(String str, String str2, IBinder iBinder) {
        m31851h().mo41508c(ak.class).mo238020d(new Function(str, str2, iBinder) {
            /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncementPresenter$y8thRd11lRpO0ajF0eP9TgZbM */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ IBinder f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AnnouncementPresenter.this.m31839a(this.f$1, this.f$2, this.f$3, (ak) obj);
            }
        }).mo238001b($$Lambda$AnnouncementPresenter$alumtBjfaL1Sf8vHU8Jl9Rrjmv4.INSTANCE, $$Lambda$AnnouncementPresenter$A9wcpqn6urTmdaVr_3n5QKZ1_I.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m31839a(String str, String str2, IBinder iBinder, ak akVar) throws Exception {
        akVar.notifyAnnouncementChange(mo30925a(), str, this.f21433b, str2, iBinder);
        return "";
    }
}
