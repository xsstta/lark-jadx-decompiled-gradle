package com.ss.android.lark.keyboard.plugin.tool.aa;

import com.ss.android.lark.keyboard.plugin.tool.aa.widget.TextSelector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u000e\u0010\u0017\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0018J\u000e\u0010\u0019\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u001aJ\u000e\u0010\u001b\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u001cJ\u000e\u0010\u001d\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b\u001eJ\u000e\u0010\u001f\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b J\u000e\u0010!\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b\"JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\n\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPluginSnapshot;", "", "editorType", "", "startType", "", "textSelector", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/TextSelector;", "isEnabled", "", "isVisible", "isStarted", "(Ljava/lang/String;ILcom/ss/android/lark/keyboard/plugin/tool/aa/widget/TextSelector;ZZZ)V", "getEditorType$im_keyboard_release", "()Ljava/lang/String;", "isEnabled$im_keyboard_release", "()Z", "isStarted$im_keyboard_release", "isVisible$im_keyboard_release", "getStartType$im_keyboard_release", "()I", "getTextSelector$im_keyboard_release", "()Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/TextSelector;", "component1", "component1$im_keyboard_release", "component2", "component2$im_keyboard_release", "component3", "component3$im_keyboard_release", "component4", "component4$im_keyboard_release", "component5", "component5$im_keyboard_release", "component6", "component6$im_keyboard_release", "copy", "equals", "other", "hashCode", "toString", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.b */
public final class AaStyleKBPluginSnapshot {

    /* renamed from: a */
    private final String f103711a;

    /* renamed from: b */
    private final int f103712b;

    /* renamed from: c */
    private final TextSelector f103713c;

    /* renamed from: d */
    private final boolean f103714d;

    /* renamed from: e */
    private final boolean f103715e;

    /* renamed from: f */
    private final boolean f103716f;

    public AaStyleKBPluginSnapshot() {
        this(null, 0, null, false, false, false, 63, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AaStyleKBPluginSnapshot)) {
            return false;
        }
        AaStyleKBPluginSnapshot bVar = (AaStyleKBPluginSnapshot) obj;
        return Intrinsics.areEqual(this.f103711a, bVar.f103711a) && this.f103712b == bVar.f103712b && Intrinsics.areEqual(this.f103713c, bVar.f103713c) && this.f103714d == bVar.f103714d && this.f103715e == bVar.f103715e && this.f103716f == bVar.f103716f;
    }

    public int hashCode() {
        String str = this.f103711a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f103712b) * 31;
        TextSelector dVar = this.f103713c;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f103714d;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.f103715e;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f103716f;
        if (!z3) {
            i3 = z3 ? 1 : 0;
        }
        return i11 + i3;
    }

    public String toString() {
        return "AaStyleKBPluginSnapshot(editorType=" + this.f103711a + ", startType=" + this.f103712b + ", textSelector=" + this.f103713c + ", isEnabled=" + this.f103714d + ", isVisible=" + this.f103715e + ", isStarted=" + this.f103716f + ")";
    }

    /* renamed from: a */
    public final String mo147337a() {
        return this.f103711a;
    }

    /* renamed from: b */
    public final boolean mo147338b() {
        return this.f103714d;
    }

    /* renamed from: c */
    public final boolean mo147339c() {
        return this.f103715e;
    }

    /* renamed from: d */
    public final boolean mo147340d() {
        return this.f103716f;
    }

    public AaStyleKBPluginSnapshot(String str, int i, TextSelector dVar, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(str, "editorType");
        Intrinsics.checkParameterIsNotNull(dVar, "textSelector");
        this.f103711a = str;
        this.f103712b = i;
        this.f103713c = dVar;
        this.f103714d = z;
        this.f103715e = z2;
        this.f103716f = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AaStyleKBPluginSnapshot(java.lang.String r5, int r6, com.ss.android.lark.keyboard.plugin.tool.aa.widget.TextSelector r7, boolean r8, boolean r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = "no_editor"
        L_0x0006:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L_0x000d
            r12 = 0
            goto L_0x000e
        L_0x000d:
            r12 = r6
        L_0x000e:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0017
            com.ss.android.lark.keyboard.plugin.tool.a.b.d r7 = new com.ss.android.lark.keyboard.plugin.tool.a.b.d
            r7.<init>()
        L_0x0017:
            r1 = r7
            r6 = r11 & 8
            r7 = 1
            if (r6 == 0) goto L_0x001f
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r2 = r8
        L_0x0020:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = r9
        L_0x0027:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r0 = r10
        L_0x002d:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPluginSnapshot.<init>(java.lang.String, int, com.ss.android.lark.keyboard.plugin.tool.a.b.d, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
