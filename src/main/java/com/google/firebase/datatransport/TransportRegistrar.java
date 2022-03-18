package com.google.firebase.datatransport;

import android.content.Context;
import com.google.android.datatransport.AbstractC21394f;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import java.util.Collections;
import java.util.List;

public class TransportRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Collections.singletonList(Component.builder(AbstractC21394f.class).add(Dependency.required(Context.class)).factory(C22779a.m82768a()).build());
    }
}
