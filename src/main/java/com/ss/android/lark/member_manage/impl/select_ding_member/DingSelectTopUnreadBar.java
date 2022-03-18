package com.ss.android.lark.member_manage.impl.select_ding_member;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.im.v1.GetChatLimitInfoResponse;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.MessageUnReadInfo;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45085e;
import com.ss.android.lark.member_manage.impl.bean.C45086f;
import com.ss.android.lark.statistics.Statistics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0014J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0010H\u0002J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u000eJ\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0014J \u0010&\u001a\u00020\u001b2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010(J\b\u0010*\u001a\u00020\u001bH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/select_ding_member/DingSelectTopUnreadBar;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mAllUnReadLayout", "mAllUnreadCheckBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "mAllUnreadText", "Landroid/widget/TextView;", "mDelegate", "Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseView$Delegate;", "mIsHasShowEmptyTip", "", "mState", "Lcom/ss/android/lark/member_manage/impl/select_ding_member/DingSelectTopUnreadBar$State;", "mUnReadInfo", "Lcom/ss/android/lark/chat/entity/message/MessageUnReadInfo;", "mUnReadSelectBeans", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "Lkotlin/collections/ArrayList;", "checkState", "intViews", "", "onClick", "v", "Landroid/view/View;", "onFinishInflate", "setCheckEnable", "enable", "setDelegate", "delegate", "setMessageUnReadInfo", "unReadInfo", "updateSelectStatus", "selectedItems", "", "", "updateState", "State", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DingSelectTopUnreadBar extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    private LinearLayout f114327a;

    /* renamed from: b */
    private UDCheckBox f114328b;

    /* renamed from: c */
    private TextView f114329c;

    /* renamed from: d */
    private IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a f114330d;

    /* renamed from: e */
    private MessageUnReadInfo f114331e;

    /* renamed from: f */
    private ArrayList<C45084c> f114332f = new ArrayList<>();

    /* renamed from: g */
    private State f114333g = State.DEFAULT;

    /* renamed from: h */
    private boolean f114334h;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/select_ding_member/DingSelectTopUnreadBar$State;", "", "(Ljava/lang/String;I)V", "DEFAULT", "LARGE_GROUP", "SUPER_GROUP", "OPEN_SECURITY", "EMPTY_LIST", "NORMAL", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.DingSelectTopUnreadBar$a */
    public enum State {
        DEFAULT,
        LARGE_GROUP,
        SUPER_GROUP,
        OPEN_SECURITY,
        EMPTY_LIST,
        NORMAL
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m179206a();
    }

    /* renamed from: a */
    private final void m179206a() {
        this.f114327a = (LinearLayout) findViewById(R.id.select_all_unread_layout);
        this.f114328b = (UDCheckBox) findViewById(R.id.select_all_unread_check_box);
        this.f114329c = (TextView) findViewById(R.id.select_all_unread_text);
        UDCheckBox uDCheckBox = this.f114328b;
        if (uDCheckBox != null) {
            uDCheckBox.setClickable(false);
        }
        LinearLayout linearLayout = this.f114327a;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(this);
        }
        m179208c();
    }

    /* renamed from: b */
    private final boolean m179207b() {
        switch (C45165f.f114351a[this.f114333g.ordinal()]) {
            case 1:
                break;
            case 2:
            case 3:
                LKUIToast.show(getContext(), (int) R.string.Lark_buzz_SelectUnreadMembersMany);
                break;
            case 4:
                LKUIToast.show(getContext(), (int) R.string.Lark_buzz_SelectUnreadMembersSecurity);
                break;
            case 5:
                if (this.f114334h) {
                    return true;
                }
                LKUIToast.show(getContext(), (int) R.string.Lark_buzz_SelectUnreadMembersAllRead);
                this.f114334h = true;
                return true;
            case 6:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    /* renamed from: c */
    private final void m179208c() {
        GetChatLimitInfoResponse getChatLimitInfoResponse;
        State aVar;
        MessageUnReadInfo cVar = this.f114331e;
        if (cVar != null) {
            getChatLimitInfoResponse = cVar.mo125335a();
        } else {
            getChatLimitInfoResponse = null;
        }
        if (getChatLimitInfoResponse == null) {
            setCheckEnable(false);
            aVar = State.DEFAULT;
        } else if (Intrinsics.areEqual((Object) getChatLimitInfoResponse.is_large_group, (Object) true)) {
            setCheckEnable(false);
            aVar = State.LARGE_GROUP;
        } else if (Intrinsics.areEqual((Object) getChatLimitInfoResponse.is_super_group, (Object) true)) {
            setCheckEnable(false);
            aVar = State.SUPER_GROUP;
        } else if (Intrinsics.areEqual((Object) getChatLimitInfoResponse.open_security, (Object) true)) {
            setCheckEnable(false);
            aVar = State.OPEN_SECURITY;
        } else if (CollectionUtils.isEmpty(this.f114332f)) {
            setCheckEnable(true);
            aVar = State.EMPTY_LIST;
        } else {
            setCheckEnable(true);
            aVar = State.NORMAL;
        }
        this.f114333g = aVar;
    }

    public final void setDelegate(IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f114330d = aVar;
    }

    private final void setCheckEnable(boolean z) {
        UDCheckBox uDCheckBox = this.f114328b;
        if (uDCheckBox != null) {
            uDCheckBox.setEnabled(z);
        }
        if (z) {
            TextView textView = this.f114329c;
            if (textView != null) {
                textView.setTextColor(UIUtils.getColor(getContext(), R.color.text_title));
                return;
            }
            return;
        }
        TextView textView2 = this.f114329c;
        if (textView2 != null) {
            textView2.setTextColor(UIUtils.getColor(getContext(), R.color.text_disable));
        }
    }

    public void onClick(View view) {
        UDCheckBox uDCheckBox = this.f114328b;
        if (uDCheckBox != null && m179207b()) {
            boolean z = !uDCheckBox.isChecked();
            uDCheckBox.setChecked(z);
            IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a aVar = this.f114330d;
            if (aVar != null) {
                aVar.mo159454a(this.f114332f, z);
            }
            if (z) {
                Statistics.sendEvent("buzz_unread_checkbox");
            }
        }
    }

    /* renamed from: a */
    public final void mo159678a(Map<String, ? extends C45084c> map) {
        if (this.f114333g == State.NORMAL) {
            if (CollectionUtils.isEmpty(map)) {
                UDCheckBox uDCheckBox = this.f114328b;
                if (uDCheckBox != null) {
                    uDCheckBox.setChecked(false);
                    return;
                }
                return;
            }
            Iterator<C45084c> it = this.f114332f.iterator();
            while (it.hasNext()) {
                C45084c next = it.next();
                if (map != null) {
                    Intrinsics.checkExpressionValueIsNotNull(next, "unReadBean");
                    if (!map.containsKey(next.mo159513h())) {
                    }
                }
                UDCheckBox uDCheckBox2 = this.f114328b;
                if (uDCheckBox2 != null) {
                    uDCheckBox2.setChecked(false);
                    return;
                }
                return;
            }
            UDCheckBox uDCheckBox3 = this.f114328b;
            if (uDCheckBox3 != null) {
                uDCheckBox3.setChecked(true);
            }
        }
    }

    public final void setMessageUnReadInfo(MessageUnReadInfo cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "unReadInfo");
        this.f114331e = cVar;
        this.f114332f.clear();
        List<C45084c> a = C45086f.m178890a(null, cVar.mo125336b(), null, null, null);
        Intrinsics.checkExpressionValueIsNotNull(a, "SelectChatterInfoParser.…atters, null, null, null)");
        for (C45084c cVar2 : a) {
            if (!(cVar2 == null || cVar2.mo159512g() == null)) {
                C45085e g = cVar2.mo159512g();
                Intrinsics.checkExpressionValueIsNotNull(g, "selectBean.chatterInfo");
                if (!g.mo159538l()) {
                    this.f114332f.add(cVar2);
                }
            }
        }
        m179208c();
    }

    public DingSelectTopUnreadBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
