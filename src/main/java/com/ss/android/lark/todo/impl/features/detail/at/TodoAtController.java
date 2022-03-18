package com.ss.android.lark.todo.impl.features.detail.at;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.detail.at.model.TodoAtModel;
import com.ss.android.lark.todo.impl.features.detail.at.model.TodoAtViewModel;
import com.ss.android.lark.todo.impl.features.detail.at.view.TodoAtView;
import com.ss.android.lark.utils.C57767ae;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 E2\u00020\u0001:\u0002EFB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\"\u00107\u001a\u0002082\u0006\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020\u00142\b\u0010;\u001a\u0004\u0018\u00010 H\u0016J\b\u0010<\u001a\u000208H\u0016J\u001e\u0010=\u001a\u0002082\u0006\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020\u0007J \u0010A\u001a\u0002082\u0006\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020 2\b\u0010B\u001a\u0004\u0018\u00010 J\u0010\u0010C\u001a\u0002082\u0006\u0010D\u001a\u00020 H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006G"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/TodoAtController;", "Lcom/ss/android/lark/todo/impl/features/detail/at/ITodoAtController;", "context", "Landroidx/fragment/app/FragmentActivity;", "listener", "Lcom/ss/android/lark/todo/impl/features/detail/at/TodoAtController$InsertAtTagListener;", "largeMargin", "", "handleEditorAction", "fullScreenAt", "(Landroidx/fragment/app/FragmentActivity;Lcom/ss/android/lark/todo/impl/features/detail/at/TodoAtController$InsertAtTagListener;ZZZ)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "getFullScreenAt", "()Z", "getHandleEditorAction", "getLargeMargin", "getListener", "()Lcom/ss/android/lark/todo/impl/features/detail/at/TodoAtController$InsertAtTagListener;", "mContainer", "Landroid/widget/FrameLayout;", "getMContainer", "()Landroid/widget/FrameLayout;", "setMContainer", "(Landroid/widget/FrameLayout;)V", "mModel", "Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtModel;", "getMModel", "()Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtModel;", "setMModel", "(Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtModel;)V", "mSearchKey", "", "getMSearchKey", "()Ljava/lang/String;", "setMSearchKey", "(Ljava/lang/String;)V", "mTodoAtAnchorEditText", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "getMTodoAtAnchorEditText", "()Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "setMTodoAtAnchorEditText", "(Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;)V", "mTodoAtView", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView;", "getMTodoAtView", "()Lcom/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView;", "setMTodoAtView", "(Lcom/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView;)V", "mViewModel", "Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtViewModel;", "getMViewModel", "()Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtViewModel;", "setMViewModel", "(Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtViewModel;)V", "bind", "", "editText", "container", "chatId", "destroy", "insertAtTag", BottomDialog.f17198f, "displayName", "isOutUser", "insertAtTagIfNeed", "searchKey", "onAtEventTrigger", "content", "Companion", "InsertAtTagListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a */
public final class TodoAtController {

    /* renamed from: c */
    public static final Companion f139607c = new Companion(null);

    /* renamed from: a */
    public TodoAtViewModel f139608a;

    /* renamed from: b */
    public TodoAtModel f139609b;

    /* renamed from: d */
    private RichTextEmojiconEditText f139610d;

    /* renamed from: e */
    private FrameLayout f139611e;

    /* renamed from: f */
    private TodoAtView f139612f;

    /* renamed from: g */
    private String f139613g;

    /* renamed from: h */
    private final FragmentActivity f139614h;

    /* renamed from: i */
    private final InsertAtTagListener f139615i;

    /* renamed from: j */
    private final boolean f139616j;

    /* renamed from: k */
    private final boolean f139617k;

    /* renamed from: l */
    private final boolean f139618l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/TodoAtController$InsertAtTagListener;", "", "isOutUser", "", "userId", "", "isTodoAtViewShow", "", "isShow", "onInsertAtTag", BottomDialog.f17198f, "onSelectAtChatter", "displayName", "startFullScreenAtSelector", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a$b */
    public interface InsertAtTagListener {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a$b$a */
        public static final class C56450a {
            /* renamed from: a */
            public static void m220035a(InsertAtTagListener bVar) {
            }

