package com.larksuite.component.ui.badge.miniicon;

import android.graphics.drawable.Drawable;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.AvatarType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/larksuite/component/ui/badge/miniicon/MiniIconModel;", "", "avatarType", "Lcom/larksuite/component/ui/avatar/AvatarType;", "placeHolder", "Landroid/graphics/drawable/Drawable;", "(Lcom/larksuite/component/ui/avatar/AvatarType;Landroid/graphics/drawable/Drawable;)V", "getAvatarType", "()Lcom/larksuite/component/ui/avatar/AvatarType;", "miniAvatarKey", "", "getMiniAvatarKey", "()Ljava/lang/String;", "setMiniAvatarKey", "(Ljava/lang/String;)V", "getPlaceHolder", "()Landroid/graphics/drawable/Drawable;", "size", "Lcom/larksuite/component/ui/avatar/AvatarModel$Size;", "getSize", "()Lcom/larksuite/component/ui/avatar/AvatarModel$Size;", "setSize", "(Lcom/larksuite/component/ui/avatar/AvatarModel$Size;)V", "iconKey", "key", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.a.a.e */
public class MiniIconModel {

    /* renamed from: a */
    private String f62366a;

    /* renamed from: b */
    private AvatarModel.Size f62367b;

    /* renamed from: c */
    private final AvatarType f62368c;

    /* renamed from: d */
    private final Drawable f62369d;

    public MiniIconModel() {
        this(null, null, 3, null);
    }

    public MiniIconModel(AvatarType avatarType) {
        this(avatarType, null, 2, null);
    }

    /* renamed from: b */
    public final String mo88917b() {
        return this.f62366a;
    }

    /* renamed from: c */
    public final AvatarModel.Size mo88918c() {
        return this.f62367b;
    }

    /* renamed from: d */
    public final AvatarType mo88919d() {
        return this.f62368c;
    }

    /* renamed from: e */
    public final Drawable mo88920e() {
        return this.f62369d;
    }

    /* renamed from: a */
    public final MiniIconModel mo88916a(String str) {
        MiniIconModel eVar = this;
        eVar.f62366a = str;
        return eVar;
    }

    public MiniIconModel(AvatarType avatarType, Drawable drawable) {
        this.f62368c = avatarType;
        this.f62369d = drawable;
        this.f62367b = AvatarModel.Size.MINI;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MiniIconModel(AvatarType avatarType, Drawable drawable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AvatarType.UNKNOWN : avatarType, (i & 2) != 0 ? null : drawable);
    }
}
