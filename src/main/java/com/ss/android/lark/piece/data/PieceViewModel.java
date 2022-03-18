package com.ss.android.lark.piece.data;

import androidx.lifecycle.AbstractC1142af;
import com.ss.android.lark.piece.core.PieceContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\bJ\b\u0010\u0019\u001a\u00020\u0016H\u0014J\u001e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\bR.\u0010\u0003\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b0\u00070\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/piece/data/PieceViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "dataObserverMap", "Lkotlin/Lazy;", "", "", "", "Lcom/ss/android/lark/piece/data/DataObserver;", "pieceContext", "Lcom/ss/android/lark/piece/core/PieceContext;", "getPieceContext", "()Lcom/ss/android/lark/piece/core/PieceContext;", "setPieceContext", "(Lcom/ss/android/lark/piece/core/PieceContext;)V", "sharedData", "Lcom/ss/android/lark/piece/data/SharedData;", "getSharedData", "()Lcom/ss/android/lark/piece/data/SharedData;", "setSharedData", "(Lcom/ss/android/lark/piece/data/SharedData;)V", "observeSharedData", "", "key", "observer", "onCleared", "unObserveSharedData", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.piece.a.b */
public class PieceViewModel extends AbstractC1142af {
    private final Lazy<Map<Object, List<DataObserver<? extends Object>>>> dataObserverMap = LazyKt.lazy(C51466a.INSTANCE);
    private PieceContext pieceContext;
    public SharedData sharedData;

    public final PieceContext getPieceContext() {
        return this.pieceContext;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "", "Lcom/ss/android/lark/piece/data/DataObserver;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.piece.a.b$a */
    static final class C51466a extends Lambda implements Function0<Map<Object, List<DataObserver<? extends Object>>>> {
        public static final C51466a INSTANCE = new C51466a();

        C51466a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<Object, List<DataObserver<? extends Object>>> invoke() {
            return new LinkedHashMap();
        }
    }

    public final SharedData getSharedData() {
        SharedData cVar = this.sharedData;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedData");
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        if (this.dataObserverMap.isInitialized()) {
            for (Map.Entry<Object, List<DataObserver<? extends Object>>> entry : this.dataObserverMap.getValue().entrySet()) {
                Object key = entry.getKey();
                for (DataObserver<? extends Object> aVar : entry.getValue()) {
                    SharedData cVar = this.sharedData;
                    if (cVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sharedData");
                    }
                    cVar.mo177170b(key, aVar);
                }
            }
            this.dataObserverMap.getValue().clear();
        }
        super.onCleared();
    }

    public final void setPieceContext(PieceContext bVar) {
        this.pieceContext = bVar;
    }

    public final void setSharedData(SharedData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "<set-?>");
        this.sharedData = cVar;
    }

    public final void unObserveSharedData(Object obj, DataObserver<? extends Object> aVar) {
        List<DataObserver<? extends Object>> list;
        Intrinsics.checkParameterIsNotNull(obj, "key");
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        SharedData cVar = this.sharedData;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedData");
        }
        cVar.mo177170b(obj, aVar);
        if (this.dataObserverMap.isInitialized() && (list = this.dataObserverMap.getValue().get(obj)) != null) {
            list.remove(aVar);
        }
    }

    public final void observeSharedData(Object obj, DataObserver<? extends Object> aVar) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        ArrayList arrayList = this.dataObserverMap.getValue().get(obj);
        if (arrayList == null || !arrayList.contains(aVar)) {
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.dataObserverMap.getValue().put(obj, arrayList);
            }
            arrayList.add(aVar);
            SharedData cVar = this.sharedData;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedData");
            }
            cVar.mo177167a(obj, aVar);
        }
    }
}
