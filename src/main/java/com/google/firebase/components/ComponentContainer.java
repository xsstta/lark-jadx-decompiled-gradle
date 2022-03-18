package com.google.firebase.components;

import com.google.firebase.p995a.AbstractC22752a;
import java.util.Set;

public interface ComponentContainer {
    <T> T get(Class<T> cls);

    <T> AbstractC22752a<T> getProvider(Class<T> cls);

    <T> Set<T> setOf(Class<T> cls);

    <T> AbstractC22752a<Set<T>> setOfProvider(Class<T> cls);
}
