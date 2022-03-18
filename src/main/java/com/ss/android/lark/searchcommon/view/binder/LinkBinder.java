package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchLinkInfo;
import com.ss.android.lark.searchcommon.view.SearchLinkViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.C57851l;
import com.ss.android.lark.utils.UIHelper;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\rH\u0002J\"\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\rH\u0002J\"\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\rH\u0002J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/LinkBinder;", "", "mContext", "Landroid/content/Context;", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "linkViewInChat", "com/ss/android/lark/searchcommon/view/binder/LinkBinder$linkViewInChat$1", "Lcom/ss/android/lark/searchcommon/view/binder/LinkBinder$linkViewInChat$1;", "bind", "", "position", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchLinkInfo;", "holder", "Lcom/ss/android/lark/searchcommon/view/SearchLinkViewHolder;", "setMessageSendInfo", "setMessageUrlAvatar", "setMessageUrlContent", "highColor", "setMessageUrlDetail", "setMessageUrlName", "setSelectedStatus", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.q */
public final class LinkBinder {

    /* renamed from: a */
    public final C53997c f133664a = new C53997c();

    /* renamed from: b */
    public final Context f133665b;

    /* renamed from: c */
    public final SearchResultViewAdapter.IOnItemClickHandler f133666c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/searchcommon/view/binder/LinkBinder$linkViewInChat$1", "Lcom/ss/android/lark/searchcommon/view/binder/ViewInChatClickListener;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchLinkInfo;", "getChatId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getChatPosition", "", "getThreadId", "getThreadPosition", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.q$c */
    public static final class C53997c extends ViewInChatClickListener<SearchLinkInfo> {
        C53997c() {
        }

