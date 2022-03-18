package com.zackratos.ultimatebarx.ultimatebarx.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/view/BaseCreator;", "Lcom/zackratos/ultimatebarx/ultimatebarx/view/Creator;", "tag", "Lcom/zackratos/ultimatebarx/ultimatebarx/view/Tag;", "landscape", "", "(Lcom/zackratos/ultimatebarx/ultimatebarx/view/Tag;Z)V", "getLandscape", "()Z", "getTag", "()Lcom/zackratos/ultimatebarx/ultimatebarx/view/Tag;", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.f.b */
public abstract class BaseCreator implements Creator {

    /* renamed from: a */
    private final Tag f171348a;

    /* renamed from: b */
    private final boolean f171349b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Tag mo237016a() {
        return this.f171348a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo237017b() {
        return this.f171349b;
    }

    public BaseCreator(Tag gVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(gVar, "tag");
        this.f171348a = gVar;
        this.f171349b = z;
    }
}
