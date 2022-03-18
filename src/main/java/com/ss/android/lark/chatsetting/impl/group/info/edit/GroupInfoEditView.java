package com.ss.android.lark.chatsetting.impl.group.info.edit;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.ChatStatisticUtil;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.EditTextLengthFilter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

public class GroupInfoEditView implements AbstractC34647d.AbstractC34650b {

    /* renamed from: a */
    public AbstractC34632a f89392a;

    /* renamed from: b */
    public Context f89393b;

    /* renamed from: c */
    public AbstractC34461c.AbstractC34464c f89394c = ChatSettingModule.m133639a().mo127272c();

    /* renamed from: d */
    private AbstractC34647d.AbstractC34650b.AbstractC34651a f89395d;

    /* renamed from: e */
    private DescEditStatus f89396e = DescEditStatus.EDIT;

    /* renamed from: f */
    private Chat f89397f;
    public ImageView mClearBtn;
    View mEditInfoLayout;
    public RelativeLayout mGroupInfoEdit;
    public EditText mInfoEditText;
    public LinkEmojiTextView mInfoShowText;
    public TextView mInputTextCount;
    public ViewGroup mInputTextWrapper;
    public LinearLayout mRootLayout;
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView$a */
    public interface AbstractC34632a {
        /* renamed from: a */
        void mo127925a();

        /* renamed from: a */
        void mo127926a(int i);

        /* renamed from: a */
        void mo127927a(Intent intent);

        /* renamed from: a */
        void mo127928a(GroupInfoEditView groupInfoEditView);

        /* renamed from: a */
        void mo127929a(String str);
    }