            /* renamed from: a */
            public static void m220036a(InsertAtTagListener bVar, boolean z) {
            }

            /* renamed from: a */
            public static boolean m220037a(InsertAtTagListener bVar, String str) {
                Intrinsics.checkParameterIsNotNull(str, "userId");
                return false;
            }
        }

        /* renamed from: a */
        void mo192120a();

        /* renamed from: a */
        void mo192121a(String str);

        /* renamed from: a */
        void mo192122a(String str, String str2);

        /* renamed from: a */
        void mo192123a(boolean z);

        /* renamed from: b */
        boolean mo192124b(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/TodoAtController$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/at/TodoAtController$bind$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a$e */
    public static final class C56453e implements C1144ai.AbstractC1146b {
        C56453e() {
        }

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            return new TodoAtViewModel();
        }
    }

    /* renamed from: a */
    public final RichTextEmojiconEditText mo192230a() {
        return this.f139610d;
    }

    /* renamed from: b */
    public final TodoAtView mo192235b() {
        return this.f139612f;
    }

    /* renamed from: c */
    public final String mo192236c() {
        return this.f139613g;
    }

    /* renamed from: e */
    public final InsertAtTagListener mo192238e() {
        return this.f139615i;
    }

    /* renamed from: f */
    public final boolean mo192239f() {
        return this.f139618l;
    }

