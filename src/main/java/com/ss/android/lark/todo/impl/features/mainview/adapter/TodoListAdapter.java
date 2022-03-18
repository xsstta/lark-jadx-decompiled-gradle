package com.ss.android.lark.todo.impl.features.mainview.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.blockit.hashtag.widget.SwipeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.badge.TodoBadgeManager;
import com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.PinnedHeaderAdapter;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import com.ss.android.lark.todo.impl.features.mainview.listener.OnItemClickListener;
import com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel;
import com.ss.android.lark.todo.impl.features.mainview.widget.sort.SortDialog;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003456B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u0004\u0018\u00010\u00102\u0006\u0010\"\u001a\u00020 J\b\u0010#\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010%\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010\"\u001a\u00020 H\u0016J\u0010\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020\u001eH\u0016J\u0018\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020 H\u0016J\u0018\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020 H\u0016J\u0016\u00100\u001a\u00020\u001e2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u000102J\u0018\u00103\u001a\u00020\u001e2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u000102H\u0002R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter;", "Lcom/ss/android/lark/todo/impl/features/mainview/adapter/pinned/PinnedHeaderAdapter;", "Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoItemViewHolder;", "viewModel", "Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainViewModel;", "onItemClickListener", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/OnItemClickListener;", "(Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainViewModel;Lcom/ss/android/lark/todo/impl/features/mainview/listener/OnItemClickListener;)V", "listType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "getListType$todo_release", "()Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "setListType$todo_release", "(Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;)V", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "operationListener", "Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$ITitleOperationListener;", "getOperationListener$todo_release", "()Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$ITitleOperationListener;", "setOperationListener$todo_release", "(Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$ITitleOperationListener;)V", "sortType", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;", "getSortType$todo_release", "()Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;", "setSortType$todo_release", "(Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;)V", "clickTitleBar", "", "firstVisiblePos", "", "getItem", "position", "getItemCount", "getPinnedHeaderViewPosition", "getSwipeLayoutResourceId", "isPinnedPosition", "", "isPositionInvalid", "notifyDatasetChanged", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "resetAll", "newList", "", "triggerUpdateTabBadge", "Companion", "ITitleClickListener", "ITitleOperationListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.c */
public final class TodoListAdapter extends PinnedHeaderAdapter<TodoItemViewHolder> {

    /* renamed from: a */
    public static final Companion f140253a = new Companion(null);

    /* renamed from: i */
    private static final C1374g.AbstractC1378c<TodoDisplayItem> f140254i = new C56805b();

    /* renamed from: c */
    private SortDialog.SortType f140255c = SortDialog.SortType.DUE_TIME;

    /* renamed from: d */
    private ITitleOperationListener f140256d;

    /* renamed from: e */
    private TodoFilterType f140257e = TodoFilterType.ALL;

    /* renamed from: f */
    private final C1356d<TodoDisplayItem> f140258f = new C1356d<>(this, f140254i);

    /* renamed from: g */
    private final TodoMainViewModel f140259g;

    /* renamed from: h */
    private final OnItemClickListener f140260h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$ITitleClickListener;", "", "onTitleClicked", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$TitleType;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.c$c */
    public interface ITitleClickListener {
        /* renamed from: a */
        void mo193128a(TodoDisplayItem.TitleType titleType);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$ITitleOperationListener;", "", "onTitleStateChanged", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$TitleType;", "isExpand", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.c$d */
    public interface ITitleOperationListener {
        /* renamed from: a */
        void mo193129a(TodoDisplayItem.TitleType titleType, boolean z);
    }

