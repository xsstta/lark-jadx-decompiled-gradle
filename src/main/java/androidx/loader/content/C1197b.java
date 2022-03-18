package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.C0750a;
import androidx.core.os.C0797c;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.C1198c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: androidx.loader.content.b */
public class C1197b extends AbstractC1195a<Cursor> {

    /* renamed from: f */
    final C1198c<Cursor>.C1199a f4341f = new C1198c.C1199a();

    /* renamed from: g */
    Uri f4342g;

    /* renamed from: h */
    String[] f4343h;

    /* renamed from: i */
    String f4344i;

    /* renamed from: j */
    String[] f4345j;

    /* renamed from: k */
    String f4346k;

    /* renamed from: l */
    Cursor f4347l;

    /* renamed from: m */
    C0797c f4348m;

    /* access modifiers changed from: protected */
    @Override // androidx.loader.content.C1198c
    /* renamed from: j */
    public void mo6117j() {
        mo6129r();
    }

    @Override // androidx.loader.content.AbstractC1195a
    /* renamed from: f */
    public void mo6103f() {
        super.mo6103f();
        synchronized (this) {
            C0797c cVar = this.f4348m;
            if (cVar != null) {
                cVar.mo4388c();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.content.C1198c
    /* renamed from: i */
    public void mo6116i() {
        Cursor cursor = this.f4347l;
        if (cursor != null) {
            mo6112b(cursor);
        }
        if (mo6136x() || this.f4347l == null) {
            mo6130s();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.content.C1198c
    /* renamed from: k */
    public void mo6118k() {
        super.mo6118k();
        mo6117j();
        Cursor cursor = this.f4347l;
        if (cursor != null && !cursor.isClosed()) {
            this.f4347l.close();
        }
        this.f4347l = null;
    }

    /* renamed from: h */
    public Cursor mo6101d() {
        synchronized (this) {
            if (!mo6104g()) {
                this.f4348m = new C0797c();
            } else {
                throw new OperationCanceledException();
            }
        }
        try {
            Cursor a = C0750a.m3634a(mo6124m().getContentResolver(), this.f4342g, this.f4343h, this.f4344i, this.f4345j, this.f4346k, this.f4348m);
            if (a != null) {
                try {
                    a.getCount();
                    a.registerContentObserver(this.f4341f);
                } catch (RuntimeException e) {
                    a.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.f4348m = null;
            }
            return a;
        } catch (Throwable th) {
            synchronized (this) {
                this.f4348m = null;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo6108a(Uri uri) {
        this.f4342g = uri;
    }

    /* renamed from: b */
    public void mo6113b(String str) {
        this.f4346k = str;
    }

    public C1197b(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo6109a(String str) {
        this.f4344i = str;
    }

    /* renamed from: b */
    public void mo6096a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: a */
    public void mo6110a(String[] strArr) {
        this.f4343h = strArr;
    }

    /* renamed from: b */
    public void mo6114b(String[] strArr) {
        this.f4345j = strArr;
    }

    /* renamed from: a */
    public void mo6112b(Cursor cursor) {
        if (!mo6127p()) {
            Cursor cursor2 = this.f4347l;
            this.f4347l = cursor;
            if (mo6125n()) {
                super.mo6112b((Object) cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    @Override // androidx.loader.content.C1198c, androidx.loader.content.AbstractC1195a
    /* renamed from: a */
    public void mo6097a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo6097a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f4342g);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f4343h));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f4344i);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f4345j));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f4346k);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f4347l);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f4356u);
    }

    public C1197b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f4342g = uri;
        this.f4343h = strArr;
        this.f4344i = str;
        this.f4345j = strArr2;
        this.f4346k = str2;
    }
}
