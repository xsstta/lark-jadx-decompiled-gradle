package com.ss.android.lark.money.redpacket.cover.preview;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.money.redpacket.cover.CoverAdapter;
import com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewAdapter;
import com.ss.android.lark.money.redpacket.cover.preview.ICoverPreviewContract;
import com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.C48080b;
import com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation;
import com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollView;
import com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.C48094b;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverList;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverListResponse;
import com.ss.android.lark.money.statistics.RedPacketHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0018\u00010\u0003R\u00020\u00040\u00022\u00020\u0005:\u0001GB\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0014H\u0002J\b\u0010:\u001a\u000205H\u0016J\b\u0010;\u001a\u000205H\u0002J\b\u0010<\u001a\u000205H\u0002J\b\u0010=\u001a\u000205H\u0016J\u0010\u0010>\u001a\u0002052\u0006\u0010?\u001a\u00020'H\u0016J\u001e\u0010@\u001a\u0002052\f\u0010A\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010B\u001a\u00020CH\u0016J\u0012\u0010D\u001a\u0002052\b\u0010E\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010F\u001a\u0002052\b\u00102\u001a\u0004\u0018\u000103H\u0016R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\b\u0012\u00060\u0003R\u00020\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0010\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewView;", "Lcom/ss/android/lark/money/redpacket/cover/preview/ICoverPreviewContract$IView;", "Lcom/ss/android/lark/money/redpacket/cover/preview/discretescrollview/DiscreteScrollView$OnItemChangedListener;", "Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewAdapter$ViewHolder;", "Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewAdapter;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "viewDependency", "Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewView$ViewDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewView$ViewDependency;)V", "confirmBtn", "Lcom/larksuite/component/universe_design/button/UDButton;", "getConfirmBtn", "()Lcom/larksuite/component/universe_design/button/UDButton;", "setConfirmBtn", "(Lcom/larksuite/component/universe_design/button/UDButton;)V", "coverListResponse", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "currentItemId", "", "currentItemName", "Landroid/widget/TextView;", "getCurrentItemName", "()Landroid/widget/TextView;", "setCurrentItemName", "(Landroid/widget/TextView;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "finiteAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "itemPicker", "Lcom/ss/android/lark/money/redpacket/cover/preview/discretescrollview/DiscreteScrollView;", "getItemPicker", "()Lcom/ss/android/lark/money/redpacket/cover/preview/discretescrollview/DiscreteScrollView;", "setItemPicker", "(Lcom/ss/android/lark/money/redpacket/cover/preview/discretescrollview/DiscreteScrollView;)V", "smoothScrollBtn", "Landroid/view/View;", "getSmoothScrollBtn", "()Landroid/view/View;", "setSmoothScrollBtn", "(Landroid/view/View;)V", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "viewDelegate", "Lcom/ss/android/lark/money/redpacket/cover/preview/ICoverPreviewContract$IView$Delegate;", "create", "", "destroy", "getCoverTheme", "", "coverId", "initItemPicker", "initListeners", "initTitleBar", "initView", "onClick", "v", "onCurrentItemChanged", "viewHolder", "adapterPosition", "", "onItemChanged", "item", "setViewDelegate", "ViewDependency", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CoverPreviewView implements View.OnClickListener, ICoverPreviewContract.IView, DiscreteScrollView.AbstractC48074a<CoverPreviewAdapter.ViewHolder> {

    /* renamed from: a */
    private RedPacketCoverListResponse f120999a = new RedPacketCoverListResponse();

    /* renamed from: b */
    private List<RedPacketCover> f121000b = CollectionsKt.listOf(CoverAdapter.f120975c.mo168264a());

    /* renamed from: c */
    private long f121001c = -1;
    @BindView(6474)
    public UDButton confirmBtn;
    @BindView(6728)
    public TextView currentItemName;

    /* renamed from: d */
    private RecyclerView.Adapter<CoverPreviewAdapter.ViewHolder> f121002d;

    /* renamed from: e */
    private ICoverPreviewContract.IView.Delegate f121003e;

    /* renamed from: f */
    private final Context f121004f;

    /* renamed from: g */
    private final ViewDependency f121005g;
    @BindView(6730)
    public DiscreteScrollView itemPicker;
    @BindView(6411)
    public View smoothScrollBtn;
    @BindView(7363)
    public CommonTitleBar titleBar;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewView$ViewDependency;", "", "()V", "coverListResponse", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "getCoverListResponse", "()Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "currentCoverId", "", "getCurrentCoverId", "()J", "finishActivity", "", "cover", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "injectView", "view", "Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewView;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewView$a */
    public static abstract class ViewDependency {

        /* renamed from: a */
        private final long f121006a = -1;

        /* renamed from: b */
        private final RedPacketCoverListResponse f121007b = new RedPacketCoverListResponse();

        /* renamed from: a */
        public void mo168285a(RedPacketCover redPacketCover) {
            Intrinsics.checkParameterIsNotNull(redPacketCover, "cover");
        }

        /* renamed from: a */
        public void mo168286a(CoverPreviewView coverPreviewView) {
            Intrinsics.checkParameterIsNotNull(coverPreviewView, "view");
        }

        /* renamed from: c */
        public void mo168288c() {
        }

        /* renamed from: a */
        public long mo168284a() {
            return this.f121006a;
        }

        /* renamed from: b */
        public RedPacketCoverListResponse mo168287b() {
            return this.f121007b;
        }
    }

    @Override // com.ss.android.lark.money.redpacket.cover.preview.ICoverPreviewContract.IView
    /* renamed from: a */
    public void mo168289a() {
        m189700c();
        m189701d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f121005g.mo168286a(this);
    }

    /* renamed from: c */
    private final void m189700c() {
        CommonTitleBar commonTitleBar = this.titleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        TextView leftText = commonTitleBar.getLeftText();
        Intrinsics.checkExpressionValueIsNotNull(leftText, "titleBar.leftText");
        leftText.setId(R.id.title_close_btn);
        CommonTitleBar commonTitleBar2 = this.titleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar2.setLeftImageDrawable(UDIconUtils.getIconDrawable(this.f121004f, CommonTitleBarConstants.ICON_CLOSE, UDColorUtils.getColor(this.f121004f, R.color.static_white)));
    }

    /* renamed from: d */
    private final void m189701d() {
        CommonTitleBar commonTitleBar = this.titleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        CoverPreviewView coverPreviewView = this;
        commonTitleBar.setLeftClickListener(coverPreviewView);
        View view = this.smoothScrollBtn;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smoothScrollBtn");
        }
        view.setOnClickListener(coverPreviewView);
        UDButton uDButton = this.confirmBtn;
        if (uDButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmBtn");
        }
        uDButton.setOnClickListener(coverPreviewView);
    }

    @Override // com.ss.android.lark.money.redpacket.cover.preview.ICoverPreviewContract.IView
    /* renamed from: b */
    public void mo168293b() {
        boolean z;
        RedPacketCoverListResponse b = this.f121005g.mo168287b();
        List<RedPacketCover> recommendedCovers = b.getRecommendedCovers();
        if (recommendedCovers == null) {
            recommendedCovers = CollectionsKt.emptyList();
        }
        Collection values = MapsKt.toSortedMap(b.getCovers()).values();
        Intrinsics.checkExpressionValueIsNotNull(values, "response.covers.toSortedMap().values");
        Collection<RedPacketCoverList> collection = values;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (RedPacketCoverList redPacketCoverList : collection) {
            arrayList.add(redPacketCoverList.getCovers());
        }
        List flatten = CollectionsKt.flatten(arrayList);
        this.f120999a = b;
        this.f121000b = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(CoverAdapter.f120975c.mo168264a()), (Iterable) recommendedCovers), (Iterable) flatten);
        long a = this.f121005g.mo168284a();
        Iterator<RedPacketCover> it = this.f121000b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getId() == a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(i, 0);
        DiscreteScrollView discreteScrollView = this.itemPicker;
        if (discreteScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemPicker");
        }
        discreteScrollView.setOrientation(DSVOrientation.HORIZONTAL);
        DiscreteScrollView discreteScrollView2 = this.itemPicker;
        if (discreteScrollView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemPicker");
        }
        discreteScrollView2.mo168350a(this);
        DiscreteScrollView discreteScrollView3 = this.itemPicker;
        if (discreteScrollView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemPicker");
        }
        discreteScrollView3.setItemTransitionTimeMillis(C48080b.m189825a());
        DiscreteScrollView discreteScrollView4 = this.itemPicker;
        if (discreteScrollView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemPicker");
        }
        discreteScrollView4.setItemTransformer(new C48094b.C48095a().mo168398a(0.95f).mo168400b(0.5f).mo168399a());
        this.f121002d = new CoverPreviewAdapter(this.f121000b);
        DiscreteScrollView discreteScrollView5 = this.itemPicker;
        if (discreteScrollView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemPicker");
        }
        discreteScrollView5.setAdapter(this.f121002d);
        DiscreteScrollView discreteScrollView6 = this.itemPicker;
        if (discreteScrollView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemPicker");
        }
        discreteScrollView6.scrollToPosition(coerceAtLeast);
        m189699a((RedPacketCover) CollectionsKt.getOrNull(this.f121000b, coerceAtLeast));
        RedPacketHitPoint.m190213a(a, m189698a(a));
    }

    /* renamed from: a */
    public void setViewDelegate(ICoverPreviewContract.IView.Delegate aVar) {
        this.f121003e = aVar;
    }

    /* renamed from: a */
    private final void m189699a(RedPacketCover redPacketCover) {
        if (redPacketCover != null) {
            this.f121001c = redPacketCover.getId();
            TextView textView = this.currentItemName;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentItemName");
            }
            textView.setText(redPacketCover.getName());
        }
    }

    public void onClick(View view) {
        T t;
        boolean z;
        Intrinsics.checkParameterIsNotNull(view, "v");
        int id = view.getId();
        if (id == R.id.title_close_btn) {
            this.f121005g.mo168288c();
        } else if (id == R.id.confirm_btn) {
            Iterator<T> it = this.f121000b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.getId() == this.f121001c) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            T t2 = t;
            if (t2 == null) {
                t2 = CoverAdapter.f120975c.mo168264a();
            }
            RedPacketHitPoint.m190216b(t2.getId(), m189698a(t2.getId()));
            this.f121005g.mo168285a(t2);
        } else if (id == R.id.btn_smooth_scroll) {
            DiscreteScrollView discreteScrollView = this.itemPicker;
            if (discreteScrollView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("itemPicker");
            }
            C48080b.m189826a(discreteScrollView, view);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m189698a(long r12) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewView.m189698a(long):java.lang.String");
    }

    public CoverPreviewView(Context context, ViewDependency aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        this.f121004f = context;
        this.f121005g = aVar;
    }

    /* renamed from: a */
    public void mo168290a(CoverPreviewAdapter.ViewHolder aVar, int i) {
        m189699a((RedPacketCover) CollectionsKt.getOrNull(this.f121000b, i));
    }
}
