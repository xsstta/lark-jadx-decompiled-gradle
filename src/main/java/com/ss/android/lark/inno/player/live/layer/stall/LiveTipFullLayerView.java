package com.ss.android.lark.inno.player.live.layer.stall;

import android.content.Context;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/inno/player/live/layer/stall/LiveTipFullLayerView;", "Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getLayoutId", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.inno.player.live.a.e.d */
public final class LiveTipFullLayerView extends BaseLiveTipLayerView {
    @Override // com.ss.android.lark.inno.player.live.layer.stall.BaseLiveTipLayerView
    public int getLayoutId() {
        return R.layout.inno_live_layer_stall_full;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveTipFullLayerView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
