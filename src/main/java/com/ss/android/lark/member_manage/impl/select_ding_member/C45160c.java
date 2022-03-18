package com.ss.android.lark.member_manage.impl.select_ding_member;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageUnReadInfo;
import com.ss.android.lark.member_manage.impl.base.adapter.C45044d;
import com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.select_ding_member.AbstractC45166g;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.c */
public class C45160c extends BaseGroupMemberManageView<IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a, AbstractC45162a> implements AbstractC45166g.AbstractC45169b {

    /* renamed from: j */
    private DingSelectTopUnreadBar f114343j;

    /* renamed from: k */
    private Context f114344k;

    /* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.c$a */
    public interface AbstractC45162a extends BaseGroupMemberManageView.AbstractC45064a {
        /* renamed from: a */
        void mo159700a(List<String> list, Message message);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: d */
    public int mo159409d() {
        return 3;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: a */
    public void mo159385a() {
        super.mo159385a();
        RecyclerView.Adapter adapter = this.mMemberRV.getAdapter();
        if (adapter instanceof C45044d) {
            DingSelectTopUnreadBar dingSelectTopUnreadBar = (DingSelectTopUnreadBar) LayoutInflater.from(mo159414h()).inflate(R.layout.ding_select_top_unread_bar, (ViewGroup) this.mMemberRV, false);
            this.f114343j = dingSelectTopUnreadBar;
            dingSelectTopUnreadBar.setDelegate(this.f114080e);
            ((C45044d) adapter).mo159349a((View) this.f114343j);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: b */
    public void mo159400b() {
        this.mConfirmBT.setVisibility(4);
        this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_UrgentPickerTitle));
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        mo159387a(R.string.Lark_Legacy_ConfirmInfo, -1);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.select_ding_member.C45160c.View$OnClickListenerC451611 */

            public void onClick(View view) {
                KeyboardUtils.hideKeyboard(C45160c.this.mo159414h());
                ((AbstractC45162a) C45160c.this.f114082g).mo159423a();
            }
        });
        this.f114076a.setVisibility(8);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: b */
    public void mo159448b(List<C45084c> list) {
        b_(list);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159447a(Chat chat) {
        this.f114081f = chat;
        mo159385a();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: d */
    public void mo159449d(SelectBeansResult dVar) {
        b_(dVar);
        a_(dVar);
    }

    @Override // com.ss.android.lark.member_manage.impl.select_ding_member.AbstractC45166g.AbstractC45169b
    /* renamed from: a */
    public void mo159698a(MessageUnReadInfo cVar) {
        DingSelectTopUnreadBar dingSelectTopUnreadBar = this.f114343j;
        if (dingSelectTopUnreadBar != null && cVar != null) {
            dingSelectTopUnreadBar.setMessageUnReadInfo(cVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: a */
    public void mo159397a(Map<String, C45084c> map) {
        mo159403b(map);
        DingSelectTopUnreadBar dingSelectTopUnreadBar = this.f114343j;
        if (dingSelectTopUnreadBar != null) {
            dingSelectTopUnreadBar.mo159678a(map);
        }
    }

    public C45160c(Activity activity, AbstractC45162a aVar) {
        super(activity, aVar);
        this.f114344k = activity;
    }

    @Override // com.ss.android.lark.member_manage.impl.select_ding_member.AbstractC45166g.AbstractC45169b
    /* renamed from: a */
    public void mo159697a(Message message, List<String> list) {
        ((AbstractC45162a) this.f114082g).mo159700a(list, message);
        this.mConfirmBT.setEnabled(true);
    }
}
