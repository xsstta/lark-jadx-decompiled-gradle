package com.bytedance.ee.bear.middleground.record;

import com.bytedance.ee.bear.middleground.record.p497a.AbstractC10116a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.record.b */
public class C10117b implements AbstractC10116a {
    @Override // com.bytedance.ee.bear.middleground.record.p497a.AbstractC10116a
    /* renamed from: a */
    public void mo38525a(String str, String str2) {
        C10115a.m42136b(str, str2);
    }

    @Override // com.bytedance.ee.bear.middleground.record.p497a.AbstractC10116a
    /* renamed from: a */
    public void mo38523a(String str, int i) {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/doc/viewhistory/activity").mo17308a("TYPE", i).mo17314a("TOKEN", str).mo17317a();
    }

    @Override // com.bytedance.ee.bear.middleground.record.p497a.AbstractC10116a
    /* renamed from: a */
    public void mo38524a(String str, int i, String str2) {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/doc/privacy/activity").mo17308a("TYPE", i).mo17314a("TOKEN", str).mo17314a("FROM", str2).mo17317a();
    }
}
