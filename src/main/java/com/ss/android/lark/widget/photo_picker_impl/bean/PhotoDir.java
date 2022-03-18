package com.ss.android.lark.widget.photo_picker_impl.bean;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\nH\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "", "()V", "coverPhotoPath", "", "getCoverPhotoPath", "()Ljava/lang/String;", "setCoverPhotoPath", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "name", "getName", "setName", "paths", "", "getPaths", "()Ljava/util/Set;", "photoCount", "getPhotoCount", "setPhotoCount", "hashCode", "toString", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.b.c */
public final class PhotoDir {

    /* renamed from: a */
    private int f145743a = 4096;

    /* renamed from: b */
    private String f145744b = "";

    /* renamed from: c */
    private final Set<String> f145745c = new LinkedHashSet();

    /* renamed from: d */
    private int f145746d;

    /* renamed from: e */
    private String f145747e = "";

    /* renamed from: a */
    public final int mo199609a() {
        return this.f145743a;
    }

    /* renamed from: b */
    public final String mo199612b() {
        return this.f145744b;
    }

    /* renamed from: c */
    public final Set<String> mo199615c() {
        return this.f145745c;
    }

    /* renamed from: d */
    public final int mo199616d() {
        return this.f145746d;
    }

    /* renamed from: e */
    public final String mo199617e() {
        return this.f145747e;
    }

    public int hashCode() {
        return this.f145744b.hashCode();
    }

    public String toString() {
        return "PhotoDir(name='" + this.f145744b + "', paths=" + this.f145745c + ", photoCount=" + this.f145746d + ", coverPhotoPath='" + this.f145747e + "')";
    }

    /* renamed from: a */
    public final void mo199610a(int i) {
        this.f145743a = i;
    }

    /* renamed from: b */
    public final void mo199613b(int i) {
        this.f145746d = i;
    }

    /* renamed from: a */
    public final void mo199611a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f145744b = str;
    }

    /* renamed from: b */
    public final void mo199614b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f145747e = str;
    }
}
