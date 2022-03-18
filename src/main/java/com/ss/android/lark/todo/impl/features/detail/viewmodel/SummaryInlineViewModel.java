package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import androidx.lifecycle.AbstractC1178x;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInlineViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "checkUpdateAtUserInAssignees", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "generateKeyboardFragmentBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "generateKeyboardFragmentInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInlineInfo;", "handleAction", "action", "", "actionData", "", "initViewData", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.x */
public final class SummaryInlineViewModel extends ViewModelSection<TodoDetailModel> {
    private final SummaryInlineInfo generateKeyboardFragmentInfo() {
        return new SummaryInlineInfo(((TodoDetailModel) getModelStore()).getCreateFromMessageToolbar(), ((TodoDetailModel) getModelStore()).getChatIdForAddAssignee());
    }

    public final RichTextShowBean generateKeyboardFragmentBean() {
        return new RichTextShowBean(((TodoDetailModel) getModelStore()).getRichTextSummary(), true, true);
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        ((TodoDetailModel) getModelStore()).getSummaryInlineInfo().mo5929b(generateKeyboardFragmentInfo());
        ((TodoDetailModel) getModelStore()).getNeedUpdate().mo5925a(new C56786a(this));
        ((TodoDetailModel) getModelStore()).getAssignees().mo5925a(new C56787b(this));
        ((TodoDetailModel) getModelStore()).getFollowers().mo5925a(new C56788c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.x$b */
    static final class C56787b<T> implements AbstractC1178x<List<? extends AssigneeBean>> {

        /* renamed from: a */
        final /* synthetic */ SummaryInlineViewModel f140202a;

        C56787b(SummaryInlineViewModel xVar) {
            this.f140202a = xVar;
        }

        /* renamed from: a */
        public final void onChanged(List<AssigneeBean> list) {
            SummaryInlineViewModel xVar = this.f140202a;
            xVar.checkUpdateAtUserInAssignees(((TodoDetailModel) xVar.getModelStore()).getRichTextSummary());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerBean;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.x$c */
    static final class C56788c<T> implements AbstractC1178x<List<? extends FollowerBean>> {

        /* renamed from: a */
        final /* synthetic */ SummaryInlineViewModel f140203a;

        C56788c(SummaryInlineViewModel xVar) {
            this.f140203a = xVar;
        }

        /* renamed from: a */
        public final void onChanged(List<FollowerBean> list) {
            SummaryInlineViewModel xVar = this.f140203a;
            xVar.checkUpdateAtUserInAssignees(((TodoDetailModel) xVar.getModelStore()).getRichTextSummary());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SummaryInlineViewModel(IViewModelAbility<TodoDetailModel> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.x$a */
    static final class C56786a<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SummaryInlineViewModel f140201a;

        C56786a(SummaryInlineViewModel xVar) {
            this.f140201a = xVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            ((TodoDetailModel) this.f140201a.getModelStore()).getSummaryInlineShowRichText().mo92060c(this.f140201a.generateKeyboardFragmentBean());
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        if (i == 82) {
            TodoDetailModel adVar = (TodoDetailModel) getModelStore();
            if (adVar.isSummaryChanged()) {
                adVar.getSummaryInlineShowRichText().mo92060c(generateKeyboardFragmentBean());
            }
        }
    }

    public final void checkUpdateAtUserInAssignees(RichText richText) {
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
            ((TodoDetailModel) getModelStore()).getSummaryInlineShowRichText().mo5929b(new RichTextShowBean(richText, true, true));
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, Object obj) {
        if (i == 81) {
            if (!(obj instanceof RichText)) {
                obj = null;
            }
            RichText richText = (RichText) obj;
            if (richText != null) {
                ((TodoDetailModel) getModelStore()).setRichTextSummary(richText);
                ((TodoDetailModel) getModelStore()).setInLineSummaryChanged(true);
            }
        }
    }
}
