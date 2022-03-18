package com.ss.android.lark.statistics.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/statistics/extensions/IParam;", "", "key", "", "getKey", "()Ljava/lang/String;", "value", "getValue", "plus", "target", "toJson", "Lorg/json/JSONObject;", "statistics_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.statistics.extensions.c */
public interface IParam {
    String getKey();

    String getValue();

    IParam plus(IParam cVar);

    JSONObject toJson();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.statistics.extensions.c$a */
    public static final class C54954a {
        /* renamed from: a */
        public static JSONObject m213213a(IParam cVar) {
            return C54952a.m213206a(cVar);
        }

        /* renamed from: a */
        public static IParam m213212a(IParam cVar, IParam cVar2) {
            Intrinsics.checkParameterIsNotNull(cVar2, "target");
            return C54952a.m213203a(cVar, cVar2);
        }
    }
}
