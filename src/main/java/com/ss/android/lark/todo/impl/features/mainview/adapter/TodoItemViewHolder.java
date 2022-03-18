package com.ss.android.lark.todo.impl.features.mainview.adapter;

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
import androidx.lifecycle.C1143ag;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.larksuite.component.blockit.hashtag.widget.SwipeLayout;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.urlpreview.UrlPreviewLoader;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56478e;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarAdapter;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarBean;
import com.ss.android.lark.todo.impl.features.mainview.adapter.TodoListAdapter;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import com.ss.android.lark.todo.impl.features.mainview.listener.ListItemClickListener;
import com.ss.android.lark.todo.impl.features.mainview.listener.OnItemClickListener;
import com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.LKUILightTextView;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import com.ss.android.lark.widget.richtext.C59035h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u0000 32\u00020\u0001:\u00013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0017H\u0002J \u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010 \u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0017H\u0002J \u0010!\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0002J\u0006\u0010&\u001a\u00020'J \u0010(\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0017H\u0002J(\u0010)\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0006J\u0018\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "isShine", "", "onTitleClickListener", "Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$ITitleClickListener;", "getOnTitleClickListener", "()Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$ITitleClickListener;", "setOnTitleClickListener", "(Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$ITitleClickListener;)V", "operationUserId", "", "shineTodoGuid", "getShineTodoGuid$todo_release", "()Ljava/lang/String;", "setShineTodoGuid$todo_release", "(Ljava/lang/String;)V", "bind", "", "viewModel", "Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainViewModel;", "item", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "onItemClickListener", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/OnItemClickListener;", "bindBackground", "bindBadgeCountView", "mainViewModel", "bindCompleteCheckBox", "bindTitleText", "bindView", "getShowAssignees", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "assignees", "getSwipeLayout", "Lcom/larksuite/component/blockit/hashtag/widget/SwipeLayout;", "initAnimation", "initBehindDeleteView", "setContainerViewBackground", "drawable", "Landroid/graphics/drawable/Drawable;", "shine", "showRichContent", "richContent", "Lcom/bytedance/lark/pb/basic/v1/RichContent;", "textColor", "", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.a */
public class TodoItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final Companion f140226a = new Companion(null);

    /* renamed from: g */
    private static final int f140227g = C57582a.m223600a(16);

    /* renamed from: h */
    private static final int f140228h = C57582a.m223600a(6);

    /* renamed from: i */
    private static final int f140229i = C57582a.m223600a(44);

    /* renamed from: b */
    private TodoListAdapter.ITitleClickListener f140230b;

    /* renamed from: c */
    private final String f140231c;

    /* renamed from: d */
    private String f140232d;

    /* renamed from: e */
    private boolean f140233e;

    /* renamed from: f */
    private final View f140234f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoItemViewHolder$Companion;", "", "()V", "ANIMATION_DURATION", "", "ASSIGNEE_AVATAR_WIDTH", "", "ASSIGNEE_DISTANCE", "CONTAINER_MARGIN_PARENT_BOTTOM", "", "DIVIDER_MARGIN_BOTTOM_LAST", "DIVIDER_MARGIN_LEFT", "from", "Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TodoItemViewHolder mo193111a(ViewGroup viewGroup) {
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
    public final TodoListAdapter.ITitleClickListener mo193103a() {
        return this.f140230b;
    }

    /* renamed from: b */
    public final String mo193109b() {
        return this.f140232d;
    }

    /* renamed from: a */
    public final void mo193107a(TodoMainViewModel fVar, TodoDisplayItem todoDisplayItem, OnItemClickListener cVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "viewModel");
        Intrinsics.checkParameterIsNotNull(todoDisplayItem, "item");
        Intrinsics.checkParameterIsNotNull(cVar, "onItemClickListener");
        if (todoDisplayItem.mo193181q()) {
            LinearLayout linearLayout = (LinearLayout) this.f140234f.findViewById(R.id.content_title_view);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.content_title_view");
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = (LinearLayout) this.f140234f.findViewById(R.id.content_title_view);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "view.content_title_view");
            linearLayout2.setBackground(ResUtil.f139261a.mo191782d(todoDisplayItem.mo193184t() ? R.drawable.todo_main_fragment_title_bg_round_top : R.drawable.todo_main_fragment_title_bg_round));
            LinearLayout linearLayout3 = (LinearLayout) this.f140234f.findViewById(R.id.content_container_view);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "view.content_container_view");
            linearLayout3.setVisibility(8);
            LinearLayout linearLayout4 = (LinearLayout) this.f140234f.findViewById(R.id.content_title_view);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "view.content_title_view");
            ViewGroup.LayoutParams layoutParams = linearLayout4.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                SwipeLayout swipeLayout = (SwipeLayout) this.f140234f.findViewById(R.id.swipeLayout);
                Intrinsics.checkExpressionValueIsNotNull(swipeLayout, "view.swipeLayout");
                ViewGroup.LayoutParams layoutParams2 = swipeLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (todoDisplayItem.mo193184t()) {
                        marginLayoutParams.setMargins(0, 0, 0, 0);
                    } else {
                        marginLayoutParams.setMargins(0, 0, 0, f140227g);
                    }
                    marginLayoutParams2.setMargins(0, 0, 0, 0);
                    SwipeLayout swipeLayout2 = (SwipeLayout) this.f140234f.findViewById(R.id.swipeLayout);
                    Intrinsics.checkExpressionValueIsNotNull(swipeLayout2, "view.swipeLayout");
                    swipeLayout2.setLayoutParams(marginLayoutParams2);
                    LinearLayout linearLayout5 = (LinearLayout) this.f140234f.findViewById(R.id.content_title_view);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "view.content_title_view");
                    linearLayout5.setLayoutParams(marginLayoutParams);
                    int i = todoDisplayItem.mo193184t() ? R.drawable.ud_icon_expand_down_filled : R.drawable.ud_icon_expand_right_filled;
                    Context context = this.f140234f.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                    ((ImageView) this.f140234f.findViewById(R.id.list_icon_img)).setImageDrawable(UDIconUtils.getIconDrawable(context, i, UIUtils.getColor(this.f140234f.getContext(), R.color.icon_n2)));
                    if (todoDisplayItem.mo193182r() == TodoDisplayItem.TitleType.COMPLETED) {
                        ImageView imageView = (ImageView) this.f140234f.findViewById(R.id.list_icon_img);
                        Intrinsics.checkExpressionValueIsNotNull(imageView, "view.list_icon_img");
                        imageView.setVisibility(8);
                    } else {
                        ImageView imageView2 = (ImageView) this.f140234f.findViewById(R.id.list_icon_img);
                        Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.list_icon_img");
                        imageView2.setVisibility(0);
                    }
                    TextView textView = (TextView) this.f140234f.findViewById(R.id.list_icon_title_tv);
                    Intrinsics.checkExpressionValueIsNotNull(textView, "view.list_icon_title_tv");
                    textView.setText(todoDisplayItem.mo193186u());
                    m220713b(this.f140234f, todoDisplayItem, fVar);
                    if (todoDisplayItem.mo193182r() != TodoDisplayItem.TitleType.COMPLETED) {
                        LinearLayout linearLayout6 = (LinearLayout) this.f140234f.findViewById(R.id.content_title_view);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "view.content_title_view");
                        linearLayout6.setClickable(true);
                        ((LinearLayout) this.f140234f.findViewById(R.id.content_title_view)).setOnClickListener(new View$OnClickListenerC56796b(this, todoDisplayItem));
                        return;
                    }
                    LinearLayout linearLayout7 = (LinearLayout) this.f140234f.findViewById(R.id.content_title_view);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout7, "view.content_title_view");
                    linearLayout7.setClickable(false);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        this.f140232d = todoDisplayItem.mo193167e();
        LinearLayout linearLayout8 = (LinearLayout) this.f140234f.findViewById(R.id.content_title_view);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout8, "view.content_title_view");
        linearLayout8.setVisibility(8);
        LinearLayout linearLayout9 = (LinearLayout) this.f140234f.findViewById(R.id.content_container_view);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout9, "view.content_container_view");
        linearLayout9.setVisibility(0);
        if (!this.f140233e) {
            LinearLayout linearLayout10 = (LinearLayout) this.f140234f.findViewById(R.id.content_container_view);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout10, "view.content_container_view");
            linearLayout10.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_rectangle));
        }
        m220710a(this.f140234f, todoDisplayItem);
        RelativeLayout relativeLayout = (RelativeLayout) this.f140234f.findViewById(R.id.complete_checkbox_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.complete_checkbox_container");
        ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
        if (layoutParams3 != null) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = todoDisplayItem.mo193160a() ? 16 : 48;
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f140234f.findViewById(R.id.complete_checkbox_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "view.complete_checkbox_container");
            relativeLayout2.setLayoutParams(layoutParams4);
            m220711a(this.f140234f, todoDisplayItem, fVar);
            m220715d(this.f140234f, todoDisplayItem, fVar);
            m220714c(this.f140234f, todoDisplayItem, fVar);
            m220716e(this.f140234f, todoDisplayItem, fVar);
            m220712a(this.f140234f, todoDisplayItem, fVar, cVar);
            ((RelativeLayout) this.f140234f.findViewById(R.id.behind_share_view)).setOnClickListener(new View$OnClickListenerC56797c(todoDisplayItem, cVar));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/adapter/TodoItemViewHolder$bindView$1", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/ListItemClickListener$IListItemClickListener;", "onListItemClicked", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.a$f */
    public static final class C56800f implements ListItemClickListener.IListItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainViewModel f140242a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f140243b;

        @Override // com.ss.android.lark.todo.impl.features.mainview.listener.ListItemClickListener.IListItemClickListener
        /* renamed from: a */
        public void mo191811a() {
            this.f140242a.openTodo(this.f140243b);
        }

        C56800f(TodoMainViewModel fVar, TodoDisplayItem todoDisplayItem) {
            this.f140242a = fVar;
            this.f140243b = todoDisplayItem;
        }
    }

    /* renamed from: c */
    public final SwipeLayout mo193110c() {
        SwipeLayout swipeLayout = (SwipeLayout) this.f140234f.findViewById(R.id.swipeLayout);
        Intrinsics.checkExpressionValueIsNotNull(swipeLayout, "view.swipeLayout");
        return swipeLayout;
    }

    /* renamed from: a */
    public final void mo193106a(TodoListAdapter.ITitleClickListener cVar) {
        this.f140230b = cVar;
    }

    /* renamed from: a */
    public final void mo193108a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f140232d = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.a$b */
    public static final class View$OnClickListenerC56796b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoItemViewHolder f140235a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f140236b;

        View$OnClickListenerC56796b(TodoItemViewHolder aVar, TodoDisplayItem todoDisplayItem) {
            this.f140235a = aVar;
            this.f140236b = todoDisplayItem;
        }

        public final void onClick(View view) {
            TodoListAdapter.ITitleClickListener a = this.f140235a.mo193103a();
            if (a != null) {
                a.mo193128a(this.f140236b.mo193182r());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.a$h */
    public static final class View$OnClickListenerC56803h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDisplayItem f140248a;

        /* renamed from: b */
        final /* synthetic */ OnItemClickListener f140249b;

        /* renamed from: c */
        final /* synthetic */ TodoMainViewModel f140250c;

        View$OnClickListenerC56803h(TodoDisplayItem todoDisplayItem, OnItemClickListener cVar, TodoMainViewModel fVar) {
            this.f140248a = todoDisplayItem;
            this.f140249b = cVar;
            this.f140250c = fVar;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194185b(this.f140248a.mo193167e());
            this.f140249b.mo193138a();
            this.f140250c.changeStatusTodo(this.f140248a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.a$c */
    public static final class View$OnClickListenerC56797c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDisplayItem f140237a;

        /* renamed from: b */
        final /* synthetic */ OnItemClickListener f140238b;

        View$OnClickListenerC56797c(TodoDisplayItem todoDisplayItem, OnItemClickListener cVar) {
            this.f140237a = todoDisplayItem;
            this.f140238b = cVar;
        }

        public final void onClick(View view) {
            TodoHitPoint.m221759l("task list");
            TodoGeneralHitPoint.f141070a.mo194175a(this.f140237a.mo193167e());
            OnItemClickListener cVar = this.f140238b;
            String e = this.f140237a.mo193167e();
            String a = C59035h.m229208a(this.f140237a.mo193169f(), false);
            if (a == null) {
                a = "";
            }
            cVar.mo193139a(e, a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.mainview.adapter.TodoItemViewHolder$bindTitleText$1", mo239173f = "TodoItemViewHolder.kt", mo239174i = {0}, mo239175l = {325}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.a$d */
    public static final class C56798d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SpannableStringBuilder $displayText;
        final /* synthetic */ TodoDisplayItem $item;
        final /* synthetic */ int $textColor;
        final /* synthetic */ View $view;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoItemViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56798d(TodoItemViewHolder aVar, View view, TodoDisplayItem todoDisplayItem, SpannableStringBuilder spannableStringBuilder, int i, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
            this.$view = view;
            this.$item = todoDisplayItem;
            this.$displayText = spannableStringBuilder;
            this.$textColor = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56798d dVar = new C56798d(this.this$0, this.$view, this.$item, this.$displayText, this.$textColor, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56798d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
                RichContent g = this.$item.mo193170g();
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo191965a(lKUILightTextView, this.$item.mo193167e(), this.$item.mo193167e() + this.$displayText.toString(), g, this);
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
                this.this$0.mo193105a(richContent, this.$textColor);
            }
            return Unit.INSTANCE;
        }
    }

    private TodoItemViewHolder(View view) {
        super(view);
        this.f140234f = view;
        this.f140231c = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
        this.f140232d = "";
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.assignee_avatar_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "view.assignee_avatar_list");
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setShouldLayoutZeroLengthText(true);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.a$g */
    public static final class View$OnClickListenerC56801g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoMainViewModel f140244a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f140245b;

        /* renamed from: c */
        final /* synthetic */ View f140246c;

        View$OnClickListenerC56801g(TodoMainViewModel fVar, TodoDisplayItem todoDisplayItem, View view) {
            this.f140244a = fVar;
            this.f140245b = todoDisplayItem;
            this.f140246c = view;
        }

        public final void onClick(View view) {
            Drawable drawable;
            TodoMainViewModel fVar = this.f140244a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            if (!fVar.isInCustomCompleteStrategy(context, this.f140245b.mo193176l())) {
                if (MultiCompleteHelper.f139390a.mo191984a(this.f140245b.mo193189x())) {
                    if (CollectionsKt.listOf((Object[]) new MultiCompleteHelper.MultiCompleteType[]{MultiCompleteHelper.MultiCompleteType.NOT_COMPLETE, MultiCompleteHelper.MultiCompleteType.COMPLETE_TODO_WITH_DIALOG}).contains(this.f140245b.mo193175k())) {
                        this.f140244a.setCompleted(this.f140245b);
                        return;
                    }
                }
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f140246c.findViewById(R.id.complete_checkbox_lottie);
                Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "view.complete_checkbox_lottie");
                lottieAnimationView.setVisibility(0);
                ImageView imageView = (ImageView) this.f140246c.findViewById(R.id.complete_checkbox);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "view.complete_checkbox");
                imageView.setVisibility(8);
                if (this.f140245b.mo193171h()) {
                    ((LottieAnimationView) this.f140246c.findViewById(R.id.complete_checkbox_lottie)).setAnimation(R.raw.todo_item_undone);
                } else {
                    ((LottieAnimationView) this.f140246c.findViewById(R.id.complete_checkbox_lottie)).setAnimation(R.raw.todo_item_done);
                }
                ImageView imageView2 = (ImageView) this.f140246c.findViewById(R.id.complete_checkbox);
                if (this.f140245b.mo193171h()) {
                    drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_uncheck);
                } else {
                    drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_checked);
                }
                imageView2.setImageDrawable(drawable);
                ((LottieAnimationView) this.f140246c.findViewById(R.id.complete_checkbox_lottie)).playAnimation();
                UICallbackExecutor.executeDelayed(new Runnable(this) {
                    /* class com.ss.android.lark.todo.impl.features.mainview.adapter.TodoItemViewHolder.View$OnClickListenerC56801g.RunnableC568021 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC56801g f140247a;

                    {
                        this.f140247a = r1;
                    }

                    public final void run() {
                        this.f140247a.f140244a.setCompleted(this.f140247a.f140245b);
                        ImageView imageView = (ImageView) this.f140247a.f140246c.findViewById(R.id.complete_checkbox);
                        Intrinsics.checkExpressionValueIsNotNull(imageView, "view.complete_checkbox");
                        imageView.setVisibility(0);
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f140247a.f140246c.findViewById(R.id.complete_checkbox_lottie);
                        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "view.complete_checkbox_lottie");
                        lottieAnimationView.setVisibility(8);
                        ((LottieAnimationView) this.f140247a.f140246c.findViewById(R.id.complete_checkbox_lottie)).cancelAnimation();
                    }
                }, 450);
            }
        }
    }

    /* renamed from: a */
    private final List<TodoAssignee> m220709a(List<TodoAssignee> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (T t : list) {
                if (t.completed_milli_time.longValue() <= 0) {
                    arrayList.add(t);
                }
            }
        }
        if (list != null) {
            for (T t2 : list) {
                if (t2.completed_milli_time.longValue() > 0) {
                    arrayList.add(t2);
                }
            }
        }
        Iterator<TodoAssignee> it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().assignee_id, this.f140231c)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.add(0, arrayList.remove(i));
        }
        if (arrayList.size() > 4) {
            arrayList = arrayList.subList(0, 4);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return new ArrayList();
    }

    public /* synthetic */ TodoItemViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/adapter/TodoItemViewHolder$bindView$2$2", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter$ItemClickListener;", "onItemClick", "", "view", "Landroid/view/View;", "bean", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarBean;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.a$e */
    public static final class C56799e implements AssigneeAvatarAdapter.ItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoItemViewHolder f140239a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f140240b;

        /* renamed from: c */
        final /* synthetic */ TodoMainViewModel f140241c;

        @Override // com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarAdapter.ItemClickListener
        /* renamed from: a */
        public void mo191810a(View view, AssigneeAvatarBean bVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(bVar, "bean");
            this.f140241c.openTodo(this.f140240b);
        }

        C56799e(TodoItemViewHolder aVar, TodoDisplayItem todoDisplayItem, TodoMainViewModel fVar) {
            this.f140239a = aVar;
            this.f140240b = todoDisplayItem;
            this.f140241c = fVar;
        }
    }

    /* renamed from: a */
    public final void mo193104a(Drawable drawable, boolean z) {
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        LinearLayout linearLayout = (LinearLayout) this.f140234f.findViewById(R.id.content_container_view);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.content_container_view");
        linearLayout.setBackground(drawable);
        this.f140233e = z;
    }

    /* renamed from: a */
    public final void mo193105a(RichContent richContent, int i) {
        int sp2px = (int) UIHelper.sp2px(20.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C59035h.m229203a(C56478e.m220168a(richContent), false, false, true, false, i));
        EmojiHandler.m226947a(UIHelper.getContext(), spannableStringBuilder, sp2px, 1, (int) UIHelper.sp2px(16.0f));
        ((LKUILightTextView) this.f140234f.findViewById(R.id.title_rich_text)).setContentText(spannableStringBuilder);
    }

    /* renamed from: a */
    private final void m220710a(View view, TodoDisplayItem todoDisplayItem) {
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
                if (todoDisplayItem.mo193191z() && todoDisplayItem.mo193190y()) {
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                    marginLayoutParams2.setMargins(f140229i, 0, 0, f140228h);
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.content_container_view);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.content_container_view");
                    linearLayout.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_round));
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.behind_delete_view);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.behind_delete_view");
                    relativeLayout.setBackground(ResUtil.f139261a.mo191782d(R.drawable.todo_bg_list_backend_red_right_radius));
                    View findViewById2 = view.findViewById(R.id.divider_todo_item);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.divider_todo_item");
                    findViewById2.setVisibility(4);
                } else if (todoDisplayItem.mo193191z()) {
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                    marginLayoutParams2.setMargins(f140229i, 0, 0, 0);
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
                    if (todoDisplayItem.mo193190y()) {
                        marginLayoutParams.setMargins(0, 0, 0, 0);
                        marginLayoutParams2.setMargins(f140229i, 0, 0, f140228h);
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
                        if (todoDisplayItem.mo193155A()) {
                            marginLayoutParams.setMargins(0, 0, 0, f140227g);
                            marginLayoutParams2.setMargins(f140229i, 0, 0, f140228h);
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
                            marginLayoutParams2.setMargins(f140229i, 0, 0, 0);
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

    /* renamed from: e */
    private final void m220716e(View view, TodoDisplayItem todoDisplayItem, TodoMainViewModel fVar) {
        ((RelativeLayout) view.findViewById(R.id.complete_checkbox_container)).setOnClickListener(new View$OnClickListenerC56801g(fVar, todoDisplayItem, view));
    }

    /* renamed from: d */
    private final void m220715d(View view, TodoDisplayItem todoDisplayItem, TodoMainViewModel fVar) {
        Drawable drawable;
        ImageView imageView = (ImageView) view.findViewById(R.id.complete_checkbox);
        if (todoDisplayItem.mo193171h()) {
            if (todoDisplayItem.mo193177m()) {
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
        } else if (!todoDisplayItem.mo193177m()) {
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

    /* renamed from: b */
    private final void m220713b(View view, TodoDisplayItem todoDisplayItem, TodoMainViewModel fVar) {
        int i;
        if (todoDisplayItem.mo193182r() == TodoDisplayItem.TitleType.DONE || todoDisplayItem.mo193182r() == TodoDisplayItem.TitleType.DOING || todoDisplayItem.mo193182r() == TodoDisplayItem.TitleType.COMPLETED) {
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
        textView3.setText(String.valueOf(todoDisplayItem.mo193187v()));
        if (fVar.getCurrentFilter() != TodoFilterType.ALL || ((todoDisplayItem.mo193182r() != TodoDisplayItem.TitleType.OVER_DUE || !fVar.isShowBadgeOverdue()) && (todoDisplayItem.mo193182r() != TodoDisplayItem.TitleType.TODAY || !fVar.isShowBadgeToday()))) {
            LKUIBadgeView lKUIBadgeView2 = (LKUIBadgeView) view.findViewById(R.id.list_icon_count_red_badge);
            Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView2, "view.list_icon_count_red_badge");
            lKUIBadgeView2.setVisibility(8);
            return;
        }
        int v = todoDisplayItem.mo193187v();
        int w = todoDisplayItem.mo193188w();
        if (w <= 0) {
            LKUIBadgeView lKUIBadgeView3 = (LKUIBadgeView) view.findViewById(R.id.list_icon_count_red_badge);
            Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView3, "view.list_icon_count_red_badge");
            lKUIBadgeView3.setVisibility(8);
            return;
        }
        if (v == w) {
            TextView textView4 = (TextView) view.findViewById(R.id.list_icon_count_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "view.list_icon_count_tv");
            textView4.setVisibility(8);
        }
        LKUIBadgeView lKUIBadgeView4 = (LKUIBadgeView) view.findViewById(R.id.list_icon_count_red_badge);
        Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView4, "view.list_icon_count_red_badge");
        lKUIBadgeView4.setVisibility(0);
        if (w < 10) {
            i = R.drawable.badge_orange_single_count_bg_no_stroke;
        } else if (w < 999) {
            i = R.drawable.badge_orange_multi_count_bg_no_stroke;
        } else {
            i = R.drawable.badge_orange_bg_etc_count;
        }
        ((LKUIBadgeView) view.findViewById(R.id.list_icon_count_red_badge)).mo89321b(1.0f).mo89319a(String.valueOf(w)).mo89322b(i).mo89320a();
    }

    /* renamed from: c */
    private final void m220714c(View view, TodoDisplayItem todoDisplayItem, TodoMainViewModel fVar) {
        int i;
        ResUtil eVar = ResUtil.f139261a;
        if (todoDisplayItem.mo193171h()) {
            i = R.color.text_caption;
        } else {
            i = R.color.text_title;
        }
        int a = eVar.mo191775a(i);
        int sp2px = (int) UIHelper.sp2px(16.0f);
        view.findViewById(R.id.item_finish_line).setBackgroundColor(a);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C59035h.m229203a(todoDisplayItem.mo193169f(), false, false, true, false, a));
        EmojiHandler.m226947a(UIHelper.getContext(), spannableStringBuilder, (int) UIHelper.sp2px(20.0f), 1, sp2px);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setMaxLines(1);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setEllipsize(TextUtils.TruncateAt.END);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setTextColor(a);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setTextSize(sp2px);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setContentText(spannableStringBuilder);
        if (UrlPreviewLoader.f139388a.mo191968a(todoDisplayItem.mo193170g())) {
            UrlPreviewLoader aVar = UrlPreviewLoader.f139388a;
            RichContent a2 = aVar.mo191964a(todoDisplayItem.mo193167e() + spannableStringBuilder.toString());
            if (a2 == null) {
                Job unused = C69553g.m266944a(C1143ag.m5356a(fVar), null, null, new C56798d(this, view, todoDisplayItem, spannableStringBuilder, a, null), 3, null);
            } else {
                mo193105a(a2, a);
            }
        }
    }

    /* renamed from: a */
    private final void m220711a(View view, TodoDisplayItem todoDisplayItem, TodoMainViewModel fVar) {
        int i;
        boolean z;
        ((LinearLayout) view.findViewById(R.id.content_container_view)).setOnClickListener(new ListItemClickListener(new C56800f(fVar, todoDisplayItem)));
        View findViewById = view.findViewById(R.id.item_finish_line);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.item_finish_line");
        findViewById.setVisibility(todoDisplayItem.mo193165d());
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.attendee_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.attendee_container");
        linearLayout.setVisibility(todoDisplayItem.mo193161b());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.assignee_avatar_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "view.assignee_avatar_list");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            AssigneeAvatarAdapter aVar = (AssigneeAvatarAdapter) adapter;
            boolean z2 = true;
            if (aVar != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : m220709a(todoDisplayItem.mo193156B())) {
                    String str = t.assignee_id;
                    Intrinsics.checkExpressionValueIsNotNull(str, "it.assignee_id");
                    String str2 = t.avatar_key;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.avatar_key");
                    if (t.completed_milli_time.longValue() <= 0 || !MultiCompleteHelper.f139390a.mo191984a(todoDisplayItem.mo193189x())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    arrayList.add(new AssigneeAvatarBean(str, str2, z));
                }
                aVar.mo192537a(arrayList);
                aVar.mo192536a(new C56799e(this, todoDisplayItem, fVar));
            }
            List<TodoAssignee> B = todoDisplayItem.mo193156B();
            if (B != null) {
                i = B.size();
            } else {
                i = 0;
            }
            TextView textView = (TextView) view.findViewById(R.id.assignee_avatar_count);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.assignee_avatar_count");
            TextView textView2 = textView;
            int i2 = i - 4;
            if (i2 <= 0) {
                z2 = false;
            }
            C25877a.m93659a(textView2, z2);
            if (i > 4) {
                TextView textView3 = (TextView) view.findViewById(R.id.assignee_avatar_count);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "view.assignee_avatar_count");
                textView3.setText("+" + i2);
            }
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.ll_end_time_first);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "view.ll_end_time_first");
            linearLayout2.setVisibility(todoDisplayItem.mo193163c());
            if (todoDisplayItem.mo193171h()) {
                Context context = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                ((ImageView) view.findViewById(R.id.img_end_time_first)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_calendar_done_outlined, todoDisplayItem.mo193174j()));
            } else {
                Context context2 = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
                ((ImageView) view.findViewById(R.id.img_end_time_first)).setImageDrawable(UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_calendar_outlined, todoDisplayItem.mo193174j()));
            }
            TextView textView4 = (TextView) view.findViewById(R.id.tv_end_time_first);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "view.tv_end_time_first");
            textView4.setText(todoDisplayItem.mo193173i());
            ((TextView) view.findViewById(R.id.tv_end_time_first)).setTextColor(todoDisplayItem.mo193174j());
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.ll_end_time);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "view.ll_end_time");
            linearLayout3.setVisibility(todoDisplayItem.mo193163c());
            if (todoDisplayItem.mo193171h()) {
                Context context3 = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "view.context");
                ((ImageView) view.findViewById(R.id.img_end_time)).setImageDrawable(UDIconUtils.getIconDrawable(context3, (int) R.drawable.ud_icon_calendar_done_outlined, todoDisplayItem.mo193174j()));
            } else {
                Context context4 = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "view.context");
                ((ImageView) view.findViewById(R.id.img_end_time)).setImageDrawable(UDIconUtils.getIconDrawable(context4, (int) R.drawable.ud_icon_calendar_outlined, todoDisplayItem.mo193174j()));
            }
            TextView textView5 = (TextView) view.findViewById(R.id.tv_end_time);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "view.tv_end_time");
            textView5.setText(todoDisplayItem.mo193173i());
            ((TextView) view.findViewById(R.id.tv_end_time)).setTextColor(todoDisplayItem.mo193174j());
            LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.attendee_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "view.attendee_container");
            if (linearLayout4.getVisibility() == 8 || todoDisplayItem.mo193157C()) {
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
    private final void m220712a(View view, TodoDisplayItem todoDisplayItem, TodoMainViewModel fVar, OnItemClickListener cVar) {
        String str;
        int i;
        TextView textView = (TextView) view.findViewById(R.id.behind_delete_view_text);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.behind_delete_view_text");
        int i2 = C56804b.f140251a[todoDisplayItem.mo193179o().ordinal()];
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
        int i3 = C56804b.f140252b[todoDisplayItem.mo193179o().ordinal()];
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
        ((RelativeLayout) view.findViewById(R.id.behind_delete_view)).setOnClickListener(new View$OnClickListenerC56803h(todoDisplayItem, cVar, fVar));
    }
}
