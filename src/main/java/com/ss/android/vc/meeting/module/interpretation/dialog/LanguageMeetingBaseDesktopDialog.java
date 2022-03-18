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
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\n\u0010!\u001a\u0004\u0018\u00010\"H&J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H&J\b\u0010'\u001a\u00020$H\u0014J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u0017H\u0016J\b\u0010*\u001a\u00020$H\u0016J\b\u0010+\u001a\u00020$H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u0006,"}, d2 = {"Lcom/ss/android/vc/meeting/module/interpretation/dialog/LanguageMeetingBaseDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "isLeftArrow", "", "toOpen", "maskLanguage", "", "Lcom/ss/android/vc/entity/LanguageType;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;ZZLjava/util/List;)V", "getActivity", "()Landroid/app/Activity;", "dialog", "Lcom/ss/android/lark/ui/BaseDialog;", "getDialog", "()Lcom/ss/android/lark/ui/BaseDialog;", "setDialog", "(Lcom/ss/android/lark/ui/BaseDialog;)V", "()Z", "mOnDismissListener", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "getMOnDismissListener", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "setMOnDismissListener", "(Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;)V", "getMaskLanguage", "()Ljava/util/List;", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "getToOpen", "contentView", "Landroid/view/View;", "dismiss", "", "initDialog", "onDialogDismiss", "setLayoutparams", "setOnDismissListener", "onDismissListener", "show", "showAsHalfModel", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.interpretation.b.i */
public abstract class LanguageMeetingBaseDesktopDialog implements AbstractC61222a {

    /* renamed from: a */
    private AbstractC61222a.AbstractC61223a f155596a;

    /* renamed from: b */
    private DialogC57584b f155597b;

    /* renamed from: c */
    private final Activity f155598c;

    /* renamed from: d */
    private final C61303k f155599d;

    /* renamed from: e */
    private final boolean f155600e;

    /* renamed from: f */
    private final boolean f155601f;

    /* renamed from: g */
    private final List<LanguageType> f155602g;

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
    public abstract void mo214492e();

    /* renamed from: f */
    public abstract View mo214493f();

    /* renamed from: c */
    public final AbstractC61222a.AbstractC61223a mo214490c() {
        return this.f155596a;
    }

    /* renamed from: g */
    public final Activity mo214494g() {
        return this.f155598c;
    }

    /* renamed from: h */
    public final C61303k mo214495h() {
        return this.f155599d;
    }

    /* renamed from: i */
    public final boolean mo214496i() {
        return this.f155600e;
    }

    /* renamed from: j */
    public final boolean mo214497j() {
        return this.f155601f;
    }

    /* renamed from: k */
    public final List<LanguageType> mo214498k() {
        return this.f155602g;
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        DialogC57584b bVar = this.f155597b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        mo214491d();
        DialogC57584b bVar = this.f155597b;
        if (bVar != null) {
            bVar.show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo214491d() {
        Window window;
        DialogC57584b bVar = this.f155597b;
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

    /* renamed from: l */
    private final void m242039l() {
        Window window;
        DialogC57584b bVar = new DialogC57584b(this.f155598c);
        this.f155597b = bVar;
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
        View inflate = LayoutInflater.from(this.f155598c).inflate(R.layout.layout_meeting_base_dialog_desktop, (ViewGroup) null);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            View f = mo214493f();
            if (f != null) {
                frameLayout.addView(f);
            }
            DialogC57584b bVar2 = this.f155597b;
            if (bVar2 != null) {
                bVar2.setContentView(frameLayout);
            }
            DialogC57584b bVar3 = this.f155597b;
            if (bVar3 != null) {
                bVar3.setOnDismissListener(new DialogInterface$OnDismissListenerC61953a(this));
            }
            DialogC57584b bVar4 = this.f155597b;
            if (bVar4 != null) {
                bVar4.setCanceledOnTouchOutside(false);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/interpretation/dialog/LanguageMeetingBaseDesktopDialog$initDialog$1", "Landroid/content/DialogInterface$OnDismissListener;", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.interpretation.b.i$a */
    public static final class DialogInterface$OnDismissListenerC61953a implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ LanguageMeetingBaseDesktopDialog f155603a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        DialogInterface$OnDismissListenerC61953a(LanguageMeetingBaseDesktopDialog iVar) {
            this.f155603a = iVar;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.f155603a.mo214492e();
            AbstractC61222a.AbstractC61223a c = this.f155603a.mo214490c();
            if (c != null) {
                c.bY_();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211609a(AbstractC61222a.AbstractC61223a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "onDismissListener");
        this.f155596a = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.ss.android.vc.entity.LanguageType> */
    /* JADX WARN: Multi-variable type inference failed */
    public LanguageMeetingBaseDesktopDialog(Activity activity, C61303k kVar, boolean z, boolean z2, List<? extends LanguageType> list) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(list, "maskLanguage");
        this.f155598c = activity;
        this.f155599d = kVar;
        this.f155600e = z;
        this.f155601f = z2;
        this.f155602g = list;
        m242039l();
    }
}
