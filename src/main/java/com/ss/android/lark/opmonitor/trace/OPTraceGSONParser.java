package com.ss.android.lark.opmonitor.trace;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.impl.TracingSpanImpl;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/opmonitor/trace/OPTraceGSONParser;", "", "()V", "Companion", "OPTraceTypeAdapter", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.opmonitor.trace.a */
public final class OPTraceGSONParser {

    /* renamed from: a */
    public static final Gson f122914a = new GsonBuilder().registerTypeAdapter(OPTrace.class, new OPTraceTypeAdapter()).excludeFieldsWithoutExposeAnnotation().disableHtmlEscaping().create();

    /* renamed from: b */
    public static final Companion f122915b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J(\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/opmonitor/trace/OPTraceGSONParser$OPTraceTypeAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.opmonitor.trace.a$b */
    public static final class OPTraceTypeAdapter implements JsonDeserializer<OPTrace> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/ss/android/lark/opmonitor/trace/OPTraceGSONParser$OPTraceTypeAdapter$deserialize$1$1$types$1", "Lcom/google/gson/reflect/TypeToken;", "Lcom/ss/android/lark/optrace/impl/TracingSpanImpl;", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.opmonitor.trace.a$b$a */
        public static final class C48926a extends TypeToken<TracingSpanImpl> {
            C48926a() {
            }
        }

        /* renamed from: a */
        public OPTrace deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            OPTrace oPTrace;
            boolean z;
            String json;
            if (jsonElement != null) {
                try {
                    JsonObject asJsonObject = jsonElement.getAsJsonObject();
                    if (asJsonObject != null) {
                        JsonElement jsonElement2 = asJsonObject.get("trace");
                        JsonObject asJsonObject2 = jsonElement2 != null ? jsonElement2.getAsJsonObject() : null;
                        TracingSpanImpl tracingSpanImpl = null;
                        if (asJsonObject2 != null) {
                            tracingSpanImpl = (TracingSpanImpl) OPTraceGSONParser.f122915b.mo170888a().fromJson(asJsonObject2, new C48926a().getType());
                        }
                        if (tracingSpanImpl != null) {
                            oPTrace = new OPTrace(tracingSpanImpl);
                        } else {
                            oPTrace = OPTraceService.m192757a();
                        }
                        JsonElement jsonElement3 = asJsonObject.get("monitorCache");
                        JsonArray<JsonElement> asJsonArray = jsonElement3 != null ? jsonElement3.getAsJsonArray() : null;
                        if (asJsonArray != null) {
                            for (JsonElement jsonElement4 : asJsonArray) {
                                if (!(jsonElement4 == null || (json = OPTraceGSONParser.f122915b.mo170888a().toJson(jsonElement4)) == null)) {
                                    oPTrace.getMonitors().add(json);
                                }
                            }
                        }
                        JsonElement jsonElement5 = asJsonObject.get("batchEnabled");
                        if (jsonElement5 != null) {
                            z = jsonElement5.getAsBoolean();
                        } else {
                            z = false;
                        }
                        oPTrace.setBatchEnabled(z);
                        return oPTrace;
                    }
                } catch (Exception e) {
                    Log.m165383e("OPTraceGSONParser", "deserialize error:" + e.getMessage());
                    return null;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/opmonitor/trace/OPTraceGSONParser$Companion;", "", "()V", "BATCH_ENABLE", "", "GSON", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "getGSON", "()Lcom/google/gson/Gson;", "MONITOR_CACHE", "TAG", "TRACE", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.opmonitor.trace.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final Gson mo170888a() {
            return OPTraceGSONParser.f122914a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
