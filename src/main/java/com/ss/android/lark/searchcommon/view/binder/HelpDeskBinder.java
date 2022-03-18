package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.avataritem.summary.SummaryModel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/HelpDeskBinder;", "Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchHelpDeskInfo;", "mContext", "Landroid/content/Context;", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "bindSummary", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "holder", "Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", "bindTag", "position", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.l */
public class HelpDeskBinder extends CommonBinder<SearchHelpDeskInfo> {

    /* renamed from: a */
    private final Context f133645a;

    /* renamed from: b */
    private final SearchResultViewAdapter.IOnItemClickHandler f133646b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HelpDeskBinder(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        super(context, bVar);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133645a = context;
        this.f133646b = bVar;
    }

    /* renamed from: a */
    public void mo184805a(SearchHelpDeskInfo searchHelpDeskInfo, ChatterChatViewHolder aVar) {
        Intrinsics.checkParameterIsNotNull(searchHelpDeskInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        String faqTitle = searchHelpDeskInfo.getFaqTitle();
        Intrinsics.checkExpressionValueIsNotNull(faqTitle, "data.faqTitle");
        SummaryModel aVar2 = new SummaryModel(!StringsKt.isBlank(faqTitle));
        aVar2.mo184725a(this.f133645a.getString(R.string.Lark_Search_QuickLink) + ": " + searchHelpDeskInfo.getFaqTitle());
        aVar2.mo184726a(CollectionsKt.mutableListOf(searchHelpDeskInfo.getFaqTitle()));
        aVar.mo184645a().getItem().mo184669a(aVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo184807b(int r4, com.ss.android.lark.searchcommon.view.ChatterChatViewHolder r5, com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo r6) {
        /*
            r3 = this;
            java.lang.String r4 = "holder"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r4)
            java.lang.String r4 = "data"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r4)
            com.larksuite.component.ui.tag.d$d r4 = new com.larksuite.component.ui.tag.d$d
            android.content.Context r0 = r3.f133645a
            r4.<init>(r0)
            java.util.List r0 = r6.getTags()
            boolean r6 = r6.isOfficialOnCall()
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L_0x002c
            if (r0 == 0) goto L_0x0026
            com.bytedance.lark.pb.basic.v1.Tag r6 = com.bytedance.lark.pb.basic.v1.Tag.OFFICIAL
            boolean r6 = r0.contains(r6)
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            if (r6 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r6 = 0
            goto L_0x002d
        L_0x002c:
            r6 = 1
        L_0x002d:
            r4.mo90033b(r6)
            if (r0 == 0) goto L_0x0038
            com.bytedance.lark.pb.basic.v1.Tag r6 = com.bytedance.lark.pb.basic.v1.Tag.ONCALL_OFFLINE
            boolean r2 = r0.contains(r6)
        L_0x0038:
            r4.mo90032a(r1, r2)
            com.ss.android.lark.searchcommon.view.AvatarItemViewWithMask r5 = r5.mo184645a()
            com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView r5 = r5.getItem()
            com.larksuite.component.ui.tag.d$b r4 = (com.larksuite.component.ui.tag.LarkNameTag.Builder) r4
            r5.setTag(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.searchcommon.view.binder.HelpDeskBinder.mo184807b(int, com.ss.android.lark.searchcommon.view.a, com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo):void");
    }
}
