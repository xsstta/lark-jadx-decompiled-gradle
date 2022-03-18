package com.ss.android.lark.chat.api.service.p1600b;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DisplayRule;
import com.bytedance.lark.pb.basic.v1.MessageSource;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesRequest;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesResponse;
import com.bytedance.lark.pb.im.v1.LanguagesConfiguration;
import com.bytedance.lark.pb.im.v1.PutDisableAutoTranslateLanguagesRequest;
import com.bytedance.lark.pb.im.v1.PutLanguagesConfigurationRequest;
import com.bytedance.lark.pb.im.v1.SetAutoTranslateGlobalSwitchRequest;
import com.bytedance.lark.pb.im.v1.SetAutoTranslateScopeRequest;
import com.bytedance.lark.pb.im.v1.SetTranslateLanguageRequest;
import com.bytedance.lark.pb.im.v1.SetTranslateLanguageResponse;
import com.bytedance.lark.pb.im.v1.TranslateMessageContext;
import com.bytedance.lark.pb.im.v1.TranslateMessagesV3Request;
import com.bytedance.lark.pb.im.v1.TranslateMessagesV3Response;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.api.AbstractC32810b;
import com.ss.android.lark.chat.api.service.AbstractC32908l;
import com.ss.android.lark.chat.entity.translate.TranslateLanguageSetting;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.p2851u.C57343d;
import com.ss.android.lark.p2851u.p2852a.C57336y;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.statistics.translate.TranslateHitPoint;
import com.ss.android.lark.widget.photo_picker.service.TranslateImageService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.api.service.b.j */
public class C32895j implements AbstractC32908l {

    /* renamed from: a */
    AbstractC32810b f84503a = new C57343d();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.api.service.b.j$a */
    public static class C32900a {

        /* renamed from: a */
        static C32895j f84510a = new C32895j();
    }

    /* renamed from: lambda$S-cronolaccGUnAsSAhHoU7h1fQ  reason: not valid java name */
    public static /* synthetic */ Boolean m270342lambda$ScronolaccGUnAsSAhHoU7h1fQ(byte[] bArr) {
        return true;
    }

    /* renamed from: lambda$ZLCMSrgEI-xY3I1kk-9Lxq_DILE  reason: not valid java name */
    public static /* synthetic */ Boolean m270343lambda$ZLCMSrgEIxY3I1kk9Lxq_DILE(byte[] bArr) {
        return true;
    }

    public static /* synthetic */ Boolean lambda$ndjwY4KGG5HdPEYp2GOCPrvt0gM(byte[] bArr) {
        return true;
    }

    public static /* synthetic */ Boolean lambda$uZgIWAa7wqsZkShcaGZImwupRtY(byte[] bArr) {
        return true;
    }

    /* renamed from: a */
    public static C32895j m126597a() {
        return C32900a.f84510a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ C36874a m126598a(byte[] bArr) throws IOException {
        return C57336y.m222239a(this.f84503a, TranslateMessagesV3Response.ADAPTER.decode(bArr));
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32908l
    /* renamed from: a */
    public void mo121377a(final IGetDataCallback<TranslateLanguageSetting> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_TRANSLATE_LANGUAGES_SETTING, new GetTranslateLanguagesRequest.C17729a(), new IGetDataCallback<TranslateLanguageSetting>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32895j.C328961 */

            /* renamed from: a */
            public void onSuccess(TranslateLanguageSetting translateLanguageSetting) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(translateLanguageSetting);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                TranslateHitPoint.f135913a.mo187767b(errorResult.getErrorMsg());
            }
        }, new SdkSender.IParser<TranslateLanguageSetting>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32895j.C328972 */

            /* renamed from: a */
            public TranslateLanguageSetting parse(byte[] bArr) throws IOException {
                GetTranslateLanguagesResponse decode = GetTranslateLanguagesResponse.ADAPTER.decode(bArr);
                TranslateImageService.INSTANCE.setImageSupportedLanguageList(decode.target_language, decode.image_language_keys, decode.supported_languages, decode.src_languages_config);
                return new TranslateLanguageSetting(decode.switch_scopes.intValue(), decode.target_language, decode.language_keys, decode.supported_languages, decode.dis_auto_translate_languages_conf, decode.global_conf, decode.languages_conf, decode.src_languages_config);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32908l
    /* renamed from: a */
    public void mo121375a(int i, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_AUTO_TRANSLATE_SCOPE, new SetAutoTranslateScopeRequest.C18039a().mo62649a(Integer.valueOf(i)), iGetDataCallback, $$Lambda$j$ScronolaccGUnAsSAhHoU7h1fQ.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32908l
    /* renamed from: a */
    public void mo121378a(String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_TRANSLATE_LANGUAGES_SETTING, new SetTranslateLanguageRequest.C18045a().mo62663a(str), new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32895j.C328983 */

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
                TranslateHitPoint.f135913a.mo187759a(2, errorResult.getErrorMsg());
            }
        }, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32895j.C328994 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                SetTranslateLanguageResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32908l
    /* renamed from: a */
    public void mo121379a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DISABLE_AUTO_TRANSLATE_LANGUAGE, new PutDisableAutoTranslateLanguagesRequest.C17973a().mo62466a(list), iGetDataCallback, $$Lambda$j$uZgIWAa7wqsZkShcaGZImwupRtY.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32908l
    /* renamed from: a */
    public void mo121381a(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_AUTO_TRANSLATE_GLOBAL_SWITCH, new SetAutoTranslateGlobalSwitchRequest.C18037a().mo62644a(Boolean.valueOf(z)), iGetDataCallback, $$Lambda$j$ZLCMSrgEIxY3I1kk9Lxq_DILE.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32908l
    /* renamed from: a */
    public void mo121376a(int i, Map<String, Integer> map, IGetDataCallback<Boolean> iGetDataCallback) {
        LanguagesConfiguration languagesConfiguration;
        DisplayRule fromValue = DisplayRule.fromValue(i);
        if (fromValue != null) {
            languagesConfiguration = new LanguagesConfiguration(fromValue);
        } else {
            languagesConfiguration = null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), new LanguagesConfiguration(DisplayRule.fromValue(entry.getValue().intValue())));
        }
        SdkSender.asynSendRequestNonWrap(Command.PUT_LANGUAGES_CONFIGURATION, new PutLanguagesConfigurationRequest.C17975a().mo62471a(languagesConfiguration).mo62472a(hashMap), iGetDataCallback, $$Lambda$j$ndjwY4KGG5HdPEYp2GOCPrvt0gM.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32908l
    /* renamed from: a */
    public void mo121380a(List<String> list, boolean z, String str, MessageSource messageSource, String str2, IGetDataCallback<C36874a> iGetDataCallback) {
        if (!(CollectionUtils.isEmpty(list) || TextUtils.isEmpty(str2))) {
            ArrayList arrayList = new ArrayList();
            for (String str3 : list) {
                arrayList.add(new TranslateMessageContext(str3, messageSource, str, str2));
            }
            SdkSender.asynSendRequestNonWrap(Command.TRANSLATE_MESSAGES_V3, new TranslateMessagesV3Request.C18105a().mo62807a(Boolean.valueOf(z)).mo62808a(arrayList), iGetDataCallback, new SdkSender.IParser() {
                /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$j$L0_ZYCYohKIq85kCE1skpet1bbo */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return C32895j.this.m126598a(bArr);
                }
            });
        }
    }
}
