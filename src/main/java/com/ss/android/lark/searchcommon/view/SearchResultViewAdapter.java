package com.ss.android.lark.searchcommon.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchCalendarEventInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchCustomizationInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchDepartmentInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchFeedbackInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchFileInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchLinkInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMoreInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchQACardInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSecretP2PChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchServiceCardInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchWikiInfo;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.searchcommon.view.binder.BinderRepo;
import com.ss.android.lark.searchcommon.view.binder.CalendarEventBinder;
import com.ss.android.lark.searchcommon.view.binder.ChatBinder;
import com.ss.android.lark.searchcommon.view.binder.DepartmentBinder;
import com.ss.android.lark.searchcommon.view.binder.HelpDeskBinder;
import com.ss.android.lark.searchcommon.view.binder.ICustomBinder;
import com.ss.android.lark.searchcommon.view.binder.IOnProfileClickListener;
import com.ss.android.lark.searchcommon.view.binder.LinkBinder;
import com.ss.android.lark.searchcommon.view.binder.MailContactBinder;
import com.ss.android.lark.searchcommon.view.binder.OpenAppBinder;
import com.ss.android.lark.searchcommon.view.binder.OpenSearchBinder;
import com.ss.android.lark.searchcommon.view.binder.PlaceholderBinder;
import com.ss.android.lark.searchcommon.view.binder.SearchFeedbackBinder;
import com.ss.android.lark.searchcommon.view.binder.SearchMoreBinder;
import com.ss.android.lark.searchcommon.view.binder.ThreadBinder;
import com.ss.android.lark.searchcommon.view.feedback.SearchFeedbackViewHolder;
import com.ss.android.lark.searchcommon.view.general.LynxCardViewHolder;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003,-.B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018H\u0016J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\fJ\u0010\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010&J\u000e\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter;", "Lcom/ss/android/lark/searchcommon/view/SearchRecyclerViewBaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "context", "Landroid/content/Context;", "onItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "mBinderRepo", "Lcom/ss/android/lark/searchcommon/view/binder/BinderRepo;", "mCustomBinder", "Lcom/ss/android/lark/searchcommon/view/binder/ICustomBinder;", "mOnItemOnScreenListener", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;", "getMOnItemOnScreenListener", "()Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;", "setMOnItemOnScreenListener", "(Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;)V", "disableExternalChatter", "", "", "getItem", "position", "", "getItemViewType", "getTopNRptId", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCustomBinder", "customBinder", "setOnBusinessConsumeItem", "onBusinessConsumeItem", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "setProfileClickListener", "listener", "Lcom/ss/android/lark/searchcommon/view/binder/IOnProfileClickListener;", "switchMultiple", "isMultiple", "EmptyViewHolder", "IOnItemClickHandler", "IOnItemOnScreenListener", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.j */
public final class SearchResultViewAdapter extends SearchRecyclerViewBaseAdapter<RecyclerView.ViewHolder, SearchBaseInfo> {

    /* renamed from: a */
    private final BinderRepo f133800a;

    /* renamed from: c */
    private IOnItemOnScreenListener f133801c;

    /* renamed from: d */
    private ICustomBinder f133802d;

    /* renamed from: e */
    private final Context f133803e;

    /* renamed from: f */
    private final IOnItemClickHandler f133804f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "", "onItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "", "position", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.j$b */
    public interface IOnItemClickHandler {
        /* renamed from: a */
        void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;", "", "hasScrolled", "", "onScreen", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "position", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.j$c */
    public interface IOnItemOnScreenListener {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.searchcommon.view.j$c$a */
        public static final class C54037a {
            /* renamed from: a */
            public static void m209709a(IOnItemOnScreenListener cVar) {
            }
        }

        /* renamed from: a */
        void mo183169a();

        /* renamed from: a */
        void mo183170a(SearchBaseInfo searchBaseInfo, int i);
    }

