package com.ss.android.lark.todo.impl.features.messagecard.comment.mvvm;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.messagecard.entity.TextAttributes;
import com.ss.android.lark.todo.impl.features.messagecard.helper.TodoRichTextHelper;
import com.ss.android.lark.todo.impl.features.messagecard.listener.OpenTodoDetailActivityClickListener;
import com.ss.android.lark.widget.richtext.RichTextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/comment/mvvm/TodoCommentCardView;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/lifecycle/LifecycleOwner;", "holderView", "Landroid/view/View;", "viewModel", "Lcom/ss/android/lark/todo/impl/features/messagecard/comment/mvvm/TodoCommentCardViewModel;", "(Landroid/view/View;Lcom/ss/android/lark/todo/impl/features/messagecard/comment/mvvm/TodoCommentCardViewModel;)V", "mLifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getMLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "mLifecycleRegistry$delegate", "Lkotlin/Lazy;", "bindCardButton", "", "bindCardContent", "bindCardItemView", "bindEnterDetailIcon", "bindLiveData", "getLifecycle", "registerLifeCycle", "setViewModel", "unRegisterLifeCycle", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.a.a.a */
public final class TodoCommentCardView extends RecyclerView.ViewHolder implements LifecycleOwner {

    /* renamed from: a */
    public final View f140879a;

    /* renamed from: b */
    public TodoCommentCardViewModel f140880b;

    /* renamed from: c */
    private final Lazy f140881c = LazyKt.lazy(new C57134b(this));

    /* renamed from: c */
    private final LifecycleRegistry m221412c() {
        return (LifecycleRegistry) this.f140881c.getValue();
    }

    /* renamed from: d */
    private final void m221413d() {
        m221414e();
    }

    /* renamed from: g */
    private final void m221416g() {
        m221417h();
    }

    /* renamed from: b */
    public LifecycleRegistry getLifecycle() {
        return m221412c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LifecycleRegistry;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.a.a.a$b */
    static final class C57134b extends Lambda implements Function0<LifecycleRegistry> {
        final /* synthetic */ TodoCommentCardView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57134b(TodoCommentCardView aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LifecycleRegistry invoke() {
            return new LifecycleRegistry(this.this$0);
        }
    }

    /* renamed from: a */
    public final void mo193917a() {
        m221413d();
        m221415f();
        m221416g();
    }

    /* renamed from: e */
    private final void m221414e() {
        m221412c().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        m221412c().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/messagecard/comment/mvvm/TodoCommentCardView$bindEnterDetailIcon$1$1", "Lcom/ss/android/lark/todo/impl/features/messagecard/listener/OpenTodoDetailActivityClickListener$ITodoCardEnterDetailListener;", "onEnterDetailClicked", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.a.a.a$a */
    public static final class C57133a implements OpenTodoDetailActivityClickListener.ITodoCardEnterDetailListener {

        /* renamed from: a */
        final /* synthetic */ TodoCommentCardView f140882a;

        /* renamed from: b */
        final /* synthetic */ TextAttributes f140883b;

        @Override // com.ss.android.lark.todo.impl.features.messagecard.listener.OpenTodoDetailActivityClickListener.ITodoCardEnterDetailListener
        /* renamed from: a */
        public void mo193920a() {
            TodoCommentCardViewModel bVar = this.f140882a.f140880b;
            TextView textView = (TextView) this.f140882a.f140879a.findViewById(R.id.todo_icon_detail);
            Intrinsics.checkExpressionValueIsNotNull(textView, "holderView.todo_icon_detail");
            Context context = textView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "holderView.todo_icon_detail.context");
            bVar.onOpenTodoDetailClicked(context);
        }

        C57133a(TodoCommentCardView aVar, TextAttributes aVar2) {
            this.f140882a = aVar;
            this.f140883b = aVar2;
        }
    }

    /* renamed from: h */
    private final void m221417h() {
        TextAttributes enterDetailIconAttr = this.f140880b.getEnterDetailIconAttr();
        TextView textView = (TextView) this.f140879a.findViewById(R.id.todo_icon_detail);
        textView.setOnClickListener(new OpenTodoDetailActivityClickListener(new C57133a(this, enterDetailIconAttr)));
        textView.setText(enterDetailIconAttr.mo193938a());
        textView.setTextColor(enterDetailIconAttr.mo193939b());
        textView.setEnabled(enterDetailIconAttr.mo193940c());
    }

    /* renamed from: f */
    private final void m221415f() {
        boolean z;
        RelativeLayout relativeLayout = (RelativeLayout) this.f140879a.findViewById(R.id.bot_head_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "holderView.bot_head_container");
        relativeLayout.setBackground(this.f140880b.getHeadContainerBgColor());
        TextView textView = (TextView) this.f140879a.findViewById(R.id.todo_update_title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "holderView.todo_update_title");
        textView.setText(this.f140880b.getUpdateTitleStr());
        TextView textView2 = (TextView) this.f140879a.findViewById(R.id.tv_comment_title);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "holderView.tv_comment_title");
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView3 = (TextView) this.f140879a.findViewById(R.id.tv_comment_title);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "holderView.tv_comment_title");
        TodoCommentCardViewModel bVar = this.f140880b;
        TextView textView4 = (TextView) this.f140879a.findViewById(R.id.tv_comment_title);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "holderView.tv_comment_title");
        Context context = textView4.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "holderView.tv_comment_title.context");
        textView3.setText(bVar.getCommentTitle(context));
        TodoRichTextHelper aVar = TodoRichTextHelper.f140904a;
        RichTextView richTextView = (RichTextView) this.f140879a.findViewById(R.id.tv_comment_content);
        Intrinsics.checkExpressionValueIsNotNull(richTextView, "holderView.tv_comment_content");
        aVar.mo193946a(richTextView, this.f140880b.getTodoCommentRichText(), this.f140880b.getTodoGuid(), 2, true);
        String commentAttachmentStr = this.f140880b.getCommentAttachmentStr();
        TextView textView5 = (TextView) this.f140879a.findViewById(R.id.tv_comment_attachment);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "holderView.tv_comment_attachment");
        String str = commentAttachmentStr;
        textView5.setText(str);
        TextView textView6 = (TextView) this.f140879a.findViewById(R.id.tv_comment_attachment);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "holderView.tv_comment_attachment");
        int i = 0;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        textView6.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo193918a(TodoCommentCardViewModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        this.f140880b = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoCommentCardView(View view, TodoCommentCardViewModel bVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "holderView");
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        this.f140879a = view;
        this.f140880b = bVar;
    }
}
