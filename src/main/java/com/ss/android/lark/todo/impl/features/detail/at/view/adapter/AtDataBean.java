package com.ss.android.lark.todo.impl.features.detail.at.view.adapter;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtDataBean;", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean;", BottomDialog.f17198f, "", "title", "desc", "avatarKey", ShareHitPoint.f121868c, "", "isCrossTenant", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getAvatarKey", "()Ljava/lang/String;", "getChatterId", "getDesc", "setDesc", "(Ljava/lang/String;)V", "id", "getId", "setId", "()Z", "getTitle", ShareHitPoint.f121869d, "getType", "()I", "setType", "(I)V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.a */
public final class AtDataBean extends AtBean {

    /* renamed from: a */
    private String f139672a;

    /* renamed from: b */
    private int f139673b = 1;

    /* renamed from: c */
    private final String f139674c;

    /* renamed from: d */
    private final String f139675d;

    /* renamed from: e */
    private String f139676e;

    /* renamed from: f */
    private final String f139677f;

    /* renamed from: g */
    private final boolean f139678g;

    @Override // com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtBean
    /* renamed from: a */
    public String mo192272a() {
        return this.f139672a;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtBean
    /* renamed from: b */
    public int mo192273b() {
        return this.f139673b;
    }

    /* renamed from: d */
    public final String mo192276d() {
        return this.f139674c;
    }

    /* renamed from: e */
    public final String mo192277e() {
        return this.f139675d;
    }

    /* renamed from: f */
    public final String mo192278f() {
        return this.f139676e;
    }

    /* renamed from: g */
    public final String mo192279g() {
        return this.f139677f;
    }

    /* renamed from: h */
    public final boolean mo192280h() {
        return this.f139678g;
    }

    /* renamed from: a */
    public final void mo192275a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f139676e = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AtDataBean(String str, String str2, String str3, String str4, int i, boolean z) {
        super(i);
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "title");
        Intrinsics.checkParameterIsNotNull(str3, "desc");
        Intrinsics.checkParameterIsNotNull(str4, "avatarKey");
        this.f139674c = str;
        this.f139675d = str2;
        this.f139676e = str3;
        this.f139677f = str4;
        this.f139678g = z;
        this.f139672a = str;
    }
}
