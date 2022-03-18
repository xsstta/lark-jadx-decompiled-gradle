package com.ss.android.vc.meeting.module.multi.presenter;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.gridcontent.TriggerType;
import com.ss.android.vc.meeting.module.multi.presenter.MeetingPageModel;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nullable;

/* renamed from: com.ss.android.vc.meeting.module.multi.presenter.d */
public class C62527d {

    /* renamed from: a */
    private List<Participant> f157351a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private List<MeetingPageModel> f157352b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private Map<String, C62526c> f157353c = new ConcurrentHashMap();

    /* renamed from: d */
    private Map<String, MeetingPageModel> f157354d = new ConcurrentHashMap();

    /* renamed from: e */
    private C61303k f157355e;

    /* renamed from: f */
    private String f157356f;

    /* renamed from: g */
    private String f157357g;

    /* renamed from: h */
    private List<Participant> f157358h = new ArrayList();

    /* renamed from: i */
    private boolean f157359i = false;

    /* renamed from: j */
    private boolean f157360j = false;

    /* renamed from: k */
    private int f157361k = 0;

    /* renamed from: c */
    public int mo216219c() {
        return this.f157361k;
    }

    /* renamed from: d */
    public List<Participant> mo216221d() {
        return this.f157351a;
    }

    /* renamed from: b */
    public MeetingPageModel mo216216b() {
        return mo216220c(this.f157361k);
    }

    /* renamed from: f */
    public List<MeetingPageModel> mo216223f() {
        return new ArrayList(this.f157352b);
    }

