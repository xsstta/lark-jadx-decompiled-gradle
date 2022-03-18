package com.ttnet.org.chromium.base;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LifetimeAssert {
    static TestHook sTestHook;
    final WrappedReference mWrapper;

    interface TestHook {
        void onCleaned(WrappedReference wrappedReference, String str);
    }

    private static class CreationException extends RuntimeException {
        CreationException() {
            super("vvv This is where object was created. vvv");
        }
    }

    static class WrappedReference extends PhantomReference<Object> {
        public static Set<WrappedReference> sActiveWrappers = Collections.synchronizedSet(new HashSet());
        public static ReferenceQueue<Object> sReferenceQueue = new ReferenceQueue<>();
        final CreationException mCreationException;
        boolean mSafeToGc;
        final Class<?> mTargetClass;

        public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        static {
            new_insert_after_java_lang_Thread_by_knot(new Thread("GcStateAssertQueue") {
                /* class com.ttnet.org.chromium.base.LifetimeAssert.WrappedReference.C679891 */

                public void run() {
                    while (true) {
                        try {
                            WrappedReference wrappedReference = (WrappedReference) WrappedReference.sReferenceQueue.remove();
                            WrappedReference.sActiveWrappers.remove(wrappedReference);
                            if (!wrappedReference.mSafeToGc) {
                                String format = String.format("Object of type %s was GC'ed without cleanup. Refer to \"Caused by\" for where object was created.", wrappedReference.mTargetClass.getName());
                                if (LifetimeAssert.sTestHook != null) {
                                    LifetimeAssert.sTestHook.onCleaned(wrappedReference, format);
                                } else {
                                    throw new LifetimeAssertException(format, wrappedReference.mCreationException);
                                }
                            } else if (LifetimeAssert.sTestHook != null) {
                                LifetimeAssert.sTestHook.onCleaned(wrappedReference, null);
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

                {
                    setDaemon(true);
                    start();
                }
            });
        }

        public WrappedReference(Object obj, CreationException creationException, boolean z) {
            super(obj, sReferenceQueue);
            this.mCreationException = creationException;
            this.mSafeToGc = z;
            this.mTargetClass = obj.getClass();
            sActiveWrappers.add(this);
        }
    }

    public static void assertAllInstancesDestroyedForTesting() throws LifetimeAssertException {
        if (BuildConfig.DCHECK_IS_ON) {
            synchronized (WrappedReference.sActiveWrappers) {
                for (WrappedReference wrappedReference : WrappedReference.sActiveWrappers) {
                    if (!wrappedReference.mSafeToGc) {
                        throw new LifetimeAssertException(String.format("Object of type %s was not destroyed after test completed. Refer to \"Caused by\" for where object was created.", wrappedReference.mTargetClass.getName()), wrappedReference.mCreationException);
                    }
                }
            }
        }
    }

    private LifetimeAssert(WrappedReference wrappedReference) {
        this.mWrapper = wrappedReference;
    }

    public static LifetimeAssert create(Object obj) {
        if (!BuildConfig.DCHECK_IS_ON) {
            return null;
        }
        return new LifetimeAssert(new WrappedReference(obj, new CreationException(), false));
    }

    static class LifetimeAssertException extends RuntimeException {
        LifetimeAssertException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static void setSafeToGc(LifetimeAssert lifetimeAssert, boolean z) {
        if (BuildConfig.DCHECK_IS_ON) {
            lifetimeAssert.mWrapper.mSafeToGc = z;
        }
    }

    public static LifetimeAssert create(Object obj, boolean z) {
        if (!BuildConfig.DCHECK_IS_ON) {
            return null;
        }
        return new LifetimeAssert(new WrappedReference(obj, new CreationException(), z));
    }
}
