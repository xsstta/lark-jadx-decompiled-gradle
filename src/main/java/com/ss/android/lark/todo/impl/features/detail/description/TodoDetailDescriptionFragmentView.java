package com.ss.android.lark.todo.impl.features.detail.description;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.component.ui.avatar.IconKeyDrawable;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IActionDispatcher;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.doc.entity.Icon;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.dependency.IKeyboardDependency;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.todo.impl.features.common.helper.TodoRichTextViewHelper;
import com.ss.android.lark.todo.impl.features.detail.at.TodoAtController;
import com.ss.android.lark.todo.impl.features.detail.common.TodoKeyboardUtil;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AtChatterBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DescriptionInfo;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DocInsertBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DocPasteBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.PasteBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.RichTextShowBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.UrlInsertBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.UrlPasteBean;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentView;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "ability", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "mAtControllerD", "Lcom/ss/android/lark/todo/impl/features/detail/at/TodoAtController;", "saveAction", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "getSaveAction", "()Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "saveAction$delegate", "Lkotlin/Lazy;", "actionSave", "", "hideKeyBoard", "initTitleView", "initView", "initViewAction", "initViewObserver", "insertDoc", "docPasteBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DocPasteBean;", "insertUrl", "pasteBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "showKeyBoard", "updateDescriptionInfo", "richTextShowBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.a.b */
public final class TodoDetailDescriptionFragmentView extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public TodoAtController f139481a;

    /* renamed from: b */
    public final View f139482b;

    /* renamed from: c */
    private final Lazy f139483c = LazyKt.lazy(new C56394i(this));

    /* renamed from: d */
    private final IViewAbility<ITodoDetailViewDataStore> f139484d;

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    /* renamed from: j */
    public final IActionTitlebar.TextAction mo192110j() {
        return (IActionTitlebar.TextAction) this.f139483c.getValue();
    }

    /* renamed from: o */
    private final void m219893o() {
        Context c = mo92106c();
        if (c != null) {
            KeyboardUtils.showKeyboard(c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentView$saveAction$2$1", "invoke", "()Lcom/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentView$saveAction$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.a.b$i */
    static final class C56394i extends Lambda implements Function0<C563951> {
        final /* synthetic */ TodoDetailDescriptionFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56394i(TodoDetailDescriptionFragmentView bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C563951 invoke() {
            return new IActionTitlebar.TextAction(this, UIHelper.getString(R.string.Todo_common_Save), R.color.primary_pri_500, 16) {
                /* class com.ss.android.lark.todo.impl.features.detail.description.TodoDetailDescriptionFragmentView.C56394i.C563951 */

                /* renamed from: a */
                final /* synthetic */ C56394i f139489a;

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    this.f139489a.this$0.mo192111k();
                }

                {
                    this.f139489a = r1;
                }
            };
        }
    }

    /* renamed from: l */
    public final void mo192112l() {
        Context c = mo92106c();
        if (c != null) {
            KeyboardUtils.hideKeyboard(c, (RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description));
        }
    }

    /* renamed from: m */
    private final void m219891m() {
        m219892n();
        TodoRichTextViewHelper eVar = TodoRichTextViewHelper.f139403a;
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.edit_description");
        eVar.mo192002a(richTextEmojiconEditText);
        ((RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description)).setOnPasteListener(new C56387c(this));
    }

    /* renamed from: n */
    private final void m219892n() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f139482b.findViewById(R.id.title_bar);
        if (commonTitleBar != null) {
            commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
            commonTitleBar.setTitle(R.string.Todo_Task_TaskNotes);
            commonTitleBar.setLeftClickListener(new View$OnClickListenerC56385a(this));
        }
        ((ITodoDetailViewDataStore) mo92096a()).getDescriptionInfo().mo5923a(mo92105b(), new C56386b(this));
    }

    /* renamed from: k */
    public final void mo192111k() {
        mo192112l();
        IActionDispatcher d = mo92107d();
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.edit_description");
        d.mo92067a(58, richTextEmojiconEditText.getDraftRichText());
        mo92107d().mo92064a(2001);
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        m219891m();
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getDescriptionShowRichText(), new C56388d(this));
        mo92103a(qVar.getDescriptionPasteDoc(), new C56389e(this));
        mo92103a(qVar.getDescriptionPasteUrl(), new C56390f(this));
        mo92103a(qVar.getDescriptionFragmentInsertAtTag(), new C56391g(this));
        mo92103a(qVar.getInitAtController(), new C56392h(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentView$initView$1", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "onContentPaste", "", "content", "", "selection", "", "length", "onFilePaste", "filePaths", "", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.a.b$c */
    public static final class C56387c extends AbstractC58541b {

        /* renamed from: a */
        final /* synthetic */ TodoDetailDescriptionFragmentView f139487a;

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56387c(TodoDetailDescriptionFragmentView bVar) {
            this.f139487a = bVar;
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo147074a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null) {
                this.f139487a.mo92107d().mo92066a(53, (IActionData) new PasteBean(charSequence.toString(), i));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentView$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.a.b$d */
    static final class C56388d extends Lambda implements Function1<RichTextShowBean, Unit> {
        final /* synthetic */ TodoDetailDescriptionFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56388d(TodoDetailDescriptionFragmentView bVar) {
            super(1);
            this.this$0 = bVar;
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
            this.this$0.mo192109a(tVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DocPasteBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentView$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.a.b$e */
    static final class C56389e extends Lambda implements Function1<DocPasteBean, Unit> {
        final /* synthetic */ TodoDetailDescriptionFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56389e(TodoDetailDescriptionFragmentView bVar) {
            super(1);
            this.this$0 = bVar;
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
            this.this$0.mo192108a(kVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentView$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.a.b$f */
    static final class C56390f extends Lambda implements Function1<UrlPasteBean, Unit> {
        final /* synthetic */ TodoDetailDescriptionFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56390f(TodoDetailDescriptionFragmentView bVar) {
            super(1);
            this.this$0 = bVar;
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
            this.this$0.mo192107a(ahVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AtChatterBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentView$initViewObserver$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.a.b$g */
    static final class C56391g extends Lambda implements Function1<AtChatterBean, Unit> {
        final /* synthetic */ TodoDetailDescriptionFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56391g(TodoDetailDescriptionFragmentView bVar) {
            super(1);
            this.this$0 = bVar;
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
            TodoAtController aVar = this.this$0.f139481a;
            if (aVar != null) {
                aVar.mo192234a(cVar.mo192982a(), cVar.mo192984b(), cVar.mo192985c());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "chatId", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentView$initViewObserver$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.a.b$h */
    static final class C56392h extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ TodoDetailDescriptionFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56392h(TodoDetailDescriptionFragmentView bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            TodoDetailDescriptionFragmentView bVar = this.this$0;
            Context c = bVar.mo92106c();
            if (c != null) {
                TodoAtController aVar = new TodoAtController((FragmentActivity) c, new TodoAtController.InsertAtTagListener(this) {
                    /* class com.ss.android.lark.todo.impl.features.detail.description.TodoDetailDescriptionFragmentView.C56392h.C563931 */

                    /* renamed from: a */
                    final /* synthetic */ C56392h f139488a;

                    @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                    /* renamed from: a */
                    public void mo192121a(String str) {
                        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
                    }

                    @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                    /* renamed from: a */
                    public void mo192120a() {
                        TodoAtController.InsertAtTagListener.C56450a.m220035a(this);
                    }

                    {
                        this.f139488a = r1;
                    }

                    @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                    /* renamed from: a */
                    public void mo192123a(boolean z) {
                        TodoAtController.InsertAtTagListener.C56450a.m220036a(this, z);
                    }

                    @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                    /* renamed from: b */
                    public boolean mo192124b(String str) {
                        Intrinsics.checkParameterIsNotNull(str, "userId");
                        return TodoAtController.InsertAtTagListener.C56450a.m220037a(this, str);
                    }

                    @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                    /* renamed from: a */
                    public void mo192122a(String str, String str2) {
                        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
                        Intrinsics.checkParameterIsNotNull(str2, "displayName");
                        this.f139488a.this$0.mo92107d().mo92066a(63, (IActionData) new AtChatterBean(str, str2, false, 4, null));
                    }
                }, true, false, false, 24, null);
                RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.this$0.f139482b.findViewById(R.id.edit_description);
                Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.edit_description");
                FrameLayout frameLayout = (FrameLayout) this.this$0.f139482b.findViewById(R.id.todo_description_at_container);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "containerView.todo_description_at_container");
                aVar.mo192231a(richTextEmojiconEditText, frameLayout, str);
                bVar.f139481a = aVar;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/description/TodoDetailDescriptionFragmentView$initTitleView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.a.b$a */
    public static final class View$OnClickListenerC56385a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailDescriptionFragmentView f139485a;

        View$OnClickListenerC56385a(TodoDetailDescriptionFragmentView bVar) {
            this.f139485a = bVar;
        }

        public final void onClick(View view) {
            this.f139485a.mo192112l();
            this.f139485a.mo92107d().mo92064a(2001);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.a.b$b */
    public static final class C56386b<T> implements AbstractC1178x<DescriptionInfo> {

        /* renamed from: a */
        final /* synthetic */ TodoDetailDescriptionFragmentView f139486a;

        C56386b(TodoDetailDescriptionFragmentView bVar) {
            this.f139486a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(DescriptionInfo fVar) {
            if (fVar.mo192996a()) {
                ((CommonTitleBar) this.f139486a.f139482b.findViewById(R.id.title_bar)).addAction(this.f139486a.mo192110j());
            }
        }
    }

    /* renamed from: a */
    public final void mo192109a(RichTextShowBean tVar) {
        boolean b = tVar.mo193043b();
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.edit_description");
        TodoKeyboardUtil.m220375a(b, richTextEmojiconEditText, tVar.mo193042a(), tVar.mo193044c());
        if (C59035h.m229210a(tVar.mo193042a())) {
            ((RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description)).requestFocus();
            m219893o();
            return;
        }
        ((RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description)).clearFocus();
    }

    /* renamed from: a */
    public final void mo192107a(UrlPasteBean ahVar) {
        String str;
        TodoRichTextViewHelper eVar = TodoRichTextViewHelper.f139403a;
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.edit_description");
        eVar.mo192004a(ahVar, richTextEmojiconEditText);
        RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.edit_description");
        RichText draftRichText = richTextEmojiconEditText2.getDraftRichText();
        Intrinsics.checkExpressionValueIsNotNull(draftRichText, "containerView.edit_description.draftRichText");
        for (String str2 : draftRichText.getAnchorIds()) {
            RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.edit_description");
            RichText draftRichText2 = richTextEmojiconEditText3.getDraftRichText();
            Intrinsics.checkExpressionValueIsNotNull(draftRichText2, "containerView.edit_description.draftRichText");
            RichText.RichTextElements elements = draftRichText2.getElements();
            Intrinsics.checkExpressionValueIsNotNull(elements, "containerView.edit_descr…on.draftRichText.elements");
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
                        IActionDispatcher d = mo92107d();
                        Intrinsics.checkExpressionValueIsNotNull(str2, "anchorId");
                        d.mo92066a(56, (IActionData) new UrlInsertBean(str2, ahVar.mo192976a()));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.richtext.RichTextElement.AnchorProperty");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo192108a(DocPasteBean kVar) {
        C58508e.C58511b bVar;
        Doc a = kVar.mo193012a();
        String name = a.getName();
        if (kVar.mo193013b() < 0) {
            bVar = new C58508e.C58511b(kVar.mo193014c());
            bVar.mo198340a(false);
        } else {
            bVar = new C58508e.C58511b(kVar.mo193013b(), kVar.mo193014c());
        }
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.edit_description");
        Context context = richTextEmojiconEditText.getContext();
        C58508e.C58510a c = new C58508e.C58510a(context, bVar).mo198336a(name).mo198339c(UIHelper.getColor(R.color.text_link_normal));
        IKeyboardDependency a2 = C40682g.m160850a();
        DocType docType = a.getDocType();
        Intrinsics.checkExpressionValueIsNotNull(docType, "doc.docType");
        Drawable drawable = ContextCompat.getDrawable(context, a2.mo133166a(docType));
        RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.edit_description");
        Context context2 = richTextEmojiconEditText2.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "containerView.edit_description.context");
        IconKeyDrawable oVar = new IconKeyDrawable(context2);
        Icon icon = a.getIcon();
        Intrinsics.checkExpressionValueIsNotNull(icon, "doc.icon");
        oVar.mo89034a(icon.getValue(), null, UIHelper.dp2px(14.0f), UIHelper.dp2px(14.0f), drawable, true);
        c.mo198335a(oVar);
        TodoRichTextViewHelper eVar = TodoRichTextViewHelper.f139403a;
        RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.edit_description");
        eVar.mo192003a(richTextEmojiconEditText3, c.mo198337a(), a.getUrl());
        RichTextEmojiconEditText richTextEmojiconEditText4 = (RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText4, "containerView.edit_description");
        RichText draftRichText = richTextEmojiconEditText4.getDraftRichText();
        Intrinsics.checkExpressionValueIsNotNull(draftRichText, "containerView.edit_description.draftRichText");
        for (String str : draftRichText.getAnchorIds()) {
            RichTextEmojiconEditText richTextEmojiconEditText5 = (RichTextEmojiconEditText) this.f139482b.findViewById(R.id.edit_description);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText5, "containerView.edit_description");
            RichText draftRichText2 = richTextEmojiconEditText5.getDraftRichText();
            Intrinsics.checkExpressionValueIsNotNull(draftRichText2, "containerView.edit_description.draftRichText");
            RichText.RichTextElements elements = draftRichText2.getElements();
            Intrinsics.checkExpressionValueIsNotNull(elements, "containerView.edit_descr…on.draftRichText.elements");
            RichTextElement richTextElement = elements.getDictionary().get(str);
            if (richTextElement != null && richTextElement.getTag() == RichTextElement.RichTextTag.ANCHOR) {
                RichTextElement.RichTextProperty property = richTextElement.getProperty();
                if (property == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.richtext.RichTextElement.AnchorProperty");
                } else if (Intrinsics.areEqual(((RichTextElement.AnchorProperty) property).getHref(), a.getUrl())) {
                    IActionDispatcher d = mo92107d();
                    Intrinsics.checkExpressionValueIsNotNull(str, "anchorId");
                    d.mo92066a(55, (IActionData) new DocInsertBean(str, a));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoDetailDescriptionFragmentView(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "ability");
        this.f139482b = view;
        this.f139484d = fVar;
    }
}
