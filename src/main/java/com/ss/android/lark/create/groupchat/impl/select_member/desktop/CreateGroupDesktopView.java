package com.ss.android.lark.create.groupchat.impl.select_member.desktop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36375a;
import com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36394g;
import com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h;
import com.ss.android.lark.create.groupchat.impl.select_member.C36376b;
import com.ss.android.lark.create.groupchat.impl.select_member.C36391e;
import com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.switch_button.SwitchButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

public class CreateGroupDesktopView implements AbstractC36395h.AbstractC36397b {

    /* renamed from: a */
    public Context f93857a;

    /* renamed from: b */
    public CreateGroupView.AbstractC36374a f93858b;

    /* renamed from: c */
    public List<C36391e> f93859c = new ArrayList();

    /* renamed from: d */
    public Map<Integer, Fragment> f93860d = new HashMap();

    /* renamed from: e */
    public GroupCreateInfo f93861e;

    /* renamed from: f */
    private AbstractC36395h.AbstractC36397b.AbstractC36398a f93862f;

    /* renamed from: g */
    private FragmentPagerAdapter f93863g;

    /* renamed from: h */
    private boolean f93864h;
    @BindView(6492)
    UDCheckBox mChatCheckBox;
    @BindView(6500)
    TextView mChatTextView;
    @BindView(6498)
    View mMode;
    @BindView(6495)
    EditText mNameEditText;
    @BindView(6493)
    UDCheckBox mSecretCheckBox;
    @BindView(6501)
    TextView mSecretTextView;
    @BindView(6504)
    ImageView mTitleClose;
    @BindView(6494)
    UDCheckBox mTopicCheckBox;
    @BindView(6502)
    TextView mTopicTextView;
    @BindView(6507)
    SwitchButton mTypeSwitch;
    @BindView(6508)
    TextView mTypeSwitchDesc;
    @BindView(6749)
    ViewPager mViewPager;

    /* renamed from: a */
    private void m143400a(boolean z) {
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h.AbstractC36397b
    /* renamed from: b */
    public void mo134163b() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f93858b.mo134168a(this);
    }

