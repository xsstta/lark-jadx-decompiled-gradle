package com.ss.android.lark.chat.chatwindow.chat.model;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.p1660e.C33974e;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.utils.UIHelper;
import java.util.Date;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.h */
public class C33412h implements C33955c.AbstractC33956a<ChatMessageVO> {

    /* renamed from: a */
    private int f86037a;

    /* renamed from: b */
    private boolean f86038b = true;

    /* renamed from: c */
    private boolean f86039c;

    /* renamed from: d */
    private boolean f86040d = C29990c.m110930b().mo134586n().mo134685a("messenger.message_inputbox_redesign");

    public C33412h(int i) {
        this.f86037a = i;
    }

    /* renamed from: a */
    private boolean m129461a(ChatMessageVO cVar) {
        if (cVar.mo121710r() != Message.Type.SYSTEM || cVar.mo121699g() == null || !(cVar.mo121699g().mo126168z() instanceof SystemContent)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private String m129463b(long j) {
        Options aVar = new Options();
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191603d(true);
        return TimeFormatUtils.m219289e(UIHelper.getContext(), new Date(j), aVar);
    }

    /* renamed from: a */
    private String m129460a(long j) {
        Options aVar = new Options();
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191593a(LengthType.LONG);
        aVar.mo191599b(!C29990c.m110930b().mo134524W().mo134469a());
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191603d(true);
        return TimeFormatUtils.m219292g(UIHelper.getContext(), new Date(j), aVar);
    }

    /* renamed from: a */
    private C33974e m129459a(ChatMessageVO cVar, boolean z, boolean z2) {
        C33974e eVar = new C33974e(cVar.mo121716x() * 1000, z, z2);
        if (eVar.mo124306a() > 0) {
            eVar.mo124309b(m129460a(eVar.mo124306a()));
        }
        if (z) {
            eVar.mo124307a(m129463b(eVar.mo124306a()));
        }
        return eVar;
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: b */
    public void mo122970b(List<ChatMessageVO> list, int i, int i2) {
        ChatMessageVO cVar;
        for (int max = Math.max(0, i - 1); max < list.size(); max++) {
            int i3 = max - 1;
            if (i3 < 0) {
                cVar = null;
            } else {
                cVar = list.get(i3);
            }
            ChatMessageVO cVar2 = list.get(max);
            boolean z = true;
            if (max != list.size() - 1) {
                z = false;
            }
            if (m129462a(cVar, cVar2, z) && max > i + i2) {
                return;
            }
        }
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: c */
    public void mo122971c(List<ChatMessageVO> list, int i, int i2) {
        ChatMessageVO cVar;
        for (int max = Math.max(0, i - 1); max < list.size(); max++) {
            int i3 = max - 1;
            if (i3 < 0) {
                cVar = null;
            } else {
                cVar = list.get(i3);
            }
            ChatMessageVO cVar2 = list.get(max);
            boolean z = true;
            if (max != list.size() - 1) {
                z = false;
            }
            if (m129462a(cVar, cVar2, z) && max > i + i2) {
                return;
            }
        }
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: a */
    public void mo122969a(List<ChatMessageVO> list, int i, int i2) {
        ChatMessageVO cVar;
        boolean z;
        boolean z2;
        if (this.f86038b) {
            if (this.f86037a <= list.get(list.size() - 1).mo121718z()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f86039c = z2;
        }
        this.f86038b = false;
        for (int max = Math.max(0, i - 1); max < list.size(); max++) {
            int i3 = max - 1;
            if (i3 < 0) {
                cVar = null;
            } else {
                cVar = list.get(i3);
            }
            ChatMessageVO cVar2 = list.get(max);
            if (max == list.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (m129462a(cVar, cVar2, z) && max > i + i2) {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ac, code lost:
        if (r13.mo124248U() != r14.mo124248U()) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0101 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m129462a(com.ss.android.lark.chat.vo.ChatMessageVO r13, com.ss.android.lark.chat.vo.ChatMessageVO r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.model.C33412h.m129462a(com.ss.android.lark.chat.e.c, com.ss.android.lark.chat.e.c, boolean):boolean");
    }
}
