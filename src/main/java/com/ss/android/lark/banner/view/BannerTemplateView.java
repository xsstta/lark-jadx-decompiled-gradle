package com.ss.android.lark.banner.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.banner.entity.BannerTemplateContent;
import com.ss.android.lark.banner.export.AbstractC29484e;
import com.ss.android.lark.banner.view.StyleHelper;
import com.ss.android.lark.image.ImageLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0005+,-./B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0019\u001a\u00020\u00152\b\b\u0001\u0010\u001a\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u0005J\u0010\u0010\u001c\u001a\u00020\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u0005J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 J\u0014\u0010!\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#J\u000e\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'J\u0010\u0010(\u001a\u00020\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'J\u0010\u0010*\u001a\u00020\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/banner/view/BannerTemplateView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "style", "", "(Landroid/content/Context;I)V", "bannerViewCallback", "Lcom/ss/android/lark/banner/export/BannerViewCallback;", "closeIcon", "Lcom/ss/android/lark/banner/view/CloseIcon;", "containerView", "Landroid/view/View;", "itemAdapter", "Lcom/ss/android/lark/banner/view/BannerTemplateView$TemplateItemAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "subTitleTv", "Landroid/widget/TextView;", "titleTv", "initContentList", "", "initViews", "setBannerViewCallback", "callback", "setBgColor", "bgColor", "borderColor", "setCloseIconColor", "color", "setCloseable", "enable", "", "setContentListData", "dataList", "", "Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateItemData;", "setSubTitle", "text", "", "setSubTitleColor", "setTitle", "setTitleColor", "Builder", "SpaceItemDecoration", "TemplateItemAdapter", "TemplateItemView", "TemplateItemViewHolder", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.banner.view.c */
public final class BannerTemplateView extends FrameLayout {

    /* renamed from: a */
    public AbstractC29484e f73732a;

    /* renamed from: b */
    private int f73733b = 1;

    /* renamed from: c */
    private View f73734c;

    /* renamed from: d */
    private TextView f73735d;

    /* renamed from: e */
    private TextView f73736e;

    /* renamed from: f */
    private CloseIcon f73737f;

    /* renamed from: g */
    private RecyclerView f73738g;

    /* renamed from: h */
    private TemplateItemAdapter f73739h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/banner/view/BannerTemplateView$TemplateItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/ss/android/lark/banner/view/BannerTemplateView$TemplateItemView;", "(Lcom/ss/android/lark/banner/view/BannerTemplateView$TemplateItemView;)V", "getView", "()Lcom/ss/android/lark/banner/view/BannerTemplateView$TemplateItemView;", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.c$e */
    public static final class TemplateItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final TemplateItemView f73765a;

