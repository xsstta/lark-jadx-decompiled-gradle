package com.ss.android.lark.image;

import android.app.Fragment;
import android.content.Context;
import android.view.View;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.request.AbstractC2533d;
import com.larksuite.suite.R;
import com.ss.android.lark.image.api.AbstractC38812c;
import com.ss.android.lark.image.api.AbstractC38815f;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.impl.C38828a;
import com.ss.android.lark.image.impl.C38910i;
import com.ss.android.lark.log.Log;

public class ImageLoader {
    private static AbstractC38791a sDependency;
    private static AbstractC38812c sImagerLoaderProxy = new C38828a();

    /* renamed from: com.ss.android.lark.image.ImageLoader$a */
    public interface AbstractC38791a {
        /* renamed from: a */
        void mo142149a(String str, String str2);
    }

    public static AbstractC38791a getDependency() {
        return sDependency;
    }

    public static void init(AbstractC38791a aVar) {
        sDependency = aVar;
    }

    public static void clear(View view) {
        sImagerLoaderProxy.mo142228a(view);
    }

    public static void clearMemoryCache(Context context) {
        sImagerLoaderProxy.mo142226a(context);
    }

    public static IRequestCreator with(Fragment fragment) {
        return new C38910i(sImagerLoaderProxy, fragment);
    }

    public static IRequestCreator with(Context context) {
        return new C38910i(sImagerLoaderProxy, context);
    }

    public static IRequestCreator with(androidx.fragment.app.Fragment fragment) {
        return new C38910i(sImagerLoaderProxy, fragment);
    }

    public static AbstractC2533d getRequest(View view) {
        Class<?> cls;
        Object tag = view.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof AbstractC2533d) {
            return (AbstractC2533d) tag;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getRequest:");
        if (tag != null) {
            cls = tag.getClass();
        } else {
            cls = null;
        }
        sb.append(cls);
        Log.m165397w("ImageLoader", sb.toString());
        return null;
    }

    public static void setRequest(View view, AbstractC2533d dVar) {
        view.setTag(R.id.glide_custom_view_target_tag, dVar);
    }

    public static <T extends AbstractC2265c, Y> void registerLoadModelHook(Context context, Class<T> cls, Class<Y> cls2, AbstractC38815f<T, Y> fVar) {
        sImagerLoaderProxy.mo142227a(context, cls, cls2, fVar);
    }
}
