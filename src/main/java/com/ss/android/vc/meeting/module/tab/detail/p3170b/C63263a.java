package com.ss.android.vc.meeting.module.tab.detail.p3170b;

import android.content.Context;
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
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.tab.HistoryInfo;
import com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a;
import com.ss.android.vc.meeting.module.tab.detail.p3170b.C63263a;
import com.ss.android.vc.meeting.module.tab.widgets.C63327d;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.ce;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/* renamed from: com.ss.android.vc.meeting.module.tab.detail.b.a */
public class C63263a extends RecyclerView.Adapter<C63266a> {

    /* renamed from: a */
    public Context f159571a;

    /* renamed from: b */
    public C63230a.AbstractC63234b.AbstractC63235a f159572b;

    /* renamed from: c */
    private List<HistoryInfo> f159573c;

    /* renamed from: d */
    private String f159574d = "";

    /* renamed from: a */
    public void mo218948a() {
        this.f159574d = "";
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<HistoryInfo> list = this.f159573c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.tab.detail.b.a$2 */
    public static /* synthetic */ class C632652 {

        /* renamed from: a */
        static final /* synthetic */ int[] f159578a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryType[] r0 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.tab.detail.p3170b.C63263a.C632652.f159578a = r0
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryType r1 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryType.BE_CALLED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.tab.detail.p3170b.C63263a.C632652.f159578a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryType r1 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryType.CALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.tab.detail.p3170b.C63263a.C632652.f159578a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryType r1 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryType.JOIN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.tab.detail.p3170b.C63263a.C632652.f159578a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.entity.tab.HistoryInfo$HistoryType r1 = com.ss.android.vc.entity.tab.HistoryInfo.HistoryType.LEAVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab.detail.p3170b.C63263a.C632652.<clinit>():void");
        }
    }

    /* renamed from: a */
    private HistoryInfo m247787a(int i) {
        return this.f159573c.get(i);
    }

