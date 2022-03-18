package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.urecommend.IconStyle;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchCardInfo;
import com.ss.android.lark.searchcommon.view.SearchRecyclerViewBaseAdapter;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.ui.p2892a.C57582a;
import jp.wasabeef.glide.transformations.C69025c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001c\u001dB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/CardAdapter;", "Lcom/ss/android/lark/searchcommon/view/SearchRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/searchcommon/view/binder/CardAdapter$CardViewHolder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "context", "Landroid/content/Context;", "cardInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchCardInfo;", "onItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/dto/info/SearchCardInfo;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "onItemOnScreenListener", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;", "getOnItemOnScreenListener", "()Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;", "setOnItemOnScreenListener", "(Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;)V", "getTopNRptId", "", "position", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CardViewHolder", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.e */
public final class CardAdapter extends SearchRecyclerViewBaseAdapter<CardViewHolder, SearchBaseInfo> {

    /* renamed from: c */
    public static final Companion f133614c = new Companion(null);

    /* renamed from: a */
    public final SearchResultViewAdapter.IOnItemClickHandler f133615a;

    /* renamed from: d */
    private SearchResultViewAdapter.IOnItemOnScreenListener f133616d;

    /* renamed from: e */
    private final Context f133617e;

    /* renamed from: f */
    private final SearchCardInfo f133618f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/CardAdapter$CardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "avatar", "Landroid/widget/ImageView;", "getAvatar", "()Landroid/widget/ImageView;", "squircleAvatar", "Lcom/larksuite/component/ignition/widget/squircle/SquircleImageView;", "getSquircleAvatar", "()Lcom/larksuite/component/ignition/widget/squircle/SquircleImageView;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.e$a */
    public static final class CardViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ImageView f133619a;

        /* renamed from: b */
        private final SquircleImageView f133620b;

        /* renamed from: c */
        private final TextView f133621c;

        /* renamed from: a */
        public final ImageView mo184815a() {
            return this.f133619a;
        }

        /* renamed from: b */
        public final SquircleImageView mo184816b() {
            return this.f133620b;
        }

