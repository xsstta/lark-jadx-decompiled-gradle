package com.ss.android.lark.p2993y.p2995b.p2996a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.LanguagesConfiguration;
import com.bytedance.lark.pb.im.v1.PushAutoTranslateScopeNotify;
import com.bytedance.lark.pb.im.v1.PushDisableAutoTranslateLanguagesNotice;
import com.bytedance.lark.pb.im.v1.PushImageTranslationInfo;
import com.bytedance.lark.pb.im.v1.PushLanguageAutoTranslateScopeNotify;
import com.bytedance.lark.pb.im.v1.PushLanguagesConfigurationNotice;
import com.bytedance.lark.pb.im.v1.PushLanguagesConfigurationNoticeV2;
import com.bytedance.lark.pb.im.v1.PushTranslateLanguageNotice;
import com.bytedance.lark.pb.im.v1.PushTranslateState;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.AbstractC29628t;
import com.ss.android.lark.chat.api.AbstractC32810b;
import com.ss.android.lark.chat.entity.translate.TranslateLanguageSetting;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.C57343d;
import com.ss.android.lark.p2851u.p2852a.C57336y;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.y.b.a.a */
public class C59359a {

    /* renamed from: a */
    AbstractC32810b f147355a;

    /* renamed from: b */
    public List<AbstractC29628t> f147356b;

    /* renamed from: c */
    private List<AbstractC59363c> f147357c;

    /* renamed from: d */
    private List<AbstractC59362b> f147358d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.y.b.a.a$a */
    public static class C59361a {

        /* renamed from: a */
        public static final C59359a f147361a = new C59359a();
    }

    /* renamed from: com.ss.android.lark.y.b.a.a$b */
    public interface AbstractC59362b {
        /* renamed from: a */
        void mo123114a(PushImageTranslationInfo pushImageTranslationInfo);
    }

    /* renamed from: com.ss.android.lark.y.b.a.a$c */
    public interface AbstractC59363c {
        /* renamed from: a */
        void mo123115a(C36874a aVar);
    }

