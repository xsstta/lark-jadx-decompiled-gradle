package com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar;

import android.content.DialogInterface;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.ITodoTitleControllerProxy;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.mainview.listener.OnPopupWindowListener;
import com.ss.android.lark.todo.impl.features.mainview2.mvvm.IMainFragmentLiveDataStore;
import com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.sort.ISortTypeChangeListener;
import com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.sort.SortDialog;
import com.ss.android.lark.todo.impl.features.setting.TodoSettingActivity;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u000e\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0016\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\tH\u0002R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/IMainFragmentLiveDataStore;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "titleController", "Lcom/ss/android/lark/todo/dependency/ITodoTitleControllerProxy;", "(Lcom/larksuite/framework/section/IViewAbility;Lcom/ss/android/lark/todo/dependency/ITodoTitleControllerProxy;)V", "isContentAnimate", "", "()Z", "setContentAnimate", "(Z)V", "popWindowListener", "com/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$popWindowListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$popWindowListener$1;", "initViewAction", "", "initViewObserver", "showHelpCenterView", "showMoreMenuDialog", "menuList", "", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$MenuDisplayItem;", "updateTitleBarStatus", "isTargetShow", "Companion", "MenuDisplayItem", "MenuItemType", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TitleViewSection extends ViewSection<IMainFragmentLiveDataStore> {

    /* renamed from: b */
    public static final Companion f140858b = new Companion(null);

    /* renamed from: a */
    public final ITodoTitleControllerProxy f140859a;

    /* renamed from: c */
    private boolean f140860c;

    /* renamed from: d */
    private final C57126g f140861d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$MenuItemType;", "", "(Ljava/lang/String;I)V", "SORT", "SETTING", "HELP_CENTER", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum MenuItemType {
        SORT,
        SETTING,
        HELP_CENTER
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$Companion;", "", "()V", "ANIMATION_DURATION", "", "TODO_HELP_KEY", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$MenuDisplayItem;", "", "menuStr", "", "itemType", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$MenuItemType;", "(Ljava/lang/String;Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$MenuItemType;)V", "getItemType", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$MenuItemType;", "getMenuStr", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection$b */
    public static final class MenuDisplayItem {

        /* renamed from: a */
        private final String f140862a;

        /* renamed from: b */
        private final MenuItemType f140863b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MenuDisplayItem)) {
                return false;
            }
            MenuDisplayItem bVar = (MenuDisplayItem) obj;
            return Intrinsics.areEqual(this.f140862a, bVar.f140862a) && Intrinsics.areEqual(this.f140863b, bVar.f140863b);
        }

        public int hashCode() {
            String str = this.f140862a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            MenuItemType menuItemType = this.f140863b;
            if (menuItemType != null) {
                i = menuItemType.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "MenuDisplayItem(menuStr=" + this.f140862a + ", itemType=" + this.f140863b + ")";
        }

        /* renamed from: a */
        public final String mo193899a() {
            return this.f140862a;
        }

        /* renamed from: b */
        public final MenuItemType mo193900b() {
            return this.f140863b;
        }

        public MenuDisplayItem(String str, MenuItemType menuItemType) {
            Intrinsics.checkParameterIsNotNull(str, "menuStr");
            Intrinsics.checkParameterIsNotNull(menuItemType, "itemType");
            this.f140862a = str;
            this.f140863b = menuItemType;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection$i */
    public static final class RunnableC57128i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TitleViewSection f140868a;

        RunnableC57128i(TitleViewSection titleViewSection) {
            this.f140868a = titleViewSection;
        }

        public final void run() {
            ITodoTitleControllerProxy bVar = this.f140868a.f140859a;
            if (bVar != null) {
                bVar.mo191717a(true, false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$popWindowListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/OnPopupWindowListener;", "onShowMoreMenu", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection$g */
    public static final class C57126g implements OnPopupWindowListener {

        /* renamed from: a */
        final /* synthetic */ TitleViewSection f140865a;

        @Override // com.ss.android.lark.todo.impl.features.mainview.listener.OnPopupWindowListener
        /* renamed from: a */
        public void mo193140a() {
            TodoHitPoint.f141073a.mo194231i("more", "todo_center_task_list_more_view");
            this.f140865a.mo92107d().mo92064a(51);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57126g(TitleViewSection titleViewSection) {
            this.f140865a = titleViewSection;
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        IMainFragmentLiveDataStore aVar = (IMainFragmentLiveDataStore) mo92096a();
        mo92103a(aVar.mo193585b(), new C57121c(this));
        mo92103a(aVar.mo193587d(), new C57122d(this));
        mo92103a(aVar.mo193589f(), new C57123e(this));
        mo92103a(aVar.mo193591h(), new C57125f(this));
    }

    /* renamed from: j */
    public final void mo193898j() {
        boolean z;
        TodoHitPoint.f141073a.mo194230h("help", "none");
        TodoGeneralHitPoint.f141070a.mo194171a();
        String a = TodoDependencyHolder.f139242a.mo191730a().appConfigDependency().mo145363a("help_key_todo");
        if (a.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TodoDependencyHolder.f139242a.mo191730a().browserDependency().mo145368a(mo92106c(), a);
        }
    }

    /* renamed from: a */
    public final void mo193896a(boolean z) {
        this.f140860c = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection$c */
    static final class C57121c extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ TitleViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57121c(TitleViewSection titleViewSection) {
            super(1);
            this.this$0 = titleViewSection;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            ITodoTitleControllerProxy bVar = this.this$0.f140859a;
            if (bVar != null) {
                bVar.mo191716a(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$MenuDisplayItem;", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection$d */
    static final class C57122d extends Lambda implements Function1<List<? extends MenuDisplayItem>, Unit> {
        final /* synthetic */ TitleViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57122d(TitleViewSection titleViewSection) {
            super(1);
            this.this$0 = titleViewSection;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends MenuDisplayItem> list) {
            invoke((List<MenuDisplayItem>) list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<MenuDisplayItem> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            this.this$0.mo193895a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection$e */
    static final class C57123e extends Lambda implements Function1<TodoSortType, Unit> {
        final /* synthetic */ TitleViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57123e(TitleViewSection titleViewSection) {
            super(1);
            this.this$0 = titleViewSection;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TodoSortType todoSortType) {
            invoke(todoSortType);
            return Unit.INSTANCE;
        }

        public final void invoke(TodoSortType todoSortType) {
            Intrinsics.checkParameterIsNotNull(todoSortType, "it");
            SortDialog bVar = new SortDialog(this.this$0.mo92106c(), R.style.TodoSortDialog, todoSortType);
            bVar.mo193910a(new ISortTypeChangeListener(this) {
                /* class com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection.C57123e.C571241 */

                /* renamed from: a */
                final /* synthetic */ C57123e f140864a;

                {
                    this.f140864a = r1;
                }

                @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.sort.ISortTypeChangeListener
                /* renamed from: a */
                public void mo193907a(TodoSortType todoSortType) {
                    Intrinsics.checkParameterIsNotNull(todoSortType, "sortType");
                    this.f140864a.this$0.mo92107d().mo92067a(53, todoSortType);
                }
            });
            bVar.show();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$initViewObserver$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection$f */
    static final class C57125f extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TitleViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57125f(TitleViewSection titleViewSection) {
            super(1);
            this.this$0 = titleViewSection;
        }

        public final void invoke(boolean z) {
            this.this$0.mo193897b(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public final void mo193897b(boolean z) {
        if (!z) {
            ITodoTitleControllerProxy bVar = this.f140859a;
            if (bVar != null) {
                bVar.mo191717a(false, false);
            }
        } else if (!this.f140860c) {
            UICallbackExecutor.executeDelayed(new RunnableC57128i(this), 210);
        } else {
            mo92107d().mo92064a(54);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$showMoreMenuDialog$2", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection$h */
    public static final class C57127h implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleViewSection f140866a;

        /* renamed from: b */
        final /* synthetic */ List f140867b;

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i < this.f140867b.size()) {
                int i2 = C57132c.f140877a[((MenuDisplayItem) this.f140867b.get(i)).mo193900b().ordinal()];
                if (i2 == 1) {
                    TodoGeneralHitPoint.f141070a.mo194183b();
                    this.f140866a.mo92107d().mo92064a(52);
                } else if (i2 == 2) {
                    TodoGeneralHitPoint.f141070a.mo194189c();
                    TodoSettingActivity.f140986a.mo194046a(this.f140866a.mo92106c());
                } else if (i2 == 3) {
                    this.f140866a.mo193898j();
                }
            }
        }

        C57127h(TitleViewSection titleViewSection, List list) {
            this.f140866a = titleViewSection;
            this.f140867b = list;
        }
    }

    /* renamed from: a */
    public final void mo193895a(List<MenuDisplayItem> list) {
        boolean z;
        List<MenuDisplayItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            UDActionPanelBuilder aVar = new UDActionPanelBuilder(mo92106c());
            List<MenuDisplayItem> list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo193899a());
            }
            ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.mo90870a(arrayList)).mo90869a(new C57127h(this, list))).addActionButton(R.id.ud_dialog_btn_cancel, ResUtil.f139261a.mo191781c(R.string.Todo_Common_Cancel), (DialogInterface.OnClickListener) null)).show();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitleViewSection(IViewAbility<IMainFragmentLiveDataStore> fVar, ITodoTitleControllerProxy bVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f140859a = bVar;
        C57126g gVar = new C57126g(this);
        this.f140861d = gVar;
        if (bVar != null) {
            bVar.mo191715a(gVar);
        }
    }
}
