package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.DocAvatar;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.dto.info.SearchCalendarEventInfo;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import com.ss.android.lark.searchcommon.view.avataritem.assigntime.AssignTimeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/CalendarEventBinder;", "Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchCalendarEventInfo;", "mContext", "Landroid/content/Context;", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "getMContext", "()Landroid/content/Context;", "bindAvatar", "", "holder", "Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindOthers", "position", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.d */
public final class CalendarEventBinder extends CommonBinder<SearchCalendarEventInfo> {

    /* renamed from: a */
    private final Context f133613a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarEventBinder(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        super(context, bVar);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133613a = context;
    }

    /* renamed from: a */
    public void mo184769a(ChatterChatViewHolder aVar, SearchCalendarEventInfo searchCalendarEventInfo) {
        int i;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchCalendarEventInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (searchCalendarEventInfo.getIsGoogleEvent()) {
            i = R.drawable.calendar_event_google_icon;
        } else {
            i = R.drawable.calendar_event_icon;
        }
        aVar.mo184645a().getItem().mo184662a(((DocAvatar.Builder) new DocAvatar.Builder().mo88957a(i)).mo88976k());
    }

    /* renamed from: a */
    public void mo184804a(int i, ChatterChatViewHolder aVar, SearchCalendarEventInfo searchCalendarEventInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchCalendarEventInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (TextUtils.isEmpty(searchCalendarEventInfo.getEventExactData())) {
            aVar.mo184645a().getItem().mo184664a(new AssignTimeModel(false));
            return;
        }
        AvatarItemView item = aVar.mo184645a().getItem();
        String eventExactData = searchCalendarEventInfo.getEventExactData();
        Intrinsics.checkExpressionValueIsNotNull(eventExactData, "data.eventExactData");
        item.mo184664a(new AssignTimeModel(eventExactData));
    }
}
