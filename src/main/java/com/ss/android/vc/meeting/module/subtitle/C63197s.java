package com.ss.android.vc.meeting.module.subtitle;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.C60942l;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChatConfig;
import com.ss.android.vc.entity.request.HostManageRequest;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.statistics.event.C63751by;
import com.ss.android.vc.statistics.event.C63763l;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.s */
public final class C63197s {
    /* renamed from: a */
    public static void m247502a(View view) {
        ViewCompat.m4064c(view, 1.0f);
        ViewCompat.m4083h(view, 1.0f);
        ViewCompat.m4081g(view, 1.0f);
        ViewCompat.m4057b(view, (float) BitmapDescriptorFactory.HUE_RED);
        ViewCompat.m4030a(view, (float) BitmapDescriptorFactory.HUE_RED);
        ViewCompat.m4068d(view, (float) BitmapDescriptorFactory.HUE_RED);
        ViewCompat.m4077f(view, (float) BitmapDescriptorFactory.HUE_RED);
        ViewCompat.m4074e(view, (float) BitmapDescriptorFactory.HUE_RED);
        ViewCompat.m4088j(view, (float) (view.getMeasuredHeight() / 2));
        ViewCompat.m4086i(view, (float) (view.getMeasuredWidth() / 2));
        ViewCompat.m4103r(view).mo4725a((Interpolator) null).mo4729b(0L);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m247503a(TextView textView, ArrayList arrayList, int i) {
        textView.setText(((UDBaseListDialogBuilder.ListItem) arrayList.get(i)).mo90882a());
    }

    /* renamed from: b */
    public static void m247507b(Context context, C61303k kVar, AbstractC63163j jVar) {
        if (kVar.aa().mo216282j()) {
            VCDialogUtils.m236204a(context, (View) null, (int) R.string.View_VM_AllowUsToUseAudio, 2, Integer.valueOf((int) R.string.View_VM_AllowUsToUseAudioDescriptionNew), (int) R.string.View_VM_NoButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(jVar) {
                /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$s$mQiSVde7Wu8uPU1VnOJmo0Gb61k */
                public final /* synthetic */ AbstractC63163j f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C63197s.m247505a(C61303k.this, (AbstractC63163j) false, (DialogInterface) this.f$1);
                }
            }, (int) R.string.View_VM_YesButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(jVar) {
                /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$s$XbMLy9Q9Nm9Rb1cDBtvdvny01A0 */
                public final /* synthetic */ AbstractC63163j f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C63197s.m247505a(C61303k.this, (AbstractC63163j) true, (DialogInterface) this.f$1);
                }
            }, false);
            return;
        }
        VcBizSender.m249197a(kVar.mo212055d(), true, (String) null, (String) null, (Boolean) null).mo219896d();
        if (jVar != null) {
            jVar.onSubtitleOnOff(true);
        }
    }

    /* renamed from: a */
    public static void m247500a(Context context, C61303k kVar, AbstractC63163j jVar) {
        if (context != null && kVar != null) {
            if (kVar.aa().mo216276d()) {
                m247507b(context, kVar, jVar);
            } else if (!kVar.aa().mo216293u() || kVar.mo212091I().mo212490a().mo212483o() || kVar.mo212107Y().mo218558a()) {
                m247507b(context, kVar, jVar);
            } else {
                m247501a(context, kVar, jVar, true);
                C63751by.m250229a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, null, kVar.mo212056e());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m247505a(C61303k kVar, boolean z, AbstractC63163j jVar) {
        kVar.mo212107Y().mo218560b(true);
        VcBizSender.m249197a(kVar.mo212055d(), true, (String) null, (String) null, Boolean.valueOf(z)).mo219896d();
        C63763l.m250309c(z, kVar.mo212056e());
        if (jVar != null) {
            jVar.onSubtitleOnOff(true);
        }
    }

    /* renamed from: a */
    private static void m247501a(final Context context, final C61303k kVar, final AbstractC63163j jVar, final boolean z) {
        String str;
        Participant c = ParticipantUtil.m248731c(kVar.mo212056e().getParticipants());
        if (c == null || c.getParticipantSettings() == null) {
            str = null;
        } else {
            str = c.getParticipantSettings().getAppliedSpokenLanguage();
        }
        if (TextUtils.isEmpty(str)) {
            str = "zh_cn";
        }
        final ArrayList arrayList = new ArrayList();
        VideoChatConfig j = VideoChatManager.m249444a().mo220132j();
        if (j == null || j.getSpokenLanguages() == null || j.getSpokenLanguages().size() <= 0) {
            C60942l lVar = new C60942l();
            lVar.f152506a = "zh_cn";
            lVar.f152507b = UIHelper.getString(R.string.View_G_Chinese);
            arrayList.add(lVar);
            C60942l lVar2 = new C60942l();
            lVar2.f152506a = "en_us";
            lVar2.f152507b = UIHelper.getString(R.string.View_G_English);
            arrayList.add(lVar2);
        } else {
            arrayList.addAll(j.getSpokenLanguages());
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.pick_item_spoken_lang, (ViewGroup) null);
        final TextView textView = (TextView) inflate.findViewById(R.id.tv_language);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C60942l lVar3 = (C60942l) it.next();
            if (C57782ag.m224242a(lVar3.f152506a, str)) {
                textView.setText(lVar3.f152507b);
                break;
            }
        }
        inflate.setOnClickListener(new View.OnClickListener(arrayList, context, textView) {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$s$q_P3_eMznCnt5QD3Ayxl6vP7L8 */
            public final /* synthetic */ ArrayList f$0;
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ TextView f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C63197s.m247506a(this.f$0, this.f$1, this.f$2, view);
            }
        });
        VCDialogUtils.m236204a(context, inflate, (int) R.string.View_G_SubtitlesSelectSpokenLanguage, 2, (Integer) null, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63197s.DialogInterface$OnClickListenerC631981 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C63751by.m250229a("cancel", null, kVar.mo212056e());
                MeetingPopupEvent.m249838a().mo220318a("cancel", "subtitle_selection", kVar.mo212056e());
            }
        }, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63197s.DialogInterface$OnClickListenerC631992 */

            public void onClick(DialogInterface dialogInterface, int i) {
                String charSequence = textView.getText().toString();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C60942l lVar = (C60942l) it.next();
                    if (C57782ag.m224242a(lVar.f152507b, charSequence)) {
                        VcBizService.sendManageRequest(kVar.mo212055d(), HostManageRequest.Action.APPLY_GLOBAL_SPOKEN_LANGUAGE, null, null, null, false, false, false, false, lVar.f152506a, null);
                        C63751by.m250229a("confirm", lVar.f152506a, kVar.mo212056e());
                        break;
                    }
                }
                if (z) {
                    C63197s.m247507b(context, kVar, jVar);
                }
                MeetingPopupEvent.m249838a().mo220318a("confirm", "subtitle_selection", kVar.mo212056e());
            }
        }, false);
        MeetingPopupEvent.m249838a().mo220317a("subtitle_selection", kVar.mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m247506a(ArrayList arrayList, Context context, TextView textView, View view) {
        float f;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new UDBaseListDialogBuilder.ListItem(new UDBaseListDialogBuilder.ListItemBuilder(((C60942l) it.next()).f152507b)));
        }
        UDActionPanelBuilder aVar = (UDActionPanelBuilder) new UDActionPanelBuilder(context).mo90873b(arrayList2);
        if (UDUiModeUtils.m93320a(context.getResources().getConfiguration())) {
            f = 0.7f;
        } else {
            f = 0.4f;
        }
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.maskAlpha(f)).mo90869a(new UDListDialogController.OnItemClickListener(textView, arrayList2) {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$s$38zaOmKmRG55ekLzpxZuuGpFwb4 */
            public final /* synthetic */ TextView f$0;
            public final /* synthetic */ ArrayList f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
            public final void onItemClick(int i) {
                C63197s.m247503a(this.f$0, this.f$1, i);
            }
        })).addActionButton(R.id.ud_dialog_btn_cancel, R.string.View_G_CancelButton, (DialogInterface.OnClickListener) null)).show();
    }
}
