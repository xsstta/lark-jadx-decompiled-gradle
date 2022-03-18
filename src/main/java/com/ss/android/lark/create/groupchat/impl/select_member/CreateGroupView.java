package com.ss.android.lark.create.groupchat.impl.select_member;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h;
import com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupHitPointNew;
import com.ss.android.lark.create.groupchat.impl.util.FragmentStateHelper;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

public class CreateGroupView implements AbstractC36395h.AbstractC36397b {

    /* renamed from: a */
    FragmentStateHelper f93836a;

    /* renamed from: b */
    public Context f93837b;

    /* renamed from: c */
    public AbstractC36374a f93838c;

    /* renamed from: d */
    public List<C36391e> f93839d = new ArrayList();

    /* renamed from: e */
    public Map<Integer, Fragment> f93840e = new HashMap();

    /* renamed from: f */
    public FragmentPagerAdapter f93841f;

    /* renamed from: g */
    private AbstractC36395h.AbstractC36397b.AbstractC36398a f93842g;

    /* renamed from: h */
    private boolean f93843h;

    /* renamed from: i */
    private String f93844i = "";
    @BindView(6793)
    MagicIndicator mMagicIndicator;
    @BindView(7535)
    CommonTitleBar mTitleBar;
    @BindView(6749)
    ViewPager mViewPager;

    /* renamed from: com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView$a */
    public interface AbstractC36374a {
        /* renamed from: a */
        FragmentManager mo134167a();

        /* renamed from: a */
        void mo134168a(AbstractC36395h.AbstractC36397b bVar);

