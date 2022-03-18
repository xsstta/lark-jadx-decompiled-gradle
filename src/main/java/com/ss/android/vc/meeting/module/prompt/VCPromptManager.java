package com.ss.android.vc.meeting.module.prompt;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChatPrompt;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XSingleton;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@XClass(isSingleton = true)
public class VCPromptManager {

    /* renamed from: a */
    private Map<VideoChatPrompt.Type, AbstractC62781a> f157944a;

    /* renamed from: b */
    private boolean f157945b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.prompt.VCPromptManager$a */
    public static class C62780a {

        /* renamed from: a */
        public static final VCPromptManager f157946a = new VCPromptManager();
    }

    @XSingleton
    /* renamed from: a */
    public static VCPromptManager m245671a() {
        return C62780a.f157946a;
    }

    private VCPromptManager() {
        this.f157945b = true;
        HashMap hashMap = new HashMap();
        this.f157944a = hashMap;
        hashMap.put(VideoChatPrompt.Type.CALENDAR_START, new CalendarPromptDisplayer());
    }

    /* renamed from: a */
    public VideoChatPrompt.CalendarStartPrompt mo216814a(String str) {
        AbstractC62781a aVar = this.f157944a.get(VideoChatPrompt.Type.CALENDAR_START);
        if (aVar == null) {
            return null;
        }
        return ((CalendarPromptDisplayer) aVar).mo216798a(str);
    }

    /* renamed from: b */
    public void mo216815b(String str) {
        C60700b.m235851b("PromptLog_VCPromptManager", "[notifyCalendarDetailShow]", "promptId = " + str);
        AbstractC62781a aVar = this.f157944a.get(VideoChatPrompt.Type.CALENDAR_START);
        if (aVar != null) {
            ((CalendarPromptDisplayer) aVar).mo216802b(str);
        }
    }

    @XMethod
    public void receivePromptFromRegisterClientInfo(List<VideoChatPrompt> list) {
        AbstractC62781a aVar = this.f157944a.get(VideoChatPrompt.Type.CALENDAR_START);
        if (aVar != null) {
            if (list == null || list.size() == 0) {
                ((CalendarPromptDisplayer) aVar).mo216799a();
            } else {
                ((CalendarPromptDisplayer) aVar).mo216805b(list);
            }
        }
    }

    @XMethod
    public void receivePrompt(VideoChatPrompt videoChatPrompt) {
        if (videoChatPrompt != null) {
            C60700b.m235851b("PromptLog_VCPromptManager", "[receivePrompt]", "id = " + videoChatPrompt.promptId + ", Type = " + videoChatPrompt.type + ", Action = " + videoChatPrompt.action);
            AbstractC62781a aVar = this.f157944a.get(videoChatPrompt.type);
            if (aVar == null) {
                C60700b.m235851b("PromptLog_VCPromptManager", "[receivePrompt2]", "prompt type not register displayer");
            } else if (videoChatPrompt.type == VideoChatPrompt.Type.CALENDAR_START && this.f157945b) {
                if (videoChatPrompt.action == VideoChatPrompt.Action.SHOW) {
                    aVar.mo216804b(videoChatPrompt.promptId, videoChatPrompt.calendarStartPrompt);
                } else if (videoChatPrompt.action == VideoChatPrompt.Action.DISMISS) {
                    aVar.mo216801a(videoChatPrompt.promptId, videoChatPrompt.calendarStartPrompt);
                }
            }
        }
    }
}
