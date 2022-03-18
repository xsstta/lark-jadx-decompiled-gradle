package com.bytedance.ee.bear.bitable.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0014J\u0016\u0010\u0013\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fR\u0018\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/BitableCardStackLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAdapter", "Lcom/bytedance/ee/bear/bitable/card/view/BitableCardStackLayout$Adapter;", "mObserver", "Lcom/bytedance/ee/bear/bitable/card/view/BitableCardStackLayout$Adapter$Observer;", "back", "", "forward", "onDetachedFromWindow", "setAdapter", "adapter", "Adapter", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableCardStackLayout extends FrameLayout {

    /* renamed from: b */
    public static final Companion f13360b = new Companion(null);

    /* renamed from: a */
    public Adapter<?, ?> f13361a;

    /* renamed from: c */
    private Adapter.Observer f13362c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/BitableCardStackLayout$Companion;", "", "()V", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.BitableCardStackLayout$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001,B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0017H&¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\rJ\u001d\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0014J\b\u0010\u001f\u001a\u00020\u0010H\u0002J\u0006\u0010 \u001a\u00020\u0010J$\u0010!\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rJ\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010&\u001a\u00020'H&¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0010H\u0002R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/BitableCardStackLayout$Adapter;", "V", "Landroid/view/View;", "M", "", "()V", "dataStack", "Ljava/util/Stack;", "observer", "Lcom/bytedance/ee/bear/bitable/card/view/BitableCardStackLayout$Adapter$Observer;", "viewStack", "waitingUpdateViewIndexs", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "addObserver", "", "bindView", "view", "model", "(Landroid/view/View;Ljava/lang/Object;)V", "createView", "parent", "Landroid/view/ViewGroup;", "(Ljava/lang/Object;Landroid/view/ViewGroup;)Landroid/view/View;", "destroyView", "container", "instantiateView", "notifyDataChanged", "index", "notifyViewDataChanged", "notifyViewDataChangedIfNeed", "removeObserver", "setDataStack", "newData", "oldCount", "newCount", "setUserVisibleHint", "isVisibleToUser", "", "(Landroid/view/View;Z)V", "toString", "", "updateViewsVisibility", "Observer", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.BitableCardStackLayout$a */
    public static abstract class Adapter<V extends View, M> {

        /* renamed from: a */
        private final Stack<V> f13363a = new Stack<>();

        /* renamed from: b */
        private Stack<M> f13364b;

        /* renamed from: c */
        private Observer f13365c;

        /* renamed from: d */
        private final ArrayList<Integer> f13366d = new ArrayList<>();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/BitableCardStackLayout$Adapter$Observer;", "", "onPop", "", "count", "", "onPush", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.BitableCardStackLayout$a$a */
        public interface Observer {
            /* renamed from: a */
            void mo17858a(int i);

            /* renamed from: b */
            void mo17859b(int i);
        }

        /* renamed from: a */
        public abstract View mo17847a(M m, ViewGroup viewGroup);

        /* renamed from: a */
        public abstract void mo17850a(V v, M m);

        /* renamed from: a */
        public abstract void mo17851a(V v, boolean z);

        /* renamed from: b */
        public abstract void mo17856b(V v, M m);

        /* renamed from: a */
        public final void mo17848a() {
            this.f13365c = null;
        }

        /* renamed from: c */
        private final void m18831c() {
            boolean z;
            Stack<V> stack = this.f13363a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(stack, 10));
            for (T t : stack) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                if (t == this.f13363a.peek()) {
                    z = true;
                } else {
                    z = false;
                }
                mo17851a(t, z);
                arrayList.add(Unit.INSTANCE);
            }
        }

        public String toString() {
            Integer num;
            StringBuilder sb = new StringBuilder();
            sb.append("viewStack size is ");
            sb.append(this.f13363a.size());
            sb.append(", dataStack size is ");
            Stack<M> stack = this.f13364b;
            if (stack != null) {
                num = Integer.valueOf(stack.size());
            } else {
                num = null;
            }
            sb.append(num);
            return sb.toString();
        }

        /* renamed from: b */
        private final void m18830b() {
            Stack<M> stack = this.f13364b;
            if (stack != null) {
                for (int size = this.f13366d.size() - 1; size >= 0; size--) {
                    Integer num = this.f13366d.get(size);
                    Intrinsics.checkExpressionValueIsNotNull(num, "waitingUpdateViewIndexs[i]");
                    int intValue = num.intValue();
                    if (intValue >= 0 && this.f13363a.size() - 2 <= intValue && intValue < this.f13363a.size()) {
                        C13479a.m54764b("BitableCardStackLayout", "notifyViewDataChanged, view index = " + intValue);
                        V v = this.f13363a.get(intValue);
                        Intrinsics.checkExpressionValueIsNotNull(v, "viewStack[index]");
                        mo17856b(v, stack.get(intValue));
                        this.f13366d.remove(size);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo17849a(int i) {
            Stack<M> stack;
            if (i >= 0 && (stack = this.f13364b) != null && this.f13363a.size() > i && stack.size() > i) {
                if (!this.f13366d.contains(Integer.valueOf(i))) {
                    this.f13366d.add(Integer.valueOf(i));
                }
                m18830b();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.ee.bear.bitable.card.view.BitableCardStackLayout$a<V extends android.view.View, M> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: java.util.Stack<V extends android.view.View> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void mo17852a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "container");
            Stack<M> stack = this.f13364b;
            if (stack != null) {
                View a = mo17847a((Object) stack.peek(), viewGroup);
                viewGroup.addView(a, -1);
                Stack<V> stack2 = this.f13363a;
                if (a != null) {
                    stack2.push(a);
                    m18831c();
                    if (!stack.isEmpty()) {
                        mo17850a(a, (Object) stack.peek());
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type V");
            }
        }

        /* renamed from: a */
        public final void mo17854a(Observer aVar) {
            this.f13365c = aVar;
        }

        /* renamed from: a */
        public final void mo17853a(ViewGroup viewGroup, View view) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "container");
            Intrinsics.checkParameterIsNotNull(view, "view");
            viewGroup.removeView(view);
            this.f13363a.pop();
            m18831c();
            m18830b();
        }

        /* renamed from: a */
        public final void mo17855a(Stack<M> stack, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(stack, "newData");
            this.f13364b = stack;
            Observer aVar = this.f13365c;
            if (aVar == null) {
                return;
            }
            if (i < i2) {
                aVar.mo17858a(i2 - i);
            } else if (i > i2) {
                aVar.mo17859b(i - i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Adapter<?, ?> aVar = this.f13361a;
        if (aVar != null) {
            aVar.mo17848a();
        }
    }

    /* renamed from: a */
    public final void mo17843a() {
        C13479a.m54764b("BitableCardStackLayout", "forward");
        Adapter<?, ?> aVar = this.f13361a;
        if (aVar != null) {
            aVar.mo17852a(this);
        }
    }

    /* renamed from: b */
    public final void mo17844b() {
        C13479a.m54764b("BitableCardStackLayout", "back");
        int childCount = getChildCount();
        if (childCount > 0) {
            View childAt = getChildAt(childCount - 1);
            Adapter<?, ?> aVar = this.f13361a;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(childAt, "exitView");
                aVar.mo17853a((ViewGroup) this, childAt);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/BitableCardStackLayout$setAdapter$1", "Lcom/bytedance/ee/bear/bitable/card/view/BitableCardStackLayout$Adapter$Observer;", "onPop", "", "count", "", "onPush", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.BitableCardStackLayout$c */
    public static final class C4538c implements Adapter.Observer {

        /* renamed from: a */
        final /* synthetic */ BitableCardStackLayout f13367a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4538c(BitableCardStackLayout bitableCardStackLayout) {
            this.f13367a = bitableCardStackLayout;
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.BitableCardStackLayout.Adapter.Observer
        /* renamed from: a */
        public void mo17858a(int i) {
            int i2 = 1;
            if (1 <= i) {
                while (true) {
                    this.f13367a.mo17843a();
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            C13479a.m54764b("BitableCardStackLayout", "onPush, count: " + i + ", adapter: " + this.f13367a.f13361a);
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.BitableCardStackLayout.Adapter.Observer
        /* renamed from: b */
        public void mo17859b(int i) {
            int i2 = 1;
            if (1 <= i) {
                while (true) {
                    this.f13367a.mo17844b();
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            C13479a.m54764b("BitableCardStackLayout", "onPop, count: " + i + ", adapter: " + this.f13367a.f13361a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableCardStackLayout(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setAdapter(Adapter<?, ?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "adapter");
        this.f13361a = aVar;
        if (this.f13362c == null) {
            this.f13362c = new C4538c(this);
        }
        Adapter<?, ?> aVar2 = this.f13361a;
        if (aVar2 != null) {
            aVar2.mo17854a(this.f13362c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableCardStackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableCardStackLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
