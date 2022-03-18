package com.lark.falcon.engine.inspect;

import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.lark.falcon.engine.inspect.p1062a.C24008c;
import com.lark.falcon.engine.inspect.p1062a.p1063a.C23979a;
import com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC24000g;
import com.lark.falcon.engine.inspect.p1062a.p1064b.C24002i;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class InspectorClient implements AbstractC24012c {

    /* renamed from: a */
    private static volatile C24008c f59318a;

    /* renamed from: b */
    private volatile AbstractC24000g f59319b;

    /* renamed from: c */
    private String f59320c;

    /* renamed from: d */
    private AndroidFalconShellHolder f59321d;

    /* renamed from: e */
    private final String f59322e;

    /* renamed from: f */
    private final C23979a f59323f;

    /* renamed from: g */
    private final C24002i f59324g;

    /* renamed from: h */
    private final List<AbstractC24012c> f59325h;

    /* renamed from: a */
    public String mo86110a() {
        return this.f59320c;
    }

    /* renamed from: b */
    public String mo86114b() {
        return this.f59322e;
    }

    /* renamed from: c */
    public C23979a mo86115c() {
        return this.f59323f;
    }

    /* renamed from: d */
    public C24002i mo86116d() {
        return this.f59324g;
    }

    /* renamed from: e */
    public void mo86117e() {
        f59318a.mo86177b(this);
    }

    public int hashCode() {
        return Objects.hash(this.f59320c, this.f59322e);
    }

    /* renamed from: a */
    public void mo86111a(AndroidFalconShellHolder androidFalconShellHolder) {
        this.f59321d = androidFalconShellHolder;
    }

    /* renamed from: a */
    public void mo86112a(AbstractC24012c cVar) {
        this.f59325h.add(cVar);
    }

    public void sendResponse(String str) {
        if (this.f59319b != null) {
            this.f59319b.mo86163a(str);
        }
    }

    @Override // com.lark.falcon.engine.inspect.AbstractC24012c
    /* renamed from: a */
    public void mo48000a(AbstractC24000g gVar) {
        this.f59319b = gVar;
        for (AbstractC24012c cVar : this.f59325h) {
            cVar.mo48000a(gVar);
        }
        this.f59321d.mo86094e();
    }

    @Override // com.lark.falcon.engine.inspect.AbstractC24012c
    /* renamed from: b */
    public void mo48003b(AbstractC24000g gVar) {
        this.f59319b = null;
        this.f59321d.mo86095f();
        for (AbstractC24012c cVar : this.f59325h) {
            cVar.mo48003b(gVar);
        }
    }

    /* renamed from: a */
    public void mo86113a(String str) {
        this.f59320c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InspectorClient inspectorClient = (InspectorClient) obj;
        if (!Objects.equals(this.f59320c, inspectorClient.f59320c) || !Objects.equals(this.f59322e, inspectorClient.f59322e)) {
            return false;
        }
        return true;
    }

    public InspectorClient(AndroidFalconShellHolder androidFalconShellHolder) {
        if (f59318a == null) {
            f59318a = new C24008c();
            f59318a.mo86175a();
        }
        this.f59325h = new LinkedList();
        this.f59320c = "JS Engine";
        String str = "/inspector/" + androidFalconShellHolder.mo86088b();
        this.f59322e = str;
        this.f59321d = androidFalconShellHolder;
        this.f59323f = new C23979a(str);
        this.f59324g = new C24002i(new C23977a(this));
        f59318a.mo86176a(this);
    }

    @Override // com.lark.falcon.engine.inspect.AbstractC24012c
    /* renamed from: a */
    public boolean mo48002a(AbstractC24000g gVar, String str) {
        for (AbstractC24012c cVar : this.f59325h) {
            if (cVar.mo48002a(gVar, str)) {
                return true;
            }
        }
        this.f59321d.mo86085a(str);
        return false;
    }
}
