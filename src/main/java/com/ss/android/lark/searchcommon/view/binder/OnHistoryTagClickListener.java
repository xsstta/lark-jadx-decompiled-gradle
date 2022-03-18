package com.ss.android.lark.searchcommon.view.binder;

import android.view.View;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/OnHistoryTagClickListener;", "", "onTagClick", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/service/entity/history/SearchInfoHistory;", "position", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.u */
public interface OnHistoryTagClickListener {
    /* renamed from: a */
    void mo183180a(View view, SearchInfoHistory searchInfoHistory, int i);
}
