package com.ss.android.vc.meeting.module.calendar;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8922b;
import com.bytedance.ee.bear.middleground.calendar.pool.WebEditorWrapper;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60754h;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.CalendarGroupResponse;
import com.ss.android.vc.entity.CalendarInfo;
import com.ss.android.vc.entity.CalendarLocation;
import com.ss.android.vc.entity.Room;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.IBackPressHandlerRegister;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61373b;
import com.ss.android.vc.meeting.module.base.AbstractC61425e;
import com.ss.android.vc.meeting.module.calendar.View$OnClickListenerC61555d;
import com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.MeetingPstnInvitationDialog;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.MeetingPstnInvitationViewHolder;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.PstnInviteInfo;
import com.ss.android.vc.meeting.module.share.C62955c;
import com.ss.android.vc.meeting.module.share.p3163d.C62965c;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.service.VideoChatUIConfigService;
import com.ss.android.vc.statistics.event.C63742at;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.meeting.module.calendar.d */
public class View$OnClickListenerC61555d implements View.OnClickListener, ValueCallback<String> {

    /* renamed from: A */
    Activity f154407A;

    /* renamed from: B */
    AbstractC61222a f154408B;

    /* renamed from: C */
    public C61373b.AbstractC61374a f154409C;

    /* renamed from: D */
    private IBackPressHandlerRegister f154410D;

    /* renamed from: E */
    private WebEditorWrapper f154411E;

    /* renamed from: F */
    private CalendarInfo f154412F;

    /* renamed from: G */
    private final AtomicBoolean f154413G = new AtomicBoolean(false);

    /* renamed from: H */
    private boolean f154414H;

    /* renamed from: a */
    TextView f154415a;

    /* renamed from: b */
    TextView f154416b;

    /* renamed from: c */
    View f154417c;

    /* renamed from: d */
    TextView f154418d;

    /* renamed from: e */
    TextView f154419e;

    /* renamed from: f */
    View f154420f;

    /* renamed from: g */
    TimeShowTextView f154421g;

    /* renamed from: h */
    View f154422h;

    /* renamed from: i */
    TextView f154423i;

    /* renamed from: j */
    View f154424j;

    /* renamed from: k */
    TextView f154425k;

    /* renamed from: l */
    View f154426l;

    /* renamed from: m */
    FrameLayout f154427m;

    /* renamed from: n */
    TextView f154428n;

    /* renamed from: o */
    CalendarScrollView f154429o;

    /* renamed from: p */
    View f154430p;

    /* renamed from: q */
    View f154431q;

    /* renamed from: r */
    TextView f154432r;

    /* renamed from: s */
    View f154433s;

    /* renamed from: t */
    View f154434t;

    /* renamed from: u */
    View f154435u;

    /* renamed from: v */
    View f154436v;

    /* renamed from: w */
    ViewGroup f154437w;

    /* renamed from: x */
    public final AtomicBoolean f154438x = new AtomicBoolean(false);

    /* renamed from: y */
    public Handler f154439y;

    /* renamed from: z */
    C61303k f154440z;

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k */
    private /* synthetic */ void m240281k() {
        this.f154413G.set(false);
    }

    /* renamed from: c */
    private boolean m240272c() {
        return this.f154440z.aa().mo216288p();
    }

    /* renamed from: d */
    private boolean m240274d() {
        return this.f154440z.aa().mo216290r();
    }

