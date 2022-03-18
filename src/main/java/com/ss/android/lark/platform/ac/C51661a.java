package com.ss.android.lark.platform.ac;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29579a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29580b;
import com.ss.android.lark.biz.im.api.C29613e;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.platform.ae.C51677a;
import com.ss.android.lark.platform.af.C51684b;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.p2496p.C51907a;
import com.ss.android.lark.platform.p2498r.C51947a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.platform.statistics.perf.C51997c;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.ug.p2874e.C57480a;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.p2893a.AbstractC57608a;
import com.ss.android.lark.upgrade.p2895c.AbstractC57623a;
import com.ss.android.lark.upgrade.p2895c.AbstractC57624b;
import com.ss.android.lark.utils.LarkContext;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.platform.ac.a */
public class C51661a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.ac.a$a */
    public static class C51675a {

        /* renamed from: a */
        public static final AbstractC57608a f128559a = C51661a.m200387a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C57607a m200388a() {
        return new C57607a(C51675a.f128559a);
    }

    /* renamed from: a */
    public static AbstractC57608a m200387a(final Context context) {
        return new AbstractC57608a() {
            /* class com.ss.android.lark.platform.ac.C51661a.C516621 */

            /* renamed from: a */
            public final Map<AbstractC57624b, AbstractC29580b> f128536a = new ConcurrentHashMap();

            /* renamed from: b */
            public final Map<AbstractC57623a, AbstractC29579a> f128537b = new ConcurrentHashMap();

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: a */
            public Context mo177704a() {
                return context;
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: h */
            public void mo177714h() {
                C51997c.m201743a("key_doc", ChatBundle.SourceType.PROFILE);
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: i */
            public AbstractC57608a.AbstractC57618j mo177715i() {
                return new AbstractC57608a.AbstractC57618j() {
                    /* class com.ss.android.lark.platform.ac.C51661a.C516621.C516631 */

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57618j
                    /* renamed from: a */
                    public void mo177727a(final AbstractC57623a aVar) {
                        C516652 r0 = new AbstractC29579a() {
                            /* class com.ss.android.lark.platform.ac.C51661a.C516621.C516631.C516652 */

                            @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29579a
                            public void onPushDownloadProgress(String str, int i, long j, long j2) {
                                aVar.mo195613a(str, i, j, j2);
                            }
                        };
                        C516621.this.f128537b.put(aVar, r0);
                        C51947a.m201491a().mo181473a(r0);
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57618j
                    /* renamed from: a */
                    public void mo177728a(final AbstractC57624b bVar) {
                        C516641 r0 = new AbstractC29580b() {
                            /* class com.ss.android.lark.platform.ac.C51661a.C516621.C516631.C516641 */

                            @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29580b
                            public void onPushDownloadStatus(String str, boolean z) {
                                bVar.mo195614a(str, z);
                            }
                        };
                        C516621.this.f128536a.put(bVar, r0);
                        C51947a.m201491a().mo181474a(r0);
                    }
                };
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: j */
            public AbstractC57608a.AbstractC57611c mo177716j() {
                return new AbstractC57608a.AbstractC57611c() {
                    /* class com.ss.android.lark.platform.ac.C51661a.C516621.C516684 */

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57611c
                    /* renamed from: a */
                    public String mo177733a() {
                        return C36083a.m141486a().getIMDependency().mo132808a(C36083a.m141486a().getIMDependency().mo132961v(), ChatterNameDisplayRule.NAME);
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57611c
                    /* renamed from: a */
                    public void mo177734a(final File file, final IGetDataCallback<Void> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132858a(C36083a.m141486a().getPassportDependency().mo133085d(), new IGetDataCallback<Chat>() {
                            /* class com.ss.android.lark.platform.ac.C51661a.C516621.C516684.C516691 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(Chat chat) {
                                C516684.this.mo177735a(chat.getId(), file);
                                iGetDataCallback.onSuccess(null);
                            }
                        });
                    }

                    /* renamed from: a */
                    public void mo177735a(String str, File file) {
                        C36083a.m141486a().getIMDependency().mo132842a(((C29613e.C29615a) ((C29613e.C29615a) C29613e.m109504a().mo125332j(str)).mo125328c(0)).mo106702a(file.getPath()).mo106704b(file.getName()).mo106703a());
                    }
                };
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: k */
            public AbstractC57608a.AbstractC57619k mo177717k() {
                return new AbstractC57608a.AbstractC57619k() {
                    /* class com.ss.android.lark.platform.ac.C51661a.C516621.C516705 */

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57619k
                    /* renamed from: a */
                    public boolean mo177737a(Context context) {
                        return C51684b.m200451a().mo195870a(context);
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57619k
                    /* renamed from: b */
                    public boolean mo177738b(Context context) {
                        return C51684b.m200451a().mo195871b(context);
                    }
                };
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: l */
            public AbstractC57608a.AbstractC57610b mo177718l() {
                return new AbstractC57608a.AbstractC57610b() {
                    /* class com.ss.android.lark.platform.ac.C51661a.C516621.C516716 */

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57610b
                    /* renamed from: a */
                    public void mo177739a(Context context, String str, boolean z) {
                        if (!z) {
                            BrowserModuleProvider.m200667a().mo106842a(context, str);
                        } else {
                            BrowserModuleProvider.m200667a().mo106843a(context, str, 0);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: m */
            public AbstractC57608a.AbstractC57609a mo177719m() {
                return new AbstractC57608a.AbstractC57609a() {
                    /* class com.ss.android.lark.platform.ac.C51661a.C516621.C516727 */

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57609a
                    /* renamed from: a */
                    public String mo177740a() {
                        C29550b f = C51677a.m200443a().mo148569c().mo148565f();
                        if (f == null) {
                            return null;
                        }
                        return f.mo105624a("help-release-log");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57609a
                    /* renamed from: b */
                    public String mo177741b() {
                        C29550b f = C51677a.m200443a().mo148569c().mo148565f();
                        if (f == null) {
                            return null;
                        }
                        return f.mo105624a("help-best-practice");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57609a
                    /* renamed from: c */
                    public String mo177742c() {
                        C29550b f = C51677a.m200443a().mo148569c().mo148565f();
                        if (f == null) {
                            return null;
                        }
                        return f.mo105624a("help-key-feature");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57609a
                    /* renamed from: d */
                    public String mo177743d() {
                        C29550b f = C51677a.m200443a().mo148569c().mo148565f();
                        if (f == null) {
                            return null;
                        }
                        return f.mo105624a("security-white-paper");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57609a
                    /* renamed from: e */
                    public String mo177744e() {
                        C29550b f = C51677a.m200443a().mo148569c().mo148565f();
                        if (f == null) {
                            return null;
                        }
                        return f.mo105624a("application-permission-description");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57609a
                    /* renamed from: f */
                    public String mo177745f() {
                        C29550b f = C51677a.m200443a().mo148569c().mo148565f();
                        if (f == null) {
                            return null;
                        }
                        return f.mo105624a("third-party-sdk");
                    }
                };
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: o */
            public AbstractC57608a.AbstractC57613e mo177721o() {
                return new AbstractC57608a.AbstractC57613e() {
                    /* class com.ss.android.lark.platform.ac.C51661a.C516621.C516749 */

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57613e
                    /* renamed from: a */
                    public boolean mo177747a() {
                        return C37239a.m146648b().mo136951a("suite_best_practice");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57613e
                    /* renamed from: b */
                    public boolean mo177748b() {
                        return C37239a.m146648b().mo136951a("suite_special_function");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57613e
                    /* renamed from: c */
                    public boolean mo177749c() {
                        return C37239a.m146648b().mo136951a("suite_about_whitepaper");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57613e
                    /* renamed from: d */
                    public boolean mo177750d() {
                        return C37239a.m146648b().mo136951a("suite_about_app_permission");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57613e
                    /* renamed from: e */
                    public boolean mo177751e() {
                        return C37239a.m146648b().mo136951a("suite_about_thirdparty_sdk");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57613e
                    /* renamed from: f */
                    public boolean mo177752f() {
                        return C37239a.m146648b().mo136951a("suite_about_softwareupdate");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57613e
                    /* renamed from: g */
                    public boolean mo177753g() {
                        return C37239a.m146648b().mo136951a("suite_about_releasenote");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57613e
                    /* renamed from: h */
                    public boolean mo177754h() {
                        return C37239a.m146648b().mo136951a("suite_software_user_agreement");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57613e
                    /* renamed from: i */
                    public boolean mo177755i() {
                        return C37239a.m146648b().mo136951a("suite_software_privacy_agreement");
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57613e
                    /* renamed from: j */
                    public boolean mo177756j() {
                        return !C37239a.m146648b().mo136951a("suite_powered_by");
                    }
                };
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: p */
            public AbstractC57608a.AbstractC57612d mo177722p() {
                return new AbstractC57608a.AbstractC57612d() {
                    /* class com.ss.android.lark.platform.ac.C51661a.C516621.AnonymousClass10 */

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57612d
                    /* renamed from: a */
                    public String mo177729a() {
                        return C36083a.m141486a().getPassportDependency().mo133090i();
                    }
                };
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: q */
            public AbstractC57608a.AbstractC57617i mo177723q() {
                return new AbstractC57608a.AbstractC57617i() {
                    /* class com.ss.android.lark.platform.ac.C51661a.C516621.AnonymousClass11 */

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57617i
                    /* renamed from: a */
                    public String mo177730a() {
                        Profile a = AbstractC36232b.m142703a().mo178819a().mo180502a();
                        if (a == null || TextUtils.isEmpty(a.getEmail())) {
                            return "";
                        }
                        return a.getEmail();
                    }
                };
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: r */
            public AbstractC57608a.AbstractC57614f mo177724r() {
                return new AbstractC57608a.AbstractC57614f() {
                    /* class com.ss.android.lark.platform.ac.C51661a.C516621.C516662 */

                    /* renamed from: b */
                    private final AbstractC29551a f128547b = C36235a.m142710a().mo148281b();
                };
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: s */
            public AbstractC57608a.AbstractC57615g mo177725s() {
                return new AbstractC57608a.AbstractC57615g() {
                    /* class com.ss.android.lark.platform.ac.C51661a.C516621.C516673 */

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57615g
                    /* renamed from: b */
                    public void mo177732b(String str) {
                        C57480a.m223132a().mo141824c(str);
                    }

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57615g
                    /* renamed from: a */
                    public boolean mo177731a(String str) {
                        return C57480a.m223132a().mo141828e(str);
                    }
                };
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: c */
            public String mo177709c() {
                return C36083a.m141486a().getPassportDependency().mo133090i();
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: d */
            public String mo177710d() {
                return C36083a.m141486a().getPassportDependency().mo133085d();
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: e */
            public String mo177711e() {
                return C36083a.m141486a().getPassportDependency().mo133088g();
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: f */
            public void mo177712f() {
                C51907a.m201314a().mo169320b().mo169511a();
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: g */
            public String mo177713g() {
                return C36083a.m141486a().getEnvDependency().mo132695c();
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: t */
            public String mo177726t() {
                return SettingModuleProvider.f129183h.mo178263a().mo185228n();
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: b */
            public boolean mo177708b() {
                return C36083a.m141487b().isUsPackage();
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: n */
            public AbstractC57608a.AbstractC57616h mo177720n() {
                final AbstractC49389b m = C36083a.m141486a().getPassportDependency().mo133094m();
                return new AbstractC57608a.AbstractC57616h() {
                    /* class com.ss.android.lark.platform.ac.C51661a.C516621.C516738 */

                    @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a.AbstractC57616h
                    /* renamed from: a */
                    public String mo177746a() {
                        return m.mo172422c();
                    }
                };
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: b */
            public void mo177707b(String str) {
                C51947a.m201491a().mo181472a().mo105872a(str);
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: a */
            public boolean mo177706a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            @Override // com.ss.android.lark.upgrade.p2893a.AbstractC57608a
            /* renamed from: a */
            public void mo177705a(String str, String str2, String str3) {
                C51947a.m201491a().mo181472a().mo105874a(str, str2, str3);
            }
        };
    }
}
