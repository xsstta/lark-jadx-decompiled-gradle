package com.larksuite.component.ui.avatar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.p1153e.C25653b;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0003+,-B\u0013\b\u0014\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004B_\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u0004\u0018\u00010\u00062\u0006\u0010(\u001a\u00020)R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006."}, d2 = {"Lcom/larksuite/component/ui/avatar/AvatarModel;", "", "builder", "Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "(Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;)V", "avatarDrawable", "Landroid/graphics/drawable/Drawable;", "avatarRes", "", "avatarKey", "", "entityId", "placeHolder", "placeHolderRes", "size", "Lcom/larksuite/component/ui/avatar/AvatarModel$Size;", "async", "", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "(Landroid/graphics/drawable/Drawable;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ILcom/larksuite/component/ui/avatar/AvatarModel$Size;ZLcom/ss/android/lark/appreciablelib/Biz;Lcom/ss/android/lark/appreciablelib/Scene;)V", "getAsync", "()Z", "getAvatarDrawable", "()Landroid/graphics/drawable/Drawable;", "getAvatarKey", "()Ljava/lang/String;", "getAvatarRes", "()I", "getBiz", "()Lcom/ss/android/lark/appreciablelib/Biz;", "getEntityId", "getPlaceHolder", "getPlaceHolderRes", "getScene", "()Lcom/ss/android/lark/appreciablelib/Scene;", "getSize", "()Lcom/larksuite/component/ui/avatar/AvatarModel$Size;", "context", "Landroid/content/Context;", "getPlaceholder", "Builder", "Companion", "Size", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
public class AvatarModel {

    /* renamed from: a */
    public static final int f62391a = Color.parseColor("#EFF0F1");

    /* renamed from: b */
    public static final Companion f62392b = new Companion(null);

    /* renamed from: c */
    private final Drawable f62393c;

    /* renamed from: d */
    private final int f62394d;

    /* renamed from: e */
    private final String f62395e;

    /* renamed from: f */
    private final String f62396f;

    /* renamed from: g */
    private final Drawable f62397g;

    /* renamed from: h */
    private final int f62398h;

    /* renamed from: i */
    private final Size f62399i;

    /* renamed from: j */
    private final boolean f62400j;

    /* renamed from: k */
    private final Biz f62401k;

    /* renamed from: l */
    private final Scene f62402l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/ui/avatar/AvatarModel$Size;", "", "dpValue", "", "(Ljava/lang/String;II)V", "getDpValue", "()I", "getPxValue", "context", "Landroid/content/Context;", "MINI", "SMALL", "MIDDLE", "LARGE", "ORIGIN", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Size {
        MINI(22),
        SMALL(30),
        MIDDLE(48),
        LARGE(LocationRequest.PRIORITY_INDOOR),
        ORIGIN(-1);
        
        private final int dpValue;

        public final int getDpValue() {
            return this.dpValue;
        }

        public final int getPxValue(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return (int) C25653b.m91892a(context, (float) this.dpValue);
        }

