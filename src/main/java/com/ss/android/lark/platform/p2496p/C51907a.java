package com.ss.android.lark.platform.p2496p;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AbstractC29562i;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.ar;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1764b.C36093a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.C48442a;
import com.ss.android.lark.notification.dto.C48444c;
import com.ss.android.lark.notification.dto.DriveNotificationSetting;
import com.ss.android.lark.notification.dto.NotificationSettingItem;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48566a;
import com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48567b;
import com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48568c;
import com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48569d;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p1382b.p1384b.AbstractC29417b;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.passport.signinsdk_api.entity.NotifySettings;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49399l;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.platform.ae.C51677a;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.offlinepush.OfflineMessageAck;
import com.ss.android.lark.platform.p2496p.C51907a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dto.C54122b;
import com.ss.android.lark.setting.dto.C54124e;
import com.ss.android.lark.setting.dto.NotificationDetail;
import com.ss.android.lark.setting.dto.NotificationSetting;
import com.ss.android.lark.setting.dto.NotificationSettingV2;
import com.ss.android.lark.setting.dto.NotificationSettingWrapper;
import com.ss.android.lark.setting.service.AbstractC54601a;
import com.ss.android.lark.setting.service.AbstractC54602b;
import com.ss.android.lark.setting.service.AbstractC54603d;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.platform.p.a */
public class C51907a {

    /* renamed from: a */
    private static volatile C48398a f128921a;

    /* renamed from: com.ss.android.lark.platform.p.a$a */
    public static class C51930a {

        /* renamed from: a */
        public static final AbstractC48407a f128979a = C51907a.m201315a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C48398a m201314a() {
        if (f128921a == null) {
            synchronized (C51907a.class) {
                if (f128921a == null) {
                    f128921a = new C48398a(C51930a.f128979a);
                }
            }
        }
        return f128921a;
    }

