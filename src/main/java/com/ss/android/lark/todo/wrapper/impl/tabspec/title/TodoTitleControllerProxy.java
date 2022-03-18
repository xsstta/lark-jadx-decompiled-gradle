package com.ss.android.lark.todo.wrapper.impl.tabspec.title;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.todo.dependency.ITodoTitleControllerProxy;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.ISearchModuleDependency;
import com.ss.android.lark.todo.impl.features.mainview.listener.OnPopupWindowListener;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\r\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/tabspec/title/TodoTitleControllerProxy;", "Lcom/ss/android/lark/todo/dependency/ITodoTitleControllerProxy;", "context", "Landroid/content/Context;", "mTitleController", "Lcom/ss/android/lark/maincore/ITitleController;", "(Landroid/content/Context;Lcom/ss/android/lark/maincore/ITitleController;)V", "funcMoreBtn", "Lcom/ss/android/lark/maincore/IFunctionButton;", "funcSearchBtn", "mOnPopupWindowListener", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/OnPopupWindowListener;", "mOnTitleClickListener", "com/ss/android/lark/todo/wrapper/impl/tabspec/title/TodoTitleControllerProxy$mOnTitleClickListener$1", "Lcom/ss/android/lark/todo/wrapper/impl/tabspec/title/TodoTitleControllerProxy$mOnTitleClickListener$1;", "mTitleInfo", "Lcom/ss/android/lark/todo/wrapper/impl/tabspec/title/TodoTitleInfo;", "getTitleInfo", "isShowNewStyle", "", "setPopWindowShowListener", "", "popWindowListener", "updateTitle", "title", "", "updateTitleBarStatus", "isShow", "withAnimate", "Companion", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.c.a.a */
public final class TodoTitleControllerProxy implements ITodoTitleControllerProxy {

    /* renamed from: e */
    public static final Companion f139224e = new Companion(null);

    /* renamed from: a */
    public OnPopupWindowListener f139225a;

    /* renamed from: b */
    public final C56251d f139226b = new C56251d(this);

    /* renamed from: c */
    public Context f139227c;

    /* renamed from: d */
    public ITitleController f139228d;

    /* renamed from: f */
    private final TodoTitleInfo f139229f;

    /* renamed from: g */
    private final AbstractC44545b f139230g;

    /* renamed from: h */
    private final AbstractC44545b f139231h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/tabspec/title/TodoTitleControllerProxy$Companion;", "", "()V", "KEY_TODO_SEARCH_TITLE", "", "TAG", "parseTitleController", "Lcom/ss/android/lark/todo/wrapper/impl/tabspec/title/TodoTitleControllerProxy;", "context", "Landroid/content/Context;", "titleController", "Lcom/ss/android/lark/maincore/ITitleController;", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.c.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final TodoTitleControllerProxy mo191718a(Context context, ITitleController iTitleController) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new TodoTitleControllerProxy(context, iTitleController);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/todo/wrapper/impl/tabspec/title/TodoTitleControllerProxy$mOnTitleClickListener$1", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/OnTitleClickListener;", "onMoreIconClicked", "", "onSearchIconClicked", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.c.a.a$d */
    public static final class C56251d {

        /* renamed from: a */
        final /* synthetic */ TodoTitleControllerProxy f139236a;

        /* renamed from: a */
        public void mo191723a() {
            OnPopupWindowListener dVar = this.f139236a.f139225a;
            if (dVar != null) {
                dVar.mo193140a();
            }
        }

