package com.ss.android.vc.dependency;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dto.C60916a;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vcxp.C63791b;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

@XClass(isStatic = true, runOnProcess = XProcess.VC)
public class VideoChatModuleDependency {

    /* renamed from: a */
    static volatile IVideoChatDependency f152392a = null;

    /* renamed from: b */
    private static String f152393b = "VideoChatModuleDependency";

    /* renamed from: c */
    private static IVideoChatDependency f152394c = new IVideoChatDependency() {
        /* class com.ss.android.vc.dependency.VideoChatModuleDependency.C608721 */

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public IVideoChatDependency get() {
            return this;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60886c getAppConfigurationDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60888d getAppEnvDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public int getAppId() {
            return 0;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60889e getAppUpgradeDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60890f getBrowserDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60891g getCalendarDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60892h getChatDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60893i getChatterNameDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60895k getContactDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60896l getCustomerServiceDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60897m getDeviceChangeDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public String getDeviceId() {
            return "";
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60899n getDocsDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60900o getDynamicDomainDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60901p getFeatureGatingDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public List<C60916a> getFeedFromCacheForChatInbox() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60902q getGuideDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC25990b getHttpClient() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60904r getHttpDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60905s getImageDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60906t getLanguageDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60907u getLarkAppDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60908v getLifecycleDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60911w getLittleAppDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60912x getLoginChangeDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60914y getLoginDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60915z getMailDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60875aa getMainDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public boolean getMeetingFeatureSwitch() {
            return false;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60876ab getMinutesDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60877ac getMultiTaskDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60879ad getNotificationDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public String getPhotoPickerKeySelectedPhotos() {
            return "";
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public int getPhotoPickerReqCode() {
            return 0;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60881af getPreloadXMLDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public AbstractC60882ag getProfileDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public IReactionDependency getReactionDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public IRichTextDependency getRichTextDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public aj getSettingDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public String getTenantId() {
            return "";
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public ak getUGDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public String getUserId() {
            return "";
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public am getVideoChatConfigDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public Intent getVideoEventInfoIntent(Context context, String str, long j) {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public an getVoIpDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public ao getWatermarkDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public ap getWschannelDependency() {
            return null;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public void goShareVideoMeeting(Context context, String str, String str2) {
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public boolean isBigBUser() {
            return false;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public boolean isNotificationUndisturbed() {
            return false;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public boolean isPhotoPickActivity(Activity activity) {
            return false;
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public void onRtcStats(long j, long j2) {
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public void openPhotoPickerPage(Activity activity) {
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public void showVoIpCallDialog(Context context, OpenChatter openChatter) {
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public void startContactsProfileActivity(Context context, String str, String str2, String str3, ByteviewUser byteviewUser) {
        }

        @Override // com.ss.android.vc.dependency.IVideoChatDependency
        public void startContactsProfileActivityByChatterId(Context context, String str, String str2) {
        }
    };

    /* renamed from: d */
    private static final ConcurrentHashMap<Class, Object> f152395d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static CountDownLatch f152396e = new CountDownLatch(1);

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.dependency.VideoChatModuleDependency$a */
    public interface AbstractC60873a<T> {
        T get();
    }

    @XMethod
    public static void notifyInjected() {
        f152396e.countDown();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static /* synthetic */ ap m236614A() {
        return getDependency().getWschannelDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static /* synthetic */ aj m236615B() {
        return getDependency().getSettingDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static /* synthetic */ an m236616C() {
        return getDependency().getVoIpDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static /* synthetic */ AbstractC60906t m236617D() {
        return getDependency().getLanguageDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ AbstractC60901p m236618E() {
        return getDependency().getFeatureGatingDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static /* synthetic */ AbstractC60902q m236619F() {
        return getDependency().getGuideDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static /* synthetic */ AbstractC60912x m236620G() {
        return getDependency().getLoginChangeDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static /* synthetic */ AbstractC60897m m236621H() {
        return getDependency().getDeviceChangeDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static /* synthetic */ AbstractC60908v m236622I() {
        return getDependency().getLifecycleDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static /* synthetic */ AbstractC60893i m236623J() {
        return getDependency().getChatterNameDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ AbstractC60888d m236624K() {
        return getDependency().getAppEnvDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ AbstractC60892h m236625L() {
        return getDependency().getChatDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static /* synthetic */ AbstractC60899n m236626M() {
        return getDependency().getDocsDependency();
    }

    /* renamed from: a */
    public static void m236628a() {
        try {
            if (f152392a == null) {
                f152396e.await();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static String m236629b() {
        return getDependency().getDeviceId();
    }

    /* renamed from: c */
    public static String m236630c() {
        return getDependency().getUserId();
    }

    /* renamed from: d */
    public static String m236631d() {
        return getDependency().getTenantId();
    }

    /* renamed from: e */
    public static boolean m236632e() {
        return getDependency().isBigBUser();
    }

    /* renamed from: f */
    public static AbstractC60904r m236633f() {
        return (AbstractC60904r) m236627a(AbstractC60904r.class, $$Lambda$VideoChatModuleDependency$s9tbjYDAE49m9wPCNjsAuZiwQhs.INSTANCE);
    }

    /* renamed from: g */
    public static AbstractC60882ag m236634g() {
        return (AbstractC60882ag) m236627a(AbstractC60882ag.class, $$Lambda$VideoChatModuleDependency$9jNn2XavhpNEp9UcFGkE3ip4kxs.INSTANCE);
    }

    @XMethod
    public static AbstractC60886c getAppConfigurationDependency() {
        return (AbstractC60886c) m236627a(AbstractC60886c.class, $$Lambda$VideoChatModuleDependency$wNyytbBkjEJCgP6leNWzQJ4SLmY.INSTANCE);
    }

    @XMethod
    public static AbstractC60888d getAppEnvDependency() {
        return (AbstractC60888d) m236627a(AbstractC60888d.class, $$Lambda$VideoChatModuleDependency$J7aUatYKzB5NJG0viIhqz8vtmg.INSTANCE);
    }

    @XMethod
    public static AbstractC60889e getAppUpgradeDependency() {
        return (AbstractC60889e) m236627a(AbstractC60889e.class, $$Lambda$VideoChatModuleDependency$D4Y3tzlbeYyuiqhyOL1LBlE0yJ0.INSTANCE);
    }

    @XMethod
    public static AbstractC60890f getBrowserDependency() {
        return (AbstractC60890f) m236627a(AbstractC60890f.class, $$Lambda$VideoChatModuleDependency$7PTh7lIoXLbj0mm9bUqPWRRKCI.INSTANCE);
    }

    @XMethod
    public static AbstractC60892h getChatDependency() {
        return (AbstractC60892h) m236627a(AbstractC60892h.class, $$Lambda$VideoChatModuleDependency$te0BPvTxpfpqw1VPiHaKpTdeBf8.INSTANCE);
    }

    @XMethod
    public static AbstractC60893i getChatterNameDependency() {
        return (AbstractC60893i) m236627a(AbstractC60893i.class, $$Lambda$VideoChatModuleDependency$IRhJDpGOprb47a4ibLTHMsHrstE.INSTANCE);
    }

    @XMethod
    public static AbstractC60896l getCustomerServiceDependency() {
        return (AbstractC60896l) m236627a(AbstractC60896l.class, $$Lambda$VideoChatModuleDependency$bcdc9rldAul4aQFmjqwHWLcQjVk.INSTANCE);
    }

    @XMethod
    public static AbstractC60897m getDeviceChangeDependency() {
        return (AbstractC60897m) m236627a(AbstractC60897m.class, $$Lambda$VideoChatModuleDependency$lvvRzhDRlEhIIjeCzeS0bZBAPk0.INSTANCE);
    }

    @XMethod
    public static AbstractC60899n getDocsDependency() {
        return (AbstractC60899n) m236627a(AbstractC60899n.class, $$Lambda$VideoChatModuleDependency$bjhmC4GKuVWCZzB5B31D23AaF4.INSTANCE);
    }

    @XMethod
    public static AbstractC60900o getDynamicDomainDependency() {
        return (AbstractC60900o) m236627a(AbstractC60900o.class, $$Lambda$VideoChatModuleDependency$6RKQ7lLo00LWQsFvkqAd_S8TzQ.INSTANCE);
    }

    @XMethod
    public static AbstractC60901p getFeatureGatingDependency() {
        return (AbstractC60901p) m236627a(AbstractC60901p.class, $$Lambda$VideoChatModuleDependency$8K0ak3SAUFDOx1AqnFZF99lXSSo.INSTANCE);
    }

    @XMethod
    public static AbstractC60902q getGuideDependency() {
        return (AbstractC60902q) m236627a(AbstractC60902q.class, $$Lambda$VideoChatModuleDependency$dQUekhx2J777Zmk53CGRPROOc.INSTANCE);
    }

    @XMethod
    public static AbstractC60905s getImageDependency() {
        return (AbstractC60905s) m236627a(AbstractC60905s.class, $$Lambda$VideoChatModuleDependency$xyw0ITlaERVNSAWjcSmRrSnCp2w.INSTANCE);
    }

    @XMethod
    public static AbstractC60906t getLanguageDependency() {
        return (AbstractC60906t) m236627a(AbstractC60906t.class, $$Lambda$VideoChatModuleDependency$0407yxNzccSrCSPQkYPOZKW1608.INSTANCE);
    }

    @XMethod
    public static AbstractC60907u getLarkAppDependency() {
        return (AbstractC60907u) m236627a(AbstractC60907u.class, $$Lambda$VideoChatModuleDependency$coab_USVyQCxG44Rs19awsVU.INSTANCE);
    }

    @XMethod
    public static AbstractC60908v getLifeCycleDependency() {
        return (AbstractC60908v) m236627a(AbstractC60908v.class, $$Lambda$VideoChatModuleDependency$o4PHZL3Wg4WWxXybHCc55ONMRU.INSTANCE);
    }

    @XMethod
    public static AbstractC60912x getLoginChangeDependency() {
        return (AbstractC60912x) m236627a(AbstractC60912x.class, $$Lambda$VideoChatModuleDependency$0mtsIMvjrx12ke0yXeRjHA_WTU.INSTANCE);
    }

    @XMethod
    public static AbstractC60914y getLoginDependency() {
        return (AbstractC60914y) m236627a(AbstractC60914y.class, $$Lambda$VideoChatModuleDependency$zf0wIimjDd91nhfhIcwTt6mDA4M.INSTANCE);
    }

    @XMethod
    public static AbstractC60875aa getMainDependency() {
        return (AbstractC60875aa) m236627a(AbstractC60875aa.class, $$Lambda$VideoChatModuleDependency$DZAs27iIHYQLX7YUFfIwPbhMd7U.INSTANCE);
    }

    @XMethod
    public static AbstractC60876ab getMinutesDependency() {
        return (AbstractC60876ab) m236627a(AbstractC60876ab.class, $$Lambda$VideoChatModuleDependency$9l_uOl05T4kHpftj9XrH0KKpq3I.INSTANCE);
    }

    @XMethod
    public static AbstractC60877ac getMultiTaskDependency() {
        return (AbstractC60877ac) m236627a(AbstractC60877ac.class, $$Lambda$VideoChatModuleDependency$tfrMx0ZF1E6djLKSPQIzsj4cqbg.INSTANCE);
    }

    @XMethod
    public static AbstractC60879ad getNotificationDependency() {
        return (AbstractC60879ad) m236627a(AbstractC60879ad.class, $$Lambda$VideoChatModuleDependency$H_PpNRw7dbF88YNiOoT3jEt4RI.INSTANCE);
    }

    @XMethod
    public static IReactionDependency getReactionDependency() {
        return (IReactionDependency) m236627a(IReactionDependency.class, $$Lambda$VideoChatModuleDependency$ALktLYTWZdEw_7WQhZNK3eCfv9g.INSTANCE);
    }

    @XMethod
    public static IRichTextDependency getRichTextDependency() {
        return (IRichTextDependency) m236627a(IRichTextDependency.class, $$Lambda$VideoChatModuleDependency$dYeT6ZXFO5vrHBkDwdhLbe5_dMY.INSTANCE);
    }

    @XMethod
    public static aj getSettingDependency() {
        return (aj) m236627a(aj.class, $$Lambda$VideoChatModuleDependency$bzfdSd3idjhyX9_loc166NEW74.INSTANCE);
    }

    @XMethod
    public static ak getUGDependency() {
        return (ak) m236627a(ak.class, $$Lambda$VideoChatModuleDependency$gwc8piYATXpwZU2PoprCokow8Ok.INSTANCE);
    }

    @XMethod
    public static am getVideoChatConfigDependency() {
        return (am) m236627a(am.class, $$Lambda$VideoChatModuleDependency$04TVdDUolr8n_reeFMlu1xkUU5k.INSTANCE);
    }

    @XMethod
    public static an getVoIpDependency() {
        return (an) m236627a(an.class, $$Lambda$VideoChatModuleDependency$ypc7r8sorVi2dhxaeiaiS37ALpM.INSTANCE);
    }

    @XMethod
    public static ao getWatermarkDependency() {
        return (ao) m236627a(ao.class, $$Lambda$VideoChatModuleDependency$58S0te2oMXu9KdDl8jJTaHrsK4.INSTANCE);
    }

    @XMethod
    public static ap getWschannelDependency() {
        return (ap) m236627a(ap.class, $$Lambda$VideoChatModuleDependency$0wTkMbRRI0bN7EIiKKwU8UMUA.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ AbstractC60882ag m236635h() {
        return getDependency().getProfileDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ AbstractC60904r m236636i() {
        return getDependency().getHttpDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ AbstractC60886c m236637j() {
        return getDependency().getAppConfigurationDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ AbstractC60876ab m236638k() {
        return getDependency().getMinutesDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ AbstractC60877ac m236639l() {
        return getDependency().getMultiTaskDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ ak m236640m() {
        return getDependency().getUGDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ am m236641n() {
        return getDependency().getVideoChatConfigDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ AbstractC60875aa m236642o() {
        return getDependency().getMainDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ IReactionDependency m236643p() {
        return getDependency().getReactionDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ IRichTextDependency m236644q() {
        return getDependency().getRichTextDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ AbstractC60907u m236645r() {
        return getDependency().getLarkAppDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ AbstractC60900o m236646s() {
        return getDependency().getDynamicDomainDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ AbstractC60879ad m236647t() {
        return getDependency().getNotificationDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ AbstractC60896l m236648u() {
        return getDependency().getCustomerServiceDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ AbstractC60889e m236649v() {
        return getDependency().getAppUpgradeDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ AbstractC60890f m236650w() {
        return getDependency().getBrowserDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ ao m236651x() {
        return getDependency().getWatermarkDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ AbstractC60905s m236652y() {
        return getDependency().getImageDependency();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static /* synthetic */ AbstractC60914y m236653z() {
        return getDependency().getLoginDependency();
    }

    @XMethod
    public static IVideoChatDependency getDependency() {
        IVideoChatDependency iVideoChatDependency;
        if (C63791b.m250468b()) {
            m236628a();
        }
        if (f152392a == null && (iVideoChatDependency = (IVideoChatDependency) ClaymoreServiceLoader.loadFirstOrNull(IVideoChatDependency.class)) != null) {
            f152392a = iVideoChatDependency.get();
        }
        if (f152392a != null) {
            return f152392a;
        }
        C60700b.m235854c(f152393b, "[getDependency]", "null");
        return f152394c;
    }

    @XMethod
    public static void setDependency(IVideoChatDependency iVideoChatDependency) {
        String str;
        f152392a = iVideoChatDependency;
        String str2 = f152393b;
        StringBuilder sb = new StringBuilder();
        if (f152392a != null) {
            str = " not";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(" null");
        C60700b.m235854c(str2, "[setDependency]", sb.toString());
        notifyInjected();
    }

    @XMethod
    public static void onRtcStats(long j, long j2) {
        if (f152392a != null) {
            f152392a.onRtcStats(j, j2);
        }
    }

    /* renamed from: a */
    public static <T> T m236627a(Class<T> cls, AbstractC60873a<T> aVar) {
        ConcurrentHashMap<Class, Object> concurrentHashMap = f152395d;
        if (!concurrentHashMap.containsKey(cls)) {
            try {
                T t = aVar.get();
                if (t == null) {
                    return null;
                }
                concurrentHashMap.put(cls, t);
            } catch (Exception unused) {
                String str = f152393b;
                C60700b.m235865g(str, "[getIDependency]", "Failed to getIDependency " + cls.getName());
            }
        }
        return (T) f152395d.get(cls);
    }
}
