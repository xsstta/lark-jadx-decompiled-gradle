package com.google.firebase.iid;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.p998a.AbstractC22807a;
import com.google.firebase.installations.AbstractC22860h;
import com.google.firebase.platforminfo.AbstractC22923g;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

public final class Registrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(FirebaseInstanceId.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(Subscriber.class)).add(Dependency.required(AbstractC22923g.class)).add(Dependency.required(HeartBeatInfo.class)).add(Dependency.required(AbstractC22860h.class)).factory(C22810ac.f56380a).alwaysEager().build(), Component.builder(AbstractC22807a.class).add(Dependency.required(FirebaseInstanceId.class)).factory(C22811ad.f56381a).build(), LibraryVersionComponent.create("fire-iid", "20.2.3"));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.firebase.iid.Registrar$a */
    public static class C22805a implements AbstractC22807a {

        /* renamed from: a */
        final FirebaseInstanceId f56372a;

        public C22805a(FirebaseInstanceId firebaseInstanceId) {
            this.f56372a = firebaseInstanceId;
        }
    }

    static final /* synthetic */ AbstractC22807a lambda$getComponents$1$Registrar(ComponentContainer componentContainer) {
        return new C22805a((FirebaseInstanceId) componentContainer.get(FirebaseInstanceId.class));
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(ComponentContainer componentContainer) {
        return new FirebaseInstanceId((FirebaseApp) componentContainer.get(FirebaseApp.class), (Subscriber) componentContainer.get(Subscriber.class), (AbstractC22923g) componentContainer.get(AbstractC22923g.class), (HeartBeatInfo) componentContainer.get(HeartBeatInfo.class), (AbstractC22860h) componentContainer.get(AbstractC22860h.class));
    }
}