        /* renamed from: a */
        public String mo184771a(SearchLinkInfo searchLinkInfo) {
            Intrinsics.checkParameterIsNotNull(searchLinkInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return searchLinkInfo.getThreadId();
        }

        /* renamed from: b */
        public String mo184773b(SearchLinkInfo searchLinkInfo) {
            Intrinsics.checkParameterIsNotNull(searchLinkInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return searchLinkInfo.getChatId();
        }

        /* renamed from: c */
        public int mo184774c(SearchLinkInfo searchLinkInfo) {
            Intrinsics.checkParameterIsNotNull(searchLinkInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return searchLinkInfo.getThreadPosition();
        }

        /* renamed from: d */
        public int mo184775d(SearchLinkInfo searchLinkInfo) {
            Intrinsics.checkParameterIsNotNull(searchLinkInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return searchLinkInfo.getPosition();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.q$a */
    public static final class View$OnClickListenerC53995a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkBinder f133667a;

        /* renamed from: b */
        final /* synthetic */ SearchLinkInfo f133668b;

        /* renamed from: c */
        final /* synthetic */ int f133669c;

        View$OnClickListenerC53995a(LinkBinder qVar, SearchLinkInfo searchLinkInfo, int i) {
            this.f133667a = qVar;
            this.f133668b = searchLinkInfo;
            this.f133669c = i;
        }

        public final void onClick(View view) {
            this.f133667a.f133666c.mo182499a(this.f133668b, true, this.f133669c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.q$b */
    public static final class View$OnClickListenerC53996b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkBinder f133670a;

        /* renamed from: b */
        final /* synthetic */ SearchLinkInfo f133671b;

        /* renamed from: c */
        final /* synthetic */ int f133672c;

        View$OnClickListenerC53996b(LinkBinder qVar, SearchLinkInfo searchLinkInfo, int i) {
            this.f133670a = qVar;
            this.f133671b = searchLinkInfo;
            this.f133672c = i;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f133670a.f133665b);
            this.f133670a.f133664a.mo184772a(this.f133671b, this.f133672c);
        }
    }

    public LinkBinder(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133665b = context;
        this.f133666c = bVar;
    }

    /* renamed from: a */
    private final void m209573a(SearchLinkViewHolder fVar, SearchLinkInfo searchLinkInfo) {
        if (TextUtils.isEmpty(searchLinkInfo.getImageUrl())) {
            fVar.mo184890a().setImageResource(R.drawable.ic_link_default);
        } else {
            SearchCommonModuleDependency.m208732b().mo102892a(this.f133665b, searchLinkInfo.getImageUrl(), fVar.mo184890a(), null, UIHelper.getDrawable(R.drawable.ic_link_default), 48, 48);
        }
    }

    /* renamed from: c */
    private final void m209577c(SearchLinkViewHolder fVar, SearchLinkInfo searchLinkInfo) {
        int i;
        if (searchLinkInfo.isSelected()) {
            i = UIHelper.getColor(R.color.bg_body);
        } else {
            i = UIHelper.getColor(R.color.text_link_hover);
        }
        m209574a(fVar, searchLinkInfo, i);
        m209576b(fVar, searchLinkInfo, i);
        m209578c(fVar, searchLinkInfo, i);
        m209575b(fVar, searchLinkInfo);
    }

    /* renamed from: b */
    private final void m209575b(SearchLinkViewHolder fVar, SearchLinkInfo searchLinkInfo) {
        String a = C57851l.m224546a(this.f133665b, new Date(searchLinkInfo.getCreateTime() * ((long) 1000)), SearchCommonModuleDependency.m208732b().mo102914e(), true);
        String fromName = searchLinkInfo.getFromName();
        if (fromName == null) {
            fromName = "";
        }
        fVar.mo184895f().setText(fromName + ' ' + UIHelper.getString(R.string.Lark_Legacy_PinPostAt) + ' ' + a);
    }

    /* renamed from: b */
    private final void m209576b(SearchLinkViewHolder fVar, SearchLinkInfo searchLinkInfo, int i) {
        if (searchLinkInfo.getTitleHitTerms() == null || searchLinkInfo.getTitleHitTerms().isEmpty()) {
            fVar.mo184894e().setVisibility(8);
            return;
        }
        fVar.mo184894e().setVisibility(0);
        fVar.mo184894e().setText(C57782ag.m224235a(searchLinkInfo.getOriginalUrl(), searchLinkInfo.getTitleHitTerms(), i));
    }

    /* renamed from: a */
    private final void m209574a(SearchLinkViewHolder fVar, SearchLinkInfo searchLinkInfo, int i) {
        String str;
        if (!TextUtils.isEmpty(searchLinkInfo.getTitle())) {
            str = searchLinkInfo.getTitle();
        } else {
            str = searchLinkInfo.getOriginalUrl();
        }
        fVar.mo184891b().setText(C57782ag.m224235a(str, searchLinkInfo.getTitleHitTerms(), i));
    }

    /* renamed from: c */
    private final void m209578c(SearchLinkViewHolder fVar, SearchLinkInfo searchLinkInfo, int i) {
        String subTitle = searchLinkInfo.getSubTitle();
        Intrinsics.checkExpressionValueIsNotNull(subTitle, "data.subTitle");
        String str = subTitle;
        if (!TextUtils.isEmpty(str)) {
            fVar.mo184892c().setVisibility(0);
            fVar.mo184893d().setText(C57782ag.m224235a(str, searchLinkInfo.getSubTitleHitTerms(), i));
            return;
        }
        fVar.mo184892c().setVisibility(8);
    }

    /* renamed from: a */
    public final void mo184857a(int i, SearchLinkInfo searchLinkInfo, SearchLinkViewHolder fVar) {
        Intrinsics.checkParameterIsNotNull(searchLinkInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(fVar, "holder");
        m209573a(fVar, searchLinkInfo);
        m209577c(fVar, searchLinkInfo);
        fVar.mo184897h().setOnClickListener(new View$OnClickListenerC53995a(this, searchLinkInfo, i));
        fVar.mo184896g().setOnClickListener(new View$OnClickListenerC53996b(this, searchLinkInfo, i));
    }
}
