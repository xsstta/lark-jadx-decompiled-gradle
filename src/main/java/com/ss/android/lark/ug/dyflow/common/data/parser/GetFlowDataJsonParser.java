package com.ss.android.lark.ug.dyflow.common.data.parser;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.dyflow.common.data.FlowContext;
import com.ss.android.lark.ug.dyflow.common.data.FlowData;
import com.ss.android.lark.ug.dyflow.common.data.FlowElementData;
import com.ss.android.lark.ug.dyflow.common.data.FlowSlotData;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.common.data.elements.ButtonElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.ConfigElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.PictureElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.TextElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.VideoElementData;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH\u0002J$\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0006H\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0006H\u0002J0\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0006H\u0002¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/parser/GetFlowDataJsonParser;", "Lcom/ss/android/lark/ug/dyflow/common/data/parser/DataParser;", "", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", "()V", "pareSlots", "", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowSlotData;", "slots", "Lorg/json/JSONObject;", "flowElements", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData;", "parse", "any", "parseElement", "value", "parseElements", "json", "parseFlow", "serverFlow", "parseSlot", "parseStep", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "parseSteps", "", "steps", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.data.a.b */
public final class GetFlowDataJsonParser implements DataParser<String, FlowData> {
    /* renamed from: b */
    private final Map<String, FlowElementData> m222753b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "json.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            HashMap hashMap2 = hashMap;
            Intrinsics.checkExpressionValueIsNotNull(next, "it");
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            hashMap2.put(next, m222754c(optJSONObject));
        }
        return hashMap;
    }

    /* renamed from: a */
    public FlowData mo194858a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "any");
        JSONObject jSONObject = new JSONObject(str);
        AbstractC57392a a = C57345a.m222261a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
        if (C26284k.m95186b(a.mo194672d())) {
            Log.m165389i("DyFlow", jSONObject.toString());
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("flow");
        if (optJSONObject != null) {
            return m222750a(optJSONObject);
        }
        Log.m165383e("DyFlow", "parse json error, not found flow field, data=" + jSONObject);
        return FlowData.f141445b.mo194878a();
    }

    /* renamed from: a */
    private final FlowData m222750a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        Collection<FlowSlotData> values;
        FlowData bVar = new FlowData();
        bVar.mo194870a(jSONObject.optLong("flow_suite_id"));
        bVar.mo194871a(jSONObject.optString("flow_name"));
        bVar.mo194874b(jSONObject.optString("root_step_url"));
        FlowContext d = bVar.mo194877d();
        JSONObject optJSONObject = jSONObject.optJSONObject("flow_context");
        if (optJSONObject == null || (jSONObject2 = optJSONObject.optJSONObject("parameters")) == null) {
            jSONObject2 = new JSONObject();
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject2.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "context.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            HashMap hashMap2 = hashMap;
            Intrinsics.checkExpressionValueIsNotNull(next, "it");
            String optString = jSONObject2.optString(next);
            if (optString == null) {
                optString = "";
            }
            hashMap2.put(next, optString);
        }
        d.mo194856a(hashMap);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("elements");
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
        }
        Map<String, FlowElementData> b = m222753b(optJSONObject2);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("steps");
        if (optJSONObject3 == null) {
            optJSONObject3 = new JSONObject();
        }
        bVar.mo194872a(m222751a(optJSONObject3, b));
        for (T t : bVar.mo194873b().values()) {
            t.mo194829a(bVar.mo194869a());
            Map<String, FlowSlotData> d2 = t.mo194839d();
            if (!(d2 == null || (values = d2.values()) == null)) {
                for (T t2 : values) {
                    t2.mo194809a(bVar.mo194869a());
                    t2.mo194811a(t.mo194834b());
                    t2.mo194814b(t.mo194837c());
                }
            }
        }
        return bVar;
    }

    /* renamed from: c */
    private final FlowElementData m222754c(JSONObject jSONObject) {
        ButtonElementData buttonElementData;
        TextElementData textElementData;
        VideoElementData videoElementData;
        PictureElementData pictureElementData;
        HashMap hashMap;
        String optString = jSONObject.optString("id");
        if (optString == null) {
            optString = "";
        }
        FlowElementData flowElementData = new FlowElementData(optString, FlowElementData.ElementType.Companion.mo194803a(jSONObject.optInt(ShareHitPoint.f121869d)));
        JSONObject optJSONObject = jSONObject.optJSONObject("button_element_data");
        ConfigElementData configElementData = null;
        if (optJSONObject != null) {
            buttonElementData = new ButtonElementData(optJSONObject.optString("text"));
        } else {
            buttonElementData = null;
        }
        flowElementData.mo194790a(buttonElementData);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("text_element_data");
        if (optJSONObject2 != null) {
            textElementData = new TextElementData(optJSONObject2.optString("text"), TextElementData.TextType.Companion.mo194906a(optJSONObject2.optInt("text_type")));
        } else {
            textElementData = null;
        }
        flowElementData.mo194793a(textElementData);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("video_element_data");
        if (optJSONObject3 != null) {
            videoElementData = new VideoElementData(optJSONObject3.optString("video_url"), optJSONObject3.optBoolean("is_vertical"));
        } else {
            videoElementData = null;
        }
        flowElementData.mo194794a(videoElementData);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("picture_element_data");
        if (optJSONObject4 != null) {
            pictureElementData = new PictureElementData(optJSONObject4.optString("image_data"), PictureElementData.ImageType.Companion.mo194897a(optJSONObject4.optInt("image_type")));
        } else {
            pictureElementData = null;
        }
        flowElementData.mo194792a(pictureElementData);
        JSONObject optJSONObject5 = jSONObject.optJSONObject("config_element_data");
        if (optJSONObject5 != null) {
            JSONObject optJSONObject6 = optJSONObject5.optJSONObject("configs");
            if (optJSONObject6 != null) {
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys = optJSONObject6.keys();
                Intrinsics.checkExpressionValueIsNotNull(keys, "jsonConfigs.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString2 = optJSONObject6.optString(next);
                    if (optString2 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(next, "key");
                        hashMap2.put(next, optString2);
                    }
                }
                hashMap = hashMap2;
            } else {
                hashMap = Collections.emptyMap();
                Intrinsics.checkExpressionValueIsNotNull(hashMap, "Collections.emptyMap()");
            }
            configElementData = new ConfigElementData(hashMap);
        }
        flowElementData.mo194791a(configElementData);
        return flowElementData;
    }

    /* renamed from: a */
    private final Map<String, FlowStepData> m222751a(JSONObject jSONObject, Map<String, FlowElementData> map) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "steps.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            HashMap hashMap2 = hashMap;
            Intrinsics.checkExpressionValueIsNotNull(next, "it");
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            hashMap2.put(next, m222752b(optJSONObject, map));
        }
        return hashMap;
    }

    /* renamed from: b */
    private final FlowStepData m222752b(JSONObject jSONObject, Map<String, FlowElementData> map) {
        FlowStepData flowStepData = new FlowStepData();
        flowStepData.mo194831a(jSONObject.optString("step_id", ""));
        flowStepData.mo194835b(jSONObject.optString("step_name", ""));
        JSONObject optJSONObject = jSONObject.optJSONObject("slots");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        flowStepData.mo194832a(m222755c(optJSONObject, map));
        return flowStepData;
    }

    /* renamed from: c */
    private final Map<String, FlowSlotData> m222755c(JSONObject jSONObject, Map<String, FlowElementData> map) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "slots.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            HashMap hashMap2 = hashMap;
            Intrinsics.checkExpressionValueIsNotNull(next, "it");
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            hashMap2.put(next, m222756d(optJSONObject, map));
        }
        return hashMap;
    }

    /* renamed from: d */
    private final FlowSlotData m222756d(JSONObject jSONObject, Map<String, FlowElementData> map) {
        FlowSlotData flowSlotData = new FlowSlotData();
        flowSlotData.mo194818d(jSONObject.optString("linked_step_url"));
        flowSlotData.mo194812a(jSONObject.optBoolean("should_report_behavior"));
        flowSlotData.mo194816c(jSONObject.optString("slot_id"));
        if (!TextUtils.isEmpty(jSONObject.optString("element_id"))) {
            flowSlotData.mo194810a(map.get(jSONObject.optString("element_id")));
        }
        return flowSlotData;
    }
}
