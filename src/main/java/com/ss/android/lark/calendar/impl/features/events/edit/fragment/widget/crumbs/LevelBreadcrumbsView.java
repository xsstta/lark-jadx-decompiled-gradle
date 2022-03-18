package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.crumbs;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.breadcrumb.OnBreadcrumbItemClickListener;
import com.larksuite.component.universe_design.breadcrumb.UDBreadcrumb;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0010B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/crumbs/LevelBreadcrumbsView;", "Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumb;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "positionList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "setCallback", "", "callback", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/crumbs/LevelBreadcrumbsView$IBreadcrumbsListener;", "setMultiItems", "levelNodes", "IBreadcrumbsListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LevelBreadcrumbsView extends UDBreadcrumb {

    /* renamed from: a */
    public final ArrayList<MultiLevelNode> f81043a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/crumbs/LevelBreadcrumbsView$IBreadcrumbsListener;", "", "onItemClick", "", "item", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "position", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.crumbs.LevelBreadcrumbsView$a */
    public interface IBreadcrumbsListener {
        /* renamed from: a */
        void mo112234a(MultiLevelNode bVar, int i);
    }

    public LevelBreadcrumbsView(Context context) {
        this(context, null, 2, null);
    }

    public final void setCallback(IBreadcrumbsListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        setOnItemClickListener(new C31819b(this, aVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/crumbs/LevelBreadcrumbsView$setCallback$1", "Lcom/larksuite/component/universe_design/breadcrumb/OnBreadcrumbItemClickListener;", "onItemClick", "", "index", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.crumbs.LevelBreadcrumbsView$b */
    public static final class C31819b implements OnBreadcrumbItemClickListener {

        /* renamed from: a */
        final /* synthetic */ LevelBreadcrumbsView f81044a;

        /* renamed from: b */
        final /* synthetic */ IBreadcrumbsListener f81045b;

        @Override // com.larksuite.component.universe_design.breadcrumb.OnBreadcrumbItemClickListener
        public void onItemClick(int i) {
            MultiLevelNode bVar = this.f81044a.f81043a.get(i);
            Intrinsics.checkExpressionValueIsNotNull(bVar, "positionList[index]");
            this.f81045b.mo112234a(bVar, i);
        }

        C31819b(LevelBreadcrumbsView levelBreadcrumbsView, IBreadcrumbsListener aVar) {
            this.f81044a = levelBreadcrumbsView;
            this.f81045b = aVar;
        }
    }

    public final void setMultiItems(ArrayList<MultiLevelNode> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "levelNodes");
        this.f81043a.clear();
        this.f81043a.addAll(arrayList);
        ArrayList<MultiLevelNode> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            String str = it.next().mo115830f().name;
            if (str == null) {
                str = "";
            }
            arrayList3.add(str);
        }
        setItems(arrayList3);
        mo90282a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LevelBreadcrumbsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f81043a = new ArrayList<>();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LevelBreadcrumbsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
