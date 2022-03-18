package com.ss.android.lark.widget.photo_picker.gallery.function;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58761b;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58764c;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58769e;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58772f;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58775g;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.SaveStickerAction;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.ZoomAction;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.photo_picker.statistics.ImagePreviewHitPoint;
import com.ss.android.lark.widget.photo_picker.utils.PhotoPreviewUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.b */
public class C58796b {

    /* renamed from: a */
    public final Context f145318a;

    /* renamed from: b */
    public final C58810b f145319b;

    /* renamed from: c */
    public String f145320c = "";

    /* renamed from: d */
    public AbstractC58809a f145321d;

    /* renamed from: e */
    public PhotoItem f145322e;

    /* renamed from: f */
    public final List<AbstractC58768d> f145323f = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.b$a */
    public interface AbstractC58809a {
        /* renamed from: a */
        void mo198985a(int i);

        /* renamed from: a */
        void mo198986a(PhotoItem photoItem);

        /* renamed from: a */
        void mo198987a(String str);

        /* renamed from: a */
        void mo198988a(String str, String str2, String str3);

        /* renamed from: b */
        void mo198989b(String str);
    }

    /* renamed from: d */
    public void mo199232d() {
    }

    /* renamed from: c */
    public List<AbstractC58768d> mo199231c() {
        return this.f145323f;
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.b$b */
    public static class C58810b {

        /* renamed from: a */
        public final boolean f145343a;

        /* renamed from: b */
        public final boolean f145344b;

        /* renamed from: c */
        public final boolean f145345c;

        /* renamed from: d */
        public final boolean f145346d;

        /* renamed from: e */
        public final boolean f145347e;

        /* renamed from: f */
        public final boolean f145348f;

        /* renamed from: g */
        public final boolean f145349g;

        /* renamed from: h */
        private final boolean f145350h;

        /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.b$b$a */
        public static class C58811a {

            /* renamed from: a */
            public boolean f145351a = true;

            /* renamed from: b */
            public boolean f145352b;

            /* renamed from: c */
            public boolean f145353c = true;

            /* renamed from: d */
            public boolean f145354d = true;

            /* renamed from: e */
            public boolean f145355e;

            /* renamed from: f */
            public boolean f145356f = true;

            /* renamed from: g */
            public boolean f145357g;

            /* renamed from: h */
            public boolean f145358h;

            /* renamed from: a */
            public C58810b mo199238a() {
                return new C58810b(this);
            }

            /* renamed from: a */
            public C58811a mo199237a(boolean z) {
                this.f145351a = z;
                return this;
            }

            /* renamed from: b */
            public C58811a mo199239b(boolean z) {
                this.f145352b = z;
                return this;
            }

            /* renamed from: c */
            public C58811a mo199240c(boolean z) {
                this.f145353c = z;
                return this;
            }

            /* renamed from: d */
            public C58811a mo199241d(boolean z) {
                this.f145354d = z;
                return this;
            }

            /* renamed from: e */
            public C58811a mo199242e(boolean z) {
                this.f145355e = z;
                return this;
            }

            /* renamed from: f */
            public C58811a mo199243f(boolean z) {
                this.f145356f = z;
                return this;
            }

            /* renamed from: g */
            public C58811a mo199244g(boolean z) {
                this.f145357g = z;
                return this;
            }
        }

        private C58810b(C58811a aVar) {
            this.f145343a = aVar.f145351a;
            this.f145344b = aVar.f145352b;
            this.f145345c = aVar.f145353c;
            this.f145346d = aVar.f145354d;
            this.f145347e = aVar.f145355e;
            this.f145350h = aVar.f145358h;
            this.f145348f = aVar.f145356f;
            this.f145349g = aVar.f145357g;
        }
    }

    /* renamed from: e */
    private boolean m228032e() {
        return C58612c.m227290a().mo102854b("messenger.message_picture_addsticker");
    }

    /* renamed from: b */
    public void mo199230b() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.RunnableC587993 */

            public void run() {
                boolean z;
                boolean z2;
                if (C58796b.this.f145318a != null) {
                    String currentUrl = C58796b.this.f145322e.getCurrentUrl();
                    File b = C58796b.this.f145322e.getPhotoState().getShowFile().mo5927b();
                    if (b == null) {
                        Log.m165383e("FuncListController", "prepareExtraPhoneMenuItems, show file is null");
                        return;
                    }
                    Log.m165389i("FuncListController", "prepareExtraPhoneMenuItems, show file is not null");
                    if (C58796b.this.f145322e.isVideo() || !C58796b.this.f145319b.f145348f) {
                        z = false;
                    } else {
                        z = true;
                    }
                    C58772f fVar = new C58772f(C58796b.this.f145318a, z, C58796b.this.f145322e, b, new C58772f.AbstractC58774a() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.RunnableC587993.C588001 */

                        @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.C58772f.AbstractC58774a
                        /* renamed from: a */
                        public void mo199197a(String str, Context context) {
                            if (C58796b.this.f145321d != null) {
                                C58796b.this.f145321d.mo198989b(str);
                            }
                        }
                    });
                    Context context = C58796b.this.f145318a;
                    if (!C58796b.this.f145319b.f145343a || !C58796b.this.f145319b.f145345c) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    C58796b.this.mo199228a(b, currentUrl, fVar, new C58761b(context, z2, C58796b.this.f145322e, b, new C58761b.AbstractC58763a() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.RunnableC587993.C588012 */

                        @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.C58761b.AbstractC58763a
                        /* renamed from: a */
                        public void mo198996a(String str, String str2) {
                            String str3;
                            if (C58796b.this.f145321d != null) {
                                AbstractC58809a aVar = C58796b.this.f145321d;
                                if (C58796b.this.f145322e == null) {
                                    str3 = "";
                                } else {
                                    str3 = C58659h.m227519c(C58796b.this.f145322e);
                                }
                                aVar.mo198988a(str, str2, str3);
                            }
                        }
                    }));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo199224a() {
        boolean z;
        this.f145323f.clear();
        boolean z2 = false;
        if (this.f145322e.isVideo() || !this.f145319b.f145347e) {
            z = false;
        } else {
            z = true;
        }
        C58782i.m228006a(this.f145323f, this.f145318a, z, this.f145322e, new C58782i.AbstractC58790a() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.C587971 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i.AbstractC58790a
            /* renamed from: a */
            public void mo199218a(PhotoItem photoItem) {
                ImagePreviewHitPoint.f145429a.mo199304b("translate", "none");
                if (C58796b.this.f145321d != null) {
                    C58796b.this.f145321d.mo198986a(photoItem);
                }
            }
        });
        if (!this.f145319b.f145349g && m228032e()) {
            this.f145323f.add(new SaveStickerAction(this.f145318a, this.f145322e));
        }
        boolean z3 = this.f145319b.f145343a;
        if (!this.f145322e.isVideo() || C58612c.m227290a().mo102866i()) {
            z2 = z3;
        }
        this.f145323f.add(new C58775g(this.f145318a, z2, this.f145322e));
        this.f145323f.add(new C58769e(this.f145318a, this.f145319b.f145346d, this.f145322e, this.f145320c, new C58769e.AbstractC58771a() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.C587982 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.C58769e.AbstractC58771a
            /* renamed from: a */
            public void mo199195a(String str) {
                if (C58796b.this.f145321d != null) {
                    C58796b.this.f145321d.mo198987a(str);
                }
            }
        }));
        this.f145323f.add(new C58764c(this.f145318a, this.f145319b.f145344b, this.f145322e));
    }

    /* renamed from: a */
    public void mo199227a(AbstractC58809a aVar) {
        this.f145321d = aVar;
    }

    /* renamed from: a */
    public void mo199229a(String str) {
        this.f145320c = str;
    }

    /* renamed from: a */
    public void mo199225a(PhotoItem photoItem) {
        this.f145322e = photoItem;
        mo199224a();
        mo199230b();
    }

    public C58796b(Activity activity, C58810b bVar) {
        this.f145318a = activity;
        this.f145319b = bVar;
    }

    /* renamed from: a */
    public void mo199226a(final PhotoItem photoItem, final IGetDataCallback<List<AbstractC58768d>> iGetDataCallback) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.RunnableC588035 */

            public void run() {
                if (C58796b.this.f145318a != null) {
                    if (photoItem.isVideo()) {
                        iGetDataCallback.onSuccess(new ArrayList());
                        return;
                    }
                    final ArrayList arrayList = new ArrayList();
                    File b = photoItem.getPhotoState().getShowFile().mo5927b();
                    if (b == null) {
                        Log.m165383e("FuncListController", "generateDesktopBottomPanelItems, show file is null");
                        return;
                    }
                    Log.m165383e("FuncListController", "generateDesktopBottomPanelItems, show file is not null");
                    arrayList.add(new ZoomAction(C58796b.this.f145318a, 1, b, new ZoomAction.AbstractC58755a() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.RunnableC588035.C588041 */

                        @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.ZoomAction.AbstractC58755a
                        /* renamed from: a */
                        public void mo199182a(int i) {
                            if (C58796b.this.f145321d != null) {
                                C58796b.this.f145321d.mo198985a(1);
                            }
                        }
                    }));
                    arrayList.add(new ZoomAction(C58796b.this.f145318a, 0, b, new ZoomAction.AbstractC58755a() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.RunnableC588035.C588052 */

                        @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.ZoomAction.AbstractC58755a
                        /* renamed from: a */
                        public void mo199182a(int i) {
                            if (C58796b.this.f145321d != null) {
                                C58796b.this.f145321d.mo198985a(0);
                            }
                        }
                    }));
                    arrayList.add(new C58769e(C58796b.this.f145318a, C58796b.this.f145319b.f145346d, photoItem, C58796b.this.f145320c, new C58769e.AbstractC58771a() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.RunnableC588035.C588063 */

                        @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.C58769e.AbstractC58771a
                        /* renamed from: a */
                        public void mo199195a(String str) {
                            if (C58796b.this.f145321d != null) {
                                C58796b.this.f145321d.mo198987a(str);
                            }
                        }
                    }));
                    arrayList.add(new C58772f(C58796b.this.f145318a, C58796b.this.f145319b.f145348f, photoItem, b, new C58772f.AbstractC58774a() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.RunnableC588035.C588074 */

                        @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.C58772f.AbstractC58774a
                        /* renamed from: a */
                        public void mo199197a(String str, Context context) {
                            if (C58796b.this.f145321d != null) {
                                C58796b.this.f145321d.mo198989b(str);
                            }
                        }
                    }));
                    arrayList.add(new C58775g(C58796b.this.f145318a, C58796b.this.f145319b.f145343a, photoItem));
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.RunnableC588035.RunnableC588085 */

                        public void run() {
                            iGetDataCallback.onSuccess(arrayList);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void mo199228a(final File file, final String str, final C58772f fVar, final C58761b bVar) {
        UICallbackExecutor.post(new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.RunnableC588024 */

            public void run() {
                if (C58796b.this.f145318a != null && file != null && TextUtils.equals(str, C58796b.this.f145322e.getCurrentUrl())) {
                    C58796b.this.f145323f.add(fVar);
                    PhotoPreviewUtils.m227506a(C58796b.this.f145323f, bVar);
                }
            }
        });
    }
}
