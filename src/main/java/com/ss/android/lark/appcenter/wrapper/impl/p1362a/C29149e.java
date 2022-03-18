package com.ss.android.lark.appcenter.wrapper.impl.p1362a;

import com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.a.e */
public class C29149e implements AbstractC27537d {

    /* renamed from: a */
    private static final List<AbstractC27537d.AbstractC27538a> f72970a = new ArrayList();

    /* renamed from: b */
    private static final List<AbstractC27537d.AbstractC27539b> f72971b = new ArrayList();

    /* renamed from: a */
    public static List<AbstractC27537d.AbstractC27538a> m107167a() {
        return f72970a;
    }

    /* renamed from: b */
    public static List<AbstractC27537d.AbstractC27539b> m107168b() {
        return f72971b;
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d
    /* renamed from: b */
    public void mo98176b(AbstractC27537d.AbstractC27538a aVar) {
        f72970a.remove(aVar);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d
    /* renamed from: a */
    public void mo98174a(AbstractC27537d.AbstractC27538a aVar) {
        List<AbstractC27537d.AbstractC27538a> list = f72970a;
        if (!list.contains(aVar)) {
            list.add(aVar);
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d
    /* renamed from: b */
    public void mo98177b(AbstractC27537d.AbstractC27539b bVar) {
        f72971b.remove(bVar);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d
    /* renamed from: a */
    public void mo98175a(AbstractC27537d.AbstractC27539b bVar) {
        List<AbstractC27537d.AbstractC27539b> list = f72971b;
        if (!list.contains(bVar)) {
            list.add(bVar);
        }
    }
}
