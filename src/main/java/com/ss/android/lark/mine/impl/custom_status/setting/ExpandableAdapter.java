package com.ss.android.lark.mine.impl.custom_status.setting;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00020\u00020\u0005:\u000245B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\"\u0010\u001c\u001a\u00020\u000e2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u000eH\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010 \u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\tH\u0016J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0002J\u0010\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0016J\u001d\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00028\u00022\u0006\u0010(\u001a\u00028\u0002H&¢\u0006\u0002\u0010)J\u001d\u0010*\u001a\u00020&2\u0006\u0010'\u001a\u00028\u00022\u0006\u0010(\u001a\u00028\u0002H&¢\u0006\u0002\u0010)J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-2\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-2\u0006\u0010 \u001a\u00020\tJ*\u0010.\u001a\u00020\u001a2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00020\u00142\b\b\u0002\u00100\u001a\u00020\u000e2\b\b\u0002\u00101\u001a\u00020&H\u0002J(\u00102\u001a\u00020\u001a2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u00101\u001a\u00020&J&\u0010!\u001a\u00020\t*\u00020\u000e2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00020\u00142\b\b\u0002\u00103\u001a\u00020\tH\u0002J.\u0010\"\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010#\u001a\u00020\t2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00020\u00142\b\b\u0002\u00103\u001a\u00020\tH\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter;", "Item", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Footer", "Data", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "context", "Landroid/content/Context;", "threshold", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "displayState", "Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DisplayState;", "getDisplayState", "()Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DisplayState;", "setDisplayState", "(Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DisplayState;)V", "items", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "collapse", "", "expand", "generateDisplayState", "dataList", "defaultDisplayState", "getDisplayStateFromViewType", "viewType", "getItemCount", "getItemViewStatus", "position", "getItemViewType", "isDataContentTheSame", "", "oldData", "newData", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "isDataTheSame", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "update", "newItems", "newDisplayState", "detectMoves", "updateValue", "th", "DiffCallback", "DisplayState", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class ExpandableAdapter<Item extends RecyclerView.ViewHolder, Footer extends RecyclerView.ViewHolder, Data> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private List<? extends Data> f115231a = CollectionsKt.emptyList();

    /* renamed from: b */
    private DisplayState f115232b = m180951a(this, null, null, 3, null);

    /* renamed from: c */
    private final Context f115233c;

    /* renamed from: d */
    private final int f115234d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DisplayState;", "", "(Ljava/lang/String;I)V", "Normal", "ShowExpand", "ShowCollapse", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DisplayState {
        Normal,
        ShowExpand,
        ShowCollapse
    }

    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo160706a(ViewGroup viewGroup, DisplayState displayState);

    /* renamed from: a */
    public abstract boolean mo160709a(Data data, Data data2);

    /* renamed from: b */
    public abstract boolean mo160711b(Data data, Data data2);

    /* renamed from: b */
    public final DisplayState mo160710b() {
        return this.f115232b;
    }

    /* renamed from: e */
    public final Context mo160714e() {
        return this.f115233c;
    }

    /* renamed from: a */
    public final void mo160708a(List<? extends Data> list, DisplayState displayState, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "newItems");
        Intrinsics.checkParameterIsNotNull(displayState, "defaultDisplayState");
        DisplayState a = m180952a((List) list, displayState);
        if (!(a == DisplayState.Normal || this.f115232b == DisplayState.Normal)) {
            a = this.f115232b;
        }
        m180956b(list, a, z);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "newItems", "", "newDisplayState", "Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DisplayState;", "(Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter;Ljava/util/List;Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DisplayState;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.ExpandableAdapter$a */
    public final class DiffCallback extends C1374g.AbstractC1376a {

        /* renamed from: a */
        final /* synthetic */ ExpandableAdapter f115235a;

        /* renamed from: b */
        private final List<Data> f115236b;

        /* renamed from: c */
        private final DisplayState f115237c;

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public int mo7380a() {
            return this.f115235a.getItemCount();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public int mo7382b() {
            return ExpandableAdapter.m180948a(this.f115235a, this.f115237c, this.f115236b, 0, 2, (Object) null);
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public boolean mo7381a(int i, int i2) {
            ExpandableAdapter expandableAdapter = this.f115235a;
            DisplayState a = ExpandableAdapter.m180950a(expandableAdapter, expandableAdapter.mo160710b(), i, null, 0, 6, null);
            if (a != ExpandableAdapter.m180950a(this.f115235a, this.f115237c, i2, this.f115236b, 0, 4, null)) {
                return false;
            }
            if (C45639a.f115267a[a.ordinal()] != 1) {
                return true;
            }
            ExpandableAdapter expandableAdapter2 = this.f115235a;
            return expandableAdapter2.mo160709a((Object) expandableAdapter2.mo160707a().get(i), (Object) this.f115236b.get(i2));
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public boolean mo7383b(int i, int i2) {
            ExpandableAdapter expandableAdapter = this.f115235a;
            DisplayState a = ExpandableAdapter.m180950a(expandableAdapter, expandableAdapter.mo160710b(), i, null, 0, 6, null);
            if (a != ExpandableAdapter.m180950a(this.f115235a, this.f115237c, i2, this.f115236b, 0, 4, null)) {
                return false;
            }
            if (C45639a.f115268b[a.ordinal()] != 1) {
                return true;
            }
            ExpandableAdapter expandableAdapter2 = this.f115235a;
            return expandableAdapter2.mo160711b(expandableAdapter2.mo160707a().get(i), this.f115236b.get(i2));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends Data> */
        /* JADX WARN: Multi-variable type inference failed */
        public DiffCallback(ExpandableAdapter expandableAdapter, List<? extends Data> list, DisplayState displayState) {
            Intrinsics.checkParameterIsNotNull(list, "newItems");
            Intrinsics.checkParameterIsNotNull(displayState, "newDisplayState");
            this.f115235a = expandableAdapter;
            this.f115236b = list;
            this.f115237c = displayState;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends Data>, java.util.List<Data> */
    /* renamed from: a */
    public final List<Data> mo160707a() {
        return (List<? extends Data>) this.f115231a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return m180948a(this, this.f115232b, (List) null, 0, 3, (Object) null);
    }

    /* renamed from: c */
    public final void mo160712c() {
        if (this.f115232b != DisplayState.Normal) {
            m180953a((ExpandableAdapter) this, (List) this.f115231a, DisplayState.ShowCollapse, false, 4, (Object) null);
        }
    }

    /* renamed from: d */
    public final void mo160713d() {
        if (this.f115232b != DisplayState.Normal) {
            m180953a((ExpandableAdapter) this, (List) this.f115231a, DisplayState.ShowExpand, false, 4, (Object) null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return m180946a(i);
    }

    /* renamed from: a */
    private final int m180946a(int i) {
        return m180950a(this, this.f115232b, i, null, 0, 6, null).ordinal();
    }

    /* renamed from: b */
    private final DisplayState m180954b(int i) {
        if (i >= DisplayState.values().length || i < 0) {
            return null;
        }
        return DisplayState.values()[i];
    }

    public ExpandableAdapter(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f115233c = context;
        this.f115234d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        DisplayState b = m180954b(i);
        if (b != null) {
            return mo160706a(viewGroup, b);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: a */
    private final DisplayState m180952a(List<? extends Data> list, DisplayState displayState) {
        if (list.size() <= this.f115234d) {
            return DisplayState.Normal;
        }
        if (displayState != DisplayState.Normal) {
            return displayState;
        }
        return DisplayState.ShowExpand;
    }

    /* renamed from: a */
    private final int m180947a(DisplayState displayState, List<? extends Data> list, int i) {
        int i2 = C45640b.f115269a[displayState.ordinal()];
        if (i2 == 1) {
            return list.size();
        }
        if (i2 == 2) {
            return i;
        }
        if (i2 == 3) {
            return list.size() + 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    private final void m180956b(List<? extends Data> list, DisplayState displayState, boolean z) {
        C1374g.C1377b a = C1374g.m6298a(new DiffCallback(this, list, displayState), z);
        Intrinsics.checkExpressionValueIsNotNull(a, "DiffUtil.calculateDiff(D…splayState), detectMoves)");
        this.f115231a = list;
        this.f115232b = displayState;
        a.mo7412a(this);
    }

    /* renamed from: a */
    private final DisplayState m180949a(DisplayState displayState, int i, List<? extends Data> list, int i2) {
        int i3 = C45640b.f115270b[this.f115232b.ordinal()];
        if (i3 == 1) {
            return DisplayState.Normal;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            } else if (i + 1 < m180947a(displayState, list, i2)) {
                return DisplayState.Normal;
            } else {
                return DisplayState.ShowCollapse;
            }
        } else if (i + 1 < m180947a(displayState, list, i2)) {
            return DisplayState.Normal;
        } else {
            return DisplayState.ShowExpand;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mine.impl.custom_status.setting.ExpandableAdapter */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ DisplayState m180951a(ExpandableAdapter expandableAdapter, List list, DisplayState displayState, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                list = expandableAdapter.f115231a;
            }
            if ((i & 2) != 0) {
                displayState = DisplayState.ShowExpand;
            }
            return expandableAdapter.m180952a(list, displayState);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateDisplayState");
    }

    /* renamed from: b */
    public static /* synthetic */ void m180955b(ExpandableAdapter expandableAdapter, List list, DisplayState displayState, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                displayState = DisplayState.ShowExpand;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            expandableAdapter.mo160708a(list, displayState, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateValue");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mine.impl.custom_status.setting.ExpandableAdapter */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ int m180948a(ExpandableAdapter expandableAdapter, DisplayState displayState, List list, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                list = expandableAdapter.f115231a;
            }
            if ((i2 & 2) != 0) {
                i = expandableAdapter.f115234d;
            }
            return expandableAdapter.m180947a(displayState, list, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getItemCount");
    }

    /* renamed from: a */
    static /* synthetic */ void m180953a(ExpandableAdapter expandableAdapter, List list, DisplayState displayState, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                displayState = m180951a(expandableAdapter, list, null, 2, null);
            }
            if ((i & 4) != 0) {
                z = true;
            }
            expandableAdapter.m180956b(list, displayState, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mine.impl.custom_status.setting.ExpandableAdapter */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ DisplayState m180950a(ExpandableAdapter expandableAdapter, DisplayState displayState, int i, List list, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                list = expandableAdapter.f115231a;
            }
            if ((i3 & 4) != 0) {
                i2 = expandableAdapter.f115234d;
            }
            return expandableAdapter.m180949a(displayState, i, list, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getItemViewStatus");
    }
}
