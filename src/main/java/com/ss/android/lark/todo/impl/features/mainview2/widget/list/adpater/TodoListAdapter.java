package com.ss.android.lark.todo.impl.features.mainview2.widget.list.adpater;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.blockit.hashtag.widget.SwipeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.badge.TodoBadgeManager;
import com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.PinnedHeaderAdapter;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListItemClickListener;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003:;<B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u0010\u0010(\u001a\u0004\u0018\u00010\u00172\u0006\u0010)\u001a\u00020'J\b\u0010*\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010,\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0016J\u0010\u0010-\u001a\u00020\r2\u0006\u0010)\u001a\u00020'H\u0016J\u0010\u0010.\u001a\u00020\r2\u0006\u0010)\u001a\u00020'H\u0002J\b\u0010/\u001a\u00020%H\u0016J\u0018\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\u00022\u0006\u0010)\u001a\u00020'H\u0016J\u0018\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020'H\u0016J\u0016\u00106\u001a\u00020%2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u000108J\u0018\u00109\u001a\u00020%2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u000108H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006="}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter;", "Lcom/ss/android/lark/todo/impl/features/mainview/adapter/pinned/PinnedHeaderAdapter;", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoItemViewHolder;", "listener", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/listener/IListItemClickListener;", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/listener/IListItemClickListener;)V", "filterType", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "getFilterType$todo_release", "()Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "setFilterType$todo_release", "(Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;)V", "isShowBadgeOverDue", "", "isShowBadgeOverDue$todo_release", "()Z", "setShowBadgeOverDue$todo_release", "(Z)V", "isShowBadgeToday", "isShowBadgeToday$todo_release", "setShowBadgeToday$todo_release", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData;", "operationListener", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$ITitleOperationListener;", "getOperationListener$todo_release", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$ITitleOperationListener;", "setOperationListener$todo_release", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$ITitleOperationListener;)V", "sortType", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "getSortType$todo_release", "()Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "setSortType$todo_release", "(Lcom/bytedance/lark/pb/todo/v1/TodoSortType;)V", "clickTitleBar", "", "firstVisiblePos", "", "getItem", "position", "getItemCount", "getPinnedHeaderViewPosition", "getSwipeLayoutResourceId", "isPinnedPosition", "isPositionInvalid", "notifyDatasetChanged", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "resetAll", "newList", "", "triggerUpdateTabBadge", "Companion", "ITitleClickListener", "ITitleOperationListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.c */
public final class TodoListAdapter extends PinnedHeaderAdapter<TodoItemViewHolder> {

    /* renamed from: a */
    public static final Companion f140743a = new Companion(null);

    /* renamed from: j */
    private static final C1374g.AbstractC1378c<TodoItemViewData> f140744j = new C57074b();

    /* renamed from: c */
    private TodoSortType f140745c = TodoSortType.DUE_TIME;

    /* renamed from: d */
    private ITitleOperationListener f140746d;

    /* renamed from: e */
    private TodoListView.Type f140747e = TodoListView.Type.ALL;

    /* renamed from: f */
    private boolean f140748f = true;

    /* renamed from: g */
    private boolean f140749g = true;

    /* renamed from: h */
    private final C1356d<TodoItemViewData> f140750h = new C1356d<>(this, f140744j);

    /* renamed from: i */
    private final IListItemClickListener f140751i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$ITitleClickListener;", "", "onTitleClicked", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.c$c */
    public interface ITitleClickListener {
        /* renamed from: a */
        void mo193755a(TodoItemViewData.TitleType titleType);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$ITitleOperationListener;", "", "onTitleStateChanged", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", "isTargetExpand", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.c$d */
    public interface ITitleOperationListener {
        /* renamed from: a */
        void mo193756a(TodoItemViewData.TitleType titleType, boolean z);
    }

