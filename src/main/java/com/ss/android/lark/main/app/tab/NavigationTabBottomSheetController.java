package com.ss.android.lark.main.app.tab;

import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ss.android.lark.main.app.fragment.NavBottomSheetBehavior;
import com.ss.android.lark.main.app.tab.C44364l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003%&'B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\n\"\u00020\b¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\rH\u0002J\u0014\u0010\u001e\u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0003J\b\u0010!\u001a\u00020\u0019H\u0002J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0012J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetController;", "", "navigationTab", "Lkotlin/Function0;", "Lcom/ss/android/lark/main/app/tab/NavigationTab;", "separateListenerFactory", "Lkotlin/Function1;", "Landroid/view/View;", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetCallback$OnSlideChangeListener;", "listeners", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;[Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetCallback$OnSlideChangeListener;)V", "childController", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetController$BaseController;", "", "listeners$annotations", "()V", "value", "", "state", "getState", "()I", "setState", "(I)V", "collapseNavTabOnly", "", "createForwardingBottomSheetCallback", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetCallback;", "view", "controller", "notifyNavTabEditorWillAppear", "navigationTabEditorView", "Lcom/ss/android/lark/main/app/tab/NavigationTabEditorView;", "reset", "setNavTabSheetPeekHeight", "height", "setStateWithoutAnimation", "BaseController", "OneBottomSheetController", "TwoBottomSheetController", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.tab.m */
public final class NavigationTabBottomSheetController {

    /* renamed from: a */
    private final List<C44364l.AbstractC44366b> f112564a;

    /* renamed from: b */
    private BaseController f112565b;

    /* renamed from: c */
    private final Function0<NavigationTab> f112566c;

    /* renamed from: d */
    private final Function1<View, C44364l.AbstractC44366b> f112567d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetController$BaseController;", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetCallback;", "()V", "state", "", "getState", "()I", "setState", "(I)V", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.m$a */
    public static abstract class BaseController extends C44364l {
        /* renamed from: a */
        public abstract int mo157620a();

        /* renamed from: a */
        public abstract void mo157621a(int i);

