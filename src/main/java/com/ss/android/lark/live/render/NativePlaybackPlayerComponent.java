package com.ss.android.lark.live.render;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.component.AbstractNativeComponent;
import com.bytedance.ee.lark.component.p607a.C12717a;
import com.ss.android.lark.inno.network.model.LivePlaybackInfoData;
import com.ss.android.lark.inno.player.p1978c.C38950a;
import com.ss.android.lark.inno.player.p1978c.p1988c.C38992a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.Error;

public class NativePlaybackPlayerComponent extends AbstractNativeComponent {
    private C38950a mVideoListener;
    private C41522b mVideoPlayerAdapter;
    private ViewGroup mView;

    public String getComponentViewType() {
        C45855f.m181663b("NativePlaybackPlayerComponent", "getComponentViewType");
        return "vc_playback_video";
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void onRemove() {
        C45855f.m181663b("NativePlaybackPlayerComponent", "onRemove");
        destroyPlayerAdapter();
    }

    private void destroyPlayerAdapter() {
        if (this.mView != null) {
            this.mView = null;
            this.mVideoPlayerAdapter.mo142714b(this.mVideoListener);
            this.mVideoPlayerAdapter.mo142585c();
            this.mVideoPlayerAdapter = null;
        }
    }

    private void handlePlaybackInfo(LivePlaybackInfoData livePlaybackInfoData) {
        this.mVideoPlayerAdapter.mo142583a(livePlaybackInfoData);
        C38992a d = this.mVideoPlayerAdapter.mo142586d();
        if (d != null && !TextUtils.isEmpty(d.mo142684b())) {
            this.mVideoPlayerAdapter.mo142584a(d.mo142684b());
        }
    }

    private void initPlayerAdapter(Context context) {
        if (this.mView == null) {
            C41522b bVar = new C41522b(context);
            this.mVideoPlayerAdapter = bVar;
            this.mView = bVar.mo142713b();
            this.mVideoPlayerAdapter.mo142711a().mo142746a(getContainer());
            C415201 r2 = new C38950a() {
                /* class com.ss.android.lark.live.render.NativePlaybackPlayerComponent.C415201 */

                @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
                /* renamed from: a */
                public void mo142571a(TTVideoEngine tTVideoEngine) {
                }

                @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
                /* renamed from: a */
                public void mo142572a(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
                /* renamed from: a */
                public void mo142574a(Error error) {
                }

                @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
                /* renamed from: b */
                public void mo142577b(TTVideoEngine tTVideoEngine) {
                }

                @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
                /* renamed from: d */
                public void mo142581d(TTVideoEngine tTVideoEngine) {
                }
            };
            this.mVideoListener = r2;
            this.mVideoPlayerAdapter.mo142712a(r2);
        }
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public View onCreateView(Context context, JSONObject jSONObject) {
        C45855f.m181663b("NativePlaybackPlayerComponent", "onCreateView");
        initPlayerAdapter(context);
        return this.mView;
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void onUpdateView(View view, JSONObject jSONObject) {
        C45855f.m181663b("NativePlaybackPlayerComponent", "onUpdateView");
        LiveVideoComponentModel liveVideoComponentModel = LiveVideoComponentModel.toLiveVideoComponentModel(jSONObject);
        if (liveVideoComponentModel != null && liveVideoComponentModel.playbackInfo != null) {
            handlePlaybackInfo(liveVideoComponentModel.playbackInfo);
        }
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void performAction(String str, JSONObject jSONObject) {
        C45855f.m181663b("NativePlaybackPlayerComponent", "performAction " + str);
    }

    public NativePlaybackPlayerComponent(C12717a aVar, String str, String str2) {
        super(aVar, str, str2);
        C45855f.m181663b("NativePlaybackPlayerComponent", "NativeLivePlayerComponent");
    }
}
