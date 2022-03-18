package com.ss.android.vc.meeting.module.interpretation.dialog;

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
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u001eH&J\b\u0010!\u001a\u00020\u001eH\u0014J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/ss/android/vc/meeting/module/interpretation/dialog/InterpretationMeetingBaseDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "toOpen", "", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Z)V", "getActivity", "()Landroid/app/Activity;", "dialog", "Lcom/ss/android/lark/ui/BaseDialog;", "getDialog", "()Lcom/ss/android/lark/ui/BaseDialog;", "setDialog", "(Lcom/ss/android/lark/ui/BaseDialog;)V", "mOnDismissListener", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "getMOnDismissListener", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "setMOnDismissListener", "(Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;)V", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "getToOpen", "()Z", "contentView", "Landroid/view/View;", "dismiss", "", "initDialog", "onDialogDismiss", "setLayoutparams", "setOnDismissListener", "onDismissListener", "show", "showAsHalfModel", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.interpretation.b.e */
public abstract class InterpretationMeetingBaseDesktopDialog implements AbstractC61222a {

    /* renamed from: a */
    private AbstractC61222a.AbstractC61223a f155588a;

    /* renamed from: b */
    private DialogC57584b f155589b;

    /* renamed from: c */
    private final Activity f155590c;

    /* renamed from: d */
    private final C61303k f155591d;

    /* renamed from: e */
    private final boolean f155592e;

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

    /* renamed from: c */
    public abstract void mo214481c();

    /* renamed from: d */
    public abstract View mo214482d();

    /* renamed from: e */
    public final AbstractC61222a.AbstractC61223a mo214484e() {
        return this.f155588a;
    }

    /* renamed from: g */
    public final Activity mo214486g() {
        return this.f155590c;
    }

    /* renamed from: h */
    public final C61303k mo214487h() {
        return this.f155591d;
    }

    /* renamed from: i */
    public final boolean mo214488i() {
        return this.f155592e;
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        DialogC57584b bVar = this.f155589b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        mo214485f();
        DialogC57584b bVar = this.f155589b;
        if (bVar != null) {
            bVar.show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo214485f() {
        Window window;
        DialogC57584b bVar = this.f155589b;
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

    /* renamed from: j */
    private final void m242020j() {
        Window window;
        DialogC57584b bVar = new DialogC57584b(this.f155590c);
        this.f155589b = bVar;
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
        View inflate = LayoutInflater.from(this.f155590c).inflate(R.layout.layout_meeting_base_dialog_desktop, (ViewGroup) null);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            View d = mo214482d();
            if (d != null) {
                frameLayout.addView(d);
            }
            DialogC57584b bVar2 = this.f155589b;
            if (bVar2 != null) {
                bVar2.setContentView(frameLayout);
            }
            DialogC57584b bVar3 = this.f155589b;
            if (bVar3 != null) {
                bVar3.setOnDismissListener(new DialogInterface$OnDismissListenerC61950a(this));
            }
            DialogC57584b bVar4 = this.f155589b;
            if (bVar4 != null) {
                bVar4.setCanceledOnTouchOutside(false);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/interpretation/dialog/InterpretationMeetingBaseDesktopDialog$initDialog$1", "Landroid/content/DialogInterface$OnDismissListener;", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.interpretation.b.e$a */
    public static final class DialogInterface$OnDismissListenerC61950a implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ InterpretationMeetingBaseDesktopDialog f155593a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        DialogInterface$OnDismissListenerC61950a(InterpretationMeetingBaseDesktopDialog eVar) {
            this.f155593a = eVar;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.f155593a.mo214481c();
            AbstractC61222a.AbstractC61223a e = this.f155593a.mo214484e();
            if (e != null) {
                e.bY_();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211609a(AbstractC61222a.AbstractC61223a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "onDismissListener");
        this.f155588a = aVar;
    }

    public InterpretationMeetingBaseDesktopDialog(Activity activity, C61303k kVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f155590c = activity;
        this.f155591d = kVar;
        this.f155592e = z;
        m242020j();
    }
}
