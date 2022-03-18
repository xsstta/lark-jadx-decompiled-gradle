package com.bytedance.ee.bear.bitable.card.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.bitable.card.model.enums.ETableType;
import com.bytedance.ee.bear.bitable.card.model.enums.EViewType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.CardActionModel;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.commands.FieldCommandResultCode;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.commands.SetFieldAttrBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.common.ColorBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.common.ColorListResult;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.common.CommonActionType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.permission.PermissionRequestBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.permission.PermissionResult;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4533g;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.AttachmentFollowData;
import com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardStackDataManager;
import com.bytedance.ee.bear.bitable.card.viewmodel.fetch.EFieldTypeUnMatchException;
import com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher;
import com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b;
import com.bytedance.ee.bear.doc.follow.impl.BaseFollowImpl;
import com.bytedance.ee.log.C13479a;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.b */
public class C4771b extends AbstractC1142af {
    private C1174u<Boolean> active = new C1174u<>();
    private ICardFetcher cardFetcher;
    private ColorBean[] commonColorList;
    private C1177w<Boolean> enableFollow = new C1177w<>();
    private boolean enableNotifyUserWhenMentioned = true;
    private volatile boolean isFetchingTable;
    private volatile boolean isNotifyTableShowing;
    private C1177w<Boolean> landscape = new C1177w<>();
    private C1174u<AttachmentFollowData> mAttachmentEntity = new C1174u<>();
    private C1174u<String> mTopFieldId = new C1174u<>();
    private AbstractC4774b operationUpdater;
    private Runnable pendingFetchLinkTableDataTask;
    private C1177w<Boolean> showOpenErrorToast = new C1177w<>();
    private BitableCardStackDataManager tableDataManager = new BitableCardStackDataManager();
    private List<AbstractC4772a> viewPagerDelegates = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.b$a */
    public interface AbstractC4772a {
        /* renamed from: a */
        void mo18452a(String str);

        int getCurrentIndex();

        void setCurrentIndex(String str);
    }

    public LiveData<Boolean> getActive() {
        return this.active;
    }

    public C1174u<AttachmentFollowData> getAttachmentEntity() {
        return this.mAttachmentEntity;
    }

    public ColorBean[] getCommonColorList() {
        return this.commonColorList;
    }

    public C1177w<Boolean> getEnableFollow() {
        return this.enableFollow;
    }

    public boolean getEnableNotifyUserWhenMentioned() {
        return this.enableNotifyUserWhenMentioned;
    }

    public C1177w<Boolean> getLandscape() {
        return this.landscape;
    }

    public LiveData<Boolean> getShowOpenErrorToast() {
        return this.showOpenErrorToast;
    }

    public C1174u<String> getTopFieldId() {
        return this.mTopFieldId;
    }

    /* access modifiers changed from: package-private */
    public void notifyTableClose() {
        closeBitable();
    }

    public void fetchRecordsPagingLeft() {
        fetchRecordsWhenPaging(ICardFetcher.FetchMode.FETCH_LEFT);
    }

    public void fetchRecordsPagingRight() {
        fetchRecordsWhenPaging(ICardFetcher.FetchMode.FETCH_RIGHT);
    }

    public Stack<C4535b> getTableStack() {
        return this.tableDataManager.mo18525d();
    }

    public void cancelAddRecord() {
        AbstractC4774b bVar;
        C4535b showingTable = getShowingTable();
        if (showingTable != null && (bVar = this.operationUpdater) != null) {
            bVar.mo18619c(showingTable.mo17757a(), showingTable.mo17767b());
        }
    }

    public void confirmAddRecord() {
        AbstractC4774b bVar;
        C4535b showingTable = getShowingTable();
        if (showingTable != null && (bVar = this.operationUpdater) != null) {
            bVar.mo18617b(showingTable.mo17757a(), showingTable.mo17767b());
        }
    }

    public void confirmForm() {
        AbstractC4774b bVar;
        C4535b showingTable = getShowingTable();
        if (showingTable != null && (bVar = this.operationUpdater) != null) {
            bVar.mo18620d(showingTable.mo17757a(), showingTable.mo17767b());
        }
    }

