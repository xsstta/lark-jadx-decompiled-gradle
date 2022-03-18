package com.bytedance.ee.bear.templates.preview.announce;

import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00182\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001:\u0001\u0018B'\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateResults;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplate;", "Lkotlin/collections/ArrayList;", "templates", "err", "", "(Ljava/util/ArrayList;Ljava/lang/Throwable;)V", "getErr", "()Ljava/lang/Throwable;", "getTemplates", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AnnounceTemplateResults extends NetService.Result<ArrayList<AnnounceTemplate>> {
    public static final Companion Companion = new Companion(null);
    private final Throwable err;
    private final ArrayList<AnnounceTemplate> templates;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplateResults */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnounceTemplateResults copy$default(AnnounceTemplateResults announceTemplateResults, ArrayList arrayList, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = announceTemplateResults.templates;
        }
        if ((i & 2) != 0) {
            th = announceTemplateResults.err;
        }
        return announceTemplateResults.copy(arrayList, th);
    }

    public final ArrayList<AnnounceTemplate> component1() {
        return this.templates;
    }

    public final Throwable component2() {
        return this.err;
    }

    public final AnnounceTemplateResults copy(ArrayList<AnnounceTemplate> arrayList, Throwable th) {
        Intrinsics.checkParameterIsNotNull(arrayList, "templates");
        return new AnnounceTemplateResults(arrayList, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnounceTemplateResults)) {
            return false;
        }
        AnnounceTemplateResults announceTemplateResults = (AnnounceTemplateResults) obj;
        return Intrinsics.areEqual(this.templates, announceTemplateResults.templates) && Intrinsics.areEqual(this.err, announceTemplateResults.err);
    }

    public int hashCode() {
        ArrayList<AnnounceTemplate> arrayList = this.templates;
        int i = 0;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        Throwable th = this.err;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AnnounceTemplateResults(templates=" + this.templates + ", err=" + this.err + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000fj\b\u0012\u0004\u0012\u00020\t`\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateResults$Companion;", "", "()V", "TAG", "", "parseAnnounceTemplates", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateResults;", "json", "parseTemplate", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplate;", "jsonObject", "Lorg/json/JSONObject;", "isConnected", "", "parseTemplateArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "jsonArray", "Lorg/json/JSONArray;", "parseThumbnail", "Lcom/bytedance/ee/bear/templates/preview/announce/ThumbnailExtra;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplateResults$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final ThumbnailExtra m48072a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return new ThumbnailExtra(null, null, 0, 7, null);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("thumbnail_extra");
            if (optJSONObject == null) {
                return new ThumbnailExtra(null, null, 0, 7, null);
            }
            String optString = optJSONObject.optString("decrypt_key");
            Intrinsics.checkExpressionValueIsNotNull(optString, "thumbnailObj.optString(\"decrypt_key\")");
            String optString2 = optJSONObject.optString("thumbnail");
            Intrinsics.checkExpressionValueIsNotNull(optString2, "thumbnailObj.optString(\"thumbnail\")");
            return new ThumbnailExtra(optString, optString2, optJSONObject.optInt(ShareHitPoint.f121869d));
        }

        /* renamed from: a */
        public final AnnounceTemplateResults mo44332a(String str) {
            boolean z;
            JSONArray jSONArray;
            String str2 = str;
            if (str2 == null || StringsKt.isBlank(str2)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new AnnounceTemplateResults(new ArrayList(), new Throwable("json is null"));
            }
            new C10917c(new C10929e());
            ConnectionService d = C5084ad.m20847d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
            ConnectionService.NetworkState b = d.mo20038b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.get…            .networkState");
            boolean b2 = b.mo20041b();
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    jSONArray = optJSONObject.optJSONArray("templates");
                } else {
                    jSONArray = null;
                }
                return new AnnounceTemplateResults(m48073a(jSONArray, b2), null);
            } catch (Throwable th) {
                C13479a.m54758a("AnnounceTemplates", "parse()...error:" + th);
                return new AnnounceTemplateResults(new ArrayList(), th);
            }
        }

        /* renamed from: a */
        private final AnnounceTemplate m48071a(JSONObject jSONObject, boolean z) {
            ThumbnailExtra a = m48072a(jSONObject);
            String optString = jSONObject.optString("id");
            Intrinsics.checkExpressionValueIsNotNull(optString, "jsonObject.optString(\"id\")");
            String optString2 = jSONObject.optString("name");
            Intrinsics.checkExpressionValueIsNotNull(optString2, "jsonObject.optString(\"name\")");
            String optString3 = jSONObject.optString("obj_token");
            Intrinsics.checkExpressionValueIsNotNull(optString3, "jsonObject.optString(\"obj_token\")");
            return new AnnounceTemplate(optString, optString2, optString3, jSONObject.optInt("obj_type"), a, z);
        }

        /* renamed from: a */
        private final ArrayList<AnnounceTemplate> m48073a(JSONArray jSONArray, boolean z) {
            if (jSONArray == null) {
                return new ArrayList<>();
            }
            ArrayList<AnnounceTemplate> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                Intrinsics.checkExpressionValueIsNotNull(optJSONObject, "jsonArray.optJSONObject(i)");
                AnnounceTemplate a = m48071a(optJSONObject, z);
                C8275a aVar = C8275a.f22371d;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
                if (aVar.mo32555b() == a.getObjType()) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }
    }

    public final Throwable getErr() {
        return this.err;
    }

    public final ArrayList<AnnounceTemplate> getTemplates() {
        return this.templates;
    }

    public AnnounceTemplateResults(ArrayList<AnnounceTemplate> arrayList, Throwable th) {
        Intrinsics.checkParameterIsNotNull(arrayList, "templates");
        this.templates = arrayList;
        this.err = th;
    }
}
