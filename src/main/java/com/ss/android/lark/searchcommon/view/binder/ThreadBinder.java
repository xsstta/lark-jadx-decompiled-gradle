package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/ThreadBinder;", "Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchThreadInfo;", "mContext", "Landroid/content/Context;", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "getMContext", "()Landroid/content/Context;", "bindAvatar", "", "holder", "Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.ad */
public final class ThreadBinder extends CommonBinder<SearchThreadInfo> {

    /* renamed from: a */
    private final Context f133583a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadBinder(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        super(context, bVar);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133583a = context;
    }

    /* renamed from: a */
    public void mo184769a(ChatterChatViewHolder aVar, SearchThreadInfo searchThreadInfo) {
        String str;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchThreadInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        AvatarItemView item = aVar.mo184645a().getItem();
        ChatterAvatar.Builder aVar2 = (ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88962a(searchThreadInfo.getAvatarKey());
        Channel channel = searchThreadInfo.getChannel();
        if (channel == null || (str = channel.getId()) == null) {
            str = searchThreadInfo.getChatId();
        }
        item.mo184662a(((ChatterAvatar.Builder) aVar2.mo88967b(str)).mo88976k());
        aVar.mo184645a().getItem().mo184660a(new MiniIconModel(AvatarType.THRED, this.f133583a.getDrawable(R.drawable.feed_thread_icon)));
    }
}
