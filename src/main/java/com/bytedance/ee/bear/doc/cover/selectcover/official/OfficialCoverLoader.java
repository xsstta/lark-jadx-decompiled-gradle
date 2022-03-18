package com.bytedance.ee.bear.doc.cover.selectcover.official;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import io.reactivex.AbstractC68307f;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverLoader;", "", "()V", "API_GET_COVER_DATA", "", "fetchRemoteCoverData", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData;", "docToken", "docType", "", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.d */
public final class OfficialCoverLoader {

    /* renamed from: a */
    public static final OfficialCoverLoader f15446a = new OfficialCoverLoader();

    private OfficialCoverLoader() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData;", "kotlin.jvm.PlatformType", "json", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.d$a */
    public static final class C5404a<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<OfficialCoverData> {

        /* renamed from: a */
        public static final C5404a f15447a = new C5404a();

        C5404a() {
        }

        /* renamed from: a */
        public final OfficialCoverData parse(String str) {
            return (OfficialCoverData) JSON.parseObject(str, OfficialCoverData.class);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<OfficialCoverData> m21970a(String str, int i) {
        C10917c cVar = ar.f14811a;
        Uri.Builder buildUpon = Uri.parse("/space/api/doc.v2/cover/candidates/").buildUpon();
        buildUpon.appendQueryParameter("obj_token", str);
        buildUpon.appendQueryParameter("obj_type", String.valueOf(i));
        NetService.C5077f fVar = new NetService.C5077f(buildUpon.build().toString());
        fVar.mo20143a(2);
        AbstractC68307f<OfficialCoverData> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(C5404a.f15447a).mo20141a(fVar).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e());
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller …rSchedulers.mainThread())");
        return a;
    }
}
