package com.ss.android.lark.mediapicker.album.base;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.provider.MediaStore;
import android.view.View;
import androidx.core.app.ActivityCompat;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mediapicker.C44614a;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.album.C44620b;
import com.ss.android.lark.mediapicker.album.base.AbstractC44653g;
import com.ss.android.lark.mediapicker.base.BaseActivity;
import com.ss.android.lark.mediapicker.dependency.C44675a;
import com.ss.android.lark.mediapicker.dependency.C44677b;
import com.ss.android.lark.mediapicker.entity.EditInfo;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.p2241a.AbstractC44616b;
import com.ss.android.lark.mediapicker.preview.base.MediaPreviewActivity;
import com.ss.android.lark.mediapicker.utils.C44754j;
import com.ss.android.lark.mediapicker.utils.C44760o;
import com.ss.android.lark.mediapicker.utils.C44763p;
import com.ss.android.lark.mediarecorder.MediaRecorder;
import com.ss.android.lark.mediarecorder.MediaRecorderConfig;
import com.ss.android.lark.mediarecorder.entity.Media;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlbumGridActivity extends BaseActivity implements AbstractC44659i {

    /* renamed from: a */
    public C44627b f113099a;

    /* renamed from: b */
    public MediaPickerConfig f113100b;

    /* renamed from: c */
    Runnable f113101c = new Runnable() {
        /* class com.ss.android.lark.mediapicker.album.base.AlbumGridActivity.RunnableC446233 */

        public void run() {
            AlbumGridActivity.this.mo158144a();
        }
    };

    /* renamed from: d */
    private AbstractC44616b f113102d = new AbstractC44616b() {
        /* class com.ss.android.lark.mediapicker.album.base.AlbumGridActivity.C446211 */

        @Override // com.ss.android.lark.mediapicker.p2241a.AbstractC44616b
        /* renamed from: a */
        public void mo158124a(boolean z) {
            if (z) {
                if (AlbumGridActivity.this.f113099a != null) {
                    AlbumGridActivity.this.f113099a.mo158177a(AlbumGridActivity.this.getSupportLoaderManager(), AlbumGridActivity.this);
                }
                C44660j.m177158a().mo158242a(AlbumGridActivity.this);
                return;
            }
            C44677b.m177239b("have not permission!");
            AlbumGridActivity.this.finish();
        }
    };

    /* renamed from: e */
    private AbstractC44653g.AbstractC44655b.AbstractC44657b f113103e = new AbstractC44653g.AbstractC44655b.AbstractC44657b() {
        /* class com.ss.android.lark.mediapicker.album.base.AlbumGridActivity.C446222 */

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
        /* renamed from: a */
        public void mo158155a(MediaPickerConfig mediaPickerConfig, List<LocalMedia> list) {
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
        /* renamed from: d */
        public void mo158160d() {
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
        /* renamed from: b */
        public void mo158158b() {
            AlbumGridActivity.this.onBackPressed();
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
        /* renamed from: a */
        public View mo158154a() {
            return AlbumGridActivity.this.findViewById(R.id.root);
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
        /* renamed from: c */
        public void mo158159c() {
            try {
                MediaRecorderConfig.C44771a a = MediaRecorderConfig.m177530a();
                a.mo158506b(AlbumGridActivity.this.f113100b.f113091x).mo158502a(AlbumGridActivity.this.f113100b.f113090w).mo158507c(AlbumGridActivity.this.f113100b.f113089v).mo158503a(AlbumGridActivity.this.f113100b.f113092y).mo158508d(2346);
                AlbumGridActivity.this.startActivityForResult(MediaRecorder.f113397a.mo158509a(AlbumGridActivity.this, a.mo158504a()), 2346);
            } catch (Exception e) {
                C44677b.m177235a(e);
            }
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
        /* renamed from: a */
        public void mo158157a(List<LocalMedia> list, List<LocalMedia> list2, boolean z) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list);
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(list2);
            Intent intent = new Intent();
            if (!arrayList.isEmpty() && C44754j.m177502c(((LocalMedia) arrayList.get(0)).getMimeType())) {
                intent.putExtra("PICKED_VIDEO", true);
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            Iterator<? extends Parcelable> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((LocalMedia) it.next()).getPath());
            }
            intent.putStringArrayListExtra("PICKED_MEDIAS_URLS", arrayList3);
            intent.putParcelableArrayListExtra("PICKED_MEDIAS", arrayList);
            intent.putParcelableArrayListExtra("EDITED_MEDIAS", arrayList2);
            intent.putExtra("PICKED_ORIGIN", z);
            intent.putExtra("isSend", true);
            AlbumGridActivity.this.setResult(-1, intent);
            AlbumGridActivity.this.finish();
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44657b
        /* renamed from: a */
        public void mo158156a(List<LocalMedia> list, List<LocalMedia> list2, int i, boolean z, MediaPickerConfig mediaPickerConfig) {
            if (i < 0) {
                C44677b.m177236a("invalid position ");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("selectList", (Serializable) list2);
            bundle.putInt("position", i);
            bundle.putString("allListKey", "allList");
            C44760o.m177512a().mo158477a(AlbumGridActivity.this, "allList", list);
            bundle.putParcelable("mediaConfig", mediaPickerConfig);
            bundle.putBoolean("keepOrigin", z);
            bundle.putInt("position", i);
            bundle.putParcelable("logger", C44677b.m177232a());
            bundle.putParcelable("imageLoader", C44675a.m177225a());
            Intent intent = new Intent();
            intent.setClass(AlbumGridActivity.this, MediaPreviewActivity.class);
            intent.putExtras(bundle);
            AlbumGridActivity.this.startActivityForResult(intent, 2345);
            AlbumGridActivity.this.overridePendingTransition(R.anim.picker_in_from_right, R.anim.picker_out_to_left);
        }
    };

    /* renamed from: f */
    private ContentObserver f113104f = new ContentObserver(null) {
        /* class com.ss.android.lark.mediapicker.album.base.AlbumGridActivity.C446244 */

        public void onChange(boolean z) {
            C44763p.m177519b(AlbumGridActivity.this.f113101c);
            C44763p.m177518a(AlbumGridActivity.this.f113101c, 3000);
        }
    };

    /* renamed from: a */
    public Context mo158143a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo158145a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m176995a(this, context);
    }

    /* renamed from: b */
    public Resources mo158148b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo158149c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m176989a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo158151d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m176998c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m176990a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m176996b(this);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        m176999e();
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44659i
    /* renamed from: a */
    public void mo158147a(boolean z, List<LocalMedia> list) {
        C44627b bVar = this.f113099a;
        if (bVar != null) {
            bVar.mo158180a(z, list);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.picker_stay, R.anim.picker_out_to_bottom);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mediapicker.base.BaseActivity
    public void onDestroy() {
        super.onDestroy();
        getContentResolver().unregisterContentObserver(this.f113104f);
        this.f113099a.mo158185d();
        C44660j.m177158a().mo158245b(this);
    }

    /* renamed from: e */
    private void m176999e() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f113099a.mo158182b());
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(this.f113099a.mo158184c());
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("PICKED_MEDIAS", arrayList);
        intent.putParcelableArrayListExtra("EDITED_MEDIAS", arrayList2);
        intent.putExtra("isSend", false);
        intent.putExtra("PICKED_ORIGIN", this.f113099a.mo158187f());
        setResult(-1, intent);
        finish();
    }

    /* renamed from: a */
    public void mo158144a() {
        if (this.f113099a != null && this.f113100b != null && m176997b((Context) this)) {
            this.f113099a.mo158183b(getSupportLoaderManager(), this);
        }
    }

    /* renamed from: a */
    public static Resources m176990a(AlbumGridActivity albumGridActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(albumGridActivity);
        }
        return albumGridActivity.mo158148b();
    }

    /* renamed from: b */
    private boolean m176997b(Context context) {
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        for (int i = 0; i < 2; i++) {
            if (ActivityCompat.checkSelfPermission(context, strArr[i]) != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static AssetManager m176998c(AlbumGridActivity albumGridActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(albumGridActivity);
        }
        return albumGridActivity.mo158151d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mediapicker.base.BaseActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f113099a != null) {
            bundle.putParcelableArrayList("save_select_media", new ArrayList<>(this.f113099a.mo158182b()));
        }
    }

    /* renamed from: b */
    public static void m176996b(AlbumGridActivity albumGridActivity) {
        albumGridActivity.mo158149c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AlbumGridActivity albumGridActivity2 = albumGridActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    albumGridActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private AbstractC44653g.AbstractC44655b m176991a(MediaPickerConfig mediaPickerConfig) {
        if (AbstractC44653g.AbstractC44655b.class.isAssignableFrom(mediaPickerConfig.f113082o)) {
            try {
                return (AbstractC44653g.AbstractC44655b) mediaPickerConfig.f113082o.newInstance();
            } catch (Exception e) {
                C44677b.m177235a(e);
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mediapicker.base.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C44614a.m176967b(bundle);
        overridePendingTransition(R.anim.picker_in_from_bottom, R.anim.picker_stay);
        MediaPickerConfig mediaPickerConfig = (MediaPickerConfig) getIntent().getParcelableExtra("mediaConfig");
        this.f113100b = mediaPickerConfig;
        m176993a(mediaPickerConfig, bundle);
        if (this.f113099a == null) {
            C44677b.m177236a("failed to select page");
            finish();
            return;
        }
        m176994a(this.f113102d);
        getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f113104f);
        C44677b.m177240c("AlbumGridActivity current process: " + Process.myPid());
    }

    /* renamed from: a */
    private LocalMedia m176992a(Media media) {
        return new LocalMedia(media.getId(), media.getPath(), media.getMimeType(), media.getDuration(), media.getWidth(), media.getHeight(), media.getSize());
    }

    /* renamed from: a */
    private void m176994a(AbstractC44616b bVar) {
        if (ActivityCompat.checkSelfPermission(getApplication(), "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            bVar.mo158124a(true);
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 5438);
        }
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44659i
    /* renamed from: a */
    public void mo158146a(EditInfo editInfo) {
        C44627b bVar = this.f113099a;
        if (bVar != null) {
            bVar.mo158178a(editInfo);
        }
    }

    /* renamed from: a */
    public static void m176995a(AlbumGridActivity albumGridActivity, Context context) {
        albumGridActivity.mo158145a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(albumGridActivity);
        }
    }

    /* renamed from: a */
    public static Context m176989a(AlbumGridActivity albumGridActivity, Configuration configuration) {
        Context a = albumGridActivity.mo158143a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private void m176993a(MediaPickerConfig mediaPickerConfig, Bundle bundle) {
        AbstractC44653g.AbstractC44655b bVar;
        if (mediaPickerConfig.f113082o == null) {
            bVar = new C44620b();
        } else {
            bVar = m176991a(mediaPickerConfig);
        }
        if (bVar != null) {
            C44625a aVar = new C44625a();
            this.f113099a = new C44627b(bVar, aVar);
            bVar.mo158218a(this, this.f113103e, mediaPickerConfig);
            if (bundle == null) {
                aVar.mo158165a(mediaPickerConfig, mediaPickerConfig.f113066E);
            } else {
                aVar.mo158165a(mediaPickerConfig, bundle.getParcelableArrayList("save_select_media"));
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 5438) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            this.f113102d.mo158124a(false);
        } else {
            this.f113102d.mo158124a(true);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            try {
                if (this.f113099a == null) {
                    return;
                }
                if (i == 2346) {
                    this.f113099a.mo158179a(m176992a((Media) intent.getParcelableExtra("TOKEN_MEDIA")));
                } else if (intent.getBooleanExtra("isSend", false)) {
                    this.f113099a.mo158176a();
                } else {
                    this.f113099a.mo158180a(intent.getBooleanExtra("PICKED_ORIGIN", false), intent.getParcelableArrayListExtra("PICKED_MEDIAS"));
                }
            } catch (Exception e) {
                C44677b.m177235a(e);
            }
        }
    }
}
