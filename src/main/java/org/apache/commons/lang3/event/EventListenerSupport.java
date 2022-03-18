package org.apache.commons.lang3.event;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.lang3.C69882g;

public class EventListenerSupport<L> implements Serializable {
    private static final long serialVersionUID = 3593265990380473632L;
    public List<L> listeners;
    private transient L[] prototypeArray;
    private transient L proxy;

    public L fire() {
        return this.proxy;
    }

    /* access modifiers changed from: protected */
    public InvocationHandler createInvocationHandler() {
        return new C69878a();
    }

    /* access modifiers changed from: package-private */
    public int getListenerCount() {
        return this.listeners.size();
    }

    private EventListenerSupport() {
        this.listeners = new CopyOnWriteArrayList();
    }

    public L[] getListeners() {
        return (L[]) this.listeners.toArray(this.prototypeArray);
    }

    /* access modifiers changed from: protected */
    /* renamed from: org.apache.commons.lang3.event.EventListenerSupport$a */
    public class C69878a implements InvocationHandler {
        protected C69878a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            for (L l : EventListenerSupport.this.listeners) {
                method.invoke(l, objArr);
            }
            return null;
        }
    }

    public static <T> EventListenerSupport<T> create(Class<T> cls) {
        return new EventListenerSupport<>(cls);
    }

    public void addListener(L l) {
        addListener(l, true);
    }

    public void removeListener(L l) {
        C69882g.m268177a(l, "Listener object cannot be null.", new Object[0]);
        this.listeners.remove(l);
    }

    public EventListenerSupport(Class<L> cls) {
        this(cls, Thread.currentThread().getContextClassLoader());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Object[] objArr = (Object[]) objectInputStream.readObject();
        this.listeners = new CopyOnWriteArrayList(objArr);
        initializeTransientFields(objArr.getClass().getComponentType(), Thread.currentThread().getContextClassLoader());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
        for (L l : this.listeners) {
            try {
                objectOutputStream2.writeObject(l);
                arrayList.add(l);
            } catch (IOException unused) {
                objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
            }
        }
        objectOutputStream.writeObject(arrayList.toArray(this.prototypeArray));
    }

    private void initializeTransientFields(Class<L> cls, ClassLoader classLoader) {
        this.prototypeArray = (L[]) ((Object[]) Array.newInstance((Class<?>) cls, 0));
        createProxy(cls, classLoader);
    }

    private void createProxy(Class<L> cls, ClassLoader classLoader) {
        this.proxy = cls.cast(Proxy.newProxyInstance(classLoader, new Class[]{cls}, createInvocationHandler()));
    }

    public void addListener(L l, boolean z) {
        C69882g.m268177a(l, "Listener object cannot be null.", new Object[0]);
        if (z) {
            this.listeners.add(l);
        } else if (!this.listeners.contains(l)) {
            this.listeners.add(l);
        }
    }

    public EventListenerSupport(Class<L> cls, ClassLoader classLoader) {
        this();
        C69882g.m268177a(cls, "Listener interface cannot be null.", new Object[0]);
        C69882g.m268177a(classLoader, "ClassLoader cannot be null.", new Object[0]);
        C69882g.m268179a(cls.isInterface(), "Class {0} is not an interface", cls.getName());
        initializeTransientFields(cls, classLoader);
    }
}
