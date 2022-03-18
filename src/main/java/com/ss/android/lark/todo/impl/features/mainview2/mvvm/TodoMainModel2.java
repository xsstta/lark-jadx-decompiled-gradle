package com.ss.android.lark.todo.impl.features.mainview2.mvvm;

import com.bytedance.lark.pb.todo.v1.ChangedTodoCollection;
import com.bytedance.lark.pb.todo.v1.TodoBadgeConfig;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoListViewSetting;
import com.bytedance.lark.pb.todo.v1.TodoSetting;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.larksuite.framework.section.utils.MutableLiveDataPlus;
import com.ss.android.lark.todo.impl.features.badge.TodoBadgeManager;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareEntity;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareStatus;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListToastUnit;
import com.ss.android.lark.todo.impl.features.mainview2.entity.TodoListResult;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection;
import com.ss.android.lark.todo.impl.framework.architecture.DataResult;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010_\u001a\u00020$J\n\u0010S\u001a\u00060\"j\u0002`#J\u0006\u0010`\u001a\u00020aJ\u0006\u0010b\u001a\u00020aJ\b\u0010c\u001a\u00020aH\u0002J\b\u0010d\u001a\u00020\rH\u0002J\u0006\u0010e\u001a\u00020aJ\u001c\u0010f\u001a\u00020a2\n\u0010g\u001a\u00060\"j\u0002`#2\b\b\u0002\u0010h\u001a\u00020\rJ\u0006\u0010B\u001a\u00020aJ\u000e\u0010i\u001a\u00020a2\u0006\u0010j\u001a\u00020\rJ\u000e\u0010k\u001a\u00020a2\u0006\u0010X\u001a\u00020$J\u0014\u0010l\u001a\u00020a2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020n0;J\u000e\u0010o\u001a\u00020a2\u0006\u0010p\u001a\u00020qR&\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\tR&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\tR2\u0010 \u001a&\u0012\b\u0012\u00060\"j\u0002`#\u0012\u0004\u0012\u00020$0!j\u0012\u0012\b\u0012\u00060\"j\u0002`#\u0012\u0004\u0012\u00020$`%X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\tR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\tR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\tR&\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\tR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\tR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\tR\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\tR\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\tR\u001b\u00105\u001a\f\u0012\b\u0012\u00060\"j\u0002`#0\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\tR\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\tR \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\tR\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\tR\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020$0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\tR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\tR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\tR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\tR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\tR \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0;0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\tR>\u0010O\u001a,\u0012(\u0012&\u0012\b\u0012\u00060\"j\u0002`#\u0012\u0004\u0012\u00020P0!j\u0012\u0012\b\u0012\u00060\"j\u0002`#\u0012\u0004\u0012\u00020P`%0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\tR\u001e\u0010R\u001a\f\u0012\b\u0012\u00060\"j\u0002`#0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\tR\u001d\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0U0\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\tR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020$0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010\tR\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010\tR\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010\t¨\u0006r"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/IMainFragmentLiveDataStore;", "()V", "activeConfirmDialog", "Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;", "Lkotlin/Pair;", "", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "getActiveConfirmDialog", "()Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;", "addedShineTodoGuid", "getAddedShineTodoGuid", "animateContentForTitle", "", "getAnimateContentForTitle", "cancelShineLogic", "getCancelShineLogic", "changeAccount", "getChangeAccount", "clearScrollDistance", "getClearScrollDistance", "closeAllItems", "getCloseAllItems", "completeConfirmDialog", "getCompleteConfirmDialog", "dataFetchStatus", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFetchStatus;", "getDataFetchStatus", "fetchCompletePageData", "getFetchCompletePageData", "fetchDocPageData", "getFetchDocPageData", "filterSortTypeMap", "Ljava/util/HashMap;", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "Lkotlin/collections/HashMap;", "hasDocsDoingMoreData", "getHasDocsDoingMoreData", "hasDocsDoneMoreData", "getHasDocsDoneMoreData", "hasMoreData", "getHasMoreData", "isBadgeSettingChange", "noTodoLabel", "getNoTodoLabel", "noTodoText", "getNoTodoText", "refreshDocPageAfterDelete", "getRefreshDocPageAfterDelete", "refreshListDisplayData", "getRefreshListDisplayData", "resetSubTitleExpandState", "getResetSubTitleExpandState", "shareEntity", "Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareEntity;", "getShareEntity", "showMoreList", "", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$MenuDisplayItem;", "getShowMoreList", "showSearchIcon", "getShowSearchIcon", "showSortDialog", "getShowSortDialog", "showTitleBar", "getShowTitleBar", "titleShowStr", "getTitleShowStr", "toastUnit", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListToastUnit;", "getToastUnit", "todoBadgeSetting", "Lcom/bytedance/lark/pb/todo/v1/TodoBadgeConfig;", "getTodoBadgeSetting", "todoDisplayItems", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData;", "getTodoDisplayItems", "todoFilterNumMap", "", "getTodoFilterNumMap", "todoFilterType", "getTodoFilterType", "todoListResult", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult;", "Lcom/ss/android/lark/todo/impl/features/mainview2/entity/TodoListResult;", "getTodoListResult", "todoSortType", "getTodoSortType", "updateCompletedListData", "Lcom/bytedance/lark/pb/todo/v1/ChangedTodoCollection;", "getUpdateCompletedListData", "updateFullListData", "getUpdateFullListData", "getCurrentFilterSortType", "handleBadgePush", "", "initDataForChangeAccount", "initSortTypeMap", "isTitleBarVisible", "revertTitleVisibleStatus", "setFilterType", "targetFilterType", "isNeedLoadData", "translateContentView", "isShowTitleBar", "updateSortType", "updateSortTypeBySetting", "settings", "Lcom/bytedance/lark/pb/todo/v1/TodoListViewSetting;", "updateTodoSetting", "todoSetting", "Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.b.c */
public final class TodoMainModel2 implements IMainFragmentLiveDataStore {

