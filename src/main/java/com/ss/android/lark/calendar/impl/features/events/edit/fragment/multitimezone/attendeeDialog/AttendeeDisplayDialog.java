package com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.attendeeDialog;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\u0014\u0010\u0018\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeDialog/AttendeeDisplayDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "mContext", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "mAttendeeAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeDialog/AttendeeAdapter;", "getMContext", "()Landroid/content/Context;", "dismiss", "", "initListener", "initRecycleView", "initView", "initWindow", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "show", "startHideAnim", "startShowAnim", "trueDismiss", "updateAttendeeRecycleView", "attendees", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "updateLocalTime", "localTimeString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a.b */
public final class AttendeeDisplayDialog extends BaseDialog {

    /* renamed from: a */
    private AttendeeAdapter f80502a = new AttendeeAdapter();

    /* renamed from: b */
    private final Context f80503b;

    /* renamed from: a */
    public final void mo115426a() {
        super.dismiss();
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void dismiss() {
        mo115429b();
    }

    /* renamed from: c */
    private final void m119848c() {
        WindowManager.LayoutParams layoutParams;
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
    }

    /* renamed from: e */
    private final void m119850e() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.attendeeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "attendeeRecycleView");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.attendeeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "attendeeRecycleView");
        recyclerView2.setAdapter(this.f80502a);
    }

    /* renamed from: f */
    private final void m119851f() {
        findViewById(R.id.scrollDragBt).setOnClickListener(new View$OnClickListenerC31670a(this));
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).setListener(new C31671b(this));
    }

    /* renamed from: g */
    private final void m119852g() {
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115976a((float) DeviceUtils.getScreenHeight(this.f80503b), (float) UIHelper.dp2px(250.0f), new C31673d(this));
    }

    /* renamed from: b */
    public final void mo115429b() {
        VerticalDragLayout verticalDragLayout = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
        float translationY = verticalDragLayout.getTranslationY();
        VerticalDragLayout verticalDragLayout2 = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout2, "dragLayout");
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115976a(translationY, (float) verticalDragLayout2.getHeight(), new C31672c(this));
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        View findViewById = findViewById(R.id.shadowView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
        findViewById.setBackground(new ColorDrawable(UIHelper.getColor(R.color.lkui_N900)));
        super.show();
        m119852g();
    }

    /* renamed from: d */
    private final void m119849d() {
        VerticalDragLayout verticalDragLayout = (VerticalDragLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
        ViewGroup.LayoutParams layoutParams = verticalDragLayout.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = UIUtils.dp2px(getContext(), 44.0f);
            VerticalDragLayout verticalDragLayout2 = (VerticalDragLayout) findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout2, "dragLayout");
            verticalDragLayout2.setLayoutParams(layoutParams2);
            VerticalDragLayout verticalDragLayout3 = (VerticalDragLayout) findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout3, "dragLayout");
            verticalDragLayout3.setVisibility(8);
            ((VerticalDragLayout) findViewById(R.id.dragLayout)).setIsForceDismissWhenScrollDown(true);
            View findViewById = findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
            findViewById.setBackground(new ColorDrawable(0));
            m119850e();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeDialog/AttendeeDisplayDialog$startShowAnim$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a.b$d */
    public static final class C31673d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeDisplayDialog f80507a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a.b$d$b */
        static final class View$OnClickListenerC31675b implements View.OnClickListener {

            /* renamed from: a */
            public static final View$OnClickListenerC31675b f80509a = new View$OnClickListenerC31675b();

            View$OnClickListenerC31675b() {
            }

            public final void onClick(View view) {
            }
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a.b$d$a */
        static final class View$OnClickListenerC31674a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C31673d f80508a;

            View$OnClickListenerC31674a(C31673d dVar) {
                this.f80508a = dVar;
            }

            public final void onClick(View view) {
                this.f80508a.f80507a.dismiss();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31673d(AttendeeDisplayDialog bVar) {
            this.f80507a = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f80507a.findViewById(R.id.shadowView).setOnClickListener(new View$OnClickListenerC31674a(this));
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            VerticalDragLayout verticalDragLayout = (VerticalDragLayout) this.f80507a.findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
            verticalDragLayout.setVisibility(0);
            this.f80507a.findViewById(R.id.shadowView).setOnClickListener(View$OnClickListenerC31675b.f80509a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a.b$a */
    public static final class View$OnClickListenerC31670a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeDisplayDialog f80504a;

        View$OnClickListenerC31670a(AttendeeDisplayDialog bVar) {
            this.f80504a = bVar;
        }

        public final void onClick(View view) {
            this.f80504a.mo115429b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeDialog/AttendeeDisplayDialog$initListener$2", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$ShrinkLayoutChangeListener;", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutAnimCancel", "start", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$POSITION;", "end", "onLayoutAnimEnd", "onLayoutAnimStart", "startDrag", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a.b$b */
    public static final class C31671b implements VerticalDragLayout.ShrinkLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeDisplayDialog f80505a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo110178a() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo110180a(VerticalDragLayout.POSITION position, VerticalDragLayout.POSITION position2) {
            Intrinsics.checkParameterIsNotNull(position, "start");
            Intrinsics.checkParameterIsNotNull(position2, "end");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31671b(AttendeeDisplayDialog bVar) {
            this.f80505a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: b */
        public void mo110181b(VerticalDragLayout.POSITION position, VerticalDragLayout.POSITION position2) {
            Intrinsics.checkParameterIsNotNull(position, "start");
            Intrinsics.checkParameterIsNotNull(position2, "end");
            if (position2 == VerticalDragLayout.POSITION.BOTTOM) {
                this.f80505a.mo115426a();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo110179a(float f, float f2) {
            VerticalDragLayout verticalDragLayout = (VerticalDragLayout) this.f80505a.findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
            float height = (float) verticalDragLayout.getHeight();
            if (height != BitmapDescriptorFactory.HUE_RED) {
                View findViewById = this.f80505a.findViewById(R.id.shadowView);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
                VerticalDragLayout verticalDragLayout2 = (VerticalDragLayout) this.f80505a.findViewById(R.id.dragLayout);
                Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout2, "dragLayout");
                findViewById.setAlpha(((((float) verticalDragLayout2.getHeight()) - f2) / height) * 0.6f);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeDialog/AttendeeDisplayDialog$startHideAnim$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a.b$c */
    public static final class C31672c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeDisplayDialog f80506a;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31672c(AttendeeDisplayDialog bVar) {
            this.f80506a = bVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f80506a.mo115426a();
        }

        public void onAnimationEnd(Animator animator) {
            this.f80506a.mo115426a();
        }
    }

    /* renamed from: a */
    public final void mo115428a(List<UserAttendeeBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "attendees");
        this.f80502a.mo115424a(list);
        this.f80502a.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(50);
        }
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public final void mo115427a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "localTimeString");
        TextView textView = (TextView) findViewById(R.id.timeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "timeTv");
        textView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttendeeDisplayDialog(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f80503b = context;
        setContentView(R.layout.dialog_edit_drag_vertical);
        m119848c();
        m119849d();
        m119851f();
    }
}
