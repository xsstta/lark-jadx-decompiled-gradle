package com.ss.android.lark.moments.impl.categoryedit;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.moments.v1.ListTabsResponse;
import com.bytedance.lark.pb.moments.v1.Tab;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.moments.impl.common.BaseViewModel;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001f\u001a\u00020 J&\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017H\u0002J\u001e\u0010$\u001a\u00020 2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00040%j\b\u0012\u0004\u0012\u00020\u0004`&J\u000e\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0004J\u0016\u0010)\u001a\u00020 2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8TX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u0006,"}, d2 = {"Lcom/ss/android/lark/moments/impl/categoryedit/MomentsEditCategoryViewModel;", "Lcom/ss/android/lark/moments/impl/common/BaseViewModel;", "()V", "currentTabId", "", "getCurrentTabId", "()Ljava/lang/String;", "setCurrentTabId", "(Ljava/lang/String;)V", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "forceRefresh", "Landroidx/lifecycle/MutableLiveData;", "", "getForceRefresh", "()Landroidx/lifecycle/MutableLiveData;", "noNeedToRequestOrder", "getNoNeedToRequestOrder", "originalTabIds", "", "saveFinish", "getSaveFinish", "selectedTabs", "Lcom/ss/android/lark/moments/impl/categoryedit/TabData;", "getSelectedTabs", "unSelectedTabs", "getUnSelectedTabs", "getTabs", "", "idsNoChange", "ids", "oriIds", "saveTabsOrder", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setCurrentSelected", "selectedId", "setSelectedTabs", "tabs", "Lcom/bytedance/lark/pb/moments/v1/Tab;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categoryedit.f */
public final class MomentsEditCategoryViewModel extends BaseViewModel {
    private String currentTabId;
    private final Lazy dispatcher$delegate = LazyKt.lazy(C47275a.INSTANCE);
    private final C1177w<Boolean> forceRefresh = new C1177w<>();
    private final C1177w<Boolean> noNeedToRequestOrder = new C1177w<>();
    private List<String> originalTabIds;
    private final C1177w<Boolean> saveFinish = new C1177w<>();
    private final C1177w<List<TabData>> selectedTabs = new C1177w<>();
    private final C1177w<List<TabData>> unSelectedTabs = new C1177w<>();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.moments.impl.common.BaseViewModel
    public ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    public final String getCurrentTabId() {
        return this.currentTabId;
    }

    public final C1177w<Boolean> getForceRefresh() {
        return this.forceRefresh;
    }

    public final C1177w<Boolean> getNoNeedToRequestOrder() {
        return this.noNeedToRequestOrder;
    }

    public final C1177w<Boolean> getSaveFinish() {
        return this.saveFinish;
    }

    public final C1177w<List<TabData>> getSelectedTabs() {
        return this.selectedTabs;
    }

    public final C1177w<List<TabData>> getUnSelectedTabs() {
        return this.unSelectedTabs;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.f$a */
    static final class C47275a extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47275a INSTANCE = new C47275a();

        C47275a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-category-edit");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…lk-moment-category-edit\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    public final void getTabs() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47276b(this, null), 2, null);
    }

    public final void setCurrentTabId(String str) {
        this.currentTabId = str;
    }

    public final void setCurrentSelected(String str) {
        Intrinsics.checkParameterIsNotNull(str, "selectedId");
        this.currentTabId = str;
    }

    public final void saveTabsOrder(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "ids");
        if (idsNoChange(arrayList, this.originalTabIds)) {
            this.noNeedToRequestOrder.mo5926a((Boolean) true);
        } else {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47277c(this, arrayList, null), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.categoryedit.MomentsEditCategoryViewModel$saveTabsOrder$1", mo239173f = "MomentsEditCategoryViewModel.kt", mo239174i = {0}, mo239175l = {102}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.f$c */
    static final class C47277c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList $ids;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsEditCategoryViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47277c(MomentsEditCategoryViewModel fVar, ArrayList arrayList, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$ids = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47277c cVar2 = new C47277c(this.this$0, this.$ids, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47277c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                ArrayList<String> arrayList = this.$ids;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167235a(arrayList, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj == null) {
                z = false;
            }
            this.this$0.getSaveFinish().mo5926a(C69089a.m265837a(z));
            return Unit.INSTANCE;
        }
    }

    public final void setSelectedTabs(List<Tab> list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        CategoryState categoryState;
        if (list != null) {
            List<Tab> list2 = list;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(it.next().id);
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        this.originalTabIds = arrayList;
        C1177w<List<TabData>> wVar = this.selectedTabs;
        if (list != null) {
            List<Tab> list3 = list;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (T t : list3) {
                String str = t.id;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.id");
                String str2 = t.name;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.name");
                String str3 = t.icon_key;
                Intrinsics.checkExpressionValueIsNotNull(str3, "it.icon_key");
                Boolean bool = t.can_remove;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it.can_remove");
                boolean booleanValue = bool.booleanValue();
                if (Intrinsics.areEqual(this.currentTabId, t.id)) {
                    categoryState = CategoryState.CURRENT_CATEGORY_IN_MY;
                } else {
                    categoryState = CategoryState.MY_CATEGORY;
                }
                arrayList4.add(new TabData(str, str2, str3, booleanValue, categoryState));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = new ArrayList();
        }
        wVar.mo5929b(arrayList2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.categoryedit.MomentsEditCategoryViewModel$getTabs$1", mo239173f = "MomentsEditCategoryViewModel.kt", mo239174i = {0}, mo239175l = {TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.f$b */
    static final class C47276b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsEditCategoryViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47276b(MomentsEditCategoryViewModel fVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47276b bVar = new C47276b(this.this$0, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47276b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            List<Tab> list;
            CategoryState categoryState;
            String str;
            Iterator it;
            CategoryState categoryState2;
            CategoryState categoryState3;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                this.L$0 = ahVar;
                this.label = 1;
                obj2 = bVar.mo167250d(this);
                if (obj2 == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ListTabsResponse listTabsResponse = (ListTabsResponse) obj2;
            if (listTabsResponse == null || (list = listTabsResponse.tabs) == null) {
                this.this$0.getUnSelectedTabs().mo5926a(new ArrayList());
                return Unit.INSTANCE;
            }
            ArrayList b = this.this$0.getSelectedTabs().mo5927b();
            if (b == null) {
                b = new ArrayList();
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "(selectedTabs.value ?: ArrayList())");
            List<TabData> list2 = b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().mo166160a());
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            List<Tab> list3 = list;
            for (T t : list3) {
                if (!t.can_remove.booleanValue()) {
                    String str2 = t.id;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.id");
                    String str3 = t.name;
                    Intrinsics.checkExpressionValueIsNotNull(str3, "it.name");
                    String str4 = t.icon_key;
                    Intrinsics.checkExpressionValueIsNotNull(str4, "it.icon_key");
                    Boolean bool = t.can_remove;
                    Intrinsics.checkExpressionValueIsNotNull(bool, "it.can_remove");
                    boolean booleanValue = bool.booleanValue();
                    if (Intrinsics.areEqual(this.this$0.getCurrentTabId(), t.id)) {
                        categoryState3 = CategoryState.CURRENT_CATEGORY_IN_MY;
                    } else {
                        categoryState3 = CategoryState.MY_CATEGORY;
                    }
                    arrayList3.add(new TabData(str2, str3, str4, booleanValue, categoryState3));
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str5 = (String) it3.next();
                for (T t2 : list3) {
                    if (Intrinsics.areEqual(str5, t2.id)) {
                        Boolean bool2 = t2.can_remove;
                        Intrinsics.checkExpressionValueIsNotNull(bool2, "it.can_remove");
                        if (bool2.booleanValue()) {
                            String str6 = t2.id;
                            Intrinsics.checkExpressionValueIsNotNull(str6, "it.id");
                            String str7 = t2.name;
                            Intrinsics.checkExpressionValueIsNotNull(str7, "it.name");
                            it = it3;
                            String str8 = t2.icon_key;
                            Intrinsics.checkExpressionValueIsNotNull(str8, "it.icon_key");
                            str = str5;
                            Boolean bool3 = t2.can_remove;
                            Intrinsics.checkExpressionValueIsNotNull(bool3, "it.can_remove");
                            boolean booleanValue2 = bool3.booleanValue();
                            if (Intrinsics.areEqual(this.this$0.getCurrentTabId(), t2.id)) {
                                categoryState2 = CategoryState.CURRENT_CATEGORY_IN_MY;
                            } else {
                                categoryState2 = CategoryState.MY_CATEGORY;
                            }
                            arrayList3.add(new TabData(str6, str7, str8, booleanValue2, categoryState2));
                            it3 = it;
                            str5 = str;
                        }
                    }
                    it = it3;
                    str = str5;
                    it3 = it;
                    str5 = str;
                }
            }
            ArrayList<TabData> arrayList5 = arrayList3;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
            for (TabData hVar : arrayList5) {
                arrayList6.add(hVar.mo166160a());
            }
            ArrayList arrayList7 = arrayList6;
            ArrayList arrayList8 = new ArrayList();
            for (T t3 : list3) {
                if (C69089a.m265837a(!arrayList7.contains(t3.id)).booleanValue()) {
                    arrayList8.add(t3);
                }
            }
            ArrayList arrayList9 = arrayList8;
            ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
            for (Iterator it4 = arrayList9.iterator(); it4.hasNext(); it4 = it4) {
                Tab tab = (Tab) it4.next();
                String str9 = tab.id;
                Intrinsics.checkExpressionValueIsNotNull(str9, "it.id");
                String str10 = tab.name;
                Intrinsics.checkExpressionValueIsNotNull(str10, "it.name");
                String str11 = tab.icon_key;
                Intrinsics.checkExpressionValueIsNotNull(str11, "it.icon_key");
                Boolean bool4 = tab.can_remove;
                Intrinsics.checkExpressionValueIsNotNull(bool4, "it.can_remove");
                boolean booleanValue3 = bool4.booleanValue();
                if (Intrinsics.areEqual(this.this$0.getCurrentTabId(), tab.id)) {
                    categoryState = CategoryState.CURRENT_CATEGORY_IN_MORE;
                } else {
                    categoryState = CategoryState.MORE_CATEGORY;
                }
                arrayList10.add(new TabData(str9, str10, str11, booleanValue3, categoryState));
            }
            arrayList4.addAll(arrayList10);
            this.this$0.getSelectedTabs().mo5926a(arrayList3);
            this.this$0.getUnSelectedTabs().mo5926a(arrayList4);
            if (arrayList2.size() != arrayList7.size()) {
                this.this$0.getForceRefresh().mo5926a(C69089a.m265837a(true));
                return Unit.INSTANCE;
            }
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!Intrinsics.areEqual((String) arrayList2.get(i2), (String) arrayList7.get(i2))) {
                    this.this$0.getForceRefresh().mo5926a(C69089a.m265837a(true));
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final boolean idsNoChange(List<String> list, List<String> list2) {
        if (list2 == null || list.size() != list2.size()) {
            return false;
        }
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!Intrinsics.areEqual(t, list2.get(i))) {
                return false;
            }
            i = i2;
        }
        return true;
    }
}
