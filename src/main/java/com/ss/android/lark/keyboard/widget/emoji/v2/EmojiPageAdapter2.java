package com.ss.android.lark.keyboard.widget.emoji.v2;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.keyboard.widget.emoji.EmojiMapHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004!\"#$B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\u0015R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageAdapter2;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiViewData;", "itemContainerWidth", "", "(I)V", "containerPadding", "emojiHeight", "mListener", "Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageAdapter2$OnEmojiSelectListener;", "createEmojiItemView", "Landroid/view/View;", "context", "Landroid/content/Context;", "createTitleItemView", "getItemId", "", "position", "getItemViewType", "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnEmojiSelectListener", "listener", "unRegisterListener", "Companion", "EmojiItemViewHolder", "OnEmojiSelectListener", "TitleViewHolder", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.b */
public final class EmojiPageAdapter2 extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, EmojiViewData> {

    /* renamed from: b */
    public static final Companion f104832b = new Companion(null);

    /* renamed from: a */
    public OnEmojiSelectListener f104833a;

    /* renamed from: c */
    private final int f104834c = UIHelper.dp2px(32.0f);

    /* renamed from: d */
    private final int f104835d = UIHelper.dp2px(8.0f);

    /* renamed from: e */
    private final int f104836e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageAdapter2$OnEmojiSelectListener;", "", "onSelectEmoji", "", "reactionKey", "", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.b$c */
    public interface OnEmojiSelectListener {
        /* renamed from: a */
        void mo148268a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageAdapter2$Companion;", "", "()V", "LOG_TAG", "", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageAdapter2$EmojiItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageAdapter2;Landroid/view/View;)V", "itemContainer", "getItemContainer", "()Landroid/view/View;", "itemEmoji", "Landroid/widget/ImageView;", "getItemEmoji", "()Landroid/widget/ImageView;", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.b$b */
    public final class EmojiItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ EmojiPageAdapter2 f104837a;

        /* renamed from: b */
        private final ImageView f104838b;

        /* renamed from: c */
        private final View f104839c;

        /* renamed from: a */
        public final ImageView mo148267a() {
            return this.f104838b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EmojiItemViewHolder(EmojiPageAdapter2 bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f104837a = bVar;
            View findViewById = view.findViewById(R.id.itemEmoji);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.itemEmoji)");
            this.f104838b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.item_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.item_container)");
            this.f104839c = findViewById2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageAdapter2$TitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageAdapter2;Landroid/view/View;)V", "itemTitle", "Landroid/widget/TextView;", "getItemTitle", "()Landroid/widget/TextView;", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.b$d */
    public final class TitleViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ EmojiPageAdapter2 f104840a;

        /* renamed from: b */
        private final TextView f104841b;

        /* renamed from: a */
        public final TextView mo148269a() {
            return this.f104841b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(EmojiPageAdapter2 bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f104840a = bVar;
            View findViewById = view.findViewById(R.id.title_text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.title_text)");
            this.f104841b = (TextView) findViewById;
        }
    }

    /* renamed from: a */
    public final void mo148265a() {
        this.f104833a = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.b$f */
    static final class View$OnClickListenerC41109f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EmojiPageAdapter2 f104844a;

        /* renamed from: b */
        final /* synthetic */ EmojiViewData f104845b;

        View$OnClickListenerC41109f(EmojiPageAdapter2 bVar, EmojiViewData dVar) {
            this.f104844a = bVar;
            this.f104845b = dVar;
        }

        public final void onClick(View view) {
            OnEmojiSelectListener cVar = this.f104844a.f104833a;
            if (cVar != null) {
                cVar.mo148268a(this.f104845b.mo148274a());
            }
        }
    }

    /* renamed from: a */
    public final void mo148266a(OnEmojiSelectListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f104833a = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((EmojiViewData) getItem(i)).mo148275b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageAdapter2$onAttachedToRecyclerView$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.b$e */
    public static final class C41108e extends GridLayoutManager.AbstractC1297b {

        /* renamed from: c */
        final /* synthetic */ EmojiPageAdapter2 f104842c;

        /* renamed from: d */
        final /* synthetic */ GridLayoutManager f104843d;

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
        /* renamed from: a */
        public int mo6533a(int i) {
            if (this.f104842c.getItemViewType(i) == 0) {
                return this.f104843d.mo6502b();
            }
            return 1;
        }

        C41108e(EmojiPageAdapter2 bVar, GridLayoutManager gridLayoutManager) {
            this.f104842c = bVar;
            this.f104843d = gridLayoutManager;
        }
    }

    public EmojiPageAdapter2(int i) {
        this.f104836e = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        EmojiViewData dVar = (EmojiViewData) getItem(i);
        if (dVar != null) {
            return (long) dVar.mo148274a().hashCode();
        }
        return super.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.mo6501a(new C41108e(this, gridLayoutManager));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    /* renamed from: b */
    private final View m163036b(Context context) {
        TextView textView = new TextView(context);
        textView.setId(R.id.title_text);
        textView.setTextSize(12.0f);
        textView.setTextColor(UIUtils.getColor(context, R.color.text_caption));
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        return textView;
    }

    /* renamed from: a */
    private final View m163035a(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.item_container);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f104836e, this.f104834c + (this.f104835d * 2));
        relativeLayout.setBackgroundResource(R.drawable.item_emoji_bg);
        relativeLayout.setLayoutParams(marginLayoutParams);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.itemEmoji);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.f104834c);
        layoutParams.addRule(13, -1);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        relativeLayout.addView(imageView, layoutParams);
        return relativeLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == 0) {
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
            return new TitleViewHolder(this, m163036b(context));
        }
        Context context2 = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "parent.context");
        return new EmojiItemViewHolder(this, m163035a(context2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        EmojiViewData dVar = (EmojiViewData) getItem(i);
        if (dVar == null || C57782ag.m224241a(dVar.mo148274a())) {
            View view = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            view.setVisibility(8);
            return;
        }
        View view2 = viewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        boolean z = false;
        view2.setVisibility(0);
        if (getItemViewType(i) == 0) {
            ((TitleViewHolder) viewHolder).mo148269a().setText(dVar.mo148274a());
            return;
        }
        EmojiItemViewHolder bVar = (EmojiItemViewHolder) viewHolder;
        Bitmap c = EmojiMapHandler.m162995c(dVar.mo148274a());
        StringBuilder sb = new StringBuilder();
        sb.append("reaction key = ");
        sb.append(dVar.mo148274a());
        sb.append(", bitmap == null: ");
        if (c == null) {
            z = true;
        }
        sb.append(z);
        Log.m165389i("EmojiPageAdapter2", sb.toString());
        if (c != null) {
            bVar.mo148267a().setImageBitmap(c);
            bVar.itemView.setOnClickListener(new View$OnClickListenerC41109f(this, dVar));
            return;
        }
        bVar.mo148267a().setImageResource(R.drawable.icon_default_reaction);
    }
}