    @Override // com.larksuite.component.blockit.hashtag.widget.AbstractC24126c
    /* renamed from: a */
    public int mo86534a(int i) {
        return R.id.swipeLayout;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$Companion$DIFF_CALLBACK$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.c$b */
    public static final class C56805b extends C1374g.AbstractC1378c<TodoDisplayItem> {
        C56805b() {
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
    public final ITitleOperationListener mo193123c() {
        return this.f140256d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f140258f.mo7374a().size();
    }

    @Override // com.larksuite.component.blockit.hashtag.widget.AbstractC24124a
    /* renamed from: a */
    public void mo86621a() {
        super.mo86621a();
        m220728b(this.f140258f.mo7374a());
    }

    /* renamed from: a */
    public final void mo193119a(ITitleOperationListener dVar) {
        this.f140256d = dVar;
    }

    /* renamed from: e */
    private final int m220729e(int i) {
        while (i >= 0) {
            if (mo191818b(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* renamed from: f */
    private final boolean m220730f(int i) {
        if (i == -1 || i >= getItemCount()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final TodoDisplayItem mo193124c(int i) {
        if (m220730f(i)) {
            return null;
        }
        return this.f140258f.mo7374a().get(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter$ITitleClickListener;", "onTitleClicked", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$TitleType;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.adapter.c$e */
    public static final class C56806e implements ITitleClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoListAdapter f140261a;

        /* renamed from: b */
        final /* synthetic */ TodoDisplayItem f140262b;

        @Override // com.ss.android.lark.todo.impl.features.mainview.adapter.TodoListAdapter.ITitleClickListener
        /* renamed from: a */
        public void mo193128a(TodoDisplayItem.TitleType titleType) {
            ITitleOperationListener c;
            Intrinsics.checkParameterIsNotNull(titleType, "titleType");
            if (this.f140262b.mo193181q() && (c = this.f140261a.mo193123c()) != null) {
                c.mo193129a(titleType, !this.f140262b.mo193184t());
            }
        }

        C56806e(TodoListAdapter cVar, TodoDisplayItem todoDisplayItem) {
            this.f140261a = cVar;
            this.f140262b = todoDisplayItem;
        }
    }

    /* renamed from: a */
    public final void mo193120a(TodoFilterType todoFilterType) {
        Intrinsics.checkParameterIsNotNull(todoFilterType, "<set-?>");
        this.f140257e = todoFilterType;
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.PinnedHeaderAdapter
    /* renamed from: b */
    public boolean mo191818b(int i) {
        if (m220730f(i)) {
            return false;
        }
        if (this.f140255c == SortDialog.SortType.DUE_TIME || this.f140257e == TodoFilterType.COMPLETED || this.f140257e == TodoFilterType.FROM_DOCS) {
            return this.f140258f.mo7374a().get(i).mo193181q();
        }
        return false;
    }

    /* renamed from: d */
    public final void mo193125d(int i) {
        ITitleOperationListener dVar;
        if (i >= 0) {
            int e = m220729e(i);
            if (!m220730f(e)) {
                TodoDisplayItem todoDisplayItem = this.f140258f.mo7374a().get(e);
                if (todoDisplayItem.mo193181q() && (dVar = this.f140256d) != null) {
                    dVar.mo193129a(todoDisplayItem.mo193182r(), !todoDisplayItem.mo193184t());
                }
            }
        }
    }

    /* renamed from: b */
    private final void m220728b(List<TodoDisplayItem> list) {
        if (this.f140259g.getCurrentFilter() == TodoFilterType.ALL) {
            int i = 0;
            if (!this.f140259g.isShowBadgeOverdue()) {
                TodoBadgeManager.f139264a.mo191787a(0);
            } else if (list != null) {
                Iterator<TodoDisplayItem> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TodoDisplayItem next = it.next();
                    if (next.mo193181q()) {
                        if (next.mo193182r() == TodoDisplayItem.TitleType.OVER_DUE) {
                            i += next.mo193188w();
                            if (!this.f140259g.isShowBadgeToday()) {
                                break;
                            }
                        }
                        if (next.mo193182r() == TodoDisplayItem.TitleType.TODAY && this.f140259g.isShowBadgeToday()) {
                            i += next.mo193188w();
                            break;
                        }
                    }
                }
                TodoBadgeManager.f139264a.mo191787a(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo193121a(SortDialog.SortType sortType) {
        Intrinsics.checkParameterIsNotNull(sortType, "<set-?>");
        this.f140255c = sortType;
    }

    /* renamed from: a */
    public final void mo193122a(List<TodoDisplayItem> list) {
        this.f140258f.mo7376a(list);
        m220728b(list);
    }

    /* renamed from: a */
    public TodoItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return TodoItemViewHolder.f140226a.mo193111a(viewGroup);
    }

    public TodoListAdapter(TodoMainViewModel fVar, OnItemClickListener cVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "viewModel");
        Intrinsics.checkParameterIsNotNull(cVar, "onItemClickListener");
        this.f140259g = fVar;
        this.f140260h = cVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(TodoItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (!m220730f(i)) {
            TodoDisplayItem todoDisplayItem = this.f140258f.mo7374a().get(i);
            aVar.mo193110c().setSwipeEnabled(!todoDisplayItem.mo193181q());
            aVar.mo193110c().setShowMode(SwipeLayout.ShowMode.LayDown);
            aVar.mo193106a(new C56806e(this, todoDisplayItem));
            TodoMainViewModel fVar = this.f140259g;
            Intrinsics.checkExpressionValueIsNotNull(todoDisplayItem, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            aVar.mo193107a(fVar, todoDisplayItem, this.f140260h);
            this.f59660b.mo86624a(aVar.itemView, i);
        }
    }
}
