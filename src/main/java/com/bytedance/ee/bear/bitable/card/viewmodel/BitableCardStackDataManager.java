package com.bytedance.ee.bear.bitable.card.viewmodel;

import android.text.TextUtils;
import com.bytedance.ee.bear.bitable.card.model.enums.ETableType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000f\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u000eJ.\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0019\u001a\u0004\u0018\u00010\fJ\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J\u001b\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ\u0016\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\fJ\u0006\u0010#\u001a\u00020\u000eJ\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\fJ\u000e\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\tJ\u000e\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\tR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/viewmodel/BitableCardStackDataManager;", "", "()V", "linkTableConfigCache", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/bitable/card/viewmodel/BitableCardStackDataManager$LinkTableConfig;", "Lkotlin/collections/ArrayList;", "tableChangedObservers", "", "Lcom/bytedance/ee/bear/bitable/card/viewmodel/BitableCardStackChangedObserver;", "tableStack", "Ljava/util/Stack;", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;", "addCurrentLinkTableConfig", "", "linkTableConfig", "clearTable", "findMatchedTables", "baseId", "", "tableId", "tableType", "Lcom/bytedance/ee/bear/bitable/card/model/enums/ETableType;", "findTableIndexWithId", "", "getBottomTable", "getCurrentLinkTableConfig", "getLinkRecordIds", "", "linkTable", "(Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;)[Ljava/lang/String;", "getTableStack", "notifyAvailableTableUpdated", "tableIndex", "updatedTable", "popTable", "pushTable", "table", "registerTableChangedObserver", "observer", "unregisterTableChangedObserver", "Companion", "LinkTableConfig", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableCardStackDataManager {

    /* renamed from: a */
    public static final Companion f14013a = new Companion(null);

    /* renamed from: b */
    private final Stack<C4535b> f14014b = new Stack<>();

    /* renamed from: c */
    private final ArrayList<LinkTableConfig> f14015c = new ArrayList<>();

    /* renamed from: d */
    private final List<BitableCardStackChangedObserver> f14016d = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0002\u0010\u001dJ\u0011\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/viewmodel/BitableCardStackDataManager$LinkTableConfig;", "Lcom/bytedance/ee/util/io/NonProguard;", "linkTable", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;", "linkRecordIds", "", "", "activeRecordId", "(Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;[Ljava/lang/String;Ljava/lang/String;)V", "getActiveRecordId", "()Ljava/lang/String;", "setActiveRecordId", "(Ljava/lang/String;)V", "isLinkTableDataFetched", "", "()Z", "setLinkTableDataFetched", "(Z)V", "getLinkRecordIds", "()[Ljava/lang/String;", "setLinkRecordIds", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "getLinkTable", "()Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;", "setLinkTable", "(Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;)V", "getFetchLeftRecordIds", "currentFarLeftRecordId", "(Ljava/lang/String;)[Ljava/lang/String;", "getFetchRightRecordIds", "currentFarRightRecordId", "getFirstFetchRecordIds", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class LinkTableConfig implements NonProguard {
        private String activeRecordId;
        private boolean isLinkTableDataFetched;
        private String[] linkRecordIds;
        private C4535b linkTable;

        public final String getActiveRecordId() {
            return this.activeRecordId;
        }

        public final String[] getLinkRecordIds() {
            return this.linkRecordIds;
        }

        public final C4535b getLinkTable() {
            return this.linkTable;
        }

        public final boolean isLinkTableDataFetched() {
            return this.isLinkTableDataFetched;
        }

        public final String[] getFirstFetchRecordIds() {
            int i;
            int c = C69043h.m265770c(this.linkRecordIds, this.activeRecordId);
            int i2 = 0;
            if (c < 0) {
                return new String[0];
            }
            if (c > 5) {
                i2 = c - 5;
            }
            String[] strArr = this.linkRecordIds;
            if ((strArr.length - 1) - c > 5) {
                i = c + 5;
            } else {
                i = strArr.length - 1;
            }
            return (String[]) C69043h.m265724a(strArr, i2, i + 1);
        }

        public final void setLinkTableDataFetched(boolean z) {
            this.isLinkTableDataFetched = z;
        }

        public final void setActiveRecordId(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.activeRecordId = str;
        }

        public final void setLinkRecordIds(String[] strArr) {
            Intrinsics.checkParameterIsNotNull(strArr, "<set-?>");
            this.linkRecordIds = strArr;
        }

        public final void setLinkTable(C4535b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
            this.linkTable = bVar;
        }

        public final String[] getFetchLeftRecordIds(String str) {
            Intrinsics.checkParameterIsNotNull(str, "currentFarLeftRecordId");
            int c = C69043h.m265770c(this.linkRecordIds, str);
            int i = 0;
            if (c <= 0) {
                return new String[0];
            }
            if (c > 5) {
                i = c - 5;
            }
            return (String[]) C69043h.m265724a(this.linkRecordIds, i, c);
        }

        public final String[] getFetchRightRecordIds(String str) {
            int i;
            Intrinsics.checkParameterIsNotNull(str, "currentFarRightRecordId");
            int c = C69043h.m265770c(this.linkRecordIds, str);
            if (c >= 0) {
                String[] strArr = this.linkRecordIds;
                if (c < strArr.length - 1) {
                    if ((strArr.length - 1) - c > 5) {
                        i = c + 5;
                    } else {
                        i = strArr.length - 1;
                    }
                    return (String[]) C69043h.m265724a(strArr, c + 1, i + 1);
                }
            }
            return new String[0];
        }

        public LinkTableConfig(C4535b bVar, String[] strArr, String str) {
            Intrinsics.checkParameterIsNotNull(bVar, "linkTable");
            Intrinsics.checkParameterIsNotNull(strArr, "linkRecordIds");
            Intrinsics.checkParameterIsNotNull(str, "activeRecordId");
            this.linkTable = bVar;
            this.linkRecordIds = strArr;
            this.activeRecordId = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/viewmodel/BitableCardStackDataManager$Companion;", "", "()V", "OFFSET", "", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardStackDataManager$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public final Stack<C4535b> mo18525d() {
        return this.f14014b;
    }

    /* renamed from: c */
    public final C4535b mo18524c() {
        boolean z;
        Stack<C4535b> stack = this.f14014b;
        if (stack == null || stack.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return this.f14014b.firstElement();
    }

    /* renamed from: e */
    public final LinkTableConfig mo18526e() {
        if (this.f14015c.isEmpty()) {
            return null;
        }
        return (LinkTableConfig) CollectionsKt.last((List) this.f14015c);
    }

    /* renamed from: b */
    public final void mo18521b() {
        C13479a.m54764b("BitableCardStackDataManager", "clearTable()...");
        int size = this.f14014b.size();
        this.f14014b.clear();
        this.f14015c.clear();
        List<BitableCardStackChangedObserver> list = this.f14016d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo17945a(size, 0, this.f14014b);
            arrayList.add(Unit.INSTANCE);
        }
    }

    /* renamed from: a */
    public final void mo18516a() {
        C13479a.m54764b("BitableCardStackDataManager", "popTable()...");
        if (this.f14014b.size() > 0) {
            this.f14014b.pop();
            List<BitableCardStackChangedObserver> list = this.f14016d;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo17945a(this.f14014b.size() + 1, this.f14014b.size(), this.f14014b);
                arrayList.add(Unit.INSTANCE);
            }
        }
    }

    /* renamed from: a */
    public final void mo18519a(LinkTableConfig linkTableConfig) {
        Intrinsics.checkParameterIsNotNull(linkTableConfig, "linkTableConfig");
        this.f14015c.add(linkTableConfig);
    }

    /* renamed from: b */
    public final void mo18522b(BitableCardStackChangedObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        this.f14016d.remove(aVar);
    }

    /* renamed from: a */
    public final void mo18520a(BitableCardStackChangedObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        if (!this.f14016d.contains(aVar)) {
            this.f14016d.add(aVar);
        }
    }

    /* renamed from: a */
    public final int mo18514a(String str) {
        T t;
        if (str == null) {
            return -1;
        }
        Stack<C4535b> stack = this.f14014b;
        Iterator<T> it = stack.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            Intrinsics.checkExpressionValueIsNotNull(t2, "it");
            if (TextUtils.equals(t2.mo17767b(), str)) {
                break;
            }
        }
        return stack.indexOf(t);
    }

    /* renamed from: b */
    public final String[] mo18523b(C4535b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "linkTable");
        ArrayList<LinkTableConfig> arrayList = this.f14015c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (T t : arrayList) {
            if (Intrinsics.areEqual(t.getLinkTable(), bVar)) {
                return t.getLinkRecordIds();
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo18518a(C4535b bVar) {
        ETableType eTableType;
        Intrinsics.checkParameterIsNotNull(bVar, "table");
        C13479a.m54764b("BitableCardStackDataManager", "pushTable()...");
        Stack<C4535b> stack = this.f14014b;
        if (stack.size() == 0) {
            eTableType = ETableType.NORMAL;
        } else {
            eTableType = ETableType.LINK;
        }
        bVar.mo17760a(eTableType);
        stack.add(bVar);
        List<BitableCardStackChangedObserver> list = this.f14016d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo17945a(this.f14014b.size() - 1, this.f14014b.size(), this.f14014b);
            arrayList.add(Unit.INSTANCE);
        }
    }

    /* renamed from: a */
    public final void mo18517a(int i, C4535b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "updatedTable");
        if (i >= 0 && i <= this.f14014b.size() - 1) {
            if (this.f14014b.get(i) != bVar) {
                this.f14014b.setElementAt(bVar, i);
                C13479a.m54772d("BitableCardStackDataManager", "notifyAvailableTableUpdated, reset updatedTable, tableIndex = " + i);
            }
            List<BitableCardStackChangedObserver> list = this.f14016d;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C4535b bVar2 = this.f14014b.get(i);
                Intrinsics.checkExpressionValueIsNotNull(bVar2, "tableStack[tableIndex]");
                it.next().mo17946a(i, bVar2);
                arrayList.add(Unit.INSTANCE);
            }
        }
    }

    /* renamed from: a */
    public final ArrayList<C4535b> mo18515a(String str, String str2, ETableType eTableType) {
        Intrinsics.checkParameterIsNotNull(str, "baseId");
        Intrinsics.checkParameterIsNotNull(str2, "tableId");
        Intrinsics.checkParameterIsNotNull(eTableType, "tableType");
        ArrayList<C4535b> arrayList = new ArrayList<>();
        Stack<C4535b> stack = this.f14014b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(stack, 10));
        for (T t : stack) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            if (TextUtils.equals(str, t.mo17757a()) && TextUtils.equals(str2, t.mo17767b()) && eTableType == t.mo17788m()) {
                arrayList.add(t);
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return arrayList;
    }
}
