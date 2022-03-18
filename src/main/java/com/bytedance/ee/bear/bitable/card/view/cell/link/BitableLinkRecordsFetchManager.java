package com.bytedance.ee.bear.bitable.card.view.cell.link;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher;
import com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0011\u0018\u0000 -2\u00020\u0001:\u0002-.B\u0005¢\u0006\u0002\u0010\u0002J>\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J3\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001e¢\u0006\u0002\u0010\u001fJ(\u0010 \u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u001e\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012J2\u0010!\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u001e\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0012J\u0016\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J\u001a\u0010$\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012J\u000e\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000bJ\u0010\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0010\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\rJ\u001a\u0010+\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012J\u000e\u0010,\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/BitableLinkRecordsFetchManager;", "Landroidx/lifecycle/ViewModel;", "()V", "mCardFetcher", "Lcom/bytedance/ee/bear/bitable/card/viewmodel/fetch/ICardFetcher;", "mCurrentLinkTableMeta", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;", "mIsWaitingForDataLoadedAction", "", "mLinkTableListeners", "", "Lcom/bytedance/ee/bear/bitable/card/view/cell/link/BitableLinkRecordsFetchManager$OnLinkTableListener;", "mOperationUpdater", "Lcom/bytedance/ee/bear/bitable/card/viewmodel/update/IOperationUpdater;", "addLinkedRecord", "", "tableMeta", "recordId", "", "fieldId", "linkTableMeta", "editLinkFieldId", "editLinkFieldValue", "", "backwardLinkTable", "fetchTableData", "Lio/reactivex/Single;", "baseId", "tableId", "recordIds", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lio/reactivex/Single;", "fetchTableRecordIds", "fetchTableRecordIdsByKeyword", "keyword", "forwardLinkTable", "notifyLinkTableChanged", "registerLinkTableListener", "listener", "setCardFetcher", "cardFetcher", "setOperationUpdater", "operationUpdater", "shouldInterceptLinkTableDataLoadedAction", "unregisterLinkTableListener", "Companion", "OnLinkTableListener", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.a */
public final class BitableLinkRecordsFetchManager extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    public ICardFetcher mCardFetcher;
    private C4535b mCurrentLinkTableMeta;
    private boolean mIsWaitingForDataLoadedAction;
    private final List<OnLinkTableListener> mLinkTableListeners = new ArrayList();
    private AbstractC4774b mOperationUpdater;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/BitableLinkRecordsFetchManager$OnLinkTableListener;", "", "onLinkTableChanged", "", "linkBaseId", "", "linkTableId", "onLinkTableDataLoaded", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.a$b */
    public interface OnLinkTableListener {
        /* renamed from: a */
        void mo18145a(String str, String str2);

        /* renamed from: b */
        void mo18146b(String str, String str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/BitableLinkRecordsFetchManager$Companion;", "", "()V", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void setCardFetcher(ICardFetcher iCardFetcher) {
        this.mCardFetcher = iCardFetcher;
    }

    public final void setOperationUpdater(AbstractC4774b bVar) {
        this.mOperationUpdater = bVar;
    }

    public final void unregisterLinkTableListener(OnLinkTableListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.mLinkTableListeners.remove(bVar);
    }

    public final void registerLinkTableListener(OnLinkTableListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        if (!this.mLinkTableListeners.contains(bVar)) {
            this.mLinkTableListeners.add(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;", "kotlin.jvm.PlatformType", "table", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.a$c */
    public static final class C4611c<T, R> implements Function<T, AbstractC69015w<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ BitableLinkRecordsFetchManager f13614a;

        /* renamed from: b */
        final /* synthetic */ String[] f13615b;

        C4611c(BitableLinkRecordsFetchManager aVar, String[] strArr) {
            this.f13614a = aVar;
            this.f13615b = strArr;
        }

        /* renamed from: a */
        public final Single<C4535b> apply(final C4535b bVar) {
            Single<List<C4525a>> a;
            Intrinsics.checkParameterIsNotNull(bVar, "table");
            C13479a.m54772d("BitableLinkRecordsFetchManager", "fetchTableData()... fetch link table meta success");
            ICardFetcher iCardFetcher = this.f13614a.mCardFetcher;
            if (iCardFetcher == null || (a = iCardFetcher.mo18633a(bVar, this.f13615b)) == null) {
                return null;
            }
            return a.map(new Function<T, R>() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.link.BitableLinkRecordsFetchManager.C4611c.C46121 */

                /* renamed from: a */
                public final C4535b apply(List<? extends C4525a> list) {
                    Intrinsics.checkParameterIsNotNull(list, "records");
                    C13479a.m54772d("BitableLinkRecordsFetchManager", "fetchTableData()... fetch link table data success");
                    bVar.mo17764a((List<C4525a>) list);
                    return bVar;
                }
            });
        }
    }

    public final Single<String[]> fetchTableRecordIds(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "baseId");
        Intrinsics.checkParameterIsNotNull(str2, "tableId");
        C13479a.m54772d("BitableLinkRecordsFetchManager", "fetchTableRecordIds()...");
        ICardFetcher iCardFetcher = this.mCardFetcher;
        if (iCardFetcher != null) {
            return iCardFetcher.mo18634a(str, str2);
        }
        return null;
    }

    public final void forwardLinkTable(C4535b bVar, C4535b bVar2) {
        Intrinsics.checkParameterIsNotNull(bVar, "tableMeta");
        Intrinsics.checkParameterIsNotNull(bVar2, "linkTableMeta");
        C13479a.m54772d("BitableLinkRecordsFetchManager", "forwardLinkTable()...");
        this.mIsWaitingForDataLoadedAction = true;
        this.mCurrentLinkTableMeta = bVar2;
        AbstractC4774b bVar3 = this.mOperationUpdater;
        if (bVar3 != null) {
            bVar3.mo18616a(bVar.mo17757a(), bVar.mo17767b(), bVar2.mo17757a(), bVar2.mo17767b());
        }
    }

    public final void backwardLinkTable(C4535b bVar, C4535b bVar2) {
        Intrinsics.checkParameterIsNotNull(bVar, "tableMeta");
        Intrinsics.checkParameterIsNotNull(bVar2, "linkTableMeta");
        C4535b bVar3 = this.mCurrentLinkTableMeta;
        if (bVar3 != null) {
            String a = bVar2.mo17757a();
            String b = bVar2.mo17767b();
            if (TextUtils.equals(bVar3.mo17757a(), a) && TextUtils.equals(bVar3.mo17767b(), b)) {
                this.mIsWaitingForDataLoadedAction = false;
                this.mCurrentLinkTableMeta = null;
                C13479a.m54772d("BitableLinkRecordsFetchManager", "backwardLinkTable()...");
                AbstractC4774b bVar4 = this.mOperationUpdater;
                if (bVar4 != null) {
                    bVar4.mo18618b(bVar.mo17757a(), bVar.mo17767b(), a, b);
                }
            }
        }
    }

    public final void notifyLinkTableChanged(String str, String str2) {
        C4535b bVar;
        C13479a.m54772d("BitableLinkRecordsFetchManager", "notifyLinkTableChanged()... baseId = " + str + ", tableId = " + str2);
        if (!this.mIsWaitingForDataLoadedAction && (bVar = this.mCurrentLinkTableMeta) != null && TextUtils.equals(bVar.mo17757a(), str) && TextUtils.equals(bVar.mo17767b(), str2)) {
            List<OnLinkTableListener> list = this.mLinkTableListeners;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo18146b(str, str2);
                arrayList.add(Unit.INSTANCE);
            }
        }
    }

    public final boolean shouldInterceptLinkTableDataLoadedAction(String str, String str2) {
        C13479a.m54764b("BitableLinkRecordsFetchManager", "shouldInterceptLinkTableRecordsDataLoadedAction()... result = " + this.mIsWaitingForDataLoadedAction);
        if (!this.mIsWaitingForDataLoadedAction) {
            return false;
        }
        C4535b bVar = this.mCurrentLinkTableMeta;
        if (bVar == null || !TextUtils.equals(bVar.mo17757a(), str) || !TextUtils.equals(bVar.mo17767b(), str2)) {
            return true;
        }
        this.mIsWaitingForDataLoadedAction = false;
        List<OnLinkTableListener> list = this.mLinkTableListeners;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo18145a(str, str2);
            arrayList.add(Unit.INSTANCE);
        }
        return true;
    }

    public final Single<String[]> fetchTableRecordIdsByKeyword(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "baseId");
        Intrinsics.checkParameterIsNotNull(str2, "tableId");
        C13479a.m54772d("BitableLinkRecordsFetchManager", "fetchTableRecordsByKeyword()...");
        ICardFetcher iCardFetcher = this.mCardFetcher;
        if (iCardFetcher != null) {
            return iCardFetcher.mo18637b(str, str2, str3);
        }
        return null;
    }

    public final Single<C4535b> fetchTableData(String str, String str2, String[] strArr) {
        Single<C4535b> a;
        Intrinsics.checkParameterIsNotNull(str, "baseId");
        Intrinsics.checkParameterIsNotNull(str2, "tableId");
        Intrinsics.checkParameterIsNotNull(strArr, "recordIds");
        C13479a.m54772d("BitableLinkRecordsFetchManager", "fetchTableData()...");
        ICardFetcher iCardFetcher = this.mCardFetcher;
        if (iCardFetcher == null || (a = iCardFetcher.mo18635a(str, str2, "")) == null) {
            return null;
        }
        return a.flatMap(new C4611c(this, strArr));
    }

    public final void addLinkedRecord(C4535b bVar, String str, String str2, C4535b bVar2, String str3, Object obj) {
        Intrinsics.checkParameterIsNotNull(bVar, "tableMeta");
        Intrinsics.checkParameterIsNotNull(bVar2, "linkTableMeta");
        AbstractC4774b bVar3 = this.mOperationUpdater;
        if (bVar3 != null) {
            bVar3.mo18613a(bVar, str, str2, bVar2, str3, obj);
        }
    }
}
