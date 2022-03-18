package com.ss.android.vc.meeting.framework.meeting.rtcstream;

import android.text.TextUtils;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.p3180a.C63688c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.rtcstream.d */
public class C61319d {

    /* renamed from: a */
    private Map<String, VCStream> f153638a = new HashMap();

    /* renamed from: b */
    private C61303k f153639b;

    /* renamed from: a */
    public Map<String, VCStream> mo212248a() {
        C60735ab.m236014c();
        return this.f153638a;
    }

    public C61319d(C61303k kVar) {
        this.f153639b = kVar;
    }

    /* renamed from: b */
    public void mo212250b(String str) {
        C60735ab.m236014c();
        if (!TextUtils.isEmpty(str)) {
            this.f153638a.remove(str);
        }
    }

    /* renamed from: a */
    public VCStream mo212247a(String str) {
        C60735ab.m236014c();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f153638a.get(str);
    }

    /* renamed from: a */
    public boolean mo212249a(String str, int i, boolean z, boolean z2, boolean z3) {
        C60735ab.m236014c();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        VCStream cVar = this.f153638a.get(str);
        if (cVar == null) {
            cVar = new VCStream(str, !z2, !z, i);
            this.f153638a.put(str, cVar);
            if (!z && z2) {
                return false;
            }
        } else if (cVar.mo212243d() == i && cVar.mo212241b() == (!z2) && cVar.mo212242c() == (!z)) {
            return false;
        }
        if (z2) {
            C63688c.m249675b(str);
        } else if (z3) {
            C63688c.m249674a(str, this.f153639b.mo212056e());
        } else {
            Participant a = this.f153639b.mo212091I().mo212494b().mo212588a(this.f153639b.mo212102T().mo212225d(str));
            if (a == null || a.getParticipantSettings() == null || a.getParticipantSettings().isCameraMuted() || a.getParticipantSettings().getCameraStatus() != ParticipantSettings.EquipmentStatus.NORMAL) {
                C63688c.m249675b(str);
            } else {
                C63688c.m249674a(str, this.f153639b.mo212056e());
            }
        }
        cVar.mo212239a(!z2);
        cVar.mo212240b(!z);
        cVar.mo212238a(i);
        this.f153639b.mo212165y().mo211999a(str, i, z, z2);
        return true;
    }
}
