package com.ss.android.lark.platform.af;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.lark.biz.core.api.AbstractC29560g;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.larkconfig.userconfig.C41227e;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.userprotocol.C57712a;
import com.ss.android.lark.userprotocol.p2901a.AbstractC57713a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.widget.richtext.RichText;

/* renamed from: com.ss.android.lark.platform.af.b */
public class C51684b {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.af.b$a */
    public static class C51688a {

        /* renamed from: a */
        public static final AbstractC57713a f128568a = C51684b.m200450a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C57712a m200451a() {
        return new C57712a(C51688a.f128568a);
    }

    /* renamed from: a */
    public static AbstractC57713a m200450a(final Context context) {
        return new AbstractC57713a() {
            /* class com.ss.android.lark.platform.af.C51684b.C516851 */

            @Override // com.ss.android.lark.userprotocol.p2901a.AbstractC57713a
            /* renamed from: a */
            public AbstractC57713a.AbstractC57714a mo177757a() {
                return new AbstractC57713a.AbstractC57714a() {
                    /* class com.ss.android.lark.platform.af.C51684b.C516851.C516861 */

                    @Override // com.ss.android.lark.userprotocol.p2901a.AbstractC57713a.AbstractC57714a
                    /* renamed from: a */
                    public void mo177761a(Context context) {
                        m200456a("help-user-agreement");
                    }

                    @Override // com.ss.android.lark.userprotocol.p2901a.AbstractC57713a.AbstractC57714a
                    /* renamed from: b */
                    public void mo177763b(Context context) {
                        m200456a("help-private-policy");
                    }

                    /* renamed from: a */
                    private void m200456a(final String str) {
                        C29550b d = C41227e.m163488a().mo148583d();
                        if (d == null) {
                            C41227e.m163488a().mo148577a(new AbstractC29560g() {
                                /* class com.ss.android.lark.platform.af.C51684b.C516851.C516861.C516871 */

                                @Override // com.ss.android.lark.biz.core.api.AbstractC29560g
                                public void notifyCacheUpdated(C29550b bVar) {
                                    C41227e.m163488a().mo148581b(this);
                                    C516861 r0 = C516861.this;
                                    r0.mo177762a(context, bVar, str);
                                }
                            });
                        }
                        if (d != null) {
                            mo177762a(context, d, str);
                        }
                    }

                    /* renamed from: a */
                    public void mo177762a(Context context, C29550b bVar, String str) {
                        if (bVar == null) {
                            Log.w("UserProtocolModuleP", "openConfigLink failed with empty config " + str);
                            return;
                        }
                        String a = bVar.mo105624a(str);
                        if (TextUtils.isEmpty(a)) {
                            Log.w("UserProtocolModuleP", "openConfigLink failed with empty link " + str);
                            return;
                        }
                        C516851.this.mo177759a(context, a);
                    }
                };
            }

            @Override // com.ss.android.lark.userprotocol.p2901a.AbstractC57713a
            /* renamed from: a */
            public RichText mo177758a(com.bytedance.lark.pb.basic.v1.RichText richText) {
                return C36083a.m141486a().getIMDependency().mo132806a(richText);
            }

            /* renamed from: a */
            public void mo177759a(Context context, String str) {
                BrowserModuleProvider.m200667a().mo106843a(context, str, 0);
            }

            @Override // com.ss.android.lark.userprotocol.p2901a.AbstractC57713a
            /* renamed from: b */
            public void mo177760b(Context context, String str) {
                BrowserModuleProvider.m200667a().mo106844a(context, str, UrlParams.m108857a().mo105523a(), C36083a.m141486a().getCCMDependency().mo132717c());
            }
        };
    }
}
