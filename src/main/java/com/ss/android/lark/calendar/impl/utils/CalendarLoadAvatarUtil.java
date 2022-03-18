package com.ss.android.lark.calendar.impl.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30051o;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57881t;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002JJ\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/CalendarLoadAvatarUtil;", "", "()V", "isAvatarFileExits", "", "context", "Landroid/content/Context;", "filename", "", "showAvatarInImageView", "", "imageView", "Landroid/widget/ImageView;", "imageWidth", "", "imageHeight", "avatarKey", "entityId", "fakeCreator", "Lcom/ss/android/lark/calendar/impl/utils/IFakeAvatarCreator;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.f */
public final class CalendarLoadAvatarUtil {

    /* renamed from: a */
    public static final CalendarLoadAvatarUtil f83775a = new CalendarLoadAvatarUtil();

    private CalendarLoadAvatarUtil() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/utils/CalendarLoadAvatarUtil$showAvatarInImageView$1", "Lcom/ss/android/lark/utils/FileUtil$OnFileSaveListener;", "onFailSaveFailed", "", "e", "", "onFileSaveSuccess", "path", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.utils.f$a */
    public static final class C32649a implements C57881t.AbstractC57884a {

        /* renamed from: a */
        final /* synthetic */ Context f83776a;

        /* renamed from: b */
        final /* synthetic */ ImageView f83777b;

        /* renamed from: c */
        final /* synthetic */ int f83778c;

        /* renamed from: d */
        final /* synthetic */ int f83779d;

        /* renamed from: e */
        final /* synthetic */ String f83780e;

        @Override // com.ss.android.lark.utils.C57881t.AbstractC57884a
        /* renamed from: a */
        public void mo120345a(String str) {
            C30022a.f74882a.imageDependency().mo108245a(this.f83776a, str, this.f83777b, this.f83778c, this.f83779d);
        }

        @Override // com.ss.android.lark.utils.C57881t.AbstractC57884a
        /* renamed from: a */
        public void mo120346a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "e");
            C30022a.f74882a.imageDependency().mo108245a(this.f83776a, this.f83780e, this.f83777b, this.f83778c, this.f83779d);
            Log.m165382e("failed to save image" + th.getMessage());
        }

        C32649a(Context context, ImageView imageView, int i, int i2, String str) {
            this.f83776a = context;
            this.f83777b = imageView;
            this.f83778c = i;
            this.f83779d = i2;
            this.f83780e = str;
        }
    }

    /* renamed from: a */
    private final boolean m125307a(Context context, String str) {
        return !TextUtils.isEmpty(C57881t.m224629c(context, str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m125306a(Context context, ImageView imageView, int i, int i2, String str, String str2, IFakeAvatarCreator sVar) {
        boolean z;
        if (context != null) {
            String str3 = str;
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || sVar == null) {
                C30022a.f74882a.imageDependency().mo108246a(context, str, str2, imageView, i, i2);
                return;
            }
            String b = sVar.mo110401b();
            String C = C57881t.m224604C(context);
            if (f83775a.m125307a(context, b)) {
                AbstractC30051o imageDependency = C30022a.f74882a.imageDependency();
                imageDependency.mo108245a(context, C + b, imageView, i, i2);
                return;
            }
            Bitmap a = sVar.mo110400a();
            if (a == null) {
                C30022a.f74882a.imageDependency().mo108246a(context, str, str2, imageView, i, i2);
                return;
            }
            C57881t.m224620a(context, a, C + b, new C32649a(context, imageView, i, i2, C));
        }
    }
}
