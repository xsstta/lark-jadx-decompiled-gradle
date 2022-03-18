package com.ss.android.lark.image.impl.p1967g;

import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.C38825c;
import com.ss.android.lark.image.impl.PerfLoadPicHitPoint;
import com.ss.android.lark.image.impl.PerfLoadPicMonitor;
import com.ss.android.lark.log.Log;
import java.util.Locale;

/* renamed from: com.ss.android.lark.image.impl.g.b */
public class C38897b<TranscodeType> implements AbstractC38817h<Object, TranscodeType> {

    /* renamed from: a */
    private final ListenerParams f99937a;

    /* renamed from: b */
    private PerfLoadPicHitPoint f99938b;

    /* renamed from: c */
    private PerfLoadPicMonitor f99939c;

    public C38897b(ListenerParams listenerParams) {
        this.f99937a = listenerParams;
        if (listenerParams.mo105370a()) {
            PerfLoadPicHitPoint eVar = new PerfLoadPicHitPoint();
            this.f99938b = eVar;
            eVar.mo142408a(listenerParams.mo105371b());
        }
        if (this.f99939c == null) {
            this.f99939c = new PerfLoadPicMonitor();
        }
        this.f99939c.mo142413a(listenerParams);
    }

    /* renamed from: a */
    private String m153514a(Object obj) {
        if (obj instanceof AvatarImage) {
            return ((AvatarImage) obj).getImageId();
        }
        if (obj instanceof C38824b) {
            return ((C38824b) obj).mo142313a();
        }
        if (obj instanceof C38825c) {
            return ((C38825c) obj).mo142325a();
        }
        return String.valueOf(obj.hashCode());
    }

    @Override // com.ss.android.lark.image.api.AbstractC38817h
    /* renamed from: a */
    public boolean mo53861a(Exception exc, Object obj, AbstractC38819j<TranscodeType> jVar, boolean z) {
        Log.m165386e("load image failed", exc);
        if (this.f99937a.mo105377h() != null) {
            this.f99937a.mo105377h().mo105410a(exc);
        }
        this.f99939c.mo142412a(PerfLoadPicMonitor.f99921a.mo142415a(exc, obj));
        C38896a.m153513b(String.format(Locale.ROOT, "onException(%s, %s, %s, %s)", exc, obj, jVar, Boolean.valueOf(z)));
        C38896a.m153512a("Glide onException thread = " + Thread.currentThread());
        return false;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38817h
    /* renamed from: a */
    public boolean mo53862a(TranscodeType transcodetype, Object obj, AbstractC38819j<TranscodeType> jVar, DataSource dataSource, boolean z) {
        if (this.f99937a.mo105377h() != null) {
            this.f99937a.mo105377h().mo105411a(transcodetype, obj, jVar, dataSource, z);
        }
        if (this.f99937a.mo105370a()) {
            this.f99938b.mo142407a(m153514a(obj), this.f99937a.mo105372c(), this.f99937a.mo105373d());
        }
        this.f99939c.mo142411a(PerfLoadPicMonitor.f99921a.mo142414a(obj), transcodetype, dataSource);
        return false;
    }
}
