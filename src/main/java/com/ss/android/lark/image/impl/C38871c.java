package com.ss.android.lark.image.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.impl.p1967g.C38897b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.C57865c;

/* renamed from: com.ss.android.lark.image.impl.c */
public class C38871c {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.image.impl.c$a */
    public static class C38878a {

        /* renamed from: a */
        public Object f99886a;

        /* renamed from: b */
        public AbstractC38817h f99887b;

        private C38878a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.image.impl.c$6 */
    public static /* synthetic */ class C388776 {

        /* renamed from: a */
        static final /* synthetic */ int[] f99885a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.image.impl.C38871c.C388776.f99885a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.image.impl.C38871c.C388776.f99885a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.image.impl.C38871c.C388776.f99885a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.image.impl.C38871c.C388776.f99885a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.image.impl.C38871c.C388776.f99885a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.image.impl.C38871c.C388776.f99885a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.image.impl.C38871c.C388776.f99885a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.ss.android.lark.image.impl.C38871c.C388776.f99885a     // Catch:{ NoSuchFieldError -> 0x0060 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.image.impl.C38871c.C388776.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m153435a(ImageView imageView, ImageView.ScaleType scaleType) {
        try {
            imageView.setScaleType(scaleType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C38878a m153433a(final LoadParams loadParams, Object obj) {
        C38878a aVar = new C38878a();
        aVar.f99886a = obj;
        if (loadParams.mo105438l() == null) {
            return aVar;
        }
        if (loadParams.mo105438l().mo105370a()) {
            aVar.f99887b = new C38897b(loadParams.mo105438l());
        } else if (loadParams.mo105438l().mo105377h() != null) {
            aVar.f99887b = new AbstractC38817h() {
                /* class com.ss.android.lark.image.impl.C38871c.C388754 */

                @Override // com.ss.android.lark.image.api.AbstractC38817h
                /* renamed from: a */
                public boolean mo53861a(Exception exc, Object obj, AbstractC38819j jVar, boolean z) {
                    loadParams.mo105438l().mo105377h().mo105410a(exc);
                    return false;
                }

                @Override // com.ss.android.lark.image.api.AbstractC38817h
                /* renamed from: a */
                public boolean mo53862a(Object obj, Object obj2, AbstractC38819j jVar, DataSource dataSource, boolean z) {
                    loadParams.mo105438l().mo105377h().mo105411a(obj, obj2, jVar, dataSource, z);
                    return false;
                }
            };
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m153434a(final Context context, final ImageView imageView, final Object obj, final LoadParams loadParams) {
        if (loadParams != null && context != null && imageView != null && UIUtils.canLoadImage(context)) {
            if (obj == null || (((obj instanceof C38824b) && TextUtils.isEmpty(((C38824b) obj).mo142313a())) || ((obj instanceof AvatarImage) && TextUtils.isEmpty(((AvatarImage) obj).getKey())))) {
                Log.m165383e("LarkImageUtil", "Key and Url is all empty, data is error");
            }
            if (DesktopUtil.m144301a(context) && (obj instanceof AvatarImage)) {
                loadParams.mo105413a(Integer.MIN_VALUE);
                loadParams.mo105422b(Integer.MIN_VALUE);
            }
            final int a = loadParams.mo105412a();
            final int b = loadParams.mo105421b();
            if (!loadParams.mo105434h()) {
                final C38878a a2 = m153433a(loadParams, obj);
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.image.impl.C38871c.RunnableC388721 */

                    public void run() {
                        C38871c.m153436a(a2, context, loadParams, imageView, a, b);
                    }
                });
                return;
            }
            C57865c.m224574a(new C57865c.AbstractC57873d<C38878a>() {
                /* class com.ss.android.lark.image.impl.C38871c.C388732 */

                /* renamed from: a */
                public C38878a produce() {
                    return C38871c.m153433a(loadParams, obj);
                }
            }, new C57865c.AbstractC57871b<C38878a>() {
                /* class com.ss.android.lark.image.impl.C38871c.C388743 */

                /* renamed from: a */
                public void consume(C38878a aVar) {
                    C38871c.m153436a(aVar, context, loadParams, imageView, a, b);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m153436a(final C38878a aVar, Context context, final LoadParams loadParams, final ImageView imageView, int i, int i2) {
        if (!(context instanceof Activity) || UIUtils.isActivityRunning((Activity) context)) {
            IRequestCreator load = ImageLoader.with(context).load(aVar.f99886a);
            load.diskCacheStrategy(loadParams.mo105435i());
            Drawable d = loadParams.mo105428d();
            if (d != null) {
                load.error(d);
            }
            Drawable c = loadParams.mo105426c();
            if (c != null) {
                load.placeholder(c);
            }
            switch (C388776.f99885a[loadParams.mo105430e().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                case 7:
                    load.fitCenter();
                    break;
                default:
                    if (!(i == Integer.MIN_VALUE && i2 == Integer.MIN_VALUE)) {
                        load.centerCrop();
                        break;
                    }
            }
            load.dontAnimate(loadParams.mo105437k());
            load.transform(loadParams.mo105433g());
            if ((i > 0 && i2 > 0) || (i == Integer.MIN_VALUE && i2 == Integer.MIN_VALUE)) {
                load.override(i, i2);
            }
            load.setErrorScaleType(loadParams.mo105432f());
            load.listener(new AbstractC38817h() {
                /* class com.ss.android.lark.image.impl.C38871c.C388765 */

                @Override // com.ss.android.lark.image.api.AbstractC38817h
                /* renamed from: a */
                public boolean mo53861a(Exception exc, Object obj, AbstractC38819j jVar, boolean z) {
                    if (aVar.f99887b != null) {
                        return aVar.f99887b.mo53861a(exc, obj, jVar, z);
                    }
                    return false;
                }

                @Override // com.ss.android.lark.image.api.AbstractC38817h
                /* renamed from: a */
                public boolean mo53862a(Object obj, Object obj2, AbstractC38819j jVar, DataSource dataSource, boolean z) {
                    C38871c.m153435a(imageView, loadParams.mo105430e());
                    if (aVar.f99887b != null) {
                        return aVar.f99887b.mo53862a(obj, obj2, jVar, dataSource, z);
                    }
                    return false;
                }
            });
            load.into(imageView);
        }
    }
}
