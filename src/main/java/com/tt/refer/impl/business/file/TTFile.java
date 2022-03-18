package com.tt.refer.impl.business.file;

import android.net.Uri;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.io.File;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u0003J\u0006\u0010\u000e\u001a\u00020\u0003J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0012J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tt/refer/impl/business/file/TTFile;", "", "rawPath", "", "(Ljava/lang/String;)V", "getRawPath", "()Ljava/lang/String;", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "getChild", "child", "getExtension", "getName", "getParent", "getPath", "isInValid", "", "isPkgFile", "isTTFileScheme", "isTempFile", "isUserFile", "toString", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.file.g */
public final class TTFile {

    /* renamed from: a */
    public static final TTFile f171099a = new TTFile("ttfile://user");

    /* renamed from: b */
    public static final TTFile f171100b = new TTFile("ttfile://temp");

    /* renamed from: c */
    public static final Companion f171101c = new Companion(null);

    /* renamed from: d */
    private final Uri f171102d;

    /* renamed from: e */
    private final String f171103e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tt/refer/impl/business/file/TTFile$Companion;", "", "()V", "TAG", "", "TEMP", "Lcom/tt/refer/impl/business/file/TTFile;", "TEMP_TYPE", "USER", "USER_TYPE", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo235647a() {
        return this.f171103e;
    }

    /* renamed from: h */
    public final String mo235654h() {
        return this.f171102d.getEncodedPath();
    }

    /* renamed from: c */
    public final boolean mo235649c() {
        return Intrinsics.areEqual(this.f171102d.getScheme(), "ttfile");
    }

    /* renamed from: d */
    public final boolean mo235650d() {
        if (mo235651e() || mo235652f() || mo235653g()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo235652f() {
        if (!Intrinsics.areEqual("ttfile", this.f171102d.getScheme()) || !Intrinsics.areEqual("user", this.f171102d.getEncodedAuthority())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo235653g() {
        if (!Intrinsics.areEqual("ttfile", this.f171102d.getScheme()) || !Intrinsics.areEqual("temp", this.f171102d.getEncodedAuthority())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo235651e() {
        boolean z;
        if (this.f171102d.getScheme() == null && this.f171102d.getEncodedAuthority() == null) {
            String encodedPath = this.f171102d.getEncodedPath();
            if (encodedPath == null || encodedPath.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final String mo235655i() {
        String str = "";
        if (mo235650d()) {
            return str;
        }
        String encodedPath = this.f171102d.getEncodedPath();
        if (encodedPath != null) {
            str = encodedPath;
        }
        String name = new File(str).getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "File(uri.encodedPath ?: \"\").name");
        return name;
    }

    /* renamed from: j */
    public final String mo235656j() {
        int lastIndexOf$default;
        if (mo235650d() || (lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) this.f171103e, ".", 0, false, 6, (Object) null)) == -1 || lastIndexOf$default == 0) {
            return "";
        }
        String str = this.f171103e;
        int i = lastIndexOf$default + 1;
        int length = str.length();
        if (str != null) {
            String substring = str.substring(i, length);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public String toString() {
        return "TTFile(rawPath=" + this.f171103e + ", uri=" + this.f171102d + ')';
    }

    /* renamed from: b */
    public final TTFile mo235648b() {
        boolean z;
        if (mo235650d()) {
            return null;
        }
        String encodedPath = this.f171102d.getEncodedPath();
        if (encodedPath == null) {
            encodedPath = "";
        }
        String parent = new File(encodedPath).getParent();
        String str = parent;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        AppBrandLogger.m52830i("TTFile", "parent:" + parent);
        return new TTFile(new Uri.Builder().scheme(this.f171102d.getScheme()).encodedAuthority(this.f171102d.getEncodedAuthority()).encodedPath(parent).build().toString());
    }

    public TTFile(String str) {
        Uri parse = Uri.parse(str == null ? "" : str);
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(rawPath ?: \"\")");
        this.f171102d = parse;
        String uri = parse.toString();
        Intrinsics.checkExpressionValueIsNotNull(uri, "uri.toString()");
        this.f171103e = uri;
    }

    /* renamed from: a */
    public final TTFile mo235646a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "child");
        if (mo235650d()) {
            return null;
        }
        return new TTFile(new Uri.Builder().scheme(this.f171102d.getScheme()).encodedAuthority(this.f171102d.getEncodedAuthority()).encodedPath(new File(this.f171102d.getEncodedPath(), str).getAbsolutePath()).build().toString());
    }
}
