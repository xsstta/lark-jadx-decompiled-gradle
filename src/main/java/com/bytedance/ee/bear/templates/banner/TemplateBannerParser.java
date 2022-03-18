package com.bytedance.ee.bear.templates.banner;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.NetService;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/banner/BannerDataResult;", ShareHitPoint.f121868c, "", "(I)V", "getSource", "()I", "parse", "json", "", "parseBanner", "Lcom/bytedance/ee/bear/templates/banner/BannerData;", "bannerObj", "Lcom/alibaba/fastjson/JSONObject;", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.banner.e */
public final class TemplateBannerParser implements NetService.AbstractC5074c<BannerDataResult> {

    /* renamed from: a */
    public static final Companion f30772a = new Companion(null);

    /* renamed from: b */
    private final int f30773b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerParser$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TemplateBannerParser(int i) {
        this.f30773b = i;
    }

    /* renamed from: a */
    private final BannerData m47633a(JSONObject jSONObject) {
        int intValue = jSONObject.getIntValue("banner_type");
        String string = jSONObject.getString("image_url");
        String string2 = jSONObject.getString("title");
        String string3 = jSONObject.getString("text");
        String string4 = jSONObject.getString("topic_id");
        String string5 = jSONObject.getString("template_id");
        int intValue2 = jSONObject.getIntValue("obj_type");
        String string6 = jSONObject.getString("obj_token");
        JSONArray jSONArray = jSONObject.getJSONArray("obj_type_list");
        if (jSONArray != null) {
            return new BannerData(intValue, string, string2, string3, string4, string5, intValue2, string6, jSONArray, jSONObject.getString("jump_link_url"), jSONObject.getIntValue("banner_id"), jSONObject.getString("collection_id"));
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[Catch:{ all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[Catch:{ all -> 0x0067 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.ee.bear.templates.banner.BannerDataResult parse(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.banner.TemplateBannerParser.parse(java.lang.String):com.bytedance.ee.bear.templates.banner.BannerDataResult");
    }
}
