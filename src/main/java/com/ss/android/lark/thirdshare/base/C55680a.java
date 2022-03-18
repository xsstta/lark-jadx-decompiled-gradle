package com.ss.android.lark.thirdshare.base;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.base.export.downgrade.C55727a;
import com.ss.android.lark.thirdshare.base.export.downgrade.CtaBtnStyle;
import com.ss.android.lark.thirdshare.base.export.downgrade.ShareDowngradePanelCallback;
import com.ss.android.lark.thirdshare.base.export.p2742d.C55721b;
import com.ss.android.lark.thirdshare.base.export.p2742d.C55723c;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.lark.thirdshare.base.a */
public class C55680a {

    /* renamed from: com.ss.android.lark.thirdshare.base.a$a */
    public interface AbstractC55692a extends AbstractC55693b {
        void noNoPermission();
    }

    /* renamed from: com.ss.android.lark.thirdshare.base.a$b */
    public interface AbstractC55693b {
        void onSaveFailed(String str);

        void onSaveSuccess(File file);
    }

    /* renamed from: a */
    public static void m215713a(String str) {
        C55721b.m215806a(str);
    }

    /* renamed from: a */
    public static void m215708a(ShareActionType shareActionType, String str, ApiUtils.AbstractC57748a<Boolean> aVar) {
        C55721b.m215804a(shareActionType, str, aVar);
    }

