package com.ss.android.lark.widget.photo_picker_impl.bean;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0000H\u0016J\b\u0010*\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0000H\u0016J\b\u0010,\u001a\u00020(H\u0016J\b\u0010-\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000e¨\u0006."}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "", "()V", "dirName", "", "getDirName", "()Ljava/lang/String;", "setDirName", "(Ljava/lang/String;)V", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "height", "getHeight", "setHeight", "id", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "mimeType", "getMimeType", "setMimeType", "path", "getPath", "setPath", "size", "", "getSize", "()J", "setSize", "(J)V", "width", "getWidth", "setWidth", "isContentSame", "", "other", "isGif", "isItemSame", "isVideo", "toString", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.b.b */
public class Photo {

    /* renamed from: a */
    private Integer f145735a;

    /* renamed from: b */
    private String f145736b;

    /* renamed from: c */
    private String f145737c;

    /* renamed from: d */
    private String f145738d;

    /* renamed from: e */
    private int f145739e;

    /* renamed from: f */
    private int f145740f;

    /* renamed from: g */
    private long f145741g;

    /* renamed from: h */
    private int f145742h;

    /* renamed from: a */
    public final Integer mo199589a() {
        return this.f145735a;
    }

    /* renamed from: b */
    public final String mo199595b() {
        return this.f145736b;
    }

    /* renamed from: c */
    public final String mo199599c() {
        return this.f145737c;
    }

    /* renamed from: d */
    public final int mo199602d() {
        return this.f145739e;
    }

    /* renamed from: e */
    public final int mo199603e() {
        return this.f145740f;
    }

    /* renamed from: f */
    public final long mo199604f() {
        return this.f145741g;
    }

    /* renamed from: g */
    public final int mo199605g() {
        return this.f145742h;
    }

    /* renamed from: h */
    public boolean mo199606h() {
        if (TextUtils.isEmpty(this.f145737c)) {
            return false;
        }
        String str = this.f145737c;
        if (str == null) {
            Intrinsics.throwNpe();
        }
        if (StringsKt.startsWith$default(str, "video", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo199607i() {
        if (TextUtils.isEmpty(this.f145737c) || !StringsKt.equals$default(this.f145737c, "image/gif", false, 2, null)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Photo(id=" + this.f145735a + ", path=" + this.f145736b + ", mimeType=" + this.f145737c + ", dirName=" + this.f145738d + ", width=" + this.f145739e + ", height=" + this.f145740f + ", size=" + this.f145741g + ", duration=" + this.f145742h + ')';
    }

    /* renamed from: a */
    public final void mo199590a(int i) {
        this.f145739e = i;
    }

    /* renamed from: b */
    public final void mo199596b(int i) {
        this.f145740f = i;
    }

    /* renamed from: c */
    public final void mo199600c(int i) {
        this.f145742h = i;
    }

    /* renamed from: a */
    public final void mo199591a(long j) {
        this.f145741g = j;
    }

    /* renamed from: b */
    public final void mo199597b(String str) {
        this.f145737c = str;
    }

    /* renamed from: c */
    public final void mo199601c(String str) {
        this.f145738d = str;
    }

    /* renamed from: a */
    public final void mo199592a(Integer num) {
        this.f145735a = num;
    }

    /* renamed from: b */
    public boolean mo199598b(Photo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "other");
        return Intrinsics.areEqual(this.f145735a, bVar.f145735a);
    }

    /* renamed from: a */
    public final void mo199593a(String str) {
        this.f145736b = str;
    }

    /* renamed from: a */
    public boolean mo199594a(Photo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "other");
        if (this == bVar) {
            return true;
        }
        return false;
    }
}
