package com.ss.android.lark.widget.p2932c;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26310o;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.p2932c.C58348f;
import java.io.File;

/* renamed from: com.ss.android.lark.widget.c.g */
public class C58354g {

    /* renamed from: com.ss.android.lark.widget.c.g$a */
    public interface AbstractC58372a {
        /* renamed from: a */
        void mo122329a(IGetDataCallback<File> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.widget.c.g$b */
    public interface AbstractC58373b {
        /* renamed from: a */
        File mo197606a();
    }

    /* renamed from: b */
    public static void m226232b(final Context context, final File file) {
        if (context instanceof Activity) {
            C57805b.m224333d((Activity) context, new C57805b.AbstractC57809a() {
                /* class com.ss.android.lark.widget.p2932c.C58354g.C583719 */

                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                public void permissionGranted(boolean z) {
                    if (z) {
                        C58354g.m226233c(context, file);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m226227a(Context context, File file) {
        if (context != null && file != null) {
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(new ClipData(new ClipDescription(null, new String[]{"option/file_copy", "image/*"}), new ClipData.Item(C26310o.m95259a(context, file))));
            LKUIToast.show(context, (int) R.string.Lark_Legacy_CopyReady);
        }
    }

    /* renamed from: c */
    public static void m226233c(Context context, final File file) {
        if (context != null && file != null) {
            final String str = C57881t.m224651w(context) + System.currentTimeMillis();
            final Context applicationContext = context.getApplicationContext();
            C57865c.m224574a(new C57865c.AbstractC57873d<String>() {
                /* class com.ss.android.lark.widget.p2932c.C58354g.AnonymousClass10 */

                /* renamed from: a */
                public String produce() {
                    String str;
                    Exception e;
                    try {
                        File file = file;
                        if (file == null) {
                            return "";
                        }
                        String path = file.getPath();
                        str = str + "." + ImageUtils.m224131a(file).getValue();
                        C26311p.m95274a(path, str);
                        try {
                            if (TextUtils.isEmpty(str)) {
                                return "";
                            }
                        } catch (Exception e2) {
                            e = e2;
                            Log.m165398w("RightClickMenuUtils", "copyFile", e);
                            return str;
                        }
                        return str;
                    } catch (Exception e3) {
                        str = "";
                        e = e3;
                        Log.m165398w("RightClickMenuUtils", "copyFile", e);
                        return str;
                    }
                }
            }, new C57865c.AbstractC57871b<String>() {
                /* class com.ss.android.lark.widget.p2932c.C58354g.C583572 */

                /* renamed from: a */
                public void consume(String str) {
                    if (TextUtils.isEmpty(str)) {
                        LKUIToast.loadFail(applicationContext, (int) R.string.Lark_Legacy_SaveFailTip);
                        return;
                    }
                    C26311p.m95268a(applicationContext, str);
                    LKUIToast.loadSuccess(applicationContext, (int) R.string.Lark_Legacy_SaveSuccess);
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m226228a(Context context, View view, float f, float f2, View.OnClickListener onClickListener) {
        if (!DesktopUtil.m144301a(context)) {
            return false;
        }
        m226226a(context, view, f, f2, null, onClickListener, null, false);
        return true;
    }

    /* renamed from: a */
    public static boolean m226229a(final Context context, View view, float f, float f2, final AbstractC58372a aVar) {
        if (!DesktopUtil.m144301a(context)) {
            return false;
        }
        m226226a(context, view, f, f2, new View.OnClickListener() {
            /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583551 */

            public void onClick(View view) {
                aVar.mo122329a(new IGetDataCallback<File>() {
                    /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583551.C583561 */

                    /* renamed from: a */
                    public void onSuccess(File file) {
                        C58354g.m226227a(context, file);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165397w("RightClickMenuUtils", "onError copyImageToClipboard provideImageFile");
                    }
                });
            }
        }, new View.OnClickListener() {
            /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583583 */

            public void onClick(View view) {
                LKUIToast.showLoading(context, (int) R.string.Lark_Legacy_FileDownloading);
                aVar.mo122329a(new IGetDataCallback<File>() {
                    /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583583.C583591 */

                    /* renamed from: a */
                    public void onSuccess(File file) {
                        C58354g.m226232b(context, file);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165397w("RightClickMenuUtils", "onError trySaveImageToLocal provideImageFile");
                        LKUIToast.loadFail(context, (int) R.string.Lark_Legacy_SaveFailTip);
                    }
                });
            }
        }, null, true);
        return true;
    }

    /* renamed from: a */
    public static boolean m226231a(final Context context, View view, float f, float f2, final AbstractC58373b bVar) {
        if (!DesktopUtil.m144301a(context)) {
            return false;
        }
        m226226a(context, view, f, f2, new View.OnClickListener() {
            /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583604 */

            public void onClick(View view) {
                C57865c.m224574a(new C57865c.AbstractC57873d<File>() {
                    /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583604.C583611 */

                    /* renamed from: a */
                    public File produce() {
                        return bVar.mo197606a();
                    }
                }, new C57865c.AbstractC57871b<File>() {
                    /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583604.C583622 */

                    /* renamed from: a */
                    public void consume(File file) {
                        if (file != null) {
                            C58354g.m226227a(context, file);
                        } else {
                            Log.m165397w("RightClickMenuUtils", "onError copyImageToClipboard");
                        }
                    }
                });
            }
        }, new View.OnClickListener() {
            /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583635 */

            public void onClick(View view) {
                C57865c.m224574a(new C57865c.AbstractC57873d<File>() {
                    /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583635.C583641 */

                    /* renamed from: a */
                    public File produce() {
                        return bVar.mo197606a();
                    }
                }, new C57865c.AbstractC57871b<File>() {
                    /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583635.C583652 */

                    /* renamed from: a */
                    public void consume(File file) {
                        if (file != null) {
                            C58354g.m226232b(context, file);
                        } else {
                            Log.m165397w("RightClickMenuUtils", "onError trySaveImageToLocal");
                        }
                    }
                });
            }
        }, null, true);
        return true;
    }

    /* renamed from: a */
    public static boolean m226230a(final Context context, View view, float f, float f2, final AbstractC58372a aVar, View.OnClickListener onClickListener, boolean z) {
        View$OnClickListenerC583666 r4;
        if (!DesktopUtil.m144301a(context)) {
            return false;
        }
        View$OnClickListenerC583687 r2 = null;
        if (z) {
            r4 = null;
        } else {
            r4 = new View.OnClickListener() {
                /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583666 */

                public void onClick(View view) {
                    aVar.mo122329a(new IGetDataCallback<File>() {
                        /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583666.C583671 */

                        /* renamed from: a */
                        public void onSuccess(File file) {
                            C58354g.m226227a(context, file);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165397w("RightClickMenuUtils", "onError copyImageToClipboard provideImageFile");
                        }
                    });
                }
            };
        }
        if (!z) {
            r2 = new View.OnClickListener() {
                /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583687 */

                public void onClick(View view) {
                    aVar.mo122329a(new IGetDataCallback<File>() {
                        /* class com.ss.android.lark.widget.p2932c.C58354g.View$OnClickListenerC583687.C583691 */

                        /* renamed from: a */
                        public void onSuccess(File file) {
                            C58354g.m226232b(context, file);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165397w("RightClickMenuUtils", "onError trySaveImageToLocal provideImageFile");
                        }
                    });
                }
            };
        }
        m226226a(context, view, f, f2, r4, r2, onClickListener, true);
        return true;
    }

    /* renamed from: a */
    private static void m226226a(Context context, View view, float f, float f2, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2, final View.OnClickListener onClickListener3, boolean z) {
        String str;
        view.getGlobalVisibleRect(new Rect());
        C58348f.C58350a aVar = new C58348f.C58350a(context);
        if (onClickListener != null) {
            aVar.mo197584a(0, context.getString(R.string.Lark_Legacy_Copy), context.getDrawable(R.drawable.ic_right_menu_copy));
        }
        if (onClickListener2 != null) {
            if (z) {
                str = context.getString(R.string.Lark_Legacy_DownloadFullImage);
            } else {
                str = context.getString(R.string.Lark_Legacy_DownloadVideo);
            }
            aVar.mo197584a(1, str, context.getDrawable(R.drawable.ic_right_menu_download));
        }
        if (onClickListener3 != null) {
            aVar.mo197584a(2, context.getString(R.string.Lark_Legacy_AddStickerForChat), context.getDrawable(R.drawable.ic_right_menu_add_sticker));
        }
        aVar.mo197582a(14.0f).mo197583a(UIHelper.dp2px(10.0f)).mo197586a(context.getDrawable(R.drawable.desktop_right_click_menu_bg)).mo197587a(new C58348f.AbstractC58353d() {
            /* class com.ss.android.lark.widget.p2932c.C58354g.C583708 */

            @Override // com.ss.android.lark.widget.p2932c.C58348f.AbstractC58353d
            public void onMenuItemClick(int i, View view) {
                View.OnClickListener onClickListener;
                if (i == 0) {
                    View.OnClickListener onClickListener2 = onClickListener;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                } else if (i == 1) {
                    View.OnClickListener onClickListener3 = onClickListener2;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(view);
                    }
                } else if (i == 2 && (onClickListener = onClickListener3) != null) {
                    onClickListener.onClick(view);
                }
            }
        }).mo197581a().showAtLocation(view, 8388659, (int) f, (int) f2);
    }
}