    /* renamed from: i */
    private void m240279i() {
        this.f154411E.getHtmlText(new ValueCallback() {
            /* class com.ss.android.vc.meeting.module.calendar.$$Lambda$d$HIuUDE7N9mWGkCeeQfg5iM9bYbE */

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                View$OnClickListenerC61555d.this.m240271c((View$OnClickListenerC61555d) ((String) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j */
    private /* synthetic */ void m240280j() {
        this.f154426l.setVisibility(0);
        this.f154430p.setVisibility(8);
        this.f154431q.setVisibility(8);
    }

    /* renamed from: b */
    public void mo213339b() {
        C61562e.m240298a().mo213350a(this.f154411E);
        mo213335a();
        this.f154439y.removeCallbacksAndMessages(null);
    }

    /* renamed from: f */
    private void m240276f() {
        VideoChat e;
        C61303k kVar = this.f154440z;
        if (kVar != null && (e = kVar.mo212056e()) != null) {
            if (DesktopUtil.m144307b()) {
                this.f154432r.setVisibility(8);
                this.f154433s.setVisibility(8);
                return;
            }
            this.f154432r.setText(C60754h.m236085a(e.getMeetNumber()));
        }
    }

    /* renamed from: g */
    private void m240277g() {
        this.f154415a.setOnClickListener(this);
        this.f154428n.setOnClickListener(this);
        this.f154439y = new Handler(Looper.getMainLooper());
        mo213336a(this.f154440z.mo212091I().mo212501h());
        VcBizSender.m249251c(this.f154440z.mo212091I().mo212490a().mo212475g()).mo219889a(new AbstractC63598b<CalendarInfo>() {
            /* class com.ss.android.vc.meeting.module.calendar.View$OnClickListenerC61555d.C615582 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            /* renamed from: a */
            public void onSuccess(CalendarInfo calendarInfo) {
                View$OnClickListenerC61555d.this.mo213336a(calendarInfo);
            }
        });
    }

    /* renamed from: h */
    private void m240278h() {
        WebEditorWrapper a = C61562e.m240298a().mo213348a((Context) this.f154407A, true);
        this.f154411E = a;
        a.setEditable(false);
        m240279i();
        this.f154411E.setOnUrlLoadingCallback(new AbstractC8922b() {
            /* class com.ss.android.vc.meeting.module.calendar.$$Lambda$d$VAjG034yIK6MNV9gLqyprIhjf7M */

            @Override // com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8922b
            public final boolean onStartLoading(WebView webView, String str) {
                return View$OnClickListenerC61555d.this.m240266a((View$OnClickListenerC61555d) webView, (WebView) str);
            }
        });
        this.f154427m.addView(this.f154411E, 0, new FrameLayout.LayoutParams(-1, -2));
    }

    /* renamed from: e */
    private void m240275e() {
        C61303k kVar = this.f154440z;
        if (kVar != null) {
            int i = 8;
            if (kVar.aa().mo216277e()) {
                this.f154436v.setVisibility(0);
                VideoChat e = this.f154440z.mo212056e();
                if (e != null) {
                    this.f154434t.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.vc.meeting.module.calendar.$$Lambda$d$ZwQh7sdhAV0WgQbRCTx4ymP5res */

                        public final void onClick(View view) {
                            View$OnClickListenerC61555d.this.m240273d(view);
                        }
                    });
                    View view = this.f154435u;
                    if (VideoChatUIConfigService.m249506i(this.f154440z)) {
                        i = 0;
                    }
                    view.setVisibility(i);
                    this.f154435u.setOnClickListener(new View.OnClickListener(e) {
                        /* class com.ss.android.vc.meeting.module.calendar.$$Lambda$d$nXJs6m_gB_dp6dySXlE7Sog2C4o */
                        public final /* synthetic */ VideoChat f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(View view) {
                            View$OnClickListenerC61555d.this.m240265a((View$OnClickListenerC61555d) this.f$1, (VideoChat) view);
                        }
                    });
                    return;
                }
                return;
            }
            this.f154436v.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo213335a() {
        WebEditorWrapper webEditorWrapper = this.f154411E;
        if (webEditorWrapper != null) {
            if (webEditorWrapper.getParent() != null) {
                ((ViewGroup) this.f154411E.getParent()).removeAllViews();
            }
            this.f154411E.destroy();
            this.f154411E = null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m240270c(View view) {
        this.f154437w.removeView(view);
        AbstractC61222a aVar = this.f154408B;
        if (aVar != null) {
            aVar.mo211610a(UIHelper.getString(R.string.View_N_MeetingInfo));
        }
    }

    /* renamed from: b */
    private void m240268b(CalendarInfo calendarInfo) {
        if (calendarInfo != null && !this.f154414H) {
            if (this.f154411E == null) {
                m240278h();
            }
            if (!TextUtils.isEmpty(calendarInfo.getDescription())) {
                this.f154414H = true;
                this.f154411E.setData(calendarInfo.getDescription());
                return;
            }
            this.f154426l.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m240271c(String str) {
        C60700b.m235851b("CalendarInfoViewHolder", "[updateStyleViaJsFunction]", "[getHtmlText] onReceiveValue: " + str);
        CalendarInfo calendarInfo = this.f154412F;
        if (calendarInfo != null && !TextUtils.isEmpty(calendarInfo.getDescription())) {
            C61562e.m240298a().mo213351a(this.f154411E, this);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m240273d(View view) {
        if (m240272c() || m240274d()) {
            this.f154440z.aa().mo216273b(this.f154440z);
        } else {
            this.f154440z.aa().mo216267a(this.f154440z);
        }
        C63742at.m250110q(this.f154440z.mo212056e());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m240267b(View view) {
        String str;
        C63742at.m250111r(this.f154440z.mo212056e());
        C61303k kVar = this.f154440z;
        if (kVar == null || kVar.mo212056e() == null) {
            str = "";
        } else {
            str = this.f154440z.mo212056e().getMeetNumber();
        }
        if (!DesktopUtil.m144307b()) {
            new MeetingPstnInvitationDialog(this.f154407A, this.f154440z, str, null).mo211628a(this.f154407A).mo211606a();
        } else {
            MeetingPstnInvitationViewHolder cVar = new MeetingPstnInvitationViewHolder(this.f154407A, this.f154440z, this.f154408B, this.f154410D, str, null);
            View b = cVar.mo215496b();
            cVar.mo215494a(new AbstractC61425e(b) {
                /* class com.ss.android.vc.meeting.module.calendar.$$Lambda$d$niutBV2h45nL4SwDfwfiQS_hI4I */
                public final /* synthetic */ View f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.vc.meeting.module.base.AbstractC61425e
                public final void dismiss() {
                    View$OnClickListenerC61555d.this.m240270c((View$OnClickListenerC61555d) this.f$1);
                }
            });
            this.f154437w.addView(b);
        }
        this.f154408B.dismiss();
    }

    public void onClick(View view) {
        int lineCount;
        if (view.getId() == R.id.calendar_title) {
            Layout layout = this.f154415a.getLayout();
            if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
                m240269b(this.f154412F.getTopic());
            }
        } else if (view.getId() == R.id.calendar_enter_group && !this.f154438x.get()) {
            this.f154438x.set(true);
            C60735ab.m236002a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.calendar.View$OnClickListenerC61555d.RunnableC615604 */

                public void run() {
                    View$OnClickListenerC61555d.this.f154438x.set(false);
                }
            }, 1000);
            mo213338a(this.f154440z.mo212091I().mo212490a().mo212475g(), this.f154412F.getGroupId());
            C63742at.m250103j(this.f154440z.mo212056e());
        }
    }

    /* renamed from: a */
    private void m240264a(View view) {
        this.f154415a = (TextView) view.findViewById(R.id.calendar_title);
        this.f154416b = (TextView) view.findViewById(R.id.meeting_info_link);
        this.f154417c = view.findViewById(R.id.vg_pstn_number_container);
        this.f154418d = (TextView) view.findViewById(R.id.meeting_info_dial_in_call);
        this.f154419e = (TextView) view.findViewById(R.id.meeting_info_dial_more);
        this.f154420f = view.findViewById(R.id.calendar_time_area);
        this.f154421g = (TimeShowTextView) view.findViewById(R.id.calendar_time_text);
        this.f154422h = view.findViewById(R.id.calendar_room_area);
        this.f154423i = (TextView) view.findViewById(R.id.calendar_room_text);
        this.f154424j = view.findViewById(R.id.calendar_location_area);
        this.f154425k = (TextView) view.findViewById(R.id.calendar_location_text);
        this.f154426l = view.findViewById(R.id.calendar_description_area);
        this.f154427m = (FrameLayout) view.findViewById(R.id.calendar_description_fl);
        this.f154428n = (TextView) view.findViewById(R.id.calendar_enter_group);
        this.f154429o = (CalendarScrollView) view.findViewById(R.id.calendar_content_scroll);
        this.f154430p = view.findViewById(R.id.description_cover1);
        this.f154431q = view.findViewById(R.id.description_cover2);
        this.f154432r = (TextView) view.findViewById(R.id.meeting_info_meetingid);
        this.f154433s = view.findViewById(R.id.meeting_info_id_label);
        this.f154434t = view.findViewById(R.id.meeting_info_copy);
        this.f154435u = view.findViewById(R.id.meeting_info_share);
        this.f154436v = view.findViewById(R.id.meeting_operation_container);
        this.f154437w = (ViewGroup) view.findViewById(R.id.container);
    }

    /* renamed from: b */
    private void m240269b(String str) {
        Dialog dialog = new Dialog(this.f154407A, R.style.CalendarTitleDialog);
        dialog.setContentView(R.layout.dialog_calendar_title_text);
        TextView textView = (TextView) dialog.findViewById(R.id.calendar_title_text);
        dialog.findViewById(R.id.calendar_title_dismiss).setOnClickListener(new View.OnClickListener(dialog) {
            /* class com.ss.android.vc.meeting.module.calendar.$$Lambda$d$vE28jZQjZv51pQEH8Y6hC77IXlw */
            public final /* synthetic */ Dialog f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(View view) {
                View$OnClickListenerC61555d.m240263a(this.f$0, view);
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(0);
            window.setGravity(48);
            window.setBackgroundDrawable(new ColorDrawable());
            window.setLayout(-1, -2);
        }
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation((float) BitmapDescriptorFactory.HUE_RED, 1.0f));
        textView.startAnimation(animationSet);
        textView.setTextIsSelectable(true);
        textView.setText(str);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        dialog.show();
    }

    /* renamed from: a */
    public void mo213336a(CalendarInfo calendarInfo) {
        int i;
        C61303k kVar = this.f154440z;
        if (kVar == null || kVar.mo212056e() == null || this.f154440z.mo212056e().getVideoChatSettings() == null || TextUtils.isEmpty(this.f154440z.mo212056e().getVideoChatSettings().getTopic())) {
            this.f154415a.setText(R.string.View_G_ServerNoTitle);
        } else {
            this.f154415a.setText(this.f154440z.mo212056e().getVideoChatSettings().getTopic());
        }
        this.f154416b.setText(this.f154440z.mo212056e().getMeetingUrl());
        if (m240272c()) {
            this.f154440z.aa().mo216268a(this.f154440z, new AbstractC63598b<List<PstnInviteInfo>>() {
                /* class com.ss.android.vc.meeting.module.calendar.View$OnClickListenerC61555d.C615593 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("CalendarInfoViewHolder", "[requestPstnInviteInfo2]", "failed, hide view: " + eVar);
                }

                /* renamed from: a */
                public void onSuccess(List<PstnInviteInfo> list) {
                    C60700b.m235851b("CalendarInfoViewHolder", "[requestPstnInviteInfo]", "success: " + list);
                    if (list != null && list.size() > 0) {
                        C60735ab.m236001a(new Runnable(list) {
                            /* class com.ss.android.vc.meeting.module.calendar.$$Lambda$d$3$1PR1Q4hHRCQFYJ8FG0UHRH7D6uo */
                            public final /* synthetic */ List f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                View$OnClickListenerC61555d.C615593.this.m240293b(this.f$1);
                            }
                        });
                    }
                }

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: b */
                private /* synthetic */ void m240293b(List list) {
                    View$OnClickListenerC61555d.this.f154417c.setVisibility(0);
                    View$OnClickListenerC61555d.this.f154418d.setText(String.format("%s (%s)", ((PstnInviteInfo) list.get(0)).mo215503b(), ((PstnInviteInfo) list.get(0)).mo215502a()));
                    if (list.size() > 1) {
                        View$OnClickListenerC61555d.this.f154419e.setVisibility(0);
                    } else {
                        View$OnClickListenerC61555d.this.f154419e.setVisibility(8);
                    }
                }
            });
            this.f154419e.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.calendar.$$Lambda$d$x2RYM5WrAVMncwe2i0BFTXzpeSs */

                public final void onClick(View view) {
                    View$OnClickListenerC61555d.this.m240267b((View$OnClickListenerC61555d) view);
                }
            });
        } else {
            this.f154417c.setVisibility(8);
        }
        if (calendarInfo == null) {
            this.f154429o.setVisibility(8);
            return;
        }
        this.f154412F = calendarInfo;
        this.f154429o.setVisibility(0);
        if (calendarInfo.getTheEventStartTime() == 0 || calendarInfo.getTheEventEndTime() == 0) {
            this.f154420f.setVisibility(8);
        } else {
            C61552a.m240251a(this.f154421g, calendarInfo);
            this.f154420f.setVisibility(0);
        }
        HashMap hashMap = new HashMap();
        if (calendarInfo.getRooms() != null && calendarInfo.getRooms().size() > 0) {
            for (Map.Entry<String, Room> entry : calendarInfo.getRooms().entrySet()) {
                if (!(entry.getValue() == null || entry.getValue().location == null)) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (calendarInfo.getViewRooms() != null && calendarInfo.getViewRooms().size() > 0) {
            for (Map.Entry<String, Room> entry2 : calendarInfo.getViewRooms().entrySet()) {
                if (!(entry2.getValue() == null || entry2.getValue().location == null)) {
                    hashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        if (hashMap.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry3 : hashMap.entrySet()) {
                sb.append(((Room) entry3.getValue()).fullNameSite);
                sb.append("\n");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                this.f154423i.setText(sb.toString());
                this.f154422h.setVisibility(0);
            } else {
                this.f154422h.setVisibility(8);
            }
        } else {
            this.f154422h.setVisibility(8);
        }
        if (calendarInfo.getLocations() == null || calendarInfo.getLocations().size() <= 0) {
            this.f154424j.setVisibility(8);
        } else {
            CalendarLocation calendarLocation = calendarInfo.getLocations().get(0);
            if (calendarLocation == null || (TextUtils.isEmpty(calendarLocation.getName()) && TextUtils.isEmpty(calendarLocation.getAddress()))) {
                this.f154424j.setVisibility(8);
            } else {
                String name = calendarLocation.getName();
                if (TextUtils.isEmpty(name)) {
                    name = calendarLocation.getAddress();
                } else if (!TextUtils.isEmpty(calendarLocation.getAddress())) {
                    name = name + ", " + calendarLocation.getAddress();
                }
                this.f154425k.setText(name);
                this.f154424j.setVisibility(0);
            }
        }
        m240268b(calendarInfo);
        if (!calendarInfo.isCanEnterOrCreateGroup() || !VideoChatUIConfigService.m249511n(this.f154440z)) {
            this.f154428n.setVisibility(8);
            return;
        }
        this.f154428n.setVisibility(0);
        TextView textView = this.f154428n;
        if (calendarInfo.getGroupId() == 0) {
            i = R.string.View_M_CreateMeetingGroup;
        } else {
            i = R.string.View_M_EnterMeetingGroup;
        }
        textView.setText(i);
    }

    /* renamed from: a */
    public void onReceiveValue(String str) {
        C60700b.m235851b("CalendarInfoViewHolder", "[onReceiveValue]", "[evaluateJavascript] onReceiveValue");
        this.f154439y.postDelayed(new Runnable() {
            /* class com.ss.android.vc.meeting.module.calendar.$$Lambda$d$IF8w1TgfD7Dsoz_FrIrDuekmnDk */

            public final void run() {
                View$OnClickListenerC61555d.this.m240280j();
            }
        }, 250);
    }

    /* renamed from: a */
    public void mo213338a(final String str, final long j) {
        VcBizSender.m249236b(str, true).mo219889a(new AbstractC63598b<CalendarGroupResponse>() {
            /* class com.ss.android.vc.meeting.module.calendar.View$OnClickListenerC61555d.C615615 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m240295a(DialogInterface dialogInterface, int i) {
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                int i;
                if (!eVar.f160600c) {
                    if (j == 0) {
                        i = R.string.View_M_FailedToCreateMeetingGroup;
                    } else {
                        i = R.string.View_M_FailedToJoinMeetingGroup;
                    }
                    C60738ac.m236037c(i);
                }
            }

            /* renamed from: a */
            public void onSuccess(CalendarGroupResponse calendarGroupResponse) {
                int i;
                long j;
                if (calendarGroupResponse.getGroupStatus() == CalendarGroupResponse.GetCalendarGroupStatus.GET_GROUP_SUCCESS) {
                    if (C28460b.m104296a(View$OnClickListenerC61555d.this.f154407A)) {
                        if (VideoChatModuleDependency.getChatDependency() != null) {
                            VideoChatModuleDependency.getChatDependency().openChatById(View$OnClickListenerC61555d.this.f154407A, calendarGroupResponse.getGroupId());
                        }
                        View$OnClickListenerC61555d.this.f154408B.dismiss();
                    }
                    AbstractC61728a ae = View$OnClickListenerC61555d.this.f154440z.ae();
                    Activity activity = View$OnClickListenerC61555d.this.f154407A;
                    if (Build.VERSION.SDK_INT < 26) {
                        j = 1500;
                    } else {
                        j = 800;
                    }
                    ae.mo213808a(activity, j);
                } else if (calendarGroupResponse.getGroupStatus() == CalendarGroupResponse.GetCalendarGroupStatus.GET_GROUP_NOT_CREATED) {
                    VCDialogUtils.m236177a((Context) View$OnClickListenerC61555d.this.f154407A, (int) R.string.View_M_CreateMeetingGroupQuestion, 2, (int) R.string.View_M_CreateMeetingGroupInfo, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) $$Lambda$d$5$8gsw3irY5FWwJXepneirwGoGNKc.INSTANCE, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(str, j) {
                        /* class com.ss.android.vc.meeting.module.calendar.$$Lambda$d$5$HKho5LZGjSBqiO3TcaGFL326oA4 */
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ long f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            View$OnClickListenerC61555d.C615615.this.m240296a(this.f$1, this.f$2, dialogInterface, i);
                        }
                    }, false);
                } else if (calendarGroupResponse.getGroupStatus() == CalendarGroupResponse.GetCalendarGroupStatus.GET_GROUP_NOT_PERMITTED || calendarGroupResponse.getGroupStatus() == CalendarGroupResponse.GetCalendarGroupStatus.GET_GROUP_FAILED) {
                    if (j == 0) {
                        i = R.string.View_M_FailedToCreateMeetingGroup;
                    } else {
                        i = R.string.View_M_FailedToJoinMeetingGroup;
                    }
                    C60738ac.m236037c(i);
                }
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m240296a(String str, long j, DialogInterface dialogInterface, int i) {
                View$OnClickListenerC61555d.this.mo213338a(str, j);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m240263a(Dialog dialog, View view) {
        if (dialog.isShowing() && C60773o.m236121a(dialog.getContext())) {
            try {
                dialog.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m240266a(WebView webView, String str) {
        long j;
        if (C28460b.m104296a(this.f154407A)) {
            if (VideoChatModuleDependency.getBrowserDependency() != null) {
                VideoChatModuleDependency.getBrowserDependency().openUrlBrowser(this.f154407A, str);
            }
            this.f154408B.dismiss();
        }
        AbstractC61728a ae = this.f154440z.ae();
        Activity activity = this.f154407A;
        if (Build.VERSION.SDK_INT < 26) {
            j = 1500;
        } else {
            j = 800;
        }
        ae.mo213808a(activity, j);
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m240265a(VideoChat videoChat, View view) {
        if (!this.f154413G.get() && videoChat != null && videoChat.getVideoChatSettings() != null) {
            if (videoChat.getVideoChatSettings().isLocked()) {
                C60738ac.m236037c((int) R.string.View_M_MeetingLocked);
                return;
            }
            this.f154413G.set(true);
            C60735ab.m236002a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.calendar.$$Lambda$d$wxMym5_PdKrm_3o8NSbL_CAiaws */

                public final void run() {
                    View$OnClickListenerC61555d.this.m240281k();
                }
            }, 1000);
            C61303k kVar = this.f154440z;
            if (kVar != null && kVar.mo212056e() != null) {
                C63742at.m250070a("meeting_info", this.f154440z.mo212056e());
                Activity activity = this.f154407A;
                C61303k kVar2 = this.f154440z;
                C62965c.m246556a(activity, kVar2, new C62955c(kVar2.mo212055d(), VideoChat.VendorType.RTC.getNumber()), false).mo211606a();
            }
        }
    }

    /* renamed from: a */
    public View mo213334a(final C61303k kVar, Activity activity, AbstractC61222a aVar, IBackPressHandlerRegister cVar) {
        this.f154440z = kVar;
        this.f154407A = activity;
        this.f154408B = aVar;
        this.f154410D = cVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_calendar_info2, (ViewGroup) null);
        m240264a(inflate);
        m240278h();
        m240277g();
        m240276f();
        m240275e();
        inflate.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.vc.meeting.module.calendar.View$OnClickListenerC61555d.View$OnAttachStateChangeListenerC615561 */

            public void onViewAttachedToWindow(View view) {
                if (kVar != null) {
                    View$OnClickListenerC61555d.this.f154409C = new C61373b.AbstractC61374a() {
                        /* class com.ss.android.vc.meeting.module.calendar.View$OnClickListenerC61555d.View$OnAttachStateChangeListenerC615561.C615571 */

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        /* renamed from: b */
                        public /* synthetic */ void mo212445b(boolean z) {
                            C61373b.AbstractC61374a.CC.$default$b(this, z);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        public /* synthetic */ void bC_() {
                            C61373b.AbstractC61374a.CC.$default$bC_(this);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        public /* synthetic */ void bF_() {
                            C61373b.AbstractC61374a.CC.$default$bF_(this);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        public /* synthetic */ void bX_() {
                            C61373b.AbstractC61374a.CC.$default$bX_(this);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        /* renamed from: c */
                        public /* synthetic */ void mo212449c(boolean z) {
                            C61373b.AbstractC61374a.CC.$default$c(this, z);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        /* renamed from: d */
                        public /* synthetic */ void mo212451d(boolean z) {
                            C61373b.AbstractC61374a.CC.$default$d(this, z);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        public /* synthetic */ void i_(boolean z) {
                            C61373b.AbstractC61374a.CC.$default$i_(this, z);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        public /* synthetic */ void onOnlyPresenterCanAnnotateChanged(boolean z) {
                            C61373b.AbstractC61374a.CC.$default$onOnlyPresenterCanAnnotateChanged(this, z);
                        }

                        /* access modifiers changed from: private */
                        /* access modifiers changed from: public */
                        /* renamed from: a */
                        private /* synthetic */ void m240288a(String str) {
                            View$OnClickListenerC61555d.this.f154415a.setText(str);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        public void c_(String str, String str2) {
                            if (kVar != null && TextUtils.equals(str, kVar.mo212055d())) {
                                C60735ab.m236001a(new Runnable(str2) {
                                    /* class com.ss.android.vc.meeting.module.calendar.$$Lambda$d$1$1$VMNZ19v2DPAN4PbBSjQzkVF_JM */
                                    public final /* synthetic */ String f$1;

                                    {
                                        this.f$1 = r2;
                                    }

                                    public final void run() {
                                        View$OnClickListenerC61555d.View$OnAttachStateChangeListenerC615561.C615571.this.m240288a(this.f$1);
                                    }
                                });
                            }
                        }
                    };
                    kVar.mo212091I().mo212498e().mo212443a(View$OnClickListenerC61555d.this.f154409C);
                }
            }

            public void onViewDetachedFromWindow(View view) {
                C61303k kVar = kVar;
                if (kVar != null) {
                    kVar.mo212091I().mo212498e().mo212444b(View$OnClickListenerC61555d.this.f154409C);
                }
            }
        });
        return inflate;
    }
}
