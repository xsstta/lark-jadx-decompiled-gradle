package com.ss.android.lark.money.redpacket.cover;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.money.redpacket.cover.IRedPacketCoverContract;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverListResponse;
import com.ss.android.lark.money.redpacket.service.RedPacketCoverService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IModel;", "()V", "getCovers", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.cover.d */
public final class RedPacketCoverModel extends BaseModel implements IRedPacketCoverContract.IModel {
    @Override // com.ss.android.lark.money.redpacket.cover.IRedPacketCoverContract.IModel
    /* renamed from: a */
    public void mo168274a(IGetDataCallback<RedPacketCoverListResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        RedPacketCoverService.f120931a.mo168228a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }
}
