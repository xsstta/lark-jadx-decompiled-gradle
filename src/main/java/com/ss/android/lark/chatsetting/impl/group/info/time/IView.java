package com.ss.android.lark.chatsetting.impl.group.info.time;

import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ\b\u0010\u0003\u001a\u00020\u0004H&J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/IView$Delegate;", "gotoLastPage", "", "setData", "list", "", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeBean;", ShareHitPoint.f121869d, "", "Delegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.h */
public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onTimeItemSelected", "", "chatId", "", "bean", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeBean;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.h$a */
    public interface Delegate extends IView.IViewDelegate {
        /* renamed from: a */
        void mo128064a(String str, GroupShareTimeBean bVar);
    }

    /* renamed from: a */
    void mo128065a();

    /* renamed from: a */
    void mo128067a(List<GroupShareTimeBean> list, int i);
}
