package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto;

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
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageAutoTranslateSettingInfo;
import com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.d */
public class C54338d extends BaseModel implements AbstractC54318a.AbstractC54322c<C54377c> {

    /* renamed from: a */
    public List<AbstractC54376b<C54377c>> f134433a = Collections.emptyList();

    /* renamed from: b */
    public String f134434b = "";

    /* renamed from: c */
    public AbstractC54318a.AbstractC54322c.AbstractC54323a<C54377c> f134435c;

    /* renamed from: d */
    private final AbstractC54153a f134436d = new AbstractC54153a() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54338d.C543391 */

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
        /* renamed from: a */
        public void mo185342a(Map<String, Integer> map) {
        }

        @Override // com.ss.android.lark.setting.page.content.common.p2661a.AbstractC54153a
        /* renamed from: b */
        public void mo185343b(Map<String, Integer> map) {
            if (!(C54338d.this.f134433a == null || map == null)) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    AbstractC54376b<C54377c> a = C54338d.this.mo185893a(entry.getKey());
                    if (a != null) {
                        a.mo185941a(C54377c.m211101a(entry.getValue().intValue()));
                    }
                }
                if (C54338d.this.f134435c != null) {
                    AbstractC54318a.AbstractC54322c.AbstractC54323a<C54377c> aVar = C54338d.this.f134435c;
                    C54338d dVar = C54338d.this;
                    aVar.onSettingUpdated(dVar.mo185894a(dVar.f134433a, C54338d.this.f134434b));
                }
            }
        }
    };

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C54115c.m210080a().mo178298j().mo178370a(this.f134436d);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C54115c.m210080a().mo178298j().mo178371b(this.f134436d);
        this.f134435c = null;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54322c
    /* renamed from: a */
    public void mo185856a(AbstractC54318a.AbstractC54322c.AbstractC54323a<C54377c> aVar) {
        this.f134435c = aVar;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54322c
    /* renamed from: a */
    public void mo185855a(IGetDataCallback<List<AbstractC54376b<C54377c>>> iGetDataCallback) {
        GetTranslateLanguagesRequest.C17729a aVar = new GetTranslateLanguagesRequest.C17729a();
        final UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        SdkSender.asynSendRequestNonWrap(Command.GET_TRANSLATE_LANGUAGES_SETTING, aVar.mo61896a(SyncDataStrategy.FORCE_SERVER), new IGetDataCallback<List<AbstractC54376b<C54377c>>>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54338d.C543402 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                wrapAndAddGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(List<AbstractC54376b<C54377c>> list) {
                if (list != null) {
                    C54338d.this.f134433a = new ArrayList(list);
                }
                wrapAndAddGetDataCallback.onSuccess(list);
            }
        }, $$Lambda$d$UyTqsCJB4bRifUvL7OQmPDq7f8.INSTANCE);
    }

    /* renamed from: a */
    public AbstractC54376b<C54377c> mo185893a(String str) {
        List<AbstractC54376b<C54377c>> list = this.f134433a;
        if (list == null) {
            return null;
        }
        for (AbstractC54376b<C54377c> bVar : list) {
            if (TextUtils.equals(bVar.mo185939a(), str)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m210963a(byte[] bArr) throws IOException {
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
                    LanguageAutoTranslateSettingInfo languageAutoTranslateSettingInfo = new LanguageAutoTranslateSettingInfo();
                    languageAutoTranslateSettingInfo.mo185942a(str);
                    languageAutoTranslateSettingInfo.mo185944b(srcLanguageConfig.language);
                    languageAutoTranslateSettingInfo.mo185946c(C54246a.m210655a(srcLanguageConfig.i18n_language));
                    languageAutoTranslateSettingInfo.mo185941a(C54377c.m211101a(srcLanguageConfig.scopes.intValue()));
                    arrayList.add(languageAutoTranslateSettingInfo);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m210964a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return str.contains(str2);
    }

    /* renamed from: a */
    public List<AbstractC54376b<C54377c>> mo185894a(List<AbstractC54376b<C54377c>> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC54376b<C54377c> bVar : list) {
            if (bVar != null && (m210964a(bVar.mo185943b(), str) || m210964a(bVar.mo185945c(), str))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54322c
    /* renamed from: a */
    public void mo185857a(String str, IGetDataCallback<List<AbstractC54376b<C54377c>>> iGetDataCallback) {
        this.f134434b = str;
        getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback).onSuccess(mo185894a(this.f134433a, str));
    }
}
