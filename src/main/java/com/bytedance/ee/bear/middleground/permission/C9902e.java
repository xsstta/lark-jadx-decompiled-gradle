package com.bytedance.ee.bear.middleground.permission;

import com.bytedance.ee.bear.middleground.permission.callback.ISelectContactCallback;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10160d;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.ScopeDefinition;
import org.koin.p3512a.C70027b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\b\u0010\f\u001a\u0004\u0018\u00010\r\u001a&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000\"\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"PermissionDIModule", "Lorg/koin/core/module/Module;", "getPermissionDIModule", "()Lorg/koin/core/module/Module;", "TAG", "", "sSelectContactCallback", "Lcom/bytedance/ee/bear/middleground/permission/callback/ISelectContactCallback;", "getSSelectContactCallback", "()Lcom/bytedance/ee/bear/middleground/permission/callback/ISelectContactCallback;", "setSSelectContactCallback", "(Lcom/bytedance/ee/bear/middleground/permission/callback/ISelectContactCallback;)V", "newContactMobileFragment", "Landroidx/fragment/app/Fragment;", "openCountryCodeSelect", "", "fragment", "requestCode", "", "enterAnim", "exitAnim", "middleground-permission_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.e */
public final class C9902e {

    /* renamed from: a */
    private static final Module f26793a = C70027b.m268604a(false, false, C9903a.INSTANCE, 3, null);

    /* renamed from: b */
    private static ISelectContactCallback f26794b;

    /* renamed from: a */
    public static final Module m41218a() {
        return f26793a;
    }

    /* renamed from: a */
    public static final void m41219a(ISelectContactCallback aVar) {
        f26794b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.e$a */
    static final class C9903a extends Lambda implements Function1<Module, Unit> {
        public static final C9903a INSTANCE = new C9903a();

        C9903a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(Module aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            Qualifier aVar2 = null;
            Definitions dVar = Definitions.f175040a;
            ScopeDefinition a = aVar.mo246637a();
            Options a2 = aVar.mo246636a(false, false);
            ScopeDefinition.m268731a(a, new BeanDefinition(a, Reflection.getOrCreateKotlinClass(AbstractC10157c.class), aVar2, C99041.INSTANCE, Kind.Single, CollectionsKt.emptyList(), a2, null, null, 384, null), false, 2, null);
            C99052 r11 = C99052.INSTANCE;
            Definitions dVar2 = Definitions.f175040a;
            ScopeDefinition a3 = aVar.mo246637a();
            ScopeDefinition.m268731a(a3, new BeanDefinition(a3, Reflection.getOrCreateKotlinClass(IAuditApi.class), aVar2, r11, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
            C99063 r112 = C99063.INSTANCE;
            Definitions dVar3 = Definitions.f175040a;
            ScopeDefinition a4 = aVar.mo246637a();
            ScopeDefinition.m268731a(a4, new BeanDefinition(a4, Reflection.getOrCreateKotlinClass(IAdminPermissionProxy.class), aVar2, r112, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
            C99074 r113 = C99074.INSTANCE;
            Definitions dVar4 = Definitions.f175040a;
            ScopeDefinition a5 = aVar.mo246637a();
            ScopeDefinition.m268731a(a5, new BeanDefinition(a5, Reflection.getOrCreateKotlinClass(AbstractC10160d.class), aVar2, r113, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
        }
    }
}
