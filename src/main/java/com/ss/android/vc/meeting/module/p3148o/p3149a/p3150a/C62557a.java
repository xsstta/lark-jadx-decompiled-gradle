package com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.dialog.UDCheckBoxDialogBuilder;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.MeetingSecuritySetting;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.breakoutroom.BreakoutRoomManage;
import com.ss.android.vc.entity.request.HostManageRequest;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.bottombar.AbstractC61444a;
import com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingManager;
import com.ss.android.vc.meeting.module.p3123g.C61878d;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62562e;
import com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.C62557a;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.bf;
import com.ss.android.vc.statistics.event.bi;
import com.ss.android.vc.statistics.event2.MeetingHostPanelEvent;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.meeting.module.o.a.a.a */
public class C62557a {

    /* renamed from: a */
    public final C61303k f157455a;

    /* renamed from: b */
    public AbstractC61444a.AbstractC61445a f157456b;

    /* renamed from: c */
    public AbstractC61222a f157457c;

    /* renamed from: d */
    public View f157458d;

    /* renamed from: e */
    public View f157459e;

    /* renamed from: f */
    public View f157460f;

    /* renamed from: g */
    public View f157461g;

    /* renamed from: h */
    public View f157462h;

    /* renamed from: i */
    public View f157463i;

    /* renamed from: j */
    public TextView f157464j;

    /* renamed from: k */
    public View f157465k;

    /* renamed from: l */
    public View f157466l;

    /* renamed from: m */
    public View f157467m;

    /* renamed from: n */
    public SecuritySettingManager.ISecuritySettingChange f157468n;

    /* renamed from: o */
    private AtomicBoolean f157469o;

    /* renamed from: p */
    private AtomicBoolean f157470p;

    /* renamed from: q */
    private Activity f157471q;

