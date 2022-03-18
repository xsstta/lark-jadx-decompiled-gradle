package com.larksuite.component.ui.avatar.v2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.larksuite.component.ui.C25622a;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.dependence.IAvatarLoader;
import com.larksuite.component.ui.dependence.IChatterAvatarService;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/ui/avatar/v2/ChatterAvatarBinder;", "Lcom/larksuite/component/ui/avatar/v2/CommonAvatarBinder;", "Landroid/widget/ImageView;", "Lcom/larksuite/component/ui/avatar/v2/ChatterAvatar;", "()V", "bind", "", "view", "model", "unbind", "ChatterAvatarLoader", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.v2.b */
public final class ChatterAvatarBinder extends CommonAvatarBinder<ImageView, ChatterAvatar> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0016J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0006\u0010\u0016\u001a\u00020\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/larksuite/component/ui/avatar/v2/ChatterAvatarBinder$ChatterAvatarLoader;", "Lcom/larksuite/component/ui/dependence/IChatterAvatarService$OnAvatarChangeListener;", "view", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;)V", "currentModel", "Lcom/larksuite/component/ui/avatar/v2/ChatterAvatar;", "viewRef", "Ljava/lang/ref/WeakReference;", "isActivityDestroyed", "", "context", "Landroid/content/Context;", "isValid", "load", "", "model", "load$avatar_badge_release", "onPushChange", "id", "", "avatarKey", "release", "Companion", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.avatar.v2.b$a */
    public static final class ChatterAvatarLoader implements IChatterAvatarService.OnAvatarChangeListener {

        /* renamed from: a */
        public static final Companion f62490a = new Companion(null);

        /* renamed from: b */
        private final WeakReference<ImageView> f62491b;

        /* renamed from: c */
        private ChatterAvatar f62492c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/larksuite/component/ui/avatar/v2/ChatterAvatarBinder$ChatterAvatarLoader$Companion;", "", "()V", "from", "Lcom/larksuite/component/ui/avatar/v2/ChatterAvatarBinder$ChatterAvatarLoader;", "view", "Landroid/widget/ImageView;", "fromOrCreate", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.ui.avatar.v2.b$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ChatterAvatarLoader mo89091a(ImageView imageView) {
                Intrinsics.checkParameterIsNotNull(imageView, "view");
                return (ChatterAvatarLoader) imageView.getTag(R.id.feature_ui_component_chatter_avatar_loader);
            }

            /* renamed from: b */
            public final ChatterAvatarLoader mo89092b(ImageView imageView) {
                Intrinsics.checkParameterIsNotNull(imageView, "view");
                ChatterAvatarLoader aVar = (ChatterAvatarLoader) imageView.getTag(R.id.feature_ui_component_chatter_avatar_loader);
                if (aVar != null) {
                    return aVar;
                }
                ChatterAvatarLoader aVar2 = new ChatterAvatarLoader(imageView);
                imageView.setTag(R.id.feature_ui_component_chatter_avatar_loader, aVar2);
                return aVar2;
            }
        }

        /* renamed from: b */
        public final void mo89090b() {
            ImageView imageView = this.f62491b.get();
            if (imageView != null) {
                imageView.setTag(R.id.feature_ui_component_chatter_avatar_loader, null);
            }
            ChatterAvatar aVar = this.f62492c;
            if (aVar != null) {
                IChatterAvatarService c = C25622a.m91440c();
                String j = aVar.mo89080j();
                if (j == null) {
                    Intrinsics.throwNpe();
                }
                c.mo89178b(j, this);
                this.f62492c = null;
            }
        }

        @Override // com.larksuite.component.ui.dependence.IChatterAvatarService.OnAvatarChangeListener
        /* renamed from: a */
        public boolean mo89089a() {
            ImageView imageView = this.f62491b.get();
            if (imageView == null || !Intrinsics.areEqual(imageView.getTag(R.id.feature_ui_component_chatter_avatar_loader), this) || this.f62492c == null) {
                return false;
            }
            return true;
        }

        public ChatterAvatarLoader(ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(imageView, "view");
            this.f62491b = new WeakReference<>(imageView);
        }

        /* renamed from: a */
        private final boolean m91642a(Context context) {
            if (context == null) {
                return true;
            }
            if (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context.baseContext");
            }
            if (!(context instanceof Activity) || !((Activity) context).isDestroyed()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo89087a(ChatterAvatar aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "model");
            ChatterAvatarKeyCache cVar = ChatterAvatarKeyCache.f62493a;
            String j = aVar.mo89080j();
            if (j == null) {
                Intrinsics.throwNpe();
            }
            String a = cVar.mo89093a(j);
            if (a == null) {
                ChatterAvatarKeyCache cVar2 = ChatterAvatarKeyCache.f62493a;
                String j2 = aVar.mo89080j();
                String a2 = aVar.mo88945a();
                if (a2 == null) {
                    Intrinsics.throwNpe();
                }
                cVar2.mo89094a(j2, a2);
                C25622a.m91440c().mo89177a(aVar.mo89080j(), aVar.mo88945a(), AvatarType.CHATTER);
            } else {
                if (!TextUtils.equals(aVar.mo88945a(), a)) {
                    C25622a.m91440c().mo89177a(aVar.mo89080j(), a, AvatarType.CHATTER);
                }
                aVar = ((ChatterAvatar.Builder) aVar.mo89079i().mo88962a(a)).mo88976k();
            }
            ImageView imageView = this.f62491b.get();
            if (imageView != null) {
                Intrinsics.checkExpressionValueIsNotNull(imageView, "it");
                if (!m91642a(imageView.getContext())) {
                    ChatterAvatar aVar2 = this.f62492c;
                    if (aVar2 != null && (!Intrinsics.areEqual(aVar2.mo89080j(), aVar.mo89080j()))) {
                        IChatterAvatarService c = C25622a.m91440c();
                        String j3 = aVar2.mo89080j();
                        if (j3 == null) {
                            Intrinsics.throwNpe();
                        }
                        c.mo89178b(j3, this);
                    }
                    this.f62492c = aVar.mo89079i().mo88976k();
                    IAvatarLoader a3 = C25622a.m91437a();
                    Context context = imageView.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
                    a3.mo89174a(context, imageView, aVar);
                    IChatterAvatarService c2 = C25622a.m91440c();
                    String j4 = aVar.mo89080j();
                    if (j4 == null) {
                        Intrinsics.throwNpe();
                    }
                    c2.mo89176a(j4, this);
                }
            }
        }

        @Override // com.larksuite.component.ui.dependence.IChatterAvatarService.OnAvatarChangeListener
        /* renamed from: a */
        public void mo89088a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
            if (mo89089a()) {
                ChatterAvatarKeyCache.f62493a.mo89094a(str, str2);
                ChatterAvatar aVar = this.f62492c;
                if (aVar != null && Intrinsics.areEqual(str, aVar.mo89080j()) && (!Intrinsics.areEqual(str2, aVar.mo88945a()))) {
                    mo89087a(((ChatterAvatar.Builder) aVar.mo89079i().mo88962a(str2)).mo88976k());
                }
            }
        }
    }

    @Override // com.larksuite.component.ui.avatar.v2.CommonAvatarBinder
    /* renamed from: a */
    public void mo88913a(ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(imageView, "view");
        ChatterAvatarLoader a = ChatterAvatarLoader.f62490a.mo89091a(imageView);
        if (a != null) {
            a.mo89090b();
        }
    }

    /* renamed from: a */
    public void mo89085a(ImageView imageView, ChatterAvatar aVar) {
        Intrinsics.checkParameterIsNotNull(imageView, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        if (aVar.mo89080j() == null) {
            super.mo88915a(imageView, (AvatarModel) aVar);
        } else {
            ChatterAvatarLoader.f62490a.mo89092b(imageView).mo89087a(aVar);
        }
    }
}
