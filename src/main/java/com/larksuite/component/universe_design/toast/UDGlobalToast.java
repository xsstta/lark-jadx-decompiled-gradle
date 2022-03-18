package com.larksuite.component.universe_design.toast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Toast;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDGlobalToast;", "Landroid/widget/Toast;", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mController", "Lcom/larksuite/component/universe_design/toast/UDToastViewController;", "cancel", "", "isShowing", "", "setIcon", "drawable", "Landroid/graphics/drawable/Drawable;", "resId", "", "setText", "s", "", "show", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.toast.c */
public final class UDGlobalToast extends Toast implements UDToastImpl {

    /* renamed from: a */
    private final UDToastViewController f63811a;

    @Override // com.larksuite.component.universe_design.toast.UDToastImpl
    public void cancel() {
        super.cancel();
    }

    @Override // com.larksuite.component.universe_design.toast.UDToastImpl
    /* renamed from: c */
    public boolean mo91668c() {
        View view = getView();
        if (view != null) {
            return view.isAttachedToWindow();
        }
        return false;
    }

    @Override // com.larksuite.component.universe_design.toast.UDToastImpl
    public void show() {
        UDToastUtils.f63812a.mo91697a(this);
        this.f63811a.mo91706b();
        super.show();
    }

    @Override // com.larksuite.component.universe_design.toast.UDToastImpl
    /* renamed from: a */
    public void mo91660a(int i) {
        this.f63811a.mo91707b(i);
    }

    @Override // android.widget.Toast
    public void setText(int i) {
        this.f63811a.mo91701a(i);
    }

    @Override // com.larksuite.component.universe_design.toast.UDToastImpl
    /* renamed from: a */
    public void mo91663a(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        this.f63811a.mo91703a(drawable);
    }

    @Override // android.widget.Toast, com.larksuite.component.universe_design.toast.UDToastImpl
    public void setText(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "s");
        this.f63811a.mo91704a(charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDGlobalToast(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        UDToastViewController fVar = new UDToastViewController(context);
        this.f63811a = fVar;
        setView(fVar.mo91700a());
        setGravity(80, 0, (int) UDDimenUtils.m93308a(context, (int) SmActions.ACTION_ONTHECALL_EXIT));
    }
}
