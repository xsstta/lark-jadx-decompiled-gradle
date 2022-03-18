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
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001dH&J\b\u0010 \u001a\u00020\u001dH\u0014J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/ss/android/vc/meeting/basedialog/MeetingBaseDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "initImmediately", "", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Z)V", "getActivity", "()Landroid/app/Activity;", "dialog", "Lcom/ss/android/lark/ui/BaseDialog;", "getDialog", "()Lcom/ss/android/lark/ui/BaseDialog;", "setDialog", "(Lcom/ss/android/lark/ui/BaseDialog;)V", "mOnDismissListener", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "getMOnDismissListener", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "setMOnDismissListener", "(Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;)V", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "contentView", "Landroid/view/View;", "dismiss", "", "initDialog", "onDialogDismiss", "setLayoutparams", "setOnDismissListener", "onDismissListener", "show", "showAsHalfModel", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.basedialog.e */
public abstract class MeetingBaseDesktopDialog implements AbstractC61222a {

    /* renamed from: a */
    private AbstractC61222a.AbstractC61223a f153347a;

    /* renamed from: b */
    private DialogC57584b f153348b;

    /* renamed from: c */
    private final Activity f153349c;

    /* renamed from: d */
    private final C61303k f153350d;

    /* renamed from: e */
    private final boolean f153351e;

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

    /* renamed from: g */
    public abstract void mo211716g();

    /* renamed from: h */
    public abstract View mo211717h();

    public final DialogC57584b bJ_() {
        return this.f153348b;
    }

    /* renamed from: c */
    public final AbstractC61222a.AbstractC61223a mo211714c() {
        return this.f153347a;
    }

    /* renamed from: i */
    public final Activity mo211718i() {
        return this.f153349c;
    }

    /* renamed from: j */
    public final C61303k mo211719j() {
        return this.f153350d;
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        DialogC57584b bVar = this.f153348b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        mo211715f();
        DialogC57584b bVar = this.f153348b;
        if (bVar != null) {
            bVar.show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo211715f() {
        Window window;
        if (!this.f153349c.isDestroyed()) {
            DialogC57584b bVar = this.f153348b;
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
    }

    public void bK_() {
        Window window;
        DialogC57584b bVar = new DialogC57584b(this.f153349c);
        this.f153348b = bVar;
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
        View inflate = LayoutInflater.from(this.f153349c).inflate(R.layout.layout_meeting_base_dialog_desktop, (ViewGroup) null);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            View h = mo211717h();
            if (h != null) {
                frameLayout.addView(h);
            }
            DialogC57584b bVar2 = this.f153348b;
            if (bVar2 != null) {
                bVar2.setContentView(frameLayout);
            }
            DialogC57584b bVar3 = this.f153348b;
            if (bVar3 != null) {
                bVar3.setOnDismissListener(new DialogInterface$OnDismissListenerC61226a(this));
            }
            DialogC57584b bVar4 = this.f153348b;
            if (bVar4 != null) {
                bVar4.setCanceledOnTouchOutside(false);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/basedialog/MeetingBaseDesktopDialog$initDialog$1", "Landroid/content/DialogInterface$OnDismissListener;", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.basedialog.e$a */
    public static final class DialogInterface$OnDismissListenerC61226a implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ MeetingBaseDesktopDialog f153352a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        DialogInterface$OnDismissListenerC61226a(MeetingBaseDesktopDialog eVar) {
            this.f153352a = eVar;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.f153352a.mo211716g();
            AbstractC61222a.AbstractC61223a c = this.f153352a.mo211714c();
            if (c != null) {
                c.bY_();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211609a(AbstractC61222a.AbstractC61223a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "onDismissListener");
        this.f153347a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MeetingBaseDesktopDialog(Activity activity, C61303k kVar) {
        this(activity, kVar, true);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }

    public MeetingBaseDesktopDialog(Activity activity, C61303k kVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f153349c = activity;
        this.f153350d = kVar;
        this.f153351e = z;
        if (z) {
            bK_();
        }
    }
}
