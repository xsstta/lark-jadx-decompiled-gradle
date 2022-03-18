package com.ss.android.lark.biz.core.api;

import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u0012\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/biz/core/api/IContactsGroupController;", "", "asFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "init", "multiSelectMode", "", "pickType", "Lcom/ss/android/lark/biz/core/api/PickType;", "setContainedChatId", "", "chaIds", "", "", "setGroupOperationListener", "listener", "Lcom/ss/android/lark/biz/core/api/IContactsGroupController$IOnOperationListener;", "setPickType", "setSelectChatIds", "IOnOperationListener", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.core.api.k */
public interface IContactsGroupController {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/biz/core/api/IContactsGroupController$IOnOperationListener;", "", "onContactsGroupSelect", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isSelected", "position", "", "onFinish", "", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.biz.core.api.k$a */
    public interface IOnOperationListener {
        /* renamed from: a */
        void mo102993a();

        /* renamed from: a */
        boolean mo102994a(Chat chat, boolean z, int i);
    }

    /* renamed from: a */
    BaseFragment mo105763a();

    /* renamed from: a */
    IContactsGroupController mo105764a(boolean z, PickType pickType);

    /* renamed from: a */
    void mo105765a(PickType pickType);

    /* renamed from: a */
    void mo105766a(IOnOperationListener aVar);

    /* renamed from: a */
    void mo105767a(List<String> list);

    /* renamed from: b */
    void mo105768b(List<String> list);
}
