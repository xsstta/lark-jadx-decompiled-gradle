package com.ss.lark.android.passport.biz.account.migration;

import android.content.SharedPreferences;
import com.larksuite.framework.utils.C26308n;
import com.ss.android.lark.passport.infra.base.p2425b.C49037a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.account.UserInfoKeys;
import java.io.File;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0007J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\b\u0010\u001e\u001a\u00020\u001dH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/migration/SessionUpgradeChecker;", "", "()V", "FILE_NAME_UPGRADED_FLAG", "", "FILE_NAME_UPGRADE_STARTED_FLAG", "passportSP", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPassportSP", "()Landroid/content/SharedPreferences;", "passportSP$delegate", "Lkotlin/Lazy;", "upgradeStartedFlag", "Ljava/io/File;", "getUpgradeStartedFlag", "()Ljava/io/File;", "upgradeStartedFlag$delegate", "upgradedFlag", "getUpgradedFlag", "upgradedFlag$delegate", "generateSPKey", "key", "isLoginBefore52", "", "isNeedUpgrade", "isUpgradeStarted", "isUpgraded", "markUpgradeStart", "", "markUpgraded", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.account.migration.e */
public final class SessionUpgradeChecker {

    /* renamed from: a */
    public static final SessionUpgradeChecker f162576a = new SessionUpgradeChecker();

    /* renamed from: b */
    private static final Lazy f162577b = LazyKt.lazy(C64330b.INSTANCE);

    /* renamed from: c */
    private static final Lazy f162578c = LazyKt.lazy(C64331c.INSTANCE);

    /* renamed from: d */
    private static final Lazy f162579d = LazyKt.lazy(C64329a.INSTANCE);

    /* renamed from: f */
    private final File m252938f() {
        return (File) f162577b.getValue();
    }

    /* renamed from: g */
    private final File m252939g() {
        return (File) f162578c.getValue();
    }

    /* renamed from: h */
    private final SharedPreferences m252940h() {
        return (SharedPreferences) f162579d.getValue();
    }

    private SessionUpgradeChecker() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.e$a */
    static final class C64329a extends Lambda implements Function0<SharedPreferences> {
        public static final C64329a INSTANCE = new C64329a();

        C64329a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return LarkContext.getApplication().getSharedPreferences("siginsdk_pref", 0);
        }
    }

    /* renamed from: b */
    public final boolean mo222855b() {
        return m252938f().exists();
    }

    /* renamed from: c */
    public final boolean mo222856c() {
        return m252939g().exists();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.e$b */
    static final class C64330b extends Lambda implements Function0<File> {
        public static final C64330b INSTANCE = new C64330b();

        C64330b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            return new File(C26308n.m95258d(LarkContext.getApplication()), "passport_new_account_upgrade_started");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.e$c */
    static final class C64331c extends Lambda implements Function0<File> {
        public static final C64331c INSTANCE = new C64331c();

        C64331c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            return new File(C26308n.m95258d(LarkContext.getApplication()), "passport_new_account_upgraded");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m252935a() {
        SessionUpgradeChecker eVar = f162576a;
        if (!eVar.mo222855b() && !eVar.mo222856c()) {
            if (eVar.m252941i()) {
                return true;
            }
            m252937e();
        }
        return false;
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m252936d() {
        Object obj;
        SessionUpgradeChecker eVar = f162576a;
        if (!eVar.m252938f().exists()) {
            try {
                Result.Companion aVar = Result.Companion;
                obj = Result.m271569constructorimpl(Boolean.valueOf(eVar.m252938f().createNewFile()));
            } catch (Throwable th) {
                Result.Companion aVar2 = Result.Companion;
                obj = Result.m271569constructorimpl(C69097g.m265890a(th));
            }
            Throwable r0 = Result.m271572exceptionOrNullimpl(obj);
            if (r0 != null) {
                r0.printStackTrace();
            }
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m252937e() {
        Object obj;
        SessionUpgradeChecker eVar = f162576a;
        if (!eVar.m252939g().exists()) {
            try {
                Result.Companion aVar = Result.Companion;
                obj = Result.m271569constructorimpl(Boolean.valueOf(eVar.m252939g().createNewFile()));
            } catch (Throwable th) {
                Result.Companion aVar2 = Result.Companion;
                obj = Result.m271569constructorimpl(C69097g.m265890a(th));
            }
            Throwable r0 = Result.m271572exceptionOrNullimpl(obj);
            if (r0 != null) {
                r0.printStackTrace();
            }
        }
    }

    /* renamed from: i */
    private final boolean m252941i() {
        boolean z;
        String string = m252940h().getString(m252934a(UserInfoKeys.f162529b.mo171118a()), "");
        if (string == null || StringsKt.isBlank(string)) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* renamed from: a */
    private final String m252934a(String str) {
        return C49037a.m193155a(str);
    }
}
