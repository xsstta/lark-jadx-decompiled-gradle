package com.ss.android.lark.vcintegrator;

import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.vcintegrator.SubDependencies;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.service.IVideoChatService;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vcxp.C63801c;
import com.ss.android.vcxp.annotation.XClass;
import java.util.List;

@XClass(isStatic = true)
public class VideoChatModuleProvider {

    /* renamed from: a */
    private static volatile VideoChatModule f142654a;

    /* renamed from: b */
    private static final Object f142655b = new Object();

    /* renamed from: g */
    public static String m224878g() {
        return "4.5.0.48";
    }

    /* renamed from: c */
    public static void m224874c() {
        VideoChatService.m249602d().dismissLoadingDialog();
    }

    /* renamed from: d */
    public static List<String> m224875d() {
        return VideoChatModule.m235667o();
    }

    /* renamed from: e */
    public static String m224876e() {
        return VideoChatModule.m235661e();
    }

    /* renamed from: f */
    public static IVideoChatService m224877f() {
        m224872a();
        return VideoChatModule.getVideoChatService();
    }

    /* renamed from: i */
    public static IVideoChatDependency m224880i() {
        return VCDependency.getInstance();
    }

    /* renamed from: b */
    public static void m224873b() {
        VideoChatModule.m235659c().init(LarkContext.getApplication(), m224880i());
    }

    public static void doInit() {
        m224872a();
        VideoChatModule.getVideoChatService().asyncCheckAndInit(null);
    }

    public static Object isInit() {
        if (m224877f().mo220080a()) {
            return f142655b;
        }
        return null;
    }

    static {
        if (C26252ad.m94993b(LarkContext.getApplication())) {
            VideoChatModule.m235651a(SubDependencies.FeatureGatingDependency.m224758a());
        }
    }

    /* renamed from: a */
    public static VideoChatModule m224872a() {
        if (f142654a == null) {
            synchronized (VideoChatModuleProvider.class) {
                if (f142654a == null) {
                    m224873b();
                    f142654a = VideoChatModule.m235659c();
                }
            }
        }
        return f142654a;
    }

    /* renamed from: h */
    public static boolean m224879h() {
        if (!C63801c.m250500a(C26252ad.m94994c(LarkContext.getApplication())) || !m224872a().hasMeetingOngoingOnVcVoip()) {
            return false;
        }
        return true;
    }
}
