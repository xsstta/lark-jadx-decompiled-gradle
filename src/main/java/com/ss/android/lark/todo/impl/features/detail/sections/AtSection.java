package com.ss.android.lark.todo.impl.features.detail.sections;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IActionDispatcher;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.todo.impl.features.detail.at.TodoAtController;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AtChatterBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/AtSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "atContainerView", "Landroid/widget/FrameLayout;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Landroid/widget/FrameLayout;Lcom/larksuite/framework/section/IViewAbility;)V", "mAtControllerD", "Lcom/ss/android/lark/todo/impl/features/detail/at/TodoAtController;", "mAtControllerT", "initViewAction", "", "initViewObserver", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.e */
public final class AtSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public TodoAtController f139967a;

    /* renamed from: b */
    public TodoAtController f139968b;

    /* renamed from: c */
    public final View f139969c;

    /* renamed from: d */
    public final FrameLayout f139970d;

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getInitAtController(), new C56586a(this));
        mo92103a(qVar.getSummaryInsertAtTag(), new C56589b(this));
        mo92103a(qVar.getDescriptionInsertAtTag(), new C56590c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "chatId", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/AtSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.e$a */
    static final class C56586a extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ AtSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56586a(AtSection eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            AtSection eVar = this.this$0;
            Context c = this.this$0.mo92106c();
            if (c != null) {
                TodoAtController aVar = new TodoAtController((FragmentActivity) c, new TodoAtController.InsertAtTagListener(this) {
                    /* class com.ss.android.lark.todo.impl.features.detail.sections.AtSection.C56586a.C565871 */

                    /* renamed from: a */
                    final /* synthetic */ C56586a f139971a;

                    @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                    /* renamed from: a */
                    public void mo192120a() {
                        TodoAtController.InsertAtTagListener.C56450a.m220035a(this);
                    }

                    {
                        this.f139971a = r1;
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
                    public void mo192121a(String str) {
                        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
                        IActionDispatcher d = this.f139971a.this$0.mo92107d();
                        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139971a.this$0.f139969c.findViewById(R.id.todo_richText_summary);
                        Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
                        d.mo92067a(80, richTextEmojiconEditText.getDraftRichText());
                        this.f139971a.this$0.mo92107d().mo92068a(60, str);
                    }

                    @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                    /* renamed from: a */
                    public void mo192122a(String str, String str2) {
                        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
                        Intrinsics.checkParameterIsNotNull(str2, "displayName");
                        this.f139971a.this$0.mo92107d().mo92066a(61, (IActionData) new AtChatterBean(str, str2, false, 4, null));
                    }
                }, true, false, false, 24, null);
                RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.this$0.f139969c.findViewById(R.id.todo_richText_summary);
                Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_richText_summary");
                FrameLayout frameLayout = (FrameLayout) this.this$0.f139970d.findViewById(R.id.todo_feature_fragment_container);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "atContainerView.todo_feature_fragment_container");
                aVar.mo192231a(richTextEmojiconEditText, frameLayout, str);
                eVar.f139967a = aVar;
                AtSection eVar2 = this.this$0;
                Context c2 = this.this$0.mo92106c();
                if (c2 != null) {
                    TodoAtController aVar2 = new TodoAtController((FragmentActivity) c2, new TodoAtController.InsertAtTagListener(this) {
                        /* class com.ss.android.lark.todo.impl.features.detail.sections.AtSection.C56586a.C565882 */

                        /* renamed from: a */
                        final /* synthetic */ C56586a f139972a;

                        @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                        /* renamed from: a */
                        public void mo192120a() {
                            TodoAtController.InsertAtTagListener.C56450a.m220035a(this);
                        }

                        {
                            this.f139972a = r1;
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
                        public void mo192121a(String str) {
                            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
                            IActionDispatcher d = this.f139972a.this$0.mo92107d();
                            RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) this.f139972a.this$0.f139969c.findViewById(R.id.todo_description);
                            Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText, "containerView.todo_description");
                            d.mo92067a(50, richTextEmojiconEditText.getDraftRichText());
                        }

                        @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                        /* renamed from: a */
                        public void mo192122a(String str, String str2) {
                            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
                            Intrinsics.checkParameterIsNotNull(str2, "displayName");
                            this.f139972a.this$0.mo92107d().mo92066a(62, (IActionData) new AtChatterBean(str, str2, false, 4, null));
                        }
                    }, true, false, false, 24, null);
                    RichTextEmojiconEditText richTextEmojiconEditText2 = (RichTextEmojiconEditText) this.this$0.f139969c.findViewById(R.id.todo_description);
                    Intrinsics.checkExpressionValueIsNotNull(richTextEmojiconEditText2, "containerView.todo_description");
                    FrameLayout frameLayout2 = (FrameLayout) this.this$0.f139970d.findViewById(R.id.todo_feature_fragment_container);
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "atContainerView.todo_feature_fragment_container");
                    aVar2.mo192231a(richTextEmojiconEditText2, frameLayout2, str);
                    eVar2.f139968b = aVar2;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AtChatterBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/AtSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.e$b */
    static final class C56589b extends Lambda implements Function1<AtChatterBean, Unit> {
        final /* synthetic */ AtSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56589b(AtSection eVar) {
            super(1);
            this.this$0 = eVar;
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
            TodoAtController aVar = this.this$0.f139967a;
            if (aVar != null) {
                aVar.mo192234a(cVar.mo192982a(), cVar.mo192984b(), cVar.mo192985c());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AtChatterBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/AtSection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.e$c */
    static final class C56590c extends Lambda implements Function1<AtChatterBean, Unit> {
        final /* synthetic */ AtSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56590c(AtSection eVar) {
            super(1);
            this.this$0 = eVar;
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
            TodoAtController aVar = this.this$0.f139968b;
            if (aVar != null) {
                aVar.mo192234a(cVar.mo192982a(), cVar.mo192984b(), cVar.mo192985c());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AtSection(View view, FrameLayout frameLayout, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(frameLayout, "atContainerView");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139969c = view;
        this.f139970d = frameLayout;
    }
}
