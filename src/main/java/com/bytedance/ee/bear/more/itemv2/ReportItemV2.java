package com.bytedance.ee.bear.more.itemv2;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.domain.C6306d;
import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/more/itemv2/ReportItemV2;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/ITextMoreItem;", "()V", "mRouteService", "Lcom/bytedance/ee/bear/route/RouteService;", "getMRouteService", "()Lcom/bytedance/ee/bear/route/RouteService;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "getIcon", "", "getIconTint", "getId", "", "getTitle", "isVisible", "", "onClick", "", "Companion", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ReportItemV2 extends BaseMoreItem implements ITextMoreItem {
    public static final Companion Companion = new Companion(null);
    private final AbstractC10740f mRouteService = ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null));
    private final C10917c serviceContext = new C10917c(new C10929e());

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_warn_report_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "report";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/more/itemv2/ReportItemV2$Companion;", "", "()V", "DEFAULT_OFFICIAL_HOST", "", "TAG", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.ReportItemV2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AbstractC10740f getMRouteService() {
        return this.mRouteService;
    }

    public final C10917c getServiceContext() {
        return this.serviceContext;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_More_Report);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return ITextMoreItem.C10238a.m42706b(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        return ITextMoreItem.C10238a.m42705a(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return ITextMoreItem.C10238a.m42707c(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        return C4211a.m17514a().mo16536a("spacekit.mobile.space_report_enable", true);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        boolean z;
        String str;
        int i;
        String str2;
        String f;
        String h;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            JSONObject jSONObject = new JSONObject();
            String h2 = moreInfo.mo39041h();
            int e = moreInfo.mo39036e();
            StringBuilder sb = new StringBuilder();
            sb.append("token is empty = ");
            if (moreInfo.mo39041h().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54764b("ReportItemV2", sb.toString());
            jSONObject.put("obj_token", (Object) h2);
            jSONObject.put("obj_type", (Object) Integer.valueOf(e));
            String str3 = C6306d.f17467a;
            Intrinsics.checkExpressionValueIsNotNull(str3, "DomainCharacteristicCons…ON_CONFIG_PREFERENCE_NAME");
            PersistenceSharedPreference aVar = new PersistenceSharedPreference(str3);
            String str4 = C6306d.f17472f;
            Intrinsics.checkExpressionValueIsNotNull(str4, "DomainCharacteristicConstants.OFFICIAL");
            this.mRouteService.mo17292a(new Uri.Builder().scheme("https").authority((String) aVar.mo34038b(str4, "www.feishu.cn")).appendEncodedPath("report/").appendQueryParameter(ShareHitPoint.f121869d, "docs").appendQueryParameter("params", jSONObject.toJSONString()).toString());
            IMoreInfo moreInfo2 = getMoreInfo();
            if (moreInfo2 == null || (h = moreInfo2.mo39041h()) == null) {
                str = "null";
            } else {
                str = h;
            }
            if (moreInfo2 != null) {
                i = moreInfo2.mo39036e();
            } else {
                i = -1;
            }
            if (moreInfo2 == null || (f = moreInfo2.mo39038f()) == null) {
                str2 = "null";
            } else {
                str2 = f;
            }
            if (moreInfo2 instanceof DocMoreInfo) {
                C10196b.m42463a(getHost().mo39165b().getArguments(), str, i, moreInfo.mo39009E(), str2, "report_abuse", "none", "", "", "", moreInfo2 instanceof WikiMoreInfo, ((DocMoreInfo) moreInfo2).mo39008D());
            }
        }
        getHost().mo39166c();
    }
}
