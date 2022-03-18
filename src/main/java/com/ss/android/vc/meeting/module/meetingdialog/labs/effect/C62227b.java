package com.ss.android.vc.meeting.module.meetingdialog.labs.effect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.effect.b */
public class C62227b {

    /* renamed from: a */
    final Map<String, List<EffectModel>> f156336a = new HashMap();

    /* renamed from: a */
    public List<EffectModel> mo215291a() {
        return mo215292a("default_online335-980");
    }

    /* renamed from: b */
    public List<EffectModel> mo215294b() {
        return mo215292a("vc-beautyandfilter_beauty");
    }

    /* renamed from: d */
    public List<EffectModel> mo215296d() {
        return mo215292a("vc-beautyandfilter_normalfilter");
    }

    /* renamed from: e */
    public List<EffectModel> mo215297e() {
        return mo215292a("vc-beautyandfilter_beautyfilter");
    }

    /* renamed from: f */
    public synchronized void mo215298f() {
        this.f156336a.clear();
    }

    /* renamed from: c */
    public List<EffectModel> mo215295c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(mo215292a("vc-beautyandfilter_beautyfilter"));
        arrayList.addAll(mo215292a("vc-beautyandfilter_normalfilter"));
        return arrayList;
    }

    /* renamed from: a */
    public synchronized List<EffectModel> mo215292a(String str) {
        return this.f156336a.get(str);
    }

    /* renamed from: a */
    public synchronized void mo215293a(String str, List<EffectModel> list) {
        this.f156336a.put(str, list);
    }
}
