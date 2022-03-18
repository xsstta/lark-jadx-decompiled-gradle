package com.ss.android.vc.meeting.module.tab3.detail.p3173b;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.tab.HistoryInfo;
import com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a;
import com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63359a;
import com.ss.android.vc.meeting.module.tab3.widgets.utils.DateTimeUtils;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event2.VCTabEvent3;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/* renamed from: com.ss.android.vc.meeting.module.tab3.detail.b.a */
public class C63359a extends RecyclerView.Adapter<C63362a> {

    /* renamed from: a */
    public C63328a.AbstractC63332b.AbstractC63333a f159947a;

    /* renamed from: b */
    public String f159948b = "";

    /* renamed from: c */
    public long f159949c;

    /* renamed from: d */
    public String f159950d;

    /* renamed from: e */
    public boolean f159951e;

    /* renamed from: f */
    private List<HistoryInfo> f159952f;

    /* renamed from: a */
    public void mo219263a() {
        this.f159948b = "";
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<HistoryInfo> list = this.f159952f;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.tab3.detail.b.a$2 */
    public static /* synthetic */ class C633612 {

        /* renamed from: a */
        static final /* synthetic */ int[] f159956a;

        /* renamed from: b */
        static final /* synthetic */ int[] f159957b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryInfoType[] r0 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryInfoType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63359a.C633612.f159957b = r0
                r1 = 1
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryInfoType r2 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryInfoType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63359a.C633612.f159957b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryInfoType r3 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryInfoType.VIDEO_CONFERENCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63359a.C633612.f159957b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryInfoType r4 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryInfoType.ENTERPRISE_PHONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryType[] r3 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63359a.C633612.f159956a = r3
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryType r4 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryType.BE_CALLED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63359a.C633612.f159956a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryType r3 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryType.CALL     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63359a.C633612.f159956a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryType r1 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryType.JOIN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63359a.C633612.f159956a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryType r1 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryType.LEAVE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63359a.C633612.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo219264a(long j) {
        this.f159949c = j;
    }

    /* renamed from: a */
    private HistoryInfo m248245a(int i) {
        return this.f159952f.get(i);
    }

    /* renamed from: a */
    public void mo219265a(HistoryInfo historyInfo) {
        this.f159948b = "";
        this.f159952f.add(0, historyInfo);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.tab3.detail.b.a$a */
    public class C63362a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f159958a;

        /* renamed from: b */
        public TextView f159959b;

        /* renamed from: c */
        public TextView f159960c;

        /* renamed from: d */
        public TextView f159961d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo219272a(HistoryInfo historyInfo) {
            long callStarTime = historyInfo.getCallStarTime();
            if (historyInfo.getHistoryType() == HistoryInfo.HistoryType.JOIN) {
                callStarTime = historyInfo.getJoinTime();
            } else if (historyInfo.getHistoryType() == HistoryInfo.HistoryType.LEAVE) {
                callStarTime = historyInfo.getLeaveTime();
            }
            String a = DateTimeUtils.m248535a(callStarTime, TimeZone.getDefault());
            if (TextUtils.isEmpty(C63359a.this.f159948b) || !C63359a.this.f159948b.equals(a)) {
                C63359a.this.f159948b = a;
                this.f159958a.setText(C63359a.this.f159948b);
                this.f159958a.setVisibility(0);
            } else {
                this.f159958a.setVisibility(8);
            }
            this.f159959b.setText(DateTimeUtils.m248536a(callStarTime, VideoChatModuleDependency.getSettingDependency().is24Hour(), TimeZone.getDefault()));
        }

        C63362a(View view) {
            super(view);
            this.f159958a = (TextView) view.findViewById(R.id.action_date);
            this.f159959b = (TextView) view.findViewById(R.id.action_time);
            this.f159960c = (TextView) view.findViewById(R.id.action_text);
            this.f159961d = (TextView) view.findViewById(R.id.last_time);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m248253a(ParticipantType participantType, VideoChatUser videoChatUser) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_IncomingCallFromNameHistory, "name", videoChatUser.getName());
            if (participantType == ParticipantType.LARK_USER) {
                this.f159960c.setText(C63359a.this.mo219261a(mustacheFormat, videoChatUser.getName(), videoChatUser.getId(), participantType));
            } else {
                this.f159960c.setText(mustacheFormat);
            }
            this.f159960c.setMovementMethod(LinkMovementMethod.getInstance());
            this.f159960c.setHighlightColor(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m248254b(ParticipantType participantType, VideoChatUser videoChatUser) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_MissedCallFromName, "name", videoChatUser.getName());
            if (participantType == ParticipantType.LARK_USER) {
                this.f159960c.setText(C63359a.this.mo219261a(mustacheFormat, videoChatUser.getName(), videoChatUser.getId(), participantType));
            } else {
                this.f159960c.setText(mustacheFormat);
            }
            this.f159960c.setMovementMethod(LinkMovementMethod.getInstance());
            this.f159960c.setHighlightColor(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo219270a(HistoryInfo.HistoryInfoType historyInfoType, HistoryInfo.HistoryType historyType, HistoryInfo.CallStatus callStatus) {
            int i = C633612.f159957b[historyInfoType.ordinal()];
            if (i == 1) {
                this.f159960c.setVisibility(8);
            } else if (i == 2) {
                this.f159960c.setVisibility(0);
                int i2 = C633612.f159956a[historyType.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (callStatus == HistoryInfo.CallStatus.ACCEPTED) {
                            this.f159960c.setText(C60773o.m236119a((int) R.string.View_G_Outgoing));
                            if (C63359a.this.f159949c > 0) {
                                this.f159961d.setText(DateTimeUtils.m248540d(C63359a.this.f159949c));
                                this.f159961d.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        this.f159960c.setText(C60773o.m236119a((int) R.string.View_G_CallCanceledBySelf));
                    }
                } else if (callStatus == HistoryInfo.CallStatus.ACCEPTED) {
                    this.f159960c.setText(C60773o.m236119a((int) R.string.View_G_Incoming));
                    if (C63359a.this.f159949c > 0) {
                        this.f159961d.setText(DateTimeUtils.m248540d(C63359a.this.f159949c));
                        this.f159961d.setVisibility(0);
                    }
                } else {
                    this.f159960c.setText(C60773o.m236119a((int) R.string.View_G_Missed));
                }
            } else if (i == 3) {
                this.f159960c.setVisibility(0);
                int i3 = C633612.f159956a[historyType.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (callStatus == HistoryInfo.CallStatus.ACCEPTED) {
                            this.f159960c.setText(C60773o.m236119a((int) R.string.View_MV_OfficePhoneCallOut_HistoryRecord));
                            if (C63359a.this.f159949c > 0) {
                                this.f159961d.setText(DateTimeUtils.m248540d(C63359a.this.f159949c));
                                this.f159961d.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        this.f159960c.setText(C60773o.m236119a((int) R.string.View_MV_OfficePhoneHasCanceled_HistoryRecord));
                    }
                } else if (callStatus == HistoryInfo.CallStatus.ACCEPTED) {
                    this.f159960c.setText(C60773o.m236119a((int) R.string.View_MV_OfficePhoneCallIn_HistoryRecord));
                    if (C63359a.this.f159949c > 0) {
                        this.f159961d.setText(DateTimeUtils.m248540d(C63359a.this.f159949c));
                        this.f159961d.setVisibility(0);
                    }
                } else {
                    this.f159960c.setText(C60773o.m236119a((int) R.string.View_MV_OfficePhoneUnanswered_HistoryRecord));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo219271a(HistoryInfo.HistoryType historyType, HistoryInfo.CallStatus callStatus, String str, ParticipantType participantType) {
            int i = C633612.f159956a[historyType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f159960c.setText(UIHelper.getString(R.string.View_G_JoinedMeeting));
                    } else if (i == 4) {
                        this.f159960c.setText(UIHelper.getString(R.string.View_G_LeftMeeting));
                    }
                } else if (callStatus == HistoryInfo.CallStatus.ACCEPTED) {
                    this.f159960c.setText(UIHelper.getString(R.string.View_G_Outgoing));
                } else {
                    this.f159960c.setText(UIHelper.getString(R.string.View_G_CallCanceledBySelf));
                }
            } else if (callStatus == HistoryInfo.CallStatus.CANCELED) {
                UserInfoService.getUserInfoById(C63359a.this.f159950d, str, participantType, new GetUserInfoListener(participantType) {
                    /* class com.ss.android.vc.meeting.module.tab3.detail.p3173b.$$Lambda$a$a$yUH5R_GiO80HLSG6xgYXMHmzrE */
                    public final /* synthetic */ ParticipantType f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C63359a.C63362a.this.m248254b(this.f$1, videoChatUser);
                    }
                });
            } else if (callStatus == HistoryInfo.CallStatus.ACCEPTED) {
                UserInfoService.getUserInfoById(C63359a.this.f159950d, str, participantType, new GetUserInfoListener(participantType) {
                    /* class com.ss.android.vc.meeting.module.tab3.detail.p3173b.$$Lambda$a$a$vyymEDKQ2jAIOnsYH2QKS5br1Kg */
                    public final /* synthetic */ ParticipantType f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C63359a.C63362a.this.m248253a(this.f$1, videoChatUser);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo219267a(List<HistoryInfo> list) {
        this.f159952f.clear();
        this.f159948b = "";
        this.f159952f.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public C63362a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C63362a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vc_tab_meeting_action_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C63362a aVar, int i) {
        HistoryInfo a = m248245a(i);
        aVar.mo219272a(a);
        if (this.f159951e) {
            aVar.mo219271a(a.getHistoryType(), a.getCallStatus(), a.getInteracterUserId(), a.getInteracterUserType());
        } else {
            aVar.mo219270a(a.getHistoryInfoType(), a.getHistoryType(), a.getCallStatus());
        }
    }

    public C63359a(String str, boolean z, C63328a.AbstractC63332b.AbstractC63333a aVar) {
        this.f159950d = str;
        this.f159951e = z;
        this.f159947a = aVar;
        this.f159952f = new ArrayList();
    }

    /* renamed from: a */
    public SpannableString mo219261a(String str, String str2, final String str3, final ParticipantType participantType) {
        SpannableString spannableString = new SpannableString(str);
        if (TextUtils.isEmpty(str)) {
            return spannableString;
        }
        int indexOf = str.indexOf(str2);
        spannableString.setSpan(new ClickableSpan() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63359a.C633601 */

            public void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(C60773o.m236126d(R.color.primary_pri_600));
                textPaint.setUnderlineText(false);
            }

            public void onClick(View view) {
                if (participantType == ParticipantType.LARK_USER) {
                    VCTabEvent3.f160816b.mo220248a("user_link", "profile_main_view", C63359a.this.f159950d, C63359a.this.f159947a.mo219200b(), C63359a.this.f159951e);
                    C63359a.this.f159947a.mo219199a(str3);
                }
            }
        }, indexOf, str2.length() + indexOf, 17);
        return spannableString;
    }
}
