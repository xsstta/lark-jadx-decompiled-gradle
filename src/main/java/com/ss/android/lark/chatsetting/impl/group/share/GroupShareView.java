package com.ss.android.lark.chatsetting.impl.group.share;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.AbstractC1045n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeFragment;
import com.ss.android.lark.chatsetting.impl.group.share.C35002h;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.ui.AbstractC57604f;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.List;

public class GroupShareView implements C35002h.AbstractC35004b {

    /* renamed from: a */
    public AbstractC34987b f90290a;

    /* renamed from: b */
    public Context f90291b;

    /* renamed from: c */
    private AbstractC34461c.AbstractC34483v f90292c = ChatSettingModule.m133639a().mo127285o();

    /* renamed from: d */
    private C34986a f90293d;
    @BindView(7435)
    UDTabLayout mTabLayout;
    @BindView(7593)
    CommonTitleBar mTitleBar;
    @BindView(6586)
    ViewPager mViewPager;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.share.GroupShareView$b */
    public interface AbstractC34987b {
        /* renamed from: a */
        FragmentManager mo128959a();

        /* renamed from: a */
        void mo128960a(GroupShareView groupShareView);

        /* renamed from: b */
        void mo128961b();
    }

    /* renamed from: a */
    public void setViewDelegate(C35002h.AbstractC35004b.AbstractC35005a aVar) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.share.GroupShareView$a */
    class C34986a extends AbstractC1045n {

        /* renamed from: b */
        private List<Fragment> f90307b;

        /* renamed from: c */
        private List<String> f90308c;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f90307b.size();
        }

