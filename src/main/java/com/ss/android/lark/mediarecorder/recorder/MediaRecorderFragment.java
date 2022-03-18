package com.ss.android.lark.mediarecorder.recorder;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.FragmentParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mediarecorder.MediaRecorderConfig;
import com.ss.android.lark.mediarecorder.entity.Media;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44773b;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44774c;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44775d;
import com.ss.android.lark.mediarecorder.p2245c.C44792e;
import com.ss.android.lark.mediarecorder.p2245c.C44793f;
import com.ss.android.lark.mediarecorder.p2245c.C44796g;
import com.ss.android.lark.mediarecorder.p2245c.C44799h;
import com.ss.android.lark.mediarecorder.view.JCameraView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002BCB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0 H\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0010H\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020$H\u0002J\u0012\u0010'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\"\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010/\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J&\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u00102\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u00105\u001a\u00020$H\u0016J\b\u00106\u001a\u00020$H\u0016J-\u00107\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00072\u000e\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0 2\u0006\u00109\u001a\u00020:H\u0016¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020$H\u0016J\b\u0010=\u001a\u00020$H\u0002J\u0018\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020\u001aH\u0002J\b\u0010A\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/ss/android/lark/mediarecorder/recorder/MediaRecorderFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FragmentParams;", "()V", "config", "Lcom/ss/android/lark/mediarecorder/MediaRecorderConfig;", "featureSwitch", "", "Ljava/lang/Integer;", "jCameraView", "Lcom/ss/android/lark/mediarecorder/view/JCameraView;", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "mCurrentPhotoPath", "", "mView", "Landroid/view/ViewGroup;", "photoPath", "takePicListener", "Lcom/ss/android/lark/mediarecorder/recorder/MediaRecorderFragment$OnTakePhotoVideoListener;", "getTakePicListener", "()Lcom/ss/android/lark/mediarecorder/recorder/MediaRecorderFragment$OnTakePhotoVideoListener;", "setTakePicListener", "(Lcom/ss/android/lark/mediarecorder/recorder/MediaRecorderFragment$OnTakePhotoVideoListener;)V", "videoPath", "checkPermission", "", "permission", "checkPermissions", "createImageFile", "Ljava/io/File;", "getPermissions", "", "()[Ljava/lang/String;", "getRootView", "initCameraView", "", "initConfig", "initListeners", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "onDestroy", "onPause", "onRequestPermissionsResult", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "requestPermissionBeforeTake", "shouldMakeIntentFaceFront", "intent", "isFaceFront", "takeMedia", "Companion", "OnTakePhotoVideoListener", "mediarecorder_release"}, mo238835k = 1, mv = {1, 1, 13})
/* renamed from: com.ss.android.lark.mediarecorder.recorder.a */
public final class MediaRecorderFragment extends C36516a<FragmentParams> {

    /* renamed from: d */
    public static final Companion f113423d = new Companion(null);

    /* renamed from: a */
    public FragmentActivity f113424a;

    /* renamed from: b */
    public String f113425b;

    /* renamed from: c */
    public JCameraView f113426c;

    /* renamed from: e */
    private MediaRecorderConfig f113427e;

    /* renamed from: f */
    private Integer f113428f;

    /* renamed from: g */
    private String f113429g;

    /* renamed from: h */
    private ViewGroup f113430h;

    /* renamed from: i */
    private OnTakePhotoVideoListener f113431i;

    /* renamed from: j */
    private String f113432j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u001c\u0010\u000b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mediarecorder/recorder/MediaRecorderFragment$OnTakePhotoVideoListener;", "", "onCloseClick", "", "onNeedAudioPermission", "onTakePhoto", "url", "", "onTakePhotoVideoError", "num", "", "onTakeVideo", "firstFrameUrl", "mediarecorder_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.recorder.a$b */
    public interface OnTakePhotoVideoListener {
        /* renamed from: a */
        void mo158579a();

        /* renamed from: a */
        void mo158580a(int i);

        /* renamed from: a */
        void mo158581a(String str);

        /* renamed from: a */
        void mo158582a(String str, String str2);

