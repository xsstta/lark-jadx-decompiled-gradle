package com.bytedance.ee.bear.drive.view.preview.imageviewer;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.biz.comment.C6367d;
import com.bytedance.ee.bear.drive.biz.comment.CommentRectLayout;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.preview.show.C6712a;
import com.bytedance.ee.bear.drive.common.C6896i;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7365f;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.C7358b;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.p373a.AbstractC7356a;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.p373a.AbstractC7357b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7557g;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.p3511d.AbstractC70020b;

public class PhotoViewContainer extends FrameLayout implements AbstractC7549a {

    /* renamed from: a */
    public CommentRectLayout f19663a;

    /* renamed from: b */
    public C7555f f19664b;

    /* renamed from: c */
    public AbstractC7361c f19665c;

    /* renamed from: d */
    public C7358b f19666d;

    /* renamed from: e */
    public AbstractC7365f f19667e;

    /* renamed from: f */
    private Context f19668f;

    /* renamed from: g */
    private FrameLayout f19669g;

    /* renamed from: h */
    private C6367d f19670h;

    /* renamed from: i */
    private AbstractC7095c f19671i;

    /* renamed from: j */
    private C7352a f19672j;

    /* renamed from: k */
    private long f19673k;

    /* renamed from: l */
    private C68289a f19674l = new C68289a();

    /* renamed from: m */
    private AbstractC7256c f19675m;

    /* renamed from: lambda$C-mi5GpWW7proP3qOHJDaZQQr-I */
    public static /* synthetic */ AbstractC70020b m269477lambda$Cmi5GpWW7proP3qOHJDaZQQrI(C7358b bVar) {
        return m29345b(bVar);
    }

    public static /* synthetic */ void lambda$KeUiAkZv9ayoxBFFrCaznd2LQE4(PhotoViewContainer photoViewContainer, Boolean bool) {
        photoViewContainer.m29342a(bool);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    /* renamed from: a */
    public /* synthetic */ void mo28370a(Configuration configuration) {
        AbstractC7549a.CC.$default$a(this, configuration);
    }

    /* renamed from: a */
    public void mo28616a(boolean z) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public String getCommentQuote() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    public CommentRectLayout getCommentRectLayout() {
        return this.f19663a;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void showThumbnailPreview() {
        mo28619d();
    }

    /* renamed from: a */
    public void mo28615a(String str, Throwable th, BitmapFactory.Options options) {
        long j;
        C13479a.m54764b("preview_image", "preview failed: " + m29344b(options, str));
        C13479a.m54761a("DRIVE_PREVIEW_FLOW", th);
        if (!(th instanceof IOException) || !"Image format not supported".equalsIgnoreCase(th.getMessage())) {
            AbstractC7256c cVar = this.f19675m;
            if (cVar != null) {
                cVar.mo26119a(str, th);
            }
            C6712a.m26465c(this.f19664b, this);
            if (this.f19664b != null) {
                long j2 = 0;
                if (options == null) {
                    j = 0;
                } else {
                    j = (long) options.outWidth;
                }
                if (options != null) {
                    j2 = (long) options.outHeight;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("loadImageStartTime", Long.valueOf(this.f19673k));
                hashMap.put("imageHeight", Long.valueOf(j2));
                hashMap.put("imageWidth", Long.valueOf(j));
                hashMap.put("openMode", str);
                hashMap.put("resultKey", "nativeFail");
                this.f19664b.liveInnerReportMsg().mo28018a(C7557g.m30301a(10, hashMap));
            }
        }
    }

    /* renamed from: c */
    public void mo28618c() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.height = -1;
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onCommentListPanelClose() {
        C13479a.m54764b("preview_image", "photoview container onCommentListPanelClose()");
        this.f19663a.mo25490d();
        mo28618c();
    }

    /* renamed from: f */
    private void m29347f() {
        this.f19673k = System.currentTimeMillis();
        AbstractC7256c cVar = this.f19675m;
        if (cVar != null) {
            cVar.mo26117a();
        }
        C6712a.m26463a(this.f19664b, this);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public CommentRectF hideCreateComment() {
        C13479a.m54764b("preview_image", "photoview container hideCreateComment()");
        this.f19664b.liveInnerForceFullScreen().mo5926a((Boolean) false);
        return this.f19663a.mo25489c();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onCommentInputPanelClose() {
        C13479a.m54764b("preview_image", "photoview container onCommentInputPanelClose()");
        if (this.f19663a.mo25488b()) {
            this.f19664b.liveInnerForceFullScreen().mo5926a((Boolean) true);
        }
    }

    public void onDetachedFromWindow() {
        C7555f fVar = this.f19664b;
        if (fVar == null || !fVar.isBlockViewChanging()) {
            super.onDetachedFromWindow();
            this.f19674l.mo237935a();
        }
    }

    /* renamed from: e */
    private AbstractC68307f<AbstractC7361c> m29346e() {
        return AbstractC68307f.m265099b((Callable) new Callable() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.$$Lambda$PhotoViewContainer$6iFH4QgMahZRpIs3yOJW4RvUNAA */

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PhotoViewContainer.lambda$6iFH4QgMahZRpIs3yOJW4RvUNAA(PhotoViewContainer.this);
            }
        }).mo237985a(C11678b.m48481e()).mo238014c($$Lambda$PhotoViewContainer$Cmi5GpWW7proP3qOHJDaZQQrI.INSTANCE).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.$$Lambda$PhotoViewContainer$g0LBvccDhnXJuIkDi8tY2xQOXso */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return PhotoViewContainer.this.m29337a((PhotoViewContainer) ((C7358b) obj));
            }
        });
    }

