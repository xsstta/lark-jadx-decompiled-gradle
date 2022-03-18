package com.ss.android.lark.todo.impl.features.messagecard.comment.mvvm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.lifecycle.AbstractC1142af;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.basic.v1.TodoAttachmentInfo;
import com.bytedance.lark.pb.basic.v1.TodoCommentDetail;
import com.bytedance.lark.pb.basic.v1.TodoDetail;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.bytedance.lark.pb.todo.v1.AuthScene;
import com.bytedance.lark.pb.todo.v1.TodoUser;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.detail.DetailEntrance;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56478e;
import com.ss.android.lark.todo.impl.features.messagecard.entity.TextAttributes;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/comment/mvvm/TodoCommentCardViewModel;", "Lcom/ss/android/lark/todo/impl/features/messagecard/comment/mvvm/ITodoCommentCardViewModel;", "Landroidx/lifecycle/ViewModel;", "contentData", "Lcom/bytedance/lark/pb/basic/v1/TodoOperationContent;", "chatId", "", "messageId", "(Lcom/bytedance/lark/pb/basic/v1/TodoOperationContent;Ljava/lang/String;Ljava/lang/String;)V", "getCommentAttachmentStr", "getCommentTitle", "", "context", "Landroid/content/Context;", "getCommentUserStr", "getEnterDetailIconAttr", "Lcom/ss/android/lark/todo/impl/features/messagecard/entity/TextAttributes;", "getHeadContainerBgColor", "Landroid/graphics/drawable/Drawable;", "getTodoCommentRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getTodoGuid", "getTodoSummaryStr", "getUpdateTitleStr", "onOpenTodoDetailClicked", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.a.a.b */
public final class TodoCommentCardViewModel extends AbstractC1142af {
    private final String chatId;
    private final TodoOperationContent contentData;
    private final String messageId;

