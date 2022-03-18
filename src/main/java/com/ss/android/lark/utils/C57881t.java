package com.ss.android.lark.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26266d;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.diskmanage.clean.DiskCleanUtils;
import com.ss.android.lark.diskmanage.storage.StoragePathUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.AbstractC57864b;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/* renamed from: com.ss.android.lark.utils.t */
public class C57881t {

    /* renamed from: com.ss.android.lark.utils.t$a */
    public interface AbstractC57884a {
        /* renamed from: a */
        void mo120345a(String str);

        /* renamed from: a */
        void mo120346a(Throwable th);
    }

    /* renamed from: A */
    public static String m224602A(Context context) {
        return StoragePathUtils.f94669a.mo135714L(context);
    }

    /* renamed from: B */
    public static String m224603B(Context context) {
        return StoragePathUtils.f94669a.mo135715M(context);
    }

    /* renamed from: C */
    public static String m224604C(Context context) {
        return StoragePathUtils.f94669a.mo135716N(context);
    }

    /* renamed from: D */
    public static String m224605D(Context context) {
        return StoragePathUtils.f94669a.mo135717O(context);
    }

    /* renamed from: E */
    public static String m224606E(Context context) {
        return StoragePathUtils.f94669a.mo135718P(context);
    }

    /* renamed from: F */
    public static String m224607F(Context context) {
        return StoragePathUtils.f94669a.mo135719Q(context);
    }

    /* renamed from: G */
    public static String m224608G(Context context) {
        return StoragePathUtils.f94669a.mo135720R(context);
    }

    /* renamed from: H */
    public static String m224609H(Context context) {
        return StoragePathUtils.f94669a.mo135721S(context);
    }

    /* renamed from: I */
    public static String m224610I(Context context) {
        return StoragePathUtils.f94669a.mo135722T(context);
    }

    /* renamed from: K */
    public static String m224612K(Context context) {
        return StoragePathUtils.f94669a.mo135723U(context);
    }

    /* renamed from: d */
    public static String m224630d(Context context) {
        return StoragePathUtils.f94669a.mo135741g(context);
    }

    /* renamed from: e */
    public static String m224632e(Context context) {
        return StoragePathUtils.f94669a.mo135742h(context);
    }

    /* renamed from: f */
    public static String m224634f(Context context) {
        return StoragePathUtils.f94669a.mo135743i(context);
    }

    /* renamed from: g */
    public static String m224635g(Context context) {
        return StoragePathUtils.f94669a.mo135744j(context);
    }

    /* renamed from: h */
    public static String m224636h(Context context) {
        return StoragePathUtils.f94669a.mo135745k(context);
    }

    /* renamed from: i */
    public static String m224637i(Context context) {
        return StoragePathUtils.f94669a.mo135746l(context);
    }

    /* renamed from: j */
    public static String m224638j(Context context) {
        return StoragePathUtils.f94669a.mo135747m(context);
    }

    /* renamed from: k */
    public static String m224639k(Context context) {
        return StoragePathUtils.f94669a.mo135748n(context);
    }

    /* renamed from: l */
    public static String m224640l(Context context) {
        return StoragePathUtils.f94669a.mo135749o(context);
    }

    /* renamed from: m */
    public static String m224641m(Context context) {
        return StoragePathUtils.f94669a.mo135750p(context);
    }

    /* renamed from: n */
    public static String m224642n(Context context) {
        return StoragePathUtils.f94669a.mo135751q(context);
    }

    /* renamed from: o */
    public static String m224643o(Context context) {
        return StoragePathUtils.f94669a.mo135753s(context);
    }

    /* renamed from: p */
    public static String m224644p(Context context) {
        return StoragePathUtils.f94669a.mo135754t(context);
    }

    /* renamed from: q */
    public static String m224645q(Context context) {
        return StoragePathUtils.f94669a.mo135755u(context);
    }

    /* renamed from: r */
    public static String m224646r(Context context) {
        return StoragePathUtils.f94669a.mo135756v(context);
    }

    /* renamed from: s */
    public static String m224647s(Context context) {
        return StoragePathUtils.f94669a.mo135757w(context);
    }

    /* renamed from: t */
    public static String m224648t(Context context) {
        return StoragePathUtils.f94669a.mo135758x(context);
    }

    /* renamed from: u */
    public static String m224649u(Context context) {
        return StoragePathUtils.f94669a.mo135759y(context);
    }

    /* renamed from: v */
    public static String m224650v(Context context) {
        return StoragePathUtils.f94669a.mo135760z(context);
    }

    /* renamed from: w */
    public static String m224651w(Context context) {
        return StoragePathUtils.f94669a.mo135703A(context);
    }

    /* renamed from: x */
    public static String m224652x(Context context) {
        return StoragePathUtils.f94669a.mo135706D(context);
    }

    /* renamed from: y */
    public static String m224653y(Context context) {
        return StoragePathUtils.f94669a.mo135712J(context);
    }

    /* renamed from: z */
    public static String m224654z(Context context) {
        return StoragePathUtils.f94669a.mo135713K(context);
    }

