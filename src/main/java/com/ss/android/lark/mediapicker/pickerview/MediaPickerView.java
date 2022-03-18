package com.ss.android.lark.mediapicker.pickerview;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.C44614a;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.album.base.AbstractC44653g;
import com.ss.android.lark.mediapicker.album.base.AbstractC44659i;
import com.ss.android.lark.mediapicker.album.base.AlbumGridActivity;
import com.ss.android.lark.mediapicker.album.base.C44625a;
import com.ss.android.lark.mediapicker.album.base.C44627b;
import com.ss.android.lark.mediapicker.album.base.C44660j;
import com.ss.android.lark.mediapicker.dependency.C44675a;
import com.ss.android.lark.mediapicker.dependency.C44677b;
import com.ss.android.lark.mediapicker.entity.BackToPickerResult;
import com.ss.android.lark.mediapicker.entity.EditInfo;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.p2241a.AbstractC44616b;
import com.ss.android.lark.mediapicker.p2241a.AbstractC44617c;
import com.ss.android.lark.mediapicker.preview.base.MediaPreviewActivity;
import com.ss.android.lark.mediapicker.utils.C44745d;
import com.ss.android.lark.mediapicker.utils.C44750g;
import com.ss.android.lark.mediapicker.utils.C44760o;
import com.ss.android.lark.mediapicker.utils.C44763p;
import com.ss.android.lark.mediarecorder.MediaRecorder;
import com.ss.android.lark.mediarecorder.MediaRecorderConfig;
import com.ss.android.lark.mediarecorder.entity.Media;
import com.ss.android.lark.mediarecorder.p2245c.C44796g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MediaPickerView extends FrameLayout implements AbstractC44659i {

    /* renamed from: a */
    public C44627b f113234a;

    /* renamed from: b */
    public FragmentActivity f113235b;

    /* renamed from: c */
    public AbstractC44696a f113236c;

    /* renamed from: d */
    public AbstractC44701f f113237d;

    /* renamed from: e */
    public boolean f113238e;

    /* renamed from: f */
    public MediaPickerConfig f113239f;

    /* renamed from: g */
    AbstractC44653g.AbstractC44655b.AbstractC44657b f113240g;

    /* renamed from: h */
    Runnable f113241h;

    /* renamed from: i */
    private AbstractC44698c f113242i;

    /* renamed from: j */
    private AbstractC44699d f113243j;

    /* renamed from: k */
    private ContentObserver f113244k;

    /* renamed from: com.ss.android.lark.mediapicker.pickerview.MediaPickerView$a */
    public interface AbstractC44696a {
        /* renamed from: a */
        void mo158368a(List<LocalMedia> list, boolean z);
    }

    /* renamed from: com.ss.android.lark.mediapicker.pickerview.MediaPickerView$c */
    public interface AbstractC44698c {
        /* renamed from: a */
        void mo158373a();
    }

    /* renamed from: com.ss.android.lark.mediapicker.pickerview.MediaPickerView$d */
    public interface AbstractC44699d {
        /* renamed from: a */
        void mo158374a(BackToPickerResult backToPickerResult);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mediapicker.pickerview.MediaPickerView$e */
    public interface AbstractC44700e<T> {
        /* renamed from: a */
        void mo158358a(T t);
    }

    /* renamed from: com.ss.android.lark.mediapicker.pickerview.MediaPickerView$f */
    public interface AbstractC44701f {
        /* renamed from: a */
        void mo158375a();

        /* renamed from: b */
        void mo158376b();

        /* renamed from: c */
        void mo158377c();
    }

    public AbstractC44696a getMediaPickerListener() {
        return this.f113236c;
    }

    /* renamed from: b */
    public void mo158345b() {
        AbstractC44698c cVar = this.f113242i;
        if (cVar != null) {
            cVar.mo158373a();
        }
    }

    public String[] getMediaPickerPermissions() {
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    /* renamed from: c */
    private void m177248c() {
        this.f113235b = (FragmentActivity) getContext();
        LayoutInflater.from(getContext()).inflate(R.layout.picker_media_picker_view, (ViewGroup) this, true);
        setClickable(true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f113244k);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getContext().getContentResolver().unregisterContentObserver(this.f113244k);
    }

    /* renamed from: d */
    private void m177249d() {
        ((ImageView) findViewById(R.id.camera_btn)).setEnabled(this.f113239f.f113063B);
        ((ImageView) findViewById(R.id.btn_photo_album)).setEnabled(this.f113239f.f113063B);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        MediaPickerConfig mediaPickerConfig = this.f113239f;
        if (mediaPickerConfig != null) {
            if (!(this.f113234a == null || mediaPickerConfig.f113066E == null)) {
                this.f113239f.f113066E.clear();
                this.f113239f.f113066E.addAll(this.f113234a.mo158182b());
            }
            bundle.putParcelable("config", this.f113239f);
        }
        C44614a.m176964a(bundle);
        return bundle;
    }

    /* renamed from: a */
    public void mo158341a() {
        FragmentActivity fragmentActivity;
        C44677b.m177236a("onMediaChange() called");
        if (!this.f113238e) {
            C44677b.m177239b("update config before init");
        } else if (this.f113234a != null && (fragmentActivity = this.f113235b) != null && this.f113239f != null && m177247a(fragmentActivity, getMediaPickerPermissions())) {
            this.f113234a.mo158183b(this.f113235b.getSupportLoaderManager(), this.f113235b);
        }
    }

    public void setBackToPickerViewCallBack(AbstractC44698c cVar) {
        this.f113242i = cVar;
    }

    public void setMediaPickerListener(AbstractC44696a aVar) {
        this.f113236c = aVar;
    }

    public void setOnBackToPickerViewResult(AbstractC44699d dVar) {
        this.f113243j = dVar;
    }

    public void setPickerViewActionListener(AbstractC44701f fVar) {
        this.f113237d = fVar;
    }

    public MediaPickerView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo158344a(BackToPickerResult backToPickerResult) {
        AbstractC44699d dVar = this.f113243j;
        if (dVar != null) {
            dVar.mo158374a(backToPickerResult);
        }
    }

    /* renamed from: a */
    private void m177246a(final AbstractC44700e<C44714d> eVar) {
        post(new Runnable() {
            /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.RunnableC446842 */

            public void run() {
                AbstractC44700e eVar = eVar;
                if (eVar != null) {
                    eVar.mo158358a(C44714d.m177331a(MediaPickerView.this.f113235b));
                }
            }
        });
    }

    /* renamed from: b */
    public void mo158346b(MediaPickerConfig mediaPickerConfig) {
        C44707b bVar = new C44707b();
        C44625a aVar = new C44625a();
        this.f113234a = new C44627b(bVar, aVar);
        bVar.mo158218a(getContext(), this.f113240g, mediaPickerConfig);
        aVar.mo158165a(mediaPickerConfig, mediaPickerConfig.f113066E);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("super"));
            C44614a.m176967b(bundle);
            MediaPickerConfig mediaPickerConfig = (MediaPickerConfig) bundle.getParcelable("config");
            if (mediaPickerConfig != null) {
                mo158343a(mediaPickerConfig);
            }
        }
    }

    /* renamed from: a */
    public LocalMedia mo158340a(Media media) {
        return new LocalMedia(media.getId(), media.getPath(), media.getMimeType(), media.getDuration(), media.getWidth(), media.getHeight(), media.getSize());
    }

    /* renamed from: a */
    public void mo158342a(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("isSend", false);
        boolean booleanExtra2 = intent.getBooleanExtra("PICKED_ORIGIN", false);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("PICKED_MEDIAS");
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("EDITED_MEDIAS");
        if (!this.f113239f.f113064C) {
            parcelableArrayListExtra2 = new ArrayList();
        }
        this.f113234a.mo158181a(booleanExtra2, parcelableArrayListExtra, parcelableArrayListExtra2);
        if (booleanExtra) {
            this.f113234a.mo158176a();
            return;
        }
        mo158345b();
        mo158344a(new BackToPickerResult());
    }

    /* renamed from: a */
    public void mo158343a(final MediaPickerConfig mediaPickerConfig) {
        this.f113239f = mediaPickerConfig;
        m177249d();
        m177246a(new AbstractC44700e<C44714d>() {
            /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.C446821 */

            /* renamed from: a */
            public void mo158358a(C44714d dVar) {
                dVar.mo158386a(MediaPickerView.this.getMediaPickerPermissions(), 7654, new AbstractC44616b() {
                    /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.C446821.C446831 */

                    @Override // com.ss.android.lark.mediapicker.p2241a.AbstractC44616b
                    /* renamed from: a */
                    public void mo158124a(boolean z) {
                        MediaPickerView.this.mo158346b(mediaPickerConfig);
                        MediaPickerView.this.f113238e = true;
                        if (z) {
                            MediaPickerView.this.f113234a.mo158177a(MediaPickerView.this.f113235b.getSupportLoaderManager(), MediaPickerView.this.getContext());
                            C44660j.m177158a().mo158242a(MediaPickerView.this);
                            return;
                        }
                        MediaPickerView.this.f113234a.mo158186e();
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44659i
    /* renamed from: a */
    public void mo158146a(EditInfo editInfo) {
        C44627b bVar;
        if (this.f113239f.f113064C && (bVar = this.f113234a) != null) {
            bVar.mo158178a(editInfo);
        }
    }

    /* renamed from: com.ss.android.lark.mediapicker.pickerview.MediaPickerView$b */
    public static class C44697b implements C44796g.AbstractC44798a {
        @Override // com.ss.android.lark.mediarecorder.p2245c.C44796g.AbstractC44798a
        /* renamed from: a */
        public void mo158369a(String str, String str2) {
            C44677b.m177241d(str2);
        }

        @Override // com.ss.android.lark.mediarecorder.p2245c.C44796g.AbstractC44798a
        /* renamed from: b */
        public void mo158370b(String str, String str2) {
            C44677b.m177240c(str2);
        }

        @Override // com.ss.android.lark.mediarecorder.p2245c.C44796g.AbstractC44798a
        /* renamed from: c */
        public void mo158371c(String str, String str2) {
            C44677b.m177239b(str2);
        }

        @Override // com.ss.android.lark.mediarecorder.p2245c.C44796g.AbstractC44798a
        /* renamed from: d */
        public void mo158372d(String str, String str2) {
            C44677b.m177236a(str2);
        }
    }

    public MediaPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private boolean m177247a(Context context, String[] strArr) {
        for (String str : strArr) {
            if (ActivityCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44659i
    /* renamed from: a */
    public void mo158147a(boolean z, List<LocalMedia> list) {
        C44627b bVar = this.f113234a;
        if (bVar != null) {
            bVar.mo158180a(z, list);
        }
    }

    public MediaPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f113240g = new AbstractC44653g.AbstractC44655b.AbstractC44657b() {
            /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.C446853 */

            @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
            /* renamed from: b */
            public void mo158158b() {
            }

            @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
            /* renamed from: a */
            public View mo158154a() {
                return MediaPickerView.this;
            }

            @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
            /* renamed from: d */
            public void mo158160d() {
                C26323w.m95322a(MediaPickerView.this.getContext());
            }

            @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
            /* renamed from: c */
            public void mo158159c() {
                if (MediaPickerView.this.f113237d != null) {
                    MediaPickerView.this.f113237d.mo158376b();
                }
                m177262e();
            }

            /* renamed from: e */
            private void m177262e() {
                C44714d a = C44714d.m177331a(MediaPickerView.this.f113235b);
                MediaRecorderConfig.C44771a a2 = MediaRecorderConfig.m177530a();
                a2.mo158506b(MediaPickerView.this.f113239f.f113091x).mo158502a(MediaPickerView.this.f113239f.f113090w).mo158501a(new C44697b()).mo158507c(MediaPickerView.this.f113239f.f113089v).mo158508d(5679).mo158503a(MediaPickerView.this.f113239f.f113092y).mo158500a(MediaPickerView.this.f113239f.f113093z).mo158505b(MediaPickerView.this.f113239f.f113062A);
                a.mo158385a(MediaRecorder.f113397a.mo158509a(MediaPickerView.this.f113235b, a2.mo158504a()), 5679, new AbstractC44617c() {
                    /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.C446853.C446915 */

                    @Override // com.ss.android.lark.mediapicker.p2241a.AbstractC44617c
                    /* renamed from: a */
                    public void mo158125a(int i, int i2, Intent intent) {
                        if (MediaPickerView.this.f113234a == null || i2 != -1) {
                            MediaPickerView.this.mo158345b();
                            if (i2 != 0 || intent == null) {
                                MediaPickerView.this.mo158344a(new BackToPickerResult());
                            } else if (intent.getIntExtra("RECORDER_PERMISSION", 0) == 256) {
                                MediaPickerView.this.mo158344a(new BackToPickerResult(257));
                                if (MediaPickerView.this.f113239f.f113065D) {
                                    C44763p.m177518a(new Runnable() {
                                        /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.C446853.C446915.RunnableC446921 */

                                        public void run() {
                                            C44750g.m177492a(MediaPickerView.this.getContext());
                                        }
                                    }, 200);
                                }
                                C44677b.m177236a("camera no permission");
                            }
                            C44677b.m177240c("cancel activity result ");
                            return;
                        }
                        MediaPickerView.this.f113234a.mo158179a(MediaPickerView.this.mo158340a((Media) intent.getParcelableExtra("TOKEN_MEDIA")));
                    }
                });
            }

            /* renamed from: a */
            public List<LocalMedia> mo158360a(List<LocalMedia> list) {
                try {
                    for (LocalMedia localMedia : list) {
                        if (!localMedia.isVideo() && (localMedia.getHeight() <= 0 || localMedia.getWidth() <= 0)) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(localMedia.getPath(), options);
                            localMedia.setWidth(options.outWidth);
                            localMedia.setHeight(options.outHeight);
                        }
                    }
                } catch (Exception unused) {
                    C44677b.m177239b("can not get image width and height");
                }
                return list;
            }

            @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
            /* renamed from: a */
            public void mo158155a(final MediaPickerConfig mediaPickerConfig, final List<LocalMedia> list) {
                if (MediaPickerView.this.f113237d != null) {
                    MediaPickerView.this.f113237d.mo158375a();
                }
                C44714d.m177331a(MediaPickerView.this.f113235b).mo158386a(MediaPickerView.this.getMediaPickerPermissions(), 7654, new AbstractC44616b() {
                    /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.C446853.C446894 */

                    @Override // com.ss.android.lark.mediapicker.p2241a.AbstractC44616b
                    /* renamed from: a */
                    public void mo158124a(boolean z) {
                        if (z) {
                            C446853.this.mo158361b(mediaPickerConfig, list);
                            return;
                        }
                        MediaPickerView.this.mo158345b();
                        MediaPickerView.this.mo158344a(new BackToPickerResult(DynamicModule.f58006b));
                        if (mediaPickerConfig.f113065D) {
                            C44763p.m177518a(new Runnable() {
                                /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.C446853.C446894.RunnableC446901 */

                                public void run() {
                                    C44750g.m177492a(MediaPickerView.this.getContext());
                                }
                            }, 200);
                        }
                        C44677b.m177239b("has not permission to open album");
                    }
                });
            }

            /* renamed from: b */
            public void mo158361b(MediaPickerConfig mediaPickerConfig, List<LocalMedia> list) {
                C44714d a = C44714d.m177331a(MediaPickerView.this.f113235b);
                Intent intent = new Intent(MediaPickerView.this.f113235b, AlbumGridActivity.class);
                mediaPickerConfig.f113066E = new ArrayList<>(list);
                mediaPickerConfig.f113085r = MediaPickerView.this.f113234a.mo158187f();
                intent.putExtra("mediaConfig", mediaPickerConfig);
                intent.putExtra("logger", C44677b.m177232a());
                intent.putExtra("imageLoader", C44675a.m177225a());
                a.mo158385a(intent, 34545, new AbstractC44617c() {
                    /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.C446853.C446936 */

                    @Override // com.ss.android.lark.mediapicker.p2241a.AbstractC44617c
                    /* renamed from: a */
                    public void mo158125a(int i, int i2, Intent intent) {
                        if (i2 == -1 && MediaPickerView.this.f113234a != null) {
                            MediaPickerView.this.mo158342a(intent);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
            /* renamed from: a */
            public void mo158157a(List<LocalMedia> list, List<LocalMedia> list2, final boolean z) {
                if (MediaPickerView.this.f113236c != null) {
                    if (CollectionUtils.isNotEmpty(list)) {
                        C44745d.m177486a(new ArrayList(list), new Function1<List<LocalMedia>, List<LocalMedia>>() {
                            /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.C446853.C446861 */

                            /* renamed from: a */
                            public List<LocalMedia> invoke(List<LocalMedia> list) {
                                return C446853.this.mo158360a(list);
                            }
                        }, new Function1<List<LocalMedia>, Unit>() {
                            /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.C446853.C446872 */

                            /* renamed from: a */
                            public Unit invoke(List<LocalMedia> list) {
                                MediaPickerView.this.f113236c.mo158368a(list, z);
                                return null;
                            }
                        });
                    } else {
                        C44677b.m177236a("selection Medias is empty");
                    }
                }
            }

            @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
            /* renamed from: a */
            public void mo158156a(List<LocalMedia> list, List<LocalMedia> list2, int i, boolean z, MediaPickerConfig mediaPickerConfig) {
                if (i < 0 || i > list.size() - 1 || list2.size() > list.size()) {
                    C44677b.m177236a("startPreview error position : " + i + " selectedMedias size :" + list2.size() + " localMediaList size :" + list.size());
                    return;
                }
                if (MediaPickerView.this.f113237d != null) {
                    MediaPickerView.this.f113237d.mo158377c();
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable("selectList", (Serializable) list2);
                bundle.putInt("position", i);
                C44760o.m177512a().mo158477a(MediaPickerView.this.f113235b, "allList", list);
                bundle.putString("allListKey", "allList");
                bundle.putParcelable("mediaConfig", mediaPickerConfig);
                bundle.putBoolean("keepOrigin", z);
                bundle.putInt("position", i);
                bundle.putParcelable("logger", C44677b.m177232a());
                bundle.putParcelable("imageLoader", C44675a.m177225a());
                Intent intent = new Intent();
                intent.setClass(MediaPickerView.this.f113235b, MediaPreviewActivity.class);
                intent.putExtras(bundle);
                C44714d.m177331a(MediaPickerView.this.f113235b).mo158385a(intent, 6789, new AbstractC44617c() {
                    /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.C446853.C446883 */

                    @Override // com.ss.android.lark.mediapicker.p2241a.AbstractC44617c
                    /* renamed from: a */
                    public void mo158125a(int i, int i2, Intent intent) {
                        if (i2 == -1 && MediaPickerView.this.f113234a != null) {
                            MediaPickerView.this.mo158342a(intent);
                        }
                    }
                });
                MediaPickerView.this.f113235b.overridePendingTransition(R.anim.picker_in_from_right, R.anim.picker_out_to_left);
            }
        };
        this.f113241h = new Runnable() {
            /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.RunnableC446944 */

            public void run() {
                MediaPickerView.this.mo158341a();
            }
        };
        this.f113244k = new ContentObserver(null) {
            /* class com.ss.android.lark.mediapicker.pickerview.MediaPickerView.C446955 */

            public void onChange(boolean z) {
                C44763p.m177519b(MediaPickerView.this.f113241h);
                C44763p.m177518a(MediaPickerView.this.f113241h, 3000);
            }
        };
        m177248c();
    }
}
