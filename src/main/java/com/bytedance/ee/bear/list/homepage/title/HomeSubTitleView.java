package com.bytedance.ee.bear.list.homepage.title;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.bear.list.homepage.AbstractC8474e;
import com.bytedance.ee.bear.list.homepage.title.SubMenuView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0013H\u0016J\u0012\u0010$\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010&\u001a\u00020\u001d2\b\u0010'\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u0013H\u0016J\u0012\u0010*\u001a\u00020\u001d2\b\u0010'\u001a\u0004\u0018\u00010\u0019H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/title/HomeSubTitleView;", "Landroid/widget/LinearLayout;", "Lcom/bytedance/ee/bear/list/homepage/IHomeSubMenuView;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mDelegate", "Lcom/bytedance/ee/bear/list/homepage/IHomeSubMenuView$ViewDelegate;", "mFilterState", "Lcom/bytedance/ee/bear/list/homepage/title/SubMenuView$FilterState;", "mIsShowGrid", "", "mIvFilter", "Landroidx/appcompat/widget/AppCompatImageView;", "mIvSwitch", "mOffline", "mTitle", "", "mTvTitle", "Landroid/widget/TextView;", "hideFilter", "", "hideGrid", "initView", "setFilterState", "filterState", "setOffline", "offline", "setViewDelegate", "viewDelegate", "showFilterDesc", "desc", "showGrid", "isGrid", "showSortDesc", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
public class HomeSubTitleView extends LinearLayout implements AbstractC8474e {

    /* renamed from: a */
    public AbstractC8474e.AbstractC8475a f22960a;

    /* renamed from: b */
    public AppCompatImageView f22961b;

    /* renamed from: c */
    public boolean f22962c;

    /* renamed from: d */
    private String f22963d;

    /* renamed from: e */
    private TextView f22964e;

    /* renamed from: f */
    private AppCompatImageView f22965f;

    /* renamed from: g */
    private SubMenuView.FilterState f22966g;

    /* renamed from: h */
    private boolean f22967h;

    /* renamed from: i */
    private Context f22968i;

    public HomeSubTitleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public HomeSubTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    /* renamed from: a */
    public void mo33136a(String str) {
    }

