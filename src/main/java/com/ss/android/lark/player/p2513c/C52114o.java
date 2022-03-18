package com.ss.android.lark.player.p2513c;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.entity.C52129a;
import com.ss.android.lark.player.entity.DataSource;
import com.ss.android.lark.player.entity.VideoPlayerConfig;
import com.ss.android.lark.player.player.config.BaseConfigStrategy;
import com.ss.android.lark.player.player.config.LocalConfigStrategy;
import com.ss.android.lark.player.player.config.RemoteConfigStrategy;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineInfoListener;
import com.ss.ttvideoengine.VideoEngineListener;
import com.ss.ttvideoengine.log.VideoEventManager;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.player.c.o */
public class C52114o extends AbstractC52102a {

    /* renamed from: g */
    private static boolean f129295g = true;

    /* renamed from: p */
    private static IPlayerDependency f129296p;

    /* renamed from: q */
    private static BaseConfigStrategy f129297q;

    /* renamed from: b */
    public int f129298b;

    /* renamed from: c */
    public int f129299c;

    /* renamed from: d */
    public int f129300d;

    /* renamed from: e */
    private final Context f129301e;

    /* renamed from: f */
    private TTVideoEngine f129302f;

    /* renamed from: h */
    private boolean f129303h = true;

    /* renamed from: i */
    private final LarkDataLoaderListener f129304i = new LarkDataLoaderListener();

    /* renamed from: j */
    private final LarkTTVideoEngineLogListener f129305j = new LarkTTVideoEngineLogListener();

    /* renamed from: k */
    private final LarkVideoEventListener f129306k = new LarkVideoEventListener();

    /* renamed from: l */
    private final LarkSeekCompletionListener f129307l = new LarkSeekCompletionListener(this);

    /* renamed from: m */
    private final LarkVideoEngineCallback f129308m = new LarkVideoEngineCallback(this);

    /* renamed from: n */
    private DataSource f129309n;

    /* renamed from: o */
    private String f129310o = "";

    /* renamed from: l */
    public DataSource mo178520l() {
        return this.f129309n;
    }

