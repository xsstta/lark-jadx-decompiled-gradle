package com.ss.android.vc.meeting.drawerdialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.FullScreenDialog;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ao;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import com.ss.android.vc.meeting.basedialog.IBackPressHandlerRegister;
import com.ss.android.vc.meeting.module.base.AbstractC61425e;
import com.ss.android.vc.meeting.utils.C63529q;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H\u0005J\b\u0010\u001f\u001a\u00020\u001aH&J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001a2\b\b\u0001\u0010$\u001a\u00020%J\u0012\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001dH\u0016J\b\u0010*\u001a\u00020\u001aH\u0016J\b\u0010+\u001a\u00020\u001aH\u0016J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/vc/meeting/drawerdialog/MeetingDrawerDialog;", "Lcom/ss/android/vc/meeting/module/base/DismissListener;", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "Lcom/ss/android/vc/meeting/basedialog/IBackPressHandlerRegister;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "close", "Lcom/ss/android/vc/common/widget/IconFontView;", "dialog", "Lcom/ss/android/vc/common/widget/FullScreenDialog;", "dialogContentLayout", "Landroid/view/ViewGroup;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "headerTitleView", "Landroid/widget/TextView;", "userOnDismissListener", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "wrapper", "Landroid/widget/FrameLayout;", "createContentView", "Landroid/view/View;", "dismiss", "", "dismissDrawer", "headerTitle", "", "initDialog", "onDialogDismiss", "registerHandler", "handler", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/IBackPressedHandler;", "setDialogContentBackGroundColor", "color", "", "setOnDismissListener", "onDismissListener", "setTitle", "title", "show", "showAsHalfModel", "unregisterHandler", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.b.a */
public abstract class MeetingDrawerDialog implements AbstractC61222a, IBackPressHandlerRegister, AbstractC61425e {

    /* renamed from: c */
    public static final String f153284c = f153284c;

    /* renamed from: d */
    public static final Companion f153285d = new Companion(null);

    /* renamed from: a */
    public FullScreenDialog f153286a;

    /* renamed from: b */
    public AbstractC61222a.AbstractC61223a f153287b;

    /* renamed from: e */
    private DrawerLayout f153288e;

    /* renamed from: f */
    private FrameLayout f153289f;

    /* renamed from: g */
    private ViewGroup f153290g;

    /* renamed from: h */
    private IconFontView f153291h;

    /* renamed from: i */
    private TextView f153292i;

    /* renamed from: j */
    private final Activity f153293j;

    /* renamed from: b */
    public abstract View mo211611b(Activity activity);

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: b */
    public /* synthetic */ boolean mo211613b() {
        return AbstractC61222a.CC.$default$b(this);
    }

    /* renamed from: d */
    public abstract void mo211615d();

