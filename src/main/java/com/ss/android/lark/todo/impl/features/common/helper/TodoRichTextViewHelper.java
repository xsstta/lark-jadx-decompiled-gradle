package com.ss.android.lark.todo.impl.features.common.helper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IMessengerDependency;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56253e;
import com.ss.android.lark.todo.impl.features.detail.common.SummaryClickSpan;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.C58507d;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/helper/TodoRichTextViewHelper;", "", "()V", "initEditText", "", "editText", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "insertUrl", "pasteBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "setReplaceContentSpan", "replaceContentSpan", "Lcom/ss/android/lark/widget/linked_emojicon/IconTitleSpan;", "docUrl", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.helper.e */
public final class TodoRichTextViewHelper {

    /* renamed from: a */
    public static final TodoRichTextViewHelper f139403a = new TodoRichTextViewHelper();

    private TodoRichTextViewHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/common/helper/TodoRichTextViewHelper$setReplaceContentSpan$1", "Lcom/ss/android/lark/widget/linked_emojicon/DrawableCallback;", "invalidateDrawable", "", "who", "Landroid/graphics/drawable/Drawable;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.helper.e$c */
    public static final class C56337c extends C58507d {

        /* renamed from: a */
        final /* synthetic */ RichTextEmojiconEditText f139406a;

        @Override // com.ss.android.lark.widget.linked_emojicon.C58507d
        public void invalidateDrawable(Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(drawable, "who");
            this.f139406a.getEditableText().append((CharSequence) " ");
            this.f139406a.getEditableText().replace(this.f139406a.getEditableText().length() - 1, this.f139406a.getEditableText().length(), "");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56337c(RichTextEmojiconEditText richTextEmojiconEditText, View view) {
            super(view);
            this.f139406a = richTextEmojiconEditText;
        }
    }

    /* renamed from: a */
    public final void mo192002a(RichTextEmojiconEditText richTextEmojiconEditText) {
        Intrinsics.checkParameterIsNotNull(richTextEmojiconEditText, "editText");
        richTextEmojiconEditText.setDisplayUrl(true);
        richTextEmojiconEditText.setDisplayUrlPreview(TodoDependencyHolder.f139242a.mo191731b().mo191933f());
        richTextEmojiconEditText.setDisplayImageMediaDigest(true);
        richTextEmojiconEditText.setAppendText(true);
        richTextEmojiconEditText.setFocusAfterInsertAt(false);
        richTextEmojiconEditText.setOutAtColor(UIHelper.getColor(R.color.text_caption));
        richTextEmojiconEditText.setMentionColor(UIHelper.getColor(R.color.text_title));
        richTextEmojiconEditText.setTranslateEmojiCode(true);
        richTextEmojiconEditText.setUrlClickListener(C56335a.f139404a);
        richTextEmojiconEditText.setAtClickListener(new C56336b(richTextEmojiconEditText));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "url", "", "onURLClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.helper.e$a */
    static final class C56335a implements RichTextEmojiconEditText.AbstractC40696f {

        /* renamed from: a */
        public static final C56335a f139404a = new C56335a();

        C56335a() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText.AbstractC40696f
        /* renamed from: a */
        public final void mo147005a(View view, String str) {
            Context context;
            AbstractC56253e browserDependency = TodoDependencyHolder.f139242a.mo191730a().browserDependency();
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            browserDependency.mo145368a(context, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "atId", "", "onAtClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.helper.e$b */
    static final class C56336b implements RichTextEmojiconEditText.AbstractC40694d {

        /* renamed from: a */
        final /* synthetic */ RichTextEmojiconEditText f139405a;

        C56336b(RichTextEmojiconEditText richTextEmojiconEditText) {
            this.f139405a = richTextEmojiconEditText;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText.AbstractC40694d
        /* renamed from: a */
        public final void mo147003a(View view, String str) {
            if (!Intrinsics.areEqual(str, C57814c.m224347a())) {
                IMessengerDependency messengerModuleDependency = TodoDependencyHolder.f139242a.mo191730a().messengerModuleDependency();
                Context context = this.f139405a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "editText.context");
                Intrinsics.checkExpressionValueIsNotNull(str, "atId");
                messengerModuleDependency.mo145420a(context, str);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo192004a(com.ss.android.lark.todo.impl.features.detail.viewmodel.UrlPasteBean r12, com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText r13) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.common.helper.TodoRichTextViewHelper.mo192004a(com.ss.android.lark.todo.impl.features.detail.viewmodel.ah, com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText):void");
    }

    /* renamed from: a */
    public final void mo192003a(RichTextEmojiconEditText richTextEmojiconEditText, C58508e eVar, String str) {
        Intrinsics.checkParameterIsNotNull(richTextEmojiconEditText, "editText");
        if (eVar != null) {
            C58508e.C58511b b = eVar.mo198323b();
            int i = b.f144396a;
            int i2 = i + b.f144398c;
            int i3 = b.f144398c;
            eVar.mo198322a(new C56337c(richTextEmojiconEditText, richTextEmojiconEditText));
            C58508e.C58511b b2 = eVar.mo198323b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "replaceContentSpan.target");
            if (!b2.mo198341a()) {
                while (true) {
                    int indexOf$default = StringsKt.indexOf$default((CharSequence) richTextEmojiconEditText.getEditableText().toString(), b.f144397b.toString(), 0, false, 6, (Object) null);
                    if (indexOf$default >= 0) {
                        SpannableString spannableString = new SpannableString("$");
                        spannableString.setSpan(eVar.mo198320a(), 0, 1, 33);
                        spannableString.setSpan(new SummaryClickSpan(str), 0, 1, 33);
                        richTextEmojiconEditText.setMovementMethod(RichTextEmojiconEditText.C40693c.m160980a());
                        richTextEmojiconEditText.getEditableText().replace(indexOf$default, indexOf$default + i3, spannableString);
                    } else {
                        return;
                    }
                }
            } else if (richTextEmojiconEditText.getEditableText().length() >= i2 && C57782ag.m224242a(richTextEmojiconEditText.getEditableText().subSequence(i, i2).toString(), b.f144397b.toString())) {
                SpannableString spannableString2 = new SpannableString(eVar.mo198326d());
                spannableString2.setSpan(eVar, 0, eVar.mo198326d().length(), 33);
                spannableString2.setSpan(new SummaryClickSpan(str), 0, eVar.mo198326d().length(), 33);
                richTextEmojiconEditText.setMovementMethod(RichTextEmojiconEditText.C40693c.m160980a());
                richTextEmojiconEditText.getEditableText().replace(i, i2, spannableString2, 0, spannableString2.length());
            }
        }
    }
}
