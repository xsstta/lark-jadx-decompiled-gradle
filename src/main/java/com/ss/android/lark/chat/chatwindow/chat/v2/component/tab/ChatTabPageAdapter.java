package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.AbstractC1583a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u0006J\u0018\u0010\u0010\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bJ\u001c\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u0006R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatTabPageAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "spec", "", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec;", "containsItem", "", "itemId", "", "createFragment", "position", "", "getCurrentTabSpecs", "getItem", "getItemCount", "getItemId", "getTabPosition", "id", "updateData", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.c */
public final class ChatTabPageAdapter extends AbstractC1583a {

    /* renamed from: e */
    private List<? extends IChatTabPageSpec<?, ?>> f86788e = new ArrayList();

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.e<?, ?>>, java.util.List<com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.e<?, ?>> */
    /* renamed from: d */
    public final List<IChatTabPageSpec<?, ?>> mo123620d() {
        return this.f86788e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f86788e.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.c$a */
    static final class C33690a extends Lambda implements Function1<IChatTabPageSpec<?, ?>, Long> {
        final /* synthetic */ long $itemId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33690a(long j) {
            super(1);
            this.$itemId = j;
        }

        public final long invoke(IChatTabPageSpec<?, ?> eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "it");
            return this.$itemId;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Long invoke(IChatTabPageSpec<?, ?> eVar) {
            return Long.valueOf(invoke(eVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.c$b */
    static final class C33691b extends Lambda implements Function1<IChatTabPageSpec<?, ?>, Long> {
        public static final C33691b INSTANCE = new C33691b();

        C33691b() {
            super(1);
        }

        public final long invoke(IChatTabPageSpec<?, ?> eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "it");
            return eVar.mo123591a();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Long invoke(IChatTabPageSpec<?, ?> eVar) {
            return Long.valueOf(invoke(eVar));
        }
    }

    /* renamed from: a */
    public final void mo123617a(List<? extends IChatTabPageSpec<?, ?>> list) {
        Intrinsics.checkParameterIsNotNull(list, "spec");
        this.f86788e = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, androidx.viewpager2.adapter.AbstractC1583a
    public long getItemId(int i) {
        return ((IChatTabPageSpec) this.f86788e.get(i)).mo123591a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatTabPageAdapter(Fragment fragment) {
        super(fragment);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
    }

    /* renamed from: b */
    public final IChatTabPageSpec<?, ?> mo123619b(int i) {
        if (i < 0 || i >= this.f86788e.size()) {
            return null;
        }
        return (IChatTabPageSpec) this.f86788e.get(i);
    }

    @Override // androidx.viewpager2.adapter.AbstractC1583a
    /* renamed from: a */
    public Fragment mo8246a(int i) {
        if (i >= 0 && i <= this.f86788e.size()) {
            return ((IChatTabPageSpec) this.f86788e.get(i)).mo123593c();
        }
        throw new IllegalStateException("fatal: create fragment error for position invalid");
    }

    /* renamed from: b */
    public final int mo123618b(long j) {
        Iterator<T> it = this.f86788e.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (j == it.next().mo123591a()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // androidx.viewpager2.adapter.AbstractC1583a
    /* renamed from: a */
    public boolean mo8253a(long j) {
        C33691b bVar = C33691b.INSTANCE;
        List<? extends IChatTabPageSpec<?, ?>> list = this.f86788e;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (T t : list) {
            arrayList.add(bVar);
        }
        return arrayList.contains(new C33690a(j));
    }
}
