package com.ss.android.lark.mail.impl.mulprocess;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.DriveFile;
import com.ss.android.lark.mail.impl.entity.DriveFileOperationMask;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost;
import com.ss.android.lark.mail.impl.mulprocess.webprocess.AbstractC43226a;
import com.ss.android.lark.mail.impl.mulprocess.webprocess.C43227b;
import com.ss.android.lark.mail.impl.network.NetworkChangeListener;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41872d;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43389a;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43390b;
import com.ss.android.lark.mail.impl.utils.C43853v;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.mulprocess.a */
public class C43202a implements AbstractC41849c {

    /* renamed from: a */
    AbstractC43226a f109961a;

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: C */
    public AbstractC41849c.AbstractC41863n mo150113C() {
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: G */
    public AbstractC41849c.AbstractC41851b mo150117G() {
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: H */
    public AbstractC41849c.AbstractC41860k mo150118H() {
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: a */
    public List<String> mo150121a(DomainSettings.Alias alias) {
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: a */
    public void mo150122a(Context context, int i, Bundle bundle, int i2, String str) {
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: a */
    public void mo150123a(Context context, String str) {
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: a */
    public void mo150125a(Context context, String str, String str2, long j) {
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: a */
    public void mo150126a(WebView webView, String str) {
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: a */
    public void mo150127a(C43853v.AbstractC43859a aVar) {
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: a */
    public boolean mo150128a(Context context) {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: b */
    public boolean mo150133b(Context context) {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: c */
    public String mo150136c() {
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: d */
    public String mo150137d() {
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: e */
    public boolean mo150138e() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: h */
    public String mo150141h() {
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: i */
    public boolean mo150142i() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: j */
    public boolean mo150143j() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: l */
    public String mo150145l() {
        return "";
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: o */
    public boolean mo150148o() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: p */
    public boolean mo150149p() {
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: r */
    public String mo150151r() {
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: t */
    public boolean mo150153t() {
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: z */
    public AbstractC41849c.AbstractC41857h mo150159z() {
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: a */
    public int mo150120a() {
        return C43213b.f109975b;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: b */
    public Context mo150132b() {
        return C43227b.f109991a;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: a */
    public boolean mo150131a(String str, List<DriveFile> list, DriveFileOperationMask driveFileOperationMask, HashMap hashMap, AbstractC41849c.AbstractC41850a aVar) {
        return this.f109961a.mo144386a(str, list, driveFileOperationMask, hashMap, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: a */
    public boolean mo150130a(String str) {
        return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).tryOpenUrlWithDoc(str);
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: A */
    public AbstractC41849c.AbstractC41858i mo150111A() {
        return new AbstractC41849c.AbstractC41858i() {
            /* class com.ss.android.lark.mail.impl.mulprocess.C43202a.C432118 */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41858i
            /* renamed from: a */
            public int mo150173a(String str, String str2) {
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).getFileIconByMIMEType(str, str2);
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: B */
    public AbstractC41849c.AbstractC41868s mo150112B() {
        return new AbstractC41849c.AbstractC41868s() {
            /* class com.ss.android.lark.mail.impl.mulprocess.C43202a.C432129 */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41868s
            /* renamed from: a */
            public void mo150175a(NetworkChangeListener networkChangeListener) {
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41868s
            /* renamed from: b */
            public void mo150176b(NetworkChangeListener networkChangeListener) {
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41868s
            /* renamed from: a */
            public NetworkChangeListener.NetworkLevel mo150174a() {
                return NetworkChangeListener.NetworkLevel.forNumber(((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).getCurNetWorkLevel());
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: D */
    public AbstractC41849c.AbstractC41864o mo150114D() {
        return new AbstractC41849c.AbstractC41864o() {
            /* class com.ss.android.lark.mail.impl.mulprocess.C43202a.AnonymousClass10 */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41864o
            /* renamed from: a */
            public void mo150181a(String str, JSONObject jSONObject) {
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41864o
            /* renamed from: c */
            public void mo150183c(String str, JSONObject jSONObject) {
                if (jSONObject != null) {
                    ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).reportSlardar(str, jSONObject.toString());
                }
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41864o
            /* renamed from: b */
            public void mo150182b(String str, JSONObject jSONObject) {
                if (jSONObject != null) {
                    Log.m165382e("MailWebProcessManager.appContext:" + C43227b.f109991a + " Host:" + C41816b.m166115a().mo150120a());
                    ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).reportBusiness(str, jSONObject.toString());
                }
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: E */
    public AbstractC41849c.AbstractC41853d mo150115E() {
        return new AbstractC41849c.AbstractC41853d() {
            /* class com.ss.android.lark.mail.impl.mulprocess.C43202a.AnonymousClass11 */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41853d
            /* renamed from: a */
            public MailAddress mo150184a(String str) {
                return null;
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41853d
            /* renamed from: a */
            public void mo150187a(AbstractC41849c.AbstractC41866q qVar) {
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41853d
            /* renamed from: b */
            public void mo150188b(AbstractC41849c.AbstractC41866q qVar) {
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41853d
            /* renamed from: a */
            public String mo150185a(String str, int i) {
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).getChatterAvatarByUserId(str, i);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41853d
            /* renamed from: a */
            public void mo150186a(Context context, String str) {
                ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).openChat(str);
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: F */
    public AbstractC41849c.AbstractC41867r mo150116F() {
        return new AbstractC41849c.AbstractC41867r() {
            /* class com.ss.android.lark.mail.impl.mulprocess.C43202a.C432042 */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41867r
            /* renamed from: a */
            public void mo150189a(AbstractC41872d dVar) {
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41867r
            /* renamed from: b */
            public void mo150191b(AbstractC41872d dVar) {
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41867r
            /* renamed from: a */
            public boolean mo150190a() {
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).isStrongBadgeRemind();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41867r
            /* renamed from: b */
            public boolean mo150192b() {
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).is24HourClock();
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: I */
    public AbstractC41849c.AbstractC41859j mo150119I() {
        return new AbstractC41849c.AbstractC41859j() {
            /* class com.ss.android.lark.mail.impl.mulprocess.C43202a.C432053 */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41859j
            /* renamed from: a */
            public long mo150199a() {
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).getAppId();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41859j
            /* renamed from: b */
            public String mo150200b() {
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).getAccessKey();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41859j
            /* renamed from: c */
            public String mo150201c() {
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).getDomain();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41859j
            /* renamed from: d */
            public String mo150202d() {
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).getDeviceId();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41859j
            /* renamed from: e */
            public String mo150203e() {
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).getAppVersionName();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41859j
            /* renamed from: f */
            public String mo150204f() {
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).getGeckoRootFilePath();
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: u */
    public AbstractC41849c.AbstractC41855f mo150154u() {
        return new AbstractC41849c.AbstractC41855f() {
            /* class com.ss.android.lark.mail.impl.mulprocess.C43202a.C432031 */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41855f
            /* renamed from: b */
            public boolean mo150161b(String str) {
                return mo150160a(str);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41855f
            /* renamed from: a */
            public boolean mo150160a(String str) {
                Log.m165382e("getAppContext():" + C43202a.this.mo150132b() + " Host:" + C41816b.m166115a().mo150120a());
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).getFGByKey(str);
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: v */
    public AbstractC41849c.AbstractC41861l mo150155v() {
        return new AbstractC41849c.AbstractC41861l() {
            /* class com.ss.android.lark.mail.impl.mulprocess.C43202a.C432064 */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41861l
            /* renamed from: a */
            public void mo150206a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41861l
            /* renamed from: a */
            public void mo150205a(Context context, String str, ImageView imageView, int i, int i2) {
                try {
                    ((C2124f) ComponentCallbacks2C2115c.m9151c(context).mo10430i().mo10396a(str).mo10401b((AbstractC2536f<Bitmap>) new AbstractC2536f<Bitmap>() {
                        /* class com.ss.android.lark.mail.impl.mulprocess.C43202a.C432064.C432071 */

                        @Override // com.bumptech.glide.request.AbstractC2536f
                        /* renamed from: a */
                        public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j<Bitmap> jVar, boolean z) {
                            Log.m165388i("onLoadFailed");
                            return false;
                        }

                        /* renamed from: a */
                        public boolean mo11205a(Bitmap bitmap, Object obj, AbstractC2522j<Bitmap> jVar, DataSource dataSource, boolean z) {
                            Log.m165388i("onResourceReady");
                            return false;
                        }
                    }).mo11144c(UIUtils.dp2px(context, (float) i), UIUtils.dp2px(context, (float) i2))).mo10399a(imageView);
                } catch (Exception unused) {
                }
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: w */
    public AbstractC41849c.AbstractC41856g mo150156w() {
        return new AbstractC41849c.AbstractC41856g() {
            /* class com.ss.android.lark.mail.impl.mulprocess.C43202a.C432085 */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41856g
            /* renamed from: a */
            public String mo150162a() {
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).getFilePathListKey();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41856g
            /* renamed from: a */
            public void mo150163a(Activity activity, int i, long j, String str, String str2) {
                C43202a.this.f109961a.mo144385a(activity, i, j, str, str2);
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: x */
    public AbstractC41849c.AbstractC41865p mo150157x() {
        return new AbstractC41849c.AbstractC41865p() {
            /* class com.ss.android.lark.mail.impl.mulprocess.C43202a.C432096 */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41865p
            /* renamed from: a */
            public boolean mo150164a(String str, String str2, String str3, String str4) {
                return ((IHost) C68183b.m264839a().mo237086a(C43202a.this.mo150132b(), IHost.class)).openProfile(str, str2, str3, str4);
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: y */
    public AbstractC41849c.AbstractC41854e mo150158y() {
        return new AbstractC41849c.AbstractC41854e() {
            /* class com.ss.android.lark.mail.impl.mulprocess.C43202a.C432107 */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
            /* renamed from: a */
            public void mo150170a() {
                ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).tryInitDrive();
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
            /* renamed from: b */
            public int mo150171b(String[] strArr) {
                return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).driveCancelDownload(strArr);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
            /* renamed from: a */
            public int mo150165a(String[] strArr) {
                if (strArr == null) {
                    return 0;
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    arrayList.add(str);
                }
                return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).driveCancelUpload(arrayList);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
            /* renamed from: a */
            public String mo150166a(Uri uri, String str, String str2, String str3, AbstractC43390b bVar) {
                return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).driveUpload(uri, str, str2, str3, bVar);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
            /* renamed from: a */
            public String mo150167a(String str, String str2, int i, boolean z, AbstractC43389a aVar) {
                return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).docImageDownload(str, str2, i, z, aVar);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
            /* renamed from: a */
            public String mo150169a(String str, String str2, String str3, String str4, AbstractC43390b bVar) {
                return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).driveUpload(str, str2, str3, str4, bVar);
            }

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41854e
            /* renamed from: a */
            public String mo150168a(String str, String str2, String str3, String str4, int i, String str5, AbstractC43389a aVar) {
                return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).driveDownload(str, str2, str3, str4, i, str5, aVar);
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: f */
    public String mo150139f() {
        return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).getUserId();
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: g */
    public String mo150140g() {
        return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).getSession();
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: k */
    public boolean mo150144k() {
        return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).isUsingTTWebView();
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: n */
    public int mo150147n() {
        return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).getEnv();
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: q */
    public String mo150150q() {
        return ((IHost) C68183b.m264839a().mo237086a(mo150132b(), IHost.class)).getForwardModuleAdditionNoteKey();
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: s */
    public TranslationSetting mo150152s() {
        return ((IHost) C68183b.m264839a().mo237086a(mo150132b(), IHost.class)).syncTranslationSetting();
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: m */
    public Locale mo150146m() {
        if (Build.VERSION.SDK_INT >= 24) {
            return mo150132b().getResources().getConfiguration().getLocales().get(0);
        }
        return mo150132b().getResources().getConfiguration().locale;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: b */
    public boolean mo150135b(String str) {
        return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).tryOpenUrlWithLittleApp(str);
    }

    /* renamed from: a */
    public void mo154619a(AbstractC43226a aVar) {
        this.f109961a = aVar;
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: a */
    public boolean mo150129a(Bundle bundle) {
        return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).viewByDrive(bundle);
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: b */
    public boolean mo150134b(Context context, String str) {
        return ((IHost) C68183b.m264839a().mo237086a(C43227b.f109991a, IHost.class)).tryOpenUrlWithAppBrowser(str);
    }

    @Override // com.ss.android.lark.mail.impl.AbstractC41849c
    /* renamed from: a */
    public void mo150124a(Context context, String str, String str2) {
        ((IHost) C68183b.m264839a().mo237086a(mo150132b(), IHost.class)).launchReplyLotsOfMessagesActivity(str, str2);
    }
}
