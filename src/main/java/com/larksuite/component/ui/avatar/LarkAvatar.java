package com.larksuite.component.ui.avatar;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(level = DeprecationLevel.WARNING, message = "replaceWith: LarkAvatarView")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/ui/avatar/LarkAvatar;", "", "()V", "Companion", "EmptyIconLoader", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.s */
public final class LarkAvatar {

    /* renamed from: a */
    public static boolean f62475a;

    /* renamed from: b */
    public static IAvatarDependence f62476b;

    /* renamed from: c */
    public static final HashMap<Class<? extends FeedAvatarModel>, AvatarModelHandler<? extends FeedAvatarModel>> f62477c = new HashMap<>();

    /* renamed from: d */
    public static final EmptyIconLoader f62478d = new EmptyIconLoader();

    /* renamed from: e */
    public static final Companion f62479e = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final LarkAvatarRenderRequest m91597a(Context context) {
        return f62479e.mo89058a(context);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m91598a(IAvatarDependence jVar) {
        f62479e.mo89059a(jVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m91599a(Class<? extends FeedAvatarModel> cls, AvatarModelHandler<? extends FeedAvatarModel> bVar) {
        f62479e.mo89060a(cls, bVar);
    }

    @Deprecated(message = "temp export, not use")
    @JvmStatic
    /* renamed from: a */
    public static final boolean m91600a() {
        return f62479e.mo89061b();
    }

    @Deprecated(message = "temp export, not use")
    @JvmStatic
    /* renamed from: b */
    public static final boolean m91601b() {
        return f62479e.mo89062c();
    }

    @Deprecated(message = "temp export, not use")
    @JvmStatic
    /* renamed from: c */
    public static final boolean m91602c() {
        return f62479e.mo89063d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J-\u0010\u0011\u001a\n\u0012\u0004\u0012\u0002H\u0012\u0018\u00010\u000b\"\b\b\u0000\u0010\u0012*\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\tH\u0001¢\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0019\u001a\u00020\u000eH\u0007J\b\u0010\u001a\u001a\u00020\u000eH\u0007J\b\u0010\u001b\u001a\u00020\u000eH\u0007J(\u0010\u001c\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000bH\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000RJ\u0010\u0007\u001a>\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b0\bj\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b`\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/larksuite/component/ui/avatar/LarkAvatar$Companion;", "", "()V", "dependence", "Lcom/larksuite/component/ui/avatar/IAvatarDependence;", "emptyIconLoader", "Lcom/larksuite/component/ui/avatar/LarkAvatar$EmptyIconLoader;", "handlerMap", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/larksuite/component/ui/avatar/FeedAvatarModel;", "Lcom/larksuite/component/ui/avatar/AvatarModelHandler;", "Lkotlin/collections/HashMap;", "inited", "", "checkInited", "", "findHandler", "T", "modelClass", "findHandler$avatar_badge_release", "getIconLoader", "Lcom/larksuite/component/ui/avatar/IIconLoader;", "getIconLoader$avatar_badge_release", "init", "isBadgeTagEnable", "isDocIconEnable", "isThreadBadgeEnable", "registModelHandler", "handler", "with", "Lcom/larksuite/component/ui/avatar/LarkAvatarRenderRequest;", "context", "Landroid/content/Context;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.avatar.s$a */
    public static final class Companion {
        private Companion() {
        }

        @Deprecated(message = "temp export, not use")
        @JvmStatic
        /* renamed from: b */
        public final boolean mo89061b() {
            IAvatarDependence jVar = LarkAvatar.f62476b;
            if (jVar != null) {
                return jVar.mo89021a();
            }
            return false;
        }

        @Deprecated(message = "temp export, not use")
        @JvmStatic
        /* renamed from: c */
        public final boolean mo89062c() {
            IAvatarDependence jVar = LarkAvatar.f62476b;
            if (jVar != null) {
                return jVar.mo89022b();
            }
            return false;
        }

        @Deprecated(message = "temp export, not use")
        @JvmStatic
        /* renamed from: d */
        public final boolean mo89063d() {
            IAvatarDependence jVar = LarkAvatar.f62476b;
            if (jVar != null) {
                return jVar.mo89021a();
            }
            return false;
        }

        /* renamed from: a */
        public final IIconLoader mo89057a() {
            IIconLoader c;
            IAvatarDependence jVar = LarkAvatar.f62476b;
            if (jVar == null || (c = jVar.mo89023c()) == null) {
                return LarkAvatar.f62478d;
            }
            return c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final <T extends FeedAvatarModel> AvatarModelHandler<T> mo89056a(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            return (AvatarModelHandler<T>) LarkAvatar.f62477c.get(cls);
        }

        @JvmStatic
        /* renamed from: a */
        public final LarkAvatarRenderRequest mo89058a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new LarkAvatarRenderRequest(context);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo89059a(IAvatarDependence jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "dependence");
            if (!LarkAvatar.f62475a) {
                LarkAvatar.f62476b = jVar;
                LarkAvatar.f62475a = true;
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo89060a(Class<? extends FeedAvatarModel> cls, AvatarModelHandler<? extends FeedAvatarModel> bVar) {
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            Intrinsics.checkParameterIsNotNull(bVar, "handler");
            LarkAvatar.f62477c.put(cls, bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016JF\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/larksuite/component/ui/avatar/LarkAvatar$EmptyIconLoader;", "Lcom/larksuite/component/ui/avatar/IIconLoader;", "()V", "load", "", "context", "Landroid/content/Context;", "key", "", "entityId", "fsUnit", "width", "", "height", "imageView", "Landroid/widget/ImageView;", "callback", "Lcom/larksuite/component/ui/avatar/ILoadCallback;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.avatar.s$b */
    private static final class EmptyIconLoader implements IIconLoader {
        @Override // com.larksuite.component.ui.avatar.IIconLoader
        /* renamed from: a */
        public void mo89027a(Context context, String str, String str2, String str3, int i, int i2, ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        }

        @Override // com.larksuite.component.ui.avatar.IIconLoader
        /* renamed from: a */
        public void mo89028a(Context context, String str, String str2, String str3, int i, int i2, ILoadCallback nVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "key");
            if (nVar != null) {
                nVar.mo89031a(new Throwable("icon load not implement"));
            }
        }
    }
}
