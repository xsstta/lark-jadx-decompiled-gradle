package com.ss.android.lark.browser.impl.translate.mvp;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.AbstractC25968b;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.browser.impl.translate.C29945a;
import com.ss.android.lark.browser.impl.translate.entity.C29953a;
import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;
import com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract;
import com.ss.android.lark.browser.impl.translate.p1424a.C29947a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J+\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0016¢\u0006\u0002\u0010\fJ \u0010\r\u001a\u00020\u00052\u0016\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000e0\nH\u0016J(\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\nH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016JC\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0016\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000e0\nH\u0016¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016¨\u0006 "}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarModel;", "()V", "fetchOriginLang", "", "sampleTextList", "", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "([Ljava/lang/String;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "fetchTargetLangList", "", "fetchTranslateSetting", "originLangCode", "webUrl", "Lcom/ss/android/lark/browser/impl/translate/entity/WebTranslateSetting;", "getSampleTextMaxContentLength", "", "sendTranslateRequest", "targetLangCode", "words", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "setAutoTranslate", "enable", "", "setNotTranslateThisLang", "originLang", "setNotTranslateThisSite", "GetDataCallbackCancelableWrapper", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.browser.impl.translate.mvp.a */
public final class TranslateBarModel extends BaseModel implements ITranslateBarContract.ITranslateBarModel {
    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarModel
    /* renamed from: a */
    public int mo107957a() {
        C29945a a = C29945a.m110725a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ConfigManager.inst()");
        return a.mo107848d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/browser/impl/translate/mvp/TranslateBarModel$fetchOriginLang$interCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.a$b */
    public static final class C29963b implements IGetDataCallback<TranslateLanguage> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f74751a;

        C29963b(IGetDataCallback iGetDataCallback) {
            this.f74751a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(TranslateLanguage translateLanguage) {
            this.f74751a.onSuccess(translateLanguage);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f74751a.onError(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/browser/impl/translate/mvp/TranslateBarModel$fetchTranslateSetting$interCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/browser/impl/translate/entity/WebTranslateSetting;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.a$c */
    public static final class C29964c implements IGetDataCallback<C29953a> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f74752a;

        C29964c(IGetDataCallback iGetDataCallback) {
            this.f74752a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(C29953a aVar) {
            this.f74752a.onSuccess(aVar);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f74752a.onError(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarModel$GetDataCallbackCancelableWrapper;", "Data", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/larksuite/framework/callback/CancelableCallback;", "callback", "(Lcom/larksuite/framework/callback/IGetDataCallback;)V", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.a$a */
    private static final class GetDataCallbackCancelableWrapper<Data> extends AbstractC25968b<IGetDataCallback<Data>> implements IGetDataCallback<Data> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetDataCallbackCancelableWrapper(IGetDataCallback<Data> iGetDataCallback) {
            super(iGetDataCallback);
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            IGetDataCallback iGetDataCallback;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            if (!isCanceled() && (iGetDataCallback = (IGetDataCallback) this.callback) != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(Data data) {
            IGetDataCallback iGetDataCallback;
            if (!isCanceled() && (iGetDataCallback = (IGetDataCallback) this.callback) != null) {
                iGetDataCallback.onSuccess(data);
            }
        }
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarModel
    /* renamed from: a */
    public void mo107958a(IGetDataCallback<List<TranslateLanguage>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C29947a a = C29947a.m110732a();
        GetDataCallbackCancelableWrapper aVar = new GetDataCallbackCancelableWrapper(iGetDataCallback);
        getCallbackManager().addCancelableCallback(aVar);
        a.mo107851a(aVar);
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarModel
    /* renamed from: a */
    public void mo107963a(boolean z) {
        C29947a.m110732a().mo107856a(z);
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarModel
    /* renamed from: a */
    public void mo107962a(String str, boolean z) {
        C29947a.m110732a().mo107855a(str, z);
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarModel
    /* renamed from: a */
    public void mo107959a(TranslateLanguage translateLanguage, boolean z) {
        Intrinsics.checkParameterIsNotNull(translateLanguage, "originLang");
        C29947a.m110732a().mo107852a(translateLanguage, z);
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarModel
    /* renamed from: a */
    public void mo107964a(String[] strArr, IGetDataCallback<TranslateLanguage> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(strArr, "sampleTextList");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C29963b bVar = new C29963b(iGetDataCallback);
        C29947a a = C29947a.m110732a();
        GetDataCallbackCancelableWrapper aVar = new GetDataCallbackCancelableWrapper(bVar);
        getCallbackManager().addCancelableCallback(aVar);
        a.mo107857a(strArr, aVar);
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarModel
    /* renamed from: a */
    public void mo107960a(String str, String str2, IGetDataCallback<C29953a> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "originLangCode");
        Intrinsics.checkParameterIsNotNull(str2, "webUrl");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C29964c cVar = new C29964c(iGetDataCallback);
        C29947a a = C29947a.m110732a();
        GetDataCallbackCancelableWrapper aVar = new GetDataCallbackCancelableWrapper(cVar);
        getCallbackManager().addCancelableCallback(aVar);
        a.mo107853a(str, str2, aVar);
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarModel
    /* renamed from: a */
    public void mo107961a(String str, String str2, String[] strArr, IGetDataCallback<List<String>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "originLangCode");
        Intrinsics.checkParameterIsNotNull(str2, "targetLangCode");
        Intrinsics.checkParameterIsNotNull(strArr, "words");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C29947a a = C29947a.m110732a();
        GetDataCallbackCancelableWrapper aVar = new GetDataCallbackCancelableWrapper(iGetDataCallback);
        getCallbackManager().addCancelableCallback(aVar);
        a.mo107854a(str, str2, strArr, aVar);
    }
}
