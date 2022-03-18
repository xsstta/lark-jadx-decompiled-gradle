package com.ss.android.lark.feed.app.filter.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.animation.PathInterpolatorCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.filter.data.FeedTabItemData;
import com.ss.android.lark.feed.interfaces.IDeviceNotifyListener;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.lucode.hackware.magicindicator.C69611a;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 [2\u00020\u0001:\u0002[\\B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00130AH\u0002J\u000e\u0010E\u001a\u00020=2\u0006\u0010F\u001a\u00020\fJ\b\u0010G\u001a\u00020CH\u0002J\u0006\u0010H\u001a\u00020=J$\u0010I\u001a\u00020=2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130A2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010K\u001a\u00020LH\u0002J\u000e\u0010M\u001a\u00020C2\u0006\u0010F\u001a\u00020\fJ\u000e\u0010N\u001a\u00020C2\u0006\u0010O\u001a\u00020=J\u000e\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020?J\u0010\u0010R\u001a\u00020C2\u0006\u0010F\u001a\u00020\fH\u0002J\u0010\u0010S\u001a\u00020C2\b\b\u0001\u0010T\u001a\u00020\tJ\u0014\u0010U\u001a\u00020C2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0018\u0010W\u001a\u00020C2\u0006\u0010X\u001a\u00020\t2\u0006\u0010F\u001a\u00020\fH\u0002J\f\u0010Y\u001a\u00020\u0013*\u00020\u0013H\u0002J\f\u0010Z\u001a\u00020**\u00020*H\u0002R\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u000e\u0010)\u001a\u00020*X.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001b0.X\u000e¢\u0006\u0002\n\u0000R\u001e\u00100\u001a\u0002018\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u0010\u0019R\u001e\u00109\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR\u000e\u0010<\u001a\u00020=X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00130AX\u000e¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/widget/FeedFilterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCurSelectFilter", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "getMCurSelectFilter", "()Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "setMCurSelectFilter", "(Lcom/ss/android/lark/feed/app/entity/FeedFilter;)V", "mDataList", "", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$IFilterItem;", "mDeviceIcon", "Landroid/widget/ImageView;", "getMDeviceIcon", "()Landroid/widget/ImageView;", "setMDeviceIcon", "(Landroid/widget/ImageView;)V", "mDivider", "Landroid/view/View;", "getMDivider", "()Landroid/view/View;", "setMDivider", "(Landroid/view/View;)V", "mFeedDeviceView", "Landroid/widget/FrameLayout;", "getMFeedDeviceView", "()Landroid/widget/FrameLayout;", "setMFeedDeviceView", "(Landroid/widget/FrameLayout;)V", "mFeedFilterView", "getMFeedFilterView", "setMFeedFilterView", "mFilterNavigator", "Lcom/ss/android/lark/feed/app/filter/widget/FeedCommonNavigator;", "mFragmentContainerHelper", "Lnet/lucode/hackware/magicindicator/FragmentContainerHelper;", "mItemViewCache", "", "", "mMagicIndicator", "Lnet/lucode/hackware/magicindicator/MagicIndicator;", "getMMagicIndicator", "()Lnet/lucode/hackware/magicindicator/MagicIndicator;", "setMMagicIndicator", "(Lnet/lucode/hackware/magicindicator/MagicIndicator;)V", "mMoreIcon", "getMMoreIcon", "setMMoreIcon", "mShadeView", "getMShadeView", "setMShadeView", "mShowDevice", "", "mTabListener", "Lcom/ss/android/lark/feed/app/filter/widget/FeedFilterView$IFeedFilterTabListener;", "mViewDataList", "", "calculateItemSize", "", "list", "hasFilter", "filter", "initView", "isDataEmpty", "isListContentSame", "newList", "moreFiltersIcon", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$FilterHolder;", "selectFilter", "setDividerVisibility", "visible", "setFeedFilterTabListener", "listener", "updateCurFilter", "updateDeviceStatus", "deviceStatus", "updateFilterData", "filterItems", "updateTabView", "position", "addTabListener", "setupNavigatorAdapter", "Companion", "IFeedFilterTabListener", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FeedFilterView extends ConstraintLayout {

    /* renamed from: f */
    public static final Interpolator f96301f = PathInterpolatorCompat.create(0.34f, 0.69f, 0.1f, 1.0f);

    /* renamed from: g */
    public static final Companion f96302g = new Companion(null);

    /* renamed from: a */
    public List<FeedTabItemData.IFilterItem> f96303a;

    /* renamed from: b */
    public List<? extends FeedTabItemData.IFilterItem> f96304b;

    /* renamed from: c */
    public Map<String, View> f96305c;

    /* renamed from: d */
    public IFeedFilterTabListener f96306d;

    /* renamed from: e */
    public FeedFilter f96307e;

    /* renamed from: h */
    private C37565b f96308h;

    /* renamed from: i */
    private final C69611a f96309i;

    /* renamed from: j */
    private boolean f96310j;
    @BindView(6468)
    public ImageView mDeviceIcon;
    @BindView(6348)
    public View mDivider;
    @BindView(6467)
    public FrameLayout mFeedDeviceView;
    @BindView(6471)
    public FrameLayout mFeedFilterView;
    @BindView(6631)
    public MagicIndicator mMagicIndicator;
    @BindView(6472)
    public ImageView mMoreIcon;
    @BindView(6922)
    public View mShadeView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/widget/FeedFilterView$IFeedFilterTabListener;", "", "gotoFilterTabManager", "", "view", "Landroid/view/View;", "gotoPCDeviceManager", "onTabDoubleClick", "item", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$IFilterItem;", "onTabSingleClick", "index", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.widget.FeedFilterView$b */
    public interface IFeedFilterTabListener {
        /* renamed from: a */
        void mo137855a(View view);

        /* renamed from: a */
        void mo137856a(View view, FeedTabItemData.IFilterItem eVar);

        /* renamed from: a */
        void mo137857a(View view, FeedTabItemData.IFilterItem eVar, int i);

        /* renamed from: b */
        void mo137858b(View view);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/widget/FeedFilterView$Companion;", "", "()V", "DEFAULT_DEVICE_STATUS", "", "FUNC_ITEM_WIDTH_IN_DP", "", "INDICATOR_TITLE_LINE_HEIGHT", "POST_DELAY_TIME", "", "standardInterpolator", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.widget.FeedFilterView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo137836a() {
        return this.f96303a.isEmpty();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\r¸\u0006\u0000"}, d2 = {"com/ss/android/lark/feed/app/filter/widget/FeedFilterView$setupNavigatorAdapter$1$1", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "mTitleView", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/titles/CommonPagerTitleView;", "getCount", "", "getIndicator", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerIndicator;", "context", "Landroid/content/Context;", "getTitleView", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerTitleView;", "index", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.widget.FeedFilterView$h */
    public static final class C37563h extends AbstractC69621a {

        /* renamed from: a */
        final /* synthetic */ FeedFilterView f96319a;

        /* renamed from: b */
        private C69628b f96320b;

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            return this.f96319a.f96304b.size();
        }

        C37563h(FeedFilterView feedFilterView) {
            this.f96319a = feedFilterView;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            C69625a aVar = new C69625a(context);
            aVar.setMode(1);
            aVar.setColors(Integer.valueOf(C57582a.m223616d(context, R.color.primary_pri_500)));
            aVar.setLineHeight((float) UIUtils.dp2px(context, 4.0f));
            aVar.setRoundRadius((float) UIUtils.dp2px(context, 2.0f));
            aVar.setYOffset(-((float) UIUtils.dp2px(context, 2.0f)));
            aVar.setStartInterpolator(FeedFilterView.f96301f);
            aVar.setEndInterpolator(FeedFilterView.f96301f);
            return aVar;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            FeedTabItemData.IFilterItem eVar = (FeedTabItemData.IFilterItem) this.f96319a.f96304b.get(i);
            View view = this.f96319a.f96305c.get(eVar.mo137805e());
            if (view == null) {
                view = eVar.mo137798a(context);
            }
            if (view instanceof AbstractC69624d) {
                return (AbstractC69624d) view;
            }
            if (this.f96320b == null) {
                C69628b bVar = new C69628b(context);
                bVar.mo243245a(view, eVar.mo137804d());
                this.f96320b = bVar;
            }
            C69628b bVar2 = this.f96320b;
            if (bVar2 == null) {
                Intrinsics.throwNpe();
            }
            return bVar2;
        }
    }

    public final FeedFilter getMCurSelectFilter() {
        FeedFilter feedFilter = this.f96307e;
        if (feedFilter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCurSelectFilter");
        }
        return feedFilter;
    }

    public final ImageView getMDeviceIcon() {
        ImageView imageView = this.mDeviceIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceIcon");
        }
        return imageView;
    }

    public final View getMDivider() {
        View view = this.mDivider;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDivider");
        }
        return view;
    }

    public final FrameLayout getMFeedDeviceView() {
        FrameLayout frameLayout = this.mFeedDeviceView;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFeedDeviceView");
        }
        return frameLayout;
    }

    public final FrameLayout getMFeedFilterView() {
        FrameLayout frameLayout = this.mFeedFilterView;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFeedFilterView");
        }
        return frameLayout;
    }

    public final MagicIndicator getMMagicIndicator() {
        MagicIndicator magicIndicator = this.mMagicIndicator;
        if (magicIndicator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMagicIndicator");
        }
        return magicIndicator;
    }

    public final ImageView getMMoreIcon() {
        ImageView imageView = this.mMoreIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMoreIcon");
        }
        return imageView;
    }

    public final View getMShadeView() {
        View view = this.mShadeView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShadeView");
        }
        return view;
    }

    /* renamed from: c */
    private final FeedTabItemData.FilterHolder m147714c() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        return new FeedTabItemData.FilterHolder("filter_more", UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_more_outlined, UDColorUtils.getColor(context2, R.color.icon_n2)), new C37562g(this));
    }

    /* renamed from: b */
    private final void m147712b() {
        C37565b bVar = new C37565b(getContext());
        this.f96308h = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterNavigator");
        }
        bVar.setAdjustMode(false);
        C37565b bVar2 = this.f96308h;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterNavigator");
        }
        bVar2.setSkimOver(true);
        MagicIndicator magicIndicator = this.mMagicIndicator;
        if (magicIndicator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMagicIndicator");
        }
        C37565b bVar3 = this.f96308h;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterNavigator");
        }
        magicIndicator.setNavigator(bVar3);
        FrameLayout frameLayout = this.mFeedDeviceView;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFeedDeviceView");
        }
        frameLayout.setOnClickListener(new View$OnClickListenerC37560e(this));
        FrameLayout frameLayout2 = this.mFeedFilterView;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFeedFilterView");
        }
        frameLayout2.setOnClickListener(new View$OnClickListenerC37561f(this));
        ImageView imageView = this.mDeviceIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceIcon");
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        imageView.setColorFilter(UDColorUtils.getColor(context, R.color.icon_n1));
        ImageView imageView2 = this.mMoreIcon;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMoreIcon");
        }
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        imageView2.setColorFilter(UDColorUtils.getColor(context2, R.color.text_caption));
        mo137832a(0);
        C69611a aVar = this.f96309i;
        MagicIndicator magicIndicator2 = this.mMagicIndicator;
        if (magicIndicator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMagicIndicator");
        }
        aVar.mo243181a(magicIndicator2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/feed/app/filter/widget/FeedFilterView$addTabListener$1$1", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;", "onTabClickListener", "", "view", "Landroid/view/View;", "item", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$IFilterItem;", "onTabDoubleClickListener", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.widget.FeedFilterView$c */
    public static final class C37557c implements FeedTabItemData.OnTabClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedFilterView f96311a;

        C37557c(FeedFilterView feedFilterView) {
            this.f96311a = feedFilterView;
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.OnTabClickListener
        /* renamed from: b */
        public void mo137827b(View view, FeedTabItemData.IFilterItem eVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(eVar, "item");
            IFeedFilterTabListener bVar = this.f96311a.f96306d;
            if (bVar != null) {
                bVar.mo137856a(view, eVar);
            }
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.OnTabClickListener
        /* renamed from: a */
        public void mo137826a(final View view, final FeedTabItemData.IFilterItem eVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(eVar, "item");
            if (eVar instanceof FeedTabItemData.FilterItem) {
                FeedFilterView feedFilterView = this.f96311a;
                feedFilterView.mo137833a(feedFilterView.f96303a.indexOf(eVar), eVar.mo137801b());
            }
            final int i = 0;
            Iterator<FeedTabItemData.IFilterItem> it = this.f96311a.f96303a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next().mo137805e(), eVar.mo137805e())) {
                    break;
                } else {
                    i++;
                }
            }
            this.f96311a.postDelayed(new Runnable(this) {
                /* class com.ss.android.lark.feed.app.filter.widget.FeedFilterView.C37557c.RunnableC375581 */

                /* renamed from: a */
                final /* synthetic */ C37557c f96312a;

                {
                    this.f96312a = r1;
                }

                public final void run() {
                    IFeedFilterTabListener bVar = this.f96312a.f96311a.f96306d;
                    if (bVar != null) {
                        bVar.mo137857a(view, eVar, i);
                    }
                }
            }, 100);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/feed/app/filter/widget/FeedFilterView$moreFiltersIcon$1", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;", "onTabClickListener", "", "view", "Landroid/view/View;", "item", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$IFilterItem;", "onTabDoubleClickListener", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.widget.FeedFilterView$g */
    public static final class C37562g implements FeedTabItemData.OnTabClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedFilterView f96318a;

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.OnTabClickListener
        /* renamed from: b */
        public void mo137827b(View view, FeedTabItemData.IFilterItem eVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(eVar, "item");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37562g(FeedFilterView feedFilterView) {
            this.f96318a = feedFilterView;
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.OnTabClickListener
        /* renamed from: a */
        public void mo137826a(View view, FeedTabItemData.IFilterItem eVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(eVar, "item");
            IFeedFilterTabListener bVar = this.f96318a.f96306d;
            if (bVar != null) {
                bVar.mo137858b(view);
            }
        }
    }

    public FeedFilterView(Context context) {
        this(context, null, -1);
    }

    public final void setMCurSelectFilter(FeedFilter feedFilter) {
        Intrinsics.checkParameterIsNotNull(feedFilter, "<set-?>");
        this.f96307e = feedFilter;
    }

    public final void setMDeviceIcon(ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(imageView, "<set-?>");
        this.mDeviceIcon = imageView;
    }

    public final void setMDivider(View view) {
        Intrinsics.checkParameterIsNotNull(view, "<set-?>");
        this.mDivider = view;
    }

    public final void setMFeedDeviceView(FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "<set-?>");
        this.mFeedDeviceView = frameLayout;
    }

    public final void setMFeedFilterView(FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "<set-?>");
        this.mFeedFilterView = frameLayout;
    }

    public final void setMMagicIndicator(MagicIndicator magicIndicator) {
        Intrinsics.checkParameterIsNotNull(magicIndicator, "<set-?>");
        this.mMagicIndicator = magicIndicator;
    }

    public final void setMMoreIcon(ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(imageView, "<set-?>");
        this.mMoreIcon = imageView;
    }

    public final void setMShadeView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "<set-?>");
        this.mShadeView = view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.widget.FeedFilterView$d */
    public static final class C37559d extends Lambda implements Function1<String, Boolean> {
        final /* synthetic */ List $ids;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37559d(List list) {
            super(1);
            this.$ids = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(String str) {
            return Boolean.valueOf(invoke(str));
        }

        public final boolean invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            return !this.$ids.contains(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.widget.FeedFilterView$e */
    public static final class View$OnClickListenerC37560e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedFilterView f96316a;

        View$OnClickListenerC37560e(FeedFilterView feedFilterView) {
            this.f96316a = feedFilterView;
        }

        public final void onClick(View view) {
            IFeedFilterTabListener bVar = this.f96316a.f96306d;
            if (bVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                bVar.mo137855a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.widget.FeedFilterView$f */
    public static final class View$OnClickListenerC37561f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedFilterView f96317a;

        View$OnClickListenerC37561f(FeedFilterView feedFilterView) {
            this.f96317a = feedFilterView;
        }

        public final void onClick(View view) {
            IFeedFilterTabListener bVar = this.f96317a.f96306d;
            if (bVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                bVar.mo137858b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$IFilterItem;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.widget.FeedFilterView$i */
    public static final class C37564i extends Lambda implements Function1<FeedTabItemData.IFilterItem, Boolean> {
        public static final C37564i INSTANCE = new C37564i();

        C37564i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(FeedTabItemData.IFilterItem eVar) {
            return Boolean.valueOf(invoke(eVar));
        }

        public final boolean invoke(FeedTabItemData.IFilterItem eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "it");
            if (eVar.mo137797a() != 1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private final FeedTabItemData.IFilterItem m147709a(FeedTabItemData.IFilterItem eVar) {
        eVar.mo137799a(new C37557c(this));
        return eVar;
    }

    /* renamed from: c */
    private final void m147715c(FeedFilter feedFilter) {
        this.f96307e = feedFilter;
        C37548b a = C37548b.m147657a();
        Intrinsics.checkExpressionValueIsNotNull(a, "FilterStatusManager.inst()");
        a.mo137789a(feedFilter);
    }

    /* renamed from: a */
    private final C37565b m147710a(C37565b bVar) {
        bVar.setAdapter(new C37563h(this));
        return bVar;
    }

    public final void setDividerVisibility(boolean z) {
        int i;
        View view = this.mDivider;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDivider");
        }
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final FeedFilterView mo137831a(IFeedFilterTabListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        FeedFilterView feedFilterView = this;
        feedFilterView.f96306d = bVar;
        return feedFilterView;
    }

    /* renamed from: b */
    public final boolean mo137837b(FeedFilter feedFilter) {
        Intrinsics.checkParameterIsNotNull(feedFilter, "filter");
        ArrayList arrayList = new ArrayList();
        for (T t : this.f96303a) {
            if (t instanceof FeedTabItemData.FilterItem) {
                arrayList.add(t);
            }
        }
        ArrayList<FeedTabItemData.FilterItem> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (FeedTabItemData.FilterItem dVar : arrayList2) {
            arrayList3.add(dVar.mo137818g());
        }
        return arrayList3.contains(feedFilter);
    }

    /* renamed from: a */
    public final void mo137832a(@IDeviceNotifyListener.DeviceNotifyStatus int i) {
        boolean z;
        int i2 = 0;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f96310j) {
            this.f96310j = z;
            FrameLayout frameLayout = this.mFeedDeviceView;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFeedDeviceView");
            }
            if (!this.f96310j) {
                i2 = 8;
            }
            frameLayout.setVisibility(i2);
            CollectionsKt.removeAll((List) this.f96303a, (Function1) C37564i.INSTANCE);
            m147713b(this.f96303a);
        }
    }

    /* renamed from: b */
    private final void m147713b(List<? extends FeedTabItemData.IFilterItem> list) {
        float f;
        if (!list.isEmpty()) {
            List<? extends FeedTabItemData.IFilterItem> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo137805e());
            }
            CollectionsKt.removeAll(this.f96305c.keySet(), new C37559d(arrayList));
            int i = 0;
            for (T t : list2) {
                View view = this.f96305c.get(t.mo137805e());
                T t2 = null;
                if (view == null) {
                    T t3 = !(t instanceof FeedTabItemData.FilterItem) ? null : t;
                    if (t3 != null) {
                        Context context = getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context, "context");
                        view = t3.mo137798a(context);
                    } else {
                        view = null;
                    }
                    Map<String, View> map = this.f96305c;
                    String e = t.mo137805e();
                    if (view == null) {
                        Intrinsics.throwNpe();
                    }
                    map.put(e, view);
                } else {
                    if (t instanceof FeedTabItemData.FilterItem) {
                        t2 = t;
                    }
                    T t4 = t2;
                    if (t4 != null) {
                        Context context2 = getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                        t4.mo137813a(context2, view);
                    }
                }
                this.f96305c.put(t.mo137805e(), view);
                view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                i += view.getMeasuredWidth();
            }
            ArrayList arrayList2 = new ArrayList(list);
            int windowWidth = UIHelper.getWindowWidth(getContext());
            if (this.f96310j) {
                f = 96.0f;
            } else {
                f = 48.0f;
            }
            int dp2px = windowWidth - UIHelper.dp2px(f);
            View view2 = this.mShadeView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mShadeView");
            }
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            view2.setBackgroundColor(UDColorUtils.getColor(context3, R.color.bg_body));
            if (i > dp2px) {
                FrameLayout frameLayout = this.mFeedFilterView;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFeedFilterView");
                }
                frameLayout.setVisibility(8);
                View view3 = this.mShadeView;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mShadeView");
                }
                view3.setVisibility(0);
                arrayList2.add(m147714c());
            } else {
                FrameLayout frameLayout2 = this.mFeedFilterView;
                if (frameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFeedFilterView");
                }
                frameLayout2.setVisibility(0);
                View view4 = this.mShadeView;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mShadeView");
                }
                view4.setVisibility(8);
            }
            this.f96304b = arrayList2;
            C37565b bVar = this.f96308h;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterNavigator");
            }
            if (bVar.getAdapter() == null) {
                C37565b bVar2 = this.f96308h;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFilterNavigator");
                }
                m147710a(bVar2);
                return;
            }
            C37565b bVar3 = this.f96308h;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterNavigator");
            }
            bVar3.mo137871c();
        }
    }

    /* renamed from: a */
    public final void mo137834a(FeedFilter feedFilter) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(feedFilter, "filter");
        Iterator<? extends FeedTabItemData.IFilterItem> it = this.f96304b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            FeedTabItemData.IFilterItem eVar = (FeedTabItemData.IFilterItem) it.next();
            if (!(eVar instanceof FeedTabItemData.FilterItem) || ((FeedTabItemData.FilterItem) eVar).mo137818g() != feedFilter) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (i != -1) {
            C37565b bVar = this.f96308h;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterNavigator");
            }
            AbstractC69621a adapter = bVar.getAdapter();
            if (adapter != null) {
                AbstractC69624d a = adapter.mo16057a(getContext(), i);
                if (a != null) {
                    ((TextView) a).performClick();
                    mo137833a(i, feedFilter);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
        }
    }

    /* renamed from: a */
    public final void mo137835a(List<FeedTabItemData.IFilterItem> list) {
        boolean z;
        boolean z2;
        FeedTabItemData.IFilterItem eVar;
        boolean z3;
        Intrinsics.checkParameterIsNotNull(list, "filterItems");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z4 = false;
            z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.mo137797a() == 1) {
                z4 = true;
            }
            if (z4) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = arrayList;
        Object firstOrNull = CollectionsKt.firstOrNull((List) arrayList2);
        if (!(firstOrNull instanceof FeedTabItemData.FilterItem)) {
            firstOrNull = null;
        }
        FeedTabItemData.FilterItem dVar = (FeedTabItemData.FilterItem) firstOrNull;
        if ((dVar != null ? dVar.mo137818g() : null) != FeedFilter.INBOX) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (T t : arrayList2) {
                T t2 = t;
                if (!(t2 instanceof FeedTabItemData.FilterItem)) {
                    t2 = null;
                }
                T t3 = t2;
                if ((t3 != null ? t3.mo137818g() : null) == FeedFilter.INBOX) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    arrayList3.add(t);
                } else {
                    arrayList4.add(t);
                }
            }
            Pair pair = new Pair(arrayList3, arrayList4);
            arrayList2 = CollectionsKt.plus((Collection) ((List) pair.component1()), (Iterable) ((List) pair.component2()));
        }
        if (!m147711a(arrayList2, this.f96303a)) {
            this.f96303a.clear();
            for (T t4 : arrayList2) {
                List<FeedTabItemData.IFilterItem> list2 = this.f96303a;
                if (t4 instanceof FeedTabItemData.FilterItem) {
                    T t5 = t4;
                    eVar = m147709a(new FeedTabItemData.FilterItem(t4.mo137805e(), t5.mo137817f(), t5.mo137818g(), t4.mo137803c(), (FeedTabItemData.OnTabClickListener) null));
                } else if (t4 instanceof FeedTabItemData.FilterHolder) {
                    eVar = m147709a(new FeedTabItemData.FilterHolder(t4.mo137805e(), t4.mo137807f(), null));
                } else {
                    throw new IllegalArgumentException(new C37568c(t4) + " is not Supported");
                }
                list2.add(eVar);
            }
            m147713b(this.f96303a);
            FeedFilter feedFilter = null;
            FeedFilterView feedFilterView = this;
            if (feedFilterView.f96307e != null && (feedFilter = this.f96307e) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCurSelectFilter");
            }
            if (feedFilterView.f96307e != null || this.f96303a.size() <= 0) {
                List<FeedTabItemData.IFilterItem> list3 = this.f96303a;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        FeedFilter b = it2.next().mo137801b();
                        FeedFilter feedFilter2 = this.f96307e;
                        if (feedFilter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mCurSelectFilter");
                        }
                        if (b == feedFilter2) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            z = false;
                            break;
                        }
                    }
                }
                if (z && this.f96303a.size() > 0) {
                    this.f96307e = this.f96303a.get(0).mo137801b();
                } else if (this.f96303a.isEmpty()) {
                    this.f96307e = FeedFilter.INBOX;
                }
            } else {
                this.f96307e = this.f96303a.get(0).mo137801b();
            }
            FeedFilter feedFilter3 = this.f96307e;
            if (feedFilter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCurSelectFilter");
            }
            m147715c(feedFilter3);
            FeedFilter feedFilter4 = this.f96307e;
            if (feedFilter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCurSelectFilter");
            }
            if (feedFilter != feedFilter4) {
                FeedFilter feedFilter5 = this.f96307e;
                if (feedFilter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCurSelectFilter");
                }
                mo137834a(feedFilter5);
            }
        }
    }

    public FeedFilterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    private final boolean m147711a(List<? extends FeedTabItemData.IFilterItem> list, List<FeedTabItemData.IFilterItem> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        List<FeedTabItemData.IFilterItem> list3 = list2;
        Iterator<T> it = list3.iterator();
        List<? extends FeedTabItemData.IFilterItem> list4 = list;
        Iterator<T> it2 = list4.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(list3, 10), CollectionsKt.collectionSizeOrDefault(list4, 10)));
        while (it.hasNext() && it2.hasNext()) {
            if (!it.next().isContentSame(it2.next())) {
                return false;
            }
            arrayList.add(Unit.INSTANCE);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo137833a(int i, FeedFilter feedFilter) {
        if (i != -1) {
            this.f96309i.mo243180a(i, true);
        }
        m147715c(feedFilter);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.f96303a = new ArrayList();
        this.f96304b = new ArrayList();
        this.f96305c = new HashMap();
        this.f96309i = new C69611a();
        ButterKnife.bind(this, LayoutInflater.from(context).inflate(R.layout.widget_feed_filter_container, (ViewGroup) this, true));
        m147712b();
    }
}
