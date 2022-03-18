package com.ss.android.lark.money.redpacket.cover.preview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.image.ImageLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewAdapter$ViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.cover.preview.a */
public final class CoverPreviewAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private final List<RedPacketCover> f121009a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewAdapter;Landroid/view/View;)V", "image", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.a$a */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ CoverPreviewAdapter f121010a;

        /* renamed from: b */
        private final ImageView f121011b;

        /* renamed from: a */
        public final ImageView mo168297a() {
            return this.f121011b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CoverPreviewAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f121010a = aVar;
            View findViewById = view.findViewById(R.id.cover_image);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.cover_image)");
            this.f121011b = (ImageView) findViewById;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f121009a.size();
    }

    public CoverPreviewAdapter(List<RedPacketCover> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f121009a = list;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_shop_card, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        RedPacketCover redPacketCover = this.f121009a.get(i);
        if (redPacketCover.getId() == -1 || redPacketCover.getMainCover() == null) {
            aVar.mo168297a().setImageResource(R.drawable.default_cover);
            return;
        }
        View view = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        ImageLoader.with(view.getContext()).load(redPacketCover.getMainCover()).placeholder(R.drawable.default_cover).dontAnimate(false).into(aVar.mo168297a());
    }
}