    /* renamed from: a */
    public static void m215711a(File file, ApiUtils.AbstractC57748a<Boolean> aVar) {
        C55721b.m215805a(file, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m215706a(ShareActionType shareActionType, ShareDowngradePanelCallback shareDowngradePanelCallback) {
        if (!m215714a(shareActionType) || !m215717c(shareActionType.getPkgName())) {
            if (shareDowngradePanelCallback != null) {
                shareDowngradePanelCallback.onFailed(shareActionType, OnShareCallback.NOT_INSTALLED);
            }
        } else if (shareDowngradePanelCallback != null) {
            shareDowngradePanelCallback.onSuccess(shareActionType);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m215709a(ShareDowngradePanelCallback shareDowngradePanelCallback, ShareActionType shareActionType) {
        if (shareDowngradePanelCallback != null) {
            shareDowngradePanelCallback.onFailed(shareActionType, OnShareCallback.CANCELED);
        }
    }

    /* renamed from: a */
    public static void m215712a(CharSequence charSequence) {
        ((ClipboardManager) aj.m224263a().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", charSequence));
    }

    /* renamed from: a */
    public static void m215710a(final File file, final AbstractC55692a aVar) {
        final String w = C57881t.m224651w(aj.m224263a());
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.thirdshare.base.C55680a.RunnableC556843 */

            public void run() {
                String str = w;
                final File file = new File(str, System.currentTimeMillis() + ".jpg");
                try {
                    if (C55680a.m215715a(file, new FileInputStream(file))) {
                        ViewUtils.m224148a(new Runnable() {
                            /* class com.ss.android.lark.thirdshare.base.C55680a.RunnableC556843.RunnableC556851 */

                            public void run() {
                                if (aVar != null) {
                                    aVar.onSaveSuccess(file);
                                }
                            }
                        });
                        C26311p.m95268a(aj.m224263a(), file.getAbsolutePath());
                        return;
                    }
                    ViewUtils.m224148a(new Runnable() {
                        /* class com.ss.android.lark.thirdshare.base.C55680a.RunnableC556843.RunnableC556862 */

                        public void run() {
                            if (aVar != null) {
                                aVar.onSaveFailed("copy image failed.");
                            }
                        }
                    });
                } catch (FileNotFoundException e) {
                    ViewUtils.m224148a(new Runnable() {
                        /* class com.ss.android.lark.thirdshare.base.C55680a.RunnableC556843.RunnableC556873 */

                        public void run() {
                            if (aVar != null) {
                                aVar.onSaveFailed(e.getMessage());
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public static boolean m215714a(ShareActionType shareActionType) {
        if (shareActionType == null || !shareActionType.isThirdAppShareType()) {
            return false;
        }
        return m215716b(shareActionType.getPkgName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0043 A[SYNTHETIC, Splitter:B:31:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0056 A[SYNTHETIC, Splitter:B:41:0x0056] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m215715a(java.io.File r4, java.io.InputStream r5) {
        /*
            r0 = 0
            r1 = 0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0035 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0035 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0035 }
            r4 = 524288(0x80000, float:7.34684E-40)
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x0035 }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0030, all -> 0x002d }
        L_0x0010:
            int r1 = r5.read(r4)     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            r3 = -1
            if (r1 == r3) goto L_0x001b
            r2.write(r4, r0, r1)     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            goto L_0x0010
        L_0x001b:
            r4 = 1
            r5.close()     // Catch:{ IOException -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0024:
            r2.close()     // Catch:{ IOException -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r5 = move-exception
            r5.printStackTrace()
        L_0x002c:
            return r4
        L_0x002d:
            r4 = move-exception
            r1 = r2
            goto L_0x004c
        L_0x0030:
            r4 = move-exception
            r1 = r2
            goto L_0x0036
        L_0x0033:
            r4 = move-exception
            goto L_0x004c
        L_0x0035:
            r4 = move-exception
        L_0x0036:
            r4.printStackTrace()     // Catch:{ all -> 0x0033 }
            r5.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0041:
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r4 = move-exception
            r4.printStackTrace()
        L_0x004b:
            return r0
        L_0x004c:
            r5.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0054:
            if (r1 == 0) goto L_0x005e
            r1.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r5 = move-exception
            r5.printStackTrace()
        L_0x005e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.thirdshare.base.C55680a.m215715a(java.io.File, java.io.InputStream):boolean");
    }

    /* renamed from: b */
    public static boolean m215716b(String str) {
        try {
            return aj.m224263a().getPackageManager().getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m215717c(String str) {
        try {
            String d = m215718d(str);
            if (TextUtils.isEmpty(d)) {
                Log.m165383e("ThirdShare", "launcherActivity is null.");
                return false;
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setComponent(new ComponentName(str, d));
            intent.addFlags(268435456);
            aj.m224263a().startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static String m215718d(String str) {
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = aj.m224263a().getPackageManager().queryIntentActivities(intent, 0);
        int size = queryIntentActivities.size();
        if (size == 0) {
            return "";
        }
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i);
            if (resolveInfo.activityInfo.processName.equals(str)) {
                return resolveInfo.activityInfo.name;
            }
        }
        return queryIntentActivities.get(0).activityInfo.name;
    }

    /* renamed from: a */
    public static void m215699a(Context context, ShareEntity shareEntity) {
        C55723c.m215808a(context, shareEntity);
    }

    /* renamed from: a */
    public static File m215697a(Bitmap bitmap, String str) {
        if (bitmap.isRecycled() || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            File file = new File(str, System.currentTimeMillis() + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m215703a(final Bitmap bitmap, final AbstractC55692a aVar) {
        if (bitmap != null && !bitmap.isRecycled()) {
            final String w = C57881t.m224651w(aj.m224263a());
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.thirdshare.base.C55680a.RunnableC556884 */

                public void run() {
                    final File a = C55680a.m215697a(bitmap, w);
                    C26171w.m94675a(new Runnable() {
                        /* class com.ss.android.lark.thirdshare.base.C55680a.RunnableC556884.RunnableC556891 */

                        public void run() {
                            if (a != null) {
                                if (aVar != null) {
                                    aVar.onSaveSuccess(a);
                                }
                                C26311p.m95268a(aj.m224263a(), a.getAbsolutePath());
                            } else if (aVar != null) {
                                aVar.onSaveFailed("File is null.");
                            }
                        }
                    });
                }
            });
        } else if (aVar != null) {
            aVar.onSaveFailed("Bitmap is null or recycled.");
        }
    }

    /* renamed from: a */
    public static void m215704a(final Bitmap bitmap, final AbstractC55693b bVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.thirdshare.base.C55680a.RunnableC556905 */

            public void run() {
                final File a = C55680a.m215697a(bitmap, C57881t.m224649u(aj.m224263a()));
                C26171w.m94675a(new Runnable() {
                    /* class com.ss.android.lark.thirdshare.base.C55680a.RunnableC556905.RunnableC556911 */

                    public void run() {
                        if (a == null) {
                            Log.m165383e("ThirdShare", "saveImage failed.");
                            if (bVar != null) {
                                bVar.onSaveFailed("file is null.");
                                return;
                            }
                            return;
                        }
                        bVar.onSaveSuccess(a);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static void m215705a(ShareActionType shareActionType, Bitmap bitmap, ApiUtils.AbstractC57748a<Boolean> aVar) {
        C55721b.m215801a(shareActionType, bitmap, aVar);
    }

    /* renamed from: a */
    public static void m215707a(ShareActionType shareActionType, File file, ApiUtils.AbstractC57748a<Boolean> aVar) {
        C55721b.m215802a(shareActionType, file, aVar);
    }

    /* renamed from: a */
    public static void m215698a(Context context, final Bitmap bitmap, final AbstractC55692a aVar) {
        if (ViewUtils.m224153b(context)) {
            C57805b.m224333d(ViewUtils.m224141a(context), new C57805b.AbstractC57809a() {
                /* class com.ss.android.lark.thirdshare.base.C55680a.C556811 */

                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                public void permissionGranted(boolean z) {
                    if (z) {
                        C55680a.m215703a(bitmap, aVar);
                        return;
                    }
                    AbstractC55692a aVar = aVar;
                    if (aVar != null) {
                        aVar.noNoPermission();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m215700a(Context context, final File file, final AbstractC55692a aVar) {
        if (ViewUtils.m224153b(context)) {
            C57805b.m224333d(ViewUtils.m224141a(context), new C57805b.AbstractC57809a() {
                /* class com.ss.android.lark.thirdshare.base.C55680a.C556822 */

                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                public void permissionGranted(boolean z) {
                    if (z) {
                        C55680a.m215710a(file, aVar);
                    } else {
                        ViewUtils.m224148a(new Runnable() {
                            /* class com.ss.android.lark.thirdshare.base.C55680a.C556822.RunnableC556831 */

                            public void run() {
                                if (aVar != null) {
                                    aVar.noNoPermission();
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m215701a(Context context, String str, String str2, ShareActionType shareActionType, ShareDowngradePanelCallback shareDowngradePanelCallback) {
        CtaBtnStyle thirdAppCtaBtnStyle = CtaBtnStyle.getThirdAppCtaBtnStyle(shareActionType);
        if (thirdAppCtaBtnStyle == null) {
            Log.m165383e("ThirdShare", shareActionType + "not support");
            ViewUtils.m224144a();
            return;
        }
        m215702a(context, str, str2, str, thirdAppCtaBtnStyle, shareActionType, "", shareDowngradePanelCallback);
    }

    /* renamed from: a */
    public static void m215702a(Context context, String str, String str2, String str3, CtaBtnStyle ctaBtnStyle, ShareActionType shareActionType, String str4, ShareDowngradePanelCallback shareDowngradePanelCallback) {
        C55727a.m215829a(context, str, str2, str3, ctaBtnStyle, new Runnable(shareDowngradePanelCallback) {
            /* class com.ss.android.lark.thirdshare.base.$$Lambda$a$MEhv4aQMOcVj7iky2IYLPdok_l4 */
            public final /* synthetic */ ShareDowngradePanelCallback f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C55680a.m215706a(ShareActionType.this, this.f$1);
            }
        }, str4, new Runnable(shareActionType) {
            /* class com.ss.android.lark.thirdshare.base.$$Lambda$a$eutHR8HAYrIHOF0FIesdsvdLk */
            public final /* synthetic */ ShareActionType f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C55680a.m215709a(ShareDowngradePanelCallback.this, this.f$1);
            }
        });
    }
}
