package com.bytedance.ee.bear.templates.center.list.system;

import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AbstractC5082ab;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.templates.TemplatesParser;
import com.bytedance.ee.bear.templates.center.list.Category;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateMoreParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", ShareHitPoint.f121868c, "", "cacheKey", "", "needCache", "", "categoryId", "", "(ILjava/lang/String;ZJ)V", "parse", "json", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.d.e */
public final class SystemTemplateMoreParser implements NetService.AbstractC5074c<TemplateGroupTab> {

    /* renamed from: a */
    public static final Companion f30992a = new Companion(null);

    /* renamed from: b */
    private final int f30993b;

    /* renamed from: c */
    private final String f30994c;

    /* renamed from: d */
    private final boolean f30995d;

    /* renamed from: e */
    private final long f30996e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateMoreParser$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.d.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public TemplateGroupTab parse(String str) {
        boolean z;
        JSONArray jSONArray;
        boolean z2;
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new TemplateGroupTab(this.f30993b, new ArrayList(), false, false, null, new Throwable("json is null"), null, 0, TTVideoEngine.PLAYER_OPTION_SET_SUPER_RES_STRENGTH, null);
        }
        Locale d = C4484g.m18494b().mo17253d();
        ConnectionService d2 = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d2.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        boolean b2 = b.mo20041b();
        if (this.f30995d) {
            ((AbstractC5082ab) KoinJavaComponent.m268613a(AbstractC5082ab.class, null, null, 6, null)).mo20178a(this.f30994c, str);
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                jSONArray = optJSONObject.optJSONArray("template_list");
            } else {
                jSONArray = null;
            }
            if (optJSONObject != null) {
                z2 = optJSONObject.optBoolean("has_more");
            } else {
                z2 = false;
            }
            TemplatesParser mVar = TemplatesParser.f31104a;
            Intrinsics.checkExpressionValueIsNotNull(d, "locale");
            return new TemplateGroupTab(this.f30993b, CollectionsKt.arrayListOf(new CategoryTab(null, CollectionsKt.arrayListOf(new Category(null, z2, mVar.mo44287a(jSONArray, (JSONObject) null, d, b2), this.f30996e, false, null, null, SmEvents.EVENT_RE, null)), this.f30996e, 0, 9, null)), z2, false, null, null, null, 0, 248, null);
        } catch (Throwable th) {
            C13479a.m54759a("SystemTemplateMoreParser", "parse()...err", th);
            return new TemplateGroupTab(this.f30993b, null, false, false, null, th, null, 0, SmEvents.EVENT_FT, null);
        }
    }

    public SystemTemplateMoreParser(int i, String str, boolean z, long j) {
        Intrinsics.checkParameterIsNotNull(str, "cacheKey");
        this.f30993b = i;
        this.f30994c = str;
        this.f30995d = z;
        this.f30996e = j;
    }
}
