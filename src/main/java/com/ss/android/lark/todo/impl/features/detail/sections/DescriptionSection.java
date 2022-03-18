package com.ss.android.lark.todo.impl.features.detail.sections;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.component.ui.avatar.IconKeyDrawable;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IActionDispatcher;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.doc.entity.Icon;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.dependency.IKeyboardDependency;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.todo.impl.features.common.helper.TodoRichTextViewHelper;
import com.ss.android.lark.todo.impl.features.detail.common.InterceptScrollContainer;
import com.ss.android.lark.todo.impl.features.detail.common.TodoKeyboardUtil;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DescriptionInfo;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DescriptionInit;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DocInsertBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DocPasteBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.PasteBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.RichTextShowBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.UrlInsertBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.UrlPasteBean;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.listener.AbstractC58541b;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010,\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006-"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/DescriptionSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "editDescriptionClickListener", "Landroid/view/View$OnClickListener;", "getEditDescriptionClickListener", "()Landroid/view/View$OnClickListener;", "editDescriptionClickListener$delegate", "Lkotlin/Lazy;", "focusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "getFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "focusChangeListener$delegate", "checkEditable", "", "descriptionInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInfo;", "initDescription", "descriptionInit", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInit;", "initRichTextPasteListener", "initView", "initViewAction", "initViewListener", "initViewObserver", "insertDoc", "docPasteBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DocPasteBean;", "insertUrl", "pasteBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "updateDescriptionBean", "richTextShowBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "updateDescriptionForEditLimit", "editable", "", "updateDescriptionInfo", "updateDescriptionMore", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g */
public final class DescriptionSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public final View f139986a;

    /* renamed from: b */
    private final Lazy f139987b = LazyKt.lazy(new C56605a(this));

    /* renamed from: c */
    private final Lazy f139988c = LazyKt.lazy(new C56607b(this));

    /* renamed from: k */
    private final View.OnClickListener m220429k() {
        return (View.OnClickListener) this.f139987b.getValue();
    }

    /* renamed from: n */
    private final View.OnFocusChangeListener m220432n() {
        return (View.OnFocusChangeListener) this.f139988c.getValue();
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View$OnClickListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g$a */
    static final class C56605a extends Lambda implements Function0<View.OnClickListener> {
        final /* synthetic */ DescriptionSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56605a(DescriptionSection gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View.OnClickListener invoke() {
            return new View.OnClickListener(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.sections.DescriptionSection.C56605a.View$OnClickListenerC566061 */

                /* renamed from: a */
                final /* synthetic */ C56605a f139989a;

                {
                    this.f139989a = r1;
                }

                public final void onClick(View view) {
                    this.f139989a.this$0.mo92107d().mo92064a(CommonCode.StatusCode.API_CLIENT_EXPIRED);
                    this.f139989a.this$0.mo92107d().mo92064a(57);
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View$OnFocusChangeListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g$b */
    static final class C56607b extends Lambda implements Function0<View.OnFocusChangeListener> {
        final /* synthetic */ DescriptionSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56607b(DescriptionSection gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View.OnFocusChangeListener invoke() {
            return new View.OnFocusChangeListener(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.sections.DescriptionSection.C56607b.View$OnFocusChangeListenerC566081 */

                /* renamed from: a */
                final /* synthetic */ C56607b f139990a;

                {
                    this.f139990a = r1;
                }

                public final void onFocusChange(View view, boolean z) {
                    if (!z) {
                        IActionDispatcher d = this.f139990a.this$0.mo92107d();
                        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139990a.this$0.f139986a.findViewById(R.id.todo_description);
                        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_description");
                        d.mo92067a(50, richTextEmojiconEditText.getDraftRichText());
                        this.f139990a.this$0.mo92107d().mo92064a(44);
                    }
                }
            };
        }
    }

    /* renamed from: j */
    private final void m220428j() {
        ((RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description)).post(new RunnableC56618l(this));
    }

    /* renamed from: l */
    private final void m220430l() {
        ((RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description)).setOnPasteListener(new C56609c(this));
    }

    /* renamed from: o */
    private final void m220433o() {
        TodoRichTextViewHelper eVar = TodoRichTextViewHelper.f139403a;
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_description");
        eVar.mo192002a(richTextEmojiconEditText);
    }

    /* renamed from: m */
    private final void m220431m() {
        ((RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description)).addTextChangedListener(new C56610d(this));
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_description");
        richTextEmojiconEditText.setOnFocusChangeListener(m220432n());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g$l */
    public static final class RunnableC56618l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DescriptionSection f139994a;

        RunnableC56618l(DescriptionSection gVar) {
            this.f139994a = gVar;
        }

        public final void run() {
            DescriptionInit b = ((ITodoDetailViewDataStore) this.f139994a.mo92096a()).getDescriptionInit().mo5927b();
            if (b != null && !b.mo193000a()) {
                RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139994a.f139986a.findViewById(R.id.todo_description);
                Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_description");
                if (richTextEmojiconEditText.getLineCount() > 8) {
                    TextView textView = (TextView) this.f139994a.f139986a.findViewById(R.id.description_more);
                    Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.description_more");
                    textView.setVisibility(0);
                    View findViewById = this.f139994a.f139986a.findViewById(R.id.description_gradient_mask);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.description_gradient_mask");
                    findViewById.setVisibility(0);
                    return;
                }
            }
            TextView textView2 = (TextView) this.f139994a.f139986a.findViewById(R.id.description_more);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "containerView.description_more");
            textView2.setVisibility(8);
            View findViewById2 = this.f139994a.f139986a.findViewById(R.id.description_gradient_mask);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "containerView.description_gradient_mask");
            findViewById2.setVisibility(8);
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        m220433o();
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getDescriptionInit(), new C56611e(this));
        mo92103a(qVar.getDescriptionInfo(), new C56612f(this));
        mo92103a(qVar.getDescriptionShowRichText(), new C56613g(this));
        mo92103a(qVar.getDescriptionClearFocus(), new C56614h(this));
        mo92103a(qVar.getDescriptionPasteDoc(), new C56615i(this));
        mo92103a(qVar.getDescriptionPasteUrl(), new C56616j(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/sections/DescriptionSection$initRichTextPasteListener$1", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "onContentPaste", "", "content", "", "selection", "", "length", "onFilePaste", "filePaths", "", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g$c */
    public static final class C56609c extends AbstractC58541b {

        /* renamed from: a */
        final /* synthetic */ DescriptionSection f139991a;

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56609c(DescriptionSection gVar) {
            this.f139991a = gVar;
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo147074a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null) {
                IActionDispatcher d = this.f139991a.mo92107d();
                RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139991a.f139986a.findViewById(R.id.todo_description);
                Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_description");
                d.mo92067a(50, richTextEmojiconEditText.getDraftRichText());
                this.f139991a.mo92107d().mo92066a(53, (IActionData) new PasteBean(charSequence.toString(), i));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/sections/DescriptionSection$initViewListener$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g$d */
    public static final class C56610d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ DescriptionSection f139992a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56610d(DescriptionSection gVar) {
            this.f139992a = gVar;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            InterceptScrollContainer interceptScrollContainer = (InterceptScrollContainer) this.f139992a.f139986a.findViewById(R.id.description_container);
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139992a.f139986a.findViewById(R.id.todo_description);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_description");
            if (richTextEmojiconEditText.getLineCount() > 8) {
                z = true;
            } else {
                z = false;
            }
            interceptScrollContainer.setDisableParentTouch(z);
            IActionDispatcher d = this.f139992a.mo92107d();
            RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f139992a.f139986a.findViewById(R.id.todo_description);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_description");
            d.mo92067a(50, richTextEmojiconEditText2.getDraftRichText());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInit;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/DescriptionSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g$e */
    static final class C56611e extends Lambda implements Function1<DescriptionInit, Unit> {
        final /* synthetic */ DescriptionSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56611e(DescriptionSection gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptionInit gVar) {
            invoke(gVar);
            return Unit.INSTANCE;
        }

        public final void invoke(DescriptionInit gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            this.this$0.mo192585a(gVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInfo;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/DescriptionSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g$f */
    static final class C56612f extends Lambda implements Function1<DescriptionInfo, Unit> {
        final /* synthetic */ DescriptionSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56612f(DescriptionSection gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptionInfo fVar) {
            invoke(fVar);
            return Unit.INSTANCE;
        }

        public final void invoke(DescriptionInfo fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            this.this$0.mo192584a(fVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/DescriptionSection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g$g */
    static final class C56613g extends Lambda implements Function1<RichTextShowBean, Unit> {
        final /* synthetic */ DescriptionSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56613g(DescriptionSection gVar) {
            super(1);
            this.this$0 = gVar;
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
            this.this$0.mo192587a(tVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DocPasteBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/DescriptionSection$initViewObserver$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g$i */
    static final class C56615i extends Lambda implements Function1<DocPasteBean, Unit> {
        final /* synthetic */ DescriptionSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56615i(DescriptionSection gVar) {
            super(1);
            this.this$0 = gVar;
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
            this.this$0.mo192586a(kVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/DescriptionSection$initViewObserver$1$6"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g$j */
    static final class C56616j extends Lambda implements Function1<UrlPasteBean, Unit> {
        final /* synthetic */ DescriptionSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56616j(DescriptionSection gVar) {
            super(1);
            this.this$0 = gVar;
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
            this.this$0.mo192583a(ahVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/DescriptionSection$initViewObserver$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g$h */
    static final class C56614h extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ DescriptionSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56614h(DescriptionSection gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((RichTextEmojiconEditText) this.this$0.f139986a.findViewById(R.id.todo_description)).clearFocus();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.g$k */
    public static final class View$OnClickListenerC56617k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DescriptionSection f139993a;

        View$OnClickListenerC56617k(DescriptionSection gVar) {
            this.f139993a = gVar;
        }

        public final void onClick(View view) {
            this.f139993a.mo92107d().mo92064a(41);
        }
    }

    /* renamed from: a */
    public final void mo192584a(DescriptionInfo fVar) {
        m220427b(fVar);
        TodoAppreciableHitPoint.f141058a.mo194144e();
    }

    /* renamed from: b */
    private final void m220427b(DescriptionInfo fVar) {
        DescriptionInit b = ((ITodoDetailViewDataStore) mo92096a()).getDescriptionInit().mo5927b();
        if (b == null || !b.mo193000a()) {
            m220426a(fVar.mo192996a());
        }
    }

    /* renamed from: a */
    public final void mo192587a(RichTextShowBean tVar) {
        boolean b = tVar.mo193043b();
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_description");
        RichText a = TodoKeyboardUtil.m220375a(b, richTextEmojiconEditText, tVar.mo193042a(), tVar.mo193044c());
        if (a != null) {
            mo92107d().mo92067a(50, a);
        }
        m220428j();
    }

    /* renamed from: a */
    public final void mo192585a(DescriptionInit gVar) {
        if (!gVar.mo193000a()) {
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_description");
            richTextEmojiconEditText.setFocusableInTouchMode(false);
            RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_description");
            richTextEmojiconEditText2.setVerticalScrollBarEnabled(false);
            RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.todo_description");
            richTextEmojiconEditText3.setMovementMethod(RichTextEmojiconEditText.C40693c.m160980a());
            ((RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description)).setOnClickListener(m220429k());
            ((TextView) this.f139986a.findViewById(R.id.description_more)).setOnClickListener(m220429k());
        }
        m220430l();
        m220431m();
    }

    /* renamed from: a */
    private final void m220426a(boolean z) {
        if (z) {
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_description");
            richTextEmojiconEditText.setKeyListener(null);
            RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_description");
            richTextEmojiconEditText2.setLongClickable(false);
            ((RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description)).setOnClickListener(m220429k());
            return;
        }
        RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.todo_description");
        richTextEmojiconEditText3.setKeyListener(null);
        RichTextEmojiconEditText richTextEmojiconEditText4 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText4, "containerView.todo_description");
        richTextEmojiconEditText4.setLongClickable(false);
        if (((RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description)).length() > 0) {
            ((RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description)).setOnClickListener(null);
        } else {
            ((RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description)).setOnClickListener(new View$OnClickListenerC56617k(this));
        }
    }

    /* renamed from: a */
    public final void mo192583a(UrlPasteBean ahVar) {
        String str;
        TodoRichTextViewHelper eVar = TodoRichTextViewHelper.f139403a;
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_description");
        eVar.mo192004a(ahVar, richTextEmojiconEditText);
        IActionDispatcher d = mo92107d();
        RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_description");
        d.mo92067a(50, richTextEmojiconEditText2.getDraftRichText());
        RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.todo_description");
        RichText draftRichText = richTextEmojiconEditText3.getDraftRichText();
        Intrinsics.checkExpressionValueIsNotNull(draftRichText, "containerView.todo_description.draftRichText");
        for (String str2 : draftRichText.getAnchorIds()) {
            RichTextEmojiconEditText richTextEmojiconEditText4 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText4, "containerView.todo_description");
            RichText draftRichText2 = richTextEmojiconEditText4.getDraftRichText();
            Intrinsics.checkExpressionValueIsNotNull(draftRichText2, "containerView.todo_description.draftRichText");
            RichText.RichTextElements elements = draftRichText2.getElements();
            Intrinsics.checkExpressionValueIsNotNull(elements, "containerView.todo_descr…on.draftRichText.elements");
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
                        d2.mo92066a(56, (IActionData) new UrlInsertBean(str2, ahVar.mo192976a()));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.richtext.RichTextElement.AnchorProperty");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo192586a(DocPasteBean kVar) {
        C58508e.C58511b bVar;
        Doc a = kVar.mo193012a();
        String name = a.getName();
        if (kVar.mo193013b() < 0) {
            bVar = new C58508e.C58511b(kVar.mo193014c());
            bVar.mo198340a(false);
        } else {
            bVar = new C58508e.C58511b(kVar.mo193013b(), kVar.mo193014c());
        }
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_description");
        Context context = richTextEmojiconEditText.getContext();
        C58508e.C58510a c = new C58508e.C58510a(context, bVar).mo198336a(name).mo198339c(UIHelper.getColor(R.color.text_link_normal));
        IKeyboardDependency a2 = C40682g.m160850a();
        DocType docType = a.getDocType();
        Intrinsics.checkExpressionValueIsNotNull(docType, "doc.docType");
        Drawable drawable = ContextCompat.getDrawable(context, a2.mo133166a(docType));
        RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_description");
        Context context2 = richTextEmojiconEditText2.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "containerView.todo_description.context");
        IconKeyDrawable oVar = new IconKeyDrawable(context2);
        Icon icon = a.getIcon();
        Intrinsics.checkExpressionValueIsNotNull(icon, "doc.icon");
        oVar.mo89034a(icon.getValue(), null, UIHelper.dp2px(14.0f), UIHelper.dp2px(14.0f), drawable, true);
        c.mo198335a(oVar);
        TodoRichTextViewHelper eVar = TodoRichTextViewHelper.f139403a;
        RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.todo_description");
        eVar.mo192003a(richTextEmojiconEditText3, c.mo198337a(), a.getUrl());
        IActionDispatcher d = mo92107d();
        RichTextEmojiconEditText richTextEmojiconEditText4 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText4, "containerView.todo_description");
        d.mo92067a(50, richTextEmojiconEditText4.getDraftRichText());
        RichTextEmojiconEditText richTextEmojiconEditText5 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText5, "containerView.todo_description");
        RichText draftRichText = richTextEmojiconEditText5.getDraftRichText();
        Intrinsics.checkExpressionValueIsNotNull(draftRichText, "containerView.todo_description.draftRichText");
        for (String str : draftRichText.getAnchorIds()) {
            RichTextEmojiconEditText richTextEmojiconEditText6 = (RichTextEmojiconEditText) this.f139986a.findViewById(R.id.todo_description);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText6, "containerView.todo_description");
            RichText draftRichText2 = richTextEmojiconEditText6.getDraftRichText();
            Intrinsics.checkExpressionValueIsNotNull(draftRichText2, "containerView.todo_description.draftRichText");
            RichText.RichTextElements elements = draftRichText2.getElements();
            Intrinsics.checkExpressionValueIsNotNull(elements, "containerView.todo_descr…on.draftRichText.elements");
            RichTextElement richTextElement = elements.getDictionary().get(str);
            if (richTextElement != null && richTextElement.getTag() == RichTextElement.RichTextTag.ANCHOR) {
                RichTextElement.RichTextProperty property = richTextElement.getProperty();
                if (property == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.richtext.RichTextElement.AnchorProperty");
                } else if (Intrinsics.areEqual(((RichTextElement.AnchorProperty) property).getHref(), a.getUrl())) {
                    IActionDispatcher d2 = mo92107d();
                    Intrinsics.checkExpressionValueIsNotNull(str, "anchorId");
                    d2.mo92066a(55, (IActionData) new DocInsertBean(str, a));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptionSection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139986a = view;
    }
}
