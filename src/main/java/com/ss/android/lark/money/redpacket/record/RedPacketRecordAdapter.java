package com.ss.android.lark.money.redpacket.record;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.MoneyModule;
import com.ss.android.lark.money.p2367c.C48033a;
import com.ss.android.lark.money.redpacket.detail.RedPacketDetailView;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetailItem;
import com.ss.android.lark.money.redpacket.dto.RedPacketInfo;
import com.ss.android.lark.money_export.IMoneyModuleDependency;
import com.ss.android.lark.utils.UIHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 42\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u00014B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0003J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0003H\u0002J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016J\u0018\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020'H\u0016J\u000e\u00101\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u00102\u001a\u00020\u001d2\b\u00103\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/money/redpacket/record/RedPacketRecordAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketDetailItem;", "viewDependency", "Lcom/ss/android/lark/money/redpacket/detail/RedPacketDetailView$ViewDependency;", "(Lcom/ss/android/lark/money/redpacket/detail/RedPacketDetailView$ViewDependency;)V", "context", "Landroid/content/Context;", "hasGrabbedMoney", "", "infoData", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketInfo;", "isP2PFromMe", "mChatterNameService", "Lcom/ss/android/lark/money_export/IMoneyModuleDependency$IChatDependency;", "getMChatterNameService", "()Lcom/ss/android/lark/money_export/IMoneyModuleDependency$IChatDependency;", "mChatterNameService$delegate", "Lkotlin/Lazy;", "mLuckyUserId", "", "mSimpleDateFormat", "Ljava/text/SimpleDateFormat;", "getMSimpleDateFormat", "()Ljava/text/SimpleDateFormat;", "mSimpleDateFormat$delegate", "needShowError", "bindContentView", "", "holder", "Lcom/ss/android/lark/money/redpacket/record/RedPacketRecordHolder;", "item", "bindHeaderView", "Lcom/ss/android/lark/money/redpacket/record/RedPacketRecordHeader;", "build2DateFormal", "time", "", "getItemViewType", "", "position", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setInfoData", "setLuckyUserId", "luckyUserId", "Companion", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.record.a */
public final class RedPacketRecordAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, RedPacketDetailItem> {

    /* renamed from: d */
    public static final Companion f121188d = new Companion(null);

    /* renamed from: k */
    private static final int f121189k = UIHelper.dp2px(24.0f);

    /* renamed from: l */
    private static final int f121190l = UIHelper.dp2px(40.0f);

    /* renamed from: a */
    public Context f121191a;

    /* renamed from: b */
    public boolean f121192b;

    /* renamed from: c */
    public final RedPacketDetailView.AbstractC48105b f121193c;

    /* renamed from: e */
    private String f121194e;

    /* renamed from: f */
    private final Lazy f121195f = LazyKt.lazy(C48161e.INSTANCE);

    /* renamed from: g */
    private final Lazy f121196g = LazyKt.lazy(C48160d.INSTANCE);

    /* renamed from: h */
    private RedPacketInfo f121197h;

    /* renamed from: i */
    private boolean f121198i;

    /* renamed from: j */
    private boolean f121199j;

    /* renamed from: a */
    private final SimpleDateFormat m190102a() {
        return (SimpleDateFormat) this.f121195f.getValue();
    }

