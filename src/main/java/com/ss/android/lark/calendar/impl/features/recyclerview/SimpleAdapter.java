package com.ss.android.lark.calendar.impl.features.recyclerview;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u001c\u001a\u00020\u0000\"\b\b\u0000\u0010\u001d*\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u000bJ,\u0010\u001f\u001a\u00020\u00002$\u0010 \u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015j\u0002`\u0017J&\u0010!\u001a\u00020\u00002\u001e\u0010 \u001a\u001a\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00160\u001aj\u0002`\u001bJ\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0016J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010%\u001a\u00020#J\u001e\u0010'\u001a\u00020\u00162\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010%\u001a\u00020#H\u0016J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020#H\u0016J,\u0010-\u001a\u00020\u00002$\u0010 \u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015j\u0002`\u0017J&\u0010.\u001a\u00020\u00002\u001e\u0010 \u001a\u001a\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00160\u001aj\u0002`\u001bRN\u0010\u0007\u001aB\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n0\bj \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n`\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b0\u000eX\u0004¢\u0006\u0002\n\u0000R0\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0006RZ\u0010\u0013\u001aN\u0012\"\u0012 \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015j\u0002`\u00170\u0014j&\u0012\"\u0012 \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015j\u0002`\u0017`\u0018X\u0004¢\u0006\u0002\n\u0000RN\u0010\u0019\u001aB\u0012\u001c\u0012\u001a\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00160\u001aj\u0002`\u001b0\u0014j \u0012\u001c\u0012\u001a\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00160\u001aj\u0002`\u001b`\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/recyclerview/SimpleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/SimpleHolder;", "", "list", "", "(Ljava/util/List;)V", "infoByDataClass", "Ljava/util/HashMap;", "Ljava/lang/Class;", "", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/HolderMapper;", "Lkotlin/collections/HashMap;", "infoByType", "Landroid/util/SparseArray;", "value", "getList", "()Ljava/util/List;", "setList", "onBindListeners", "Ljava/util/ArrayList;", "Lkotlin/Function2;", "", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/OnBindHolder;", "Lkotlin/collections/ArrayList;", "onCreateListeners", "Lkotlin/Function1;", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/OnCreateHolder;", "addMapper", "T", "holderMapper", "addOnBindHolderListener", "listener", "addOnCreateHolderListener", "getItemCount", "", "getItemViewType", "position", "getMapperByPosition", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeOnBindHolderListener", "removeOnCreateHolderListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.b.e */
public class SimpleAdapter extends RecyclerView.Adapter<SimpleHolder<Object>> {

    /* renamed from: a */
    private List<? extends Object> f75583a;

    /* renamed from: b */
    private final HashMap<Class<Object>, List<HolderMapper<Object>>> f75584b = new HashMap<>();

    /* renamed from: c */
    private final SparseArray<HolderMapper<Object>> f75585c = new SparseArray<>();

    /* renamed from: d */
    private final ArrayList<Function1<SimpleHolder<? extends Object>, Unit>> f75586d = new ArrayList<>(2);

    /* renamed from: e */
    private final ArrayList<Function2<SimpleHolder<? extends Object>, Object, Unit>> f75587e = new ArrayList<>(2);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f75583a.size();
    }

    /* renamed from: a */
    public final SimpleAdapter mo109151a(Function1<? super SimpleHolder<? extends Object>, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "listener");
        this.f75586d.add(function1);
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return mo109149a(i).mo109148f();
    }

    /* renamed from: a */
    public final void mo109154a(List<? extends Object> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.f75583a = list;
        notifyDataSetChanged();
    }

    public SimpleAdapter(List<? extends Object> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f75583a = list;
    }

    /* renamed from: a */
    public final <T> SimpleAdapter mo109150a(HolderMapper<T> dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "holderMapper");
        ArrayList arrayList = this.f75584b.get(dVar.mo109144b());
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f75584b.put(dVar.mo109144b(), arrayList2);
            arrayList = arrayList2;
        }
        arrayList.add(dVar);
        this.f75585c.append(dVar.mo109148f(), dVar);
        return this;
    }

    /* renamed from: a */
    public final HolderMapper<Object> mo109149a(int i) {
        T t;
        Object obj;
        T t2;
        Object obj2 = this.f75583a.get(i);
        Class<?> cls = obj2.getClass();
        List<HolderMapper<Object>> list = this.f75584b.get(cls);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (((Boolean) t2.mo109147e().invoke(obj2)).booleanValue()) {
                    break;
                }
            }
            t = t2;
        } else {
            t = null;
        }
        if (t != null) {
            return t;
        }
        Set<Map.Entry<Class<Object>, List<HolderMapper<Object>>>> entrySet = this.f75584b.entrySet();
        Intrinsics.checkExpressionValueIsNotNull(entrySet, "infoByDataClass.entries");
        for (T t3 : entrySet) {
            if (((Class) t3.getKey()).isAssignableFrom(cls)) {
                Object value = t3.getValue();
                Intrinsics.checkExpressionValueIsNotNull(value, "it.value");
                Iterator it2 = ((Iterable) value).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((Boolean) ((HolderMapper) obj).mo109147e().invoke(obj2)).booleanValue()) {
                        break;
                    }
                }
                t = (HolderMapper) obj;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Unsupported data " + obj2 + " at " + i);
    }

    /* renamed from: a */
    public SimpleHolder<Object> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        HolderMapper<Object> dVar = this.f75585c.get(i);
        if (dVar != null) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(dVar.mo109145c(), viewGroup, false);
            SimpleHolder<Object> fVar = (SimpleHolder) dVar.mo109146d().getConstructor(View.class).newInstance(inflate);
            Iterator<T> it = this.f75586d.iterator();
            while (it.hasNext()) {
                Intrinsics.checkExpressionValueIsNotNull(fVar, "holder");
                it.next().invoke(fVar);
            }
            Intrinsics.checkExpressionValueIsNotNull(fVar, "holder");
            return fVar;
        }
        throw new IllegalArgumentException("Unknown viewType: " + i);
    }

    /* renamed from: a */
    public void onBindViewHolder(SimpleHolder<Object> fVar, int i) {
        Intrinsics.checkParameterIsNotNull(fVar, "holder");
        fVar.mo109156a(this.f75583a.get(i));
        Iterator<T> it = this.f75587e.iterator();
        while (it.hasNext()) {
            it.next().invoke(fVar, this.f75583a.get(i));
        }
    }
}