    /* renamed from: A */
    private final MutableLiveDataPlus<Boolean> f140584A = new MutableLiveDataPlus<>();

    /* renamed from: B */
    private final MutableLiveDataPlus<Boolean> f140585B = new MutableLiveDataPlus<>();

    /* renamed from: C */
    private final MutableLiveDataPlus<String> f140586C = new MutableLiveDataPlus<>();

    /* renamed from: D */
    private final MutableLiveDataPlus<TodoFetchStatus> f140587D = new MutableLiveDataPlus<>();

    /* renamed from: E */
    private final MutableLiveDataPlus<TodoListToastUnit> f140588E = new MutableLiveDataPlus<>();

    /* renamed from: F */
    private final MutableLiveDataPlus<Boolean> f140589F = new MutableLiveDataPlus<>();

    /* renamed from: G */
    private final MutableLiveDataPlus<ShareEntity> f140590G = new MutableLiveDataPlus<>(new ShareEntity(ShareStatus.NO_LOADING, null, 2, null));

    /* renamed from: H */
    private final MutableLiveDataPlus<Pair<String, TodoSource>> f140591H = new MutableLiveDataPlus<>();

    /* renamed from: I */
    private final MutableLiveDataPlus<Pair<String, TodoSource>> f140592I = new MutableLiveDataPlus<>();

    /* renamed from: J */
    private final MutableLiveDataPlus<Boolean> f140593J = new MutableLiveDataPlus<>();

    /* renamed from: a */
    private final MutableLiveDataPlus<String> f140594a = new MutableLiveDataPlus<>();

    /* renamed from: b */
    private final MutableLiveDataPlus<Boolean> f140595b = new MutableLiveDataPlus<>();

    /* renamed from: c */
    private final MutableLiveDataPlus<List<TitleViewSection.MenuDisplayItem>> f140596c = new MutableLiveDataPlus<>();

    /* renamed from: d */
    private final MutableLiveDataPlus<TodoSortType> f140597d = new MutableLiveDataPlus<>();

