package com.ss.android.lark.todo.impl.features.mainview2.widget.list.adpater;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.larksuite.component.blockit.hashtag.widget.SwipeLayout;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.common.helper.CustomCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.urlpreview.UrlPreviewLoader;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56478e;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarAdapter;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarBean;
import com.ss.android.lark.todo.impl.features.mainview.listener.ListItemClickListener;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.adpater.TodoListAdapter;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListItemClickListener;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.LKUILightTextView;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import com.ss.android.lark.widget.richtext.C59035h;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u0000 22\u00020\u0001:\u00012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J2\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J4\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J$\u0010 \u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bH\u0002J$\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bH\u0002J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J,\u0010#\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J \u0010$\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010%\u001a\u00020&J \u0010'\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010(\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0006J\u0018\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "isShine", "", "onTitleClickListener", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$ITitleClickListener;", "getOnTitleClickListener", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$ITitleClickListener;", "setOnTitleClickListener", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$ITitleClickListener;)V", "shineTodoGuid", "", "getShineTodoGuid$todo_release", "()Ljava/lang/String;", "setShineTodoGuid$todo_release", "(Ljava/lang/String;)V", "bind", "", "item", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData;", "listener", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/listener/IListItemClickListener;", "currentFilter", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "isShowBadgeOverdue", "isShowBadgeToday", "bindBackground", "bindBadgeCountView", "bindCompleteCheckBox", "bindContentView", "bindTitleText", "bindTitleView", "bindView", "getSwipeLayout", "Lcom/larksuite/component/blockit/hashtag/widget/SwipeLayout;", "initAnimation", "initBehindDeleteView", "setContainerViewBackground", "drawable", "Landroid/graphics/drawable/Drawable;", "shine", "showRichContent", "richContent", "Lcom/bytedance/lark/pb/basic/v1/RichContent;", "textColor", "", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.a */
public class TodoItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final Companion f140719a = new Companion(null);

    /* renamed from: f */
    private static final int f140720f = C57582a.m223600a(16);

    /* renamed from: g */
    private static final int f140721g = C57582a.m223600a(6);

    /* renamed from: h */
    private static final int f140722h = C57582a.m223600a(44);

    /* renamed from: b */
    private TodoListAdapter.ITitleClickListener f140723b;

    /* renamed from: c */
    private String f140724c;

    /* renamed from: d */
    private boolean f140725d;

    /* renamed from: e */
    private final View f140726e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoItemViewHolder$Companion;", "", "()V", "ANIMATION_DURATION", "", "ASSIGNEE_AVATAR_WIDTH", "", "ASSIGNEE_DISTANCE", "CONTAINER_MARGIN_PARENT_BOTTOM", "", "DIVIDER_MARGIN_BOTTOM_LAST", "DIVIDER_MARGIN_LEFT", "from", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TodoItemViewHolder mo193736a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.todo_item_bg, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.assignee_avatar_list);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "view.assignee_avatar_list");
            Context context = inflate.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            AssigneeAvatarAdapter aVar = new AssigneeAvatarAdapter(context);
            aVar.mo192535a(UIUtils.dp2px(inflate.getContext(), 5.0f));
            aVar.mo192538b(UIUtils.dp2px(inflate.getContext(), 20.0f));
            recyclerView.setAdapter(aVar);
            return new TodoItemViewHolder(inflate, null);
        }
    }

    /* renamed from: a */
    public final TodoListAdapter.ITitleClickListener mo193728a() {
        return this.f140723b;
    }

    /* renamed from: b */
    public final String mo193734b() {
        return this.f140724c;
    }

    /* renamed from: a */
    private final void m221235a(TodoItemViewData todoItemViewData, IListItemClickListener aVar, TodoListView.Type type) {
        this.f140724c = todoItemViewData.mo193835a();
        LinearLayout linearLayout = (LinearLayout) this.f140726e.findViewById(R.id.content_title_view);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.content_title_view");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) this.f140726e.findViewById(R.id.content_container_view);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "view.content_container_view");
        boolean z = false;
        linearLayout2.setVisibility(0);
        if (!this.f140725d) {
            LinearLayout linearLayout3 = (LinearLayout) this.f140726e.findViewById(R.id.content_container_view);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "view.content_container_view");
            linearLayout3.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_rectangle));
        }
        m221230a(this.f140726e, todoItemViewData);
        RelativeLayout relativeLayout = (RelativeLayout) this.f140726e.findViewById(R.id.complete_checkbox_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.complete_checkbox_container");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (!todoItemViewData.mo193841f().mo193847a() && !todoItemViewData.mo193842g().mo193878a()) {
                z = true;
            }
            layoutParams2.gravity = z ? 16 : 48;
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f140726e.findViewById(R.id.complete_checkbox_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "view.complete_checkbox_container");
            relativeLayout2.setLayoutParams(layoutParams2);
            m221233a(this.f140726e, todoItemViewData, aVar);
            m221231a(this.f140726e, todoItemViewData, type);
            m221236b(this.f140726e, todoItemViewData);
            m221237b(this.f140726e, todoItemViewData, aVar);
            m221238c(this.f140726e, todoItemViewData, aVar);
            ((RelativeLayout) this.f140726e.findViewById(R.id.behind_share_view)).setOnClickListener(new View$OnClickListenerC57065b(todoItemViewData, aVar));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: a */
    private final void m221234a(TodoItemViewData todoItemViewData, TodoListView.Type type, boolean z, boolean z2) {
        LinearLayout linearLayout = (LinearLayout) this.f140726e.findViewById(R.id.content_title_view);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.content_title_view");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) this.f140726e.findViewById(R.id.content_title_view);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "view.content_title_view");
        linearLayout2.setBackground(ResUtil.f139261a.mo191782d(todoItemViewData.mo193837c().mo193890d() ? R.drawable.todo_main_fragment_title_bg_round_top : R.drawable.todo_main_fragment_title_bg_round));
        LinearLayout linearLayout3 = (LinearLayout) this.f140726e.findViewById(R.id.content_container_view);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "view.content_container_view");
        linearLayout3.setVisibility(8);
        LinearLayout linearLayout4 = (LinearLayout) this.f140726e.findViewById(R.id.content_title_view);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "view.content_title_view");
        ViewGroup.LayoutParams layoutParams = linearLayout4.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            SwipeLayout swipeLayout = (SwipeLayout) this.f140726e.findViewById(R.id.swipeLayout);
            Intrinsics.checkExpressionValueIsNotNull(swipeLayout, "view.swipeLayout");
            ViewGroup.LayoutParams layoutParams2 = swipeLayout.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMargins(0, 0, 0, 0);
                if (todoItemViewData.mo193837c().mo193890d()) {
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                } else {
                    marginLayoutParams.setMargins(0, 0, 0, f140720f);
                }
                SwipeLayout swipeLayout2 = (SwipeLayout) this.f140726e.findViewById(R.id.swipeLayout);
                Intrinsics.checkExpressionValueIsNotNull(swipeLayout2, "view.swipeLayout");
                swipeLayout2.setLayoutParams(marginLayoutParams2);
                LinearLayout linearLayout5 = (LinearLayout) this.f140726e.findViewById(R.id.content_title_view);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "view.content_title_view");
                linearLayout5.setLayoutParams(marginLayoutParams);
                int i = todoItemViewData.mo193837c().mo193890d() ? R.drawable.ud_icon_expand_down_filled : R.drawable.ud_icon_expand_right_filled;
                Context context = this.f140726e.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                ((ImageView) this.f140726e.findViewById(R.id.list_icon_img)).setImageDrawable(UDIconUtils.getIconDrawable(context, i, UIUtils.getColor(this.f140726e.getContext(), R.color.icon_n2)));
                if (todoItemViewData.mo193837c().mo193886a() == TodoItemViewData.TitleType.COMPLETED) {
                    ImageView imageView = (ImageView) this.f140726e.findViewById(R.id.list_icon_img);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "view.list_icon_img");
                    imageView.setVisibility(8);
                } else {
                    ImageView imageView2 = (ImageView) this.f140726e.findViewById(R.id.list_icon_img);
                    Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.list_icon_img");
                    imageView2.setVisibility(0);
                }
                TextView textView = (TextView) this.f140726e.findViewById(R.id.list_icon_title_tv);
                Intrinsics.checkExpressionValueIsNotNull(textView, "view.list_icon_title_tv");
                textView.setText(todoItemViewData.mo193837c().mo193888b());
                m221232a(this.f140726e, todoItemViewData, type, z, z2);
                if (todoItemViewData.mo193837c().mo193886a() != TodoItemViewData.TitleType.COMPLETED) {
                    LinearLayout linearLayout6 = (LinearLayout) this.f140726e.findViewById(R.id.content_title_view);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "view.content_title_view");
                    linearLayout6.setClickable(true);
                    ((LinearLayout) this.f140726e.findViewById(R.id.content_title_view)).setOnClickListener(new View$OnClickListenerC57067d(this, todoItemViewData));
                    return;
                }
                LinearLayout linearLayout7 = (LinearLayout) this.f140726e.findViewById(R.id.content_title_view);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout7, "view.content_title_view");
                linearLayout7.setClickable(false);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoItemViewHolder$bindView$1", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/ListItemClickListener$IListItemClickListener;", "onListItemClicked", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.a$f */
    public static final class C57069f implements ListItemClickListener.IListItemClickListener {

        /* renamed from: a */
        final /* synthetic */ IListItemClickListener f140733a;

        /* renamed from: b */
        final /* synthetic */ TodoItemViewData f140734b;

        @Override // com.ss.android.lark.todo.impl.features.mainview.listener.ListItemClickListener.IListItemClickListener
        /* renamed from: a */
        public void mo191811a() {
            this.f140733a.mo193773a(this.f140734b.mo193835a());
        }

        C57069f(IListItemClickListener aVar, TodoItemViewData todoItemViewData) {
            this.f140733a = aVar;
            this.f140734b = todoItemViewData;
        }
    }

    /* renamed from: c */
    public final SwipeLayout mo193735c() {
        SwipeLayout swipeLayout = (SwipeLayout) this.f140726e.findViewById(R.id.swipeLayout);
        Intrinsics.checkExpressionValueIsNotNull(swipeLayout, "view.swipeLayout");
        return swipeLayout;
    }

    /* renamed from: a */
    public final void mo193731a(TodoListAdapter.ITitleClickListener cVar) {
        this.f140723b = cVar;
    }

    /* renamed from: a */
    public final void mo193733a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f140724c = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.a$d */
    public static final class View$OnClickListenerC57067d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoItemViewHolder f140729a;

        /* renamed from: b */
        final /* synthetic */ TodoItemViewData f140730b;

        View$OnClickListenerC57067d(TodoItemViewHolder aVar, TodoItemViewData todoItemViewData) {
            this.f140729a = aVar;
            this.f140730b = todoItemViewData;
        }

        public final void onClick(View view) {
            TodoListAdapter.ITitleClickListener a = this.f140729a.mo193728a();
            if (a != null) {
                a.mo193755a(this.f140730b.mo193837c().mo193886a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.a$b */
    public static final class View$OnClickListenerC57065b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoItemViewData f140727a;

        /* renamed from: b */
        final /* synthetic */ IListItemClickListener f140728b;

        View$OnClickListenerC57065b(TodoItemViewData todoItemViewData, IListItemClickListener aVar) {
            this.f140727a = todoItemViewData;
            this.f140728b = aVar;
        }

        public final void onClick(View view) {
            TodoHitPoint.m221759l("task list");
            TodoGeneralHitPoint.f141070a.mo194175a(this.f140727a.mo193835a());
            IListItemClickListener aVar = this.f140728b;
            String a = this.f140727a.mo193835a();
            String a2 = C59035h.m229208a(this.f140727a.mo193838d().mo193872a(), false);
            if (a2 == null) {
                a2 = "";
            }
            aVar.mo193775a(a, a2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.a$h */
    public static final class View$OnClickListenerC57072h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoItemViewData f140739a;

        /* renamed from: b */
        final /* synthetic */ IListItemClickListener f140740b;

        View$OnClickListenerC57072h(TodoItemViewData todoItemViewData, IListItemClickListener aVar) {
            this.f140739a = todoItemViewData;
            this.f140740b = aVar;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194185b(this.f140739a.mo193835a());
            this.f140740b.mo193774a(this.f140739a.mo193835a(), this.f140739a.mo193843h(), this.f140739a.mo193839e().mo193857c());
        }
    }

    private TodoItemViewHolder(View view) {
        super(view);
        this.f140726e = view;
        this.f140724c = "";
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.assignee_avatar_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "view.assignee_avatar_list");
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setShouldLayoutZeroLengthText(true);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview2.widget.list.adpater.TodoItemViewHolder$bindTitleText$1", mo239173f = "TodoItemViewHolder.kt", mo239174i = {0}, mo239175l = {353}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.a$c */
    public static final class C57066c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SpannableStringBuilder $displayText;
        final /* synthetic */ TodoItemViewData $item;
        final /* synthetic */ int $textColor;
        final /* synthetic */ View $view;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoItemViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57066c(TodoItemViewHolder aVar, View view, TodoItemViewData todoItemViewData, SpannableStringBuilder spannableStringBuilder, int i, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
            this.$view = view;
            this.$item = todoItemViewData;
            this.$displayText = spannableStringBuilder;
            this.$textColor = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57066c cVar2 = new C57066c(this.this$0, this.$view, this.$item, this.$displayText, this.$textColor, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57066c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                UrlPreviewLoader aVar = UrlPreviewLoader.f139388a;
                LKUILightTextView lKUILightTextView = (LKUILightTextView) this.$view.findViewById(R.id.title_rich_text);
                Intrinsics.checkExpressionValueIsNotNull(lKUILightTextView, "view.title_rich_text");
                RichContent c = this.$item.mo193838d().mo193874c();
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo191965a(lKUILightTextView, this.$item.mo193835a(), this.$item.mo193835a() + this.$displayText.toString(), c, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RichContent richContent = (RichContent) obj;
            if (richContent != null) {
                this.this$0.mo193730a(richContent, this.$textColor);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.a$g */
    public static final class View$OnClickListenerC57070g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoItemViewData f140735a;

        /* renamed from: b */
        final /* synthetic */ IListItemClickListener f140736b;

        /* renamed from: c */
        final /* synthetic */ View f140737c;

        View$OnClickListenerC57070g(TodoItemViewData todoItemViewData, IListItemClickListener aVar, View view) {
            this.f140735a = todoItemViewData;
            this.f140736b = aVar;
            this.f140737c = view;
        }

        public final void onClick(View view) {
            Drawable drawable;
            if (CustomCompleteHelper.f139396a.mo191998a(this.f140735a.mo193839e().mo193858d())) {
                this.f140736b.mo193776a(this.f140735a.mo193835a(), !this.f140735a.mo193839e().mo193855a(), this.f140735a.mo193839e().mo193857c(), this.f140735a.mo193841f().mo193851e(), this.f140735a.mo193839e().mo193858d());
                return;
            }
            if (MultiCompleteHelper.f139390a.mo191984a(this.f140735a.mo193839e().mo193857c())) {
                if (CollectionsKt.listOf((Object[]) new MultiCompleteHelper.MultiCompleteType[]{MultiCompleteHelper.MultiCompleteType.NOT_COMPLETE, MultiCompleteHelper.MultiCompleteType.COMPLETE_TODO_WITH_DIALOG}).contains(this.f140735a.mo193841f().mo193851e())) {
                    IListItemClickListener.C57082a.m221314a(this.f140736b, this.f140735a.mo193835a(), !this.f140735a.mo193839e().mo193855a(), this.f140735a.mo193839e().mo193857c(), this.f140735a.mo193841f().mo193851e(), null, 16, null);
                    return;
                }
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f140737c.findViewById(R.id.complete_checkbox_lottie);
            Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "view.complete_checkbox_lottie");
            lottieAnimationView.setVisibility(0);
            ImageView imageView = (ImageView) this.f140737c.findViewById(R.id.complete_checkbox);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.complete_checkbox");
            imageView.setVisibility(8);
            if (this.f140735a.mo193839e().mo193855a()) {
                ((LottieAnimationView) this.f140737c.findViewById(R.id.complete_checkbox_lottie)).setAnimation(R.raw.todo_item_undone);
            } else {
                ((LottieAnimationView) this.f140737c.findViewById(R.id.complete_checkbox_lottie)).setAnimation(R.raw.todo_item_done);
            }
            ImageView imageView2 = (ImageView) this.f140737c.findViewById(R.id.complete_checkbox);
            if (this.f140735a.mo193839e().mo193855a()) {
                drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_uncheck);
            } else {
                drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_checked);
            }
            imageView2.setImageDrawable(drawable);
            ((LottieAnimationView) this.f140737c.findViewById(R.id.complete_checkbox_lottie)).playAnimation();
            UICallbackExecutor.executeDelayed(new Runnable(this) {
                /* class com.ss.android.lark.todo.impl.features.mainview2.widget.list.adpater.TodoItemViewHolder.View$OnClickListenerC57070g.RunnableC570711 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC57070g f140738a;

                {
                    this.f140738a = r1;
                }

                public final void run() {
                    IListItemClickListener.C57082a.m221314a(this.f140738a.f140736b, this.f140738a.f140735a.mo193835a(), !this.f140738a.f140735a.mo193839e().mo193855a(), this.f140738a.f140735a.mo193839e().mo193857c(), this.f140738a.f140735a.mo193841f().mo193851e(), null, 16, null);
                    ImageView imageView = (ImageView) this.f140738a.f140737c.findViewById(R.id.complete_checkbox);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "view.complete_checkbox");
                    imageView.setVisibility(0);
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f140738a.f140737c.findViewById(R.id.complete_checkbox_lottie);
                    Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "view.complete_checkbox_lottie");
                    lottieAnimationView.setVisibility(8);
                    ((LottieAnimationView) this.f140738a.f140737c.findViewById(R.id.complete_checkbox_lottie)).cancelAnimation();
                }
            }, 450);
        }
    }

    public /* synthetic */ TodoItemViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoItemViewHolder$bindView$2$1", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter$ItemClickListener;", "onItemClick", "", "view", "Landroid/view/View;", "bean", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarBean;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.a$e */
    public static final class C57068e implements AssigneeAvatarAdapter.ItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoItemViewData f140731a;

        /* renamed from: b */
        final /* synthetic */ IListItemClickListener f140732b;

        C57068e(TodoItemViewData todoItemViewData, IListItemClickListener aVar) {
            this.f140731a = todoItemViewData;
            this.f140732b = aVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarAdapter.ItemClickListener
        /* renamed from: a */
        public void mo191810a(View view, AssigneeAvatarBean bVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(bVar, "bean");
            this.f140732b.mo193773a(this.f140731a.mo193835a());
        }
    }

    /* renamed from: a */
    public final void mo193729a(Drawable drawable, boolean z) {
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        LinearLayout linearLayout = (LinearLayout) this.f140726e.findViewById(R.id.content_container_view);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.content_container_view");
        linearLayout.setBackground(drawable);
        this.f140725d = z;
    }

    /* renamed from: a */
    public final void mo193730a(RichContent richContent, int i) {
        int sp2px = (int) UIHelper.sp2px(20.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C59035h.m229203a(C56478e.m220168a(richContent), false, false, true, false, i));
        EmojiHandler.m226947a(UIHelper.getContext(), spannableStringBuilder, sp2px, 1, (int) UIHelper.sp2px(16.0f));
        ((LKUILightTextView) this.f140726e.findViewById(R.id.title_rich_text)).setContentText(spannableStringBuilder);
    }

    /* renamed from: b */
    private final void m221236b(View view, TodoItemViewData todoItemViewData) {
        int i;
        ResUtil eVar = ResUtil.f139261a;
        if (todoItemViewData.mo193839e().mo193855a()) {
            i = R.color.text_caption;
        } else {
            i = R.color.text_title;
        }
        int a = eVar.mo191775a(i);
        int sp2px = (int) UIHelper.sp2px(16.0f);
        int sp2px2 = (int) UIHelper.sp2px(20.0f);
        view.findViewById(R.id.item_finish_line).setBackgroundColor(a);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C59035h.m229203a(todoItemViewData.mo193838d().mo193872a(), false, false, true, false, a));
        EmojiHandler.m226947a(UIHelper.getContext(), spannableStringBuilder, sp2px2, 1, sp2px);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setMaxLines(1);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setEllipsize(TextUtils.TruncateAt.END);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setTextColor(a);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setTextSize(sp2px);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setContentText(spannableStringBuilder);
        if (UrlPreviewLoader.f139388a.mo191968a(todoItemViewData.mo193838d().mo193874c())) {
            UrlPreviewLoader aVar = UrlPreviewLoader.f139388a;
            RichContent a2 = aVar.mo191964a(todoItemViewData.mo193835a() + spannableStringBuilder.toString());
            if (a2 == null) {
                Job unused = C69553g.m266944a(GlobalScope.f173453a, Dispatchers.m266324b(), null, new C57066c(this, view, todoItemViewData, spannableStringBuilder, a, null), 2, null);
            } else {
                mo193730a(a2, a);
            }
        }
    }

    /* renamed from: a */
    private final void m221230a(View view, TodoItemViewData todoItemViewData) {
        int i = R.id.swipeLayout;
        SwipeLayout swipeLayout = (SwipeLayout) view.findViewById(R.id.swipeLayout);
        Intrinsics.checkExpressionValueIsNotNull(swipeLayout, "view.swipeLayout");
        ViewGroup.LayoutParams layoutParams = swipeLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            View findViewById = view.findViewById(R.id.divider_todo_item);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.divider_todo_item");
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (todoItemViewData.mo193845i().mo193863a() && todoItemViewData.mo193845i().mo193865b()) {
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                    marginLayoutParams2.setMargins(f140722h, 0, 0, f140721g);
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.content_container_view);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.content_container_view");
                    linearLayout.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_round));
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.behind_delete_view);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.behind_delete_view");
                    relativeLayout.setBackground(ResUtil.f139261a.mo191782d(R.drawable.todo_bg_list_backend_red_right_radius));
                    View findViewById2 = view.findViewById(R.id.divider_todo_item);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.divider_todo_item");
                    findViewById2.setVisibility(4);
                } else if (todoItemViewData.mo193845i().mo193863a()) {
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                    marginLayoutParams2.setMargins(f140722h, 0, 0, 0);
                    LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.content_container_view);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "view.content_container_view");
                    linearLayout2.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_round_top));
                    RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.behind_delete_view);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "view.behind_delete_view");
                    relativeLayout2.setBackground(ResUtil.f139261a.mo191782d(R.drawable.todo_bg_list_backend_red_rignt_top));
                    View findViewById3 = view.findViewById(R.id.divider_todo_item);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.divider_todo_item");
                    findViewById3.setVisibility(0);
                } else {
                    if (todoItemViewData.mo193845i().mo193865b()) {
                        marginLayoutParams.setMargins(0, 0, 0, 0);
                        marginLayoutParams2.setMargins(f140722h, 0, 0, f140721g);
                        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.content_container_view);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "view.content_container_view");
                        linearLayout3.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_round_bottom));
                        RelativeLayout relativeLayout3 = (RelativeLayout) view.findViewById(R.id.behind_delete_view);
                        Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "view.behind_delete_view");
                        relativeLayout3.setBackground(ResUtil.f139261a.mo191782d(R.drawable.todo_bg_list_backend_red_rignt_bottom));
                        View findViewById4 = view.findViewById(R.id.divider_todo_item);
                        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.divider_todo_item");
                        findViewById4.setVisibility(4);
                    } else {
                        marginLayoutParams.setMargins(0, 0, 0, 0);
                        if (todoItemViewData.mo193845i().mo193867c()) {
                            marginLayoutParams.setMargins(0, 0, 0, f140720f);
                            marginLayoutParams2.setMargins(f140722h, 0, 0, f140721g);
                            LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.content_container_view);
                            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "view.content_container_view");
                            linearLayout4.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_round_bottom));
                            RelativeLayout relativeLayout4 = (RelativeLayout) view.findViewById(R.id.behind_delete_view);
                            Intrinsics.checkExpressionValueIsNotNull(relativeLayout4, "view.behind_delete_view");
                            relativeLayout4.setBackground(ResUtil.f139261a.mo191782d(R.drawable.todo_bg_list_backend_red_rignt_bottom));
                            View findViewById5 = view.findViewById(R.id.divider_todo_item);
                            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "view.divider_todo_item");
                            findViewById5.setVisibility(4);
                        } else {
                            marginLayoutParams2.setMargins(f140722h, 0, 0, 0);
                            LinearLayout linearLayout5 = (LinearLayout) view.findViewById(R.id.content_container_view);
                            Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "view.content_container_view");
                            linearLayout5.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_rectangle));
                            RelativeLayout relativeLayout5 = (RelativeLayout) view.findViewById(R.id.behind_delete_view);
                            Intrinsics.checkExpressionValueIsNotNull(relativeLayout5, "view.behind_delete_view");
                            relativeLayout5.setBackground(ResUtil.f139261a.mo191782d(R.drawable.todo_bg_list_backend_red_corner));
                            View findViewById6 = view.findViewById(R.id.divider_todo_item);
                            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.divider_todo_item");
                            findViewById6.setVisibility(0);
                        }
                    }
                    i = R.id.swipeLayout;
                }
                SwipeLayout swipeLayout2 = (SwipeLayout) view.findViewById(i);
                Intrinsics.checkExpressionValueIsNotNull(swipeLayout2, "view.swipeLayout");
                swipeLayout2.setLayoutParams(marginLayoutParams);
                View findViewById7 = view.findViewById(R.id.divider_todo_item);
                Intrinsics.checkExpressionValueIsNotNull(findViewById7, "view.divider_todo_item");
                findViewById7.setLayoutParams(marginLayoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: b */
    private final void m221237b(View view, TodoItemViewData todoItemViewData, IListItemClickListener aVar) {
        ((RelativeLayout) view.findViewById(R.id.complete_checkbox_container)).setOnClickListener(new View$OnClickListenerC57070g(todoItemViewData, aVar, view));
    }

    /* renamed from: a */
    private final void m221231a(View view, TodoItemViewData todoItemViewData, TodoListView.Type type) {
        Drawable drawable;
        ImageView imageView = (ImageView) view.findViewById(R.id.complete_checkbox);
        if (todoItemViewData.mo193839e().mo193855a()) {
            if (todoItemViewData.mo193839e().mo193856b()) {
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.complete_checkbox_container);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.complete_checkbox_container");
                relativeLayout.setEnabled(true);
                drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_checked);
            } else {
                RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.complete_checkbox_container);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "view.complete_checkbox_container");
                relativeLayout2.setEnabled(false);
                drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_checked_dis);
            }
        } else if (!todoItemViewData.mo193839e().mo193856b()) {
            RelativeLayout relativeLayout3 = (RelativeLayout) view.findViewById(R.id.complete_checkbox_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "view.complete_checkbox_container");
            relativeLayout3.setEnabled(false);
            drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_uncheckable);
        } else {
            RelativeLayout relativeLayout4 = (RelativeLayout) view.findViewById(R.id.complete_checkbox_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout4, "view.complete_checkbox_container");
            relativeLayout4.setEnabled(true);
            drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_uncheck);
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: c */
    private final void m221238c(View view, TodoItemViewData todoItemViewData, IListItemClickListener aVar) {
        String str;
        int i;
        TextView textView = (TextView) view.findViewById(R.id.behind_delete_view_text);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.behind_delete_view_text");
        int i2 = C57073b.f140741a[todoItemViewData.mo193843h().ordinal()];
        if (i2 == 1) {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_common_Delete);
        } else if (i2 == 2) {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_Task_Leave);
        } else if (i2 == 3) {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_Notify_TaskUnfollowedTitle);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setText(str);
        int i3 = C57073b.f140742b[todoItemViewData.mo193843h().ordinal()];
        if (i3 == 1) {
            i = R.drawable.ud_icon_delete_trash_outlined;
        } else if (i3 == 2) {
            i = R.drawable.ud_icon_logout_outlined;
        } else if (i3 == 3) {
            i = R.drawable.ud_icon_subscribe_cancel_outlined;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        ((ImageView) view.findViewById(R.id.behind_delete_view_image)).setImageDrawable(UDIconUtils.getIconDrawable(context, i, UIUtils.getColor(view.getContext(), R.color.static_white)));
        ((RelativeLayout) view.findViewById(R.id.behind_delete_view)).setOnClickListener(new View$OnClickListenerC57072h(todoItemViewData, aVar));
    }

    /* renamed from: a */
    private final void m221233a(View view, TodoItemViewData todoItemViewData, IListItemClickListener aVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ((LinearLayout) view.findViewById(R.id.content_container_view)).setOnClickListener(new ListItemClickListener(new C57069f(aVar, todoItemViewData)));
        View findViewById = view.findViewById(R.id.item_finish_line);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.item_finish_line");
        if (todoItemViewData.mo193838d().mo193873b()) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.attendee_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.attendee_container");
        if (todoItemViewData.mo193841f().mo193847a()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.assignee_avatar_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "view.assignee_avatar_list");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            AssigneeAvatarAdapter aVar2 = (AssigneeAvatarAdapter) adapter;
            if (aVar2 != null) {
                aVar2.mo192537a(todoItemViewData.mo193841f().mo193850d());
                aVar2.mo192536a(new C57068e(todoItemViewData, aVar));
            }
            TextView textView = (TextView) view.findViewById(R.id.assignee_avatar_count);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.assignee_avatar_count");
            C25877a.m93659a(textView, todoItemViewData.mo193841f().mo193848b());
            TextView textView2 = (TextView) view.findViewById(R.id.assignee_avatar_count);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "view.assignee_avatar_count");
            textView2.setText(todoItemViewData.mo193841f().mo193849c());
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.ll_end_time_first);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "view.ll_end_time_first");
            if (todoItemViewData.mo193842g().mo193878a()) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            linearLayout2.setVisibility(i3);
            if (todoItemViewData.mo193839e().mo193855a()) {
                Context context = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                ((ImageView) view.findViewById(R.id.img_end_time_first)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_calendar_done_outlined, todoItemViewData.mo193842g().mo193880c()));
            } else {
                Context context2 = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
                ((ImageView) view.findViewById(R.id.img_end_time_first)).setImageDrawable(UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_calendar_outlined, todoItemViewData.mo193842g().mo193880c()));
            }
            TextView textView3 = (TextView) view.findViewById(R.id.tv_end_time_first);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "view.tv_end_time_first");
            textView3.setText(todoItemViewData.mo193842g().mo193879b());
            ((TextView) view.findViewById(R.id.tv_end_time_first)).setTextColor(todoItemViewData.mo193842g().mo193880c());
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.ll_end_time);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "view.ll_end_time");
            if (todoItemViewData.mo193842g().mo193878a()) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            linearLayout3.setVisibility(i4);
            if (todoItemViewData.mo193839e().mo193855a()) {
                Context context3 = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "view.context");
                ((ImageView) view.findViewById(R.id.img_end_time)).setImageDrawable(UDIconUtils.getIconDrawable(context3, (int) R.drawable.ud_icon_calendar_done_outlined, todoItemViewData.mo193842g().mo193880c()));
            } else {
                Context context4 = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "view.context");
                ((ImageView) view.findViewById(R.id.img_end_time)).setImageDrawable(UDIconUtils.getIconDrawable(context4, (int) R.drawable.ud_icon_calendar_outlined, todoItemViewData.mo193842g().mo193880c()));
            }
            TextView textView4 = (TextView) view.findViewById(R.id.tv_end_time);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "view.tv_end_time");
            textView4.setText(todoItemViewData.mo193842g().mo193879b());
            ((TextView) view.findViewById(R.id.tv_end_time)).setTextColor(todoItemViewData.mo193842g().mo193880c());
            LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.attendee_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "view.attendee_container");
            if (linearLayout4.getVisibility() == 8 || todoItemViewData.mo193842g().mo193882e()) {
                LinearLayout linearLayout5 = (LinearLayout) view.findViewById(R.id.ll_end_time_first);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "view.ll_end_time_first");
                C25877a.m93659a(linearLayout5, false);
                return;
            }
            LinearLayout linearLayout6 = (LinearLayout) view.findViewById(R.id.ll_end_time);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "view.ll_end_time");
            linearLayout6.setVisibility(8);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarAdapter");
    }

    /* renamed from: a */
    public final void mo193732a(TodoItemViewData todoItemViewData, IListItemClickListener aVar, TodoListView.Type type, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(todoItemViewData, "item");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        Intrinsics.checkParameterIsNotNull(type, "currentFilter");
        if (todoItemViewData.mo193836b()) {
            m221234a(todoItemViewData, type, z, z2);
        } else {
            m221235a(todoItemViewData, aVar, type);
        }
    }

    /* renamed from: a */
    private final void m221232a(View view, TodoItemViewData todoItemViewData, TodoListView.Type type, boolean z, boolean z2) {
        boolean z3;
        int i;
        if (todoItemViewData.mo193837c().mo193886a() == TodoItemViewData.TitleType.DONE || todoItemViewData.mo193837c().mo193886a() == TodoItemViewData.TitleType.DOING || todoItemViewData.mo193837c().mo193886a() == TodoItemViewData.TitleType.COMPLETED) {
            TextView textView = (TextView) view.findViewById(R.id.list_icon_count_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.list_icon_count_tv");
            textView.setVisibility(8);
            LKUIBadgeView lKUIBadgeView = (LKUIBadgeView) view.findViewById(R.id.list_icon_count_red_badge);
            Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView, "view.list_icon_count_red_badge");
            lKUIBadgeView.setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.list_icon_count_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.list_icon_count_tv");
        textView2.setVisibility(0);
        TextView textView3 = (TextView) view.findViewById(R.id.list_icon_count_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "view.list_icon_count_tv");
        textView3.setText(String.valueOf(todoItemViewData.mo193837c().mo193889c()));
        if ((todoItemViewData.mo193837c().mo193886a() != TodoItemViewData.TitleType.OVER_DUE || !z) && (todoItemViewData.mo193837c().mo193886a() != TodoItemViewData.TitleType.TODAY || !z2)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (type != TodoListView.Type.ALL || !z3) {
            LKUIBadgeView lKUIBadgeView2 = (LKUIBadgeView) view.findViewById(R.id.list_icon_count_red_badge);
            Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView2, "view.list_icon_count_red_badge");
            lKUIBadgeView2.setVisibility(8);
            return;
        }
        int c = todoItemViewData.mo193837c().mo193889c();
        int e = todoItemViewData.mo193837c().mo193891e();
        if (e <= 0) {
            LKUIBadgeView lKUIBadgeView3 = (LKUIBadgeView) view.findViewById(R.id.list_icon_count_red_badge);
            Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView3, "view.list_icon_count_red_badge");
            lKUIBadgeView3.setVisibility(8);
            return;
        }
        if (c == e) {
            TextView textView4 = (TextView) view.findViewById(R.id.list_icon_count_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "view.list_icon_count_tv");
            textView4.setVisibility(8);
        }
        LKUIBadgeView lKUIBadgeView4 = (LKUIBadgeView) view.findViewById(R.id.list_icon_count_red_badge);
        Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView4, "view.list_icon_count_red_badge");
        lKUIBadgeView4.setVisibility(0);
        if (e < 10) {
            i = R.drawable.badge_orange_single_count_bg_no_stroke;
        } else if (e < 999) {
            i = R.drawable.badge_orange_multi_count_bg_no_stroke;
        } else {
            i = R.drawable.badge_orange_bg_etc_count;
        }
        ((LKUIBadgeView) view.findViewById(R.id.list_icon_count_red_badge)).mo89321b(1.0f).mo89319a(String.valueOf(e)).mo89322b(i).mo89320a();
    }
}