    /* renamed from: c */
    public static String m224628c(Context context) {
        return StoragePathUtils.f94669a.mo135740f(context);
    }

    /* renamed from: a */
    public static String m224616a(Context context) {
        return StoragePathUtils.f94669a.mo135738d(context);
    }

    /* renamed from: b */
    public static String m224623b(Context context) {
        return StoragePathUtils.f94669a.mo135707E(context);
    }

    /* renamed from: J */
    public static String m224611J(Context context) {
        return StoragePathUtils.f94669a.mo135728Z(context) + File.separator + "rust_avatar" + File.separator;
    }

    /* renamed from: a */
    public static int m224613a(String str, String str2) {
        return m224627c(str, str2, true);
    }

    /* renamed from: b */
    public static int m224621b(String str, String str2) {
        return m224614a(str, str2, 0);
    }

    /* renamed from: c */
    public static int m224626c(String str, String str2) {
        return m224614a(str, str2, 1);
    }

    /* renamed from: e */
    public static boolean m224633e(String str, String str2) {
        return new File(m224631d(str, str2)).exists();
    }

    /* renamed from: c */
    public static String m224629c(Context context, String str) {
        return StoragePathUtils.f94669a.mo135737c(context, str);
    }

    /* renamed from: d */
    public static String m224631d(String str, String str2) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public static String m224624b(Context context, String str) {
        return StoragePathUtils.f94669a.mo135734b(context, str);
    }

    /* renamed from: a */
    public static String m224617a(Context context, String str) {
        return StoragePathUtils.f94669a.mo135730a(context, str);
    }

    /* renamed from: a */
    public static List<File> m224619a(File file, String str) {
        return DiskCleanUtils.f94602a.mo135607b(file, str);
    }

    /* renamed from: a */
    public static int m224615a(String str, String str2, boolean z) {
        if (z) {
            return FileType.TYPE_FOLDER.getResId(0);
        }
        return m224621b(str, str2);
    }

    /* renamed from: b */
    public static int m224622b(String str, String str2, boolean z) {
        if (z) {
            return FileType.TYPE_FOLDER.getResId(1);
        }
        return m224626c(str, str2);
    }

    /* renamed from: a */
    private static int m224614a(String str, String str2, int i) {
        FileType fileType = FileType.TYPE_UNKNOWN;
        if (!TextUtils.isEmpty(str)) {
            fileType = FileType.getFileTypeByMime(str);
        }
        if (fileType == FileType.TYPE_UNKNOWN && !TextUtils.isEmpty(str2)) {
            String g = C26311p.m95287g(str2);
            if (!TextUtils.isEmpty(g)) {
                fileType = FileType.getFileTypeBySuffix(g);
            }
        }
        return fileType.getResId(i);
    }

    /* renamed from: c */
    private static int m224627c(String str, String str2, boolean z) {
        FileType fileType = FileType.TYPE_UNKNOWN;
        if (!TextUtils.isEmpty(str)) {
            fileType = FileType.getFileTypeByMime(str);
        }
        if (fileType == FileType.TYPE_UNKNOWN && !TextUtils.isEmpty(str2)) {
            String g = C26311p.m95287g(str2);
            if (!TextUtils.isEmpty(g)) {
                fileType = FileType.getFileTypeBySuffix(g);
            }
        }
        return fileType.getResId(z);
    }

    /* renamed from: b */
    public static String m224625b(Context context, String str, String str2) {
        return StoragePathUtils.f94669a.mo135735b(context, str, str2);
    }

    /* renamed from: a */
    public static String m224618a(Context context, String str, String str2) {
        return StoragePathUtils.f94669a.mo135731a(context, str, str2);
    }

    /* renamed from: a */
    public static void m224620a(Context context, final Bitmap bitmap, final String str, final AbstractC57884a aVar) {
        Observable.create(new ObservableOnSubscribe<String>() {
            /* class com.ss.android.lark.utils.C57881t.C578832 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<String> observableEmitter) throws Exception {
                Throwable th;
                Exception e;
                String str = str;
                File file = new File(str);
                if (!file.exists()) {
                    FileOutputStream fileOutputStream = null;
                    try {
                        file.createNewFile();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 80, fileOutputStream2);
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            observableEmitter.onNext(str);
                            observableEmitter.onComplete();
                            C26266d.m95082a(fileOutputStream2);
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            try {
                                observableEmitter.onError(e);
                                C26266d.m95082a(fileOutputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                C26266d.m95082a(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream2;
                            C26266d.m95082a(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        observableEmitter.onError(e);
                        C26266d.m95082a(fileOutputStream);
                    }
                } else {
                    observableEmitter.onNext(str);
                    observableEmitter.onComplete();
                }
            }
        }).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new AbstractC57864b<String>() {
            /* class com.ss.android.lark.utils.C57881t.C578821 */

            /* renamed from: a */
            public void onNext(String str) {
            }

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
            }

            @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b, io.reactivex.AbstractC69009q
            public void onComplete() {
                Log.m165388i("save success!");
                aVar.mo120345a(str);
            }

            @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b
            /* renamed from: a */
            public void mo147247a(Throwable th) {
                aVar.mo120346a(th);
            }
        });
    }
}