    /* renamed from: e */
    private final MutableLiveDataPlus<Boolean> f140598e = new MutableLiveDataPlus<>();

    /* renamed from: f */
    private final HashMap<TodoListView.Type, TodoSortType> f140599f = new HashMap<>();

    /* renamed from: g */
    private final MutableLiveDataPlus<TodoListView.Type> f140600g = new MutableLiveDataPlus<>();

    /* renamed from: h */
    private final MutableLiveDataPlus<HashMap<TodoListView.Type, Integer>> f140601h = new MutableLiveDataPlus<>();

    /* renamed from: i */
    private final MutableLiveDataPlus<List<TodoItemViewData>> f140602i = new MutableLiveDataPlus<>();

    /* renamed from: j */
    private final MutableLiveDataPlus<TodoSortType> f140603j = new MutableLiveDataPlus<>();

    /* renamed from: k */
    private final MutableLiveDataPlus<String> f140604k = new MutableLiveDataPlus<>();

    /* renamed from: l */
    private final MutableLiveDataPlus<Boolean> f140605l = new MutableLiveDataPlus<>();

    /* renamed from: m */
    private final MutableLiveDataPlus<Pair<Boolean, Boolean>> f140606m = new MutableLiveDataPlus<>();

    /* renamed from: n */
    private final MutableLiveDataPlus<Boolean> f140607n = new MutableLiveDataPlus<>();

    /* renamed from: o */
    private final MutableLiveDataPlus<Boolean> f140608o = new MutableLiveDataPlus<>();

    /* renamed from: p */
    private final MutableLiveDataPlus<Boolean> f140609p = new MutableLiveDataPlus<>();

    /* renamed from: q */
    private final MutableLiveDataPlus<TodoBadgeConfig> f140610q = new MutableLiveDataPlus<>();

    /* renamed from: r */
    private final MutableLiveDataPlus<DataResult<TodoListResult>> f140611r = new MutableLiveDataPlus<>();

    /* renamed from: s */
    private final MutableLiveDataPlus<Boolean> f140612s = new MutableLiveDataPlus<>();

    /* renamed from: t */
    private final MutableLiveDataPlus<Boolean> f140613t = new MutableLiveDataPlus<>();

    /* renamed from: u */
    private final MutableLiveDataPlus<Boolean> f140614u = new MutableLiveDataPlus<>();

    /* renamed from: v */
    private final MutableLiveDataPlus<ChangedTodoCollection> f140615v = new MutableLiveDataPlus<>();

    /* renamed from: w */
    private final MutableLiveDataPlus<String> f140616w = new MutableLiveDataPlus<>();

    /* renamed from: x */
    private final MutableLiveDataPlus<Boolean> f140617x = new MutableLiveDataPlus<>();

    /* renamed from: y */
    private final MutableLiveDataPlus<Boolean> f140618y = new MutableLiveDataPlus<>();

    /* renamed from: z */
    private final MutableLiveDataPlus<TodoListView.Type> f140619z = new MutableLiveDataPlus<>();

    /* renamed from: A */
    public MutableLiveDataPlus<Boolean> mo193544B() {
        return this.f140609p;
    }

    /* renamed from: C */
    public final MutableLiveDataPlus<TodoBadgeConfig> mo193545C() {
        return this.f140610q;
    }

    /* renamed from: D */
    public final MutableLiveDataPlus<DataResult<TodoListResult>> mo193546D() {
        return this.f140611r;
    }

    /* renamed from: E */
    public final MutableLiveDataPlus<Boolean> mo193547E() {
        return this.f140612s;
    }

    /* renamed from: F */
    public final MutableLiveDataPlus<Boolean> mo193548F() {
        return this.f140613t;
    }

    /* renamed from: G */
    public final MutableLiveDataPlus<Boolean> mo193549G() {
        return this.f140614u;
    }

    /* renamed from: H */
    public final MutableLiveDataPlus<ChangedTodoCollection> mo193550H() {
        return this.f140615v;
    }

    /* renamed from: I */
    public final MutableLiveDataPlus<String> mo193551I() {
        return this.f140616w;
    }

