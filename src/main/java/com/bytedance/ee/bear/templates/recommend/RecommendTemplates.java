package com.bytedance.ee.bear.templates.recommend;

import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.TemplatesParser;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001c2\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/RecommendTemplates;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "Lkotlin/collections/ArrayList;", ShareHitPoint.f121868c, "", "templates", "err", "", "(ILjava/util/ArrayList;Ljava/lang/Throwable;)V", "getErr", "()Ljava/lang/Throwable;", "getSource", "()I", "getTemplates", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RecommendTemplates extends NetService.Result<ArrayList<TemplateV4>> {
    public static final Companion Companion = new Companion(null);
    private final Throwable err;
    private final int source;
    private final ArrayList<TemplateV4> templates;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.templates.recommend.RecommendTemplates */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendTemplates copy$default(RecommendTemplates recommendTemplates, int i, ArrayList arrayList, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recommendTemplates.source;
        }
        if ((i2 & 2) != 0) {
            arrayList = recommendTemplates.templates;
        }
        if ((i2 & 4) != 0) {
            th = recommendTemplates.err;
        }
        return recommendTemplates.copy(i, arrayList, th);
    }

    public final int component1() {
        return this.source;
    }

    public final ArrayList<TemplateV4> component2() {
        return this.templates;
    }

    public final Throwable component3() {
        return this.err;
    }

    public final RecommendTemplates copy(int i, ArrayList<TemplateV4> arrayList, Throwable th) {
        Intrinsics.checkParameterIsNotNull(arrayList, "templates");
        return new RecommendTemplates(i, arrayList, th);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecommendTemplates) {
                RecommendTemplates recommendTemplates = (RecommendTemplates) obj;
                if (!(this.source == recommendTemplates.source) || !Intrinsics.areEqual(this.templates, recommendTemplates.templates) || !Intrinsics.areEqual(this.err, recommendTemplates.err)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.source * 31;
        ArrayList<TemplateV4> arrayList = this.templates;
        int i2 = 0;
        int hashCode = (i + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        Throwable th = this.err;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "RecommendTemplates(source=" + this.source + ", templates=" + this.templates + ", err=" + this.err + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/RecommendTemplates$Companion;", "", "()V", "TAG", "", "parseRecommendTemplates", "Lcom/bytedance/ee/bear/templates/recommend/RecommendTemplates;", ShareHitPoint.f121868c, "", "json", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.RecommendTemplates$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final RecommendTemplates mo44542a(int i, String str) {
            boolean z;
            JSONArray jSONArray;
            JSONObject jSONObject;
            String str2 = str;
            if (str2 == null || StringsKt.isBlank(str2)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new RecommendTemplates(i, new ArrayList(), new Throwable("json is null"));
            }
            new C10917c(new C10929e());
            Locale d = C4484g.m18494b().mo17253d();
            ConnectionService d2 = C5084ad.m20847d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "ConnectionServiceImp.getInstance()");
            ConnectionService.NetworkState b = d2.mo20038b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.get…            .networkState");
            boolean b2 = b.mo20041b();
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    jSONArray = optJSONObject.optJSONArray("templates");
                } else {
                    jSONArray = null;
                }
                if (optJSONObject != null) {
                    jSONObject = optJSONObject.optJSONObject("users");
                } else {
                    jSONObject = null;
                }
                TemplatesParser mVar = TemplatesParser.f31104a;
                Intrinsics.checkExpressionValueIsNotNull(d, "locale");
                return new RecommendTemplates(i, mVar.mo44287a(jSONArray, jSONObject, d, b2), null);
            } catch (Throwable th) {
                C13479a.m54758a("RecommendTemplates", "parse()...error:" + th);
                return new RecommendTemplates(i, new ArrayList(), th);
            }
        }
    }

    public final Throwable getErr() {
        return this.err;
    }

    public final int getSource() {
        return this.source;
    }

    public final ArrayList<TemplateV4> getTemplates() {
        return this.templates;
    }

    public RecommendTemplates(int i, ArrayList<TemplateV4> arrayList, Throwable th) {
        Intrinsics.checkParameterIsNotNull(arrayList, "templates");
        this.source = i;
        this.templates = arrayList;
        this.err = th;
    }
}
