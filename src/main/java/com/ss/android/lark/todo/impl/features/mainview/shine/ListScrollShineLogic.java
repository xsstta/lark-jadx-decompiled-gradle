package com.ss.android.lark.todo.impl.features.mainview.shine;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.mainview.adapter.TodoItemViewHolder;
import com.ss.android.lark.todo.impl.features.mainview.adapter.TodoListAdapter;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import com.ss.android.lark.todo.impl.features.mainview.widget.sort.SortDialog;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH\u0002J\u0018\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/shine/ListScrollShineLogic;", "", "adapter", "Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Lcom/ss/android/lark/todo/impl/features/mainview/adapter/TodoListAdapter;Landroidx/recyclerview/widget/RecyclerView;)V", "addedTodoGuid", "", "hasCreateShineItem", "", "cancelShineAnimation", "", "getTargetItemPosition", "", "guid", "startScrollAndShineLogic", "addedGuid", "sortType", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;", "startShineAnimation", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.e.a */
public final class ListScrollShineLogic {

    /* renamed from: c */
    public static final Companion f140277c = new Companion(null);

    /* renamed from: a */
    public final TodoListAdapter f140278a;

    /* renamed from: b */
    public final RecyclerView f140279b;

    /* renamed from: d */
    private boolean f140280d;

    /* renamed from: e */
    private String f140281e = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/shine/ListScrollShineLogic$Companion;", "", "()V", "DELAY_MILLIS", "", "TITLE_HEIGHT", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.e.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.e.a$b */
    public static final class RunnableC56811b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ListScrollShineLogic f140282a;

        /* renamed from: b */
        final /* synthetic */ String f140283b;

        /* renamed from: c */
        final /* synthetic */ C56814c f140284c;

        RunnableC56811b(ListScrollShineLogic aVar, String str, C56814c cVar) {
            this.f140282a = aVar;
            this.f140283b = str;
            this.f140284c = cVar;
        }

        public final void run() {
            ListScrollShineLogic aVar = this.f140282a;
            int a = aVar.mo193146a(aVar.f140278a, this.f140283b);
            if (a != -1) {
                this.f140284c.setTargetPosition(a);
                this.f140282a.f140279b.postDelayed(new Runnable(this) {
                    /* class com.ss.android.lark.todo.impl.features.mainview.shine.ListScrollShineLogic.RunnableC56811b.RunnableC568121 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC56811b f140285a;

                    {
                        this.f140285a = r1;
                    }

                    public final void run() {
                        RecyclerView.LayoutManager layoutManager = this.f140285a.f140282a.f140279b.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.startSmoothScroll(this.f140285a.f140284c);
                        }
                    }
                }, 250);
                this.f140282a.f140279b.postDelayed(new Runnable(this) {
                    /* class com.ss.android.lark.todo.impl.features.mainview.shine.ListScrollShineLogic.RunnableC56811b.RunnableC568132 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC56811b f140286a;

                    {
                        this.f140286a = r1;
                    }

                    public final void run() {
                        this.f140286a.f140282a.mo193147a();
                    }
                }, 250);
            }
        }
    }

    /* renamed from: b */
    public final void mo193149b() {
        Drawable d;
        if (this.f140280d) {
            int itemCount = this.f140278a.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f140279b.findViewHolderForAdapterPosition(i);
                if ((findViewHolderForAdapterPosition instanceof TodoItemViewHolder) && (d = ResUtil.f139261a.mo191782d(R.drawable.bg_setting_group_item_rectangle)) != null) {
                    TodoItemViewHolder aVar = (TodoItemViewHolder) findViewHolderForAdapterPosition;
                    aVar.mo193104a(d, false);
                    aVar.mo193108a("");
                }
            }
            this.f140280d = false;
            this.f140281e = "";
        }
    }

    /* renamed from: a */
    public final void mo193147a() {
        boolean z;
        Drawable d;
        if (this.f140281e.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int itemCount = this.f140278a.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f140279b.findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition instanceof TodoItemViewHolder) {
                    TodoItemViewHolder aVar = (TodoItemViewHolder) findViewHolderForAdapterPosition;
                    if (Intrinsics.areEqual(aVar.mo193109b(), this.f140281e) && (d = ResUtil.f139261a.mo191782d(R.drawable.todo_bg_list_item_corner_shine)) != null) {
                        aVar.mo193104a(d, true);
                        aVar.mo193108a("");
                        this.f140280d = true;
                        return;
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0014J\b\u0010\u000b\u001a\u00020\u0003H\u0014¨\u0006\f"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/shine/ListScrollShineLogic$startScrollAndShineLogic$smoothScroller$1", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "calculateDtToFit", "", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "calculateTimeForScrolling", "dx", "getVerticalSnapPreference", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.e.a$c */
    public static final class C56814c extends LinearSmoothScroller {

        /* renamed from: a */
        final /* synthetic */ ListScrollShineLogic f140287a;

        /* renamed from: b */
        final /* synthetic */ SortDialog.SortType f140288b;

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return -1;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForScrolling(int i) {
            return Math.min(250, super.calculateTimeForScrolling(i));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56814c(ListScrollShineLogic aVar, SortDialog.SortType sortType, Context context) {
            super(context);
            this.f140287a = aVar;
            this.f140288b = sortType;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            if (i5 == -1 && this.f140288b == SortDialog.SortType.DUE_TIME) {
                return (i3 - i) + C57582a.m223600a(34);
            }
            return super.calculateDtToFit(i, i2, i3, i4, i5);
        }
    }

    public ListScrollShineLogic(TodoListAdapter cVar, RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(cVar, "adapter");
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        this.f140278a = cVar;
        this.f140279b = recyclerView;
    }

    /* renamed from: a */
    public final int mo193146a(TodoListAdapter cVar, String str) {
        String str2;
        int itemCount = cVar.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            TodoDisplayItem c = cVar.mo193124c(i);
            if (c != null) {
                str2 = c.mo193167e();
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str2, str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo193148a(String str, SortDialog.SortType sortType) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(sortType, "sortType");
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f140281e = str;
            UICallbackExecutor.executeDelayed(new RunnableC56811b(this, str, new C56814c(this, sortType, this.f140279b.getContext())), 250);
        }
    }
}
