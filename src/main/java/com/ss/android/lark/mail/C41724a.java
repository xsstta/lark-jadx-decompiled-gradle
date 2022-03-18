package com.ss.android.lark.mail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.ee.bear.contract.drive.AbstractC5138b;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.C42050e;
import com.ss.android.lark.mail.impl.entity.DriveFile;
import com.ss.android.lark.mail.impl.entity.DriveFileOperationMask;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.lark.C42717a;
import com.ss.android.lark.mail.impl.lark.C42723b;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.mulprocess.C43213b;
import com.ss.android.lark.mail.impl.network.NetworkChangeListener;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41872d;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43389a;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43390b;
import com.ss.android.lark.mail.impl.utils.C43783o;
import com.ss.android.lark.mail.impl.utils.C43853v;
import com.ss.android.lark.mail.p2157a.AbstractC41740a;
import com.ss.android.lark.mail.p2158b.C41761a;
import com.ss.android.lark.mail.service.MailLauncherService;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44549f;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.utils.ApiUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.a */
public class C41724a {

    /* renamed from: a */
    private final AbstractC41740a.AbstractC41741a.AbstractC41742a f105993a = new AbstractC41740a.AbstractC41741a.AbstractC41742a() {
        /* class com.ss.android.lark.mail.C41724a.C417251 */

        @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41741a.AbstractC41742a
        /* renamed from: a */
        public void mo150110a() {
            C43277a.m171921a().mo154942f();
        }
    };

    /* renamed from: f */
    public static boolean m165680f() {
        return true;
    }

    /* renamed from: b */
    public String mo150099b() {
        return "mail";
    }

    /* renamed from: c */
    public String mo150102c() {
        return "OPEN_MAIL_FROM_NOTICE";
    }

    /* renamed from: e */
    public String mo150105e() {
        return "OPEN_COMPOSE_FROM_EXT_MAILTO";
    }

    /* renamed from: i */
    public boolean mo150106i() {
        return true;
    }

    /* renamed from: m */
    public String mo150109m() {
        return "larkmail.cli.autotranslation";
    }

