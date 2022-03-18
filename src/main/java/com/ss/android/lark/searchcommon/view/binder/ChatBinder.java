package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleTailModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\tJ\b\u0010\u0014\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/ChatBinder;", "Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatInfo;", "mContext", "Landroid/content/Context;", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "mDisableExternalChat", "", "bindOthers", "", "position", "", "holder", "Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindTag", "checkDisable", "disableExternalChat", "onDisableClickHandler", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.g */
public final class ChatBinder extends CommonBinder<SearchChatInfo> {

    /* renamed from: a */
    private boolean f133630a;

    /* renamed from: b */
    private final Context f133631b;

    /* renamed from: d */
    private final SearchResultViewAdapter.IOnItemClickHandler f133632d;

    @Override // com.ss.android.lark.searchcommon.view.binder.CommonBinder
    public void bk_() {
        LKUIToast.show(this.f133631b, (int) R.string.Lark_Chat_AddExternalMembersAlertTitle);
    }

    /* renamed from: a */
    public boolean mo184823b(SearchChatInfo searchChatInfo) {
        Intrinsics.checkParameterIsNotNull(searchChatInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!this.f133630a || !mo184837c(searchChatInfo)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatBinder(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        super(context, bVar);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133631b = context;
        this.f133632d = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo184807b(int r7, com.ss.android.lark.searchcommon.view.ChatterChatViewHolder r8, com.ss.android.lark.searchcommon.dto.info.SearchChatInfo r9) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.searchcommon.view.binder.ChatBinder.mo184807b(int, com.ss.android.lark.searchcommon.view.a, com.ss.android.lark.searchcommon.dto.info.SearchChatInfo):void");
    }

    /* renamed from: b */
    public void mo184804a(int i, ChatterChatViewHolder aVar, SearchChatInfo searchChatInfo) {
        String str;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchChatInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (searchChatInfo.getChatType() == Chat.Type.P2P || searchChatInfo.getChatType() == Chat.Type.THREAD_DETAIL) {
            aVar.mo184645a().getItem().mo184671a(new TitleTailModel(null, 0, 3, null));
        } else {
            int userCount = searchChatInfo.getUserCount();
            if (userCount <= 0) {
                userCount = searchChatInfo.getMemberCount();
            }
            if (userCount > 0) {
                str = SearchCommonUtils.m209230b(userCount);
            } else {
                str = "";
            }
            if (searchChatInfo.isCountLightStyle()) {
                aVar.mo184645a().getItem().mo184671a(new TitleTailModel(str, R.color.text_placeholder));
            } else {
                aVar.mo184645a().getItem().mo184671a(new TitleTailModel(str, R.color.text_title));
            }
        }
        if (!searchChatInfo.isMember()) {
            TextView textView = new TextView(this.f133631b);
            textView.setTextSize(14.0f);
            textView.setTextColor(this.f133631b.getResources().getColor(R.color.text_placeholder));
            textView.setText(R.string.Lark_Search_UnjoinedPublicGroup);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            textView.setGravity(17);
            aVar.mo184645a().getItem().mo184659a((View) textView);
        }
    }
}
