package com.ss.android.lark.profile.func.user_profile.header;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.statistics.UserProfilePerceptionErrorCostTimeHitPoint;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/UserProfileAvatarLoader;", "", "()V", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.header.d */
public final class UserProfileAvatarLoader {

    /* renamed from: a */
    public static final Companion f130217a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J:\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J0\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J:\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J:\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0002J0\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/UserProfileAvatarLoader$Companion;", "", "()V", "AVATAR_MAX_BLUR_VALUE", "", "AVATAR_MIDDLE_SIZE", "AVATAR_SIZE", "BLUR_IMAGE_SUFFIX", "", "TAG", "getAvatarMiddleSize", "context", "Landroid/content/Context;", "getMiddleSizeAvatar", "", "blurAvatarIv", "Landroid/widget/ImageView;", "origAvatarIv", "avatarKey", "entityId", "blurFile", "Ljava/io/File;", "loadAvatar", "oriAvatarIv", "resource", "loadBlurImg", "filePath", "processBlurBitmap", "processLocalAvatar", "processRemoteAvatar", "saveBlurBitmap", "bitmap", "Landroid/graphics/Bitmap;", "file", "setProfileAvatar", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "produce"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.header.d$a$b */
        public static final class C52615b<T> implements C57865c.AbstractC57873d<T> {

            /* renamed from: a */
            final /* synthetic */ String f130224a;

            C52615b(String str) {
                this.f130224a = str;
            }

