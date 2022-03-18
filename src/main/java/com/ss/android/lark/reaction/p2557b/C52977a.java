package com.ss.android.lark.reaction.p2557b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.newemoji.loader.EmojiImageResource;
import com.ss.android.lark.reaction.p2557b.C52977a;

/* renamed from: com.ss.android.lark.reaction.b.a */
public class C52977a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.reaction.b.a$a */
    public static class C52980a {

        /* renamed from: a */
        public static final C52977a f130892a = new C52977a();
    }

    /* renamed from: com.ss.android.lark.reaction.b.a$b */
    public interface AbstractC52981b<Data> extends IGetDataCallback<Data> {
        /* renamed from: a */
        void mo181001a();
    }

    private C52977a() {
    }

    /* renamed from: a */
    public static C52977a m205190a() {
        return C52980a.f130892a;
    }

    /* renamed from: a */
    private void m205191a(final String str, final Runnable runnable) {
        C52986b.m205217a(str, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.reaction.p2557b.C52977a.C529792 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("ReactionLoaderManager", errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    Runnable runnable = runnable;
                    runnable.getClass();
                    UICallbackExecutor.execute(new Runnable(runnable) {
                        /* class com.ss.android.lark.reaction.p2557b.$$Lambda$m5h7XYK32O7TqBM7SWcvc7fLX0o */
                        public final /* synthetic */ Runnable f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void run() {
                            this.f$0.run();
                        }
                    });
                    return;
                }
                Log.m165389i("ReactionLoaderManager", "reaction key: " + str + " not exist in map");
            }
        });
    }

    /* renamed from: b */
    public void mo180997b(ImageView imageView, String str) {
        if (C52986b.m205221e(str)) {
            m205194e(imageView, str);
        } else {
            m205191a(str, new Runnable(imageView, str) {
                /* class com.ss.android.lark.reaction.p2557b.$$Lambda$a$ihqQPVnhC0IvrwmBZLYbW6vHsWY */
                public final /* synthetic */ ImageView f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C52977a.this.m205193d(this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo180995a(ImageView imageView, String str) {
        if (C52986b.m205221e(str)) {
            m205194e(imageView, str);
            return;
        }
        imageView.setImageResource(R.drawable.icon_default_reaction);
        m205191a(str, new Runnable(imageView, str) {
            /* class com.ss.android.lark.reaction.p2557b.$$Lambda$a$PWQ_cyio62XClOzLQVQwtCprc */
            public final /* synthetic */ ImageView f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C52977a.this.m205194e(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: c */
    public void m205194e(ImageView imageView, String str) {
        if (imageView != null) {
            if (TextUtils.isEmpty(str)) {
                imageView.setImageResource(R.drawable.icon_default_reaction);
                return;
            }
            Bitmap b = C52986b.m205218b(str);
            String c = C52986b.m205219c(str);
            if (b != null) {
                Log.m165389i("ReactionLoaderManager", "reaction key = " + str + ",bitmap not null, set bitmap");
                imageView.setImageBitmap(b);
            } else if (!TextUtils.isEmpty(c)) {
                Log.m165389i("ReactionLoaderManager", "reaction key = " + str + ", load bitmap by imageKey, imageKey = " + c);
                ImageLoader.with(imageView.getContext()).load(new EmojiImageResource(c)).error(R.drawable.icon_default_reaction).into(imageView);
            } else {
                Log.m165389i("ReactionLoaderManager", "reaction key = " + str + ", set default drawable");
                imageView.setImageResource(R.drawable.icon_default_reaction);
            }
        }
    }

    /* renamed from: a */
    public void mo180994a(Context context, String str, AbstractC52981b<Drawable> bVar) {
        if (C52986b.m205221e(str)) {
            m205192c(context, str, bVar);
            return;
        }
        bVar.mo181001a();
        m205191a(str, new Runnable(context, str, bVar) {
            /* class com.ss.android.lark.reaction.p2557b.$$Lambda$a$iQ9oSIdW7yN3CvifyWPtfiu5Iyc */
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ C52977a.AbstractC52981b f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C52977a.this.m205192c(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: b */
    public void m205192c(Context context, String str, final AbstractC52981b<Drawable> bVar) {
        if (bVar != null) {
            if (TextUtils.isEmpty(str)) {
                bVar.onError(new ErrorResult("reaction key is null"));
                return;
            }
            Bitmap b = C52986b.m205218b(str);
            String c = C52986b.m205219c(str);
            if (b != null) {
                Log.m165389i("ReactionLoaderManager", "reaction key = " + str + ",bitmap not null, set bitmap");
                bVar.onSuccess(new BitmapDrawable(context.getResources(), b));
            } else if (!TextUtils.isEmpty(c)) {
                Log.m165389i("ReactionLoaderManager", "reaction key = " + str + ", load bitmap by imageKey, imageKey = " + c);
                ImageLoader.with(context).load(new EmojiImageResource(c)).asDrawable().into(new C38818i<Drawable>() {
                    /* class com.ss.android.lark.reaction.p2557b.C52977a.C529781 */

                    /* renamed from: d */
                    public void mo49248a(Drawable drawable) {
                        if (drawable != null) {
                            bVar.onSuccess(drawable);
                        } else {
                            bVar.onError(new ErrorResult("load reaction is null"));
                        }
                    }
                });
            } else {
                Log.m165389i("ReactionLoaderManager", "reaction key = " + str + ", set default drawable");
                bVar.onError(new ErrorResult("reaction key not exist in map"));
            }
        }
    }
}
