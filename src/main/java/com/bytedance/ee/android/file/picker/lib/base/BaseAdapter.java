package com.bytedance.ee.android.file.picker.lib.base;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001(B\u0005¢\u0006\u0002\u0010\u0005J\u0013\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0002\u0010\u000fJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\r2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0014\"\u00028\u0001¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0013\u001a\u00020\r2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0017J\u0006\u0010\u0018\u001a\u00020\rJ\u0014\u0010\u0019\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017J\u0013\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0011¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0011H\u0016J\u0013\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00028\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0002\u0010\u000fJ\u0016\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011J\u0014\u0010'\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006)"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/base/BaseAdapter;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Data", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "items", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "add", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "index", "", "(ILjava/lang/Object;)V", "addAll", "", "([Ljava/lang/Object;)V", "collection", "", "clear", "diff", "getIndex", "(Ljava/lang/Object;)I", "getItem", "position", "(I)Ljava/lang/Object;", "getItemCount", "getItemId", "", "notifyItemChanged", "object", "remove", "startPosition", "endPosition", "resetAll", "DiffCallback", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.base.a */
public abstract class BaseAdapter<VH extends RecyclerView.ViewHolder, Data> extends RecyclerView.Adapter<VH> {

    /* renamed from: a */
    private List<Data> f12272a = new ArrayList();

    /* renamed from: a */
    public final List<Data> mo15847a() {
        return this.f12272a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f12272a.size();
    }

    public BaseAdapter() {
        setHasStableIds(true);
    }

    /* renamed from: a */
    public final Data mo15846a(int i) {
        return this.f12272a.get(i);
    }

    /* renamed from: a */
    public final void mo15848a(Data data) {
        notifyItemChanged(this.f12272a.indexOf(data));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        int i2;
        Data a = mo15846a(i);
        if (a != null) {
            i2 = a.hashCode();
        } else {
            i2 = 0;
        }
        return (long) i2;
    }
}
