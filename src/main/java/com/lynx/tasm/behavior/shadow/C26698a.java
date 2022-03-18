package com.lynx.tasm.behavior.shadow;

import android.view.Choreographer;

/* renamed from: com.lynx.tasm.behavior.shadow.a */
public class C26698a implements AbstractC26702c {
    @Override // com.lynx.tasm.behavior.shadow.AbstractC26702c
    /* renamed from: a */
    public void mo94816a(final Runnable runnable) {
        if (runnable != null) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() {
                /* class com.lynx.tasm.behavior.shadow.C26698a.Choreographer$FrameCallbackC266991 */

                public void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }
}
