package com.ss.android.lark.edu.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Lcom/ss/android/lark/edu/dto/ClassInfoResponse;", "", "()V", "classInfos", "", "Lcom/ss/android/lark/edu/dto/ClassInfo;", "getClassInfos", "()Ljava/util/List;", "setClassInfos", "(Ljava/util/List;)V", "errType", "", "getErrType", "()I", "setErrType", "(I)V", "errorMsg", "", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "offset", "getOffset", "setOffset", "success", "getSuccess", "setSuccess", "Companion", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.dto.a */
public final class ClassInfoResponse {

    /* renamed from: a */
    public static final Companion f95011a = new Companion(null);

    /* renamed from: b */
    private int f95012b;

    /* renamed from: c */
    private boolean f95013c;

    /* renamed from: d */
    private List<? extends ClassInfo> f95014d = CollectionsKt.emptyList();

    /* renamed from: e */
    private boolean f95015e = true;

    /* renamed from: f */
    private String f95016f;

    /* renamed from: g */
    private int f95017g = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/edu/dto/ClassInfoResponse$Companion;", "", "()V", "TYPE_ERROR", "", "TYPE_NO_PERMISSION", "TYPE_UNKNOWN", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.dto.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo136405a() {
        return this.f95012b;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.edu.dto.ClassInfo>, java.util.List<com.ss.android.lark.edu.dto.ClassInfo> */
    /* renamed from: c */
    public final List<ClassInfo> mo136413c() {
        return this.f95014d;
    }

    /* renamed from: d */
    public final boolean mo136414d() {
        return this.f95015e;
    }

    /* renamed from: e */
    public final String mo136415e() {
        return this.f95016f;
    }

    /* renamed from: f */
    public final int mo136416f() {
        return this.f95017g;
    }

    /* renamed from: b */
    public final boolean mo136412b() {
        return this.f95013c;
    }

    /* renamed from: b */
    public final void mo136410b(int i) {
        this.f95017g = i;
    }

    /* renamed from: a */
    public final void mo136406a(int i) {
        this.f95012b = i;
    }

    /* renamed from: b */
    public final void mo136411b(boolean z) {
        this.f95015e = z;
    }

    /* renamed from: a */
    public final void mo136407a(String str) {
        this.f95016f = str;
    }

    /* renamed from: a */
    public final void mo136408a(List<? extends ClassInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f95014d = list;
    }

    /* renamed from: a */
    public final void mo136409a(boolean z) {
        this.f95013c = z;
    }
}
