package com.ss.android.lark.mail.impl.home.menu;

import com.larksuite.arch.jack.State;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.mail.impl.home.menu.h */
public final class MailMenuState implements State {

    /* renamed from: a */
    private final boolean f108360a;

    /* renamed from: b */
    private final int f108361b;

    /* renamed from: c */
    private final List<C42585j> f108362c;

    /* renamed from: d */
    private final boolean f108363d;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mail.impl.home.menu.h */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ MailMenuState m169863a(MailMenuState hVar, boolean z, int i, List list, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = hVar.f108360a;
        }
        if ((i2 & 2) != 0) {
            i = hVar.f108361b;
        }
        if ((i2 & 4) != 0) {
            list = hVar.f108362c;
        }
        if ((i2 & 8) != 0) {
            z2 = hVar.f108363d;
        }
        return hVar.mo153055a(z, i, list, z2);
    }

    /* renamed from: a */
    public final MailMenuState mo153055a(boolean z, int i, List<? extends C42585j> list, boolean z2) {
        Intrinsics.checkParameterIsNotNull(list, "listItem");
        return new MailMenuState(z, i, list, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MailMenuState)) {
            return false;
        }
        MailMenuState hVar = (MailMenuState) obj;
        return this.f108360a == hVar.f108360a && this.f108361b == hVar.f108361b && Intrinsics.areEqual(this.f108362c, hVar.f108362c) && this.f108363d == hVar.f108363d;
    }

    public int hashCode() {
        boolean z = this.f108360a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = ((i2 * 31) + this.f108361b) * 31;
        List<C42585j> list = this.f108362c;
        int hashCode = (i5 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z2 = this.f108363d;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "MailMenuState(isShow=" + this.f108360a + ", loadingType=" + this.f108361b + ", listItem=" + this.f108362c + ", isShowPreviewCard=" + this.f108363d + ")";
    }

    /* renamed from: a */
    public final boolean mo153056a() {
        return this.f108360a;
    }

    /* renamed from: b */
    public final int mo153057b() {
        return this.f108361b;
    }

    /* renamed from: c */
    public final List<C42585j> mo153058c() {
        return this.f108362c;
    }

    /* renamed from: d */
    public final boolean mo153059d() {
        return this.f108363d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.lark.mail.impl.home.menu.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public MailMenuState(boolean z, int i, List<? extends C42585j> list, boolean z2) {
        Intrinsics.checkParameterIsNotNull(list, "listItem");
        this.f108360a = z;
        this.f108361b = i;
        this.f108362c = list;
        this.f108363d = z2;
    }
}
