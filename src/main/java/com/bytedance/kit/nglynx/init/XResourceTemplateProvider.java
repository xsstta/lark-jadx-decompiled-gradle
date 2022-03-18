package com.bytedance.kit.nglynx.init;

import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.lynx.tasm.provider.AbstractC26934b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/kit/nglynx/init/XResourceTemplateProvider;", "Lcom/lynx/tasm/provider/AbsTemplateProvider;", "_token", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "(Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;)V", "token", "loadTemplate", "", "url", "", "callback", "Lcom/lynx/tasm/provider/AbsTemplateProvider$Callback;", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.c.h */
public final class XResourceTemplateProvider extends AbstractC26934b {

    /* renamed from: a */
    private final IServiceToken f38585a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.c.h$a */
    static final class C14571a extends Lambda implements Function1<ResourceInfo, Unit> {
        final /* synthetic */ AbstractC26934b.AbstractC26935a $callback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14571a(AbstractC26934b.AbstractC26935a aVar) {
            super(1);
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ResourceInfo mVar) {
            invoke(mVar);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
            kotlin.io.C69101b.m265907a(r0, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(com.bytedance.ies.bullet.service.base.ResourceInfo r8) {
            /*
            // Method dump skipped, instructions count: 124
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.kit.nglynx.init.XResourceTemplateProvider.C14571a.invoke(com.bytedance.ies.bullet.service.base.m):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.c.h$b */
    static final class C14572b extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ AbstractC26934b.AbstractC26935a $callback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14572b(AbstractC26934b.AbstractC26935a aVar) {
            super(1);
            this.$callback = aVar;
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
            AbstractC26934b.AbstractC26935a aVar = this.$callback;
            if (aVar != null) {
                aVar.mo94212a("template load error, " + th.getMessage());
            }
        }
    }

    public XResourceTemplateProvider(IServiceToken jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "_token");
        this.f38585a = jVar;
    }

    @Override // com.lynx.tasm.provider.AbstractC26934b
    /* renamed from: a */
    public void mo53786a(String str, AbstractC26934b.AbstractC26935a aVar) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) this.f38585a.mo52657a(IResourceLoaderService.class);
        if (iResourceLoaderService != null) {
            IResourceLoaderService.C14409a.m57974a(iResourceLoaderService, str, null, new C14571a(aVar), new C14572b(aVar), 2, null);
        } else if (aVar != null) {
            aVar.mo94212a("ResourceLoader Not Found!");
        }
    }
}
