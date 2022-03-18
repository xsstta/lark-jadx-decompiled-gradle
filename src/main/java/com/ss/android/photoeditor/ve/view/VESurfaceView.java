package com.ss.android.photoeditor.ve.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import com.ss.android.photoeditor.ve.controller.IImageEditController;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u001c\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/ss/android/photoeditor/ve/view/VESurfaceView;", "Landroid/view/SurfaceView;", "Landroid/view/View$OnTouchListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "editController", "Lcom/ss/android/photoeditor/ve/controller/IImageEditController;", "getEditController", "()Lcom/ss/android/photoeditor/ve/controller/IImageEditController;", "setEditController", "(Lcom/ss/android/photoeditor/ve/controller/IImageEditController;)V", "onSurfaceViewClickListener", "Landroid/view/View$OnClickListener;", "getOnSurfaceViewClickListener", "()Landroid/view/View$OnClickListener;", "setOnSurfaceViewClickListener", "(Landroid/view/View$OnClickListener;)V", "init", "", "onSurfaceViewClick", "v", "Landroid/view/View;", "onTouch", "", "event", "Landroid/view/MotionEvent;", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class VESurfaceView extends SurfaceView implements View.OnTouchListener {

    /* renamed from: a */
    private IImageEditController f149461a;

    /* renamed from: b */
    private View.OnClickListener f149462b;

    public final IImageEditController getEditController() {
        return this.f149461a;
    }

    public final View.OnClickListener getOnSurfaceViewClickListener() {
        return this.f149462b;
    }

    /* renamed from: a */
    public final void mo204156a() {
        setOnTouchListener(this);
        setOnClickListener(new View$OnClickListenerC59955a(this));
    }

    public final void setEditController(IImageEditController aVar) {
        this.f149461a = aVar;
    }

    public final void setOnSurfaceViewClickListener(View.OnClickListener onClickListener) {
        this.f149462b = onClickListener;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.VESurfaceView$a */
    public static final class View$OnClickListenerC59955a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VESurfaceView f149463a;

        View$OnClickListenerC59955a(VESurfaceView vESurfaceView) {
            this.f149463a = vESurfaceView;
        }

        public final void onClick(View view) {
            this.f149463a.mo204157a(view);
        }
    }

    public VESurfaceView(Context context) {
        super(context);
        mo204156a();
    }

    /* renamed from: a */
    public final void mo204157a(View view) {
        View.OnClickListener onClickListener;
        IImageEditController aVar = this.f149461a;
        if ((aVar == null || !aVar.mo203586a(view)) && (onClickListener = this.f149462b) != null) {
            onClickListener.onClick(view);
        }
    }

    public VESurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo204156a();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        IImageEditController aVar;
        Boolean b;
        if (motionEvent == null || (aVar = this.f149461a) == null || (b = aVar.mo203587b(view, motionEvent)) == null) {
            return false;
        }
        return b.booleanValue();
    }

    public VESurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo204156a();
    }
}
