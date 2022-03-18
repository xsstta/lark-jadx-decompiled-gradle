package com.bytedance.ee.bear.bitable.viewlist;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0012J\u0016\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0016R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "active", "Landroidx/lifecycle/MutableLiveData;", "", "getActive", "()Landroidx/lifecycle/MutableLiveData;", "delegate", "Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListViewModel$Delegate;", "getDelegate", "()Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListViewModel$Delegate;", "setDelegate", "(Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListViewModel$Delegate;)V", "viewList", "Lcom/bytedance/ee/bear/bitable/viewlist/BiTableViewList;", "getViewList", "addView", "", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/bitable/viewlist/BiTableViewType;", "title", "", "deleteView", "viewId", "exitView", "renameView", "newTitle", "setActive", "switchView", "Companion", "Delegate", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.viewlist.c */
public final class BitableViewListViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private final C1177w<Boolean> active = new C1177w<>();
    private Delegate delegate;
    private final C1177w<BiTableViewList> viewList = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListViewModel$Delegate;", "", "onDoAction", "", "tableId", "", "action", "payload", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.c$b */
    public interface Delegate {
        /* renamed from: a */
        void mo19009a(String str, String str2, Map<String, String> map);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListViewModel$Companion;", "", "()V", "ADD", "", "DELETE", "EXIT", "RENAME", "SWITCH", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<Boolean> getActive() {
        return this.active;
    }

    public final Delegate getDelegate() {
        return this.delegate;
    }

    public final C1177w<BiTableViewList> getViewList() {
        return this.viewList;
    }

    public final void exitView() {
        String tableId;
        Delegate bVar;
        BiTableViewList b = this.viewList.mo5927b();
        if (b != null && (tableId = b.getTableId()) != null && (bVar = this.delegate) != null) {
            bVar.mo19009a(tableId, "exit", MapsKt.emptyMap());
        }
    }

    public final void setDelegate(Delegate bVar) {
        this.delegate = bVar;
    }

    public final void setActive(boolean z) {
        this.active.mo5929b(Boolean.valueOf(z));
    }

    public final void deleteView(String str) {
        String tableId;
        Delegate bVar;
        Intrinsics.checkParameterIsNotNull(str, "viewId");
        BiTableViewList b = this.viewList.mo5927b();
        if (b != null && (tableId = b.getTableId()) != null && (bVar = this.delegate) != null) {
            bVar.mo19009a(tableId, "delete", MapsKt.mapOf(TuplesKt.to("id", str)));
        }
    }

    public final void switchView(String str) {
        String tableId;
        Delegate bVar;
        Intrinsics.checkParameterIsNotNull(str, "viewId");
        BiTableViewList b = this.viewList.mo5927b();
        if (b != null && (tableId = b.getTableId()) != null && (bVar = this.delegate) != null) {
            bVar.mo19009a(tableId, "switch", MapsKt.mapOf(TuplesKt.to("id", str)));
        }
    }

    public final void renameView(String str, String str2) {
        String tableId;
        Delegate bVar;
        Intrinsics.checkParameterIsNotNull(str, "viewId");
        Intrinsics.checkParameterIsNotNull(str2, "newTitle");
        BiTableViewList b = this.viewList.mo5927b();
        if (b != null && (tableId = b.getTableId()) != null && (bVar = this.delegate) != null) {
            bVar.mo19009a(tableId, "rename", MapsKt.mapOf(TuplesKt.to("id", str), TuplesKt.to("title", str2)));
        }
    }

    public final void addView(BiTableViewType biTableViewType, String str) {
        String tableId;
        Delegate bVar;
        Intrinsics.checkParameterIsNotNull(biTableViewType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str, "title");
        BiTableViewList b = this.viewList.mo5927b();
        if (b != null && (tableId = b.getTableId()) != null && (bVar = this.delegate) != null) {
            Pair[] pairArr = new Pair[2];
            String name = biTableViewType.name();
            Locale locale = Locale.ENGLISH;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ENGLISH");
            if (name != null) {
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                pairArr[0] = TuplesKt.to(ShareHitPoint.f121869d, lowerCase);
                pairArr[1] = TuplesKt.to("title", str);
                bVar.mo19009a(tableId, "add", MapsKt.mapOf(pairArr));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }
}