    public String getTodoGuid() {
        String str;
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail == null || (str = todoDetail.guid) == null) {
            return "";
        }
        return str;
    }

    private final String getCommentUserStr() {
        TodoUser todoUser = this.contentData.operator;
        if (todoUser == null) {
            return "@";
        }
        return "@" + todoUser.name;
    }

    public Drawable getHeadContainerBgColor() {
        if (this.contentData.msg_status == TodoOperationContent.MsgStatus.DELETED) {
            return ResUtil.f139261a.mo191782d(R.drawable.todo_bg_expired_card);
        }
        return ResUtil.f139261a.mo191782d(R.drawable.todo_bg_activie_card);
    }

    private final String getTodoSummaryStr() {
        TodoDetail todoDetail = this.contentData.todo_detail;
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

    public String getCommentAttachmentStr() {
        List<TodoAttachmentInfo> list;
        TodoCommentDetail todoCommentDetail = this.contentData.todo_comment_detail;
        String str = "";
        if (!(todoCommentDetail == null || (list = todoCommentDetail.attachments) == null)) {
            for (TodoAttachmentInfo todoAttachmentInfo : list) {
                str = str + ResUtil.f139261a.mo191781c(R.string.Lark_Legacy_ImageSummarize);
            }
        }
        return str;
    }

    public TextAttributes getEnterDetailIconAttr() {
        boolean z;
        int i;
        if (this.contentData.msg_status != TodoOperationContent.MsgStatus.DELETED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = ResUtil.f139261a.mo191775a(R.color.text_title);
        } else {
            i = ResUtil.f139261a.mo191775a(R.color.text_placeholder);
        }
        return new TextAttributes(ResUtil.f139261a.mo191781c(R.string.Todo_Task_ViewDetails), i, z, false, 8, null);
    }

    public RichText getTodoCommentRichText() {
        TodoCommentDetail.TodoCommentType todoCommentType;
        if (this.contentData.todo_detail != null) {
            TodoCommentDetail todoCommentDetail = this.contentData.todo_comment_detail;
            RichContent richContent = null;
            if (todoCommentDetail != null) {
                todoCommentType = todoCommentDetail.comment_type;
            } else {
                todoCommentType = null;
            }
            if (todoCommentType != TodoCommentDetail.TodoCommentType.RICH_TEXT) {
                RichText b = C59029c.m229161b(ResUtil.f139261a.mo191781c(R.string.Todo_Task_UnsupportedComment));
                Intrinsics.checkExpressionValueIsNotNull(b, "RichTextCreator.generate…Task_UnsupportedComment))");
                return b;
            }
            TodoCommentDetail todoCommentDetail2 = this.contentData.todo_comment_detail;
            if (todoCommentDetail2 != null) {
                richContent = todoCommentDetail2.rich_content;
            }
            RichText a = C56478e.m220168a(richContent);
            Intrinsics.checkExpressionValueIsNotNull(a, "RichTextDocMergeHelper.g…ent_detail?.rich_content)");
            return a;
        }
        RichText a2 = C59029c.m229155a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "RichTextCreator.generateEmptyRichText()");
        return a2;
    }

    public String getUpdateTitleStr() {
        String str;
        TodoUser todoUser = this.contentData.operator;
        if (todoUser == null || (str = todoUser.name) == null) {
            str = "";
        }
        if (this.contentData.msg_status == TodoOperationContent.MsgStatus.DELETED) {
            return ResUtil.f139261a.mo191781c(R.string.Todo_Task_BotMsgTaskCardExpired);
        }
        TodoOperationContent.Type type = this.contentData.operation_type;
        if (type != null) {
            int i = C57136c.f140886a[type.ordinal()];
            if (i == 1) {
                return ResUtil.f139261a.mo191778a(R.string.Todo_Task_ReplyToCommentSimpleTitle, "user_name", str);
            }
            if (i == 2) {
                return ResUtil.f139261a.mo191781c(R.string.Todo_Notify_CommentReactionTitle);
            }
        }
        return ResUtil.f139261a.mo191778a(R.string.Todo_Task_CommentOnTaskTitle, "user_name", str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/messagecard/comment/mvvm/TodoCommentCardViewModel$getCommentTitle$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.a.a.b$a */
    public static final class C57135a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ TodoCommentCardViewModel f140884a;

        /* renamed from: b */
        final /* synthetic */ Context f140885b;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f140884a.onOpenTodoDetailClicked(this.f140885b);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            textPaint.setColor(ResUtil.f139261a.mo191775a(R.color.lkui_B700));
        }

        C57135a(TodoCommentCardViewModel bVar, Context context) {
            this.f140884a = bVar;
            this.f140885b = context;
        }
    }

    public void onOpenTodoDetailClicked(Context context) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkParameterIsNotNull(context, "context");
        TodoDetail todoDetail = this.contentData.todo_detail;
        if (todoDetail != null && (str = todoDetail.guid) != null) {
            DetailEntrance bVar = DetailEntrance.f139694a;
            String str4 = this.chatId;
            String str5 = "";
            if (str4 != null) {
                str2 = str4;
            } else {
                str2 = str5;
            }
            bVar.mo192302a(context, str, false, str2, this.messageId, String.valueOf(AuthScene.Type.MESSAGE.getValue()), this.messageId);
            TodoHitPoint.m221748c("chat", str);
            TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
            TodoDetail todoDetail2 = this.contentData.todo_detail;
            if (!(todoDetail2 == null || (str3 = todoDetail2.guid) == null)) {
                str5 = str3;
            }
            aVar.mo194195d(str5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence getCommentTitle(android.content.Context r15) {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.messagecard.comment.mvvm.TodoCommentCardViewModel.getCommentTitle(android.content.Context):java.lang.CharSequence");
    }

    public TodoCommentCardViewModel(TodoOperationContent todoOperationContent, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(todoOperationContent, "contentData");
        this.contentData = todoOperationContent;
        this.chatId = str;
        this.messageId = str2;
    }
}
