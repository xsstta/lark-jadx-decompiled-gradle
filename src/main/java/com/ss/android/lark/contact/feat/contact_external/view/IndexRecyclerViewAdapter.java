package com.ss.android.lark.contact.feat.contact_external.view;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.contact.feat.contact_external.view.IndexDataOwner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\u00020\u0005:\u0002\u001f B\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H&J\u0016\u0010\u0017\u001a\u00120\u0018R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\tH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\tH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_external/view/IndexRecyclerViewAdapter;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "DATA", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/contact/feat/contact_external/view/IndexDataOwner;", "()V", "indexDataObservers", "", "Lcom/ss/android/lark/contact/feat/contact_external/view/IndexDataOwner$IndexDataObserver;", "indices", "", "", "", "isIndexEnable", "", "()Z", "setIndexEnable", "(Z)V", "genIndexData", "", "items", "", "getIndexFinder", "Lcom/ss/android/lark/contact/feat/contact_external/view/IndexRecyclerViewAdapter$IndexFinder;", "getIndices", "notifyIndexDataChanged", "", "registerDataObserver", "observer", "unregisterDataObserver", "IndexFinder", "IndexSection", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.contact_external.view.d */
public abstract class IndexRecyclerViewAdapter<VH extends RecyclerView.ViewHolder, DATA> extends LarkRecyclerViewBaseAdapter<VH, DATA> implements IndexDataOwner {

    /* renamed from: a */
    private final List<IndexDataOwner.IndexDataObserver> f91686a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final Map<Integer, String> f91687b = new LinkedHashMap();

    /* renamed from: c */
    private boolean f91688c = true;

    /* renamed from: a */
    public abstract Map<Integer, String> mo130850a(List<? extends DATA> list);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_external/view/IndexRecyclerViewAdapter$IndexSection;", "", "index", "", "indexName", "", "position", "nextPosition", "size", "(ILjava/lang/String;III)V", "getIndex", "()I", "getIndexName", "()Ljava/lang/String;", "getPosition", "getSize", "isMatched", "", "anyPos", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.contact_external.view.d$b */
    public static final class IndexSection {

        /* renamed from: a */
        private final int f91690a;

        /* renamed from: b */
        private final String f91691b;

        /* renamed from: c */
        private final int f91692c;

        /* renamed from: d */
        private final int f91693d;

        /* renamed from: e */
        private final int f91694e;

        /* renamed from: a */
        public final int mo130871a() {
            return this.f91690a;
        }

        /* renamed from: b */
        public final String mo130873b() {
            return this.f91691b;
        }

        /* renamed from: c */
        public final int mo130874c() {
            return this.f91692c;
        }

        /* renamed from: d */
        public final int mo130875d() {
            return this.f91694e;
        }

        /* renamed from: a */
        public final boolean mo130872a(int i) {
            int i2 = this.f91692c;
            int i3 = this.f91693d;
            if (i2 <= i && i3 > i) {
                return true;
            }
            return false;
        }

        public IndexSection(int i, String str, int i2, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(str, "indexName");
            this.f91690a = i;
            this.f91691b = str;
            this.f91692c = i2;
            this.f91693d = i3;
            this.f91694e = i4;
        }
    }

    /* renamed from: b */
    public boolean mo130866b() {
        return this.f91688c;
    }

    /* renamed from: c */
    public Map<Integer, String> mo130867c() {
        return this.f91687b;
    }

    /* renamed from: d */
    public final IndexRecyclerViewAdapter<VH, DATA>.IndexFinder mo130868d() {
        return new IndexFinder();
    }

    public IndexRecyclerViewAdapter() {
        this.items = new IndexRecyclerViewAdapter$1(this);
    }

