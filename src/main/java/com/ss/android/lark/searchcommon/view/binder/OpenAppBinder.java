package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.ui.tag.v2.ITagEditor;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.dto.OpenAppState;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/OpenAppBinder;", "Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenAppInfo;", "mContext", "Landroid/content/Context;", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "bindTag", "", "position", "", "holder", "Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getTagRes", "state", "Lcom/ss/android/lark/searchcommon/dto/OpenAppState;", "hasOpenAppAbility", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.v */
public class OpenAppBinder extends CommonBinder<SearchOpenAppInfo> {

    /* renamed from: a */
    private final Context f133686a;

    /* renamed from: b */
    private final SearchResultViewAdapter.IOnItemClickHandler f133687b;

    /* renamed from: a */
    private final int m209614a(OpenAppState openAppState) {
        switch (C54001w.f133688a[openAppState.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return R.string.Lark_Legacy_DeactivatedLabel;
            case 6:
                return R.string.Lark_Search_AppRemove;
            case 7:
                return R.string.Lark_Search_AppDelete;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m209615a(com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo r4) {
        /*
            r3 = this;
            java.util.List r4 = r4.getAbilities()
            java.util.Iterator r4 = r4.iterator()
        L_0x0008:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r4.next()
            com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo$SearchOpenAppAbility r0 = (com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo.SearchOpenAppAbility) r0
            java.lang.String r1 = "ability"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r1 = r0.getType()
            r2 = 2
            if (r1 == r2) goto L_0x0027
            int r0 = r0.getType()
            r1 = 3
            if (r0 != r1) goto L_0x0008
        L_0x0027:
            r4 = 1
            return r4
        L_0x0029:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.searchcommon.view.binder.OpenAppBinder.m209615a(com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenAppBinder(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        super(context, bVar);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133686a = context;
        this.f133687b = bVar;
    }

    /* renamed from: a */
    public void mo184807b(int i, ChatterChatViewHolder aVar, SearchOpenAppInfo searchOpenAppInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchOpenAppInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        LarkNameTag.AppTagBuilder aVar2 = new LarkNameTag.AppTagBuilder(this.f133686a);
        if (searchOpenAppInfo.getAppState() != OpenAppState.USABLE) {
            TextTag.Companion bVar = TextTag.f62987a;
            TextTag.Builder aVar3 = new TextTag.Builder();
            aVar3.mo90139b(0);
            OpenAppState appState = searchOpenAppInfo.getAppState();
            Intrinsics.checkExpressionValueIsNotNull(appState, "data.appState");
            aVar3.mo90143c(m209614a(appState));
            aVar3.mo90145d(R.color.lkui_N00);
            aVar3.mo90147e(R.color.lkui_N500);
            LarkNameTag.Builder bVar2 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) aVar2, aVar3.mo90154l(), false, 2, (Object) null);
        } else if (!searchOpenAppInfo.isAvailable()) {
            aVar2.mo90010a(true);
            if (!TextUtils.isEmpty(searchOpenAppInfo.getAppStoreUrl())) {
                TextTag.Companion bVar3 = TextTag.f62987a;
                TextTag.Builder aVar4 = new TextTag.Builder();
                aVar4.mo90139b(101);
                aVar4.mo90143c(R.string.Lark_Search_AppNotInstalled);
                aVar4.mo90145d(R.color.udtoken_tag_text_s_turquoise);
                aVar4.mo90147e(R.color.udtoken_tag_bg_turquoise);
                LarkNameTag.Builder bVar4 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) aVar2, aVar4.mo90154l(), false, 2, (Object) null);
            }
        } else if (m209615a(searchOpenAppInfo)) {
            aVar2.mo90010a(true);
        } else {
            aVar2.mo90011b(true);
        }
        aVar.mo184645a().getItem().setTag(aVar2);
    }
}