        /* renamed from: b */
        void mo134169b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f93838c.mo134168a(this);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h.AbstractC36397b
    /* renamed from: a */
    public void mo134156a() {
        int currentItem = this.mViewPager.getCurrentItem();
        if (mo134164b(currentItem)) {
            ((AbstractC36375a) this.f93841f.getItem(currentItem)).mo134067c();
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h.AbstractC36397b
    /* renamed from: b */
    public void mo134163b() {
        if (this.f93836a != null) {
            for (int i = 0; i < this.f93840e.size(); i++) {
                this.f93836a.mo133836b(this.f93840e.get(Integer.valueOf(i)), i);
            }
        }
    }

    /* renamed from: c */
    private void m143363c() {
        if (this.f93843h) {
            this.mTitleBar.setTitle(R.string.Lark_Groups_CreateGroup);
        } else {
            this.mTitleBar.setTitle(R.string.Lark_Legacy_CreateGroupInfo);
        }
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.setDividerVisible(false);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView.View$OnClickListenerC363691 */

            public void onClick(View view) {
                CreateGroupHitPointNew.f93887a.mo134197a("cancel", "none");
                if (DesktopUtil.m144307b()) {
                    CreateGroupView.this.f93838c.mo134169b();
                    return;
                }
                int currentItem = CreateGroupView.this.mViewPager.getCurrentItem();
                if (CreateGroupView.this.mo134164b(currentItem)) {
                    ((AbstractC36375a) CreateGroupView.this.f93841f.getItem(currentItem)).mo134065a();
                }
            }
        });
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(this.f93837b.getResources().getString(R.string.Lark_Legacy_Cancel)) {
            /* class com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView.C363702 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                int currentItem = CreateGroupView.this.mViewPager.getCurrentItem();
                if (CreateGroupView.this.mo134164b(currentItem)) {
                    ((AbstractC36375a) CreateGroupView.this.f93841f.getItem(currentItem)).mo134066b();
                }
            }
        });
        mo134157a(8);
    }

    /* renamed from: a */
    public void mo134159a(FragmentStateHelper cVar) {
        this.f93836a = cVar;
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC36395h.AbstractC36397b.AbstractC36398a aVar) {
        this.f93842g = aVar;
    }

    /* renamed from: a */
    private void m143360a(boolean z) {
        int i;
        MagicIndicator magicIndicator = this.mMagicIndicator;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        magicIndicator.setVisibility(i);
    }

    /* renamed from: b */
    public boolean mo134164b(int i) {
        Fragment item;
        FragmentPagerAdapter fragmentPagerAdapter = this.f93841f;
        if (fragmentPagerAdapter == null || (item = fragmentPagerAdapter.getItem(i)) == null) {
            return false;
        }
        return item instanceof AbstractC36375a;
    }

    /* renamed from: a */
    private boolean m143361a(List<C36391e> list) {
        if (CollectionUtils.isEmpty(list) || list.size() <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo134157a(int i) {
        View rightView = this.mTitleBar.getRightView(0);
        if (rightView != null) {
            rightView.setVisibility(i);
        }
    }

    /* renamed from: b */
    private void m143362b(List<C36391e> list) {
        if (!CollectionUtils.isEmpty(list)) {
            FragmentManager a = this.f93838c.mo134167a();
            this.f93839d.addAll(list);
            for (int i = 0; i < list.size(); i++) {
                C36391e eVar = list.get(i);
                if (eVar instanceof C36376b) {
                    Bundle bundle = new Bundle();
                    bundle.putString(ShareHitPoint.f121868c, this.f93844i);
                    bundle.putSerializable("key_group_create_info", ((C36376b) eVar).f93854a);
                    Fragment instantiate = Fragment.instantiate(this.f93837b, eVar.f93880b, bundle);
                    FragmentStateHelper cVar = this.f93836a;
                    if (cVar != null) {
                        cVar.mo133834a(instantiate, i);
                    }
                    this.f93840e.put(Integer.valueOf(i), instantiate);
                } else {
                    this.f93840e.put(Integer.valueOf(i), Fragment.instantiate(this.f93837b, eVar.f93880b));
                }
            }
            C363713 r8 = new FragmentPagerAdapter(a) {
                /* class com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView.C363713 */

                @Override // androidx.viewpager.widget.PagerAdapter
                public int getCount() {
                    return CreateGroupView.this.f93839d.size();
                }

                @Override // androidx.fragment.app.FragmentPagerAdapter
                public Fragment getItem(int i) {
                    return CreateGroupView.this.f93840e.get(Integer.valueOf(i));
                }
            };
            this.f93841f = r8;
            this.mViewPager.setAdapter(r8);
            C69619a aVar = new C69619a(this.f93837b);
            aVar.setAdjustMode(true);
            aVar.setAdapter(new AbstractC69621a() {
                /* class com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView.C363724 */

                @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
                /* renamed from: a */
                public int mo16055a() {
                    return CreateGroupView.this.f93839d.size();
                }

                @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
                /* renamed from: a */
                public AbstractC69623c mo16056a(Context context) {
                    C69625a aVar = new C69625a(context);
                    aVar.setColors(Integer.valueOf(UIUtils.getColor(context, R.color.primary_pri_500)));
                    aVar.setMode(0);
                    aVar.setLineHeight((float) UIHelper.dp2px(2.0f));
                    return aVar;
                }

                @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
                /* renamed from: a */
                public AbstractC69624d mo16057a(Context context, final int i) {
                    C69627a aVar = new C69627a(context);
                    aVar.setTextSize(14.0f);
                    aVar.setNormalColor(UIUtils.getColor(context, R.color.text_caption));
                    aVar.setSelectedColor(UIUtils.getColor(context, R.color.function_info_500));
                    aVar.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView.C363724.View$OnClickListenerC363731 */

                        public void onClick(View view) {
                            CreateGroupView.this.mViewPager.setCurrentItem(i);
                        }
                    });
                    aVar.setText(UIUtils.getString(CreateGroupView.this.f93837b, CreateGroupView.this.f93839d.get(i).f93881c));
                    return aVar;
                }
            });
            this.mMagicIndicator.setNavigator(aVar);
            C69634c.m267483a(this.mMagicIndicator, this.mViewPager);
        }
    }

    /* renamed from: a */
    public void mo134161a(String str) {
        this.f93844i = str;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h.AbstractC36397b
    /* renamed from: a */
    public void mo134162a(List<C36391e> list, GroupCreateInfo groupCreateInfo) {
        m143363c();
        m143362b(list);
        m143360a(m143361a(list));
    }

    public CreateGroupView(Context context, AbstractC36374a aVar, boolean z) {
        this.f93837b = context;
        this.f93838c = aVar;
        this.f93843h = z;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h.AbstractC36397b
    /* renamed from: a */
    public void mo134158a(int i, int i2, Intent intent) {
        int currentItem = this.mViewPager.getCurrentItem();
        if (mo134164b(currentItem)) {
            AbstractC36375a aVar = (AbstractC36375a) this.f93841f.getItem(currentItem);
            if (aVar instanceof AbstractC36394g) {
                ((AbstractC36394g) aVar).onActivityResult(i, i2, intent);
            }
        }
    }
}
