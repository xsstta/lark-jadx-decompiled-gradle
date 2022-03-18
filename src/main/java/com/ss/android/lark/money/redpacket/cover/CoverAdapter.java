package com.ss.android.lark.money.redpacket.cover;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.money.redpacket.cover.CoverThemeAdapter;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverList;
import com.ss.android.lark.utils.UIHelper;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001a\u001bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/CoverAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/money/redpacket/cover/CoverAdapter$ViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverList;", "dependency", "Lcom/ss/android/lark/money/redpacket/cover/CoverThemeAdapter$ICoverDependency;", "(Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverList;Lcom/ss/android/lark/money/redpacket/cover/CoverThemeAdapter$ICoverDependency;)V", "context", "Landroid/content/Context;", "covers", "", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "getItemCount", "", "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.cover.a */
public final class CoverAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: b */
    public static final RedPacketCover f120974b;

    /* renamed from: c */
    public static final Companion f120975c = new Companion(null);

    /* renamed from: a */
    public final CoverThemeAdapter.ICoverDependency f120976a;

    /* renamed from: d */
    private Context f120977d;

    /* renamed from: e */
    private final List<RedPacketCover> f120978e;

    /* renamed from: f */
    private final RedPacketCoverList f120979f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/CoverAdapter$Companion;", "", "()V", "DEFAULT_COVER", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "getDEFAULT_COVER", "()Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "DEFAULT_COVER_ID", "", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final RedPacketCover mo168264a() {
            return CoverAdapter.f120974b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f120978e.size();
    }

    static {
        String string = UIHelper.getString(R.string.Lark_RedPacket_Theme_Default);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…_RedPacket_Theme_Default)");
        f120974b = new RedPacketCover(-1, string, RedPacketCover.CoverType.TEMPLATE, null, null, null, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/CoverAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/money/redpacket/cover/CoverAdapter;Landroid/view/View;)V", "bind", "", "context", "Landroid/content/Context;", "item", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.a$b */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ CoverAdapter f120980a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.money.redpacket.cover.a$b$a */
        public static final class View$OnClickListenerC48056a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f120981a;

            /* renamed from: b */
            final /* synthetic */ RedPacketCover f120982b;

            View$OnClickListenerC48056a(ViewHolder bVar, RedPacketCover redPacketCover) {
                this.f120981a = bVar;
                this.f120982b = redPacketCover;
            }

            public final void onClick(View view) {
                this.f120981a.f120980a.f120976a.mo168272a(this.f120982b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CoverAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f120980a = aVar;
        }

        /* renamed from: a */
        public final void mo168265a(Context context, RedPacketCover redPacketCover) {
            Drawable drawable;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(redPacketCover, "item");
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.cover_layout);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.cover_iv);
            TextView textView = (TextView) this.itemView.findViewById(R.id.cover_name_tv);
            Intrinsics.checkExpressionValueIsNotNull(viewGroup, "coverLayout");
            boolean z = true;
            if (redPacketCover.getId() != -1 ? redPacketCover.getId() != this.f120980a.f120976a.mo168271a() : this.f120980a.f120976a.mo168271a() != -1) {
                z = false;
            }
            viewGroup.setSelected(z);
            if (viewGroup.isSelected()) {
                drawable = UIUtils.getDrawable(context, R.drawable.red_packet_cover_border);
            } else {
                drawable = null;
            }
            viewGroup.setBackground(drawable);
            viewGroup.setOnClickListener(new View$OnClickListenerC48056a(this, redPacketCover));
            PassThroughImage mainCover = redPacketCover.getMainCover();
            if (mainCover != null) {
                ImageLoader.with(context).load(mainCover).placeholder(R.drawable.default_cover).into(imageView);
            } else {
                imageView.setImageResource(R.drawable.default_cover);
            }
            Intrinsics.checkExpressionValueIsNotNull(textView, "coverNameTv");
            textView.setText(redPacketCover.getName());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
        this.f120977d = context;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_red_packet_cover, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolder(this, inflate);
    }

    public CoverAdapter(RedPacketCoverList redPacketCoverList, CoverThemeAdapter.ICoverDependency cVar) {
        List<RedPacketCover> list;
        Intrinsics.checkParameterIsNotNull(redPacketCoverList, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(cVar, "dependency");
        this.f120979f = redPacketCoverList;
        this.f120976a = cVar;
        CoverAdapter aVar = this;
        if (aVar.f120979f.getCategoryId() == -1) {
            list = CollectionsKt.plus((Collection) CollectionsKt.listOf(f120974b), (Iterable) aVar.f120979f.getCovers());
        } else {
            list = aVar.f120979f.getCovers();
        }
        this.f120978e = list;
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        Context context = this.f120977d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        bVar.mo168265a(context, this.f120978e.get(i));
    }
}
