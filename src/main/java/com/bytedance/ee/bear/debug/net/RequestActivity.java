package com.bytedance.ee.bear.debug.net;

import android.os.Bundle;
import com.bytedance.ee.bear.contract.DebugRequest;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/debug/net/RequestActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "()V", "onDoCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showDetail", "request", "Lcom/bytedance/ee/bear/contract/DebugRequest;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public class RequestActivity extends BaseActivity {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.activity_request);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new RequestListFragment()).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public final void mo21315a(DebugRequest debugRequest) {
        Intrinsics.checkParameterIsNotNull(debugRequest, "request");
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.facade_slide_right_in, R.anim.facade_slide_left_out, R.anim.facade_slide_left_in, R.anim.facade_slide_right_out).add(R.id.container, RequestDetailFragment.f15211a.mo21326a(debugRequest)).addToBackStack(null).commitAllowingStateLoss();
    }
}
