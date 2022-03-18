package com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar;

import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/ITitleLiveDataStore;", "", "showMoreList", "Landroidx/lifecycle/LiveData;", "", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$MenuDisplayItem;", "getShowMoreList", "()Landroidx/lifecycle/LiveData;", "showSearchIcon", "", "getShowSearchIcon", "showSortDialog", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "getShowSortDialog", "showTitleBar", "getShowTitleBar", "titleShowStr", "", "getTitleShowStr", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.a */
public interface ITitleLiveDataStore {
    /* renamed from: b */
    LiveData<String> mo193585b();

    /* renamed from: d */
    LiveData<List<TitleViewSection.MenuDisplayItem>> mo193587d();

    /* renamed from: f */
    LiveData<TodoSortType> mo193589f();

    /* renamed from: h */
    LiveData<Boolean> mo193591h();
}
