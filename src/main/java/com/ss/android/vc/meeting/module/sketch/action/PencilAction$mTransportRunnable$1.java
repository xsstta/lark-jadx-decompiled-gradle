package com.ss.android.vc.meeting.module.sketch.action;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.vc.meeting.module.sketch.Sketch;
import com.ss.android.vc.meeting.module.sketch.SketchConfig;
import com.ss.android.vc.meeting.module.sketch.SketchRustImpl;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/meeting/module/sketch/action/PencilAction$mTransportRunnable$1", "Ljava/lang/Runnable;", "run", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class PencilAction$mTransportRunnable$1 implements Runnable {
    final /* synthetic */ PencilAction this$0;

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (PencilAction.Companion.getMRawData()) {
            if (PencilAction.Companion.getMRawData().size() > 0 && !TextUtils.isEmpty(this.this$0.meetingId)) {
                SketchRustImpl.sendPencil(this.this$0.meetingId, this.this$0.getModel().getSketchControl().curShareScreenId, Sketch.pencilFitting(this.this$0.getModel().getSketchControl().getSketchInstanceId()));
            }
            Unit unit = Unit.INSTANCE;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        Handler handler = this.this$0.mDrawHandler;
        if (handler != null) {
            handler.postDelayed(this, Math.max(((long) SketchConfig.pencil_fitting_interval) - currentTimeMillis2, 0L));
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PencilAction$mTransportRunnable$1(PencilAction pencilAction) {
        this.this$0 = pencilAction;
    }
}