        /* renamed from: c */
        public final TextView mo184817c() {
            return this.f133621c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CardViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.avatar);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.avatar)");
            this.f133619a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.squircle_avatar);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.squircle_avatar)");
            this.f133620b = (SquircleImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.title);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.title)");
            this.f133621c = (TextView) findViewById3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/CardAdapter$Companion;", "", "()V", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.e$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo184814a(SearchResultViewAdapter.IOnItemOnScreenListener cVar) {
        this.f133616d = cVar;
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchRecyclerViewBaseAdapter
    /* renamed from: c */
    public String mo159265c(int i) {
        Object item = getItem(i);
        Intrinsics.checkExpressionValueIsNotNull(item, "getItem(position)");
        return ((SearchBaseInfo) item).getId();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.e$c */
    public static final class View$OnClickListenerC53985c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter f133622a;

        /* renamed from: b */
        final /* synthetic */ SearchBaseInfo f133623b;

        /* renamed from: c */
        final /* synthetic */ int f133624c;

        View$OnClickListenerC53985c(CardAdapter eVar, SearchBaseInfo searchBaseInfo, int i) {
            this.f133622a = eVar;
            this.f133623b = searchBaseInfo;
            this.f133624c = i;
        }

        public final void onClick(View view) {
            SearchResultViewAdapter.IOnItemClickHandler bVar = this.f133622a.f133615a;
            SearchBaseInfo searchBaseInfo = this.f133623b;
            Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo, "cardItemInfo");
            bVar.mo182499a(searchBaseInfo, true, this.f133624c);
        }
    }

    /* renamed from: a */
    public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f133617e).inflate(R.layout.recommend_card_item_layout, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…d_card_item_layout, null)");
        return new CardViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(CardViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        super.onBindViewHolder(aVar, i);
        SearchBaseInfo searchBaseInfo = (SearchBaseInfo) this.items.get(i);
        SearchResultViewAdapter.IOnItemOnScreenListener cVar = this.f133616d;
        if (cVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo, "cardItemInfo");
            cVar.mo183170a(searchBaseInfo, i);
        }
        int screenWidth = ((DeviceUtils.getScreenWidth(this.f133617e) - (C57582a.m223600a(8) * 2)) - (C57582a.m223600a(16) * 2)) / this.f133618f.getColumnLimit();
        int i2 = (int) 48.0f;
        if (screenWidth > C57582a.m223600a(i2)) {
            screenWidth = C57582a.m223600a(i2);
        } else {
            if (aVar.mo184815a().getLayoutParams().width != screenWidth) {
                aVar.mo184815a().getLayoutParams().width = screenWidth;
            }
            if (aVar.mo184815a().getLayoutParams().height != screenWidth) {
                aVar.mo184815a().getLayoutParams().height = screenWidth;
            }
            if (aVar.mo184816b().getLayoutParams().width != screenWidth) {
                aVar.mo184816b().getLayoutParams().width = screenWidth;
            }
            if (aVar.mo184816b().getLayoutParams().height != screenWidth) {
                aVar.mo184816b().getLayoutParams().height = screenWidth;
            }
        }
        Log.m165379d("LarkSearch.Common.CardAdapter", "widthPerItem: " + screenWidth);
        if (this.f133618f.getAvatarStyle() == IconStyle.CIRCLE) {
            aVar.mo184816b().setVisibility(8);
            ImageView a = aVar.mo184815a();
            a.setVisibility(0);
            SearchCommonModuleDependency.ISearchCommonModuleDependency b = SearchCommonModuleDependency.m208732b();
            Context context = a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo, "cardItemInfo");
            String avatarKey = searchBaseInfo.getAvatarKey();
            Intrinsics.checkExpressionValueIsNotNull(avatarKey, "cardItemInfo.avatarKey");
            b.mo102894a(context, avatarKey, searchBaseInfo.getId(), null, C57582a.m223600a(screenWidth), C57582a.m223600a(screenWidth), new C69025c(), a);
            ViewGroup.LayoutParams layoutParams = aVar.mo184817c().getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f2817i = R.id.avatar;
            }
        } else {
            aVar.mo184815a().setVisibility(8);
            SquircleImageView b2 = aVar.mo184816b();
            b2.setBorderWidth(C57582a.m223601a(b2.getContext(), 0.5f));
            b2.setBorderColor(C57582a.m223616d(b2.getContext(), R.color.N900_10));
            b2.setVisibility(0);
            SearchCommonModuleDependency.ISearchCommonModuleDependency b3 = SearchCommonModuleDependency.m208732b();
            Context context2 = b2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo, "cardItemInfo");
            String avatarKey2 = searchBaseInfo.getAvatarKey();
            Intrinsics.checkExpressionValueIsNotNull(avatarKey2, "cardItemInfo.avatarKey");
            b3.mo102894a(context2, avatarKey2, searchBaseInfo.getId(), null, C57582a.m223600a(screenWidth), C57582a.m223600a(screenWidth), null, b2);
            ViewGroup.LayoutParams layoutParams2 = aVar.mo184817c().getLayoutParams();
            if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams2).f2817i = R.id.squircle_avatar;
            }
        }
        aVar.mo184817c().setText(searchBaseInfo.getTitle());
        aVar.itemView.setOnClickListener(new View$OnClickListenerC53985c(this, searchBaseInfo, i));
    }

    public CardAdapter(Context context, SearchCardInfo searchCardInfo, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(searchCardInfo, "cardInfo");
        Intrinsics.checkParameterIsNotNull(bVar, "onItemClickHandler");
        this.f133617e = context;
        this.f133618f = searchCardInfo;
        this.f133615a = bVar;
    }
}
