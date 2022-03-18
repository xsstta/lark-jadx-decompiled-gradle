package com.bytedance.ee.bear.share;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00060\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/share/ShareUtils;", "", "()V", "TAG", "", "getSummary", "", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", ShareHitPoint.f121869d, "token", "cb", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "content", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.share.g */
public final class ShareUtils {

    /* renamed from: a */
    public static final ShareUtils f29631a = new ShareUtils();

    private ShareUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.g$b */
    static final class C11015b<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ Function1 f29633a;

        C11015b(Function1 function1) {
            this.f29633a = function1;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("ShareUtils", th);
            this.f29633a.invoke(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.g$a */
    static final class C11014a<T> implements Consumer<SimpleRequestResult> {

        /* renamed from: a */
        final /* synthetic */ Function1 f29632a;

        C11014a(Function1 function1) {
            this.f29632a = function1;
        }

        /* renamed from: a */
        public final void accept(SimpleRequestResult simpleRequestResult) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(simpleRequestResult, "result");
            Serializable serializable = simpleRequestResult.data;
            String str = null;
            if (!(serializable instanceof JSONObject)) {
                serializable = null;
            }
            JSONObject jSONObject = (JSONObject) serializable;
            if (jSONObject != null) {
                obj = jSONObject.get("summary");
            } else {
                obj = null;
            }
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str2 = (String) obj;
            if (str2 != null) {
                int coerceAtMost = RangesKt.coerceAtMost(30, str2.length());
                if (str2 != null) {
                    String substring = str2.substring(0, coerceAtMost);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        str = StringsKt.replace$default(substring, "\n", " ", false, 4, (Object) null);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            this.f29632a.invoke(str);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m45874a(NetService netService, String str, String str2, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(netService, "netService");
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(function1, "cb");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/summary/");
        fVar.mo20143a(2);
        fVar.mo20145a("obj_type", str);
        fVar.mo20145a("obj_token", str2);
        netService.mo20117a(new C5205f()).mo20141a(fVar).mo238001b(new C11014a(function1), new C11015b(function1));
    }
}
