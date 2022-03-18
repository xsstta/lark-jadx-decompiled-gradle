package dagger.hilt;

import dagger.hilt.internal.AbstractC68166a;
import dagger.hilt.internal.AbstractC68167b;
import dagger.hilt.internal.AbstractC68171e;
import dagger.hilt.internal.C68169d;
import java.lang.annotation.Annotation;
import javax.annotation.Nonnull;

/* renamed from: dagger.hilt.a */
public final class C68109a {
    /* renamed from: a */
    private static boolean m264751a(Class<?> cls, String str) {
        for (Annotation annotation : cls.getAnnotations()) {
            if (annotation.annotationType().getCanonicalName().contentEquals(str)) {
                return true;
            }
        }
        return false;
    }

    @Nonnull
    /* renamed from: a */
    public static <T> T m264750a(Object obj, Class<T> cls) {
        if (obj instanceof AbstractC68166a) {
            if (obj instanceof AbstractC68171e) {
                C68169d.m264815a(!m264751a((Class<?>) cls, "dagger.hilt.android.EarlyEntryPoint"), "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
            }
            return cls.cast(obj);
        } else if (obj instanceof AbstractC68167b) {
            return (T) m264750a(((AbstractC68167b) obj).generatedComponent(), cls);
        } else {
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), AbstractC68166a.class, AbstractC68167b.class));
        }
    }
}
