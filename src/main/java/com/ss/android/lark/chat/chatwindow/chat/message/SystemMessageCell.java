package com.ss.android.lark.chat.chatwindow.chat.message;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.SystemContentVO;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34365w;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.ArrayList;
import java.util.Iterator;

public class SystemMessageCell extends AbstractC33290a<SystemContentVO, SystemMessageViewHolder> {

    /* renamed from: a */
    public final C34365w.AbstractC34377a f85762a;

    /* renamed from: b */
    public final int f85763b = C29990c.m110930b().mo134521T().mo134710a();

    /* renamed from: c */
    private final AbstractC36503q f85764c = C29990c.m110930b().mo134586n();

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.activity_chat_window_system_item_new;
    }

    /* access modifiers changed from: package-private */
    public static class SystemMessageViewHolder extends AbstractC59010e {
        @BindView(8887)
        public TextView mSystemTV;

        SystemMessageViewHolder() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            this.mSystemTV.setHighlightColor(C57582a.m223616d(view.getContext(), R.color.color_transparent));
            this.mSystemTV.setTextSize(0, LKUIDisplayManager.m91864a(view.getContext(), 14));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return SystemContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<SystemMessageViewHolder> mo122650b() {
        return SystemMessageViewHolder.class;
    }

    public class SystemMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private SystemMessageViewHolder f85770a;

        @Override // butterknife.Unbinder
        public void unbind() {
            SystemMessageViewHolder systemMessageViewHolder = this.f85770a;
            if (systemMessageViewHolder != null) {
                this.f85770a = null;
                systemMessageViewHolder.mSystemTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public SystemMessageViewHolder_ViewBinding(SystemMessageViewHolder systemMessageViewHolder, View view) {
            this.f85770a = systemMessageViewHolder;
            systemMessageViewHolder.mSystemTV = (TextView) Utils.findRequiredViewAsType(view, R.id.system_label, "field 'mSystemTV'", TextView.class);
        }
    }

    public SystemMessageCell(AbstractC33342d dVar, C34365w.AbstractC34377a aVar) {
        super(dVar);
        this.f85762a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(SystemMessageViewHolder systemMessageViewHolder, final AbsMessageVO<SystemContentVO> aVar) {
        String str;
        super.mo122648a((AbstractC59010e) systemMessageViewHolder, (AbsMessageVO) aVar);
        String str2 = "";
        if (aVar.mo121655A() == Message.Status.DELETED) {
            if (!aVar.mo121695c()) {
                C33973b l = aVar.mo121704l();
                if (l != null) {
                    str2 = l.mo124205d();
                }
                str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Deletetip, "name", str2);
            } else {
                str = UIHelper.getString(R.string.Lark_Legacy_DeleteTipByYourself);
            }
            systemMessageViewHolder.mSystemTV.setText(str);
            return;
        }
        final SystemContent systemContent = (SystemContent) aVar.mo121699g().mo126168z();
        CharSequence a = C34365w.m133279a(mo122719d(), systemContent, aVar.mo121692b(), aVar.mo121681a(), this.f85789d.mo122540d(), new AbstractView$OnClickListenerC52989b(500) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.SystemMessageCell.C332841 */

            @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
            /* renamed from: a */
            public void mo122732a(View view) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                int i;
                int i2;
                if (C34365w.m133295a(aVar.mo121716x() * 1000, SystemMessageCell.this.f85763b)) {
                    C35212a.m137531a(SystemMessageCell.this.f85789d.mo122543g(), (String) null, C34365w.m133281a(SystemMessageCell.this.f85763b));
                    return;
                }
                int number = systemContent.getType().getNumber();
                if (number == SystemMessageType.USER_CREATED_GROUP_AND_INVITED_OTHER_CHATTER_CHAT_DEPARTMENT.getNumber() || number == SystemMessageType.USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN.getNumber() || number == SystemMessageType.CREATE_CHAT_AND_INVITE_FROM_CHAT_DEPARTMENT_MEMBER.getNumber() || number == SystemMessageType.USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN_NO_HIStORY.getNumber() || number == SystemMessageType.USER_INVITE_OTHERS_CHATTER_CHAT_DEPARTMENT_JOIN_NEW.getNumber()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ArrayList<GroupRecallEntity> b = C34365w.m133296b(systemContent);
                    if (!b.isEmpty()) {
                        C34365w.m133292a(SystemMessageCell.this.f85789d.mo122543g(), SystemMessageCell.this.f85789d.mo122544h(), b, SystemMessageCell.this.f85789d.mo122550n(), SystemMessageCell.this.f85762a);
                        return;
                    }
                    return;
                }
                ArrayList<String> a = C34365w.m133282a(systemContent);
                if (!CollectionUtils.isEmpty(a)) {
                    if (systemContent.getType().getNumber() == SystemMessageType.USER_JOIN_VIA_SHARE.getNumber() || systemContent.getType().getNumber() == SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_INVITATION_CARD.getNumber() || systemContent.getType().getNumber() == SystemMessageType.USER_JOIN_VIA_SHARE_NEW.getNumber() || systemContent.getType().getNumber() == SystemMessageType.USER_JOIN_VIA_SHARE_NO_HISTORY.getNumber()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (systemContent.getType().getNumber() == SystemMessageType.USER_JOIN_VIA_QR_CODE.getNumber() || systemContent.getType().getNumber() == SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_QR_CODE.getNumber() || systemContent.getType().getNumber() == SystemMessageType.USER_JOIN_VIA_QR_NEW.getNumber() || systemContent.getType().getNumber() == SystemMessageType.USER_JOIN_VIA_QR_CODE_NO_HISTORY.getNumber()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (systemContent.getType().getNumber() == SystemMessageType.USER_JOIN_VIA_GROUP_LINK.getNumber() || systemContent.getType().getNumber() == SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_LINK.getNumber() || systemContent.getType().getNumber() == SystemMessageType.USER_JOIN_CHAT_BY_LINK.getNumber() || systemContent.getType().getNumber() == SystemMessageType.USER_JOIN_CHAT_BY_LINK_NO_HISTORY.getNumber()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    final ArrayList arrayList = new ArrayList(a.size());
                    Iterator<String> it = a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new GroupRecallEntity(1, it.next()));
                    }
                    if (z2 || z3 || z4) {
                        if (systemContent.getType().getNumber() == SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_INVITATION_CARD.getNumber() || systemContent.getType().getNumber() == SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_QR_CODE.getNumber() || systemContent.getType().getNumber() == SystemMessageType.USER_INVITE_OTHERS_JOIN_CIRCLE_BY_LINK.getNumber()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            i = R.string.Lark_Groups_RevokeCircleInviteButton;
                        } else {
                            i = R.string.Lark_Group_RevokeConfirmation;
                        }
                        if (z5) {
                            i2 = R.string.Lark_Groups_DeactivateCircleCardButton;
                        } else {
                            i2 = R.string.Lark_Group_RevokeGroupCard;
                        }
                        int[] iArr = new int[2];
                        iArr[0] = i;
                        if (z3) {
                            i2 = R.string.Lark_Group_RevokeQRCode;
                        } else if (z4) {
                            i2 = R.string.Lark_Chat_DeactivateGroupLink;
                        }
                        iArr[1] = i2;
                        C35212a.m137535a(SystemMessageCell.this.f85789d.mo122543g(), iArr, new C35212a.AbstractC35216b() {
                            /* class com.ss.android.lark.chat.chatwindow.chat.message.SystemMessageCell.C332841.C332851 */

                            @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35216b
                            /* renamed from: b */
                            public void mo122745b() {
                                if (SystemMessageCell.this.f85762a != null) {
                                    SystemMessageCell.this.f85762a.f_(aVar.mo121681a());
                                }
                            }

                            @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35216b
                            /* renamed from: a */
                            public void mo122744a() {
                                C34365w.m133292a(SystemMessageCell.this.f85789d.mo122543g(), aVar.mo121692b(), arrayList, SystemMessageCell.this.f85789d.mo122550n(), SystemMessageCell.this.f85762a);
                            }
                        });
                        return;
                    }
                    C34365w.m133292a(SystemMessageCell.this.f85789d.mo122543g(), aVar.mo121692b(), arrayList, SystemMessageCell.this.f85789d.mo122550n(), SystemMessageCell.this.f85762a);
                }
            }
        }, false);
        if (TextUtils.isEmpty(a)) {
            systemMessageViewHolder.mSystemTV.setText(str2);
            return;
        }
        if (a instanceof SpannableStringBuilder) {
            systemMessageViewHolder.mSystemTV.setMovementMethod(LinkMovementMethod.getInstance());
        }
        systemMessageViewHolder.mSystemTV.setText(a);
    }
}
