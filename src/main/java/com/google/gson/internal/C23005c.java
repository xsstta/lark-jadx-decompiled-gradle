package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.internal.p1001b.AbstractC23003b;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.google.gson.internal.c */
public final class C23005c {

    /* renamed from: a */
    private final Map<Type, InstanceCreator<?>> f56843a;

    /* renamed from: b */
    private final AbstractC23003b f56844b = AbstractC23003b.m83447a();

    public String toString() {
        return this.f56843a.toString();
    }

    public C23005c(Map<Type, InstanceCreator<?>> map) {
        this.f56843a = map;
    }

    /* renamed from: a */
    private <T> AbstractC23019g<T> m83453a(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f56844b.mo79949a(declaredConstructor);
            }
            return new AbstractC23019g<T>() {
                /* class com.google.gson.internal.C23005c.C230138 */

                @Override // com.google.gson.internal.AbstractC23019g
                /* renamed from: a */
                public T mo79953a() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (InstantiationException e) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        throw new AssertionError(e3);
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public <T> AbstractC23019g<T> mo79951a(TypeToken<T> typeToken) {
        final Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        final InstanceCreator<?> instanceCreator = this.f56843a.get(type);
        if (instanceCreator != null) {
            return new AbstractC23019g<T>() {
                /* class com.google.gson.internal.C23005c.C230061 */

                @Override // com.google.gson.internal.AbstractC23019g
                /* renamed from: a */
                public T mo79953a() {
                    return (T) instanceCreator.createInstance(type);
                }
            };
        }
        final InstanceCreator<?> instanceCreator2 = this.f56843a.get(rawType);
        if (instanceCreator2 != null) {
            return new AbstractC23019g<T>() {
                /* class com.google.gson.internal.C23005c.C230127 */

                @Override // com.google.gson.internal.AbstractC23019g
                /* renamed from: a */
                public T mo79953a() {
                    return (T) instanceCreator2.createInstance(type);
                }
            };
        }
        AbstractC23019g<T> a = m83453a(rawType);
        if (a != null) {
            return a;
        }
        AbstractC23019g<T> a2 = m83454a(type, rawType);
        if (a2 != null) {
            return a2;
        }
        return m83455b(type, rawType);
    }

    /* renamed from: b */
    private <T> AbstractC23019g<T> m83455b(final Type type, final Class<? super T> cls) {
        return new AbstractC23019g<T>() {
            /* class com.google.gson.internal.C23005c.C230116 */

            /* renamed from: d */
            private final AbstractC23025k f56861d = AbstractC23025k.m83506a();

            @Override // com.google.gson.internal.AbstractC23019g
            /* renamed from: a */
            public T mo79953a() {
                try {
                    return (T) this.f56861d.mo79971a(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
                }
            }
        };
    }

    /* renamed from: a */
    private <T> AbstractC23019g<T> m83454a(final Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new AbstractC23019g<T>() {
                    /* class com.google.gson.internal.C23005c.C230149 */

                    @Override // com.google.gson.internal.AbstractC23019g
                    /* renamed from: a */
                    public T mo79953a() {
                        return (T) new TreeSet();
                    }
                };
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new AbstractC23019g<T>() {
                    /* class com.google.gson.internal.C23005c.AnonymousClass10 */

                    @Override // com.google.gson.internal.AbstractC23019g
                    /* renamed from: a */
                    public T mo79953a() {
                        Type type = type;
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type2 instanceof Class) {
                                return (T) EnumSet.noneOf((Class) type2);
                            }
                            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                        }
                        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                    }
                };
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new AbstractC23019g<T>() {
                    /* class com.google.gson.internal.C23005c.AnonymousClass11 */

                    @Override // com.google.gson.internal.AbstractC23019g
                    /* renamed from: a */
                    public T mo79953a() {
                        return (T) new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new AbstractC23019g<T>() {
                    /* class com.google.gson.internal.C23005c.AnonymousClass12 */

                    @Override // com.google.gson.internal.AbstractC23019g
                    /* renamed from: a */
                    public T mo79953a() {
                        return (T) new ArrayDeque();
                    }
                };
            }
            return new AbstractC23019g<T>() {
                /* class com.google.gson.internal.C23005c.AnonymousClass13 */

                @Override // com.google.gson.internal.AbstractC23019g
                /* renamed from: a */
                public T mo79953a() {
                    return (T) new ArrayList();
                }
            };
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new AbstractC23019g<T>() {
                    /* class com.google.gson.internal.C23005c.AnonymousClass14 */

                    @Override // com.google.gson.internal.AbstractC23019g
                    /* renamed from: a */
                    public T mo79953a() {
                        return (T) new ConcurrentSkipListMap();
                    }
                };
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new AbstractC23019g<T>() {
                    /* class com.google.gson.internal.C23005c.C230072 */

                    @Override // com.google.gson.internal.AbstractC23019g
                    /* renamed from: a */
                    public T mo79953a() {
                        return (T) new ConcurrentHashMap();
                    }
                };
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new AbstractC23019g<T>() {
                    /* class com.google.gson.internal.C23005c.C230083 */

                    @Override // com.google.gson.internal.AbstractC23019g
                    /* renamed from: a */
                    public T mo79953a() {
                        return (T) new TreeMap();
                    }
                };
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new AbstractC23019g<T>() {
                    /* class com.google.gson.internal.C23005c.C230105 */

                    @Override // com.google.gson.internal.AbstractC23019g
                    /* renamed from: a */
                    public T mo79953a() {
                        return (T) new LinkedTreeMap();
                    }
                };
            }
            return new AbstractC23019g<T>() {
                /* class com.google.gson.internal.C23005c.C230094 */

                @Override // com.google.gson.internal.AbstractC23019g
                /* renamed from: a */
                public T mo79953a() {
                    return (T) new LinkedHashMap();
                }
            };
        }
    }
}
