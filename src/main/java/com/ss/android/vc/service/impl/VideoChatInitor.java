package com.ss.android.vc.service.impl;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.exception.crash.C37008a;
import com.ss.android.lark.widget.span.C59176n;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vc.common.lifecycle.C60790a;
import com.ss.android.vc.common.lifecycle.C60793b;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3080d.C60724i;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.AbstractC60880ae;
import com.ss.android.vc.dependency.AbstractC60885b;
import com.ss.android.vc.dependency.AbstractC60894j;
import com.ss.android.vc.dependency.AbstractC60897m;
import com.ss.android.vc.dependency.AbstractC60912x;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.livestream.C60943c;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.meeting.module.follow.common.FollowConfig;
import com.ss.android.vc.meeting.module.guides.NewGuideDelegate;
import com.ss.android.vc.meeting.module.livestream.C62075j;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.C62428g;
import com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil;
import com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder;
import com.ss.android.vc.meeting.module.receiver.VcScreenMonitor;
import com.ss.android.vc.meeting.module.tab.p3168a.C63219b;
import com.ss.android.vc.meeting.utils.C63495h;
import com.ss.android.vc.meeting.utils.SpanUtil;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.RtcRenderOptimizeService;
import com.ss.android.vc.net.service.SingleInstanceSettingsService;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VCSettingsService;
import com.ss.android.vc.net.service.VCSyncGetService;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.p3091e.C60917a;
import com.ss.android.vc.p3094g.C61000a;
import com.ss.android.vc.service.C63635e;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vc.service.impl.SubListeners;
import com.ss.android.vc.statistics.event.C63761k;
import com.ss.android.vc.statistics.monitor.C63780b;
import com.ss.android.vc.trace.C63784a;
import com.ss.android.vcxp.C63791b;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import java.util.Locale;

@XClass(isStatic = true, runOnProcess = XProcess.VC)
public class VideoChatInitor {
    /* renamed from: g */
    private void m249583g() {
        C62075j.m242548a((AbstractC63598b<C60943c>) null);
    }

    /* renamed from: h */
    private void m249584h() {
        BaseActivity.f151859a = VideoChatModuleDependency.getLanguageDependency().getLanguageSetting();
    }