    /* renamed from: b */
    private final IMoneyModuleDependency.IChatDependency m190105b() {
        return (IMoneyModuleDependency.IChatDependency) this.f121196g.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/money/redpacket/record/RedPacketRecordAdapter$Companion;", "", "()V", "AVATAR_SIZE", "", "AVATAR_SIZE_SMALL", "ITEM_TYPE_CONTENT", "ITEM_TYPE_ERROR", "ITEM_TYPE_HEADER", "LOG_TAG", "", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.record.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/money_export/IMoneyModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.record.a$d */
    static final class C48160d extends Lambda implements Function0<IMoneyModuleDependency.IChatDependency> {
        public static final C48160d INSTANCE = new C48160d();

        C48160d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final IMoneyModuleDependency.IChatDependency invoke() {
            IMoneyModuleDependency dependency = MoneyModule.getDependency();
            Intrinsics.checkExpressionValueIsNotNull(dependency, "MoneyModule.getDependency()");
            return dependency.getChatDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/SimpleDateFormat;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.record.a$e */
    static final class C48161e extends Lambda implements Function0<SimpleDateFormat> {
        public static final C48161e INSTANCE = new C48161e();

        C48161e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("MM-dd HH:mm", Locale.ROOT);
        }
    }

    /* renamed from: a */
    public final void mo168574a(String str) {
        this.f121194e = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/money/redpacket/record/RedPacketRecordAdapter$bindHeaderView$1$1$2", "com/ss/android/lark/money/redpacket/record/RedPacketRecordAdapter$$special$$inlined$with$lambda$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.record.a$c */
    public static final class View$OnClickListenerC48159c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RedPacketRecordHeader f121203a;

        /* renamed from: b */
        final /* synthetic */ RedPacketRecordAdapter f121204b;

        /* renamed from: c */
        final /* synthetic */ RedPacketDetailItem f121205c;

        View$OnClickListenerC48159c(RedPacketRecordHeader redPacketRecordHeader, RedPacketRecordAdapter aVar, RedPacketDetailItem redPacketDetailItem) {
            this.f121203a = redPacketRecordHeader;
            this.f121204b = aVar;
            this.f121205c = redPacketDetailItem;
        }

        public final void onClick(View view) {
            this.f121204b.f121193c.mo168412b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/money/redpacket/record/RedPacketRecordAdapter$bindHeaderView$1$1$1", "com/ss/android/lark/money/redpacket/record/RedPacketRecordAdapter$$special$$inlined$with$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.record.a$b */
    public static final class View$OnClickListenerC48158b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RedPacketRecordHeader f121200a;

        /* renamed from: b */
        final /* synthetic */ RedPacketRecordAdapter f121201b;

        /* renamed from: c */
        final /* synthetic */ RedPacketDetailItem f121202c;

        View$OnClickListenerC48158b(RedPacketRecordHeader redPacketRecordHeader, RedPacketRecordAdapter aVar, RedPacketDetailItem redPacketDetailItem) {
            this.f121200a = redPacketRecordHeader;
            this.f121201b = aVar;
            this.f121202c = redPacketDetailItem;
        }

        public final void onClick(View view) {
            if (this.f121201b.f121192b) {
                this.f121201b.f121193c.mo168412b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"inflate", "Landroid/view/View;", "kotlin.jvm.PlatformType", "resource", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.record.a$f */
    static final class C48162f extends Lambda implements Function1<Integer, View> {
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ RedPacketRecordAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48162f(RedPacketRecordAdapter aVar, ViewGroup viewGroup) {
            super(1);
            this.this$0 = aVar;
            this.$parent = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ View invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final View invoke(int i) {
            return LayoutInflater.from(RedPacketRecordAdapter.m190100a(this.this$0)).inflate(i, this.$parent, false);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Context m190100a(RedPacketRecordAdapter aVar) {
        Context context = aVar.f121191a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    public RedPacketRecordAdapter(RedPacketDetailView.AbstractC48105b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        this.f121193c = bVar;
    }

    /* renamed from: a */
    private final String m190101a(long j) {
        String format = m190102a().format(new Date(j));
        Intrinsics.checkExpressionValueIsNotNull(format, "mSimpleDateFormat.format(Date(time))");
        return format;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        RedPacketDetailItem redPacketDetailItem = (RedPacketDetailItem) getItem(i);
        if (redPacketDetailItem == null) {
            return 1;
        }
        int i2 = redPacketDetailItem.type;
        if (i2 != 0) {
            if (i2 == 1) {
                return 1;
            }
            if (i2 != 2) {
                return 0;
            }
            return 2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
        this.f121191a = context;
    }

    /* renamed from: a */
    public final void mo168573a(RedPacketInfo redPacketInfo) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(redPacketInfo, "infoData");
        this.f121197h = redPacketInfo;
        boolean z3 = true;
        if (redPacketInfo.grabAmount != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121192b = z;
        if (!redPacketInfo.isFromMe || redPacketInfo.type != RedPacketContent.Type.P2P) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f121198i = z2;
        if (redPacketInfo.type == RedPacketContent.Type.P2P || redPacketInfo.type == RedPacketContent.Type.COMMERCIAL) {
            z3 = false;
        }
        this.f121199j = z3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/android/lark/money/redpacket/record/RedPacketRecordAdapter$onCreateViewHolder$2", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.record.a$g */
    public static final class C48163g extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C48162f f121206a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48163g(C48162f fVar, View view) {
            super(view);
            this.f121206a = fVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        int itemViewType = getItemViewType(i);
        RedPacketDetailItem redPacketDetailItem = (RedPacketDetailItem) getItem(i);
        if (redPacketDetailItem == null) {
            return;
        }
        if (itemViewType == 0) {
            m190104a((RedPacketRecordHolder) viewHolder, redPacketDetailItem);
        } else if (itemViewType == 1) {
            m190103a((RedPacketRecordHeader) viewHolder, redPacketDetailItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        C48162f fVar = new C48162f(this, viewGroup);
        if (i == 0) {
            View invoke = fVar.invoke(R.layout.item_red_packet_record);
            Intrinsics.checkExpressionValueIsNotNull(invoke, "inflate(R.layout.item_red_packet_record)");
            return new RedPacketRecordHolder(invoke);
        } else if (i == 1) {
            View invoke2 = fVar.invoke(R.layout.item_red_packet_detail_record_header);
            Intrinsics.checkExpressionValueIsNotNull(invoke2, "inflate(R.layout.item_re…ket_detail_record_header)");
            return new RedPacketRecordHeader(invoke2);
        } else if (i == 2) {
            return new C48163g(fVar, fVar.invoke(R.layout.item_red_packet_detail_record_error));
        } else {
            View invoke3 = fVar.invoke(R.layout.item_red_packet_record);
            Intrinsics.checkExpressionValueIsNotNull(invoke3, "inflate(R.layout.item_red_packet_record)");
            return new RedPacketRecordHolder(invoke3);
        }
    }

    /* renamed from: a */
    private final void m190104a(RedPacketRecordHolder redPacketRecordHolder, RedPacketDetailItem redPacketDetailItem) {
        boolean z;
        redPacketRecordHolder.mo168569b().setText(m190101a(redPacketDetailItem.time));
        TextView d = redPacketRecordHolder.mo168571d();
        d.setText(C48033a.m189577a(((double) redPacketDetailItem.amount) * 0.01d) + UIHelper.getString(R.string.Lark_Legacy_DetailMoneyLabel));
        Chatter chatter = redPacketDetailItem.chatter;
        int i = 8;
        if (chatter != null) {
            redPacketRecordHolder.mo168568a().setText(m190105b().getDisplayNameByName(chatter));
            View e = redPacketRecordHolder.mo168572e();
            if (TextUtils.isEmpty(this.f121194e) || !Intrinsics.areEqual(this.f121194e, chatter.getId())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = 0;
            }
            e.setVisibility(i);
            String avatarKey = chatter.getAvatarKey();
            String id = chatter.getId();
            int i2 = f121190l;
            AvatarImage build = AvatarImage.Builder.obtain(avatarKey, id, i2, i2).build();
            Context context = this.f121191a;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            ImageLoader.with(context).load(build).into(redPacketRecordHolder.mo168570c());
            return;
        }
        redPacketRecordHolder.mo168568a().setText("");
        redPacketRecordHolder.mo168572e().setVisibility(8);
        LKUIRoundedImageView c = redPacketRecordHolder.mo168570c();
        Context context2 = this.f121191a;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        c.setImageDrawable(new ColorDrawable(UDColorUtils.getColor(context2, R.color.bg_body_overlay)));
        Log.m165383e("RedPacketRecordAdapter", "onBindViewHolder failed, grabTime:" + m190101a(redPacketDetailItem.time));
    }

    /* renamed from: a */
    private final void m190103a(RedPacketRecordHeader redPacketRecordHeader, RedPacketDetailItem redPacketDetailItem) {
        boolean z;
        boolean z2;
        int i;
        long j;
        int i2;
        RedPacketInfo redPacketInfo = this.f121197h;
        if (redPacketInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("infoData");
        }
        String avatarKey = redPacketInfo.chatter.getAvatarKey();
        String id = redPacketInfo.chatter.getId();
        int i3 = f121189k;
        AvatarImage build = AvatarImage.Builder.obtain(avatarKey, id, i3, i3).build();
        Context context = this.f121191a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        ImageLoader.with(context).load(build).into(redPacketRecordHeader.mo168557a());
        redPacketRecordHeader.mo168558b().setText(UIHelper.mustacheFormat((int) R.string.Lark_RedPacket_FromUser, "username", m190105b().getDisplayNameByName(redPacketInfo.chatter)));
        TextView c = redPacketRecordHeader.mo168559c();
        RedPacketInfo redPacketInfo2 = this.f121197h;
        if (redPacketInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("infoData");
        }
        c.setText(redPacketInfo2.subject);
        TextView e = redPacketRecordHeader.mo168561e();
        Context context2 = this.f121191a;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        e.setTypeface(Typeface.createFromAsset(context2.getAssets(), "fonts/DINAlternateBold.ttf"));
        boolean z3 = true;
        int i4 = 0;
        if (!this.f121198i || redPacketInfo.grabNum == 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z4 = this.f121192b;
        int i5 = R.string.Lark_Legacy_HongbaoResultCashOut;
        if (z4 || z) {
            if (z4) {
                j = redPacketInfo.grabAmount;
            } else {
                j = redPacketInfo.totalAmount;
            }
            redPacketRecordHeader.mo168560d().setVisibility(0);
            redPacketRecordHeader.mo168561e().setText(C48033a.m189577a(((double) j) * 0.01d));
            redPacketRecordHeader.mo168565i().setVisibility(8);
            redPacketRecordHeader.mo168563g().setVisibility(0);
            redPacketRecordHeader.mo168563g().setOnClickListener(new View$OnClickListenerC48158b(redPacketRecordHeader, this, redPacketDetailItem));
            TextView f = redPacketRecordHeader.mo168562f();
            if (!this.f121192b) {
                i5 = R.string.Lark_Legacy_P2pOpened;
            }
            f.setText(UIHelper.getString(i5));
            redPacketRecordHeader.mo168562f().setVisibility(0);
            ImageView h = redPacketRecordHeader.mo168564h();
            if (this.f121192b) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            h.setVisibility(i2);
        } else if (redPacketInfo.grabNum == redPacketInfo.totalNum) {
            redPacketRecordHeader.mo168560d().setVisibility(8);
            redPacketRecordHeader.mo168565i().setVisibility(0);
            redPacketRecordHeader.mo168565i().setText(UIHelper.getString(R.string.Lark_Legacy_HongbaoNoneLeft));
            redPacketRecordHeader.mo168563g().setVisibility(8);
            redPacketRecordHeader.mo168564h().setVisibility(8);
        } else {
            RedPacketInfo redPacketInfo3 = this.f121197h;
            if (redPacketInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("infoData");
            }
            if (redPacketInfo3.isExpired) {
                redPacketRecordHeader.mo168560d().setVisibility(8);
                redPacketRecordHeader.mo168565i().setVisibility(0);
                redPacketRecordHeader.mo168565i().setText(UIHelper.getString(R.string.Lark_Legacy_HongbaoHistoryExpired));
                redPacketRecordHeader.mo168563g().setVisibility(8);
            } else if (this.f121198i) {
                redPacketRecordHeader.mo168560d().setVisibility(0);
                redPacketRecordHeader.mo168561e().setText(C48033a.m189577a(((double) redPacketInfo.totalAmount) * 0.01d));
                redPacketRecordHeader.mo168565i().setVisibility(8);
                redPacketRecordHeader.mo168563g().setVisibility(0);
                redPacketRecordHeader.mo168562f().setVisibility(0);
                redPacketRecordHeader.mo168562f().setText(UIHelper.getString(R.string.Lark_Legacy_P2pNotOpen));
                redPacketRecordHeader.mo168564h().setVisibility(8);
            } else if (redPacketInfo.grabAmount > 0) {
                redPacketRecordHeader.mo168560d().setVisibility(0);
                redPacketRecordHeader.mo168561e().setText(C48033a.m189577a(((double) redPacketInfo.grabAmount) * 0.01d));
                redPacketRecordHeader.mo168565i().setVisibility(8);
                redPacketRecordHeader.mo168563g().setVisibility(0);
                redPacketRecordHeader.mo168562f().setVisibility(0);
                redPacketRecordHeader.mo168562f().setText(UIHelper.getString(R.string.Lark_Legacy_HongbaoResultCashOut));
                redPacketRecordHeader.mo168563g().setOnClickListener(new View$OnClickListenerC48159c(redPacketRecordHeader, this, redPacketDetailItem));
                redPacketRecordHeader.mo168564h().setVisibility(0);
            } else {
                redPacketRecordHeader.mo168560d().setVisibility(8);
                redPacketRecordHeader.mo168565i().setVisibility(8);
                redPacketRecordHeader.mo168563g().setVisibility(8);
            }
        }
        ViewGroup j2 = redPacketRecordHeader.mo168566j();
        if (redPacketInfo.type != RedPacketContent.Type.P2P) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        j2.setVisibility(i);
        TextView k = redPacketRecordHeader.mo168567k();
        if (redPacketInfo.type == RedPacketContent.Type.P2P) {
            z3 = false;
        }
        if (!z3) {
            i4 = 8;
        }
        k.setVisibility(i4);
        redPacketRecordHeader.mo168567k().setText(redPacketDetailItem.recordDetail);
    }
}