    @Override // com.larksuite.component.blockit.hashtag.widget.AbstractC24126c
    /* renamed from: a */
    public int mo86534a(int i) {
        return R.id.swipeLayout;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$Companion$DIFF_CALLBACK$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.c$b */
    public static final class C57074b extends C1374g.AbstractC1378c<TodoItemViewData> {
        C57074b() {
        }

        /* renamed from: b */
        public boolean areContentsTheSame(TodoItemViewData todoItemViewData, TodoItemViewData todoItemViewData2) {
            Intrinsics.checkParameterIsNotNull(todoItemViewData, "oldItem");
            Intrinsics.checkParameterIsNotNull(todoItemViewData2, "newItem");
            return Intrinsics.areEqual(todoItemViewData, todoItemViewData2);
        }

        /* renamed from: a */
        public boolean areItemsTheSame(TodoItemViewData todoItemViewData, TodoItemViewData todoItemViewData2) {
            Intrinsics.checkParameterIsNotNull(todoItemViewData, "oldItem");
            Intrinsics.checkParameterIsNotNull(todoItemViewData2, "newItem");
            if (!todoItemViewData.mo193836b() || !todoItemViewData2.mo193836b()) {
                return Intrinsics.areEqual(todoItemViewData.mo193835a(), todoItemViewData2.mo193835a());
            }
            if (todoItemViewData.mo193837c().mo193886a() == todoItemViewData2.mo193837c().mo193886a()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    public final ITitleOperationListener mo193750c() {
        return this.f140746d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f140750h.mo7374a().size();
    }

    @Override // com.larksuite.component.blockit.hashtag.widget.AbstractC24124a
    /* renamed from: a */
    public void mo86621a() {
        super.mo86621a();
        m221250b(this.f140750h.mo7374a());
    }

    /* renamed from: b */
    public final void mo193749b(boolean z) {
        this.f140749g = z;
    }

    /* renamed from: a */
    public final void mo193743a(TodoListView.Type type) {
        Intrinsics.checkParameterIsNotNull(type, "<set-?>");
        this.f140747e = type;
    }

    /* renamed from: e */
    private final int m221251e(int i) {
        while (i >= 0) {
            if (mo191818b(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* renamed from: f */
    private final boolean m221252f(int i) {
        if (i == -1 || i >= getItemCount()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final TodoItemViewData mo193751c(int i) {
        if (m221252f(i)) {
            return null;
        }
        return this.f140750h.mo7374a().get(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/adpater/TodoListAdapter$ITitleClickListener;", "onTitleClicked", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.a.c$e */
    public static final class C57075e implements ITitleClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoListAdapter f140752a;

        /* renamed from: b */
        final /* synthetic */ TodoItemViewData f140753b;

        @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.list.adpater.TodoListAdapter.ITitleClickListener
        /* renamed from: a */
        public void mo193755a(TodoItemViewData.TitleType titleType) {
            Intrinsics.checkParameterIsNotNull(titleType, "titleType");
            if (this.f140753b.mo193836b()) {
                boolean d = this.f140753b.mo193837c().mo193890d();
                ITitleOperationListener c = this.f140752a.mo193750c();
                if (c != null) {
                    c.mo193756a(titleType, !d);
                }
            }
        }

        C57075e(TodoListAdapter cVar, TodoItemViewData todoItemViewData) {
            this.f140752a = cVar;
            this.f140753b = todoItemViewData;
        }
    }

    public TodoListAdapter(IListItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f140751i = aVar;
    }

    /* renamed from: a */
    public final void mo193744a(TodoSortType todoSortType) {
        Intrinsics.checkParameterIsNotNull(todoSortType, "<set-?>");
        this.f140745c = todoSortType;
    }

    @Override // com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.PinnedHeaderAdapter
    /* renamed from: b */
    public boolean mo191818b(int i) {
        if (m221252f(i)) {
            return false;
        }
        if (this.f140745c == TodoSortType.DUE_TIME || this.f140747e == TodoListView.Type.COMPLETED || this.f140747e == TodoListView.Type.FROM_DOC) {
            return this.f140750h.mo7374a().get(i).mo193836b();
        }
        return false;
    }

    /* renamed from: d */
    public final void mo193752d(int i) {
        TodoItemViewData.TitleViewData c;
        ITitleOperationListener dVar;
        if (i >= 0) {
            int e = m221251e(i);
            if (!m221252f(e)) {
                TodoItemViewData todoItemViewData = this.f140750h.mo7374a().get(e);
                if (todoItemViewData.mo193836b() && (c = todoItemViewData.mo193837c()) != null && (dVar = this.f140746d) != null) {
                    dVar.mo193756a(c.mo193886a(), !c.mo193890d());
                }
            }
        }
    }

    /* renamed from: b */
    private final void m221250b(List<TodoItemViewData> list) {
        if (this.f140747e == TodoListView.Type.ALL) {
            int i = 0;
            if (!this.f140748f) {
                TodoBadgeManager.f139264a.mo191787a(0);
            } else if (list != null) {
                Iterator<TodoItemViewData> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TodoItemViewData next = it.next();
                    if (next.mo193836b()) {
                        if (next.mo193837c().mo193886a() == TodoItemViewData.TitleType.OVER_DUE) {
                            i += next.mo193837c().mo193891e();
                            if (!this.f140749g) {
                                break;
                            }
                        }
                        if (next.mo193837c().mo193886a() == TodoItemViewData.TitleType.TODAY && this.f140749g) {
                            i += next.mo193837c().mo193891e();
                            break;
                        }
                    }
                }
                TodoBadgeManager.f139264a.mo191787a(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo193746a(ITitleOperationListener dVar) {
        this.f140746d = dVar;
    }

    /* renamed from: a */
    public final void mo193747a(List<TodoItemViewData> list) {
        this.f140750h.mo7376a(list);
        m221250b(list);
    }

    /* renamed from: a */
    public final void mo193748a(boolean z) {
        this.f140748f = z;
    }

    /* renamed from: a */
    public TodoItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return TodoItemViewHolder.f140719a.mo193736a(viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(TodoItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (!m221252f(i)) {
            TodoItemViewData todoItemViewData = this.f140750h.mo7374a().get(i);
            aVar.mo193735c().setSwipeEnabled(!todoItemViewData.mo193836b());
            aVar.mo193735c().setShowMode(SwipeLayout.ShowMode.LayDown);
            aVar.mo193731a(new C57075e(this, todoItemViewData));
            Intrinsics.checkExpressionValueIsNotNull(todoItemViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            aVar.mo193732a(todoItemViewData, this.f140751i, this.f140747e, this.f140748f, this.f140749g);
            this.f59660b.mo86624a(aVar.itemView, i);
        }
    }
}
