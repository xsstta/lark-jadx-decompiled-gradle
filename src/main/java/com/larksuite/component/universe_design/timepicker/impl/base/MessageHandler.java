package com.larksuite.component.universe_design.timepicker.impl.base;

import android.os.Handler;
import android.os.Message;
import com.larksuite.component.universe_design.timepicker.impl.base.WheelView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/base/MessageHandler;", "Landroid/os/Handler;", "loopview", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "(Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;)V", "getLoopview", "()Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "handleMessage", "", "msg", "Landroid/os/Message;", "Companion", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.base.f */
public final class MessageHandler extends Handler {

    /* renamed from: a */
    public static final Companion f63728a = new Companion(null);

    /* renamed from: b */
    private final WheelView f63729b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/base/MessageHandler$Companion;", "", "()V", "WHAT_INVALIDATE_LOOP_VIEW", "", "WHAT_ITEM_SELECTED", "WHAT_SMOOTH_SCROLL", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.base.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MessageHandler(WheelView wheelView) {
        Intrinsics.checkParameterIsNotNull(wheelView, "loopview");
        this.f63729b = wheelView;
    }

    public void handleMessage(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "msg");
        int i = message.what;
        if (i == 1000) {
            this.f63729b.invalidate();
        } else if (i == 2000) {
            this.f63729b.smoothScroll(WheelView.ACTION.FLING);
        } else if (i == 3000) {
            this.f63729b.onItemSelected();
        }
    }
}
