package org.apache.commons.compress.archivers.zip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.C69762c;

public class ZipArchiveEntry extends ZipEntry {

    /* renamed from: a */
    private static final byte[] f174238a = new byte[0];

    /* renamed from: k */
    private static final AbstractC69778r[] f174239k = new AbstractC69778r[0];

    /* renamed from: b */
    private int f174240b;

    /* renamed from: c */
    private long f174241c;

    /* renamed from: d */
    private int f174242d;

    /* renamed from: e */
    private int f174243e;

    /* renamed from: f */
    private long f174244f;

    /* renamed from: g */
    private AbstractC69778r[] f174245g;

    /* renamed from: h */
    private C69769i f174246h;

    /* renamed from: i */
    private String f174247i;

    /* renamed from: j */
    private C69764d f174248j;

    /* renamed from: l */
    private long f174249l;

    /* renamed from: m */
    private long f174250m;

    /* renamed from: n */
    private boolean f174251n;

    /* renamed from: o */
    private NameSource f174252o;

    /* renamed from: p */
    private CommentSource f174253p;

    public enum CommentSource {
        COMMENT,
        UNICODE_EXTRA_FIELD
    }

    public enum NameSource {
        NAME,
        NAME_WITH_EFS_FLAG,
        UNICODE_EXTRA_FIELD
    }

    /* renamed from: a */
    public int mo244748a() {
        return this.f174242d;
    }

    /* renamed from: b */
    public long mo244755b() {
        return this.f174244f;
    }

    /* renamed from: c */
    public int mo244757c() {
        return this.f174243e;
    }

    public int getMethod() {
        return this.f174240b;
    }

    public long getSize() {
        return this.f174241c;
    }

    protected ZipArchiveEntry() {
        this("");
    }

