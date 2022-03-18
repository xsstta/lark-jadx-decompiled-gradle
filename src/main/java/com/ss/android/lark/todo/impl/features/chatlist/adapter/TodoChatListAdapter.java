package com.ss.android.lark.todo.impl.features.chatlist.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.blockit.hashtag.widget.SwipeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel;
import com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.PinnedHeaderAdapter;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003#$%B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J\u0016\u0010 \u001a\u00020\u00102\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\"R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter;", "Lcom/ss/android/lark/todo/impl/features/mainview/adapter/pinned/PinnedHeaderAdapter;", "Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatItemViewHolder;", "viewModel", "Lcom/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListViewModel;", "(Lcom/ss/android/lark/todo/impl/features/chatlist/mvvm/TodoChatListViewModel;)V", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "operationListener", "Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$ITitleOperationListener;", "getOperationListener$todo_release", "()Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$ITitleOperationListener;", "setOperationListener$todo_release", "(Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$ITitleOperationListener;)V", "clickTitleBar", "", "firstVisiblePos", "", "getItemCount", "getPinnedHeaderViewPosition", "getSwipeLayoutResourceId", "position", "isPinnedPosition", "", "isPositionInvalid", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "resetAll", "newList", "", "Companion", "ITitleClickListener", "ITitleOperationListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.b */
public final class TodoChatListAdapter extends PinnedHeaderAdapter<TodoChatItemViewHolder> {

    /* renamed from: a */
    public static final Companion f139303a = new Companion(null);

    /* renamed from: f */
    private static final C1374g.AbstractC1378c<TodoDisplayItem> f139304f = new C56279b();

    /* renamed from: c */
    private ITitleOperationListener f139305c;

    /* renamed from: d */
    private final C1356d<TodoDisplayItem> f139306d = new C1356d<>(this, f139304f);

    /* renamed from: e */
    private final TodoChatListViewModel f139307e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$ITitleClickListener;", "", "onTitleClicked", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChatListTitleType;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.b$c */
    public interface ITitleClickListener {
        /* renamed from: a */
        void mo191823a(TodoDisplayItem.ChatListTitleType chatListTitleType);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$ITitleOperationListener;", "", "onTitleStateChanged", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChatListTitleType;", "isExpand", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.b$d */
    public interface ITitleOperationListener {
        /* renamed from: a */
        void mo191824a(TodoDisplayItem.ChatListTitleType chatListTitleType, boolean z);
    }

    @Override // com.larksuite.component.blockit.hashtag.widget.AbstractC24126c
    /* renamed from: a */
    public int mo86534a(int i) {
        return R.id.swipeLayout;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$Companion$DIFF_CALLBACK$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.b$b */
    public static final class C56279b extends C1374g.AbstractC1378c<TodoDisplayItem> {
        C56279b() {
        }

        /* renamed from: b */
        public boolean areContentsTheSame(TodoDisplayItem todoDisplayItem, TodoDisplayItem todoDisplayItem2) {
            Intrinsics.checkParameterIsNotNull(todoDisplayItem, "oldItem");
            Intrinsics.checkParameterIsNotNull(todoDisplayItem2, "newItem");
            return Intrinsics.areEqual(todoDisplayItem, todoDisplayItem2);
        }

        /* renamed from: a */
        public boolean areItemsTheSame(TodoDisplayItem todoDisplayItem, TodoDisplayItem todoDisplayItem2) {
            Intrinsics.checkParameterIsNotNull(todoDisplayItem, "oldItem");
            Intrinsics.checkParameterIsNotNull(todoDisplayItem2, "newItem");
            if (!todoDisplayItem.mo193181q() || !todoDisplayItem2.mo193181q()) {
                return Intrinsics.areEqual(todoDisplayItem.mo193167e(), todoDisplayItem2.mo193167e());
            }
            if (todoDisplayItem.mo193182r() == todoDisplayItem2.mo193182r()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    public final ITitleOperationListener mo191819c() {
        return this.f139305c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f139306d.mo7374a().size();
    }

    /* renamed from: a */
    public final void mo191816a(ITitleOperationListener dVar) {
        this.f139305c = dVar;
    }

    /* renamed from: d */
    private final int m219653d(int i) {
        while (i >= 0) {
            if (mo191818b(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* renamed from: e */
    private final boolean m219654e(int i) {
        if (i == -1 || i >= getItemCount()) {
            return true;
        }
        return false;
    }

    public TodoChatListAdapter(TodoChatListViewModel todoChatListViewModel) {
        Intrinsics.checkParameterIsNotNull(todoChatListViewModel, "viewModel");
        this.f139307e = todoChatListViewModel;
    }

    /* renamed from: a */
    public final void mo191817a(List<TodoDisplayItem> list) {
        this.f139306d.mo7376a(list);
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.PinnedHeaderAdapter
    /* renamed from: b */
    public boolean mo191818b(int i) {
        if (m219654e(i)) {
            return false;
        }
        return this.f139306d.mo7374a().get(i).mo193181q();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/todo/impl/features/chatlist/adapter/TodoChatListAdapter$ITitleClickListener;", "onTitleClicked", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChatListTitleType;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.a.b$e */
    public static final class C56280e implements ITitleClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoChatListAdapter f139308a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f139309b;

        @Override // com.ss.android.lark.todo.impl.features.chatlist.adapter.TodoChatListAdapter.ITitleClickListener
        /* renamed from: a */
        public void mo191823a(TodoDisplayItem.ChatListTitleType chatListTitleType) {
            ITitleOperationListener c;
            Intrinsics.checkParameterIsNotNull(chatListTitleType, "titleType");
            if (this.f139309b.mo193181q() && (c = this.f139308a.mo191819c()) != null) {
                c.mo191824a(chatListTitleType, !this.f139309b.mo193184t());
            }
        }

        C56280e(TodoChatListAdapter bVar, TodoDisplayItem todoDisplayItem) {
            this.f139308a = bVar;
            this.f139309b = todoDisplayItem;
        }
    }

    /* renamed from: c */
    public final void mo191820c(int i) {
        ITitleOperationListener dVar;
        if (i >= 0) {
            int d = m219653d(i);
            if (!m219654e(d)) {
                TodoDisplayItem todoDisplayItem = this.f139306d.mo7374a().get(d);
                if (todoDisplayItem.mo193181q() && (dVar = this.f139305c) != null) {
                    dVar.mo191824a(todoDisplayItem.mo193183s(), !todoDisplayItem.mo193184t());
                }
            }
        }
    }

    /* renamed from: a */
    public TodoChatItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return TodoChatItemViewHolder.f139281a.mo191807a(viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(TodoChatItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (!m219654e(i)) {
            TodoDisplayItem todoDisplayItem = this.f139306d.mo7374a().get(i);
            aVar.mo191806b().setSwipeEnabled(false);
            aVar.mo191806b().setShowMode(SwipeLayout.ShowMode.LayDown);
            aVar.mo191804a(new C56280e(this, todoDisplayItem));
            TodoChatListViewModel todoChatListViewModel = this.f139307e;
            Intrinsics.checkExpressionValueIsNotNull(todoDisplayItem, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            aVar.mo191805a(todoChatListViewModel, todoDisplayItem);
            this.f59660b.mo86624a(aVar.itemView, i);
        }
    }
}
