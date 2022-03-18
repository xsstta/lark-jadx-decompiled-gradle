package com.ss.android.lark.mine.impl.custom_status.model;

import com.google.firebase.messaging.Constants;
import com.larksuite.arch.jack.State;
import com.ss.android.lark.mine.impl.custom_status.emoji_panel.AvatarViewData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J'\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005H&¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u000eH&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/ModifyStatusState;", "T", "Lcom/larksuite/arch/jack/State;", "setAvatarEvent", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/AvatarViewData;", "", "(Lkotlin/Pair;)Ljava/lang/Object;", "setErrorEvent", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "(Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;)Ljava/lang/Object;", "setPopBack", "", "(Z)Ljava/lang/Object;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.model.i */
public interface ModifyStatusState<T> extends State {
    /* renamed from: b */
    T mo160468b(ErrorEvent hVar);

    /* renamed from: b */
    T mo160469b(Pair<? extends List<AvatarViewData>, Integer> pair);
}
