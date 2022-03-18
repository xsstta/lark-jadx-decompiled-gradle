package com.ss.android.lark.searchcommon.view.recommend;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.search.slash.v1.SlashCommandMeta;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.ui.p1198b.AbstractC26197e;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.dto.info.SearchActionRecommendInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchCardInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchHistoryListInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchWikiInfo;
import com.ss.android.lark.searchcommon.view.AvatarItemViewWithMask;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchCardViewHolder;
import com.ss.android.lark.searchcommon.view.SearchHistoryViewHolder;
import com.ss.android.lark.searchcommon.view.SearchOpenSearchFilterViewHolder;
import com.ss.android.lark.searchcommon.view.SearchPlaceholderViewHolder;
import com.ss.android.lark.searchcommon.view.SearchRecyclerViewBaseAdapter;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.binder.ActionRecommendBinder;
import com.ss.android.lark.searchcommon.view.binder.BinderRepo;
import com.ss.android.lark.searchcommon.view.binder.CCMBinder;
import com.ss.android.lark.searchcommon.view.binder.CardBinder;
import com.ss.android.lark.searchcommon.view.binder.ChatBinder;
import com.ss.android.lark.searchcommon.view.binder.ChatterBinder;
import com.ss.android.lark.searchcommon.view.binder.EmptyBinder;
import com.ss.android.lark.searchcommon.view.binder.HelpDeskBinder;
import com.ss.android.lark.searchcommon.view.binder.HistoryBinder;
import com.ss.android.lark.searchcommon.view.binder.IOnProfileClickListener;
import com.ss.android.lark.searchcommon.view.binder.MailContactBinder;
import com.ss.android.lark.searchcommon.view.binder.MessageBinder;
import com.ss.android.lark.searchcommon.view.binder.OnHistoryTagClickListener;
import com.ss.android.lark.searchcommon.view.binder.OpenAppBinder;
import com.ss.android.lark.searchcommon.view.binder.OpenSearchBinder;
import com.ss.android.lark.searchcommon.view.binder.OpenSearchFilterBinder;
import com.ss.android.lark.searchcommon.view.binder.PlaceholderBinder;
import com.ss.android.lark.searchcommon.view.binder.ThreadBinder;
import com.ss.android.lark.searchcommon.view.foldtag.FoldTagFlowLayout;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002042\u0006\u00103\u001a\u000204H\u0016J\u0012\u00106\u001a\u0004\u0018\u0001072\u0006\u00103\u001a\u000204H\u0016J\u0006\u0010\u000b\u001a\u000208J\u0006\u0010\u001c\u001a\u000208J\u001a\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u00052\u0006\u00103\u001a\u000204H\u0016J\u0018\u0010;\u001a\u0002082\u0006\u0010:\u001a\u00020\u00022\u0006\u00103\u001a\u000204H\u0016J\u0012\u0010<\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0018\u0010?\u001a\u00020\u00022\u0006\u0010=\u001a\u00020>2\u0006\u0010@\u001a\u000204H\u0016J\u0006\u0010A\u001a\u000208J\u0010\u0010B\u001a\u0002082\b\u0010C\u001a\u0004\u0018\u00010DJ\u000e\u0010E\u001a\u0002082\u0006\u0010F\u001a\u00020GJ\u000e\u0010H\u001a\u0002082\u0006\u0010H\u001a\u00020\fJ\u000e\u0010I\u001a\u0002082\u0006\u0010J\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010,\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006K"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/recommend/RecommendViewAdapter;", "Lcom/ss/android/lark/searchcommon/view/SearchRecyclerViewBaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "Lcom/larksuite/framework/ui/stickyheader/StickyRecyclerHeadersAdapter;", "Lcom/ss/android/lark/searchcommon/view/recommend/RecommendHeaderViewHolder;", "context", "Landroid/content/Context;", "onItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "grayTitleColor", "", "mBinderRepo", "Lcom/ss/android/lark/searchcommon/view/binder/BinderRepo;", "mOnActionTagClickListener", "Lcom/ss/android/lark/searchcommon/view/binder/ActionRecommendBinder$OnActionTagClickListener;", "getMOnActionTagClickListener", "()Lcom/ss/android/lark/searchcommon/view/binder/ActionRecommendBinder$OnActionTagClickListener;", "setMOnActionTagClickListener", "(Lcom/ss/android/lark/searchcommon/view/binder/ActionRecommendBinder$OnActionTagClickListener;)V", "mOnHistoryTagClickListener", "Lcom/ss/android/lark/searchcommon/view/binder/OnHistoryTagClickListener;", "getMOnHistoryTagClickListener", "()Lcom/ss/android/lark/searchcommon/view/binder/OnHistoryTagClickListener;", "setMOnHistoryTagClickListener", "(Lcom/ss/android/lark/searchcommon/view/binder/OnHistoryTagClickListener;)V", "mShowDivider", "normalRoundHeader", "onClearHistory", "Lcom/ss/android/lark/searchcommon/view/recommend/IOnClearHistoryListener;", "onClearHistoryListener", "getOnClearHistoryListener", "()Lcom/ss/android/lark/searchcommon/view/recommend/IOnClearHistoryListener;", "setOnClearHistoryListener", "(Lcom/ss/android/lark/searchcommon/view/recommend/IOnClearHistoryListener;)V", "onItemOnScreenListener", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;", "getOnItemOnScreenListener", "()Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;", "setOnItemOnScreenListener", "(Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;)V", "onMoreClick", "Lcom/ss/android/lark/searchcommon/view/recommend/IOnMoreClickListener;", "onMoreClickListener", "getOnMoreClickListener", "()Lcom/ss/android/lark/searchcommon/view/recommend/IOnMoreClickListener;", "setOnMoreClickListener", "(Lcom/ss/android/lark/searchcommon/view/recommend/IOnMoreClickListener;)V", "getHeaderId", "", "position", "", "getItemViewType", "getTopNRptId", "", "", "onBindHeaderViewHolder", "holder", "onBindViewHolder", "onCreateHeaderViewHolder", "parent", "Landroid/view/ViewGroup;", "onCreateViewHolder", "viewType", "removeHistoryInfo", "setOnBusinessConsumeItem", "onBusinessConsumeItem", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "setProfileClickListener", "listener", "Lcom/ss/android/lark/searchcommon/view/binder/IOnProfileClickListener;", "showDivider", "switchMultiple", "isMultiple", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.recommend.d */
public final class RecommendViewAdapter extends SearchRecyclerViewBaseAdapter<RecyclerView.ViewHolder, SearchBaseInfo> implements AbstractC26197e<RecommendHeaderViewHolder> {

