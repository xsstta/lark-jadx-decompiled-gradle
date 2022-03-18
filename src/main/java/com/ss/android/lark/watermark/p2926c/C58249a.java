package com.ss.android.lark.watermark.p2926c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26254af;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.watermark.core.IAttachResultCallback;
import com.ss.android.lark.watermark.core.IAttachToBitmapCallback;
import com.ss.android.lark.watermark.core.WatermarkCache;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import com.ss.android.lark.watermark.p2925b.C58244b;
import com.ss.android.lark.watermark.p2925b.C58247c;
import com.ss.android.lark.watermark.p2929f.AbstractC58289c;
import com.ss.android.lark.watermark.p2929f.C58286a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.lark.watermark.c.a */
public class C58249a {

    /* renamed from: a */
    public final WatermarkCache f143223a;

    /* renamed from: b */
    public final C58244b f143224b;

    /* renamed from: c */
    public final Context f143225c;

    /* renamed from: d */
    private final ExecutorService f143226d;

    /* renamed from: com.ss.android.lark.watermark.c.a$a */
    public interface AbstractC58271a {
        /* renamed from: a */
        boolean mo197312a(Drawable drawable);
    }

    /* renamed from: com.ss.android.lark.watermark.c.a$b */
    public interface AbstractC58272b {
        /* renamed from: a */
        void mo197313a(Drawable drawable);
    }

    /* renamed from: a */
    public float mo197301a(int i) {
        return i == 0 ? 0.1f : 0.08f;
    }

    /* renamed from: a */
    public void mo197311a(final FrameLayout frameLayout, IAttachResultCallback iAttachResultCallback) {
        m225950a(frameLayout instanceof IWatermarkable ? ((IWatermarkable) frameLayout).getWatermarkMode() : 0, new AbstractC58271a() {
            /* class com.ss.android.lark.watermark.p2926c.C58249a.C582585 */

            @Override // com.ss.android.lark.watermark.p2926c.C58249a.AbstractC58271a
            /* renamed from: a */
            public boolean mo197312a(Drawable drawable) {
                frameLayout.setForeground(null);
                C58249a.this.mo197303a(frameLayout.getWidth(), frameLayout.getHeight(), drawable, new AbstractC58272b() {
                    /* class com.ss.android.lark.watermark.p2926c.C58249a.C582585.C582591 */

                    @Override // com.ss.android.lark.watermark.p2926c.C58249a.AbstractC58272b
                    /* renamed from: a */
                    public void mo197313a(Drawable drawable) {
                        frameLayout.setForeground(drawable);
                    }
                });
                return true;
            }
        }, iAttachResultCallback);
    }

    /* renamed from: a */
    public void mo197309a(final View view, IAttachResultCallback iAttachResultCallback) {
        m225950a(view instanceof IWatermarkable ? ((IWatermarkable) view).getWatermarkMode() : 0, new AbstractC58271a() {
            /* class com.ss.android.lark.watermark.p2926c.C58249a.C582606 */

            @Override // com.ss.android.lark.watermark.p2926c.C58249a.AbstractC58271a
            /* renamed from: a */
            public boolean mo197312a(Drawable drawable) {
                if (drawable == null) {
                    return true;
                }
                view.setBackground(drawable);
                return true;
            }
        }, iAttachResultCallback);
    }

