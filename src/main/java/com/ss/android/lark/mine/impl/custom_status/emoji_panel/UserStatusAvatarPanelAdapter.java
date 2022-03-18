package com.ss.android.lark.mine.impl.custom_status.emoji_panel;

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
import com.ss.android.lark.keyboard.widget.emoji.EmojiMapHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.impl.custom_status.CustomStatusUIUtils;
import com.ss.android.lark.mine.impl.custom_status.emoji_panel.UserStatusAvatarPanelController;
import com.ss.android.lark.utils.C57782ag;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003&'(B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\nJ\u0014\u0010#\u001a\u00020\u00182\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100%R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "itemContainerWidth", "", "(Landroid/content/Context;I)V", "avatarHeight", "clickListener", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController$OnAvatarItemClickListener;", "containerPadding", "getContext", "()Landroid/content/Context;", "statusAvatarKeyList", "", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/AvatarViewData;", "createEmojiItemView", "Landroid/view/View;", "createTitleItemView", "getItemCount", "getItemViewType", "position", "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickListener", "listener", "setStatusAvatarKeyList", "values", "", "AvatarViewHolder", "Companion", "TextViewHolder", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.b */
public final class UserStatusAvatarPanelAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: b */
    public static final Companion f115073b = new Companion(null);

    /* renamed from: a */
    public UserStatusAvatarPanelController.OnAvatarItemClickListener f115074a;

    /* renamed from: c */
    private final List<AvatarViewData> f115075c = new ArrayList();

    /* renamed from: d */
    private final int f115076d = CustomStatusUIUtils.f115068a.mo160434a(32);

    /* renamed from: e */
    private final int f115077e = CustomStatusUIUtils.f115068a.mo160434a(8);

    /* renamed from: f */
    private final Context f115078f;

    /* renamed from: g */
    private final int f115079g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelAdapter$AvatarViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelAdapter;Landroid/view/View;)V", "avatar", "Landroid/widget/ImageView;", "getAvatar", "()Landroid/widget/ImageView;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.b$a */
    public final class AvatarViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ UserStatusAvatarPanelAdapter f115080a;

        /* renamed from: b */
        private final ImageView f115081b;

        /* renamed from: a */
        public final ImageView mo160444a() {
            return this.f115081b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AvatarViewHolder(UserStatusAvatarPanelAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f115080a = bVar;
            View findViewById = view.findViewById(R.id.avatar_panel_image);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.avatar_panel_image)");
            this.f115081b = (ImageView) findViewById;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelAdapter$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.b$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelAdapter$TextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelAdapter;Landroid/view/View;)V", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.b$c */
    public final class TextViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ UserStatusAvatarPanelAdapter f115082a;

        /* renamed from: b */
        private final TextView f115083b;

        /* renamed from: a */
        public final TextView mo160445a() {
            return this.f115083b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TextViewHolder(UserStatusAvatarPanelAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f115082a = bVar;
            View findViewById = view.findViewById(R.id.avatar_panel_title);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.avatar_panel_title)");
            this.f115083b = (TextView) findViewById;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f115075c.size();
    }

    /* renamed from: a */
    public final void mo160442a(UserStatusAvatarPanelController.OnAvatarItemClickListener bVar) {
        this.f115074a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.b$e */
    static final class View$OnClickListenerC45478e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserStatusAvatarPanelAdapter f115086a;

        /* renamed from: b */
        final /* synthetic */ AvatarViewData f115087b;

        View$OnClickListenerC45478e(UserStatusAvatarPanelAdapter bVar, AvatarViewData aVar) {
            this.f115086a = bVar;
            this.f115087b = aVar;
        }

        public final void onClick(View view) {
            UserStatusAvatarPanelController.OnAvatarItemClickListener bVar = this.f115086a.f115074a;
            if (bVar != null) {
                bVar.mo160399a(this.f115087b.mo160437a());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelAdapter$onAttachedToRecyclerView$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.b$d */
    public static final class C45477d extends GridLayoutManager.AbstractC1297b {

        /* renamed from: c */
        final /* synthetic */ UserStatusAvatarPanelAdapter f115084c;

        /* renamed from: d */
        final /* synthetic */ GridLayoutManager f115085d;

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
        /* renamed from: a */
        public int mo6533a(int i) {
            if (this.f115084c.getItemViewType(i) == AvatarType.AVATAR_TITLE.getType()) {
                return this.f115085d.mo6502b();
            }
            return 1;
        }

        C45477d(UserStatusAvatarPanelAdapter bVar, GridLayoutManager gridLayoutManager) {
            this.f115084c = bVar;
            this.f115085d = gridLayoutManager;
        }
    }

    /* renamed from: a */
    public final void mo160443a(List<AvatarViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "values");
        List<AvatarViewData> list2 = this.f115075c;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f115075c.get(i).mo160438b().getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.mo6501a(new C45477d(this, gridLayoutManager));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    /* renamed from: a */
    private final View m180627a(Context context) {
        TextView textView = new TextView(context);
        textView.setId(R.id.avatar_panel_title);
        textView.setTextSize(12.0f);
        textView.setTextColor(UIUtils.getColor(context, R.color.ud_N600));
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        return textView;
    }

    /* renamed from: b */
    private final View m180628b(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.avatar_panel_container);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f115079g, this.f115076d + (this.f115077e * 2));
        relativeLayout.setBackgroundResource(R.drawable.bg_user_status_avatar);
        relativeLayout.setLayoutParams(marginLayoutParams);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.avatar_panel_image);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.f115076d);
        layoutParams.addRule(13, -1);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        relativeLayout.addView(imageView, layoutParams);
        return relativeLayout;
    }

    public UserStatusAvatarPanelAdapter(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f115078f = context;
        this.f115079g = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == AvatarType.AVATAR_TITLE.getType()) {
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
            return new TextViewHolder(this, m180627a(context));
        }
        Context context2 = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "parent.context");
        return new AvatarViewHolder(this, m180628b(context2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        AvatarViewData aVar = this.f115075c.get(i);
        if (aVar == null || C57782ag.m224241a(aVar.mo160437a())) {
            View view = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            view.setVisibility(8);
            return;
        }
        View view2 = viewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        boolean z = false;
        view2.setVisibility(0);
        if (getItemViewType(i) == AvatarType.AVATAR_TITLE.getType()) {
            ((TextViewHolder) viewHolder).mo160445a().setText(aVar.mo160437a());
            return;
        }
        AvatarViewHolder aVar2 = (AvatarViewHolder) viewHolder;
        Bitmap c = EmojiMapHandler.m162995c(aVar.mo160437a());
        StringBuilder sb = new StringBuilder();
        sb.append("reaction key = ");
        sb.append(aVar.mo160437a());
        sb.append(", bitmap == null: ");
        if (c == null) {
            z = true;
        }
        sb.append(z);
        Log.m165389i("UserStatusAvatarPanelAdapter", sb.toString());
        if (c != null) {
            aVar2.mo160444a().setImageBitmap(c);
            aVar2.itemView.setOnClickListener(new View$OnClickListenerC45478e(this, aVar));
            return;
        }
        aVar2.mo160444a().setImageResource(R.drawable.icon_default_reaction);
    }
}
