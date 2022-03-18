package com.ss.android.lark.todo.impl.features.messagecard.dailyremind.mvvm;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.basic.v1.TodoDetail;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.entity.EndTimeTextAttribute;
import com.ss.android.lark.todo.impl.features.common.helper.EndTimeHelper;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56478e;
import com.ss.android.lark.todo.impl.features.messagecard.listener.EnterTodoTabClickListener;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.LKUILightTextView;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\tH\u0016J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u000fH\u0002J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/dailyremind/mvvm/TodoDailyRemindCardView;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/lifecycle/LifecycleOwner;", "holderView", "Landroid/view/View;", "viewModel", "Lcom/ss/android/lark/todo/impl/features/messagecard/dailyremind/mvvm/TodoDailyRemindCardViewModel;", "(Landroid/view/View;Lcom/ss/android/lark/todo/impl/features/messagecard/dailyremind/mvvm/TodoDailyRemindCardViewModel;)V", "mLifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getMLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "mLifecycleRegistry$delegate", "Lkotlin/Lazy;", "bindCardButton", "", "bindCardContent", "bindCardItemView", "bindLiveData", "bindViewMoreIcon", "getDividerView", "context", "Landroid/content/Context;", "getLifecycle", "getSummaryRichTextView", "Lcom/ss/android/lark/widget/light/LKUILightTextView;", "todo", "Lcom/bytedance/lark/pb/basic/v1/TodoDetail;", "matchParentHeight", "", "getTimeTextView", "Landroid/widget/TextView;", "registerLifeCycle", "setViewModel", "unRegisterLifeCycle", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.b.a.a */
public final class TodoDailyRemindCardView extends RecyclerView.ViewHolder implements LifecycleOwner {

    /* renamed from: a */
    public TodoDailyRemindCardViewModel f140894a;

    /* renamed from: b */
    private final Lazy f140895b = LazyKt.lazy(new C57138b(this));

    /* renamed from: c */
    private final View f140896c;

    /* renamed from: c */
    private final LifecycleRegistry m221429c() {
        return (LifecycleRegistry) this.f140895b.getValue();
    }

    /* renamed from: d */
    private final void m221430d() {
        m221431e();
    }

    /* renamed from: g */
    private final void m221433g() {
        m221434h();
    }

