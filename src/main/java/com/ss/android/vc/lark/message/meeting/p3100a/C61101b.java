package com.ss.android.vc.lark.message.meeting.p3100a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.ui.menu.OpenMenuDataHolder;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.utils.UIHelper;
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
import com.ss.android.vc.lark.message.meeting.p3100a.C61101b;
import com.ss.android.vc.net.push.VideoChatPush;
import java.util.List;

/* renamed from: com.ss.android.vc.lark.message.meeting.a.b */
public class C61101b implements IOpenMessageCell<VideoMeetingContentVO>, IOpenBubbleStyleProvider<VideoMeetingContentVO> {

    /* renamed from: b */
    private static final int f153023b = UIHelper.dp2px(12.0f);

    /* renamed from: c */
    private static final int f153024c = UIHelper.dp2px(12.0f);

    /* renamed from: d */
    private static final int f153025d = UIHelper.dp2px(8.0f);

    /* renamed from: a */
    public final IOpenCellCallback f153026a;

    /* renamed from: a */
    public void mo211347a(List<C34029b> list, OpenMenuDataHolder<VideoMeetingContentVO> cVar) {
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: b */
    public C34035c mo120416b(OpenMessageVO<VideoMeetingContentVO> cVar) {
        return null;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<VideoMeetingContentVO> mo120409a() {
        return VideoMeetingContentVO.class;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<VideoMeetingContentVO> cVar) {
        return C34034b.m131983a(UIHelper.dp2px(8.0f), 0, 0, 0, true, 2);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120410a(View view) {
        C61148e a = C61148e.m237783a(view);
        if (a != null) {
            C60700b.m235851b("VideoMeetingMessageCell", "[onViewRecycled]", "" + a.hashCode());
            C61145d.m237771a().mo211439a(a.f153178b);
            C61114a.m237673a(view.hashCode());
        }
    }

    public C61101b(IMessageContext aVar, IOpenCellCallback bVar) {
        this.f153026a = bVar;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C61148e.m237782a(layoutInflater, viewGroup).f153177a;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<VideoMeetingContentVO> cVar, View view) {
        BubbleStyle bubbleStyle;
        BubbleStyle bubbleStyle2;
        VideoChatContent videoChatContent = (VideoChatContent) cVar.mo121699g().mo126168z();
        C61148e.m237783a(view);
        if (videoChatContent.type != 1) {
            int i = !cVar.mo121695c() ? 1 : 0;
            int[] iArr = new int[4];
            int i2 = f153024c;
            iArr[0] = i2;
            int i3 = f153025d;
            iArr[1] = i3;
            iArr[2] = i2;
            if (cVar.ah()) {
                i3 = f153023b;
            }
            iArr[3] = i3;
            BubbleStyle a = BubbleStyle.m131964a(i, (View) null, iArr);
            a.mo126144a(true);
            return a;
        } else if (cVar.mo121698f() || !cVar.ah()) {
            if (videoChatContent.meetingCard.meetingStatus == 3) {
                bubbleStyle = BubbleStyle.m131963a(100, view.findViewById(R.id.video_meeting_card_header), 0);
            } else {
                bubbleStyle = BubbleStyle.m131963a(104, view.findViewById(R.id.video_meeting_card_header), 0);
            }
            bubbleStyle.mo126144a(true);
            return bubbleStyle;
        } else {
            if (videoChatContent.meetingCard.meetingStatus == 3) {
                bubbleStyle2 = BubbleStyle.m131964a(100, view.findViewById(R.id.video_meeting_card_header), new int[]{0, 0, 0, UIHelper.dp2px(12.0f)});
            } else {
                bubbleStyle2 = BubbleStyle.m131964a(104, view.findViewById(R.id.video_meeting_card_header), new int[]{0, 0, 0, UIHelper.dp2px(12.0f)});
            }
            bubbleStyle2.mo126144a(true);
            return bubbleStyle2;
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo211347a((List<C34029b>) list, (OpenMenuDataHolder) obj);
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, OpenMenuDataHolder<VideoMeetingContentVO> cVar) {
        if (bVar.f87966a == 13 || bVar.f87966a == 11 || bVar.f87966a == 20) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m237617a(final C61148e eVar, int i, final OpenMessageVO<VideoMeetingContentVO> cVar) {
        eVar.f153192p.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.vc.lark.message.meeting.p3100a.C61101b.View$OnLongClickListenerC611032 */

            public boolean onLongClick(View view) {
                return C61101b.this.f153026a.mo122833b(eVar.f153177a, cVar);
            }
        });
        eVar.f153192p.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.lark.message.meeting.p3100a.C61101b.View$OnClickListenerC611043 */

            public void onClick(View view) {
                C61101b.this.f153026a.mo122829a(eVar.f153177a, cVar);
            }
        });
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120411a(final View view, int i, final OpenMessageVO<VideoMeetingContentVO> cVar) {
        final C61148e a = C61148e.m237783a(view);
        final VideoChatContent videoChatContent = (VideoChatContent) cVar.mo121699g().mo126168z();
        if (videoChatContent.type == 1 || videoChatContent.type == 2) {
            m237617a(a, i, cVar);
            CardViewHolderHelper.m237650a().mo211368a(0, a, new CardSubMessageInfo(cVar.mo121681a(), cVar.mo121692b(), cVar.ah()), videoChatContent);
            if (videoChatContent != null && videoChatContent.meetingCard != null && videoChatContent.meetingCard.meetingStatus != 3 && C13657b.m55423b(videoChatContent.meetingCard.participants) && videoChatContent.meetingCard.participants.size() >= 15) {
                C61114a.m237674a(view.hashCode(), new VideoChatPush.AbstractC63568h() {
                    /* class com.ss.android.vc.lark.message.meeting.p3100a.C61101b.C611021 */

                    @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63568h
                    /* renamed from: a */
                    public void mo211349a(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
                        if (vCMeetingJoinInfoEntity != null && vCMeetingJoinInfoEntity.joinInfo != null && !TextUtils.isEmpty(vCMeetingJoinInfoEntity.joinInfo.getMeetingId()) && TextUtils.equals(vCMeetingJoinInfoEntity.joinInfo.getMeetingId(), videoChatContent.meetingCard.meetingId)) {
                            C60700b.m235851b("VideoMeetingMessageCell", "[onPushMeetingJoinStatus]", "meetingId: " + videoChatContent.meetingCard.meetingId + "meetingStatus: " + vCMeetingJoinInfoEntity.joinInfo.getJoinStatus());
                            if (vCMeetingJoinInfoEntity.joinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.END) {
                                C61114a.m237673a(view.hashCode());
                            } else {
                                C60735ab.m236001a(new Runnable(cVar, videoChatContent) {
                                    /* class com.ss.android.vc.lark.message.meeting.p3100a.$$Lambda$b$1$oG3c6vCCLprmIamLKSAb47HWddw */
                                    public final /* synthetic */ OpenMessageVO f$1;
                                    public final /* synthetic */ VideoChatContent f$2;

                                    {
                                        this.f$1 = r2;
                                        this.f$2 = r3;
                                    }

                                    public final void run() {
                                        C61101b.C611021.m237629a(C61148e.this, this.f$1, this.f$2);
                                    }
                                });
                            }
                        }
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m237629a(C61148e eVar, OpenMessageVO cVar, VideoChatContent videoChatContent) {
                        CardViewHolderHelper.m237650a().mo211368a(0, eVar, new CardSubMessageInfo(cVar.mo121681a(), cVar.mo121692b(), cVar.ah()), videoChatContent);
                    }
                });
            }
        }
    }
}
