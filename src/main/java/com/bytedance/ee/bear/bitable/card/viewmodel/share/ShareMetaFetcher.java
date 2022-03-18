package com.bytedance.ee.bear.bitable.card.viewmodel.share;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.share.IShareMeta;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/viewmodel/share/ShareMetaFetcher;", "", "()V", "API_PATH_SHARE_META", "", "fetchShareMeta", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/share/IShareMeta;", "baseToken", "tableId", "viewId", "shareType", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.share.a */
public final class ShareMetaFetcher {

    /* renamed from: a */
    public static final ShareMetaFetcher f14041a = new ShareMetaFetcher();

    private ShareMetaFetcher() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/share/IShareMeta;", "it", "Lcom/bytedance/ee/bear/bitable/card/viewmodel/share/ShareMeta;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.share.a$a */
    static final class C4778a<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C4778a f14042a = new C4778a();

        C4778a() {
        }

        /* renamed from: a */
        public final IShareMeta apply(ShareMeta shareMeta) {
            Intrinsics.checkParameterIsNotNull(shareMeta, "it");
            return shareMeta;
        }
    }

    /* renamed from: a */
    public final AbstractC68307f<IShareMeta> mo18649a(String str, String str2, String str3, int i) {
        Intrinsics.checkParameterIsNotNull(str, "baseToken");
        Intrinsics.checkParameterIsNotNull(str2, "tableId");
        Intrinsics.checkParameterIsNotNull(str3, "viewId");
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format("space/api/bitable/%s/share/meta", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        NetService.C5077f fVar = new NetService.C5077f(format);
        fVar.mo20143a(2);
        fVar.mo20145a("tableId", str2);
        fVar.mo20145a("viewId", str3);
        fVar.mo20145a("shareType", String.valueOf(i));
        AbstractC68307f<IShareMeta> d = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new ShareMetaParser()).mo20141a(fVar).mo238020d(C4778a.f14042a);
        Intrinsics.checkExpressionValueIsNotNull(d, "KoinJavaComponent.get(Ne… result\n                }");
        return d;
    }
}
