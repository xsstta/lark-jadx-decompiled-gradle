package com.ss.android.lark.todo.wrapper.impl.chat.messagecard.pin;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lark.pb.basic.v1.TodoDetail;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a;
import com.ss.android.lark.todo.p2774b.p2776b.p2777a.p2778a.p2780b.C56239e;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.pin.TodoPinItemHoverHandler;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J%\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/pin/TodoPinHolderView;", "T", "Lcom/ss/android/lark/widget/recyclerview/MultiTypeItemHolderView;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/pin/TodoPinViewHolder;", "context", "Landroid/content/Context;", "pinInfoProvider", "Lcom/ss/android/lark/todo/wrapper/api/IChatWindowTodoMessageDependency$IPinInfoProvider;", "(Landroid/content/Context;Lcom/ss/android/lark/todo/wrapper/api/IChatWindowTodoMessageDependency$IPinInfoProvider;)V", "bindTodoData", "", "viewHolder", "getTodoAssigneeText", "", "operationContent", "Lcom/bytedance/lark/pb/basic/v1/TodoOperationContent;", "getTodoTitleText", "onBindViewHolder", "position", "", "item", "(Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/pin/TodoPinViewHolder;ILjava/lang/Object;)V", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setDisplaySize", "setUpFooter", "Companion", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.b.a */
public final class TodoPinHolderView<T> extends AbstractC58992f<T, C56239e> {

    /* renamed from: b */
    public static final Companion f139165b = new Companion(null);

    /* renamed from: a */
    public final AbstractC56227a.AbstractC56228a<T> f139166a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/pin/TodoPinHolderView$Companion;", "", "()V", "AVATAR_IMAGE_SIZE_IN_DP", "", "AVATAR_SIZE", "MENU_IMAGE_SIZE", "PADDING_HEIGHT", "PADDING_WIDTH", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "view", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a.b.a$b */
    public static final class View$OnClickListenerC56229b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoPinHolderView f139167a;

        View$OnClickListenerC56229b(TodoPinHolderView aVar) {
            this.f139167a = aVar;
        }

        public final void onClick(View view) {
            this.f139167a.f139166a.mo143010a(view);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a.b.a$c */
    public static final class View$OnClickListenerC56230c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoPinHolderView f139168a;

        View$OnClickListenerC56230c(TodoPinHolderView aVar) {
            this.f139168a = aVar;
        }

        public final void onClick(View view) {
            this.f139168a.f139166a.mo143009a(65297);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a.b.a$d */
    public static final class View$OnClickListenerC56231d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoPinHolderView f139169a;

        View$OnClickListenerC56231d(TodoPinHolderView aVar) {
            this.f139169a = aVar;
        }

        public final void onClick(View view) {
            this.f139169a.f139166a.mo143009a(65298);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a.b.a$e */
    public static final class View$OnClickListenerC56232e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoPinHolderView f139170a;

        View$OnClickListenerC56232e(TodoPinHolderView aVar) {
            this.f139170a = aVar;
        }

        public final void onClick(View view) {
            this.f139170a.f139166a.mo143009a(65299);
        }
    }

    /* renamed from: a */
    private final String m219381a(TodoOperationContent todoOperationContent) {
        TodoDetail todoDetail = todoOperationContent.todo_detail;
        if (todoDetail == null) {
            return "";
        }
        if (TextUtils.isEmpty(todoDetail.summary)) {
            return ResUtil.f139261a.mo191781c(R.string.Todo_Task_NoTitlePlaceholder);
        }
        String str = todoDetail.summary;
        Intrinsics.checkExpressionValueIsNotNull(str, "it.summary");
        return str;
    }

    /* renamed from: b */
    private final void m219384b(C56239e eVar) {
        if (this.f139166a.mo143018g()) {
            TextView textView = eVar.f139192k;
            Intrinsics.checkExpressionValueIsNotNull(textView, "viewHolder.mFooterTV");
            textView.setVisibility(0);
            TextView textView2 = eVar.f139192k;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "viewHolder.mFooterTV");
            textView2.setText(UIHelper.mustacheFormat((int) R.string.Lark_Pin_From, "name", this.f139166a.mo143019h()));
            return;
        }
        TextView textView3 = eVar.f139192k;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "viewHolder.mFooterTV");
        textView3.setVisibility(8);
    }

