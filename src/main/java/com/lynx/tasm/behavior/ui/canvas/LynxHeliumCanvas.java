package com.lynx.tasm.behavior.ui.canvas;

import android.content.Context;
import android.content.ContextWrapper;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.provider.CanvasProvider;

public class LynxHeliumCanvas extends LynxUI<LynxHeliumCanvasView> {

    /* renamed from: a */
    private Long f66347a = this.f66239t.mo94690l();

    /* renamed from: d */
    public Long mo53300d() {
        return this.f66347a;
    }

    public LynxHeliumCanvas(Context context) {
        super(context);
        CanvasProvider a = LynxEnv.m96123e().mo94081a();
        if (a != null) {
            a.mo95198a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LynxHeliumCanvasView mo33942b(Context context) {
        ContextWrapper contextWrapper = (ContextWrapper) context;
        this.f66253Z = new LynxHeliumCanvasView(context);
        ((LynxHeliumCanvasView) this.f66253Z).setOpaque(false);
        return (LynxHeliumCanvasView) this.f66253Z;
    }
}
