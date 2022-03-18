package com.ss.android.vc.meeting.framework.manager;

import android.text.TextUtils;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61313n;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import com.ss.android.vc.trace.C63784a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.framework.manager.a */
public class C61269a implements AbstractC61284a {

    /* renamed from: a */
    private final Map<String, AbstractC61294b> f153500a = new LinkedHashMap();

    /* renamed from: b */
    private final C61281d f153501b;

    /* renamed from: c */
    private final List<IMeetingsSizeChangeListener> f153502c = new CopyOnWriteArrayList();

    /* renamed from: a */
    public synchronized boolean mo211916a() {
        m238373d("[isEmpty]");
        return this.f153500a.isEmpty();
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: c */
    public synchronized List<AbstractC61294b> mo211922c() {
        ArrayList arrayList;
        m238373d("[getAllMeetings]");
        arrayList = new ArrayList();
        if (!mo211916a()) {
            arrayList.addAll(this.f153500a.values());
        }
        return arrayList;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: d */
    public synchronized boolean mo211923d() {
        if (mo211916a()) {
            return false;
        }
        for (AbstractC61294b bVar : mo211922c()) {
            if (bVar.mo212064m()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: e */
    public synchronized boolean mo211924e() {
        if (mo211916a()) {
            return false;
        }
        for (AbstractC61294b bVar : mo211922c()) {
            if (bVar.mo212063l()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: f */
    public boolean mo211925f() {
        if (mo211916a()) {
            return false;
        }
        for (AbstractC61294b bVar : mo211922c()) {
            if (bVar.mo212066o()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: g */
    public synchronized boolean mo211926g() {
        if (mo211916a()) {
            return false;
        }
        for (AbstractC61294b bVar : mo211922c()) {
            if (bVar.mo212065n()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: h */
    public synchronized AbstractC61294b mo211927h() {
        if (mo211916a()) {
            return null;
        }
        for (AbstractC61294b bVar : mo211922c()) {
            if (bVar.mo212065n()) {
                return bVar;
            }
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: i */
    public AbstractC61294b mo211928i() {
        if (mo211916a()) {
            return null;
        }
        for (AbstractC61294b bVar : mo211922c()) {
            if (bVar.mo212066o()) {
                return bVar;
            }
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: b */
    public synchronized AbstractC61294b mo211918b() {
        AbstractC61294b bVar;
        String str;
        m238373d("[getCurrent]");
        bVar = null;
        if (this.f153500a.size() > 0) {
            bVar = this.f153500a.entrySet().iterator().next().getValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[getCurrent] meeting = ");
        if (bVar == null) {
            str = "null";
        } else {
            str = "not null";
        }
        sb.append(str);
        C60871a.m236609a("ActiveMeetingOperater", sb.toString());
        m238373d("[getCurrent]");
        return bVar;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: j */
    public synchronized boolean mo211929j() {
        if (mo211916a()) {
            C60871a.m236609a("ActiveMeetingOperater", "[isCurrentMeetingsEnd] return true , because mActiveMeetingOperater is empty");
            return true;
        }
        for (AbstractC61294b bVar : mo211922c()) {
            if (!bVar.mo212062k()) {
                C60871a.m236609a("ActiveMeetingOperater", "[isCurrentMeetingsEnd] return false , because the meeting is not idle : " + bVar.mo212054c());
                return false;
            }
        }
        C60871a.m236609a("ActiveMeetingOperater", "[isCurrentMeetingsEnd] return true");
        return true;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: b */
    public void mo211919b(IMeetingsSizeChangeListener iMeetingsSizeChangeListener) {
        if (iMeetingsSizeChangeListener != null) {
            this.f153502c.remove(iMeetingsSizeChangeListener);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: a */
    public void mo211914a(IMeetingsSizeChangeListener iMeetingsSizeChangeListener) {
        if (!this.f153502c.contains(iMeetingsSizeChangeListener)) {
            this.f153502c.add(iMeetingsSizeChangeListener);
        }
    }

    C61269a(C61281d dVar) {
        this.f153501b = dVar;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: b */
    public synchronized boolean mo211920b(String str) {
        m238373d("[containsKey] creatingId=" + str);
        return this.f153500a.containsKey(str);
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: c */
    public synchronized AbstractC61294b mo211921c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f153500a.containsKey(str)) {
            return this.f153500a.get(str);
        }
        String a = this.f153501b.mo211936a(str);
        if (TextUtils.isEmpty(a) || !this.f153500a.containsKey(a)) {
            return null;
        }
        return this.f153500a.get(a);
    }

    /* renamed from: d */
    private synchronized void m238373d(String str) {
        Set<String> keySet = this.f153500a.keySet();
        StringBuilder sb = new StringBuilder();
        if (keySet != null) {
            for (String str2 : keySet) {
                sb.append(str2);
                sb.append(" , ");
            }
        }
        C60871a.m236609a("ActiveMeetingOperater", str + " allIds =  {" + sb.toString() + "}");
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: a */
    public void mo211915a(String str) {
        String str2;
        m238373d("[remove] before:");
        synchronized (this) {
            AbstractC61294b remove = this.f153500a.remove(str);
            StringBuilder sb = new StringBuilder();
            sb.append("[remove] result is");
            if (remove != null) {
                str2 = "success";
            } else {
                str2 = "fail";
            }
            sb.append(str2);
            C60871a.m236609a("ActiveMeetingOperater", sb.toString());
        }
        m238373d("[remove] after:");
        List<AbstractC61294b> c = mo211922c();
        int size = c.size();
        for (IMeetingsSizeChangeListener iMeetingsSizeChangeListener : this.f153502c) {
            iMeetingsSizeChangeListener.mo208172a(c);
            if (size == 0) {
                iMeetingsSizeChangeListener.onMeetingsEnd();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: a */
    public AbstractC61294b mo211913a(C61344j jVar) {
        if (jVar == null || jVar.f153704b == null) {
            C60871a.m236609a("ActiveMeetingOperater", "[createMeetingAndAdd] meeting init params is null");
            return null;
        }
        C63784a.m250428a("[VideoChat_ActiveMeetingOperator_createMeetingAndAdd]");
        m238373d("[createMeetingAndAdd] before:");
        AbstractC61294b a = C61313n.m238718a(jVar.f153704b);
        C63784a.m250428a("[VideoChat_ActiveMeetingOperator_start]");
        a.mo212042a();
        C63784a.m250429b("[VideoChat_ActiveMeetingOperator_start]");
        C60871a.m236609a("ActiveMeetingOperater", "[createMeetingAndAdd] " + a.mo212054c() + " , " + a.mo212057f());
        synchronized (this) {
            this.f153500a.put(a.mo212054c(), a);
        }
        m238373d("[createMeetingAndAdd] after:");
        C63784a.m250428a("[VideoChat_ActiveMeetingOperator_createMeetingAndAdd_sizechanged]");
        List<AbstractC61294b> c = mo211922c();
        int size = c.size();
        for (IMeetingsSizeChangeListener iMeetingsSizeChangeListener : this.f153502c) {
            iMeetingsSizeChangeListener.mo208172a(c);
            if (size == 1) {
                iMeetingsSizeChangeListener.onMeetingsBegin(a.mo212071t());
            }
        }
        C63784a.m250429b("[VideoChat_ActiveMeetingOperator_createMeetingAndAdd_sizechanged]");
        C63784a.m250429b("[VideoChat_ActiveMeetingOperator_createMeetingAndAdd]");
        return a;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a
    /* renamed from: a */
    public synchronized boolean mo211917a(boolean z) {
        boolean z2;
        if (mo211916a()) {
            C60871a.m236609a("ActiveMeetingOperater", "[hasMeetingOngoing] return false , because mActiveMeetingOperater is empty");
            return false;
        }
        for (AbstractC61294b bVar : mo211922c()) {
            if (bVar.mo212063l() || bVar.mo212064m() || bVar.mo212065n()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2 || bVar.mo212066o()) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
            }
            if (z2) {
                C60871a.m236609a("ActiveMeetingOperater", "[hasMeetingOngoing] return true , because the meeting is not idle : " + bVar.mo212054c());
                return true;
            }
        }
        C60871a.m236609a("ActiveMeetingOperater", "[hasMeetingOngoing] return false");
        return false;
    }
}
