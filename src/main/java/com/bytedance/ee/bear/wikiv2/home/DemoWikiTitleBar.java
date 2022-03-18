package com.bytedance.ee.bear.wikiv2.home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\bH\u0016J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/DemoWikiTitleBar;", "Lcom/bytedance/ee/bear/list/homepage/title/HomeMainTitleBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getTitleBarHeight", "init", "", "root", "Landroid/view/ViewGroup;", "setCreateViewEnable", "enable", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DemoWikiTitleBar extends HomeMainTitleBar {
    @Override // com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar
    public void setCreateViewEnable(boolean z) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wikiv2/home/DemoWikiTitleBar$init$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.DemoWikiTitleBar$a */
    public static final class C12253a extends AbstractView$OnClickListenerC11839e {
        C12253a() {
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            RouteBean routeBean = new RouteBean();
            routeBean.mo40622h("/search/activity");
            routeBean.mo40623i("wiki");
            ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17293a("/search/activity", routeBean);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar, com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public int getTitleBarHeight() {
        return getResources().getDimensionPixelSize(R.dimen.wiki_title_bar_height_min);
    }

    /* renamed from: a */
    public final void mo46813a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "root");
        mo33183d();
        setTitle(getContext().getString(R.string.Doc_Wiki_Home_Title));
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        mo33177a(C12286e.m51163a(context, new C12253a()));
        viewGroup.addView(this, viewGroup.getChildCount());
    }

    public DemoWikiTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DemoWikiTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
