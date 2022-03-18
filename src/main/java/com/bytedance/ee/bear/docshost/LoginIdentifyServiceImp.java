package com.bytedance.ee.bear.docshost;

import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.docshost.LoginIdentifyService;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J$\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R&\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/docshost/LoginIdentifyServiceImp;", "Lcom/bytedance/ee/bear/docshost/LoginIdentifyService;", "()V", "mConfig", "Ljava/util/HashMap;", "", "", "Lcom/bytedance/ee/bear/docshost/LoginIdentifyService$LoginIdentify;", "", "mLoginIdentify", "get", "T", "featureKey", "(Ljava/lang/String;)Ljava/lang/Object;", "initAFeature", "", "initFeatures", "initRemoveOrgFeature", "put", "map", "", "updateLoginIdentify", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "Companion", "FeatureKey", "docs-host-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.docshost.e */
public final class LoginIdentifyServiceImp implements LoginIdentifyService {

    /* renamed from: a */
    public static final String f15828a = f15828a;

    /* renamed from: b */
    public static final Companion f15829b = new Companion(null);

    /* renamed from: c */
    private LoginIdentifyService.LoginIdentify f15830c;

    /* renamed from: d */
    private final HashMap<String, Map<LoginIdentifyService.LoginIdentify, Object>> f15831d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/docshost/LoginIdentifyServiceImp$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getInstance", "Lcom/bytedance/ee/bear/docshost/LoginIdentifyService;", "docs-host-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.docshost.e$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo22267a() {
            return LoginIdentifyServiceImp.f15828a;
        }

        /* renamed from: b */
        public final LoginIdentifyService mo22268b() {
            return new LoginIdentifyServiceImp(null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/docshost/LoginIdentifyServiceImp$FeatureKey;", "", "()V", FeatureKey.f15835b, "", "getA", "()Ljava/lang/String;", "docs-host-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.docshost.e$b */
    public static final class FeatureKey {

        /* renamed from: a */
        public static final FeatureKey f15834a = new FeatureKey();

        /* renamed from: b */
        private static final String f15835b = f15835b;

        private FeatureKey() {
        }

        /* renamed from: a */
        public final String mo22269a() {
            return f15835b;
        }
    }

    /* renamed from: a */
    private final void m22615a() {
        m22617c();
        m22616b();
    }

    private LoginIdentifyServiceImp() {
        this.f15830c = LoginIdentifyService.LoginIdentify.single_LarkDocs;
        this.f15831d = new HashMap<>();
        m22615a();
        mo22264a(((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f());
        al d = C4511g.m18594d();
        Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
        ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16396a(d.mo17372v()).mo238001b(new Consumer<Boolean>(this) {
            /* class com.bytedance.ee.bear.docshost.LoginIdentifyServiceImp.C55871 */

            /* renamed from: a */
            final /* synthetic */ LoginIdentifyServiceImp f15832a;

            {
                this.f15832a = r1;
            }

            /* renamed from: a */
            public final void accept(Boolean bool) {
                LoginIdentifyServiceImp eVar = this.f15832a;
                String a = LoginIdentifyServiceImp.f15829b.mo22267a();
                C13479a.m54764b(a, "accept: register success: " + bool);
                eVar.mo22264a(((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f());
            }
        }, C55882.f15833a);
        ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16399a(new LoginIdentifyServiceImp$3(this));
    }

    /* renamed from: b */
    private final void m22616b() {
        this.f15831d.put("REMOVE_ORG", MapsKt.mapOf(TuplesKt.to(LoginIdentifyService.LoginIdentify.single_LarkDocs, true), TuplesKt.to(LoginIdentifyService.LoginIdentify.single_Lark, true), TuplesKt.to(LoginIdentifyService.LoginIdentify.Suite_single_LarkDocs, true), TuplesKt.to(LoginIdentifyService.LoginIdentify.Suite_single_Lark, true), TuplesKt.to(LoginIdentifyService.LoginIdentify.Suite_enterprise_LarkDocs, false), TuplesKt.to(LoginIdentifyService.LoginIdentify.Suite_enterprise_Lark, false)));
    }

    /* renamed from: c */
    private final void m22617c() {
        this.f15831d.put(FeatureKey.f15834a.mo22269a(), MapsKt.mapOf(TuplesKt.to(LoginIdentifyService.LoginIdentify.single_LarkDocs, true), TuplesKt.to(LoginIdentifyService.LoginIdentify.single_Lark, true), TuplesKt.to(LoginIdentifyService.LoginIdentify.Suite_single_LarkDocs, false), TuplesKt.to(LoginIdentifyService.LoginIdentify.Suite_single_Lark, false), TuplesKt.to(LoginIdentifyService.LoginIdentify.Suite_enterprise_LarkDocs, true), TuplesKt.to(LoginIdentifyService.LoginIdentify.Suite_enterprise_Lark, true)));
    }

    public /* synthetic */ LoginIdentifyServiceImp(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.bytedance.ee.bear.docshost.LoginIdentifyService
    /* renamed from: a */
    public <T> T mo22256a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "featureKey");
        Map<LoginIdentifyService.LoginIdentify, Object> map = this.f15831d.get(str);
        T t = map != null ? (T) map.get(this.f15830c) : null;
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    /* renamed from: a */
    public final void mo22264a(AccountService.Account account) {
        LoginIdentifyService.LoginIdentify loginIdentify;
        if (account != null && account.mo19677a() && account.f14602s != null) {
            al d = C4511g.m18594d();
            Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
            int E = d.mo17344E();
            if (E == 1) {
                String str = account.f14602s;
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 48) {
                        if (hashCode == 50 && str.equals("2")) {
                            boolean z = account.f14601r;
                            if (z) {
                                loginIdentify = LoginIdentifyService.LoginIdentify.single_Lark;
                            } else if (!z) {
                                loginIdentify = LoginIdentifyService.LoginIdentify.Suite_single_Lark;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else if (str.equals("0")) {
                        loginIdentify = LoginIdentifyService.LoginIdentify.Suite_enterprise_Lark;
                    }
                }
                loginIdentify = LoginIdentifyService.LoginIdentify.Suite_enterprise_Lark;
            } else if (E != 2) {
                loginIdentify = LoginIdentifyService.LoginIdentify.single_LarkDocs;
            } else {
                String str2 = account.f14602s;
                if (str2 != null) {
                    int hashCode2 = str2.hashCode();
                    if (hashCode2 != 48) {
                        if (hashCode2 == 50 && str2.equals("2")) {
                            boolean z2 = account.f14601r;
                            if (z2) {
                                loginIdentify = LoginIdentifyService.LoginIdentify.single_LarkDocs;
                            } else if (!z2) {
                                loginIdentify = LoginIdentifyService.LoginIdentify.Suite_single_LarkDocs;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else if (str2.equals("0")) {
                        loginIdentify = LoginIdentifyService.LoginIdentify.Suite_enterprise_LarkDocs;
                    }
                }
                loginIdentify = LoginIdentifyService.LoginIdentify.single_LarkDocs;
            }
            this.f15830c = loginIdentify;
            String str3 = f15828a;
            C13479a.m54764b(str3, "updateLoginIdentify   tenantTag: " + account.f14602s + "    isSingleproduct: " + account.f14601r + "    mLoginIdentify: " + this.f15830c);
        }
    }
}
