package com.ss.android.lark.setting.page.content.common.impl.translate.mvp;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DisplayRule;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesRequest;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesResponse;
import com.bytedance.lark.pb.im.v1.LanguagesConfiguration;
import com.bytedance.lark.pb.im.v1.SetAutoTranslateGlobalSwitchRequest;
import com.bytedance.lark.pb.im.v1.SrcLanguageConfig;
import com.bytedance.lark.pb.im.v1.TrgLanguageConfig;
import com.bytedance.lark.pb.im.v1.WebTranslationConfig;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e;
import com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a;
import com.ss.android.lark.setting.page.content.common.impl.translate.p2667c.C54246a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.h */
public class C54297h extends BaseModel implements AbstractC54282e.AbstractC54283a {

    /* renamed from: a */
    public MineTranslateLanguageSetting f134365a;

    /* renamed from: b */
    private AbstractC54282e.AbstractC54283a.AbstractC54284a f134366b;

    /* renamed from: c */
    private final ISettingDependency.ITranslateDependency f134367c = C54115c.m210080a().mo178297i();

    /* renamed from: d */
    private final AbstractC54153a f134368d = new AbstractC54153a() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h.C542981 */

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: a */
        public void mo185338a(int i) {
            Log.m165389i("TAG_TRANSLATE_TRANSLATE_SETTING_MODEL", "onPushGlobalAutoTranslateScope; switchScope=" + i);
            C54297h.this.mo185808a(true, (IGetDataCallback<MineTranslateLanguageSetting>) new IGetDataCallback<MineTranslateLanguageSetting>() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h.C542981.C542991 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                    C54297h.this.mo185816a(mineTranslateLanguageSetting);
                }
            });
        }

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: b */
        public void mo185343b(Map<String, Integer> map) {
            Map<String, Integer> map2;
            StringBuilder sb = new StringBuilder();
            sb.append("onPushSpecificAutoTranslateScopeChanged; autoTranslateSetting=");
            if (map == null) {
                map2 = Collections.emptyMap();
            } else {
                map2 = map;
            }
            sb.append(JSON.toJSONString(map2));
            Log.m165389i("TAG_TRANSLATE_TRANSLATE_SETTING_MODEL", sb.toString());
            if (!(C54297h.this.f134365a == null || map == null || map.isEmpty())) {
                for (LanguageInfo languageInfo : C54297h.this.f134365a.getSrcLanguages()) {
                    Integer num = map.get(languageInfo.getKey());
                    if (num != null) {
                        languageInfo.setAutoTranslateScope(C54377c.m211101a(num.intValue()));
                    }
                }
                C54297h hVar = C54297h.this;
                hVar.mo185816a(hVar.f134365a);
            }
        }

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: a */
        public void mo185340a(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
            if (mineTranslateLanguageSetting != null) {
                String targetLanguageKey = mineTranslateLanguageSetting.getTargetLanguageKey();
                if (!(C54297h.this.f134365a == null || targetLanguageKey == null)) {
                    C54297h.this.f134365a.setTargetLanguageKey(targetLanguageKey);
                    for (LanguageInfo languageInfo : C54297h.this.f134365a.getSupportedLanguageList()) {
                        languageInfo.setTargetLanguage(targetLanguageKey.equals(languageInfo.getKey()));
                    }
                }
                if (C54297h.this.f134365a == null) {
                    C54297h.this.mo185816a(mineTranslateLanguageSetting);
                } else {
                    C54297h hVar = C54297h.this;
                    hVar.mo185816a(hVar.f134365a);
                }
                Log.m165389i("TAG_TRANSLATE_TRANSLATE_SETTING_MODEL", "onPushTranslateSetting ");
            }
        }

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: a */
        public void mo185341a(List<String> list) {
            if (list != null) {
                if (C54297h.this.f134365a != null) {
                    C54297h.this.f134365a.setDisAutoTranslateKeySet(new HashSet(list));
                    C54297h hVar = C54297h.this;
                    hVar.mo185816a(hVar.f134365a);
                }
                if (list != null) {
                    Log.m165389i("TAG_TRANSLATE_TRANSLATE_SETTING_MODEL", "onPushDisableTranslateSetting " + Arrays.toString(list.toArray()));
                }
            }
        }

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: a */
        public void mo185342a(Map<String, Integer> map) {
            Map<String, Integer> map2;
            StringBuilder sb = new StringBuilder();
            sb.append("onPushSpecificDisplayChanged; displaySetting=");
            if (map == null) {
                map2 = Collections.emptyMap();
            } else {
                map2 = map;
            }
            sb.append(JSON.toJSONString(map2));
            Log.m165389i("TAG_TRANSLATE_TRANSLATE_SETTING_MODEL", sb.toString());
            if (C54297h.this.f134365a != null) {
                if (map != null && !map.isEmpty()) {
                    Map<String, Integer> specificDisplayRuleMap = C54297h.this.f134365a.getSpecificDisplayRuleMap();
                    if (specificDisplayRuleMap != null) {
                        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                            specificDisplayRuleMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    C54297h.this.f134365a.setSpecificDisplayRuleMap(specificDisplayRuleMap);
                    for (LanguageInfo languageInfo : C54297h.this.f134365a.getSrcLanguages()) {
                        Integer num = map.get(languageInfo.getKey());
                        if (num != null) {
                            languageInfo.setDisplayRule(num.intValue());
                        }
                    }
                }
                C54297h hVar = C54297h.this;
                hVar.mo185816a(hVar.f134365a);
            }
        }

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: a */
        public void mo185339a(int i, Map<String, Integer> map) {
            int i2;
            if (C54297h.this.f134365a != null) {
                C54297h.this.f134365a.setDefaultDisplayRule(i);
                if (map != null) {
                    C54297h.this.f134365a.setSpecificDisplayRuleMap(map);
                    for (LanguageInfo languageInfo : C54297h.this.f134365a.getSupportedLanguageList()) {
                        Integer num = map.get(languageInfo.getKey());
                        if (num != null) {
                            i2 = num.intValue();
                        } else {
                            i2 = i;
                        }
                        languageInfo.setDisplayRule(i2);
                    }
                }
                C54297h hVar = C54297h.this;
                hVar.mo185816a(hVar.f134365a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onPushDisplayRuleSetting; onPushDisplayRuleSetting=");
            sb.append(i);
            sb.append(";displayRuleMap");
            if (map == null) {
                map = Collections.emptyMap();
            }
            sb.append(JSON.toJSONString(map));
            Log.m165389i("TAG_TRANSLATE_TRANSLATE_SETTING_MODEL", sb.toString());
        }
    };

    /* renamed from: lambda$fykhcw-36I0O8Bak3lpesRtomJo  reason: not valid java name */
    public static /* synthetic */ Boolean m270964lambda$fykhcw36I0O8Bak3lpesRtomJo(byte[] bArr) {
        return true;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a
    /* renamed from: a */
    public MineTranslateLanguageSetting mo185798a() {
        return this.f134365a;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a
    /* renamed from: a */
    public void mo185808a(boolean z, IGetDataCallback<MineTranslateLanguageSetting> iGetDataCallback) {
        m210838c(z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a
    /* renamed from: a */
    public void mo185806a(List<String> list, final IGetDataCallback<Boolean> iGetDataCallback) {
        this.f134367c.mo178379a(list, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h.C543035 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bool);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a
    /* renamed from: a */
    public void mo185807a(Set<String> set) {
        HashSet hashSet = new HashSet(set);
        HashSet hashSet2 = new HashSet(this.f134365a.getDisAutoTranslateKeySet());
        for (LanguageInfo languageInfo : this.f134365a.getSupportedLanguageList()) {
            languageInfo.setDisAutoTranslate(hashSet.contains(languageInfo.getKey()));
        }
        this.f134366b.mo185773a(this.f134365a);
        hashSet.removeAll(hashSet2);
        hashSet2.removeAll(set);
        this.f134366b.mo185774a(!hashSet.isEmpty() || !hashSet2.isEmpty());
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C54115c.m210080a().mo178298j().mo178370a(this.f134368d);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C54115c.m210080a().mo178298j().mo178371b(this.f134368d);
        this.f134366b = null;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a
    /* renamed from: a */
    public void mo185802a(IGetDataCallback<MineTranslateLanguageSetting> iGetDataCallback) {
        m210838c(true, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo185816a(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
        AbstractC54282e.AbstractC54283a.AbstractC54284a aVar;
        if (mineTranslateLanguageSetting != null && (aVar = this.f134366b) != null) {
            aVar.mo185773a(mineTranslateLanguageSetting);
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a
    /* renamed from: a */
    public void mo185803a(AbstractC54282e.AbstractC54283a.AbstractC54284a aVar) {
        this.f134366b = aVar;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a
    /* renamed from: a */
    public void mo185799a(final int i, final IGetDataCallback<Boolean> iGetDataCallback) {
        C54232a.m210622a().mo185622a(i, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h.C543068 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Void r2) {
                if (C54297h.this.f134365a != null) {
                    C54297h.this.f134365a.setGlobalAutoTranslateScope(i);
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(true);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a
    /* renamed from: b */
    public void mo185809b(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_AUTO_TRANSLATE_GLOBAL_SWITCH, new SetAutoTranslateGlobalSwitchRequest.C18037a().mo62644a(Boolean.valueOf(z)), getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), $$Lambda$h$fykhcw36I0O8Bak3lpesRtomJo.INSTANCE);
    }

    /* renamed from: c */
    private void m210838c(boolean z, final IGetDataCallback<MineTranslateLanguageSetting> iGetDataCallback) {
        GetTranslateLanguagesRequest.C17729a aVar = new GetTranslateLanguagesRequest.C17729a();
        if (z) {
            aVar.mo61896a(SyncDataStrategy.FORCE_SERVER);
        } else {
            aVar.mo61896a(SyncDataStrategy.TRY_LOCAL);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_TRANSLATE_LANGUAGES_SETTING, aVar, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h.C543013 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(mineTranslateLanguageSetting);
                }
                if (mineTranslateLanguageSetting != null) {
                    C54297h.this.f134365a = mineTranslateLanguageSetting;
                }
            }
        }), new SdkSender.IParser<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h.C543002 */

            /* renamed from: a */
            public MineTranslateLanguageSetting parse(byte[] bArr) throws IOException {
                int i;
                int i2;
                Map<String, LanguagesConfiguration> map;
                int i3;
                GetTranslateLanguagesResponse decode = GetTranslateLanguagesResponse.ADAPTER.decode(bArr);
                List<String> list = decode.dis_auto_translate_languages_conf;
                ArrayList arrayList = new ArrayList();
                if (!(decode.src_lanugages == null || decode.src_languages_config == null || list == null)) {
                    for (String str : decode.src_lanugages) {
                        SrcLanguageConfig srcLanguageConfig = decode.src_languages_config.get(str);
                        if (srcLanguageConfig != null) {
                            arrayList.add(new LanguageInfo(str, srcLanguageConfig.language, false, list.contains(str), srcLanguageConfig.rule.getValue(), C54377c.m211101a(srcLanguageConfig.scopes.intValue()), C54246a.m210655a(srcLanguageConfig.i18n_language), ""));
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (!(decode.language_keys == null || decode.trg_languages_config == null || list == null)) {
                    if (decode.languages_conf == null) {
                        map = Collections.emptyMap();
                    } else {
                        map = decode.languages_conf;
                    }
                    for (String str2 : decode.language_keys) {
                        TrgLanguageConfig trgLanguageConfig = decode.trg_languages_config.get(str2);
                        LanguagesConfiguration languagesConfiguration = map.get(str2);
                        if (trgLanguageConfig != null) {
                            if (languagesConfiguration == null) {
                                i3 = DisplayRule.UNKNOWN_RULE.getValue();
                            } else {
                                i3 = languagesConfiguration.rule.getValue();
                            }
                            arrayList2.add(new LanguageInfo(str2, trgLanguageConfig.language, TextUtils.equals(str2, decode.target_language), list.contains(str2), i3, C54377c.m211101a(C54377c.f134509a), C54246a.m210655a(trgLanguageConfig.i18n_language), trgLanguageConfig.translation_doc));
                        }
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
                WebTranslationConfig webTranslationConfig = decode.web_translation_config;
                List emptyList = Collections.emptyList();
                if (!(webTranslationConfig == null || webTranslationConfig.black_domains == null)) {
                    emptyList = new ArrayList(webTranslationConfig.black_domains);
                }
                if (decode.auto_translate_global_switch.booleanValue()) {
                    i2 = decode.switch_scopes.intValue();
                } else {
                    i2 = 0;
                }
                return new MineTranslateLanguageSetting(i2, decode.target_language, arrayList2, new HashSet(decode.dis_auto_translate_languages_conf), i, hashMap, arrayList, emptyList, decode.web_language_keys);
            }
        });
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a
    /* renamed from: a */
    public void mo185800a(int i, Set<String> set) {
        boolean z;
        int i2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet(set);
        for (Map.Entry<String, Integer> entry : this.f134365a.getSpecificDisplayRuleMap().entrySet()) {
            if (entry.getValue().intValue() == i) {
                hashSet.add(entry.getKey());
            }
        }
        for (LanguageInfo languageInfo : this.f134365a.getSupportedLanguageList()) {
            if (set.contains(languageInfo.getKey())) {
                i2 = i;
            } else {
                i2 = this.f134365a.getDefaultDisplayRule();
            }
            languageInfo.setDisplayRule(i2);
        }
        this.f134366b.mo185773a(this.f134365a);
        hashSet2.removeAll(hashSet);
        hashSet.removeAll(set);
        if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.f134366b.mo185774a(z);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a
    /* renamed from: a */
    public void mo185805a(final String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        this.f134367c.mo178378a(str, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h.C543024 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    C54297h.this.f134365a.setTargetLanguageKey(str);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(bool);
                    }
                }
            }
        }));
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a
    /* renamed from: a */
    public void mo185801a(int i, Set<String> set, final IGetDataCallback<Boolean> iGetDataCallback) {
        HashMap hashMap = new HashMap();
        if (set != null) {
            for (String str : set) {
                hashMap.put(str, Integer.valueOf(i));
            }
        }
        this.f134367c.mo178377a(-1, hashMap, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h.C543057 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bool);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54283a
    /* renamed from: a */
    public void mo185804a(String str, int i, final IGetDataCallback<Boolean> iGetDataCallback) {
        if (this.f134365a != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f134365a.getSpecificDisplayRuleMap().put(str, Integer.valueOf(i));
                i = -1;
            }
            this.f134367c.mo178377a(i, this.f134365a.getSpecificDisplayRuleMap(), getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h.C543046 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(bool);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }));
        }
    }
}
