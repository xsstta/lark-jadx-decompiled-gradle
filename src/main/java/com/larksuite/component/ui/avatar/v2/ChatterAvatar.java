package com.larksuite.component.ui.avatar.v2;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.component.ui.avatar.AvatarModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\n\u001a\u00020\u0003R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/larksuite/component/ui/avatar/v2/ChatterAvatar;", "Lcom/larksuite/component/ui/avatar/AvatarModel;", "builder", "Lcom/larksuite/component/ui/avatar/v2/ChatterAvatar$Builder;", "(Lcom/larksuite/component/ui/avatar/v2/ChatterAvatar$Builder;)V", "id", "", "(Ljava/lang/String;Lcom/larksuite/component/ui/avatar/v2/ChatterAvatar$Builder;)V", "getId", "()Ljava/lang/String;", "newBuilder", "Builder", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.v2.a */
public final class ChatterAvatar extends AvatarModel {

    /* renamed from: c */
    private final String f62488c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/larksuite/component/ui/avatar/v2/ChatterAvatar$Builder;", "Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "()V", "id", "", "getId$avatar_badge_release", "()Ljava/lang/String;", "setId$avatar_badge_release", "(Ljava/lang/String;)V", "build", "Lcom/larksuite/component/ui/avatar/v2/ChatterAvatar;", BottomDialog.f17198f, "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.avatar.v2.a$a */
    public static final class Builder extends AvatarModel.Builder<Builder> {

        /* renamed from: a */
        private String f62489a;

        /* renamed from: l */
        public final String mo89082l() {
            return this.f62489a;
        }

        /* renamed from: m */
        public ChatterAvatar mo88976k() {
            return new ChatterAvatar(this, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public final Builder mo89081c(String str) {
            Builder aVar = this;
            aVar.f62489a = str;
            return aVar;
        }
    }

    /* renamed from: j */
    public final String mo89080j() {
        return this.f62488c;
    }

    /* renamed from: i */
    public final Builder mo89079i() {
        Builder aVar = new Builder();
        ChatterAvatar aVar2 = this;
        aVar.mo89081c(aVar2.f62488c);
        aVar.mo88962a(aVar2.mo88945a());
        aVar.mo88967b(aVar2.mo88947b());
        aVar.mo88966b(aVar2.mo88948c());
        aVar.mo88965b(aVar2.mo88949d());
        aVar.mo88959a(aVar2.mo88950e());
        return aVar;
    }

    private ChatterAvatar(Builder aVar) {
        this(aVar.mo89082l(), aVar);
    }

    public /* synthetic */ ChatterAvatar(Builder aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private ChatterAvatar(String str, Builder aVar) {
        super(aVar);
        this.f62488c = str;
    }
}
