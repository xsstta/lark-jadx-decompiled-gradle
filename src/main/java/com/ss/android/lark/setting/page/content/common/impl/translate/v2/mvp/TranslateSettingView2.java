package com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c;
import com.ss.android.lark.setting.page.content.common.impl.translate.p2667c.AbstractC54248c;
import com.ss.android.lark.setting.page.content.common.impl.translate.p2667c.C54247b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.C54307a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TranslateSettingView2;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.settingitem.SettingItemView;
import com.ss.android.lark.widget.settingitem.ThrottleCheckBox;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TranslateSettingView2 extends C54279c {

    /* renamed from: a */
    public final ISettingDependency.ITranslateDependency f134530a = C54115c.m210080a().mo178297i();

    /* renamed from: f */
    public final int f134531f = UIHelper.dp2px(48.0f);

    /* renamed from: g */
    private GlobalDisplayRuleView f134532g;

    /* renamed from: h */
    private GlobalAutoTranslateView f134533h;
    @BindView(7951)
    public SettingItemView mTargetLanguageOption;
    @BindView(7912)
    public CommonTitleBar mTitleBar;
    @BindView(7950)
    public ConstraintLayout mTranslateSetting;

    /* access modifiers changed from: package-private */
    public class GlobalAutoTranslateView {

        /* renamed from: a */
        public final Context f134535a;

        /* renamed from: c */
        private MineTranslateLanguageSetting.C54163b f134537c;
        @BindView(6605)
        public SettingItemView mAutoTranslateDoc;
        @BindView(6608)
        public Group mAutoTranslateGroup;
        @BindView(6609)
        public SettingItemView mAutoTranslateLanguageSettings;
        @BindView(6610)
        public SettingItemView mAutoTranslateMail;
        @BindView(6611)
        public SettingItemView mAutoTranslateMessageView;
        @BindView(6604)
        public SettingItemView mAutoTranslateView;
        @BindView(6612)
        public SettingItemView mAutoTranslateWebView;

        /* renamed from: a */
        public void mo186003a(boolean z, int i) {
            MineTranslateLanguageSetting.C54163b a = MineTranslateLanguageSetting.C54163b.m210276a(this.f134537c.mo185405f());
            if (z) {
                a.mo185399b(i);
            } else {
                a.mo185401c(i);
            }
            mo186004b(z, i);
            TranslateSettingView2.this.f134351d.mo185796b(a.mo185405f());
        }

        /* renamed from: a */
        private void m211137a() {
            if (this.f134537c == null) {
                this.f134537c = MineTranslateLanguageSetting.C54163b.m210276a(0);
            }
            m211141a(this.mAutoTranslateView, new AbstractC54248c() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TranslateSettingView2.GlobalAutoTranslateView.C543821 */

                @Override // com.ss.android.lark.setting.page.content.common.impl.translate.p2667c.AbstractC54248c
                /* renamed from: a */
                public void mo185647a(View view) {
                    int i;
                    if (view instanceof LKUISwitchButton) {
                        LKUISwitchButton lKUISwitchButton = (LKUISwitchButton) view;
                        GlobalAutoTranslateView globalAutoTranslateView = GlobalAutoTranslateView.this;
                        if (lKUISwitchButton.isChecked()) {
                            i = MineTranslateLanguageSetting.C54163b.f134071h;
                        } else {
                            i = MineTranslateLanguageSetting.C54163b.f134064a;
                        }
                        globalAutoTranslateView.mo186001a(i);
                        TranslateSettingView2.this.f134351d.mo185795a(lKUISwitchButton.isChecked());
                        GlobalAutoTranslateView.this.mo186004b(lKUISwitchButton.isChecked(), C54377c.f134516h);
                        if (lKUISwitchButton.isChecked()) {
                            GlobalAutoTranslateView.this.mAutoTranslateView.setBackground(C57582a.m223614c(GlobalAutoTranslateView.this.f134535a, R.drawable.bg_setting_group_item_round_top));
                        } else {
                            GlobalAutoTranslateView.this.mAutoTranslateView.setBackground(C57582a.m223614c(GlobalAutoTranslateView.this.f134535a, R.drawable.bg_setting_group_item_round));
                        }
                    }
                }
            });
            m211139a(this.mAutoTranslateMessageView.getLeftCheckBox(), new CompoundButton.OnCheckedChangeListener() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TranslateSettingView2.GlobalAutoTranslateView.C543832 */

                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    GlobalAutoTranslateView.this.mo186003a(compoundButton.isChecked(), MineTranslateLanguageSetting.C54163b.f134065b);
                }
            });
            m211139a(this.mAutoTranslateDoc.getLeftCheckBox(), new CompoundButton.OnCheckedChangeListener() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TranslateSettingView2.GlobalAutoTranslateView.C543843 */

                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    GlobalAutoTranslateView.this.mo186003a(compoundButton.isChecked(), MineTranslateLanguageSetting.C54163b.f134069f);
                }
            });
            if (!C54307a.m210866a()) {
                this.mAutoTranslateWebView.setVisibility(8);
            } else {
                this.mAutoTranslateWebView.setVisibility(0);
                m211139a(this.mAutoTranslateWebView.getLeftCheckBox(), new CompoundButton.OnCheckedChangeListener() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TranslateSettingView2.GlobalAutoTranslateView.C543854 */

                    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        GlobalAutoTranslateView.this.mo186003a(compoundButton.isChecked(), MineTranslateLanguageSetting.C54163b.f134068e);
                    }
                });
            }
            if (C54307a.m210867b()) {
                this.mAutoTranslateMail.setVisibility(0);
                m211139a(this.mAutoTranslateMail.getLeftCheckBox(), new CompoundButton.OnCheckedChangeListener() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TranslateSettingView2.GlobalAutoTranslateView.C543865 */

                    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        GlobalAutoTranslateView.this.mo186003a(compoundButton.isChecked(), MineTranslateLanguageSetting.C54163b.f134070g);
                    }
                });
            } else {
                this.mAutoTranslateMail.setVisibility(8);
            }
            this.mAutoTranslateLanguageSettings.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.$$Lambda$TranslateSettingView2$GlobalAutoTranslateView$4lT8LnBDVOyNQ6_FM2V3w_QNTRw */

                public final void onClick(View view) {
                    TranslateSettingView2.GlobalAutoTranslateView.this.m211138a((TranslateSettingView2.GlobalAutoTranslateView) view);
                }
            });
            DesktopUtil.m144298a(this.mAutoTranslateView);
            m211142a(this.mAutoTranslateMessageView, this.mAutoTranslateDoc, this.mAutoTranslateWebView, this.mAutoTranslateMail, this.mAutoTranslateLanguageSettings);
        }

        /* renamed from: b */
        private void m211143b() {
            if (this.f134537c == null) {
                this.f134537c = MineTranslateLanguageSetting.C54163b.m210276a(0);
            }
            Log.m165389i("TAG_TRANSLATE_MineTranslateSettingView2", "updateButtonState, state=" + this.f134537c.mo185405f());
            if (this.f134537c.mo185398a()) {
                this.mAutoTranslateView.setBackground(C57582a.m223614c(this.f134535a, R.drawable.bg_setting_group_item_round_top));
                this.mAutoTranslateGroup.setVisibility(0);
                m211140a(this.mAutoTranslateMessageView.getLeftCheckBox(), this.f134537c.mo185400b());
                m211140a(this.mAutoTranslateDoc.getLeftCheckBox(), this.f134537c.mo185403d());
                if (C54307a.m210866a()) {
                    this.mAutoTranslateWebView.setVisibility(0);
                    m211140a(this.mAutoTranslateWebView.getLeftCheckBox(), this.f134537c.mo185402c());
                } else {
                    this.mAutoTranslateWebView.setVisibility(8);
                }
                if (C54307a.m210867b()) {
                    this.mAutoTranslateMail.setVisibility(0);
                    m211140a(this.mAutoTranslateMail.getLeftCheckBox(), this.f134537c.mo185404e());
                } else {
                    this.mAutoTranslateMail.setVisibility(8);
                }
            } else {
                this.mAutoTranslateView.setBackground(C57582a.m223614c(this.f134535a, R.drawable.bg_setting_group_item_round));
                this.mAutoTranslateGroup.setVisibility(8);
                this.mAutoTranslateWebView.setVisibility(8);
                this.mAutoTranslateMail.setVisibility(8);
            }
            m211140a(this.mAutoTranslateView.getRightSwitch(), this.f134537c.mo185398a());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m211138a(View view) {
            TranslateSettingView2.this.f134350c.mo185791d();
        }

        /* renamed from: a */
        private String m211136a(List<String> list) {
            String str;
            if (list == null || list.size() == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            if (list.size() > 1) {
                if (C54115c.m210080a().mo178289d().mo178343b()) {
                    str = ", ";
                } else {
                    str = "、";
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    sb.append(list.get(i));
                    if (i < size - 1) {
                        sb.append(str);
                    }
                }
            } else if (list.size() == 1) {
                sb.append(list.get(0));
            }
            return UIHelper.mustacheFormat(UIUtils.getString(this.f134535a.getApplicationContext(), R.string.Lark_Chat_ExceptRule), "language", sb.toString());
        }

        /* renamed from: a */
        private void m211142a(SettingItemView... settingItemViewArr) {
            if (DesktopUtil.m144301a(this.f134535a)) {
                for (SettingItemView settingItemView : settingItemViewArr) {
                    settingItemView.setMinHeight(TranslateSettingView2.this.f134531f);
                }
            }
        }

        /* renamed from: a */
        public void mo186001a(int i) {
            this.f134537c = MineTranslateLanguageSetting.C54163b.m210276a(i);
            m211143b();
        }

        /* renamed from: a */
        public void mo186002a(Map<String, List<String>> map) {
            if (map != null) {
                this.mAutoTranslateMessageView.setDescription(m211136a(map.get("message")));
                this.mAutoTranslateDoc.setDescription(m211136a(map.get("doc")));
                if (C54307a.m210866a()) {
                    this.mAutoTranslateWebView.setDescription(m211136a(map.get("web")));
                }
                if (C54307a.m210867b()) {
                    this.mAutoTranslateMail.setDescription(m211136a(map.get("mail")));
                }
            }
        }

        /* renamed from: a */
        private void m211139a(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            if (compoundButton != null && onCheckedChangeListener != null) {
                compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
            }
        }

        public GlobalAutoTranslateView(View view) {
            this.f134535a = view.getContext();
            ButterKnife.bind(this, view);
            m211137a();
        }

        /* renamed from: a */
        private void m211140a(CompoundButton compoundButton, boolean z) {
            if (compoundButton == null) {
                return;
            }
            if (compoundButton instanceof LKUISwitchButton) {
                ((LKUISwitchButton) compoundButton).setCheckedImmediatelyNoEvent(z);
            } else if (compoundButton instanceof ThrottleCheckBox) {
                ((ThrottleCheckBox) compoundButton).setCheckedImmediatelyNoEvent(z);
            }
        }

        /* renamed from: a */
        private void m211141a(SettingItemView settingItemView, final AbstractC54248c cVar) {
            if (settingItemView != null && cVar != null) {
                final LKUISwitchButton rightSwitch = settingItemView.getRightSwitch();
                rightSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TranslateSettingView2.GlobalAutoTranslateView.C543876 */

                    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        if (!cVar.mo185648b(compoundButton)) {
                            rightSwitch.setCheckedImmediatelyNoEvent(!z);
                        }
                    }
                });
                settingItemView.setOnClickListener(null);
            }
        }

        /* renamed from: b */
        public void mo186004b(boolean z, int i) {
            String str;
            String str2;
            HashMap hashMap = new HashMap();
            if (z) {
                str = "open";
            } else {
                str = "close";
            }
            hashMap.put("action", str);
            hashMap.put("position", "global_setting");
            if (i == MineTranslateLanguageSetting.C54163b.f134071h) {
                hashMap.put("object", "general");
            } else {
                if (i == MineTranslateLanguageSetting.C54163b.f134065b) {
                    hashMap.put("object", "message");
                } else if (i == MineTranslateLanguageSetting.C54163b.f134066c) {
                    hashMap.put("object", "doc");
                } else if (i == MineTranslateLanguageSetting.C54163b.f134067d) {
                    hashMap.put("object", Comment.f24093e);
                } else if (i == MineTranslateLanguageSetting.C54163b.f134068e) {
                    hashMap.put("object", "web");
                }
                if (this.f134537c.mo185405f() == MineTranslateLanguageSetting.C54163b.f134064a) {
                    str2 = "general_close";
                } else {
                    str2 = "general_open";
                }
                hashMap.put("general", str2);
            }
            Log.m165389i("TAG_TRANSLATE_MineTranslateSettingView2", C54247b.m210657a(hashMap).toString());
            Statistics.sendEvent("autotranslate_setting", C54247b.m210657a(hashMap));
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo186000g();
    }

    public class GlobalAutoTranslateView_ViewBinding implements Unbinder {

        /* renamed from: a */
        private GlobalAutoTranslateView f134546a;

        @Override // butterknife.Unbinder
        public void unbind() {
            GlobalAutoTranslateView globalAutoTranslateView = this.f134546a;
            if (globalAutoTranslateView != null) {
                this.f134546a = null;
                globalAutoTranslateView.mAutoTranslateView = null;
                globalAutoTranslateView.mAutoTranslateMessageView = null;
                globalAutoTranslateView.mAutoTranslateDoc = null;
                globalAutoTranslateView.mAutoTranslateWebView = null;
                globalAutoTranslateView.mAutoTranslateMail = null;
                globalAutoTranslateView.mAutoTranslateLanguageSettings = null;
                globalAutoTranslateView.mAutoTranslateGroup = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public GlobalAutoTranslateView_ViewBinding(GlobalAutoTranslateView globalAutoTranslateView, View view) {
            this.f134546a = globalAutoTranslateView;
            globalAutoTranslateView.mAutoTranslateView = (SettingItemView) Utils.findRequiredViewAsType(view, R.id.auto_translate, "field 'mAutoTranslateView'", SettingItemView.class);
            globalAutoTranslateView.mAutoTranslateMessageView = (SettingItemView) Utils.findRequiredViewAsType(view, R.id.auto_translate_message, "field 'mAutoTranslateMessageView'", SettingItemView.class);
            globalAutoTranslateView.mAutoTranslateDoc = (SettingItemView) Utils.findRequiredViewAsType(view, R.id.auto_translate_doc, "field 'mAutoTranslateDoc'", SettingItemView.class);
            globalAutoTranslateView.mAutoTranslateWebView = (SettingItemView) Utils.findRequiredViewAsType(view, R.id.auto_translate_web, "field 'mAutoTranslateWebView'", SettingItemView.class);
            globalAutoTranslateView.mAutoTranslateMail = (SettingItemView) Utils.findRequiredViewAsType(view, R.id.auto_translate_mail, "field 'mAutoTranslateMail'", SettingItemView.class);
            globalAutoTranslateView.mAutoTranslateLanguageSettings = (SettingItemView) Utils.findRequiredViewAsType(view, R.id.auto_translate_language_settings, "field 'mAutoTranslateLanguageSettings'", SettingItemView.class);
            globalAutoTranslateView.mAutoTranslateGroup = (Group) Utils.findRequiredViewAsType(view, R.id.auto_translate_group, "field 'mAutoTranslateGroup'", Group.class);
        }
    }

    /* access modifiers changed from: package-private */
    public class GlobalDisplayRuleView {

        /* renamed from: a */
        public int f134547a = -1;

        /* renamed from: b */
        public final int f134548b = MineTranslateLanguageSetting.C54162a.f134062a;

        /* renamed from: c */
        public final int f134549c = MineTranslateLanguageSetting.C54162a.f134063b;
        @BindView(6852)
        public SettingItemView mDisplayRuleLanguageSettings;
        @BindView(6853)
        public View mDisplayRuleOption;
        @BindView(6860)
        public UDCheckBox mOnlyTranslateOptionRadioBtn;
        @BindView(6861)
        public TextView mOnlyTranslateOptionTargetTextTV;
        @BindView(6856)
        public UDCheckBox mWithOriginalOptionRadioBtn;
        @BindView(6857)
        public TextView mWithOriginalOptionSourceTextTV;
        @BindView(6858)
        public TextView mWithOriginalOptionTargetTextTV;

        /* renamed from: a */
        private void m211149a() {
            this.mWithOriginalOptionRadioBtn.setClickable(false);
            this.mOnlyTranslateOptionRadioBtn.setClickable(false);
            this.mDisplayRuleOption.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TranslateSettingView2.GlobalDisplayRuleView.View$OnTouchListenerC543881 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        if (motionEvent.getX() < ((float) (view.getWidth() / 2))) {
                            if (GlobalDisplayRuleView.this.f134547a != GlobalDisplayRuleView.this.f134548b) {
                                TranslateSettingView2.this.f134351d.mo185792a(GlobalDisplayRuleView.this.f134548b);
                            }
                        } else if (GlobalDisplayRuleView.this.f134547a != GlobalDisplayRuleView.this.f134549c) {
                            TranslateSettingView2.this.f134351d.mo185792a(GlobalDisplayRuleView.this.f134549c);
                        }
                    }
                    return true;
                }
            });
            this.mDisplayRuleLanguageSettings.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.$$Lambda$TranslateSettingView2$GlobalDisplayRuleView$MdoTDuHuapyLiD2SNkP0U8W2mKo */

                public final void onClick(View view) {
                    TranslateSettingView2.GlobalDisplayRuleView.this.m211150a((TranslateSettingView2.GlobalDisplayRuleView) view);
                }
            });
        }

        /* renamed from: b */
        private void m211151b() {
            if (DesktopUtil.m144307b()) {
                DesktopUtil.m144306b(this.mWithOriginalOptionSourceTextTV, this.mWithOriginalOptionTargetTextTV, this.mOnlyTranslateOptionTargetTextTV, (TextView) this.mDisplayRuleOption.findViewById(R.id.display_rule_option_1_desc), (TextView) this.mDisplayRuleOption.findViewById(R.id.display_rule_option_2_desc));
                this.mDisplayRuleLanguageSettings.setMinHeight(TranslateSettingView2.this.f134531f);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m211150a(View view) {
            TranslateSettingView2.this.f134350c.mo185790c();
        }

        /* renamed from: a */
        public void mo186010a(int i) {
            if (i == this.f134548b) {
                this.mWithOriginalOptionRadioBtn.setChecked(true);
                this.mOnlyTranslateOptionRadioBtn.setChecked(false);
            } else if (i == this.f134549c) {
                this.mWithOriginalOptionRadioBtn.setChecked(false);
                this.mOnlyTranslateOptionRadioBtn.setChecked(true);
            }
            this.f134547a = i;
        }

        public GlobalDisplayRuleView(View view) {
            ButterKnife.bind(this, view);
            m211149a();
            m211151b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo186011a(java.util.List<com.ss.android.lark.setting.page.content.common.dto.LanguageInfo> r7, java.lang.String r8) {
            /*
            // Method dump skipped, instructions count: 175
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TranslateSettingView2.GlobalDisplayRuleView.mo186011a(java.util.List, java.lang.String):void");
        }
    }

    public class GlobalDisplayRuleView_ViewBinding implements Unbinder {

        /* renamed from: a */
        private GlobalDisplayRuleView f134552a;

        @Override // butterknife.Unbinder
        public void unbind() {
            GlobalDisplayRuleView globalDisplayRuleView = this.f134552a;
            if (globalDisplayRuleView != null) {
                this.f134552a = null;
                globalDisplayRuleView.mDisplayRuleOption = null;
                globalDisplayRuleView.mWithOriginalOptionSourceTextTV = null;
                globalDisplayRuleView.mWithOriginalOptionTargetTextTV = null;
                globalDisplayRuleView.mWithOriginalOptionRadioBtn = null;
                globalDisplayRuleView.mOnlyTranslateOptionTargetTextTV = null;
                globalDisplayRuleView.mOnlyTranslateOptionRadioBtn = null;
                globalDisplayRuleView.mDisplayRuleLanguageSettings = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public GlobalDisplayRuleView_ViewBinding(GlobalDisplayRuleView globalDisplayRuleView, View view) {
            this.f134552a = globalDisplayRuleView;
            globalDisplayRuleView.mDisplayRuleOption = Utils.findRequiredView(view, R.id.display_rule_option, "field 'mDisplayRuleOption'");
            globalDisplayRuleView.mWithOriginalOptionSourceTextTV = (TextView) Utils.findRequiredViewAsType(view, R.id.display_rule_option_1_source_text, "field 'mWithOriginalOptionSourceTextTV'", TextView.class);
            globalDisplayRuleView.mWithOriginalOptionTargetTextTV = (TextView) Utils.findRequiredViewAsType(view, R.id.display_rule_option_1_target_text, "field 'mWithOriginalOptionTargetTextTV'", TextView.class);
            globalDisplayRuleView.mWithOriginalOptionRadioBtn = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.display_rule_option_1_radio_btn, "field 'mWithOriginalOptionRadioBtn'", UDCheckBox.class);
            globalDisplayRuleView.mOnlyTranslateOptionTargetTextTV = (TextView) Utils.findRequiredViewAsType(view, R.id.display_rule_option_2_target_text, "field 'mOnlyTranslateOptionTargetTextTV'", TextView.class);
            globalDisplayRuleView.mOnlyTranslateOptionRadioBtn = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.display_rule_option_2_radio_btn, "field 'mOnlyTranslateOptionRadioBtn'", UDCheckBox.class);
            globalDisplayRuleView.mDisplayRuleLanguageSettings = (SettingItemView) Utils.findRequiredViewAsType(view, R.id.display_rule_language_settings, "field 'mDisplayRuleLanguageSettings'", SettingItemView.class);
        }
    }

    /* renamed from: g */
    public void mo186000g() {
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.$$Lambda$TranslateSettingView2$pG1e0zsIsQjkQbRL5iSjiDv__2Y */

            public final void onClick(View view) {
                TranslateSettingView2.this.m211128a((TranslateSettingView2) view);
            }
        });
        this.mTargetLanguageOption.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TranslateSettingView2.C543811 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                TranslateSettingView2.this.f134350c.mo185789b();
            }
        });
        DesktopUtil.m144298a(this.mTargetLanguageOption);
        this.f134532g = new GlobalDisplayRuleView(this.mTranslateSetting);
        DesktopUtil.m144306b((TextView) this.mTranslateSetting.findViewById(R.id.display_rule_label));
        this.f134533h = new GlobalAutoTranslateView(this.mTranslateSetting);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m211128a(View view) {
        this.f134350c.mo185591a();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: b */
    public void mo185781b(int i) {
        super.mo185781b(i);
        this.f134533h.mo186001a(i);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: c */
    public void mo185785c(int i) {
        super.mo185785c(i);
        this.f134532g.mo186010a(i);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185778a(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
        String targetLanguageKey = mineTranslateLanguageSetting.getTargetLanguageKey();
        String str = "";
        if (!CollectionUtils.isEmpty(mineTranslateLanguageSetting.getSupportedLanguageList()) && targetLanguageKey != null) {
            for (LanguageInfo languageInfo : mineTranslateLanguageSetting.getSupportedLanguageList()) {
                String key = languageInfo.getKey();
                if (key != null && key.equals(mineTranslateLanguageSetting.getTargetLanguageKey())) {
                    str = languageInfo.getDisplayName();
                }
            }
        }
        this.mTargetLanguageOption.setRightText(str);
        this.f134532g.mo186010a(mineTranslateLanguageSetting.getDefaultDisplayRule());
        this.f134532g.mo186011a(mineTranslateLanguageSetting.getSupportedLanguageList(), targetLanguageKey);
        this.f134533h.mo186001a(mineTranslateLanguageSetting.getGlobalAutoTranslateScope());
        this.f134533h.mo186002a(m211130b(mineTranslateLanguageSetting));
    }

    /* renamed from: b */
    private Map<String, List<String>> m211130b(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
        boolean z;
        boolean z2;
        boolean z3;
        HashMap hashMap = new HashMap();
        C54377c a = C54377c.m211101a(mineTranslateLanguageSetting.getGlobalAutoTranslateScope());
        boolean z4 = true;
        if (!mineTranslateLanguageSetting.isGlobalAutoTranslate() || !a.mo185973a()) {
            z = false;
        } else {
            z = true;
        }
        if (!mineTranslateLanguageSetting.isGlobalAutoTranslate() || !a.mo185979d()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!mineTranslateLanguageSetting.isGlobalAutoTranslate() || !a.mo185980e() || !C54307a.m210866a()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!mineTranslateLanguageSetting.isGlobalAutoTranslate() || !a.mo185981f() || !C54307a.m210867b()) {
            z4 = false;
        }
        if (mineTranslateLanguageSetting.getSrcLanguages() != null) {
            for (LanguageInfo languageInfo : mineTranslateLanguageSetting.getSrcLanguages()) {
                C54377c autoTranslateScope = languageInfo.getAutoTranslateScope();
                if (z && !autoTranslateScope.mo185973a()) {
                    m211129a(hashMap, "message", languageInfo.getI18nName());
                }
                if (z2 && !autoTranslateScope.mo185979d()) {
                    m211129a(hashMap, "doc", languageInfo.getI18nName());
                }
                if (z3 && !autoTranslateScope.mo185980e()) {
                    m211129a(hashMap, "web", languageInfo.getI18nName());
                }
                if (z4 && !autoTranslateScope.mo185981f()) {
                    m211129a(hashMap, "mail", languageInfo.getI18nName());
                }
            }
        }
        return hashMap;
    }

    public TranslateSettingView2(Activity activity, C54279c.AbstractC54280a aVar) {
        super(activity, aVar);
    }

    /* renamed from: a */
    public LanguageInfo mo185999a(String str, List<LanguageInfo> list) {
        if (list != null && !list.isEmpty()) {
            for (LanguageInfo languageInfo : list) {
                if (TextUtils.equals(str, languageInfo.getKey())) {
                    return languageInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m211129a(Map<String, List<String>> map, String str, String str2) {
        List<String> list = map.get(str);
        if (list == null) {
            list = new ArrayList<>();
            map.put(str, list);
        }
        list.add(str2);
    }
}
