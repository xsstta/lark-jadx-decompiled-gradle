package com.ss.android.ugc.effectmanager.p3055e;

import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60561a;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60564d;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60566f;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60570j;
import com.ss.ugc.effectplatform.listener.IEffectPlatformBaseListener;
import com.ss.ugc.effectplatform.listener.IFetchEffectListener;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u0004\u0018\u00010\u0003\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0005\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001*\u0004\u0018\u00010\u0007\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0001*\u0004\u0018\u00010\t\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0001*\u0004\u0018\u00010\u000b\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001*\u0004\u0018\u00010\f\u001a\u001a\u0010\u0000\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u0001*\u0004\u0018\u00010\u000f\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u0011\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0001*\u0004\u0018\u00010\u0013\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0001*\u0004\u0018\u00010\u0015\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0001*\u0004\u0018\u00010\u0017\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0001*\u0004\u0018\u00010\u0019\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0001*\u0004\u0018\u00010\u001b\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u0004\u0018\u00010\u001c\u001a\u001a\u0010\u0000\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r\u0018\u00010\u0001*\u0004\u0018\u00010\u001e\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0001*\u0004\u0018\u00010\u001f\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0001*\u0004\u0018\u00010!\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\"*\u0004\u0018\u00010#\u001a\n\u0010$\u001a\u00020%*\u00020&¨\u0006'"}, d2 = {"toKNListener", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "", "Lcom/ss/android/ugc/effectmanager/effect/listener/ICheckChannelListener;", "Lcom/ss/ugc/effectplatform/listener/IDownloadProviderEffectProgressListener;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IDownloadProviderEffectListener;", "Lcom/ss/ugc/effectplatform/model/net/EffectListResponse;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IEffectListResponseListener;", "Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchCategoryEffectListener;", "Lcom/ss/ugc/effectplatform/model/EffectChannelResponse;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchEffectChannelListener;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchEffectListByIdsListener;", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchEffectListListener;", "Lcom/ss/ugc/effectplatform/listener/IFetchEffectListener;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchEffectListener;", "Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchFavoriteList;", "Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchHotEffectListener;", "Lcom/ss/ugc/effectplatform/model/PanelInfoModel;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchPanelInfoListener;", "Lcom/ss/ugc/effectplatform/model/ProviderEffectModel;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchProviderEffect;", "Lcom/ss/ugc/effectplatform/model/ResourceListModel;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchResourceListener;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IIsTagNeedUpdatedListener;", "", "Lcom/ss/android/ugc/effectmanager/effect/listener/IModFavoriteList;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IScanQRCodeListener;", "Lcom/ss/ugc/effectplatform/model/net/SearchEffectResponse;", "Lcom/ss/android/ugc/effectmanager/effect/listener/ISearchEffectListener;", "Lcom/ss/ugc/effectplatform/listener/IUpdateTagListener;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IUpdateTagListener;", "toOldExceptionResult", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "effectmanager_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.e.h */
public final class C60553h {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"com/ss/android/ugc/effectmanager/knadapt/ListenerAdaptExtKt$toKNListener$1", "Lcom/ss/ugc/effectplatform/listener/IFetchEffectListener;", "oldEffect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "onFail", "", "failedResult", "Lcom/ss/ugc/effectplatform/model/Effect;", ApiHandler.API_CALLBACK_EXCEPTION, "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onProgress", "effect", "progress", "", "contentLength", "", "onStart", "onSuccess", "response", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.e.h$a */
    public static final class C60554a implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC60570j f151443a;

        /* renamed from: b */
        private Effect f151444b;

        C60554a(AbstractC60570j jVar) {
            this.f151443a = jVar;
        }

        @Override // com.ss.ugc.effectplatform.listener.IFetchEffectListener
        /* renamed from: a */
        public void mo207367a(com.ss.ugc.effectplatform.model.Effect effect) {
            if (this.f151444b == null) {
                this.f151444b = new Effect(effect);
            }
            this.f151443a.mo207390a(this.f151444b);
        }

        /* renamed from: b */
        public void mo207370a(com.ss.ugc.effectplatform.model.Effect effect) {
            if (this.f151444b == null) {
                this.f151444b = new Effect(effect);
            }
            this.f151443a.mo207223a((Object) this.f151444b);
        }

        /* renamed from: a */
        public void mo207371a(com.ss.ugc.effectplatform.model.Effect effect, ExceptionResult cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, ApiHandler.API_CALLBACK_EXCEPTION);
            if (this.f151444b == null) {
                this.f151444b = new Effect(effect);
            }
            this.f151443a.mo207391a(this.f151444b, C60553h.m235397a(cVar));
        }

        @Override // com.ss.ugc.effectplatform.listener.IFetchEffectListener
        /* renamed from: a */
        public void mo207368a(com.ss.ugc.effectplatform.model.Effect effect, int i, long j) {
            if (this.f151444b == null) {
                this.f151444b = new Effect(effect);
            }
            AbstractC60570j jVar = this.f151443a;
            if (jVar instanceof AbstractC60564d) {
                ((AbstractC60564d) jVar).mo207384a(this.f151444b, i, j);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/effectmanager/knadapt/ListenerAdaptExtKt$toKNListener$11", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", "onFail", "", "failedResult", ApiHandler.API_CALLBACK_EXCEPTION, "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onSuccess", "response", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.e.h$b */
    public static final class C60555b implements IEffectPlatformBaseListener<CategoryPageModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC60566f f151445a;

        C60555b(AbstractC60566f fVar) {
            this.f151445a = fVar;
        }

        /* renamed from: a */
        public void mo207370a(CategoryPageModel categoryPageModel) {
            Intrinsics.checkParameterIsNotNull(categoryPageModel, "response");
            this.f151445a.mo207223a(new com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel(categoryPageModel));
        }

        /* renamed from: a */
        public void mo207371a(CategoryPageModel categoryPageModel, ExceptionResult cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, ApiHandler.API_CALLBACK_EXCEPTION);
            this.f151445a.mo207386a(C60553h.m235397a(cVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/effectmanager/knadapt/ListenerAdaptExtKt$toKNListener$5", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "", "onFail", "", "failedResult", ApiHandler.API_CALLBACK_EXCEPTION, "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "(Ljava/lang/Boolean;Lcom/ss/ugc/effectplatform/model/ExceptionResult;)V", "onSuccess", "response", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.e.h$c */
    public static final class C60556c implements IEffectPlatformBaseListener<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC60561a f151446a;

        C60556c(AbstractC60561a aVar) {
            this.f151446a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.listener.IEffectPlatformBaseListener
        /* renamed from: a */
        public /* synthetic */ void mo207370a(Boolean bool) {
            mo207376a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo207376a(boolean z) {
            this.f151446a.mo207381a(z);
        }

        /* renamed from: a */
        public void mo207371a(Boolean bool, ExceptionResult cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, ApiHandler.API_CALLBACK_EXCEPTION);
            this.f151446a.mo207380a(C60553h.m235397a(cVar));
        }
    }

    /* renamed from: a */
    public static final IEffectPlatformBaseListener<Boolean> m235398a(AbstractC60561a aVar) {
        if (aVar != null) {
            return new C60556c(aVar);
        }
        return null;
    }

    /* renamed from: a */
    public static final C60519c m235397a(ExceptionResult cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$toOldExceptionResult");
        C60519c cVar2 = new C60519c(cVar.mo227908a(), cVar.mo227912c());
        cVar2.mo207218a(cVar.mo227911b());
        return cVar2;
    }

    /* renamed from: a */
    public static final IEffectPlatformBaseListener<CategoryPageModel> m235399a(AbstractC60566f fVar) {
        if (fVar != null) {
            return new C60555b(fVar);
        }
        return null;
    }

    /* renamed from: a */
    public static final IFetchEffectListener m235400a(AbstractC60570j jVar) {
        if (jVar != null) {
            return new C60554a(jVar);
        }
        return null;
    }
}