    /* renamed from: g */
    private boolean m244557g() {
        if (this.f157355e.mo212091I().mo212494b().mo212600e().size() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int mo216222e() {
        if (CollectionUtils.isEmpty(this.f157352b)) {
            return 0;
        }
        return this.f157352b.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.multi.presenter.d$1 */
    public static /* synthetic */ class C625281 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157362a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.meeting.utils.ParticipantUtil$DIFF_TYPE[] r0 = com.ss.android.vc.meeting.utils.ParticipantUtil.DIFF_TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.multi.presenter.C62527d.C625281.f157362a = r0
                com.ss.android.vc.meeting.utils.ParticipantUtil$DIFF_TYPE r1 = com.ss.android.vc.meeting.utils.ParticipantUtil.DIFF_TYPE.ALL_DIFF     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.multi.presenter.C62527d.C625281.f157362a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.utils.ParticipantUtil$DIFF_TYPE r1 = com.ss.android.vc.meeting.utils.ParticipantUtil.DIFF_TYPE.STATIC_VIEW_DIFF     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.multi.presenter.C62527d.C625281.f157362a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.utils.ParticipantUtil$DIFF_TYPE r1 = com.ss.android.vc.meeting.utils.ParticipantUtil.DIFF_TYPE.SAME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.presenter.C62527d.C625281.<clinit>():void");
        }
    }

    /* renamed from: h */
    private void m244558h() {
        int i;
        this.f157352b.clear();
        this.f157353c.clear();
        this.f157354d.clear();
        int i2 = -1;
        int i3 = 0;
        while (i3 < this.f157351a.size()) {
            i2++;
            MeetingPageModel meetingPageModel = new MeetingPageModel(this.f157355e.mo212055d(), i2, MeetingPageModel.PageType.NORMAL);
            LinkedList linkedList = new LinkedList();
            int i4 = i3;
            while (true) {
                i = i3 + 4;
                if (i4 < i && i4 < this.f157351a.size()) {
                    C62526c a = C62526c.m244539a(this.f157355e, meetingPageModel, i4 - i3, this.f157351a.get(i4));
                    Participant m = a.mo216208m();
                    if (m != null && TextUtils.equals(this.f157357g, m.getRtcJoinId())) {
                        a.mo216199b(true);
                    }
                    linkedList.add(a);
                    i4++;
                }
            }
            if (linkedList.size() > 0) {
                meetingPageModel.mo216175a(linkedList);
                for (C62526c cVar : linkedList) {
                    this.f157353c.put(cVar.mo216201f(), cVar);
                }
                this.f157352b.add(meetingPageModel);
                this.f157354d.put(meetingPageModel.mo216181e(), meetingPageModel);
            }
            i3 = i;
        }
    }

    /* renamed from: a */
    public void mo216212a() {
        C61303k kVar = this.f157355e;
        if (!(kVar == null || kVar.mo212092J() == null)) {
            this.f157357g = this.f157355e.mo212092J().mo212531c();
        }
        if (TextUtils.isEmpty(this.f157357g)) {
            this.f157357g = VideoChatModuleDependency.m236629b();
        }
    }

    /* renamed from: a */
    public void mo216213a(int i) {
        this.f157361k = i;
    }

    /* renamed from: a */
    public C62526c mo216210a(String str) {
        return this.f157353c.get(str);
    }

    /* renamed from: b */
    public MeetingPageModel mo216217b(String str) {
        return this.f157354d.get(str);
    }

    /* renamed from: b */
    public void mo216218b(int i) {
        boolean z;
        for (MeetingPageModel meetingPageModel : this.f157352b) {
            if (meetingPageModel.mo216179c() == i) {
                z = true;
            } else {
                z = false;
            }
            meetingPageModel.mo216176a(z);
        }
    }

    /* renamed from: c */
    public MeetingPageModel mo216220c(int i) {
        try {
            return this.f157352b.get(i);
        } catch (Exception e) {
            C60700b.m235864f("MeetingPageManager", "[getPage]", e.toString());
            return null;
        }
    }

    /* renamed from: a */
    private ParticipantUtil.DIFF_TYPE m244553a(List<Participant> list) {
        Participant c = ParticipantUtil.m248731c(list);
        if (c == null || (c.getParticipantSettings().isCameraMuted() == this.f157360j && c.getParticipantSettings().isMicrophoneMuted() == this.f157359i)) {
            return ParticipantUtil.DIFF_TYPE.SAME;
        }
        this.f157360j = c.getParticipantSettings().isCameraMuted();
        this.f157359i = c.getParticipantSettings().isMicrophoneMuted();
        return ParticipantUtil.DIFF_TYPE.STATIC_VIEW_DIFF;
    }

    /* renamed from: b */
    private void m244555b(List<Participant> list) {
        Participant c = ParticipantUtil.m248731c(list);
        if (c != null) {
            this.f157360j = c.getParticipantSettings().isCameraMuted();
            this.f157359i = c.getParticipantSettings().isMicrophoneMuted();
            return;
        }
        C60700b.m235851b("MeetingPageManager", "[recordLocalCameraMicrophone]", "self is null");
    }

    /* renamed from: c */
    private boolean m244556c(String str) {
        if (TextUtils.isEmpty(str) || m244557g()) {
            return false;
        }
        int c = mo216219c();
        if (c >= this.f157352b.size() || this.f157352b.get(c) == null) {
            return true;
        }
        for (C62526c cVar : this.f157352b.get(c).mo216174a()) {
            if (TextUtils.equals(str, cVar.mo216208m().getRtcJoinId())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo216214a(C61303k kVar, String str) {
        this.f157355e = kVar;
        this.f157356f = str;
        this.f157359i = kVar.mo212092J().mo212505B();
        this.f157360j = this.f157355e.mo212092J().mo212504A();
        mo216212a();
    }

    /* renamed from: a */
    public ParticipantUtil.DIFF_TYPE mo216211a(List<Participant> list, boolean z, String str, TriggerType triggerType, HashSet<String> hashSet) {
        boolean z2;
        if (CollectionUtils.isEmpty(list)) {
            return ParticipantUtil.DIFF_TYPE.SAME;
        }
        if (TextUtils.isEmpty(str) || !z || TextUtils.equals(this.f157357g, str)) {
            z2 = false;
        } else {
            this.f157357g = str;
            z2 = true;
        }
        ParticipantUtil.DIFF_TYPE a = ParticipantUtil.m248705a(this.f157358h, list, this.f157356f);
        this.f157358h = new ArrayList(list);
        if (a == ParticipantUtil.DIFF_TYPE.SAME) {
            a = m244553a(list);
        }
        if (a != ParticipantUtil.DIFF_TYPE.SAME) {
            m244555b(list);
        }
        int i = C625281.f157362a[a.ordinal()];
        if (i == 1) {
            mo216215a(list, str, z, triggerType, hashSet);
        } else if (i == 2) {
            mo216215a(list, str, z, triggerType, hashSet);
        } else if (i == 3) {
            if ((z2 && m244556c(str)) || triggerType == TriggerType.INIT || (z && mo216219c() == 0 && m244556c(str))) {
                mo216215a(list, str, z, triggerType, hashSet);
                a = ParticipantUtil.DIFF_TYPE.ALL_DIFF;
            } else if (z2 && !m244556c(str)) {
                if (!TextUtils.isEmpty(str) && z) {
                    this.f157357g = str;
                }
                for (MeetingPageModel meetingPageModel : this.f157352b) {
                    for (C62526c cVar : meetingPageModel.mo216174a()) {
                        if (TextUtils.equals(cVar.mo216208m().getRtcJoinId(), this.f157357g)) {
                            cVar.mo216199b(true);
                        } else {
                            cVar.mo216199b(false);
                        }
                    }
                }
                a = ParticipantUtil.DIFF_TYPE.ALL_DIFF;
            }
        }
        if (a != ParticipantUtil.DIFF_TYPE.ALL_DIFF && triggerType == TriggerType.INIT) {
            mo216218b(mo216219c());
        }
        return a;
    }

    /* renamed from: a */
    public void mo216215a(List<Participant> list, String str, boolean z, TriggerType triggerType, HashSet<String> hashSet) {
        boolean z2;
        if (!TextUtils.isEmpty(str) && z) {
            this.f157357g = str;
        }
        Iterator<MeetingPageModel> it = this.f157352b.iterator();
        C62526c cVar = null;
        while (true) {
            z2 = true;
            if (!it.hasNext()) {
                break;
            }
            for (C62526c cVar2 : it.next().mo216174a()) {
                if (cVar2.mo216208m() == null || !TextUtils.equals(cVar2.mo216208m().getRtcJoinId(), this.f157357g)) {
                    cVar2.mo216199b(false);
                } else {
                    cVar2.mo216199b(true);
                    cVar = cVar2;
                }
            }
        }
        if (!z) {
            cVar = null;
        }
        if (this.f157355e.mo212091I().mo212494b().mo212600e().size() == 2 && list.size() == 1) {
            this.f157351a.clear();
            this.f157351a.addAll(list);
        } else {
            int c = mo216219c();
            if (c != 0) {
                z2 = false;
            }
            m244554a(list, cVar, c, triggerType, z2, hashSet);
        }
        m244558h();
        mo216218b(mo216219c());
    }

    /* renamed from: a */
    private void m244554a(List<Participant> list, C62526c cVar, int i, TriggerType triggerType, boolean z, @Nullable HashSet<String> hashSet) {
        GridSortUtil.m244531a(true, this.f157351a, list, cVar, triggerType, z, 4, i * 4, ((i + 1) * 4) - 1, ParticipantUtil.m248706a(this.f157355e.mo212091I().mo212494b().mo212605j()), hashSet);
    }
}
