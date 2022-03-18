package com.ss.android.lark.mine.impl.index.v2.bottom;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.ss.android.lark.mine.dto.C45424b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "onCallChatId", "Landroidx/lifecycle/MutableLiveData;", "", "getOnCallChatId", "()Landroidx/lifecycle/MutableLiveData;", "onCallInfo", "Lcom/ss/android/lark/mine/dto/HomeOnCall;", "getOnCallInfo", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.a */
public final class BottomViewModel extends AbstractC1142af {
    private final C1177w<String> onCallChatId = new C1177w<>();
    private final C1177w<C45424b> onCallInfo = new C1177w<>();

    public final C1177w<String> getOnCallChatId() {
        return this.onCallChatId;
    }

    public final C1177w<C45424b> getOnCallInfo() {
        return this.onCallInfo;
    }
}
