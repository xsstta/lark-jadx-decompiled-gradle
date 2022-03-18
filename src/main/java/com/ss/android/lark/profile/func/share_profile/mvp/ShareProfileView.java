package com.ss.android.lark.profile.func.share_profile.mvp;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import com.larksuite.framework.mvp.IView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.C29527a;
import com.ss.android.lark.profile.func.share_profile.mvp.AbstractC52488a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

public class ShareProfileView implements AbstractC52488a.AbstractC52490b {

    /* renamed from: a */
    public AbstractC52487a f129947a;

    /* renamed from: b */
    public Context f129948b;

    /* renamed from: c */
    public List<C29527a> f129949c;

    /* renamed from: d */
    private FragmentManager f129950d;

    /* renamed from: e */
    private AbstractC69621a f129951e = new AbstractC69621a() {
        /* class com.ss.android.lark.profile.func.share_profile.mvp.ShareProfileView.C524831 */

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            return ShareProfileView.this.f129949c.size();
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            C69625a aVar = new C69625a(ShareProfileView.this.f129948b);
            aVar.setColors(Integer.valueOf(UIHelper.getColor(R.color.lkui_B500)));
            aVar.setMode(0);
            aVar.setLineHeight((float) UIHelper.dp2px(2.0f));
            return aVar;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, final int i) {
            C69627a aVar = new C69627a(ShareProfileView.this.f129948b);
            aVar.setTextSize(14.0f);
            aVar.setNormalColor(UIHelper.getColor(R.color.lkui_N900));
            aVar.setSelectedColor(UIHelper.getColor(R.color.lkui_B500));
            aVar.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.profile.func.share_profile.mvp.ShareProfileView.C524831.View$OnClickListenerC524841 */

                public void onClick(View view) {
                    ShareProfileView.this.mShareContactProfileVP.setCurrentItem(i);
                }
            });
            aVar.setText(ShareProfileView.this.f129949c.get(i).f73821b);
            return aVar;
        }
    };
    @BindView(7712)
    MagicIndicator mIndicator;
    @BindView(7714)
    ViewPager mShareContactProfileVP;
    @BindView(7713)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.profile.func.share_profile.mvp.ShareProfileView$a */
    public interface AbstractC52487a {
        /* renamed from: a */
        void mo179476a();

        /* renamed from: a */
        void mo179477a(ShareProfileView shareProfileView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f129947a = null;
    }

    @Override // com.larksuite.framework.mvp.IView
    public void setViewDelegate(IView.IViewDelegate iViewDelegate) {
    }

    /* renamed from: a */
    private void m203315a() {
        m203316b();
        m203317c();
    }

    /* renamed from: b */
    private void m203316b() {
        this.mTitleBar.setTitle(R.string.Lark_Legacy_PersoncardShareTitle);
        this.mTitleBar.setDividerVisible(false);
        this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.profile.func.share_profile.mvp.ShareProfileView.View$OnClickListenerC524852 */

            public void onClick(View view) {
                ShareProfileView.this.f129947a.mo179476a();
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f129947a.mo179477a(this);
        this.f129948b = this.mTitleBar.getContext();
        m203315a();
    }

    /* renamed from: c */
    private void m203317c() {
        this.mShareContactProfileVP.setAdapter(new FragmentPagerAdapter(this.f129950d) {
            /* class com.ss.android.lark.profile.func.share_profile.mvp.ShareProfileView.C524863 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return ShareProfileView.this.f129949c.size();
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter
            public Fragment getItem(int i) {
                return ShareProfileView.this.f129949c.get(i).f73820a;
            }
        });
        C69619a aVar = new C69619a(this.f129948b);
        aVar.setAdjustMode(true);
        aVar.setAdapter(this.f129951e);
        this.mIndicator.setNavigator(aVar);
        C69634c.m267483a(this.mIndicator, this.mShareContactProfileVP);
    }

    public ShareProfileView(AbstractC52487a aVar, FragmentManager fragmentManager, List<C29527a> list) {
        this.f129947a = aVar;
        this.f129950d = fragmentManager;
        this.f129949c = list;
    }
}
