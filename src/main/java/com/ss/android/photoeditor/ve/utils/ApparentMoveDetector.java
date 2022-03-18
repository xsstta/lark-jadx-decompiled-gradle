package com.ss.android.photoeditor.ve.utils;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/photoeditor/ve/utils/ApparentMoveDetector;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isApparentMove", "", "()Z", "setApparentMove", "(Z)V", "onApparentMoveListener", "Lcom/ss/android/photoeditor/ve/utils/ApparentMoveDetector$OnApparentMoveListener;", "getOnApparentMoveListener", "()Lcom/ss/android/photoeditor/ve/utils/ApparentMoveDetector$OnApparentMoveListener;", "setOnApparentMoveListener", "(Lcom/ss/android/photoeditor/ve/utils/ApparentMoveDetector$OnApparentMoveListener;)V", "touchDownX", "", "touchDownY", "touchSlop", "", "recordEvent", "", "event", "Landroid/view/MotionEvent;", "OnApparentMoveListener", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.e.b */
public final class ApparentMoveDetector {

    /* renamed from: a */
    private float f149196a;

    /* renamed from: b */
    private float f149197b;

    /* renamed from: c */
    private final int f149198c;

    /* renamed from: d */
    private boolean f149199d;

    /* renamed from: e */
    private OnApparentMoveListener f149200e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/photoeditor/ve/utils/ApparentMoveDetector$OnApparentMoveListener;", "", "onApparentMoveEnd", "", "event", "Landroid/view/MotionEvent;", "onApparentMoveStart", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.e.b$a */
    public interface OnApparentMoveListener {
        /* renamed from: a */
        void mo203981a(MotionEvent motionEvent);

        /* renamed from: b */
        void mo203982b(MotionEvent motionEvent);
    }

    /* renamed from: a */
    public final boolean mo203980a() {
        return this.f149199d;
    }

    public ApparentMoveDetector(Context context) {
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        if (viewConfiguration != null) {
            i = viewConfiguration.getScaledTouchSlop();
        } else {
            i = 3;
        }
        this.f149198c = i;
    }

    /* renamed from: a */
    public final void mo203979a(MotionEvent motionEvent) {
        OnApparentMoveListener aVar;
        float f;
        OnApparentMoveListener aVar2;
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction() & 255;
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float f2 = this.f149196a;
                    float f3 = BitmapDescriptorFactory.HUE_RED;
                    if (f2 != BitmapDescriptorFactory.HUE_RED) {
                        f3 = motionEvent.getRawX() - this.f149196a;
                        f = motionEvent.getRawY() - this.f149197b;
                    } else {
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (!this.f149199d) {
                        if (Math.abs(f3) > ((float) this.f149198c) || Math.abs(f) > ((float) this.f149198c)) {
                            z = true;
                        }
                        this.f149199d = z;
                        if (z && (aVar2 = this.f149200e) != null) {
                            aVar2.mo203981a(motionEvent);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (action != 3) {
                    return;
                }
            }
            if (this.f149199d && (aVar = this.f149200e) != null) {
                aVar.mo203982b(motionEvent);
                return;
            }
            return;
        }
        this.f149196a = motionEvent.getRawX();
        this.f149197b = motionEvent.getRawY();
        this.f149199d = false;
    }
}