    /* renamed from: d */
    public void mo28619d() {
        if (this.f19664b.liveOuterNotPreviewContentHeight().mo5927b() != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.height = this.f19664b.liveOuterNotPreviewContentHeight().mo5927b().mo25522a().intValue();
            setLayoutParams(layoutParams);
            AbstractC7361c cVar = this.f19665c;
            if (cVar != null) {
                cVar.mo28647a(1.0f, false);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void show() {
        C7352a aVar = this.f19672j;
        if (aVar != null && aVar.f19679a != null) {
            m29347f();
            this.f19674l.mo237937a(m29346e().mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.$$Lambda$PhotoViewContainer$o3SY0IvJEPkTiHSM9WyTS574 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PhotoViewContainer.this.m29341a((PhotoViewContainer) ((AbstractC7361c) obj));
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.$$Lambda$PhotoViewContainer$_MQPVteHvrNulFckl80rbXk09JU */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PhotoViewContainer.this.m29343a((PhotoViewContainer) ((Throwable) obj));
                }
            }));
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ C7358b m29348g() {
        boolean z;
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z2 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.f19672j.f19679a.mo29485e(), options);
        boolean e = this.f19671i.mo27716e(this.f19672j.f19679a.mo29483d(), null);
        boolean b = C6896i.m27271b(options.outWidth, options.outHeight);
        boolean j = this.f19672j.f19679a.mo29491j();
        C7358b.C7360a a = C7358b.m29378f().mo28641a(e);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            z = false;
        } else {
            z = true;
        }
        C7358b.C7360a b2 = a.mo28645d(z).mo28643b(j);
        if (!b && !C6896i.m27269a(this.f19672j.f19679a.mo29485e())) {
            z2 = false;
        }
        return b2.mo28644c(z2).mo28640a(options).mo28639a(this.f19672j.f19680b).mo28642a();
    }

