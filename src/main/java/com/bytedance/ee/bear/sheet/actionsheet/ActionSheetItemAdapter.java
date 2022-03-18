package com.bytedance.ee.bear.sheet.actionsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u0014\u0010\u001e\u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060 R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItemAdapter$ViewsVH;", "()V", "mItemList", "", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItem;", "onItemClickListener", "Lkotlin/Function1;", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onRightIconClickListener", "Lkotlin/Function2;", "Lcom/bytedance/ee/bear/sheet/actionsheet/RightIcon;", "getOnRightIconClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnRightIconClickListener", "(Lkotlin/jvm/functions/Function2;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateItemList", "list", "", "ViewsVH", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.a.d */
public final class ActionSheetItemAdapter extends RecyclerView.Adapter<ViewsVH> {

    /* renamed from: a */
    private List<ActionSheetItem> f29669a = new ArrayList();

    /* renamed from: b */
    private Function1<? super ActionSheetItem, Unit> f29670b;

    /* renamed from: c */
    private Function2<? super ActionSheetItem, ? super RightIcon, Unit> f29671c;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.sheet.a.c, kotlin.Unit>, kotlin.jvm.functions.Function1<com.bytedance.ee.bear.sheet.a.c, kotlin.Unit> */
    /* renamed from: a */
    public final Function1<ActionSheetItem, Unit> mo42043a() {
        return this.f29670b;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.k<? super com.bytedance.ee.bear.sheet.a.c, ? super com.bytedance.ee.bear.sheet.a.h, kotlin.Unit>, kotlin.jvm.functions.k<com.bytedance.ee.bear.sheet.a.c, com.bytedance.ee.bear.sheet.a.h, kotlin.Unit> */
    /* renamed from: b */
    public final Function2<ActionSheetItem, RightIcon, Unit> mo42048b() {
        return this.f29671c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f29669a.size();
    }

    /* renamed from: a */
    public final void mo42046a(Function1<? super ActionSheetItem, Unit> function1) {
        this.f29670b = function1;
    }

    /* renamed from: a */
    public final void mo42047a(Function2<? super ActionSheetItem, ? super RightIcon, Unit> kVar) {
        this.f29671c = kVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItemAdapter$ViewsVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItemAdapter;Landroid/view/View;)V", "container", "Landroid/widget/RelativeLayout;", "leftIconIv", "Landroid/widget/ImageView;", "rightIconsContainer", "Landroid/widget/LinearLayout;", "rightImageMarginEnd", "", "rightImageSize", "titleTv", "Landroid/widget/TextView;", "bindContainer", "", "viewItem", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItem;", "bindLeftIcon", "context", "Landroid/content/Context;", "bindRightIcons", "bindText", "bindView", "createRightIconIV", "rightIcon", "Lcom/bytedance/ee/bear/sheet/actionsheet/RightIcon;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.a.d$a */
    public final class ViewsVH extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public RelativeLayout f29672a;

        /* renamed from: b */
        final /* synthetic */ ActionSheetItemAdapter f29673b;

        /* renamed from: c */
        private final TextView f29674c;

        /* renamed from: d */
        private final ImageView f29675d;

        /* renamed from: e */
        private final LinearLayout f29676e;

        /* renamed from: f */
        private final int f29677f;

        /* renamed from: g */
        private final int f29678g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/sheet/actionsheet/ActionSheetItemAdapter$ViewsVH$createRightIconIV$1$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.sheet.a.d$a$a */
        public static final class C11025a extends AbstractView$OnClickListenerC11839e {

            /* renamed from: a */
            final /* synthetic */ ViewsVH f29680a;

            /* renamed from: b */
            final /* synthetic */ RightIcon f29681b;

            /* renamed from: c */
            final /* synthetic */ Context f29682c;

            /* renamed from: d */
            final /* synthetic */ ActionSheetItem f29683d;

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                Function2<ActionSheetItem, RightIcon, Unit> b = this.f29680a.f29673b.mo42048b();
                if (b != null) {
                    b.invoke(this.f29683d, this.f29681b);
                }
            }

            C11025a(ViewsVH aVar, RightIcon hVar, Context context, ActionSheetItem cVar) {
                this.f29680a = aVar;
                this.f29681b = hVar;
                this.f29682c = context;
                this.f29683d = cVar;
            }
        }

        /* renamed from: b */
        private final void m45916b(ActionSheetItem cVar) {
            this.f29672a.setTag(cVar);
            this.f29672a.setEnabled(cVar.mo42041f());
            this.f29672a.setClickable(cVar.mo42041f());
        }

        /* renamed from: a */
        public final void mo42049a(ActionSheetItem cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "viewItem");
            Context context = this.f29672a.getContext();
            m45916b(cVar);
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            m45914a(context, cVar);
            m45915b(context, cVar);
            m45917c(context, cVar);
        }

        /* renamed from: b */
        private final void m45915b(Context context, ActionSheetItem cVar) {
            this.f29674c.setText(cVar.mo42040e());
            Integer a = cVar.mo42034a();
            if (a != null) {
                this.f29674c.setTextColor(ColorStateList.valueOf(context.getResources().getColor(a.intValue())));
            }
            this.f29674c.setEnabled(cVar.mo42041f());
        }

        /* renamed from: c */
        private final void m45917c(Context context, ActionSheetItem cVar) {
            this.f29676e.removeAllViews();
            List<RightIcon> c = cVar.mo42038c();
            if (c != null) {
                Iterator<T> it = c.iterator();
                while (it.hasNext()) {
                    this.f29676e.addView(m45913a(context, cVar, it.next()));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewsVH(ActionSheetItemAdapter dVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f29673b = dVar;
            View findViewById = view.findViewById(R.id.item_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.item_container)");
            this.f29672a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_item_content);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.tv_item_content)");
            this.f29674c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.iv_left_icon);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.iv_left_icon)");
            this.f29675d = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.iv_right_icons_layout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(\n …id.iv_right_icons_layout)");
            this.f29676e = (LinearLayout) findViewById4;
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            this.f29677f = context.getResources().getDimensionPixelOffset(R.dimen.space_kit_len_24);
            Context context2 = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "itemView.context");
            this.f29678g = context2.getResources().getDimensionPixelOffset(R.dimen.space_kit_len_16);
            this.f29672a.setOnClickListener(new AbstractView$OnClickListenerC11839e(this) {
                /* class com.bytedance.ee.bear.sheet.actionsheet.ActionSheetItemAdapter.ViewsVH.C110241 */

                /* renamed from: a */
                final /* synthetic */ ViewsVH f29679a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f29679a = r1;
                }

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    Object tag = this.f29679a.f29672a.getTag();
                    if (tag != null) {
                        ActionSheetItem cVar = (ActionSheetItem) tag;
                        Function1<ActionSheetItem, Unit> a = this.f29679a.f29673b.mo42043a();
                        if (a != null) {
                            a.invoke(cVar);
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.sheet.actionsheet.ActionSheetItem");
                }
            });
        }

        /* renamed from: a */
        private final void m45914a(Context context, ActionSheetItem cVar) {
            LeftIcon b = cVar.mo42037b();
            if (b != null) {
                this.f29675d.setImageResource(b.mo42032a());
                Integer b2 = b.mo42033b();
                if (b2 != null) {
                    this.f29675d.setImageTintList(ColorStateList.valueOf(context.getResources().getColor(b2.intValue())));
                }
                this.f29675d.setEnabled(cVar.mo42041f());
                this.f29675d.setVisibility(0);
                return;
            }
            this.f29675d.setVisibility(8);
        }

        /* renamed from: a */
        private final ImageView m45913a(Context context, ActionSheetItem cVar, RightIcon hVar) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(hVar.mo42032a());
            Integer b = hVar.mo42033b();
            if (b != null) {
                imageView.setImageTintList(ColorStateList.valueOf(context.getResources().getColor(b.intValue())));
            }
            imageView.setClickable(hVar.mo42066d());
            if (imageView.isClickable()) {
                imageView.setOnClickListener(new C11025a(this, hVar, context, cVar));
            }
            int i = this.f29677f;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.setMarginEnd(this.f29678g);
            imageView.setLayoutParams(layoutParams);
            imageView.setEnabled(cVar.mo42041f());
            return imageView;
        }
    }

    /* renamed from: a */
    public final void mo42045a(List<? extends ActionSheetItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (!Intrinsics.areEqual(this.f29669a, list)) {
            this.f29669a.clear();
            this.f29669a.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public ViewsVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheets_actionsheet_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…heet_item, parent, false)");
        return new ViewsVH(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewsVH aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (i < this.f29669a.size()) {
            aVar.mo42049a(this.f29669a.get(i));
        }
    }
}
