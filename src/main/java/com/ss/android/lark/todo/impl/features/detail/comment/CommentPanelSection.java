package com.ss.android.lark.todo.impl.features.detail.comment;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.bytedance.lark.pb.todo.v1.TodoUser;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.LKUIListItemData;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IActionDispatcher;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.reaction.widget.panel.C53085d;
import com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56473b;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J \u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0014\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b*\u00020\u001dH\u0002J\f\u0010\u001e\u001a\u00020\u001f*\u00020\u001bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentPanelSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Lcom/larksuite/framework/section/IViewAbility;)V", "copyItem", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelMenuItem;", "deleteItem", "editItem", "panelInfo", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentPanelInfo;", "replyItem", "getOperationMenuList", "", "item", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "getShowPositionX", "", "initViewAction", "", "initViewObserver", "showOperationPanel", "itemView", "Landroid/view/View;", "position", "fromPb", "Lcom/ss/android/lark/widget/richtext/RichText;", "kotlin.jvm.PlatformType", "Lcom/bytedance/lark/pb/basic/v1/RichContent;", "toText", "", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.o */
public final class CommentPanelSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: b */
    public static final Companion f139858b = new Companion(null);

    /* renamed from: a */
    public CommentPanelInfo f139859a;

    /* renamed from: c */
    private C53085d f139860c;

    /* renamed from: d */
    private C53085d f139861d;

    /* renamed from: e */
    private C53085d f139862e;

    /* renamed from: f */
    private C53085d f139863f;

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentPanelSection$Companion;", "", "()V", "COPIED_TEXT", "", "TITLE_LINE_COUNT", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.o$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: j */
    private final int m220331j() {
        if (DesktopUtil.m144301a(mo92106c())) {
            return C52990a.m205225a(mo92106c(), ContainerType.Left) >> 1;
        }
        return 0;
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        mo92103a(((ITodoDetailViewDataStore) mo92096a()).getCommentPanelInfo(), new C56539e(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.o$d */
    static final class C56538d implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ CommentPanelSection f139867a;

        C56538d(CommentPanelSection oVar) {
            this.f139867a = oVar;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            CommentPanelInfo nVar = this.f139867a.f139859a;
            if (nVar != null) {
                IActionDispatcher d = this.f139867a.mo92107d();
                EditedCommentDraftHolder zVar = EditedCommentDraftHolder.f139907a;
                String str = nVar.mo192444c().id;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.todoComment.id");
                d.mo92066a(135, (IActionData) new CommentEditInfo(zVar.mo192503a(str), nVar.mo192444c(), nVar.mo192443b()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.o$f */
    static final class C56540f implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ CommentPanelSection f139868a;

        C56540f(CommentPanelSection oVar) {
            this.f139868a = oVar;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            CommentPanelInfo nVar = this.f139868a.f139859a;
            if (nVar != null) {
                this.f139868a.mo92107d().mo92066a(134, (IActionData) new CommentReplyInfo(nVar.mo192443b(), nVar.mo192444c()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.o$b */
    static final class C56535b implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ CommentPanelSection f139864a;

        C56535b(CommentPanelSection oVar) {
            this.f139864a = oVar;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            String str;
            RichText a;
            CommentPanelInfo nVar = this.f139864a.f139859a;
            if (nVar != null) {
                Object systemService = this.f139864a.mo92106c().getSystemService("clipboard");
                if (systemService != null) {
                    ClipboardManager clipboardManager = (ClipboardManager) systemService;
                    RichContent richContent = nVar.mo192444c().rich_content;
                    if (richContent == null || (a = this.f139864a.mo192448a(richContent)) == null) {
                        str = null;
                    } else {
                        str = this.f139864a.mo192449a(a);
                    }
                    ClipData newPlainText = ClipData.newPlainText(r2, str);
                    Intrinsics.checkExpressionValueIsNotNull(newPlainText, "ClipData.newPlainText(CO…tent?.fromPb()?.toText())");
                    clipboardManager.setPrimaryClip(newPlainText);
                    LKUIToast.show(this.f139864a.mo92106c(), UIHelper.getString(R.string.Lark_Legacy_CopySuccess));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.o$c */
    static final class C56536c implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ CommentPanelSection f139865a;

        C56536c(CommentPanelSection oVar) {
            this.f139865a = oVar;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public final void onMenuItemClick() {
            String string = UIHelper.getString(R.string.Todo_common_Delete);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(\n    …tring.Todo_common_Delete)");
            LKUIListItemData nVar = new LKUIListItemData(string);
            nVar.mo89289b(R.color.function_danger_500);
            ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) new C25644o(this.f139865a.mo92106c()).mo89237b(UIHelper.getString(R.string.Todo_Task_ConfirmDeleteComment))).mo89251j(2)).mo89205a(CollectionsKt.listOf(nVar))).mo89202a(new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.comment.CommentPanelSection.C56536c.DialogInterface$OnClickListenerC565371 */

                /* renamed from: a */
                final /* synthetic */ C56536c f139866a;

                {
                    this.f139866a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    CommentPanelInfo nVar;
                    if (i == 0 && (nVar = this.f139866a.f139865a.f139859a) != null) {
                        IActionDispatcher d = this.f139866a.f139865a.mo92107d();
                        String str = nVar.mo192444c().id;
                        Intrinsics.checkExpressionValueIsNotNull(str, "it.todoComment.id");
                        d.mo92066a(136, (IActionData) new CommentDeleteInfo(str));
                    }
                }
            })).mo89290y(0).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_cancel).mo89269b(R.string.Lark_Legacy_Cancel).mo89271d(R.color.text_title))).mo89239c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentPanelInfo;", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentPanelSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.o$e */
    static final class C56539e extends Lambda implements Function1<CommentPanelInfo, Unit> {
        final /* synthetic */ CommentPanelSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56539e(CommentPanelSection oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CommentPanelInfo nVar) {
            invoke(nVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CommentPanelInfo nVar) {
            Intrinsics.checkParameterIsNotNull(nVar, "it");
            this.this$0.f139859a = new CommentPanelInfo(nVar.mo192442a(), nVar.mo192443b(), nVar.mo192444c());
            CommentPanelInfo nVar2 = this.this$0.f139859a;
            if (nVar2 != null) {
                this.this$0.mo192450a(nVar2.mo192442a(), nVar2.mo192444c(), nVar2.mo192443b());
            }
        }
    }

    /* renamed from: a */
    public final RichText mo192448a(RichContent richContent) {
        return C56473b.m220117a(richContent.rich_text);
    }

    /* renamed from: a */
    public final String mo192449a(RichText richText) {
        String a = C59035h.m229208a(richText, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "RichTextUtil.generateDigestText(this, false)");
        if (a != null) {
            return StringsKt.trimStart((CharSequence) a).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: a */
    private final List<C53085d> m220330a(TodoComment todoComment) {
        TodoComment.Type type = todoComment.type;
        String str = null;
        if (type != null && C56542p.f139871a[type.ordinal()] == 1) {
            String a = CommentConstants.f139800a.mo192375a();
            TodoUser todoUser = todoComment.from_user;
            if (todoUser != null) {
                str = todoUser.user_id;
            }
            if (!Intrinsics.areEqual(a, str)) {
                return CollectionsKt.listOf(this.f139863f);
            }
            return CollectionsKt.listOf((Object[]) new C53085d[]{this.f139861d, this.f139863f});
        }
        String a2 = CommentConstants.f139800a.mo192375a();
        TodoUser todoUser2 = todoComment.from_user;
        if (todoUser2 != null) {
            str = todoUser2.user_id;
        }
        if (Intrinsics.areEqual(a2, str)) {
            return CollectionsKt.listOf((Object[]) new C53085d[]{this.f139860c, this.f139861d, this.f139862e, this.f139863f});
        }
        return CollectionsKt.listOf((Object[]) new C53085d[]{this.f139860c, this.f139861d});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentPanelSection(IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139860c = new C53085d(UIHelper.getString(R.string.Lark_Legacy_Copy), UDIconUtils.getIconDrawable(fVar.mo92048a(), (int) R.drawable.ud_icon_copy_outlined, ResUtil.f139261a.mo191775a(R.color.icon_n2)), new C56535b(this));
        this.f139861d = new C53085d(UIHelper.getString(R.string.Lark_Legacy_Reply), UDIconUtils.getIconDrawable(fVar.mo92048a(), (int) R.drawable.ud_icon_reply_cn_outlined, ResUtil.f139261a.mo191775a(R.color.icon_n2)), new C56540f(this));
        this.f139862e = new C53085d(UIHelper.getString(R.string.Lark_Legacy_Edit), UDIconUtils.getIconDrawable(fVar.mo92048a(), (int) R.drawable.ud_icon_edit_outlined, ResUtil.f139261a.mo191775a(R.color.icon_n2)), new C56538d(this));
        this.f139863f = new C53085d(UIHelper.getString(R.string.Lark_Legacy_Delete), UDIconUtils.getIconDrawable(fVar.mo92048a(), (int) R.drawable.ud_icon_delete_trash_outlined, ResUtil.f139261a.mo191775a(R.color.icon_n2)), new C56536c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentPanelSection$showOperationPanel$1", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelFacade$ReactionClickListener;", "onReactionClick", "", "reactionKey", "", "reactionSource", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.o$g */
    public static final class C56541g implements ReactionPanelFacade.AbstractC53072b {

        /* renamed from: a */
        final /* synthetic */ CommentPanelSection f139869a;

        /* renamed from: b */
        final /* synthetic */ TodoComment f139870b;

        @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
        /* renamed from: a */
        public /* synthetic */ void mo22763a() {
            ReactionPanelFacade.AbstractC53072b.CC.$default$a(this);
        }

        @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
        /* renamed from: b */
        public /* synthetic */ void mo22765b() {
            ReactionPanelFacade.AbstractC53072b.CC.$default$b(this);
        }

        C56541g(CommentPanelSection oVar, TodoComment todoComment) {
            this.f139869a = oVar;
            this.f139870b = todoComment;
        }

        @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
        /* renamed from: a */
        public void mo22764a(String str, int i) {
            if (str != null) {
                this.f139869a.mo92107d().mo92066a(137, (IActionData) new CommentItemReactionInfo(this.f139870b, str, i));
            }
        }
    }

    /* renamed from: a */
    public final void mo192450a(View view, TodoComment todoComment, int i) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        new ReactionPanelFacade.C53071a(view).mo181315c(m220330a(todoComment)).mo181309a(TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency().mo145371a()).mo181313b(TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency().mo145379b()).mo181312b(R.drawable.reaction_panel_bg).mo181308a(new C56541g(this, todoComment)).mo181311a().mo181299a(true, 81, m220331j(), C52990a.m205233b(mo92106c()) - iArr[1]);
    }
}
