package com.ss.android.lark.search.impl.func.chatinside.mvp;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.C29527a;
import com.ss.android.lark.search.impl.func.chatinside.mvp.AbstractC53528c;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

public class ChatInsideSearchView implements AbstractC53528c.AbstractC53530b {

    /* renamed from: a */
    public AbstractC53525a f132230a;

    /* renamed from: b */
    public final Context f132231b;

    /* renamed from: c */
    public final List<C29527a> f132232c = new ArrayList();

    /* renamed from: d */
    private PagerAdapter f132233d;

    /* renamed from: e */
    private final FragmentManager f132234e;
    @BindView(7748)
    UDTabLayout mTabLayout;
    @BindView(7825)
    CommonTitleBar mTitleBar;
    @BindView(7998)
    ViewPager mViewPager;

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.mvp.ChatInsideSearchView$a */
    public interface AbstractC53525a {
        /* renamed from: a */
        void mo182442a();

        /* renamed from: a */
        void mo182443a(ChatInsideSearchView chatInsideSearchView);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC53528c.AbstractC53530b.AbstractC53531a aVar) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f132230a = null;
    }

    /* renamed from: a */
    private void m207298a() {
        m207300c();
        m207299b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f132230a.mo182443a(this);
        m207298a();
    }

    /* renamed from: b */
    private void m207299b() {
        C535221 r0 = new FragmentPagerAdapter(this.f132234e, 1) {
            /* class com.ss.android.lark.search.impl.func.chatinside.mvp.ChatInsideSearchView.C535221 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return ChatInsideSearchView.this.f132232c.size();
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter
            public Fragment getItem(int i) {
                return ChatInsideSearchView.this.f132232c.get(i).f73820a;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public CharSequence getPageTitle(int i) {
                if (i < ChatInsideSearchView.this.f132232c.size()) {
                    return ChatInsideSearchView.this.f132232c.get(i).f73821b;
                }
                return "";
            }
        };
        this.f132233d = r0;
        this.mViewPager.setAdapter(r0);
        this.mViewPager.setOffscreenPageLimit(5);
        this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.search.impl.func.chatinside.mvp.ChatInsideSearchView.C535232 */

            /* renamed from: b */
            private int f132237b;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onPageSelected(int r12) {
                /*
                // Method dump skipped, instructions count: 191
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.impl.func.chatinside.mvp.ChatInsideSearchView.C535232.onPageSelected(int):void");
            }
        });
        new UDTabLayoutCoordinator(this.mTabLayout, this.mViewPager).attach();
    }

    /* renamed from: c */
    private void m207300c() {
        this.mTitleBar.setLeftVisible(true);
        this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_Title));
        this.mTitleBar.setDividerVisible(false);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.func.chatinside.mvp.ChatInsideSearchView.View$OnClickListenerC535243 */

            public void onClick(View view) {
                KeyboardUtils.hideKeyboard(ChatInsideSearchView.this.f132231b);
                ChatInsideSearchView.this.f132230a.mo182442a();
            }
        });
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.mvp.AbstractC53528c.AbstractC53530b
    /* renamed from: a */
    public void mo182755a(List<C29527a> list) {
        this.f132232c.addAll(list);
        this.f132233d.notifyDataSetChanged();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.mvp.AbstractC53528c.AbstractC53530b
    /* renamed from: a */
    public void mo182753a(int i) {
        if (i > 0 && i < this.f132232c.size()) {
            this.mTabLayout.getTabAt(i).mo91341c().performClick();
        }
    }

    public ChatInsideSearchView(AbstractC53525a aVar, Context context, FragmentManager fragmentManager) {
        this.f132230a = aVar;
        this.f132231b = context;
        this.f132234e = fragmentManager;
    }
}
