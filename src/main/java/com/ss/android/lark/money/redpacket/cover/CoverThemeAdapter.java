package com.ss.android.lark.money.redpacket.cover;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.money.redpacket.cover.RedPacketCoverView;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverList;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverListResponse;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverTheme;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003()*B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001c\u0010!\u001a\u00020\u001e2\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020\u001cH\u0016J\u001c\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cH\u0016R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/CoverThemeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/money/redpacket/cover/CoverThemeAdapter$ViewHolder;", "coverListResponse", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "dependency", "Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverView$ICoverThemeDependency;", "(Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverView$ICoverThemeDependency;)V", "context", "Landroid/content/Context;", "getDependency", "()Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverView$ICoverThemeDependency;", "recommendedCoverList", "", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "getRecommendedCoverList", "()Ljava/util/List;", "themeCoverMap", "", "", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverList;", "getThemeCoverMap", "()Ljava/util/Map;", "themeList", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverTheme;", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getItemCount", "", "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ICoverDependency", "ViewHolder", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.cover.b */
public final class CoverThemeAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: b */
    public static final Companion f120983b = new Companion(null);

    /* renamed from: g */
    private static final RedPacketCoverTheme f120984g;

    /* renamed from: a */
    public final List<RedPacketCoverTheme> f120985a;

    /* renamed from: c */
    private Context f120986c;

    /* renamed from: d */
    private final RecyclerView.RecycledViewPool f120987d = new RecyclerView.RecycledViewPool();

    /* renamed from: e */
    private final RedPacketCoverListResponse f120988e;

    /* renamed from: f */
    private final RedPacketCoverView.ICoverThemeDependency f120989f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/CoverThemeAdapter$ICoverDependency;", "", "selectedCoverId", "", "getSelectedCoverId", "()J", "goToCoverPreviewActivity", "", "cover", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.b$c */
    public interface ICoverDependency {
        /* renamed from: a */
        long mo168271a();

        /* renamed from: a */
        void mo168272a(RedPacketCover redPacketCover);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/CoverThemeAdapter$Companion;", "", "()V", "RECOMMENDED_THEME", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverTheme;", "RECOMMENDED_THEME_ID", "", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.b$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final RedPacketCoverView.ICoverThemeDependency mo168267a() {
        return this.f120989f;
    }

    /* renamed from: b */
    private final Map<Long, RedPacketCoverList> m189665b() {
        return this.f120988e.getCovers();
    }

    /* renamed from: c */
    private final List<RedPacketCover> m189666c() {
        return this.f120988e.getRecommendedCovers();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f120985a.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/CoverThemeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/money/redpacket/cover/CoverThemeAdapter;Landroid/view/View;)V", "bind", "", "context", "Landroid/content/Context;", "item", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverList;", "position", "", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.b$d */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ CoverThemeAdapter f120990a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"com/ss/android/lark/money/redpacket/cover/CoverThemeAdapter$ViewHolder$bind$1", "Lcom/ss/android/lark/money/redpacket/cover/CoverThemeAdapter$ICoverDependency;", "selectedCoverId", "", "getSelectedCoverId", "()J", "goToCoverPreviewActivity", "", "cover", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.money.redpacket.cover.b$d$a */
        public static final class C48058a implements ICoverDependency {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f120991a;

            @Override // com.ss.android.lark.money.redpacket.cover.CoverThemeAdapter.ICoverDependency
            /* renamed from: a */
            public long mo168271a() {
                return this.f120991a.f120990a.mo168267a().mo168260a();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C48058a(ViewHolder dVar) {
                this.f120991a = dVar;
            }

            @Override // com.ss.android.lark.money.redpacket.cover.CoverThemeAdapter.ICoverDependency
            /* renamed from: a */
            public void mo168272a(RedPacketCover redPacketCover) {
                Intrinsics.checkParameterIsNotNull(redPacketCover, "cover");
                this.f120991a.f120990a.mo168267a().mo168261a(redPacketCover);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CoverThemeAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f120990a = bVar;
        }

        /* renamed from: a */
        public final void mo168273a(Context context, RedPacketCoverList redPacketCoverList, int i) {
            int i2;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(redPacketCoverList, "item");
            TextView textView = (TextView) this.itemView.findViewById(R.id.cover_theme_tv);
            RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.cover_rv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "coverThemeTv");
            textView.setText(this.f120990a.f120985a.get(i).getName());
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "coverRv");
            int i3 = 0;
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
            recyclerView.setAdapter(new CoverAdapter(redPacketCoverList, new C48058a(this)));
            boolean z = true;
            if (redPacketCoverList.getCategoryId() != -1 && !(!redPacketCoverList.getCovers().isEmpty())) {
                z = false;
            }
            TextView textView2 = textView;
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView2.setVisibility(i2);
            RecyclerView recyclerView2 = recyclerView;
            if (!z) {
                i3 = 8;
            }
            recyclerView2.setVisibility(i3);
        }
    }

    static {
        String string = UIHelper.getString(R.string.Lark_RedPacket_Theme_Recommend);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…edPacket_Theme_Recommend)");
        f120984g = new RedPacketCoverTheme(-1, string, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
        this.f120986c = context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.b$a */
    public static final class C48057a<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(t.getOrder()), Integer.valueOf(t2.getOrder()));
        }
    }

    public CoverThemeAdapter(RedPacketCoverListResponse redPacketCoverListResponse, RedPacketCoverView.ICoverThemeDependency aVar) {
        Intrinsics.checkParameterIsNotNull(redPacketCoverListResponse, "coverListResponse");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f120988e = redPacketCoverListResponse;
        this.f120989f = aVar;
        this.f120985a = CollectionsKt.plus((Collection) CollectionsKt.listOf(f120984g), (Iterable) CollectionsKt.sortedWith(redPacketCoverListResponse.getCategoryList(), new C48057a()));
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_red_packet_cover_theme, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        ViewHolder dVar = new ViewHolder(this, inflate);
        ((RecyclerView) dVar.itemView.findViewById(R.id.cover_rv)).setRecycledViewPool(this.f120987d);
        return dVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder dVar, int i) {
        RedPacketCoverList redPacketCoverList;
        Intrinsics.checkParameterIsNotNull(dVar, "holder");
        if (i != 0) {
            redPacketCoverList = m189665b().get(Long.valueOf(this.f120985a.get(i).getId()));
        } else {
            List<RedPacketCover> c = m189666c();
            if (c == null) {
                c = CollectionsKt.emptyList();
            }
            redPacketCoverList = new RedPacketCoverList(-1, c);
        }
        if (redPacketCoverList != null) {
            Context context = this.f120986c;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            dVar.mo168273a(context, redPacketCoverList, i);
        }
    }
}