        /* renamed from: a */
        public final TemplateItemView mo104563a() {
            return this.f73765a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TemplateItemViewHolder(TemplateItemView dVar) {
            super(dVar);
            Intrinsics.checkParameterIsNotNull(dVar, "view");
            this.f73765a = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0017J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000bR\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/banner/view/BannerTemplateView$TemplateItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/banner/view/BannerTemplateView$TemplateItemViewHolder;", "style", "", "(I)V", "dataList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateItemData;", "Lkotlin/collections/ArrayList;", "itemClickListener", "Lcom/ss/android/lark/banner/view/BannerTemplateView$TemplateItemAdapter$OnItemClickListener;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "", "setOnItemClickListener", "listener", "OnItemClickListener", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.c$c */
    public static final class TemplateItemAdapter extends RecyclerView.Adapter<TemplateItemViewHolder> {

        /* renamed from: a */
        public OnItemClickListener f73754a;

        /* renamed from: b */
        private final ArrayList<BannerTemplateContent.BannerTemplateItemData> f73755b = new ArrayList<>();

        /* renamed from: c */
        private final int f73756c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/banner/view/BannerTemplateView$TemplateItemAdapter$OnItemClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "link", "", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.banner.view.c$c$a */
        public interface OnItemClickListener {
            /* renamed from: a */
            void mo104557a(View view, int i, String str);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f73755b.size();
        }

        /* renamed from: a */
        public final void mo104554a(OnItemClickListener aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            this.f73754a = aVar;
        }

        public TemplateItemAdapter(@BannerTemplateContent.LayoutStyle int i) {
            this.f73756c = i;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.banner.view.c$c$b */
        public static final class View$OnClickListenerC29509b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ TemplateItemAdapter f73757a;

            /* renamed from: b */
            final /* synthetic */ int f73758b;

            /* renamed from: c */
            final /* synthetic */ BannerTemplateContent.BannerTemplateItemData f73759c;

            View$OnClickListenerC29509b(TemplateItemAdapter cVar, int i, BannerTemplateContent.BannerTemplateItemData bVar) {
                this.f73757a = cVar;
                this.f73758b = i;
                this.f73759c = bVar;
            }

            public final void onClick(View view) {
                OnItemClickListener aVar = this.f73757a.f73754a;
                if (aVar != null) {
                    aVar.mo104557a(view, this.f73758b, this.f73759c.mo104424f());
                }
            }
        }

        /* renamed from: a */
        public final void mo104556a(List<? extends BannerTemplateContent.BannerTemplateItemData> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            this.f73755b.clear();
            this.f73755b.addAll(list);
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public TemplateItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
            return new TemplateItemViewHolder(new TemplateItemView(context, this.f73756c));
        }

        /* renamed from: a */
        public void onBindViewHolder(TemplateItemViewHolder eVar, int i) {
            int i2;
            Intrinsics.checkParameterIsNotNull(eVar, "holder");
            if (i >= 0 && i <= this.f73755b.size() - 1) {
                BannerTemplateContent.BannerTemplateItemData bVar = this.f73755b.get(i);
                Intrinsics.checkExpressionValueIsNotNull(bVar, "dataList[position]");
                BannerTemplateContent.BannerTemplateItemData bVar2 = bVar;
                if (bVar2 instanceof BannerTemplateContent.BannerTemplateCategoryData) {
                    BannerTemplateContent.BannerTemplateCategoryData aVar = (BannerTemplateContent.BannerTemplateCategoryData) bVar2;
                    String a = aVar.mo104413a();
                    if (a != null) {
                        eVar.mo104563a().setTitle(a);
                    }
                    String b = aVar.mo104415b();
                    if (b != null) {
                        eVar.mo104563a().setFrontImageUrl(b);
                    }
                    String c = aVar.mo104417c();
                    if (c != null) {
                        eVar.mo104563a().setBackImageUrl(c);
                    }
                } else if (bVar2 instanceof BannerTemplateContent.BannerTemplateMoreData) {
                    BannerTemplateContent.BannerTemplateMoreData cVar = (BannerTemplateContent.BannerTemplateMoreData) bVar2;
                    String a2 = cVar.mo104426a();
                    if (a2 != null) {
                        eVar.mo104563a().setTitle(a2);
                    }
                    String b2 = cVar.mo104428b();
                    if (b2 != null) {
                        eVar.mo104563a().setBackImageUrl(b2);
                    }
                }
                TemplateItemView a3 = eVar.mo104563a();
                Integer a4 = StyleHelper.f73802a.mo104593a(bVar2.mo104420d());
                int i3 = 0;
                if (a4 != null) {
                    i2 = a4.intValue();
                } else {
                    i2 = 0;
                }
                Integer a5 = StyleHelper.f73802a.mo104593a(bVar2.mo104422e());
                if (a5 != null) {
                    i3 = a5.intValue();
                }
                a3.mo104559a(i2, i3);
                eVar.mo104563a().setOnClickListener(new View$OnClickListenerC29509b(this, i, bVar2));
            }
        }
    }

    /* renamed from: a */
    private final void m108662a() {
        this.f73734c = findViewById(R.id.banner_container);
        this.f73735d = (TextView) findViewById(R.id.banner_title);
        this.f73736e = (TextView) findViewById(R.id.banner_sub_title);
        this.f73737f = (CloseIcon) findViewById(R.id.banner_close);
        this.f73738g = (RecyclerView) findViewById(R.id.banner_list);
        m108663b();
        CloseIcon closeIcon = this.f73737f;
        if (closeIcon != null) {
            closeIcon.setOnClickListener(new View$OnClickListenerC29511g(this));
        }
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC29512h(this));
    }

    /* renamed from: b */
    private final void m108663b() {
        float f;
        RecyclerView recyclerView = this.f73738g;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            TemplateItemAdapter cVar = new TemplateItemAdapter(this.f73733b);
            cVar.mo104554a(new C29510f(this));
            this.f73739h = cVar;
            recyclerView.setAdapter(cVar);
            int i = this.f73733b;
            if (i == 1) {
                f = 8.0f;
            } else if (i != 2) {
                f = 12.0f;
            } else {
                f = 20.0f;
            }
            int dp2px = UIUtils.dp2px(getContext(), f);
            int dp2px2 = UIUtils.dp2px(getContext(), 12.0f);
            recyclerView.addItemDecoration(new SpaceItemDecoration(dp2px2, dp2px, dp2px2));
            recyclerView.setOverScrollMode(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006J\u0015\u0010!\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006J\u0014\u0010%\u001a\u00020\u00002\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010'\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0006J\u0010\u0010)\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006J\u0010\u0010*\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0006J\u0010\u0010+\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/banner/view/BannerTemplateView$Builder;", "", "()V", "bannerViewCallback", "Lcom/ss/android/lark/banner/export/BannerViewCallback;", "bgColor", "", "bgImage", "borderColor", "closeEnable", "", "Ljava/lang/Boolean;", "closeIconColor", "contentListData", "", "Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateItemData;", "subTitle", "subTitleColor", "title", "titleColor", "build", "Lcom/ss/android/lark/banner/view/BannerTemplateView;", "context", "Landroid/content/Context;", "style", "", "setBannerViewCallback", "callback", "setBgColor", "color", "setBgImage", "imageUrl", "setBorderColor", "setCloseEnable", "enable", "(Ljava/lang/Boolean;)Lcom/ss/android/lark/banner/view/BannerTemplateView$Builder;", "setCloseIconColor", "setContentListData", "dataList", "setSubTitle", "text", "setSubTitleColor", "setTitle", "setTitleColor", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.c$a */
    public static final class Builder {

        /* renamed from: a */
        private String f73740a;

        /* renamed from: b */
        private String f73741b;

        /* renamed from: c */
        private String f73742c;

        /* renamed from: d */
        private String f73743d;

        /* renamed from: e */
        private String f73744e;

        /* renamed from: f */
        private String f73745f;

        /* renamed from: g */
        private String f73746g;

        /* renamed from: h */
        private Boolean f73747h;

        /* renamed from: i */
        private String f73748i;

        /* renamed from: j */
        private List<? extends BannerTemplateContent.BannerTemplateItemData> f73749j;

        /* renamed from: k */
        private AbstractC29484e f73750k;

        /* renamed from: a */
        public final Builder mo104541a(AbstractC29484e eVar) {
            this.f73750k = eVar;
            return this;
        }

        /* renamed from: b */
        public final Builder mo104546b(String str) {
            this.f73741b = str;
            return this;
        }

        /* renamed from: c */
        public final Builder mo104547c(String str) {
            this.f73742c = str;
            return this;
        }

        /* renamed from: d */
        public final Builder mo104548d(String str) {
            this.f73743d = str;
            return this;
        }

        /* renamed from: e */
        public final Builder mo104549e(String str) {
            this.f73744e = str;
            return this;
        }

        /* renamed from: f */
        public final Builder mo104550f(String str) {
            this.f73745f = str;
            return this;
        }

        /* renamed from: g */
        public final Builder mo104551g(String str) {
            this.f73746g = str;
            return this;
        }

        /* renamed from: h */
        public final Builder mo104552h(String str) {
            this.f73748i = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo104542a(Boolean bool) {
            this.f73747h = bool;
            return this;
        }

        /* renamed from: a */
        public final Builder mo104543a(String str) {
            this.f73740a = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo104544a(List<? extends BannerTemplateContent.BannerTemplateItemData> list) {
            Intrinsics.checkParameterIsNotNull(list, "dataList");
            this.f73749j = list;
            return this;
        }

        /* renamed from: a */
        public final BannerTemplateView mo104545a(Context context, @BannerTemplateContent.LayoutStyle int i) {
            int i2;
            boolean z;
            Intrinsics.checkParameterIsNotNull(context, "context");
            BannerTemplateView cVar = new BannerTemplateView(context, i);
            String str = this.f73740a;
            if (str != null) {
                cVar.setTitle(str);
            }
            Integer a = StyleHelper.f73802a.mo104593a(this.f73741b);
            if (a != null) {
                cVar.setTitleColor(a.intValue());
            }
            String str2 = this.f73742c;
            if (str2 != null) {
                cVar.setSubTitle(str2);
            }
            Integer a2 = StyleHelper.f73802a.mo104593a(this.f73743d);
            if (a2 != null) {
                cVar.setSubTitleColor(a2.intValue());
            }
            Integer a3 = StyleHelper.f73802a.mo104593a(this.f73745f);
            int i3 = 0;
            if (a3 != null) {
                i2 = a3.intValue();
            } else {
                i2 = 0;
            }
            Integer a4 = StyleHelper.f73802a.mo104593a(this.f73744e);
            if (a4 != null) {
                i3 = a4.intValue();
            }
            cVar.mo104532a(i2, i3);
            Integer a5 = StyleHelper.f73802a.mo104593a(this.f73748i);
            if (a5 != null) {
                cVar.setCloseIconColor(a5.intValue());
            }
            Boolean bool = this.f73747h;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            cVar.setCloseable(z);
            List<? extends BannerTemplateContent.BannerTemplateItemData> list = this.f73749j;
            if (list == null) {
                list = Collections.emptyList();
                Intrinsics.checkExpressionValueIsNotNull(list, "Collections.emptyList()");
            }
            cVar.setContentListData(list);
            cVar.setBannerViewCallback(this.f73750k);
            return cVar;
        }
    }

    public final void setBannerViewCallback(AbstractC29484e eVar) {
        this.f73732a = eVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n¸\u0006\u000b"}, d2 = {"com/ss/android/lark/banner/view/BannerTemplateView$initContentList$1$1$1", "Lcom/ss/android/lark/banner/view/BannerTemplateView$TemplateItemAdapter$OnItemClickListener;", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "link", "", "core_banner_banner_release", "com/ss/android/lark/banner/view/BannerTemplateView$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.c$f */
    public static final class C29510f implements TemplateItemAdapter.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ BannerTemplateView f73766a;

        C29510f(BannerTemplateView cVar) {
            this.f73766a = cVar;
        }

        @Override // com.ss.android.lark.banner.view.BannerTemplateView.TemplateItemAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo104557a(View view, int i, String str) {
            AbstractC29484e eVar = this.f73766a.f73732a;
            if (eVar != null) {
                eVar.mo104368a(view, str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/banner/view/BannerTemplateView$initViews$2", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.c$h */
    public static final class View$OnAttachStateChangeListenerC29512h implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ BannerTemplateView f73768a;

        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC29512h(BannerTemplateView cVar) {
            this.f73768a = cVar;
        }

        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            AbstractC29484e eVar = this.f73768a.f73732a;
            if (eVar != null) {
                eVar.mo104367a(view);
            }
            this.f73768a.removeOnAttachStateChangeListener(this);
        }
    }

    public final void setCloseIconColor(int i) {
        CloseIcon closeIcon = this.f73737f;
        if (closeIcon != null) {
            closeIcon.mo104527a(i);
        }
    }

    public final void setSubTitleColor(int i) {
        TextView textView = this.f73736e;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void setTitleColor(int i) {
        TextView textView = this.f73735d;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0011R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/banner/view/BannerTemplateView$TemplateItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "style", "", "(Landroid/content/Context;I)V", "backImageIv", "Landroid/widget/ImageView;", "cardLayout", "Landroid/view/View;", "frontImageIv", "titleTv", "Landroid/widget/TextView;", "setBackImageUrl", "", "imageUrl", "", "setBgColor", "bgColor", "borderColor", "setFrontImageUrl", "setTitle", "title", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.c$d */
    public static final class TemplateItemView extends FrameLayout {

        /* renamed from: a */
        private View f73760a;

        /* renamed from: b */
        private TextView f73761b;

        /* renamed from: c */
        private ImageView f73762c;

        /* renamed from: d */
        private ImageView f73763d;

        /* renamed from: e */
        private final int f73764e;

        public final void setTitle(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            TextView textView = this.f73761b;
            if (textView != null) {
                textView.setText(str);
            }
        }

        public final void setBackImageUrl(String str) {
            Intrinsics.checkParameterIsNotNull(str, "imageUrl");
            ImageView imageView = this.f73763d;
            if (imageView != null) {
                ImageLoader.with(getContext()).load(str).asDrawable().into(imageView);
            }
        }

        public final void setFrontImageUrl(String str) {
            Intrinsics.checkParameterIsNotNull(str, "imageUrl");
            ImageView imageView = this.f73762c;
            if (imageView != null) {
                ImageLoader.with(getContext()).load(str).asDrawable().into(imageView);
            }
        }

        /* renamed from: a */
        public final void mo104559a(int i, int i2) {
            View view = this.f73760a;
            if (view != null) {
                StyleHelper.Companion aVar = StyleHelper.f73802a;
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                view.setBackground(StyleHelper.Companion.m108718b(aVar, context, BitmapDescriptorFactory.HUE_RED, i, 0, i2, 10, null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TemplateItemView(Context context, @BannerTemplateContent.LayoutStyle int i) {
            super(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f73764e = i;
            if (i == 1) {
                LayoutInflater.from(context).inflate(R.layout.banner_template_item_1, (ViewGroup) this, true);
                ImageView imageView = (ImageView) findViewById(R.id.front_pic);
                this.f73762c = imageView;
                this.f73763d = imageView;
            } else if (i != 2) {
                LayoutInflater.from(context).inflate(R.layout.banner_template_item_3, (ViewGroup) this, true);
                this.f73762c = (ImageView) findViewById(R.id.front_pic);
                this.f73763d = (ImageView) findViewById(R.id.back_pic);
            } else {
                LayoutInflater.from(context).inflate(R.layout.banner_template_item_2, (ViewGroup) this, true);
                this.f73762c = (ImageView) findViewById(R.id.front_pic);
                this.f73763d = (ImageView) findViewById(R.id.back_pic);
            }
            this.f73760a = findViewById(R.id.card_layout);
            this.f73761b = (TextView) findViewById(R.id.title);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.c$g */
    public static final class View$OnClickListenerC29511g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannerTemplateView f73767a;

        View$OnClickListenerC29511g(BannerTemplateView cVar) {
            this.f73767a = cVar;
        }

        public final void onClick(View view) {
            AbstractC29484e eVar = this.f73767a.f73732a;
            if (eVar != null) {
                eVar.mo104371b(view);
            }
        }
    }

    public final void setCloseable(boolean z) {
        int i;
        CloseIcon closeIcon = this.f73737f;
        if (closeIcon != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            closeIcon.setVisibility(i);
        }
    }

    public final void setContentListData(List<? extends BannerTemplateContent.BannerTemplateItemData> list) {
        Intrinsics.checkParameterIsNotNull(list, "dataList");
        TemplateItemAdapter cVar = this.f73739h;
        if (cVar != null) {
            cVar.mo104556a(list);
        }
    }

    public final void setSubTitle(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "text");
        String str2 = str;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView = this.f73736e;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.f73736e;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.f73736e;
        if (textView3 != null) {
            textView3.setText(str2);
        }
    }

    public final void setTitle(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "text");
        String str2 = str;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView = this.f73735d;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.f73735d;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.f73735d;
        if (textView3 != null) {
            textView3.setText(str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerTemplateView(Context context, @BannerTemplateContent.LayoutStyle int i) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f73733b = i;
        LayoutInflater.from(context).inflate(R.layout.banner_template, (ViewGroup) this, true);
        m108662a();
    }

    /* renamed from: a */
    public final void mo104532a(int i, int i2) {
        View view = this.f73734c;
        if (view != null) {
            int dp2px = UIUtils.dp2px(getContext(), 1.0f);
            StyleHelper.Companion aVar = StyleHelper.f73802a;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            view.setBackground(StyleHelper.Companion.m108717a(aVar, context, BitmapDescriptorFactory.HUE_RED, i, dp2px, i2, 2, null));
            setPadding(dp2px, dp2px, dp2px, dp2px);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/banner/view/BannerTemplateView$SpaceItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "start", "", "space", "end", "(III)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.c$b */
    public static final class SpaceItemDecoration extends RecyclerView.AbstractC1335d {

        /* renamed from: a */
        private final int f73751a;

        /* renamed from: b */
        private final int f73752b;

        /* renamed from: c */
        private final int f73753c;

        public SpaceItemDecoration(int i, int i2, int i3) {
            this.f73751a = i;
            this.f73752b = i2;
            this.f73753c = i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            int i2;
            int i3;
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                i = adapter.getItemCount();
            } else {
                i = 0;
            }
            if (childAdapterPosition < i) {
                rect.top = 0;
                if (childAdapterPosition == 1) {
                    i2 = this.f73751a;
                } else {
                    i2 = this.f73752b;
                }
                rect.left = i2;
                if (childAdapterPosition == i - 1) {
                    i3 = this.f73753c;
                } else {
                    i3 = 0;
                }
                rect.right = i3;
                rect.bottom = 0;
                return;
            }
            super.getItemOffsets(rect, view, recyclerView, state);
        }
    }
}