    /* renamed from: a */
    public final IOnItemOnScreenListener mo184981a() {
        return this.f133801c;
    }

    /* renamed from: a */
    public final void mo184982a(SearchResultView.IOnBusinessConsumeItem cVar) {
        this.f133800a.mo184778a(cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$EmptyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.j$a */
    public static final class EmptyViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EmptyViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "v");
        }
    }

    /* renamed from: a */
    public SearchBaseInfo getItem(int i) {
        SearchBaseInfo searchBaseInfo = (SearchBaseInfo) super.getItem(i);
        if (searchBaseInfo != null) {
            return searchBaseInfo;
        }
        return new SearchBaseInfo();
    }

    /* renamed from: b */
    public final void mo184987b(boolean z) {
        this.f133800a.mo184782b(z);
        notifyDataSetChanged();
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchRecyclerViewBaseAdapter
    /* renamed from: c */
    public String mo159265c(int i) {
        return getItem(i).getId();
    }

    /* renamed from: a */
    public final void mo184983a(ICustomBinder nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "customBinder");
        this.f133802d = nVar;
    }

    /* renamed from: a */
    public final void mo184984a(IOnProfileClickListener oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "listener");
        this.f133800a.mo184779a(oVar);
    }

    /* renamed from: a */
    public final void mo184985a(IOnItemOnScreenListener cVar) {
        this.f133801c = cVar;
    }

    /* renamed from: a */
    public final void mo184986a(boolean z) {
        this.f133800a.mo184780a(z);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        SearchBaseInfo a = getItem(i);
        if ((a instanceof SearchChatterInfo) || (a instanceof SearchSecretP2PChatInfo)) {
            return 0;
        }
        if (a instanceof SearchChatInfo) {
            return 1;
        }
        if ((a instanceof SearchMessageInfo) || (a instanceof SearchFileInfo)) {
            return 5;
        }
        if ((a instanceof SearchSpaceInfo) || (a instanceof SearchWikiInfo)) {
            return 6;
        }
        if (a instanceof SearchThreadInfo) {
            return 7;
        }
        if (a instanceof SearchCalendarEventInfo) {
            return 8;
        }
        if (a instanceof SearchOpenAppInfo) {
            return 10;
        }
        if (a instanceof SearchHelpDeskInfo) {
            return 9;
        }
        if (a instanceof SearchLinkInfo) {
            return 13;
        }
        if (a instanceof SearchDepartmentInfo) {
            return 2;
        }
        if (a instanceof SearchOpenSearchInfo) {
            return 15;
        }
        if (a instanceof SearchFeedbackInfo) {
            return 16;
        }
        if (a instanceof SearchServiceCardInfo) {
            return 17;
        }
        if (a instanceof SearchQACardInfo) {
            return 18;
        }
        if (a instanceof SearchCustomizationInfo) {
            return 19;
        }
        if (a instanceof SearchMailContactInfo) {
            return 29;
        }
        if (a instanceof SearchMoreInfo) {
            return 3;
        }
        if (a instanceof SearchPlaceholderInfo) {
            int i2 = C54038k.f133805a[((SearchPlaceholderInfo) a).getPlaceholderType().ordinal()];
            if (i2 == 1) {
                return 21;
            }
            if (i2 == 2) {
                return 22;
            }
            if (i2 == 3) {
                return 23;
            }
            if (i2 == 4) {
                return 24;
            }
            ICustomBinder nVar = this.f133802d;
            if (nVar != null) {
                return nVar.mo184845a(i);
            }
        } else {
            ICustomBinder nVar2 = this.f133802d;
            if (nVar2 != null) {
                return nVar2.mo184845a(i);
            }
        }
        return 4;
    }

    public SearchResultViewAdapter(Context context, IOnItemClickHandler bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "onItemClickHandler");
        this.f133803e = context;
        this.f133804f = bVar;
        this.f133800a = new BinderRepo(context, bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder a;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 15:
            case 29:
                AvatarItemViewWithMask avatarItemViewWithMask = new AvatarItemViewWithMask(this.f133803e, null, 0, 6, null);
                avatarItemViewWithMask.mo184574a(false);
                return new ChatterChatViewHolder(avatarItemViewWithMask, i);
            case 3:
                View inflate = LayoutInflater.from(this.f133803e).inflate(R.layout.item_search_header, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…ch_header, parent, false)");
                return new SearchShowMoreViewHolder(inflate);
            case 11:
            case HwBuildEx.VersionCodes.EMUI_5_1:
            case 14:
            case 20:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
            case 26:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
            default:
                ICustomBinder nVar = this.f133802d;
                if (nVar == null || (a = nVar.mo184846a(viewGroup, i)) == null) {
                    return new EmptyViewHolder(new View(this.f133803e));
                }
                return a;
            case 13:
                View inflate2 = LayoutInflater.from(this.f133803e).inflate(R.layout.item_search_link, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(cont…arch_link, parent, false)");
                return new SearchLinkViewHolder(inflate2);
            case 16:
                View inflate3 = LayoutInflater.from(this.f133803e).inflate(R.layout.item_search_feedback_layout, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate3, "LayoutInflater.from(cont…ck_layout, parent, false)");
                return new SearchFeedbackViewHolder(inflate3);
            case 17:
                SearchFrameLayout searchFrameLayout = new SearchFrameLayout(this.f133803e);
                searchFrameLayout.setBackgroundColor(searchFrameLayout.getResources().getColor(R.color.bg_body));
                searchFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new LynxCardViewHolder(searchFrameLayout);
            case 18:
                SearchFrameLayout searchFrameLayout2 = new SearchFrameLayout(this.f133803e);
                searchFrameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new LynxCardViewHolder(searchFrameLayout2);
            case 19:
                SearchFrameLayout searchFrameLayout3 = new SearchFrameLayout(this.f133803e);
                searchFrameLayout3.setBackgroundColor(searchFrameLayout3.getResources().getColor(R.color.bg_body));
                searchFrameLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new LynxCardViewHolder(searchFrameLayout3);
            case 21:
                View inflate4 = LayoutInflater.from(this.f133803e).inflate(R.layout.item_card_header, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate4, "LayoutInflater.from(cont…rd_header, parent, false)");
                return new SearchPlaceholderViewHolder(inflate4, i);
            case 22:
                View inflate5 = LayoutInflater.from(this.f133803e).inflate(R.layout.item_card_footer, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate5, "LayoutInflater.from(cont…rd_footer, parent, false)");
                return new SearchPlaceholderViewHolder(inflate5, i);
            case 23:
                View inflate6 = LayoutInflater.from(this.f133803e).inflate(R.layout.item_divider_8dp, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate6, "LayoutInflater.from(cont…vider_8dp, parent, false)");
                return new SearchPlaceholderViewHolder(inflate6, i);
            case 24:
                View inflate7 = LayoutInflater.from(this.f133803e).inflate(R.layout.item_divider_8dp, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate7, "LayoutInflater.from(cont…vider_8dp, parent, false)");
                return new SearchPlaceholderViewHolder(inflate7, i);
        }
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchRecyclerViewBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SearchChatterInfo searchChatterInfo;
        SearchMessageInfo searchMessageInfo;
        IOnItemOnScreenListener cVar;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        super.onBindViewHolder(viewHolder, i);
        SearchBaseInfo a = getItem(i);
        if (!(a instanceof SearchPlaceholderInfo) && !(a instanceof SearchMoreInfo) && (cVar = this.f133801c) != null) {
            cVar.mo183170a(a, i);
        }
        if (viewHolder instanceof ChatterChatViewHolder) {
            ChatterChatViewHolder aVar = (ChatterChatViewHolder) viewHolder;
            aVar.mo184645a().getItem().mo184687f();
            int b = aVar.mo184646b();
            if (b == 0) {
                if (a instanceof SearchSecretP2PChatInfo) {
                    searchChatterInfo = new SearchChatterInfo();
                    SearchSecretP2PChatInfo searchSecretP2PChatInfo = (SearchSecretP2PChatInfo) a;
                    searchChatterInfo.setChatterType(searchSecretP2PChatInfo.getChatterType());
                    searchChatterInfo.setChatterDescription(searchSecretP2PChatInfo.getChatterDescription());
                    searchChatterInfo.setTenantId(searchSecretP2PChatInfo.getTenantId());
                    searchChatterInfo.setRegistered(searchSecretP2PChatInfo.isRegistered());
                    searchChatterInfo.setRemind(searchSecretP2PChatInfo.isRemind());
                    searchChatterInfo.setP2pChatId(searchSecretP2PChatInfo.getId());
                    searchChatterInfo.setP2pCryptoChat(true);
                    searchChatterInfo.setCryptoChatterId(searchSecretP2PChatInfo.getChatterId());
                    searchChatterInfo.setId(searchSecretP2PChatInfo.getId());
                    searchChatterInfo.setAvatarKey(searchSecretP2PChatInfo.getAvatarKey());
                    searchChatterInfo.setTitle(searchSecretP2PChatInfo.getTitle());
                    searchChatterInfo.setTitleHitTerms(searchSecretP2PChatInfo.getTitleHitTerms());
                    searchChatterInfo.setSubTitle(searchSecretP2PChatInfo.getSubTitle());
                    searchChatterInfo.setSubTitleHitTerms(searchSecretP2PChatInfo.getSubTitleHitTerms());
                    searchChatterInfo.setExtraTitle(searchSecretP2PChatInfo.getExtraTitle());
                    searchChatterInfo.setExtraTitleHitTerms(searchSecretP2PChatInfo.getExtraTitleHitTerms());
                } else if (a != null) {
                    searchChatterInfo = (SearchChatterInfo) a;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo");
                }
                this.f133800a.mo184777a().mo184835a(i, searchChatterInfo, aVar);
            } else if (b == 1) {
                ChatBinder b2 = this.f133800a.mo184781b();
                if (a != null) {
                    b2.mo184835a(i, (SearchChatInfo) a, aVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchChatInfo");
            } else if (b == 2) {
                DepartmentBinder d = this.f133800a.mo184784d();
                if (a != null) {
                    d.mo184835a(i, (SearchDepartmentInfo) a, aVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchDepartmentInfo");
            } else if (b == 15) {
                OpenSearchBinder q = this.f133800a.mo184797q();
                if (a != null) {
                    q.mo184835a(i, (SearchOpenSearchInfo) a, aVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo");
            } else if (b != 29) {
                switch (b) {
                    case 4:
                        this.f133800a.mo184788h().mo184835a(i, a, aVar);
                        return;
                    case 5:
                        if (a instanceof SearchFileInfo) {
                            searchMessageInfo = new SearchMessageInfo();
                            SearchFileInfo searchFileInfo = (SearchFileInfo) a;
                            searchMessageInfo.setMsgType(searchFileInfo.getMsgType());
                            searchMessageInfo.setUpdateTime(searchFileInfo.getUpdateTime());
                            searchMessageInfo.setPosition(searchFileInfo.getPosition());
                            searchMessageInfo.setChatId(searchFileInfo.getChatId());
                            searchMessageInfo.setFromId(searchFileInfo.getFromId());
                            searchMessageInfo.setFileContent(searchFileInfo.getFileContent());
                            searchMessageInfo.setThreadId(searchFileInfo.getThreadId());
                            searchMessageInfo.setMessageThreadPosition(searchFileInfo.getThreadPosition());
                            searchMessageInfo.setId(searchFileInfo.getId());
                            searchMessageInfo.setAvatarKey(searchFileInfo.getAvatarKey());
                            searchMessageInfo.setTitle(searchFileInfo.getTitle());
                            searchMessageInfo.setTitleHitTerms(searchFileInfo.getTitleHitTerms());
                            searchMessageInfo.setSubTitle(searchFileInfo.getSubTitle());
                            searchMessageInfo.setSubTitleHitTerms(searchFileInfo.getSubTitleHitTerms());
                            searchMessageInfo.setExtraTitle(searchFileInfo.getExtraTitle());
                            searchMessageInfo.setExtraTitleHitTerms(searchFileInfo.getExtraTitleHitTerms());
                            searchMessageInfo.setChatInsideShow(searchFileInfo.isChatInsideShow());
                            if (searchFileInfo.isChatInsideShow()) {
                                searchMessageInfo.setBinderByFile(true);
                            }
                            searchMessageInfo.setP2pChat(searchFileInfo.isP2pChat());
                            searchMessageInfo.setP2pChatterId(searchFileInfo.getP2pChatterId());
                        } else if (a != null) {
                            searchMessageInfo = (SearchMessageInfo) a;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo");
                        }
                        this.f133800a.mo184783c().mo184835a(i, searchMessageInfo, aVar);
                        return;
                    case 6:
                        this.f133800a.mo184785e().mo184835a(i, a, aVar);
                        return;
                    case 7:
                        ThreadBinder f = this.f133800a.mo184786f();
                        if (a != null) {
                            f.mo184835a(i, (SearchThreadInfo) a, aVar);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo");
                    case 8:
                        CalendarEventBinder g = this.f133800a.mo184787g();
                        if (a != null) {
                            g.mo184835a(i, (SearchCalendarEventInfo) a, aVar);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchCalendarEventInfo");
                    case 9:
                        HelpDeskBinder k = this.f133800a.mo184791k();
                        if (a != null) {
                            k.mo184835a(i, (SearchHelpDeskInfo) a, aVar);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo");
                    case 10:
                        OpenAppBinder l = this.f133800a.mo184792l();
                        if (a != null) {
                            l.mo184835a(i, (SearchOpenAppInfo) a, aVar);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo");
                    default:
                        return;
                }
            } else {
                MailContactBinder v = this.f133800a.mo184802v();
                if (a != null) {
                    v.mo184835a(i, (SearchMailContactInfo) a, aVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo");
            }
        } else if (viewHolder instanceof SearchLinkViewHolder) {
            LinkBinder o = this.f133800a.mo184795o();
            if (a != null) {
                o.mo184857a(i, (SearchLinkInfo) a, (SearchLinkViewHolder) viewHolder);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchLinkInfo");
        } else if (viewHolder instanceof SearchFeedbackViewHolder) {
            SearchFeedbackBinder r = this.f133800a.mo184798r();
            if (a != null) {
                r.mo184766a(i, (SearchFeedbackInfo) a, (SearchFeedbackViewHolder) viewHolder);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchFeedbackInfo");
        } else if (viewHolder instanceof LynxCardViewHolder) {
            this.f133800a.mo184799s().mo184864a(i, a, (LynxCardViewHolder) viewHolder);
        } else if (viewHolder instanceof SearchShowMoreViewHolder) {
            SearchMoreBinder j = this.f133800a.mo184790j();
            if (a != null) {
                j.mo184767a(i, (SearchMoreInfo) a, (SearchShowMoreViewHolder) viewHolder);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchMoreInfo");
        } else if (viewHolder instanceof SearchPlaceholderViewHolder) {
            PlaceholderBinder u = this.f133800a.mo184801u();
            if (a != null) {
                PlaceholderBinder.m209625a(u, i, (SearchPlaceholderInfo) a, (SearchPlaceholderViewHolder) viewHolder, null, null, 24, null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo");
        } else {
            ICustomBinder nVar = this.f133802d;
            if (nVar != null) {
                nVar.mo184847a(viewHolder, a, i);
            } else {
                this.f133800a.mo184789i().mo184838a(i, a, viewHolder);
            }
        }
    }
}
