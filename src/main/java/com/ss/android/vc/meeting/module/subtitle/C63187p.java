package com.ss.android.vc.meeting.module.subtitle;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.entity.MeetingSubtitleData;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.p */
public class C63187p {

    /* renamed from: a */
    public C63189q f159278a;

    /* renamed from: b */
    public C61303k f159279b;

    /* renamed from: c */
    public Handler f159280c;

    /* renamed from: d */
    public Deque<C63186o> f159281d = new ConcurrentLinkedDeque();

    /* renamed from: e */
    private List<C63186o> f159282e = new ArrayList();

    /* renamed from: f */
    private C63165l f159283f;

    /* renamed from: g */
    private C63161h f159284g;

    /* renamed from: h */
    private RecyclerView f159285h;

    /* renamed from: i */
    private LinearLayoutManager f159286i;

    /* renamed from: j */
    private Handler f159287j;

    /* renamed from: k */
    private int f159288k = 3;

    /* renamed from: l */
    private int f159289l = 0;

    /* renamed from: m */
    private boolean f159290m = false;

    /* renamed from: n */
    private int f159291n = 0;

    /* renamed from: f */
    public void mo218715f() {
    }

    /* renamed from: c */
    public RecyclerView mo218712c() {
        return this.f159285h;
    }

    /* renamed from: d */
    public C63165l mo218713d() {
        return this.f159283f;
    }

    /* renamed from: a */
    public boolean mo218709a(C63186o oVar) {
        C63186o a = m247442a(this.f159282e, oVar);
        if (a != null) {
            if (oVar.f159277j == MeetingSubtitleData.SoundType.NOISE) {
                this.f159282e.remove(a);
            } else {
                a.f159274g = oVar.f159274g;
                a.f159273f = oVar.f159273f;
                a.f159268a = oVar.f159268a;
                a.f159272e = oVar.f159272e;
                a.f159270c = oVar.f159270c;
                a.f159276i = oVar.f159276i;
                a.f159277j = oVar.f159277j;
            }
            this.f159283f.mo218644a();
            this.f159283f.notifyDataSetChanged();
        } else if (oVar.f159277j == MeetingSubtitleData.SoundType.NOISE) {
            return true;
        } else {
            int i = 0;
            if (this.f159282e.size() >= 3) {
                this.f159282e.remove(0);
            }
            this.f159282e.add(oVar);
            this.f159283f.mo218644a();
            this.f159283f.notifyDataSetChanged();
            RecyclerView recyclerView = this.f159285h;
            if (this.f159282e.size() > 0) {
                i = this.f159282e.size() - 1;
            }
            recyclerView.smoothScrollToPosition(i);
        }
        return true;
    }

    /* renamed from: e */
    public void mo218714e() {
        m247452g().sendEmptyMessage(1);
    }

    /* renamed from: g */
    private Handler m247452g() {
        if (this.f159280c == null) {
            this.f159280c = new Handler(Looper.getMainLooper()) {
                /* class com.ss.android.vc.meeting.module.subtitle.C63187p.HandlerC631881 */

                public void handleMessage(Message message) {
                    if (message.what == 1) {
                        C63186o peek = C63187p.this.f159281d.peek();
                        if (peek != null) {
                            if (C63187p.this.mo218709a(peek)) {
                                C63187p.this.f159281d.poll();
                            }
                            if (C63187p.this.f159281d.size() > 0) {
                                C63187p.this.f159280c.removeCallbacksAndMessages(1);
                                C63187p.this.f159280c.sendEmptyMessageDelayed(1, 30);
                            }
                        }
                    } else if (message.what == 2) {
                        C63187p.this.mo218715f();
                    } else if (message.what == 3) {
                        C63187p.this.f159279b.mo212107Y().mo218630h();
                    }
                }
            };
        }
        return this.f159280c;
    }

    /* renamed from: b */
    public void mo218710b() {
        m247452g().removeCallbacksAndMessages(null);
        this.f159282e.clear();
        this.f159281d.clear();
        this.f159286i.setStackFromEnd(true);
        this.f159285h.setLayoutManager(this.f159286i);
        this.f159283f.notifyDataSetChanged();
        mo218714e();
    }