        /* renamed from: b */
        public void mo191724b() {
            int i;
            Bitmap c;
            ITitleController iTitleController = this.f139236a.f139228d;
            if (!(iTitleController == null || (c = iTitleController.mo99195c()) == null)) {
                al.m95028a().mo93366a("key_todo_search_title", c);
            }
            ISearchModuleDependency searchDependency = TodoDependencyHolder.f139242a.mo191730a().searchDependency();
            Context context = this.f139236a.f139227c;
            ITitleController iTitleController2 = this.f139236a.f139228d;
            if (iTitleController2 != null) {
                i = iTitleController2.mo99189a();
            } else {
                i = 0;
            }
            searchDependency.mo145424a(context, "key_todo_search_title", i);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56251d(TodoTitleControllerProxy aVar) {
            this.f139236a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "getContentView"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.c.a.a$b */
    static final class C56247b implements AbstractC44545b {

        /* renamed from: a */
        final /* synthetic */ TodoTitleControllerProxy f139232a;

        C56247b(TodoTitleControllerProxy aVar) {
            this.f139232a = aVar;
        }

        /* renamed from: a */
        public final ImageView getContentView() {
            ImageView imageView = new ImageView(this.f139232a.f139227c);
            imageView.setImageResource(R.drawable.ud_icon_more_outlined);
            imageView.setOnClickListener(new View$OnClickListenerC56248a(this));
            return imageView;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/wrapper/impl/tabspec/title/TodoTitleControllerProxy$funcMoreBtn$1$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.b.b.c.a.a$b$a */
        public static final class View$OnClickListenerC56248a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C56247b f139233a;

            View$OnClickListenerC56248a(C56247b bVar) {
                this.f139233a = bVar;
            }

            public final void onClick(View view) {
                this.f139233a.f139232a.f139226b.mo191723a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "getContentView"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.c.a.a$c */
    static final class C56249c implements AbstractC44545b {

        /* renamed from: a */
        final /* synthetic */ TodoTitleControllerProxy f139234a;

        C56249c(TodoTitleControllerProxy aVar) {
            this.f139234a = aVar;
        }

        /* renamed from: a */
        public final ImageView getContentView() {
            ImageView imageView = new ImageView(this.f139234a.f139227c);
            imageView.setImageResource(R.drawable.ud_icon_search_outline_outlined);
            imageView.setOnClickListener(new View$OnClickListenerC56250a(this));
            return imageView;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/wrapper/impl/tabspec/title/TodoTitleControllerProxy$funcSearchBtn$1$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.b.b.c.a.a$c$a */
        public static final class View$OnClickListenerC56250a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C56249c f139235a;

            View$OnClickListenerC56250a(C56249c cVar) {
                this.f139235a = cVar;
            }

            public final void onClick(View view) {
                this.f139235a.f139234a.f139226b.mo191724b();
            }
        }
    }

    /* renamed from: b */
    private final boolean m219485b() {
        ITitleController.Style style;
        ITitleController.Style style2 = ITitleController.Style.New;
        ITitleController iTitleController = this.f139228d;
        if (iTitleController != null) {
            style = iTitleController.mo99193b();
        } else {
            style = null;
        }
        if (style2 == style) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final TodoTitleInfo mo191714a() {
        List<? extends AbstractC44545b> list;
        boolean b = m219485b();
        LogMessageUtil cVar = LogMessageUtil.f139260a;
        Log.m165389i("TodoTitleControllerProxy", cVar.mo191772d("getTitleInfo isShow = " + b));
        if (!b) {
            return null;
        }
        TodoTitleInfo bVar = this.f139229f;
        if (TodoDependencyHolder.f139242a.mo191731b().mo191930c()) {
            list = CollectionsKt.listOf((Object[]) new AbstractC44545b[]{this.f139230g, this.f139231h});
        } else {
            list = CollectionsKt.listOf(this.f139231h);
        }
        bVar.mo191726a(list);
        return this.f139229f;
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoTitleControllerProxy
    /* renamed from: a */
    public void mo191715a(OnPopupWindowListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "popWindowListener");
        this.f139225a = dVar;
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoTitleControllerProxy
    /* renamed from: a */
    public void mo191716a(String str) {
        ITitleController iTitleController;
        Intrinsics.checkParameterIsNotNull(str, "title");
        this.f139229f.mo191725a(str);
        if (m219485b() && (iTitleController = this.f139228d) != null) {
            iTitleController.mo99191a(this.f139229f);
        }
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoTitleControllerProxy
    /* renamed from: a */
    public void mo191717a(boolean z, boolean z2) {
        if (z) {
            ITitleController iTitleController = this.f139228d;
            if (iTitleController != null) {
                iTitleController.mo99192a(z2);
                return;
            }
            return;
        }
        ITitleController iTitleController2 = this.f139228d;
        if (iTitleController2 != null) {
            iTitleController2.mo99194b(z2);
        }
    }

    public TodoTitleControllerProxy(Context context, ITitleController iTitleController) {
        List<? extends AbstractC44545b> list;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f139227c = context;
        this.f139228d = iTitleController;
        TodoTitleInfo bVar = new TodoTitleInfo();
        this.f139229f = bVar;
        C56249c cVar = new C56249c(this);
        this.f139230g = cVar;
        C56247b bVar2 = new C56247b(this);
        this.f139231h = bVar2;
        if (TodoDependencyHolder.f139242a.mo191731b().mo191930c()) {
            list = CollectionsKt.listOf((Object[]) new AbstractC44545b[]{cVar, bVar2});
        } else {
            list = CollectionsKt.listOf(bVar2);
        }
        bVar.mo191726a(list);
        if (this.f139228d == null) {
            Log.m165383e("TodoTitleControllerProxy", LogMessageUtil.f139260a.mo191772d("mTitleController is null"));
        }
    }
}