        private Size(int i) {
            this.dpValue = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u00107J\u0015\u0010\u0010\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u00108J\u0013\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020;H\u0016J\u0015\u0010<\u001a\u00028\u00002\b\u0010<\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010=J\u0013\u0010<\u001a\u00028\u00002\u0006\u0010>\u001a\u00020\u0017¢\u0006\u0002\u0010?J\u0015\u0010\"\u001a\u00028\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u00108J\u0015\u0010%\u001a\u00028\u00002\b\u0010%\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010=J\u0013\u0010%\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u0017¢\u0006\u0002\u0010?J\u0013\u0010+\u001a\u00028\u00002\u0006\u0010+\u001a\u00020,¢\u0006\u0002\u0010@J\u0013\u00101\u001a\u00028\u00002\u0006\u00101\u001a\u000202¢\u0006\u0002\u0010AR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001c\u0010%\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR\u001a\u0010(\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001a\u0010+\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006B"}, d2 = {"Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "T", "", "()V", "async", "", "getAsync$avatar_badge_release", "()Z", "setAsync$avatar_badge_release", "(Z)V", "avatarDrawable", "Landroid/graphics/drawable/Drawable;", "getAvatarDrawable$avatar_badge_release", "()Landroid/graphics/drawable/Drawable;", "setAvatarDrawable$avatar_badge_release", "(Landroid/graphics/drawable/Drawable;)V", "avatarKey", "", "getAvatarKey$avatar_badge_release", "()Ljava/lang/String;", "setAvatarKey$avatar_badge_release", "(Ljava/lang/String;)V", "avatarRes", "", "getAvatarRes$avatar_badge_release", "()I", "setAvatarRes$avatar_badge_release", "(I)V", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "getBiz$avatar_badge_release", "()Lcom/ss/android/lark/appreciablelib/Biz;", "setBiz$avatar_badge_release", "(Lcom/ss/android/lark/appreciablelib/Biz;)V", "entityId", "getEntityId$avatar_badge_release", "setEntityId$avatar_badge_release", "placeHolder", "getPlaceHolder$avatar_badge_release", "setPlaceHolder$avatar_badge_release", "placeHolderRes", "getPlaceHolderRes$avatar_badge_release", "setPlaceHolderRes$avatar_badge_release", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "getScene$avatar_badge_release", "()Lcom/ss/android/lark/appreciablelib/Scene;", "setScene$avatar_badge_release", "(Lcom/ss/android/lark/appreciablelib/Scene;)V", "size", "Lcom/larksuite/component/ui/avatar/AvatarModel$Size;", "getSize$avatar_badge_release", "()Lcom/larksuite/component/ui/avatar/AvatarModel$Size;", "setSize$avatar_badge_release", "(Lcom/larksuite/component/ui/avatar/AvatarModel$Size;)V", "(Z)Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "(Ljava/lang/String;)Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "(Lcom/ss/android/lark/appreciablelib/Biz;)Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "build", "Lcom/larksuite/component/ui/avatar/AvatarModel;", "drawable", "(Landroid/graphics/drawable/Drawable;)Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "drawableRes", "(I)Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "(Lcom/ss/android/lark/appreciablelib/Scene;)Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "(Lcom/larksuite/component/ui/avatar/AvatarModel$Size;)Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.avatar.AvatarModel$a */
    public static class Builder<T extends Builder<T>> {

        /* renamed from: a */
        private Drawable f62403a;

        /* renamed from: b */
        private int f62404b;

        /* renamed from: c */
        private String f62405c;

        /* renamed from: d */
        private String f62406d;

        /* renamed from: e */
        private Drawable f62407e;

        /* renamed from: f */
        private int f62408f;

        /* renamed from: g */
        private Size f62409g = Size.MIDDLE;

        /* renamed from: h */
        private boolean f62410h;

        /* renamed from: i */
        private Biz f62411i = Biz.Messenger;

        /* renamed from: j */
        private Scene f62412j = Scene.Chat;

        /* renamed from: a */
        public final Drawable mo88956a() {
            return this.f62403a;
        }

        /* renamed from: b */
        public final int mo88964b() {
            return this.f62404b;
        }

        /* renamed from: c */
        public final String mo88968c() {
            return this.f62405c;
        }

        /* renamed from: d */
        public final String mo88969d() {
            return this.f62406d;
        }

        /* renamed from: e */
        public final Drawable mo88970e() {
            return this.f62407e;
        }

        /* renamed from: f */
        public final int mo88971f() {
            return this.f62408f;
        }

        /* renamed from: g */
        public final Size mo88972g() {
            return this.f62409g;
        }

        /* renamed from: h */
        public final boolean mo88973h() {
            return this.f62410h;
        }

        /* renamed from: i */
        public final Biz mo88974i() {
            return this.f62411i;
        }

        /* renamed from: j */
        public final Scene mo88975j() {
            return this.f62412j;
        }

        /* renamed from: k */
        public AvatarModel mo88976k() {
            return new AvatarModel(this);
        }

        public Builder() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(AvatarModel.f62392b.mo88977a());
            this.f62407e = gradientDrawable;
        }

        /* renamed from: a */
        public final T mo88957a(int i) {
            Builder<T> aVar = this;
            aVar.f62404b = i;
            return aVar;
        }

        /* renamed from: b */
        public final T mo88965b(int i) {
            Builder<T> aVar = this;
            aVar.f62408f = i;
            return aVar;
        }

        /* renamed from: a */
        public final T mo88958a(Drawable drawable) {
            Builder<T> aVar = this;
            aVar.f62403a = drawable;
            return aVar;
        }

        /* renamed from: b */
        public final T mo88966b(Drawable drawable) {
            Builder<T> aVar = this;
            aVar.f62407e = drawable;
            return aVar;
        }

        /* renamed from: a */
        public final T mo88959a(Size size) {
            Intrinsics.checkParameterIsNotNull(size, "size");
            Builder<T> aVar = this;
            aVar.f62409g = size;
            return aVar;
        }

        /* renamed from: b */
        public final T mo88967b(String str) {
            Builder<T> aVar = this;
            aVar.f62406d = str;
            return aVar;
        }

        /* renamed from: a */
        public final T mo88960a(Biz biz) {
            Intrinsics.checkParameterIsNotNull(biz, "biz");
            Builder<T> aVar = this;
            aVar.f62411i = biz;
            return aVar;
        }

        /* renamed from: a */
        public final T mo88961a(Scene scene) {
            Intrinsics.checkParameterIsNotNull(scene, "scene");
            Builder<T> aVar = this;
            aVar.f62412j = scene;
            return aVar;
        }

        /* renamed from: a */
        public final T mo88962a(String str) {
            Builder<T> aVar = this;
            aVar.f62405c = str;
            return aVar;
        }

        /* renamed from: a */
        public final T mo88963a(boolean z) {
            Builder<T> aVar = this;
            aVar.f62410h = z;
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/ui/avatar/AvatarModel$Companion;", "", "()V", "DEFAULT_AVATAR_PLACEHOLDER_COLOR", "", "getDEFAULT_AVATAR_PLACEHOLDER_COLOR", "()I", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.avatar.AvatarModel$b */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo88977a() {
            return AvatarModel.f62391a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo88945a() {
        return this.f62395e;
    }

    /* renamed from: b */
    public final String mo88947b() {
        return this.f62396f;
    }

    /* renamed from: c */
    public final Drawable mo88948c() {
        return this.f62397g;
    }

    /* renamed from: d */
    public final int mo88949d() {
        return this.f62398h;
    }

    /* renamed from: e */
    public final Size mo88950e() {
        return this.f62399i;
    }

    /* renamed from: f */
    public final boolean mo88951f() {
        return this.f62400j;
    }

    /* renamed from: g */
    public final Biz mo88952g() {
        return this.f62401k;
    }

    /* renamed from: h */
    public final Scene mo88953h() {
        return this.f62402l;
    }

    /* renamed from: a */
    public final Drawable mo88944a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Drawable drawable = this.f62393c;
        if (drawable != null) {
            return drawable;
        }
        int i = this.f62394d;
        if (i > 0) {
            return context.getDrawable(i);
        }
        return null;
    }

    /* renamed from: b */
    public final Drawable mo88946b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Drawable drawable = this.f62397g;
        if (drawable != null) {
            return drawable;
        }
        int i = this.f62398h;
        if (i > 0) {
            return context.getDrawable(i);
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected AvatarModel(Builder<?> aVar) {
        this(aVar.mo88956a(), aVar.mo88964b(), aVar.mo88968c(), aVar.mo88969d(), aVar.mo88970e(), aVar.mo88971f(), aVar.mo88972g(), aVar.mo88973h(), aVar.mo88974i(), aVar.mo88975j());
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
    }

    private AvatarModel(Drawable drawable, int i, String str, String str2, Drawable drawable2, int i2, Size size, boolean z, Biz biz, Scene scene) {
        this.f62393c = drawable;
        this.f62394d = i;
        this.f62395e = str;
        this.f62396f = str2;
        this.f62397g = drawable2;
        this.f62398h = i2;
        this.f62399i = size;
        this.f62400j = z;
        this.f62401k = biz;
        this.f62402l = scene;
    }
}
