package com.bytedance.ee.bear.block.jira;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u001bJ\u001a\u0010\u001c\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u001bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/JiraConfig;", "", "()V", "enableIntercept", "", "getEnableIntercept", "()Z", "setEnableIntercept", "(Z)V", "jiraDomain", "", "", "getJiraDomain", "()Ljava/util/List;", "setJiraDomain", "(Ljava/util/List;)V", "jiraPackageName", "getJiraPackageName", "()Ljava/lang/String;", "setJiraPackageName", "(Ljava/lang/String;)V", "jiraTopDomain", "getJiraTopDomain", "setJiraTopDomain", "domain", "", "build", "Lkotlin/Function0;", "topDomain", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.block.jira.b */
public final class JiraConfig {

    /* renamed from: a */
    private String f14450a = "";

    /* renamed from: b */
    private boolean f14451b;

    /* renamed from: c */
    private List<String> f14452c = new ArrayList();

    /* renamed from: d */
    private List<String> f14453d = new ArrayList();

    /* renamed from: a */
    public final String mo19282a() {
        return this.f14450a;
    }

    /* renamed from: b */
    public final boolean mo19287b() {
        return this.f14451b;
    }

    /* renamed from: c */
    public final List<String> mo19288c() {
        return this.f14452c;
    }

    /* renamed from: d */
    public final List<String> mo19289d() {
        return this.f14453d;
    }

    /* renamed from: a */
    public final void mo19283a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14450a = str;
    }

    /* renamed from: a */
    public final void mo19285a(boolean z) {
        this.f14451b = z;
    }

    /* renamed from: a */
    public final void mo19284a(Function0<? extends List<String>> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "build");
        this.f14452c.addAll((List) function0.invoke());
    }

    /* renamed from: b */
    public final void mo19286b(Function0<? extends List<String>> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "build");
        this.f14453d.addAll((List) function0.invoke());
    }
}
