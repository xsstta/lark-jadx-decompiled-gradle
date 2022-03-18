package com.ss.android.lark.widget.photo_picker.gallery;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.entity.PhotoState;
import com.ss.android.lark.widget.photo_picker.gallery.LargeImageView;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import java.io.File;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.d */
public class C58742d {

    /* renamed from: a */
    public AbstractC58745a f145187a;

    /* renamed from: b */
    public LargeImageView f145188b;

    /* renamed from: c */
    public LargeImageView.AbstractC58686c f145189c;

    /* renamed from: d */
    private LifecycleOwner f145190d;

    /* renamed from: e */
    private IRequestCreator f145191e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.d$a */
    public interface AbstractC58745a {
        /* renamed from: a */
        LifecycleOwner mo199153a();

        /* renamed from: b */
        IRequestCreator mo199154b();

        /* renamed from: c */
        LargeImageView mo199155c();

        /* renamed from: d */
        Boolean mo199156d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo199158a(PhotoItem photoItem) {
        m227898c(photoItem);
        m227887a(photoItem, PhotoState.UIState.HIDE_LOOK);
        C57865c.m224574a(new C57865c.AbstractC57873d(photoItem) {
            /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$d$0L1X0wcV8P6zbngryoWmUVuMw */
            public final /* synthetic */ PhotoItem f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C58742d.this.m227909k(this.f$1);
            }
        }, new C57865c.AbstractC57871b(photoItem) {
            /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$d$6oeESqTE0ag7lNKN4hUVaZmRK8 */
            public final /* synthetic */ PhotoItem f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C58742d.this.m227900c((C58742d) this.f$1, (PhotoItem) ((Boolean) obj));
            }
        });
        C1177w<Boolean> clickLookOrigin = photoItem.getPhotoState().getClickLookOrigin();
        if (clickLookOrigin.mo5927b() == null) {
            clickLookOrigin.mo5922a(this.f145190d);
            clickLookOrigin.mo5923a(this.f145190d, new AbstractC1178x(photoItem) {
                /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$d$D_0CipUVA43yuDkhbZ7zGN8L7g */
                public final /* synthetic */ PhotoItem f$1;

                {
                    this.f$1 = r2;
                }

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C58742d.this.m227896b((C58742d) this.f$1, (PhotoItem) ((Boolean) obj));
                }
            });
        }
    }

    /* renamed from: a */
    public void mo199157a() {
        this.f145187a = null;
        this.f145190d = null;
        this.f145191e = null;
        this.f145188b = null;
        this.f145189c = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Boolean m227908j(PhotoItem photoItem) {
        return Boolean.valueOf(m227902d(photoItem));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Boolean m227909k(PhotoItem photoItem) {
        return Boolean.valueOf(m227902d(photoItem));
    }

    C58742d(AbstractC58745a aVar) {
        this.f145187a = aVar;
        this.f145190d = aVar.mo199153a();
        this.f145191e = aVar.mo199154b();
        this.f145188b = aVar.mo199155c();
    }

    /* renamed from: c */
    private void m227898c(final PhotoItem photoItem) {
        final String c = C58659h.m227519c(photoItem);
        final String currentUrl = photoItem.getCurrentUrl();
        this.f145189c = this.f145188b.getLoadPreviewListener();
        this.f145188b.setLoadPreviewListener(new LargeImageView.AbstractC58686c() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.C58742d.C587431 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.LargeImageView.AbstractC58686c
            /* renamed from: a */
            public void mo199036a() {
                Log.m165389i("LargeImageLoadController", C58742d.this.mo199159b(photoItem) + "LargeImageView show file success");
                if (C58742d.this.f145189c != null) {
                    C58742d.this.f145189c.mo199036a();
                }
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.LargeImageView.AbstractC58686c
            /* renamed from: b */
            public void mo199037b() {
                if (C58742d.this.f145187a != null) {
                    Object obj = null;
                    if (!TextUtils.isEmpty(c)) {
                        obj = new C38824b(c);
                    } else if (!TextUtils.isEmpty(currentUrl)) {
                        obj = currentUrl;
                    }
                    if (obj != null) {
                        Log.m165383e("LargeImageLoadController", C58742d.this.mo199159b(photoItem) + "LargeImageView show file failed, try reLoad from server, loadObject = " + obj);
                        ImageLoader.with(LarkContext.getApplication()).asDrawable().load(obj).into(new C38818i<Drawable>() {
                            /* class com.ss.android.lark.widget.photo_picker.gallery.C58742d.C587431.C587441 */

                            @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
                            /* renamed from: a */
                            public void mo49247a(Drawable drawable) {
                                Log.m165383e("LargeImageLoadController", C58742d.this.mo199159b(photoItem) + "reLoad from server failed");
                                if (C58742d.this.f145189c != null) {
                                    C58742d.this.f145189c.mo199037b();
                                }
                            }

                            /* renamed from: d */
                            public void mo49248a(Drawable drawable) {
                                Log.m165383e("LargeImageLoadController", C58742d.this.mo199159b(photoItem) + "reLoad from server success");
                                if (C58742d.this.f145188b != null && C58742d.this.f145189c != null) {
                                    C58742d.this.f145188b.getImageView().setImageDrawable(drawable);
                                    C58742d.this.f145189c.mo199036a();
                                }
                            }
                        });
                        return;
                    }
                    Log.m165383e("LargeImageLoadController", C58742d.this.mo199159b(photoItem) + "LargeImageView show file failed, show error");
                    if (C58742d.this.f145189c != null) {
                        C58742d.this.f145189c.mo199037b();
                    }
                }
            }
        });
    }

    /* renamed from: h */
    private void m227906h(PhotoItem photoItem) {
        Drawable inlinePreviewDrawable = photoItem.getPhotoState().getInlinePreviewDrawable();
        if (inlinePreviewDrawable != null) {
            m227886a(photoItem, inlinePreviewDrawable);
        } else {
            this.f145189c.mo199037b();
        }
    }

    /* renamed from: b */
    public String mo199159b(PhotoItem photoItem) {
        String c = C58659h.m227519c(photoItem);
        return "photo item: " + c + ", ";
    }

    /* renamed from: f */
    private void m227904f(PhotoItem photoItem) {
        Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "download origin file");
        PhotoState photoState = photoItem.getPhotoState();
        m227887a(photoItem, PhotoState.UIState.LOADING);
        m227891a(photoItem, C58659h.m227519c(photoItem), new C57865c.AbstractC57871b(photoState, photoItem) {
            /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$d$WZ48q7Ss32r8Dg8viyOOO72nACE */
            public final /* synthetic */ PhotoState f$1;
            public final /* synthetic */ PhotoItem f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C58742d.this.m227897b(this.f$1, this.f$2, (File) obj);
            }
        });
    }

    /* renamed from: i */
    private Drawable m227907i(PhotoItem photoItem) {
        byte[] byteArray;
        ByteString inlinePreview = photoItem.getInlinePreview();
        if (inlinePreview == null || (byteArray = inlinePreview.toByteArray()) == null) {
            return null;
        }
        return new BitmapDrawable(LarkContext.getApplication().getResources(), BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
    }

    /* renamed from: g */
    private void m227905g(PhotoItem photoItem) {
        String str = photoItem.getMiddlePicInfo().key;
        if (TextUtils.isEmpty(str)) {
            Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "middle key is null, try download origin file");
            m227904f(photoItem);
            return;
        }
        Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "download middle file");
        m227891a(photoItem, str, new C57865c.AbstractC57871b(photoItem.getPhotoState(), photoItem) {
            /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$d$h0X6hf9V5LWk_HrcK6h7rvCffA */
            public final /* synthetic */ PhotoState f$1;
            public final /* synthetic */ PhotoItem f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C58742d.this.m227892a((C58742d) this.f$1, (PhotoState) this.f$2, (PhotoItem) ((File) obj));
            }
        });
    }

    /* renamed from: d */
    private boolean m227902d(PhotoItem photoItem) {
        if (this.f145187a == null) {
            return false;
        }
        PhotoState photoState = photoItem.getPhotoState();
        String currentUrl = photoItem.getCurrentUrl();
        String c = C58659h.m227519c(photoItem);
        String str = photoItem.getMiddlePicInfo().key;
        String str2 = photoItem.getThumbnailPicInfo().key;
        File originFile = photoState.getOriginFile();
        if (originFile == null && m227894a(currentUrl)) {
            originFile = new File(currentUrl);
        }
        if (originFile == null) {
            originFile = C58659h.m227511a(this.f145191e, photoItem, currentUrl, c);
        }
        photoState.setOriginFile(originFile);
        if (originFile != null) {
            Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "has origin cache, show it");
            m227893a(new Runnable(photoItem, photoState) {
                /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$d$IkmkIBibEDnNgZFJWOUIOpWQzf4 */
                public final /* synthetic */ PhotoItem f$1;
                public final /* synthetic */ PhotoState f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C58742d.this.m227901d(this.f$1, this.f$2);
                }
            });
            return true;
        }
        File middleFile = photoState.getMiddleFile();
        if (middleFile == null) {
            middleFile = C58659h.m227511a(this.f145191e, photoItem, "", str);
        }
        photoState.setMiddleFile(middleFile);
        if (middleFile != null) {
            Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "has middle cache, show it");
            m227893a(new Runnable(photoItem, photoState) {
                /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$d$B1aO6vGmjUOSld0u1gwhTD83uiM */
                public final /* synthetic */ PhotoItem f$1;
                public final /* synthetic */ PhotoState f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C58742d.this.m227899c((C58742d) this.f$1, (PhotoItem) this.f$2);
                }
            });
            return true;
        }
        File thumbnailFile = photoState.getThumbnailFile();
        if (thumbnailFile == null) {
            thumbnailFile = C58659h.m227511a(this.f145191e, photoItem, "", str2);
        }
        photoState.setThumbnailFile(thumbnailFile);
        if (thumbnailFile != null) {
            Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "has thumbnail cache, show it");
            m227893a(new Runnable(photoItem, photoState) {
                /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$d$AVpRzio_k_ajrU9skQQHt3gFbw */
                public final /* synthetic */ PhotoItem f$1;
                public final /* synthetic */ PhotoState f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C58742d.this.m227895b((C58742d) this.f$1, (PhotoItem) this.f$2);
                }
            });
            return true;
        }
        Drawable inlinePreviewDrawable = photoState.getInlinePreviewDrawable();
        if (inlinePreviewDrawable == null) {
            inlinePreviewDrawable = m227907i(photoItem);
        }
        photoState.setInlinePreviewDrawable(inlinePreviewDrawable);
        if (inlinePreviewDrawable != null) {
            Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "has inline preview cache, show it");
            m227893a(new Runnable(photoItem, photoState) {
                /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$d$7PZ4hYtCTV8UaCowAJH9ie613cM */
                public final /* synthetic */ PhotoItem f$1;
                public final /* synthetic */ PhotoState f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C58742d.this.m227888a((C58742d) this.f$1, (PhotoItem) this.f$2);
                }
            });
        }
        return false;
    }

    /* renamed from: e */
    private boolean m227903e(PhotoItem photoItem) {
        boolean z;
        boolean z2;
        PhotoState photoState = photoItem.getPhotoState();
        String c = C58659h.m227519c(photoItem);
        String str = photoItem.getMiddlePicInfo().key;
        boolean isLoadOrigin = photoState.isLoadOrigin();
        boolean z3 = false;
        if (photoState.getOriginFile() != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = !photoItem.isOriginSource();
        boolean isFromMe = photoState.isFromMe();
        boolean equals = c.equals(str);
        if (photoItem.getOriginSize() <= 512000) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (isLoadOrigin || z || z4 || isFromMe || equals || z2) {
            z3 = true;
        }
        Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "needShowOrigin: " + z3 + " --> isLoadOrigin: " + isLoadOrigin + ", hasOriginCache: " + z + ", isSendCommonMode: " + z4 + ", isFromMe: " + isFromMe + ", origin and middle is same key: " + equals + ", is small icon: " + z2);
        return z3;
    }

    /* renamed from: a */
    private void m227893a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            UICallbackExecutor.execute(runnable);
        }
    }

    /* renamed from: a */
    private boolean m227894a(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m227888a(PhotoItem photoItem, PhotoState photoState) {
        m227886a(photoItem, photoState.getInlinePreviewDrawable());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m227895b(PhotoItem photoItem, PhotoState photoState) {
        m227889a(photoItem, photoState.getThumbnailFile());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m227899c(PhotoItem photoItem, PhotoState photoState) {
        m227889a(photoItem, photoState.getMiddleFile());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m227901d(PhotoItem photoItem, PhotoState photoState) {
        m227889a(photoItem, photoState.getOriginFile());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m227890a(PhotoItem photoItem, Boolean bool) {
        if (!bool.booleanValue()) {
            m227906h(photoItem);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m227896b(PhotoItem photoItem, Boolean bool) {
        if (bool.booleanValue()) {
            m227904f(photoItem);
        }
    }

    /* renamed from: a */
    private void m227886a(PhotoItem photoItem, Drawable drawable) {
        Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "drawable is not null, show inline preview");
        this.f145188b.getImageView().setImageDrawable(drawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ File m227885a(PhotoItem photoItem, String str) {
        if (this.f145187a == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f145191e.diskCacheStrategy(DiskCacheStrategy.ALL);
        File a = C58612c.m227290a().mo102829a(this.f145191e, photoItem.getCurrentUrl(), str, photoItem.getEntityId(), C58659h.m227515a(photoItem), true, false, photoItem.getType(), this.f145187a.mo199156d().booleanValue());
        try {
            C58612c.m227290a().mo102848a("load_photo_time", new JSONObject().put("spent", System.currentTimeMillis() - currentTimeMillis));
        } catch (JSONException e) {
            Log.m165383e("LargeImageLoadController", mo199159b(photoItem) + "send event ConstantKeys.LOAD_PHOTO_TIME error: " + e.getMessage());
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m227900c(PhotoItem photoItem, Boolean bool) {
        boolean z;
        if (this.f145187a != null) {
            if (photoItem.getPhotoState().getOriginFile() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m227887a(photoItem, PhotoState.UIState.SHOW_LOOK);
            }
            if (m227903e(photoItem)) {
                if (!z) {
                    Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "no origin cache, auto download origin file");
                    m227904f(photoItem);
                }
            } else if (!bool.booleanValue()) {
                Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "no any cache, auto download middle file");
                m227905g(photoItem);
            }
        }
    }

    /* renamed from: a */
    private void m227887a(PhotoItem photoItem, PhotoState.UIState uIState) {
        Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "switch ui state from " + photoItem.getPhotoState().getUIState().mo5927b() + " to " + uIState);
        photoItem.getPhotoState().getUIState().mo5929b(uIState);
    }

    /* renamed from: a */
    private void m227889a(PhotoItem photoItem, File file) {
        if (this.f145187a != null) {
            PhotoState photoState = photoItem.getPhotoState();
            photoState.getShowFile().mo5929b(file);
            this.f145188b.mo199012a(file, photoState.getInlinePreviewDrawable(), null, this.f145187a.mo199156d().booleanValue());
        }
    }

    /* renamed from: a */
    private void m227891a(PhotoItem photoItem, String str, C57865c.AbstractC57871b<File> bVar) {
        C57865c.m224574a(new C57865c.AbstractC57873d(photoItem, str) {
            /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$d$y7qWqDslEDOZ3hdsWL3MgCEZLoo */
            public final /* synthetic */ PhotoItem f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C58742d.this.m227885a(this.f$1, this.f$2);
            }
        }, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m227897b(PhotoState photoState, PhotoItem photoItem, File file) {
        if (this.f145187a != null) {
            photoState.setOriginFile(file);
            if (file != null) {
                Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "has downloaded origin success");
                m227887a(photoItem, PhotoState.UIState.DONE);
                m227889a(photoItem, file);
                return;
            }
            Log.m165389i("LargeImageLoadController", mo199159b(photoItem) + "has downloaded origin failed");
            m227887a(photoItem, PhotoState.UIState.SHOW_LOOK);
            C57865c.m224574a(new C57865c.AbstractC57873d(photoItem) {
                /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$d$h9XLGD5NG8cuEXHk10P1YjlHFpE */
                public final /* synthetic */ PhotoItem f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                public final Object produce() {
                    return C58742d.this.m227908j(this.f$1);
                }
            }, new C57865c.AbstractC57871b(photoItem) {
                /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$d$rIM3sIGQ5e8AcUkwJ_GvAGI2iLI */
                public final /* synthetic */ PhotoItem f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                public final void consume(Object obj) {
                    C58742d.this.m227890a((C58742d) this.f$1, (PhotoItem) ((Boolean) obj));
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m227892a(PhotoState photoState, PhotoItem photoItem, File file) {
        if (this.f145187a != null) {
            photoState.setMiddleFile(file);
            if (file != null) {
                m227889a(photoItem, file);
            } else {
                m227906h(photoItem);
            }
        }
    }
}
