package com.bytedance.ee.bear.more.view2.viewbinder.grid;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.more.C10208e;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u001e\u0010\u001c\u001a\u00020\u00152\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fR\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/grid/GridItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/grid/GridItemAdapter$GridItemViewHolder;", "()V", "TAG", "", "localeService", "Lcom/bytedance/ee/bear/contract/LocaleService;", "getLocaleService", "()Lcom/bytedance/ee/bear/contract/LocaleService;", "localeService$delegate", "Lkotlin/Lazy;", "moreItemList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/more/moreprotocol/IGridMoreItem;", "Lkotlin/collections/ArrayList;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMoreItems", "GridItemViewHolder", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.b.c.a */
public final class GridItemAdapter extends RecyclerView.Adapter<GridItemViewHolder> {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f27700a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GridItemAdapter.class), "localeService", "getLocaleService()Lcom/bytedance/ee/bear/contract/LocaleService;"))};

    /* renamed from: b */
    public final String f27701b = "GridItemAdapter";

    /* renamed from: c */
    private final C10917c f27702c = new C10917c(new C10929e());

    /* renamed from: d */
    private final Lazy f27703d = LazyKt.lazy(C10257b.INSTANCE);

    /* renamed from: e */
    private ArrayList<IGridMoreItem> f27704e = new ArrayList<>();

    /* renamed from: a */
    public final ao mo39224a() {
        Lazy lazy = this.f27703d;
        KProperty kProperty = f27700a[0];
        return (ao) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/LocaleService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.b.c.a$b */
    static final class C10257b extends Lambda implements Function0<ao> {
        public static final C10257b INSTANCE = new C10257b();

        C10257b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ao invoke() {
            return C4484g.m18494b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f27704e.size();
    }

    /* renamed from: a */
    public final void mo39227a(ArrayList<IGridMoreItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "moreItemList");
        this.f27704e = arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/grid/GridItemAdapter$GridItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/more/view2/viewbinder/grid/GridItemAdapter;Landroid/view/View;)V", "onBindViewHolder", "", "item", "Lcom/bytedance/ee/bear/more/moreprotocol/IGridMoreItem;", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.b.c.a$a */
    public final class GridItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ GridItemAdapter f27705a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.more.view2.b.c.a$a$a */
        public static final class View$OnClickListenerC10256a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ GridItemViewHolder f27706a;

            /* renamed from: b */
            final /* synthetic */ IGridMoreItem f27707b;

            View$OnClickListenerC10256a(GridItemViewHolder aVar, IGridMoreItem iGridMoreItem) {
                this.f27706a = aVar;
                this.f27707b = iGridMoreItem;
            }

            public final void onClick(View view) {
                if (!C13726a.m55676b(this.f27707b.getHost().mo39165b().getActivity())) {
                    C13479a.m54775e(this.f27706a.f27705a.f27701b, "item click, but act not active!!!");
                } else if (this.f27707b.isEnable()) {
                    this.f27707b.onClick();
                } else if (!TextUtils.isEmpty(this.f27707b.getUnableTips())) {
                    View view2 = this.f27706a.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    Toast.showText(view2.getContext(), this.f27707b.getUnableTips(), 0);
                }
            }
        }

        /* renamed from: a */
        public final void mo39228a(IGridMoreItem iGridMoreItem) {
            int i;
            Intrinsics.checkParameterIsNotNull(iGridMoreItem, "item");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((AppCompatImageView) view.findViewById(R.id.more_item_icon)).setImageResource(iGridMoreItem.getIcon());
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(R.id.more_item_title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.more_item_title");
            textView.setText(iGridMoreItem.getTitle());
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            Context context = view3.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            Resources resources = context.getResources();
            if (iGridMoreItem.isEnable()) {
                View view4 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                C13747j.m55728a((ImageView) ((AppCompatImageView) view4.findViewById(R.id.more_item_icon)), iGridMoreItem.getIconTint());
                View view5 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                ((TextView) view5.findViewById(R.id.more_item_title)).setTextColor(resources.getColor(R.color.text_title));
            } else {
                View view6 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                C13747j.m55728a((ImageView) ((AppCompatImageView) view6.findViewById(R.id.more_item_icon)), (int) R.color.icon_disable);
                View view7 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                ((TextView) view7.findViewById(R.id.more_item_title)).setTextColor(resources.getColor(R.color.text_disable));
            }
            String c = this.f27705a.mo39224a().mo17252c();
            Intrinsics.checkExpressionValueIsNotNull(c, "localeService.provideLanguage()");
            View view8 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
            TextView textView2 = (TextView) view8.findViewById(R.id.more_item_title);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.more_item_title");
            Context context2 = textView2.getContext();
            View view9 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            TextView textView3 = (TextView) view9.findViewById(R.id.more_item_title);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.more_item_title");
            float measureText = textView3.getPaint().measureText(iGridMoreItem.getTitle());
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            if (measureText > context2.getResources().getDimension(R.dimen.more_item_width)) {
                Locale locale = Locale.JAPANESE;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.JAPANESE");
                if (TextUtils.equals(c, locale.getLanguage())) {
                    View view10 = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
                    ((TextView) view10.findViewById(R.id.more_item_title)).setTextSize(1, 10.0f);
                }
            }
            boolean c2 = C10208e.m42528c(iGridMoreItem.getId());
            boolean needShowBadge = iGridMoreItem.needShowBadge();
            View view11 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
            UDBadgeView uDBadgeView = (UDBadgeView) view11.findViewById(R.id.more_item_new);
            Intrinsics.checkExpressionValueIsNotNull(uDBadgeView, "itemView.more_item_new");
            if (c2 && needShowBadge) {
                i = 0;
            } else {
                i = 8;
            }
            uDBadgeView.setVisibility(i);
            this.itemView.setOnClickListener(new View$OnClickListenerC10256a(this, iGridMoreItem));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GridItemViewHolder(GridItemAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f27705a = aVar;
        }
    }

    /* renamed from: a */
    public GridItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.more_item_horizontal, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new GridItemViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(GridItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        IGridMoreItem iGridMoreItem = this.f27704e.get(i);
        Intrinsics.checkExpressionValueIsNotNull(iGridMoreItem, "moreItemList[position]");
        aVar.mo39228a(iGridMoreItem);
    }
}
