package com.ss.android.lark.money.redpacket.cover;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverListResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract;", "", "()V", "IModel", "IView", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.cover.c */
public final class IRedPacketCoverContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getCovers", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.c$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo168274a(IGetDataCallback<RedPacketCoverListResponse> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IView$Delegate;", "initCoverRecyclerView", "", "coverListResponse", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "initView", "showDefaultOnly", "Delegate", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.c$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.money.redpacket.cover.c$b$a */
        public interface Delegate extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo168255a();

        /* renamed from: a */
        void mo168257a(RedPacketCoverListResponse redPacketCoverListResponse);

        /* renamed from: b */
        void mo168258b();
    }
}
