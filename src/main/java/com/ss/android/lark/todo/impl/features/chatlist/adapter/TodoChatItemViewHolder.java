package com.ss.android.lark.todo.impl.features.chatlist.adapter;

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
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.larksuite.component.blockit.hashtag.widget.SwipeLayout;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency;
import com.ss.android.lark.todo.impl.features.chatlist.adapter.TodoChatListAdapter;
import com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarAdapter;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarBean;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoChatItem;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import com.ss.android.lark.todo.impl.features.mainview.listener.ListItemClickListener;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.LKUILightTextView;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import com.ss.android.lark.widget.richtext.C59035h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "onTitleClickListener", "Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$ITitleClickListener;", "getOnTitleClickListener", "()Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$ITitleClickListener;", "setOnTitleClickListener", "(Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$ITitleClickListener;)V", "operationUserId", "", "bind", "", "viewModel", "Lcom/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListViewModel;", "item", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "bindBackground", "bindCompleteCheckBox", "bindMsgView", "bindTitleText", "bindView", "getShowAssignees", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "assignees", "getSwipeLayout", "Lcom/larksuite/component/blockit/hashtag/widget/SwipeLayout;", "initAnimation", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.a */
public final class TodoChatItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final Companion f139281a = new Companion(null);

    /* renamed from: e */
    private static final int f139282e = C57582a.m223600a(16);

    /* renamed from: f */
    private static final int f139283f = C57582a.m223600a(6);

    /* renamed from: g */
    private static final int f139284g = C57582a.m223600a(44);

    /* renamed from: h */
    private static final int f139285h = C57582a.m223600a(70);

    /* renamed from: b */
    private TodoChatListAdapter.ITitleClickListener f139286b;

    /* renamed from: c */
    private final String f139287c;

    /* renamed from: d */
    private final View f139288d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatItemViewHolder$Companion;", "", "()V", "ANIMATION_DURATION", "", "ASSIGNEE_AVATAR_WIDTH", "", "ASSIGNEE_DISTANCE", "CHAT_ITEM_MIN_HEIGHT", "", "CONTAINER_MARGIN_PARENT_TOP", "DIVIDER_MARGIN_BOTTOM_LAST", "DIVIDER_MARGIN_LEFT", "from", "Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TodoChatItemViewHolder mo191807a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.todo_chat_item_bg, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.assignee_avatar_list);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "view.assignee_avatar_list");
            Context context = inflate.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            AssigneeAvatarAdapter aVar = new AssigneeAvatarAdapter(context);
            aVar.mo192535a(UIUtils.dp2px(inflate.getContext(), 5.0f));
            aVar.mo192538b(UIUtils.dp2px(inflate.getContext(), 20.0f));
            recyclerView.setAdapter(aVar);
            return new TodoChatItemViewHolder(inflate, null);
        }
    }

    /* renamed from: a */
    public final TodoChatListAdapter.ITitleClickListener mo191803a() {
        return this.f139286b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatItemViewHolder$bindView$1", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/ListItemClickListener$IListItemClickListener;", "onListItemClicked", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.a$e */
    public static final class C56276e implements ListItemClickListener.IListItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDisplayItem f139296a;

        /* renamed from: b */
        final /* synthetic */ TodoChatListViewModel f139297b;

        /* renamed from: c */
        final /* synthetic */ View f139298c;

        @Override // com.ss.android.lark.todo.impl.features.mainview.listener.ListItemClickListener.IListItemClickListener
        /* renamed from: a */
        public void mo191811a() {
            String str;
            TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
            String e = this.f139296a.mo193167e();
            TodoChatItem p = this.f139296a.mo193180p();
            if (p == null || (str = p.mo193200c()) == null) {
                str = "";
            }
            aVar.mo194176a(e, str);
            TodoChatListViewModel todoChatListViewModel = this.f139297b;
            Context context = this.f139298c.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            todoChatListViewModel.openTodo(context, this.f139296a);
        }

        C56276e(TodoDisplayItem todoDisplayItem, TodoChatListViewModel todoChatListViewModel, View view) {
            this.f139296a = todoDisplayItem;
            this.f139297b = todoChatListViewModel;
            this.f139298c = view;
        }
    }

    /* renamed from: b */
    public final SwipeLayout mo191806b() {
        SwipeLayout swipeLayout = (SwipeLayout) this.f139288d.findViewById(R.id.swipeLayout);
        Intrinsics.checkExpressionValueIsNotNull(swipeLayout, "view.swipeLayout");
        return swipeLayout;
    }

    /* renamed from: a */
    public final void mo191804a(TodoChatListAdapter.ITitleClickListener cVar) {
        this.f139286b = cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.a$b */
    public static final class View$OnClickListenerC56273b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoChatItemViewHolder f139289a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f139290b;

        View$OnClickListenerC56273b(TodoChatItemViewHolder aVar, TodoDisplayItem todoDisplayItem) {
            this.f139289a = aVar;
            this.f139290b = todoDisplayItem;
        }

        public final void onClick(View view) {
            TodoChatListAdapter.ITitleClickListener a = this.f139289a.mo191803a();
            if (a != null) {
                a.mo191823a(this.f139290b.mo193183s());
            }
        }
    }

    private TodoChatItemViewHolder(View view) {
        super(view);
        this.f139288d = view;
        this.f139287c = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.assignee_avatar_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "view.assignee_avatar_list");
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setShouldLayoutZeroLengthText(true);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.a$c */
    public static final class View$OnClickListenerC56274c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDisplayItem f139291a;

        /* renamed from: b */
        final /* synthetic */ View f139292b;

        View$OnClickListenerC56274c(TodoDisplayItem todoDisplayItem, View view) {
            this.f139291a = todoDisplayItem;
            this.f139292b = view;
        }

        public final void onClick(View view) {
            String str;
            TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
            String e = this.f139291a.mo193167e();
            TodoChatItem p = this.f139291a.mo193180p();
            if (p == null || (str = p.mo193200c()) == null) {
                str = "";
            }
            aVar.mo194186b(e, str);
            TodoChatItem p2 = this.f139291a.mo193180p();
            if (p2 == null) {
                return;
            }
            if (!p2.mo193201d()) {
                IChatModuleDependency chatModuleDependency = TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency();
                Context context = this.f139292b.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                chatModuleDependency.mo145375a(context, p2.mo193200c(), p2.mo193202e());
                return;
            }
            IChatModuleDependency chatModuleDependency2 = TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency();
            Context context2 = this.f139292b.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
            chatModuleDependency2.mo145381b(context2, p2.mo193200c(), p2.mo193202e());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.a$f */
    public static final class View$OnClickListenerC56277f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoChatListViewModel f139299a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f139300b;

        /* renamed from: c */
        final /* synthetic */ View f139301c;

        View$OnClickListenerC56277f(TodoChatListViewModel todoChatListViewModel, TodoDisplayItem todoDisplayItem, View view) {
            this.f139299a = todoChatListViewModel;
            this.f139300b = todoDisplayItem;
            this.f139301c = view;
        }

        public final void onClick(View view) {
            Drawable drawable;
            TodoChatListViewModel todoChatListViewModel = this.f139299a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            if (!todoChatListViewModel.isInCustomCompleteStrategy(context, this.f139300b.mo193176l())) {
                if (MultiCompleteHelper.f139390a.mo191984a(this.f139300b.mo193189x())) {
                    if (CollectionsKt.listOf((Object[]) new MultiCompleteHelper.MultiCompleteType[]{MultiCompleteHelper.MultiCompleteType.NOT_COMPLETE, MultiCompleteHelper.MultiCompleteType.COMPLETE_TODO_WITH_DIALOG}).contains(this.f139300b.mo193175k())) {
                        this.f139299a.setCompleted(this.f139300b);
                        return;
                    }
                }
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f139301c.findViewById(R.id.complete_checkbox_lottie);
                Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "view.complete_checkbox_lottie");
                lottieAnimationView.setVisibility(0);
                ImageView imageView = (ImageView) this.f139301c.findViewById(R.id.complete_checkbox);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "view.complete_checkbox");
                imageView.setVisibility(8);
                if (this.f139300b.mo193171h()) {
                    ((LottieAnimationView) this.f139301c.findViewById(R.id.complete_checkbox_lottie)).setAnimation(R.raw.todo_item_undone);
                } else {
                    ((LottieAnimationView) this.f139301c.findViewById(R.id.complete_checkbox_lottie)).setAnimation(R.raw.todo_item_done);
                }
                ImageView imageView2 = (ImageView) this.f139301c.findViewById(R.id.complete_checkbox);
                if (this.f139300b.mo193171h()) {
                    drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_uncheck);
                } else {
                    drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_checked);
                }
                imageView2.setImageDrawable(drawable);
                ((LottieAnimationView) this.f139301c.findViewById(R.id.complete_checkbox_lottie)).playAnimation();
                UICallbackExecutor.executeDelayed(new Runnable(this) {
                    /* class com.ss.android.lark.todo.impl.features.chatlist.adapter.TodoChatItemViewHolder.View$OnClickListenerC56277f.RunnableC562781 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC56277f f139302a;

                    {
                        this.f139302a = r1;
                    }

                    public final void run() {
                        this.f139302a.f139299a.setCompleted(this.f139302a.f139300b);
                        ImageView imageView = (ImageView) this.f139302a.f139301c.findViewById(R.id.complete_checkbox);
                        Intrinsics.checkExpressionValueIsNotNull(imageView, "view.complete_checkbox");
                        imageView.setVisibility(0);
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f139302a.f139301c.findViewById(R.id.complete_checkbox_lottie);
                        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "view.complete_checkbox_lottie");
                        lottieAnimationView.setVisibility(8);
                        ((LottieAnimationView) this.f139302a.f139301c.findViewById(R.id.complete_checkbox_lottie)).cancelAnimation();
                    }
                }, 450);
            }
        }
    }

    /* renamed from: a */
    private final List<TodoAssignee> m219639a(List<TodoAssignee> list) {
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
            } else if (Intrinsics.areEqual(it.next().assignee_id, this.f139287c)) {
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

    public /* synthetic */ TodoChatItemViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatItemViewHolder$bindView$2$2", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter$ItemClickListener;", "onItemClick", "", "view", "Landroid/view/View;", "bean", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarBean;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.a$d */
    public static final class C56275d implements AssigneeAvatarAdapter.ItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoChatItemViewHolder f139293a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f139294b;

        /* renamed from: c */
        final /* synthetic */ TodoChatListViewModel f139295c;

        @Override // com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarAdapter.ItemClickListener
        /* renamed from: a */
        public void mo191810a(View view, AssigneeAvatarBean bVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(bVar, "bean");
            TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
            String e = this.f139294b.mo193167e();
            TodoChatItem p = this.f139294b.mo193180p();
            if (p == null || (str = p.mo193200c()) == null) {
                str = "";
            }
            aVar.mo194176a(e, str);
            TodoChatListViewModel todoChatListViewModel = this.f139295c;
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            todoChatListViewModel.openTodo(context, this.f139294b);
        }

        C56275d(TodoChatItemViewHolder aVar, TodoDisplayItem todoDisplayItem, TodoChatListViewModel todoChatListViewModel) {
            this.f139293a = aVar;
            this.f139294b = todoDisplayItem;
            this.f139295c = todoChatListViewModel;
        }
    }

    /* renamed from: c */
    private final void m219644c(View view, TodoDisplayItem todoDisplayItem) {
        int i;
        ResUtil eVar = ResUtil.f139261a;
        if (todoDisplayItem.mo193171h()) {
            i = R.color.text_caption;
        } else {
            i = R.color.text_title;
        }
        int a = eVar.mo191775a(i);
        int sp2px = (int) UIHelper.sp2px(16.0f);
        int sp2px2 = (int) UIHelper.sp2px(20.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C59035h.m229203a(todoDisplayItem.mo193169f(), false, false, true, false, a));
        EmojiHandler.m226947a(UIHelper.getContext(), spannableStringBuilder, sp2px2, 1, sp2px);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setMaxLines(1);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setEllipsize(TextUtils.TruncateAt.END);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setTextColor(a);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setTextSize(sp2px);
        ((LKUILightTextView) view.findViewById(R.id.title_rich_text)).setContentText(spannableStringBuilder);
    }

    /* renamed from: d */
    private final void m219645d(View view, TodoDisplayItem todoDisplayItem) {
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
    private final void m219642b(View view, TodoDisplayItem todoDisplayItem) {
        String str;
        TodoChatItem p = todoDisplayItem.mo193180p();
        if (p == null || p.mo193198a()) {
            View findViewById = view.findViewById(R.id.ll_message_divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.ll_message_divider");
            findViewById.setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_message_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.ll_message_container");
            linearLayout.setVisibility(0);
            TextView textView = (TextView) view.findViewById(R.id.tv_message_info);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_message_info");
            TodoChatItem p2 = todoDisplayItem.mo193180p();
            if (p2 == null || (str = p2.mo193199b()) == null) {
                str = "";
            }
            textView.setText(str);
            ((LinearLayout) view.findViewById(R.id.ll_message_container)).setOnClickListener(new View$OnClickListenerC56274c(todoDisplayItem, view));
            return;
        }
        View findViewById2 = view.findViewById(R.id.ll_message_divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.ll_message_divider");
        findViewById2.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.ll_message_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "view.ll_message_container");
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.ll_todo_content_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "view.ll_todo_content_container");
        int height = linearLayout3.getHeight();
        int i = f139285h;
        if (height < i) {
            LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.ll_todo_content_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "view.ll_todo_content_container");
            ViewGroup.LayoutParams layoutParams = linearLayout4.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.height = i;
                LinearLayout linearLayout5 = (LinearLayout) view.findViewById(R.id.ll_todo_content_container);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "view.ll_todo_content_container");
                linearLayout5.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    /* renamed from: a */
    private final void m219640a(View view, TodoDisplayItem todoDisplayItem) {
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
                    marginLayoutParams.setMargins(0, f139282e, 0, 0);
                    marginLayoutParams2.setMargins(f139284g, 0, 0, f139283f);
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.content_container_view);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.content_container_view");
                    linearLayout.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_round));
                    View findViewById2 = view.findViewById(R.id.divider_todo_item);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.divider_todo_item");
                    findViewById2.setVisibility(4);
                } else if (todoDisplayItem.mo193191z()) {
                    marginLayoutParams.setMargins(0, f139282e, 0, 0);
                    marginLayoutParams2.setMargins(f139284g, 0, 0, 0);
                    LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.content_container_view);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "view.content_container_view");
                    linearLayout2.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_round_top));
                    View findViewById3 = view.findViewById(R.id.divider_todo_item);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.divider_todo_item");
                    findViewById3.setVisibility(0);
                } else if (todoDisplayItem.mo193190y()) {
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                    marginLayoutParams2.setMargins(f139284g, 0, 0, f139283f);
                    LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.content_container_view);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "view.content_container_view");
                    linearLayout3.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_round_bottom));
                    View findViewById4 = view.findViewById(R.id.divider_todo_item);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.divider_todo_item");
                    findViewById4.setVisibility(4);
                } else {
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                    if (todoDisplayItem.mo193155A()) {
                        marginLayoutParams2.setMargins(f139284g, 0, 0, f139283f);
                        LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.content_container_view);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "view.content_container_view");
                        linearLayout4.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_round_bottom));
                        View findViewById5 = view.findViewById(R.id.divider_todo_item);
                        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "view.divider_todo_item");
                        findViewById5.setVisibility(4);
                    } else {
                        marginLayoutParams2.setMargins(f139284g, 0, 0, 0);
                        LinearLayout linearLayout5 = (LinearLayout) view.findViewById(R.id.content_container_view);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "view.content_container_view");
                        linearLayout5.setBackground(ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_rectangle));
                        View findViewById6 = view.findViewById(R.id.divider_todo_item);
                        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.divider_todo_item");
                        findViewById6.setVisibility(0);
                    }
                }
                SwipeLayout swipeLayout2 = (SwipeLayout) view.findViewById(R.id.swipeLayout);
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

    /* renamed from: a */
    public final void mo191805a(TodoChatListViewModel todoChatListViewModel, TodoDisplayItem todoDisplayItem) {
        int i;
        int i2;
        int i3;
        String str;
        Intrinsics.checkParameterIsNotNull(todoChatListViewModel, "viewModel");
        Intrinsics.checkParameterIsNotNull(todoDisplayItem, "item");
        if (todoDisplayItem.mo193181q()) {
            LinearLayout linearLayout = (LinearLayout) this.f139288d.findViewById(R.id.content_title_view);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.content_title_view");
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = (LinearLayout) this.f139288d.findViewById(R.id.content_title_view);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "view.content_title_view");
            ResUtil eVar = ResUtil.f139261a;
            if (todoDisplayItem.mo193184t()) {
                i2 = R.drawable.todo_main_fragment_title_bg_round_top;
            } else {
                i2 = R.drawable.todo_main_fragment_title_bg_round;
            }
            linearLayout2.setBackground(eVar.mo191782d(i2));
            LinearLayout linearLayout3 = (LinearLayout) this.f139288d.findViewById(R.id.content_container_view);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "view.content_container_view");
            linearLayout3.setVisibility(8);
            if (todoDisplayItem.mo193184t()) {
                i3 = R.drawable.ud_icon_expand_down_filled;
            } else {
                i3 = R.drawable.ud_icon_expand_right_filled;
            }
            Context context = this.f139288d.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            ((ImageView) this.f139288d.findViewById(R.id.list_icon_img)).setImageDrawable(UDIconUtils.getIconDrawable(context, i3, UIUtils.getColor(this.f139288d.getContext(), R.color.icon_n2)));
            TextView textView = (TextView) this.f139288d.findViewById(R.id.list_icon_title_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.list_icon_title_tv");
            textView.setText(todoDisplayItem.mo193186u());
            TextView textView2 = (TextView) this.f139288d.findViewById(R.id.list_icon_count_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "view.list_icon_count_tv");
            if (todoDisplayItem.mo193183s() == TodoDisplayItem.ChatListTitleType.COMPLETED) {
                str = "";
            } else {
                str = String.valueOf(todoDisplayItem.mo193187v());
            }
            textView2.setText(str);
            ((LinearLayout) this.f139288d.findViewById(R.id.content_title_view)).setOnClickListener(new View$OnClickListenerC56273b(this, todoDisplayItem));
            return;
        }
        LinearLayout linearLayout4 = (LinearLayout) this.f139288d.findViewById(R.id.content_title_view);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "view.content_title_view");
        linearLayout4.setVisibility(8);
        LinearLayout linearLayout5 = (LinearLayout) this.f139288d.findViewById(R.id.content_container_view);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "view.content_container_view");
        linearLayout5.setVisibility(0);
        m219640a(this.f139288d, todoDisplayItem);
        RelativeLayout relativeLayout = (RelativeLayout) this.f139288d.findViewById(R.id.complete_checkbox_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.complete_checkbox_container");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (todoDisplayItem.mo193160a()) {
                i = 16;
            } else {
                i = 48;
            }
            layoutParams2.gravity = i;
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f139288d.findViewById(R.id.complete_checkbox_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "view.complete_checkbox_container");
            relativeLayout2.setLayoutParams(layoutParams2);
            m219641a(this.f139288d, todoDisplayItem, todoChatListViewModel);
            m219645d(this.f139288d, todoDisplayItem);
            m219644c(this.f139288d, todoDisplayItem);
            m219643b(this.f139288d, todoDisplayItem, todoChatListViewModel);
            m219642b(this.f139288d, todoDisplayItem);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: b */
    private final void m219643b(View view, TodoDisplayItem todoDisplayItem, TodoChatListViewModel todoChatListViewModel) {
        ((RelativeLayout) view.findViewById(R.id.complete_checkbox_container)).setOnClickListener(new View$OnClickListenerC56277f(todoChatListViewModel, todoDisplayItem, view));
    }

    /* renamed from: a */
    private final void m219641a(View view, TodoDisplayItem todoDisplayItem, TodoChatListViewModel todoChatListViewModel) {
        int i;
        boolean z;
        ((LinearLayout) view.findViewById(R.id.content_container_view)).setOnClickListener(new ListItemClickListener(new C56276e(todoDisplayItem, todoChatListViewModel, view)));
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
                for (T t : m219639a(todoDisplayItem.mo193156B())) {
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
                aVar.mo192536a(new C56275d(this, todoDisplayItem, todoChatListViewModel));
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
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            ((ImageView) view.findViewById(R.id.img_end_time_first)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_calendar_outlined, todoDisplayItem.mo193174j()));
            TextView textView4 = (TextView) view.findViewById(R.id.tv_end_time_first);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "view.tv_end_time_first");
            textView4.setText(todoDisplayItem.mo193173i());
            ((TextView) view.findViewById(R.id.tv_end_time_first)).setTextColor(todoDisplayItem.mo193174j());
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.ll_end_time);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "view.ll_end_time");
            linearLayout3.setVisibility(todoDisplayItem.mo193163c());
            Context context2 = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
            ((ImageView) view.findViewById(R.id.img_end_time)).setImageDrawable(UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_calendar_outlined, todoDisplayItem.mo193174j()));
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
}
