package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DisplayRule;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesRequest;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesResponse;
import com.bytedance.lark.pb.im.v1.LanguagesConfiguration;
import com.bytedance.lark.pb.im.v1.PutLanguagesConfigurationV2Request;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54379e;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageDisplayRule;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.b */
public class C54358b extends BaseModel implements AbstractC54318a.AbstractC54319a<C54379e, LanguageDisplayRule, Void> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Void m211035a(byte[] bArr) throws IOException {
        return null;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54319a
    /* renamed from: a */
    public void mo185849a(AbstractC54376b<LanguageDisplayRule> bVar, IGetDataCallback<C54379e> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_TRANSLATE_LANGUAGES_SETTING, new GetTranslateLanguagesRequest.C17729a().mo61896a(SyncDataStrategy.TRY_LOCAL), getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), new SdkSender.IParser() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.$$Lambda$b$UMc1eQ8uSffYA2HzX6QpcF0jP4 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C54358b.m211034a(AbstractC54376b.this, bArr);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C54379e m211034a(AbstractC54376b bVar, byte[] bArr) throws IOException {
        return new C54379e(bVar.mo185939a(), (LanguageDisplayRule) bVar.mo185947d(), LanguageDisplayRule.fromValue(GetTranslateLanguagesResponse.ADAPTER.decode(bArr).global_conf.rule.getValue()));
    }

    /* renamed from: a */
    public void mo185850a(C54379e eVar, IGetDataCallback<Void> iGetDataCallback) {
        PutLanguagesConfigurationV2Request.C17977a aVar = new PutLanguagesConfigurationV2Request.C17977a();
        HashMap hashMap = new HashMap();
        LanguagesConfiguration.C17797a aVar2 = new LanguagesConfiguration.C17797a();
        aVar2.mo62054a(DisplayRule.fromValue(eVar.mo185991b().getValue()));
        hashMap.put(eVar.mo185989a(), aVar2.build());
        SdkSender.asynSendRequestNonWrap(Command.PUT_LANGUAGES_CONFIGURATION_V2, aVar.mo62477a(hashMap), getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), $$Lambda$b$OnR4mRfVItvO7hFfj9LexZBVck.INSTANCE);
    }
}
