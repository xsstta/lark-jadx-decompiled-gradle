package com.ss.android.lark.todo.impl.features.detail.sections;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.IconKeyDrawable;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IActionDispatcher;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.framework.section.utils.DebounceDispatcher;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.doc.entity.Icon;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.dependency.IKeyboardDependency;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.todo.impl.features.common.helper.TodoRichTextViewHelper;
import com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.TodoAssigneeAddActivity;
import com.ss.android.lark.todo.impl.features.detail.at.TodoAtController;
import com.ss.android.lark.todo.impl.features.detail.common.TodoKeyboardUtil;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AtChatterBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DocInsertBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DocPasteBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.PasteBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.RichTextShowBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.SummaryInlineInfo;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.UrlInsertBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.UrlPasteBean;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0016H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "ability", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "debounceDispatcher", "Lcom/larksuite/framework/section/utils/DebounceDispatcher;", "getDebounceDispatcher", "()Lcom/larksuite/framework/section/utils/DebounceDispatcher;", "debounceDispatcher$delegate", "Lkotlin/Lazy;", "mAtController", "Lcom/ss/android/lark/todo/impl/features/detail/at/TodoAtController;", "value", "", "textChanged", "setTextChanged", "(Z)V", "initAtController", "", "summaryInlineInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInlineInfo;", "initView", "initViewAction", "initViewObserver", "insertDoc", "docPasteBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DocPasteBean;", "insertUrl", "pasteBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "registerCallback", "startAddAtActivity", "updateSummaryBean", "richTextShowBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i */
public final class SummaryInlineSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public TodoAtController f140001a;

    /* renamed from: b */
    public boolean f140002b;

    /* renamed from: c */
    public final View f140003c;

    /* renamed from: d */
    private final Lazy f140004d = LazyKt.lazy(new C56622a(this));

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    /* renamed from: k */
    public final DebounceDispatcher mo192611k() {
        return (DebounceDispatcher) this.f140004d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection$initAtController$1", "Lcom/ss/android/lark/todo/impl/features/detail/at/TodoAtController$InsertAtTagListener;", "isTodoAtViewShow", "", "isShow", "", "onInsertAtTag", BottomDialog.f17198f, "", "onSelectAtChatter", "displayName", "startFullScreenAtSelector", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$b */
    public static final class C56623b implements TodoAtController.InsertAtTagListener {

        /* renamed from: a */
        final /* synthetic */ SummaryInlineSection f140005a;

        @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
        /* renamed from: a */
        public void mo192120a() {
            this.f140005a.mo192610j();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56623b(SummaryInlineSection iVar) {
            this.f140005a = iVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
        /* renamed from: b */
        public boolean mo192124b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            return TodoAtController.InsertAtTagListener.C56450a.m220037a(this, str);
        }

        @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
        /* renamed from: a */
        public void mo192121a(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            IActionDispatcher d = this.f140005a.mo92107d();
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140005a.f140003c.findViewById(R.id.input_content);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.input_content");
            d.mo92067a(81, richTextEmojiconEditText.getDraftRichText());
            this.f140005a.mo92107d().mo92068a(60, str);
        }

        @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
        /* renamed from: a */
        public void mo192123a(boolean z) {
            if (z) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f140005a.f140003c.findViewById(R.id.fast_create_container);
                Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "containerView.fast_create_container");
                constraintLayout.setBackground(ResUtil.f139261a.mo191782d(R.drawable.todo_keyboard_background));
                View findViewById = this.f140005a.f140003c.findViewById(R.id.todo_at_view_divider);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.todo_at_view_divider");
                C25877a.m93659a(findViewById, true);
                return;
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f140005a.f140003c.findViewById(R.id.fast_create_container);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "containerView.fast_create_container");
            constraintLayout2.setBackground(ResUtil.f139261a.mo191782d(R.drawable.todo_keyboard_background_radius));
            View findViewById2 = this.f140005a.f140003c.findViewById(R.id.todo_at_view_divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "containerView.todo_at_view_divider");
            C25877a.m93659a(findViewById2, false);
        }

        @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
        /* renamed from: a */
        public void mo192122a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            Intrinsics.checkParameterIsNotNull(str2, "displayName");
            this.f140005a.mo92107d().mo92066a(72, (IActionData) new AtChatterBean(str, str2, false, 4, null));
        }
    }

    /* renamed from: m */
    private final void m220450m() {
        mo92104a(new C56636n(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/framework/section/utils/DebounceDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$a */
    static final class C56622a extends Lambda implements Function0<DebounceDispatcher> {
        final /* synthetic */ SummaryInlineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56622a(SummaryInlineSection iVar) {
            super(0);
            this.this$0 = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DebounceDispatcher invoke() {
            return new DebounceDispatcher(this.this$0.mo92107d(), 0, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection$textChanged$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$o */
    public static final class RunnableC56638o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RichTextEmojiconEditText f140012a;

        /* renamed from: b */
        final /* synthetic */ SummaryInlineSection f140013b;

        RunnableC56638o(RichTextEmojiconEditText richTextEmojiconEditText, SummaryInlineSection iVar) {
            this.f140012a = richTextEmojiconEditText;
            this.f140013b = iVar;
        }

        public final void run() {
            int i;
            IActionDispatcher d = this.f140013b.mo92107d();
            Editable text = this.f140012a.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            d.mo92065a(520, i);
            this.f140013b.mo92107d().mo92067a(81, this.f140012a.getDraftRichText());
            this.f140013b.mo192609a(false);
        }
    }

    /* renamed from: j */
    public final void mo192610j() {
        String str;
        Context c = mo92106c();
        if (c != null && (c instanceof Activity)) {
            Intent intent = new Intent();
            intent.setClass(c, TodoAssigneeAddActivity.class);
            SummaryInlineInfo b = ((ITodoDetailViewDataStore) mo92096a()).getSummaryInlineInfo().mo5927b();
            if (b != null) {
                str = b.mo193060b();
            } else {
                str = null;
            }
            intent.putExtra("add_assignee_is_chat_id", str);
            intent.putExtra("add_todo_user_request_code", 4);
            ((Activity) c).startActivityForResult(intent, 4);
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        m220450m();
        m220449l();
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getSummaryInlineShowRichText(), new C56628g(this));
        mo92103a(qVar.getSummaryInlineInfo(), new C56629h(this));
        mo92103a(qVar.getKeyboardSummaryClearFocus(), new C56630i(this));
        mo92103a(qVar.getKeyboardSummaryRequestFocus(), new C56631j(this));
        mo92103a(qVar.getSummaryKeyboardInsertAtTag(), new C56633k(this));
        mo92103a(qVar.getSummaryPasteDoc(), new C56634l(this));
        mo92103a(qVar.getSummaryPasteUrl(), new C56635m(this));
    }

    /* renamed from: l */
    private final void m220449l() {
        TodoRichTextViewHelper eVar = TodoRichTextViewHelper.f139403a;
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.input_content");
        eVar.mo192002a(richTextEmojiconEditText);
        RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.input_content");
        richTextEmojiconEditText2.setImeOptions(5);
        RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.input_content");
        richTextEmojiconEditText3.setNextFocusForwardId(R.id.input_content);
        ((RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content)).requestFocus();
        ((RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content)).setRawInputType(1);
        ((RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content)).setOnEditorActionListener(new C56624c(this));
        ((RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content)).setOnFocusChangeListener(new View$OnFocusChangeListenerC56625d(this));
        ((RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content)).addTextChangedListener(new C56626e(this));
        ((RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content)).setOnPasteListener(new C56627f(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection$initView$3", "Lcom/ss/android/lark/utils/SimpleTextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$e */
    public static final class C56626e extends C57767ae {

        /* renamed from: a */
        final /* synthetic */ SummaryInlineSection f140008a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56626e(SummaryInlineSection iVar) {
            this.f140008a = iVar;
        }

        @Override // com.ss.android.lark.utils.C57767ae
        public void afterTextChanged(Editable editable) {
            this.f140008a.mo192609a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection$initView$4", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "onContentPaste", "", "content", "", "selection", "", "length", "onFilePaste", "filePaths", "", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$f */
    public static final class C56627f extends AbstractC58541b {

        /* renamed from: a */
        final /* synthetic */ SummaryInlineSection f140009a;

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56627f(SummaryInlineSection iVar) {
            this.f140009a = iVar;
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo147074a(CharSequence charSequence, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(charSequence, "content");
            IActionDispatcher d = this.f140009a.mo92107d();
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140009a.f140003c.findViewById(R.id.input_content);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.input_content");
            d.mo92067a(81, richTextEmojiconEditText.getDraftRichText());
            this.f140009a.mo92107d().mo92066a(43, (IActionData) new PasteBean(charSequence.toString(), i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$g */
    static final class C56628g extends Lambda implements Function1<RichTextShowBean, Unit> {
        final /* synthetic */ SummaryInlineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56628g(SummaryInlineSection iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RichTextShowBean tVar) {
            invoke(tVar);
            return Unit.INSTANCE;
        }

        public final void invoke(RichTextShowBean tVar) {
            Intrinsics.checkParameterIsNotNull(tVar, "it");
            this.this$0.mo192607a(tVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInlineInfo;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$h */
    static final class C56629h extends Lambda implements Function1<SummaryInlineInfo, Unit> {
        final /* synthetic */ SummaryInlineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56629h(SummaryInlineSection iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SummaryInlineInfo wVar) {
            invoke(wVar);
            return Unit.INSTANCE;
        }

        public final void invoke(SummaryInlineInfo wVar) {
            Intrinsics.checkParameterIsNotNull(wVar, "it");
            this.this$0.mo192608a(wVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AtChatterBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection$initViewObserver$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$k */
    static final class C56633k extends Lambda implements Function1<AtChatterBean, Unit> {
        final /* synthetic */ SummaryInlineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56633k(SummaryInlineSection iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtChatterBean cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(AtChatterBean cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            TodoAtController aVar = this.this$0.f140001a;
            if (aVar != null) {
                aVar.mo192234a(cVar.mo192982a(), cVar.mo192984b(), cVar.mo192985c());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DocPasteBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection$initViewObserver$1$6"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$l */
    static final class C56634l extends Lambda implements Function1<DocPasteBean, Unit> {
        final /* synthetic */ SummaryInlineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56634l(SummaryInlineSection iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DocPasteBean kVar) {
            invoke(kVar);
            return Unit.INSTANCE;
        }

        public final void invoke(DocPasteBean kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "it");
            this.this$0.mo192606a(kVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection$initViewObserver$1$7"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$m */
    static final class C56635m extends Lambda implements Function1<UrlPasteBean, Unit> {
        final /* synthetic */ SummaryInlineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56635m(SummaryInlineSection iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UrlPasteBean ahVar) {
            invoke(ahVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UrlPasteBean ahVar) {
            Intrinsics.checkParameterIsNotNull(ahVar, "it");
            this.this$0.mo192605a(ahVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$i */
    static final class C56630i extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ SummaryInlineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56630i(SummaryInlineSection iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((RichTextEmojiconEditText) this.this$0.f140003c.findViewById(R.id.input_content)).clearFocus();
            KeyboardUtils.hideKeyboard(this.this$0.mo92106c(), (RichTextEmojiconEditText) this.this$0.f140003c.findViewById(R.id.input_content));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection$initViewObserver$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$j */
    static final class C56631j extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ SummaryInlineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56631j(SummaryInlineSection iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            final RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.this$0.f140003c.findViewById(R.id.input_content);
            richTextEmojiconEditText.postDelayed(new Runnable() {
                /* class com.ss.android.lark.todo.impl.features.detail.sections.SummaryInlineSection.C56631j.RunnableC566321 */

                public final void run() {
                    richTextEmojiconEditText.requestFocus();
                    KeyboardUtils.showKeyboard(richTextEmojiconEditText);
                    RichTextEmojiconEditText richTextEmojiconEditText = richTextEmojiconEditText;
                    richTextEmojiconEditText.setSelection(richTextEmojiconEditText.getText().length());
                }
            }, 120);
        }
    }

    /* renamed from: a */
    public final void mo192607a(RichTextShowBean tVar) {
        boolean b = tVar.mo193043b();
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.input_content");
        TodoKeyboardUtil.m220375a(b, richTextEmojiconEditText, tVar.mo193042a(), tVar.mo193044c());
    }

    /* renamed from: a */
    public final void mo192609a(boolean z) {
        if (!this.f140002b && z) {
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
            richTextEmojiconEditText.post(new RunnableC56638o(richTextEmojiconEditText, this));
        }
        this.f140002b = z;
    }

    /* renamed from: a */
    public final void mo192608a(SummaryInlineInfo wVar) {
        Context c = mo92106c();
        if (c != null) {
            TodoAtController aVar = new TodoAtController((FragmentActivity) c, new C56623b(this), false, false, wVar.mo193059a());
            this.f140001a = aVar;
            if (aVar != null) {
                RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
                Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.input_content");
                FrameLayout frameLayout = (FrameLayout) this.f140003c.findViewById(R.id.keyboard_at_container);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "containerView.keyboard_at_container");
                aVar.mo192231a(richTextEmojiconEditText, frameLayout, wVar.mo193060b());
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo192605a(UrlPasteBean ahVar) {
        String str;
        TodoRichTextViewHelper eVar = TodoRichTextViewHelper.f139403a;
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.input_content");
        eVar.mo192004a(ahVar, richTextEmojiconEditText);
        IActionDispatcher d = mo92107d();
        RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.input_content");
        d.mo92067a(80, richTextEmojiconEditText2.getDraftRichText());
        RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.input_content");
        RichText draftRichText = richTextEmojiconEditText3.getDraftRichText();
        Intrinsics.checkExpressionValueIsNotNull(draftRichText, "containerView.input_content.draftRichText");
        for (String str2 : draftRichText.getAnchorIds()) {
            RichTextEmojiconEditText richTextEmojiconEditText4 = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText4, "containerView.input_content");
            RichText draftRichText2 = richTextEmojiconEditText4.getDraftRichText();
            Intrinsics.checkExpressionValueIsNotNull(draftRichText2, "containerView.input_content.draftRichText");
            RichText.RichTextElements elements = draftRichText2.getElements();
            Intrinsics.checkExpressionValueIsNotNull(elements, "containerView.input_content.draftRichText.elements");
            RichTextElement richTextElement = elements.getDictionary().get(str2);
            if (richTextElement != null && richTextElement.getTag() == RichTextElement.RichTextTag.ANCHOR) {
                RichTextElement.RichTextProperty property = richTextElement.getProperty();
                if (property != null) {
                    String href = ((RichTextElement.AnchorProperty) property).getHref();
                    Url url = ahVar.mo192976a().getUrl();
                    if (url != null) {
                        str = url.getUrl();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(href, str)) {
                        IActionDispatcher d2 = mo92107d();
                        Intrinsics.checkExpressionValueIsNotNull(str2, "anchorId");
                        d2.mo92066a(46, (IActionData) new UrlInsertBean(str2, ahVar.mo192976a()));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.richtext.RichTextElement.AnchorProperty");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo192606a(DocPasteBean kVar) {
        C58508e.C58511b bVar;
        Doc a = kVar.mo193012a();
        String name = a.getName();
        if (kVar.mo193013b() < 0) {
            bVar = new C58508e.C58511b(kVar.mo193014c());
            bVar.mo198340a(false);
        } else {
            bVar = new C58508e.C58511b(kVar.mo193013b(), kVar.mo193014c());
        }
        Context c = mo92106c();
        C58508e.C58510a c2 = new C58508e.C58510a(c, bVar).mo198336a(name).mo198339c(UIHelper.getColor(R.color.text_link_normal));
        IKeyboardDependency a2 = C40682g.m160850a();
        DocType docType = a.getDocType();
        Intrinsics.checkExpressionValueIsNotNull(docType, "doc.docType");
        Drawable drawable = ContextCompat.getDrawable(c, a2.mo133166a(docType));
        IconKeyDrawable oVar = new IconKeyDrawable(c);
        Icon icon = a.getIcon();
        Intrinsics.checkExpressionValueIsNotNull(icon, "doc.icon");
        oVar.mo89034a(icon.getValue(), null, UIHelper.dp2px(14.0f), UIHelper.dp2px(14.0f), drawable, true);
        c2.mo198335a(oVar);
        TodoRichTextViewHelper eVar = TodoRichTextViewHelper.f139403a;
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.input_content");
        eVar.mo192003a(richTextEmojiconEditText, c2.mo198337a(), a.getUrl());
        IActionDispatcher d = mo92107d();
        RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.input_content");
        d.mo92067a(81, richTextEmojiconEditText2.getDraftRichText());
        RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.input_content");
        RichText draftRichText = richTextEmojiconEditText3.getDraftRichText();
        Intrinsics.checkExpressionValueIsNotNull(draftRichText, "containerView.input_content.draftRichText");
        for (String str : draftRichText.getAnchorIds()) {
            RichTextEmojiconEditText richTextEmojiconEditText4 = (RichTextEmojiconEditText) this.f140003c.findViewById(R.id.input_content);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText4, "containerView.input_content");
            RichText draftRichText2 = richTextEmojiconEditText4.getDraftRichText();
            Intrinsics.checkExpressionValueIsNotNull(draftRichText2, "containerView.input_content.draftRichText");
            RichText.RichTextElements elements = draftRichText2.getElements();
            Intrinsics.checkExpressionValueIsNotNull(elements, "containerView.input_content.draftRichText.elements");
            RichTextElement richTextElement = elements.getDictionary().get(str);
            if (richTextElement != null && richTextElement.getTag() == RichTextElement.RichTextTag.ANCHOR) {
                RichTextElement.RichTextProperty property = richTextElement.getProperty();
                if (property == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.richtext.RichTextElement.AnchorProperty");
                } else if (Intrinsics.areEqual(((RichTextElement.AnchorProperty) property).getHref(), a.getUrl())) {
                    IActionDispatcher d2 = mo92107d();
                    Intrinsics.checkExpressionValueIsNotNull(str, "anchorId");
                    d2.mo92066a(45, (IActionData) new DocInsertBean(str, a));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SummaryInlineSection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "ability");
        this.f140003c = view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$d */
    public static final class View$OnFocusChangeListenerC56625d implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ SummaryInlineSection f140007a;

        View$OnFocusChangeListenerC56625d(SummaryInlineSection iVar) {
            this.f140007a = iVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                IActionDispatcher d = this.f140007a.mo92107d();
                RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140007a.f140003c.findViewById(R.id.input_content);
                Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.input_content");
                d.mo92067a(81, richTextEmojiconEditText.getDraftRichText());
                this.f140007a.mo92107d().mo92064a(44);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$n */
    public static final class C56636n extends Lambda implements Function3<Integer, Integer, Intent, Unit> {
        final /* synthetic */ SummaryInlineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56636n(SummaryInlineSection iVar) {
            super(3);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(Integer num, Integer num2, Intent intent) {
            invoke(num.intValue(), num2.intValue(), intent);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, int i2, Intent intent) {
            TodoAtController aVar;
            if (i == 4) {
                ((RichTextEmojiconEditText) this.this$0.f140003c.findViewById(R.id.input_content)).postDelayed(new Runnable(this) {
                    /* class com.ss.android.lark.todo.impl.features.detail.sections.SummaryInlineSection.C56636n.RunnableC566371 */

                    /* renamed from: a */
                    final /* synthetic */ C56636n f140011a;

                    {
                        this.f140011a = r1;
                    }

                    public final void run() {
                        KeyboardUtils.showKeyboard((RichTextEmojiconEditText) this.f140011a.this$0.f140003c.findViewById(R.id.input_content));
                    }
                }, 120);
                if (i2 == -1 && intent != null) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("add_assignee_chosen_data");
                    if (stringArrayListExtra == null) {
                        stringArrayListExtra = new ArrayList<>();
                    }
                    SearchBaseInfo searchBaseInfo = (SearchBaseInfo) CollectionsKt.firstOrNull((List) stringArrayListExtra);
                    if (searchBaseInfo != null && (aVar = this.this$0.f140001a) != null) {
                        String id = searchBaseInfo.getId();
                        Intrinsics.checkExpressionValueIsNotNull(id, "atInfo.id");
                        String title = searchBaseInfo.getTitle();
                        Intrinsics.checkExpressionValueIsNotNull(title, "atInfo.title");
                        aVar.mo192233a(id, title, (String) null);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.i$c */
    public static final class C56624c implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ SummaryInlineSection f140006a;

        C56624c(SummaryInlineSection iVar) {
            this.f140006a = iVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
                return true;
            }
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140006a.f140003c.findViewById(R.id.input_content);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.input_content");
            Editable text = richTextEmojiconEditText.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "containerView.input_content.text");
            if (TextUtils.isEmpty(StringsKt.trim(text))) {
                return true;
            }
            DebounceDispatcher.m93662a(this.f140006a.mo192611k(), 108, 0, 2, null);
            return true;
        }
    }
}