    /* renamed from: a */
    public static final C59359a m230421a() {
        return C59361a.f147361a;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m230424d() {
        C53248k.m205912a().mo181696a(Command.PUSH_IMAGE_TRANSLATION_INFO);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m230425e() {
        C53248k.m205912a().mo181697a(Command.PUSH_IMAGE_TRANSLATION_INFO, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.p2993y.p2995b.p2996a.$$Lambda$O4xnRXHppxsQ_KuuJoPjORyjamU */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C59359a.this.mo201719c(bArr, str, z, z2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m230426f() {
        C53248k.m205912a().mo181696a(Command.PUSH_TRANSLATE_STATES);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m230427g() {
        C53248k.m205912a().mo181697a(Command.PUSH_TRANSLATE_STATES, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.p2993y.p2995b.p2996a.$$Lambda$mjp2NuIZqT8YbC2rD6NDVxRIz_8 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C59359a.this.mo201718b(bArr, str, z, z2);
            }
        });
    }

    private C59359a() {
        this.f147357c = new CopyOnWriteArrayList();
        this.f147356b = new CopyOnWriteArrayList();
        this.f147358d = new CopyOnWriteArrayList();
        this.f147355a = new C57343d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m230422b() {
        C53248k.m205912a().mo181696a(Command.PUSH_TRANSLATE_LANGUAGES_SETTING);
        C53248k.m205912a().mo181696a(Command.PUSH_DISABLE_AUTO_TRANSLATE_LANGUAGE_NOTICE);
        C53248k.m205912a().mo181696a(Command.PUSH_LANGUAGES_CONFIGURATION_NOTICE);
        C53248k.m205912a().mo181696a(Command.PUSH_AUTO_TRANSLATE_SCOPE_NOTICE);
        C53248k.m205912a().mo181696a(Command.PUSH_LANGUAGES_CONFIGURATION_NOTICE_V2);
        C53248k.m205912a().mo181696a(Command.PUSH_LANGUAGE_AUTO_TRANSLATE_SCOPE);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m230423c() {
        C53248k.m205912a().mo181697a(Command.PUSH_TRANSLATE_LANGUAGES_SETTING, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.p2993y.p2995b.p2996a.$$Lambda$u9Bpc0u_JnwCYnWIq89SNV6Y9bA */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C59359a.this.mo201720d(bArr, str, z, z2);
            }
        });
        C53248k.m205912a().mo181697a(Command.PUSH_DISABLE_AUTO_TRANSLATE_LANGUAGE_NOTICE, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.p2993y.p2995b.p2996a.$$Lambda$6LSE5rNrjmLy19t3nuqWZ9Gs */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C59359a.this.mo201721e(bArr, str, z, z2);
            }
        });
        C53248k.m205912a().mo181697a(Command.PUSH_LANGUAGES_CONFIGURATION_NOTICE, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.p2993y.p2995b.p2996a.$$Lambda$7f84velO7qmhqVb8qnQ8myyt5yk */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C59359a.this.mo201722f(bArr, str, z, z2);
            }
        });
        C53248k.m205912a().mo181697a(Command.PUSH_AUTO_TRANSLATE_SCOPE_NOTICE, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.p2993y.p2995b.p2996a.$$Lambda$E6xkFX6XseFrEn3MTGzrQcSFQgQ */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C59359a.this.mo201723g(bArr, str, z, z2);
            }
        });
        C53248k.m205912a().mo181697a(Command.PUSH_LANGUAGES_CONFIGURATION_NOTICE_V2, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.p2993y.p2995b.p2996a.$$Lambda$2FQBvS33YUTvepSneT0ho9gsyBA */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C59359a.this.mo201714a(bArr, str, z, z2);
            }
        });
        C53248k.m205912a().mo181697a(Command.PUSH_LANGUAGE_AUTO_TRANSLATE_SCOPE, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.p2993y.p2995b.p2996a.$$Lambda$a$yuKWsy3TsQ3NOpJPK6PrZa9uyXA */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C59359a.this.m230428h(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: b */
    public void mo201715b(AbstractC29628t tVar) {
        C53246j.m205911b(this.f147356b, tVar, $$Lambda$a$DWimqkz6V4MBlURuaazSSqJywME.INSTANCE);
    }

    /* renamed from: a */
    public void mo201710a(AbstractC29628t tVar) {
        C53246j.m205910a(this.f147356b, tVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.p2993y.p2995b.p2996a.$$Lambda$a$TwCyB2EfzvbWpuwHCH_M6kFBvQ */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C59359a.this.m230423c();
            }
        });
    }

    /* renamed from: b */
    public void mo201716b(AbstractC59362b bVar) {
        C53246j.m205911b(this.f147358d, bVar, $$Lambda$a$riCrIiPV6_oLcDLflE4Oqt29K0.INSTANCE);
    }

    /* renamed from: a */
    public void mo201711a(C36874a aVar) {
        if (aVar != null) {
            for (AbstractC59363c cVar : this.f147357c) {
                cVar.mo123115a(aVar);
            }
        }
    }

    /* renamed from: b */
    public void mo201717b(AbstractC59363c cVar) {
        C53246j.m205911b(this.f147357c, cVar, $$Lambda$a$9RU_D75O8yDvrrsIKjjq9FsWvA4.INSTANCE);
    }

    /* renamed from: a */
    public void mo201712a(AbstractC59362b bVar) {
        C53246j.m205910a(this.f147358d, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.p2993y.p2995b.p2996a.$$Lambda$a$eWSS67jiQWljlU3efP6sLlOVtaw */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C59359a.this.m230425e();
            }
        });
    }

    /* renamed from: a */
    public void mo201713a(AbstractC59363c cVar) {
        C53246j.m205910a(this.f147357c, cVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.p2993y.p2995b.p2996a.$$Lambda$a$IS1HDejMgmNOzx8yHmDEXFawQk */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C59359a.this.m230427g();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m230428h(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushLanguageAutoTranslateScopeNotify decode = PushLanguageAutoTranslateScopeNotify.ADAPTER.decode(bArr);
            for (AbstractC29628t tVar : this.f147356b) {
                tVar.mo106757b(new HashMap(decode.src_languages_scope));
            }
            Log.m165389i("TranslatePush", "onPushAutoTranslateScopeChanged");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo201719c(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushImageTranslationInfo decode = PushImageTranslationInfo.ADAPTER.decode(bArr);
            for (AbstractC59362b bVar : this.f147358d) {
                bVar.mo123114a(decode);
            }
            Log.m165379d("TranslateImage", "onPushImageTranslationInfo:");
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: d */
    public void mo201720d(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushTranslateLanguageNotice decode = PushTranslateLanguageNotice.ADAPTER.decode(bArr);
            final TranslateLanguageSetting translateLanguageSetting = new TranslateLanguageSetting(decode.target_language, decode.language_keys, decode.supported_languages);
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.p2993y.p2995b.p2996a.C59359a.RunnableC593601 */

                public void run() {
                    for (AbstractC29628t tVar : C59359a.this.f147356b) {
                        tVar.mo106753a(translateLanguageSetting);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: e */
    public void mo201721e(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushDisableAutoTranslateLanguagesNotice decode = PushDisableAutoTranslateLanguagesNotice.ADAPTER.decode(bArr);
            for (AbstractC29628t tVar : this.f147356b) {
                tVar.mo106754a(decode.language_keys);
            }
            Log.m165379d("TranslatePush", "onPushDisableAutoTranslateLanguagekeys");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public void mo201722f(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushLanguagesConfigurationNotice decode = PushLanguagesConfigurationNotice.ADAPTER.decode(bArr);
            TranslateLanguageSetting translateLanguageSetting = new TranslateLanguageSetting(decode.global_language_config, decode.languages_config);
            for (AbstractC29628t tVar : this.f147356b) {
                tVar.mo106756b(translateLanguageSetting);
            }
            Log.m165379d("TranslatePush", "onPushTranslateDisplayRules");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public void mo201723g(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushAutoTranslateScopeNotify decode = PushAutoTranslateScopeNotify.ADAPTER.decode(bArr);
            for (AbstractC29628t tVar : this.f147356b) {
                tVar.mo106752a(decode.scopes.intValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo201718b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            C36874a a = C57336y.m222238a(this.f147355a, PushTranslateState.ADAPTER.decode(bArr));
            if (a != null) {
                for (AbstractC59363c cVar : this.f147357c) {
                    cVar.mo123115a(a);
                }
            }
            Log.m165379d("TranslatePush", "onPushTranslateState:");
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public void mo201714a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushLanguagesConfigurationNoticeV2 decode = PushLanguagesConfigurationNoticeV2.ADAPTER.decode(bArr);
            if (decode.src_languages_conf == null) {
                return;
            }
            if (!decode.src_languages_conf.isEmpty()) {
                HashMap hashMap = new HashMap(decode.src_languages_conf.size());
                for (Map.Entry<String, LanguagesConfiguration> entry : decode.src_languages_conf.entrySet()) {
                    if (!(entry.getKey() == null || entry.getValue() == null || entry.getValue().rule == null)) {
                        hashMap.put(entry.getKey(), Integer.valueOf(entry.getValue().rule.getValue()));
                    }
                }
                for (AbstractC29628t tVar : this.f147356b) {
                    tVar.mo106755a(hashMap);
                }
                Log.m165389i("TranslatePush", "onPushTranslateDisplayRulesV2");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
