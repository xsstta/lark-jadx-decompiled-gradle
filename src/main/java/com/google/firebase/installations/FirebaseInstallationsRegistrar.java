package com.google.firebase.installations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.platforminfo.AbstractC22923g;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(AbstractC22860h.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(HeartBeatInfo.class)).add(Dependency.required(AbstractC22923g.class)).factory(C22861i.m83005a()).build(), LibraryVersionComponent.create("fire-installations", "16.3.2"));
    }

    static /* synthetic */ AbstractC22860h lambda$getComponents$0(ComponentContainer componentContainer) {
        return new C22853c((FirebaseApp) componentContainer.get(FirebaseApp.class), (AbstractC22923g) componentContainer.get(AbstractC22923g.class), (HeartBeatInfo) componentContainer.get(HeartBeatInfo.class));
    }
}
