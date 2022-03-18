package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002J \u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u001e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0016¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AtViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "checkUpdateAtUser", "", "checkUpdateAtUserInAssignees", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "lv", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "handleAction", "action", "", "actionData", "Lcom/larksuite/framework/section/IActionData;", "", "handleInsertAtTag", BottomDialog.f17198f, "handleSelectAtChatter", "atChatterBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AtChatterBean;", "liveData", "initViewData", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.d */
public final class AtViewModel extends ViewModelSection<TodoDetailModel> {
    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getInitAtController().mo5929b(((TodoDetailModel) getModelStore()).getChatIdForAddAssignee());
        adVar.getAssignees().mo5925a(new C56768a(this));
        adVar.getFollowers().mo5925a(new C56769b(this));
    }

    public final void checkUpdateAtUser() {
        checkUpdateAtUserInAssignees(((TodoDetailModel) getModelStore()).getRichTextSummary(), ((TodoDetailModel) getModelStore()).getSummaryShowRichText());
        checkUpdateAtUserInAssignees(((TodoDetailModel) getModelStore()).getRichTextDescription(), ((TodoDetailModel) getModelStore()).getDescriptionShowRichText());
        checkUpdateAtUserInAssignees(((TodoDetailModel) getModelStore()).getRichTextComment(), ((TodoDetailModel) getModelStore()).getCommentShowRichText());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "kotlin.jvm.PlatformType", "onChanged", "com/ss/android/lark/todo/impl/features/detail/viewmodel/AtViewModel$initViewData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.d$a */
    static final class C56768a<T> implements AbstractC1178x<List<? extends AssigneeBean>> {

        /* renamed from: a */
        final /* synthetic */ AtViewModel f140165a;

        C56768a(AtViewModel dVar) {
            this.f140165a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(List<AssigneeBean> list) {
            this.f140165a.checkUpdateAtUser();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerBean;", "kotlin.jvm.PlatformType", "onChanged", "com/ss/android/lark/todo/impl/features/detail/viewmodel/AtViewModel$initViewData$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.d$b */
    static final class C56769b<T> implements AbstractC1178x<List<? extends FollowerBean>> {

        /* renamed from: a */
        final /* synthetic */ AtViewModel f140166a;

        C56769b(AtViewModel dVar) {
            this.f140166a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(List<FollowerBean> list) {
            this.f140166a.checkUpdateAtUser();
        }
    }

    private final void handleInsertAtTag(String str) {
        TodoHitPoint.f141073a.mo194225e();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AtViewModel(IViewModelAbility<TodoDetailModel> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionData");
        if (i == 60) {
            handleInsertAtTag(str);
        }
    }

    private final void handleSelectAtChatter(AtChatterBean cVar, C1177w<AtChatterBean> wVar) {
        cVar.mo192983a(((TodoDetailModel) getModelStore()).isOutUser(cVar.mo192982a()));
        wVar.mo5926a(cVar);
    }

    private final void checkUpdateAtUserInAssignees(RichText richText, C1177w<RichTextShowBean> wVar) {
        List<String> list;
        boolean z;
        RichText.RichTextElements elements;
        Map<String, RichTextElement> dictionary;
        RichTextElement richTextElement;
        RichTextElement.RichTextProperty property;
        if (richText != null) {
            list = richText.getAtIds();
        } else {
            list = null;
        }
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (String str : list) {
                if (!(richText == null || (elements = richText.getElements()) == null || (dictionary = elements.getDictionary()) == null || (richTextElement = dictionary.get(str)) == null || (property = richTextElement.getProperty()) == null || !(property instanceof RichTextElement.AtProperty))) {
                    RichTextElement.AtProperty atProperty = (RichTextElement.AtProperty) property;
                    atProperty.setOutChatUser(((TodoDetailModel) getModelStore()).isOutUser(atProperty.getUserId()));
                }
            }
            wVar.mo5926a(new RichTextShowBean(richText, true, false));
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, IActionData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
        if (i != 72) {
            switch (i) {
                case 61:
                    if (bVar instanceof AtChatterBean) {
                        handleSelectAtChatter((AtChatterBean) bVar, ((TodoDetailModel) getModelStore()).getSummaryInsertAtTag());
                        return;
                    }
                    return;
                case 62:
                    if (bVar instanceof AtChatterBean) {
                        handleSelectAtChatter((AtChatterBean) bVar, ((TodoDetailModel) getModelStore()).getDescriptionInsertAtTag());
                        return;
                    }
                    return;
                case 63:
                    if (bVar instanceof AtChatterBean) {
                        handleSelectAtChatter((AtChatterBean) bVar, ((TodoDetailModel) getModelStore()).getDescriptionFragmentInsertAtTag());
                        return;
                    }
                    return;
                case 64:
                    if (bVar instanceof AtChatterBean) {
                        handleSelectAtChatter((AtChatterBean) bVar, ((TodoDetailModel) getModelStore()).getCommentInsertAtTag());
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else if (bVar instanceof AtChatterBean) {
            handleSelectAtChatter((AtChatterBean) bVar, ((TodoDetailModel) getModelStore()).getSummaryKeyboardInsertAtTag());
        }
    }
}
