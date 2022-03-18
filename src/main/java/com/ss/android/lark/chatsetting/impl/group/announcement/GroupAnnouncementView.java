package com.ss.android.lark.chatsetting.impl.group.announcement;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57851l;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import java.util.Date;
import java.util.HashMap;

public class GroupAnnouncementView implements AbstractC34561d.AbstractC34563b {

    /* renamed from: a */
    public AbstractC34561d.AbstractC34563b.AbstractC34564a f89200a;

    /* renamed from: b */
    public AbstractC34547b f89201b;

    /* renamed from: c */
    private TextView f89202c;

    /* renamed from: d */
    private Activity f89203d;

    /* renamed from: e */
    private EnumC34546a f89204e = EnumC34546a.SAVE;
    @BindView(6743)
    LinearLayout mGroupAnnouncementContentWrapper;
    @BindView(6745)
    EditText mGroupAnnouncementET;
    @BindView(6744)
    TextView mGroupAnnouncementIssuerTV;
    @BindView(6746)
    LinkEmojiTextView mGroupAnnouncementTV;
    @BindView(6747)
    RelativeLayout mGroupAnnouncementWrapper;
    @BindView(6758)
    LinearLayout mGroupEmptyAnnouncementWrapper;
    @BindView(7600)
    CommonTitleBar mTitleBar;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView$b */
    public interface AbstractC34547b {
        /* renamed from: a */
        void mo127693a();

        /* renamed from: a */
        void mo127694a(EditText editText);

        /* renamed from: a */
        void mo127695a(GroupAnnouncementView groupAnnouncementView);

        /* renamed from: a */
        void mo127696a(String str);

        /* renamed from: b */
        void mo127697b(String str);

        /* renamed from: c */
        void mo127698c(String str);
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView$a */
    private enum EnumC34546a {
        EDIT(0),
        SAVE(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        private EnumC34546a(int i) {
            this.value = i;
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f89200a = null;
        this.f89201b = null;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f89201b.mo127695a(this);
        m134197a();
        m134198b();
    }

    /* renamed from: a */
    private void m134197a() {
        this.mTitleBar.setDividerVisible(false);
        CommonTitleBar commonTitleBar = this.mTitleBar;
        commonTitleBar.setLeftTextColor(commonTitleBar.getResources().getColor(R.color.text_title));
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView.View$OnClickListenerC345411 */

            public void onClick(View view) {
                GroupAnnouncementView.this.f89201b.mo127694a((EditText) null);
            }
        });
    }

