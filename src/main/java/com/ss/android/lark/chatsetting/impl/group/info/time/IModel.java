package com.ss.android.lark.chatsetting.impl.group.info.time;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getInitShareTimeType", "", "initData", "", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeBean;", "initShareTimeType", "", "saveGroupShareTimeType", "chatId", "", ShareHitPoint.f121869d, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.g */
public interface IModel extends com.larksuite.framework.mvp.IModel {
    /* renamed from: a */
    List<GroupShareTimeBean> mo128058a();

    /* renamed from: a */
    void mo128059a(String str, int i);

    /* renamed from: c */
    int mo128061c();
}
