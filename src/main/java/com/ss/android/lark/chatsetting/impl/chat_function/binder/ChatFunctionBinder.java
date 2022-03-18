package com.ss.android.lark.chatsetting.impl.chat_function.binder;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.utils.MagicWindowUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionBadge;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionBinder;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/binder/ChatFunctionBinder;", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;", "Lcom/ss/android/lark/chatsetting/impl/chat_function/binder/ChatFunctionBinder$ChatFunctionViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bindItemBadge", "", "viewHolder", "item", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "bindItemIcon", "createItemSideMenu", "Landroid/view/View;", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "inflater", "Landroid/view/LayoutInflater;", "ChatFunctionViewHolder", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.a.a.a */
public final class ChatFunctionBinder extends IChatFunctionBinder<ChatFunctionViewHolder> {

    /* renamed from: a */
    public static final Companion f89009a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/binder/ChatFunctionBinder$ChatFunctionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "badgeView", "Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "getBadgeView", "()Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "sideMenuImage", "Landroid/widget/ImageView;", "getSideMenuImage", "()Landroid/widget/ImageView;", "sideMenuText", "Landroid/widget/TextView;", "getSideMenuText", "()Landroid/widget/TextView;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.a.a$a */
    public static final class ChatFunctionViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ImageView f89010a;

        /* renamed from: b */
        private final TextView f89011b;

        /* renamed from: c */
        private final LKUIBadgeView f89012c;

        /* renamed from: a */
        public final ImageView mo127553a() {
            return this.f89010a;
        }

        /* renamed from: b */
        public final TextView mo127554b() {
            return this.f89011b;
        }

        /* renamed from: c */
        public final LKUIBadgeView mo127555c() {
            return this.f89012c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChatFunctionViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.image_side_menu);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.image_side_menu)");
            this.f89010a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.text_side_menu);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.text_side_menu)");
            this.f89011b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.badge_view);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.badge_view)");
            this.f89012c = (LKUIBadgeView) findViewById3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/binder/ChatFunctionBinder$Companion;", "", "()V", "MENU_ICON_SIZE_IN_DP", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.a.a$b */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatFunctionBinder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final View m133947a(Context context) {
        int i;
        Integer f = MagicWindowUtil.m224688f(context);
        if (f != null) {
            i = f.intValue();
        } else {
            i = 0;
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new ConstraintLayout.LayoutParams((i - (UIUtils.dp2px(context, (float) 8) * 2)) / 5, -2));
        LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(context, null, 0, 6, null);
        lKUIRoundedImageView2.setId(R.id.image_side_menu);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(UIUtils.dp2px(context, 24.0f), UIUtils.dp2px(context, 24.0f));
        layoutParams.topMargin = UIUtils.dp2px(context, 16.0f);
        layoutParams.f2812d = 0;
        layoutParams.f2815g = 0;
        layoutParams.f2816h = 0;
        lKUIRoundedImageView2.setOval(false);
        constraintLayout.addView(lKUIRoundedImageView2, layoutParams);
        int dp2px = UIUtils.dp2px(context, 12.0f);
        LKUIBadgeView lKUIBadgeView = new LKUIBadgeView(context);
        lKUIBadgeView.setId(R.id.badge_view);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(dp2px, dp2px);
        lKUIBadgeView.setVisibility(4);
        layoutParams2.f2821m = lKUIRoundedImageView2.getId();
        layoutParams2.f2822n = UIUtils.dp2px(context, 16.0f);
        layoutParams2.f2823o = 45.0f;
        constraintLayout.addView(lKUIBadgeView, layoutParams2);
        TextView textView = new TextView(context);
        textView.setId(R.id.text_side_menu);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = UIUtils.dp2px(context, 2.0f);
        layoutParams3.f2817i = lKUIRoundedImageView2.getId();
        layoutParams3.f2812d = 0;
        layoutParams3.f2815g = 0;
        layoutParams3.f2819k = 0;
        layoutParams3.f2783A = BitmapDescriptorFactory.HUE_RED;
        textView.setTextColor(UIUtils.getColor(context, R.color.text_placeholder));
        textView.setTextSize(2, 12.0f);
        textView.setGravity(1);
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setHyphenationFrequency(2);
            textView.setBreakStrategy(2);
        }
        textView.setMaxWidth(UIHelper.dp2px(60.0f));
        constraintLayout.addView(textView, layoutParams3);
        return constraintLayout;
    }

    /* renamed from: a */
    public ChatFunctionViewHolder mo127552b(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return new ChatFunctionViewHolder(m133947a(mo197618c()));
    }

    /* renamed from: b */
    private final void m133948b(ChatFunctionViewHolder aVar, IChatFunctionItem dVar) {
        if (dVar.mo127579g() >= 0) {
            aVar.mo127553a().setImageResource(dVar.mo127579g());
            return;
        }
        String e = dVar.mo127577e();
        if (e != null) {
            ImageLoader.with(mo197618c()).load(new C38824b(e)).override(UIHelper.dp2px(36.0f), UIHelper.dp2px(36.0f)).into(aVar.mo127553a());
        }
    }

    /* renamed from: a */
    public void mo127550a(ChatFunctionViewHolder aVar, IChatFunctionItem dVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewHolder");
        Intrinsics.checkParameterIsNotNull(dVar, "item");
        aVar.mo127554b().setText(dVar.mo127576d());
        m133948b(aVar, dVar);
        m133949c(aVar, dVar);
    }

    /* renamed from: c */
    private final void m133949c(ChatFunctionViewHolder aVar, IChatFunctionItem dVar) {
        ChatFunctionBadge b = dVar.mo127574b();
        if (b == null) {
            return;
        }
        if (b.mo197616c() != 0) {
            aVar.mo127555c().setVisibility(0);
            aVar.mo127555c().mo89319a(String.valueOf(b.mo197616c())).mo89316a(12.0f).mo89317a(UIHelper.getColor(R.color.lkui_N00)).mo89322b(b.mo197611a()).mo89320a();
            return;
        }
        ChatFunctionBadge b2 = dVar.mo127574b();
        if (b2 == null || !b2.mo197615b()) {
            aVar.mo127555c().setVisibility(4);
            return;
        }
        aVar.mo127555c().setVisibility(0);
        aVar.mo127555c().mo89322b(b.mo197611a()).mo89320a();
    }
}