        @Override // androidx.fragment.app.AbstractC1045n
        /* renamed from: a */
        public Fragment mo5615a(int i) {
            return this.f90307b.get(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            return this.f90308c.get(i);
        }

        public C34986a(FragmentManager fragmentManager, List<Fragment> list, List<String> list2) {
            super(fragmentManager);
            this.f90307b = list;
            this.f90308c = list2;
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f90290a.mo128960a(this);
        m136224a();
        ChatSettingHitPointNew.m136643i();
    }

    /* renamed from: a */
    private void m136224a() {
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.setRightVisible(false);
        this.mTitleBar.setLeftClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.share.GroupShareView.C349832 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                GroupShareView.this.f90290a.mo128961b();
            }
        });
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIUtils.getString(this.f90291b, R.string.Lark_Legacy_Select)) {
            /* class com.ss.android.lark.chatsetting.impl.group.share.GroupShareView.C349843 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                C34986a aVar = (C34986a) GroupShareView.this.mViewPager.getAdapter();
                if (aVar != null) {
                    Fragment a = aVar.mo5615a(0);
                    if (a instanceof AbstractC57604f) {
                        ((AbstractC57604f) a).mo128968a("multiSelect", null);
                    }
                }
            }
        });
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.share.GroupShareView.View$OnClickListenerC349854 */

            public void onClick(View view) {
                ChatSettingHitPointNew.m136646j(ChatSettingExtraParams.Click.CANCEL.plus(ChatSettingExtraParams.Target.IM_CHAT_SETTING_VIEW));
                GroupShareView.this.f90290a.mo128961b();
            }
        });
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35002h.AbstractC35004b
    /* renamed from: a */
    public void mo128955a(String str) {
        this.mTitleBar.setTitle(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35002h.AbstractC35004b
    /* renamed from: b */
    public void mo128957b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mTitleBar.setRightText(str);
            this.mTitleBar.setRightVisible(true);
            return;
        }
        this.mTitleBar.setRightText(str);
        this.mTitleBar.setRightVisible(false);
    }

    public GroupShareView(Context context, AbstractC34987b bVar) {
        this.f90291b = context;
        this.f90290a = bVar;
    }

    /* renamed from: a */
    public void mo128953a(Fragment fragment, Chat chat) {
        if (fragment instanceof GroupShareLinkFragment) {
            GroupHitPoint.f90519a.mo129246h(chat);
        } else if (fragment instanceof GroupQRCodeFragment) {
            GroupHitPoint.f90519a.mo129210a(chat, "share_icon");
        } else {
            GroupHitPoint.f90519a.mo129248i(chat);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35002h.AbstractC35004b
    /* renamed from: a */
    public void mo128952a(int i, int i2, Intent intent) {
        int currentItem = this.mViewPager.getCurrentItem();
        C34986a aVar = this.f90293d;
        if (aVar != null && aVar.mo5615a(currentItem) != null) {
            this.f90293d.mo5615a(currentItem).onActivityResult(i, i2, intent);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35002h.AbstractC35004b
    /* renamed from: a */
    public void mo128956a(final boolean z, boolean z2, boolean z3, boolean z4, final int i, Bundle bundle, final Chat chat) {
        final int i2;
        final boolean z5;
        int i3;
        String str;
        String str2;
        String str3;
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        bundle.putBoolean("extra_key_show_title_bar", false);
        bundle.putBoolean("extra_key_delay_init_fragment", true);
        int i4 = -1;
        if (z) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        final ArrayList arrayList3 = new ArrayList(3);
        final ArrayList arrayList4 = new ArrayList(3);
        if (i == 1 || i == 2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z) {
            if (i == 1) {
                arrayList.add(this.f90292c.mo127437a(this.f90291b, bundle, chat));
                if (chat.isThread()) {
                    str3 = UIUtils.getString(this.f90291b, R.string.Lark_Groups_CircleCard);
                } else {
                    str3 = UIUtils.getString(this.f90291b, R.string.Lark_Chat_ShareCard);
                }
                arrayList3.add(ChatSettingExtraParams.Click.GROUP_PROFILE);
                arrayList4.add(ChatSettingExtraParams.Target.PUBLIC_MULTI_SELECT_SHARE_VIEW);
                arrayList2.add(str3);
            } else {
                bundle.putString("key_chat_id", chat.getId());
                bundle.putBoolean("key_chat_is_edu", chat.isEdu());
                arrayList.add(this.f90292c.mo127438a(bundle));
                arrayList3.add(ChatSettingExtraParams.Click.GROUP_MEMBER_ADD);
                arrayList4.add(ChatSettingExtraParams.Target.IM_GROUP_MEMBER_ADD_VIEW);
                arrayList2.add(UIUtils.getString(this.f90291b, R.string.Lark_Legacy_GroupAddMemberTitle));
            }
        }
        if (z2 && ChatSettingModule.m133639a().mo127293w().mo127388a()) {
            arrayList.add(GroupShareLinkFragment.m136208a(bundle));
            if (chat.isThread()) {
                str2 = UIUtils.getString(this.f90291b, R.string.Lark_Groups_CircleLink);
            } else {
                str2 = UIUtils.getString(this.f90291b, R.string.Lark_Chat_ShareLink);
            }
            arrayList3.add(ChatSettingExtraParams.Click.GROUP_LINK);
            arrayList4.add(ChatSettingExtraParams.Target.IM_GROUP_LINK_VIEW);
            arrayList2.add(str2);
        }
        if (z3) {
            GroupQRCodeFragment groupQRCodeFragment = new GroupQRCodeFragment();
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putBoolean("extra_key_delay_init_fragment", !z4);
            groupQRCodeFragment.setArguments(bundle2);
            if (z4) {
                i4 = arrayList.size();
            }
            arrayList.add(groupQRCodeFragment);
            if (chat.isThread()) {
                str = UIUtils.getString(this.f90291b, R.string.Lark_Groups_CircleQRCode);
            } else {
                str = UIUtils.getString(this.f90291b, R.string.Lark_Chat_ShareQRCode);
            }
            arrayList3.add(ChatSettingExtraParams.Click.GROUP_QR);
            arrayList4.add(ChatSettingExtraParams.Target.IM_GROUP_QR_VIEW);
            arrayList2.add(str);
            i3 = i4;
        } else {
            i3 = -1;
        }
        this.f90293d = new C34986a(this.f90290a.mo128959a(), arrayList, arrayList2);
        new UDTabLayoutCoordinator(this.mTabLayout, this.mViewPager).attach();
        this.mViewPager.setAdapter(this.f90293d);
        this.mViewPager.setOffscreenPageLimit(2);
        this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.share.GroupShareView.C349821 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                boolean z;
                if (i != i2) {
                    KeyboardUtils.hideKeyboard(GroupShareView.this.f90291b);
                }
                if (GroupShareView.this.mTitleBar != null) {
                    CommonTitleBar commonTitleBar = GroupShareView.this.mTitleBar;
                    if (i != 0 || !z || i != 1 || TextUtils.isEmpty(GroupShareView.this.mTitleBar.getRightText().toString())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    commonTitleBar.setRightVisible(z);
                }
                GroupShareView.this.mo128953a((Fragment) arrayList.get(i), chat);
                if (z5) {
                    IParam plus = ((IParam) arrayList3.get(i)).plus((IParam) arrayList4.get(i));
                    int i2 = i;
                    if (i2 == 1) {
                        ChatSettingHitPointNew.m136648k(plus);
                    } else if (i2 == 2) {
                        ChatSettingHitPointNew.m136646j(plus);
                    }
                }
            }
        });
        if (!z4 || !z3) {
            mo128953a((Fragment) arrayList.get(this.mViewPager.getCurrentItem()), chat);
        } else {
            this.mViewPager.setCurrentItem(i3);
        }
    }
}