    /* renamed from: a */
    public void mo197308a(final Bitmap bitmap, final IAttachToBitmapCallback iAttachToBitmapCallback) {
        this.f143226d.execute(new Runnable() {
            /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582617 */

            public void run() {
                WatermarkInfo watermarkInfo = C58249a.this.f143223a.get();
                if (watermarkInfo == null) {
                    IAttachToBitmapCallback iAttachToBitmapCallback = iAttachToBitmapCallback;
                    if (iAttachToBitmapCallback != null) {
                        iAttachToBitmapCallback.onAttachFailed(bitmap, "watermark info is null, update first");
                    }
                } else if (TextUtils.isEmpty(watermarkInfo.getWatermarkContent())) {
                    IAttachToBitmapCallback iAttachToBitmapCallback2 = iAttachToBitmapCallback;
                    if (iAttachToBitmapCallback2 != null) {
                        iAttachToBitmapCallback2.onAttachFailed(bitmap, "watermark content is empty");
                    }
                } else {
                    watermarkInfo.setAlpha(C58249a.this.mo197301a(0));
                    watermarkInfo.setBgColor(R.color.lkui_transparent);
                    C58249a.this.f143224b.mo197292a(C58249a.this.f143225c, watermarkInfo, new AbstractC58289c<Drawable>() {
                        /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582617.C582621 */

                        @Override // com.ss.android.lark.watermark.p2929f.AbstractC58289c
                        /* renamed from: a */
                        public void mo197241a(final C58286a aVar) {
                            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582617.C582621.RunnableC582653 */

                                public void run() {
                                    String str = "attach watermark to bitmap fail! " + aVar.mo197385b();
                                    if (iAttachToBitmapCallback != null) {
                                        iAttachToBitmapCallback.onAttachFailed(bitmap, str);
                                    }
                                }
                            });
                        }

                        /* renamed from: a */
                        public void mo197242a(Drawable drawable) {
                            try {
                                final Bitmap a = C58247c.m225940a(C58249a.this.mo197302a(drawable, new BitmapDrawable(C58249a.this.f143225c.getResources(), bitmap)));
                                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                    /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582617.C582621.RunnableC582631 */

                                    public void run() {
                                        if (iAttachToBitmapCallback != null) {
                                            iAttachToBitmapCallback.onAttachSuccess(a);
                                        }
                                    }
                                });
                            } catch (Exception e) {
                                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                    /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582617.C582621.RunnableC582642 */

                                    public void run() {
                                        if (iAttachToBitmapCallback != null) {
                                            IAttachToBitmapCallback iAttachToBitmapCallback = iAttachToBitmapCallback;
                                            Bitmap bitmap = bitmap;
                                            iAttachToBitmapCallback.onAttachFailed(bitmap, "attach watermark to bitmap fail! " + e.getMessage());
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void mo197310a(final FrameLayout frameLayout) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.watermark.p2926c.C58249a.AnonymousClass11 */

            public void run() {
                frameLayout.setForeground(null);
            }
        });
    }

    /* renamed from: a */
    public void mo197304a(final Activity activity) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582709 */

            public void run() {
                ((FrameLayout) activity.getWindow().getDecorView()).setForeground(null);
            }
        });
    }

    /* renamed from: a */
    public void mo197306a(final Dialog dialog) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.watermark.p2926c.C58249a.AnonymousClass10 */

            public void run() {
                Window window = dialog.getWindow();
                if (window != null) {
                    ((FrameLayout) window.getDecorView()).setForeground(null);
                }
            }
        });
    }

    /* renamed from: a */
    public Drawable mo197302a(Drawable drawable, Drawable drawable2) {
        if (drawable.getIntrinsicWidth() > drawable2.getIntrinsicWidth() || drawable.getIntrinsicHeight() > drawable2.getIntrinsicHeight()) {
            Bitmap a = C58247c.m225940a(drawable);
            return new LayerDrawable(new Drawable[]{drawable2, C58247c.m225943a(this.f143225c, Bitmap.createBitmap(a, 0, 0, Math.min(drawable2.getIntrinsicWidth(), a.getWidth()), Math.min(drawable2.getIntrinsicHeight(), a.getHeight())))});
        }
        return new LayerDrawable(new Drawable[]{drawable2, drawable});
    }

    /* renamed from: a */
    public void mo197307a(final Dialog dialog, final IAttachResultCallback iAttachResultCallback) {
        int i;
        if (dialog instanceof IWatermarkable) {
            i = ((IWatermarkable) dialog).getWatermarkMode();
        } else {
            i = 0;
        }
        m225950a(i, new AbstractC58271a() {
            /* class com.ss.android.lark.watermark.p2926c.C58249a.C582564 */

            @Override // com.ss.android.lark.watermark.p2926c.C58249a.AbstractC58271a
            /* renamed from: a */
            public boolean mo197312a(Drawable drawable) {
                Dialog dialog = dialog;
                if (dialog == null || !dialog.isShowing()) {
                    IAttachResultCallback iAttachResultCallback = iAttachResultCallback;
                    if (iAttachResultCallback != null) {
                        iAttachResultCallback.onAttachFailed("dialog is null or is not running");
                    }
                    return false;
                }
                Window window = dialog.getWindow();
                if (window == null) {
                    return false;
                }
                final FrameLayout frameLayout = (FrameLayout) window.getDecorView();
                frameLayout.setForeground(null);
                C58249a.this.mo197303a(frameLayout.getWidth(), frameLayout.getHeight(), drawable, new AbstractC58272b() {
                    /* class com.ss.android.lark.watermark.p2926c.C58249a.C582564.C582571 */

                    @Override // com.ss.android.lark.watermark.p2926c.C58249a.AbstractC58272b
                    /* renamed from: a */
                    public void mo197313a(Drawable drawable) {
                        frameLayout.setForeground(drawable);
                    }
                });
                return true;
            }
        }, iAttachResultCallback);
    }

    /* renamed from: a */
    private void m225950a(final int i, final AbstractC58271a aVar, final IAttachResultCallback iAttachResultCallback) {
        this.f143226d.execute(new Runnable() {
            /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582668 */

            public void run() {
                WatermarkInfo watermarkInfo = C58249a.this.f143223a.get();
                if (watermarkInfo == null) {
                    IAttachResultCallback iAttachResultCallback = iAttachResultCallback;
                    if (iAttachResultCallback != null) {
                        iAttachResultCallback.onAttachFailed("watermark info is null, update first");
                    }
                } else if (TextUtils.isEmpty(watermarkInfo.getWatermarkContent())) {
                    IAttachResultCallback iAttachResultCallback2 = iAttachResultCallback;
                    if (iAttachResultCallback2 != null) {
                        iAttachResultCallback2.onAttachFailed("watermark content is empty");
                    }
                } else {
                    Log.m165379d("WatermarkDisplayer", "show watermark: " + watermarkInfo.toString());
                    watermarkInfo.setAlpha(C58249a.this.mo197301a(i));
                    watermarkInfo.setBgColor(R.color.lkui_transparent);
                    C58249a.this.f143224b.mo197292a(C58249a.this.f143225c, watermarkInfo, new AbstractC58289c<Drawable>() {
                        /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582668.C582671 */

                        /* renamed from: a */
                        public void mo197242a(final Drawable drawable) {
                            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582668.C582671.RunnableC582681 */

                                public void run() {
                                    if (aVar == null) {
                                        return;
                                    }
                                    if (drawable == null) {
                                        if (iAttachResultCallback != null) {
                                            iAttachResultCallback.onAttachFailed("watermark drawable generate fail");
                                        }
                                    } else if (aVar.mo197312a(drawable) && iAttachResultCallback != null) {
                                        iAttachResultCallback.onAttachSuccess();
                                    }
                                }
                            });
                        }

                        @Override // com.ss.android.lark.watermark.p2929f.AbstractC58289c
                        /* renamed from: a */
                        public void mo197241a(final C58286a aVar) {
                            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582668.C582671.RunnableC582692 */

                                public void run() {
                                    if (iAttachResultCallback != null) {
                                        iAttachResultCallback.onAttachFailed(aVar.mo197385b());
                                    }
                                }
                            });
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void mo197305a(Activity activity, final IAttachResultCallback iAttachResultCallback, final boolean z) {
        int i;
        if (activity instanceof IWatermarkable) {
            i = ((IWatermarkable) activity).getWatermarkMode();
        } else {
            i = 0;
        }
        final WeakReference weakReference = new WeakReference(activity);
        m225950a(i, new AbstractC58271a() {
            /* class com.ss.android.lark.watermark.p2926c.C58249a.C582501 */

            @Override // com.ss.android.lark.watermark.p2926c.C58249a.AbstractC58271a
            /* renamed from: a */
            public boolean mo197312a(Drawable drawable) {
                Activity activity = (Activity) weakReference.get();
                if (!UIUtils.isActivityRunning(activity)) {
                    IAttachResultCallback iAttachResultCallback = iAttachResultCallback;
                    if (iAttachResultCallback == null) {
                        return false;
                    }
                    iAttachResultCallback.onAttachFailed("watermark activity is null or is not running");
                    return false;
                }
                final FrameLayout frameLayout = (FrameLayout) activity.getWindow().getDecorView();
                frameLayout.setForeground(null);
                C58249a.this.mo197303a(frameLayout.getWidth(), frameLayout.getHeight(), drawable, new AbstractC58272b() {
                    /* class com.ss.android.lark.watermark.p2926c.C58249a.C582501.C582511 */

                    @Override // com.ss.android.lark.watermark.p2926c.C58249a.AbstractC58272b
                    /* renamed from: a */
                    public void mo197313a(Drawable drawable) {
                        if (Build.VERSION.SDK_INT <= 29 || !RomUtils.m94944c() || !z) {
                            frameLayout.setForeground(drawable);
                            return;
                        }
                        Log.m165389i("WatermarkDisplayer", "set watermark");
                        try {
                            Field a = C26254af.m95001a(frameLayout.getClass(), "mDecorCaptionView");
                            a.setAccessible(true);
                            ViewGroup viewGroup = (ViewGroup) a.get(frameLayout);
                            if (viewGroup != null) {
                                viewGroup.setForeground(drawable);
                            }
                        } catch (IllegalAccessException e) {
                            Log.m165383e("WatermarkDisplayer", e.getMessage());
                            frameLayout.setForeground(drawable);
                        }
                    }
                });
                return true;
            }
        }, iAttachResultCallback);
    }

    public C58249a(Context context, WatermarkCache watermarkCache, C58244b bVar, ExecutorService executorService) {
        this.f143225c = context;
        this.f143223a = watermarkCache;
        this.f143224b = bVar;
        this.f143226d = executorService;
    }

    /* renamed from: a */
    public void mo197303a(final int i, final int i2, final Drawable drawable, final AbstractC58272b bVar) {
        if (i == 0 || i2 == 0 || (drawable.getIntrinsicWidth() < i && drawable.getIntrinsicHeight() < i2)) {
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582522 */

                public void run() {
                    AbstractC58272b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo197313a(drawable);
                    }
                }
            });
        } else {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582533 */

                public void run() {
                    Bitmap a = C58247c.m225940a(drawable);
                    int min = Math.min(i, drawable.getIntrinsicWidth());
                    int min2 = Math.min(i2, drawable.getIntrinsicHeight());
                    Log.m165389i("WatermarkDisplayer", "FitDrawable, actualWidth is:" + min + ",actualHeight:" + min2);
                    if (min <= 0 || min2 <= 0) {
                        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                            /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582533.RunnableC582541 */

                            public void run() {
                                if (bVar != null) {
                                    bVar.mo197313a(drawable);
                                }
                            }
                        });
                        return;
                    }
                    final BitmapDrawable a2 = C58247c.m225943a(C58249a.this.f143225c, Bitmap.createBitmap(a, 0, 0, min, min2));
                    CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                        /* class com.ss.android.lark.watermark.p2926c.C58249a.RunnableC582533.RunnableC582552 */

                        public void run() {
                            if (bVar != null) {
                                bVar.mo197313a(a2);
                            }
                        }
                    });
                }
            });
        }
    }
}
