package com.tt.miniapp.audio.background;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import java.util.LinkedList;
import java.util.Queue;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.audio.background.a */
public class C65764a {

    /* renamed from: a */
    public volatile int f165741a = -1;

    /* renamed from: b */
    private Queue<AbstractC65772a> f165742b = new LinkedList();

    /* renamed from: c */
    private BgAudioModel f165743c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.audio.background.a$a */
    public interface AbstractC65772a {
        /* renamed from: a */
        void mo230432a();
    }

    /* renamed from: com.tt.miniapp.audio.background.a$b */
    public interface AbstractC65773b {
        /* renamed from: a */
        void mo88631a(int i);
    }

    /* renamed from: com.tt.miniapp.audio.background.a$c */
    public interface AbstractC65774c {
        /* renamed from: a */
        void mo88634a();

        /* renamed from: a */
        void mo88635a(String str, Throwable th);
    }

    /* renamed from: a */
    public void mo230427a(final AbstractC65774c cVar, IAppContext iAppContext) {
        m257804a(new AbstractC65772a() {
            /* class com.tt.miniapp.audio.background.C65764a.C657651 */

            @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65772a
            /* renamed from: a */
            public void mo230432a() {
                try {
                    C65764a aVar = C65764a.this;
                    aVar.mo230422a(aVar.f165741a, BgAudioCommand.PLAY);
                    AbstractC65774c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo88634a();
                    }
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "BgAudioManagerClient", e.getStackTrace());
                    AbstractC65774c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.mo88635a(ApiHandler.API_CALLBACK_EXCEPTION, e);
                    }
                }
            }
        }, iAppContext);
    }

    /* renamed from: a */
    public void mo230426a(final AbstractC65773b bVar, IAppContext iAppContext) {
        if (this.f165741a >= 0) {
            bVar.mo88631a(this.f165741a);
            return;
        }
        this.f165742b.offer(new AbstractC65772a() {
            /* class com.tt.miniapp.audio.background.C65764a.C657706 */

            @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65772a
            /* renamed from: a */
            public void mo230432a() {
                bVar.mo88631a(C65764a.this.f165741a);
            }
        });
        m257803a(iAppContext);
    }

    /* renamed from: a */
    public static C65764a m257802a() {
        return ContextSingletonInstance.getInstance().getBgAudioManagerClient();
    }

    /* renamed from: b */
    public BgAudioState mo230428b() {
        BgAudioState bgAudioState = new BgAudioState();
        if (this.f165741a == -1) {
            bgAudioState.f165738c = true;
            return bgAudioState;
        }
        try {
            return BgAudioState.m257798a(mo230422a(this.f165741a, BgAudioCommand.GET_AUDIO_STATE).mo234744b("bgAudioCommondRetState"));
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "BgAudioManagerClient", e.getStackTrace());
            return bgAudioState;
        }
    }

    /* renamed from: c */
    public boolean mo230431c() {
        if (this.f165741a < 0) {
            return false;
        }
        try {
            return mo230422a(this.f165741a, BgAudioCommand.NEED_KEEP_ALIVE).mo234746d("bgAudioCommandRetNeedKeepAlive");
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "BgAudioManagerClient", e.getStackTrace());
            return false;
        }
    }

    /* renamed from: a */
    private void m257803a(final IAppContext iAppContext) {
        boolean z;
        AppBrandLogger.m52828d("BgAudioManagerClient", "bindRemoteService");
        try {
            BgAudioCallExtra bgAudioCallExtra = new BgAudioCallExtra();
            AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
            if (appInfo != null) {
                bgAudioCallExtra.f165722a = appInfo.appId;
                if (appInfo.type == 2) {
                    z = true;
                } else {
                    z = false;
                }
                bgAudioCallExtra.f165724c = z;
                bgAudioCallExtra.f165723b = ProcessUtil.getCurProcessName(AppbrandContext.getInst().getApplicationContext());
            }
            this.f165741a = mo230423a(this.f165741a, BgAudioCommand.OBTAIN_MANAGER, bgAudioCallExtra.mo230399a()).mo234748e("bgAudioId");
            C67560a.m262959a("registerBgAudioPlayState", CrossProcessDataEntity.C67574a.m263013a().mo234760a("bgAudioId", (Object) Integer.valueOf(this.f165741a)).mo234763b(), new AbstractC67565b() {
                /* class com.tt.miniapp.audio.background.C65764a.C657717 */

                @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                /* renamed from: a */
                public void mo48979a() {
                    AppBrandLogger.m52830i("BgAudioManagerClient", "onCallProcessDead");
                    C65764a.this.f165741a = -1;
                }

                @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                /* renamed from: a */
                public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                    String b;
                    AppBrandLogger.m52828d("BgAudioManagerClient", "bindRemoteService onIpcCallback callbackData:", crossProcessDataEntity);
                    if (crossProcessDataEntity != null && (b = crossProcessDataEntity.mo234744b("bgAudioPlayState")) != null) {
                        C65764a.m257806a(b, iAppContext);
                    }
                }
            });
        } catch (Exception e) {
            AppBrandLogger.m52829e("BgAudioManagerClient", "bindRemoteService", e);
        }
        while (!this.f165742b.isEmpty()) {
            this.f165742b.poll().mo230432a();
        }
    }

    /* renamed from: a */
    private void m257804a(AbstractC65772a aVar, IAppContext iAppContext) {
        m257805a(aVar, false, iAppContext);
    }

    /* renamed from: b */
    public void mo230429b(final AbstractC65774c cVar, IAppContext iAppContext) {
        m257804a(new AbstractC65772a() {
            /* class com.tt.miniapp.audio.background.C65764a.C657662 */

            @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65772a
            /* renamed from: a */
            public void mo230432a() {
                try {
                    C65764a aVar = C65764a.this;
                    aVar.mo230422a(aVar.f165741a, BgAudioCommand.PAUSE);
                    AbstractC65774c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo88634a();
                    }
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "BgAudioManagerClient", e.getStackTrace());
                    AbstractC65774c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.mo88635a(ApiHandler.API_CALLBACK_EXCEPTION, e);
                    }
                }
            }
        }, iAppContext);
    }

    /* renamed from: c */
    public void mo230430c(final AbstractC65774c cVar, IAppContext iAppContext) {
        m257804a(new AbstractC65772a() {
            /* class com.tt.miniapp.audio.background.C65764a.C657673 */

            @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65772a
            /* renamed from: a */
            public void mo230432a() {
                try {
                    C65764a aVar = C65764a.this;
                    aVar.mo230422a(aVar.f165741a, BgAudioCommand.STOP);
                    AbstractC65774c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo88634a();
                    }
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "BgAudioManagerClient", e.getStackTrace());
                    AbstractC65774c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.mo88635a(ApiHandler.API_CALLBACK_EXCEPTION, e);
                    }
                }
            }
        }, iAppContext);
    }

    /* renamed from: a */
    public static void m257806a(String str, IAppContext iAppContext) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", str);
            ((AbstractC67709b.AbstractC67710a) ((AbstractC67709b) iAppContext.findServiceByInterface(AbstractC67709b.class)).mo235130i()).mo235028a(C67706e.C67708a.m263377a("onBgAudioStateChange", jSONObject).mo235009a());
        } catch (Exception e) {
            AppBrandLogger.m52829e("BgAudioManagerClient", "sendBgAudioState", e);
        }
    }

    /* renamed from: a */
    public CrossProcessDataEntity mo230422a(int i, BgAudioCommand bgAudioCommand) {
        return mo230423a(i, bgAudioCommand, (String) null);
    }

    /* renamed from: a */
    private void m257805a(AbstractC65772a aVar, boolean z, IAppContext iAppContext) {
        BgAudioModel bgAudioModel;
        if (!z && this.f165741a == -1 && (bgAudioModel = this.f165743c) != null) {
            mo230425a(bgAudioModel, (AbstractC65774c) null, iAppContext);
        }
        aVar.mo230432a();
    }

    /* renamed from: a */
    public CrossProcessDataEntity mo230423a(int i, BgAudioCommand bgAudioCommand, String str) {
        AppBrandLogger.m52828d("BgAudioManagerClient", "commondType:", bgAudioCommand, "commondInfo:", str);
        return C67560a.m262955a("type_bg_audio_sync_commond", CrossProcessDataEntity.C67574a.m263013a().mo234760a("bgAudioId", (Object) Integer.valueOf(i)).mo234760a("bgAudioCommondType", (Object) bgAudioCommand.getCommand()).mo234760a("bgAudioCommondInfo", (Object) str).mo234763b());
    }

    /* renamed from: a */
    public void mo230424a(final int i, final AbstractC65774c cVar, IAppContext iAppContext) {
        m257804a(new AbstractC65772a() {
            /* class com.tt.miniapp.audio.background.C65764a.C657684 */

            @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65772a
            /* renamed from: a */
            public void mo230432a() {
                try {
                    C65764a aVar = C65764a.this;
                    int i = aVar.f165741a;
                    BgAudioCommand bgAudioCommand = BgAudioCommand.SEEK;
                    aVar.mo230423a(i, bgAudioCommand, i + "");
                    AbstractC65774c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo88634a();
                    }
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "BgAudioManagerClient", e.getStackTrace());
                    AbstractC65774c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.mo88635a(ApiHandler.API_CALLBACK_EXCEPTION, e);
                    }
                }
            }
        }, iAppContext);
    }

    /* renamed from: a */
    public void mo230425a(final BgAudioModel bgAudioModel, final AbstractC65774c cVar, IAppContext iAppContext) {
        if (bgAudioModel == null || bgAudioModel.f165725a == null || C67053q.m261326a("request", bgAudioModel.f165725a, iAppContext)) {
            this.f165743c = bgAudioModel;
            if (this.f165741a == -1) {
                m257803a(iAppContext);
            }
            m257805a((AbstractC65772a) new AbstractC65772a() {
                /* class com.tt.miniapp.audio.background.C65764a.C657695 */

                @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65772a
                /* renamed from: a */
                public void mo230432a() {
                    try {
                        C65764a aVar = C65764a.this;
                        aVar.mo230423a(aVar.f165741a, BgAudioCommand.SET_AUDIO_MODEL, bgAudioModel.mo230407a());
                        AbstractC65774c cVar = cVar;
                        if (cVar != null) {
                            cVar.mo88634a();
                        }
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "BgAudioManagerClient", e.getStackTrace());
                        AbstractC65774c cVar2 = cVar;
                        if (cVar2 != null) {
                            cVar2.mo88635a(ApiHandler.API_CALLBACK_EXCEPTION, e);
                        }
                    }
                }
            }, true, iAppContext);
        } else if (cVar != null) {
            cVar.mo88635a(ApiHandler.API_CALLBACK_EXCEPTION, new Exception());
        }
    }
}
