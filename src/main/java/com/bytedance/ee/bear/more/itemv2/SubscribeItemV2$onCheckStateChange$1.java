package com.bytedance.ee.bear.more.itemv2;

import com.bytedance.ee.bear.contract.BinderOnRequestCallback;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.util.p718t.C13748k;
import com.tt.frontendapiinterface.ApiHandler;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/more/itemv2/SubscribeItemV2$onCheckStateChange$1", "Lcom/bytedance/ee/bear/contract/BinderOnRequestCallback$Stub;", "onFail", "", "code", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onSuccess", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SubscribeItemV2$onCheckStateChange$1 extends BinderOnRequestCallback.Stub {
    final /* synthetic */ WeakReference $adapter;
    final /* synthetic */ IMoreInfo $moreInfo;
    final /* synthetic */ int $position;
    final /* synthetic */ boolean $toSubscribe;
    final /* synthetic */ SubscribeItemV2 this$0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.SubscribeItemV2$onCheckStateChange$1$a */
    static final class RunnableC10230a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SubscribeItemV2$onCheckStateChange$1 f27615a;

        RunnableC10230a(SubscribeItemV2$onCheckStateChange$1 subscribeItemV2$onCheckStateChange$1) {
            this.f27615a = subscribeItemV2$onCheckStateChange$1;
        }

        public final void run() {
            this.f27615a.this$0.notifyItemChange(this.f27615a.$adapter, this.f27615a.$position);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.SubscribeItemV2$onCheckStateChange$1$b */
    static final class RunnableC10231b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SubscribeItemV2$onCheckStateChange$1 f27616a;

        RunnableC10231b(SubscribeItemV2$onCheckStateChange$1 subscribeItemV2$onCheckStateChange$1) {
            this.f27616a = subscribeItemV2$onCheckStateChange$1;
        }

        public final void run() {
            this.f27616a.$moreInfo.mo39024a(this.f27616a.$toSubscribe);
        }
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5113f
    public void onSuccess() {
        C13748k.m55732a(new RunnableC10231b(this));
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5113f
    public void onFail(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
        C13748k.m55732a(new RunnableC10230a(this));
    }

    SubscribeItemV2$onCheckStateChange$1(SubscribeItemV2 subscribeItemV2, IMoreInfo dVar, boolean z, WeakReference weakReference, int i) {
        this.this$0 = subscribeItemV2;
        this.$moreInfo = dVar;
        this.$toSubscribe = z;
        this.$adapter = weakReference;
        this.$position = i;
    }
}
