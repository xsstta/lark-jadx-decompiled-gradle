package com.bytedance.kit.nglynx.model;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.lynx.tasm.TemplateData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/kit/nglynx/model/LynxInitData;", "", "()V", "mData", "Lcom/lynx/tasm/TemplateData;", "getTemplateData", "put", "", "key", "", "value", "Companion", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.e.a */
public final class LynxInitData {

    /* renamed from: b */
    public static final Companion f38605b = new Companion(null);

    /* renamed from: a */
    public TemplateData f38606a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u0007J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/kit/nglynx/model/LynxInitData$Companion;", "", "()V", "TAG", "", "fromMap", "Lcom/bytedance/kit/nglynx/model/LynxInitData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "fromString", "json", "tryTransformUnsupportedData", "value", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.e.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final LynxInitData mo53807a(Map<String, ? extends Object> map) {
            LynxInitData aVar = new LynxInitData();
            Object a = LynxInitData.f38605b.mo53808a((Object) map);
            if (!(a instanceof Map)) {
                a = null;
            }
            TemplateData a2 = TemplateData.m96225a((Map) a);
            Intrinsics.checkExpressionValueIsNotNull(a2, "TemplateData.fromMap(optValue)");
            aVar.f38606a = a2;
            return aVar;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0050 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
        @JvmStatic
        /* renamed from: a */
        public final Object mo53808a(Object obj) {
            ArrayList arrayList;
            if (obj == null) {
                return null;
            }
            Log.d("LynxInitData", "dealing with " + obj + '[' + obj.getClass() + ']');
            if (obj instanceof List) {
                arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    arrayList.add(LynxInitData.f38605b.mo53808a(obj2));
                }
            } else if (obj instanceof Map) {
                arrayList = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() instanceof String) {
                        Object key = entry.getKey();
                        if (key != null) {
                            arrayList.put((String) key, LynxInitData.f38605b.mo53808a(entry.getValue()));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else {
                        Log.e("LynxInitData", "unsupported value " + entry);
                    }
                }
            } else if (obj instanceof Bundle) {
                arrayList = new LinkedHashMap();
                Bundle bundle = (Bundle) obj;
                Set<String> keySet = bundle.keySet();
                Intrinsics.checkExpressionValueIsNotNull(keySet, "value.keySet()");
                for (T t : keySet) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "it");
                    arrayList.put(t, LynxInitData.f38605b.mo53808a(bundle.get(t)));
                }
            } else if (obj instanceof JSONObject) {
                arrayList = new LinkedHashMap();
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkExpressionValueIsNotNull(keys, "value.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Intrinsics.checkExpressionValueIsNotNull(next, "it");
                    arrayList.put(next, LynxInitData.f38605b.mo53808a(jSONObject.get(next)));
                }
            } else if (!(obj instanceof JSONArray)) {
                return obj;
            } else {
                arrayList = new ArrayList();
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(LynxInitData.f38605b.mo53808a(jSONArray.get(i)));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final TemplateData mo53806a() {
        return this.f38606a;
    }

    public LynxInitData() {
        TemplateData a = TemplateData.m96223a();
        Intrinsics.checkExpressionValueIsNotNull(a, "TemplateData.empty()");
        this.f38606a = a;
    }
}
