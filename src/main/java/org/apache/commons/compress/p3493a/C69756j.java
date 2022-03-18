package org.apache.commons.compress.p3493a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: org.apache.commons.compress.a.j */
public class C69756j<E> implements Iterator<E> {

    /* renamed from: a */
    private E f174221a;

    /* renamed from: b */
    private final Class<E> f174222b;

    /* renamed from: c */
    private final Iterator<E> f174223c;

    public boolean hasNext() {
        return m267729a();
    }

    public void remove() {
        throw new UnsupportedOperationException("service=" + this.f174222b.getName());
    }

    /* renamed from: a */
    private boolean m267729a() {
        while (this.f174221a == null) {
            try {
                if (!this.f174223c.hasNext()) {
                    return false;
                }
                this.f174221a = this.f174223c.next();
            } catch (ServiceConfigurationError e) {
                if (!(e.getCause() instanceof SecurityException)) {
                    throw e;
                }
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public E next() {
        if (m267729a()) {
            E e = this.f174221a;
            this.f174221a = null;
            return e;
        }
        throw new NoSuchElementException("No more elements for service " + this.f174222b.getName());
    }

    public C69756j(Class<E> cls) {
        this(cls, ClassLoader.getSystemClassLoader());
    }

    public C69756j(Class<E> cls, ClassLoader classLoader) {
        this.f174222b = cls;
        this.f174223c = ServiceLoader.load(cls, classLoader).iterator();
        this.f174221a = null;
    }
}
