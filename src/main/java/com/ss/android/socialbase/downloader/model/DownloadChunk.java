package com.ss.android.socialbase.downloader.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.p3028e.RunnableC60070b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class DownloadChunk implements Parcelable {
    public static final Parcelable.Creator<DownloadChunk> CREATOR = new Parcelable.Creator<DownloadChunk>() {
        /* class com.ss.android.socialbase.downloader.model.DownloadChunk.C601161 */

        /* renamed from: a */
        public DownloadChunk[] newArray(int i) {
            return new DownloadChunk[i];
        }

        /* renamed from: a */
        public DownloadChunk createFromParcel(Parcel parcel) {
            return new DownloadChunk(parcel);
        }
    };

    /* renamed from: a */
    private static final String f149965a = "DownloadChunk";

    /* renamed from: b */
    private int f149966b;

    /* renamed from: c */
    private long f149967c;

    /* renamed from: d */
    private AtomicLong f149968d;

    /* renamed from: e */
    private long f149969e;

    /* renamed from: f */
    private long f149970f;

    /* renamed from: g */
    private int f149971g;

    /* renamed from: h */
    private AtomicInteger f149972h;

    /* renamed from: i */
    private long f149973i;

    /* renamed from: j */
    private List<DownloadChunk> f149974j;

    /* renamed from: k */
    private DownloadChunk f149975k;

    /* renamed from: l */
    private int f149976l;

    /* renamed from: m */
    private boolean f149977m;

    /* renamed from: n */
    private AtomicBoolean f149978n;

    /* renamed from: o */
    private RunnableC60070b f149979o;

    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public List<DownloadChunk> mo205015g() {
        return this.f149974j;
    }

    /* renamed from: k */
    public int mo205019k() {
        return this.f149966b;
    }

    /* renamed from: l */
    public long mo205020l() {
        return this.f149967c;
    }

    /* renamed from: p */
    public long mo205024p() {
        return this.f149969e;
    }

    /* renamed from: q */
    public long mo205025q() {
        return this.f149970f;
    }

    /* renamed from: s */
    public int mo205027s() {
        return this.f149971g;
    }

    /* renamed from: r */
    public void mo205026r() {
        this.f149973i = mo205022n();
    }

    /* renamed from: b */
    public int mo205004b() {
        AtomicInteger atomicInteger = this.f149972h;
        if (atomicInteger == null) {
            return -1;
        }
        return atomicInteger.get();
    }

    /* renamed from: c */
    public boolean mo205010c() {
        AtomicBoolean atomicBoolean = this.f149978n;
        if (atomicBoolean == null) {
            return false;
        }
        return atomicBoolean.get();
    }

    /* renamed from: d */
    public boolean mo205011d() {
        if (mo205004b() == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo205014f() {
        List<DownloadChunk> list = this.f149974j;
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public long mo205021m() {
        AtomicLong atomicLong = this.f149968d;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0;
    }

    /* renamed from: com.ss.android.socialbase.downloader.model.DownloadChunk$a */
    public static class C60117a {

        /* renamed from: a */
        public int f149980a;

        /* renamed from: b */
        public long f149981b;

        /* renamed from: c */
        public long f149982c;

        /* renamed from: d */
        public long f149983d;

        /* renamed from: e */
        public long f149984e;

        /* renamed from: f */
        public int f149985f;

        /* renamed from: g */
        public long f149986g;

        /* renamed from: h */
        public DownloadChunk f149987h;

        /* renamed from: a */
        public DownloadChunk mo205036a() {
            return new DownloadChunk(this);
        }

        /* renamed from: a */
        public C60117a mo205033a(int i) {
            this.f149985f = i;
            return this;
        }

        /* renamed from: b */
        public C60117a mo205037b(long j) {
            this.f149982c = j;
            return this;
        }

        /* renamed from: c */
        public C60117a mo205038c(long j) {
            this.f149983d = j;
            return this;
        }

        /* renamed from: d */
        public C60117a mo205039d(long j) {
            this.f149984e = j;
            return this;
        }

        /* renamed from: e */
        public C60117a mo205040e(long j) {
            this.f149986g = j;
            return this;
        }

        public C60117a(int i) {
            this.f149980a = i;
        }

        /* renamed from: a */
        public C60117a mo205034a(long j) {
            this.f149981b = j;
            return this;
        }

        /* renamed from: a */
        public C60117a mo205035a(DownloadChunk downloadChunk) {
            this.f149987h = downloadChunk;
            return this;
        }
    }

    /* renamed from: i */
    public boolean mo205017i() {
        long j = this.f149967c;
        if (mo205011d()) {
            long j2 = this.f149973i;
            if (j2 > this.f149967c) {
                j = j2;
            }
        }
        if (mo205022n() - j >= this.f149970f) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public DownloadChunk mo205013e() {
        DownloadChunk downloadChunk;
        if (!mo205011d()) {
            downloadChunk = this.f149975k;
        } else {
            downloadChunk = this;
        }
        if (downloadChunk == null || !downloadChunk.mo205014f()) {
            return null;
        }
        return downloadChunk.mo205015g().get(0);
    }

    /* renamed from: o */
    public long mo205023o() {
        long n = mo205022n() - this.f149967c;
        if (mo205014f()) {
            n = 0;
            for (int i = 0; i < this.f149974j.size(); i++) {
                DownloadChunk downloadChunk = this.f149974j.get(i);
                if (downloadChunk != null) {
                    n += downloadChunk.mo205022n() - downloadChunk.mo205020l();
                }
            }
        }
        return n;
    }

    /* renamed from: a */
    public ContentValues mo204995a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(this.f149966b));
        contentValues.put("chunkIndex", Integer.valueOf(this.f149971g));
        contentValues.put("startOffset", Long.valueOf(this.f149967c));
        contentValues.put("curOffset", Long.valueOf(mo205022n()));
        contentValues.put("endOffset", Long.valueOf(this.f149969e));
        contentValues.put("chunkContentLen", Long.valueOf(this.f149970f));
        contentValues.put("hostChunkIndex", Integer.valueOf(mo205004b()));
        return contentValues;
    }

    /* renamed from: h */
    public boolean mo205016h() {
        DownloadChunk downloadChunk = this.f149975k;
        if (downloadChunk == null) {
            return true;
        }
        if (!downloadChunk.mo205014f()) {
            return false;
        }
        for (int i = 0; i < this.f149975k.mo205015g().size(); i++) {
            DownloadChunk downloadChunk2 = this.f149975k.mo205015g().get(i);
            if (downloadChunk2 != null) {
                int indexOf = this.f149975k.mo205015g().indexOf(this);
                if (indexOf > i && !downloadChunk2.mo205017i()) {
                    return false;
                }
                if (indexOf == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public long mo205018j() {
        DownloadChunk downloadChunk = this.f149975k;
        if (!(downloadChunk == null || downloadChunk.mo205015g() == null)) {
            int indexOf = this.f149975k.mo205015g().indexOf(this);
            boolean z = false;
            for (int i = 0; i < this.f149975k.mo205015g().size(); i++) {
                DownloadChunk downloadChunk2 = this.f149975k.mo205015g().get(i);
                if (downloadChunk2 != null) {
                    if (z) {
                        return downloadChunk2.mo205022n();
                    }
                    if (indexOf == i) {
                        z = true;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: n */
    public long mo205022n() {
        if (!mo205011d() || !mo205014f()) {
            return mo205021m();
        }
        long j = 0;
        for (int i = 0; i < this.f149974j.size(); i++) {
            DownloadChunk downloadChunk = this.f149974j.get(i);
            if (downloadChunk != null) {
                if (!downloadChunk.mo205017i()) {
                    return downloadChunk.mo205021m();
                }
                if (j < downloadChunk.mo205021m()) {
                    j = downloadChunk.mo205021m();
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public void mo204998a(long j) {
        this.f149970f = j;
    }

    /* renamed from: b */
    public void mo205005b(int i) {
        this.f149966b = i;
    }

    /* renamed from: c */
    public void mo205009c(int i) {
        this.f149971g = i;
    }

    /* renamed from: a */
    public void mo205000a(RunnableC60070b bVar) {
        this.f149979o = bVar;
        mo205026r();
    }

    /* renamed from: b */
    public void mo205007b(boolean z) {
        this.f149977m = z;
    }

    /* renamed from: a */
    public void mo204997a(int i) {
        AtomicInteger atomicInteger = this.f149972h;
        if (atomicInteger == null) {
            this.f149972h = new AtomicInteger(i);
        } else {
            atomicInteger.set(i);
        }
    }

    /* renamed from: a */
    public void mo205001a(DownloadChunk downloadChunk) {
        this.f149975k = downloadChunk;
        if (downloadChunk != null) {
            mo204997a(downloadChunk.mo205027s());
        }
    }

    /* renamed from: b */
    public void mo205006b(long j) {
        AtomicLong atomicLong = this.f149968d;
        if (atomicLong != null) {
            atomicLong.set(j);
        } else {
            this.f149968d = new AtomicLong(j);
        }
    }

    protected DownloadChunk(Parcel parcel) {
        this.f149966b = parcel.readInt();
        this.f149967c = parcel.readLong();
        this.f149968d = new AtomicLong(parcel.readLong());
        this.f149969e = parcel.readLong();
        this.f149970f = parcel.readLong();
        this.f149971g = parcel.readInt();
        this.f149972h = new AtomicInteger(parcel.readInt());
    }

    /* renamed from: a */
    public void mo205002a(List<DownloadChunk> list) {
        this.f149974j = list;
    }

    private DownloadChunk(C60117a aVar) {
        if (aVar != null) {
            this.f149966b = aVar.f149980a;
            this.f149967c = aVar.f149981b;
            this.f149968d = new AtomicLong(aVar.f149982c);
            this.f149969e = aVar.f149983d;
            this.f149970f = aVar.f149984e;
            this.f149971g = aVar.f149985f;
            this.f149973i = aVar.f149986g;
            this.f149972h = new AtomicInteger(-1);
            mo205001a(aVar.f149987h);
            this.f149978n = new AtomicBoolean(false);
        }
    }

    /* renamed from: c */
    public long mo205008c(boolean z) {
        long n = mo205022n();
        long j = this.f149970f;
        long j2 = this.f149973i;
        long j3 = j - (n - j2);
        if (!z && n == j2) {
            j3 = j - (n - this.f149967c);
        }
        C59990a.m232838b(f149965a, "contentLength:" + this.f149970f + " curOffset:" + mo205022n() + " oldOffset:" + this.f149973i + " retainLen:" + j3);
        if (j3 < 0) {
            return 0;
        }
        return j3;
    }

    public DownloadChunk(Cursor cursor) {
        if (cursor != null) {
            this.f149966b = cursor.getInt(cursor.getColumnIndex("_id"));
            this.f149971g = cursor.getInt(cursor.getColumnIndex("chunkIndex"));
            this.f149967c = cursor.getLong(cursor.getColumnIndex("startOffset"));
            int columnIndex = cursor.getColumnIndex("curOffset");
            if (columnIndex != -1) {
                this.f149968d = new AtomicLong(cursor.getLong(columnIndex));
            } else {
                this.f149968d = new AtomicLong(0);
            }
            this.f149969e = cursor.getLong(cursor.getColumnIndex("endOffset"));
            int columnIndex2 = cursor.getColumnIndex("hostChunkIndex");
            if (columnIndex2 != -1) {
                this.f149972h = new AtomicInteger(cursor.getInt(columnIndex2));
            } else {
                this.f149972h = new AtomicInteger(-1);
            }
            int columnIndex3 = cursor.getColumnIndex("chunkContentLen");
            if (columnIndex3 != -1) {
                this.f149970f = cursor.getLong(columnIndex3);
            }
            this.f149978n = new AtomicBoolean(false);
        }
    }

    /* renamed from: a */
    public void mo204999a(SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement != null) {
            this.f149976l = 0;
            sQLiteStatement.clearBindings();
            int i = this.f149976l + 1;
            this.f149976l = i;
            sQLiteStatement.bindLong(i, (long) this.f149966b);
            int i2 = this.f149976l + 1;
            this.f149976l = i2;
            sQLiteStatement.bindLong(i2, (long) this.f149971g);
            int i3 = this.f149976l + 1;
            this.f149976l = i3;
            sQLiteStatement.bindLong(i3, this.f149967c);
            int i4 = this.f149976l + 1;
            this.f149976l = i4;
            sQLiteStatement.bindLong(i4, mo205022n());
            int i5 = this.f149976l + 1;
            this.f149976l = i5;
            sQLiteStatement.bindLong(i5, this.f149969e);
            int i6 = this.f149976l + 1;
            this.f149976l = i6;
            sQLiteStatement.bindLong(i6, this.f149970f);
            int i7 = this.f149976l + 1;
            this.f149976l = i7;
            sQLiteStatement.bindLong(i7, (long) mo205004b());
        }
    }

    /* renamed from: a */
    public void mo205003a(boolean z) {
        AtomicBoolean atomicBoolean = this.f149978n;
        if (atomicBoolean == null) {
            this.f149978n = new AtomicBoolean(z);
        } else {
            atomicBoolean.set(z);
        }
        this.f149979o = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        long j;
        parcel.writeInt(this.f149966b);
        parcel.writeLong(this.f149967c);
        AtomicLong atomicLong = this.f149968d;
        if (atomicLong != null) {
            j = atomicLong.get();
        } else {
            j = 0;
        }
        parcel.writeLong(j);
        parcel.writeLong(this.f149969e);
        parcel.writeLong(this.f149970f);
        parcel.writeInt(this.f149971g);
        int i2 = -1;
        AtomicInteger atomicInteger = this.f149972h;
        if (atomicInteger != null) {
            i2 = atomicInteger.get();
        }
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public List<DownloadChunk> mo204996a(int i, long j) {
        DownloadChunk downloadChunk;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        DownloadChunk downloadChunk2 = this;
        int i2 = i;
        if (!mo205011d() || mo205014f()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long m = mo205021m();
        long c = downloadChunk2.mo205008c(true);
        long j8 = c / ((long) i2);
        C59990a.m232838b(f149965a, "retainLen:" + c + " divideChunkForReuse chunkSize:" + j8 + " current host downloadChunk index:" + downloadChunk2.f149971g);
        int i3 = 0;
        while (i3 < i2) {
            if (i3 == 0) {
                j4 = mo205020l();
                j6 = (m + j8) - 1;
            } else {
                int i4 = i2 - 1;
                if (i3 == i4) {
                    long p = mo205024p();
                    if (p > m) {
                        j7 = (p - m) + 1;
                    } else {
                        j7 = c - (((long) i4) * j8);
                    }
                    j5 = j7;
                    j3 = p;
                    j4 = m;
                    DownloadChunk a = new C60117a(downloadChunk2.f149966b).mo205033a((-i3) - 1).mo205034a(j4).mo205037b(m).mo205040e(m).mo205038c(j3).mo205039d(j5).mo205035a(downloadChunk2).mo205036a();
                    C59990a.m232838b(f149965a, "divide sub chunk : " + i3 + " startOffset:" + j4 + " curOffset:" + m + " endOffset:" + j3 + " contentLen:" + j5);
                    arrayList.add(a);
                    m += j8;
                    i3++;
                    downloadChunk2 = this;
                    i2 = i;
                    c = c;
                } else {
                    j6 = (m + j8) - 1;
                    j4 = m;
                }
            }
            j5 = j8;
            j3 = j6;
            DownloadChunk a2 = new C60117a(downloadChunk2.f149966b).mo205033a((-i3) - 1).mo205034a(j4).mo205037b(m).mo205040e(m).mo205038c(j3).mo205039d(j5).mo205035a(downloadChunk2).mo205036a();
            C59990a.m232838b(f149965a, "divide sub chunk : " + i3 + " startOffset:" + j4 + " curOffset:" + m + " endOffset:" + j3 + " contentLen:" + j5);
            arrayList.add(a2);
            m += j8;
            i3++;
            downloadChunk2 = this;
            i2 = i;
            c = c;
        }
        long j9 = 0;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            DownloadChunk downloadChunk3 = arrayList.get(size);
            if (downloadChunk3 != null) {
                j9 += downloadChunk3.mo205025q();
            }
        }
        C59990a.m232838b(f149965a, "reuseChunkContentLen:" + j9);
        DownloadChunk downloadChunk4 = arrayList.get(0);
        if (downloadChunk4 != null) {
            if (mo205024p() == 0) {
                j2 = j - mo205020l();
            } else {
                j2 = (mo205024p() - mo205020l()) + 1;
            }
            downloadChunk4.mo204998a(j2 - j9);
            downloadChunk = this;
            downloadChunk4.mo205009c(downloadChunk.f149971g);
            RunnableC60070b bVar = downloadChunk.f149979o;
            if (bVar != null) {
                bVar.mo204841a(downloadChunk4.mo205024p(), mo205025q() - j9);
            }
        } else {
            downloadChunk = this;
        }
        downloadChunk.mo205002a(arrayList);
        return arrayList;
    }
}
