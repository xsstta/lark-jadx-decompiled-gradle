package com.ss.android.lark.tab.manager.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.tab.manager.ChatTabOrderManagerViewModel;
import com.ss.android.lark.tab.manager.entity.ChatTabOrderData;
import com.ss.android.lark.tab.manager.view.SpaceItemDecoration;
import com.ss.android.lark.tab.manager.view.TabItemTouchCallback;
import com.ss.android.lark.tab.manager.view.TabOrderListAdapter;
import com.ss.android.lark.tab.statistics.ChatTabHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 92\u00020\u0001:\u00039:;B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010+\u001a\u00020,2\u0006\u0010'\u001a\u00020(J\b\u0010-\u001a\u00020,H\u0002J\u000e\u0010.\u001a\u00020,2\u0006\u0010)\u001a\u00020*J\b\u0010/\u001a\u00020,H\u0002J\b\u00100\u001a\u00020,H\u0002J\b\u00101\u001a\u00020,H\u0002J\b\u00102\u001a\u00020,H\u0002J\b\u00103\u001a\u00020,H\u0002J\u0006\u00104\u001a\u00020,J\u0014\u00105\u001a\u00020,2\f\u00106\u001a\b\u0012\u0004\u0012\u00020807R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0007X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/ss/android/lark/tab/manager/dialog/TabOrderManagerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/ss/android/lark/tab/manager/view/TabOrderListAdapter;", "getAdapter", "()Lcom/ss/android/lark/tab/manager/view/TabOrderListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "closeButton", "Landroid/widget/ImageView;", "getCloseButton", "()Landroid/widget/ImageView;", "setCloseButton", "(Landroid/widget/ImageView;)V", "funcButton", "Landroid/widget/TextView;", "getFuncButton", "()Landroid/widget/TextView;", "setFuncButton", "(Landroid/widget/TextView;)V", "modifyType", "modifyType$annotations", "()V", "tabListRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getTabListRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setTabListRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "tipView", "getTipView", "setTipView", "viewDependency", "Lcom/ss/android/lark/tab/manager/dialog/TabOrderManagerView$TabOrderManagerViewDependency;", "viewModel", "Lcom/ss/android/lark/tab/manager/ChatTabOrderManagerViewModel;", "attachViewDependency", "", "initView", "load", "onChangeToModify", "onChangeToUnModify", "reportDeleteConfirmClickEvent", "reportDeleteTabEvent", "reportSaveTabsEvent", "save", "updateTabs", "result", "", "Lcom/ss/android/lark/tab/manager/entity/ChatTabOrderData;", "Companion", "TabOrderManagerViewDependency", "TabStatus", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TabOrderManagerView extends LinearLayout {

    /* renamed from: d */
    public static final Companion f136374d = new Companion(null);

    /* renamed from: a */
    public int f136375a;

    /* renamed from: b */
    public TabOrderManagerViewDependency f136376b;

    /* renamed from: c */
    public ChatTabOrderManagerViewModel f136377c;
    @BindView(7842)
    public ImageView closeButton;

    /* renamed from: e */
    private final Lazy f136378e;
    @BindView(8130)
    public TextView funcButton;
    @BindView(8900)
    public RecyclerView tabListRecyclerView;
    @BindView(8132)
    public TextView tipView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/tab/manager/dialog/TabOrderManagerView$TabStatus;", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TabStatus {
        public static final Companion Companion = Companion.f136379a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/tab/manager/dialog/TabOrderManagerView$TabStatus$Companion;", "", "()V", "MODIFY", "", "UN_MODIFY", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.tab.manager.dialog.TabOrderManagerView$TabStatus$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f136379a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/tab/manager/dialog/TabOrderManagerView$TabOrderManagerViewDependency;", "", "onCloseButtonClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.dialog.TabOrderManagerView$b */
    public interface TabOrderManagerViewDependency {
        /* renamed from: a */
        void mo188327a();
    }

    public TabOrderManagerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public TabOrderManagerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final TabOrderListAdapter getAdapter() {
        return (TabOrderListAdapter) this.f136378e.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/tab/manager/dialog/TabOrderManagerView$Companion;", "", "()V", "MARGIN_TOP_LIMIT", "", "SPACE_TAB_LIST_IN_DP", "TOUCH_DELEGATE_IN_DP", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.dialog.TabOrderManagerView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/tab/manager/view/TabOrderListAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.dialog.TabOrderManagerView$c */
    static final class C55270c extends Lambda implements Function0<TabOrderListAdapter> {
        final /* synthetic */ Context $context;
        final /* synthetic */ TabOrderManagerView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55270c(TabOrderManagerView tabOrderManagerView, Context context) {
            super(0);
            this.this$0 = tabOrderManagerView;
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TabOrderListAdapter invoke() {
            return new TabOrderListAdapter(new TabOrderListAdapter.ITabOrderListCallback(this) {
                /* class com.ss.android.lark.tab.manager.dialog.TabOrderManagerView.C55270c.C552711 */

                /* renamed from: a */
                final /* synthetic */ C55270c f136380a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f136380a = r1;
                }

                @Override // com.ss.android.lark.tab.manager.view.TabOrderListAdapter.ITabOrderListCallback
                /* renamed from: a */
                public void mo188328a(long j) {
                    ChatTabOrderManagerViewModel bVar = this.f136380a.this$0.f136377c;
                    if (bVar != null) {
                        bVar.addRemoveId(j);
                    }
                    this.f136380a.this$0.mo188318d();
                }

                @Override // com.ss.android.lark.tab.manager.view.TabOrderListAdapter.ITabOrderListCallback
                /* renamed from: a */
                public void mo188329a(List<Long> list) {
                    Intrinsics.checkParameterIsNotNull(list, "ids");
                    ChatTabOrderManagerViewModel bVar = this.f136380a.this$0.f136377c;
                    if (bVar != null) {
                        bVar.reorderIds(list);
                    }
                }

                @Override // com.ss.android.lark.tab.manager.view.TabOrderListAdapter.ITabOrderListCallback
                /* renamed from: b */
                public void mo188330b(long j) {
                    String str;
                    if (this.f136380a.this$0.f136375a != 2) {
                        ChatTabOrderManagerViewModel bVar = this.f136380a.this$0.f136377c;
                        if (bVar != null) {
                            str = bVar.getChatId();
                        } else {
                            str = null;
                        }
                        C35228b.m137564a().mo121114a(this.f136380a.$context, ChatBundle.m109259a().mo105927a(str).mo105921a(j).mo105929a());
                        TabOrderManagerViewDependency bVar2 = this.f136380a.this$0.f136376b;
                        if (bVar2 != null) {
                            bVar2.mo188327a();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: f */
    private final void m214322f() {
        ChatTabHitPoint.f136619a.mo188725b(ChatTabHitPoint.ChatTabExtraParam.Click.SAVE_DOC_PAGE_MANAGE.plus(ChatTabHitPoint.ChatTabExtraParam.Target.IM_CHAT_MAIN_VIEW));
    }

    public final ImageView getCloseButton() {
        ImageView imageView = this.closeButton;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButton");
        }
        return imageView;
    }

    public final TextView getFuncButton() {
        TextView textView = this.funcButton;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("funcButton");
        }
        return textView;
    }

    public final RecyclerView getTabListRecyclerView() {
        RecyclerView recyclerView = this.tabListRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListRecyclerView");
        }
        return recyclerView;
    }

    public final TextView getTipView() {
        TextView textView = this.tipView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tipView");
        }
        return textView;
    }

    /* renamed from: c */
    public final void mo188317c() {
        ChatTabOrderManagerViewModel bVar = this.f136377c;
        if (bVar != null) {
            bVar.setModifiedTabIds(getAdapter().mo188362c());
        }
        ChatTabOrderManagerViewModel bVar2 = this.f136377c;
        if (bVar2 != null) {
            bVar2.saveDeleteChange();
        }
        m214322f();
    }

    /* renamed from: d */
    public final void mo188318d() {
        ChatTabHitPoint.f136619a.mo188725b(ChatTabHitPoint.ChatTabExtraParam.Click.DELETE_DOC.plus(ChatTabHitPoint.ChatTabExtraParam.Target.NONE));
        ChatTabHitPoint.f136619a.mo188727d();
    }

    /* renamed from: a */
    public final void mo188312a() {
        TextView textView = this.tipView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tipView");
        }
        textView.setVisibility(0);
        TextView textView2 = this.funcButton;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("funcButton");
        }
        textView2.setText(UIUtils.getString(getContext(), R.string.Lark_Groups_SaveButton));
        getAdapter().mo188359a(2);
        getAdapter().notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo188316b() {
        TextView textView = this.tipView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tipView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.funcButton;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("funcButton");
        }
        textView2.setText(UIUtils.getString(getContext(), R.string.Lark_Legacy_Edit));
        getAdapter().mo188359a(1);
        getAdapter().notifyDataSetChanged();
        mo188317c();
    }

    /* renamed from: e */
    private final void m214321e() {
        ImageView imageView = this.closeButton;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButton");
        }
        ak.m95026a(imageView, UIUtils.dp2px(getContext(), 5.0f));
        ImageView imageView2 = this.closeButton;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButton");
        }
        imageView2.getDrawable().setTint(UIHelper.getColor(R.color.icon_n2));
        TextView textView = this.funcButton;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("funcButton");
        }
        textView.setOnClickListener(new View$OnClickListenerC55273e(this));
        RecyclerView recyclerView = this.tabListRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = this.tabListRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListRecyclerView");
        }
        recyclerView2.addItemDecoration(new SpaceItemDecoration(0, UIHelper.dp2px(12.0f), UIHelper.dp2px(12.0f)));
        RecyclerView recyclerView3 = this.tabListRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListRecyclerView");
        }
        RecyclerView.ItemAnimator itemAnimator = recyclerView3.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            RecyclerView recyclerView4 = this.tabListRecyclerView;
            if (recyclerView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabListRecyclerView");
            }
            recyclerView4.setOverScrollMode(2);
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new TabItemTouchCallback(getAdapter()));
            RecyclerView recyclerView5 = this.tabListRecyclerView;
            if (recyclerView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabListRecyclerView");
            }
            itemTouchHelper.attachToRecyclerView(recyclerView5);
            RecyclerView recyclerView6 = this.tabListRecyclerView;
            if (recyclerView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabListRecyclerView");
            }
            recyclerView6.setAdapter(getAdapter());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.dialog.TabOrderManagerView$d */
    static final class View$OnClickListenerC55272d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TabOrderManagerViewDependency f136381a;

        View$OnClickListenerC55272d(TabOrderManagerViewDependency bVar) {
            this.f136381a = bVar;
        }

        public final void onClick(View view) {
            this.f136381a.mo188327a();
        }
    }

    public final void setCloseButton(ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(imageView, "<set-?>");
        this.closeButton = imageView;
    }

    public final void setFuncButton(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
        this.funcButton = textView;
    }

    public final void setTabListRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "<set-?>");
        this.tabListRecyclerView = recyclerView;
    }

    public final void setTipView(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
        this.tipView = textView;
    }

    /* renamed from: a */
    public final void mo188313a(ChatTabOrderManagerViewModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        this.f136377c = bVar;
        bVar.load();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.dialog.TabOrderManagerView$e */
    public static final class View$OnClickListenerC55273e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TabOrderManagerView f136382a;

        View$OnClickListenerC55273e(TabOrderManagerView tabOrderManagerView) {
            this.f136382a = tabOrderManagerView;
        }

        public final void onClick(View view) {
            if (this.f136382a.f136375a == 1) {
                this.f136382a.f136375a = 2;
                this.f136382a.mo188312a();
                return;
            }
            this.f136382a.f136375a = 1;
            this.f136382a.mo188316b();
        }
    }

    /* renamed from: a */
    public final void mo188314a(TabOrderManagerViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        this.f136376b = bVar;
        ImageView imageView = this.closeButton;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButton");
        }
        imageView.setOnClickListener(new View$OnClickListenerC55272d(bVar));
    }

    /* renamed from: a */
    public final void mo188315a(List<ChatTabOrderData> list) {
        Intrinsics.checkParameterIsNotNull(list, "result");
        getAdapter().mo188359a(this.f136375a);
        getAdapter().mo188361a(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabOrderManagerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f136375a = 1;
        this.f136378e = LazyKt.lazy(new C55270c(this, context));
        LayoutInflater.from(context).inflate(R.layout.fragment_chat_tab_order_manager, this);
        ButterKnife.bind(this);
        m214321e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TabOrderManagerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
