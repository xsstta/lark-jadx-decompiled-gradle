package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesRequest;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesResponse;
import com.bytedance.lark.pb.im.v1.SrcLanguageConfig;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.page.content.common.impl.translate.p2667c.C54246a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageDisplayRule;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageDisplaySettingInfo;
import com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.d */
public class C54363d extends BaseModel implements AbstractC54318a.AbstractC54322c<LanguageDisplayRule> {

    /* renamed from: a */
    public List<AbstractC54376b<LanguageDisplayRule>> f134480a = Collections.emptyList();

    /* renamed from: b */
    public String f134481b = "";

    /* renamed from: c */
    public AbstractC54318a.AbstractC54322c.AbstractC54323a<LanguageDisplayRule> f134482c;

    /* renamed from: d */
    private final AbstractC54153a f134483d = new AbstractC54153a() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54363d.C543641 */

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: a */
        public void mo185338a(int i) {
        }

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: a */
        public void mo185339a(int i, Map<String, Integer> map) {
        }

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: a */
        public void mo185340a(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
        }

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: a */
        public void mo185341a(List<String> list) {
        }

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: b */
        public void mo185343b(Map<String, Integer> map) {
        }

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: a */
        public void mo185342a(Map<String, Integer> map) {
            if (!(C54363d.this.f134480a == null || map == null)) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    AbstractC54376b<LanguageDisplayRule> a = C54363d.this.mo185932a(entry.getKey());
                    if (a != null) {
                        a.mo185941a(LanguageDisplayRule.fromValue(entry.getValue().intValue()));
                    }
                }
                if (C54363d.this.f134482c != null) {
                    AbstractC54318a.AbstractC54322c.AbstractC54323a<LanguageDisplayRule> aVar = C54363d.this.f134482c;
                    C54363d dVar = C54363d.this;
                    aVar.onSettingUpdated(dVar.mo185933a(dVar.f134480a, C54363d.this.f134481b));
                }
            }
        }
    };

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C54115c.m210080a().mo178298j().mo178370a(this.f134483d);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C54115c.m210080a().mo178298j().mo178371b(this.f134483d);
        this.f134482c = null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.a$c$a] */
    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54322c
    /* renamed from: a */
    public void mo185856a(AbstractC54318a.AbstractC54322c.AbstractC54323a<LanguageDisplayRule> aVar) {
        this.f134482c = aVar;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54322c
    /* renamed from: a */
    public void mo185855a(IGetDataCallback<List<AbstractC54376b<LanguageDisplayRule>>> iGetDataCallback) {
        GetTranslateLanguagesRequest.C17729a aVar = new GetTranslateLanguagesRequest.C17729a();
        final UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        SdkSender.asynSendRequestNonWrap(Command.GET_TRANSLATE_LANGUAGES_SETTING, aVar.mo61896a(SyncDataStrategy.FORCE_SERVER), new IGetDataCallback<List<AbstractC54376b<LanguageDisplayRule>>>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54363d.C543652 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                wrapAndAddGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(List<AbstractC54376b<LanguageDisplayRule>> list) {
                if (list != null) {
                    C54363d.this.f134480a = new ArrayList(list);
                }
                wrapAndAddGetDataCallback.onSuccess(list);
            }
        }, $$Lambda$d$TwhQKWV9u3m8FpaZfYdseQoKlJ4.INSTANCE);
    }

    /* renamed from: a */
    public AbstractC54376b<LanguageDisplayRule> mo185932a(String str) {
        List<AbstractC54376b<LanguageDisplayRule>> list = this.f134480a;
        if (list == null) {
            return null;
        }
        for (AbstractC54376b<LanguageDisplayRule> bVar : list) {
            if (TextUtils.equals(bVar.mo185939a(), str)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m211045a(byte[] bArr) throws IOException {
        GetTranslateLanguagesResponse decode = GetTranslateLanguagesResponse.ADAPTER.decode(bArr);
        Map<String, SrcLanguageConfig> map = decode.src_languages_config;
        if (map == null || map.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> list = decode.src_lanugages;
        ArrayList arrayList = new ArrayList(map.size());
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                SrcLanguageConfig srcLanguageConfig = map.get(str);
                if (srcLanguageConfig != null) {
                    LanguageDisplaySettingInfo languageDisplaySettingInfo = new LanguageDisplaySettingInfo();
                    languageDisplaySettingInfo.mo185959a(str);
                    languageDisplaySettingInfo.mo185960b(srcLanguageConfig.language);
                    languageDisplaySettingInfo.mo185961c(C54246a.m210655a(srcLanguageConfig.i18n_language));
                    languageDisplaySettingInfo.mo185941a(LanguageDisplayRule.fromValue(srcLanguageConfig.rule.getValue()));
                    arrayList.add(languageDisplaySettingInfo);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m211046a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return str.contains(str2);
    }

    /* renamed from: a */
    public List<AbstractC54376b<LanguageDisplayRule>> mo185933a(List<AbstractC54376b<LanguageDisplayRule>> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC54376b<LanguageDisplayRule> bVar : list) {
            if (bVar != null && (m211046a(bVar.mo185943b(), str) || m211046a(bVar.mo185945c(), str))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54322c
    /* renamed from: a */
    public void mo185857a(String str, IGetDataCallback<List<AbstractC54376b<LanguageDisplayRule>>> iGetDataCallback) {
        this.f134481b = str;
        getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback).onSuccess(mo185933a(this.f134480a, str));
    }
}
