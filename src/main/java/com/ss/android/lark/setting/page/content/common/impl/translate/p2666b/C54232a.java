package com.ss.android.lark.setting.page.content.common.impl.translate.p2666b;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DisplayRule;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.im.v1.ContentType;
import com.bytedance.lark.pb.im.v1.DeleteWebNotTranslateLanguagesRequest;
import com.bytedance.lark.pb.im.v1.DeleteWebNotTranslateLanguagesResponse;
import com.bytedance.lark.pb.im.v1.DetectTextsLanguageRequest;
import com.bytedance.lark.pb.im.v1.DetectTextsLanguageResponse;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesRequest;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesResponse;
import com.bytedance.lark.pb.im.v1.GetWebNotTranslateLanguagesRequest;
import com.bytedance.lark.pb.im.v1.GetWebNotTranslateLanguagesResponse;
import com.bytedance.lark.pb.im.v1.LanguagesConfiguration;
import com.bytedance.lark.pb.im.v1.PatchLanguagesAutoTranslationScopeRequest;
import com.bytedance.lark.pb.im.v1.PatchWebTranslationConfigRequest;
import com.bytedance.lark.pb.im.v1.SetAutoTranslateScopeRequest;
import com.bytedance.lark.pb.im.v1.SetWebNotTranslateLanguagesRequest;
import com.bytedance.lark.pb.im.v1.SetWebNotTranslateLanguagesResponse;
import com.bytedance.lark.pb.im.v1.SrcLanguageConfig;
import com.bytedance.lark.pb.im.v1.TranslateWebXMLRequest;
import com.bytedance.lark.pb.im.v1.TranslateWebXMLResponse;
import com.bytedance.lark.pb.im.v1.TrgLanguageConfig;
import com.bytedance.lark.pb.im.v1.WebTranslationConfig;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableLanguageInfo;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableTranslateSettingConfig;
import com.ss.android.lark.setting.page.content.common.impl.translate.p2667c.C54246a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.b.a */
public class C54232a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.b.a$a */
    public static class C54245a {

        /* renamed from: a */
        static C54232a f134293a = new C54232a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Void m210625b(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Void m210626c(byte[] bArr) throws IOException {
        return null;
    }

    private C54232a() {
    }

    /* renamed from: a */
    public static C54232a m210622a() {
        return C54245a.f134293a;
    }

    /* renamed from: a */
    public void mo185630a(boolean z, final IGetDataCallback<MineTranslateLanguageSetting> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_TRANSLATE_LANGUAGES_SETTING, new GetTranslateLanguagesRequest.C17729a().mo61896a(z ? SyncDataStrategy.TRY_LOCAL : SyncDataStrategy.FORCE_SERVER), new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.C542331 */

            /* renamed from: a */
            public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(mineTranslateLanguageSetting);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }, new SdkSender.IParser<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.C542363 */

            /* renamed from: a */
            public MineTranslateLanguageSetting parse(byte[] bArr) throws IOException {
                int i;
                List<String> list;
                int i2;
                GetTranslateLanguagesResponse decode = GetTranslateLanguagesResponse.ADAPTER.decode(bArr);
                List<String> list2 = decode.dis_auto_translate_languages_conf;
                ArrayList arrayList = new ArrayList();
                if (!(decode.src_lanugages == null || decode.src_languages_config == null || list2 == null)) {
                    for (String str : decode.src_lanugages) {
                        SrcLanguageConfig srcLanguageConfig = decode.src_languages_config.get(str);
                        arrayList.add(new LanguageInfo(str, srcLanguageConfig.language, false, list2.contains(str), srcLanguageConfig.rule.getValue(), C54377c.m211101a(srcLanguageConfig.scopes.intValue()), C54246a.m210655a(srcLanguageConfig.i18n_language), ""));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (!(decode.language_keys == null || decode.trg_languages_config == null || list2 == null)) {
                    for (String str2 : decode.language_keys) {
                        TrgLanguageConfig trgLanguageConfig = decode.trg_languages_config.get(str2);
                        arrayList2.add(new LanguageInfo(str2, trgLanguageConfig.language, TextUtils.equals(str2, decode.target_language), list2.contains(str2), DisplayRule.UNKNOWN_RULE.getValue(), C54377c.m211101a(C54377c.f134509a), C54246a.m210655a(trgLanguageConfig.i18n_language), trgLanguageConfig.translation_doc));
                    }
                }
                if (decode.global_conf != null) {
                    i = decode.global_conf.rule.getValue();
                } else {
                    i = 0;
                }
                HashMap hashMap = new HashMap();
                if (decode.languages_conf != null) {
                    for (Map.Entry<String, LanguagesConfiguration> entry : decode.languages_conf.entrySet()) {
                        hashMap.put(entry.getKey(), Integer.valueOf(entry.getValue().rule.getValue()));
                    }
                }
                if (decode.web_translation_config == null) {
                    list = Collections.emptyList();
                } else {
                    list = decode.web_translation_config.black_domains;
                }
                if (decode.auto_translate_global_switch.booleanValue()) {
                    i2 = decode.switch_scopes.intValue();
                } else {
                    i2 = 0;
                }
                return new MineTranslateLanguageSetting(i2, decode.target_language, arrayList2, new HashSet(decode.dis_auto_translate_languages_conf), i, hashMap, arrayList, list, decode.web_language_keys);
            }
        });
    }

    /* renamed from: a */
    public void mo185626a(final String str, final int i, final boolean z, final IGetDataCallback<Void> iGetDataCallback) {
        mo185630a(true, (IGetDataCallback<MineTranslateLanguageSetting>) new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.C542385 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                boolean z;
                if (mineTranslateLanguageSetting == null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(null);
                        return;
                    }
                    return;
                }
                LanguageInfo a = C54232a.this.mo185620a(mineTranslateLanguageSetting.getSrcLanguages(), str);
                if (a == null) {
                    IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                    if (iGetDataCallback2 != null) {
                        iGetDataCallback2.onSuccess(null);
                    }
                } else if (C54377c.f134513e != i || MineTranslateLanguageSetting.C54163b.m210276a(mineTranslateLanguageSetting.getGlobalAutoTranslateScope()).mo185402c()) {
                    C54377c autoTranslateScope = a.getAutoTranslateScope();
                    if (!mineTranslateLanguageSetting.isGlobalAutoTranslate() || !autoTranslateScope.mo185975b(i)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z2 = z;
                    if (z == z2) {
                        IGetDataCallback iGetDataCallback3 = iGetDataCallback;
                        if (iGetDataCallback3 != null) {
                            iGetDataCallback3.onSuccess(null);
                            return;
                        }
                        return;
                    }
                    if (z2) {
                        autoTranslateScope.mo185976c(i);
                    } else {
                        autoTranslateScope.mo185978d(i);
                    }
                    C54232a.this.mo185625a(str, autoTranslateScope.mo185982g(), iGetDataCallback);
                } else {
                    C542391 r5 = new IGetDataCallback<List<String>>() {
                        /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.C542385.C542391 */

                        /* renamed from: a */
                        public void onSuccess(List<String> list) {
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onSuccess(null);
                            }
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onError(errorResult);
                            }
                        }
                    };
                    if (!z) {
                        C54232a.this.mo185627a(str, r5);
                    } else {
                        C54232a.this.mo185633b(str, r5);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo185627a(String str, IGetDataCallback<List<String>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_WEB_NOT_TRANSLATE_LANGUAGES, new SetWebNotTranslateLanguagesRequest.C18049a().mo62672a(str), iGetDataCallback, new SdkSender.IParser<List<String>>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.C542417 */

            /* renamed from: a */
            public List<String> parse(byte[] bArr) throws IOException {
                SetWebNotTranslateLanguagesResponse decode = SetWebNotTranslateLanguagesResponse.ADAPTER.decode(bArr);
                if (decode.not_translate_languages == null) {
                    return Collections.emptyList();
                }
                return new ArrayList(decode.not_translate_languages);
            }
        });
    }

    /* renamed from: a */
    public void mo185631a(String[] strArr, final IGetDataCallback<List<ParcelableLanguageInfo>> iGetDataCallback) {
        final DetectTextsLanguageRequest.C17442a aVar = new DetectTextsLanguageRequest.C17442a();
        final ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(str);
        }
        mo185630a(true, (IGetDataCallback<MineTranslateLanguageSetting>) new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.C542439 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                final List<LanguageInfo> srcLanguages = mineTranslateLanguageSetting.getSrcLanguages();
                if (srcLanguages == null) {
                    srcLanguages = new ArrayList<>();
                }
                SdkSender.asynSendRequestNonWrap(Command.DETECT_TEXT_LANGUAGE, aVar.mo61166a(arrayList), iGetDataCallback, new SdkSender.IParser<List<ParcelableLanguageInfo>>() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.C542439.C542441 */

                    /* renamed from: a */
                    public List<ParcelableLanguageInfo> parse(byte[] bArr) throws IOException {
                        ArrayList arrayList = new ArrayList();
                        for (String str : DetectTextsLanguageResponse.ADAPTER.decode(bArr).language) {
                            LanguageInfo a = C54232a.this.mo185620a(srcLanguages, str);
                            ParcelableLanguageInfo parcelableLanguageInfo = new ParcelableLanguageInfo();
                            parcelableLanguageInfo.mo185705a(str);
                            parcelableLanguageInfo.mo185707b(a.getDisplayName());
                            parcelableLanguageInfo.mo185708c(a.getI18nName());
                            arrayList.add(parcelableLanguageInfo);
                        }
                        return arrayList;
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo185632a(String[] strArr, String str, String str2, ContentType contentType, IGetDataCallback<List<String>> iGetDataCallback) {
        TranslateWebXMLRequest.C18109a aVar = new TranslateWebXMLRequest.C18109a();
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        if (contentType != null) {
            aVar.mo62817a(contentType);
        }
        SdkSender.asynSendRequestNonWrap(Command.TRANSLATE_WEB_XML, aVar.mo62819a(arrayList).mo62818a(str).mo62821b(str2), iGetDataCallback, $$Lambda$a$V2KPexqmELjdPJ09rJXxWCIvMEA.INSTANCE);
    }

    /* renamed from: a */
    public void mo185629a(final String str, final boolean z, final IGetDataCallback<Void> iGetDataCallback) {
        if (TextUtils.isEmpty(str)) {
            iGetDataCallback.onSuccess(null);
        } else {
            mo185630a(true, (IGetDataCallback<MineTranslateLanguageSetting>) new IGetDataCallback<MineTranslateLanguageSetting>() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.AnonymousClass10 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ Void m210642a(byte[] bArr) throws IOException {
                    return null;
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                    if (mineTranslateLanguageSetting == null) {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(null);
                            return;
                        }
                        return;
                    }
                    List<String> blackWebTranslateUrls = mineTranslateLanguageSetting.getBlackWebTranslateUrls();
                    if (blackWebTranslateUrls == null) {
                        blackWebTranslateUrls = new ArrayList<>();
                    }
                    ArrayList arrayList = new ArrayList(blackWebTranslateUrls);
                    if (arrayList.contains(str) && !z) {
                        arrayList.remove(str);
                    } else if (!arrayList.contains(str) && z) {
                        arrayList.add(str);
                    }
                    if (arrayList.size() != blackWebTranslateUrls.size()) {
                        WebTranslationConfig.C18176a aVar = new WebTranslationConfig.C18176a();
                        aVar.mo63033a(arrayList);
                        SdkSender.asynSendRequestNonWrap(Command.PATCH_WEB_TRANSLATION_CONFIG, new PatchWebTranslationConfigRequest.C17849a().mo62204a(aVar.build()), iGetDataCallback, $$Lambda$a$10$58iXzyugtYLolfZn5IwLDeF7Kso.INSTANCE);
                        return;
                    }
                    C53241h.m205900d("TranslateService", "cancel updateWebTranslationUrl, url=" + str + ",enable=" + z);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo185628a(final String str, final String str2, final IGetDataCallback<ParcelableTranslateSettingConfig> iGetDataCallback) {
        mo185630a(false, (IGetDataCallback<MineTranslateLanguageSetting>) new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.C542342 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(final MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                if (MineTranslateLanguageSetting.C54163b.m210276a(mineTranslateLanguageSetting.getGlobalAutoTranslateScope()).mo185402c()) {
                    ParcelableTranslateSettingConfig a = C54232a.this.mo185621a(str, str2, mineTranslateLanguageSetting, (List<String>) null);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(a);
                        return;
                    }
                    return;
                }
                C54232a.this.mo185624a(new IGetDataCallback<List<String>>() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.C542342.C542351 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(List<String> list) {
                        ParcelableTranslateSettingConfig a = C54232a.this.mo185621a(str, str2, mineTranslateLanguageSetting, list);
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(a);
                        }
                    }
                });
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m210623a(byte[] bArr) throws IOException {
        return TranslateWebXMLResponse.ADAPTER.decode(bArr).trg_contents;
    }

    /* renamed from: a */
    public void mo185624a(IGetDataCallback<List<String>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_WEB_NOT_TRANSLATE_LANGUAGES, new GetWebNotTranslateLanguagesRequest.C17771a(), iGetDataCallback, new SdkSender.IParser<List<String>>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.C542406 */

            /* renamed from: a */
            public List<String> parse(byte[] bArr) throws IOException {
                GetWebNotTranslateLanguagesResponse decode = GetWebNotTranslateLanguagesResponse.ADAPTER.decode(bArr);
                if (decode.not_translate_languages == null) {
                    return Collections.emptyList();
                }
                return new ArrayList(decode.not_translate_languages);
            }
        });
    }

    /* renamed from: a */
    private boolean m210624a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(str2);
    }

    /* renamed from: b */
    public void mo185633b(String str, IGetDataCallback<List<String>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DELETE_WEB_NOT_TRANSLATE_LANGUAGES, new DeleteWebNotTranslateLanguagesRequest.C17434a().mo61148a(str), iGetDataCallback, new SdkSender.IParser<List<String>>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.C542428 */

            /* renamed from: a */
            public List<String> parse(byte[] bArr) throws IOException {
                DeleteWebNotTranslateLanguagesResponse decode = DeleteWebNotTranslateLanguagesResponse.ADAPTER.decode(bArr);
                if (decode.not_translate_languages == null) {
                    return Collections.emptyList();
                }
                return new ArrayList(decode.not_translate_languages);
            }
        });
    }

    /* renamed from: a */
    public LanguageInfo mo185620a(List<LanguageInfo> list, String str) {
        if (list == null) {
            return null;
        }
        for (LanguageInfo languageInfo : list) {
            if (languageInfo != null && TextUtils.equals(languageInfo.getKey(), str)) {
                return languageInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo185622a(int i, IGetDataCallback<Void> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_AUTO_TRANSLATE_SCOPE, new SetAutoTranslateScopeRequest.C18039a().mo62649a(Integer.valueOf(i)), iGetDataCallback, $$Lambda$a$t0wDvS23_aYFCd3z2Di2FF8DUs.INSTANCE);
    }

    /* renamed from: a */
    public void mo185623a(final int i, final boolean z, final IGetDataCallback<Void> iGetDataCallback) {
        mo185630a(true, (IGetDataCallback<MineTranslateLanguageSetting>) new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a.C542374 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                boolean z;
                if (mineTranslateLanguageSetting == null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(null);
                        return;
                    }
                    return;
                }
                C54377c a = C54377c.m211101a(mineTranslateLanguageSetting.getGlobalAutoTranslateScope());
                if (!mineTranslateLanguageSetting.isGlobalAutoTranslate() || !a.mo185975b(i)) {
                    z = false;
                } else {
                    z = true;
                }
                boolean z2 = z;
                if (z == z2) {
                    IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                    if (iGetDataCallback2 != null) {
                        iGetDataCallback2.onSuccess(null);
                        return;
                    }
                    return;
                }
                if (z2) {
                    a.mo185976c(i);
                } else {
                    a.mo185978d(i);
                }
                C54232a.this.mo185622a(a.mo185982g(), iGetDataCallback);
            }
        });
    }

    /* renamed from: a */
    public void mo185625a(String str, int i, IGetDataCallback<Void> iGetDataCallback) {
        PatchLanguagesAutoTranslationScopeRequest.C17829a aVar = new PatchLanguagesAutoTranslationScopeRequest.C17829a();
        HashMap hashMap = new HashMap();
        hashMap.put(str, Integer.valueOf(i));
        SdkSender.asynSendRequestNonWrap(Command.PATCH_LANGUAGE_AUTO_TRANSLATE_SCOPE, aVar.mo62147a(hashMap), iGetDataCallback, $$Lambda$a$3sStfRbgv8Ibtt_tFhAUakFylgM.INSTANCE);
    }

    /* renamed from: a */
    public ParcelableTranslateSettingConfig mo185621a(String str, String str2, MineTranslateLanguageSetting mineTranslateLanguageSetting, List<String> list) {
        List<LanguageInfo> srcLanguages;
        LanguageInfo a;
        boolean z;
        ParcelableTranslateSettingConfig parcelableTranslateSettingConfig = new ParcelableTranslateSettingConfig();
        parcelableTranslateSettingConfig.mo185717a(str2);
        if (mineTranslateLanguageSetting == null || (a = mo185620a((srcLanguages = mineTranslateLanguageSetting.getSrcLanguages()), str)) == null) {
            return parcelableTranslateSettingConfig;
        }
        ParcelableLanguageInfo parcelableLanguageInfo = new ParcelableLanguageInfo();
        parcelableLanguageInfo.mo185705a(str);
        parcelableLanguageInfo.mo185708c(a.getI18nName());
        parcelableLanguageInfo.mo185707b(a.getDisplayName());
        parcelableTranslateSettingConfig.mo185716a(parcelableLanguageInfo);
        LanguageInfo a2 = mo185620a(srcLanguages, mineTranslateLanguageSetting.getTargetLanguageKey());
        if (a2 == null) {
            return parcelableTranslateSettingConfig;
        }
        ParcelableLanguageInfo parcelableLanguageInfo2 = new ParcelableLanguageInfo();
        parcelableLanguageInfo2.mo185705a(a2.getKey());
        parcelableLanguageInfo2.mo185708c(a2.getI18nName());
        parcelableLanguageInfo2.mo185707b(a2.getDisplayName());
        parcelableTranslateSettingConfig.mo185720b(parcelableLanguageInfo2);
        if (!C54377c.m211101a(mineTranslateLanguageSetting.getGlobalAutoTranslateScope()).mo185980e() || !mineTranslateLanguageSetting.isGlobalAutoTranslate()) {
            z = false;
        } else {
            z = true;
        }
        parcelableTranslateSettingConfig.mo185718a(z);
        if (MineTranslateLanguageSetting.C54163b.m210276a(mineTranslateLanguageSetting.getGlobalAutoTranslateScope()).mo185402c()) {
            parcelableTranslateSettingConfig.mo185721b(!C54377c.m211101a(a.getAutoTranslateScope().mo185982g()).mo185980e());
        } else if (list != null) {
            parcelableTranslateSettingConfig.mo185721b(false);
            Iterator<String> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals(it.next(), str)) {
                        parcelableTranslateSettingConfig.mo185721b(true);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        parcelableTranslateSettingConfig.mo185723c(false);
        List<String> blackWebTranslateUrls = mineTranslateLanguageSetting.getBlackWebTranslateUrls();
        if (blackWebTranslateUrls != null) {
            Iterator<String> it2 = blackWebTranslateUrls.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m210624a(str2, it2.next())) {
                        parcelableTranslateSettingConfig.mo185723c(true);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return parcelableTranslateSettingConfig;
    }
}
