package com.ss.android.lark.mm.p2288b;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.ss.android.lark.mm.b.e */
public class C45853e {

    /* renamed from: com.ss.android.lark.mm.b.e$a */
    public interface AbstractC45854a {
        /* renamed from: a */
        void mo161154a(Bitmap bitmap);
    }

    /* renamed from: b */
    public static void m181660b(ImageView imageView, String str) {
        if (imageView != null && str != null) {
            C45899c.m181859a().getImageLoaderDepend().mo144609a(imageView, str);
        }
    }

    /* renamed from: a */
    public static void m181657a(ImageView imageView, String str) {
        if (imageView != null && str != null) {
            C45899c.m181859a().getImageLoaderDepend().mo144612b(imageView, str);
        }
    }

    /* renamed from: a */
    public static void m181658a(ImageView imageView, String str, int i) {
        if (imageView != null && str != null) {
            C45899c.m181859a().getImageLoaderDepend().mo144610a(imageView, str, i);
        }
    }

    /* renamed from: a */
    public static void m181659a(ImageView imageView, String str, String str2, String str3) {
        if (imageView != null && str2 != null) {
            if (!TextUtils.isEmpty(str2)) {
                m181657a(imageView, str2);
            } else {
                C45899c.m181859a().getImageLoaderDepend().mo144611a(imageView, str3, str, SmActions.ACTION_ONTHECALL_EXIT, SmActions.ACTION_ONTHECALL_EXIT, 640, 640);
            }
        }
    }

    /* renamed from: a */
    public static void m181656a(Context context, String str, int i, int i2, AbstractC45854a aVar) {
        if (context != null && str != null) {
            C45899c.m181859a().getImageLoaderDepend().mo144608a(context, str, i, i2, aVar);
        }
    }
}
