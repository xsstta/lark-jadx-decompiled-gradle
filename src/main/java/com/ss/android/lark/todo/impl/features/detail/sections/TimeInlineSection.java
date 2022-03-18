package com.ss.android.lark.todo.impl.features.detail.sections;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.component.universe_design.button.ButtonDrawableParams;
import com.larksuite.component.universe_design.button.C25717e;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TimeInfo;
import com.ss.android.lark.todo.impl.features.detail.widget.KeyboardScrollView;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.p2791b.C56263a;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.utils.UIHelper;
import java.util.GregorianCalendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/TimeInlineSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "btnContainerEndMargin", "", "btnDrawTextMargin", "btnDrawableSize", "Lcom/larksuite/component/universe_design/dimension/UDDimension$Dp;", "value", "", "isInFastTimeSelect", "setInFastTimeSelect", "(Z)V", "params", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "checkScrollViewVisible", "", "dividerVisible", "gotoTimeFragment", "hideTodayButtons", "initTodayButtonDate", "initViewAction", "initViewObserver", "isScrollViewVisible", "showTodayButtons", "updateTimeView", "timeInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeInfo;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.k */
public final class TimeInlineSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public boolean f140029a;

    /* renamed from: b */
    private final int f140030b;

    /* renamed from: c */
    private final UDDimension.Dp f140031c;

    /* renamed from: d */
    private final ButtonDrawableParams f140032d;

    /* renamed from: e */
    private final int f140033e = UIUtils.dp2px(mo92106c(), 16.0f);

    /* renamed from: f */
    private final View f140034f;

    /* renamed from: j */
    public final void mo192654j() {
        mo92107d().mo92064a(CommonCode.StatusCode.API_CLIENT_EXPIRED);
        mo92107d().mo92064a(5);
        TodoHitPoint.m221743b();
    }

    /* renamed from: m */
    private final void m220486m() {
        LinearLayout linearLayout = (LinearLayout) this.f140034f.findViewById(R.id.time_button_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerView.time_button_container");
        linearLayout.setVisibility(0);
        ((ImageView) this.f140034f.findViewById(R.id.func_date)).setImageResource(R.drawable.todo_svg_icon_date_pressed);
        m220485l();
    }

    /* renamed from: n */
    private final void m220487n() {
        LinearLayout linearLayout = (LinearLayout) this.f140034f.findViewById(R.id.time_button_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerView.time_button_container");
        linearLayout.setVisibility(8);
        ((ImageView) this.f140034f.findViewById(R.id.func_date)).setImageResource(R.drawable.todo_svg_icon_date);
    }

    /* renamed from: o */
    private final boolean m220488o() {
        boolean z;
        TimeInfo b;
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        List<AssigneeBean> b2 = qVar.getAssignees().mo5927b();
        if (b2 == null || b2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z && (b = qVar.getTimeInfo().mo5927b()) != null && !b.mo192773a()) {
            return this.f140029a;
        }
        return true;
    }

    /* renamed from: p */
    private final boolean m220489p() {
        boolean z;
        TimeInfo b;
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        List<AssigneeBean> b2 = qVar.getAssignees().mo5927b();
        if (b2 == null || b2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (b = qVar.getTimeInfo().mo5927b()) != null && !b.mo192773a()) {
            return this.f140029a;
        }
        return false;
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getTimeInfo(), new C56661d(this));
        mo92103a(qVar.getAssignees(), new C56662e(this));
    }

    /* renamed from: l */
    private final void m220485l() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        Drawable iconDrawable = UDIconUtils.getIconDrawable(mo92106c(), mo92108e().getIdentifier("ud_icon_calendar_" + gregorianCalendar.get(5) + "_outlined", "drawable", mo92106c().getPackageName()), ResUtil.f139261a.mo191775a(R.color.ud_B500), this.f140031c);
        if (iconDrawable != null) {
            this.f140032d.mo90321a(Integer.valueOf((int) R.string.Todo_Common_Today));
            UDButton uDButton = (UDButton) this.f140034f.findViewById(R.id.today_btn);
            Intrinsics.checkExpressionValueIsNotNull(uDButton, "containerView.today_btn");
            C25717e.m92486a(uDButton, iconDrawable, this.f140032d);
        }
    }

    /* renamed from: k */
    public final void mo192655k() {
        KeyboardScrollView keyboardScrollView = (KeyboardScrollView) this.f140034f.findViewById(R.id.selected_condition_list);
        Intrinsics.checkExpressionValueIsNotNull(keyboardScrollView, "containerView.selected_condition_list");
        C25877a.m93659a(keyboardScrollView, m220488o());
        View findViewById = this.f140034f.findViewById(R.id.shader);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.shader");
        C25877a.m93659a(findViewById, m220488o());
        View findViewById2 = this.f140034f.findViewById(R.id.divider_inline);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "containerView.divider_inline");
        C25877a.m93659a(findViewById2, m220489p());
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
        UDButton uDButton = (UDButton) this.f140034f.findViewById(R.id.today_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "containerView.today_btn");
        C25877a.m93657a(uDButton, mo92107d(), 1);
        UDButton uDButton2 = (UDButton) this.f140034f.findViewById(R.id.tomorrow_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "containerView.tomorrow_btn");
        C25877a.m93657a(uDButton2, mo92107d(), 2);
        View findViewById = this.f140034f.findViewById(R.id.layout_pick_item_time);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.layout_pick_item_time");
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.delete);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "containerView.layout_pick_item_time.delete");
        C25877a.m93657a(imageView, mo92107d(), 4);
        ((UDButton) this.f140034f.findViewById(R.id.other_time_btn)).setOnClickListener(new View$OnClickListenerC56658a(this));
        this.f140034f.findViewById(R.id.layout_pick_item_time).setOnClickListener(new View$OnClickListenerC56659b(this));
        ((ImageView) this.f140034f.findViewById(R.id.func_date)).setOnClickListener(new View$OnClickListenerC56660c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.k$a */
    static final class View$OnClickListenerC56658a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeInlineSection f140035a;

        View$OnClickListenerC56658a(TimeInlineSection kVar) {
            this.f140035a = kVar;
        }

        public final void onClick(View view) {
            this.f140035a.mo192654j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeInfo;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/TimeInlineSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.k$d */
    static final class C56661d extends Lambda implements Function1<TimeInfo, Unit> {
        final /* synthetic */ TimeInlineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56661d(TimeInlineSection kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TimeInfo aaVar) {
            invoke(aaVar);
            return Unit.INSTANCE;
        }

        public final void invoke(TimeInfo aaVar) {
            Intrinsics.checkParameterIsNotNull(aaVar, "it");
            this.this$0.mo192652a(aaVar);
            this.this$0.mo192655k();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/TimeInlineSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.k$e */
    static final class C56662e extends Lambda implements Function1<List<? extends AssigneeBean>, Unit> {
        final /* synthetic */ TimeInlineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56662e(TimeInlineSection kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends AssigneeBean> list) {
            invoke((List<AssigneeBean>) list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<AssigneeBean> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            this.this$0.mo192655k();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.k$b */
    static final class View$OnClickListenerC56659b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeInlineSection f140036a;

        View$OnClickListenerC56659b(TimeInlineSection kVar) {
            this.f140036a = kVar;
        }

        public final void onClick(View view) {
            this.f140036a.mo92107d().mo92064a(7);
        }
    }

    /* renamed from: a */
    public final void mo192653a(boolean z) {
        this.f140029a = z;
        if (z) {
            m220486m();
        } else {
            m220487n();
        }
        mo192655k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.k$c */
    static final class View$OnClickListenerC56660c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeInlineSection f140037a;

        View$OnClickListenerC56660c(TimeInlineSection kVar) {
            this.f140037a = kVar;
        }

        public final void onClick(View view) {
            TimeInfo b = ((ITodoDetailViewDataStore) this.f140037a.mo92096a()).getTimeInfo().mo5927b();
            if (b == null || b.mo192773a()) {
                this.f140037a.mo192654j();
                return;
            }
            TimeInlineSection kVar = this.f140037a;
            kVar.mo192653a(!kVar.f140029a);
        }
    }

    /* renamed from: a */
    public final void mo192652a(TimeInfo aaVar) {
        if (aaVar.mo192773a()) {
            mo192653a(false);
            View findViewById = this.f140034f.findViewById(R.id.layout_pick_item_time);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.layout_pick_item_time");
            TextView textView = (TextView) findViewById.findViewById(R.id.time);
            Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.layout_pick_item_time.time");
            textView.setText(aaVar.mo192774b());
            View findViewById2 = this.f140034f.findViewById(R.id.layout_pick_item_time);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "containerView.layout_pick_item_time");
            ImageView imageView = (ImageView) findViewById2.findViewById(R.id.alert);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "containerView.layout_pick_item_time.alert");
            C25877a.m93659a(imageView, aaVar.mo192775c());
            LinearLayout linearLayout = (LinearLayout) this.f140034f.findViewById(R.id.time_button_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerView.time_button_container");
            linearLayout.setVisibility(8);
            View findViewById3 = this.f140034f.findViewById(R.id.layout_pick_item_time);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "containerView.layout_pick_item_time");
            findViewById3.setVisibility(0);
            View findViewById4 = this.f140034f.findViewById(R.id.layout_pick_item_time);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "containerView.layout_pick_item_time");
            ImageView imageView2 = (ImageView) findViewById4.findViewById(R.id.delete);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "containerView.layout_pick_item_time.delete");
            C25877a.m93659a(imageView2, aaVar.mo192776d());
            View findViewById5 = this.f140034f.findViewById(R.id.layout_pick_item_time);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "containerView.layout_pick_item_time");
            ImageView imageView3 = (ImageView) findViewById5.findViewById(R.id.delete);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "containerView.layout_pick_item_time.delete");
            C56263a.m219590a(imageView3, UIHelper.dp2px(10.0f));
            View findViewById6 = this.f140034f.findViewById(R.id.layout_pick_item_time);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "containerView.layout_pick_item_time");
            findViewById6.setClickable(true);
            return;
        }
        if (this.f140029a) {
            LinearLayout linearLayout2 = (LinearLayout) this.f140034f.findViewById(R.id.time_button_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "containerView.time_button_container");
            linearLayout2.setVisibility(0);
        } else {
            LinearLayout linearLayout3 = (LinearLayout) this.f140034f.findViewById(R.id.time_button_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "containerView.time_button_container");
            linearLayout3.setVisibility(8);
        }
        View findViewById7 = this.f140034f.findViewById(R.id.layout_pick_item_time);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "containerView.layout_pick_item_time");
        findViewById7.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeInlineSection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f140034f = view;
        int dp2px = UIUtils.dp2px(mo92106c(), 6.0f);
        this.f140030b = dp2px;
        UDDimension.Dp aVar = new UDDimension.Dp(18);
        this.f140031c = aVar;
        ButtonDrawableParams aVar2 = new ButtonDrawableParams();
        aVar2.mo90319a(0);
        aVar2.mo90323b(dp2px);
        this.f140032d = aVar2;
        UDButton uDButton = (UDButton) view.findViewById(R.id.today_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "containerView.today_btn");
        C25717e.m92486a(uDButton, UDIconUtils.getIconDrawable(mo92106c(), R.drawable.ud_icon_calendar_17_outlined, ResUtil.f139261a.mo191775a(R.color.ud_B500), aVar), aVar2);
        aVar2.mo90321a(Integer.valueOf((int) R.string.Todo_Common_Tomorrow));
        UDButton uDButton2 = (UDButton) view.findViewById(R.id.tomorrow_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "containerView.tomorrow_btn");
        C25717e.m92486a(uDButton2, UDIconUtils.getIconDrawable(mo92106c(), R.drawable.ud_icon_calendar_tomorrow_outlined, ResUtil.f139261a.mo191775a(R.color.ud_T600), aVar), aVar2);
        aVar2.mo90321a(Integer.valueOf((int) R.string.Todo_Common_OtherTime));
        UDButton uDButton3 = (UDButton) view.findViewById(R.id.other_time_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton3, "containerView.other_time_btn");
        C25717e.m92486a(uDButton3, UDIconUtils.getIconDrawable(mo92106c(), R.drawable.ud_icon_calendar_date_outlined, ResUtil.f139261a.mo191775a(R.color.icon_n1), aVar), aVar2);
    }
}