    /* renamed from: e */
    public abstract String mo211617e();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/drawerdialog/MeetingDrawerDialog$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61425e, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        FullScreenDialog aVar = this.f153286a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        aVar.dismiss();
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        FullScreenDialog aVar = this.f153286a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        aVar.show();
        DrawerLayout drawerLayout = this.f153288e;
        if (drawerLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
        }
        drawerLayout.mo4943e(8388613);
    }

    /* renamed from: c */
    public final void mo211614c() {
        FullScreenDialog aVar = this.f153286a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        if (aVar.mo208575a()) {
            DrawerLayout drawerLayout = this.f153288e;
            if (drawerLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
            }
            drawerLayout.mo4918a(new C61210b(this));
            DrawerLayout drawerLayout2 = this.f153288e;
            if (drawerLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
            }
            drawerLayout2.mo4944f(8388613);
            return;
        }
        FullScreenDialog aVar2 = this.f153286a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        aVar2.onBackPressed();
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211609a(AbstractC61222a.AbstractC61223a aVar) {
        this.f153287b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/vc/meeting/drawerdialog/MeetingDrawerDialog$dismissDrawer$1", "Landroidx/drawerlayout/widget/DrawerLayout$DrawerListener;", "onDrawerClosed", "", "drawerView", "Landroid/view/View;", "onDrawerOpened", "onDrawerSlide", "slideOffset", "", "onDrawerStateChanged", "newState", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.b.a$b */
    public static final class C61210b implements DrawerLayout.AbstractC0974c {

        /* renamed from: a */
        final /* synthetic */ MeetingDrawerDialog f153294a;

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
        /* renamed from: a */
        public void mo719a(int i) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
        /* renamed from: a */
        public void mo720a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "drawerView");
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
        /* renamed from: a */
        public void mo721a(View view, float f) {
            Intrinsics.checkParameterIsNotNull(view, "drawerView");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61210b(MeetingDrawerDialog aVar) {
            this.f153294a = aVar;
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
        /* renamed from: b */
        public void mo723b(View view) {
            Intrinsics.checkParameterIsNotNull(view, "drawerView");
            MeetingDrawerDialog.m238016a(this.f153294a).dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/drawerdialog/MeetingDrawerDialog$initDialog$1", "Landroid/content/DialogInterface$OnDismissListener;", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.b.a$c */
    public static final class DialogInterface$OnDismissListenerC61211c implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ MeetingDrawerDialog f153295a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        DialogInterface$OnDismissListenerC61211c(MeetingDrawerDialog aVar) {
            this.f153295a = aVar;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.f153295a.mo211615d();
            AbstractC61222a.AbstractC61223a aVar = this.f153295a.f153287b;
            if (aVar != null) {
                aVar.bY_();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.b.a$d */
    static final class View$OnClickListenerC61212d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingDrawerDialog f153296a;

        View$OnClickListenerC61212d(MeetingDrawerDialog aVar) {
            this.f153296a = aVar;
        }

        public final void onClick(View view) {
            this.f153296a.mo211614c();
        }
    }

    public MeetingDrawerDialog(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f153293j = activity;
    }

    /* renamed from: a */
    public static final /* synthetic */ FullScreenDialog m238016a(MeetingDrawerDialog aVar) {
        FullScreenDialog aVar2 = aVar.f153286a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        return aVar2;
    }

    @Override // com.ss.android.vc.meeting.basedialog.IBackPressHandlerRegister
    /* renamed from: b */
    public void mo211612b(AbstractC61214a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handler");
        FullScreenDialog aVar2 = this.f153286a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        aVar2.mo208576b(aVar);
    }

    @Override // com.ss.android.vc.meeting.basedialog.IBackPressHandlerRegister
    /* renamed from: a */
    public void mo211608a(AbstractC61214a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handler");
        FullScreenDialog aVar2 = this.f153286a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        aVar2.mo208574a(aVar);
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211610a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        TextView textView = this.f153292i;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerTitleView");
        }
        textView.setText(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo211607a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Activity activity2 = activity;
        this.f153286a = new FullScreenDialog(activity2, R.style.MeetingDrawerDialog);
        View inflate = LayoutInflater.from(activity2).inflate(R.layout.meeting_drawer_dialog, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.dialog_content_drawer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "dialogView.findViewById(…id.dialog_content_drawer)");
        this.f153288e = (DrawerLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.dialog_content_layer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "dialogView.findViewById(R.id.dialog_content_layer)");
        this.f153289f = (FrameLayout) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.dialog_content_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "dialogView.findViewById(…id.dialog_content_layout)");
        this.f153290g = (ViewGroup) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.calendar_header_close);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "dialogView.findViewById(…id.calendar_header_close)");
        IconFontView iconFontView = (IconFontView) findViewById4;
        this.f153291h = iconFontView;
        if (iconFontView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("close");
        }
        C63529q.m248969a(iconFontView, C60773o.m236115a(10.0d));
        View findViewById5 = inflate.findViewById(R.id.drawer_dialog_header_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "dialogView.findViewById(…awer_dialog_header_title)");
        this.f153292i = (TextView) findViewById5;
        if (mo211617e() != null) {
            TextView textView = this.f153292i;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerTitleView");
            }
            textView.setText(mo211617e());
        }
        View b = mo211611b(activity);
        FrameLayout frameLayout = this.f153289f;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wrapper");
        }
        frameLayout.addView(b, new LinearLayout.LayoutParams(-1, -2));
        ao watermarkDependency = VideoChatModuleDependency.getWatermarkDependency();
        if (watermarkDependency == null) {
            Intrinsics.throwNpe();
        }
        if (inflate != null) {
            watermarkDependency.mo196480a((FrameLayout) inflate, 1);
            FullScreenDialog aVar = this.f153286a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            }
            Window window = aVar.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            FullScreenDialog aVar2 = this.f153286a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            }
            aVar2.setContentView(inflate);
            FullScreenDialog aVar3 = this.f153286a;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            }
            aVar3.setOnDismissListener(new DialogInterface$OnDismissListenerC61211c(this));
            DrawerLayout drawerLayout = this.f153288e;
            if (drawerLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
            }
            drawerLayout.mo4913a(1, 8388613);
            IconFontView iconFontView2 = this.f153291h;
            if (iconFontView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("close");
            }
            iconFontView2.setOnClickListener(new View$OnClickListenerC61212d(this));
            DrawerLayout drawerLayout2 = this.f153288e;
            if (drawerLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
            }
            drawerLayout2.setOnTouchListener(new View$OnTouchListenerC61213e(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.b.a$e */
    static final class View$OnTouchListenerC61213e implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ MeetingDrawerDialog f153297a;

        View$OnTouchListenerC61213e(MeetingDrawerDialog aVar) {
            this.f153297a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            this.f153297a.mo211614c();
            return false;
        }
    }
}
