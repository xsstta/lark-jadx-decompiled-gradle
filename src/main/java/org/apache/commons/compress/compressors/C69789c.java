package org.apache.commons.compress.compressors;

import java.io.IOException;
import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.compress.compressors.lz4.C69819a;
import org.apache.commons.compress.compressors.lz4.C69826c;
import org.apache.commons.compress.compressors.p3494a.C69781a;
import org.apache.commons.compress.compressors.p3494a.C69782b;
import org.apache.commons.compress.compressors.p3495b.C69785a;
import org.apache.commons.compress.compressors.p3496c.C69791a;
import org.apache.commons.compress.compressors.p3497d.C69794a;
import org.apache.commons.compress.compressors.p3498e.C69805a;
import org.apache.commons.compress.compressors.p3499f.C69807a;
import org.apache.commons.compress.compressors.p3499f.C69808b;
import org.apache.commons.compress.compressors.p3501h.C69811a;
import org.apache.commons.compress.compressors.p3501h.C69812b;
import org.apache.commons.compress.compressors.p3502i.C69814a;
import org.apache.commons.compress.compressors.p3503j.C69815a;
import org.apache.commons.compress.compressors.p3503j.C69816b;
import org.apache.commons.compress.compressors.pack200.C69841b;
import org.apache.commons.compress.compressors.snappy.C69846a;
import org.apache.commons.compress.compressors.snappy.C69849c;
import org.apache.commons.compress.p3493a.C69755i;
import org.apache.commons.compress.p3493a.C69756j;
import org.apache.commons.compress.p3493a.C69757k;

/* renamed from: org.apache.commons.compress.compressors.c */
public class C69789c implements AbstractC69793d {

    /* renamed from: a */
    public static final C69789c f174366a = new C69789c();

    /* renamed from: b */
    private static final String f174367b = m267826a("Google Brotli Dec", "https://github.com/google/brotli/");

    /* renamed from: c */
    private static final String f174368c = m267826a("XZ for Java", "https://tukaani.org/xz/java.html");

    /* renamed from: d */
    private static final String f174369d = m267826a("Zstd JNI", "https://github.com/luben/zstd-jni");

    /* renamed from: e */
    private SortedMap<String, AbstractC69793d> f174370e;

    /* renamed from: f */
    private volatile boolean f174371f;

    /* renamed from: g */
    private final int f174372g = -1;

    /* renamed from: e */
    private static Iterator<AbstractC69793d> m267830e() {
        return new C69756j(AbstractC69793d.class);
    }

    /* renamed from: a */
    public static SortedMap<String, AbstractC69793d> m267827a() {
        return (SortedMap) AccessController.doPrivileged(new PrivilegedAction<SortedMap<String, AbstractC69793d>>() {
            /* class org.apache.commons.compress.compressors.C69789c.C697901 */

            /* renamed from: a */
            public SortedMap<String, AbstractC69793d> run() {
                TreeMap treeMap = new TreeMap();
                C69789c.m267828a(C69789c.f174366a.mo244841d(), C69789c.f174366a, treeMap);
                Iterator<AbstractC69793d> it = C69789c.m267829b().iterator();
                while (it.hasNext()) {
                    AbstractC69793d next = it.next();
                    C69789c.m267828a(next.mo244841d(), next, treeMap);
                }
                return treeMap;
            }
        });
    }

    /* renamed from: b */
    public static ArrayList<AbstractC69793d> m267829b() {
        return C69755i.m267728a(m267830e());
    }

    /* renamed from: c */
    public SortedMap<String, AbstractC69793d> mo244840c() {
        if (this.f174370e == null) {
            this.f174370e = Collections.unmodifiableSortedMap(m267827a());
        }
        return this.f174370e;
    }

    @Override // org.apache.commons.compress.compressors.AbstractC69793d
    /* renamed from: d */
    public Set<String> mo244841d() {
        return C69757k.m267730a("gz", "br", "bzip2", "xz", "lzma", "pack200", "deflate", "snappy-raw", "snappy-framed", "z", "lz4-block", "lz4-framed", "zstd", "deflate64");
    }

    /* renamed from: a */
    private static String m267825a(String str) {
        return str.toUpperCase(Locale.ROOT);
    }

    /* renamed from: a */
    private static String m267826a(String str, String str2) {
        return " In addition to Apache Commons Compress you need the " + str + " library - see " + str2;
    }

    /* renamed from: a */
    public AbstractC69780a mo244838a(String str, InputStream inputStream) throws CompressorException {
        return mo244839a(str, inputStream, this.f174371f);
    }

    /* renamed from: a */
    static void m267828a(Set<String> set, AbstractC69793d dVar, TreeMap<String, AbstractC69793d> treeMap) {
        for (String str : set) {
            treeMap.put(m267825a(str), dVar);
        }
    }

    @Override // org.apache.commons.compress.compressors.AbstractC69793d
    /* renamed from: a */
    public AbstractC69780a mo244839a(String str, InputStream inputStream, boolean z) throws CompressorException {
        if (str == null || inputStream == null) {
            throw new IllegalArgumentException("Compressor name and stream must not be null.");
        }
        try {
            if ("gz".equalsIgnoreCase(str)) {
                return new C69805a(inputStream, z);
            }
            if ("bzip2".equalsIgnoreCase(str)) {
                return new C69785a(inputStream, z);
            }
            if ("br".equalsIgnoreCase(str)) {
                if (C69782b.m267794a()) {
                    return new C69781a(inputStream);
                }
                throw new CompressorException("Brotli compression is not available." + f174367b);
            } else if ("xz".equalsIgnoreCase(str)) {
                if (C69812b.m267907a()) {
                    return new C69811a(inputStream, z, this.f174372g);
                }
                throw new CompressorException("XZ compression is not available." + f174368c);
            } else if ("zstd".equalsIgnoreCase(str)) {
                if (C69816b.m267915a()) {
                    return new C69815a(inputStream);
                }
                throw new CompressorException("Zstandard compression is not available." + f174369d);
            } else if ("lzma".equalsIgnoreCase(str)) {
                if (C69808b.m267885a()) {
                    return new C69807a(inputStream, this.f174372g);
                }
                throw new CompressorException("LZMA compression is not available" + f174368c);
            } else if ("pack200".equalsIgnoreCase(str)) {
                return new C69841b(inputStream);
            } else {
                if ("snappy-raw".equalsIgnoreCase(str)) {
                    return new C69849c(inputStream);
                }
                if ("snappy-framed".equalsIgnoreCase(str)) {
                    return new C69846a(inputStream);
                }
                if ("z".equalsIgnoreCase(str)) {
                    return new C69814a(inputStream, this.f174372g);
                }
                if ("deflate".equalsIgnoreCase(str)) {
                    return new C69791a(inputStream);
                }
                if ("deflate64".equalsIgnoreCase(str)) {
                    return new C69794a(inputStream);
                }
                if ("lz4-block".equalsIgnoreCase(str)) {
                    return new C69819a(inputStream);
                }
                if ("lz4-framed".equalsIgnoreCase(str)) {
                    return new C69826c(inputStream, z);
                }
                AbstractC69793d dVar = mo244840c().get(m267825a(str));
                if (dVar != null) {
                    return dVar.mo244839a(str, inputStream, z);
                }
                throw new CompressorException("Compressor: " + str + " not found.");
            }
        } catch (IOException e) {
            throw new CompressorException("Could not create CompressorInputStream.", e);
        }
    }
}
