package com.bytedance.ee.bear.templates.banner;

import com.bytedance.ee.bear.contract.NetService;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/BannerDataResult;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/banner/BannerData;", "Lkotlin/collections/ArrayList;", ShareHitPoint.f121868c, "", "(I)V", "getSource", "()I", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BannerDataResult extends NetService.Result<ArrayList<BannerData>> {
    private final int source;

    public final int getSource() {
        return this.source;
    }

    public BannerDataResult(int i) {
        this.source = i;
    }
}