    /* renamed from: J */
    public final MutableLiveDataPlus<Boolean> mo193552J() {
        return this.f140617x;
    }

    /* renamed from: K */
    public final MutableLiveDataPlus<Boolean> mo193553K() {
        return this.f140618y;
    }

    /* renamed from: L */
    public final MutableLiveDataPlus<TodoListView.Type> mo193554L() {
        return this.f140619z;
    }

    /* renamed from: M */
    public final MutableLiveDataPlus<Boolean> mo193555M() {
        return this.f140584A;
    }

    /* renamed from: N */
    public MutableLiveDataPlus<Boolean> mo193557O() {
        return this.f140585B;
    }

    /* renamed from: P */
    public MutableLiveDataPlus<String> mo193559Q() {
        return this.f140586C;
    }

    /* renamed from: R */
    public MutableLiveDataPlus<TodoFetchStatus> mo193561S() {
        return this.f140587D;
    }

    /* renamed from: T */
    public MutableLiveDataPlus<TodoListToastUnit> mo193563U() {
        return this.f140588E;
    }

    /* renamed from: V */
    public MutableLiveDataPlus<Boolean> mo193565W() {
        return this.f140589F;
    }

    /* renamed from: X */
    public MutableLiveDataPlus<ShareEntity> mo193567Y() {
        return this.f140590G;
    }

    /* renamed from: Z */
    public MutableLiveDataPlus<Pair<String, TodoSource>> aa() {
        return this.f140591H;
    }

    /* renamed from: a */
    public MutableLiveDataPlus<String> mo193585b() {
        return this.f140594a;
    }

    /* renamed from: ab */
    public MutableLiveDataPlus<Pair<String, TodoSource>> ac() {
        return this.f140592I;
    }

    public final MutableLiveDataPlus<Boolean> ad() {
        return this.f140593J;
    }

    /* renamed from: c */
    public MutableLiveDataPlus<List<TitleViewSection.MenuDisplayItem>> mo193587d() {
        return this.f140596c;
    }

    /* renamed from: e */
    public MutableLiveDataPlus<TodoSortType> mo193589f() {
        return this.f140597d;
    }

    /* renamed from: g */
    public MutableLiveDataPlus<Boolean> mo193591h() {
        return this.f140598e;
    }

    /* renamed from: i */
    public MutableLiveDataPlus<TodoListView.Type> mo193593j() {
        return this.f140600g;
    }

    /* renamed from: k */
    public MutableLiveDataPlus<HashMap<TodoListView.Type, Integer>> mo193595l() {
        return this.f140601h;
    }

    /* renamed from: m */
    public MutableLiveDataPlus<List<TodoItemViewData>> mo193597n() {
        return this.f140602i;
    }

    /* renamed from: o */
    public MutableLiveDataPlus<TodoSortType> mo193599p() {
        return this.f140603j;
    }

    /* renamed from: q */
    public MutableLiveDataPlus<String> mo193601r() {
        return this.f140604k;
    }

    /* renamed from: s */
    public MutableLiveDataPlus<Boolean> mo193603t() {
        return this.f140605l;
    }

    /* renamed from: u */
    public MutableLiveDataPlus<Pair<Boolean, Boolean>> mo193605v() {
        return this.f140606m;
    }

    /* renamed from: w */
    public MutableLiveDataPlus<Boolean> mo193607x() {
        return this.f140607n;
    }

    /* renamed from: y */
    public MutableLiveDataPlus<Boolean> mo193609z() {
        return this.f140608o;
    }

    public final void aj() {
        ak();
        this.f140593J.mo5926a((Boolean) true);
    }

    private final boolean al() {
        Boolean b = mo193591h().mo5927b();
        if (b == null) {
            b = true;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "showTitleBar.value ?: true");
        return b.booleanValue();
    }

    public final TodoListView.Type ae() {
        TodoListView.Type b = mo193593j().mo5927b();
        if (b == null) {
            b = TodoListView.Type.ALL;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "todoFilterType.value ?: TodoFilterType.ALL");
        return b;
    }