    /* renamed from: a */
    private final BinderRepo f133829a;

    /* renamed from: c */
    private IOnClearHistoryListener f133830c;

    /* renamed from: d */
    private IOnMoreClickListener f133831d;

    /* renamed from: e */
    private OnHistoryTagClickListener f133832e;

    /* renamed from: f */
    private ActionRecommendBinder.OnActionTagClickListener f133833f;

    /* renamed from: g */
    private SearchResultViewAdapter.IOnItemOnScreenListener f133834g;

    /* renamed from: h */
    private final IOnClearHistoryListener f133835h = new C54046a(this);

    /* renamed from: i */
    private final IOnMoreClickListener f133836i = new C54047b(this);

    /* renamed from: j */
    private boolean f133837j;

    /* renamed from: k */
    private boolean f133838k;

    /* renamed from: l */
    private boolean f133839l;

    /* renamed from: m */
    private final Context f133840m;

    /* renamed from: d */
    public final void mo185032d() {
        this.f133838k = true;
    }

    /* renamed from: e */
    public final void mo185033e() {
        this.f133839l = true;
    }

    /* renamed from: a */
    public final IOnClearHistoryListener mo185019a() {
        return this.f133830c;
    }

    /* renamed from: b */
    public final IOnMoreClickListener mo185029b() {
        return this.f133831d;
    }

    /* renamed from: a */
    public final void mo185026a(IOnMoreClickListener bVar) {
        this.f133831d = bVar;
    }

