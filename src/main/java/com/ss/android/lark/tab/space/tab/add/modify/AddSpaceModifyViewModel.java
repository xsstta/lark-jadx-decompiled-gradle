package com.ss.android.lark.tab.space.tab.add.modify;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.tab.service.entity.ChatTabsListResult;
import com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceModifyViewModel;", "Landroidx/lifecycle/ViewModel;", "chatId", "", "selectViewData", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "(Ljava/lang/String;Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;)V", "getChatId", "()Ljava/lang/String;", "chatTabListLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "getChatTabListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setChatTabListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "confirmFlag", "", "getConfirmFlag", "setConfirmFlag", "docName", "getDocName", "setDocName", "(Ljava/lang/String;)V", "errorLiveData", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "getErrorLiveData", "setErrorLiveData", "getSelectViewData", "()Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.tab.add.modify.a */
public final class AddSpaceModifyViewModel extends AbstractC1142af {
    private final String chatId;
    private C1177w<ChatTabsListResult> chatTabListLiveData = new C1177w<>();
    private C1177w<Boolean> confirmFlag = new C1177w<>(false);
    private String docName;
    private C1177w<ErrorResult> errorLiveData = new C1177w<>();
    private final SpaceSelectViewData selectViewData;

    public final String getChatId() {
        return this.chatId;
    }

    public final C1177w<ChatTabsListResult> getChatTabListLiveData() {
        return this.chatTabListLiveData;
    }

    public final C1177w<Boolean> getConfirmFlag() {
        return this.confirmFlag;
    }

    public final String getDocName() {
        return this.docName;
    }

    public final C1177w<ErrorResult> getErrorLiveData() {
        return this.errorLiveData;
    }

    public final SpaceSelectViewData getSelectViewData() {
        return this.selectViewData;
    }

    public final void setDocName(String str) {
        this.docName = str;
    }

    public final void setChatTabListLiveData(C1177w<ChatTabsListResult> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.chatTabListLiveData = wVar;
    }

    public final void setConfirmFlag(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.confirmFlag = wVar;
    }

    public final void setErrorLiveData(C1177w<ErrorResult> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.errorLiveData = wVar;
    }

    public AddSpaceModifyViewModel(String str, SpaceSelectViewData spaceSelectViewData) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(spaceSelectViewData, "selectViewData");
        this.chatId = str;
        this.selectViewData = spaceSelectViewData;
    }
}
