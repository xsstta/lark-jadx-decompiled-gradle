package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.DocAvatar;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchWikiInfo;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import com.ss.android.lark.searchcommon.view.avataritem.subtitle.SubtitleModel;
import com.ss.android.lark.searchcommon.view.avataritem.summary.SummaryModel;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000*\u0001\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/CCMBinder;", "Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "mContext", "Landroid/content/Context;", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "ccmViewInChat", "com/ss/android/lark/searchcommon/view/binder/CCMBinder$ccmViewInChat$1", "Lcom/ss/android/lark/searchcommon/view/binder/CCMBinder$ccmViewInChat$1;", "getMContext", "()Landroid/content/Context;", "bindAvatar", "", "holder", "Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindOthers", "position", "", "bindSubTitle", "bindSummary", "bindTag", "needBindSummary", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.c */
public final class CCMBinder extends CommonBinder<SearchBaseInfo> {

    /* renamed from: a */
    public final C53984b f133608a = new C53984b();

    /* renamed from: b */
    private final Context f133609b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/searchcommon/view/binder/CCMBinder$ccmViewInChat$1", "Lcom/ss/android/lark/searchcommon/view/binder/ViewInChatClickListener;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "getChatId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getChatPosition", "", "getSpaceInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchSpaceInfo;", "getThreadId", "getThreadPosition", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.c$b */
    public static final class C53984b extends ViewInChatClickListener<SearchBaseInfo> {
        C53984b() {
        }

        /* renamed from: e */
        private final SearchSpaceInfo m209494e(SearchBaseInfo searchBaseInfo) {
            if (searchBaseInfo instanceof SearchWikiInfo) {
                return ((SearchWikiInfo) searchBaseInfo).getSpaceInfo();
            }
            if (searchBaseInfo instanceof SearchSpaceInfo) {
                return (SearchSpaceInfo) searchBaseInfo;
            }
            return null;
        }

        @Override // com.ss.android.lark.searchcommon.view.binder.ViewInChatClickListener
        /* renamed from: a */
        public String mo184771a(SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            SearchSpaceInfo e = m209494e(searchBaseInfo);
            if (e != null) {
                return e.getThreadId();
            }
            return null;
        }

        @Override // com.ss.android.lark.searchcommon.view.binder.ViewInChatClickListener
        /* renamed from: b */
        public String mo184773b(SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            SearchSpaceInfo e = m209494e(searchBaseInfo);
            if (e != null) {
                return e.getChatId();
            }
            return null;
        }

        @Override // com.ss.android.lark.searchcommon.view.binder.ViewInChatClickListener
        /* renamed from: c */
        public int mo184774c(SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            SearchSpaceInfo e = m209494e(searchBaseInfo);
            if (e != null) {
                return e.getThreadPosition();
            }
            return -1;
        }