    public void fetchCommonDataIfNecessary() {
        fetchCommonData(CommonActionType.COLOR_LIST, null, ColorListResult.class).subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$IcL8Glzfx1pasavosfkr8Nb9Tk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4771b.this.lambda$fetchCommonDataIfNecessary$26$b((ColorListResult) obj);
            }
        }, $$Lambda$b$tAjvPCuxJ1qASJ6T18EYaururGs.INSTANCE);
    }

    public C4535b getShowingTable() {
        Stack<C4535b> tableStack = getTableStack();
        if (!tableStack.isEmpty()) {
            return tableStack.peek();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void notifyCurrentRecordFiltered() {
        C4535b c = this.tableDataManager.mo18524c();
        String showingRecordId = getShowingRecordId(c);
        if (c != null && showingRecordId != null) {
            this.cardFetcher.mo18631a(c, showingRecordId).subscribe(new Consumer(c) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$arU0oCC4iogLflX6aPb0vMvTunw */
                public final /* synthetic */ C4535b f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4771b.this.lambda$notifyCurrentRecordFiltered$14$b(this.f$1, (C4525a) obj);
                }
            }, $$Lambda$b$9bgOyRyPx0Ga4vA3g8PUl0dG5bs.INSTANCE);
        }
    }

    public void closeBitable() {
        C4535b showingTable = getShowingTable();
        if (showingTable != null) {
            exitRecord(showingTable.mo17757a(), showingTable.mo17767b());
            this.active.mo5929b((Boolean) false);
        }
        this.viewPagerDelegates.clear();
        this.tableDataManager.mo18521b();
        this.pendingFetchLinkTableDataTask = null;
    }

    /* access modifiers changed from: package-private */
    public void notifyFieldsUpdate() {
        C4535b c = this.tableDataManager.mo18524c();
        String showingRecordId = getShowingRecordId(c);
        if (c != null && showingRecordId != null) {
            fetchTableData(c.mo17757a(), c.mo17767b(), c.mo17775e().mo17793b(), showingRecordId).subscribe(new Consumer() {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$9qoMrWFLEyxozgZQnQGdMz4DoM */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4771b.this.lambda$notifyFieldsUpdate$12$b((C4535b) obj);
                }
            }, $$Lambda$b$2S8UT8rRjAtDpv4HYJfZ7qVXtt0.INSTANCE);
        }
    }

    public /* synthetic */ void lambda$fetchTableData$25$b(Throwable th) throws Exception {
        this.isFetchingTable = false;
    }

    /* access modifiers changed from: package-private */
    public void setCardFetcher(ICardFetcher iCardFetcher) {
        this.cardFetcher = iCardFetcher;
    }

    /* access modifiers changed from: package-private */
    public void setOperationUpdater(AbstractC4774b bVar) {
        this.operationUpdater = bVar;
    }

    public Single<FieldCommandResultCode> executeFieldAttrCommands(SetFieldAttrBean setFieldAttrBean) {
        return this.cardFetcher.mo18629a(setFieldAttrBean);
    }

    public Single<PermissionResult> fetchPermissionsData(PermissionRequestBean[] permissionRequestBeanArr) {
        return this.cardFetcher.mo18636a(permissionRequestBeanArr);
    }

    public /* synthetic */ void lambda$fetchCommonDataIfNecessary$26$b(ColorListResult colorListResult) throws Exception {
        this.commonColorList = colorListResult.getColorList();
    }

    public /* synthetic */ void lambda$notifyFieldsUpdate$12$b(C4535b bVar) throws Exception {
        updateTableIfNeed(0, bVar);
    }

    public /* synthetic */ void lambda$null$9$b(C4535b bVar) throws Exception {
        updateTableIfNeed(0, bVar);
    }

    public void registerTableChangedObserver(BitableCardStackChangedObserver aVar) {
        this.tableDataManager.mo18520a(aVar);
    }

    public void sendFollowData(String str) {
        this.mTopFieldId.mo5929b(str);
    }

    public void unregisterTableChangedObserver(BitableCardStackChangedObserver aVar) {
        this.tableDataManager.mo18522b(aVar);
    }

    public void unregisterViewPagerDelegate(AbstractC4772a aVar) {
        this.viewPagerDelegates.remove(aVar);
    }

    public void updateAttachment(AttachmentFollowData attachmentFollowData) {
        this.mAttachmentEntity.mo5929b(attachmentFollowData);
    }

    public void registerViewPagerDelegate(AbstractC4772a aVar) {
        if (!this.viewPagerDelegates.contains(aVar)) {
            this.viewPagerDelegates.add(aVar);
        }
    }

    public /* synthetic */ void lambda$notifyLinkTableShowing$18$b(Throwable th) throws Exception {
        C13479a.m54759a("BitableCardViewModel", "notifyTableRecordsDataLoaded(), fetch link records data fail", th);
        this.showOpenErrorToast.mo5929b((Boolean) true);
    }

    /* access modifiers changed from: package-private */
    public void notifyRecordsUpdate(String str) {
        if (this.isFetchingTable) {
            C13479a.m54764b("BitableCardViewModel", "notifyRecordsUpdate, fetchTableData is in progress, ignore it");
            return;
        }
        C4535b c = this.tableDataManager.mo18524c();
        if (c != null) {
            this.cardFetcher.mo18632a(c, str, ICardFetcher.FetchMode.FETCH_UPDATE).subscribe(new Consumer(c) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$aW44DZV9vvNaDVv1kx3o0VTwiE */
                public final /* synthetic */ C4535b f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4771b.this.lambda$notifyRecordsUpdate$8$b(this.f$1, (List) obj);
                }
            }, new Consumer(c, str) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$Z2zlsApio45W74c9ducsYyTnW14 */
                public final /* synthetic */ C4535b f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4771b.this.lambda$notifyRecordsUpdate$11$b(this.f$1, this.f$2, (Throwable) obj);
                }
            });
        }
    }

    public void scrollCard(String str) {
        List<AbstractC4772a> list = this.viewPagerDelegates;
        if (list != null && list.size() > 0) {
            C4535b showingTable = getShowingTable();
            if (showingTable == null) {
                C13479a.m54758a("BitableCardViewModel", "no table shown!");
                return;
            }
            int a = this.tableDataManager.mo18514a(showingTable.mo17767b());
            if (a == -1) {
                C13479a.m54758a("BitableCardViewModel", "cannot find table!");
            } else {
                this.viewPagerDelegates.get(a).mo18452a(str);
            }
        }
    }

    public void switchCard(String str) {
        List<AbstractC4772a> list = this.viewPagerDelegates;
        if (list != null && list.size() > 0) {
            C4535b showingTable = getShowingTable();
            if (showingTable == null) {
                C13479a.m54758a("BitableCardViewModel", "no table shown!");
                return;
            }
            int a = this.tableDataManager.mo18514a(showingTable.mo17767b());
            if (a == -1) {
                C13479a.m54758a("BitableCardViewModel", "cannot find table!");
            } else {
                this.viewPagerDelegates.get(a).setCurrentIndex(str);
            }
        }
    }

    private void fetchRecordsWhenPaging(ICardFetcher.FetchMode fetchMode) {
        C4535b showingTable;
        BitableCardStackDataManager.LinkTableConfig e;
        String[] strArr;
        String showingRecordId;
        if ((fetchMode == ICardFetcher.FetchMode.FETCH_LEFT || fetchMode == ICardFetcher.FetchMode.FETCH_RIGHT) && (showingTable = getShowingTable()) != null) {
            List<C4525a> i = showingTable.mo17784i();
            if (showingTable.mo17788m() == ETableType.NORMAL && (showingRecordId = getShowingRecordId(showingTable)) != null) {
                this.cardFetcher.mo18632a(showingTable, showingRecordId, fetchMode).subscribe(new Consumer(fetchMode, i, showingTable) {
                    /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$NlYPkjTtKERqBkPrkGj012gkZ18 */
                    public final /* synthetic */ ICardFetcher.FetchMode f$1;
                    public final /* synthetic */ List f$2;
                    public final /* synthetic */ C4535b f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C4771b.this.lambda$fetchRecordsWhenPaging$0$b(this.f$1, this.f$2, this.f$3, (List) obj);
                    }
                }, $$Lambda$b$usGDoFGHHObMtsuh6G2M9OGHUKs.INSTANCE);
            }
            if (showingTable.mo17788m() == ETableType.LINK && (e = this.tableDataManager.mo18526e()) != null) {
                if (fetchMode == ICardFetcher.FetchMode.FETCH_LEFT) {
                    strArr = e.getFetchLeftRecordIds(i.get(0).mo17707b());
                } else {
                    strArr = e.getFetchRightRecordIds(i.get(i.size() - 1).mo17707b());
                }
                if (strArr.length != 0) {
                    this.cardFetcher.mo18633a(showingTable, strArr).subscribe(new Consumer(fetchMode, i, showingTable) {
                        /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$jd1GEcNMbF0GEj03q5gLOyN92e8 */
                        public final /* synthetic */ ICardFetcher.FetchMode f$1;
                        public final /* synthetic */ List f$2;
                        public final /* synthetic */ C4535b f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C4771b.this.lambda$fetchRecordsWhenPaging$2$b(this.f$1, this.f$2, this.f$3, (List) obj);
                        }
                    }, $$Lambda$b$Pe0XOYIP7R7DgYzfYxRfQct4WRY.INSTANCE);
                }
            }
        }
    }

    private String getShowingRecordId(C4535b bVar) {
        if (bVar == null) {
            C13479a.m54758a("BitableCardViewModel", "getShowingRecordId failed, table is null");
            return null;
        }
        List<C4525a> i = bVar.mo17784i();
        if (i == null || i.isEmpty()) {
            C13479a.m54775e("BitableCardViewModel", "getShowingRecordId failed, no record showing");
            return null;
        } else if (this.viewPagerDelegates.isEmpty()) {
            return i.get(0).mo17707b();
        } else {
            int indexOf = getTableStack().indexOf(bVar);
            if (indexOf < 0) {
                C13479a.m54758a("BitableCardViewModel", "getShowingRecordId failed, table is not exist in table stack");
                return null;
            }
            int currentIndex = this.viewPagerDelegates.get(indexOf).getCurrentIndex();
            if (currentIndex >= 0 && currentIndex < i.size()) {
                return i.get(currentIndex).mo17707b();
            }
            C13479a.m54758a("BitableCardViewModel", "getShowingRecordId failed, showingRecordIndex is" + currentIndex);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyFormFieldValidate(Map<String, CardActionModel.ErrorBean> map) {
        C4525a h;
        C4535b c = this.tableDataManager.mo18524c();
        if (c == null) {
            C13479a.m54758a("BitableCardViewModel", "notifyFormFieldValidate, currentTable is null");
        }
        for (Map.Entry<String, CardActionModel.ErrorBean> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                C13479a.m54758a("BitableCardViewModel", "notifyFormFieldValidate, entry key or value is null");
            } else {
                CardActionModel.ErrorBean value = entry.getValue();
                C4533g g = c.mo17779g(entry.getKey());
                if (g != null && !TextUtils.isEmpty(value.errorMsg)) {
                    g.mo17746c(value.errorMsg);
                }
            }
        }
        String showingRecordId = getShowingRecordId(c);
        if (!(showingRecordId == null || (h = c.mo17781h(showingRecordId)) == null)) {
            for (C4537a aVar : h.mo17714h()) {
                if (!TextUtils.isEmpty(aVar.mo17829a().mo17754k())) {
                    aVar.mo17831a(2);
                }
            }
        }
        updateTableIfNeed(0, c);
    }

    public void exitRecord(String str, String str2) {
        AbstractC4774b bVar = this.operationUpdater;
        if (bVar != null) {
            bVar.mo18615a(str, str2);
        }
    }

    public void deleteRecord(C4535b bVar, String str) {
        C4535b showingTable = getShowingTable();
        AbstractC4774b bVar2 = this.operationUpdater;
        if (bVar2 != null && showingTable != null && bVar != null) {
            bVar2.mo18609a(showingTable, bVar, str);
        }
    }

    public /* synthetic */ void lambda$notifyCurrentRecordFiltered$14$b(C4535b bVar, C4525a aVar) throws Exception {
        List<C4525a> i = bVar.mo17784i();
        i.clear();
        i.add(aVar);
        updateTableIfNeed(0, bVar);
    }

    public void switchRecord(String str, String str2) {
        C4535b showingTable = getShowingTable();
        AbstractC4774b bVar = this.operationUpdater;
        if (bVar != null && showingTable != null) {
            bVar.mo18612a(showingTable, str, str2);
        }
    }

    private void updateTableIfNeed(int i, C4535b bVar) {
        if (Boolean.TRUE.equals(this.active.mo5927b())) {
            this.tableDataManager.mo18517a(i, bVar);
        }
    }

    public void backwardLinkTable(String str, String str2) {
        AbstractC4774b bVar;
        C4535b showingTable = getShowingTable();
        if (!(showingTable == null || (bVar = this.operationUpdater) == null)) {
            bVar.mo18618b(showingTable.mo17757a(), showingTable.mo17767b(), str, str2);
        }
        this.tableDataManager.mo18516a();
    }

    public /* synthetic */ Single lambda$fetchTableData$24$b(String str, C4535b bVar) throws Exception {
        return this.cardFetcher.mo18632a(bVar, str, ICardFetcher.FetchMode.FETCH_UPDATE).map(new Function(bVar) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$yCCOHzAFAjp6tk5RIrHzxg5kwU */
            public final /* synthetic */ C4535b f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4771b.this.lambda$null$23$b(this.f$1, (List) obj);
            }
        });
    }

    public /* synthetic */ void lambda$notifyRecordsUpdate$8$b(C4535b bVar, List list) throws Exception {
        C13479a.m54764b("BitableCardViewModel_fetchData", "fetch record update: " + list);
        bVar.mo17764a(list);
        updateTableIfNeed(0, bVar);
    }

    public /* synthetic */ C4535b lambda$null$23$b(C4535b bVar, List list) throws Exception {
        C13479a.m54764b("BitableCardViewModel_fetchData", "fetch record update: " + list);
        this.isFetchingTable = false;
        bVar.mo17764a(list);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public void notifyTableRecordsDataLoaded(String str, String str2) {
        BitableCardStackDataManager.LinkTableConfig e = this.tableDataManager.mo18526e();
        if (e == null || e.isLinkTableDataFetched()) {
            this.pendingFetchLinkTableDataTask = new Runnable(str, str2) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$Fdjvj4rPDih4KEX9l9hUeKnMBNo */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C4771b.this.lambda$notifyTableRecordsDataLoaded$16$b(this.f$1, this.f$2);
                }
            };
        } else {
            lambda$notifyTableRecordsDataLoaded$16$b(str, str2);
        }
    }

    public void forwardLinkTable(String[] strArr, C4525a aVar) {
        AbstractC4774b bVar;
        C4535b showingTable = getShowingTable();
        String a = aVar.mo17705a().mo17757a();
        String b = aVar.mo17705a().mo17767b();
        if (showingTable != null && (bVar = this.operationUpdater) != null) {
            bVar.mo18616a(showingTable.mo17757a(), showingTable.mo17767b(), a, b);
            C13479a.m54764b("BitableCardViewModel", "forwardLinkTable, start fetch link table meta");
            this.cardFetcher.mo18635a(a, b, "").subscribe(new Consumer(strArr, aVar) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$caEnHdOcTzjFMh_Cn9CnWYKid0M */
                public final /* synthetic */ String[] f$1;
                public final /* synthetic */ C4525a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4771b.this.lambda$forwardLinkTable$4$b(this.f$1, this.f$2, (C4535b) obj);
                }
            }, $$Lambda$b$7wIjwfRF7tLXze9T1D0ksJCSy9A.INSTANCE);
        }
    }

    public /* synthetic */ void lambda$notifyLinkTableChanged$21$b(List list, C4535b bVar) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4535b bVar2 = (C4535b) it.next();
            int indexOf = getTableStack().indexOf(bVar2);
            bVar2.mo17761a(bVar);
            this.cardFetcher.mo18633a(bVar2, this.tableDataManager.mo18523b(bVar2)).subscribe(new Consumer(indexOf, bVar2) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$eWYfXzDhi13o7Qa9mKvBto1jn4Q */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ C4535b f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4771b.this.lambda$null$19$b(this.f$1, this.f$2, (List) obj);
                }
            }, new Consumer(indexOf) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$fo3M3PrB_DvC6_xMghBh2Dm4h28 */
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    C13479a.m54758a((int) "BitableCardViewModel", (Throwable) ("notifyLinkTableChanged, fetch data success, tableIndex = " + this.f$0));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyLinkTableChanged(String str, String str2) {
        ArrayList<C4535b> a = this.tableDataManager.mo18515a(str, str2, ETableType.LINK);
        if (!a.isEmpty()) {
            this.cardFetcher.mo18635a(str, str2, "").subscribe(new Consumer(a) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$fsuL3xEg6URy8_5zo9CNslX7vJg */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4771b.this.lambda$notifyLinkTableChanged$21$b(this.f$1, (C4535b) obj);
                }
            }, $$Lambda$b$S4omSpURQ0FcBca4zQdi4hfDRw8.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: notifyLinkTableShowing */
    public void lambda$notifyTableRecordsDataLoaded$16$b(String str, String str2) {
        BitableCardStackDataManager.LinkTableConfig e = this.tableDataManager.mo18526e();
        if (e == null) {
            C13479a.m54758a("BitableCardViewModel", "notifyLinkTableShowing, currentLinkTableConfig is null, return");
            return;
        }
        C4535b linkTable = e.getLinkTable();
        if (!e.isLinkTableDataFetched() && TextUtils.equals(linkTable.mo17757a(), str) && TextUtils.equals(linkTable.mo17767b(), str2)) {
            e.setLinkTableDataFetched(true);
            C13479a.m54764b("BitableCardViewModel", "notifyLinkTableShowing, start fetch link records data");
            this.cardFetcher.mo18633a(linkTable, e.getFirstFetchRecordIds()).subscribe(new Consumer(linkTable, e) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$ujopp6Jh5OOWdDFaoCdM6j6IRm8 */
                public final /* synthetic */ C4535b f$1;
                public final /* synthetic */ BitableCardStackDataManager.LinkTableConfig f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4771b.this.lambda$notifyLinkTableShowing$17$b(this.f$1, this.f$2, (List) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$dASStF0pii69rsDuiAl8_pmYxY */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4771b.this.lambda$notifyLinkTableShowing$18$b((Throwable) obj);
                }
            });
        }
    }

    public <T> Single<T> fetchCommonData(CommonActionType commonActionType, JSONObject jSONObject, Class<T> cls) {
        return this.cardFetcher.mo18630a(commonActionType, jSONObject, cls);
    }

    public void backwardTable(String str, String str2, ETableType eTableType) {
        if (eTableType == ETableType.LINK) {
            backwardLinkTable(str, str2);
        } else {
            closeBitable();
        }
    }

    public /* synthetic */ void lambda$notifyLinkTableShowing$17$b(C4535b bVar, BitableCardStackDataManager.LinkTableConfig linkTableConfig, List list) throws Exception {
        C13479a.m54764b("BitableCardViewModel", "notifyLinkTableShowing, fetch link records data success");
        bVar.mo17764a(list);
        bVar.mo17778f(linkTableConfig.getActiveRecordId());
        this.tableDataManager.mo18518a(bVar);
    }

    public /* synthetic */ void lambda$notifyTableShowing$7$b(String str, String str2, Throwable th) throws Exception {
        this.showOpenErrorToast.mo5929b((Boolean) true);
        exitRecord(str, str2);
        this.isNotifyTableShowing = false;
    }

    public /* synthetic */ void lambda$forwardLinkTable$4$b(String[] strArr, C4525a aVar, C4535b bVar) throws Exception {
        C13479a.m54764b("BitableCardViewModel", "forwardLinkTable, fetch link table meta success");
        bVar.mo17775e().mo17792a(EViewType.GRID);
        this.tableDataManager.mo18519a(new BitableCardStackDataManager.LinkTableConfig(bVar, strArr, aVar.mo17707b()));
        Runnable runnable = this.pendingFetchLinkTableDataTask;
        if (runnable != null) {
            runnable.run();
            this.pendingFetchLinkTableDataTask = null;
        }
    }

    public /* synthetic */ void lambda$notifyRecordsUpdate$11$b(C4535b bVar, String str, Throwable th) throws Exception {
        C13479a.m54759a("BitableCardViewModel", "notifyRecordsUpdate fail", th);
        if (th instanceof EFieldTypeUnMatchException) {
            fetchTableData(bVar.mo17757a(), bVar.mo17767b(), bVar.mo17775e().mo17793b(), str).subscribe(new Consumer() {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$1558bfoeB2PQEtobJ7SJN61B07M */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4771b.this.lambda$null$9$b((C4535b) obj);
                }
            }, $$Lambda$b$eDOsVUqCmgV_O8AoX58HFLlfOzI.INSTANCE);
        }
    }

    public /* synthetic */ void lambda$null$19$b(int i, C4535b bVar, List list) throws Exception {
        C13479a.m54764b("BitableCardViewModel", "notifyLinkTableChanged, fetch data success, tableIndex = " + i);
        bVar.mo17764a(list);
        bVar.mo17760a(ETableType.LINK);
        updateTableIfNeed(i, bVar);
    }

    private Single<C4535b> fetchTableData(String str, String str2, String str3, String str4) {
        this.isFetchingTable = true;
        return this.cardFetcher.mo18635a(str, str2, str3).flatMap(new Function(str4) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$vM3fJJbmNCdGSwGuWI_n3Z0sfww */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4771b.this.lambda$fetchTableData$24$b(this.f$1, (C4535b) obj);
            }
        }).doOnError(new Consumer() {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$u5pyDyOWfaRRDw5oKDTLo9IN5jo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4771b.this.lambda$fetchTableData$25$b((Throwable) obj);
            }
        });
    }

    public void closeEditPanel(C4535b bVar, String str, String str2, boolean z) {
        boolean z2;
        this.enableNotifyUserWhenMentioned = z;
        C4535b showingTable = getShowingTable();
        AbstractC4774b bVar2 = this.operationUpdater;
        if (bVar2 != null && showingTable != null && bVar != null) {
            if (!z || EViewType.FORM.equals(getShowingTable().mo17775e().mo17794c())) {
                z2 = false;
            } else {
                z2 = true;
            }
            bVar2.mo18611a(showingTable, bVar, str, str2, z2);
        }
    }

    public /* synthetic */ void lambda$fetchRecordsWhenPaging$0$b(ICardFetcher.FetchMode fetchMode, List list, C4535b bVar, List list2) throws Exception {
        C13479a.m54764b("BitableCardViewModel_fetchData", "fetchRecordsWhenPaging success, tableType = " + ETableType.NORMAL + ", fetchMode = " + fetchMode);
        if (fetchMode == ICardFetcher.FetchMode.FETCH_LEFT) {
            list.addAll(0, list2);
        } else {
            list.addAll(list2);
        }
        updateTableIfNeed(getTableStack().size() - 1, bVar);
    }

    public /* synthetic */ void lambda$fetchRecordsWhenPaging$2$b(ICardFetcher.FetchMode fetchMode, List list, C4535b bVar, List list2) throws Exception {
        C13479a.m54764b("BitableCardViewModel_fetchData", "fetchRecordsWhenPaging success, tableType = " + ETableType.LINK + ", fetchMode = " + fetchMode);
        if (fetchMode == ICardFetcher.FetchMode.FETCH_LEFT) {
            list.addAll(0, list2);
        } else {
            list.addAll(list2);
        }
        updateTableIfNeed(getTableStack().size() - 1, bVar);
    }

    public void editRecord(C4535b bVar, String str, String str2, String str3, Object obj) {
        C4535b showingTable = getShowingTable();
        AbstractC4774b bVar2 = this.operationUpdater;
        if (bVar2 != null && showingTable != null && bVar != null) {
            bVar2.mo18610a(showingTable, bVar, str, str2, str3, obj);
        }
    }

    public /* synthetic */ void lambda$notifyTableShowing$6$b(String str, String str2, int i, boolean z, C4535b bVar) throws Exception {
        bVar.mo17778f(str);
        bVar.mo17776e(str2);
        bVar.mo17758a(i);
        bVar.mo17772c(z);
        this.tableDataManager.mo18521b();
        this.tableDataManager.mo18518a(bVar);
        this.active.mo5929b((Boolean) true);
        this.isNotifyTableShowing = false;
        AbstractC4774b bVar2 = this.operationUpdater;
        if (bVar2 != null && bVar != null) {
            bVar2.mo18608a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyTableShowing(String str, String str2, String str3, String str4, String str5, int i, boolean z, BaseFollowImpl baseFollowImpl) {
        if (this.isNotifyTableShowing) {
            C13479a.m54772d("BitableCardViewModel", "debounce... notifyTableShowing is in progress");
            return;
        }
        this.isNotifyTableShowing = true;
        fetchTableData(str, str2, str3, str4).subscribe(new Consumer(str4, str5, i, z) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$QyRqYBLjvnJefQ33sLRorvzeV40 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ boolean f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4771b.this.lambda$notifyTableShowing$6$b(this.f$1, this.f$2, this.f$3, this.f$4, (C4535b) obj);
            }
        }, new Consumer(str, str2) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$b$_MN0W130UvNrNy8ObyGPMAe_6U */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4771b.this.lambda$notifyTableShowing$7$b(this.f$1, this.f$2, (Throwable) obj);
            }
        });
    }
}