    /* renamed from: b */
    public void mo28617b() {
        this.f19663a.setCommentClickListener(new CommentRectLayout.AbstractC6342a() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.PhotoViewContainer.C73491 */

            @Override // com.bytedance.ee.bear.drive.biz.comment.CommentRectLayout.AbstractC6342a
            /* renamed from: a */
            public void mo25501a() {
                PhotoViewContainer.this.f19664b.liveInnerForceFullScreen().mo5926a((Boolean) false);
            }

            @Override // com.bytedance.ee.bear.drive.biz.comment.CommentRectLayout.AbstractC6342a
            /* renamed from: b */
            public void mo25503b() {
                PhotoViewContainer.this.f19664b.liveInnerCreateNewComment().mo5926a((Boolean) true);
            }

            @Override // com.bytedance.ee.bear.drive.biz.comment.CommentRectLayout.AbstractC6342a
            /* renamed from: a */
            public void mo25502a(boolean z) {
                PhotoViewContainer.this.f19664b.liveInnerSetSwipeEnable().mo5926a(Boolean.valueOf(!z));
                if (z) {
                    PhotoViewContainer.this.f19665c.mo28647a(1.0f, true);
                }
            }

            @Override // com.bytedance.ee.bear.drive.biz.comment.CommentRectLayout.AbstractC6342a
            /* renamed from: b */
            public void mo25504b(boolean z) {
                PhotoViewContainer.this.f19664b.liveInnerSetSwipeEnable().mo5926a(Boolean.valueOf(!z));
                if (z) {
                    PhotoViewContainer.this.f19665c.mo28647a(2.0f, true);
                } else {
                    PhotoViewContainer.this.f19665c.mo28647a(1.0f, true);
                }
            }
        });
        this.f19670h.mo25578a(new C6367d.AbstractC6370b() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.PhotoViewContainer.C73502 */

            @Override // com.bytedance.ee.bear.drive.biz.comment.C6367d.AbstractC6370b
            /* renamed from: a */
            public void mo25584a(CommentRectF commentRectF) {
                C13479a.m54764b("preview_image", "photoview container onClick()");
                if (commentRectF != null) {
                    PhotoViewContainer.this.f19664b.liveInnerCommentSelected().mo5926a(commentRectF);
                    PhotoViewContainer.this.mo28619d();
                    return;
                }
                PhotoViewContainer.this.f19664b.liveInnerSingleTap().mo5926a((Void) null);
            }

            @Override // com.bytedance.ee.bear.drive.biz.comment.C6367d.AbstractC6370b
            /* renamed from: a */
            public void mo25583a(float f, float f2) {
                C13479a.m54764b("preview_image", "photoview container onLongClick()");
                if (PhotoViewContainer.this.f19664b.liveOuterCommentable().mo5927b() != null && PhotoViewContainer.this.f19664b.liveOuterCommentable().mo5927b().booleanValue()) {
                    if (PhotoViewContainer.this.f19664b.liveOuterCommentCardVisible().mo5927b() == null || !PhotoViewContainer.this.f19664b.liveOuterCommentCardVisible().mo5927b().mo25522a().booleanValue()) {
                        PhotoViewContainer.this.f19664b.liveInnerForceFullScreen().mo5926a((Boolean) true);
                        if (!PhotoViewContainer.this.f19663a.mo25488b()) {
                            PhotoViewContainer.this.f19665c.mo28646a(2.0f, f, f2);
                            PhotoViewContainer.this.f19663a.mo25483a(f, f2);
                        }
                    }
                }
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onAreaClick() {
        C13479a.m54764b("preview_image", "photoview container onAreaClick()");
        this.f19664b.liveInnerCommentSelected().mo5926a((CommentRectF) null);
        CommentRectLayout commentRectLayout = getCommentRectLayout();
        if (commentRectLayout.mo25488b()) {
            this.f19664b.liveInnerForceFullScreen().mo5926a((Boolean) false);
            commentRectLayout.mo25489c();
            this.f19664b.liveInnerCreateNewComment().mo5926a((Boolean) false);
            return false;
        }
        getCommentRectLayout().mo25482a();
        return true;
    }

    /* renamed from: a */
    public void mo28612a() {
        LayoutInflater.from(this.f19668f).inflate(R.layout.drive_preview_photo_view, this);
        this.f19669g = (FrameLayout) findViewById(R.id.container);
        CommentRectLayout commentRectLayout = (CommentRectLayout) findViewById(R.id.drive_comment_rect_layout);
        this.f19663a = commentRectLayout;
        commentRectLayout.mo25486a((List<CommentRectF>) null);
        this.f19670h = new C6367d(this.f19663a);
    }

    public void setMimeTypeManager(AbstractC7095c cVar) {
        this.f19671i = cVar;
    }

    public void setOnPhotoRequestListener(AbstractC7365f fVar) {
        this.f19667e = fVar;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7262d
    public void setOnShowViewTrackEventCallback(AbstractC7256c cVar) {
        this.f19675m = cVar;
    }

    /* renamed from: a */
    private void m29339a(Context context) {
        this.f19668f = context;
        mo28612a();
    }

    public PhotoViewContainer(Context context) {
        super(context);
        m29339a(context);
    }

    /* renamed from: a */
    private /* synthetic */ void m29340a(RectF rectF) {
        this.f19663a.mo25484a(rectF);
    }

    /* renamed from: a */
    private /* synthetic */ AbstractC70020b m29337a(C7358b bVar) {
        this.f19666d = bVar;
        AbstractC7361c a = C7362d.m29394a(this.f19668f, bVar, this.f19664b);
        this.f19665c = a;
        return AbstractC68307f.m265083a(a);
    }

    /* renamed from: b */
    private static /* synthetic */ AbstractC70020b m29345b(C7358b bVar) {
        if (bVar.mo28636c() || bVar.mo28637d()) {
            return AbstractC68307f.m265083a(bVar);
        }
        return AbstractC68307f.m265084a((Throwable) new IllegalStateException("photo isNotValidSize"));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC7361c cVar = this.f19665c;
        if (cVar == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.f19670h.mo25579a(motionEvent, cVar) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onSetup(ViewOwner viewOwner) {
        C7555f fVar = (C7555f) viewOwner.viewModel(C7555f.class);
        this.f19664b = fVar;
        fVar.liveOuterFullScreenSate().mo5923a(viewOwner.lifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.$$Lambda$PhotoViewContainer$KeUiAkZv9ayoxBFFrCaznd2LQE4 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                PhotoViewContainer.lambda$KeUiAkZv9ayoxBFFrCaznd2LQE4(PhotoViewContainer.this, (Boolean) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void showSelectedComment(String str) {
        C13479a.m54764b("preview_image", "photoview container showSelectedComment() id=" + str);
        this.f19663a.mo25485a(str);
        mo28619d();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void updateComment(ArrayList<CommentRectF> arrayList) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("photoview container updateComment(), size=");
        if (arrayList == null) {
            i = 0;
        } else {
            i = arrayList.size();
        }
        sb.append(i);
        C13479a.m54764b("preview_image", sb.toString());
        this.f19663a.mo25486a(arrayList);
    }

    /* renamed from: a */
    private void m29341a(AbstractC7361c cVar) {
        if (cVar instanceof View) {
            this.f19669g.addView((View) cVar, new FrameLayout.LayoutParams(-1, -1));
        } else {
            C13479a.m54758a("PhotoViewContainer", "DrivePhotoView must be View");
        }
        this.f19665c.setOnPhotoRequestListener(new AbstractC7365f.C7366a() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.PhotoViewContainer.C73513 */

            @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7365f.C7366a, com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7365f
            /* renamed from: a */
            public void mo28625a() {
                if (PhotoViewContainer.this.f19667e != null) {
                    PhotoViewContainer.this.f19667e.mo28625a();
                }
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7365f.C7366a, com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7365f
            /* renamed from: a */
            public void mo28626a(String str) {
                PhotoViewContainer photoViewContainer = PhotoViewContainer.this;
                photoViewContainer.mo28613a(photoViewContainer.f19666d.mo28638e(), str);
                PhotoViewContainer.this.mo28617b();
                if (PhotoViewContainer.this.f19667e != null) {
                    PhotoViewContainer.this.f19667e.mo28626a(str);
                }
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7365f.C7366a, com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7365f
            /* renamed from: a */
            public void mo28627a(String str, Throwable th, boolean z) {
                PhotoViewContainer photoViewContainer = PhotoViewContainer.this;
                photoViewContainer.mo28615a(str, th, photoViewContainer.f19666d.mo28638e());
                if (PhotoViewContainer.this.f19667e != null) {
                    PhotoViewContainer.this.f19667e.mo28627a(str, th, z);
                }
            }
        });
        this.f19665c.setOnMatrixChangeListener(new AbstractC7356a() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.$$Lambda$PhotoViewContainer$MSteyR_8tMcPHDV4L52Dwpc1qFM */

            @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.p373a.AbstractC7356a
            public final void onMatrixChanged(RectF rectF) {
                PhotoViewContainer.this.m29340a((PhotoViewContainer) rectF);
            }
        });
        this.f19665c.setOnScaleEventListener(new AbstractC7357b() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.$$Lambda$PhotoViewContainer$bY26IKXXXJFzn_nEyC6csie_nE4 */

            @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.p373a.AbstractC7357b
            public final void onScaleEvent(float f, float f2) {
                PhotoViewContainer.this.m29338a((PhotoViewContainer) f, f2);
            }
        });
        this.f19665c.mo28628a(this.f19672j.f19679a);
    }

    /* renamed from: a */
    private /* synthetic */ void m29342a(Boolean bool) {
        boolean z;
        if (bool != null) {
            CommentRectLayout commentRectLayout = this.f19663a;
            if (bool.booleanValue() || this.f19663a.mo25488b()) {
                z = false;
            } else {
                z = true;
            }
            commentRectLayout.setCommentRectVisible(z);
            if (bool.booleanValue()) {
                this.f19664b.liveInnerCommentSelected().mo5926a((CommentRectF) null);
            }
        }
    }

    /* renamed from: a */
    private /* synthetic */ void m29343a(Throwable th) {
        C13479a.m54761a("PhotoViewContainer", th);
        C7555f fVar = this.f19664b;
        if (fVar != null) {
            fVar.getLiveInnerShowPreviewFailedPage().mo5926a((Void) null);
        }
    }

    /* renamed from: a */
    public void mo28614a(C7352a aVar) {
        this.f19672j = aVar;
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.PhotoViewContainer$a */
    public static class C7352a {

        /* renamed from: a */
        public C7553d f19679a;

        /* renamed from: b */
        public int f19680b;

        public C7352a(C7553d dVar, int i) {
            this.f19679a = dVar;
            this.f19680b = i;
        }
    }

    public PhotoViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29339a(context);
    }

    /* renamed from: a */
    private /* synthetic */ void m29338a(float f, float f2) {
        C7555f fVar = this.f19664b;
        if (fVar != null) {
            float f3 = f2 - f;
            if (f3 < BitmapDescriptorFactory.HUE_RED) {
                fVar.liveInnerReportMsg().mo28018a(C7557g.m30300a(17));
            } else if (f3 > BitmapDescriptorFactory.HUE_RED) {
                fVar.liveInnerReportMsg().mo28018a(C7557g.m30300a(18));
            }
        }
    }

    /* renamed from: b */
    private static String m29344b(BitmapFactory.Options options, String str) {
        if (options == null) {
            return "";
        }
        return "width: " + options.outWidth + " height: " + options.outHeight + " multi: " + (options.outHeight * options.outWidth) + "  open mode: " + str;
    }

    /* renamed from: a */
    public void mo28613a(BitmapFactory.Options options, String str) {
        long j;
        C13479a.m54764b("preview_image", "preview succeed: " + m29344b(options, str));
        AbstractC7256c cVar = this.f19675m;
        if (cVar != null) {
            cVar.mo26118a(str);
        }
        C6712a.m26464b(this.f19664b, this);
        if (this.f19664b != null) {
            long j2 = 0;
            if (options == null) {
                j = 0;
            } else {
                j = (long) options.outWidth;
            }
            if (options != null) {
                j2 = (long) options.outHeight;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("loadImageStartTime", Long.valueOf(this.f19673k));
            hashMap.put("imageHeight", Long.valueOf(j2));
            hashMap.put("imageWidth", Long.valueOf(j));
            hashMap.put("openMode", str);
            hashMap.put("resultKey", "success");
            this.f19664b.liveInnerReportMsg().mo28018a(C7557g.m30301a(10, hashMap));
        }
    }
}
