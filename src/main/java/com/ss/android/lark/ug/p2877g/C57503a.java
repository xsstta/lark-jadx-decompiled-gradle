package com.ss.android.lark.ug.p2877g;

import android.app.Activity;
import android.content.Context;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.dependency.AbstractC36132s;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.magic.C41707a;
import com.ss.android.lark.magic.p2152b.AbstractC41708a;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.platform.larksetting.LarkSettingModuleProvider;
import com.ss.android.lark.platform.network.C51864e;
import com.ss.android.lark.ug.p2874e.C57480a;
import com.ss.android.lark.utils.LarkContext;
import java.util.Locale;

/* renamed from: com.ss.android.lark.ug.g.a */
public class C57503a {

    /* renamed from: a */
    private static volatile C41707a f141686a;

    /* renamed from: a */
    public static C41707a m223196a() {
        if (f141686a == null) {
            synchronized (C41707a.class) {
                if (f141686a == null) {
                    f141686a = new C41707a(m223197a(LarkContext.getApplication()));
                }
            }
        }
        return f141686a;
    }

    /* renamed from: a */
    private static AbstractC41708a m223197a(final Context context) {
        return new AbstractC41708a() {
            /* class com.ss.android.lark.ug.p2877g.C57503a.C575041 */

            /* renamed from: a */
            public String mo195182a(String str) {
                return str == null ? "" : str;
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: g */
            public boolean mo150004g() {
                return false;
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: i */
            public boolean mo150006i() {
                return false;
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: a */
            public Context mo149998a() {
                return context;
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: k */
            public AbstractC25990b mo150008k() {
                return C51864e.m201147a();
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: l */
            public AbstractC41708a.AbstractC41709a mo150009l() {
                return new AbstractC41708a.AbstractC41709a() {
                    /* class com.ss.android.lark.ug.p2877g.C57503a.C575041.C575051 */

                    @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a.AbstractC41709a
                    /* renamed from: a */
                    public boolean mo150011a(String str) {
                        return C37239a.m146648b().mo136951a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: m */
            public AbstractC41708a.AbstractC41710b mo150010m() {
                return new AbstractC41708a.AbstractC41710b() {
                    /* class com.ss.android.lark.ug.p2877g.C57503a.C575041.C575062 */

                    @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a.AbstractC41710b
                    /* renamed from: d */
                    public boolean mo150015d() {
                        return C36083a.m141486a().getPassportDependency().mo133045D();
                    }

                    @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a.AbstractC41710b
                    /* renamed from: a */
                    public String mo150012a() {
                        return C575041.this.mo195182a(C36083a.m141486a().getPassportDependency().mo133085d());
                    }

                    @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a.AbstractC41710b
                    /* renamed from: b */
                    public String mo150013b() {
                        return C575041.this.mo195182a(C36083a.m141486a().getPassportDependency().mo133088g());
                    }

                    @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a.AbstractC41710b
                    /* renamed from: c */
                    public String mo150014c() {
                        return C575041.this.mo195182a(C36083a.m141486a().getPassportDependency().mo133090i());
                    }
                };
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: c */
            public String mo150000c() {
                return mo195182a(LarkSettingModuleProvider.m200903a().mo148452f());
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: e */
            public boolean mo150002e() {
                return C29410a.m108289c().mo104288b();
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: h */
            public boolean mo150005h() {
                return C57480a.m223132a().mo141829f();
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: j */
            public Activity mo150007j() {
                return C29410a.m108289c().mo104289c();
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: d */
            public int mo150001d() {
                return C25653b.m91893a(UIUtils.getColor(mo149998a(), R.color.lkui_N900), 0.1f);
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: f */
            public boolean mo150003f() {
                AbstractC36132s videoConferenceDependency = C36083a.m141486a().getVideoConferenceDependency();
                if (videoConferenceDependency.mo133142b() || videoConferenceDependency.mo133144c()) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.lark.magic.p2152b.AbstractC41708a
            /* renamed from: b */
            public String mo149999b() {
                Locale g = C36235a.m142710a().mo148282c().mo148304g();
                if (g == null) {
                    g = Locale.getDefault();
                }
                return g.getLanguage() + "_" + g.getCountry();
            }
        };
    }
}
