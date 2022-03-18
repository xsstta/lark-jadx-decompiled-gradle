package com.ss.android.vc.lark.message.meeting.p3101b;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.util.p702e.C13657b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCTabMeetingJoinInfo;
import com.ss.android.vc.lark.message.meeting.cardview.C61114a;
import com.ss.android.vc.lark.message.meeting.cardview.C61145d;
import com.ss.android.vc.lark.message.meeting.cardview.C61148e;
import com.ss.android.vc.lark.message.meeting.cardview.CardSubMessageInfo;
import com.ss.android.vc.lark.message.meeting.cardview.CardViewHolderHelper;
import com.ss.android.vc.lark.message.meeting.p3101b.C61107a;
import com.ss.android.vc.net.push.VideoChatPush;

/* renamed from: com.ss.android.vc.lark.message.meeting.b.a */
public class C61107a extends AbstractC58992f<MessageInfo, C61148e> {

    /* renamed from: a */
    private final String f153039a = "MeetingCardMessageHolderView";

    public C61107a(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C61148e mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C61148e.m237782a(layoutInflater, viewGroup);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m237641a(C61148e eVar, RecyclerView.ViewHolder viewHolder) {
        C61145d.m237771a().mo211439a(eVar.f153178b);
        C61114a.m237673a(eVar.hashCode());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m237640a(int i, MessageInfo messageInfo, View view) {
        mo200117b(view, i, messageInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m237643b(int i, MessageInfo messageInfo, View view) {
        return mo200116a(view, i, messageInfo);
    }

    /* renamed from: b */
    private void m237642b(C61148e eVar, int i, MessageInfo messageInfo) {
        eVar.f153192p.setOnLongClickListener(new View.OnLongClickListener(i, messageInfo) {
            /* class com.ss.android.vc.lark.message.meeting.p3101b.$$Lambda$a$xWbBxQwJPIMBfgASZzXS5zZdGE */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ MessageInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return C61107a.m271164lambda$xWbBxQwJPIMBfgASZzXS5zZdGE(C61107a.this, this.f$1, this.f$2, view);
            }
        });
        eVar.f153192p.setOnClickListener(new View.OnClickListener(i, messageInfo) {
            /* class com.ss.android.vc.lark.message.meeting.p3101b.$$Lambda$a$gFlfkyLt1CWcrf14MDxUa5WacM */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ MessageInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C61107a.m271163lambda$gFlfkyLt1CWcrf14MDxUa5WacM(C61107a.this, this.f$1, this.f$2, view);
            }
        });
        mo200115a(new AbstractC58992f.AbstractC58993a() {
            /* class com.ss.android.vc.lark.message.meeting.p3101b.$$Lambda$a$ApMrpjhoAqtxeEf34clEL_L2cQU */

            public final boolean onItemRecycled(RecyclerView.ViewHolder viewHolder) {
                return C61107a.lambda$ApMrpjhoAqtxeEf34clEL_L2cQU(C61148e.this, viewHolder);
            }
        });
    }

    /* renamed from: a */
    public void mo31174a(final C61148e eVar, int i, final MessageInfo messageInfo) {
        final Message message = messageInfo.getMessage();
        if (message == null) {
            C60700b.m235861e("MeetingCardMessageHolderView", "[onBindViewHolder]", "message is null");
            return;
        }
        final VideoChatContent videoChatContent = (VideoChatContent) message.getContent();
        if (videoChatContent == null) {
            C60700b.m235861e("MeetingCardMessageHolderView", "[onBindViewHolder2]", "VideoChatContent is null");
        } else if (videoChatContent.type == 1 || videoChatContent.type == 2) {
            m237642b(eVar, i, messageInfo);
            CardViewHolderHelper.m237650a().mo211368a(1, eVar, new CardSubMessageInfo(messageInfo.getId(), message.getChatId(), messageInfo.hasReaction()), videoChatContent);
            if (videoChatContent != null && videoChatContent.meetingCard != null && videoChatContent.meetingCard.meetingStatus != 3 && C13657b.m55423b(videoChatContent.meetingCard.participants) && videoChatContent.meetingCard.participants.size() >= 15) {
                C61114a.m237674a(eVar.hashCode(), new VideoChatPush.AbstractC63568h() {
                    /* class com.ss.android.vc.lark.message.meeting.p3101b.C61107a.C611081 */

                    @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63568h
                    /* renamed from: a */
                    public void mo211349a(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
                        if (vCMeetingJoinInfoEntity != null && vCMeetingJoinInfoEntity.joinInfo != null && !TextUtils.isEmpty(vCMeetingJoinInfoEntity.joinInfo.getMeetingId()) && TextUtils.equals(vCMeetingJoinInfoEntity.joinInfo.getMeetingId(), videoChatContent.meetingCard.meetingId)) {
                            if (vCMeetingJoinInfoEntity.joinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.END) {
                                C61114a.m237673a(eVar.hashCode());
                            } else {
                                C60735ab.m236001a(new Runnable(messageInfo, message, videoChatContent) {
                                    /* class com.ss.android.vc.lark.message.meeting.p3101b.$$Lambda$a$1$HOdoFPNJMIvvhvmuqcPOoemsb_w */
                                    public final /* synthetic */ MessageInfo f$1;
                                    public final /* synthetic */ Message f$2;
                                    public final /* synthetic */ VideoChatContent f$3;

                                    {
                                        this.f$1 = r2;
                                        this.f$2 = r3;
                                        this.f$3 = r4;
                                    }

                                    public final void run() {
                                        C61107a.C611081.lambda$HOdoFPNJMIvvhvmuqcPOoemsb_w(C61148e.this, this.f$1, this.f$2, this.f$3);
                                    }
                                });
                            }
                        }
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m237648a(C61148e eVar, MessageInfo messageInfo, Message message, VideoChatContent videoChatContent) {
                        CardViewHolderHelper.m237650a().mo211368a(1, eVar, new CardSubMessageInfo(messageInfo.getId(), message.getChatId(), messageInfo.hasReaction()), videoChatContent);
                    }
                });
            }
        }
    }
}