    /* renamed from: b */
    private final String m219383b(TodoOperationContent todoOperationContent) {
        List<TodoAssignee> list;
        TodoDetail todoDetail = todoOperationContent.todo_detail;
        if (todoDetail == null || (list = todoDetail.assignees) == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ResUtil.f139261a.mo191781c(R.string.Todo_Task_AssigneesAre2));
        int size = list.size() - 1;
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i).name);
            sb.append(UIHelper.getString(R.string.Todo_Task_Comma));
        }
        sb.append(list.get(list.size() - 1).name);
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "result.toString()");
        return sb2;
    }

    /* renamed from: a */
    private final void m219382a(C56239e eVar) {
        LKUIRoundedImageView lKUIRoundedImageView = eVar.f139185d;
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView, "viewHolder.mAvatarIV");
        C25649b.m91853a(lKUIRoundedImageView, 32);
        TextView textView = eVar.f139183b;
        Intrinsics.checkExpressionValueIsNotNull(textView, "viewHolder.mNameTV");
        C25649b.m91857a(textView, LarkFont.BODY1);
        TextView textView2 = eVar.f139184c;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "viewHolder.mTimeTV");
        C25649b.m91857a(textView2, LarkFont.CAPTION0);
        Context context = this.f146181d;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        int c = LKUIDisplayManager.m91881c(context, 24) + UIHelper.dp2px((float) 3);
        Context context2 = this.f146181d;
        Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
        int c2 = LKUIDisplayManager.m91881c(context2, 24) + UIHelper.dp2px((float) 6);
        ImageView imageView = eVar.f139191j;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "viewHolder.mItemMenuBtn");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.width = c;
            layoutParams2.height = c2;
            ImageView imageView2 = eVar.f139191j;
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "viewHolder.mItemMenuBtn");
            imageView2.setLayoutParams(layoutParams2);
            ImageView imageView3 = eVar.f139196o;
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "viewHolder.mPinTodoIV");
            C25649b.m91853a(imageView3, 32);
            TextView textView3 = eVar.f139182a;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "viewHolder.mTitle");
            C25649b.m91857a(textView3, LarkFont.HEADLINE);
            TextView textView4 = eVar.f139186e;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "viewHolder.mAssigneeText");
            C25649b.m91857a(textView4, LarkFont.BODY1);
            TextView textView5 = eVar.f139192k;
            Intrinsics.checkExpressionValueIsNotNull(textView5, "viewHolder.mFooterTV");
            C25649b.m91857a(textView5, LarkFont.BODY1);
            TextView textView6 = eVar.f139187f;
            Intrinsics.checkExpressionValueIsNotNull(textView6, "viewHolder.mNameAndTimeTV");
            C25649b.m91857a(textView6, LarkFont.CAPTION0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* renamed from: c */
    private final void m219385c(C56239e eVar) {
        TextView textView = eVar.f139182a;
        Intrinsics.checkExpressionValueIsNotNull(textView, "viewHolder.mTitle");
        textView.setVisibility(0);
        Content content = this.f139166a.mo143013b().getContent();
        Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent()");
        TodoOperationContent cardContentData = ((TodoContent) content).getCardContentData();
        if (cardContentData != null) {
            TextView textView2 = eVar.f139182a;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "viewHolder.mTitle");
            textView2.setText(m219381a(cardContentData));
            String b = m219383b(cardContentData);
            TextView textView3 = eVar.f139182a;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "viewHolder.mTitle");
            ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                String str = b;
                if (TextUtils.isEmpty(str)) {
                    TextView textView4 = eVar.f139186e;
                    Intrinsics.checkExpressionValueIsNotNull(textView4, "viewHolder.mAssigneeText");
                    textView4.setVisibility(8);
                    layoutParams2.f2818j = -1;
                    layoutParams2.f2819k = 0;
                } else {
                    TextView textView5 = eVar.f139186e;
                    Intrinsics.checkExpressionValueIsNotNull(textView5, "viewHolder.mAssigneeText");
                    textView5.setVisibility(0);
                    layoutParams2.f2818j = R.id.todo_assignee_content;
                    layoutParams2.f2819k = -1;
                }
                TextView textView6 = eVar.f139182a;
                Intrinsics.checkExpressionValueIsNotNull(textView6, "viewHolder.mTitle");
                textView6.setLayoutParams(layoutParams2);
                TextView textView7 = eVar.f139186e;
                Intrinsics.checkExpressionValueIsNotNull(textView7, "viewHolder.mAssigneeText");
                textView7.setText(str);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoPinHolderView(Context context, AbstractC56227a.AbstractC56228a<T> aVar) {
        super(context);
        Intrinsics.checkParameterIsNotNull(aVar, "pinInfoProvider");
        this.f139166a = aVar;
    }

    /* renamed from: a */
    public C56239e mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        C56239e a = C56239e.C56241a.m219399a(layoutInflater, viewGroup);
        Intrinsics.checkExpressionValueIsNotNull(a, "Factory.create(inflater, container)");
        return a;
    }

    /* renamed from: a */
    public void mo31174a(C56239e eVar, int i, T t) {
        Intrinsics.checkParameterIsNotNull(eVar, "viewHolder");
        this.f139166a.mo143011a((Object) t);
        String c = this.f139166a.mo143014c();
        String f = this.f139166a.mo143017f();
        String d = this.f139166a.mo143015d();
        String e = this.f139166a.mo143016e();
        if (this.f139166a.mo143012a()) {
            TextView textView = eVar.f139187f;
            Intrinsics.checkExpressionValueIsNotNull(textView, "viewHolder.mNameAndTimeTV");
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{c, f}, 2));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            textView.setText(format);
            ViewGroup viewGroup = eVar.f139189h;
            Intrinsics.checkExpressionValueIsNotNull(viewGroup, "viewHolder.mNormalSenderLayout");
            viewGroup.setVisibility(8);
            eVar.f139190i.setBackgroundResource(R.drawable.todo_wrapper_item_bg_c4_white);
            eVar.itemView.setBackgroundResource(R.drawable.todo_wrapper_item_bg_c4_white_border);
        } else {
            TextView textView2 = eVar.f139183b;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "viewHolder.mNameTV");
            textView2.setText(c);
            TextView textView3 = eVar.f139184c;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "viewHolder.mTimeTV");
            textView3.setText(f);
            TextView textView4 = eVar.f139187f;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "viewHolder.mNameAndTimeTV");
            textView4.setVisibility(8);
        }
        TodoDependencyHolder.f139242a.mo191730a().imageDependency().mo145392a(this.f146181d, d, e, eVar.f139185d, 24, 24);
        m219384b(eVar);
        m219385c(eVar);
        if (!DesktopUtil.m144307b()) {
            eVar.f139191j.setOnClickListener(new View$OnClickListenerC56229b(this));
            ImageView imageView = eVar.f139193l;
            Intrinsics.checkExpressionValueIsNotNull(imageView, "viewHolder.mUnPinIV");
            imageView.setVisibility(8);
            ImageView imageView2 = eVar.f139194m;
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "viewHolder.mJumpChatIV");
            imageView2.setVisibility(8);
            ImageView imageView3 = eVar.f139195n;
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "viewHolder.mForwardIV");
            imageView3.setVisibility(8);
            m219382a(eVar);
            return;
        }
        ImageView imageView4 = eVar.f139191j;
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "viewHolder.mItemMenuBtn");
        imageView4.setVisibility(8);
        eVar.f139193l.setOnClickListener(new View$OnClickListenerC56230c(this));
        eVar.f139194m.setOnClickListener(new View$OnClickListenerC56231d(this));
        eVar.f139195n.setOnClickListener(new View$OnClickListenerC56232e(this));
        TodoPinItemHoverHandler.Companion aVar = TodoPinItemHoverHandler.f139171b;
        View view = eVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "viewHolder.itemView");
        aVar.mo191688a(view);
    }
}