    /* renamed from: a */
    public void mo218949a(HistoryInfo historyInfo) {
        this.f159574d = "";
        this.f159573c.add(0, historyInfo);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo218951a(List<HistoryInfo> list) {
        this.f159573c.clear();
        this.f159574d = "";
        this.f159573c.addAll(list);
        notifyDataSetChanged();
    }

    public C63263a(Context context, C63230a.AbstractC63234b.AbstractC63235a aVar) {
        this.f159571a = context;
        this.f159572b = aVar;
        this.f159573c = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.tab.detail.b.a$a */
    public class C63266a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f159579a;

        /* renamed from: b */
        public TextView f159580b;

        /* renamed from: c */
        public TextView f159581c;

        /* renamed from: d */
        public TextView f159582d;

        C63266a(View view) {
            super(view);
            this.f159579a = (TextView) view.findViewById(R.id.action_date);
            this.f159580b = (TextView) view.findViewById(R.id.action_time);
            this.f159581c = (TextView) view.findViewById(R.id.action_text);
            this.f159582d = (TextView) view.findViewById(R.id.last_time);
        }
    }

    /* renamed from: a */
    public C63266a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C63266a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vc_tab_meeting_action_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C63266a aVar, int i) {
        HistoryInfo a = m247787a(i);
        C60700b.m235851b("VideoChatTab_HistoryInfoAdapter", "[onBindViewHolder]", "bind data: item is " + a);
        long callStarTime = a.getCallStarTime();
        if (a.getHistoryType() == HistoryInfo.HistoryType.JOIN) {
            callStarTime = a.getJoinTime();
        } else if (a.getHistoryType() == HistoryInfo.HistoryType.LEAVE) {
            callStarTime = a.getLeaveTime();
        }
        String a2 = C63327d.m248051a(callStarTime, TimeZone.getDefault());
        if (TextUtils.isEmpty(this.f159574d) || !this.f159574d.equals(a2)) {
            this.f159574d = a2;
            aVar.f159579a.setText(this.f159574d);
        } else {
            aVar.f159579a.setVisibility(8);
        }
        aVar.f159580b.setText(C63327d.m248052a(callStarTime, VideoChatModuleDependency.getSettingDependency().is24Hour(), TimeZone.getDefault()));
        if (this.f159572b.mo218893h()) {
            int i2 = C632652.f159578a[a.getHistoryType().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        aVar.f159581c.setText(UIHelper.getString(R.string.View_G_JoinedMeeting));
                    } else if (i2 == 4) {
                        aVar.f159581c.setText(UIHelper.getString(R.string.View_G_LeftMeeting));
                    }
                } else if (a.getCallStatus() == HistoryInfo.CallStatus.ACCEPTED) {
                    aVar.f159581c.setText(UIHelper.getString(R.string.View_G_Outgoing));
                } else {
                    aVar.f159581c.setText(UIHelper.getString(R.string.View_G_CallCanceledBySelf));
                }
            } else if (a.getCallStatus() == HistoryInfo.CallStatus.CANCELED) {
                UserInfoService.getUserInfoById(this.f159572b.mo218890e(), a.getInteracterUserId(), a.getInteracterUserType(), new GetUserInfoListener(a, aVar) {
                    /* class com.ss.android.vc.meeting.module.tab.detail.p3170b.$$Lambda$a$k_BEb4RV7x3EuHW_tcPs16LHic */
                    public final /* synthetic */ HistoryInfo f$1;
                    public final /* synthetic */ C63263a.C63266a f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C63263a.this.m247789b(this.f$1, this.f$2, videoChatUser);
                    }
                });
            } else if (a.getCallStatus() == HistoryInfo.CallStatus.ACCEPTED) {
                UserInfoService.getUserInfoById(this.f159572b.mo218890e(), a.getInteracterUserId(), a.getInteracterUserType(), new GetUserInfoListener(a, aVar) {
                    /* class com.ss.android.vc.meeting.module.tab.detail.p3170b.$$Lambda$a$NPOKdfkLpgdMVyEQf36IJKYXLzo */
                    public final /* synthetic */ HistoryInfo f$1;
                    public final /* synthetic */ C63263a.C63266a f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C63263a.this.m247788a(this.f$1, this.f$2, videoChatUser);
                    }
                });
            }
        } else {
            int i3 = C632652.f159578a[a.getHistoryType().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    if (a.getCallStatus() == HistoryInfo.CallStatus.ACCEPTED) {
                        aVar.f159581c.setText(UIHelper.getString(R.string.View_G_Outgoing));
                        if (a.getLeaveTime() > 0) {
                            aVar.f159582d.setText(C63327d.m248053b(a.getLeaveTime() - a.getCallStarTime()));
                            aVar.f159582d.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    aVar.f159581c.setText(UIHelper.getString(R.string.View_G_CallCanceledBySelf));
                }
            } else if (a.getCallStatus() == HistoryInfo.CallStatus.ACCEPTED) {
                aVar.f159581c.setText(UIHelper.getString(R.string.View_G_Incoming));
                if (a.getLeaveTime() > 0) {
                    aVar.f159582d.setText(C63327d.m248053b(a.getLeaveTime() - a.getCallStarTime()));
                    aVar.f159582d.setVisibility(0);
                }
            } else {
                aVar.f159581c.setText(UIHelper.getString(R.string.View_G_Missed));
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247788a(HistoryInfo historyInfo, C63266a aVar, VideoChatUser videoChatUser) {
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_IncomingCallFromNameHistory, "name", videoChatUser.getName());
        if (historyInfo.getInteracterUserType() == ParticipantType.LARK_USER) {
            aVar.f159581c.setText(m247786a(mustacheFormat, videoChatUser.getName(), videoChatUser.getId(), historyInfo.getInteracterUserType()));
        } else {
            aVar.f159581c.setText(mustacheFormat);
        }
        aVar.f159581c.setMovementMethod(LinkMovementMethod.getInstance());
        aVar.f159581c.setHighlightColor(0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m247789b(HistoryInfo historyInfo, C63266a aVar, VideoChatUser videoChatUser) {
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_MissedCallFromName, "name", videoChatUser.getName());
        if (historyInfo.getInteracterUserType() == ParticipantType.LARK_USER) {
            aVar.f159581c.setText(m247786a(mustacheFormat, videoChatUser.getName(), videoChatUser.getId(), historyInfo.getInteracterUserType()));
        } else {
            aVar.f159581c.setText(mustacheFormat);
        }
        aVar.f159581c.setMovementMethod(LinkMovementMethod.getInstance());
        aVar.f159581c.setHighlightColor(0);
    }

    /* renamed from: a */
    private SpannableString m247786a(String str, String str2, final String str3, final ParticipantType participantType) {
        SpannableString spannableString = new SpannableString(str);
        if (TextUtils.isEmpty(str)) {
            return spannableString;
        }
        int indexOf = str.indexOf(str2);
        spannableString.setSpan(new ClickableSpan() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3170b.C63263a.C632641 */

            public void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(C60773o.m236126d(R.color.primary_pri_600));
                textPaint.setUnderlineText(false);
            }

            public void onClick(View view) {
                if (participantType == ParticipantType.LARK_USER) {
                    String f = C63263a.this.f159572b.mo218891f();
                    String e = C63263a.this.f159572b.mo218890e();
                    ByteviewUser g = C63263a.this.f159572b.mo218892g();
                    ce.m250276i();
                    C63497j.m248854a(C63263a.this.f159571a, str3, f, e, g);
                }
            }
        }, indexOf, str2.length() + indexOf, 17);
        return spannableString;
    }
}
