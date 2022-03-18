package com.ss.android.lark.mine.impl.status.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupHelper;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.dto.C45423a;
import com.ss.android.lark.mine.impl.status.C45801a;
import com.ss.android.lark.mine.impl.status.C45803b;
import com.ss.android.lark.mine.impl.status.C45809c;
import com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a;
import com.ss.android.lark.mine.impl.status.p2282a.C45802a;
import com.ss.android.lark.mine.impl.status.statistics.ProfileHitPointV3;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiconEditText;

public class UserStatusView implements AbstractC45819a.AbstractC45821b {

    /* renamed from: a */
    public AbstractC45818a f115600a;

    /* renamed from: b */
    public AbstractC45819a.AbstractC45821b.AbstractC45822a f115601b;

    /* renamed from: c */
    public C45803b f115602c;

    /* renamed from: d */
    public ChatterDescription.Type f115603d = ChatterDescription.Type.DEFAULT;

    /* renamed from: e */
    public String f115604e;

    /* renamed from: f */
    private Activity f115605f;

    /* renamed from: g */
    private Bundle f115606g;
    @BindView(JosStatusCodes.RTN_CODE_NO_SUPPORT_JOS)
    TextView mCountTextView;
    @BindView(7660)
    RecyclerView mHistoryStatusRV;
    @BindView(6949)
    EmojiconEditText mInputTV;
    @BindView(7956)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.mine.impl.status.mvp.UserStatusView$a */
    public interface AbstractC45818a {
        /* renamed from: a */
        void mo161049a();

        /* renamed from: a */
        void mo161050a(UserStatusView userStatusView);

        /* renamed from: b */
        void mo161051b();

        /* renamed from: c */
        void mo161052c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f115600a.mo161050a(this);
        m181518b();
        m181519c();
        m181520d();
    }

    /* renamed from: c */
    private void m181519c() {
        this.f115602c = new C45803b(this.f115605f, new C45803b.AbstractC45807b() {
            /* class com.ss.android.lark.mine.impl.status.mvp.UserStatusView.C458143 */

            @Override // com.ss.android.lark.mine.impl.status.C45803b.AbstractC45807b
            /* renamed from: a */
            public void mo161042a(String str, ChatterDescription.Type type) {
                UserStatusView.this.mo161057a(str, type);
                ProfileHitPointV3.m181507a();
            }
        }, new C45803b.AbstractC45808c() {
            /* class com.ss.android.lark.mine.impl.status.mvp.UserStatusView.C458154 */

            @Override // com.ss.android.lark.mine.impl.status.C45803b.AbstractC45808c
            /* renamed from: a */
            public void mo161043a(ChatterDescription chatterDescription) {
                UserStatusView.this.f115602c.getIndex(chatterDescription);
                int itemCount = UserStatusView.this.f115602c.getItemCount() - 1;
                UserStatusView.this.f115602c.remove(chatterDescription);
                UserStatusView.this.f115602c.notifyDataSetChanged();
                UserStatusView.this.f115601b.mo161067a(chatterDescription);
            }
        });
    }

    /* renamed from: b */
    private void m181518b() {
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mine.impl.status.mvp.UserStatusView.View$OnClickListenerC458121 */

            public void onClick(View view) {
                UserStatusView.this.f115600a.mo161049a();
                UserStatusView.this.f115600a.mo161052c();
            }
        });
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Save), R.color.primary_pri_500) {
            /* class com.ss.android.lark.mine.impl.status.mvp.UserStatusView.C458132 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                String trim = UserStatusView.this.mInputTV.getText().toString().trim();
                Log.m165379d("UserStatusView", "description.length ：" + trim.length());
                UserStatusView.this.f115604e = trim;
                UserStatusView.this.f115601b.mo161068a(trim, UserStatusView.this.f115603d);
            }
        });
        this.mTitleBar.getRightText().setPadding(0, 0, UIUtils.dp2px(this.f115605f, 15.0f), 0);
        this.mTitleBar.setTitle(this.f115605f.getString(R.string.Lark_Profile_PersonalSignature));
        this.mTitleBar.setBackgroundResource(R.color.bg_base);
    }

    /* renamed from: d */
    private void m181520d() {
        ChatterDescription chatterDescription;
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f115605f);
        this.mHistoryStatusRV.setAdapter(this.f115602c);
        this.mHistoryStatusRV.setLayoutManager(linearLayoutManager);
        SettingGroupHelper.m88812a(this.mHistoryStatusRV);
        this.mHistoryStatusRV.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.mine.impl.status.mvp.UserStatusView.C458165 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0 && linearLayoutManager.findLastVisibleItemPosition() >= linearLayoutManager.getItemCount() - 1 && UserStatusView.this.f115602c.mo161036a()) {
                    UserStatusView.this.f115601b.mo161066a();
                }
            }
        });
        this.mInputTV.setText("");
        this.mInputTV.setFilters(new InputFilter[]{new C45809c(100)});
        this.mInputTV.setFocusable(true);
        this.mInputTV.setFocusableInTouchMode(true);
        this.mInputTV.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.mine.impl.status.mvp.UserStatusView.C458176 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                int a = C45801a.m181493a(editable);
                UserStatusView.this.mCountTextView.setText(a + "/" + 100);
            }
        });
        Bundle bundle = this.f115606g;
        if (bundle != null && (chatterDescription = (ChatterDescription) bundle.get("description")) != null) {
            m181517a(chatterDescription.description, chatterDescription.type, false);
        }
    }

    @Override // com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a.AbstractC45821b
    /* renamed from: a */
    public void mo161053a() {
        mo161056a(this.f115605f.getString(R.string.Lark_Legacy_SuccessfulSaved));
        this.f115600a.mo161049a();
        EventBus.getDefault().trigger(new C45802a(this.f115604e, this.f115603d));
        this.f115600a.mo161052c();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC45819a.AbstractC45821b.AbstractC45822a aVar) {
        this.f115601b = aVar;
    }

    @Override // com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a.AbstractC45821b
    /* renamed from: a */
    public void mo161056a(String str) {
        LKUIToast.show(this.f115605f, str);
    }

    @Override // com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a.AbstractC45821b
    /* renamed from: a */
    public void mo161054a(C45423a aVar) {
        Log.m165379d("UserStatusView", "history status count: " + aVar.mo160294b().size());
        this.f115602c.mo161034a(aVar);
        this.f115602c.notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo161057a(String str, ChatterDescription.Type type) {
        m181517a(str, type, true);
    }

    public UserStatusView(AbstractC45818a aVar, Activity activity, Bundle bundle) {
        this.f115600a = aVar;
        this.f115605f = activity;
        this.f115606g = bundle;
    }

    /* renamed from: a */
    private void m181517a(String str, ChatterDescription.Type type, boolean z) {
        this.f115603d = type;
        this.mInputTV.setText(str);
        EmojiconEditText emojiconEditText = this.mInputTV;
        emojiconEditText.setSelection(emojiconEditText.getText().toString().length());
        if (z) {
            this.mInputTV.requestFocus();
            this.f115600a.mo161051b();
        }
    }
}
