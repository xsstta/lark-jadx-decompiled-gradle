package com.ss.android.lark.todo.wrapper;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.bytedance.lark.pb.basic.v1.TodoDetail;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.larksuite.suite.R;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.todo.TodoModule;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56473b;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a;
import com.ss.android.lark.todo.wrapper.api.IShareModuleDependencyFromTodo;
import com.ss.android.lark.todo.wrapper.api.ITodoModuleForLark;
import com.ss.android.lark.todo.wrapper.api.ITodoParser;
import com.ss.android.lark.todo.wrapper.impl.chat.ChatWindowTodoMessage;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.parser.TodoEntityParser;
import com.ss.android.lark.todo.wrapper.impl.handler.OpenTodoCreateAppHandler;
import com.ss.android.lark.todo.wrapper.impl.handler.OpenTodoDetailAppHandler;
import com.ss.android.lark.todo.wrapper.impl.handler.OpenTodoFilterAppHandler;
import com.ss.android.lark.todo.wrapper.impl.handler.OpenTodoTabAppHandler;
import com.ss.android.lark.todo.wrapper.impl.tabspec.TodoTabPageSpec;
import com.ss.android.lark.widget.richtext.C59035h;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001e\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/TodoModuleWrapper;", "Lcom/ss/android/lark/todo/TodoModule;", "Lcom/ss/android/lark/todo/wrapper/api/ITodoModuleForLark;", "()V", "mTodoTabPageSpec", "Lcom/ss/android/lark/todo/wrapper/impl/tabspec/TodoTabPageSpec;", "createTodoTabPageSpec", "Lcom/ss/android/lark/maincore/TabPageSpec;", "context", "Landroid/content/Context;", "titleController", "Lcom/ss/android/lark/maincore/ITitleController;", "getAppLinkHandlers", "", "", "Lcom/ss/android/lark/applink/AppLinkHandler;", "getChatTodoMessageDependency", "Lcom/ss/android/lark/todo/wrapper/api/IChatWindowTodoMessageDependency;", "getShareDependencyFromTodo", "Lcom/ss/android/lark/todo/wrapper/api/IShareModuleDependencyFromTodo;", "getTodoParser", "Lcom/ss/android/lark/todo/wrapper/api/ITodoParser;", "isTodoDailyRemindEnable", "", "isTodoTabEnable", "Companion", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.a */
public final class TodoModuleWrapper extends TodoModule implements ITodoModuleForLark {

    /* renamed from: b */
    public static final Companion f139161b = new Companion(null);

    /* renamed from: c */
    private volatile TodoTabPageSpec f139162c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/TodoModuleWrapper$Companion;", "", "()V", "TITLE_TEXT_SIZE", "", "getDependency", "Lcom/ss/android/lark/todo/dependency/ITodoDependency;", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J0\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/todo/wrapper/TodoModuleWrapper$getShareDependencyFromTodo$1", "Lcom/ss/android/lark/todo/wrapper/api/IShareModuleDependencyFromTodo;", "bindCommonView", "", "shareTitle", "Landroid/widget/TextView;", "shareContent", "icon", "Landroid/widget/ImageView;", "bindViewWithShareMsg", "content", "Lcom/ss/android/lark/chat/entity/message/content/TodoContent;", "bindViewWithTodoSummary", "todoSummary", "", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.a$b */
    public static final class C56226b implements IShareModuleDependencyFromTodo {
        C56226b() {
        }

        /* renamed from: a */
        private final void m219349a(TextView textView, TextView textView2, ImageView imageView) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setTextColor(ResUtil.f139261a.mo191775a(R.color.text_title));
            }
            if (textView != null) {
                textView.setTextSize(1, 14.0f);
            }
            if (textView != null) {
                textView.setSingleLine(false);
            }
            if (textView != null) {
                textView.setMaxLines(3);
            }
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (imageView != null) {
                imageView.setImageResource(R.drawable.todo_svg_icon_share_icon);
            }
        }

        @Override // com.ss.android.lark.todo.wrapper.api.IShareModuleDependencyFromTodo
        /* renamed from: a */
        public void mo191672a(TextView textView, TextView textView2, ImageView imageView, String str) {
            CharSequence charSequence;
            m219349a(textView, textView2, imageView);
            if (textView != null) {
                if (str != null) {
                    charSequence = str;
                }
                textView.setText(charSequence);
            }
        }

        @Override // com.ss.android.lark.todo.wrapper.api.IShareModuleDependencyFromTodo
        /* renamed from: a */
        public void mo191671a(TextView textView, TextView textView2, ImageView imageView, TodoContent todoContent) {
            CharSequence charSequence;
            TodoOperationContent cardContentData;
            TodoDetail todoDetail;
            RichContent richContent;
            RichText richText;
            String a;
            m219349a(textView, textView2, imageView);
            if (textView != null) {
                if (todoContent != null && (cardContentData = todoContent.getCardContentData()) != null && (todoDetail = cardContentData.todo_detail) != null && (richContent = todoDetail.rich_summary) != null && (richText = richContent.rich_text) != null && (a = C59035h.m229208a(C56473b.m220117a(richText), false)) != null) {
                    charSequence = a;
                }
                textView.setText(charSequence);
            }
        }
    }

    @Override // com.ss.android.lark.todo.wrapper.api.ITodoModuleForLark
    /* renamed from: g */
    public IShareModuleDependencyFromTodo mo191667g() {
        return new C56226b();
    }

    @Override // com.ss.android.lark.todo.wrapper.api.ITodoModuleForLark
    /* renamed from: h */
    public ITodoParser mo191668h() {
        return new TodoEntityParser();
    }

    @Override // com.ss.android.lark.todo.wrapper.api.ITodoModuleForLark
    /* renamed from: f */
    public AbstractC56227a mo191666f() {
        return ChatWindowTodoMessage.f139164b.mo191677a();
    }

    @Override // com.ss.android.lark.todo.wrapper.api.ITodoModuleForLark
    /* renamed from: i */
    public boolean mo191669i() {
        return TodoDependencyHolder.f139242a.mo191730a().mainModuleDependency().mo145418b();
    }

    @Override // com.ss.android.lark.todo.wrapper.api.ITodoModuleForLark
    /* renamed from: j */
    public boolean mo191670j() {
        return TodoDependencyHolder.f139242a.mo191731b().mo191928a();
    }

    @Override // com.ss.android.lark.todo.wrapper.api.ITodoModuleForLark
    /* renamed from: a */
    public Map<String, AbstractC29186b> mo191665a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("/client/todo/detail", new OpenTodoDetailAppHandler(this));
        hashMap.put("/client/todo/open", new OpenTodoTabAppHandler());
        hashMap.put("/client/todo/view", new OpenTodoFilterAppHandler());
        hashMap.put("/client/todo/create", new OpenTodoCreateAppHandler());
        return hashMap;
    }

    @Override // com.ss.android.lark.todo.wrapper.api.ITodoModuleForLark
    /* renamed from: a */
    public AbstractC44552i mo191664a(Context context, ITitleController iTitleController) {
        if (context == null) {
            return null;
        }
        if (this.f139162c == null) {
            return new TodoTabPageSpec(context, iTitleController);
        }
        TodoTabPageSpec aVar = this.f139162c;
        if (aVar != null) {
            aVar.mo191707a(context, iTitleController);
        }
        TodoTabPageSpec aVar2 = this.f139162c;
        this.f139162c = null;
        return aVar2;
    }
}
