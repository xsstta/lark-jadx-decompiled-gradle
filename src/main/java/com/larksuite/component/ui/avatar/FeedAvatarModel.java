package com.larksuite.component.ui.avatar;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014¨\u0006*"}, d2 = {"Lcom/larksuite/component/ui/avatar/FeedAvatarModel;", "", "()V", "avatarKey", "", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "entityId", "getEntityId", "setEntityId", "fsUnit", "getFsUnit", "setFsUnit", "height", "", "getHeight", "()I", "setHeight", "(I)V", "isUrgent", "", "()Z", "setUrgent", "(Z)V", "keyType", "Lcom/larksuite/component/ui/avatar/ImageKeyType;", "getKeyType", "()Lcom/larksuite/component/ui/avatar/ImageKeyType;", "setKeyType", "(Lcom/larksuite/component/ui/avatar/ImageKeyType;)V", "placeHolder", "Landroid/graphics/drawable/Drawable;", "getPlaceHolder", "()Landroid/graphics/drawable/Drawable;", "setPlaceHolder", "(Landroid/graphics/drawable/Drawable;)V", "width", "getWidth", "setWidth", "Builder", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.g */
public class FeedAvatarModel {

    /* renamed from: a */
    private String f62430a;

    /* renamed from: b */
    private String f62431b;

    /* renamed from: c */
    private ImageKeyType f62432c = ImageKeyType.IMAGE;

    /* renamed from: d */
    private Drawable f62433d;

    /* renamed from: e */
    private int f62434e = -1;

    /* renamed from: f */
    private int f62435f = -1;

    /* renamed from: g */
    private String f62436g;

    /* renamed from: h */
    private boolean f62437h;

    /* renamed from: c */
    public final String mo89009c() {
        return this.f62430a;
    }

    /* renamed from: d */
    public final String mo89012d() {
        return this.f62431b;
    }

    /* renamed from: e */
    public final ImageKeyType mo89013e() {
        return this.f62432c;
    }

    /* renamed from: f */
    public final Drawable mo89014f() {
        return this.f62433d;
    }

    /* renamed from: g */
    public final int mo89015g() {
        return this.f62434e;
    }

    /* renamed from: h */
    public final int mo89016h() {
        return this.f62435f;
    }

    /* renamed from: i */
    public final String mo89017i() {
        return this.f62436g;
    }

    /* renamed from: j */
    public final boolean mo89018j() {
        return this.f62437h;
    }

    /* renamed from: b */
    public final void mo89007b(int i) {
        this.f62434e = i;
    }

    /* renamed from: a */
    public final void mo89006a(ImageKeyType imageKeyType) {
        Intrinsics.checkParameterIsNotNull(imageKeyType, "<set-?>");
        this.f62432c = imageKeyType;
    }

    /* renamed from: b */
    public final void mo89008b(String str) {
        this.f62430a = str;
    }

    /* renamed from: c */
    public final void mo89010c(int i) {
        this.f62435f = i;
    }

    /* renamed from: c */
    public final void mo89011c(String str) {
        this.f62431b = str;
    }
}
