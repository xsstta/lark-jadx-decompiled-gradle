package com.bytedance.ies.bullet.service.schema.param.core;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002JH\u0010\u0007\u001a.\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\t\u0018\u00010\bj\u0010\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b\"\u0004\b\u0001\u0010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\u0004H&JD\u0010\r\u001a*\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000ej\u0010\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000f\"\u0004\b\u0001\u0010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\u0004H&JL\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0001\u0010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\u00042.\u0010\u0012\u001a*\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\t0\bj\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00028\u0000`\u000bH&JH\u0010\u0013\u001a\u00020\u0011\"\u0004\b\u0001\u0010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\u00042*\u0010\u0014\u001a&\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000ej\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00028\u0000`\u000fH&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/param/core/IParamType;", "T", "", ShareHitPoint.f121869d, "Ljava/lang/Class;", "getType", "()Ljava/lang/Class;", "getBuilder", "Lkotlin/Function3;", "R", "", "Lcom/bytedance/ies/bullet/service/schema/param/core/Builder;", "inputType", "getParser", "Lkotlin/Function2;", "Lcom/bytedance/ies/bullet/service/schema/param/core/Parser;", "registerBuilder", "", "builder", "registerParser", "parser", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.schema.param.core.a */
public interface IParamType<T> {
    /* renamed from: a */
    <R> void mo52851a(Class<R> cls, Function2<? super R, ? super String, ? extends T> kVar);

    /* renamed from: a */
    <R> void mo52852a(Class<R> cls, Function3<? super R, ? super String, ? super T, ? extends R> oVar);
}