    public final void ag() {
        if (ae() == TodoListView.Type.ALL && af() == TodoSortType.DUE_TIME) {
            TodoBadgeManager.f139264a.mo191793c();
        } else {
            TodoBadgeManager.f139264a.mo191790b();
        }
    }

    public final void ah() {
        if (!al()) {
            mo193574a(true);
        }
        mo193544B().mo5926a((Boolean) true);
    }

    public final void ai() {
        boolean al = al();
        mo193591h().mo5929b(Boolean.valueOf(!al));
        mo193565W().mo5929b(Boolean.valueOf(!al));
    }

    public final TodoSortType af() {
        if (ae() == TodoListView.Type.COMPLETED) {
            return TodoSortType.CREATE_TIME;
        }
        if (!this.f140599f.containsKey(ae())) {
            return TodoSortType.DUE_TIME;
        }
        TodoSortType todoSortType = this.f140599f.get(ae());
        if (todoSortType != null) {
            return todoSortType;
        }
        return TodoSortType.DUE_TIME;
    }

    private final void ak() {
        this.f140599f.put(TodoListView.Type.ALL, TodoSortType.DUE_TIME);
        this.f140599f.put(TodoListView.Type.ASSIGN_FROM_ME, TodoSortType.DUE_TIME);
        this.f140599f.put(TodoListView.Type.ASSIGN_TO_ME, TodoSortType.DUE_TIME);
        this.f140599f.put(TodoListView.Type.COMPLETED, TodoSortType.DUE_TIME);
        this.f140599f.put(TodoListView.Type.FOLLOWED, TodoSortType.DUE_TIME);
        this.f140599f.put(TodoListView.Type.FROM_DOC, TodoSortType.DUE_TIME);
    }

    public TodoMainModel2() {
        ak();
    }

    /* renamed from: a */
    public final void mo193571a(TodoSetting todoSetting) {
        Intrinsics.checkParameterIsNotNull(todoSetting, "todoSetting");
        TodoSortType af = af();
        List<TodoListViewSetting> list = todoSetting.tab_view_settings;
        if (list != null) {
            mo193573a(list);
        }
        if (!(ae() == TodoListView.Type.COMPLETED || af == af())) {
            mo193599p().mo5926a(af());
        }
        TodoBadgeConfig todoBadgeConfig = todoSetting.badge_config;
        if (todoBadgeConfig != null) {
            this.f140610q.mo5926a(todoBadgeConfig);
        }
    }

    /* renamed from: a */
    public final void mo193572a(TodoSortType todoSortType) {
        Intrinsics.checkParameterIsNotNull(todoSortType, "todoSortType");
        if (this.f140599f.containsKey(ae())) {
            this.f140599f.put(ae(), todoSortType);
        }
    }

    /* renamed from: a */
    public final void mo193573a(List<TodoListViewSetting> list) {
        Intrinsics.checkParameterIsNotNull(list, "settings");
        for (T t : list) {
            TodoListView.Type type = t.view;
            Intrinsics.checkExpressionValueIsNotNull(type, "it.view");
            TodoSortType todoSortType = t.sort_type;
            Intrinsics.checkExpressionValueIsNotNull(todoSortType, "it.sort_type");
            this.f140599f.put(type, todoSortType);
        }
    }

    /* renamed from: a */
    public final void mo193574a(boolean z) {
        if (al() && z) {
            return;
        }
        if (al() || z) {
            mo193591h().mo5929b(Boolean.valueOf(z));
            mo193565W().mo5929b(Boolean.valueOf(z));
            mo193544B().mo5929b((Boolean) true);
        }
    }

    /* renamed from: a */
    public final void mo193570a(TodoListView.Type type, boolean z) {
        Intrinsics.checkParameterIsNotNull(type, "targetFilterType");
        if (z) {
            mo193593j().mo5926a(type);
            mo193599p().mo92061d(af());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m221096a(TodoMainModel2 cVar, TodoListView.Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        cVar.mo193570a(type, z);
    }
}
