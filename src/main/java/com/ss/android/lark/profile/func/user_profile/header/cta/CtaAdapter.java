package com.ss.android.lark.profile.func.user_profile.header.cta;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonAction;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/cta/CtaAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/profile/func/user_profile/header/cta/CtaViewHolder;", "Lcom/ss/android/lark/profile/func/user_profile/header/cta/BaseCtaViewData;", "mContext", "Landroid/content/Context;", "clickListener", "Lcom/ss/android/lark/profile/func/user_profile/header/cta/CtaAdapter$ItemClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/profile/func/user_profile/header/cta/CtaAdapter$ItemClickListener;)V", "getClickListener", "()Lcom/ss/android/lark/profile/func/user_profile/header/cta/CtaAdapter$ItemClickListener;", "getMContext", "()Landroid/content/Context;", "mGuideAlreadyShow", "", "mRoundBtnSize", "", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDesktopModeLayout", "view", "Landroid/view/View;", "ItemClickListener", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.header.cta.b */
public final class CtaAdapter extends LarkRecyclerViewBaseAdapter<CtaViewHolder, BaseCtaViewData> {

    /* renamed from: a */
    public boolean f130203a;

    /* renamed from: b */
    private final int f130204b = UIHelper.dp2px(40.0f);

    /* renamed from: c */
    private final Context f130205c;

    /* renamed from: d */
    private final ItemClickListener f130206d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/cta/CtaAdapter$ItemClickListener;", "", "onClick", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/profile/func/user_profile/header/cta/BaseCtaViewData;", "onGuideClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.cta.b$a */
    public interface ItemClickListener {
        /* renamed from: a */
        void mo179815a();

        /* renamed from: a */
        void mo179816a(View view, BaseCtaViewData baseCtaViewData);
    }

    /* renamed from: a */
    public final Context mo179824a() {
        return this.f130205c;
    }

    /* renamed from: b */
    public final ItemClickListener mo179827b() {
        return this.f130206d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/profile/func/user_profile/header/cta/CtaAdapter$onBindViewHolder$3", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.cta.b$c */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC52612c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ CtaAdapter f130210a;

        /* renamed from: b */
        final /* synthetic */ CtaViewHolder f130211b;

        public void onGlobalLayout() {
            this.f130210a.f130203a = true;
            this.f130211b.mo179830a().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            AnchorConfig anchorConfig = new AnchorConfig(this.f130211b.mo179830a(), AnchorConfig.AnchorGravity.BOTTOM, null, 4, null);
            MaskConfig maskConfig = new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.RECTANGLE, null, null, 16, null);
            String string = UIHelper.getString(R.string.Lark_Guide_ProfileChatIconSpotlight);
            String string2 = UIHelper.getString(R.string.Lark_Legacy_IKnow);
            Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.string.Lark_Legacy_IKnow)");
            ButtonConfig eVar = new ButtonConfig(string2, new C52613a(this));
            Intrinsics.checkExpressionValueIsNotNull(string, "detail");
            ButtonBubbleConfig dVar = new ButtonBubbleConfig(anchorConfig, maskConfig, null, string, null, eVar);
            GuideComponent.Companion aVar = GuideComponent.f99382a;
            Context a = this.f130210a.mo179824a();
            if (a != null) {
                aVar.mo141643a((Activity) a, dVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/profile/func/user_profile/header/cta/CtaAdapter$onBindViewHolder$3$onGlobalLayout$rightButtonAction$1", "Lcom/ss/android/lark/guide/ui/config/ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.header.cta.b$c$a */
        public static final class C52613a implements ButtonAction {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC52612c f130212a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C52613a(ViewTreeObserver$OnGlobalLayoutListenerC52612c cVar) {
                this.f130212a = cVar;
            }

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(gVar, "delegate");
                gVar.mo141659b();
                this.f130212a.f130210a.mo179827b().mo179815a();
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC52612c(CtaAdapter bVar, CtaViewHolder cVar) {
            this.f130210a = bVar;
            this.f130211b = cVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return (long) ((BaseCtaViewData) getItem(i)).mo179819a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.cta.b$b */
    public static final class View$OnClickListenerC52611b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CtaAdapter f130207a;

        /* renamed from: b */
        final /* synthetic */ CtaViewHolder f130208b;

        /* renamed from: c */
        final /* synthetic */ int f130209c;

        View$OnClickListenerC52611b(CtaAdapter bVar, CtaViewHolder cVar, int i) {
            this.f130207a = bVar;
            this.f130208b = cVar;
            this.f130209c = i;
        }

        public final void onClick(View view) {
            ItemClickListener b = this.f130207a.mo179827b();
            View view2 = this.f130208b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            Object item = this.f130207a.getItem(this.f130209c);
            Intrinsics.checkExpressionValueIsNotNull(item, "getItem(position)");
            b.mo179816a(view2, (BaseCtaViewData) item);
        }
    }

    /* renamed from: a */
    private final void m203903a(View view) {
        view.getLayoutParams().height = this.f130204b;
        view.getLayoutParams().width = this.f130204b;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), UIHelper.dp2px(10.0f), view.getPaddingBottom());
    }

    public CtaAdapter(Context context, ItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
        this.f130205c = context;
        this.f130206d = aVar;
    }

    /* renamed from: a */
    public CtaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f130205c).inflate(R.layout.cta_item_layout, viewGroup, false);
        if (DesktopUtil.m144301a(this.f130205c)) {
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            m203903a(inflate);
        }
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new CtaViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(CtaViewHolder cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        cVar.itemView.setOnClickListener(new View$OnClickListenerC52611b(this, cVar, i));
        BaseCtaViewData baseCtaViewData = (BaseCtaViewData) getItem(i);
        if (baseCtaViewData instanceof PredefineCtaViewData) {
            cVar.mo179830a().setImageResource(((PredefineCtaViewData) baseCtaViewData).mo179832f());
        } else if (baseCtaViewData instanceof LinkCtaViewData) {
            LinkCtaViewData dVar = (LinkCtaViewData) baseCtaViewData;
            if (dVar.mo179831e() != null) {
                ImageLoader.with(this.f130205c).load(dVar.mo179831e()).into(cVar.mo179830a());
            }
        }
        if (baseCtaViewData.mo179819a() == 10 && baseCtaViewData.mo179820b()) {
            if (baseCtaViewData == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.func.user_profile.header.cta.ChatCtaViewData");
            } else if (((ChatCtaViewData) baseCtaViewData).mo179823e() && !this.f130203a) {
                cVar.mo179830a().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC52612c(this, cVar));
            }
        }
    }
}
