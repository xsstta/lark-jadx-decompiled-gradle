package com.ss.android.lark.ug.dyflow.common.data.parser;

import com.bytedance.lark.pb.onboarding.v1.Element;
import com.bytedance.lark.pb.onboarding.v1.Flow;
import com.bytedance.lark.pb.onboarding.v1.PictureElementData;
import com.bytedance.lark.pb.onboarding.v1.Slot;
import com.bytedance.lark.pb.onboarding.v1.Step;
import com.bytedance.lark.pb.onboarding.v1.TextElementData;
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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0016\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ*\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00042\u0016\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004JN\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0019j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016`\u001a2\u0016\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/parser/PbParseUtils;", "", "()V", "pareSlots", "", "", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowSlotData;", "slots", "Lcom/bytedance/lark/pb/onboarding/v1/Slot;", "flowElements", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData;", "parseElement", "value", "Lcom/bytedance/lark/pb/onboarding/v1/Element;", "parseElements", "map", "parseFlow", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", "serverFlow", "Lcom/bytedance/lark/pb/onboarding/v1/Flow;", "parseSlot", "parseStep", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Lcom/bytedance/lark/pb/onboarding/v1/Step;", "parseSteps", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "steps", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.data.a.d */
public final class PbParseUtils {

    /* renamed from: a */
    public static final PbParseUtils f141443a = new PbParseUtils();

    private PbParseUtils() {
    }

    /* renamed from: a */
    public final FlowElementData mo194861a(Element element) {
        ButtonElementData buttonElementData;
        TextElementData textElementData;
        VideoElementData videoElementData;
        PictureElementData pictureElementData;
        Intrinsics.checkParameterIsNotNull(element, "value");
        String str = element.id;
        FlowElementData.ElementType.Companion aVar = FlowElementData.ElementType.Companion;
        Element.ElementType elementType = element.type;
        Intrinsics.checkExpressionValueIsNotNull(elementType, "value.type");
        FlowElementData flowElementData = new FlowElementData(str, aVar.mo194803a(elementType.getValue()));
        com.bytedance.lark.pb.onboarding.v1.ButtonElementData buttonElementData2 = element.button_element_data;
        ConfigElementData configElementData = null;
        if (buttonElementData2 != null) {
            buttonElementData = new ButtonElementData(buttonElementData2.text);
        } else {
            buttonElementData = null;
        }
        flowElementData.mo194790a(buttonElementData);
        com.bytedance.lark.pb.onboarding.v1.TextElementData textElementData2 = element.text_element_data;
        if (textElementData2 != null) {
            String str2 = textElementData2.text;
            TextElementData.TextType.Companion aVar2 = TextElementData.TextType.Companion;
            TextElementData.TextType textType = textElementData2.text_type;
            Intrinsics.checkExpressionValueIsNotNull(textType, "this.text_type");
            textElementData = new com.ss.android.lark.ug.dyflow.common.data.elements.TextElementData(str2, aVar2.mo194906a(textType.getValue()));
        } else {
            textElementData = null;
        }
        flowElementData.mo194793a(textElementData);
        com.bytedance.lark.pb.onboarding.v1.VideoElementData videoElementData2 = element.video_element_data;
        if (videoElementData2 != null) {
            String str3 = videoElementData2.video_url;
            Boolean bool = videoElementData2.is_vertical;
            Intrinsics.checkExpressionValueIsNotNull(bool, "this.is_vertical");
            videoElementData = new VideoElementData(str3, bool.booleanValue());
        } else {
            videoElementData = null;
        }
        flowElementData.mo194794a(videoElementData);
        com.bytedance.lark.pb.onboarding.v1.PictureElementData pictureElementData2 = element.picture_element_data;
        if (pictureElementData2 != null) {
            String str4 = pictureElementData2.image_data;
            PictureElementData.ImageType.Companion aVar3 = PictureElementData.ImageType.Companion;
            PictureElementData.ImageType imageType = pictureElementData2.image_type;
            Intrinsics.checkExpressionValueIsNotNull(imageType, "this.image_type");
            pictureElementData = new com.ss.android.lark.ug.dyflow.common.data.elements.PictureElementData(str4, aVar3.mo194897a(imageType.getValue()));
        } else {
            pictureElementData = null;
        }
        flowElementData.mo194792a(pictureElementData);
        com.bytedance.lark.pb.onboarding.v1.ConfigElementData configElementData2 = element.config_element_data;
        if (configElementData2 != null) {
            Map<String, String> map = configElementData2.configs;
            if (map == null) {
                map = Collections.emptyMap();
                Intrinsics.checkExpressionValueIsNotNull(map, "Collections.emptyMap()");
            }
            configElementData = new ConfigElementData(map);
        }
        flowElementData.mo194791a(configElementData);
        return flowElementData;
    }

    /* renamed from: a */
    public final FlowData mo194864a(Flow flow) {
        long j;
        HashMap hashMap;
        Collection<FlowSlotData> values;
        Map<String, String> map;
        Intrinsics.checkParameterIsNotNull(flow, "serverFlow");
        FlowData bVar = new FlowData();
        Long l = flow.flow_suite_id;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        bVar.mo194870a(j);
        bVar.mo194871a(flow.flow_name);
        bVar.mo194874b(flow.root_step_url);
        FlowContext d = bVar.mo194877d();
        com.bytedance.lark.pb.onboarding.v1.FlowContext flowContext = flow.flow_context;
        if (flowContext == null || (map = flowContext.parameters) == null) {
            hashMap = Collections.emptyMap();
            Intrinsics.checkExpressionValueIsNotNull(hashMap, "Collections.emptyMap()");
        } else {
            hashMap = new HashMap(map);
        }
        d.mo194856a(hashMap);
        Map<String, Element> map2 = flow.elements;
        if (map2 == null) {
            map2 = Collections.emptyMap();
            Intrinsics.checkExpressionValueIsNotNull(map2, "Collections.emptyMap()");
        }
        Map<String, FlowElementData> a = mo194866a(map2);
        Map<String, Step> map3 = flow.steps;
        if (map3 == null) {
            map3 = Collections.emptyMap();
            Intrinsics.checkExpressionValueIsNotNull(map3, "Collections.emptyMap()");
        }
        bVar.mo194872a(mo194865a(map3, a));
        for (T t : bVar.mo194873b().values()) {
            t.mo194829a(bVar.mo194869a());
            Map<String, FlowSlotData> d2 = t.mo194839d();
            if (!(d2 == null || (values = d2.values()) == null)) {
                for (T t2 : values) {
                    t2.mo194809a(t.mo194828a());
                    t2.mo194811a(t.mo194834b());
                    t2.mo194814b(t.mo194837c());
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public final Map<String, FlowElementData> mo194866a(Map<String, Element> map) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        HashMap hashMap = new HashMap();
        for (T t : map.entrySet()) {
            if (!(t.getKey() == null || t.getValue() == null)) {
                HashMap hashMap2 = hashMap;
                Object key = t.getKey();
                if (key == null) {
                    Intrinsics.throwNpe();
                }
                PbParseUtils dVar = f141443a;
                Object value = t.getValue();
                if (value == null) {
                    Intrinsics.throwNpe();
                }
                hashMap2.put(key, dVar.mo194861a((Element) value));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final FlowStepData mo194863a(Step step, Map<String, FlowElementData> map) {
        Intrinsics.checkParameterIsNotNull(step, "value");
        Intrinsics.checkParameterIsNotNull(map, "flowElements");
        FlowStepData flowStepData = new FlowStepData();
        flowStepData.mo194831a(step.step_id);
        flowStepData.mo194835b(step.step_name);
        PbParseUtils dVar = f141443a;
        Map<String, Slot> map2 = step.slots;
        if (map2 == null) {
            map2 = Collections.emptyMap();
            Intrinsics.checkExpressionValueIsNotNull(map2, "Collections.emptyMap()");
        }
        flowStepData.mo194832a(dVar.mo194867b(map2, map));
        return flowStepData;
    }

    /* renamed from: a */
    public final FlowSlotData mo194862a(Slot slot, Map<String, FlowElementData> map) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(slot, "value");
        Intrinsics.checkParameterIsNotNull(map, "flowElements");
        FlowSlotData flowSlotData = new FlowSlotData();
        flowSlotData.mo194816c(slot.slot_id);
        flowSlotData.mo194818d(slot.linked_step_url);
        Boolean bool = slot.should_report_behavior;
        Intrinsics.checkExpressionValueIsNotNull(bool, "value.should_report_behavior");
        flowSlotData.mo194812a(bool.booleanValue());
        String str = slot.element_id;
        FlowElementData flowElementData = null;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = null;
            }
            if (str != null) {
                flowElementData = map.get(str);
            }
        }
        flowSlotData.mo194810a(flowElementData);
        return flowSlotData;
    }

    /* renamed from: b */
    public final Map<String, FlowSlotData> mo194867b(Map<String, Slot> map, Map<String, FlowElementData> map2) {
        Intrinsics.checkParameterIsNotNull(map, "slots");
        Intrinsics.checkParameterIsNotNull(map2, "flowElements");
        HashMap hashMap = new HashMap();
        for (T t : map.entrySet()) {
            if (!(t.getKey() == null || t.getValue() == null)) {
                HashMap hashMap2 = hashMap;
                Object key = t.getKey();
                if (key == null) {
                    Intrinsics.throwNpe();
                }
                PbParseUtils dVar = f141443a;
                Object value = t.getValue();
                if (value == null) {
                    Intrinsics.throwNpe();
                }
                hashMap2.put(key, dVar.mo194862a((Slot) value, map2));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final HashMap<String, FlowStepData> mo194865a(Map<String, Step> map, Map<String, FlowElementData> map2) {
        Intrinsics.checkParameterIsNotNull(map, "steps");
        Intrinsics.checkParameterIsNotNull(map2, "flowElements");
        HashMap<String, FlowStepData> hashMap = new HashMap<>();
        for (T t : map.entrySet()) {
            if (!(t.getKey() == null || t.getValue() == null)) {
                HashMap<String, FlowStepData> hashMap2 = hashMap;
                Object key = t.getKey();
                if (key == null) {
                    Intrinsics.throwNpe();
                }
                PbParseUtils dVar = f141443a;
                Object value = t.getValue();
                if (value == null) {
                    Intrinsics.throwNpe();
                }
                hashMap2.put(key, dVar.mo194863a((Step) value, map2));
            }
        }
        return hashMap;
    }
}
