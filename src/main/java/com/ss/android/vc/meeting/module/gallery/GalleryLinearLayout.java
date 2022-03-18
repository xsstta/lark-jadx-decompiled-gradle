package com.ss.android.vc.meeting.module.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\rR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nXD¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/vc/meeting/module/gallery/GalleryLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "galleryListTouchDownX", "", "galleryListTouchDownY", "galleryViewControl", "Lcom/ss/android/vc/meeting/module/gallery/GalleryViewControl;", "lastX", "moveDirectionThreshold", "onInterceptTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setGalleryViewControl", "", "viewControl", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class GalleryLinearLayout extends LinearLayout {

    /* renamed from: a */
    private GalleryViewControl f155432a;

    /* renamed from: b */
    private float f155433b;

    /* renamed from: c */
    private float f155434c;

    /* renamed from: d */
    private float f155435d;

    /* renamed from: e */
    private final float f155436e;

    public GalleryLinearLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public GalleryLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setGalleryViewControl(GalleryViewControl fVar) {
        this.f155432a = fVar;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        GalleryViewControl fVar;
        GalleryViewControl fVar2;
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (C61999a.m242220f()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f155433b = motionEvent.getY();
            this.f155434c = motionEvent.getX();
            this.f155435d = motionEvent.getX();
        }
        if (motionEvent.getAction() != 2 && motionEvent.getAction() == 1) {
            if (this.f155433b - motionEvent.getY() > ((float) UIHelper.dp2px(this.f155436e)) && this.f155433b - motionEvent.getY() > Math.abs(motionEvent.getX() - this.f155434c) && (fVar2 = this.f155432a) != null && fVar2.mo214361o()) {
                GalleryViewControl fVar3 = this.f155432a;
                if (fVar3 != null) {
                    fVar3.mo214371c();
                }
                return true;
            } else if (motionEvent.getY() - this.f155433b > ((float) UIHelper.dp2px(this.f155436e)) && motionEvent.getY() - this.f155433b > Math.abs(motionEvent.getX() - this.f155434c) && (fVar = this.f155432a) != null && !fVar.mo214361o()) {
                GalleryViewControl fVar4 = this.f155432a;
                if (fVar4 != null) {
                    fVar4.mo214372d();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f155436e = 5.0f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GalleryLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
