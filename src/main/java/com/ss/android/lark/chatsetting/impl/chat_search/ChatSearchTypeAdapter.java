package com.ss.android.lark.chatsetting.impl.chat_search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.MagicWindowUtil;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchTypeAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchTypeAdapter$SearchItemViewHolder;", "Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchTypeBean;", "()V", "listener", "Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchTypeAdapter$OnItemSelectListener;", "createItemView", "Landroid/view/View;", "context", "Landroid/content/Context;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItemSelectListener", "OnItemSelectListener", "SearchItemViewHolder", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.chat_search.b */
public final class ChatSearchTypeAdapter extends LarkRecyclerViewBaseAdapter<SearchItemViewHolder, ChatSearchTypeBean> {

    /* renamed from: a */
    public OnItemSelectListener f89128a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchTypeAdapter$OnItemSelectListener;", "", "onItemSelect", "", "position", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.chat_search.b$a */
    public interface OnItemSelectListener {
        /* renamed from: a */
        void mo127606a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchTypeAdapter$SearchItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchTypeAdapter;Landroid/view/View;)V", "imageIv", "Landroid/widget/ImageView;", "getImageIv", "()Landroid/widget/ImageView;", "labelTv", "Landroid/widget/TextView;", "getLabelTv", "()Landroid/widget/TextView;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.chat_search.b$b */
    public final class SearchItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ ChatSearchTypeAdapter f89129a;

        /* renamed from: b */
        private final ImageView f89130b;

        /* renamed from: c */
        private final TextView f89131c;

        /* renamed from: a */
        public final ImageView mo127610a() {
            return this.f89130b;
        }

        /* renamed from: b */
        public final TextView mo127611b() {
            return this.f89131c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SearchItemViewHolder(ChatSearchTypeAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f89129a = bVar;
            View findViewById = view.findViewById(R.id.image_side_menu);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.image_side_menu)");
            this.f89130b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.text_side_menu);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.text_side_menu)");
            this.f89131c = (TextView) findViewById2;
        }
    }

    /* renamed from: a */
    public final void mo127608a(OnItemSelectListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f89128a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.chat_search.b$c */
    public static final class View$OnClickListenerC34528c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatSearchTypeAdapter f89132a;

        /* renamed from: b */
        final /* synthetic */ int f89133b;

        View$OnClickListenerC34528c(ChatSearchTypeAdapter bVar, int i) {
            this.f89132a = bVar;
            this.f89133b = i;
        }

        public final void onClick(View view) {
            ChatSearchTypeAdapter.m134101a(this.f89132a).mo127606a(this.f89133b);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ OnItemSelectListener m134101a(ChatSearchTypeAdapter bVar) {
        OnItemSelectListener aVar = bVar.f89128a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
        }
        return aVar;
    }

    /* renamed from: a */
    private final View m134100a(Context context) {
        int i;
        Integer f = MagicWindowUtil.m224688f(context);
        if (f != null) {
            i = f.intValue();
        } else {
            i = 0;
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new LinearLayout.LayoutParams((i - (UIHelper.dp2px((float) 8) * 2)) / 5, -2));
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.image_side_menu);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(UIHelper.dp2px(20.0f), UIHelper.dp2px(20.0f));
        layoutParams.f2812d = 0;
        layoutParams.f2815g = 0;
        layoutParams.f2816h = 0;
        constraintLayout.addView(imageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setId(R.id.text_side_menu);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = UIHelper.dp2px(2.0f);
        layoutParams2.f2817i = imageView.getId();
        layoutParams2.f2812d = 0;
        layoutParams2.f2815g = 0;
        layoutParams2.f2819k = 0;
        layoutParams2.f2783A = BitmapDescriptorFactory.HUE_RED;
        textView.setTextColor(C57582a.m223616d(context, R.color.text_placeholder));
        textView.setTextSize(2, 12.0f);
        textView.setGravity(1);
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setHyphenationFrequency(2);
            textView.setBreakStrategy(2);
        }
        textView.setMaxWidth(UIHelper.dp2px(60.0f));
        constraintLayout.addView(textView, layoutParams2);
        return constraintLayout;
    }

    /* renamed from: a */
    public SearchItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        return new SearchItemViewHolder(this, m134100a(context));
    }

    /* renamed from: a */
    public void onBindViewHolder(SearchItemViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        ChatSearchTypeBean cVar = (ChatSearchTypeBean) getItem(i);
        bVar.mo127611b().setText(cVar.mo127614b());
        Context context = bVar.mo127610a().getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "holder.imageIv.context");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, cVar.mo127615c());
        Context context2 = bVar.mo127610a().getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "holder.imageIv.context");
        iconDrawable.setTint(UDColorUtils.getColor(context2, R.color.icon_n2));
        bVar.mo127610a().setImageDrawable(iconDrawable);
        bVar.itemView.setOnClickListener(new View$OnClickListenerC34528c(this, i));
    }
}