    /* renamed from: a */
    public void mo220167a() {
        VideoChatModuleDependency.getChatDependency().getLoginChatter(new XIGetDataCallback<OpenChatter>() {
            /* class com.ss.android.vc.service.impl.VideoChatInitor.C636678 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            @XMethod
            public void onError(ErrorResult errorResult) {
                C60700b.m235864f("VideoChatInitor", "[getChatterById2]", "onError: " + errorResult.toString());
            }

            @XMethod
            public void onSuccess(OpenChatter openChatter) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("success, chatterId = ");
                if (openChatter == null) {
                    str = "empty";
                } else {
                    str = openChatter.getId();
                }
                sb.append(str);
                C60700b.m235851b("VideoChatInitor", "[getChatterById]", sb.toString());
                VideoChatInitor.this.mo220170a(openChatter);
            }
        });
    }

    /* renamed from: b */
    public void mo220171b() {
        VideoChatModuleDependency.getChatDependency().getLoginChatter(new XIGetDataCallback<OpenChatter>() {
            /* class com.ss.android.vc.service.impl.VideoChatInitor.C636689 */

            @XMethod
            public void onSuccess(OpenChatter openChatter) {
                C60700b.m235851b("VideoChatInitor", "[getLoginChatter]", "success");
                VideoChatInitor.this.mo220170a(openChatter);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            @XMethod
            public void onError(ErrorResult errorResult) {
                C60700b.m235864f("VideoChatInitor", "[getLoginChatter2]", "onError: " + errorResult.toString());
            }
        });
    }

    /* renamed from: c */
    public void mo220172c() {
        C60700b.m235851b("VideoChatInitor", "[checkStateRecovery]", "checkStateRecovery");
        RegisterClientInfoExecuter.m249564a();
        RegisterClientInfoExecuter.m249570b();
    }

    /* renamed from: e */
    private void m249581e() {
        C60700b.m235851b("VideoChatInitor", "[registerPush]", "registerPush");
        VideoChatPush.m249004a().registerPush();
        C63635e.m249513a().mo220151b();
    }

    /* renamed from: f */
    private void m249582f() {
        VideoChatModuleDependency.getLifeCycleDependency().addActivityObserver(VCAppLifeCycle.m236253a());
        VideoChatModuleDependency.getLifeCycleDependency().mo196412a($$Lambda$VideoChatInitor$sirLVCpxnyzJRzQAT9giQxlWCQA.INSTANCE);
    }

    @XMethod(runOnProcess = XProcess.Main)
    private static void setPhoneNumberPattern() {
        C60700b.m235851b("VideoChatInitor", "[setPhoneNumberPattern]", "setPhoneNumberPattern");
        try {
            C59176n.m229855a(C62428g.m243978a());
        } catch (Exception e) {
            C60700b.m235846a("VideoChatInitor", "setPhoneNumberPattern2", e);
        }
    }

    /* renamed from: d */
    private void m249580d() {
        C60700b.m235851b("VideoChatInitor", "[initListener]", "initListener");
        VideoChatModuleDependency.getWschannelDependency().addConnStateListener(SubListeners.ConnStateListener.m249574a());
        VideoChatModuleDependency.getLoginDependency().registerChangeObserver(SubListeners.AccountChangeListener.m249573a());
        VideoChatModuleDependency.getLoginChangeDependency().addLoginChangeListener(SubListeners.LoginChangeListener.m249576a());
        VideoChatModuleDependency.getLanguageDependency().registerLanguageChangeListener(SubListeners.OnLanguageChangeListener.m249577a());
        VideoChatModuleDependency.getDeviceChangeDependency().registerChangeListener(SubListeners.DeviceIdChangeListener.m249575a());
        VideoChatModule.m235665i().mo208191a(new AbstractC60894j() {
            /* class com.ss.android.vc.service.impl.VideoChatInitor.C636613 */

            @Override // com.ss.android.vc.dependency.AbstractC60894j
            public void onConnStateChanged(boolean z) {
                C60700b.m235851b("VideoChatInitor", "[onConnStateChanged]", "isConnected = " + z);
                if (z) {
                    RegisterClientInfoExecuter.m249570b();
                    VCSettingsService.getSettings("follow_degradation_config", new AbstractC63598b<String>() {
                        /* class com.ss.android.vc.service.impl.VideoChatInitor.C636613.C636621 */

                        @Override // com.ss.android.vc.net.request.AbstractC63598b
                        public void onError(C63602e eVar) {
                        }

                        /* renamed from: a */
                        public void onSuccess(String str) {
                            FollowConfig.m241447c();
                        }
                    });
                    VCSyncGetService.initSyncGetCache();
                }
            }
        });
        VideoChatModule.m235665i().mo208190a(new AbstractC60885b() {
            /* class com.ss.android.vc.service.impl.VideoChatInitor.C636634 */

            @Override // com.ss.android.vc.dependency.AbstractC60885b
            public void onAccountChange(String str) {
                C60700b.m235851b("VideoChatInitor", "[onAccountChange]", "account change: userId = " + str);
                VideoChatInitor.this.mo220167a();
                VCSyncGetService.reInitViewDeviceSetting();
                LabsUtils.m242900a(true);
                C63219b.m247574a().mo218810a(str);
                VideoChatAdminSettings.m239402a();
                VideoChatAdminSettings.m239407b();
                SingleInstanceSettingsService.getSettings();
            }
        });
        VideoChatModule.m235665i().mo208193a(new AbstractC60912x.AbstractC60913a() {
            /* class com.ss.android.vc.service.impl.VideoChatInitor.C636645 */

            @Override // com.ss.android.vc.dependency.AbstractC60912x.AbstractC60913a
            public void onLoginStatusChangedEvent(int i) {
                C60700b.m235851b("VideoChatInitor", "[onLoginStatusChange]", "loginType = " + i);
                if (i == 1) {
                    VideoChatInitor.this.mo220171b();
                } else if (i == 2) {
                    VideoChatInitor.this.mo220170a(GuestJoinMeetingUtil.m245484f());
                } else {
                    VideoChatService.m249602d().mo220082b();
                }
            }
        });
        VideoChatModule.m235665i().mo208189a(new AbstractC60880ae() {
            /* class com.ss.android.vc.service.impl.VideoChatInitor.C636656 */

            @Override // com.ss.android.vc.dependency.AbstractC60880ae
            public void onLanguageChange(Locale locale, Locale locale2) {
                VcBizService.initForFeedback();
                SpanUtil.f160471a.mo219674c();
                BaseActivity.f151859a = locale2;
            }
        });
        VideoChatModule.m235665i().mo208192a(new AbstractC60897m.AbstractC60898a() {
            /* class com.ss.android.vc.service.impl.VideoChatInitor.C636667 */

            @Override // com.ss.android.vc.dependency.AbstractC60897m.AbstractC60898a
            public void onDeviceIdChange(String str) {
                C60700b.m235851b("VideoChatInitor", "[onDeviceIdChange]", "deviceId = " + str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m249579a(boolean z) {
        FollowConfig.m241447c();
        m249583g();
        if (!z) {
            SpanUtil.f160471a.mo219671a();
            VcBizService.initForFeedback();
        }
    }

    /* renamed from: a */
    public void mo220168a(Context context) {
        mo220169a(context, false);
    }

    /* renamed from: a */
    public void mo220170a(OpenChatter openChatter) {
        VideoChatUserService.assembleCurrentUser(openChatter);
        RegisterClientInfoExecuter.m249570b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m249578a(C60793b bVar, C60793b bVar2) {
        C60790a.m236265a().onAppLifecycleChanged(bVar, bVar2);
    }

    /* renamed from: a */
    public void mo220169a(Context context, boolean z) {
        boolean z2;
        if (C63791b.m250468b() || C26252ad.m94993b(context)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C60700b.m235851b("VideoChatInitor", "[init]", "BEGIN shouldNotInit = " + z2);
        if (!z2) {
            long currentTimeMillis = System.currentTimeMillis();
            C63784a.m250427a();
            C63784a.m250428a("init");
            ar.m236696a(context);
            m249581e();
            VideoChatModuleDependency.getLoginDependency().registerAccountInterceptor(AccountLogoutInterceptor.m249558b());
            m249580d();
            if (!z) {
                AudioReceiverHolder.f158409a.mo217324a(context);
            }
            if (!z) {
                VideoChatManager.m249444a().mo220135m();
            }
            if (!z) {
                C37008a.m146044a().mo136535a(new C61000a(context));
            }
            m249582f();
            VcScreenMonitor.m246178a().mo217318a(context);
            VideoChatUserService.assembleCurrentUser(VideoChatModule.getDependency().getChatDependency().getLoginChatter());
            C60724i.m235924a().mo208317a(context);
            C63495h.m248838a(context);
            C63780b.m250407a();
            UserInfoService.init();
            m249584h();
            setPhoneNumberPattern();
            VideoChatAdminSettings.m239402a();
            VideoChatAdminSettings.m239407b();
            VideoChatAdminSettings.m239405a((AbstractC63598b<AdminSettings>) null);
            VCSettingsService.getSettings("follow_degradation_config", new AbstractC63598b<String>() {
                /* class com.ss.android.vc.service.impl.VideoChatInitor.C636591 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    FollowConfig.m241447c();
                }
            });
            SingleInstanceSettingsService.getSettings();
            VCSyncGetService.initSyncGetCache();
            NewGuideDelegate.m240525a();
            C60917a.m236767a(context);
            if (!z) {
                C63761k.m250296a();
            }
            VCSettingsService.getSettings("rtc_config_android", new AbstractC63598b<String>() {
                /* class com.ss.android.vc.service.impl.VideoChatInitor.C636602 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    RtcRenderOptimizeService.getInstance().updateConfig(str);
                }
            });
            C60735ab.m236018e(new Runnable(z) {
                /* class com.ss.android.vc.service.impl.$$Lambda$VideoChatInitor$OtPguEG2aouH1hsuHP3QUF8K7vI */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    VideoChatInitor.this.m249579a((VideoChatInitor) this.f$1);
                }
            });
            C63784a.m250429b("init");
            C60700b.m235851b("VideoChatInitor", "[init2]", "END, time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
