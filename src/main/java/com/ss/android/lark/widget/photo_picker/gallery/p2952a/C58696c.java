package com.ss.android.lark.widget.photo_picker.gallery.p2952a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.MediaStoreUtil;
import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.entity.DataSource;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.FileState;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a;
import com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58696c;
import com.ss.android.lark.widget.photo_picker.utils.MediaExtraUtils;
import java.io.File;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.c */
public class C58696c extends BaseModel implements AbstractC58689a.AbstractC58690a {

    /* renamed from: a */
    public boolean f145050a;

    /* renamed from: b */
    public AbstractC58689a.AbstractC58690a.AbstractC58691a f145051b;

    /* renamed from: c */
    public boolean f145052c;

    /* renamed from: d */
    public Context f145053d;

    /* renamed from: e */
    private final PhotoItem f145054e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.c$a */
    public static class RunnableC58701a implements Runnable {

        /* renamed from: a */
        final WeakReference<C58696c> f145067a;

        /* renamed from: b */
        final SoftReference<IGetDataCallback<String>> f145068b;

        /* renamed from: c */
        final MediaExtra f145069c;

        /* renamed from: d */
        final String f145070d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo199074a() {
            C58696c cVar = this.f145067a.get();
            if (cVar != null) {
                cVar.f145050a = false;
                IGetDataCallback<String> iGetDataCallback = this.f145068b.get();
                if (iGetDataCallback != null) {
                    if (C26311p.m95290j(this.f145070d)) {
                        iGetDataCallback.onSuccess(this.f145070d);
                        MediaExtraUtils.m227480a(this.f145069c, cVar.f145053d, this.f145070d);
                        return;
                    }
                    iGetDataCallback.onError(new ErrorResult(0));
                }
            }
        }