    /* renamed from: d */
    public void mo192237d() {
        TodoAtView aVar = this.f139612f;
        if (aVar != null) {
            aVar.mo192259c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/todo/impl/features/detail/at/TodoAtController$insertAtTag$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a$f */
    static final class RunnableC56454f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RichTextEmojiconEditText f139622a;

        /* renamed from: b */
        final /* synthetic */ TodoAtController f139623b;

        /* renamed from: c */
        final /* synthetic */ String f139624c;

        /* renamed from: d */
        final /* synthetic */ String f139625d;

        /* renamed from: e */
        final /* synthetic */ boolean f139626e;

        RunnableC56454f(RichTextEmojiconEditText richTextEmojiconEditText, TodoAtController aVar, String str, String str2, boolean z) {
            this.f139622a = richTextEmojiconEditText;
            this.f139623b = aVar;
            this.f139624c = str;
            this.f139625d = str2;
            this.f139626e = z;
        }

        public final void run() {
            this.f139622a.requestFocus();
            KeyboardUtils.showKeyboard(this.f139622a);
            InsertAtTagListener e = this.f139623b.mo192238e();
            if (e != null) {
                e.mo192121a(this.f139624c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/todo/impl/features/detail/at/TodoAtController$insertAtTagIfNeed$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a$g */
    static final class RunnableC56455g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RichTextEmojiconEditText f139627a;

        /* renamed from: b */
        final /* synthetic */ TodoAtController f139628b;

        /* renamed from: c */
        final /* synthetic */ String f139629c;

        /* renamed from: d */
        final /* synthetic */ String f139630d;

        /* renamed from: e */
        final /* synthetic */ String f139631e;

        RunnableC56455g(RichTextEmojiconEditText richTextEmojiconEditText, TodoAtController aVar, String str, String str2, String str3) {
            this.f139627a = richTextEmojiconEditText;
            this.f139628b = aVar;
            this.f139629c = str;
            this.f139630d = str2;
            this.f139631e = str3;
        }

        public final void run() {
            this.f139627a.requestFocus();
            KeyboardUtils.showKeyboard(this.f139627a);
            InsertAtTagListener e = this.f139628b.mo192238e();
            if (e != null) {
                e.mo192121a(this.f139630d);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/at/TodoAtController$onAtEventTrigger$2$1", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/TodoAtView$ITodoViewDependency;", "isTodoAtViewShow", "", "isShow", "", "onSelectedItem", BottomDialog.f17198f, "", "displayName", "isOutChatUser", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a$h */
    public static final class C56456h implements TodoAtView.ITodoViewDependency {

        /* renamed from: a */
        final /* synthetic */ TodoAtController f139632a;

        C56456h(TodoAtController aVar) {
            this.f139632a = aVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.detail.at.view.TodoAtView.ITodoViewDependency
        /* renamed from: a */
        public void mo192245a(boolean z) {
            InsertAtTagListener e = this.f139632a.mo192238e();
            if (e != null) {
                e.mo192123a(z);
            }
        }

        @Override // com.ss.android.lark.todo.impl.features.detail.at.view.TodoAtView.ITodoViewDependency
        /* renamed from: a */
        public void mo192244a(String str, String str2, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            Intrinsics.checkParameterIsNotNull(str2, "displayName");
            RichTextEmojiconEditText a = this.f139632a.mo192230a();
            if (a != null) {
                if (this.f139632a.mo192236c() != null) {
                    int selectionEnd = a.getSelectionEnd();
                    a.getEditableText().delete((selectionEnd - this.f139632a.mo192236c().length()) - 1, selectionEnd);
                }
                InsertAtTagListener e = this.f139632a.mo192238e();
                if (e != null) {
                    e.mo192122a(str, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo192232a(String str) {
        int i;
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, "@", 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            Log.m165383e("TodoAtController", "not found at for search key");
            return;
        }
        int i2 = lastIndexOf$default + 1;
        RichTextEmojiconEditText richTextEmojiconEditText = this.f139610d;
        if (richTextEmojiconEditText == null || richTextEmojiconEditText.getSelectionEnd() < i2) {
            i = i2;
        } else {
            i = richTextEmojiconEditText.getSelectionEnd();
        }
        if (str != null) {
            String substring = str.substring(i2, i);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (this.f139612f == null) {
                FragmentActivity fragmentActivity = this.f139614h;
                TodoAtViewModel bVar = this.f139608a;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                TodoAtView aVar = new TodoAtView(fragmentActivity, bVar, this.f139616j, new C56456h(this));
                this.f139612f = aVar;
                aVar.setVisibility(8);
                FrameLayout frameLayout = this.f139611e;
                if (frameLayout != null) {
                    frameLayout.addView(this.f139612f, new ConstraintLayout.LayoutParams(-1, -1));
                }
            }
            TodoAtModel aVar2 = this.f139609b;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mModel");
            }
            aVar2.mo192250a(substring);
            this.f139613g = substring;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/at/TodoAtController$bind$2$1", "Lcom/ss/android/lark/utils/SimpleTextWatcher;", "onTextChanged", "", "s", "", "start", "", "before", "count", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a$c */
    public static final class C56451c extends C57767ae {

        /* renamed from: a */
        final /* synthetic */ RichTextEmojiconEditText f139619a;

        /* renamed from: b */
        final /* synthetic */ TodoAtController f139620b;

        C56451c(RichTextEmojiconEditText richTextEmojiconEditText, TodoAtController aVar) {
            this.f139619a = richTextEmojiconEditText;
            this.f139620b = aVar;
        }

        @Override // com.ss.android.lark.utils.C57767ae
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence != null) {
                boolean z = false;
                if (StringsKt.contains$default(charSequence, '@', false, 2, (Object) null)) {
                    TodoAtView b = this.f139620b.mo192235b();
                    if (b != null) {
                        z = b.mo192257a();
                    }
                    if (z) {
                        this.f139620b.mo192232a(this.f139619a.getText().toString());
                    } else if (i3 != 1 || charSequence.charAt(i) != '@' || !this.f139619a.hasFocus()) {
                    } else {
                        if (this.f139620b.mo192239f()) {
                            InsertAtTagListener e = this.f139620b.mo192238e();
                            if (e != null) {
                                e.mo192120a();
                                return;
                            }
                            return;
                        }
                        this.f139620b.mo192232a(this.f139619a.getText().toString());
                    }
                } else {
                    TodoAtView b2 = this.f139620b.mo192235b();
                    if (b2 != null) {
                        b2.mo192258b();
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction", "com/ss/android/lark/todo/impl/features/detail/at/TodoAtController$bind$2$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a$d */
    static final class C56452d implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ TodoAtController f139621a;

        C56452d(TodoAtController aVar) {
            this.f139621a = aVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            TodoAtView b;
            if ((i != 6 && i != 5) || (b = this.f139621a.mo192235b()) == null) {
                return false;
            }
            b.mo192258b();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo192234a(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "displayName");
        RichTextEmojiconEditText richTextEmojiconEditText = this.f139610d;
        if (richTextEmojiconEditText != null) {
            richTextEmojiconEditText.mo146917a(str, str2, z, false);
            richTextEmojiconEditText.post(new RunnableC56454f(richTextEmojiconEditText, this, str, str2, z));
        }
    }

    /* renamed from: a */
    public void mo192231a(RichTextEmojiconEditText richTextEmojiconEditText, FrameLayout frameLayout, String str) {
        Intrinsics.checkParameterIsNotNull(richTextEmojiconEditText, "editText");
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        this.f139610d = richTextEmojiconEditText;
        this.f139611e = frameLayout;
        AbstractC1142af a = new C1144ai(this.f139614h, new C56453e()).mo6006a(String.valueOf(richTextEmojiconEditText.getId()), TodoAtViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(contex…oAtViewModel::class.java)");
        TodoAtViewModel bVar = (TodoAtViewModel) a;
        this.f139608a = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        this.f139609b = new TodoAtModel(bVar, str, this.f139616j);
        RichTextEmojiconEditText richTextEmojiconEditText2 = this.f139610d;
        if (richTextEmojiconEditText2 != null) {
            richTextEmojiconEditText2.addTextChangedListener(new C56451c(richTextEmojiconEditText2, this));
            if (this.f139617k) {
                richTextEmojiconEditText2.setOnEditorActionListener(new C56452d(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo192233a(String str, String str2, String str3) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "displayName");
        RichTextEmojiconEditText richTextEmojiconEditText = this.f139610d;
        if (richTextEmojiconEditText != null) {
            if (str3 != null) {
                int selectionEnd = richTextEmojiconEditText.getSelectionEnd();
                richTextEmojiconEditText.getEditableText().delete((selectionEnd - str3.length()) - 1, selectionEnd);
            }
            InsertAtTagListener bVar = this.f139615i;
            if (bVar != null) {
                z = bVar.mo192124b(str);
            } else {
                z = false;
            }
            richTextEmojiconEditText.mo146917a(str, str2, z, false);
            richTextEmojiconEditText.post(new RunnableC56455g(richTextEmojiconEditText, this, str3, str, str2));
        }
    }

    public TodoAtController(FragmentActivity fragmentActivity, InsertAtTagListener bVar, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        this.f139614h = fragmentActivity;
        this.f139615i = bVar;
        this.f139616j = z;
        this.f139617k = z2;
        this.f139618l = z3;
        this.f139613g = "";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TodoAtController(androidx.fragment.app.FragmentActivity r7, com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener r8, boolean r9, boolean r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 8
            if (r13 == 0) goto L_0x0007
            r10 = 1
            r4 = 1
            goto L_0x0008
        L_0x0007:
            r4 = r10
        L_0x0008:
            r10 = r12 & 16
            if (r10 == 0) goto L_0x000f
            r11 = 0
            r5 = 0
            goto L_0x0010
        L_0x000f:
            r5 = r11
        L_0x0010:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.<init>(androidx.fragment.app.FragmentActivity, com.ss.android.lark.todo.impl.features.detail.at.a$b, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
