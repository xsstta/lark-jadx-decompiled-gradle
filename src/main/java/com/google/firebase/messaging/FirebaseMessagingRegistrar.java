package com.google.firebase.messaging;

import com.google.android.datatransport.AbstractC21350c;
import com.google.android.datatransport.AbstractC21392d;
import com.google.android.datatransport.AbstractC21393e;
import com.google.android.datatransport.AbstractC21394f;
import com.google.android.datatransport.C21349b;
import com.google.android.datatransport.cct.C21351a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.AbstractC22860h;
import com.google.firebase.platforminfo.AbstractC22923g;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

public class FirebaseMessagingRegistrar implements ComponentRegistrar {

    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$a */
    private static class C22886a<T> implements AbstractC21393e<T> {
        @Override // com.google.android.datatransport.AbstractC21393e
        /* renamed from: a */
        public void mo72600a(AbstractC21350c<T> cVar) {
        }

        private C22886a() {
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(FirebaseMessaging.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(FirebaseInstanceId.class)).add(Dependency.required(AbstractC22923g.class)).add(Dependency.required(HeartBeatInfo.class)).add(Dependency.optional(AbstractC21394f.class)).add(Dependency.required(AbstractC22860h.class)).factory(C22898h.f56605a).alwaysEager().build(), LibraryVersionComponent.create("fire-fcm", "20.2.3"));
    }

    static AbstractC21394f determineFactory(AbstractC21394f fVar) {
        if (fVar == null || !C21351a.f51906d.mo72506c().contains(C21349b.m77288a("json"))) {
            return new C22887b();
        }
        return fVar;
    }

    static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(ComponentContainer componentContainer) {
        return new FirebaseMessaging((FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseInstanceId) componentContainer.get(FirebaseInstanceId.class), (AbstractC22923g) componentContainer.get(AbstractC22923g.class), (HeartBeatInfo) componentContainer.get(HeartBeatInfo.class), (AbstractC22860h) componentContainer.get(AbstractC22860h.class), determineFactory((AbstractC21394f) componentContainer.get(AbstractC21394f.class)));
    }

    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$b */
    public static class C22887b implements AbstractC21394f {
        @Override // com.google.android.datatransport.AbstractC21394f
        /* renamed from: a */
        public <T> AbstractC21393e<T> mo72602a(String str, Class<T> cls, AbstractC21392d<T, byte[]> dVar) {
            return new C22886a();
        }

        @Override // com.google.android.datatransport.AbstractC21394f
        /* renamed from: a */
        public <T> AbstractC21393e<T> mo72601a(String str, Class<T> cls, C21349b bVar, AbstractC21392d<T, byte[]> dVar) {
            return new C22886a();
        }
    }
}
