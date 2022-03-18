package com.ss.android.lark.profile.v2.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/TextStyle;", "", "()V", "color", "", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "expandable", "", "getExpandable", "()Z", "setExpandable", "(Z)V", "maxLines", "", "getMaxLines", "()I", "setMaxLines", "(I)V", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.v2.entity.a */
public final class TextStyle {

    /* renamed from: a */
    private int f130755a;

    /* renamed from: b */
    private boolean f130756b;

    /* renamed from: c */
    private String f130757c = "0";

    /* renamed from: a */
    public final int mo180729a() {
        return this.f130755a;
    }

    /* renamed from: b */
    public final boolean mo180733b() {
        return this.f130756b;
    }

    /* renamed from: c */
    public final String mo180734c() {
        return this.f130757c;
    }

    /* renamed from: a */
    public final void mo180730a(int i) {
        this.f130755a = i;
    }

    /* renamed from: a */
    public final void mo180731a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f130757c = str;
    }

    /* renamed from: a */
    public final void mo180732a(boolean z) {
        this.f130756b = z;
    }
}
