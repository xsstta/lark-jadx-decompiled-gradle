package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesRequest;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesResponse;
import com.bytedance.lark.pb.im.v1.PatchLanguagesAutoTranslationScopeRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54378d;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.b */
public class C54333b extends BaseModel implements AbstractC54318a.AbstractC54319a<C54378d, C54377c, Void> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Void m210953a(byte[] bArr) throws IOException {
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
    public void mo185849a(AbstractC54376b<C54377c> bVar, IGetDataCallback<C54378d> iGetDataCallback) {
        GetTranslateLanguagesRequest.C17729a aVar = new GetTranslateLanguagesRequest.C17729a();
        SdkSender.asynSendRequestNonWrap(Command.GET_TRANSLATE_LANGUAGES_SETTING, aVar.mo61896a(SyncDataStrategy.TRY_LOCAL), getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), new SdkSender.IParser() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.$$Lambda$b$O3tKhJsBpi99Kxir0KRlph9hnmU */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C54333b.m210952a(AbstractC54376b.this, bArr);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C54378d m210952a(AbstractC54376b bVar, byte[] bArr) throws IOException {
        return new C54378d(bVar.mo185939a(), (C54377c) bVar.mo185947d(), C54377c.m211101a(GetTranslateLanguagesResponse.ADAPTER.decode(bArr).switch_scopes.intValue()));
    }

    /* renamed from: a */
    public void mo185850a(C54378d dVar, IGetDataCallback<Void> iGetDataCallback) {
        PatchLanguagesAutoTranslationScopeRequest.C17829a aVar = new PatchLanguagesAutoTranslationScopeRequest.C17829a();
        HashMap hashMap = new HashMap();
        hashMap.put(dVar.mo185986c(), Integer.valueOf(dVar.mo185984a().mo185982g()));
        SdkSender.asynSendRequestNonWrap(Command.PATCH_LANGUAGE_AUTO_TRANSLATE_SCOPE, aVar.mo62147a(hashMap), getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), $$Lambda$b$CIxPQxevgKrHjM7fwFMLV_SLgI.INSTANCE);
    }
}