        public BaseController() {
            super(new C44364l.AbstractC44366b[0]);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8V@VX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetController$OneBottomSheetController;", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetController$BaseController;", "behavior1", "Lcom/ss/android/lark/main/app/fragment/NavBottomSheetBehavior;", "Landroid/view/View;", "listeners", "", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetCallback$OnSlideChangeListener;", "(Lcom/ss/android/lark/main/app/fragment/NavBottomSheetBehavior;Ljava/util/List;)V", "value", "", "state", "getState", "()I", "setState", "(I)V", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.m$b */
    public static final class OneBottomSheetController extends BaseController {

        /* renamed from: b */
        private final NavBottomSheetBehavior<View> f112568b;

        /* renamed from: c */
        private final List<C44364l.AbstractC44366b> f112569c;

        @Override // com.ss.android.lark.main.app.tab.NavigationTabBottomSheetController.BaseController
        /* renamed from: a */
        public int mo157620a() {
            return this.f112568b.mo76717d();
        }

        @Override // com.ss.android.lark.main.app.tab.NavigationTabBottomSheetController.BaseController
        /* renamed from: a */
        public void mo157621a(int i) {
            this.f112568b.mo76718d(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.main.app.tab.l$b> */
        /* JADX WARN: Multi-variable type inference failed */
        public OneBottomSheetController(NavBottomSheetBehavior<View> navBottomSheetBehavior, List<? extends C44364l.AbstractC44366b> list) {
            Intrinsics.checkParameterIsNotNull(navBottomSheetBehavior, "behavior1");
            Intrinsics.checkParameterIsNotNull(list, "listeners");
            this.f112568b = navBottomSheetBehavior;
            this.f112569c = list;
            this.f112563a.addAll(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u000b\u0018\u00002\u00020\u0001B3\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ&\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003J&\u0010\u0018\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003J&\u0010\u0019\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003J\u0012\u0010\u001a\u001a\u00020\u0015*\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003R\u0016\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetController$TwoBottomSheetController;", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetController$BaseController;", "behavior1", "Lcom/ss/android/lark/main/app/fragment/NavBottomSheetBehavior;", "Landroid/view/View;", "behavior2", "listeners", "", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetCallback$OnSlideChangeListener;", "(Lcom/ss/android/lark/main/app/fragment/NavBottomSheetBehavior;Lcom/ss/android/lark/main/app/fragment/NavBottomSheetBehavior;Ljava/util/List;)V", "onSlideChangeListener", "com/ss/android/lark/main/app/tab/NavigationTabBottomSheetController$TwoBottomSheetController$onSlideChangeListener$1", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetController$TwoBottomSheetController$onSlideChangeListener$1;", "value", "", "state", "getState", "()I", "setState", "(I)V", "shouldBeCollapsed", "", "one", "another", "shouldBeExpanded", "shouldBeSliding", "isAnimating", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.m$c */
    public static final class TwoBottomSheetController extends BaseController {

        /* renamed from: b */
        public final NavBottomSheetBehavior<? extends View> f112570b;

        /* renamed from: c */
        public final NavBottomSheetBehavior<? extends View> f112571c;

        /* renamed from: d */
        public final List<C44364l.AbstractC44366b> f112572d;

        /* renamed from: e */
        private final C44367a f112573e;

        @Override // com.ss.android.lark.main.app.tab.NavigationTabBottomSheetController.BaseController
        /* renamed from: a */
        public int mo157620a() {
            return this.f112571c.mo76717d();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/main/app/tab/NavigationTabBottomSheetController$TwoBottomSheetController$onSlideChangeListener$1", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetCallback$OnSlideChangeListener;", "onCollapsed", "", "bottomSheet", "Landroid/view/View;", "onExpanded", "onHidden", "onSettling", "onSliding", "slideOffset", "", "onStartDragging", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.main.app.tab.m$c$a */
        public static final class C44367a implements C44364l.AbstractC44366b {

            /* renamed from: a */
            final /* synthetic */ TwoBottomSheetController f112574a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C44367a(TwoBottomSheetController cVar) {
                this.f112574a = cVar;
            }

            @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
            /* renamed from: b */
            public void mo157360b(View view) {
                Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
                Iterator<T> it = this.f112574a.f112572d.iterator();
                while (it.hasNext()) {
                    it.next().mo157360b(view);
                }
            }

            @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
            /* renamed from: c */
            public void mo157361c(View view) {
                Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
                Iterator<T> it = this.f112574a.f112572d.iterator();
                while (it.hasNext()) {
                    it.next().mo157361c(view);
                }
            }

            @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
            /* renamed from: e */
            public void mo157363e(View view) {
                Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
                Iterator<T> it = this.f112574a.f112572d.iterator();
                while (it.hasNext()) {
                    it.next().mo157363e(view);
                }
            }

            @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
            /* renamed from: a */
            public void mo157358a(View view) {
                Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
                TwoBottomSheetController cVar = this.f112574a;
                if (cVar.mo157624b(cVar.f112570b, this.f112574a.f112571c)) {
                    Iterator<T> it = this.f112574a.f112572d.iterator();
                    while (it.hasNext()) {
                        it.next().mo157358a(view);
                    }
                }
            }

            @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
            /* renamed from: d */
            public void mo157362d(View view) {
                Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
                TwoBottomSheetController cVar = this.f112574a;
                if (cVar.mo157623a(cVar.f112570b, this.f112574a.f112571c)) {
                    Iterator<T> it = this.f112574a.f112572d.iterator();
                    while (it.hasNext()) {
                        it.next().mo157362d(view);
                    }
                }
            }

            @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
            /* renamed from: a */
            public void mo157359a(View view, float f) {
                Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
                TwoBottomSheetController cVar = this.f112574a;
                if (cVar.mo157625c(cVar.f112570b, this.f112574a.f112571c)) {
                    Iterator<T> it = this.f112574a.f112572d.iterator();
                    while (it.hasNext()) {
                        it.next().mo157359a(view, f);
                    }
                }
            }
        }

        @Override // com.ss.android.lark.main.app.tab.NavigationTabBottomSheetController.BaseController
        /* renamed from: a */
        public void mo157621a(int i) {
            this.f112571c.mo76718d(i);
        }

        /* renamed from: a */
        public final boolean mo157622a(NavBottomSheetBehavior<? extends View> navBottomSheetBehavior) {
            Intrinsics.checkParameterIsNotNull(navBottomSheetBehavior, "$this$isAnimating");
            if (navBottomSheetBehavior.mo76717d() == 2 || navBottomSheetBehavior.mo76717d() == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo157624b(NavBottomSheetBehavior<? extends View> navBottomSheetBehavior, NavBottomSheetBehavior<? extends View> navBottomSheetBehavior2) {
            Intrinsics.checkParameterIsNotNull(navBottomSheetBehavior, "one");
            Intrinsics.checkParameterIsNotNull(navBottomSheetBehavior2, "another");
            if (navBottomSheetBehavior.mo76717d() == 3 || navBottomSheetBehavior2.mo76717d() == 3) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo157625c(NavBottomSheetBehavior<? extends View> navBottomSheetBehavior, NavBottomSheetBehavior<? extends View> navBottomSheetBehavior2) {
            Intrinsics.checkParameterIsNotNull(navBottomSheetBehavior, "one");
            Intrinsics.checkParameterIsNotNull(navBottomSheetBehavior2, "another");
            return mo157622a(navBottomSheetBehavior) ^ mo157622a(navBottomSheetBehavior2);
        }

        /* renamed from: a */
        public final boolean mo157623a(NavBottomSheetBehavior<? extends View> navBottomSheetBehavior, NavBottomSheetBehavior<? extends View> navBottomSheetBehavior2) {
            Intrinsics.checkParameterIsNotNull(navBottomSheetBehavior, "one");
            Intrinsics.checkParameterIsNotNull(navBottomSheetBehavior2, "another");
            if (navBottomSheetBehavior.mo76717d() == 4 && navBottomSheetBehavior2.mo76717d() == 4) {
                return true;
            }
            return false;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.lark.main.app.tab.l$b> */
        /* JADX WARN: Multi-variable type inference failed */
        public TwoBottomSheetController(NavBottomSheetBehavior<? extends View> navBottomSheetBehavior, NavBottomSheetBehavior<? extends View> navBottomSheetBehavior2, List<? extends C44364l.AbstractC44366b> list) {
            Intrinsics.checkParameterIsNotNull(navBottomSheetBehavior, "behavior1");
            Intrinsics.checkParameterIsNotNull(navBottomSheetBehavior2, "behavior2");
            Intrinsics.checkParameterIsNotNull(list, "listeners");
            this.f112570b = navBottomSheetBehavior;
            this.f112571c = navBottomSheetBehavior2;
            this.f112572d = list;
            C44367a aVar = new C44367a(this);
            this.f112573e = aVar;
            this.f112563a.add(aVar);
        }
    }

    /* renamed from: a */
    public final int mo157613a() {
        BaseController aVar = this.f112565b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("childController");
        }
        return aVar.mo157620a();
    }

    /* renamed from: c */
    public final void mo157618c() {
        NavBottomSheetBehavior c = NavBottomSheetBehavior.m175464c((View) this.f112566c.invoke());
        Intrinsics.checkExpressionValueIsNotNull(c, "from(navigationTab())");
        c.mo76718d(4);
    }

    /* renamed from: b */
    public final void mo157616b() {
        NavBottomSheetBehavior c = NavBottomSheetBehavior.m175464c((View) this.f112566c.invoke());
        Intrinsics.checkExpressionValueIsNotNull(c, "from(navigationTab())");
        this.f112565b = new OneBottomSheetController(c, this.f112564a);
        NavBottomSheetBehavior c2 = NavBottomSheetBehavior.m175464c((View) this.f112566c.invoke());
        NavigationTab invoke = this.f112566c.invoke();
        BaseController aVar = this.f112565b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("childController");
        }
        c2.mo76706a(m176031a(invoke, aVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/main/app/tab/NavigationTabBottomSheetController$notifyNavTabEditorWillAppear$autoRemoveSheetListener$1", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetCallback$AbstractOnSlideChangeListener;", "onCollapsed", "", "bottomSheet", "Landroid/view/View;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.m$e */
    public static final class C44369e extends C44364l.AbstractC44365a {

        /* renamed from: a */
        final /* synthetic */ NavigationTabBottomSheetController f112577a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44369e(NavigationTabBottomSheetController mVar) {
            this.f112577a = mVar;
        }

        @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
        /* renamed from: d */
        public void mo157362d(View view) {
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((CoordinatorLayout) parent).removeView(view);
                this.f112577a.mo157616b();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
        }
    }

    /* renamed from: c */
    public final void mo157619c(int i) {
        NavBottomSheetBehavior.m175464c((View) this.f112566c.invoke()).mo76718d(i);
    }

    /* renamed from: b */
    public final void mo157617b(int i) {
        NavBottomSheetBehavior c = NavBottomSheetBehavior.m175464c((View) this.f112566c.invoke());
        Intrinsics.checkExpressionValueIsNotNull(c, "from(navigationTab())");
        c.mo76702a(i);
    }

    /* renamed from: a */
    public final void mo157614a(int i) {
        BaseController aVar = this.f112565b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("childController");
        }
        aVar.mo157621a(i);
    }

    /* renamed from: a */
    public final void mo157615a(Function0<NavigationTabEditorView> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "navigationTabEditorView");
        C44369e eVar = new C44369e(this);
        NavBottomSheetBehavior c = NavBottomSheetBehavior.m175464c((View) function0.invoke());
        NavBottomSheetBehavior c2 = NavBottomSheetBehavior.m175464c((View) this.f112566c.invoke());
        Intrinsics.checkExpressionValueIsNotNull(c2, "from(navigationTab())");
        Intrinsics.checkExpressionValueIsNotNull(c, "navTabEditorBehavior");
        this.f112565b = new TwoBottomSheetController(c2, c, CollectionsKt.plus((Collection) this.f112564a, (Object) eVar));
        NavBottomSheetBehavior c3 = NavBottomSheetBehavior.m175464c((View) this.f112566c.invoke());
        NavigationTab invoke = this.f112566c.invoke();
        BaseController aVar = this.f112565b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("childController");
        }
        c3.mo76706a(m176031a(invoke, aVar));
        NavigationTabEditorView invoke2 = function0.invoke();
        BaseController aVar2 = this.f112565b;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("childController");
        }
        c.mo76706a(m176031a(invoke2, aVar2));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/main/app/tab/NavigationTabBottomSheetController$createForwardingBottomSheetCallback$1", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.m$d */
    public static final class C44368d extends C44364l {

        /* renamed from: b */
        final /* synthetic */ BaseController f112575b;

        /* renamed from: c */
        final /* synthetic */ C44364l.AbstractC44366b f112576c;

        @Override // com.ss.android.lark.main.app.tab.C44364l, com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
        /* renamed from: a */
        public void mo24937a(View view, float f) {
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            super.mo24937a(view, f);
            this.f112575b.mo24937a(view, f);
        }

        @Override // com.ss.android.lark.main.app.tab.C44364l, com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
        /* renamed from: a */
        public void mo24938a(View view, int i) {
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            super.mo24938a(view, i);
            this.f112575b.mo24938a(view, i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44368d(BaseController aVar, C44364l.AbstractC44366b bVar, C44364l.AbstractC44366b[] bVarArr) {
            super(bVarArr);
            this.f112575b = aVar;
            this.f112576c = bVar;
        }
    }

    /* renamed from: a */
    private final C44364l m176031a(View view, BaseController aVar) {
        C44364l.AbstractC44366b invoke = this.f112567d.invoke(view);
        return new C44368d(aVar, invoke, new C44364l.AbstractC44366b[]{invoke});
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends com.ss.android.lark.main.app.tab.NavigationTab> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, ? extends com.ss.android.lark.main.app.tab.l$b> */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationTabBottomSheetController(Function0<? extends NavigationTab> function0, Function1<? super View, ? extends C44364l.AbstractC44366b> function1, C44364l.AbstractC44366b... bVarArr) {
        Intrinsics.checkParameterIsNotNull(function0, "navigationTab");
        Intrinsics.checkParameterIsNotNull(function1, "separateListenerFactory");
        Intrinsics.checkParameterIsNotNull(bVarArr, "listeners");
        this.f112566c = function0;
        this.f112567d = function1;
        this.f112564a = CollectionsKt.listOf((Object[]) ((C44364l.AbstractC44366b[]) Arrays.copyOf(bVarArr, bVarArr.length)));
        mo157616b();
    }
}