    /* renamed from: a */
    public static AbstractC48407a m201315a(final Context context) {
        return new AbstractC48407a() {
            /* class com.ss.android.lark.platform.p2496p.C51907a.C519081 */

            /* renamed from: a */
            public final Map<AbstractC48566a, AbstractC29562i> f128922a = new ConcurrentHashMap();

            /* renamed from: b */
            public final Map<AbstractC48568c, C54115c.AbstractC54119b> f128923b = new ConcurrentHashMap();

            /* renamed from: c */
            public final Map<AbstractC48569d, C54115c.AbstractC54121d> f128924c = new ConcurrentHashMap();

            /* renamed from: d */
            public final Map<AbstractC48567b, C54115c.AbstractC54118a> f128925d = new ConcurrentHashMap();

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: a */
            public Context mo169335a() {
                return context;
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: l */
            public AbstractC48407a.AbstractC48428p mo169349l() {
                return $$Lambda$a$1$K31vszZdoI6_AQVO7Cpgdc7pfag.INSTANCE;
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: b */
            public AbstractC48407a.AbstractC48408a mo169339b() {
                return new AbstractC48407a.AbstractC48408a() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.C519091 */

                    /* renamed from: b */
                    private final Map<AbstractC48407a.AbstractC48408a.AbstractC48409a, AbstractC29417b.AbstractC29418a> f128928b = new ConcurrentHashMap();

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48408a
                    /* renamed from: a */
                    public boolean mo169358a() {
                        return C29410a.m108289c().mo104288b();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48408a
                    /* renamed from: a */
                    public void mo169357a(final AbstractC48407a.AbstractC48408a.AbstractC48409a aVar) {
                        if (aVar != null) {
                            C519101 r0 = new AbstractC29417b.AbstractC29418a() {
                                /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.C519091.C519101 */

                                @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b.AbstractC29418a
                                public void OnAppStateChanged(boolean z) {
                                    aVar.mo169359a(z);
                                }
                            };
                            this.f128928b.put(aVar, r0);
                            C29410a.m108289c().mo104284a(r0);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: c */
            public AbstractC48407a.AbstractC48425m mo169340c() {
                return new AbstractC48407a.AbstractC48425m() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.C519299 */

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48425m
                    /* renamed from: a */
                    public Bundle mo169397a(Bundle bundle) {
                        bundle.putInt("open_fragment_id", 4100);
                        return bundle;
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48425m
                    /* renamed from: b */
                    public Bundle mo169398b(Bundle bundle) {
                        bundle.putInt("open_fragment_id", 4098);
                        return bundle;
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48425m
                    /* renamed from: a */
                    public Intent mo169395a(Context context, Bundle bundle, int i) {
                        return C36149a.m142162a().mo157098b().mo105696a(context, bundle, i);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48425m
                    /* renamed from: a */
                    public Intent mo169396a(Context context, String str, Bundle bundle) {
                        return C36149a.m142162a().mo157098b().mo105698a(context, str, bundle);
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: d */
            public AbstractC48407a.AbstractC48427o mo169341d() {
                return new AbstractC48407a.AbstractC48427o() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass10 */

                    /* renamed from: a */
                    final AbstractC54603d f128931a = SettingModuleProvider.f129183h.mo178263a().mo185219e();

                    /* renamed from: b */
                    final AbstractC54601a f128932b = SettingModuleProvider.f129183h.mo178263a().mo185212b();

                    /* renamed from: d */
                    private final AbstractC54602b f128934d = SettingModuleProvider.f129183h.mo178263a().mo185216c();

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: a */
                    public boolean mo169411a(boolean z) {
                        return SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186524b(z);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: a */
                    public boolean mo169410a() {
                        return SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186527e();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: a */
                    public void mo169408a(String str, NotificationSettingItem notificationSettingItem) {
                        SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186517a(str, m201346a(notificationSettingItem));
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: a */
                    public void mo169409a(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
                        this.f128934d.mo186519a(z, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: a */
                    public void mo169407a(final AbstractC48569d dVar) {
                        C519144 r0 = new C54115c.AbstractC54121d() {
                            /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass10.C519144 */

                            @Override // com.ss.android.lark.setting.C54115c.AbstractC54121d
                            /* renamed from: a */
                            public void mo178095a(C54124e eVar) {
                                if (dVar != null) {
                                    dVar.mo169650a(new C48444c(eVar.f134008a, eVar.f134009b, eVar.f134010c));
                                }
                            }
                        };
                        C519081.this.f128924c.put(dVar, r0);
                        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186550a(r0);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: f */
                    public boolean mo169425f() {
                        return this.f128931a.mo186571d();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: h */
                    public boolean mo169427h() {
                        return this.f128931a.mo186574g();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: i */
                    public boolean mo169428i() {
                        return this.f128931a.mo186575h();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: d */
                    public boolean mo169423d() {
                        return SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186523b();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: e */
                    public boolean mo169424e() {
                        if (this.f128931a.mo186566c() == BadgeStyle.STRONG_REMIND) {
                            return true;
                        }
                        return false;
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: j */
                    public String mo169429j() {
                        return SettingModuleProvider.f129183h.mo178263a().mo185228n();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: c */
                    public boolean mo169421c() {
                        return SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186525c();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: g */
                    public C48444c mo169426g() {
                        C54124e f = this.f128931a.mo186573f();
                        if (f == null) {
                            return null;
                        }
                        return new C48444c(f.f134008a, f.f134009b, f.f134010c);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: b */
                    public boolean mo169418b() {
                        return SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186520a();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: a */
                    public void mo169402a(IGetDataCallback<Boolean> iGetDataCallback) {
                        this.f128934d.mo186515a(iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: b */
                    public void mo169412b(final IGetDataCallback<NotificationSettingV2> iGetDataCallback) {
                        this.f128931a.mo186556b(new IGetDataCallback<com.ss.android.lark.setting.dto.NotificationSettingV2>() {
                            /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass10.C519111 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(com.ss.android.lark.setting.dto.NotificationSettingV2 notificationSettingV2) {
                                iGetDataCallback.onSuccess(C51907a.m201317a(notificationSettingV2));
                            }
                        });
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: c */
                    public void mo169419c(final IGetDataCallback<Boolean> iGetDataCallback) {
                        this.f128931a.mo186567c(new IGetDataCallback<Boolean>() {
                            /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass10.C519155 */

                            /* renamed from: a */
                            public void onSuccess(Boolean bool) {
                                iGetDataCallback.onSuccess(bool);
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }
                        });
                    }

                    /* renamed from: a */
                    private NotificationSettingItem m201345a(NotificationDetail notificationDetail) {
                        if (notificationDetail == null) {
                            return null;
                        }
                        NotificationSettingItem notificationSettingItem = new NotificationSettingItem();
                        notificationSettingItem.setNotificationOn(notificationDetail.isNotificationOn());
                        notificationSettingItem.setSoundOn(notificationDetail.isSoundOn());
                        notificationSettingItem.setVibrateOn(notificationDetail.isVibrateOn());
                        return notificationSettingItem;
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: b */
                    public void mo169413b(AbstractC48566a aVar) {
                        AbstractC29562i remove = C519081.this.f128922a.remove(aVar);
                        if (remove != null) {
                            SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186559b(remove);
                        }
                    }

                    /* renamed from: a */
                    private NotificationDetail m201346a(NotificationSettingItem notificationSettingItem) {
                        if (notificationSettingItem == null) {
                            return null;
                        }
                        NotificationDetail notificationDetail = new NotificationDetail();
                        notificationDetail.setNotificationOn(notificationSettingItem.isNotificationOn());
                        notificationDetail.setSoundOn(notificationSettingItem.isSoundOn());
                        notificationDetail.setVibrateOn(notificationSettingItem.isVibrateOn());
                        return notificationDetail;
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: b */
                    public void mo169414b(AbstractC48567b bVar) {
                        C54115c.AbstractC54118a remove = C519081.this.f128925d.remove(bVar);
                        if (remove != null) {
                            SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186561b(remove);
                        }
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: a */
                    public NotificationSettingItem mo169400a(String str) {
                        return m201345a(SettingModuleProvider.f129183h.mo178263a().mo185216c().mo186514a(str));
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: b */
                    public void mo169415b(AbstractC48568c cVar) {
                        C54115c.AbstractC54119b remove = C519081.this.f128923b.remove(cVar);
                        if (remove != null) {
                            SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186562b(remove);
                        }
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: b */
                    public void mo169416b(AbstractC48569d dVar) {
                        C54115c.AbstractC54121d remove = C519081.this.f128924c.remove(dVar);
                        if (remove != null) {
                            SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186563b(remove);
                        }
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: a */
                    public void mo169404a(final AbstractC48566a aVar) {
                        C519122 r0 = new AbstractC29562i() {
                            /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass10.C519122 */

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29562i
                            /* renamed from: a */
                            public void mo105758a(BadgeStyle badgeStyle) {
                                boolean z;
                                AbstractC48566a aVar = aVar;
                                if (aVar != null) {
                                    if (badgeStyle == BadgeStyle.STRONG_REMIND) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    aVar.mo169647a(z);
                                }
                            }
                        };
                        C519081.this.f128922a.put(aVar, r0);
                        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186546a(r0);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: a */
                    public void mo169405a(final AbstractC48567b bVar) {
                        C519166 r0 = new C54115c.AbstractC54118a() {
                            /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass10.C519166 */

                            @Override // com.ss.android.lark.setting.C54115c.AbstractC54118a
                            /* renamed from: a */
                            public void mo178097a(boolean z) {
                                AbstractC48567b bVar = bVar;
                                if (bVar != null) {
                                    bVar.mo169648a(z);
                                }
                            }
                        };
                        C519081.this.f128925d.put(bVar, r0);
                        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186548a(r0);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: a */
                    public void mo169406a(final AbstractC48568c cVar) {
                        C519133 r0 = new C54115c.AbstractC54119b() {
                            /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass10.C519133 */

                            @Override // com.ss.android.lark.setting.C54115c.AbstractC54119b
                            /* renamed from: a */
                            public void mo178094a(NotificationSettingWrapper notificationSettingWrapper) {
                                AbstractC48568c cVar = cVar;
                                if (cVar != null) {
                                    cVar.mo169649a(new C48442a(C51907a.m201317a(notificationSettingWrapper.getNotificationSettingV2())));
                                }
                            }
                        };
                        C519081.this.f128923b.put(cVar, r0);
                        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186549a(r0);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: a */
                    public void mo169401a(long j, IGetDataCallback<Boolean> iGetDataCallback) {
                        this.f128931a.mo186539a(j, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: c */
                    public void mo169420c(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
                        this.f128931a.mo186553a(z, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: d */
                    public void mo169422d(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
                        this.f128931a.mo186565b(z, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: a */
                    public void mo169403a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback) {
                        this.f128931a.mo186551a(C51907a.m201318a(notificationSettingV2), iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48427o
                    /* renamed from: b */
                    public void mo169417b(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
                        BadgeStyle badgeStyle;
                        AbstractC54603d dVar = this.f128931a;
                        if (z) {
                            badgeStyle = BadgeStyle.STRONG_REMIND;
                        } else {
                            badgeStyle = BadgeStyle.WEAK_REMIND;
                        }
                        dVar.mo186541a(badgeStyle, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: e */
            public AbstractC48407a.AbstractC48429q mo169342e() {
                return new AbstractC48407a.AbstractC48429q() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass11 */

                    /* renamed from: b */
                    private final Map<AbstractC48407a.AbstractC48429q.AbstractC48430a, C54115c.AbstractC54119b> f128948b = new ConcurrentHashMap();

                    /* renamed from: c */
                    private final Map<AbstractC48407a.AbstractC48429q.AbstractC48431b, ar> f128949c = new ConcurrentHashMap();

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48429q
                    /* renamed from: a */
                    public boolean mo169434a() {
                        return SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186574g();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48429q
                    /* renamed from: a */
                    public void mo169431a(final IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
                        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186540a(new IGetDataCallback<NotificationSetting>() {
                            /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass11.C519171 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(NotificationSetting notificationSetting) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback == null) {
                                    return;
                                }
                                if (notificationSetting == null) {
                                    iGetDataCallback.onError(new ErrorResult("empty data"));
                                    return;
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("setting_type", Integer.valueOf(notificationSetting.settingType));
                                hashMap.put("specific_type", Integer.valueOf(notificationSetting.specificType));
                                iGetDataCallback.onSuccess(hashMap);
                            }
                        });
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48429q
                    /* renamed from: a */
                    public void mo169432a(final AbstractC48407a.AbstractC48429q.AbstractC48430a aVar) {
                        if (aVar != null) {
                            C519182 r0 = new C54115c.AbstractC54119b() {
                                /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass11.C519182 */

                                @Override // com.ss.android.lark.setting.C54115c.AbstractC54119b
                                /* renamed from: a */
                                public void mo178094a(NotificationSettingWrapper notificationSettingWrapper) {
                                    if (notificationSettingWrapper.getNotificationSetting() == null) {
                                        Log.m165383e("NotificationModuleProvider", "onPushNotificationSetting failed: settingWrapper.getNotificationSetting() is null");
                                        return;
                                    }
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("setting_type", Integer.valueOf(notificationSettingWrapper.getNotificationSetting().settingType));
                                    hashMap.put("specific_type", Integer.valueOf(notificationSettingWrapper.getNotificationSetting().specificType));
                                    aVar.mo169435a(hashMap);
                                }
                            };
                            this.f128948b.put(aVar, r0);
                            SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186549a(r0);
                        }
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48429q
                    /* renamed from: a */
                    public void mo169433a(final AbstractC48407a.AbstractC48429q.AbstractC48431b bVar) {
                        if (bVar != null) {
                            C519193 r0 = new ar() {
                                /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass11.C519193 */

                                @Override // com.ss.android.lark.biz.core.api.ar
                                /* renamed from: a */
                                public void mo105603a(boolean z) {
                                    bVar.mo169436a(z);
                                }
                            };
                            this.f128949c.put(bVar, r0);
                            SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186545a(r0);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: f */
            public AbstractC48407a.AbstractC48414f mo169343f() {
                return new AbstractC48407a.AbstractC48414f() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass12 */

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48414f
                    /* renamed from: a */
                    public String mo169370a() {
                        return "key_thread_id";
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48414f
                    /* renamed from: b */
                    public String mo169372b() {
                        return "key_message_position";
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48414f
                    /* renamed from: a */
                    public Bundle mo169367a(Bundle bundle) {
                        bundle.putBoolean("switch_to_inbox", true);
                        bundle.putInt("open_fragment_id", 4098);
                        return bundle;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m201390a(AbstractC48407a.AbstractC48412d dVar, Bundle bundle) {
                        if (dVar != null) {
                            dVar.inject(bundle);
                        }
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: b */
                    public static /* synthetic */ void m201391b(AbstractC48407a.AbstractC48412d dVar, Bundle bundle) {
                        if (dVar != null) {
                            dVar.inject(bundle);
                        }
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48414f
                    /* renamed from: a */
                    public Bundle mo169368a(String str, int i, AbstractC48407a.AbstractC48412d dVar) {
                        ChatBundle.C29590a c = ChatBundle.m109259a().mo105927a(str).mo105933c("notification");
                        if (i != -1) {
                            c.mo105920a(i).mo105932b(true);
                        } else {
                            c.mo105932b(false);
                        }
                        return c.mo105929a().mo105916a(new ChatBundle.AbstractC29591b() {
                            /* class com.ss.android.lark.platform.p2496p.$$Lambda$a$1$12$SghqPbJmQ85ln7pTLxFxTq5SOFo */

                            @Override // com.ss.android.lark.biz.im.api.ChatBundle.AbstractC29591b
                            public final void inject(Bundle bundle) {
                                C51907a.C519081.AnonymousClass12.m201390a(AbstractC48407a.AbstractC48412d.this, bundle);
                            }
                        });
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48414f
                    /* renamed from: a */
                    public void mo169371a(Bundle bundle, String str, int i) {
                        bundle.putBoolean("switch_to_inbox", true);
                        bundle.putString("key_thread_id", str);
                        bundle.putInt("key_message_position", i);
                        if (i == -1) {
                            bundle.putInt("open_fragment_id", 4098);
                        } else {
                            bundle.putInt("open_fragment_id", 4100);
                        }
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48414f
                    /* renamed from: a */
                    public Bundle mo169369a(String str, boolean z, String str2, String str3, AbstractC48407a.AbstractC48412d dVar) {
                        ChatBundle.C29590a a = ChatBundle.m109259a();
                        if (!TextUtils.isEmpty(str)) {
                            a.mo105927a(str);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            a.mo105937e(str2);
                        }
                        return a.mo105932b(z).mo105933c(str3).mo105929a().mo105916a(new ChatBundle.AbstractC29591b() {
                            /* class com.ss.android.lark.platform.p2496p.$$Lambda$a$1$12$Uajp1psqx2WLnQjWhK23hrrIE */

                            @Override // com.ss.android.lark.biz.im.api.ChatBundle.AbstractC29591b
                            public final void inject(Bundle bundle) {
                                C51907a.C519081.AnonymousClass12.m201391b(AbstractC48407a.AbstractC48412d.this, bundle);
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: g */
            public AbstractC48407a.AbstractC48421j mo169344g() {
                return new AbstractC48407a.AbstractC48421j() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass13 */

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48421j
                    /* renamed from: a */
                    public String mo169388a() {
                        return "switch_to_inbox";
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48421j
                    /* renamed from: b */
                    public String mo169389b() {
                        return C36083a.m141486a().getIMDependency().mo132944i();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48421j
                    /* renamed from: a */
                    public Bundle mo169387a(Bundle bundle) {
                        bundle.putBoolean("switch_to_inbox", true);
                        return bundle;
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: h */
            public AbstractC48407a.AbstractC48422k mo169345h() {
                return new AbstractC48407a.AbstractC48422k() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass14 */

                    /* renamed from: b */
                    private final Map<AbstractC48407a.AbstractC48422k.AbstractC48423a, AbstractC49379a> f128959b = new ConcurrentHashMap();

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48422k
                    /* renamed from: a */
                    public String mo169390a() {
                        return C36083a.m141486a().getPassportDependency().mo133085d();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48422k
                    /* renamed from: b */
                    public boolean mo169392b() {
                        return C36083a.m141486a().getPassportDependency().mo133094m().mo172428i();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48422k
                    /* renamed from: a */
                    public void mo169391a(AbstractC48407a.AbstractC48422k.AbstractC48423a aVar) {
                        if (aVar != null) {
                            $$Lambda$a$1$14$6kuPiFQQLdHXTq3ZRSSawhDsc8 r0 = new AbstractC49379a() {
                                /* class com.ss.android.lark.platform.p2496p.$$Lambda$a$1$14$6kuPiFQQLdHXTq3ZRSSawhDsc8 */

                                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                                /* renamed from: a */
                                public /* synthetic */ void mo102549a(C49380b bVar) {
                                    AbstractC49379a.CC.$default$a(this, bVar);
                                }

                                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                                /* renamed from: a */
                                public /* synthetic */ void mo102550a(C49381c cVar) {
                                    AbstractC49379a.CC.$default$a(this, cVar);
                                }

                                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                                public final void onUserSwitchSuccess(C49382d dVar) {
                                    C51907a.C519081.AnonymousClass14.m201401a(AbstractC48407a.AbstractC48422k.AbstractC48423a.this, dVar);
                                }
                            };
                            this.f128959b.put(aVar, r0);
                            C36083a.m141486a().getPassportDependency().mo133064a(r0);
                        }
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m201401a(AbstractC48407a.AbstractC48422k.AbstractC48423a aVar, C49382d dVar) {
                        aVar.mo169393a(dVar.f123937c.getUserId());
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: i */
            public AbstractC48407a.AbstractC48419h mo169346i() {
                return new AbstractC48407a.AbstractC48419h() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass15 */

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48419h
                    /* renamed from: a */
                    public Intent mo169384a(String str) {
                        return C36083a.m141486a().getCCMDependency().mo132720d(str);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48419h
                    /* renamed from: a */
                    public Intent mo169385a(String str, String str2) {
                        return C36083a.m141486a().getCCMDependency().mo132699a(str, str2);
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: j */
            public AbstractC48407a.AbstractC48426n mo169347j() {
                return new AbstractC48407a.AbstractC48426n() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.AnonymousClass16 */

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48426n
                    /* renamed from: a */
                    public Intent mo169399a(String str, String str2, String str3, int i) {
                        return C36083a.m141486a().getOpenPlatformDependency().mo133004a(str, str2, str3, i);
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: k */
            public AbstractC48407a.AbstractC48413e mo169348k() {
                return new AbstractC48407a.AbstractC48413e() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.C519202 */

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48413e
                    /* renamed from: a */
                    public Intent mo169366a(String str) {
                        return C36083a.m141486a().getCalendarDependency().mo132749c(str);
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: m */
            public AbstractC48407a.AbstractC48415g mo169350m() {
                return new AbstractC48407a.AbstractC48415g() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.C519213 */

                    /* renamed from: b */
                    private final IDeviceManager f128964b = C36083a.m141486a().getPassportDependency().mo133098q();

                    /* renamed from: c */
                    private final IDeviceService f128965c = C36083a.m141486a().getPassportDependency().mo133097p();

                    /* renamed from: d */
                    private final Map<AbstractC48407a.AbstractC48415g.AbstractC48418c, AbstractC49400m> f128966d = new ConcurrentHashMap();

                    /* renamed from: e */
                    private final Map<AbstractC48407a.AbstractC48415g.AbstractC48417b, AbstractC49399l> f128967e = new ConcurrentHashMap();

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48415g
                    /* renamed from: c */
                    public boolean mo169381c() {
                        return this.f128964b.mo171041i();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48415g
                    /* renamed from: b */
                    public boolean mo169380b() {
                        return this.f128964b.mo171040h();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48415g
                    /* renamed from: a */
                    public AbstractC48407a.AbstractC48415g.C48416a mo169373a() {
                        NotifySettings syncPullDeviceNotifySetting = C36083a.m141486a().getPassportDependency().mo133097p().syncPullDeviceNotifySetting();
                        if (syncPullDeviceNotifySetting == null) {
                            return new AbstractC48407a.AbstractC48415g.C48416a(false, true);
                        }
                        return new AbstractC48407a.AbstractC48415g.C48416a(syncPullDeviceNotifySetting.isDisableMobileNotify(), syncPullDeviceNotifySetting.isStillNotifyAt());
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48415g
                    /* renamed from: a */
                    public void mo169376a(boolean z) {
                        this.f128964b.mo171031b(z);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48415g
                    /* renamed from: b */
                    public void mo169378b(boolean z) {
                        this.f128964b.mo171035c(z);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48415g
                    /* renamed from: a */
                    public void mo169374a(final AbstractC48407a.AbstractC48415g.AbstractC48417b bVar) {
                        if (bVar != null) {
                            C519232 r0 = new AbstractC49399l() {
                                /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.C519213.C519232 */

                                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49399l
                                /* renamed from: a */
                                public void mo143847a(boolean z) {
                                    bVar.mo169382a(z);
                                }
                            };
                            this.f128967e.put(bVar, r0);
                            C36083a.m141486a().getPassportDependency().mo133065a(r0);
                        }
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48415g
                    /* renamed from: a */
                    public void mo169375a(final AbstractC48407a.AbstractC48415g.AbstractC48418c cVar) {
                        if (cVar != null) {
                            C519221 r0 = new AbstractC49400m() {
                                /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.C519213.C519221 */

                                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m
                                /* renamed from: a */
                                public void mo133520a(DevicesStatus.DeviceStatus deviceStatus) {
                                    cVar.mo169383a();
                                }
                            };
                            this.f128966d.put(cVar, r0);
                            C36083a.m141486a().getPassportDependency().mo133066a(r0);
                        }
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48415g
                    /* renamed from: a */
                    public void mo169377a(boolean z, IGetDataCallback<String> iGetDataCallback) {
                        this.f128965c.putDeviceNotifySetting(z, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48415g
                    /* renamed from: b */
                    public void mo169379b(boolean z, IGetDataCallback<String> iGetDataCallback) {
                        this.f128965c.putDeviceAtNotifySetting(z, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: n */
            public AbstractC48407a.AbstractC48424l mo169351n() {
                return new AbstractC48407a.AbstractC48424l() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.C519244 */

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48424l
                    /* renamed from: a */
                    public Intent mo169394a(String str) {
                        return C36083a.m141486a().getMailDependency().mo132966a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: o */
            public AbstractC48407a.AbstractC48420i mo169352o() {
                return new AbstractC48407a.AbstractC48420i() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.C519255 */

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48420i
                    /* renamed from: a */
                    public boolean mo169386a(String str) {
                        return C37239a.m146648b().mo136951a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: p */
            public AbstractC48407a.AbstractC48411c mo169353p() {
                return new AbstractC48407a.AbstractC48411c() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.C519266 */

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48411c
                    /* renamed from: a */
                    public void mo169363a(Context context, String str) {
                        mo169364a(context, str, false);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48411c
                    /* renamed from: a */
                    public void mo169364a(Context context, String str, boolean z) {
                        if (!z) {
                            BrowserModuleProvider.m200667a().mo106842a(context, str);
                        } else {
                            BrowserModuleProvider.m200667a().mo106843a(context, str, 0);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: s */
            public AbstractC48407a.AbstractC48410b mo169356s() {
                return new AbstractC48407a.AbstractC48410b() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.C519288 */

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48410b
                    /* renamed from: a */
                    public int mo169360a() {
                        return C36093a.m141506a().mo104301c();
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48410b
                    /* renamed from: a */
                    public void mo169361a(Notification notification, int i) {
                        C36093a.m141506a().mo104296a(notification, i);
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48410b
                    /* renamed from: a */
                    public void mo169362a(Context context, int i) {
                        C36093a.m141506a().mo104298a(context, i);
                    }
                };
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: r */
            public boolean mo169355r() {
                boolean a = C37239a.m146648b().mo136951a("lark.switch.tenant.offline.enable");
                Log.m165388i("isSwitchTenantOfflineEnable = " + a);
                return a;
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: q */
            public void mo169354q() {
                ArrayList<AbstractNotification> arrayList = new ArrayList();
                arrayList.addAll(C36083a.m141486a().getIMDependency().mo132794P());
                arrayList.addAll(C36099a.m141515a().mo130141j());
                arrayList.addAll(C51907a.m201314a().mo169327h());
                C36083a.m141486a().getOpenFeatureDependency().mo133003c(arrayList);
                for (AbstractNotification abstractNotification : arrayList) {
                    C51907a.m201314a().mo169323d().mo169513a(abstractNotification.mo31112a(), abstractNotification);
                }
                C36083a.m141486a().getIMDependency().mo132954o();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ Intent m201320b(String str) {
                return C36083a.m141486a().getTodoDependency().mo133121a(str);
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: a */
            public String mo169336a(String str) {
                C29550b f = C51677a.m200443a().mo148569c().mo148565f();
                if (f == null) {
                    return null;
                }
                return f.mo105624a(str);
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: a */
            public void mo169337a(Context context, OfflineNotice offlineNotice) {
                new OfflineMessageAck().mo178068a(context, offlineNotice);
            }

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a
            /* renamed from: a */
            public void mo169338a(String str, final IGetDataCallback<Boolean> iGetDataCallback) {
                C36083a.m141486a().getPassportDependency().mo133070a(str, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.platform.p2496p.C51907a.C519081.C519277 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        iGetDataCallback.onSuccess(bool);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }
                });
            }
        };
    }

    /* renamed from: a */
    private static DriveNotificationSetting m201316a(C54122b bVar) {
        return new DriveNotificationSetting(bVar.mo185285a());
    }

    /* renamed from: a */
    public static com.ss.android.lark.setting.dto.NotificationSettingV2 m201318a(NotificationSettingV2 notificationSettingV2) {
        com.ss.android.lark.setting.dto.NotificationSettingV2 notificationSettingV22 = new com.ss.android.lark.setting.dto.NotificationSettingV2();
        notificationSettingV22.setDriveNotificationSetting(m201319a(notificationSettingV2.getDriveNotificationSetting()));
        notificationSettingV22.setMentionOpen(notificationSettingV2.isMentionOpen());
        notificationSettingV22.setBuzzOpen(notificationSettingV2.isBuzzOpen());
        notificationSettingV22.setUserSingleChatOpen(notificationSettingV2.isUserSingleChatOpen());
        notificationSettingV22.setChatMsgState(NotificationSettingV2.ChatMsgNotificationState.forNumber(notificationSettingV2.getChatMsgState().getNumber()));
        notificationSettingV22.setMentionAllOpen(notificationSettingV2.isMentionAllOpen());
        return notificationSettingV22;
    }

    /* renamed from: a */
    public static com.ss.android.lark.notification.dto.NotificationSettingV2 m201317a(com.ss.android.lark.setting.dto.NotificationSettingV2 notificationSettingV2) {
        com.ss.android.lark.notification.dto.NotificationSettingV2 notificationSettingV22 = new com.ss.android.lark.notification.dto.NotificationSettingV2();
        if (notificationSettingV2 == null) {
            Log.m165383e("NotificationModuleProvider", "parseToMineNotificationSettingV2 failed: settingV2 is null");
            return notificationSettingV22;
        }
        notificationSettingV22.setBuzzOpen(notificationSettingV2.isBuzzOpen());
        notificationSettingV22.setMentionOpen(notificationSettingV2.isMentionOpen());
        notificationSettingV22.setUserSingleChatOpen(notificationSettingV2.isUserSingleChatOpen());
        notificationSettingV22.setMentionAllOpen(notificationSettingV2.isMentionAllOpen());
        notificationSettingV22.setChatMsgState(NotificationSettingV2.MineChatMsgSettingState.forNumber(notificationSettingV2.getChatMsgState().getNumber()));
        notificationSettingV22.setDriveNotificationSetting(m201316a(notificationSettingV2.getDriveNotificationSetting()));
        return notificationSettingV22;
    }

    /* renamed from: a */
    private static C54122b m201319a(DriveNotificationSetting driveNotificationSetting) {
        return new C54122b(driveNotificationSetting.isEnableDriveNotification());
    }
}
