package com.ss.android.lark.setting.page.content.common.impl.translate.manis;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.DetectRequest;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.DetectResponse;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.GetTargetLangListResponse;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableError;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableLanguageInfo;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableTranslateSettingConfig;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.TransmissionData;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.WebTranslateRequest;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.WebTranslateResponse;
import com.ss.android.lark.setting.page.content.common.impl.translate.p2666b.C54232a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import java.util.ArrayList;
import java.util.List;

@RemoteServiceImpl(service = TranslateProxy.class)
public class TranslateProxyImpl implements TranslateProxy {
    private final Context mContext;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxyImpl$a */
    private static class C54254a implements IGetDataCallback<Void> {

        /* renamed from: a */
        private final AbstractC54255a.AbstractC54257b f134306a;

        public C54254a(AbstractC54255a.AbstractC54257b bVar) {
            this.f134306a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(Void r1) {
            AbstractC54255a.AbstractC54257b bVar = this.f134306a;
            if (bVar != null) {
                bVar.onSuccess();
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            AbstractC54255a.AbstractC54257b bVar = this.f134306a;
            if (bVar != null) {
                bVar.onError(ParcelableError.m210683a(errorResult));
            }
        }
    }

    public TranslateProxyImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void getTargetLangList(final AbstractC54255a.AbstractC54256a aVar) {
        C54232a.m210622a().mo185630a(false, (IGetDataCallback<MineTranslateLanguageSetting>) new IGetDataCallback<MineTranslateLanguageSetting>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxyImpl.C542535 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                aVar.onError(ParcelableError.m210683a(errorResult));
            }

            /* renamed from: a */
            public void onSuccess(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
                List<LanguageInfo> supportedLanguageList = mineTranslateLanguageSetting.getSupportedLanguageList();
                List<String> webLanguageKeys = mineTranslateLanguageSetting.getWebLanguageKeys();
                if (supportedLanguageList == null || webLanguageKeys == null) {
                    AbstractC54255a.AbstractC54256a aVar = aVar;
                    if (aVar != null) {
                        aVar.onError(ParcelableError.m210683a(new ErrorResult(-1, "got empty languageInfo or webLanguageKeys")));
                        return;
                    }
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (String str : webLanguageKeys) {
                    LanguageInfo findLanguageInfoByKey = TranslateProxyImpl.this.findLanguageInfoByKey(str, supportedLanguageList);
                    if (findLanguageInfoByKey == null) {
                        Log.m165397w("TranslateProxyImpl", "can't find language;key=" + str);
                    } else {
                        ParcelableLanguageInfo parcelableLanguageInfo = new ParcelableLanguageInfo();
                        parcelableLanguageInfo.mo185705a(findLanguageInfoByKey.getKey());
                        parcelableLanguageInfo.mo185707b(findLanguageInfoByKey.getDisplayName());
                        parcelableLanguageInfo.mo185708c(findLanguageInfoByKey.getI18nName());
                        arrayList.add(parcelableLanguageInfo);
                    }
                }
                AbstractC54255a.AbstractC54256a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.onSuccess(new TransmissionData(new GetTargetLangListResponse(arrayList)));
                }
            }
        });
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void setAutoTranslate(boolean z, AbstractC54255a.AbstractC54257b bVar) {
        C54232a.m210622a().mo185623a(MineTranslateLanguageSetting.C54163b.f134068e, z, new C54254a(bVar));
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void updateGlobalAutoTranslateScope(int i, final AbstractC54255a.AbstractC54257b bVar) {
        C54232a.m210622a().mo185622a(i, new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxyImpl.C542491 */

            /* renamed from: a */
            public void onSuccess(Void r1) {
                bVar.onSuccess();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                bVar.onError(new ParcelableError(errorResult));
            }
        });
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void detectSourceLanguage(TransmissionData transmissionData, final AbstractC54255a.AbstractC54256a aVar) {
        C54232a.m210622a().mo185631a(((DetectRequest) transmissionData.mo185733a(DetectRequest.CREATOR)).mo185676a(), new IGetDataCallback<List<ParcelableLanguageInfo>>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxyImpl.C542502 */

            /* renamed from: a */
            public void onSuccess(List<ParcelableLanguageInfo> list) {
                aVar.onSuccess(new TransmissionData(new DetectResponse(list)));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                aVar.onError(ParcelableError.m210683a(errorResult));
            }
        });
    }

    public LanguageInfo findLanguageInfoByKey(String str, List<LanguageInfo> list) {
        if (list != null && !TextUtils.isEmpty(str)) {
            for (LanguageInfo languageInfo : list) {
                if (TextUtils.equals(languageInfo.getKey(), str)) {
                    return languageInfo;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void sendTranslateRequest(TransmissionData transmissionData, final AbstractC54255a.AbstractC54256a aVar) {
        WebTranslateRequest webTranslateRequest = (WebTranslateRequest) transmissionData.mo185733a(WebTranslateRequest.CREATOR);
        if (webTranslateRequest != null) {
            C54232a.m210622a().mo185632a(webTranslateRequest.mo185742c(), webTranslateRequest.mo185740a(), webTranslateRequest.mo185741b(), null, new IGetDataCallback<List<String>>() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxyImpl.C542513 */

                /* renamed from: a */
                public void onSuccess(List<String> list) {
                    aVar.onSuccess(new TransmissionData(new WebTranslateResponse(list)));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    aVar.onError(ParcelableError.m210683a(errorResult));
                }
            });
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void getWebTranslateSetting(String str, String str2, final AbstractC54255a.AbstractC54256a aVar) {
        C54232a.m210622a().mo185628a(str, str2, new IGetDataCallback<ParcelableTranslateSettingConfig>() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxyImpl.C542524 */

            /* renamed from: a */
            public void onSuccess(ParcelableTranslateSettingConfig parcelableTranslateSettingConfig) {
                aVar.onSuccess(new TransmissionData(parcelableTranslateSettingConfig));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                aVar.onError(ParcelableError.m210683a(errorResult));
            }
        });
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void setUnTranslateThisSite(String str, boolean z, AbstractC54255a.AbstractC54257b bVar) {
        C54232a.m210622a().mo185629a(str, z, new C54254a(bVar));
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void setUnTranslateThisLanguage(TransmissionData transmissionData, boolean z, AbstractC54255a.AbstractC54257b bVar) {
        ParcelableLanguageInfo parcelableLanguageInfo = (ParcelableLanguageInfo) transmissionData.mo185733a(ParcelableLanguageInfo.CREATOR);
        if (parcelableLanguageInfo != null) {
            C54232a.m210622a().mo185626a(parcelableLanguageInfo.mo185704a(), C54377c.f134513e, !z, new C54254a(bVar));
        }
    }
}
