package com.bytedance.ee.bear.templates.search.custom;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.templates.search.base.BaseSearchModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/custom/CustomModel;", "Lcom/bytedance/ee/bear/templates/search/base/BaseSearchModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "offset", "", "searchKey", "", "buffer", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.c.a */
public final class CustomModel extends BaseSearchModel {

    /* renamed from: b */
    private final FragmentActivity f31373b;

    public CustomModel(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        this.f31373b = fragmentActivity;
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListModel, com.bytedance.ee.bear.templates.search.base.BaseSearchModel
    /* renamed from: a */
    public NetService.C5076e mo44654a(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        Intrinsics.checkParameterIsNotNull(str2, "buffer");
        NetService.C5076e a = super.mo44654a(i, str, str2);
        a.mo20145a(ShareHitPoint.f121868c, "2");
        return a;
    }
}
