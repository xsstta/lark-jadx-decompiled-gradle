package org.apache.commons.compress.archivers.zip;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

/* renamed from: org.apache.commons.compress.archivers.zip.c */
public class C69762c {

    /* renamed from: a */
    private static final Map<ZipShort, Class<?>> f174264a = new ConcurrentHashMap();

    /* renamed from: org.apache.commons.compress.archivers.zip.c$a */
    public static final class C69763a {

        /* renamed from: a */
        public static final C69763a f174265a = new C69763a(0);

        /* renamed from: b */
        public static final C69763a f174266b = new C69763a(1);

        /* renamed from: c */
        public static final C69763a f174267c = new C69763a(2);

        /* renamed from: d */
        private final int f174268d;

        /* renamed from: a */
        public int mo244802a() {
            return this.f174268d;
        }

        private C69763a(int i) {
            this.f174268d = i;
        }
    }

    static {
        m267765a(C69761b.class);
        m267765a(X5455_ExtendedTimestamp.class);
        m267765a(X7875_NewUnix.class);
        m267765a(C69765e.class);
        m267765a(C69768h.class);
        m267765a(C69767g.class);
        m267765a(C69777q.class);
        m267765a(C69771k.class);
        m267765a(C69772l.class);
        m267765a(C69773m.class);
        m267765a(C69774n.class);
        m267765a(C69775o.class);
        m267765a(C69776p.class);
        m267765a(C69766f.class);
    }

    /* renamed from: a */
    public static AbstractC69778r m267764a(ZipShort zipShort) throws InstantiationException, IllegalAccessException {
        Class<?> cls = f174264a.get(zipShort);
        if (cls != null) {
            return (AbstractC69778r) cls.newInstance();
        }
        C69770j jVar = new C69770j();
        jVar.mo244806a(zipShort);
        return jVar;
    }

    /* renamed from: a */
    public static void m267765a(Class<?> cls) {
        try {
            f174264a.put(((AbstractC69778r) cls.newInstance()).getHeaderId(), cls);
        } catch (ClassCastException unused) {
            throw new RuntimeException(cls + " doesn't implement ZipExtraField");
        } catch (InstantiationException unused2) {
            throw new RuntimeException(cls + " is not a concrete class");
        } catch (IllegalAccessException unused3) {
            throw new RuntimeException(cls + "'s no-arg constructor is not public");
        }
    }

    /* renamed from: b */
    public static byte[] m267768b(AbstractC69778r[] rVarArr) {
        boolean z;
        byte[] centralDirectoryData;
        if (rVarArr.length <= 0 || !(rVarArr[rVarArr.length - 1] instanceof C69769i)) {
            z = false;
        } else {
            z = true;
        }
        int length = rVarArr.length;
        if (z) {
            length--;
        }
        int i = length * 4;
        for (AbstractC69778r rVar : rVarArr) {
            i += rVar.getCentralDirectoryLength().getValue();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            System.arraycopy(rVarArr[i3].getHeaderId().getBytes(), 0, bArr, i2, 2);
            System.arraycopy(rVarArr[i3].getCentralDirectoryLength().getBytes(), 0, bArr, i2 + 2, 2);
            i2 += 4;
            byte[] centralDirectoryData2 = rVarArr[i3].getCentralDirectoryData();
            if (centralDirectoryData2 != null) {
                System.arraycopy(centralDirectoryData2, 0, bArr, i2, centralDirectoryData2.length);
                i2 += centralDirectoryData2.length;
            }
        }
        if (z && (centralDirectoryData = rVarArr[rVarArr.length - 1].getCentralDirectoryData()) != null) {
            System.arraycopy(centralDirectoryData, 0, bArr, i2, centralDirectoryData.length);
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m267766a(AbstractC69778r[] rVarArr) {
        boolean z;
        byte[] localFileDataData;
        if (rVarArr.length <= 0 || !(rVarArr[rVarArr.length - 1] instanceof C69769i)) {
            z = false;
        } else {
            z = true;
        }
        int length = rVarArr.length;
        if (z) {
            length--;
        }
        int i = length * 4;
        for (AbstractC69778r rVar : rVarArr) {
            i += rVar.getLocalFileDataLength().getValue();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            System.arraycopy(rVarArr[i3].getHeaderId().getBytes(), 0, bArr, i2, 2);
            System.arraycopy(rVarArr[i3].getLocalFileDataLength().getBytes(), 0, bArr, i2 + 2, 2);
            i2 += 4;
            byte[] localFileDataData2 = rVarArr[i3].getLocalFileDataData();
            if (localFileDataData2 != null) {
                System.arraycopy(localFileDataData2, 0, bArr, i2, localFileDataData2.length);
                i2 += localFileDataData2.length;
            }
        }
        if (z && (localFileDataData = rVarArr[rVarArr.length - 1].getLocalFileDataData()) != null) {
            System.arraycopy(localFileDataData, 0, bArr, i2, localFileDataData.length);
        }
        return bArr;
    }

    /* renamed from: a */
    public static AbstractC69778r[] m267767a(byte[] bArr, boolean z, C69763a aVar) throws ZipException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i > bArr.length - 4) {
                break;
            }
            ZipShort zipShort = new ZipShort(bArr, i);
            int value = new ZipShort(bArr, i + 2).getValue();
            int i2 = i + 4;
            if (i2 + value > bArr.length) {
                int a = aVar.mo244802a();
                if (a == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("bad extra field starting at ");
                    sb.append(i);
                    sb.append(".  Block length of ");
                    sb.append(value);
                    sb.append(" bytes exceeds remaining data of ");
                    sb.append((bArr.length - i) - 4);
                    sb.append(" bytes.");
                    throw new ZipException(sb.toString());
                } else if (a != 1) {
                    if (a == 2) {
                        C69769i iVar = new C69769i();
                        if (z) {
                            iVar.parseFromLocalFileData(bArr, i, bArr.length - i);
                        } else {
                            iVar.parseFromCentralDirectoryData(bArr, i, bArr.length - i);
                        }
                        arrayList.add(iVar);
                    } else {
                        throw new ZipException("unknown UnparseableExtraField key: " + aVar.mo244802a());
                    }
                }
            } else {
                try {
                    AbstractC69778r a2 = m267764a(zipShort);
                    if (z) {
                        try {
                            a2.parseFromLocalFileData(bArr, i2, value);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw ((ZipException) new ZipException("Failed to parse corrupt ZIP extra field of type " + Integer.toHexString(zipShort.getValue())).initCause(e));
                        }
                    } else {
                        a2.parseFromCentralDirectoryData(bArr, i2, value);
                    }
                    arrayList.add(a2);
                    i += value + 4;
                } catch (IllegalAccessException | InstantiationException e2) {
                    throw ((ZipException) new ZipException(e2.getMessage()).initCause(e2));
                }
            }
        }
        return (AbstractC69778r[]) arrayList.toArray(new AbstractC69778r[arrayList.size()]);
    }
}
