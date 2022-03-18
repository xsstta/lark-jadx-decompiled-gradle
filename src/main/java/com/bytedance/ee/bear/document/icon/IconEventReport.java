package com.bytedance.ee.bear.document.icon;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0005H\u0002J4\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00052\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u000fJ!\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconEventReport;", "", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "fileType", "", "(Lcom/bytedance/ee/bear/contract/AnalyticService;Ljava/lang/String;)V", "getAnalyticService", "()Lcom/bytedance/ee/bear/contract/AnalyticService;", "getFileType", "()Ljava/lang/String;", "getCommonParams", "", "action", "reportAction", "", "extraParams", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "reportAddIcon", "reportChangeIcon", "reportChangeTab", "reportChooseIcon", "iconId", "", "iconStyle", "(Ljava/lang/Integer;Ljava/lang/String;)V", "reportRandomIcon", "reportRemoveIcon", "reportSearchIcon", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.icon.a */
public final class IconEventReport {

    /* renamed from: a */
    public static final Companion f16336a = new Companion(null);

    /* renamed from: b */
    private final AbstractC5233x f16337b;

    /* renamed from: c */
    private final String f16338c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconEventReport$Companion;", "", "()V", "TAG", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo23391a() {
        m23435a("icon_add");
    }

    /* renamed from: b */
    public final void mo23393b() {
        m23435a("icon_change");
    }

    /* renamed from: c */
    public final void mo23395c() {
        m23435a("icon_remove");
    }

    /* renamed from: a */
    private final void m23435a(String str) {
        this.f16337b.mo21079a("docs_client_icon_change", m23437b(str));
    }

    /* renamed from: b */
    private final Map<String, String> m23437b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        String d = C13598b.m55197d(C5890a.m23707b());
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncri…ils.getOpeningDocToken())");
        hashMap.put("file_id", d);
        String str2 = this.f16338c;
        if (str2 == null) {
            C8275a aVar = C8275a.f22369b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
            str2 = aVar.mo32553a();
            Intrinsics.checkExpressionValueIsNotNull(str2, "DocumentType.UNKNOWN.type");
        }
        hashMap.put("file_type", str2);
        hashMap.put("module", "doc");
        return hashMap;
    }

    public IconEventReport(AbstractC5233x xVar, String str) {
        Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
        this.f16337b = xVar;
        this.f16338c = str;
    }

    /* renamed from: a */
    private final void m23436a(String str, HashMap<String, String> hashMap) {
        Map<String, String> b = m23437b(str);
        b.putAll(hashMap);
        this.f16337b.mo21079a("docs_client_icon_change", b);
    }

    /* renamed from: a */
    public final void mo23392a(Integer num, String str) {
        String str2;
        Pair[] pairArr = new Pair[2];
        if (num == null || (str2 = String.valueOf(num.intValue())) == null) {
            str2 = "";
        }
        pairArr[0] = TuplesKt.to("icon_id", str2);
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.to("icon_style", str);
        m23436a("icon_choose", MapsKt.hashMapOf(pairArr));
    }

    /* renamed from: b */
    public final void mo23394b(Integer num, String str) {
        String str2;
        Pair[] pairArr = new Pair[2];
        if (num == null || (str2 = String.valueOf(num.intValue())) == null) {
            str2 = "";
        }
        pairArr[0] = TuplesKt.to("icon_id", str2);
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.to("icon_style", str);
        m23436a("icon_random", MapsKt.hashMapOf(pairArr));
    }
}