    /* renamed from: b */
    private void m134198b() {
        LinkEmojiTextView linkEmojiTextView = this.mGroupAnnouncementTV;
        linkEmojiTextView.setPhoneTextColor(linkEmojiTextView.getResources().getColor(R.color.text_link_hover));
        LinkEmojiTextView linkEmojiTextView2 = this.mGroupAnnouncementTV;
        linkEmojiTextView2.setUrlTextColor(linkEmojiTextView2.getResources().getColor(R.color.text_link_hover));
        this.mGroupAnnouncementET.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView.View$OnFocusChangeListenerC345422 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    GroupAnnouncementView.this.f89201b.mo127693a();
                } else {
                    GroupAnnouncementView.this.f89201b.mo127694a(GroupAnnouncementView.this.mGroupAnnouncementET);
                }
            }
        });
        this.mGroupAnnouncementTV.setPhoneStringClickListener(new LinkEmojiTextView.AbstractC58524i() {
            /* class com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView.C345433 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: b */
            public void mo122809b(View view, String str) {
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: a */
            public void mo122808a(View view, String str) {
                GroupAnnouncementView.this.f89201b.mo127697b(str);
            }
        });
        this.mGroupAnnouncementTV.setUrlStringClickListner(new LinkEmojiTextView.AbstractC58525j() {
            /* class com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView.C345444 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: b */
            public boolean mo122807b(View view, String str) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: a */
            public void mo122806a(View view, String str) {
                GroupAnnouncementView.this.f89201b.mo127696a(str);
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC34561d.AbstractC34563b.AbstractC34564a aVar) {
        this.f89200a = aVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d.AbstractC34563b
    /* renamed from: a */
    public void mo127687a(String str) {
        LKUIToast.show(this.f89203d, str);
    }

    /* renamed from: b */
    private void m134199b(boolean z) {
        int i;
        LinearLayout linearLayout = this.mGroupAnnouncementContentWrapper;
        int i2 = 8;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
        LinearLayout linearLayout2 = this.mGroupEmptyAnnouncementWrapper;
        if (z) {
            i2 = 0;
        }
        linearLayout2.setVisibility(i2);
        if (z) {
            C57582a.m223615c(this.mGroupEmptyAnnouncementWrapper);
        }
    }

    /* renamed from: d */
    private void m134201d(String str) {
        this.f89202c.setText(UIHelper.getString(R.string.Lark_Legacy_Edit));
        this.f89202c.setTextColor(C57582a.m223616d(this.f89203d, R.color.text_title));
        boolean isEmpty = TextUtils.isEmpty(str.trim());
        m134199b(isEmpty);
        if (!isEmpty) {
            this.mGroupAnnouncementET.setVisibility(8);
            this.mGroupAnnouncementTV.setVisibility(0);
            this.mGroupAnnouncementTV.mo198364a(str);
        }
    }

    /* renamed from: a */
    private String m134196a(Date date) {
        if (C26279i.m95158b(date) == 0) {
            return C26279i.m95153a(date, "HH:mm");
        }
        if (C26279i.m95158b(date) == 1) {
            return UIHelper.getString(R.string.Lark_Legacy_Yesterday) + C26279i.m95153a(date, "HH:mm");
        } else if (C26279i.m95164c(date)) {
            return C26279i.m95153a(date, C57851l.m224551d(this.f89203d));
        } else {
            return C26279i.m95153a(date, C57851l.m224552e(this.f89203d));
        }
    }

    /* renamed from: c */
    private void m134200c(String str) {
        this.f89202c.setText(UIHelper.getString(R.string.Lark_Legacy_Save));
        this.f89202c.setTextColor(C57582a.m223616d(this.f89203d, R.color.function_info_500));
        m134199b(false);
        this.mGroupAnnouncementTV.setVisibility(8);
        this.mGroupAnnouncementET.setVisibility(0);
        TextView textView = this.mGroupAnnouncementIssuerTV;
        textView.setText(textView.getResources().getString(R.string.Lark_Legacy_GroupAnnouncementTips));
        String trim = str.trim();
        this.mGroupAnnouncementET.setText(trim);
        this.mGroupAnnouncementET.setSelection(trim.length());
        this.mGroupAnnouncementET.setFocusableInTouchMode(true);
        this.mGroupAnnouncementET.setFocusable(true);
        this.mGroupAnnouncementET.requestFocus();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d.AbstractC34563b
    /* renamed from: b */
    public void mo127689b(String str) {
        EnumC34546a aVar;
        if (!NetworkUtils.m153070c(this.f89203d)) {
            LKUIToast.show(this.f89203d, UIHelper.getString(R.string.Lark_Legacy_NetworkFailed));
            return;
        }
        if (this.f89204e == EnumC34546a.SAVE) {
            aVar = EnumC34546a.EDIT;
        } else {
            aVar = EnumC34546a.SAVE;
        }
        this.f89204e = aVar;
        if (aVar != EnumC34546a.EDIT) {
            String obj = this.mGroupAnnouncementET.getText().toString();
            m134201d(obj);
            this.f89200a.mo127721a(obj);
        } else if (str == null || TextUtils.isEmpty(str.trim())) {
            m134200c("");
        } else {
            m134200c(str);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d.AbstractC34563b
    /* renamed from: a */
    public void mo127685a(AnnouncementViewData announcementViewData) {
        m134199b(announcementViewData.isEmpty);
        if (!announcementViewData.isEmpty) {
            HashMap hashMap = new HashMap();
            hashMap.put("editor", announcementViewData.lastEditorName);
            hashMap.put("time", m134196a(new Date(announcementViewData.updateTime * 1000)));
            this.mGroupAnnouncementIssuerTV.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_GroupAnnouncementPostTime, hashMap));
            this.mGroupAnnouncementTV.mo198364a(announcementViewData.content);
        }
        if (announcementViewData.isInit) {
            return;
        }
        if (announcementViewData.isEmpty) {
            this.f89201b.mo127698c(UIHelper.getString(R.string.Lark_Legacy_NoAnnouncement));
        } else {
            this.f89201b.mo127698c(announcementViewData.content);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d.AbstractC34563b
    /* renamed from: a */
    public void mo127688a(boolean z) {
        if (z) {
            this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Edit)) {
                /* class com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView.C345455 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    super.performAction(view);
                    GroupAnnouncementView.this.f89200a.mo127720a();
                }
            });
            TextView rightText = this.mTitleBar.getRightText();
            this.f89202c = rightText;
            rightText.setTextColor(this.mTitleBar.getResources().getColor(R.color.text_title));
        }
    }

    public GroupAnnouncementView(AbstractC34547b bVar, Activity activity) {
        this.f89201b = bVar;
        this.f89203d = activity;
    }
}