        @Override // com.ss.android.lark.searchcommon.view.binder.ViewInChatClickListener
        /* renamed from: d */
        public int mo184775d(SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            SearchSpaceInfo e = m209494e(searchBaseInfo);
            if (e != null) {
                return e.getPosition();
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final Context mo184803a() {
        return this.f133609b;
    }

    @Override // com.ss.android.lark.searchcommon.view.binder.CommonBinder
    /* renamed from: a */
    public boolean mo184806a(SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return !searchBaseInfo.isChatInsideShow();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.c$a */
    static final class View$OnClickListenerC53983a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CCMBinder f133610a;

        /* renamed from: b */
        final /* synthetic */ SearchBaseInfo f133611b;

        /* renamed from: c */
        final /* synthetic */ int f133612c;

        View$OnClickListenerC53983a(CCMBinder cVar, SearchBaseInfo searchBaseInfo, int i) {
            this.f133610a = cVar;
            this.f133611b = searchBaseInfo;
            this.f133612c = i;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f133610a.mo184803a());
            this.f133610a.f133608a.mo184772a(this.f133611b, this.f133612c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CCMBinder(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        super(context, bVar);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133609b = context;
    }

    @Override // com.ss.android.lark.searchcommon.view.binder.IViewBinder
    /* renamed from: b */
    public void mo184808b(SearchBaseInfo searchBaseInfo, ChatterChatViewHolder aVar) {
        SearchSpaceInfo searchSpaceInfo;
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (searchBaseInfo.isChatInsideShow()) {
            if (searchBaseInfo instanceof SearchWikiInfo) {
                searchSpaceInfo = ((SearchWikiInfo) searchBaseInfo).getSpaceInfo();
                Intrinsics.checkExpressionValueIsNotNull(searchSpaceInfo, "data.spaceInfo");
            } else if (searchBaseInfo instanceof SearchSpaceInfo) {
                searchSpaceInfo = (SearchSpaceInfo) searchBaseInfo;
            } else {
                return;
            }
            SubtitleModel aVar2 = new SubtitleModel(searchBaseInfo.getSubTitle() + " " + SearchCommonUtils.m209227a(this.f133609b, searchSpaceInfo.getUpdateTime(), true));
            aVar2.mo184720a(mo184848a(searchBaseInfo.getSubTitleHitTerms()));
            aVar.mo184645a().getItem().mo184668a(aVar2);
            return;
        }
        super.mo184808b(searchBaseInfo, aVar);
    }

    @Override // com.ss.android.lark.searchcommon.view.binder.IViewBinder
    /* renamed from: a */
    public void mo184805a(SearchBaseInfo searchBaseInfo, ChatterChatViewHolder aVar) {
        SearchSpaceInfo searchSpaceInfo;
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (searchBaseInfo instanceof SearchWikiInfo) {
            searchSpaceInfo = ((SearchWikiInfo) searchBaseInfo).getSpaceInfo();
            Intrinsics.checkExpressionValueIsNotNull(searchSpaceInfo, "data.spaceInfo");
        } else if (searchBaseInfo instanceof SearchSpaceInfo) {
            searchSpaceInfo = (SearchSpaceInfo) searchBaseInfo;
        } else {
            return;
        }
        aVar.mo184645a().getItem().mo184669a(new SummaryModel(UIHelper.mustacheFormat((int) R.string.Lark_ASL_EntryLastUpdated, "Date", SearchCommonUtils.m209227a(this.f133609b, searchSpaceInfo.getUpdateTime(), true))));
    }

    @Override // com.ss.android.lark.searchcommon.view.binder.CommonBinder
    /* renamed from: a */
    public void mo184769a(ChatterChatViewHolder aVar, SearchBaseInfo searchBaseInfo) {
        int i;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Integer num = null;
        if (searchBaseInfo instanceof SearchSpaceInfo) {
            SearchCommonModuleDependency.ISearchCommonModuleDependency b = SearchCommonModuleDependency.m208732b();
            SearchSpaceInfo searchSpaceInfo = (SearchSpaceInfo) searchBaseInfo;
            DocType docType = searchSpaceInfo.getDocType();
            Intrinsics.checkExpressionValueIsNotNull(docType, "data.docType");
            int number = docType.getNumber();
            String title = searchSpaceInfo.getTitle();
            Intrinsics.checkExpressionValueIsNotNull(title, "data.title");
            num = Integer.valueOf(b.mo102884a(number, title));
        } else if (searchBaseInfo instanceof SearchWikiInfo) {
            SearchCommonModuleDependency.ISearchCommonModuleDependency b2 = SearchCommonModuleDependency.m208732b();
            SearchWikiInfo searchWikiInfo = (SearchWikiInfo) searchBaseInfo;
            SearchSpaceInfo spaceInfo = searchWikiInfo.getSpaceInfo();
            Intrinsics.checkExpressionValueIsNotNull(spaceInfo, "data.spaceInfo");
            DocType docType2 = spaceInfo.getDocType();
            Intrinsics.checkExpressionValueIsNotNull(docType2, "data.spaceInfo.docType");
            int number2 = docType2.getNumber();
            String title2 = searchWikiInfo.getTitle();
            Intrinsics.checkExpressionValueIsNotNull(title2, "data.title");
            num = Integer.valueOf(b2.mo102904b(number2, title2));
        }
        AvatarItemView item = aVar.mo184645a().getItem();
        DocAvatar.Builder aVar2 = new DocAvatar.Builder();
        if (num != null) {
            i = num.intValue();
        } else {
            i = R.drawable.icon_file_doc_v2;
        }
        item.mo184662a(((DocAvatar.Builder) aVar2.mo88957a(i)).mo88976k());
    }

    @Override // com.ss.android.lark.searchcommon.view.binder.CommonBinder
    /* renamed from: b */
    public void mo184807b(int i, ChatterChatViewHolder aVar, SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        LarkNameTag.ChatTagBuilder dVar = new LarkNameTag.ChatTagBuilder(this.f133609b);
        if (mo184837c(searchBaseInfo)) {
            dVar.mo90037h(true);
        }
        aVar.mo184645a().getItem().setTag(dVar);
    }

    @Override // com.ss.android.lark.searchcommon.view.binder.CommonBinder
    /* renamed from: a */
    public void mo184804a(int i, ChatterChatViewHolder aVar, SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (searchBaseInfo.isChatInsideShow()) {
            ImageView imageView = new ImageView(this.f133609b);
            Context context = imageView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_viewinchat_outlined, imageView.getResources().getColor(R.color.icon_n2)));
            imageView.setLayoutParams(new ViewGroup.LayoutParams(C57582a.m223600a(20), C57582a.m223600a(20)));
            imageView.setOnClickListener(new View$OnClickListenerC53983a(this, searchBaseInfo, i));
            aVar.mo184645a().getItem().mo184659a(imageView);
        }
    }
}
