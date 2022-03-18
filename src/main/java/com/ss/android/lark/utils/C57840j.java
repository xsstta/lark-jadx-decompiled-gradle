package com.ss.android.lark.utils;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.statistics.UtilHitPoint;
import com.ss.android.p1242a.AbstractC27222d;
import com.ss.android.p1242a.AbstractC27227h;
import com.ss.android.p1242a.C27215a;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.File;
import java.util.Arrays;

/* renamed from: com.ss.android.lark.utils.j */
public class C57840j {

    /* renamed from: c */
    private static C57840j f142457c = new C57840j();

    /* renamed from: d */
    private static boolean f142458d;

    /* renamed from: a */
    public C27215a f142459a;

    /* renamed from: b */
    public Context f142460b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.utils.j$a */
    public static class C57848a {

        /* renamed from: a */
        static final String[] f142473a = {"libaudioeffect.so", "libttffmpeg.so", "libttffmpeg-invoker.so", "libttffmpeg-main.so", "libttvideoeditor.so", "libyuv.so", "libttmain.so", "libttSDL2.so", "libgraphicbuf.so", "libhardwarebuf.so"};

        /* renamed from: b */
        static final String[] f142474b = {"libgnustl_shared.so", "libreactnativejni.so", "libfbrn.so", "libglog.so", "libglog_init.so", "libprivatedata.so", "libfolly_json.so", "libjsc.so", "libicu_common.so"};

        /* renamed from: c */
        static final String[] f142475c = {"libj2v8.so", "libttv8.so", "libfile-stat.so"};

        /* renamed from: d */
        static final String[] f142476d = {"libeffect.so"};

        /* renamed from: e */
        static final String[] f142477e = {"libttmplayer.so", "libavmdl.so", "libvideodec.so"};
    }

    private C57840j() {
    }

    /* renamed from: b */
    public static C57840j m224506b() {
        return f142457c;
    }

    /* renamed from: c */
    public static boolean m224507c() {
        return f142458d;
    }

    /* renamed from: a */
    public static void m224504a() {
        C27215a.m98917a("ve", C57848a.f142473a);
        C27215a.m98917a("doc", C57848a.f142474b);
        C27215a.m98917a("vc", C57848a.f142476d);
        C27215a.m98917a("videoplayer", C57848a.f142477e);
        C27215a.m98917a("smartprogram", C57848a.f142475c);
    }

    /* renamed from: a */
    public static void m224505a(boolean z) {
        C27215a.m98918a(z);
        f142458d = z;
    }

    /* renamed from: b */
    public Observable<Boolean> mo196190b(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return Observable.just(false);
        }
        return m224503a(false, strArr);
    }

    /* renamed from: c */
    public void mo196191c(String... strArr) {
        this.f142459a.mo97071a(strArr, new Runnable() {
            /* class com.ss.android.lark.utils.C57840j.RunnableC578433 */

            public void run() {
            }
        }, new Runnable() {
            /* class com.ss.android.lark.utils.C57840j.RunnableC578444 */

            public void run() {
            }
        });
        this.f142459a.mo97068a(this.f142460b, strArr, true);
    }

    /* renamed from: a */
    public void mo196188a(Context context) {
        if (context != null && this.f142459a == null) {
            this.f142460b = context;
            this.f142459a = new C27215a(context, "lzma", true, new AbstractC27227h() {
                /* class com.ss.android.lark.utils.C57840j.C578411 */

                @Override // com.ss.android.p1242a.AbstractC27227h
                /* renamed from: a */
                public String mo97097a(String str) {
                    return C57744a.m224104a().getString(str);
                }

                @Override // com.ss.android.p1242a.AbstractC27227h
                /* renamed from: a */
                public void mo97098a(String str, String str2) {
                    C57744a.m224104a().putString(str, str2);
                }
            }, new AbstractC27222d() {
                /* class com.ss.android.lark.utils.C57840j.C578422 */

                @Override // com.ss.android.p1242a.AbstractC27222d
                /* renamed from: a */
                public void mo97085a(String str, String str2) {
                    Log.m165389i(str, str2);
                }

                @Override // com.ss.android.p1242a.AbstractC27222d
                /* renamed from: b */
                public void mo97087b(String str, String str2) {
                    Log.m165393v(str, str2);
                }

                @Override // com.ss.android.p1242a.AbstractC27222d
                /* renamed from: a */
                public void mo97086a(String str, String str2, Throwable th) {
                    Log.m165384e(str, str2, th);
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo196189a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        return C27215a.m98919a((String[]) strArr.clone());
    }

    /* renamed from: a */
    private Observable<Boolean> m224503a(final boolean z, final String... strArr) {
        final long currentTimeMillis = System.currentTimeMillis();
        return Observable.create(new ObservableOnSubscribe<Boolean>() {
            /* class com.ss.android.lark.utils.C57840j.C578455 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(final ObservableEmitter<Boolean> observableEmitter) throws Exception {
                C57840j.this.f142459a.mo97071a(strArr, new Runnable() {
                    /* class com.ss.android.lark.utils.C57840j.C578455.RunnableC578461 */

                    public void run() {
                        if (!observableEmitter.isDisposed()) {
                            UtilHitPoint.f142501a.mo196221a(true, Arrays.toString(strArr), "task_decompression", System.currentTimeMillis() - currentTimeMillis, C26252ad.m94992a(C57840j.this.f142460b));
                            observableEmitter.onNext(true);
                            observableEmitter.onComplete();
                        }
                    }
                }, new Runnable() {
                    /* class com.ss.android.lark.utils.C57840j.C578455.RunnableC578472 */

                    public void run() {
                        if (!observableEmitter.isDisposed()) {
                            UtilHitPoint.f142501a.mo196221a(false, Arrays.toString(strArr), "task_decompression", System.currentTimeMillis() - currentTimeMillis, C26252ad.m94992a(C57840j.this.f142460b));
                            observableEmitter.onNext(false);
                            observableEmitter.onComplete();
                        }
                    }
                });
                C57840j.this.f142459a.mo97068a(C57840j.this.f142460b, strArr, z);
            }
        });
    }

    /* renamed from: a */
    public File mo196187a(Context context, boolean z) {
        String str;
        if (z) {
            File filesDir = context.getApplicationContext().getFilesDir();
            return new File(filesDir, "so_decompressed" + File.separatorChar + "armeabi-v7a");
        }
        String a = C26252ad.m94992a(context);
        if (TextUtils.isEmpty(a)) {
            str = "";
        } else {
            str = a.replace(".", "_").replace(":", "_");
        }
        Log.m165379d("CompressSoLoader", "process Key : " + str);
        Log.m165379d("CompressSoLoader", "process Dir : so_decompressed" + File.separatorChar + str + "_" + "armeabi-v7a");
        File filesDir2 = context.getApplicationContext().getFilesDir();
        return new File(filesDir2, "so_decompressed" + File.separatorChar + str + "_" + "armeabi-v7a");
    }
}