    /* renamed from: i */
    private AbstractC69778r[] m267740i() {
        C69769i iVar = this.f174246h;
        if (iVar == null) {
            return f174239k;
        }
        return new AbstractC69778r[]{iVar};
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo244759d() {
        super.setExtra(C69762c.m267766a(m267738g()));
    }

    /* renamed from: e */
    public byte[] mo244760e() {
        byte[] extra = getExtra();
        if (extra != null) {
            return extra;
        }
        return f174238a;
    }

    /* renamed from: f */
    public byte[] mo244762f() {
        return C69762c.m267768b(m267738g());
    }

    public String getName() {
        String str = this.f174247i;
        if (str == null) {
            return super.getName();
        }
        return str;
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public boolean isDirectory() {
        return getName().endsWith("/");
    }

    /* renamed from: g */
    private AbstractC69778r[] m267738g() {
        AbstractC69778r[] rVarArr = this.f174245g;
        if (rVarArr == null) {
            return m267740i();
        }
        if (this.f174246h != null) {
            return m267739h();
        }
        return rVarArr;
    }

    /* renamed from: h */
    private AbstractC69778r[] m267739h() {
        AbstractC69778r[] rVarArr = this.f174245g;
        AbstractC69778r[] a = m267737a(rVarArr, rVarArr.length + 1);
        a[this.f174245g.length] = this.f174246h;
        return a;
    }

    @Override // java.lang.Object
    public Object clone() {
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) super.clone();
        zipArchiveEntry.mo244749a(mo244748a());
        zipArchiveEntry.mo244750a(mo244755b());
        zipArchiveEntry.mo244754a(m267738g());
        return zipArchiveEntry;
    }

    /* renamed from: a */
    public void mo244749a(int i) {
        this.f174242d = i;
    }

    /* renamed from: a */
    public void mo244750a(long j) {
        this.f174244f = j;
    }

    /* renamed from: b */
    public AbstractC69778r mo244756b(ZipShort zipShort) {
        AbstractC69778r[] rVarArr = this.f174245g;
        if (rVarArr == null) {
            return null;
        }
        for (AbstractC69778r rVar : rVarArr) {
            if (zipShort.equals(rVar.getHeaderId())) {
                return rVar;
            }
        }
        return null;
    }

    public void setMethod(int i) {
        if (i >= 0) {
            this.f174240b = i;
            return;
        }
        throw new IllegalArgumentException("ZIP compression method can not be negative: " + i);
    }

    public void setSize(long j) {
        if (j >= 0) {
            this.f174241c = j;
            return;
        }
        throw new IllegalArgumentException("invalid entry size");
    }

    public ZipArchiveEntry(String str) {
        super(str);
        this.f174240b = -1;
        this.f174241c = -1;
        this.f174248j = new C69764d();
        this.f174249l = -1;
        this.f174250m = -1;
        this.f174251n = false;
        this.f174252o = NameSource.NAME;
        this.f174253p = CommentSource.COMMENT;
        mo244751a(str);
    }

    public void setExtra(byte[] bArr) throws RuntimeException {
        try {
            m267736a(C69762c.m267767a(bArr, true, C69762c.C69763a.f174267c), true);
        } catch (ZipException e) {
            throw new RuntimeException("Error parsing extra fields for entry: " + getName() + " - " + e.getMessage(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo244751a(String str) {
        if (str != null && mo244757c() == 0 && !str.contains("/")) {
            str = str.replace('\\', '/');
        }
        this.f174247i = str;
    }

    /* renamed from: a */
    public void mo244752a(ZipShort zipShort) {
        if (this.f174245g != null) {
            ArrayList arrayList = new ArrayList();
            AbstractC69778r[] rVarArr = this.f174245g;
            for (AbstractC69778r rVar : rVarArr) {
                if (!zipShort.equals(rVar.getHeaderId())) {
                    arrayList.add(rVar);
                }
            }
            if (this.f174245g.length != arrayList.size()) {
                this.f174245g = (AbstractC69778r[]) arrayList.toArray(new AbstractC69778r[arrayList.size()]);
                mo244759d();
                return;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) obj;
        String name = getName();
        String name2 = zipArchiveEntry.getName();
        if (name == null) {
            if (name2 != null) {
                return false;
            }
        } else if (!name.equals(name2)) {
            return false;
        }
        String comment = getComment();
        String comment2 = zipArchiveEntry.getComment();
        if (comment == null) {
            comment = "";
        }
        if (comment2 == null) {
            comment2 = "";
        }
        if (getTime() == zipArchiveEntry.getTime() && comment.equals(comment2) && mo244748a() == zipArchiveEntry.mo244748a() && mo244757c() == zipArchiveEntry.mo244757c() && mo244755b() == zipArchiveEntry.mo244755b() && getMethod() == zipArchiveEntry.getMethod() && getSize() == zipArchiveEntry.getSize() && getCrc() == zipArchiveEntry.getCrc() && getCompressedSize() == zipArchiveEntry.getCompressedSize() && Arrays.equals(mo244762f(), zipArchiveEntry.mo244762f()) && Arrays.equals(mo244760e(), zipArchiveEntry.mo244760e()) && this.f174249l == zipArchiveEntry.f174249l && this.f174250m == zipArchiveEntry.f174250m && this.f174248j.equals(zipArchiveEntry.f174248j)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo244753a(AbstractC69778r rVar) {
        if (rVar instanceof C69769i) {
            this.f174246h = (C69769i) rVar;
        } else if (this.f174245g == null) {
            this.f174245g = new AbstractC69778r[]{rVar};
        } else {
            if (mo244756b(rVar.getHeaderId()) != null) {
                mo244752a(rVar.getHeaderId());
            }
            AbstractC69778r[] rVarArr = this.f174245g;
            AbstractC69778r[] a = m267737a(rVarArr, rVarArr.length + 1);
            a[a.length - 1] = rVar;
            this.f174245g = a;
        }
        mo244759d();
    }

    /* renamed from: a */
    public void mo244754a(AbstractC69778r[] rVarArr) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC69778r rVar : rVarArr) {
            if (rVar instanceof C69769i) {
                this.f174246h = (C69769i) rVar;
            } else {
                arrayList.add(rVar);
            }
        }
        this.f174245g = (AbstractC69778r[]) arrayList.toArray(new AbstractC69778r[arrayList.size()]);
        mo244759d();
    }

    /* renamed from: a */
    private AbstractC69778r[] m267737a(AbstractC69778r[] rVarArr, int i) {
        AbstractC69778r[] rVarArr2 = new AbstractC69778r[i];
        System.arraycopy(rVarArr, 0, rVarArr2, 0, Math.min(rVarArr.length, i));
        return rVarArr2;
    }

    /* renamed from: a */
    private void m267736a(AbstractC69778r[] rVarArr, boolean z) throws ZipException {
        AbstractC69778r rVar;
        if (this.f174245g == null) {
            mo244754a(rVarArr);
            return;
        }
        for (AbstractC69778r rVar2 : rVarArr) {
            if (rVar2 instanceof C69769i) {
                rVar = this.f174246h;
            } else {
                rVar = mo244756b(rVar2.getHeaderId());
            }
            if (rVar == null) {
                mo244753a(rVar2);
            } else if (z) {
                byte[] localFileDataData = rVar2.getLocalFileDataData();
                rVar.parseFromLocalFileData(localFileDataData, 0, localFileDataData.length);
            } else {
                byte[] centralDirectoryData = rVar2.getCentralDirectoryData();
                rVar.parseFromCentralDirectoryData(centralDirectoryData, 0, centralDirectoryData.length);
            }
        }
        mo244759d();
    }
}