        public void run() {
            C58696c cVar = this.f145067a.get();
            if (cVar != null) {
                try {
                    MediaStoreUtil.m94890a(new File(this.f145069c.getFilePath()), Uri.fromFile(new File(this.f145070d)), cVar.f145053d);
                } catch (Exception e) {
                    Log.m165384e("OnlineVideoGalleryModel", "save local file failed", e);
                }
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.$$Lambda$5o9k4m3VPImrkP3DL6UqBA0lE */

                    public final void run() {
                        C58696c.RunnableC58701a.this.mo199074a();
                    }
                });
            }
        }

        RunnableC58701a(C58696c cVar, IGetDataCallback<String> iGetDataCallback, MediaExtra mediaExtra, String str) {
            this.f145067a = new WeakReference<>(cVar);
            this.f145068b = new SoftReference<>(iGetDataCallback);
            this.f145069c = mediaExtra;
            this.f145070d = str;
        }
    }

    /* renamed from: a */
    public void mo199070a(AbstractC58689a.AbstractC58690a.AbstractC58691a aVar) {
        this.f145051b = aVar;
    }

    /* renamed from: a */
    private int m227765a(Message.SourceType sourceType) {
        if (sourceType != null && sourceType == Message.SourceType.TYPE_FROM_FAVORITE) {
            return 2;
        }
        return -99;
    }

    /* renamed from: a */
    public void mo199069a(PhotoItem photoItem) {
        DataSource dataSource = new DataSource();
        MediaExtra mediaExtra = photoItem.getMediaExtra();
        dataSource.setData(mediaExtra.getUrl());
        C26311p.m95291k(C57881t.m224646r(this.f145053d) + Math.abs(mediaExtra.getUrl().hashCode()));
    }

    /* renamed from: b */
    private DataSource m227766b(PhotoItem photoItem) {
        DataSource dataSource = new DataSource();
        MediaExtra mediaExtra = photoItem.getMediaExtra();
        MessageIdentity messageIdentity = photoItem.getMessageIdentity();
        String url = mediaExtra.getUrl();
        if (!TextUtils.isEmpty(url) && messageIdentity != null) {
            StringBuilder sb = new StringBuilder(url);
            int a = m227765a(messageIdentity.getSourceType());
            if (a != -99) {
                if (url.contains("?")) {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                    sb.append("scene");
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(a);
                } else {
                    sb.append("?");
                    sb.append("scene");
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(a);
                }
                url = sb.toString();
            }
        }
        dataSource.setData(url);
        dataSource.setSize(mediaExtra.getSize());
        HashMap<String, String> hashMap = new HashMap<>(2);
        hashMap.put(ConvertOfficeToSpaceService.f88309g, "session=" + C58612c.m227290a().mo102851b());
        dataSource.setExtra(hashMap);
        return dataSource;
    }

    public C58696c(Context context, PhotoItem photoItem) {
        this.f145053d = context;
        this.f145054e = photoItem;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58690a
    /* renamed from: a */
    public void mo199044a(final PhotoItem photoItem, IGetDataCallback<DataSource> iGetDataCallback) {
        final IGetDataCallback iGetDataCallback2 = (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback);
        final String filePath = photoItem.getMediaExtra().getFilePath();
        if (TextUtils.isEmpty(filePath) || !C26311p.m95290j(filePath)) {
            iGetDataCallback2.onSuccess(m227766b(photoItem));
        } else {
            DataSource dataSource = new DataSource();
            File file = null;
            try {
                file = C58612c.m227290a().mo102869l().mo102871a(new File(filePath), false);
                Log.m165389i("OnlineVideoGalleryModel", "[cipher] file decrypt success, original path = " + filePath + ", new path = " + file.getAbsolutePath());
            } catch (Exception unused) {
                Log.m165383e("OnlineVideoGalleryModel", "[cipher] file decrypt failed, original path = " + filePath);
            }
            if (file == null || !file.exists()) {
                dataSource.setUri(Uri.fromFile(new File(filePath)));
            } else {
                dataSource.setUri(Uri.fromFile(file));
            }
            dataSource.setIsLocal(true);
            iGetDataCallback2.onSuccess(dataSource);
        }
        C58612c.m227290a().mo102842a(this.f145054e.getMessageIdentity(), new UIGetDataCallback(new IGetDataCallback<FileState>() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58696c.C586971 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback2.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(FileState fileState) {
                if (fileState != FileState.NORMAL) {
                    Log.m165389i("OnlineVideoGalleryModel", "checkFileState: " + filePath + ", file state is deleted, current state: " + fileState.name());
                    if (fileState == FileState.DELETED) {
                        C58696c.this.mo199069a(photoItem);
                    }
                    if (fileState == FileState.RECOVERABLE) {
                        C58696c.this.f145051b.mo199047a(C58696c.this.f145053d, false);
                    } else if (fileState == FileState.UNRECOVERABLE) {
                        C58696c.this.f145051b.mo199047a(C58696c.this.f145053d, true);
                    }
                }
            }
        }));
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58690a
    /* renamed from: b */
    public void mo199045b(PhotoItem photoItem, IGetDataCallback<String> iGetDataCallback) {
        final IGetDataCallback iGetDataCallback2 = (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback);
        final MediaExtra mediaExtra = photoItem.getMediaExtra();
        final String key = mediaExtra.getKey();
        final String b = MediaExtraUtils.m227481b(mediaExtra, this.f145053d);
        if (C26311p.m95290j(b)) {
            iGetDataCallback2.onError(new ErrorResult(-5438));
            this.f145050a = false;
        } else if (this.f145050a) {
            Log.m165388i("Downloading video");
            iGetDataCallback2.onError(new ErrorResult(-5439));
        } else if (C58612c.m227290a().mo102869l().mo102873a()) {
            iGetDataCallback2.onError(new ErrorResult(-6000));
        } else {
            this.f145050a = true;
            if (!TextUtils.isEmpty(mediaExtra.getUrl()) || !C26311p.m95290j(mediaExtra.getFilePath())) {
                C58612c.m227290a().mo102844a(this.f145054e.getMessageIdentity(), key, b, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58696c.C586982 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        iGetDataCallback2.onSuccess(b);
                        C58696c.this.f145050a = false;
                        MediaExtraUtils.m227480a(mediaExtra, C58696c.this.f145053d, str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(final ErrorResult errorResult) {
                        if (errorResult.getErrorCode() != C58612c.m227290a().mo102868k()) {
                            UICallbackExecutor.executeDelayed(new Runnable() {
                                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58696c.C586982.RunnableC586991 */

                                public void run() {
                                    iGetDataCallback2.onError(errorResult);
                                    C58696c.this.f145050a = false;
                                }
                            }, 200);
                            return;
                        }
                        iGetDataCallback2.onError(errorResult);
                        C58696c.this.f145050a = false;
                    }
                }, new AbstractC25974h() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58696c.C587003 */

                    @Override // com.larksuite.framework.callback.AbstractC25974h
                    public void onUpdateProgress(long j, int i) {
                        if (!C58696c.this.f145052c) {
                            C58612c.m227290a().mo102862f(key);
                            C58696c.this.f145052c = true;
                        }
                        C58696c.this.f145051b.mo199046a((int) (((long) (i * 100)) / j));
                    }
                });
            } else {
                CoreThreadPool.getDefault().getCachedThreadPool().execute(new RunnableC58701a(this, iGetDataCallback, mediaExtra, b));
            }
        }
    }
}
