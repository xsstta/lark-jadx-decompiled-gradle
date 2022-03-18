package com.ss.android.socialbase.downloader.db;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.ss.android.socialbase.downloader.utils.C60172f;

/* renamed from: com.ss.android.socialbase.downloader.db.d */
public class C60022d {

    /* renamed from: a */
    private final SQLiteDatabase f149659a;

    /* renamed from: b */
    private final String f149660b;

    /* renamed from: c */
    private final String[] f149661c;

    /* renamed from: d */
    private final String[] f149662d;

    /* renamed from: e */
    private SQLiteStatement f149663e;

    /* renamed from: f */
    private SQLiteStatement f149664f;

    /* renamed from: g */
    private SQLiteStatement f149665g;

    /* renamed from: a */
    public SQLiteStatement mo204379a() {
        if (this.f149663e == null) {
            SQLiteStatement compileStatement = this.f149659a.compileStatement(C60172f.m233881a("INSERT INTO ", this.f149660b, this.f149661c));
            synchronized (this) {
                if (this.f149663e == null) {
                    this.f149663e = compileStatement;
                }
            }
            if (this.f149663e != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f149663e;
    }

    /* renamed from: b */
    public SQLiteStatement mo204380b() {
        if (this.f149665g == null) {
            SQLiteStatement compileStatement = this.f149659a.compileStatement(C60172f.m233882a(this.f149660b, this.f149662d));
            synchronized (this) {
                if (this.f149665g == null) {
                    this.f149665g = compileStatement;
                }
            }
            if (this.f149665g != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f149665g;
    }

    /* renamed from: c */
    public SQLiteStatement mo204381c() {
        if (this.f149664f == null) {
            SQLiteStatement compileStatement = this.f149659a.compileStatement(C60172f.m233883a(this.f149660b, this.f149661c, this.f149662d));
            synchronized (this) {
                if (this.f149664f == null) {
                    this.f149664f = compileStatement;
                }
            }
            if (this.f149664f != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f149664f;
    }

    public C60022d(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.f149659a = sQLiteDatabase;
        this.f149660b = str;
        this.f149661c = strArr;
        this.f149662d = strArr2;
    }
}
