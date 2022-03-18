package com.ss.android.vc.meeting.module.preview.interview;

import android.os.Bundle;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.preview.AbstractC62684c;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.statistics.event.bq;
import java.util.HashMap;
import java.util.Map;

public class MeetingPreviewInterviewFragment extends AbstractC62684c<C62753c> {

    /* renamed from: f */
    static Map<String, String> f157889f = new HashMap();

    /* renamed from: g */
    private String f157890g;

    /* renamed from: h */
    private String f157891h;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: e */
    public String mo216564e() {
        return "面试";
    }

    public enum InterviewerType {
        INTERVIEWER("tndfsgb5"),
        INTERVIEWEE("6wk88xnu");
        
        private final String type;

        public String getType() {
            return this.type;
        }

        private InterviewerType(String str) {
            this.type = str;
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: a */
    public String mo216561a() {
        return this.f157890g;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: d */
    public void mo216563d() {
        bq.m250209b(this.f157890g, this.f157736c);
    }

    /* renamed from: b */
    public static String m245556b(String str) {
        return f157889f.get(str);
    }

    /* renamed from: a */
    public static boolean m245555a(String str) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(f157889f.get(str));
        if (kVar == null || !kVar.mo212065n()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: a */
    public boolean mo216587a(Bundle bundle) {
        if (!super.mo216587a(bundle)) {
            return false;
        }
        if (this.f157734a != 4) {
            return true;
        }
        this.f157890g = bundle.getString("param_interview_id");
        this.f157891h = bundle.getString("param_interview_role");
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62753c mo216560a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62753c(baseFragment, hVar, this.f157890g, this.f157891h);
    }
}