        /* renamed from: b */
        void mo158583b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mediarecorder/recorder/MediaRecorderFragment$Companion;", "", "()V", "TAG", "", "mediarecorder_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.recorder.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final OnTakePhotoVideoListener mo158578a() {
        return this.f113431i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/mediarecorder/recorder/MediaRecorderFragment$initCameraView$1", "Lcom/ss/android/lark/mediarecorder/listener/ErrorListener;", "audioPermissionError", "", "onError", "mediarecorder_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.recorder.a$c */
    public static final class C44803c implements AbstractC44774c {

        /* renamed from: a */
        final /* synthetic */ MediaRecorderFragment f113433a;

        @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44774c
        /* renamed from: b */
        public void mo158518b() {
            OnTakePhotoVideoListener a = this.f113433a.mo158578a();
            if (a != null) {
                a.mo158579a();
            }
        }

        @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44774c
        /* renamed from: a */
        public void mo158517a() {
            Log.m165389i("MediaRecorderFragment", "camera error");
            OnTakePhotoVideoListener a = this.f113433a.mo158578a();
            if (a != null) {
                a.mo158580a(103);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44803c(MediaRecorderFragment aVar) {
            this.f113433a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.recorder.a$e */
    public static final class C44805e implements AbstractC44773b {

        /* renamed from: a */
        final /* synthetic */ MediaRecorderFragment f113435a;

        C44805e(MediaRecorderFragment aVar) {
            this.f113435a = aVar;
        }

        @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44773b
        /* renamed from: a */
        public final void mo158516a() {
            OnTakePhotoVideoListener a = this.f113435a.mo158578a();
            if (a != null) {
                a.mo158583b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.recorder.a$f */
    public static final class C44806f implements AbstractC44773b {

        /* renamed from: a */
        final /* synthetic */ MediaRecorderFragment f113436a;

        C44806f(MediaRecorderFragment aVar) {
            this.f113436a = aVar;
        }

        @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44773b
        /* renamed from: a */
        public final void mo158516a() {
            JCameraView jCameraView = this.f113436a.f113426c;
            if (jCameraView != null) {
                jCameraView.mo158620e();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/mediarecorder/recorder/MediaRecorderFragment$initListeners$1", "Lcom/ss/android/lark/mediarecorder/recorder/MediaRecorderFragment$OnTakePhotoVideoListener;", "onCloseClick", "", "onNeedAudioPermission", "onTakePhoto", "url", "", "onTakePhotoVideoError", "num", "", "onTakeVideo", "firstFrameUrl", "mediarecorder_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.recorder.a$g */
    public static final class C44807g implements OnTakePhotoVideoListener {

        /* renamed from: a */
        final /* synthetic */ MediaRecorderFragment f113437a;

        @Override // com.ss.android.lark.mediarecorder.recorder.MediaRecorderFragment.OnTakePhotoVideoListener
        /* renamed from: a */
        public void mo158579a() {
        }

        @Override // com.ss.android.lark.mediarecorder.recorder.MediaRecorderFragment.OnTakePhotoVideoListener
        /* renamed from: a */
        public void mo158580a(int i) {
        }

        @Override // com.ss.android.lark.mediarecorder.recorder.MediaRecorderFragment.OnTakePhotoVideoListener
        /* renamed from: b */
        public void mo158583b() {
            this.f113437a.setResult(0);
            this.f113437a.finish();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 13})
        /* renamed from: com.ss.android.lark.mediarecorder.recorder.a$g$b */
        static final class RunnableC44809b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44807g f113440a;

            /* renamed from: b */
            final /* synthetic */ String f113441b;

            RunnableC44809b(C44807g gVar, String str) {
                this.f113440a = gVar;
                this.f113441b = str;
            }

            public final void run() {
                final Media a = C44793f.m177632a(MediaRecorderFragment.m177669a(this.f113440a.f113437a), this.f113441b);
                if (a != null) {
                    MediaRecorderFragment.m177669a(this.f113440a.f113437a).runOnUiThread(new Runnable(this) {
                        /* class com.ss.android.lark.mediarecorder.recorder.MediaRecorderFragment.C44807g.RunnableC44809b.RunnableC448101 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC44809b f113442a;

                        {
                            this.f113442a = r1;
                        }

                        public final void run() {
                            Intent intent = new Intent();
                            Media media = a;
                            if (media != null) {
                                intent.putExtra("TOKEN_MEDIA", (Parcelable) media);
                                intent.putExtra("PICKED_VIDEO", true);
                                this.f113442a.f113440a.f113437a.setResult(-1, intent);
                                this.f113442a.f113440a.f113437a.finish();
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.os.Parcelable");
                        }
                    });
                    return;
                }
                C44796g.m177636b("cannot get media info, path: " + this.f113441b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 13})
        /* renamed from: com.ss.android.lark.mediarecorder.recorder.a$g$a */
        static final class RunnableC44808a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44807g f113438a;

            /* renamed from: b */
            final /* synthetic */ String f113439b;

            RunnableC44808a(C44807g gVar, String str) {
                this.f113438a = gVar;
                this.f113439b = str;
            }

            public final void run() {
                try {
                    Intent intent = new Intent();
                    Media media = new Media();
                    String str = this.f113439b;
                    if (str == null) {
                        str = "";
                    }
                    media.setPath(str);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(media.getPath(), options);
                    media.setWidth(options.outWidth);
                    media.setHeight(options.outHeight);
                    intent.putExtra("TOKEN_MEDIA", (Parcelable) media);
                    this.f113438a.f113437a.setResult(-1, intent);
                } catch (Exception e) {
                    C44796g.m177635a("onTakePhoto" + e);
                }
                this.f113438a.f113437a.finish();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44807g(MediaRecorderFragment aVar) {
            this.f113437a = aVar;
        }

        @Override // com.ss.android.lark.mediarecorder.recorder.MediaRecorderFragment.OnTakePhotoVideoListener
        /* renamed from: a */
        public void mo158581a(String str) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new RunnableC44808a(this, str));
        }

        @Override // com.ss.android.lark.mediarecorder.recorder.MediaRecorderFragment.OnTakePhotoVideoListener
        /* renamed from: a */
        public void mo158582a(String str, String str2) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new RunnableC44809b(this, str));
        }
    }

    /* renamed from: e */
    private final void m177675e() {
        this.f113431i = new C44807g(this);
    }

    /* renamed from: f */
    private final void m177676f() {
        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(m177677g(), 4560);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        JCameraView jCameraView = this.f113426c;
        if (jCameraView != null) {
            jCameraView.mo158619d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        JCameraView jCameraView = this.f113426c;
        if (jCameraView != null) {
            jCameraView.mo158618c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        JCameraView jCameraView = this.f113426c;
        if (jCameraView != null) {
            jCameraView.mo158615b();
        }
    }

    /* renamed from: c */
    private final ViewGroup m177673c() {
        if (this.f113430h == null) {
            FragmentActivity fragmentActivity = this.f113424a;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            View inflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.recorder_fragment_camera_view_layout, (ViewGroup) null);
            if (inflate != null) {
                this.f113430h = (ViewGroup) inflate;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        ViewGroup viewGroup = this.f113430h;
        if (viewGroup != null) {
            return viewGroup;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: g */
    private final String[] m177677g() {
        MediaRecorderConfig mediaRecorderConfig = this.f113427e;
        if (mediaRecorderConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        }
        if (mediaRecorderConfig.f113391e != 1) {
            return new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.RECORD_AUDIO"};
        }
        MediaRecorderConfig mediaRecorderConfig2 = this.f113427e;
        if (mediaRecorderConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        }
        if (mediaRecorderConfig2.f113392f) {
            return new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        return new String[]{"android.permission.CAMERA"};
    }

    /* renamed from: h */
    private final boolean m177678h() {
        MediaRecorderConfig mediaRecorderConfig = this.f113427e;
        if (mediaRecorderConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        }
        if (mediaRecorderConfig.f113391e == 1) {
            MediaRecorderConfig mediaRecorderConfig2 = this.f113427e;
            if (mediaRecorderConfig2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("config");
            }
            if (!mediaRecorderConfig2.f113392f) {
                return m177671a("android.permission.CAMERA");
            }
            if (!m177671a("android.permission.CAMERA") || !m177671a("android.permission.READ_EXTERNAL_STORAGE") || !m177671a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                return false;
            }
        } else if (!m177671a("android.permission.CAMERA") || !m177671a("android.permission.READ_EXTERNAL_STORAGE") || !m177671a("android.permission.WRITE_EXTERNAL_STORAGE") || !m177671a("android.permission.RECORD_AUDIO")) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private final void m177679i() {
        MediaRecorderConfig mediaRecorderConfig = this.f113427e;
        if (mediaRecorderConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        }
        if (mediaRecorderConfig.f113391e == 1) {
            MediaRecorderConfig mediaRecorderConfig2 = this.f113427e;
            if (mediaRecorderConfig2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("config");
            }
            if (!mediaRecorderConfig2.f113392f) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                FragmentActivity fragmentActivity = this.f113424a;
                if (fragmentActivity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                }
                if (intent.resolveActivity(fragmentActivity.getPackageManager()) != null) {
                    File j = m177680j();
                    FragmentActivity fragmentActivity2 = this.f113424a;
                    if (fragmentActivity2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                    }
                    FragmentActivity fragmentActivity3 = fragmentActivity2;
                    StringBuilder sb = new StringBuilder();
                    FragmentActivity fragmentActivity4 = this.f113424a;
                    if (fragmentActivity4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                    }
                    sb.append(fragmentActivity4.getPackageName());
                    sb.append(".recorder.provider");
                    Uri uriForFile = FileProvider.getUriForFile(fragmentActivity3, sb.toString(), j);
                    if (uriForFile != null) {
                        MediaRecorderConfig mediaRecorderConfig3 = this.f113427e;
                        if (mediaRecorderConfig3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("config");
                        }
                        m177670a(intent, mediaRecorderConfig3.f113389c);
                        intent.putExtra("output", uriForFile);
                    }
                    startActivityForResult(intent, 34561);
                    return;
                }
            }
        }
        m177674d();
    }

    /* renamed from: j */
    private final File m177680j() {
        String str = "JPEG_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH).format(new Date()) + ".jpg";
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
            C44796g.m177635a("cannot make dirs");
        }
        File file = new File(externalStoragePublicDirectory, str);
        this.f113432j = file.getAbsolutePath();
        return file;
    }

    /* renamed from: b */
    private final boolean m177672b() {
        MediaRecorderConfig mediaRecorderConfig;
        int i;
        Bundle arguments = getArguments();
        if (arguments != null) {
            mediaRecorderConfig = (MediaRecorderConfig) arguments.getParcelable("MEDIA_TAKE_CONFIG");
        } else {
            mediaRecorderConfig = null;
        }
        if (mediaRecorderConfig == null) {
            return false;
        }
        this.f113427e = mediaRecorderConfig;
        if (mediaRecorderConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        }
        this.f113425b = mediaRecorderConfig.f113388b;
        MediaRecorderConfig mediaRecorderConfig2 = this.f113427e;
        if (mediaRecorderConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        }
        this.f113429g = mediaRecorderConfig2.f113387a;
        if (TextUtils.isEmpty(this.f113425b)) {
            this.f113425b = C44799h.m177647a(getContext()) + "photo" + File.separator;
        }
        if (TextUtils.isEmpty(this.f113429g)) {
            this.f113429g = C44799h.m177647a(getContext()) + "video" + File.separator;
        }
        MediaRecorderConfig mediaRecorderConfig3 = this.f113427e;
        if (mediaRecorderConfig3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        }
        if (mediaRecorderConfig3.f113391e == 1) {
            i = 257;
        } else {
            i = 259;
        }
        this.f113428f = i;
        return true;
    }

    /* renamed from: d */
    private final void m177674d() {
        JCameraView jCameraView;
        int i;
        this.f113430h = m177673c();
        FragmentActivity fragmentActivity = this.f113424a;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        LayoutInflater.from(fragmentActivity).inflate(R.layout.recorder_camera_view_layout, this.f113430h, true);
        ViewGroup viewGroup = this.f113430h;
        if (viewGroup != null) {
            jCameraView = (JCameraView) viewGroup.findViewById(R.id.jcameraview);
        } else {
            jCameraView = null;
        }
        this.f113426c = jCameraView;
        if (jCameraView != null) {
            jCameraView.mo158615b();
        }
        m177675e();
        JCameraView jCameraView2 = this.f113426c;
        if (jCameraView2 != null) {
            jCameraView2.setSavePhotoPath(this.f113425b);
        }
        JCameraView jCameraView3 = this.f113426c;
        if (jCameraView3 != null) {
            jCameraView3.setSaveVideoPath(this.f113429g);
        }
        JCameraView jCameraView4 = this.f113426c;
        if (jCameraView4 != null) {
            Integer num = this.f113428f;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 259;
            }
            jCameraView4.setFeatures(i);
        }
        Integer num2 = this.f113428f;
        if (num2 != null && num2.intValue() == 259) {
            JCameraView jCameraView5 = this.f113426c;
            if (jCameraView5 != null) {
                FragmentActivity fragmentActivity2 = this.f113424a;
                if (fragmentActivity2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                }
                jCameraView5.setTip(fragmentActivity2.getResources().getString(R.string.Lark_Legacy_CameraRecordTip));
            }
        } else {
            JCameraView jCameraView6 = this.f113426c;
            if (jCameraView6 != null) {
                jCameraView6.setTip("");
            }
        }
        JCameraView jCameraView7 = this.f113426c;
        if (jCameraView7 != null) {
            jCameraView7.setMediaQuality(1600000);
        }
        JCameraView jCameraView8 = this.f113426c;
        if (jCameraView8 != null) {
            jCameraView8.setErrorLisenter(new C44803c(this));
        }
        JCameraView jCameraView9 = this.f113426c;
        if (jCameraView9 != null) {
            jCameraView9.setJCameraLisenter(new C44804d(this));
        }
        JCameraView jCameraView10 = this.f113426c;
        if (jCameraView10 != null) {
            jCameraView10.setLeftClickListener(new C44805e(this));
        }
        JCameraView jCameraView11 = this.f113426c;
        if (jCameraView11 != null) {
            jCameraView11.setRightClickListener(new C44806f(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mediarecorder/recorder/MediaRecorderFragment$initCameraView$2", "Lcom/ss/android/lark/mediarecorder/listener/JCameraListener;", "captureSuccess", "", "bitmap", "Landroid/graphics/Bitmap;", "recordSuccess", "url", "", "firstFrame", "mediarecorder_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.recorder.a$d */
    public static final class C44804d implements AbstractC44775d {

        /* renamed from: a */
        final /* synthetic */ MediaRecorderFragment f113434a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44804d(MediaRecorderFragment aVar) {
            this.f113434a = aVar;
        }

        @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44775d
        /* renamed from: a */
        public void mo158519a(Bitmap bitmap) {
            String a = C44792e.m177628a(bitmap, this.f113434a.f113425b + "photo_" + System.currentTimeMillis() + ".jpg");
            C44792e.m177629a(MediaRecorderFragment.m177669a(this.f113434a), a);
            StringBuilder sb = new StringBuilder();
            sb.append("take photo url = ");
            sb.append(a);
            Log.m165389i("MediaRecorderFragment", sb.toString());
            OnTakePhotoVideoListener a2 = this.f113434a.mo158578a();
            if (a2 != null) {
                a2.mo158581a(a);
            }
        }

        @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44775d
        /* renamed from: a */
        public void mo158520a(String str, Bitmap bitmap) {
            Log.m165389i("MediaRecorderFragment", "take video url = " + str);
            C44792e.m177629a(MediaRecorderFragment.m177669a(this.f113434a), str);
            OnTakePhotoVideoListener a = this.f113434a.mo158578a();
            if (a != null) {
                a.mo158582a(str, null);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FragmentActivity m177669a(MediaRecorderFragment aVar) {
        FragmentActivity fragmentActivity = aVar.f113424a;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        return fragmentActivity;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (Build.VERSION.SDK_INT < 23) {
            m177679i();
        }
    }

    /* renamed from: a */
    private final boolean m177671a(String str) {
        FragmentActivity fragmentActivity = this.f113424a;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        if (ContextCompat.checkSelfPermission(fragmentActivity, str) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null || !m177672b()) {
            setResult(0);
            finish();
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f113424a = activity;
            m177676f();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    private final void m177670a(Intent intent, boolean z) {
        if (z) {
            intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return m177673c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = this.f113432j;
        if (i2 != -1 || str == null) {
            setResult(0);
            finish();
            return;
        }
        FragmentActivity fragmentActivity = this.f113424a;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        C44792e.m177629a(fragmentActivity, str);
        Intent intent2 = new Intent();
        Media media = new Media();
        media.setPath(str);
        intent2.putExtra("TOKEN_MEDIA", (Parcelable) media);
        intent2.putExtra("PICKED_VIDEO", false);
        setResult(-1, intent2);
        finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(strArr, "permissions");
        Intrinsics.checkParameterIsNotNull(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 4560) {
            boolean z2 = false;
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = !z;
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = z3;
                    break;
                } else if (iArr[i2] != 0) {
                    C44796g.m177637c("permission is not granted!");
                    Intent intent = new Intent();
                    intent.putExtra("RECORDER_PERMISSION", DynamicModule.f58006b);
                    setResult(0, intent);
                    finish();
                    break;
                } else {
                    i2++;
                }
            }
            if (z2 && m177678h()) {
                m177679i();
            }
        }
    }
}
