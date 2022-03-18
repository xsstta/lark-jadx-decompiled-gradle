package com.ss.android.lark.todo.impl.features.messagecard.helper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.basic.v1.TodoDetail;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IMessengerDependency;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56473b;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56478e;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/helper/TodoRichTextHelper;", "", "()V", "getTodoSummaryRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "todoDetail", "Lcom/bytedance/lark/pb/basic/v1/TodoDetail;", "getTodoSummaryStr", "", "showRichText", "", "richTextView", "Lcom/ss/android/lark/widget/richtext/RichTextView;", "richText", "todoGuid", "maxLines", "", "isTextBold", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.d.a */
public final class TodoRichTextHelper {

    /* renamed from: a */
    public static final TodoRichTextHelper f140904a = new TodoRichTextHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/todo/impl/features/messagecard/helper/TodoRichTextHelper$showRichText$1$1", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IURLStringClickListener;", "onURLClick", "", "view", "Landroid/view/View;", "text", "", "onURLLongClick", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.d.a$b */
    public static final class C57140b implements LinkEmojiTextView.AbstractC58525j {
        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
        /* renamed from: b */
        public boolean mo122807b(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "text");
            return false;
        }

        C57140b() {
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
        /* renamed from: a */
        public void mo122806a(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "text");
            TodoDependencyHolder.f139242a.mo191730a().browserDependency().mo145368a(view.getContext(), str);
        }
    }

    private TodoRichTextHelper() {
    }

    /* renamed from: b */
    private final String m221443b(TodoDetail todoDetail) {
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

    /* renamed from: a */
    public final RichText mo193945a(TodoDetail todoDetail) {
        com.bytedance.lark.pb.basic.v1.RichText richText;
        RichText richText2;
        if (todoDetail != null) {
            if (todoDetail.rich_summary != null) {
                RichContent richContent = todoDetail.rich_summary;
                com.bytedance.lark.pb.basic.v1.RichText richText3 = null;
                if (richContent != null) {
                    richText = richContent.rich_text;
                } else {
                    richText = null;
                }
                if (richText != null) {
                    RichContent richContent2 = todoDetail.rich_summary;
                    if (richContent2 != null) {
                        richText3 = richContent2.rich_text;
                    }
                    if (C59035h.m229210a(C56473b.m220117a(richText3))) {
                        richText2 = C59029c.m229161b(f140904a.m221443b(todoDetail));
                    } else {
                        richText2 = C56478e.m220168a(todoDetail.rich_summary);
                    }
                    Intrinsics.checkExpressionValueIsNotNull(richText2, "if (RichTextUtil.isEmpty…ummary)\n                }");
                    return richText2;
                }
            }
            RichText b = C59029c.m229161b(f140904a.m221443b(todoDetail));
            Intrinsics.checkExpressionValueIsNotNull(b, "RichTextCreator.generate…xt(getTodoSummaryStr(it))");
            return b;
        }
        RichText a = C59029c.m229155a();
        Intrinsics.checkExpressionValueIsNotNull(a, "RichTextCreator.generateEmptyRichText()");
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J&\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/messagecard/helper/TodoRichTextHelper$showRichText$1$2", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IAtStringClickListenr;", "onAtClick", "", "view", "Landroid/view/View;", "text", "", "userId", "onAtLongClick", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.d.a$a */
    public static final class C57139a implements LinkEmojiTextView.AbstractC58521f {

        /* renamed from: a */
        final /* synthetic */ int f140905a;

        /* renamed from: b */
        final /* synthetic */ int f140906b;

        /* renamed from: c */
        final /* synthetic */ int f140907c;

        /* renamed from: d */
        final /* synthetic */ boolean f140908d;

        /* renamed from: e */
        final /* synthetic */ String f140909e;

        /* renamed from: f */
        final /* synthetic */ RichText f140910f;

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
        /* renamed from: b */
        public boolean mo117507b(View view, String str, String str2) {
            return false;
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
        /* renamed from: c */
        public void mo120297c(View view, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str2, "userId");
            TodoGeneralHitPoint.f141070a.mo194199e(this.f140909e);
            IMessengerDependency messengerModuleDependency = TodoDependencyHolder.f139242a.mo191730a().messengerModuleDependency();
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            messengerModuleDependency.mo145420a(context, str2);
        }

        C57139a(int i, int i2, int i3, boolean z, String str, RichText richText) {
            this.f140905a = i;
            this.f140906b = i2;
            this.f140907c = i3;
            this.f140908d = z;
            this.f140909e = str;
            this.f140910f = richText;
        }
    }

    /* renamed from: a */
    public final void mo193946a(RichTextView richTextView, RichText richText, String str, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(richTextView, "richTextView");
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        if (C59035h.m229210a(richText)) {
            richTextView.setVisibility(8);
        } else {
            richTextView.setVisibility(0);
        }
        richTextView.setAtTextColor(R.color.text_link_normal);
        richTextView.setAtOtherChatUserTextColor(R.color.text_caption);
        richTextView.setDefaultAtUserColor(UIHelper.getColor(R.color.text_link_normal));
        richTextView.setUrlTextColor(UIHelper.getColor(R.color.text_link_normal));
        richTextView.setShowImage(false);
        richTextView.setShowVideo(false);
        richTextView.setMaxLines(i);
        richTextView.setFakeBoldText(z);
        richTextView.setIncludeFontPadding(false);
        richTextView.setNeedToRecognizePhone(false);
        richTextView.mo200506a();
        richTextView.mo200512b();
        richTextView.setUrlStringClickListner(new C57140b());
        richTextView.setAtStringClickListner(new C57139a(R.color.text_link_normal, R.color.text_caption, i, z, str, richText));
        richTextView.mo200509a(richText, "", true);
    }
}