    public enum DescEditStatus {
        EDIT(0),
        SAVE(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        private DescEditStatus(int i) {
            this.value = i;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34650b
    /* renamed from: a */
    public void mo127915a(String str) {
        this.f89392a.mo127929a(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34650b
    /* renamed from: a */
    public void mo127916a(String str, DescEditStatus descEditStatus) {
        String str2;
        int i;
        int i2 = 0;
        boolean z = descEditStatus == DescEditStatus.SAVE;
        this.mEditInfoLayout.setVisibility(z ? 8 : 0);
        LinkEmojiTextView linkEmojiTextView = this.mInfoShowText;
        if (!z) {
            i2 = 8;
        }
        linkEmojiTextView.setVisibility(i2);
        TextView rightText = this.mTitleBar.getRightText();
        if (z) {
            str2 = UIHelper.getString(R.string.Lark_Legacy_Edit);
        } else {
            str2 = UIHelper.getString(R.string.Lark_Legacy_Save);
        }
        rightText.setText(str2);
        TextView rightText2 = this.mTitleBar.getRightText();
        if (z) {
            i = UIUtils.getColor(this.f89393b, R.color.text_title);
        } else {
            i = UIUtils.getColor(this.f89393b, R.color.function_info_500);
        }
        rightText2.setTextColor(i);
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!z || isEmpty) {
            m134549b(str.trim());
        } else {
            this.mInfoShowText.mo198364a(str);
        }
    }

    /* renamed from: c */
    public void mo127918c() {
        KeyboardUtils.hideKeyboard(this.f89393b);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f89392a.mo127928a(this);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f89392a = null;
        this.f89395d = null;
    }

    /* renamed from: d */
    private void m134552d() {
        if (DesktopUtil.m144307b()) {
            this.mInfoEditText.setTextSize(14.0f);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34650b
    /* renamed from: a */
    public void mo127909a() {
        LKUIToast.show(this.f89393b, (int) R.drawable.ic_svg_toast_succeed, (int) R.string.Lark_Legacy_SaveSuccess);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34650b
    /* renamed from: b */
    public void mo127917b() {
        this.f89392a.mo127925a();
    }

    /* renamed from: g */
    private void m134555g() {
        String obj = this.mInfoEditText.getText().toString();
        KeyboardUtils.hideKeyboard(this.f89393b);
        if (TextUtils.isEmpty(obj) || !TextUtils.isEmpty(obj.trim())) {
            String trim = obj.trim();
            ChatStatisticUtil.m136662c(this.f89397f, trim);
            this.f89395d.mo127953b(trim);
            return;
        }
        mo127915a(UIUtils.getString(this.f89393b, R.string.Lark_Legacy_ContentEmpty));
    }

    /* renamed from: e */
    private void m134553e() {
        DescEditStatus descEditStatus;
        String obj = this.mInfoEditText.getText().toString();
        if (this.f89396e != DescEditStatus.EDIT || m134545a(obj, 100)) {
            if (this.f89396e == DescEditStatus.SAVE) {
                descEditStatus = DescEditStatus.EDIT;
            } else {
                descEditStatus = DescEditStatus.SAVE;
            }
            this.f89396e = descEditStatus;
            if (descEditStatus == DescEditStatus.EDIT) {
                this.f89395d.mo127950a(this.f89396e);
                return;
            }
            if (!TextUtils.isEmpty(obj)) {
                obj = obj.trim();
            }
            mo127918c();
            this.f89395d.mo127952a(obj, this.f89396e);
        }
    }

    /* renamed from: f */
    private void m134554f() {
        String obj = this.mInfoEditText.getText().toString();
        if (TextUtils.isEmpty(obj) || TextUtils.isEmpty(obj.trim())) {
            mo127915a(UIHelper.getString(R.string.Lark_Legacy_GroupSettingNameCanNotNull));
        } else if (m134545a(obj, 60)) {
            String trim = obj.trim();
            KeyboardUtils.hideKeyboard(this.f89393b);
            ChatStatisticUtil.m136660b(this.f89397f, trim);
            this.f89395d.mo127951a(trim);
        }
    }

    /* renamed from: h */
    private void m134556h() {
        this.mClearBtn.setVisibility(8);
        this.mInputTextWrapper.setVisibility(0);
        EditText editText = this.mInfoEditText;
        editText.setSelection(editText.getText().length());
        this.mInfoEditText.setPadding(0, UIHelper.dp2px(10.0f), 0, 0);
        this.mInfoEditText.setFocusableInTouchMode(true);
        this.mInfoEditText.setFocusable(true);
        this.mInfoEditText.requestFocus();
        this.mInputTextCount.setVisibility(0);
        this.mInfoEditText.setMaxHeight(Integer.MAX_VALUE);
        this.mInputTextWrapper.setMinimumHeight(UIHelper.dp2px(124.0f));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mInfoEditText.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.leftMargin = (int) C25653b.m91892a(this.f89393b, 16.0f);
        layoutParams.rightMargin = (int) C25653b.m91892a(this.f89393b, 16.0f);
        layoutParams.height = -1;
        this.mInfoEditText.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mEditInfoLayout.getLayoutParams();
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        this.mEditInfoLayout.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC34647d.AbstractC34650b.AbstractC34651a aVar) {
        this.f89395d = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m134547b(View view) {
        this.mInfoEditText.setText("");
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34650b
    /* renamed from: a */
    public void mo127912a(Intent intent) {
        this.f89392a.mo127927a(intent);
    }

    /* renamed from: b */
    private void m134549b(String str) {
        this.mInfoEditText.setText(str);
        this.f89396e = DescEditStatus.EDIT;
        m134556h();
    }

    /* renamed from: c */
    private void m134550c(final int i) {
        this.mInfoEditText.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView.C346316 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                int i;
                if (editable == null) {
                    i = 0;
                } else {
                    i = editable.length();
                }
                GroupInfoEditView.this.mo127911a(i, i);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m134542a(View view) {
        this.mInfoEditText.clearFocus();
        this.mRootLayout.setFocusable(true);
        this.mRootLayout.setFocusableInTouchMode(true);
        this.mRootLayout.requestFocus();
    }

    /* renamed from: b */
    private void m134546b(final int i) {
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Save), R.color.primary_pri_500) {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView.C346283 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                GroupInfoEditView.this.mo127910a(i);
            }
        });
        this.mTitleBar.getRightText().setPadding(0, 0, UIHelper.dp2px(15.0f), 0);
    }

    /* renamed from: c */
    private void m134551c(String str) {
        this.mInfoShowText.mo198364a(str);
        this.f89396e = DescEditStatus.SAVE;
        this.mInfoShowText.setVisibility(0);
        this.mInputTextWrapper.setVisibility(8);
        this.mTitleBar.setRightText(UIHelper.getString(R.string.Lark_Legacy_Edit));
    }

    /* renamed from: a */
    private void m134543a(Chat chat) {
        m134550c(60);
        this.mInfoEditText.setSingleLine();
        this.mInfoEditText.setText(chat.getName());
        this.mInfoEditText.setSelection(chat.getName().length());
        this.mClearBtn.setVisibility(0);
        if (chat.isThread()) {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Groups_GroupName));
        } else {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_GroupName));
        }
        this.mInputTextWrapper.setVisibility(0);
        this.mInputTextCount.setVisibility(0);
        this.mInfoEditText.setFocusableInTouchMode(true);
        this.mInfoEditText.setFocusable(true);
        this.mInfoEditText.requestFocus();
    }

    /* renamed from: b */
    private void m134548b(Chat chat) {
        this.mInfoEditText.setHint(R.string.Lark_Legacy_SetADescription);
        m134550c(100);
        this.mInfoShowText.setUrlStringClickListner(new LinkEmojiTextView.AbstractC58525j() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView.C346294 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: b */
            public boolean mo122807b(View view, String str) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: a */
            public void mo122806a(View view, String str) {
                ChatSettingModule.m133639a().mo127269b().mo127250a();
                GroupInfoEditView.this.f89394c.mo127304b(GroupInfoEditView.this.f89393b, str);
            }
        });
        this.mInfoShowText.setPhoneStringClickListener(new LinkEmojiTextView.AbstractC58524i() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView.C346305 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: b */
            public void mo122809b(View view, String str) {
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: a */
            public void mo122808a(View view, String str) {
                ChatSettingModule.m133639a().mo127266a(GroupInfoEditView.this.f89393b, str);
            }
        });
        this.mInfoShowText.setHighlightColor(UIUtils.getColor(this.f89393b, R.color.static_white));
        if (!TextUtils.isEmpty(chat.getDescription())) {
            m134551c(chat.getDescription());
        } else {
            m134549b(chat.getDescription());
        }
        if (chat.isThread()) {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Groups_Description));
        } else {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_GroupDescriptionInfo));
        }
    }

    /* renamed from: a */
    public void mo127910a(int i) {
        if (!NetworkUtils.m153070c(this.f89393b)) {
            mo127915a(UIHelper.getString(R.string.Lark_Legacy_NetworkFailed));
            return;
        }
        ChatSettingExtraParams.Click click = ChatSettingExtraParams.Click.SAVE;
        ChatSettingExtraParams.Target target = ChatSettingExtraParams.Target.IM_EDIT_GROUP_INFO_VIEW;
        if (i == 2) {
            ChatSettingHitPointNew.m136640g(click.plus(target));
            m134553e();
        } else if (i == 1) {
            ChatSettingHitPointNew.m136636e(click.plus(target));
            m134554f();
        } else if (i == 3) {
            ChatSettingExtraParams.Target target2 = ChatSettingExtraParams.Target.IM_CHAT_SETTING_VIEW;
            m134555g();
            ChatSettingHitPointNew.m136638f(click.plus(target2));
        }
    }

    public GroupInfoEditView(Context context, AbstractC34632a aVar) {
        this.f89392a = aVar;
        this.f89393b = context;
    }

    /* renamed from: a */
    private boolean m134545a(String str, int i) {
        boolean z;
        if (str.length() <= i) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            LKUIToast.show(this.f89393b, (int) R.string.Lark_Group_DescriptionCharacterLimitExceeded);
        }
        return z;
    }

    /* renamed from: a */
    private void m134544a(Chat chat, String str) {
        String str2;
        int i;
        this.mInfoEditText.setSingleLine();
        EditText editText = this.mInfoEditText;
        if (str != null) {
            str2 = str;
        } else {
            str2 = "";
        }
        editText.setText(str2);
        EditText editText2 = this.mInfoEditText;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        editText2.setSelection(i);
        this.mInfoEditText.setFilters(new InputFilter[]{new EditTextLengthFilter(64, null)});
        this.mClearBtn.setVisibility(0);
        if (chat.isThread()) {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Groups_MyAlias));
        } else {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_EditGroupNickname));
        }
        this.mInfoEditText.setFocusableInTouchMode(true);
        this.mInfoEditText.setFocusable(true);
        this.mInfoEditText.requestFocus();
    }

    /* renamed from: a */
    public void mo127911a(int i, int i2) {
        boolean z;
        int i3;
        Context context;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String valueOf = String.valueOf(i);
        spannableStringBuilder.append((CharSequence) valueOf).append((CharSequence) "/").append((CharSequence) String.valueOf(i2));
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.f89393b, R.color.function_danger_500)), 0, valueOf.length(), 17);
        }
        if (z) {
            context = this.f89393b;
            i3 = R.color.text_disable;
        } else {
            context = this.f89393b;
            i3 = R.color.function_info_500;
        }
        this.mTitleBar.getRightText().setTextColor(UIUtils.getColor(context, i3));
        this.mInputTextCount.setText(spannableStringBuilder);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34650b
    /* renamed from: a */
    public void mo127913a(Chat chat, final int i, boolean z, String str) {
        this.f89397f = chat;
        if (z) {
            m134546b(i);
        } else {
            this.mInfoEditText.setFocusableInTouchMode(false);
            this.mInfoEditText.setInputType(0);
            this.f89392a.mo127926a(3);
            this.mEditInfoLayout.setBackground(null);
        }
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView.View$OnClickListenerC346261 */

            public void onClick(View view) {
                KeyboardUtils.hideKeyboard(GroupInfoEditView.this.f89393b);
                GroupInfoEditView.this.f89392a.mo127925a();
            }
        });
        this.mInfoEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView.View$OnFocusChangeListenerC346272 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    KeyboardUtils.showKeyboard(GroupInfoEditView.this.mInfoEditText.getContext());
                    if (i == 1) {
                        GroupInfoEditView.this.mClearBtn.setVisibility(0);
                        return;
                    }
                    return;
                }
                GroupInfoEditView.this.mClearBtn.setVisibility(8);
                KeyboardUtils.hideKeyboard(GroupInfoEditView.this.mInfoEditText.getContext(), GroupInfoEditView.this.mInfoEditText);
            }
        });
        this.mClearBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.$$Lambda$GroupInfoEditView$7F0NKojOmDZBw933yfl9DfXpZ2U */

            public final void onClick(View view) {
                GroupInfoEditView.lambda$7F0NKojOmDZBw933yfl9DfXpZ2U(GroupInfoEditView.this, view);
            }
        });
        this.mRootLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.$$Lambda$GroupInfoEditView$fxaJCd6NEsBkrOb1FTap4wiveEg */

            public final void onClick(View view) {
                GroupInfoEditView.lambda$fxaJCd6NEsBkrOb1FTap4wiveEg(GroupInfoEditView.this, view);
            }
        });
        this.mTitleBar.setMainTitleColor(UIUtils.getColor(this.f89393b, R.color.text_title));
        m134552d();
        if (i == 1) {
            ChatSettingHitPointNew.m136633d();
            m134543a(chat);
        } else if (i == 2) {
            ChatSettingHitPointNew.m136635e();
            m134548b(chat);
        } else if (i == 3) {
            m134544a(chat, str);
            ChatSettingHitPointNew.m136637f();
        }
    }
}