    /* renamed from: a */
    public void mo218705a() {
        Handler handler = this.f159280c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f159287j;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: a */
    public void mo218708a(boolean z) {
        this.f159290m = z;
    }

    /* renamed from: b */
    public void mo218711b(List<MeetingSubtitleData> list) {
        C60700b.m235851b("SubtitleProvider@", "[reloadSubtitle]", "reloadSubtitle");
        mo218710b();
        mo218707a(list);
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m247450c(List list) {
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C63186o b = m247448b((MeetingSubtitleData) it.next());
                if (b != null) {
                    arrayList.add(b);
                }
            }
            this.f159280c.post(new Runnable(arrayList) {
                /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$p$Bbof_7EOmF7Qn6FOnWYJFpMS5BM */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C63187p.lambda$Bbof_7EOmF7Qn6FOnWYJFpMS5BM(C63187p.this, this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m247451d(List list) {
        int i;
        this.f159282e.clear();
        this.f159282e.addAll(list);
        this.f159283f.mo218644a();
        this.f159283f.notifyDataSetChanged();
        this.f159286i.setStackFromEnd(true);
        this.f159285h.setLayoutManager(this.f159286i);
        if (!this.f159290m) {
            RecyclerView recyclerView = this.f159285h;
            if (this.f159282e.size() > 0) {
                i = this.f159282e.size() - 1;
            } else {
                i = 0;
            }
            recyclerView.smoothScrollToPosition(i);
        }
    }

    /* renamed from: b */
    private C63186o m247448b(MeetingSubtitleData meetingSubtitleData) {
        String str;
        if (meetingSubtitleData == null) {
            return null;
        }
        String str2 = "";
        if (meetingSubtitleData.mTarget != null) {
            String str3 = meetingSubtitleData.mTarget.f152471c;
            str2 = meetingSubtitleData.mTarget.f152469a;
            str = str3;
        } else {
            str = str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        C63186o oVar = new C63186o();
        UserInfoService.getUserInfoById(meetingSubtitleData.mMeetingId, str, meetingSubtitleData.mTarget.f152473e.getParticipantType(), new GetUserInfoListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$p$6wba6wVOJuFRSmPV0GBhuTrwEY */

            @Override // com.ss.android.vc.net.service.GetUserInfoListener
            public final void onGetUserInfo(VideoChatUser videoChatUser) {
                C63187p.m271426lambda$6wba6wVOJuFRSmPV0GBhuTrwEY(C63186o.this, videoChatUser);
            }
        });
        oVar.f159271d = meetingSubtitleData.mTarget.f152471c;
        oVar.f159268a = str2;
        oVar.f159272e = meetingSubtitleData.mTarget.f152473e;
        oVar.f159273f = meetingSubtitleData.mSeqId;
        oVar.f159274g = meetingSubtitleData.mIsSeqFinal;
        oVar.f159276i = meetingSubtitleData.mTimeStamp / 1000;
        oVar.f159277j = meetingSubtitleData.mSoundType;
        return oVar;
    }

    /* renamed from: a */
    public void mo218706a(MeetingSubtitleData meetingSubtitleData) {
        String str;
        if (meetingSubtitleData != null) {
            String str2 = "";
            if (meetingSubtitleData.mTarget != null) {
                String str3 = meetingSubtitleData.mTarget.f152471c;
                str2 = meetingSubtitleData.mTarget.f152469a;
                str = str3;
            } else {
                str = str2;
            }
            if (!TextUtils.isEmpty(str2)) {
                UserInfoService.getUserInfoById(meetingSubtitleData.mMeetingId, str, meetingSubtitleData.mTarget.f152473e.getParticipantType(), new GetUserInfoListener(meetingSubtitleData) {
                    /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$p$OKh1JfqQ9_xmzv_VoOXri0LnbOE */
                    public final /* synthetic */ MeetingSubtitleData f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C63187p.lambda$OKh1JfqQ9_xmzv_VoOXri0LnbOE(C63187p.this, this.f$1, videoChatUser);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo218707a(List<MeetingSubtitleData> list) {
        this.f159287j.post(new Runnable(list) {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$p$WrgPNDibERHinRdgM2GrtlQ6W_s */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C63187p.lambda$WrgPNDibERHinRdgM2GrtlQ6W_s(C63187p.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    private void m247444a(MeetingSubtitleData meetingSubtitleData, Bitmap bitmap) {
        C60735ab.m236001a(new Runnable(bitmap, meetingSubtitleData) {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$p$_JiTfBphsavSdH3Ag2qoWQC0kP0 */
            public final /* synthetic */ Bitmap f$1;
            public final /* synthetic */ MeetingSubtitleData f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C63187p.lambda$_JiTfBphsavSdH3Ag2qoWQC0kP0(C63187p.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    private C63186o m247442a(List<C63186o> list, C63186o oVar) {
        for (C63186o oVar2 : list) {
            if (oVar2.f159273f == oVar.f159273f) {
                return oVar2;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static /* synthetic */ void m247449b(C63186o oVar, VideoChatUser videoChatUser) {
        oVar.f159269b = C60783v.m236225a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), 36, 36);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247445a(MeetingSubtitleData meetingSubtitleData, VideoChatUser videoChatUser) {
        C60735ab.m236018e(new Runnable(videoChatUser, meetingSubtitleData) {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$p$lBpHNR2Nu5E59BgT7TJ0Novnb2M */
            public final /* synthetic */ VideoChatUser f$1;
            public final /* synthetic */ MeetingSubtitleData f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C63187p.lambda$lBpHNR2Nu5E59BgT7TJ0Novnb2M(C63187p.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m247446a(C63186o oVar, VideoChatUser videoChatUser) {
        C60735ab.m236018e(new Runnable(videoChatUser) {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$p$k5S3l1s3Ujof9mU2pPZ0V64PBzs */
            public final /* synthetic */ VideoChatUser f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C63187p.lambda$k5S3l1s3Ujof9mU2pPZ0V64PBzs(C63186o.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247443a(Bitmap bitmap, MeetingSubtitleData meetingSubtitleData) {
        C63186o oVar = new C63186o();
        oVar.f159269b = bitmap;
        oVar.f159268a = meetingSubtitleData.mTarget.f152469a;
        oVar.f159273f = meetingSubtitleData.mSeqId;
        oVar.f159274g = meetingSubtitleData.mIsSeqFinal;
        oVar.f159272e = meetingSubtitleData.mTarget.f152473e;
        oVar.f159271d = meetingSubtitleData.mTarget.f152471c;
        oVar.f159276i = meetingSubtitleData.mTimeStamp / 1000;
        oVar.f159277j = meetingSubtitleData.mSoundType;
        this.f159291n++;
        if (this.f159281d.peekLast() != null && this.f159281d.peekLast().f159273f == oVar.f159273f) {
            C60700b.m235851b("SubtitleProvider@", "[queueSubtitle]", "remove last " + meetingSubtitleData.mSeqId + " " + meetingSubtitleData.mSliceId + " " + meetingSubtitleData.mTarget);
            this.f159281d.pollLast();
            this.f159291n = this.f159291n - 1;
        }
        this.f159281d.offer(oVar);
        m247452g().sendEmptyMessage(1);
        if (this.f159291n == 10) {
            C60700b.m235851b("SubtitleProvider@", "[queueSubtitle2]", "receive 10 subtitles");
            m247452g().sendEmptyMessage(3);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247447a(VideoChatUser videoChatUser, MeetingSubtitleData meetingSubtitleData) {
        SystemClock.elapsedRealtime();
        m247444a(meetingSubtitleData, C60783v.m236225a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), 36, 36));
    }

    public C63187p(Context context, C63189q qVar, C61303k kVar) {
        this.f159278a = qVar;
        this.f159279b = kVar;
        this.f159285h = new RecyclerView(context);
        C63161h hVar = new C63161h();
        this.f159284g = hVar;
        hVar.setSupportsChangeAnimations(false);
        ScrollSpeedLinearLayoutManger scrollSpeedLinearLayoutManger = new ScrollSpeedLinearLayoutManger(context);
        this.f159286i = scrollSpeedLinearLayoutManger;
        scrollSpeedLinearLayoutManger.setStackFromEnd(true);
        this.f159285h.setLayoutManager(this.f159286i);
        this.f159285h.setOverScrollMode(2);
        this.f159285h.setBackgroundColor(C60773o.m236126d(R.color.vc_bg_body));
        C63161h hVar2 = this.f159284g;
        if (hVar2 != null) {
            this.f159285h.setItemAnimator(hVar2);
        }
        C63165l lVar = new C63165l(this.f159279b.mo212055d(), this.f159282e, R.layout.subtitle_history_item_content);
        this.f159283f = lVar;
        this.f159285h.setAdapter(lVar);
        mo218714e();
        this.f159287j = new Handler(C60735ab.m236017e().getLooper());
    }
}