    /* renamed from: b */
    public LifecycleRegistry getLifecycle() {
        return m221429c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LifecycleRegistry;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.b.a.a$b */
    static final class C57138b extends Lambda implements Function0<LifecycleRegistry> {
        final /* synthetic */ TodoDailyRemindCardView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57138b(TodoDailyRemindCardView aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LifecycleRegistry invoke() {
            return new LifecycleRegistry(this.this$0);
        }
    }

    /* renamed from: a */
    public final void mo193931a() {
        m221430d();
        m221432f();
        m221433g();
    }

    /* renamed from: e */
    private final void m221431e() {
        m221429c().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        m221429c().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    /* renamed from: h */
    private final void m221434h() {
        UDButton uDButton = (UDButton) this.f140896c.findViewById(R.id.btn_enter_todo_tab);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "holderView.btn_enter_todo_tab");
        C25877a.m93659a(uDButton, TodoDependencyHolder.f139242a.mo191730a().mainModuleDependency().mo145418b());
        ((UDButton) this.f140896c.findViewById(R.id.btn_enter_todo_tab)).setOnClickListener(new EnterTodoTabClickListener());
    }

    /* renamed from: f */
    private final void m221432f() {
        String str;
        TextView textView = (TextView) this.f140896c.findViewById(R.id.todo_daily_remind_title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "holderView.todo_daily_remind_title");
        if (TodoDependencyHolder.f139242a.mo191731b().mo191935h()) {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_Task_RecentTodoTask);
        } else {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_BotNotification_DailyNotificationTitle);
        }
        textView.setText(str);
        ((LinearLayout) this.f140896c.findViewById(R.id.daily_remind_container)).removeAllViews();
        LinearLayout linearLayout = (LinearLayout) this.f140896c.findViewById(R.id.daily_remind_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "holderView.daily_remind_container");
        Context context = linearLayout.getContext();
        for (TodoDetail todoDetail : this.f140894a.getRemindTodoList()) {
            if (todoDetail != null) {
                RelativeLayout relativeLayout = new RelativeLayout(context);
                relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, C57582a.m223600a(60)));
                LinearLayout linearLayout2 = (LinearLayout) this.f140896c.findViewById(R.id.daily_remind_container);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "holderView.daily_remind_container");
                LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(15);
                boolean z = true;
                linearLayout3.setOrientation(1);
                linearLayout3.setLayoutParams(layoutParams);
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                TextView a = m221427a(context, todoDetail);
                if (a != null) {
                    z = false;
                }
                linearLayout3.addView(m221428a(context, todoDetail, z));
                if (a != null) {
                    linearLayout3.addView(a);
                }
                relativeLayout.addView(linearLayout3);
                relativeLayout.addView(m221426a(context));
                relativeLayout.setOnClickListener(new View$OnClickListenerC57137a(this, todoDetail));
                ((LinearLayout) this.f140896c.findViewById(R.id.daily_remind_container)).addView(relativeLayout);
            }
        }
    }

    /* renamed from: a */
    public final void mo193932a(TodoDailyRemindCardViewModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        this.f140894a = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.b.a.a$a */
    public static final class View$OnClickListenerC57137a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDailyRemindCardView f140897a;

        /* renamed from: b */
        final /* synthetic */ TodoDetail f140898b;

        View$OnClickListenerC57137a(TodoDailyRemindCardView aVar, TodoDetail todoDetail) {
            this.f140897a = aVar;
            this.f140898b = todoDetail;
        }

        public final void onClick(View view) {
            TodoDailyRemindCardViewModel bVar = this.f140897a.f140894a;
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            String str = this.f140898b.guid;
            if (str == null) {
                str = "";
            }
            bVar.onOpenItemTodoDetailClicked(context, str);
        }
    }

    /* renamed from: a */
    private final View m221426a(Context context) {
        View view = new View(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C57582a.m223601a(context, 0.5f));
        layoutParams.addRule(12);
        view.setBackgroundColor(ResUtil.f139261a.mo191775a(R.color.line_divider_default));
        view.setLayoutParams(layoutParams);
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoDailyRemindCardView(View view, TodoDailyRemindCardViewModel bVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "holderView");
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        this.f140896c = view;
        this.f140894a = bVar;
    }

    /* renamed from: a */
    private final TextView m221427a(Context context, TodoDetail todoDetail) {
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, C57582a.m223600a(2), 0, 0);
        Boolean bool = todoDetail.is_all_day;
        Intrinsics.checkExpressionValueIsNotNull(bool, "todo.is_all_day");
        EndTimeTextAttribute a = EndTimeHelper.m219791a(EndTimeHelper.f139399a, context, todoDetail.due_time.longValue() * ((long) 1000), bool.booleanValue(), TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145434b(), false, 16, null);
        if (TextUtils.isEmpty(a.getEndTimeStr())) {
            return null;
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C25649b.m91856a(textView, 12);
        textView.setText(a.getEndTimeStr());
        textView.setTextColor(a.getEndTimeColor());
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    /* renamed from: a */
    private final LKUILightTextView m221428a(Context context, TodoDetail todoDetail, boolean z) {
        int i;
        int a = ResUtil.f139261a.mo191775a(R.color.text_title);
        int sp2px = (int) UIHelper.sp2px(14.0f);
        int sp2px2 = (int) UIHelper.sp2px(16.0f);
        LKUILightTextView lKUILightTextView = new LKUILightTextView(context);
        if (z) {
            i = -1;
        } else {
            i = -2;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, i);
        RichText a2 = C56478e.m220168a(todoDetail.rich_summary);
        if (C59035h.m229210a(a2)) {
            a2 = C59029c.m229161b(ResUtil.f139261a.mo191781c(R.string.Todo_Task_NoTitlePlaceholder));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C59035h.m229203a(a2, false, false, true, false, a));
        EmojiHandler.m226947a(UIHelper.getContext(), spannableStringBuilder, sp2px2, 1, sp2px);
        lKUILightTextView.setMaxLines(1);
        lKUILightTextView.setEllipsize(TextUtils.TruncateAt.END);
        lKUILightTextView.setTextColor(a);
        lKUILightTextView.setTextSize(sp2px);
        lKUILightTextView.setContentText(spannableStringBuilder);
        lKUILightTextView.setLayoutParams(layoutParams);
        return lKUILightTextView;
    }
}
