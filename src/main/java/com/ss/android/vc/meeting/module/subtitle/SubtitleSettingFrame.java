package com.ss.android.vc.meeting.module.subtitle;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.entity.C60942l;
import com.ss.android.vc.entity.VideoChatConfig;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.statistics.event.C63751by;
import com.ss.android.vc.statistics.event2.MeetingSettingEvent2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class SubtitleSettingFrame extends FrameLayout implements AbstractC61214a {

    /* renamed from: a */
    private ViewGroup f159044a;

    /* renamed from: b */
    private ViewGroup f159045b;

    /* renamed from: c */
    private TextView f159046c;

    /* renamed from: d */
    private TextView f159047d;

    /* renamed from: e */
    private TextView f159048e;

    /* renamed from: f */
    private ViewGroup f159049f;

    /* renamed from: g */
    private C61303k f159050g;

    /* renamed from: h */
    private AbstractC61222a f159051h;

    /* renamed from: i */
    private String f159052i;

    /* renamed from: j */
    private String f159053j;

    /* renamed from: k */
    private String f159054k;

    /* renamed from: l */
    private String[] f159055l;

    /* renamed from: m */
    private String[] f159056m;

    /* renamed from: n */
    private boolean f159057n;

    /* renamed from: o */
    private boolean f159058o;

    /* renamed from: p */
    private boolean f159059p;

    /* renamed from: q */
    private List<C60942l> f159060q;

    /* renamed from: r */
    private List<C60942l> f159061r;

    /* renamed from: s */
    private Set<String> f159062s;

    /* renamed from: a */
    public void mo218538a() {
        AbstractC61222a aVar = this.f159051h;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        mo218538a();
        return true;
    }

    /* renamed from: d */
    private void m247175d() {
        if (this.f159057n || this.f159058o) {
            this.f159048e.setVisibility(0);
        } else {
            this.f159048e.setVisibility(8);
        }
    }

    /* renamed from: e */
    private void m247176e() {
        if (C63634c.m249496b("byteview.callmeeting.android.subtitle_delete_spoken_language")) {
            this.f159044a.setVisibility(8);
        } else {
            this.f159044a.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        if (context instanceof MeetingActivity) {
            ((MeetingActivity) context).mo212771a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Context context = getContext();
        if (context instanceof MeetingActivity) {
            ((MeetingActivity) context).mo212776b(this);
        }
    }

    /* renamed from: b */
    private void m247171b() {
        if (this.f159054k.equals("default")) {
            this.f159054k = ShareHitPoint.f121868c;
            m247168a((String) null, ShareHitPoint.f121868c);
        }
    }

    /* renamed from: f */
    private void m247177f() {
        String[] strArr = this.f159055l;
        if (strArr == null || strArr.length == 0) {
            C60700b.m235851b("SubtitleSettingFrame@", "[setPickerListener]", "no Spoken Languages!");
        } else {
            this.f159044a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$SubtitleSettingFrame$XLnxDkYt8uoOhI7obuyIdP24BlI */

                public final void onClick(View view) {
                    SubtitleSettingFrame.lambda$XLnxDkYt8uoOhI7obuyIdP24BlI(SubtitleSettingFrame.this, view);
                }
            });
        }
        String[] strArr2 = this.f159056m;
        if (strArr2 == null || strArr2.length == 0) {
            C60700b.m235851b("SubtitleSettingFrame@", "[setPickerListener3]", "no Subtitle Languages!");
        } else {
            this.f159045b.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$SubtitleSettingFrame$ogTRhx8Jb1zzdDtbarlYc3QyxQ */

                public final void onClick(View view) {
                    SubtitleSettingFrame.m271415lambda$ogTRhx8Jb1zzdDtbarlYc3QyxQ(SubtitleSettingFrame.this, view);
                }
            });
        }
    }

    private String getSystemLanguage() {
        Locale locale = getResources().getConfiguration().locale;
        return (locale.getLanguage() + "_" + locale.getCountry()).toLowerCase();
    }

    /* renamed from: g */
    private void m247178g() {
        VideoChatConfig j = VideoChatManager.m249444a().mo220132j();
        if (j != null) {
            if (j.getSpokenLanguages() == null || j.getSpokenLanguages().size() <= 0) {
                C60700b.m235851b("SubtitleSettingFrame@", "[initTranslateConfig]", "Can not get Spoken Languages!");
            } else {
                C60942l lVar = new C60942l();
                lVar.f152506a = "default";
                lVar.f152507b = getResources().getString(R.string.View_G_SubtitlesAutomatic);
                this.f159060q.add(lVar);
                this.f159060q.addAll(j.getSpokenLanguages());
                this.f159055l = m247169a(this.f159060q);
            }
            C60942l lVar2 = new C60942l();
            lVar2.f152506a = ShareHitPoint.f121868c;
            lVar2.f152507b = getResources().getString(R.string.View_G_DontTranslate);
            if (j.getSubtitleLanguages() == null || j.getSubtitleLanguages().size() <= 0) {
                C60700b.m235851b("SubtitleSettingFrame@", "[initTranslateConfig2]", "Can not get Subtitle Languages!");
                return;
            }
            this.f159061r.add(lVar2);
            this.f159061r.addAll(j.getSubtitleLanguages());
            this.f159056m = m247169a(this.f159061r);
            return;
        }
        C60700b.m235851b("SubtitleSettingFrame@", "[initTranslateConfig3]", "VideoChatConfig is NULL!!!");
    }

    public void setParentDialog(AbstractC61222a aVar) {
        this.f159051h = aVar;
    }

    public SubtitleSettingFrame(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private String[] m247169a(List<C60942l> list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C60942l lVar = list.get(i);
            strArr[i] = lVar.f152507b;
            if (!lVar.f152506a.equals("default")) {
                this.f159062s.add(lVar.f152506a);
            }
        }
        return strArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m247166a(int i) {
        String str = this.f159056m[i];
        this.f159047d.setText(str);
        String str2 = this.f159054k;
        String a = m247165a(this.f159061r, str);
        this.f159054k = a;
        m247168a((String) null, a);
        this.f159058o = m247174b(this.f159054k);
        m247175d();
        C61303k kVar = this.f159050g;
        if (kVar != null) {
            C63751by.m250227a(2, null, this.f159054k, str2, kVar.mo212056e());
            MeetingSettingEvent2.m249883a().mo220350a(this.f159050g, "translate_language", "subtitle", this.f159054k, (String) null);
        }
        C60700b.m235851b("SubtitleSettingFrame@", "[setPickerListener4]", "Pick Subtitle Language: " + this.f159056m[i]);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m247172b(int i) {
        String str = this.f159055l[i];
        this.f159046c.setText(str);
        String str2 = this.f159053j;
        String a = m247165a(this.f159060q, str);
        this.f159053j = a;
        m247168a(a, (String) null);
        this.f159057n = m247174b(this.f159053j);
        m247175d();
        C61303k kVar = this.f159050g;
        if (kVar != null) {
            C63751by.m250227a(1, null, this.f159053j, str2, kVar.mo212056e());
            MeetingSettingEvent2.m249883a().mo220350a(this.f159050g, "speak_language", "subtitle", this.f159053j, (String) null);
        }
        C60700b.m235851b("SubtitleSettingFrame@", "[setPickerListener2]", "Pick Spoken Language: " + this.f159055l[i]);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m247167a(View view) {
        float f;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f159056m) {
            arrayList.add(new UDBaseListDialogBuilder.ListItem(new UDBaseListDialogBuilder.ListItemBuilder(str)));
        }
        UDActionPanelBuilder aVar = (UDActionPanelBuilder) new UDActionPanelBuilder(getContext()).mo90873b(arrayList);
        if (UDUiModeUtils.m93320a(getContext().getResources().getConfiguration())) {
            f = 0.7f;
        } else {
            f = 0.4f;
        }
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.maskAlpha(f)).mo90869a(new UDListDialogController.OnItemClickListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$SubtitleSettingFrame$0H_y1LRePBvobe5PpYw8bSBmaDU */

            @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
            public final void onItemClick(int i) {
                SubtitleSettingFrame.lambda$0H_y1LRePBvobe5PpYw8bSBmaDU(SubtitleSettingFrame.this, i);
            }
        })).addActionButton(R.id.ud_dialog_btn_cancel, R.string.View_G_CancelButton, (DialogInterface.OnClickListener) null)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m247173b(View view) {
        float f;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f159055l) {
            arrayList.add(new UDBaseListDialogBuilder.ListItem(new UDBaseListDialogBuilder.ListItemBuilder(str)));
        }
        UDActionPanelBuilder aVar = (UDActionPanelBuilder) new UDActionPanelBuilder(getContext()).mo90873b(arrayList);
        if (UDUiModeUtils.m93320a(getContext().getResources().getConfiguration())) {
            f = 0.7f;
        } else {
            f = 0.4f;
        }
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.maskAlpha(f)).mo90869a(new UDListDialogController.OnItemClickListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$SubtitleSettingFrame$vdgj1AZ_p5Hi6GS2fmvgzSnGFK8 */

            @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
            public final void onItemClick(int i) {
                SubtitleSettingFrame.lambda$vdgj1AZ_p5Hi6GS2fmvgzSnGFK8(SubtitleSettingFrame.this, i);
            }
        })).addActionButton(R.id.ud_dialog_btn_cancel, R.string.View_G_CancelButton, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: b */
    private boolean m247174b(String str) {
        if (str.equals("default")) {
            return !this.f159062s.contains(getSystemLanguage());
        }
        return !this.f159062s.contains(str);
    }

    /* renamed from: a */
    public void mo218541a(String str) {
        this.f159053j = str;
        TextView textView = this.f159046c;
        if (textView != null) {
            textView.setText(m247170b(this.f159060q, str));
        }
    }

    public SubtitleSettingFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m247168a(final String str, final String str2) {
        VcBizSender.m249187a(this.f159052i, str, str2, (Boolean) null).mo219893b(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.subtitle.SubtitleSettingFrame.C631192 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("SubtitleSettingFrame@", "[sendSubtitleSettings2]", "onError " + eVar.toString());
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                C60700b.m235851b("SubtitleSettingFrame@", "[sendSubtitleSettings]", "onSuccess subtitleChangeSettings: SpokenLanguage-" + str + ", Subtitle-" + str2);
            }
        });
    }

    /* renamed from: a */
    private String m247165a(List<C60942l> list, String str) {
        if (list == null) {
            return "";
        }
        for (C60942l lVar : list) {
            if (lVar.f152507b.equals(str)) {
                return lVar.f152506a;
            }
        }
        return "";
    }

    /* renamed from: b */
    private String m247170b(List<C60942l> list, String str) {
        if (list == null) {
            return "";
        }
        for (C60942l lVar : list) {
            if (lVar.f152506a.equals(str)) {
                return lVar.f152507b;
            }
        }
        return "";
    }

    /* renamed from: a */
    public void mo218542a(boolean z, boolean z2) {
        if (z) {
            mo218538a();
        }
    }

    public SubtitleSettingFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f159060q = new ArrayList();
        this.f159061r = new ArrayList();
        this.f159062s = new HashSet();
    }

    /* renamed from: a */
    public void mo218539a(C61303k kVar, String str, String str2, String str3) {
        mo218540a(kVar, str, str2, false, str3);
    }

    /* renamed from: a */
    public void mo218540a(C61303k kVar, String str, String str2, boolean z, String str3) {
        this.f159050g = kVar;
        this.f159052i = kVar.mo212055d();
        this.f159053j = str;
        this.f159054k = str2;
        this.f159059p = z;
        m247178g();
        m247171b();
        LayoutInflater.from(getContext()).inflate(R.layout.subtitle_setting, (ViewGroup) this, true);
        this.f159044a = (ViewGroup) findViewById(R.id.spoken_lang_picker);
        this.f159045b = (ViewGroup) findViewById(R.id.subtitle_lang_picker);
        this.f159046c = (TextView) findViewById(R.id.tv_spoken_lang_text);
        this.f159047d = (TextView) findViewById(R.id.tv_subtitle_lang_text);
        this.f159048e = (TextView) findViewById(R.id.tv_language_not_supported);
        this.f159057n = m247174b(str);
        this.f159058o = m247174b(this.f159054k);
        m247175d();
        m247176e();
        this.f159046c.setText(m247170b(this.f159060q, str));
        this.f159047d.setText(m247170b(this.f159061r, this.f159054k));
        findViewById(R.id.close).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.SubtitleSettingFrame.C631181 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                SubtitleSettingFrame.this.mo218538a();
            }
        });
        this.f159049f = (ViewGroup) findViewById(R.id.subtitle_his_header);
        m247177f();
        C61303k kVar2 = this.f159050g;
        if (kVar2 != null) {
            C63751by.m250227a(0, str3, this.f159053j, this.f159054k, kVar2.mo212056e());
        }
        mo218542a(C60776r.m236143a(C60773o.m236124b(getContext())), false);
    }
}