    /* renamed from: m */
    public String mo178521m() {
        return this.f129310o;
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178495a(boolean z) {
        if (m202153v()) {
            this.f129302f.setIsMute(z);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178493a(VideoEngineInfoListener videoEngineInfoListener) {
        if (m202153v()) {
            this.f129302f.setVideoEngineInfoListener(videoEngineInfoListener);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178494a(String str) {
        if (m202153v()) {
            this.f129302f.setVideoID(str);
        }
    }

    /* renamed from: r */
    private static void m202149r() {
        f129297q.mo178484a();
    }

    /* renamed from: v */
    private boolean m202153v() {
        if (this.f129302f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private void m202147p() {
        m202148q();
        m202149r();
        m202150s();
        m202151t();
    }

    /* renamed from: w */
    private void m202154w() {
        if (m202153v()) {
            this.f129302f.setListener(null);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: j */
    public boolean mo178506j() {
        if (m202153v()) {
            return this.f129302f.isSystemPlayer();
        }
        return true;
    }

    /* renamed from: u */
    private void m202152u() {
        if (C26284k.m95185a(this.f129301e)) {
            TTVideoEngineLog.turnOn(1, 1);
        } else {
            TTVideoEngineLog.setListener(this.f129305j);
        }
        if (LarkPlayerUtils.m202131a()) {
            this.f129302f.setIntOption(472, 1);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: c */
    public boolean mo178499c() {
        if (!m202153v() || mo178481b() == -1 || this.f129302f.getPlaybackState() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: f */
    public void mo178502f() {
        try {
            if (m202153v()) {
                this.f129302f.pause();
                mo178475a(4);
                mo178476a(-99005, (Bundle) null);
            }
        } catch (Exception e) {
            m202145a(e);
        }
        this.f129298b = 4;
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: i */
    public void mo178505i() {
        if (m202153v()) {
            mo178475a(-2);
            m202154w();
            this.f129302f.release();
            mo178476a(-99009, (Bundle) null);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: k */
    public boolean mo178507k() {
        if (!m202153v() || this.f129302f.getIntOption(43) != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public void mo178523o() {
        if (m202153v()) {
            mo178475a(0);
            mo178476a(-99008, (Bundle) null);
        }
        this.f129298b = 0;
    }

    /* renamed from: s */
    private void m202150s() {
        try {
            f129297q.mo178485b();
            TTVideoEngine.setDataLoaderListener(this.f129304i);
            TTVideoEngine.startDataLoader(this.f129301e);
        } catch (Exception e) {
            Log.m165383e("TTEnginePlayer", "start data load error: " + e.getMessage());
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: d */
    public int mo178500d() {
        if (!m202153v()) {
            return 0;
        }
        if (mo178481b() == 2 || mo178481b() == 3 || mo178481b() == 4 || mo178481b() == 6) {
            return this.f129302f.getCurrentPlaybackTime();
        }
        return 0;
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: e */
    public int mo178501e() {
        if (!m202153v() || mo178481b() == -1 || mo178481b() == 1 || mo178481b() == 0) {
            return 0;
        }
        return this.f129302f.getDuration();
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: g */
    public void mo178503g() {
        try {
            if (m202153v() && (mo178481b() == 4 || mo178481b() == 1 || mo178481b() == 2)) {
                this.f129302f.play();
                mo178475a(3);
                mo178476a(-99006, (Bundle) null);
            }
        } catch (Exception e) {
            m202145a(e);
        }
        this.f129298b = 3;
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: h */
    public void mo178504h() {
        if (m202153v() && (mo178481b() == 2 || mo178481b() == 3 || mo178481b() == 4 || mo178481b() == 6)) {
            this.f129302f.stop();
            mo178475a(5);
            mo178476a(-99007, (Bundle) null);
        }
        this.f129298b = 5;
    }

    /* renamed from: n */
    public void mo178522n() {
        try {
            if (m202153v() && (mo178481b() == 2 || mo178481b() == 4 || mo178481b() == 1 || mo178481b() == 6)) {
                this.f129302f.play();
                mo178475a(3);
                mo178476a(-99004, (Bundle) null);
            }
        } catch (Exception e) {
            m202145a(e);
        }
        this.f129298b = 3;
    }

    /* renamed from: q */
    private void m202148q() {
        if (f129297q == null) {
            String string = SettingManager.getInstance().getString(VideoPlayerConfig.class);
            if (!TextUtils.isEmpty(string)) {
                try {
                    f129297q = new RemoteConfigStrategy(new JSONObject(string));
                    Log.m165389i("TTEnginePlayer", "use remote config strategy: " + string);
                    return;
                } catch (JSONException e) {
                    Log.m165383e("TTEnginePlayer", e.getMessage());
                }
            }
            f129297q = new LocalConfigStrategy();
            Log.m165389i("TTEnginePlayer", "use local config strategy");
        }
    }

    /* renamed from: t */
    private void m202151t() {
        if (this.f129302f == null) {
            this.f129302f = f129297q.mo178486c();
            m202152u();
            this.f129302f.setTag("IM");
            IPlayerDependency cVar = f129296p;
            if (cVar != null) {
                this.f129302f.setSubTag(cVar.mo103201a());
            }
            if (LarkPlayerUtils.m202132b()) {
                Log.m165389i("TTEnginePlayer", "needUsePreloadForBadAV");
                this.f129302f.setVideoEngineCallback(this.f129308m);
            }
            VideoEventManager.instance.setLoggerVersion(2);
            VideoEventManager.instance.setListener(this.f129306k);
        }
    }

    /* renamed from: a */
    public static void m202143a(IPlayerDependency cVar) {
        f129296p = cVar;
    }

    /* renamed from: c */
    public static void m202146c(boolean z) {
        f129295g = z;
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: b */
    public void mo178497b(boolean z) {
        this.f129303h = z;
    }

    /* renamed from: com.ss.android.lark.player.c.o$a */
    private class C52116a implements VideoEngineListener {
        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onVideoStatusException(int i) {
        }

        private C52116a() {
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onRenderStart(TTVideoEngine tTVideoEngine) {
            C52114o.this.mo178519d(0);
            C52114o.this.mo178476a(-99015, (Bundle) null);
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onPrepare(TTVideoEngine tTVideoEngine) {
            Log.m165389i("TTEnginePlayer", "onPrepare");
            C52114o.this.mo178476a(-99053, (Bundle) null);
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onCompletion(TTVideoEngine tTVideoEngine) {
            C52114o.this.mo178475a(6);
            C52114o.this.f129298b = 6;
            Bundle a = C52129a.m202238a();
            a.putInt("int_arg1", C52114o.this.mo178501e());
            C52114o.this.mo178476a(-99016, a);
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onError(Error error) {
            int i;
            Log.m165389i("TTEnginePlayer", "Error: " + error);
            C52114o.this.mo178475a(-1);
            C52114o.this.f129298b = -1;
            int i2 = error.code;
            if (i2 == -499896) {
                i = -88015;
            } else if (i2 != -499894) {
                i = -88011;
            } else {
                i = -88019;
            }
            Bundle a = C52129a.m202238a();
            a.putInt("int_arg1", error.code);
            a.putString("string_data", error.description);
            C52114o.this.mo178482b(i, a);
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onPrepared(TTVideoEngine tTVideoEngine) {
            Log.m165389i("TTEnginePlayer", "onPrepared...");
            C52114o.this.mo178475a(2);
            C52114o.this.f129299c = tTVideoEngine.getVideoWidth();
            C52114o.this.f129300d = tTVideoEngine.getVideoHeight();
            Bundle a = C52129a.m202238a();
            a.putInt("int_arg1", C52114o.this.f129299c);
            a.putInt("int_arg2", C52114o.this.f129300d);
            a.putInt("int_arg3", C52114o.this.mo178501e());
            a.putInt("int_arg4", C52114o.this.mo178500d());
            C52114o.this.mo178476a(-99018, a);
            Log.m165389i("TTEnginePlayer", "mTargetState = " + C52114o.this.f129298b);
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
            C52114o.this.mo178483c(i, null);
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
            if (i == 1) {
                C52114o.this.mo178475a(3);
            } else if (i == 2) {
                C52114o.this.mo178475a(4);
            }
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
            if (i == 1) {
                C52114o.this.mo178476a(-99011, C52129a.m202238a());
            } else if (i == 2) {
                C52114o.this.mo178476a(-99010, C52129a.m202238a());
            }
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
            if (C52114o.this.f129271a != null) {
                C52114o.this.f129271a.onVideoSizeChanged((float) i, (float) i2);
            }
            C52114o.this.f129299c = i;
            C52114o.this.f129300d = i2;
            Bundle a = C52129a.m202238a();
            a.putInt("int_arg1", C52114o.this.f129299c);
            a.putInt("int_arg2", C52114o.this.f129300d);
            C52114o.this.mo178476a(-99017, a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2513c.AbstractC52102a
    /* renamed from: a */
    public void mo178475a(int i) {
        super.mo178475a(i);
        this.f129308m.mo178510a(i);
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: b */
    public void mo178496b(int i) {
        if (m202153v()) {
            if (i > 0) {
                mo178519d(i);
            }
            mo178522n();
        }
    }

    /* renamed from: d */
    public void mo178519d(int i) {
        if (m202153v()) {
            this.f129302f.setStartTime(i);
        }
    }

    /* renamed from: a */
    private void m202145a(Exception exc) {
        if (exc != null) {
            Log.m165383e("TTEnginePlayer", "exception in player:" + exc);
        }
        mo178523o();
    }

    C52114o(Context context) {
        this.f129301e = context.getApplicationContext();
        m202147p();
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178488a(float f) {
        if (m202153v()) {
            PlaybackParams playbackParams = new PlaybackParams();
            playbackParams.setSpeed(f);
            this.f129302f.setPlaybackParams(playbackParams);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: c */
    public void mo178498c(int i) {
        if (!m202153v()) {
            return;
        }
        if (mo178481b() == 2 || mo178481b() == 3 || mo178481b() == 4 || mo178481b() == 6) {
            this.f129302f.seekTo(i, this.f129307l);
            Bundle a = C52129a.m202238a();
            a.putInt("int_data", i);
            mo178476a(-99013, a);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178489a(Surface surface) {
        try {
            if (m202153v()) {
                this.f129302f.setSurface(surface);
                mo178476a(-99002, (Bundle) null);
            }
        } catch (Exception e) {
            m202145a(e);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178490a(SurfaceHolder surfaceHolder) {
        try {
            if (m202153v()) {
                this.f129302f.setSurfaceHolder(surfaceHolder);
                mo178476a(-99002, (Bundle) null);
            }
        } catch (Exception e) {
            m202145a(e);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178491a(DataSource dataSource) {
        try {
            if (!m202153v()) {
                m202147p();
            } else {
                mo178504h();
                mo178523o();
                m202154w();
            }
            this.f129302f.setListener(new C52116a());
            mo178475a(1);
            String data = dataSource.getData();
            Uri uri = dataSource.getUri();
            FileDescriptor fileDescriptor = dataSource.getFileDescriptor();
            if (data != null) {
                m202144a(dataSource, data);
            } else if (uri != null) {
                m202144a(dataSource, uri.toString());
            } else if (fileDescriptor != null) {
                this.f129302f.setDataSource(fileDescriptor, (long) dataSource.getStartPos(), 0);
            }
            Bundle a = C52129a.m202238a();
            a.putSerializable("serializable_data", dataSource);
            mo178476a(-99001, a);
        } catch (Exception e) {
            e.printStackTrace();
            mo178475a(-1);
            this.f129298b = -1;
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178492a(com.ss.ttvideoengine.DataSource dataSource) {
        if (m202153v()) {
            this.f129302f.setDataSource(dataSource);
        }
    }

    /* renamed from: a */
    private void m202144a(DataSource dataSource, String str) {
        this.f129309n = dataSource;
        this.f129310o = str;
        if (str.startsWith("http")) {
            if (!f129295g || !this.f129303h) {
                this.f129302f.setDirectURL(str);
            } else {
                TTVideoEngine tTVideoEngine = this.f129302f;
                tTVideoEngine.setDirectUrlUseDataLoader(str, str.hashCode() + "");
            }
            HashMap<String, String> extra = dataSource.getExtra();
            if (extra != null) {
                for (Map.Entry<String, String> entry : extra.entrySet()) {
                    this.f129302f.setCustomHeader(entry.getKey(), entry.getValue());
                }
                return;
            }
            return;
        }
        this.f129302f.setLocalURL(str);
    }
}
