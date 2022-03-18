package com.ss.android.lark.contact.impl.contacts_group;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.C29527a;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_group.AbstractC35598e;
import com.ss.android.lark.contact.impl.contacts_group.join.C35610b;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.widget.DesktopContactsTitle;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

public class ContactsMyGroupView implements AbstractC35598e.AbstractC35600b {

    /* renamed from: a */
    public Context f92044a;

    /* renamed from: b */
    public List<C29527a> f92045b;

    /* renamed from: c */
    protected TextView f92046c;

    /* renamed from: d */
    private final int f92047d = 2;

    /* renamed from: e */
    private final int f92048e = 16;

    /* renamed from: f */
    private final int f92049f = 14;

    /* renamed from: g */
    private AbstractC35589a f92050g;

    /* renamed from: h */
    private FragmentManager f92051h;
    @BindView(7140)
    DesktopContactsTitle mDesktopTitle;
    @BindView(7405)
    UDTabLayout mIndicator;
    @BindView(7349)
    ViewPager mMyGroupVP;
    @BindView(8258)
    CommonTitleBar mTitleBar;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupView$a */
    public interface AbstractC35589a {
        /* renamed from: a */
        void mo131250a(ContactsMyGroupView contactsMyGroupView);

        /* renamed from: a */
        boolean mo131251a();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC35598e.AbstractC35600b.AbstractC35601a aVar) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f92050g = null;
    }

    /* renamed from: a */
    private void m139334a() {
        m139337b();
        m139340d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f92050g.mo131250a(this);
        this.f92044a = this.mTitleBar.getContext();
        m139334a();
    }

    /* renamed from: c */
    private void m139339c() {
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Groupchat), R.color.text_link_normal) {
            /* class com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupView.C355861 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                C35358a.m138143a().mo130175t().mo130206a(ContactsMyGroupView.this.f92044a);
            }
        });
        TextView rightText = this.mTitleBar.getRightText();
        this.f92046c = rightText;
        rightText.setPadding(0, 0, UIUtils.dp2px(this.f92044a, 16.0f), 0);
    }

    /* renamed from: b */
    private void m139337b() {
        if (!DesktopUtil.m144301a(this.f92044a)) {
            this.mTitleBar.setTitle(R.string.Lark_Legacy_MyGroup);
            this.mTitleBar.setDividerVisible(false);
            this.mTitleBar.setVisibility(0);
            boolean a = C35358a.m138143a().mo130150b().mo130208a("contact.mygroup.redesign");
            if (this.f92050g.mo131251a() && a) {
                m139339c();
            }
            this.mDesktopTitle.setVisibility(8);
            return;
        }
        this.mDesktopTitle.setTitle(UIHelper.getString(R.string.Lark_Legacy_MyGroup));
        this.mTitleBar.setVisibility(8);
        this.mDesktopTitle.setVisibility(0);
    }

    /* renamed from: d */
    private void m139340d() {
        this.mMyGroupVP.setAdapter(new FragmentPagerAdapter(this.f92051h) {
            /* class com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupView.C355872 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return ContactsMyGroupView.this.f92045b.size();
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter
            public Fragment getItem(int i) {
                return ContactsMyGroupView.this.f92045b.get(i).f73820a;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public CharSequence getPageTitle(int i) {
                return ContactsMyGroupView.this.f92045b.get(i).f73821b;
            }
        });
        this.mMyGroupVP.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupView.C355883 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (i == 0) {
                    ContactHitPoint.m140813n();
                } else if (i == 1) {
                    ContactHitPoint.m140814o();
                }
            }
        });
        new UDTabLayoutCoordinator(this.mIndicator, this.mMyGroupVP).attach();
        this.mIndicator.getTabAt(0).mo91341c().setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.contact.impl.contacts_group.$$Lambda$ContactsMyGroupView$MDMFRrHKDjfKBj3S5IY_hgYyjzI */

            public final void onClick(View view) {
                ContactsMyGroupView.lambda$MDMFRrHKDjfKBj3S5IY_hgYyjzI(ContactsMyGroupView.this, view);
            }
        });
        this.mIndicator.getTabAt(1).mo91341c().setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.contact.impl.contacts_group.$$Lambda$ContactsMyGroupView$B1Oe8vAXrQQ4SCcABxolxLJT6bU */

            public final void onClick(View view) {
                ContactsMyGroupView.lambda$B1Oe8vAXrQQ4SCcABxolxLJT6bU(ContactsMyGroupView.this, view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m139335a(View view) {
        m139336a(this.f92045b.get(1));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m139338b(View view) {
        m139336a(this.f92045b.get(0));
    }

    /* renamed from: a */
    private void m139336a(C29527a aVar) {
        if (aVar == null) {
            return;
        }
        if (aVar.f73820a instanceof C35610b) {
            ContactHitPoint.m140808i("joined_group");
        } else {
            ContactHitPoint.m140808i("created_group");
        }
    }

    public ContactsMyGroupView(List<C29527a> list, AbstractC35589a aVar, FragmentManager fragmentManager) {
        this.f92050g = aVar;
        this.f92045b = list;
        this.f92051h = fragmentManager;
    }
}