    /* renamed from: a */
    public final void mo130863a() {
        if (mo130866b()) {
            List<? extends DATA> list = this.items;
            Intrinsics.checkExpressionValueIsNotNull(list, "items");
            Map<Integer, String> a = mo130850a(list);
            this.f91687b.clear();
            this.f91687b.putAll(a);
            for (IndexDataOwner.IndexDataObserver aVar : this.f91686a) {
                aVar.onDataSetChanged();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_external/view/IndexRecyclerViewAdapter$IndexFinder;", "", "(Lcom/ss/android/lark/contact/feat/contact_external/view/IndexRecyclerViewAdapter;)V", "getIndexSection", "Lcom/ss/android/lark/contact/feat/contact_external/view/IndexRecyclerViewAdapter$IndexSection;", "anyPos", "", "indexName", "", "isGroupFirst", "", "isGroupLast", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.contact_external.view.d$a */
    public final class IndexFinder {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public IndexFinder() {
        }

        /* renamed from: a */
        public final IndexSection mo130870a(String str) {
            Integer num;
            Intrinsics.checkParameterIsNotNull(str, "indexName");
            ArrayList arrayList = new ArrayList(IndexRecyclerViewAdapter.this.f91687b.keySet());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Integer num2 = (Integer) arrayList.get(i);
                if (TextUtils.equals(str, IndexRecyclerViewAdapter.this.f91687b.get(num2))) {
                    if (i == arrayList.size() - 1) {
                        num = Integer.MAX_VALUE;
                    } else {
                        num = (Integer) arrayList.get(i + 1);
                    }
                    Intrinsics.checkExpressionValueIsNotNull(num2, "pos");
                    int intValue = num2.intValue();
                    Intrinsics.checkExpressionValueIsNotNull(num, "nextPos");
                    return new IndexSection(i, str, intValue, num.intValue(), size);
                }
            }
            return null;
        }

        /* renamed from: a */
        public final IndexSection mo130869a(int i) {
            String str;
            ArrayList arrayList = new ArrayList(IndexRecyclerViewAdapter.this.f91687b.keySet());
            int size = arrayList.size();
            int i2 = size - 1;
            for (int i3 = 0; i3 < i2; i3++) {
                if (Intrinsics.compare(((Number) arrayList.get(i3)).intValue(), i) <= 0) {
                    int i4 = i3 + 1;
                    Object obj = arrayList.get(i4);
                    Intrinsics.checkExpressionValueIsNotNull(obj, "positions[i + 1]");
                    if (Intrinsics.compare(i, ((Number) obj).intValue()) < 0) {
                        Integer num = (Integer) arrayList.get(i3);
                        String str2 = IndexRecyclerViewAdapter.this.f91687b.get(num);
                        if (str2 == null) {
                            return null;
                        }
                        Intrinsics.checkExpressionValueIsNotNull(num, "pos");
                        int intValue = num.intValue();
                        Object obj2 = arrayList.get(i4);
                        Intrinsics.checkExpressionValueIsNotNull(obj2, "positions[i + 1]");
                        return new IndexSection(i3, str2, intValue, ((Number) obj2).intValue(), size);
                    }
                }
            }
            if (size > 0) {
                Object obj3 = arrayList.get(i2);
                Intrinsics.checkExpressionValueIsNotNull(obj3, "positions[lastIndex]");
                if (Intrinsics.compare(i, ((Number) obj3).intValue()) >= 0 && (str = IndexRecyclerViewAdapter.this.f91687b.get((Integer) arrayList.get(i2))) != null) {
                    Object obj4 = arrayList.get(i2);
                    Intrinsics.checkExpressionValueIsNotNull(obj4, "positions[lastIndex]");
                    return new IndexSection(i2, str, ((Number) obj4).intValue(), Integer.MAX_VALUE, size);
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public void mo130865a(boolean z) {
        this.f91688c = z;
    }

    /* renamed from: a */
    public void mo130864a(IndexDataOwner.IndexDataObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        if (!this.f91686a.contains(aVar)) {
            this.f91686a.add(aVar);
        }
    }
}
