package com.ss.android.lark.mediapicker.player;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mediapicker.base.BaseActivity;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class VideoPlayerActivity extends BaseActivity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, View.OnClickListener {

    /* renamed from: a */
    public VideoView f113288a;

    /* renamed from: b */
    private String f113289b = "";

    /* renamed from: c */
    private ImageView f113290c;

    /* renamed from: d */
    private MediaController f113291d;

    /* renamed from: e */
    private ImageView f113292e;

    /* renamed from: f */
    private int f113293f = -1;

    /* renamed from: a */
    public Context mo158387a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo158388a() {
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m177337a(this, context);
    }

    /* renamed from: b */
    public void mo158390b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo158391c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m177335a(this, configuration);
    }

    public AssetManager getAssets() {
        return m177339c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m177336a(this);
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m177338b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mediapicker.base.BaseActivity
    public void onDestroy() {
        this.f113291d = null;
        this.f113288a = null;
        this.f113292e = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        int i = this.f113293f;
        if (i >= 0) {
            this.f113288a.seekTo(i);
            this.f113293f = -1;
        }
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        this.f113288a.setVideoPath(this.f113289b);
        this.f113288a.start();
        super.onStart();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        this.f113293f = this.f113288a.getCurrentPosition();
        this.f113288a.stopPlayback();
        super.onPause();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        ImageView imageView = this.f113292e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            /* class com.ss.android.lark.mediapicker.player.VideoPlayerActivity.C447162 */

            public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                if (i != 3) {
                    return false;
                }
                VideoPlayerActivity.this.f113288a.setBackgroundColor(0);
                return true;
            }
        });
    }

    /* renamed from: a */
    public static Resources m177336a(VideoPlayerActivity videoPlayerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(videoPlayerActivity);
        }
        return videoPlayerActivity.mo158388a();
    }

    /* renamed from: c */
    public static AssetManager m177339c(VideoPlayerActivity videoPlayerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(videoPlayerActivity);
        }
        return videoPlayerActivity.mo158391c();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.picture_left_back) {
            finish();
        } else if (id == R.id.iv_play) {
            this.f113288a.start();
            this.f113292e.setVisibility(4);
        }
    }

    /* renamed from: b */
    public static void m177338b(VideoPlayerActivity videoPlayerActivity) {
        videoPlayerActivity.mo158390b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VideoPlayerActivity videoPlayerActivity2 = videoPlayerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    videoPlayerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mediapicker.base.BaseActivity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().addFlags(67108864);
        }
        super.onCreate(bundle);
        setContentView(R.layout.picker_activity_video_player);
        this.f113289b = getIntent().getStringExtra("video_path");
        this.f113290c = (ImageView) findViewById(R.id.picture_left_back);
        VideoView videoView = (VideoView) findViewById(R.id.video_view);
        this.f113288a = videoView;
        videoView.setBackgroundColor(-16777216);
        this.f113292e = (ImageView) findViewById(R.id.iv_play);
        this.f113291d = new MediaController(this);
        this.f113288a.setOnCompletionListener(this);
        this.f113288a.setOnPreparedListener(this);
        this.f113288a.setMediaController(this.f113291d);
        this.f113290c.setOnClickListener(this);
        this.f113292e.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo158389a(Context context) {
        super.attachBaseContext(new ContextWrapper(context) {
            /* class com.ss.android.lark.mediapicker.player.VideoPlayerActivity.C447151 */

            @Override // android.content.Context, android.content.ContextWrapper
            public Object getSystemService(String str) {
                if ("audio".equals(str)) {
                    return getApplicationContext().getSystemService(str);
                }
                return super.getSystemService(str);
            }
        });
    }

    /* renamed from: a */
    public static void m177337a(VideoPlayerActivity videoPlayerActivity, Context context) {
        videoPlayerActivity.mo158389a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(videoPlayerActivity);
        }
    }

    /* renamed from: a */
    public static Context m177335a(VideoPlayerActivity videoPlayerActivity, Configuration configuration) {
        Context a = videoPlayerActivity.mo158387a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
