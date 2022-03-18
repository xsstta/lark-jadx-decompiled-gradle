package com.ss.android.lark.tab.space.tab.add.modify;

import androidx.lifecycle.AbstractC1178x;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.tab.service.ChatTabProcessor;
import com.ss.android.lark.tab.service.entity.ChatTab;
import com.ss.android.lark.tab.service.entity.ChatTabsListResult;
import com.ss.android.lark.tab.space.tab.entity.DocTabPayload;
import com.ss.android.lark.tab.statistics.ChatTabHitPoint;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.widget.richtext.C59029c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyModel;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "viewModel", "Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceModifyViewModel;", "(Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceModifyViewModel;)V", "addNewDoc", "", "onCreate", "reportAddDocTabEvent", "sendDocMessage", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddSpaceTabModifyModel extends Widget {

    /* renamed from: a */
    public final AddSpaceModifyViewModel f136595a;

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        this.f136595a.getConfirmFlag().mo5923a(this, new C55345b(this));
    }

    /* renamed from: b */
    public final void mo188681b() {
        C32848e.m126401b().mo121089a(((C29601ad.C29603a) C29601ad.m109464a().mo125332j(this.f136595a.getChatId())).mo106659a(C59029c.m229161b(this.f136595a.getSelectViewData().getDocUrl())).mo106660a());
    }

    /* renamed from: c */
    public final void mo121985c() {
        String c = C57859q.m224567c(this.f136595a.getSelectViewData().getId());
        ChatTabHitPoint.ChatTabExtraParam.Click click = ChatTabHitPoint.ChatTabExtraParam.Click.SAVE_DOC_PAGE;
        ChatTabHitPoint.ChatTabExtraParam.Target target = ChatTabHitPoint.ChatTabExtraParam.Target.CCM_DOCS_PAGE_VIEW;
        ChatTabHitPoint chatTabHitPoint = ChatTabHitPoint.f136619a;
        IParam plus = click.plus(target);
        Intrinsics.checkExpressionValueIsNotNull(c, "encryptDocId");
        chatTabHitPoint.mo188723a(plus, c, true);
    }

    /* renamed from: a */
    public final void mo188680a() {
        String docName = this.f136595a.getDocName();
        if (docName != null) {
            ChatTabProcessor.f136407e.mo188387a(this.f136595a.getChatId()).mo188381a(ChatTab.Companion.mo188423a(docName, ChatTab.ChatTabType.DOC, null, DocTabPayload.Companion.mo188719b(new DocTabPayload(this.f136595a.getSelectViewData().getId(), this.f136595a.getSelectViewData().getDocUrl(), this.f136595a.getSelectViewData().getTitle()))), new C55344a(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyModel$addNewDoc$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyModel$a */
    public static final class C55344a implements IGetDataCallback<ChatTabsListResult> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceTabModifyModel f136596a;

        C55344a(AddSpaceTabModifyModel addSpaceTabModifyModel) {
            this.f136596a = addSpaceTabModifyModel;
        }

        /* renamed from: a */
        public void onSuccess(ChatTabsListResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f136596a.mo188681b();
            this.f136596a.f136595a.getChatTabListLiveData().mo5926a(aVar);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f136596a.f136595a.getErrorLiveData().mo5926a(errorResult);
        }
    }

    public AddSpaceTabModifyModel(AddSpaceModifyViewModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewModel");
        this.f136595a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyModel$b */
    static final class C55345b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceTabModifyModel f136597a;

        C55345b(AddSpaceTabModifyModel addSpaceTabModifyModel) {
            this.f136597a = addSpaceTabModifyModel;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                if (this.f136597a.f136595a.getDocName() != null) {
                    this.f136597a.mo188680a();
                    this.f136597a.mo121985c();
                }
                this.f136597a.f136595a.getConfirmFlag().mo5926a((Boolean) false);
            }
        }
    }
}