    public final Context getMContext() {
        return this.f22968i;
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    /* renamed from: b */
    public void mo33138b() {
        AppCompatImageView appCompatImageView = this.f22965f;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvFilter");
        }
        appCompatImageView.setVisibility(8);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    /* renamed from: a */
    public void mo33135a() {
        AppCompatImageView appCompatImageView = this.f22965f;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvFilter");
        }
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams != null) {
            ((LinearLayout.LayoutParams) layoutParams).setMarginEnd(0);
            AppCompatImageView appCompatImageView2 = this.f22961b;
            if (appCompatImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvSwitch");
            }
            appCompatImageView2.setVisibility(8);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    public void setViewDelegate(AbstractC8474e.AbstractC8475a aVar) {
        this.f22960a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/list/homepage/title/HomeSubTitleView$initView$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.title.HomeSubTitleView$a */
    public static final class C8497a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ HomeSubTitleView f22969a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8497a(HomeSubTitleView homeSubTitleView) {
            this.f22969a = homeSubTitleView;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            AbstractC8474e.AbstractC8475a aVar = this.f22969a.f22960a;
            if (aVar != null) {
                aVar.mo30969h();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/list/homepage/title/HomeSubTitleView$initView$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.title.HomeSubTitleView$b */
    public static final class C8498b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ HomeSubTitleView f22970a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8498b(HomeSubTitleView homeSubTitleView) {
            this.f22970a = homeSubTitleView;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            int i;
            HomeSubTitleView homeSubTitleView = this.f22970a;
            homeSubTitleView.f22962c = !homeSubTitleView.f22962c;
            AppCompatImageView a = HomeSubTitleView.m35216a(this.f22970a);
            if (this.f22970a.f22962c) {
                i = R.drawable.ud_icon_disorder_list_outlined;
            } else {
                i = R.drawable.ud_icon_borders_outlined;
            }
            a.setImageResource(i);
            AbstractC8474e.AbstractC8475a aVar = this.f22970a.f22960a;
            if (aVar != null) {
                aVar.mo30965b(this.f22970a.f22962c);
            }
        }
    }

    public final void setMContext(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "<set-?>");
        this.f22968i = context;
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    public void setOffline(boolean z) {
        this.f22967h = z;
        setFilterState(this.f22966g);
    }

    /* renamed from: a */
    public static final /* synthetic */ AppCompatImageView m35216a(HomeSubTitleView homeSubTitleView) {
        AppCompatImageView appCompatImageView = homeSubTitleView.f22961b;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvSwitch");
        }
        return appCompatImageView;
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    /* renamed from: a */
    public void mo33137a(boolean z) {
        int i;
        this.f22962c = z;
        AppCompatImageView appCompatImageView = this.f22961b;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvSwitch");
        }
        if (this.f22962c) {
            i = R.drawable.ud_icon_disorder_list_outlined;
        } else {
            i = R.drawable.ud_icon_borders_outlined;
        }
        appCompatImageView.setImageResource(i);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    public void setFilterState(SubMenuView.FilterState filterState) {
        int i;
        Intrinsics.checkParameterIsNotNull(filterState, "filterState");
        this.f22966g = filterState;
        SubMenuView.FilterState filterState2 = SubMenuView.FilterState.DEFAULT;
        int i2 = R.color.icon_disable;
        if (filterState == filterState2) {
            if (!this.f22967h) {
                i2 = R.color.icon_n2;
            }
            AppCompatImageView appCompatImageView = this.f22965f;
            if (appCompatImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvFilter");
            }
            appCompatImageView.setBackgroundDrawable(null);
        } else {
            if (!this.f22967h) {
                i2 = R.color.space_list_icon_filter_blue;
            }
            AppCompatImageView appCompatImageView2 = this.f22965f;
            if (appCompatImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvFilter");
            }
            appCompatImageView2.setBackgroundDrawable(getResources().getDrawable(R.drawable.list_filter_icon_offline_bg));
            if (this.f22967h) {
                i = R.color.space_list_bg_filter_icon_offline;
            } else {
                i = R.color.space_list_bg_filter_icon_selected;
            }
            AppCompatImageView appCompatImageView3 = this.f22965f;
            if (appCompatImageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvFilter");
            }
            C13747j.m55726a((View) appCompatImageView3, i);
        }
        AppCompatImageView appCompatImageView4 = this.f22965f;
        if (appCompatImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvFilter");
        }
        C13747j.m55728a((ImageView) appCompatImageView4, i2);
    }

    /* renamed from: a */
    public final void mo33216a(AttributeSet attributeSet) {
        int i;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.title});
            String string = obtainStyledAttributes.getString(0);
            if (string == null) {
                string = getResources().getString(R.string.Doc_List_MainTabHomeRecent);
                Intrinsics.checkExpressionValueIsNotNull(string, "resources.getString(R.st…c_List_MainTabHomeRecent)");
            }
            this.f22963d = string;
            obtainStyledAttributes.recycle();
        }
        View inflate = LayoutInflater.from(this.f22968i).inflate(R.layout.list_home_sub_title_view, (ViewGroup) this, true);
        C13747j.m55726a(this, (int) R.color.bg_body);
        View findViewById = inflate.findViewById(R.id.tv_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.tv_title)");
        TextView textView = (TextView) findViewById;
        this.f22964e = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTitle");
        }
        String str = this.f22963d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitle");
        }
        textView.setText(str);
        View findViewById2 = inflate.findViewById(R.id.iv_filter);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.iv_filter)");
        this.f22965f = (AppCompatImageView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.iv_switch);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.iv_switch)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById3;
        this.f22961b = appCompatImageView;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvSwitch");
        }
        if (this.f22962c) {
            i = R.drawable.ud_icon_disorder_list_outlined;
        } else {
            i = R.drawable.ud_icon_borders_outlined;
        }
        appCompatImageView.setImageResource(i);
        AppCompatImageView appCompatImageView2 = this.f22961b;
        if (appCompatImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvSwitch");
        }
        C13747j.m55728a((ImageView) appCompatImageView2, (int) R.color.icon_n2);
        AppCompatImageView appCompatImageView3 = this.f22965f;
        if (appCompatImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvFilter");
        }
        appCompatImageView3.setOnClickListener(new C8497a(this));
        AppCompatImageView appCompatImageView4 = this.f22961b;
        if (appCompatImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvSwitch");
        }
        appCompatImageView4.setOnClickListener(new C8498b(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeSubTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f22968i = context;
        this.f22966g = SubMenuView.FilterState.DEFAULT;
        mo33216a(attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeSubTitleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