    /* renamed from: a */
    public void mo216326a(boolean z) {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m244705d() {
        this.f157470p.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m244707e() {
        this.f157470p.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m244709f() {
        this.f157469o.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m244711g() {
        this.f157469o.set(false);
    }

    /* renamed from: b */
    public void mo216327b() {
        mo216325a(this.f157455a.mo212056e().getVideoChatSettings());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.o.a.a.a$4 */
    public static /* synthetic */ class C625614 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157475a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel[] r0 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.C62557a.C625614.f157475a = r0
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel r1 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.PUBLIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.C62557a.C625614.f157475a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel r1 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.ONLY_HOST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.C62557a.C625614.f157475a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel r1 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.TENANT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.C62557a.C625614.<clinit>():void");
        }
    }

    /* renamed from: c */
    private void m244702c() {
        if (DesktopUtil.m144307b()) {
            this.f157459e.setVisibility(8);
            this.f157460f.setVisibility(8);
            this.f157458d.setPadding(0, UIHelper.dp2px(16.0f), 0, 0);
            this.f157458d.setBackground(C60773o.m236128f(R.drawable.desktop_host_control_bg));
            this.f157461g.setVisibility(0);
            this.f157462h.setPadding(UIHelper.dp2px(20.0f), 0, UIHelper.dp2px(20.0f), 0);
            this.f157463i.setPadding(UIHelper.dp2px(20.0f), 0, UIHelper.dp2px(20.0f), 0);
        }
    }

    /* renamed from: a */
    public void mo216323a() {
        int i;
        int i2;
        if (this.f157455a.mo212056e() == null || this.f157455a.mo212056e().getVideoChatSettings() == null) {
            i = 350;
        } else {
            i = this.f157455a.mo212056e().getVideoChatSettings().getMaxSoftRtcNormalMode();
        }
        boolean z = false;
        if (this.f157455a.mo212091I() == null || this.f157455a.mo212091I().mo212494b() == null || this.f157455a.mo212091I().mo212494b().mo212601f() == null) {
            i2 = 0;
        } else {
            i2 = this.f157455a.mo212091I().mo212494b().mo212601f().size();
        }
        if (i2 <= i) {
            z = true;
        }
        m244701b(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m244714i(View view) {
        C61878d.m241707a(mo216322a(view), this.f157455a, true, false).mo211606a();
    }

    /* renamed from: b */
    private void m244701b(boolean z) {
        if (z) {
            this.f157466l.setVisibility(0);
            this.f157467m.setVisibility(8);
            return;
        }
        this.f157466l.setVisibility(8);
        this.f157467m.setVisibility(0);
    }

    /* renamed from: a */
    public Activity mo216322a(View view) {
        Activity activity = this.f157471q;
        if (activity != null) {
            return activity;
        }
        return (Activity) view.getContext();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m244706d(View view) {
        if (!this.f157470p.get()) {
            this.f157470p.set(true);
            C60735ab.m236002a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$rnBNY3x4GFUDGUWiVyG7ur0ERlg */

                public final void run() {
                    C62557a.this.m244705d();
                }
            }, 1000);
            C60738ac.m236037c((int) R.string.View_M_CanNotUnmuteAll);
            C60700b.m235851b("HostControlViewHolder", "[onClick10]", "click unmute all button failure");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m244710f(View view) {
        C60700b.m235851b("HostControlViewHolder", "[onClick6]", "click muteAllBtn");
        VCDialogUtils.m236178a((Context) mo216322a(view), (int) R.string.View_M_MuteAllCurrentAndNewParticipants, 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$naYfBvMy7R7woi1iMWxSHZCgEw */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62557a.this.m244700b(dialogInterface, i);
            }
        }, (int) R.string.View_M_MuteAll, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$Q_g24HCWzaqbpRktcMSvIQO3UA */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62557a.this.m244696a((C62557a) dialogInterface, (DialogInterface) i);
            }
        }, false);
        bi.m250172a(true, this.f157455a.mo212056e());
        MeetingHostPanelEvent.m249805a().mo220292b(this.f157455a, "mute_all");
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m244713h(View view) {
        C60700b.m235851b("HostControlViewHolder", "[onClick]", "securitySettingContainer click");
        AbstractC61222a aVar = this.f157457c;
        if (aVar != null) {
            aVar.dismiss();
        }
        AbstractC61444a.AbstractC61445a aVar2 = this.f157456b;
        if (aVar2 != null) {
            aVar2.mo213069m();
        }
        C60735ab.m236002a(new Runnable(view) {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$yHlJfsnQ3nRCVBL0AC0Fq4T8s */
            public final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C62557a.this.m244714i(this.f$1);
            }
        }, 200);
    }

    /* renamed from: a */
    public void mo216324a(int i) {
        View view = this.f157458d;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: c */
    private void m244704c(View view) {
        this.f157458d = view.findViewById(R.id.layout_host_control);
        this.f157459e = view.findViewById(R.id.divider_view);
        this.f157460f = view.findViewById(R.id.host_control_title);
        this.f157464j = (TextView) view.findViewById(R.id.security_setting);
        this.f157462h = view.findViewById(R.id.lock_meeting_container);
        this.f157465k = view.findViewById(R.id.btn_mute_all);
        this.f157466l = view.findViewById(R.id.btn_unmute_all);
        this.f157467m = view.findViewById(R.id.btn_unmute_all_disabled);
        this.f157461g = view.findViewById(R.id.desktop_divider_view);
        this.f157463i = view.findViewById(R.id.advanced_options_container);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m244708e(View view) {
        BreakoutRoomManage breakoutRoomManage;
        String str;
        VCBreakoutRoomInfo k;
        if (!this.f157470p.get()) {
            this.f157470p.set(true);
            C60735ab.m236002a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$v4qZr_dQwAW05nJ1E6xYjQK9QnI */

                public final void run() {
                    C62557a.this.m244707e();
                }
            }, 1000);
            if (!this.f157455a.al().mo213182i() || (k = this.f157455a.al().mo213184k()) == null) {
                str = null;
                breakoutRoomManage = null;
            } else {
                String breakoutRoomId = k.getBreakoutRoomId();
                BreakoutRoomManage breakoutRoomManage2 = new BreakoutRoomManage();
                breakoutRoomManage2.setManageType(BreakoutRoomManage.ManageType.UPDATE_SETTINGS);
                ArrayList arrayList = new ArrayList();
                arrayList.add(k);
                breakoutRoomManage2.setRoomInfos(arrayList);
                str = breakoutRoomId;
                breakoutRoomManage = breakoutRoomManage2;
            }
            VcBizService.sendManageRequest(this.f157455a.mo212055d(), str, breakoutRoomManage, HostManageRequest.Action.MUTE_ALL_MICROPHONE, (String) null, (String) null, (ParticipantType) null, false, false, false, (Boolean) false, (String) null);
            C60738ac.m236037c((int) R.string.View_G_RequestSent);
            bi.m250172a(false, this.f157455a.mo212056e());
            C60700b.m235851b("HostControlViewHolder", "[onClick9]", "click unmute all button");
            MeetingHostPanelEvent.m249805a().mo220292b(this.f157455a, "unmute_all");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m244712g(View view) {
        float f;
        C60700b.m235851b("HostControlViewHolder", "[onClick3]", "click muteAllBtn in force mode");
        boolean[] zArr = {this.f157455a.mo212056e().getVideoChatSettings().getAllowPartiUnMute()};
        UDCheckBoxDialogBuilder cVar = (UDCheckBoxDialogBuilder) new UDCheckBoxDialogBuilder(mo216322a(view)).mo90892a(UIHelper.getString(R.string.View_M_AllowParticipantsToUnmute)).mo90893a(zArr[0]).mo90891a(new UDCheckBox.OnCheckedChangeListener(zArr) {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$m2blNjxZowhi2iFGZkn4BFlXYHY */
            public final /* synthetic */ boolean[] f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
            public final void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                C62557a.m244699a(this.f$0, uDCheckBox, z);
            }
        }).title(UIHelper.getString(R.string.View_M_MuteAllCurrentAndNewParticipants));
        if (UDUiModeUtils.m93320a(view.getContext().getResources().getConfiguration())) {
            f = 0.7f;
        } else {
            f = 0.4f;
        }
        ((UDCheckBoxDialogBuilder) ((UDCheckBoxDialogBuilder) ((UDCheckBoxDialogBuilder) cVar.maskAlpha(f)).addActionButton(R.id.ud_dialog_btn_primary, UIHelper.getString(R.string.View_M_MuteAll), new DialogInterface.OnClickListener(zArr) {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$IAlVfuobuwRLNu979bpPQnF0hM */
            public final /* synthetic */ boolean[] f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62557a.this.m244698a((C62557a) this.f$1, (boolean[]) dialogInterface, (DialogInterface) i);
            }
        })).addActionButton(R.id.ud_dialog_btn_secondary, UIHelper.getString(R.string.View_G_CancelButton), new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$iZ1inXwkRsp8L7gxdVzmmsh1miw */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62557a.this.m244703c(dialogInterface, i);
            }
        })).show();
        bi.m250172a(true, this.f157455a.mo212056e());
        MeetingHostPanelEvent.m249805a().mo220292b(this.f157455a, "mute_all");
    }

