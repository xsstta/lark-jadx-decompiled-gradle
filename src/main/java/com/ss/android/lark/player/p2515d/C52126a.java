package com.ss.android.lark.player.p2515d;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.player.d.a */
public class C52126a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    protected AbstractC52127b f129339a;

    /* renamed from: b */
    private final String f129340b = "GestureCallbackHandler";

    /* renamed from: c */
    private boolean f129341c = true;

    /* renamed from: d */
    private boolean f129342d = true;

    /* renamed from: a */
    public void mo178543a(MotionEvent motionEvent) {
        AbstractC52127b bVar = this.f129339a;
        if (bVar != null) {
            bVar.mo127027d();
        }
    }

    public C52126a(AbstractC52127b bVar) {
        this.f129339a = bVar;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        AbstractC52127b bVar = this.f129339a;
        if (bVar != null) {
            bVar.mo127026c(motionEvent);
        }
        return super.onDoubleTap(motionEvent);
    }

    public void onLongPress(MotionEvent motionEvent) {
        AbstractC52127b bVar = this.f129339a;
        if (bVar != null) {
            bVar.mo127022b(motionEvent);
        }
        super.onLongPress(motionEvent);
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        AbstractC52127b bVar = this.f129339a;
        if (bVar != null) {
            bVar.mo127015a(motionEvent);
        }
        return super.onSingleTapUp(motionEvent);
    }

    public boolean onDown(MotionEvent motionEvent) {
        Log.m165379d("GestureCallbackHandler", "onDown...");
        AbstractC52127b bVar = this.f129339a;
        if (bVar != null) {
            bVar.mo127028d(motionEvent);
        }
        return this.f129341c;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AbstractC52127b bVar = this.f129339a;
        if (bVar != null && this.f129342d) {
            bVar.mo127016a(motionEvent, motionEvent2, f, f2);
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }
}
