package com.ss.android.lark.calendar.impl.features.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00142\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019J\u001e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00102\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019J\u001d\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u00020\u001f2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u0006J\u0006\u0010!\u001a\u00020\u001fJ\u0016\u0010\"\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010J\u0015\u0010'\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0016J\u0016\u0010(\u001a\u00020\u00142\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019J\u000e\u0010)\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0010J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0006\u0010,\u001a\u00020\u001fJ\u0015\u0010-\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0016J$\u0010.\u001a\u00020\u001f2\u001c\b\u0002\u0010/\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\u001f\u0018\u000100J\u001f\u00101\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001dJ\"\u00102\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00102\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f00R&\u0010\u0004\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u00063"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/recyclerview/AdapterList;", "T", "Lkotlin/collections/AbstractList;", "()V", "adapterRef", "Ljava/lang/ref/WeakReference;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getAdapterRef", "()Ljava/lang/ref/WeakReference;", "setAdapterRef", "(Ljava/lang/ref/WeakReference;)V", "rawList", "", "getRawList", "()Ljava/util/List;", "size", "", "getSize", "()I", "add", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)Z", "addAll", C60375c.f150914a, "", "addAllAt", "index", "addAt", "(ILjava/lang/Object;)Z", "bind", "", "adapter", "clear", "get", "(I)Ljava/lang/Object;", "move", "from", "to", "remove", "removeAll", "removeAt", "safeAddIndex", "safeIndex", "unbind", "update", "updateAll", "func", "Lkotlin/Function1;", "updateAt", "updateAtBy", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.b.a */
public class AdapterList<T> extends AbstractList<T> {

    /* renamed from: b */
    private final List<T> f75570b = new ArrayList();

    /* renamed from: c */
    private WeakReference<RecyclerView.Adapter<?>> f75571c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<T> mo109127a() {
        return this.f75570b;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public int mo109135b() {
        return mo109127a().size();
    }

    /* renamed from: c */
    public final void mo109136c() {
        WeakReference<RecyclerView.Adapter<?>> weakReference = this.f75571c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f75571c = null;
    }

    @Override // kotlin.collections.AbstractCollection
    public final void clear() {
        RecyclerView.Adapter<?> adapter;
        mo109127a().clear();
        WeakReference<RecyclerView.Adapter<?>> weakReference = this.f75571c;
        if (weakReference != null && (adapter = weakReference.get()) != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    private final boolean m112246b(int i) {
        if (i < 0 || i >= mo109127a().size()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final boolean m112247c(int i) {
        if (i < 0 || i > mo109127a().size()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo109128a(RecyclerView.Adapter<?> adapter) {
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        this.f75571c = new WeakReference<>(adapter);
    }

    @Override // java.util.List, kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean add(T t) {
        return mo109131a(mo109127a().size(), (Object) t);
    }

    @Override // java.util.List, kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return mo109132a(mo109127a().size(), (Collection) collection);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i) {
        return mo109127a().get(i);
    }

    @Override // java.util.List, kotlin.collections.AbstractCollection
    public final boolean remove(T t) {
        List<T> a = mo109127a();
        if (t != null) {
            return mo109130a(a.indexOf(t));
        }
        return false;
    }

    /* renamed from: a */
    public final void mo109129a(Function1<? super List<T>, Unit> function1) {
        RecyclerView.Adapter<?> adapter;
        if (function1 != null) {
            function1.invoke(mo109127a());
        }
        WeakReference<RecyclerView.Adapter<?>> weakReference = this.f75571c;
        if (weakReference != null && (adapter = weakReference.get()) != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // java.util.List, kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<? extends T> collection) {
        boolean z;
        RecyclerView.Adapter<?> adapter;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || !mo109127a().removeAll(collection)) {
            return false;
        }
        WeakReference<RecyclerView.Adapter<?>> weakReference = this.f75571c;
        if (!(weakReference == null || (adapter = weakReference.get()) == null)) {
            adapter.notifyDataSetChanged();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo109130a(int i) {
        RecyclerView.Adapter<?> adapter;
        if (!m112246b(i)) {
            return false;
        }
        mo109127a().remove(i);
        WeakReference<RecyclerView.Adapter<?>> weakReference = this.f75571c;
        if (weakReference == null || (adapter = weakReference.get()) == null) {
            return true;
        }
        adapter.notifyItemRemoved(i);
        return true;
    }

    /* renamed from: a */
    public final boolean mo109131a(int i, T t) {
        RecyclerView.Adapter<?> adapter;
        if (t == null || !m112247c(i)) {
            return false;
        }
        mo109127a().add(i, t);
        WeakReference<RecyclerView.Adapter<?>> weakReference = this.f75571c;
        if (weakReference == null || (adapter = weakReference.get()) == null) {
            return true;
        }
        adapter.notifyItemInserted(i);
        return true;
    }

    /* renamed from: a */
    public final boolean mo109132a(int i, Collection<? extends T> collection) {
        boolean z;
        RecyclerView.Adapter<?> adapter;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || !m112247c(i)) {
            return false;
        }
        mo109127a().addAll(i, collection);
        WeakReference<RecyclerView.Adapter<?>> weakReference = this.f75571c;
        if (!(weakReference == null || (adapter = weakReference.get()) == null)) {
            adapter.notifyItemRangeInserted(i, collection.size());
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.b.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m112245a(AdapterList aVar, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            aVar.mo109129a(function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAll");
    }
}