    /* renamed from: b */
    public void mo216328b(View view) {
        if (this.f157458d == null) {
            C60740ad.m236052b((ViewStub) view.findViewById(R.id.stub_host_area));
        }
        m244704c(view);
        this.f157458d.setVisibility(0);
        this.f157459e.setVisibility(0);
        this.f157468n = new SecuritySettingManager.ISecuritySettingChange() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.C62557a.C625581 */

            @Override // com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingManager.ISecuritySettingChange
            /* renamed from: b */
            public void mo214274b() {
            }

            @Override // com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingManager.ISecuritySettingChange
            /* renamed from: a */
            public void mo214273a() {
                C62557a aVar = C62557a.this;
                aVar.mo216325a(aVar.f157455a.mo212056e().getVideoChatSettings());
            }
        };
        this.f157455a.mo212161u().mo214264a(this.f157468n);
        VideoChatSettings videoChatSettings = this.f157455a.mo212056e().getVideoChatSettings();
        mo216325a(videoChatSettings);
        this.f157462h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$xhE2xmHy23yC4LQsJM9b3vGv2g */

            public final void onClick(View view) {
                C62557a.this.m244713h(view);
            }
        });
        this.f157462h.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.C62557a.View$OnAttachStateChangeListenerC625592 */

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                if (C62557a.this.f157455a != null) {
                    C62557a.this.f157455a.mo212161u().mo214268b(C62557a.this.f157468n);
                }
            }
        });
        this.f157463i.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.C62557a.C625603 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m244724a(View view) {
                C62562e.m244734a(C62557a.this.mo216322a(view), C62557a.this.f157455a).mo211606a();
            }

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("HostControlViewHolder", "[onClick2]", "advancedOptionsContainer click");
                if (C62557a.this.f157457c != null) {
                    C62557a.this.f157457c.dismiss();
                }
                if (C62557a.this.f157456b != null) {
                    C62557a.this.f157456b.mo213069m();
                }
                C60735ab.m236002a(new Runnable(view) {
                    /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$3$LjzWERf51zh7krFjnCQTl1wJPLw */
                    public final /* synthetic */ View f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C62557a.C625603.this.m244724a(this.f$1);
                    }
                }, 200);
            }
        });
        if (this.f157455a.aa().mo216285m()) {
            this.f157463i.setVisibility(0);
        } else {
            this.f157463i.setVisibility(8);
        }
        boolean z = true;
        if (videoChatSettings.getManageCapability() != null) {
            z = videoChatSettings.getManageCapability().isForceMuteMicrophone();
        }
        if (!this.f157455a.ao().mo218468d() || !z) {
            this.f157465k.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$zhYsYZGb_JZ4nYlitZu0MMqjxiE */

                public final void onClick(View view) {
                    C62557a.this.m244710f(view);
                }
            });
        } else {
            this.f157465k.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$yLQTSrMXHs8Pv1nitp10tlA219A */

                public final void onClick(View view) {
                    C62557a.this.m244712g(view);
                }
            });
        }
        this.f157466l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$oeNxO50qhawhmVt63KInRu9ctU */

            public final void onClick(View view) {
                C62557a.this.m244708e(view);
            }
        });
        this.f157467m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$KLypZXw5v8Y6OXT53drvKIylnvY */

            public final void onClick(View view) {
                C62557a.this.m244706d(view);
            }
        });
        mo216323a();
        m244702c();
    }

    /* renamed from: a */
    public void mo216325a(VideoChatSettings videoChatSettings) {
        String str;
        MeetingSecuritySetting securitySetting = videoChatSettings.getSecuritySetting();
        if (securitySetting.getSecurityLevel() == MeetingSecuritySetting.SecurityLevel.CONTACTS_AND_GROUP) {
            this.f157455a.mo212161u().mo214260a(securitySetting, new SecuritySettingManager.IGetContactAndGroupInfo(securitySetting) {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$R8JUJWS256MmOzMPJ4Ry1WDaGE */
                public final /* synthetic */ MeetingSecuritySetting f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingManager.IGetContactAndGroupInfo
                public final void onGetContactAndGroupInfo(Map map) {
                    C62557a.this.m244697a((C62557a) this.f$1, (MeetingSecuritySetting) map);
                }
            });
            return;
        }
        int i = C625614.f157475a[securitySetting.getSecurityLevel().ordinal()];
        if (i == 1) {
            str = UIHelper.getString(R.string.View_M_JoiningPermissionsAnyone);
        } else if (i == 2) {
            str = UIHelper.getString(R.string.View_M_JoiningPermissionsHostInvited);
        } else if (i != 3) {
            str = "";
        } else {
            str = UIHelper.getString(R.string.View_M_JoiningPermissionsOrganizerCompany);
        }
        this.f157464j.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m244697a(MeetingSecuritySetting meetingSecuritySetting, Map map) {
        this.f157464j.setText(this.f157455a.mo212161u().mo214266b(meetingSecuritySetting));
    }

    public C62557a(C61303k kVar, AbstractC61222a aVar) {
        this.f157469o = new AtomicBoolean(false);
        this.f157470p = new AtomicBoolean(false);
        this.f157455a = kVar;
        this.f157457c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m244700b(DialogInterface dialogInterface, int i) {
        C60700b.m235851b("HostControlViewHolder", "[onClick7]", "click mute all cancel");
        bf.m250160a(this.f157455a.mo212056e(), false, false);
        MeetingPopupEvent.m249838a().mo220322a("cancel", "mute_all", true, this.f157455a.mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m244703c(DialogInterface dialogInterface, int i) {
        C60700b.m235851b("HostControlViewHolder", "[onClick5]", "click mute all cancel");
        bf.m250160a(this.f157455a.mo212056e(), false, false);
        MeetingPopupEvent.m249838a().mo220322a("cancel", "mute_all", true, this.f157455a.mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m244696a(DialogInterface dialogInterface, int i) {
        BreakoutRoomManage breakoutRoomManage;
        String str;
        VCBreakoutRoomInfo k;
        if (!this.f157469o.get()) {
            this.f157469o.set(true);
            C60735ab.m236002a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$_rBBQDu1WcXsg9dELFGmojWtstU */

                public final void run() {
                    C62557a.this.m244709f();
                }
            }, 1000);
            if (!this.f157455a.al().mo213182i() || (k = this.f157455a.al().mo213184k()) == null) {
                str = null;
                breakoutRoomManage = null;
            } else {
                String breakoutRoomId = k.getBreakoutRoomId();
                BreakoutRoomManage breakoutRoomManage2 = new BreakoutRoomManage();
                breakoutRoomManage2.setManageType(BreakoutRoomManage.ManageType.UPDATE_SETTINGS);
                ArrayList arrayList = new ArrayList();
                arrayList.add(k);
                breakoutRoomManage2.setRoomInfos(arrayList);
                str = breakoutRoomId;
                breakoutRoomManage = breakoutRoomManage2;
            }
            VcBizService.sendManageRequest(this.f157455a.mo212055d(), str, breakoutRoomManage, HostManageRequest.Action.MUTE_ALL_MICROPHONE, (String) null, (String) null, (ParticipantType) null, true, false, true, (Boolean) null, (String) null);
            C60738ac.m236037c((int) R.string.View_M_AllCurrentAndNewParticipantsMuted);
            bf.m250160a(this.f157455a.mo212056e(), true, true);
            C60700b.m235851b("HostControlViewHolder", "[onClick8]", "click mute all confirm");
            MeetingPopupEvent.m249838a().mo220322a("confirm", "mute_all", true, this.f157455a.mo212056e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m244699a(boolean[] zArr, UDCheckBox uDCheckBox, boolean z) {
        uDCheckBox.setChecked(z);
        zArr[0] = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m244698a(boolean[] zArr, DialogInterface dialogInterface, int i) {
        BreakoutRoomManage breakoutRoomManage;
        String str;
        VCBreakoutRoomInfo k;
        if (!this.f157469o.get()) {
            this.f157469o.set(true);
            C60735ab.m236002a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.$$Lambda$a$wTyuhMVXJZvkscpSs3rO9wqrU60 */

                public final void run() {
                    C62557a.this.m244711g();
                }
            }, 1000);
            if (!this.f157455a.al().mo213182i() || (k = this.f157455a.al().mo213184k()) == null) {
                str = null;
                breakoutRoomManage = null;
            } else {
                String breakoutRoomId = k.getBreakoutRoomId();
                BreakoutRoomManage breakoutRoomManage2 = new BreakoutRoomManage();
                breakoutRoomManage2.setManageType(BreakoutRoomManage.ManageType.UPDATE_SETTINGS);
                ArrayList arrayList = new ArrayList();
                arrayList.add(k);
                breakoutRoomManage2.setRoomInfos(arrayList);
                str = breakoutRoomId;
                breakoutRoomManage = breakoutRoomManage2;
            }
            VcBizService.sendManageRequest(this.f157455a.mo212055d(), str, breakoutRoomManage, HostManageRequest.Action.MUTE_ALL_MICROPHONE, (String) null, (String) null, (ParticipantType) null, true, false, true, Boolean.valueOf(zArr[0]), (String) null);
            C60738ac.m236037c((int) R.string.View_M_AllCurrentAndNewParticipantsMuted);
            bf.m250160a(this.f157455a.mo212056e(), true, zArr[0]);
            MeetingPopupEvent.m249838a().mo220322a("confirm", "mute_all", true, this.f157455a.mo212056e());
            C60700b.m235851b("HostControlViewHolder", "[onClick4]", "click mute all confirm");
        }
    }

    public C62557a(C61303k kVar, AbstractC61222a aVar, Activity activity, AbstractC61444a.AbstractC61445a aVar2) {
        this(kVar, aVar);
        this.f157471q = activity;
        this.f157456b = aVar2;
    }
}