            /* renamed from: a */
            public final Bitmap produce() {
                return BitmapFactory.decodeFile(this.f130224a);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "produce"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.header.d$a$d */
        public static final class C52617d<T> implements C57865c.AbstractC57873d<T> {

            /* renamed from: a */
            final /* synthetic */ File f130226a;

            /* renamed from: b */
            final /* synthetic */ File f130227b;

            C52617d(File file, File file2) {
                this.f130226a = file;
                this.f130227b = file2;
            }

            /* renamed from: a */
            public final Bitmap produce() {
                Bitmap a = C57820d.m224433a(this.f130226a.getPath(), 409600);
                IProfileModuleDependency d = C52239a.m202617d();
                IProfileModuleDependency d2 = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
                Bitmap a2 = d.mo133543a(d2.mo133562b(), a, 50);
                if (a2 != null) {
                    UserProfileAvatarLoader.f130217a.mo179836a(a2, this.f130227b);
                }
                return a2;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.header.d$a$c */
        public static final class C52616c<T> implements C57865c.AbstractC57871b<T> {

            /* renamed from: a */
            final /* synthetic */ ImageView f130225a;

            C52616c(ImageView imageView) {
                this.f130225a = imageView;
            }

            /* renamed from: a */
            public final void consume(Bitmap bitmap) {
                this.f130225a.setImageBitmap(bitmap);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.header.d$a$e */
        public static final class C52618e<T> implements C57865c.AbstractC57871b<T> {

            /* renamed from: a */
            final /* synthetic */ ImageView f130228a;

            C52618e(ImageView imageView) {
                this.f130228a = imageView;
            }

            /* renamed from: a */
            public final void consume(Bitmap bitmap) {
                if (bitmap != null) {
                    this.f130228a.setImageBitmap(bitmap);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "resource", "Ljava/io/File;", "onResourceReady"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.header.d$a$f */
        public static final class C52619f implements IProfileModuleDependency.AbstractC52251f.AbstractC52252a {

            /* renamed from: a */
            final /* synthetic */ Context f130229a;

            /* renamed from: b */
            final /* synthetic */ ImageView f130230b;

            /* renamed from: c */
            final /* synthetic */ ImageView f130231c;

            /* renamed from: d */
            final /* synthetic */ String f130232d;

            /* renamed from: e */
            final /* synthetic */ String f130233e;

            /* renamed from: f */
            final /* synthetic */ File f130234f;

            C52619f(Context context, ImageView imageView, ImageView imageView2, String str, String str2, File file) {
                this.f130229a = context;
                this.f130230b = imageView;
                this.f130231c = imageView2;
                this.f130232d = str;
                this.f130233e = str2;
                this.f130234f = file;
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52251f.AbstractC52252a
            /* renamed from: a */
            public final void mo178831a(File file) {
                if (file == null || TextUtils.isEmpty(file.getPath())) {
                    Log.m165397w("UserProfileAvatarLoader", "get local image failed.");
                    UserProfileAvatarLoader.f130217a.mo179835a(this.f130229a, this.f130230b, this.f130231c, this.f130232d, this.f130233e, this.f130234f);
                    return;
                }
                UserProfileAvatarLoader.f130217a.mo179833a(this.f130229a, this.f130230b, this.f130231c, file, this.f130234f);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "resource", "Ljava/io/File;", "onResourceReady"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.header.d$a$g */
        public static final class C52620g implements IProfileModuleDependency.AbstractC52251f.AbstractC52252a {

            /* renamed from: a */
            final /* synthetic */ Context f130235a;

            /* renamed from: b */
            final /* synthetic */ ImageView f130236b;

            /* renamed from: c */
            final /* synthetic */ ImageView f130237c;

            /* renamed from: d */
            final /* synthetic */ File f130238d;

            C52620g(Context context, ImageView imageView, ImageView imageView2, File file) {
                this.f130235a = context;
                this.f130236b = imageView;
                this.f130237c = imageView2;
                this.f130238d = file;
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52251f.AbstractC52252a
            /* renamed from: a */
            public final void mo178831a(File file) {
                if (file == null || TextUtils.isEmpty(file.getPath())) {
                    Log.m165397w("UserProfileAvatarLoader", "remote image load failed.");
                } else {
                    UserProfileAvatarLoader.f130217a.mo179833a(this.f130235a, this.f130236b, this.f130237c, file, this.f130238d);
                }
            }
        }

        /* renamed from: a */
        private final int m203913a(Context context) {
            if (!C52239a.m202617d().mo133561a("mobile.avatar.access.unify")) {
                return 240;
            }
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            return d.mo133585o().mo133595a(context);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "resource", "Ljava/io/File;", "onResourceReady"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.header.d$a$a */
        public static final class C52614a implements IProfileModuleDependency.AbstractC52251f.AbstractC52252a {

            /* renamed from: a */
            final /* synthetic */ Context f130218a;

            /* renamed from: b */
            final /* synthetic */ ImageView f130219b;

            /* renamed from: c */
            final /* synthetic */ ImageView f130220c;

            /* renamed from: d */
            final /* synthetic */ String f130221d;

            /* renamed from: e */
            final /* synthetic */ String f130222e;

            /* renamed from: f */
            final /* synthetic */ File f130223f;

            C52614a(Context context, ImageView imageView, ImageView imageView2, String str, String str2, File file) {
                this.f130218a = context;
                this.f130219b = imageView;
                this.f130220c = imageView2;
                this.f130221d = str;
                this.f130222e = str2;
                this.f130223f = file;
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52251f.AbstractC52252a
            /* renamed from: a */
            public final void mo178831a(File file) {
                if (file == null || TextUtils.isEmpty(file.getPath())) {
                    Log.m165397w("UserProfileAvatarLoader", "get local middle image failed.");
                    UserProfileAvatarLoader.f130217a.mo179837b(this.f130218a, this.f130219b, this.f130220c, this.f130221d, this.f130222e, this.f130223f);
                    return;
                }
                UserProfileAvatarLoader.f130217a.mo179833a(this.f130218a, this.f130219b, this.f130220c, file, this.f130223f);
                UserProfileAvatarLoader.f130217a.mo179837b(this.f130218a, this.f130219b, this.f130220c, this.f130221d, this.f130222e, this.f130223f);
            }
        }

        /* renamed from: a */
        private final void m203915a(String str, ImageView imageView) {
            C57865c.m224574a(new C52615b(str), new C52616c(imageView));
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024 A[SYNTHETIC, Splitter:B:10:0x0024] */
        /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo179836a(android.graphics.Bitmap r4, java.io.File r5) {
            /*
                r3 = this;
                r0 = 0
                java.io.FileOutputStream r0 = (java.io.FileOutputStream) r0
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x001d }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x001d }
                android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x001a }
                r0 = 90
                r2 = r1
                java.io.OutputStream r2 = (java.io.OutputStream) r2     // Catch:{ FileNotFoundException -> 0x001a }
                r4.compress(r5, r0, r2)     // Catch:{ FileNotFoundException -> 0x001a }
                java.lang.String r4 = "UserProfileAvatarLoader"
                java.lang.String r5 = "blur image saves to local"
                com.ss.android.lark.log.Log.m165389i(r4, r5)     // Catch:{ FileNotFoundException -> 0x001a }
                goto L_0x0022
            L_0x001a:
                r4 = move-exception
                r0 = r1
                goto L_0x001e
            L_0x001d:
                r4 = move-exception
            L_0x001e:
                r4.printStackTrace()
                r1 = r0
            L_0x0022:
                if (r1 == 0) goto L_0x002f
                r1.flush()     // Catch:{ IOException -> 0x002b }
                r1.close()     // Catch:{ IOException -> 0x002b }
                goto L_0x002f
            L_0x002b:
                r4 = move-exception
                r4.printStackTrace()
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.user_profile.header.UserProfileAvatarLoader.Companion.mo179836a(android.graphics.Bitmap, java.io.File):void");
        }

        /* renamed from: a */
        private final void m203914a(ImageView imageView, File file, File file2) {
            C57865c.m224574a(new C52617d(file, file2), new C52618e(imageView));
        }

        /* renamed from: a */
        public final void mo179833a(Context context, ImageView imageView, ImageView imageView2, File file, File file2) {
            ImageLoader.with(context).load(file.getPath()).placeholder(new BitmapDrawable(file.getPath())).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).into(imageView2);
            UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180616f();
            UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180620j();
            if (!file2.exists()) {
                m203914a(imageView, file, file2);
            }
        }

        /* renamed from: a */
        public final void mo179834a(Context context, ImageView imageView, ImageView imageView2, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(imageView, "blurAvatarIv");
            Intrinsics.checkParameterIsNotNull(imageView2, "origAvatarIv");
            Intrinsics.checkParameterIsNotNull(str, "avatarKey");
            String str3 = C57881t.m224606E(context) + str + "_blur.png";
            File file = new File(str3);
            if (file.exists()) {
                Log.m165389i("UserProfileAvatarLoader", "blur image exists in local");
                m203915a(str3, imageView);
            }
            m203916c(context, imageView, imageView2, str, str2, file);
        }

        /* renamed from: c */
        private final void m203916c(Context context, ImageView imageView, ImageView imageView2, String str, String str2, File file) {
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            d.mo133585o().mo133597a(context, str, str2, 640, 640, false, true, new C52619f(context, imageView, imageView2, str, str2, file));
        }

        /* renamed from: b */
        public final void mo179837b(Context context, ImageView imageView, ImageView imageView2, String str, String str2, File file) {
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            d.mo133585o().mo133597a(context, str, str2, 640, 640, false, false, new C52620g(context, imageView, imageView2, file));
        }

        /* renamed from: a */
        public final void mo179835a(Context context, ImageView imageView, ImageView imageView2, String str, String str2, File file) {
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52251f o = d.mo133585o();
            Companion aVar = this;
            o.mo133597a(context, str, str2, aVar.m203913a(context), aVar.m203913a(context), false, true, new C52614a(context, imageView, imageView2, str, str2, file));
        }
    }
}
