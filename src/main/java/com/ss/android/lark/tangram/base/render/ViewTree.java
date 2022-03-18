package com.ss.android.lark.tangram.base.render;

import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007J\u0016\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tRJ\u0010\u0005\u001a>\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u0006j\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n`\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/tangram/base/render/ViewTree;", "", "view", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "childrenTagToPositionMap", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "buildViewIdMap", "", "exchangeSubView", "atIndex", "toIndex", "findAvailableViewIndex", "tag", "insertSubview", "subview", "Landroid/view/View;", "index", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.e.g */
public final class ViewTree {

    /* renamed from: a */
    private HashMap<String, ArrayList<Integer>> f136663a = new HashMap<>();

    /* renamed from: b */
    private final ViewGroup f136664b;

    /* renamed from: a */
    private final void m214804a() {
        int childCount = this.f136664b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object tag = this.f136664b.getChildAt(i).getTag(R.id.view_class_name);
            if (tag != null) {
                if (tag != null) {
                    String str = (String) tag;
                    ArrayList<Integer> arrayList = this.f136663a.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        this.f136663a.put(str, arrayList);
                    }
                    arrayList.add(Integer.valueOf(i));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            }
        }
    }

    public ViewTree(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "view");
        this.f136664b = viewGroup;
        m214804a();
    }

    /* renamed from: a */
    public final int mo188795a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "tag");
        ArrayList<Integer> arrayList = this.f136663a.get(str);
        ArrayList<Integer> arrayList2 = arrayList;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        int intValue = ((Number) CollectionsKt.first((List) arrayList)).intValue();
        arrayList.remove(Integer.valueOf(intValue));
        return intValue;
    }

    /* renamed from: a */
    public final void mo188796a(int i, int i2) {
        View childAt = this.f136664b.getChildAt(i2);
        ArrayList<Integer> arrayList = this.f136663a.get(childAt.getTag(R.id.view_class_name));
        if (arrayList != null) {
            arrayList.set(arrayList.indexOf(Integer.valueOf(i2)), Integer.valueOf(i));
        }
        View childAt2 = this.f136664b.getChildAt(i);
        if (i > i2) {
            this.f136664b.removeViewAt(i);
            this.f136664b.addView(childAt2, i2);
            this.f136664b.removeView(childAt);
            this.f136664b.addView(childAt, i);
            return;
        }
        this.f136664b.removeViewAt(i2);
        this.f136664b.addView(childAt, i);
        this.f136664b.removeView(childAt2);
        this.f136664b.addView(childAt2, i2);
    }

    /* renamed from: a */
    public final void mo188797a(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "subview");
        this.f136664b.addView(view, i);
        Collection<ArrayList<Integer>> values = this.f136663a.values();
        Intrinsics.checkExpressionValueIsNotNull(values, "childrenTagToPositionMap.values");
        Collection<ArrayList<Integer>> collection = values;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (T t : collection) {
            Intrinsics.checkExpressionValueIsNotNull(t, "arrayList");
            int size = t.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = t.get(i2);
                Intrinsics.checkExpressionValueIsNotNull(obj, "arrayList.get(i)");
                t.set(i2, Integer.valueOf(((Number) obj).intValue() + 1));
            }
            arrayList.add(Unit.INSTANCE);
        }
    }
}
