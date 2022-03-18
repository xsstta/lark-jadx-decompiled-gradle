package com.bytedance.ee.bear.templates.topic;

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
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/templates/topic/TopicParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/topic/TopicDataResult;", ShareHitPoint.f121869d, "", "(I)V", "getType", "()I", "parse", "json", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.topic.i */
public final class TopicParser implements NetService.AbstractC5074c<TopicDataResult> {

    /* renamed from: a */
    private final int f31449a;

    public TopicParser(int i) {
        this.f31449a = i;
    }

    /* renamed from: a */
    public TopicDataResult parse(String str) {
        ArrayList<TemplateV4> arrayList;
        ArrayList<TemplateV4> arrayList2;
        ArrayList<TemplateV4> arrayList3;
        ArrayList<TemplateV4> arrayList4;
        ArrayList<TemplateV4> arrayList5;
        ArrayList<TemplateV4> arrayList6;
        new C10917c(new C10929e());
        Locale d = C4484g.m18494b().mo17253d();
        ConnectionService d2 = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d2.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.get…            .networkState");
        boolean b2 = b.mo20041b();
        JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("banner");
        C11670f fVar = new C11670f();
        fVar.f31436a = optJSONObject2.optString("image_url");
        fVar.f31437b = optJSONObject2.optString("obj_token");
        fVar.f31440e = optJSONObject2.optInt("obj_type");
        fVar.f31439d = optJSONObject2.optInt("template_id");
        fVar.f31438c = optJSONObject2.optInt("topic_id");
        JSONObject jSONObject = optJSONObject.getJSONObject("templates");
        ArrayList<TemplateV4> arrayList7 = new ArrayList<>();
        int i = this.f31449a;
        C8275a aVar = C8275a.f22369b;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
        if (i == aVar.mo32555b()) {
            if (jSONObject.has(String.valueOf(2))) {
                TemplatesParser mVar = TemplatesParser.f31104a;
                JSONArray jSONArray = jSONObject.getJSONArray(String.valueOf(2));
                Intrinsics.checkExpressionValueIsNotNull(d, "locale");
                arrayList2 = mVar.mo44287a(jSONArray, (JSONObject) null, d, b2);
            } else {
                arrayList2 = new ArrayList<>();
            }
            if (jSONObject.has(String.valueOf(3))) {
                TemplatesParser mVar2 = TemplatesParser.f31104a;
                JSONArray jSONArray2 = jSONObject.getJSONArray(String.valueOf(3));
                Intrinsics.checkExpressionValueIsNotNull(d, "locale");
                arrayList3 = mVar2.mo44287a(jSONArray2, (JSONObject) null, d, b2);
            } else {
                arrayList3 = new ArrayList<>();
            }
            if (jSONObject.has(String.valueOf(11))) {
                TemplatesParser mVar3 = TemplatesParser.f31104a;
                JSONArray jSONArray3 = jSONObject.getJSONArray(String.valueOf(11));
                Intrinsics.checkExpressionValueIsNotNull(d, "locale");
                arrayList4 = mVar3.mo44287a(jSONArray3, (JSONObject) null, d, b2);
            } else {
                arrayList4 = new ArrayList<>();
            }
            if (jSONObject.has(String.valueOf(8))) {
                TemplatesParser mVar4 = TemplatesParser.f31104a;
                JSONArray jSONArray4 = jSONObject.getJSONArray(String.valueOf(8));
                Intrinsics.checkExpressionValueIsNotNull(d, "locale");
                arrayList5 = mVar4.mo44287a(jSONArray4, (JSONObject) null, d, b2);
            } else {
                arrayList5 = new ArrayList<>();
            }
            if (jSONObject.has(String.valueOf(22))) {
                TemplatesParser mVar5 = TemplatesParser.f31104a;
                JSONArray jSONArray5 = jSONObject.getJSONArray(String.valueOf(22));
                Intrinsics.checkExpressionValueIsNotNull(d, "locale");
                arrayList6 = mVar5.mo44287a(jSONArray5, (JSONObject) null, d, b2);
            } else {
                arrayList6 = new ArrayList<>();
            }
            arrayList7.addAll(arrayList2);
            arrayList7.addAll(arrayList3);
            arrayList7.addAll(arrayList4);
            arrayList7.addAll(arrayList5);
            arrayList7.addAll(arrayList6);
        } else {
            if (jSONObject.has(String.valueOf(this.f31449a))) {
                TemplatesParser mVar6 = TemplatesParser.f31104a;
                JSONArray jSONArray6 = jSONObject.getJSONArray(String.valueOf(this.f31449a));
                Intrinsics.checkExpressionValueIsNotNull(d, "locale");
                arrayList = mVar6.mo44287a(jSONArray6, (JSONObject) null, d, b2);
            } else {
                arrayList = new ArrayList<>();
            }
            arrayList7 = arrayList;
        }
        TopicDataResult topicDataResult = new TopicDataResult();
        topicDataResult.data = new TopicData(fVar, arrayList7);
        return topicDataResult;
    }
}