    /* renamed from: a */
    public void mo93178a(RecommendHeaderViewHolder cVar, int i) {
        View view;
        View view2;
        Drawable drawable;
        ImageView b;
        TextView a;
        TextView a2;
        TextView a3;
        SearchBaseInfo searchBaseInfo = (SearchBaseInfo) getItem(i);
        if (!(searchBaseInfo instanceof SearchActionRecommendInfo) && !(searchBaseInfo instanceof SearchHistoryListInfo) && !(searchBaseInfo instanceof SearchCardInfo) && !(searchBaseInfo instanceof SearchPlaceholderInfo)) {
            if (this.f133839l) {
                if (!(cVar == null || (a3 = cVar.mo185017a()) == null)) {
                    a3.setTextColor(C57582a.m223616d(this.f133840m, R.color.text_caption));
                }
            } else if (!(cVar == null || (a2 = cVar.mo185017a()) == null)) {
                a2.setTextColor(C57582a.m223616d(this.f133840m, R.color.text_title));
            }
            if (!(cVar == null || (a = cVar.mo185017a()) == null)) {
                Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo, "baseInfo");
                a.setText(searchBaseInfo.getHeaderLabel());
            }
            if (!(cVar == null || (b = cVar.mo185018b()) == null)) {
                b.setVisibility(8);
            }
            if (cVar != null && (view2 = cVar.itemView) != null) {
                if (this.f133838k) {
                    drawable = C57582a.m223614c(view2.getContext(), R.drawable.item_card_header_bg);
                } else {
                    drawable = C57582a.m223614c(view2.getContext(), R.color.bg_body);
                }
                view2.setBackground(drawable);
                view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                view2.setPadding(C57582a.m223600a(16), C57582a.m223600a(12), C57582a.m223600a(16), C57582a.m223600a(12));
            }
        } else if (cVar != null && (view = cVar.itemView) != null) {
            View view3 = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
            view3.setVisibility(8);
            cVar.mo185017a().setVisibility(8);
            cVar.mo185018b().setVisibility(8);
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            view.setPadding(0, 0, 0, 0);
        }
    }

    /* renamed from: a */
    public final void mo185028a(boolean z) {
        this.f133829a.mo184780a(z);
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/searchcommon/view/recommend/RecommendViewAdapter$onClearHistory$1", "Lcom/ss/android/lark/searchcommon/view/recommend/IOnClearHistoryListener;", "onClearHistory", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.recommend.d$a */
    public static final class C54046a implements IOnClearHistoryListener {

        /* renamed from: a */
        final /* synthetic */ RecommendViewAdapter f133841a;

        @Override // com.ss.android.lark.searchcommon.view.recommend.IOnClearHistoryListener
        /* renamed from: a */
        public void mo183179a() {
            IOnClearHistoryListener a = this.f133841a.mo185019a();
            if (a != null) {
                a.mo183179a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54046a(RecommendViewAdapter dVar) {
            this.f133841a = dVar;
        }
    }

    /* renamed from: c */
    public final void mo185031c() {
        for (SearchBaseInfo searchBaseInfo : this.items) {
            if (searchBaseInfo instanceof SearchHistoryListInfo) {
                int indexOf = this.items.indexOf(searchBaseInfo) - 1;
                if (indexOf != -1) {
                    SearchBaseInfo searchBaseInfo2 = (SearchBaseInfo) this.items.get(indexOf);
                    if ((searchBaseInfo2 instanceof SearchPlaceholderInfo) && ((SearchPlaceholderInfo) searchBaseInfo2).getPlaceholderType() == SearchPlaceholderInfo.Type.RECOMMEND_HISTORY_HEADER) {
                        this.items.remove(searchBaseInfo2);
                    }
                }
                int indexOf2 = this.items.indexOf(searchBaseInfo) + 1;
                if (indexOf2 != -1) {
                    SearchBaseInfo searchBaseInfo3 = (SearchBaseInfo) this.items.get(indexOf2);
                    if ((searchBaseInfo3 instanceof SearchPlaceholderInfo) && ((SearchPlaceholderInfo) searchBaseInfo3).getPlaceholderType() == SearchPlaceholderInfo.Type.DIVIDER_14DP) {
                        this.items.remove(searchBaseInfo3);
                    }
                }
                this.items.remove(searchBaseInfo);
                notifyDataSetChanged();
                return;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/searchcommon/view/recommend/RecommendViewAdapter$onMoreClick$1", "Lcom/ss/android/lark/searchcommon/view/recommend/IOnMoreClickListener;", "onMoreClick", "", "position", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.recommend.d$b */
    public static final class C54047b implements IOnMoreClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendViewAdapter f133842a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54047b(RecommendViewAdapter dVar) {
            this.f133842a = dVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.recommend.IOnMoreClickListener
        /* renamed from: a */
        public void mo183188a(int i) {
            IOnMoreClickListener b = this.f133842a.mo185029b();
            if (b != null) {
                b.mo183188a(i);
            }
        }
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchRecyclerViewBaseAdapter
    /* renamed from: c */
    public String mo159265c(int i) {
        Object item = getItem(i);
        Intrinsics.checkExpressionValueIsNotNull(item, "getItem(position)");
        return ((SearchBaseInfo) item).getId();
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public long mo93176a(int i) {
        Object item = getItem(i);
        Intrinsics.checkExpressionValueIsNotNull(item, "getItem(position)");
        return (long) ((SearchBaseInfo) item).getHeaderId();
    }

    /* renamed from: b */
    public RecommendHeaderViewHolder mo93177a(ViewGroup viewGroup) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_card_recommend_header_for_list, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new RecommendHeaderViewHolder(inflate);
    }

    /* renamed from: a */
    public final void mo185020a(SearchResultView.IOnBusinessConsumeItem cVar) {
        this.f133829a.mo184778a(cVar);
    }

    /* renamed from: a */
    public final void mo185021a(ActionRecommendBinder.OnActionTagClickListener aVar) {
        this.f133833f = aVar;
    }

    /* renamed from: a */
    public final void mo185022a(IOnProfileClickListener oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "listener");
        this.f133829a.mo184779a(oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        SearchBaseInfo searchBaseInfo = (SearchBaseInfo) getItem(i);
        if (searchBaseInfo instanceof SearchChatterInfo) {
            return 0;
        }
        if (searchBaseInfo instanceof SearchChatInfo) {
            return 1;
        }
        if (searchBaseInfo instanceof SearchThreadInfo) {
            return 7;
        }
        if (searchBaseInfo instanceof SearchHistoryListInfo) {
            return 11;
        }
        if (searchBaseInfo instanceof SearchActionRecommendInfo) {
            return 12;
        }
        if (searchBaseInfo instanceof SearchOpenSearchInfo) {
            if (((SearchOpenSearchInfo) searchBaseInfo).getSlash_command_type() == SlashCommandMeta.SlashCommandType.FILTER) {
                return 14;
            }
            return 15;
        } else if (searchBaseInfo instanceof SearchCardInfo) {
            return 20;
        } else {
            if (searchBaseInfo instanceof SearchPlaceholderInfo) {
                switch (C54048e.f133843a[((SearchPlaceholderInfo) searchBaseInfo).getPlaceholderType().ordinal()]) {
                    case 1:
                        return 25;
                    case 2:
                        return 26;
                    case 3:
                        return 27;
                    case 4:
                        return 22;
                    case 5:
                        return 23;
                    case 6:
                        return 24;
                    default:
                        return 4;
                }
            } else if (searchBaseInfo instanceof SearchOpenAppInfo) {
                return 10;
            } else {
                if (searchBaseInfo instanceof SearchMailContactInfo) {
                    return 29;
                }
                if (!(searchBaseInfo instanceof SearchSpaceInfo) && !(searchBaseInfo instanceof SearchWikiInfo)) {
                    return -1;
                }
                return 6;
            }
        }
    }

    /* renamed from: a */
    public final void mo185023a(OnHistoryTagClickListener uVar) {
        this.f133832e = uVar;
    }

    /* renamed from: a */
    public final void mo185024a(SearchResultViewAdapter.IOnItemOnScreenListener cVar) {
        this.f133834g = cVar;
    }

    /* renamed from: a */
    public final void mo185025a(IOnClearHistoryListener aVar) {
        this.f133830c = aVar;
    }

    public RecommendViewAdapter(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "onItemClickHandler");
        this.f133840m = context;
        this.f133829a = new BinderRepo(context, bVar);
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchRecyclerViewBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        SearchResultViewAdapter.IOnItemOnScreenListener cVar;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        super.onBindViewHolder(viewHolder, i);
        SearchBaseInfo searchBaseInfo = (SearchBaseInfo) getItem(i);
        if ((searchBaseInfo instanceof SearchHistoryListInfo) || (searchBaseInfo instanceof SearchActionRecommendInfo) || (searchBaseInfo instanceof SearchCardInfo) || (searchBaseInfo instanceof SearchPlaceholderInfo)) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (cVar = this.f133834g) != null) {
            Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            cVar.mo183170a(searchBaseInfo, i);
        }
        if (viewHolder instanceof ChatterChatViewHolder) {
            ChatterChatViewHolder aVar = (ChatterChatViewHolder) viewHolder;
            aVar.mo184645a().getItem().mo184687f();
            int b = aVar.mo184646b();
            if (b == 0) {
                ChatterBinder a = this.f133829a.mo184777a();
                if (searchBaseInfo != null) {
                    a.mo184835a(i, (SearchChatterInfo) searchBaseInfo, aVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo");
            } else if (b == 1) {
                ChatBinder b2 = this.f133829a.mo184781b();
                if (searchBaseInfo != null) {
                    b2.mo184835a(i, (SearchChatInfo) searchBaseInfo, aVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchChatInfo");
            } else if (b == 5) {
                MessageBinder c = this.f133829a.mo184783c();
                if (searchBaseInfo != null) {
                    c.mo184835a(i, (SearchMessageInfo) searchBaseInfo, aVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo");
            } else if (b == 6) {
                CCMBinder e = this.f133829a.mo184785e();
                Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                e.mo184835a(i, searchBaseInfo, aVar);
            } else if (b == 7) {
                ThreadBinder f = this.f133829a.mo184786f();
                if (searchBaseInfo != null) {
                    f.mo184835a(i, (SearchThreadInfo) searchBaseInfo, aVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo");
            } else if (b == 9) {
                HelpDeskBinder k = this.f133829a.mo184791k();
                if (searchBaseInfo != null) {
                    k.mo184835a(i, (SearchHelpDeskInfo) searchBaseInfo, aVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo");
            } else if (b == 10) {
                OpenAppBinder l = this.f133829a.mo184792l();
                if (searchBaseInfo != null) {
                    l.mo184835a(i, (SearchOpenAppInfo) searchBaseInfo, aVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo");
            } else if (b == 15) {
                OpenSearchBinder q = this.f133829a.mo184797q();
                if (searchBaseInfo != null) {
                    q.mo184835a(i, (SearchOpenSearchInfo) searchBaseInfo, aVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo");
            } else if (b == 29) {
                MailContactBinder v = this.f133829a.mo184802v();
                if (searchBaseInfo != null) {
                    v.mo184835a(i, (SearchMailContactInfo) searchBaseInfo, aVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo");
            }
        } else if (viewHolder instanceof SearchHistoryViewHolder) {
            SearchHistoryViewHolder dVar = (SearchHistoryViewHolder) viewHolder;
            int b3 = dVar.mo184888b();
            if (b3 == 11) {
                HistoryBinder m = this.f133829a.mo184793m();
                if (searchBaseInfo != null) {
                    m.mo184842a(i, (SearchHistoryListInfo) searchBaseInfo, dVar, this.f133832e);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchHistoryListInfo");
            } else if (b3 == 12) {
                ActionRecommendBinder n = this.f133829a.mo184794n();
                if (searchBaseInfo != null) {
                    n.mo184763a(i, (SearchActionRecommendInfo) searchBaseInfo, dVar, this.f133833f);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchActionRecommendInfo");
            }
        } else if (viewHolder instanceof SearchOpenSearchFilterViewHolder) {
            OpenSearchFilterBinder p = this.f133829a.mo184796p();
            if (searchBaseInfo != null) {
                p.mo184879a(i, (SearchOpenSearchInfo) searchBaseInfo, (SearchOpenSearchFilterViewHolder) viewHolder);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo");
        } else if (viewHolder instanceof SearchCardViewHolder) {
            CardBinder t = this.f133829a.mo184800t();
            if (searchBaseInfo != null) {
                t.mo184819a(i, (SearchCardInfo) searchBaseInfo, (SearchCardViewHolder) viewHolder, this.f133834g);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchCardInfo");
        } else if (viewHolder instanceof SearchPlaceholderViewHolder) {
            PlaceholderBinder u = this.f133829a.mo184801u();
            if (searchBaseInfo != null) {
                u.mo184881a(i, (SearchPlaceholderInfo) searchBaseInfo, (SearchPlaceholderViewHolder) viewHolder, this.f133835h, this.f133836i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo");
        } else {
            EmptyBinder i2 = this.f133829a.mo184789i();
            Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            i2.mo184838a(i, searchBaseInfo, viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (!(i == 0 || i == 1 || i == 5 || i == 6 || i == 7)) {
            if (i == 14) {
                View inflate = LayoutInflater.from(this.f133840m).inflate(R.layout.item_open_search_filter_layout, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…er_layout, parent, false)");
                return new SearchOpenSearchFilterViewHolder(inflate);
            } else if (i != 15) {
                if (i == 20) {
                    View inflate2 = LayoutInflater.from(this.f133840m).inflate(R.layout.recommend_card_layout, viewGroup, false);
                    Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(cont…rd_layout, parent, false)");
                    return new SearchCardViewHolder(inflate2, i);
                } else if (i != 29) {
                    switch (i) {
                        case 9:
                        case 10:
                            break;
                        case 11:
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            FoldTagFlowLayout cVar = new FoldTagFlowLayout(this.f133840m);
                            cVar.setBackgroundColor(cVar.getResources().getColor(R.color.transparent));
                            return new SearchHistoryViewHolder(cVar, i);
                        default:
                            switch (i) {
                                case 22:
                                    View inflate3 = LayoutInflater.from(this.f133840m).inflate(R.layout.item_card_footer, viewGroup, false);
                                    Intrinsics.checkExpressionValueIsNotNull(inflate3, "LayoutInflater.from(cont…rd_footer, parent, false)");
                                    return new SearchPlaceholderViewHolder(inflate3, i);
                                case 23:
                                    View inflate4 = LayoutInflater.from(this.f133840m).inflate(R.layout.item_divider_8dp, viewGroup, false);
                                    Intrinsics.checkExpressionValueIsNotNull(inflate4, "LayoutInflater.from(cont…vider_8dp, parent, false)");
                                    return new SearchPlaceholderViewHolder(inflate4, i);
                                case 24:
                                    View inflate5 = LayoutInflater.from(this.f133840m).inflate(R.layout.item_divider_14dp, viewGroup, false);
                                    Intrinsics.checkExpressionValueIsNotNull(inflate5, "LayoutInflater.from(cont…ider_14dp, parent, false)");
                                    return new SearchPlaceholderViewHolder(inflate5, i);
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                                case 26:
                                    View inflate6 = LayoutInflater.from(this.f133840m).inflate(R.layout.item_recommend_history_header, viewGroup, false);
                                    Intrinsics.checkExpressionValueIsNotNull(inflate6, "LayoutInflater.from(cont…ry_header, parent, false)");
                                    return new SearchPlaceholderViewHolder(inflate6, i);
                                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                                    View inflate7 = LayoutInflater.from(this.f133840m).inflate(R.layout.item_card_recommend_header, viewGroup, false);
                                    Intrinsics.checkExpressionValueIsNotNull(inflate7, "LayoutInflater.from(cont…nd_header, parent, false)");
                                    return new SearchPlaceholderViewHolder(inflate7, i);
                                default:
                                    return new SearchResultViewAdapter.EmptyViewHolder(new View(this.f133840m));
                            }
                    }
                }
            }
        }
        AvatarItemViewWithMask avatarItemViewWithMask = new AvatarItemViewWithMask(this.f133840m, null, 0, 6, null);
        avatarItemViewWithMask.mo184574a(this.f133837j);
        return new ChatterChatViewHolder(avatarItemViewWithMask, i);
    }
}
