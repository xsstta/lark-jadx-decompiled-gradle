package com.ss.android.vc.meeting.basedialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.DialogC57584b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H&J\b\u0010\u0019\u001a\u00020\u0016H\u0014J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/meeting/basedialog/PreviewBaseDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "dialog", "Lcom/ss/android/lark/ui/BaseDialog;", "getDialog", "()Lcom/ss/android/lark/ui/BaseDialog;", "setDialog", "(Lcom/ss/android/lark/ui/BaseDialog;)V", "mOnDismissListener", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "getMOnDismissListener", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "setMOnDismissListener", "(Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;)V", "contentView", "Landroid/view/View;", "dismiss", "", "initDialog", "onDialogDismiss", "setLayoutparams", "setOnDismissListener", "onDismissListener", "show", "showAsHalfModel", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.basedialog.g */
public abstract class PreviewBaseDesktopDialog implements AbstractC61222a {

    /* renamed from: a */
    private AbstractC61222a.AbstractC61223a f153355a;

    /* renamed from: b */
    private DialogC57584b f153356b;

    /* renamed from: c */
    private final Activity f153357c;

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public /* synthetic */ void mo211610a(String str) {
        AbstractC61222a.CC.$default$a(this, str);
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: b */
    public /* synthetic */ boolean mo211613b() {
        return AbstractC61222a.CC.$default$b(this);
    }

    /* renamed from: e */
    public abstract void mo211727e();

    /* renamed from: f */
    public abstract View mo211728f();

    /* renamed from: c */
    public final AbstractC61222a.AbstractC61223a mo211725c() {
        return this.f153355a;
    }

    /* renamed from: g */
    public final Activity mo211729g() {
        return this.f153357c;
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        DialogC57584b bVar = this.f153356b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        mo211726d();
        DialogC57584b bVar = this.f153356b;
        if (bVar != null) {
            bVar.show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo211726d() {
        Window window;
        DialogC57584b bVar = this.f153356b;
        WindowManager.LayoutParams layoutParams = null;
        if (bVar != null) {
            window = bVar.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.height = UIHelper.dp2px(560.0f);
        }
        if (layoutParams != null) {
            layoutParams.width = UIHelper.dp2px(440.0f);
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
    }

    /* renamed from: h */
    private final void mo215415h() {
        Window window;
        DialogC57584b bVar = new DialogC57584b(this.f153357c);
        this.f153356b = bVar;
        if (bVar != null) {
            window = bVar.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.lkui_transparent);
        }
        if (window != null) {
            window.requestFeature(1);
        }
        View inflate = LayoutInflater.from(this.f153357c).inflate(R.layout.layout_meeting_base_dialog_desktop, (ViewGroup) null);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            View f = mo211728f();
            if (f != null) {
                frameLayout.addView(f);
            }
            DialogC57584b bVar2 = this.f153356b;
            if (bVar2 != null) {
                bVar2.setContentView(frameLayout);
            }
            DialogC57584b bVar3 = this.f153356b;
            if (bVar3 != null) {
                bVar3.setOnDismissListener(new DialogInterface$OnDismissListenerC61230a(this));
            }
            DialogC57584b bVar4 = this.f153356b;
            if (bVar4 != null) {
                bVar4.setCanceledOnTouchOutside(false);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/basedialog/PreviewBaseDesktopDialog$initDialog$1", "Landroid/content/DialogInterface$OnDismissListener;", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.basedialog.g$a */
    public static final class DialogInterface$OnDismissListenerC61230a implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ PreviewBaseDesktopDialog f153358a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        DialogInterface$OnDismissListenerC61230a(PreviewBaseDesktopDialog gVar) {
            this.f153358a = gVar;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.f153358a.mo211727e();
            AbstractC61222a.AbstractC61223a c = this.f153358a.mo211725c();
            if (c != null) {
                c.bY_();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211609a(AbstractC61222a.AbstractC61223a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "onDismissListener");
        this.f153355a = aVar;
    }

    public PreviewBaseDesktopDialog(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f153357c = activity;
        mo215415h();
    }
}
