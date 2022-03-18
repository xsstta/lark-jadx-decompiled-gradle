package com.ss.android.lark.chat.utils;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/utils/EditImageUtils;", "", "()V", "TAG", "", "startEditImageActivity", "", "context", "Landroid/content/Context;", "selectPhotoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "fragment", "Landroidx/fragment/app/Fragment;", "showSaveBtn", "", "showForwardBtn", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.utils.j */
public final class EditImageUtils {

    /* renamed from: a */
    public static final EditImageUtils f88677a = new EditImageUtils();

    private EditImageUtils() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.utils.j$a */
    public static final class RunnableC34344a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PhotoItem f88678a;

        /* renamed from: b */
        final /* synthetic */ Context f88679b;

        /* renamed from: c */
        final /* synthetic */ Fragment f88680c;

        /* renamed from: d */
        final /* synthetic */ boolean f88681d;

        /* renamed from: e */
        final /* synthetic */ boolean f88682e;

        RunnableC34344a(PhotoItem photoItem, Context context, Fragment fragment, boolean z, boolean z2) {
            this.f88678a = photoItem;
            this.f88679b = context;
            this.f88680c = fragment;
            this.f88681d = z;
            this.f88682e = z2;
        }

        public final void run() {
            String currentUrl = this.f88678a.getCurrentUrl();
            Intrinsics.checkExpressionValueIsNotNull(currentUrl, "selectPhotoItem.currentUrl");
            final File a = C58612c.m227290a().mo102827a(ImageLoader.with(this.f88679b), currentUrl, this.f88678a.getImageKey(), this.f88678a.getEntityId(), C58659h.m227515a(this.f88678a), this.f88678a.getType());
            if (a != null) {
                final String E = C57881t.m224606E(this.f88679b);
                UICallbackExecutor.execute(new Runnable(this) {
                    /* class com.ss.android.lark.chat.utils.EditImageUtils.RunnableC34344a.RunnableC343451 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC34344a f88683a;

                    {
                        this.f88683a = r1;
                    }

                    public final void run() {
                        AbstractC36474h b = C29990c.m110930b();
                        Context context = this.f88683a.f88679b;
                        Fragment fragment = this.f88683a.f88680c;
                        String absolutePath = a.getAbsolutePath();
                        b.mo134536a(context, fragment, 2, absolutePath, E + System.currentTimeMillis() + ".jpg", this.f88683a.f88681d, this.f88683a.f88682e, this.f88683a.f88678a.getImageKey());
                    }
                });
                return;
            }
            Log.m165383e("EditImageUtils", "resource == null");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m133181a(Context context, PhotoItem photoItem, Fragment fragment, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(photoItem, "selectPhotoItem");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().submit(new RunnableC34344a(photoItem, context, fragment, z, z2));
    }
}
