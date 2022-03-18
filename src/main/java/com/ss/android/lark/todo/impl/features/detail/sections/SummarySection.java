package com.ss.android.lark.todo.impl.features.detail.sections;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.huawei.hms.location.LocationRequest;
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
import com.ss.android.lark.todo.impl.features.detail.common.TodoKeyboardUtil;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DocInsertBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.DocPasteBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.PasteBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.RichTextShowBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.SummaryInfo;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.SummaryInit;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u0017J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010#\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0011H\u0002J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u0010/\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0014\u0010\u0015¨\u00060"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/SummarySection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "storedKeyListenerT", "Landroid/text/method/KeyListener;", "summaryFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "getSummaryFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "summaryFocusChangeListener$delegate", "Lkotlin/Lazy;", "summaryHasTouch", "", "value", "textChanged", "setTextChanged", "(Z)V", "checkEditable", "", "summaryInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInfo;", "initRichTextPasteListener", "initSummary", "summaryInit", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInit;", "initView", "initViewAction", "initViewListener", "initViewObserver", "insertDoc", "pasteBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DocPasteBean;", "insertUrl", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "updateSummaryBean", "richTextShowBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "updateSummaryForEditLimit", "editable", "updateSummaryInfo", "updateSummaryStrikeThrough", "show", "updateViewForEditLimit", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j */
public final class SummarySection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public boolean f140014a;

    /* renamed from: b */
    public boolean f140015b;

    /* renamed from: c */
    public final View f140016c;

    /* renamed from: d */
    private KeyListener f140017d;

    /* renamed from: e */
    private final Lazy f140018e = LazyKt.lazy(new C56653n(this));

    /* renamed from: l */
    private final View.OnFocusChangeListener m220471l() {
        return (View.OnFocusChangeListener) this.f140018e.getValue();
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View$OnFocusChangeListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$n */
    static final class C56653n extends Lambda implements Function0<View.OnFocusChangeListener> {
        final /* synthetic */ SummarySection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56653n(SummarySection jVar) {
            super(0);
            this.this$0 = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View.OnFocusChangeListener invoke() {
            return new View.OnFocusChangeListener(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.sections.SummarySection.C56653n.View$OnFocusChangeListenerC566541 */

                /* renamed from: a */
                final /* synthetic */ C56653n f140024a;

                {
                    this.f140024a = r1;
                }

                public final void onFocusChange(View view, boolean z) {
                    if (!z) {
                        IActionDispatcher d = this.f140024a.this$0.mo92107d();
                        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140024a.this$0.f140016c.findViewById(R.id.todo_richText_summary);
                        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
                        d.mo92067a(80, richTextEmojiconEditText.getDraftRichText());
                        this.f140024a.this$0.mo92107d().mo92064a(44);
                        return;
                    }
                    this.f140024a.this$0.mo92107d().mo92064a(LocationRequest.PRIORITY_HD_ACCURACY);
                }
            };
        }
    }

    /* renamed from: m */
    private final void m220472m() {
        ((RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary)).setOnPasteListener(new C56639a(this));
    }

    /* renamed from: j */
    public final void mo192632j() {
        TodoRichTextViewHelper eVar = TodoRichTextViewHelper.f139403a;
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
        eVar.mo192002a(richTextEmojiconEditText);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$c */
    public static final class RunnableC56641c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SummarySection f140021a;

        RunnableC56641c(SummarySection jVar) {
            this.f140021a = jVar;
        }

        public final void run() {
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140021a.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
            ((RichTextEmojiconEditText) this.f140021a.f140016c.findViewById(R.id.todo_richText_summary)).setSelection(richTextEmojiconEditText.getText().length());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/todo/impl/features/detail/sections/SummarySection$textChanged$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$o */
    public static final class RunnableC56655o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RichTextEmojiconEditText f140025a;

        /* renamed from: b */
        final /* synthetic */ SummarySection f140026b;

        RunnableC56655o(RichTextEmojiconEditText richTextEmojiconEditText, SummarySection jVar) {
            this.f140025a = richTextEmojiconEditText;
            this.f140026b = jVar;
        }

        public final void run() {
            int i;
            IActionDispatcher d = this.f140026b.mo92107d();
            Editable text = this.f140025a.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            d.mo92065a(520, i);
            this.f140026b.mo92107d().mo92067a(80, this.f140025a.getDraftRichText());
            this.f140026b.mo192631b(false);
        }
    }

    /* renamed from: k */
    private final void m220470k() {
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
        if (richTextEmojiconEditText.getKeyListener() != null) {
            RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_richText_summary");
            this.f140017d = richTextEmojiconEditText2.getKeyListener();
        }
        ((RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary)).addTextChangedListener(new C56642d(this));
        RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.todo_richText_summary");
        richTextEmojiconEditText3.setOnFocusChangeListener(m220471l());
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        mo192632j();
        m220470k();
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getSummaryInit(), new C56643e(this));
        mo92103a(qVar.getSummaryShowRichText(), new C56644f(this));
        mo92103a(qVar.getSummaryInfo(), new C56645g(this));
        mo92103a(qVar.getSummaryRequestFocus(), new C56646h(this));
        mo92103a(qVar.getSummaryClearFocus(), new C56648i(this));
        mo92103a(qVar.getSummaryHideKeyboard(), new C56649j(this));
        mo92103a(qVar.getSummaryStrikeThrough(), new C56650k(this));
        mo92103a(qVar.getSummaryPasteDoc(), new C56651l(this));
        mo92103a(qVar.getSummaryPasteUrl(), new C56652m(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/sections/SummarySection$initRichTextPasteListener$1", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "onContentPaste", "", "content", "", "selection", "", "length", "onFilePaste", "filePaths", "", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$a */
    public static final class C56639a extends AbstractC58541b {

        /* renamed from: a */
        final /* synthetic */ SummarySection f140019a;

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56639a(SummarySection jVar) {
            this.f140019a = jVar;
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo147074a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null) {
                IActionDispatcher d = this.f140019a.mo92107d();
                RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140019a.f140016c.findViewById(R.id.todo_richText_summary);
                Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
                d.mo92067a(80, richTextEmojiconEditText.getDraftRichText());
                this.f140019a.mo92107d().mo92066a(43, (IActionData) new PasteBean(charSequence.toString(), i));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/sections/SummarySection$initViewListener$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$d */
    public static final class C56642d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ SummarySection f140022a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56642d(SummarySection jVar) {
            this.f140022a = jVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f140022a.mo192631b(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInit;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummarySection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$e */
    static final class C56643e extends Lambda implements Function1<SummaryInit, Unit> {
        final /* synthetic */ SummarySection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56643e(SummarySection jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SummaryInit vVar) {
            invoke(vVar);
            return Unit.INSTANCE;
        }

        public final void invoke(SummaryInit vVar) {
            Intrinsics.checkParameterIsNotNull(vVar, "it");
            this.this$0.mo192629a(vVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummarySection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$f */
    static final class C56644f extends Lambda implements Function1<RichTextShowBean, Unit> {
        final /* synthetic */ SummarySection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56644f(SummarySection jVar) {
            super(1);
            this.this$0 = jVar;
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
            this.this$0.mo192627a(tVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInfo;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummarySection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$g */
    static final class C56645g extends Lambda implements Function1<SummaryInfo, Unit> {
        final /* synthetic */ SummarySection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56645g(SummarySection jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SummaryInfo uVar) {
            invoke(uVar);
            return Unit.INSTANCE;
        }

        public final void invoke(SummaryInfo uVar) {
            Intrinsics.checkParameterIsNotNull(uVar, "it");
            this.this$0.mo192628a(uVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummarySection$initViewObserver$1$7"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$k */
    static final class C56650k extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ SummarySection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56650k(SummarySection jVar) {
            super(1);
            this.this$0 = jVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192630a(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DocPasteBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummarySection$initViewObserver$1$8"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$l */
    static final class C56651l extends Lambda implements Function1<DocPasteBean, Unit> {
        final /* synthetic */ SummarySection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56651l(SummarySection jVar) {
            super(1);
            this.this$0 = jVar;
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
            this.this$0.mo192626a(kVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummarySection$initViewObserver$1$9"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$m */
    static final class C56652m extends Lambda implements Function1<UrlPasteBean, Unit> {
        final /* synthetic */ SummarySection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56652m(SummarySection jVar) {
            super(1);
            this.this$0 = jVar;
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
            this.this$0.mo192625a(ahVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummarySection$initViewObserver$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$h */
    static final class C56646h extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ SummarySection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56646h(SummarySection jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            final RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.this$0.f140016c.findViewById(R.id.todo_richText_summary);
            richTextEmojiconEditText.post(new Runnable() {
                /* class com.ss.android.lark.todo.impl.features.detail.sections.SummarySection.C56646h.RunnableC566471 */

                public final void run() {
                    richTextEmojiconEditText.requestFocus();
                    RichTextEmojiconEditText richTextEmojiconEditText = richTextEmojiconEditText;
                    richTextEmojiconEditText.setSelection(richTextEmojiconEditText.getText().length());
                }
            });
            ((RichTextEmojiconEditText) this.this$0.f140016c.findViewById(R.id.todo_richText_summary)).requestFocus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummarySection$initViewObserver$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$i */
    static final class C56648i extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ SummarySection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56648i(SummarySection jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((RichTextEmojiconEditText) this.this$0.f140016c.findViewById(R.id.todo_richText_summary)).clearFocus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/SummarySection$initViewObserver$1$6"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$j */
    static final class C56649j extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ SummarySection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56649j(SummarySection jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            KeyboardUtils.hideKeyboard(this.this$0.f140016c.getContext(), (RichTextEmojiconEditText) this.this$0.f140016c.findViewById(R.id.todo_richText_summary));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$p */
    public static final class View$OnClickListenerC56656p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SummarySection f140027a;

        View$OnClickListenerC56656p(SummarySection jVar) {
            this.f140027a = jVar;
        }

        public final void onClick(View view) {
            this.f140027a.mo92107d().mo92064a(41);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$q */
    public static final class View$OnClickListenerC56657q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SummarySection f140028a;

        View$OnClickListenerC56657q(SummarySection jVar) {
            this.f140028a = jVar;
        }

        public final void onClick(View view) {
            this.f140028a.mo92107d().mo92064a(41);
        }
    }

    /* renamed from: a */
    public final void mo192627a(RichTextShowBean tVar) {
        boolean b = tVar.mo193043b();
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
        TodoKeyboardUtil.m220375a(b, richTextEmojiconEditText, tVar.mo193042a(), tVar.mo193044c());
    }

    /* renamed from: b */
    public final void mo192631b(boolean z) {
        if (!this.f140015b && z) {
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            richTextEmojiconEditText.post(new RunnableC56655o(richTextEmojiconEditText, this));
        }
        this.f140015b = z;
    }

    /* renamed from: b */
    private final void m220467b(SummaryInfo uVar) {
        SummaryInit b = ((ITodoDetailViewDataStore) mo92096a()).getSummaryInit().mo5927b();
        if (b != null && b.mo193054a()) {
            return;
        }
        if (uVar.mo193049b() == TodoSource.OAPI) {
            m220469c(uVar.mo193050c());
        } else {
            m220468c(uVar);
        }
    }

    /* renamed from: c */
    private final void m220468c(SummaryInfo uVar) {
        if (uVar.mo193049b() == TodoSource.DOC) {
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
            richTextEmojiconEditText.setKeyListener(null);
            RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_richText_summary");
            richTextEmojiconEditText2.setLongClickable(false);
            RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.todo_richText_summary");
            richTextEmojiconEditText3.setFocusableInTouchMode(false);
            ((RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary)).setOnClickListener(new View$OnClickListenerC56657q(this));
            return;
        }
        m220469c(uVar.mo193050c());
    }

    /* renamed from: a */
    public final void mo192628a(SummaryInfo uVar) {
        if (uVar.mo193048a()) {
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
            RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_richText_summary");
            richTextEmojiconEditText.setPaintFlags(richTextEmojiconEditText2.getPaintFlags() | 16);
        } else {
            RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.todo_richText_summary");
            RichTextEmojiconEditText richTextEmojiconEditText4 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText4, "containerView.todo_richText_summary");
            richTextEmojiconEditText3.setPaintFlags(richTextEmojiconEditText4.getPaintFlags() & -17);
        }
        m220467b(uVar);
        TodoAppreciableHitPoint.f141058a.mo194144e();
    }

    /* renamed from: c */
    private final void m220469c(boolean z) {
        if (z) {
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
            richTextEmojiconEditText.setKeyListener(this.f140017d);
            RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_richText_summary");
            richTextEmojiconEditText2.setLongClickable(true);
            RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.todo_richText_summary");
            richTextEmojiconEditText3.setFocusableInTouchMode(true);
            ((RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary)).setOnClickListener(null);
            return;
        }
        RichTextEmojiconEditText richTextEmojiconEditText4 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText4, "containerView.todo_richText_summary");
        if (richTextEmojiconEditText4.getKeyListener() != null) {
            RichTextEmojiconEditText richTextEmojiconEditText5 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText5, "containerView.todo_richText_summary");
            this.f140017d = richTextEmojiconEditText5.getKeyListener();
        }
        RichTextEmojiconEditText richTextEmojiconEditText6 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText6, "containerView.todo_richText_summary");
        richTextEmojiconEditText6.setKeyListener(null);
        RichTextEmojiconEditText richTextEmojiconEditText7 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText7, "containerView.todo_richText_summary");
        richTextEmojiconEditText7.setLongClickable(false);
        if (((RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary)).length() > 0) {
            RichTextEmojiconEditText richTextEmojiconEditText8 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText8, "containerView.todo_richText_summary");
            richTextEmojiconEditText8.setFocusableInTouchMode(true);
            ((RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary)).setOnClickListener(null);
            return;
        }
        RichTextEmojiconEditText richTextEmojiconEditText9 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText9, "containerView.todo_richText_summary");
        richTextEmojiconEditText9.setFocusableInTouchMode(false);
        ((RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary)).setOnClickListener(new View$OnClickListenerC56656p(this));
    }

    /* renamed from: a */
    public final void mo192625a(UrlPasteBean ahVar) {
        String str;
        TodoRichTextViewHelper eVar = TodoRichTextViewHelper.f139403a;
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
        eVar.mo192004a(ahVar, richTextEmojiconEditText);
        IActionDispatcher d = mo92107d();
        RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_richText_summary");
        d.mo92067a(80, richTextEmojiconEditText2.getDraftRichText());
        RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.todo_richText_summary");
        RichText draftRichText = richTextEmojiconEditText3.getDraftRichText();
        Intrinsics.checkExpressionValueIsNotNull(draftRichText, "containerView.todo_richText_summary.draftRichText");
        for (String str2 : draftRichText.getAnchorIds()) {
            RichTextEmojiconEditText richTextEmojiconEditText4 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText4, "containerView.todo_richText_summary");
            RichText draftRichText2 = richTextEmojiconEditText4.getDraftRichText();
            Intrinsics.checkExpressionValueIsNotNull(draftRichText2, "containerView.todo_richText_summary.draftRichText");
            RichText.RichTextElements elements = draftRichText2.getElements();
            Intrinsics.checkExpressionValueIsNotNull(elements, "containerView.todo_richT…ry.draftRichText.elements");
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
    public final void mo192626a(DocPasteBean kVar) {
        C58508e.C58511b bVar;
        Doc a = kVar.mo193012a();
        String name = a.getName();
        if (kVar.mo193013b() < 0) {
            bVar = new C58508e.C58511b(kVar.mo193014c());
            bVar.mo198340a(false);
        } else {
            bVar = new C58508e.C58511b(kVar.mo193013b(), kVar.mo193014c());
        }
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
        Context context = richTextEmojiconEditText.getContext();
        C58508e.C58510a c = new C58508e.C58510a(context, bVar).mo198336a(name).mo198339c(UIHelper.getColor(R.color.text_link_normal));
        IKeyboardDependency a2 = C40682g.m160850a();
        DocType docType = a.getDocType();
        Intrinsics.checkExpressionValueIsNotNull(docType, "doc.docType");
        Drawable drawable = ContextCompat.getDrawable(context, a2.mo133166a(docType));
        RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_richText_summary");
        Context context2 = richTextEmojiconEditText2.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "containerView.todo_richText_summary.context");
        IconKeyDrawable oVar = new IconKeyDrawable(context2);
        Icon icon = a.getIcon();
        Intrinsics.checkExpressionValueIsNotNull(icon, "doc.icon");
        oVar.mo89034a(icon.getValue(), null, UIHelper.dp2px(14.0f), UIHelper.dp2px(14.0f), drawable, true);
        c.mo198335a(oVar);
        TodoRichTextViewHelper eVar = TodoRichTextViewHelper.f139403a;
        RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.todo_richText_summary");
        eVar.mo192003a(richTextEmojiconEditText3, c.mo198337a(), a.getUrl());
        IActionDispatcher d = mo92107d();
        RichTextEmojiconEditText richTextEmojiconEditText4 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText4, "containerView.todo_richText_summary");
        d.mo92067a(80, richTextEmojiconEditText4.getDraftRichText());
        RichTextEmojiconEditText richTextEmojiconEditText5 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText5, "containerView.todo_richText_summary");
        RichText draftRichText = richTextEmojiconEditText5.getDraftRichText();
        Intrinsics.checkExpressionValueIsNotNull(draftRichText, "containerView.todo_richText_summary.draftRichText");
        for (String str : draftRichText.getAnchorIds()) {
            RichTextEmojiconEditText richTextEmojiconEditText6 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText6, "containerView.todo_richText_summary");
            RichText draftRichText2 = richTextEmojiconEditText6.getDraftRichText();
            Intrinsics.checkExpressionValueIsNotNull(draftRichText2, "containerView.todo_richText_summary.draftRichText");
            RichText.RichTextElements elements = draftRichText2.getElements();
            Intrinsics.checkExpressionValueIsNotNull(elements, "containerView.todo_richT…ry.draftRichText.elements");
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

    /* renamed from: a */
    public final void mo192629a(SummaryInit vVar) {
        if (vVar.mo193054a()) {
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
            richTextEmojiconEditText.setNextFocusForwardId(R.id.todo_description);
            RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_richText_summary");
            richTextEmojiconEditText2.setImeOptions(5);
            if (!vVar.mo193055b()) {
                KeyboardUtils.showKeyboard((RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary));
            }
        } else {
            RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.todo_richText_summary");
            richTextEmojiconEditText3.setImeOptions(6);
        }
        ((RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary)).setRawInputType(1);
        ((RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary)).setOnTouchListener(new View$OnTouchListenerC56640b(this));
        m220472m();
        if (vVar.mo193054a()) {
            ((RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary)).post(new RunnableC56641c(this));
        }
    }

    /* renamed from: a */
    public final void mo192630a(boolean z) {
        if (z) {
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
            RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_richText_summary");
            richTextEmojiconEditText.setPaintFlags(richTextEmojiconEditText2.getPaintFlags() & -17);
            return;
        }
        RichTextEmojiconEditText richTextEmojiconEditText3 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText3, "containerView.todo_richText_summary");
        RichTextEmojiconEditText richTextEmojiconEditText4 = (RichTextEmojiconEditText) this.f140016c.findViewById(R.id.todo_richText_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText4, "containerView.todo_richText_summary");
        richTextEmojiconEditText3.setPaintFlags(richTextEmojiconEditText4.getPaintFlags() | 16);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SummarySection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f140016c = view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.j$b */
    public static final class View$OnTouchListenerC56640b implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ SummarySection f140020a;

        View$OnTouchListenerC56640b(SummarySection jVar) {
            this.f140020a = jVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f140020a.f140016c.findViewById(R.id.todo_richText_summary);
            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
            if (richTextEmojiconEditText.getKeyListener() != null) {
                this.f140020a.mo92107d().mo92069a(250, false);
            }
            this.f140020a.f140014a = true;
            return false;
        }
    }
}
