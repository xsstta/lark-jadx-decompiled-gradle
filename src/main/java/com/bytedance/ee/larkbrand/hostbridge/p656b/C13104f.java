package com.bytedance.ee.larkbrand.hostbridge.p656b;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.C69294l;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"iterator", "", "Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "miniapp_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.hostbridge.b.f */
public final class C13104f {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.hostbridge.b.f$a */
    public static final class C13105a extends Lambda implements Function1<Integer, JSONObject> {
        final /* synthetic */ JSONArray $this_iterator;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13105a(JSONArray jSONArray) {
            super(1);
            this.$this_iterator = jSONArray;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ JSONObject invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final JSONObject invoke(int i) {
            Object obj = this.$this_iterator.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new TypeCastException("null cannot be cast to non-null type org.json.JSONObject");
        }
    }

    /* renamed from: a */
    public static final Iterator<JSONObject> m53668a(JSONArray jSONArray) {
        Intrinsics.checkParameterIsNotNull(jSONArray, "$this$iterator");
        return C69294l.m266140e(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new C13105a(jSONArray)).mo4717a();
    }
}
