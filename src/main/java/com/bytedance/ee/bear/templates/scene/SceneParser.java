package com.bytedance.ee.bear.templates.scene;

import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.TemplatesParser;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/templates/scene/SceneParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/scene/TopicDataResult;", "()V", "parse", "json", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.scene.h */
public final class SceneParser implements NetService.AbstractC5074c<TopicDataResult> {
    /* renamed from: a */
    public TopicDataResult parse(String str) {
        ArrayList<TemplateV4> arrayList;
        ArrayList<TemplateV4> arrayList2;
        ArrayList<TemplateV4> arrayList3;
        ArrayList<TemplateV4> arrayList4;
        ArrayList<TemplateV4> arrayList5;
        new C10917c(new C10929e());
        Locale d = C4484g.m18494b().mo17253d();
        ConnectionService d2 = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d2.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.get…            .networkState");
        boolean b2 = b.mo20041b();
        JSONObject jSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("templates");
        ArrayList arrayList6 = new ArrayList();
        if (jSONObject.has(String.valueOf(2))) {
            TemplatesParser mVar = TemplatesParser.f31104a;
            JSONArray jSONArray = jSONObject.getJSONArray(String.valueOf(2));
            Intrinsics.checkExpressionValueIsNotNull(d, "locale");
            arrayList = mVar.mo44287a(jSONArray, (JSONObject) null, d, b2);
        } else {
            arrayList = new ArrayList<>();
        }
        if (jSONObject.has(String.valueOf(3))) {
            TemplatesParser mVar2 = TemplatesParser.f31104a;
            JSONArray jSONArray2 = jSONObject.getJSONArray(String.valueOf(3));
            Intrinsics.checkExpressionValueIsNotNull(d, "locale");
            arrayList2 = mVar2.mo44287a(jSONArray2, (JSONObject) null, d, b2);
        } else {
            arrayList2 = new ArrayList<>();
        }
        if (jSONObject.has(String.valueOf(11))) {
            TemplatesParser mVar3 = TemplatesParser.f31104a;
            JSONArray jSONArray3 = jSONObject.getJSONArray(String.valueOf(11));
            Intrinsics.checkExpressionValueIsNotNull(d, "locale");
            arrayList3 = mVar3.mo44287a(jSONArray3, (JSONObject) null, d, b2);
        } else {
            arrayList3 = new ArrayList<>();
        }
        if (jSONObject.has(String.valueOf(8))) {
            TemplatesParser mVar4 = TemplatesParser.f31104a;
            JSONArray jSONArray4 = jSONObject.getJSONArray(String.valueOf(8));
            Intrinsics.checkExpressionValueIsNotNull(d, "locale");
            arrayList4 = mVar4.mo44287a(jSONArray4, (JSONObject) null, d, b2);
        } else {
            arrayList4 = new ArrayList<>();
        }
        C8275a aVar = C8275a.f22378k;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOCX");
        if (jSONObject.has(String.valueOf(aVar.mo32555b()))) {
            TemplatesParser mVar5 = TemplatesParser.f31104a;
            JSONArray jSONArray5 = jSONObject.getJSONArray(String.valueOf(8));
            Intrinsics.checkExpressionValueIsNotNull(d, "locale");
            arrayList5 = mVar5.mo44287a(jSONArray5, (JSONObject) null, d, b2);
        } else {
            arrayList5 = new ArrayList<>();
        }
        arrayList6.addAll(arrayList);
        arrayList6.addAll(arrayList2);
        arrayList6.addAll(arrayList3);
        arrayList6.addAll(arrayList4);
        arrayList6.addAll(arrayList5);
        TopicDataResult topicDataResult = new TopicDataResult();
        topicDataResult.data = new TopicData(arrayList6);
        return topicDataResult;
    }
}
