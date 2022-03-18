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
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TimeInfo;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.p2791b.C56263a;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.utils.UIHelper;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/TimeSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "btnDrawTextMargin", "", "btnDrawableSize", "Lcom/larksuite/component/universe_design/dimension/UDDimension$Dp;", "isInFastTimeSelect", "", "params", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "gotoTimeFragment", "", "initTodayButtonDate", "initViewAction", "initViewObserver", "showTodayButtons", "updateTimeView", "timeInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeInfo;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.l */
public final class TimeSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    private boolean f140038a;

    /* renamed from: b */
    private final int f140039b;

    /* renamed from: c */
    private final UDDimension.Dp f140040c;

    /* renamed from: d */
    private final ButtonDrawableParams f140041d;

    /* renamed from: e */
    private final View f140042e;

    /* renamed from: k */
    public final void mo192663k() {
        mo92107d().mo92064a(CommonCode.StatusCode.API_CLIENT_EXPIRED);
        mo92107d().mo92064a(5);
        TodoHitPoint.m221743b();
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getTimeInfo(), new C56666d(this));
        mo92103a(qVar.getTimeFragment(), new C56667e(this));
        mo92103a(qVar.getTimeButtonShow(), new C56668f(this));
    }

    /* renamed from: l */
    private final void m220496l() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        Drawable iconDrawable = UDIconUtils.getIconDrawable(mo92106c(), mo92108e().getIdentifier("ud_icon_calendar_" + gregorianCalendar.get(5) + "_outlined", "drawable", mo92106c().getPackageName()), ResUtil.f139261a.mo191775a(R.color.ud_B500), this.f140040c);
        if (iconDrawable != null) {
            this.f140041d.mo90321a(Integer.valueOf((int) R.string.Todo_Common_Today));
            UDButton uDButton = (UDButton) this.f140042e.findViewById(R.id.today_btn);
            Intrinsics.checkExpressionValueIsNotNull(uDButton, "containerView.today_btn");
            C25717e.m92486a(uDButton, iconDrawable, this.f140041d);
        }
    }

    /* renamed from: j */
    public final void mo192662j() {
        this.f140038a = true;
        TextView textView = (TextView) this.f140042e.findViewById(R.id.text_add_time);
        Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.text_add_time");
        textView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) this.f140042e.findViewById(R.id.time_button_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerView.time_button_container");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) this.f140042e.findViewById(R.id.detail_time_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "containerView.detail_time_container");
        linearLayout2.setClickable(false);
        m220496l();
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
        UDButton uDButton = (UDButton) this.f140042e.findViewById(R.id.today_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "containerView.today_btn");
        C25877a.m93657a(uDButton, mo92107d(), 1);
        UDButton uDButton2 = (UDButton) this.f140042e.findViewById(R.id.tomorrow_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "containerView.tomorrow_btn");
        C25877a.m93657a(uDButton2, mo92107d(), 2);
        View findViewById = this.f140042e.findViewById(R.id.layout_pick_item_time);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.layout_pick_item_time");
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.delete);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "containerView.layout_pick_item_time.delete");
        C25877a.m93657a(imageView, mo92107d(), 4);
        ((UDButton) this.f140042e.findViewById(R.id.other_time_btn)).setOnClickListener(new View$OnClickListenerC56663a(this));
        this.f140042e.findViewById(R.id.layout_pick_item_time).setOnClickListener(new View$OnClickListenerC56664b(this));
        ((LinearLayout) this.f140042e.findViewById(R.id.detail_time_container)).setOnClickListener(new View$OnClickListenerC56665c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.l$a */
    static final class View$OnClickListenerC56663a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeSection f140043a;

        View$OnClickListenerC56663a(TimeSection lVar) {
            this.f140043a = lVar;
        }

        public final void onClick(View view) {
            this.f140043a.mo192663k();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeInfo;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/TimeSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.l$d */
    static final class C56666d extends Lambda implements Function1<TimeInfo, Unit> {
        final /* synthetic */ TimeSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56666d(TimeSection lVar) {
            super(1);
            this.this$0 = lVar;
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
            this.this$0.mo192661a(aaVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/TimeSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.l$e */
    static final class C56667e extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TimeSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56667e(TimeSection lVar) {
            super(1);
            this.this$0 = lVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192663k();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/TimeSection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.l$f */
    static final class C56668f extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TimeSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56668f(TimeSection lVar) {
            super(1);
            this.this$0 = lVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192662j();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.l$b */
    static final class View$OnClickListenerC56664b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeSection f140044a;

        View$OnClickListenerC56664b(TimeSection lVar) {
            this.f140044a = lVar;
        }

        public final void onClick(View view) {
            this.f140044a.mo92107d().mo92064a(7);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.l$c */
    static final class View$OnClickListenerC56665c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeSection f140045a;

        View$OnClickListenerC56665c(TimeSection lVar) {
            this.f140045a = lVar;
        }

        public final void onClick(View view) {
            this.f140045a.mo92107d().mo92064a(8);
        }
    }

    /* renamed from: a */
    public final void mo192661a(TimeInfo aaVar) {
        if (aaVar.mo192773a()) {
            this.f140038a = false;
            LinearLayout linearLayout = (LinearLayout) this.f140042e.findViewById(R.id.detail_time_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerView.detail_time_container");
            linearLayout.setClickable(false);
            View findViewById = this.f140042e.findViewById(R.id.layout_pick_item_time);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.layout_pick_item_time");
            TextView textView = (TextView) findViewById.findViewById(R.id.time);
            Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.layout_pick_item_time.time");
            textView.setText(aaVar.mo192774b());
            View findViewById2 = this.f140042e.findViewById(R.id.layout_pick_item_time);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "containerView.layout_pick_item_time");
            ImageView imageView = (ImageView) findViewById2.findViewById(R.id.alert);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "containerView.layout_pick_item_time.alert");
            C25877a.m93659a(imageView, aaVar.mo192775c());
            TextView textView2 = (TextView) this.f140042e.findViewById(R.id.text_add_time);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "containerView.text_add_time");
            textView2.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) this.f140042e.findViewById(R.id.time_button_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "containerView.time_button_container");
            linearLayout2.setVisibility(8);
            View findViewById3 = this.f140042e.findViewById(R.id.layout_pick_item_time);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "containerView.layout_pick_item_time");
            findViewById3.setVisibility(0);
            View findViewById4 = this.f140042e.findViewById(R.id.layout_pick_item_time);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "containerView.layout_pick_item_time");
            ImageView imageView2 = (ImageView) findViewById4.findViewById(R.id.delete);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "containerView.layout_pick_item_time.delete");
            C25877a.m93659a(imageView2, aaVar.mo192776d());
            View findViewById5 = this.f140042e.findViewById(R.id.layout_pick_item_time);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "containerView.layout_pick_item_time");
            ImageView imageView3 = (ImageView) findViewById5.findViewById(R.id.delete);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "containerView.layout_pick_item_time.delete");
            C56263a.m219590a(imageView3, UIHelper.dp2px(10.0f));
            LinearLayout linearLayout3 = (LinearLayout) this.f140042e.findViewById(R.id.detail_time_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "containerView.detail_time_container");
            linearLayout3.setClickable(false);
            View findViewById6 = this.f140042e.findViewById(R.id.layout_pick_item_time);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "containerView.layout_pick_item_time");
            findViewById6.setClickable(true);
            return;
        }
        if (this.f140038a) {
            TextView textView3 = (TextView) this.f140042e.findViewById(R.id.text_add_time);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "containerView.text_add_time");
            textView3.setVisibility(8);
            LinearLayout linearLayout4 = (LinearLayout) this.f140042e.findViewById(R.id.time_button_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "containerView.time_button_container");
            linearLayout4.setVisibility(0);
            LinearLayout linearLayout5 = (LinearLayout) this.f140042e.findViewById(R.id.detail_time_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "containerView.detail_time_container");
            linearLayout5.setClickable(false);
        } else {
            TextView textView4 = (TextView) this.f140042e.findViewById(R.id.text_add_time);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "containerView.text_add_time");
            textView4.setVisibility(0);
            LinearLayout linearLayout6 = (LinearLayout) this.f140042e.findViewById(R.id.time_button_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "containerView.time_button_container");
            linearLayout6.setVisibility(8);
            LinearLayout linearLayout7 = (LinearLayout) this.f140042e.findViewById(R.id.detail_time_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout7, "containerView.detail_time_container");
            linearLayout7.setClickable(true);
        }
        View findViewById7 = this.f140042e.findViewById(R.id.layout_pick_item_time);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "containerView.layout_pick_item_time");
        findViewById7.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeSection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f140042e = view;
        int dp2px = UIUtils.dp2px(mo92106c(), 6.0f);
        this.f140039b = dp2px;
        UDDimension.Dp aVar = new UDDimension.Dp(18);
        this.f140040c = aVar;
        ButtonDrawableParams aVar2 = new ButtonDrawableParams();
        aVar2.mo90319a(0);
        aVar2.mo90323b(dp2px);
        this.f140041d = aVar2;
        aVar2.mo90321a(Integer.valueOf((int) R.string.Todo_Common_Tomorrow));
        UDButton uDButton = (UDButton) view.findViewById(R.id.tomorrow_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "containerView.tomorrow_btn");
        C25717e.m92486a(uDButton, UDIconUtils.getIconDrawable(mo92106c(), R.drawable.ud_icon_calendar_tomorrow_outlined, ResUtil.f139261a.mo191775a(R.color.ud_T600), aVar), aVar2);
        aVar2.mo90321a(Integer.valueOf((int) R.string.Todo_Common_OtherTime));
        UDButton uDButton2 = (UDButton) view.findViewById(R.id.other_time_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "containerView.other_time_btn");
        C25717e.m92486a(uDButton2, UDIconUtils.getIconDrawable(mo92106c(), R.drawable.ud_icon_calendar_date_outlined, ResUtil.f139261a.mo191775a(R.color.icon_n1), aVar), aVar2);
    }
}
