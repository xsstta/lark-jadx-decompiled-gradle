package com.bytedance.kit.nglynx.resource;

import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.bytedance.ies.bullet.service.base.api.LogLevel;
import com.lynx.tasm.provider.AbstractC26936c;
import com.lynx.tasm.provider.AbstractC26942i;
import com.lynx.tasm.provider.C26937d;
import com.lynx.tasm.provider.C26938e;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/kit/nglynx/resource/DefaultLynxRequestProvider;", "Lcom/lynx/tasm/provider/ResProvider;", "_token", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "(Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;)V", "token", "request", "", "requestParams", "Lcom/lynx/tasm/provider/LynxResRequest;", "callback", "Lcom/lynx/tasm/provider/LynxResCallback;", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.f.a */
public final class DefaultLynxRequestProvider implements AbstractC26942i {

    /* renamed from: a */
    public final IServiceToken f38609a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.f.a$a */
    static final class C14577a extends Lambda implements Function1<ResourceInfo, Unit> {
        final /* synthetic */ AbstractC26936c $callback;
        final /* synthetic */ C26937d $requestParams;
        final /* synthetic */ C26938e $response;
        final /* synthetic */ DefaultLynxRequestProvider this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14577a(DefaultLynxRequestProvider aVar, C26938e eVar, AbstractC26936c cVar, C26937d dVar) {
            super(1);
            this.this$0 = aVar;
            this.$response = eVar;
            this.$callback = cVar;
            this.$requestParams = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ResourceInfo mVar) {
            invoke(mVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ResourceInfo mVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "it");
            FileInputStream fileInputStream = null;
            try {
                File a = ResourceInfo.m58083a(mVar, null, 1, null);
                C26938e eVar = this.$response;
                if (a.exists()) {
                    fileInputStream = new FileInputStream(a);
                } else if (mVar.mo52710h() != null) {
                    fileInputStream = mVar.mo52710h();
                }
                eVar.mo95790a(fileInputStream);
                AbstractC26936c cVar = this.$callback;
                if (cVar != null) {
                    cVar.mo50299a(this.$response);
                }
            } catch (Throwable th) {
                IServiceToken jVar = this.this$0.f38609a;
                jVar.printLog("request " + this.$requestParams.mo95782a() + " failed, " + th.getMessage(), LogLevel.E, "DefaultLynxRequestProvider");
                AbstractC26936c cVar2 = this.$callback;
                if (cVar2 != null) {
                    cVar2.mo50300b(this.$response);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.f.a$b */
    static final class C14578b extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ AbstractC26936c $callback;
        final /* synthetic */ C26937d $requestParams;
        final /* synthetic */ C26938e $response;
        final /* synthetic */ DefaultLynxRequestProvider this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14578b(DefaultLynxRequestProvider aVar, C26937d dVar, AbstractC26936c cVar, C26938e eVar) {
            super(1);
            this.this$0 = aVar;
            this.$requestParams = dVar;
            this.$callback = cVar;
            this.$response = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            IServiceToken jVar = this.this$0.f38609a;
            jVar.printLog("request " + this.$requestParams.mo95782a() + " failed, " + th.getMessage(), LogLevel.E, "DefaultLynxRequestProvider");
            AbstractC26936c cVar = this.$callback;
            if (cVar != null) {
                cVar.mo50300b(this.$response);
            }
        }
    }

    public DefaultLynxRequestProvider(IServiceToken jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "_token");
        this.f38609a = jVar;
    }

    @Override // com.lynx.tasm.provider.AbstractC26942i
    /* renamed from: a */
    public void mo50297a(C26937d dVar, AbstractC26936c cVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "requestParams");
        IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) this.f38609a.mo52657a(IResourceLoaderService.class);
        C26938e eVar = new C26938e();
        if (iResourceLoaderService == null) {
            eVar.mo95789a(-100);
            if (cVar != null) {
                cVar.mo50300b(eVar);
            }
            IServiceToken jVar = this.f38609a;
            jVar.printLog("request " + dVar.mo95782a() + " failed, for no resourceLoader found", LogLevel.E, "DefaultLynxRequestProvider");
            return;
        }
        String a = dVar.mo95782a();
        Intrinsics.checkExpressionValueIsNotNull(a, "requestParams.url");
        IResourceLoaderService.C14409a.m57974a(iResourceLoaderService, a, null, new C14577a(this, eVar, cVar, dVar), new C14578b(this, dVar, cVar, eVar), 2, null);
    }
}