    /* renamed from: n */
    private AbstractC41849c m165684n() {
        return new AbstractC41849c() {
            /* class com.ss.android.lark.mail.C41724a.C417262 */

            /* renamed from: a */
            AbstractC41849c.AbstractC41855f f105995a;

            /* renamed from: b */
            AbstractC41849c.AbstractC41861l f105996b;

            /* renamed from: c */
            AbstractC41849c.AbstractC41856g f105997c;

            /* renamed from: d */
            AbstractC41849c.AbstractC41865p f105998d;

            /* renamed from: e */
            AbstractC41849c.AbstractC41854e f105999e;

            /* renamed from: f */
            AbstractC41849c.AbstractC41857h f106000f;

            /* renamed from: g */
            AbstractC41849c.AbstractC41858i f106001g;

            /* renamed from: h */
            AbstractC41849c.AbstractC41868s f106002h;

            /* renamed from: i */
            AbstractC41849c.AbstractC41863n f106003i;

            /* renamed from: j */
            AbstractC41849c.AbstractC41864o f106004j;

            /* renamed from: k */
            AbstractC41849c.AbstractC41853d f106005k;

            /* renamed from: l */
            AbstractC41849c.AbstractC41867r f106006l;

            /* renamed from: m */
            AbstractC41849c.AbstractC41851b f106007m;

            /* renamed from: n */
            AbstractC41849c.AbstractC41860k f106008n;

            /* renamed from: o */
            AbstractC41849c.AbstractC41859j f106009o;

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: r */
            public String mo150151r() {
                return "OPEN_COMPOSE_FROM_EXT_MAILTO";
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: a */
            public int mo150120a() {
                return C43213b.f109974a;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: a */
            public boolean mo150131a(String str, List<DriveFile> list, DriveFileOperationMask driveFileOperationMask, HashMap hashMap, AbstractC41849c.AbstractC41850a aVar) {
                return C41724a.m165678a().viewByDrive(str, list, driveFileOperationMask, hashMap, aVar);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: o */
            public boolean mo150148o() {
                return C41724a.m165681g();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: A */
            public AbstractC41849c.AbstractC41858i mo150111A() {
                if (this.f106001g == null) {
                    this.f106001g = new AbstractC41849c.AbstractC41858i() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.AnonymousClass14 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41858i
                        /* renamed from: a */
                        public int mo150173a(String str, String str2) {
                            return C41724a.m165678a().getFileUtilDependency().mo144484a(str, str2);
                        }
                    };
                }
                return this.f106001g;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: B */
            public AbstractC41849c.AbstractC41868s mo150112B() {
                if (this.f106002h == null) {
                    this.f106002h = new AbstractC41849c.AbstractC41868s() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.AnonymousClass15 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41868s
                        /* renamed from: a */
                        public NetworkChangeListener.NetworkLevel mo150174a() {
                            return C41724a.m165678a().getWschannelDependency().mo144485a();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41868s
                        /* renamed from: b */
                        public void mo150176b(NetworkChangeListener networkChangeListener) {
                            C41724a.m165678a().getWschannelDependency().mo144487b(networkChangeListener);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41868s
                        /* renamed from: a */
                        public void mo150175a(NetworkChangeListener networkChangeListener) {
                            C41724a.m165678a().getWschannelDependency().mo144486a(networkChangeListener);
                        }
                    };
                }
                return this.f106002h;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: C */
            public AbstractC41849c.AbstractC41863n mo150113C() {
                if (this.f106003i == null) {
                    this.f106003i = new AbstractC41849c.AbstractC41863n() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.C417322 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41863n
                        /* renamed from: a */
                        public void mo150177a() {
                            C41724a.m165678a().getMainDependency().mo144488a();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41863n
                        /* renamed from: b */
                        public void mo150178b() {
                            C41724a.m165678a().getMainDependency().mo144491c();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41863n
                        /* renamed from: c */
                        public void mo150179c() {
                            C41724a.m165678a().getMainDependency().mo144492d();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41863n
                        /* renamed from: d */
                        public void mo150180d() {
                            C41724a.m165678a().getMainDependency().mo144493e();
                        }
                    };
                }
                return this.f106003i;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: D */
            public AbstractC41849c.AbstractC41864o mo150114D() {
                if (this.f106004j == null) {
                    this.f106004j = new AbstractC41849c.AbstractC41864o() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.C417333 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41864o
                        /* renamed from: a */
                        public void mo150181a(String str, JSONObject jSONObject) {
                            C41724a.m165678a().getMetricsDependency().mo144494a(str, jSONObject);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41864o
                        /* renamed from: c */
                        public void mo150183c(String str, JSONObject jSONObject) {
                            C41724a.m165678a().getMetricsDependency().mo144496c(str, jSONObject);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41864o
                        /* renamed from: b */
                        public void mo150182b(String str, JSONObject jSONObject) {
                            String str2;
                            StringBuilder sb = new StringBuilder();
                            sb.append("reportBusiness, event: ");
                            sb.append(str);
                            sb.append(", parameters: ");
                            if (jSONObject == null) {
                                str2 = "";
                            } else {
                                str2 = jSONObject.toString();
                            }
                            sb.append(str2);
                            Log.m165379d("MailModule", sb.toString());
                            C41724a.m165678a().getMetricsDependency().mo144495b(str, jSONObject);
                        }
                    };
                }
                return this.f106004j;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: E */
            public AbstractC41849c.AbstractC41853d mo150115E() {
                if (this.f106005k == null) {
                    this.f106005k = new AbstractC41849c.AbstractC41853d() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.C417344 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41853d
                        /* renamed from: a */
                        public MailAddress mo150184a(String str) {
                            return C41724a.m165678a().getChatDependency().mo144448b(str);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41853d
                        /* renamed from: b */
                        public void mo150188b(AbstractC41849c.AbstractC41866q qVar) {
                            C41724a.m165678a().getChatDependency().mo144449b(qVar);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41853d
                        /* renamed from: a */
                        public void mo150187a(AbstractC41849c.AbstractC41866q qVar) {
                            C41724a.m165678a().getChatDependency().mo144447a(qVar);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41853d
                        /* renamed from: a */
                        public String mo150185a(String str, int i) {
                            return C41724a.m165678a().getChatDependency().mo144445a(str, i);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41853d
                        /* renamed from: a */
                        public void mo150186a(Context context, String str) {
                            C41724a.m165678a().getChatDependency().mo144446a(context, str);
                        }
                    };
                }
                return this.f106005k;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: F */
            public AbstractC41849c.AbstractC41867r mo150116F() {
                if (this.f106006l == null) {
                    this.f106006l = new AbstractC41849c.AbstractC41867r() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.C417355 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41867r
                        /* renamed from: a */
                        public boolean mo150190a() {
                            return C41724a.m165678a().getSettingDependency().mo144451a();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41867r
                        /* renamed from: b */
                        public boolean mo150192b() {
                            return C41724a.m165678a().getSettingDependency().mo144453b();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41867r
                        /* renamed from: a */
                        public void mo150189a(AbstractC41872d dVar) {
                            C41724a.m165678a().getSettingDependency().mo144450a(dVar);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41867r
                        /* renamed from: b */
                        public void mo150191b(AbstractC41872d dVar) {
                            C41724a.m165678a().getSettingDependency().mo144452b(dVar);
                        }
                    };
                }
                return this.f106006l;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: G */
            public AbstractC41849c.AbstractC41851b mo150117G() {
                if (this.f106007m == null) {
                    this.f106007m = new AbstractC41849c.AbstractC41851b() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.C417366 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41851b
                        /* renamed from: a */
                        public void mo150193a(AbstractC41849c.AbstractC41852c cVar) {
                            C41724a.m165678a().getAppLifecycleDependency().mo144454a(cVar);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41851b
                        /* renamed from: a */
                        public void mo150194a(AbstractC41849c.AbstractC41862m mVar) {
                            C41724a.m165678a().getAppLifecycleDependency().mo144455a(mVar);
                        }
                    };
                }
                return this.f106007m;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: H */
            public AbstractC41849c.AbstractC41860k mo150118H() {
                if (this.f106008n == null) {
                    this.f106008n = new AbstractC41849c.AbstractC41860k() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.C417377 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41860k
                        /* renamed from: a */
                        public void mo150195a(List<String> list) {
                            C41724a.m165678a().getGuideDependency().mo144461a(list);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41860k
                        /* renamed from: b */
                        public boolean mo150198b(String str) {
                            return C41724a.m165678a().getGuideDependency().mo144464b(str);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41860k
                        /* renamed from: a */
                        public boolean mo150196a(String str) {
                            return C41724a.m165678a().getGuideDependency().mo144462a(str);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41860k
                        /* renamed from: a */
                        public boolean mo150197a(String str, C38708a aVar) {
                            return C41724a.m165678a().getGuideDependency().mo144463a(str, aVar);
                        }
                    };
                }
                return this.f106008n;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: I */
            public AbstractC41849c.AbstractC41859j mo150119I() {
                if (this.f106009o == null) {
                    this.f106009o = new AbstractC41849c.AbstractC41859j() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.C417388 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41859j
                        /* renamed from: a */
                        public long mo150199a() {
                            return C41724a.m165678a().getGeckoDependency().mo144456a();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41859j
                        /* renamed from: b */
                        public String mo150200b() {
                            return C41724a.m165678a().getGeckoDependency().mo144457b();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41859j
                        /* renamed from: c */
                        public String mo150201c() {
                            return C41724a.m165678a().getGeckoDependency().mo144458c();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41859j
                        /* renamed from: d */
                        public String mo150202d() {
                            return C41724a.m165678a().getGeckoDependency().mo144459d();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41859j
                        /* renamed from: e */
                        public String mo150203e() {
                            return C41724a.m165678a().getGeckoDependency().mo144460e();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41859j
                        /* renamed from: f */
                        public String mo150204f() {
                            String a = m165800a(C417262.this.mo150132b());
                            if (TextUtils.isEmpty(a)) {
                                return null;
                            }
                            return a;
                        }

                        /* renamed from: a */
                        private String m165800a(Context context) {
                            if (context == null) {
                                Log.m165383e("MailModule", "getGeckoRootPath: context is null,can not get dir");
                                return "";
                            }
                            File a = DirectFileAccess.m95103a(new DirectFileAccess.StorageParams.Builder().mo93405a(DirectFileAccess.PathType.CACHE).mo93404a(context).mo93407a());
                            if (a.exists() || a.mkdirs()) {
                                File file = new File(a, "larkGecko");
                                if (file.exists() || file.mkdirs()) {
                                    String absolutePath = file.getAbsolutePath();
                                    Log.m165379d("MailModule", "getGeckoRootPath: " + absolutePath);
                                    return absolutePath;
                                }
                                Log.m165397w("MailModule", "mkdir gecko Dir failed");
                                return "";
                            }
                            Log.m165397w("MailModule", "mkdir filesDir failed");
                            return "";
                        }
                    };
                }
                return this.f106009o;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: b */
            public Context mo150132b() {
                return C41724a.m165678a().getAppContext();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: c */
            public String mo150136c() {
                return C41724a.m165678a().getTenantName();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: d */
            public String mo150137d() {
                return C41724a.m165678a().getTenantId();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: e */
            public boolean mo150138e() {
                return C41724a.m165678a().isCNEnv();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: f */
            public String mo150139f() {
                return C41724a.m165678a().getUserId();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: g */
            public String mo150140g() {
                return C41724a.m165678a().getUserS();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: h */
            public String mo150141h() {
                return C41724a.m165678a().getUA();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: i */
            public boolean mo150142i() {
                return C41724a.m165678a().isAppRealForeground();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: j */
            public boolean mo150143j() {
                return C41724a.m165678a().isDebug();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: k */
            public boolean mo150144k() {
                return C41724a.m165678a().isUsingTTWebView();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: l */
            public String mo150145l() {
                return C41724a.m165678a().getDomain();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: m */
            public Locale mo150146m() {
                return C41724a.m165678a().getLocale();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: n */
            public int mo150147n() {
                return C41724a.m165678a().getEnv();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: p */
            public boolean mo150149p() {
                return C41724a.m165678a().isGooglePlay();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: q */
            public String mo150150q() {
                Log.m165389i("MailModule", "getForwardModuleAdditionNoteKey");
                return C41724a.m165678a().getForwardModuleAdditionNoteKey();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: s */
            public TranslationSetting mo150152s() {
                return C41724a.m165678a().syncTranslationSetting();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: t */
            public boolean mo150153t() {
                return C41724a.m165678a().isSmartComposeEnabled();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: u */
            public AbstractC41849c.AbstractC41855f mo150154u() {
                if (this.f105995a == null) {
                    this.f105995a = new AbstractC41849c.AbstractC41855f() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.C417271 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41855f
                        /* renamed from: a */
                        public boolean mo150160a(String str) {
                            return C41724a.m165678a().getFeatureGatingDependency().mo144467a(str);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41855f
                        /* renamed from: b */
                        public boolean mo150161b(String str) {
                            return C41724a.m165678a().getFeatureGatingDependency().mo144468b(str);
                        }
                    };
                }
                return this.f105995a;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: v */
            public AbstractC41849c.AbstractC41861l mo150155v() {
                if (this.f105996b == null) {
                    this.f105996b = new AbstractC41849c.AbstractC41861l() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.C417399 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41861l
                        /* renamed from: a */
                        public void mo150205a(Context context, String str, ImageView imageView, int i, int i2) {
                            C41724a.m165678a().getImageDependency().mo144470a(context, str, imageView, i, i2);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41861l
                        /* renamed from: a */
                        public void mo150206a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                            C41724a.m165678a().getImageDependency().mo144471a(context, str, str2, imageView, i, i2);
                        }
                    };
                }
                return this.f105996b;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: w */
            public AbstractC41849c.AbstractC41856g mo150156w() {
                if (this.f105997c == null) {
                    this.f105997c = new AbstractC41849c.AbstractC41856g() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.AnonymousClass10 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41856g
                        /* renamed from: a */
                        public String mo150162a() {
                            return C41724a.m165678a().getFilePickerDependency().mo144472a();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41856g
                        /* renamed from: a */
                        public void mo150163a(Activity activity, int i, long j, String str, String str2) {
                            C41724a.m165678a().getFilePickerDependency().mo144473a(activity, i, j, str, str2);
                        }
                    };
                }
                return this.f105997c;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: x */
            public AbstractC41849c.AbstractC41865p mo150157x() {
                if (this.f105998d == null) {
                    this.f105998d = new AbstractC41849c.AbstractC41865p() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.AnonymousClass11 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41865p
                        /* renamed from: a */
                        public boolean mo150164a(String str, String str2, String str3, String str4) {
                            C41724a.m165678a().getProfileDependency().mo144466a(str, str2, str3, str4);
                            return true;
                        }
                    };
                }
                return this.f105998d;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: y */
            public AbstractC41849c.AbstractC41854e mo150158y() {
                if (this.f105999e == null) {
                    this.f105999e = new AbstractC41849c.AbstractC41854e() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.AnonymousClass12 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
                        /* renamed from: a */
                        public void mo150170a() {
                            C41724a.m165678a().getDriveUploadDownProxy().mo144479a();
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
                        /* renamed from: a */
                        public int mo150165a(String[] strArr) {
                            return C41724a.m165678a().getDriveUploadDownProxy().mo144474a(strArr);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
                        /* renamed from: b */
                        public int mo150171b(String[] strArr) {
                            return C41724a.m165678a().getDriveUploadDownProxy().mo144480b(strArr);
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
                        /* renamed from: a */
                        public String mo150166a(Uri uri, String str, String str2, String str3, final AbstractC43390b bVar) {
                            return C41724a.m165678a().getDriveUploadDownProxy().mo144475a(uri, str, str2, str3, new AbstractC5138b.AbstractC5140b() {
                                /* class com.ss.android.lark.mail.C41724a.C417262.AnonymousClass12.C417303 */

                                @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b.AbstractC5140b
                                /* renamed from: a */
                                public boolean mo20428a(String str, int i) {
                                    return bVar.onFailed(str, i);
                                }

                                @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b.AbstractC5140b
                                /* renamed from: a */
                                public boolean mo20429a(String str, int i, long j, long j2, String str2, String str3) {
                                    return bVar.updateProgress(str, i, j, j2, str2, str3);
                                }
                            });
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
                        /* renamed from: a */
                        public String mo150167a(String str, String str2, int i, boolean z, final AbstractC43389a aVar) {
                            return C41724a.m165678a().getDriveUploadDownProxy().mo144476a(str, str2, i, z, new AbstractC5138b.AbstractC5139a() {
                                /* class com.ss.android.lark.mail.C41724a.C417262.AnonymousClass12.C417314 */

                                @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b.AbstractC5139a
                                /* renamed from: a */
                                public boolean mo20426a(String str, int i) {
                                    return aVar.onFailed(str, i);
                                }

                                @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b.AbstractC5139a
                                /* renamed from: a */
                                public boolean mo20427a(String str, int i, long j, long j2) {
                                    return aVar.updateProgress(str, i, j, j2);
                                }
                            });
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
                        /* renamed from: a */
                        public String mo150169a(String str, String str2, String str3, String str4, final AbstractC43390b bVar) {
                            return C41724a.m165678a().getDriveUploadDownProxy().mo144478a(str, str2, str3, str4, new AbstractC5138b.AbstractC5140b() {
                                /* class com.ss.android.lark.mail.C41724a.C417262.AnonymousClass12.C417292 */

                                @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b.AbstractC5140b
                                /* renamed from: a */
                                public boolean mo20428a(String str, int i) {
                                    return bVar.onFailed(str, i);
                                }

                                @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b.AbstractC5140b
                                /* renamed from: a */
                                public boolean mo20429a(String str, int i, long j, long j2, String str2, String str3) {
                                    return bVar.updateProgress(str, i, j, j2, str2, str3);
                                }
                            });
                        }

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
                        /* renamed from: a */
                        public String mo150168a(String str, String str2, String str3, String str4, int i, String str5, final AbstractC43389a aVar) {
                            return C41724a.m165678a().getDriveUploadDownProxy().mo144477a(str, str2, str3, str4, i, str5, new AbstractC5138b.AbstractC5139a() {
                                /* class com.ss.android.lark.mail.C41724a.C417262.AnonymousClass12.C417281 */

                                @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b.AbstractC5139a
                                /* renamed from: a */
                                public boolean mo20426a(String str, int i) {
                                    return aVar.onFailed(str, i);
                                }

                                @Override // com.bytedance.ee.bear.contract.drive.AbstractC5138b.AbstractC5139a
                                /* renamed from: a */
                                public boolean mo20427a(String str, int i, long j, long j2) {
                                    return aVar.updateProgress(str, i, j, j2);
                                }
                            });
                        }
                    };
                }
                return this.f105999e;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: z */
            public AbstractC41849c.AbstractC41857h mo150159z() {
                if (this.f106000f == null) {
                    this.f106000f = new AbstractC41849c.AbstractC41857h() {
                        /* class com.ss.android.lark.mail.C41724a.C417262.AnonymousClass13 */

                        @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41857h
                        /* renamed from: a */
                        public void mo150172a(MailAttachment mailAttachment, String str) {
                            C41724a.m165678a().getFileReaderDependency().mo144483a(mailAttachment, str);
                        }
                    };
                }
                return this.f106000f;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: a */
            public List<String> mo150121a(DomainSettings.Alias alias) {
                return C41724a.m165678a().getDomains(alias);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: b */
            public boolean mo150133b(Context context) {
                return C41724a.m165678a().openPrivacyPolicy(context);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: b */
            public boolean mo150135b(String str) {
                return C41724a.m165678a().tryOpenUrlWithLittleApp(str);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: a */
            public void mo150127a(C43853v.AbstractC43859a aVar) {
                C41724a.m165678a().observeTranslationSetting(aVar);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: a */
            public boolean mo150128a(Context context) {
                return C41724a.m165678a().openUserProtocol(context);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: a */
            public boolean mo150129a(Bundle bundle) {
                return C41724a.m165678a().viewByDrive(bundle);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: a */
            public boolean mo150130a(String str) {
                return C41724a.m165678a().tryOpenUrlWithDoc(str);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: a */
            public void mo150123a(Context context, String str) {
                C41724a.m165678a().viewLocalFileByDrive(context, str);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: b */
            public boolean mo150134b(Context context, String str) {
                return C41724a.m165678a().tryOpenUrlWithAppBrowser(context, str);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: a */
            public void mo150126a(WebView webView, String str) {
                C41724a.m165678a().onCreateWebView(webView, str);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: a */
            public void mo150124a(Context context, String str, String str2) {
                Log.m165379d("MailModule", "launchReplyLotsOfMessagesActivity");
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: a */
            public void mo150125a(Context context, String str, String str2, long j) {
                C41724a.m165678a().openCalendar(context, str, str2, j);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c
            /* renamed from: a */
            public void mo150122a(Context context, int i, Bundle bundle, int i2, String str) {
                Log.m165389i("MailModule", "forwardMailToChat");
                C41724a.m165678a().forwardMailToChat(context, i, bundle, i2, str);
            }
        };
    }

    /* renamed from: d */
    public boolean mo150104d() {
        return C42871i.m170783d();
    }

    /* renamed from: l */
    public AbstractC41740a.AbstractC41754m mo150108l() {
        return MailLauncherService.f106050b.mo150212a();
    }

    /* renamed from: a */
    public static AbstractC41740a m165678a() {
        return (AbstractC41740a) ApiUtils.getApi(AbstractC41740a.class);
    }

    /* renamed from: k */
    public List<AbstractNotification> mo150107k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C41761a());
        return arrayList;
    }

    public C41724a() {
        C41816b.m166116a(m165678a().getAppContext(), m165684n());
    }

    /* renamed from: g */
    public static boolean m165681g() {
        if (m165678a() == null || !m165678a().getMainDependency().mo144489a("mail")) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m165683j() {
        if (!m165681g() || !m165678a().getFeatureGatingDependency().mo144467a("larkmail.cli.maillinglist.setting")) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m165682h() {
        if ((m165678a() == null || !m165678a().isLeanModeOpen()) && m165681g() && !C43350d.m172098a().mo155020L()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo150093a(Activity activity) {
        C42699a.m170261b(activity);
    }

    /* renamed from: a */
    public static boolean m165679a(String str) {
        return C42050e.m167247a(str);
    }

    /* renamed from: b */
    public void mo150100b(Context context) {
        C42723b.m170356a().mo153413b(context);
    }

    /* renamed from: c */
    public void mo150103c(Context context) {
        Log.m165389i("MailModule", "preloadWhenIdle");
        C42723b.m170356a().mo153416c(context);
    }

    /* renamed from: a */
    public void mo150094a(Context context) {
        C42723b.m170356a().mo153410a(context);
    }

    /* renamed from: b */
    public boolean mo150101b(String str) {
        if (!mo150106i()) {
            return false;
        }
        if ("mailto".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        return MailAddress.m167321a(str).mo151185g();
    }

    /* renamed from: a */
    public void mo150097a(boolean z) {
        if (z) {
            C43277a.m171921a().mo154942f();
        }
        m165678a().getAccountDependency().mo144469a(this.f105993a);
    }

    /* renamed from: a */
    public void mo150095a(Context context, Intent intent) {
        C42699a.m170216a(context, intent);
    }

    /* renamed from: a */
    public void mo150096a(Context context, String str) {
        C42699a.m170294m(context, str);
    }

    /* renamed from: a */
    public AbstractC44552i mo150092a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return new C42717a(context, eVar, (AbstractC44549f) iTitleController);
    }

    /* renamed from: a */
    public boolean mo150098a(Context context, String str, Map<String, String> map) {
        boolean z;
        if (C43783o.m173519a(Uri.parse(str)) || MailAddress.m167321a(str).mo151185g()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C42699a.m170239a(context, str, map);
        }
        return z;
    }
}
