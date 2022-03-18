package com.zackratos.ultimatebarx.ultimatebarx.view;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/view/ActivityTag;", "Lcom/zackratos/ultimatebarx/ultimatebarx/view/Tag;", "()V", "navigationBarViewTag", "", "statusBarViewTag", "Companion", "Holder", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.f.a */
public final class ActivityTag implements Tag {

    /* renamed from: a */
    public static final Companion f171345a = new Companion(null);

    @Override // com.zackratos.ultimatebarx.ultimatebarx.view.Tag
    /* renamed from: a */
    public String mo237012a() {
        return "activity_status_bar";
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.view.Tag
    /* renamed from: b */
    public String mo237013b() {
        return "activity_navigation_bar";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/view/ActivityTag$Companion;", "", "()V", "getInstance", "Lcom/zackratos/ultimatebarx/ultimatebarx/view/ActivityTag;", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.f.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final ActivityTag mo237014a() {
            return Holder.f171346a.mo237015a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/view/ActivityTag$Holder;", "", "()V", "INSTANCE", "Lcom/zackratos/ultimatebarx/ultimatebarx/view/ActivityTag;", "getINSTANCE", "()Lcom/zackratos/ultimatebarx/ultimatebarx/view/ActivityTag;", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.f.a$b */
    private static final class Holder {

        /* renamed from: a */
        public static final Holder f171346a = new Holder();

        /* renamed from: b */
        private static final ActivityTag f171347b = new ActivityTag(null);

        private Holder() {
        }

        /* renamed from: a */
        public final ActivityTag mo237015a() {
            return f171347b;
        }
    }

    private ActivityTag() {
    }

    public /* synthetic */ ActivityTag(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
