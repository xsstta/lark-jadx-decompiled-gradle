package com.larksuite.component.ui.avatar.v2;

import com.larksuite.component.ui.avatar.AvatarModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/ui/avatar/v2/DocAvatar;", "Lcom/larksuite/component/ui/avatar/AvatarModel;", "builder", "Lcom/larksuite/component/ui/avatar/v2/DocAvatar$Builder;", "(Lcom/larksuite/component/ui/avatar/v2/DocAvatar$Builder;)V", "docType", "", "fileName", "", "(ILjava/lang/String;Lcom/larksuite/component/ui/avatar/v2/DocAvatar$Builder;)V", "getDocType", "()I", "getFileName", "()Ljava/lang/String;", "Builder", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.v2.e */
public final class DocAvatar extends AvatarModel {

    /* renamed from: c */
    private final int f62495c;

    /* renamed from: d */
    private final String f62496d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/ui/avatar/v2/DocAvatar$Builder;", "Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "()V", "docType", "", "getDocType$avatar_badge_release", "()I", "setDocType$avatar_badge_release", "(I)V", "fileName", "", "getFileName$avatar_badge_release", "()Ljava/lang/String;", "setFileName$avatar_badge_release", "(Ljava/lang/String;)V", "build", "Lcom/larksuite/component/ui/avatar/v2/DocAvatar;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.avatar.v2.e$a */
    public static final class Builder extends AvatarModel.Builder<Builder> {

        /* renamed from: a */
        private int f62497a;

        /* renamed from: b */
        private String f62498b;

        /* renamed from: l */
        public final int mo89099l() {
            return this.f62497a;
        }

        /* renamed from: m */
        public final String mo89100m() {
            return this.f62498b;
        }

        /* renamed from: n */
        public DocAvatar mo88976k() {
            return new DocAvatar(this, null);
        }

        /* renamed from: c */
        public final Builder mo89097c(int i) {
            Builder aVar = this;
            aVar.f62497a = i;
            return aVar;
        }

        /* renamed from: c */
        public final Builder mo89098c(String str) {
            Builder aVar = this;
            aVar.f62498b = str;
            return aVar;
        }
    }

    /* renamed from: i */
    public final int mo89095i() {
        return this.f62495c;
    }

    /* renamed from: j */
    public final String mo89096j() {
        return this.f62496d;
    }

    private DocAvatar(Builder aVar) {
        this(aVar.mo89099l(), aVar.mo89100m(), aVar);
    }

    public /* synthetic */ DocAvatar(Builder aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private DocAvatar(int i, String str, Builder aVar) {
        super(aVar);
        this.f62495c = i;
        this.f62496d = str;
    }
}
