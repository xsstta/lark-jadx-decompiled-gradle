package com.bytedance.ee.bear.document.docsobjinfo;

import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.WikiNavInfo;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/document/docsobjinfo/DocObjInfoExecutor;", "", "()V", "TAG", "", "URL", "requestDocObjInfo", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/DocObjInfo;", "token", ShareHitPoint.f121869d, "", "checkWiki", "", "pin", "star", "subscribe", "scene", "DocStatusInfoParser", "Scene", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.b.a */
public final class DocObjInfoExecutor {

    /* renamed from: a */
    public static final DocObjInfoExecutor f16031a = new DocObjInfoExecutor();

    private DocObjInfoExecutor() {
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/document/docsobjinfo/DocObjInfoExecutor$DocStatusInfoParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/DocObjInfo;", "()V", "getWikiInfoFromData", "Lcom/bytedance/ee/bear/WikiNavInfo;", "dataObj", "Lorg/json/JSONObject;", "parse", "json", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.b.a$a */
    public static final class DocStatusInfoParser implements NetService.AbstractC5074c<DocObjInfo> {
        /* renamed from: a */
        public final WikiNavInfo mo22662a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "dataObj");
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("wiki_info");
                boolean optBoolean = optJSONObject.optBoolean("is_wiki");
                String optString = optJSONObject.optString("wiki_token");
                Intrinsics.checkExpressionValueIsNotNull(optString, "wikiObj.optString(\"wiki_token\")");
                return new WikiNavInfo(optBoolean, optString);
            } catch (Exception unused) {
                return new WikiNavInfo(false, null, 3, null);
            }
        }

        /* renamed from: a */
        public DocObjInfo parse(String str) {
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                boolean optBoolean = optJSONObject.optBoolean("is_pined");
                boolean optBoolean2 = optJSONObject.optBoolean("is_stared");
                boolean optBoolean3 = optJSONObject.optBoolean("is_subscribed");
                Intrinsics.checkExpressionValueIsNotNull(optJSONObject, "dataObj");
                return new DocObjInfo(optBoolean, optBoolean2, optBoolean3, mo22662a(optJSONObject));
            } catch (Exception e) {
                C13479a.m54758a("DocObjInfoExecutor", "parse: " + e);
                return new DocObjInfo(false, false, false, null, 15, null);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<DocObjInfo> m23011a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "scene");
        C13479a.m54764b("DocObjInfoExecutor", "requestDocObjInfo.");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/aggregation/obj_info/");
        fVar.mo20145a("token", str);
        fVar.mo20145a("obj_type", String.valueOf(i));
        fVar.mo20145a("scence", str2);
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("is_wiki");
        }
        if (z2) {
            arrayList.add("is_pined");
        }
        if (z3) {
            arrayList.add("is_stared");
        }
        if (z4) {
            arrayList.add("is_subscribed");
        }
        fVar.mo20146a("info_types", arrayList);
        AbstractC68307f<DocObjInfo> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new DocStatusInfoParser()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m23012a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, Object obj) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if ((i2 & 4) != 0) {
            z5 = false;
        } else {
            z5 = z;
        }
        if ((i2 & 8) != 0) {
            z6 = true;
        } else {
            z6 = z2;
        }
        if ((i2 & 16) != 0) {
            z7 = true;
        } else {
            z7 = z3;
        }
        if ((i2 & 32) != 0) {
            z8 = true;
        } else {
            z8 = z4;
        }
        if ((i2 & 64) != 0) {
            str2 = "obj_detail";
        }
        return m23011a(str, i, z5, z6, z7, z8, str2);
    }
}