    /* renamed from: g */
    private void m143407g() {
        this.mTitleClose.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.create.groupchat.impl.select_member.desktop.CreateGroupDesktopView.View$OnClickListenerC363833 */

            public void onClick(View view) {
                CreateGroupDesktopView.this.f93858b.mo134169b();
            }
        });
    }

    /* renamed from: d */
    private void m143404d() {
        this.mTypeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.create.groupchat.impl.select_member.desktop.CreateGroupDesktopView.C363811 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CreateGroupDesktopView.this.f93861e.setPublic(!z);
                CreateGroupDesktopView.this.mo134184c();
            }
        });
        this.mTypeSwitch.setChecked(!this.f93861e.isPublic());
    }

    /* renamed from: e */
    private void m143405e() {
        this.mNameEditText.setText("");
        this.mNameEditText.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.create.groupchat.impl.select_member.desktop.CreateGroupDesktopView.C363822 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                CreateGroupDesktopView.this.f93861e.setName(editable.toString());
            }
        });
    }

    /* renamed from: f */
    private void m143406f() {
        if (this.f93861e.getShowGroupTypeSelector()) {
            m143398a(0);
            if (this.f93864h) {
                this.mTopicCheckBox.setChecked(true);
            } else {
                this.mChatCheckBox.setChecked(true);
            }
            $$Lambda$CreateGroupDesktopView$gL8_pxn2UDneE_zdokPdNc6ZAeQ r0 = new UDCheckBox.OnCheckedChangeListener() {
                /* class com.ss.android.lark.create.groupchat.impl.select_member.desktop.$$Lambda$CreateGroupDesktopView$gL8_pxn2UDneE_zdokPdNc6ZAeQ */

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
                public final void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                    CreateGroupDesktopView.this.m143399a((CreateGroupDesktopView) uDCheckBox, (UDCheckBox) z);
                }
            };
            this.mChatCheckBox.setOnCheckedChangeListener(r0);
            this.mTopicCheckBox.setOnCheckedChangeListener(r0);
            this.mSecretCheckBox.setOnCheckedChangeListener(r0);
            return;
        }
        m143398a(8);
    }

    /* renamed from: c */
    public void mo134184c() {
        int i;
        int i2;
        TextView textView = this.mTypeSwitchDesc;
        if (this.f93861e.isPublic()) {
            i = R.string.Lark_Group_CreateGroup_TypeSwitch_Public_Tip;
        } else {
            i = R.string.Lark_Group_CreateGroup_TypeSwitch_Private_Tip;
        }
        textView.setText(i);
        EditText editText = this.mNameEditText;
        if (this.f93861e.isPublic()) {
            i2 = R.string.Lark_Group_CreateGroup_TypePublic_SetName;
        } else {
            i2 = R.string.Lark_Legacy_SetGroupNameOption;
        }
        editText.setHint(i2);
        if (this.f93861e.isPublic()) {
            this.mSecretCheckBox.setVisibility(8);
            this.mSecretTextView.setVisibility(8);
            if (this.mSecretCheckBox.isChecked()) {
                this.mChatCheckBox.setChecked(true);
                return;
            }
            return;
        }
        this.mSecretCheckBox.setVisibility(0);
        this.mSecretTextView.setVisibility(0);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h.AbstractC36397b
    /* renamed from: a */
    public void mo134156a() {
        int currentItem = this.mViewPager.getCurrentItem();
        if (m143403b(currentItem)) {
            ((AbstractC36375a) this.f93863g.getItem(currentItem)).mo134067c();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC36395h.AbstractC36397b.AbstractC36398a aVar) {
        this.f93862f = aVar;
    }

    /* renamed from: b */
    private boolean m143403b(int i) {
        Fragment item;
        FragmentPagerAdapter fragmentPagerAdapter = this.f93863g;
        if (fragmentPagerAdapter == null || (item = fragmentPagerAdapter.getItem(i)) == null) {
            return false;
        }
        return item instanceof AbstractC36375a;
    }

    /* renamed from: a */
    private boolean m143401a(List<C36391e> list) {
        if (CollectionUtils.isEmpty(list) || list.size() <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m143398a(int i) {
        this.mMode.setVisibility(i);
        this.mTypeSwitch.setVisibility(i);
        this.mTypeSwitchDesc.setVisibility(i);
        this.mChatCheckBox.setVisibility(i);
        this.mChatTextView.setVisibility(i);
        this.mTopicCheckBox.setVisibility(i);
        this.mTopicTextView.setVisibility(i);
        this.mSecretCheckBox.setVisibility(i);
        this.mSecretTextView.setVisibility(i);
    }

    /* renamed from: b */
    private void m143402b(List<C36391e> list) {
        if (!CollectionUtils.isEmpty(list)) {
            FragmentManager a = this.f93858b.mo134167a();
            this.f93859c.addAll(list);
            for (int i = 0; i < list.size(); i++) {
                C36391e eVar = list.get(i);
                if (eVar instanceof C36376b) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("key_group_create_info", ((C36376b) eVar).f93854a);
                    this.f93860d.put(Integer.valueOf(i), Fragment.instantiate(this.f93857a, eVar.f93880b, bundle));
                } else {
                    this.f93860d.put(Integer.valueOf(i), Fragment.instantiate(this.f93857a, eVar.f93880b));
                }
            }
            C363844 r8 = new FragmentPagerAdapter(a) {
                /* class com.ss.android.lark.create.groupchat.impl.select_member.desktop.CreateGroupDesktopView.C363844 */

                @Override // androidx.viewpager.widget.PagerAdapter
                public int getCount() {
                    return CreateGroupDesktopView.this.f93859c.size();
                }

                @Override // androidx.fragment.app.FragmentPagerAdapter
                public Fragment getItem(int i) {
                    return CreateGroupDesktopView.this.f93860d.get(Integer.valueOf(i));
                }
            };
            this.f93863g = r8;
            this.mViewPager.setAdapter(r8);
            C69619a aVar = new C69619a(this.f93857a);
            aVar.setAdjustMode(true);
            aVar.setAdapter(new AbstractC69621a() {
                /* class com.ss.android.lark.create.groupchat.impl.select_member.desktop.CreateGroupDesktopView.C363855 */

                @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
                /* renamed from: a */
                public int mo16055a() {
                    return CreateGroupDesktopView.this.f93859c.size();
                }

                @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
                /* renamed from: a */
                public AbstractC69623c mo16056a(Context context) {
                    C69625a aVar = new C69625a(context);
                    aVar.setColors(Integer.valueOf(UIHelper.getColor(R.color.lkui_B500)));
                    aVar.setMode(0);
                    aVar.setLineHeight((float) UIHelper.dp2px(2.0f));
                    return aVar;
                }

                @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
                /* renamed from: a */
                public AbstractC69624d mo16057a(Context context, final int i) {
                    C69627a aVar = new C69627a(context);
                    aVar.setTextSize(14.0f);
                    aVar.setNormalColor(UIHelper.getColor(R.color.lkui_N600));
                    aVar.setSelectedColor(UIHelper.getColor(R.color.lkui_B500));
                    aVar.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.lark.create.groupchat.impl.select_member.desktop.CreateGroupDesktopView.C363855.View$OnClickListenerC363861 */

                        public void onClick(View view) {
                            CreateGroupDesktopView.this.mViewPager.setCurrentItem(i);
                        }
                    });
                    aVar.setText(UIUtils.getString(CreateGroupDesktopView.this.f93857a, CreateGroupDesktopView.this.f93859c.get(i).f93881c));
                    return aVar;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m143399a(UDCheckBox uDCheckBox, boolean z) {
        if (z) {
            UDCheckBox uDCheckBox2 = this.mChatCheckBox;
            if (uDCheckBox2 == uDCheckBox) {
                this.mTopicCheckBox.setChecked(false);
                this.mSecretCheckBox.setChecked(false);
                this.f93861e.setCreateTopicGroup(false);
                this.f93861e.setMode(CreateGroupMode.CONVERSATION_MODE);
            } else if (this.mTopicCheckBox == uDCheckBox) {
                uDCheckBox2.setChecked(false);
                this.mSecretCheckBox.setChecked(false);
                this.f93861e.setCreateTopicGroup(true);
                this.f93861e.setMode(CreateGroupMode.TOPIC_MODE);
            } else {
                uDCheckBox2.setChecked(false);
                this.mTopicCheckBox.setChecked(false);
                this.f93861e.setCreateTopicGroup(false);
                this.f93861e.setMode(CreateGroupMode.SECRET_MODE);
            }
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h.AbstractC36397b
    /* renamed from: a */
    public void mo134162a(List<C36391e> list, GroupCreateInfo groupCreateInfo) {
        this.f93861e = groupCreateInfo;
        m143407g();
        m143402b(list);
        m143400a(m143401a(list));
        m143404d();
        m143406f();
        m143405e();
    }

    public CreateGroupDesktopView(Context context, CreateGroupView.AbstractC36374a aVar, boolean z) {
        this.f93857a = context;
        this.f93858b = aVar;
        this.f93864h = z;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h.AbstractC36397b
    /* renamed from: a */
    public void mo134158a(int i, int i2, Intent intent) {
        int currentItem = this.mViewPager.getCurrentItem();
        if (m143403b(currentItem)) {
            AbstractC36375a aVar = (AbstractC36375a) this.f93863g.getItem(currentItem);
            if (aVar instanceof AbstractC36394g) {
                ((AbstractC36394g) aVar).onActivityResult(i, i2, intent);
            }
        }
    }
}
