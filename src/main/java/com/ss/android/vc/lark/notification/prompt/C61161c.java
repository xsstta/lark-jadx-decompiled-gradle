package com.ss.android.vc.lark.notification.prompt;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.C60928a;
import com.ss.android.vc.entity.VideoChatPrompt;
import java.util.HashMap;

/* renamed from: com.ss.android.vc.lark.notification.prompt.c */
public class C61161c extends AbstractC48500b<CalendarPromptNotice, C60928a> {

    /* renamed from: a */
    private CalendarPromptNotice f153216a;

    /* renamed from: b */
    private VideoChatPrompt.CalendarStartPrompt f153217b;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: h */
    public int mo31131h() {
        return R.drawable.ic_notify;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: l */
    public int mo31135l() {
        return R.mipmap.app_launcher;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: m */
    public int mo31136m() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: d */
    public String mo31127d() {
        return this.f153216a.key;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AppNameRelease);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        return m237822p();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: k */
    public String mo31134k() {
        return m237822p();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: a */
    public void mo31124a() {
        CalendarPromptNotice calendarPromptNotice = (CalendarPromptNotice) mo169588o();
        this.f153216a = calendarPromptNotice;
        this.f153217b = calendarPromptNotice.getCalendarStartPrompt();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return this.f153216a.key.hashCode();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return VideoChatModuleDependency.getNotificationDependency().isVibrateOn(10005);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: n */
    public String mo31137n() {
        if (!C26326z.m95343g()) {
            return null;
        }
        return "at_v2";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        Intent videoEventInfoIntent = VideoChatModuleDependency.getDependency().getVideoEventInfoIntent(ar.m236694a(), this.f153217b.uniqueId, this.f153217b.eventStartTime);
        videoEventInfoIntent.putExtra("EXTRA_CALENDAR_PROMPT_PUSH", true);
        videoEventInfoIntent.putExtra("EXTRA_CALENDAR_PROMPT_ID", this.f153216a.key);
        return PendingIntent.getActivity(ar.m236694a(), (int) SystemClock.uptimeMillis(), videoEventInfoIntent, 134217728);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        if (!VideoChatModuleDependency.getNotificationDependency().isSoundOn(10005)) {
            return null;
        }
        return Uri.parse("android.resource://" + ar.m236694a().getPackageName() + "/" + R.raw.notification);
    }

    /* renamed from: p */
    private String m237822p() {
        VideoChatPrompt.CalendarStartPrompt calendarStartPrompt = this.f153217b;
        if (calendarStartPrompt == null || calendarStartPrompt.videoChatUser == null) {
            return C60773o.m236119a((int) R.string.View_M_YouReceivedInvite);
        }
        if (!VideoChatModuleDependency.getSettingDependency().isNotificationShowDetail(true)) {
            return C60773o.m236119a((int) R.string.View_M_YouReceivedInvite);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.f153217b.videoChatUser.getName());
        hashMap.put("title", this.f153217b.eventTitle);
        return UIHelper.mustacheFormat((int) R.string.View_M_StartedTitleName, hashMap);
    }

    /* renamed from: b */
    public C60928a mo211463b() {
        VideoChatPrompt.CalendarStartPrompt calendarStartPrompt;
        C60700b.m235851b("PromptLog_CalendarPromptNotificationDataPacker", "[buildShowUnitData]", "start");
        if (this.f153216a == null || (calendarStartPrompt = this.f153217b) == null || calendarStartPrompt.videoChatUser == null) {
            C60700b.m235864f("PromptLog_CalendarPromptNotificationDataPacker", "[buildShowUnitData]", "notice or prompt = null");
            return null;
        }
        C60928a aVar = (C60928a) mo169587a(new C60928a());
        if (VideoChatModuleDependency.getSettingDependency().isNotificationShowDetail(true)) {
            aVar.f152475a = BitmapFactory.decodeResource(ar.m236694a().getResources(), R.drawable.ic_calendar_prompt);
        }
        C60700b.m235851b("PromptLog_CalendarPromptNotificationDataPacker", "[buildShowUnitData]", "end");
        return aVar;
    }

    public C61161c(CalendarPromptNotice calendarPromptNotice) {
        super(calendarPromptNotice);
    }
}
