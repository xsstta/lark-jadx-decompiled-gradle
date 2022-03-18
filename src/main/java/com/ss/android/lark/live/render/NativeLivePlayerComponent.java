package com.ss.android.lark.live.render;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.component.AbstractNativeComponent;
import com.bytedance.ee.lark.component.p607a.C12717a;
import com.ss.android.lark.inno.network.model.C38941b;
import com.ss.android.lark.inno.network.model.LiveStreamInfoData;
import com.ss.android.lark.inno.player.live.TTLiveStreamData;
import com.ss.android.lark.inno.player.live.p1997b.C39064b;
import com.ss.android.lark.mm.p2288b.C45855f;

public class NativeLivePlayerComponent extends AbstractNativeComponent {
    private boolean isInit;
    private C41521a mLivePlayerAdapter;
    private ViewGroup mView;

    public String getComponentViewType() {
        C45855f.m181663b("NativeLivePlayerComponent@", "getComponentViewType");
        return "vc_live_video";
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void onRemove() {
        C45855f.m181663b("NativeLivePlayerComponent@", "onRemove");
        release();
    }

    private void release() {
        if (!(this.mView == null || getContainer() == null)) {
            getContainer().removeView(this.mView);
            this.mView.removeAllViews();
        }
        this.mView = null;
        C41521a aVar = this.mLivePlayerAdapter;
        if (aVar != null) {
            aVar.mo142904d();
            this.mLivePlayerAdapter = null;
        }
    }

    private void init(Context context) {
        release();
        C41521a aVar = new C41521a(context);
        this.mLivePlayerAdapter = aVar;
        aVar.mo142781a().mo142746a(this.mView);
    }

    private void handleStreamInfo(LiveStreamInfoData liveStreamInfoData) {
        C38941b a = C38941b.m153662a(liveStreamInfoData);
        TTLiveStreamData liveStreamData = TTLiveStreamData.toLiveStreamData(a.mo142538a());
        C45855f.m181663b("NativeLivePlayerComponent@", "onResp LiveStreamData " + JSON.toJSONString(liveStreamData));
        new Handler(Looper.getMainLooper()).post(new Runnable(liveStreamData, a) {
            /* class com.ss.android.lark.live.render.$$Lambda$NativeLivePlayerComponent$D4YcfhiXxDPV9mr406xJQC78qHs */
            public final /* synthetic */ TTLiveStreamData f$1;
            public final /* synthetic */ C38941b f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                NativeLivePlayerComponent.this.lambda$handleStreamInfo$0$NativeLivePlayerComponent(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void performAction(String str, JSONObject jSONObject) {
        C45855f.m181663b("NativeLivePlayerComponent@", "performAction");
    }

    public /* synthetic */ void lambda$handleStreamInfo$0$NativeLivePlayerComponent(TTLiveStreamData tTLiveStreamData, C38941b bVar) {
        this.mLivePlayerAdapter.mo142901a(JSON.toJSONString(tTLiveStreamData));
        this.mLivePlayerAdapter.mo142900a(C39064b.m154174a(bVar));
        this.mLivePlayerAdapter.mo142903c();
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public View onCreateView(Context context, JSONObject jSONObject) {
        C45855f.m181663b("NativeLivePlayerComponent@", "onCreateView viewId " + getViewId());
        if (this.mView == null) {
            C41521a aVar = new C41521a(context);
            this.mLivePlayerAdapter = aVar;
            this.mView = aVar.mo142782b();
            this.mLivePlayerAdapter.mo142781a().mo142746a(getContainer());
        }
        return this.mView;
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void onUpdateView(View view, JSONObject jSONObject) {
        C45855f.m181663b("NativeLivePlayerComponent@", "onUpdateView ev " + jSONObject.get("event") + "\n" + jSONObject.toJSONString());
        LiveVideoComponentModel liveVideoComponentModel = LiveVideoComponentModel.toLiveVideoComponentModel(jSONObject);
        if (liveVideoComponentModel == null || liveVideoComponentModel.streamInfo == null) {
            C45855f.m181666e("NativeLivePlayerComponent@", "onUpdateView data " + jSONObject);
        } else {
            handleStreamInfo(liveVideoComponentModel.streamInfo);
        }
        String string = jSONObject.getString("event");
        if (TextUtils.isEmpty(string)) {
            if (("init".equals(string) || this.isInit) && "init".equals(string)) {
                init(view.getContext());
                this.isInit = true;
                this.mLivePlayerAdapter.mo142902b((String) ((JSONObject) jSONObject.getJSONArray("stream_data").get(0)).get("streamUrl"));
            }
        }
    }

    public NativeLivePlayerComponent(C12717a aVar, String str, String str2) {
        super(aVar, str, str2);
        C45855f.m181663b("NativeLivePlayerComponent@", "NativeLivePlayerComponent");
    }
}
