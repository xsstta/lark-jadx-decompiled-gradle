package com.ss.android.lark.contact.feat.common;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u001b2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016J\u001e\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\bH\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0016JJ\u0010\u0016\u001a\u00020\u0010\"\b\b\u0000\u0010\u0017*\u00020\u0003\"\u0010\b\u0001\u0010\u0018*\n\u0012\u0006\b\u0001\u0012\u0002H\u00170\u00022\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00170\u00072\u0016\u0010\u001a\u001a\u0012\u0012\u0006\b\u0001\u0012\u0002H\u0017\u0012\u0006\b\u0001\u0012\u0002H\u00180\u000bR:\u0010\u0005\u001a.\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000RN\u0010\n\u001aB\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b0\u0006j \u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/contact/feat/common/BaseItemListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/contact/feat/common/ItemViewHolder;", "", "()V", "dataClazz2ViewTypeMapper", "Ljava/util/HashMap;", "Ljava/lang/Class;", "", "Lkotlin/collections/HashMap;", "viewType2CellMapper", "Lcom/ss/android/lark/contact/feat/common/ItemCell;", "getItemData", "position", "getItemViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "registerItemCell", "Value", "VH", "clazz", "cell", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.common.a */
public abstract class BaseItemListAdapter extends RecyclerView.Adapter<ItemViewHolder<Object>> {

    /* renamed from: a */
    public static final Companion f91588a = new Companion(null);

    /* renamed from: b */
    private final HashMap<Integer, ItemCell<Object, ItemViewHolder<Object>>> f91589b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<Class<? extends Object>, Integer> f91590c = new HashMap<>();

    /* renamed from: a */
    public abstract Object mo130752a(int i);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/feat/common/BaseItemListAdapter$Companion;", "", "()V", "NOT_MATCH_VIEW_TYPE", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.common.a$b */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        Integer num;
        Object a = mo130752a(i);
        if (a == null || (num = this.f91590c.get(a.getClass())) == null) {
            return IByteRtcError.BRERR_INVALID_TOKEN;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<no name provided>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "pos", "", "invoke", "com/ss/android/lark/contact/feat/common/BaseItemListAdapter$onCreateViewHolder$1$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.common.a$a */
    public static final class C35427a extends Lambda implements Function2<Object, Integer, Unit> {
        final /* synthetic */ ItemCell $it$inlined;
        final /* synthetic */ ItemViewHolder $this_apply;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35427a(ItemViewHolder eVar, ItemCell cVar) {
            super(2);
            this.$this_apply = eVar;
            this.$it$inlined = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Object obj, Integer num) {
            invoke(obj, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Object obj, int i) {
            Intrinsics.checkParameterIsNotNull(obj, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.$it$inlined.mo130688a(this.$this_apply, obj, i);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(ItemViewHolder<Object> eVar, int i) {
        Function2<Object, Integer, Unit> a;
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
        Object a2 = mo130752a(i);
        if (a2 != null && (a = eVar.mo130758a()) != null) {
            a.invoke(a2, Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public ItemViewHolder<Object> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        ItemCell<Object, ItemViewHolder<Object>> cVar = this.f91589b.get(Integer.valueOf(i));
        if (cVar != null) {
            ItemViewHolder<Object> a = cVar.mo130686a(viewGroup, i);
            a.mo130759a(new C35427a(a, cVar));
            if (a != null) {
                return a;
            }
        }
        return new ItemViewHolder<>(new View(viewGroup.getContext()));
    }

    /* renamed from: a */
    public final <Value, VH extends ItemViewHolder<? extends Value>> void mo130754a(Class<? extends Value> cls, ItemCell<? extends Value, ? extends VH> cVar) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(cVar, "cell");
        int a = cVar.mo130757a();
        this.f91590c.put(cls, Integer.valueOf(a));
        this.f91589b.put(Integer.valueOf(a), cVar);
    }
}
