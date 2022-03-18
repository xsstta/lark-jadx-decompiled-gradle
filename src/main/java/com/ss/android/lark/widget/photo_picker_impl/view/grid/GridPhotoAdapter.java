package com.ss.android.lark.widget.photo_picker_impl.view.grid;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import com.ss.android.lark.widget.photo_picker_impl.view.base.IShowPluginFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002'(B'\u0012 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00040\u00070\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000bJ\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u001c\u0010 \u001a\u00020\u001a2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010#\u001a\u00020$J\u0014\u0010%\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000bX\u0004¢\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00040\u00070\u0006X\u0004¢\u0006\u0002\n\u0000RF\u0010\f\u001a:\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00040\u00070\rj\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007`\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridPhotoAdapter;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mFactory", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/IShowPluginFactory;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridShowPlugin;", "(Lcom/ss/android/lark/widget/photo_picker_impl/view/base/IShowPluginFactory;)V", "mData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "mOnItemClickListener", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridPhotoAdapter$IOnItemClickListener;", "getData", "getItemCount", "getItemViewType", "position", "getPositionById", "id", "(I)Ljava/lang/Integer;", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "", "updateAll", "", "setOnItemClickListener", "listener", "DiffCallback", "IOnItemClickListener", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.b.b */
public final class GridPhotoAdapter<DATA extends Photo> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public IOnItemClickListener<DATA> f145780a;

    /* renamed from: b */
    private final ArrayList<DATA> f145781b = new ArrayList<>();

    /* renamed from: c */
    private final HashMap<Integer, GridShowPlugin<DATA, ? extends RecyclerView.ViewHolder>> f145782c = new HashMap<>();

    /* renamed from: d */
    private final IShowPluginFactory<DATA, GridShowPlugin<DATA, ? extends RecyclerView.ViewHolder>> f145783d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridPhotoAdapter$IOnItemClickListener;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "", "onClick", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "position", "", "(Landroid/view/View;Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;I)V", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.b.b$b */
    public interface IOnItemClickListener<DATA extends Photo> {
        /* renamed from: a */
        void mo199652a(View view, DATA data, int i);
    }

    /* renamed from: a */
    public final ArrayList<DATA> mo199654a() {
        return this.f145781b;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridPhotoAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "mOld", "", "mNew", "(Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridPhotoAdapter;Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.b.b$a */
    public final class DiffCallback extends C1374g.AbstractC1376a {

        /* renamed from: a */
        final /* synthetic */ GridPhotoAdapter f145784a;

        /* renamed from: b */
        private final List<DATA> f145785b;

        /* renamed from: c */
        private final List<DATA> f145786c;

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public int mo7380a() {
            return this.f145785b.size();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public int mo7382b() {
            return this.f145786c.size();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public boolean mo7381a(int i, int i2) {
            return this.f145785b.get(i).mo199594a(this.f145786c.get(i2));
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public boolean mo7383b(int i, int i2) {
            return this.f145785b.get(i).mo199598b(this.f145786c.get(i2));
        }

        public DiffCallback(GridPhotoAdapter bVar, List<DATA> list, List<DATA> list2) {
            Intrinsics.checkParameterIsNotNull(list, "mOld");
            Intrinsics.checkParameterIsNotNull(list2, "mNew");
            this.f145784a = bVar;
            this.f145785b = list;
            this.f145786c = list2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f145781b.size();
    }

    /* renamed from: a */
    public final void mo199655a(IOnItemClickListener<DATA> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f145780a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.b.b$c */
    static final class View$OnClickListenerC58897c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GridPhotoAdapter f145787a;

        /* renamed from: b */
        final /* synthetic */ Photo f145788b;

        /* renamed from: c */
        final /* synthetic */ int f145789c;

        View$OnClickListenerC58897c(GridPhotoAdapter bVar, Photo bVar2, int i) {
            this.f145787a = bVar;
            this.f145788b = bVar2;
            this.f145789c = i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.lark.widget.photo_picker_impl.d.b.b$b<DATA extends com.ss.android.lark.widget.photo_picker_impl.b.b> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onClick(View view) {
            IOnItemClickListener<DATA> bVar = this.f145787a.f145780a;
            if (bVar != 0) {
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                bVar.mo199652a(view, this.f145788b, this.f145789c);
            }
        }
    }

    public GridPhotoAdapter(IShowPluginFactory<DATA, GridShowPlugin<DATA, ? extends RecyclerView.ViewHolder>> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mFactory");
        this.f145783d = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        DATA data = this.f145781b.get(i);
        Intrinsics.checkExpressionValueIsNotNull(data, "mData[position]");
        return this.f145783d.mo197711a(i, data);
    }

    /* renamed from: a */
    public final Integer mo199653a(int i) {
        int size = this.f145781b.size();
        for (int i2 = 0; i2 < size; i2++) {
            Integer a = this.f145781b.get(i2).mo199589a();
            if (a != null && a.intValue() == i) {
                return Integer.valueOf(i2);
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        GridShowPlugin<DATA, ? extends RecyclerView.ViewHolder> a = this.f145783d.mo197712a(i);
        this.f145782c.put(Integer.valueOf(i), a);
        return a.mo197646a(viewGroup);
    }

    /* renamed from: a */
    public final void mo199656a(List<DATA> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (z) {
            this.f145781b.clear();
            this.f145781b.addAll(list);
            notifyDataSetChanged();
            return;
        }
        C1374g.C1377b a = C1374g.m6297a(new DiffCallback(this, this.f145781b, list));
        Intrinsics.checkExpressionValueIsNotNull(a, "DiffUtil.calculateDiff(DiffCallback(mData, list))");
        a.mo7412a(this);
        this.f145781b.clear();
        this.f145781b.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        GridShowPlugin<DATA, ? extends RecyclerView.ViewHolder> cVar = this.f145782c.get(Integer.valueOf(getItemViewType(i)));
        if (cVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(cVar, "mMap[getItemViewType(pos…e(position) + \" is null\")");
            DATA data = this.f145781b.get(i);
            Intrinsics.checkExpressionValueIsNotNull(data, "mData[position]");
            DATA data2 = data;
            viewHolder.itemView.setOnClickListener(new View$OnClickListenerC58897c(this, data2, i));
            cVar.mo199658b(viewHolder, data2);
            return;
        }
        throw new IllegalArgumentException(ShareHitPoint.f121869d + getItemViewType(i) + " is null");
    }
}
