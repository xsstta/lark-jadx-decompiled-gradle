package com.bytedance.ies.bullet.service.schema.param.core;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005JH\u0010\u0010\u001a.\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u0011\u0018\u00010\bj\u0010\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n\"\u0004\b\u0001\u0010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0004H\u0016JD\u0010\u0013\u001a*\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\fj\u0010\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\r\"\u0004\b\u0001\u0010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0004H\u0016JL\u0010\u0014\u001a\u00020\u0015\"\u0004\b\u0001\u0010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042.\u0010\u0016\u001a*\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00110\bj\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00028\u0000`\nH\u0016JH\u0010\u0017\u001a\u00020\u0015\"\u0004\b\u0001\u0010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042*\u0010\u0018\u001a&\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fj\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00028\u0000`\rH\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016R<\u0010\u0006\u001a0\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\"\u0012 \u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0012\u0002\b\u00030\bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\n0\u0007X\u0004¢\u0006\u0002\n\u0000R8\u0010\u000b\u001a,\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001e\u0012\u001c\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\fj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\r0\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/param/core/ParamType;", "T", "Lcom/bytedance/ies/bullet/service/schema/param/core/IParamType;", ShareHitPoint.f121869d, "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "builderMap", "", "Lkotlin/Function3;", "", "Lcom/bytedance/ies/bullet/service/schema/param/core/Builder;", "parserMap", "Lkotlin/Function2;", "Lcom/bytedance/ies/bullet/service/schema/param/core/Parser;", "getType", "()Ljava/lang/Class;", "getBuilder", "R", "inputType", "getParser", "registerBuilder", "", "builder", "registerParser", "parser", "toString", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.schema.param.core.b */
public final class ParamType<T> implements IParamType<T> {

    /* renamed from: a */
    private final Map<Class<?>, Function2<?, String, ?>> f37969a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<Class<?>, Function3<?, String, ?, ?>> f37970b = new LinkedHashMap();

    /* renamed from: c */
    private final Class<T> f37971c;

    /* renamed from: a */
    public Class<T> mo52853a() {
        return this.f37971c;
    }

    public String toString() {
        return "ParamType: " + mo52853a().getCanonicalName();
    }

    public ParamType(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, ShareHitPoint.f121869d);
        this.f37971c = cls;
    }

    @Override // com.bytedance.ies.bullet.service.schema.param.core.IParamType
    /* renamed from: a */
    public <R> void mo52851a(Class<R> cls, Function2<? super R, ? super String, ? extends T> kVar) {
        Intrinsics.checkParameterIsNotNull(cls, "inputType");
        Intrinsics.checkParameterIsNotNull(kVar, "parser");
        this.f37969a.put(cls, kVar);
    }

    @Override // com.bytedance.ies.bullet.service.schema.param.core.IParamType
    /* renamed from: a */
    public <R> void mo52852a(Class<R> cls, Function3<? super R, ? super String, ? super T, ? extends R> oVar) {
        Intrinsics.checkParameterIsNotNull(cls, "inputType");
        Intrinsics.checkParameterIsNotNull(oVar, "builder");
        this.f37970b.put(cls, oVar);
    }
}
