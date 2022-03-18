package com.ss.android.vc.meeting.module.subtitle.p3167b;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.module.subtitle.AbstractC63158f;
import com.ss.android.vc.meeting.module.subtitle.SubtitleModel2;
import com.ss.android.vc.meeting.module.subtitle.widget.SelectableTextView;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.b.b */
public abstract class AbstractC63131b extends AbstractC63130a {

    /* renamed from: a */
    public static String f159095a;

    /* renamed from: b */
    protected String f159096b;

    /* renamed from: c */
    protected TextView f159097c;

    /* renamed from: d */
    protected ImageView f159098d;

    /* renamed from: e */
    protected TextView f159099e;

    /* renamed from: f */
    protected SelectableTextView f159100f;

    /* renamed from: g */
    protected SparseArray f159101g;

    /* renamed from: h */
    protected AbstractC63158f f159102h;

    /* renamed from: b */
    public abstract void mo218593b(SubtitleModel2 subtitleModel2);

    /* renamed from: a */
    private void m247231a() {
        if (this.f159101g != null) {
            int length = this.f159097c.length();
            if (this.f159101g.get(length) == null) {
                this.f159097c.measure(0, 0);
                int measuredWidth = this.f159097c.getMeasuredWidth();
                String str = f159095a;
                C60700b.m235851b(str, "[adapterSubtitleSpeakerNameMaxWidth]", "measureWidth : " + measuredWidth);
                int a = (((((C60776r.m236139a() - (C60773o.m236115a(16.0d) * 2)) - C60773o.m236115a(32.0d)) - C60773o.m236115a(8.0d)) - C60773o.m236115a(4.0d)) - C60773o.m236115a(5.0d)) - measuredWidth;
                this.f159099e.setMaxWidth(a);
                this.f159101g.put(length, Integer.valueOf(a));
                return;
            }
            this.f159099e.setMaxWidth(((Integer) this.f159101g.get(length)).intValue());
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247232a(VideoChatUser videoChatUser) {
        String str;
        TextView textView = this.f159099e;
        if (TextUtils.isEmpty(videoChatUser.getName())) {
            str = videoChatUser.getNickname();
        } else {
            str = videoChatUser.getName();
        }
        textView.setText(str);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m247233b(VideoChatUser videoChatUser) {
        C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), this.f159098d, 32, 32);
    }

    /* renamed from: d */
    private void m247235d(SubtitleModel2 subtitleModel2) {
        if (subtitleModel2.mSubtitle.mSpeaker == null) {
            return;
        }
        if (MeetingUtil.m238368a(this.f159096b, subtitleModel2.mSubtitle.mSpeaker, MeetingUtil.IdType.DeviceId)) {
            this.f159099e.setText(R.string.View_M_Interviewer);
        } else {
            UserInfoService.getUserInfoById(this.f159096b, subtitleModel2.mSubtitle.mSpeaker.getUserId(), subtitleModel2.mSubtitle.mSpeaker.getParticipantType(), new GetUserInfoListener() {
                /* class com.ss.android.vc.meeting.module.subtitle.p3167b.$$Lambda$b$RuKp_CgmsJq3glpj5_8ZLNFlBQ */

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public final void onGetUserInfo(VideoChatUser videoChatUser) {
                    AbstractC63131b.m271417lambda$RuKp_CgmsJq3glpj5_8ZLNFlBQ(AbstractC63131b.this, videoChatUser);
                }
            });
        }
    }

    /* renamed from: e */
    private void m247236e(SubtitleModel2 subtitleModel2) {
        if (subtitleModel2.mShowTime) {
            this.f159097c.setVisibility(0);
            this.f159097c.setText(C63139g.m247250a(subtitleModel2.mTimeStamp));
        } else {
            this.f159097c.setVisibility(8);
        }
        m247231a();
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.p3167b.AbstractC63133c
    /* renamed from: a */
    public void mo218592a(SubtitleModel2 subtitleModel2) {
        if (subtitleModel2.mSubtitle != null) {
            m247236e(subtitleModel2);
            m247235d(subtitleModel2);
            m247234c(subtitleModel2);
            mo218593b(subtitleModel2);
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.vc.meeting.module.subtitle.p3167b.AbstractC63131b.View$OnLongClickListenerC631321 */

                public boolean onLongClick(View view) {
                    if (AbstractC63131b.this.f159102h == null || TextUtils.isEmpty(AbstractC63131b.this.f159100f.getText())) {
                        return true;
                    }
                    AbstractC63131b.this.f159102h.mo218631a(AbstractC63131b.this.f159100f, AbstractC63131b.this.f159100f.getText().toString());
                    return true;
                }
            });
        }
    }

    /* renamed from: c */
    private void m247234c(SubtitleModel2 subtitleModel2) {
        boolean a = MeetingUtil.m238368a(this.f159096b, subtitleModel2.mSubtitle.mSpeaker, MeetingUtil.IdType.DeviceId);
        if (subtitleModel2.mSubtitle.mAvatar != null) {
            if (TextUtils.isEmpty(subtitleModel2.mSubtitle.mUid) || !a) {
                C60783v.m236228a(this.f159098d, subtitleModel2.mSubtitle.mAvatar);
            } else {
                C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, this.f159098d);
            }
        } else if (TextUtils.isEmpty(subtitleModel2.mSubtitle.mUid)) {
        } else {
            if (a) {
                C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, this.f159098d);
            } else {
                UserInfoService.getUserInfoById(this.f159096b, subtitleModel2.mSubtitle.mUid, subtitleModel2.mSubtitle.mSpeaker.getParticipantType(), new GetUserInfoListener() {
                    /* class com.ss.android.vc.meeting.module.subtitle.p3167b.$$Lambda$b$RQXwXBNgkH_sKm2puqyHtexAhk */

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        AbstractC63131b.m271416lambda$RQXwXBNgkH_sKm2puqyHtexAhk(AbstractC63131b.this, videoChatUser);
                    }
                });
            }
        }
    }

    public AbstractC63131b(View view, String str, SparseArray sparseArray, AbstractC63158f fVar) {
        super(view);
        this.f159096b = str;
        this.f159097c = (TextView) view.findViewById(R.id.tv_subtitle_time);
        this.f159098d = (ImageView) view.findViewById(R.id.iv_subtitle_speaker_avatar);
        this.f159099e = (TextView) view.findViewById(R.id.tv_subtitle_speaker_name);
        this.f159100f = (SelectableTextView) view.findViewById(R.id.tv_subtitle_content);
        this.f159102h = fVar;
        this.f159101g = sparseArray;
    }
}
