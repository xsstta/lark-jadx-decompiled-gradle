package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.text.TextUtils;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.vc.irtc.C61064p;
import com.ss.android.vc.irtc.C61065q;
import com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer;
import com.ss.android.vc.irtc.impl.widget.IVideoSinkListener;
import com.ss.android.vc.irtc.impl.widget.utils.EnvUtils;
import com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils;
import com.ss.video.rtc.meeting.MeetingRtcEngine;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VideoSinkManager {
    private final String SINK_KEY_SPLIT = ":";
    private final String SINK_LOCAL_UID = "rtc_local_uid";
    private final String SINK_STREAM_SCREEN = "screen";
    private final String SINK_STREAM_VIDEO = "video";
    private final Set<String> mStreamSet = new HashSet();
    private final Map<String, BvVideoViewSink> mVideoSinkMap = new HashMap();
    private C61065q rtcConfig;
    private MeetingRtcEngine rtcEngine;

    public synchronized void clearLocalVideoSink() {
        clearVideoSink("rtc_local_uid", false);
    }

    public synchronized void reset() {
        if (EnvUtils.LOG_DEBUG) {
            C61064p.m237485a("VideoSinkManager", "[reset]size = " + this.mVideoSinkMap.size());
        }
        for (Map.Entry<String, BvVideoViewSink> entry : this.mVideoSinkMap.entrySet()) {
            List<AbsVideoViewRenderer> renderList = entry.getValue().getRenderList();
            C61064p.m237485a("VideoSinkManager", entry.getKey() + ", renderList = " + renderList.size());
            for (AbsVideoViewRenderer absVideoViewRenderer : renderList) {
                absVideoViewRenderer.setTag(R.id.rtc_video_stream_key, null);
                absVideoViewRenderer.release();
            }
            renderList.clear();
        }
        this.mStreamSet.clear();
        this.mVideoSinkMap.clear();
        this.rtcConfig = null;
    }

    public synchronized void config(C61065q qVar) {
        this.rtcConfig = qVar;
    }

    public synchronized void setRtcEngine(MeetingRtcEngine meetingRtcEngine) {
        this.rtcEngine = meetingRtcEngine;
    }

    private String[] parseKey(String str) {
        String[] split = str.split(":");
        if (split.length != 2 || TextUtils.isEmpty(split[0]) || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split;
    }

    public void setLocalRotation(int i) {
        BvVideoViewSink bvVideoViewSink = this.mVideoSinkMap.get(buildKey("rtc_local_uid", false));
        if (bvVideoViewSink != null) {
            bvVideoViewSink.setLocalRotation(i);
        }
    }

    public synchronized void unbindRenderView(AbsVideoViewRenderer absVideoViewRenderer) {
        String str;
        ThreadUtils.checkIsOnMainThreadSafely("[unbindRenderView]");
        if (absVideoViewRenderer.getTag(R.id.rtc_video_stream_key) != null) {
            str = (String) absVideoViewRenderer.getTag(R.id.rtc_video_stream_key);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            C61064p.m237487c("VideoSinkManager", "[unbindRenderView]Key is null, view = " + absVideoViewRenderer);
            return;
        }
        if (EnvUtils.LOG_DEBUG) {
            C61064p.m237485a("VideoSinkManager", "[unbindRenderView]key = " + str + ", view = " + absVideoViewRenderer);
        }
        BvVideoViewSink bvVideoViewSink = this.mVideoSinkMap.get(str);
        if (bvVideoViewSink != null) {
            bvVideoViewSink.remove(absVideoViewRenderer);
            absVideoViewRenderer.setTag(R.id.rtc_video_stream_key, null);
            if (EnvUtils.LOG_DEBUG) {
                C61064p.m237485a("VideoSinkManager", "[unbindRenderView]Old key = " + str);
            }
            absVideoViewRenderer.release();
            if (bvVideoViewSink.getRenderList().isEmpty() && this.rtcEngine != null) {
                String[] parseKey = parseKey(str);
                if (parseKey == null) {
                    EnvUtils.throwException("key error: " + str);
                } else if ("screen".equals(parseKey[1])) {
                    this.rtcEngine.setupRemoteScreenRender(null, "");
                } else if (!"video".equals(parseKey[1])) {
                    EnvUtils.throwException("key error: " + str);
                } else if ("rtc_local_uid".equals(parseKey[0])) {
                    this.rtcEngine.setupLocalVideoRender(null, "");
                } else {
                    this.rtcEngine.setupRemoteVideoRender(null, parseKey[0]);
                }
                this.mVideoSinkMap.remove(str);
                if (EnvUtils.LOG_DEBUG) {
                    C61064p.m237485a("VideoSinkManager", "[unbindRenderView] release video sink: " + str);
                }
            } else if (this.rtcEngine == null) {
                C61064p.m237487c("VideoSinkManager", "[unbindRenderView]Engine null");
            }
        }
    }

    private String buildKey(String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        if (z) {
            str2 = "screen";
        } else {
            str2 = "video";
        }
        sb.append(str2);
        return sb.toString();
    }

    private synchronized boolean createSinkIfAbsent(String str, boolean z) {
        boolean containsKey;
        String buildKey = buildKey(str, z);
        containsKey = this.mVideoSinkMap.containsKey(buildKey);
        if (!containsKey) {
            this.mVideoSinkMap.put(buildKey, new BvVideoViewSink(this.rtcConfig));
        }
        return containsKey;
    }

    public void setSinkListener(String str, IVideoSinkListener iVideoSinkListener) {
        BvVideoViewSink bvVideoViewSink = this.mVideoSinkMap.get(buildKey(str, true));
        if (bvVideoViewSink != null) {
            bvVideoViewSink.setListener(iVideoSinkListener);
        }
    }

    public synchronized void bindLocalRenderView(View view, String str) {
        MeetingRtcEngine meetingRtcEngine;
        ThreadUtils.checkIsOnMainThreadSafely("[bindLocalRenderView]");
        if (EnvUtils.LOG_DEBUG) {
            C61064p.m237485a("VideoSinkManager", "[bindLocalRenderView]Uid = " + str + ", view = " + view);
        }
        String buildKey = buildKey("rtc_local_uid", false);
        boolean createSinkIfAbsent = createSinkIfAbsent("rtc_local_uid", false);
        add("rtc_local_uid", false, (AbsVideoViewRenderer) view);
        BvVideoViewSink bvVideoViewSink = this.mVideoSinkMap.get(buildKey);
        if (!createSinkIfAbsent && (meetingRtcEngine = this.rtcEngine) != null) {
            meetingRtcEngine.setupLocalVideoRender(bvVideoViewSink, str);
        } else if (this.rtcEngine == null) {
            C61064p.m237487c("VideoSinkManager", "[bindLocalRenderView]Engine null");
        }
    }

    public synchronized void clearVideoSink(String str, boolean z) {
        if (EnvUtils.LOG_DEBUG) {
            C61064p.m237485a("VideoSinkManager", "[clearVideoSink]Uid = " + str + ", screen = " + z);
        }
        BvVideoViewSink remove = this.mVideoSinkMap.remove(buildKey(str, z));
        if (remove != null) {
            for (AbsVideoViewRenderer absVideoViewRenderer : remove.getRenderList()) {
                absVideoViewRenderer.setTag(R.id.rtc_video_stream_key, null);
                absVideoViewRenderer.release();
            }
            remove.getRenderList().clear();
        }
    }

    public synchronized void onStreamAdd(String str, boolean z) {
        ThreadUtils.checkIsOnMainThreadSafely("[onStreamAdd]");
        if (EnvUtils.LOG_DEBUG) {
            C61064p.m237485a("VideoSinkManager", "[onStreamAdd]uid = " + str + ", screen = " + z);
        }
        String buildKey = buildKey(str, z);
        this.mStreamSet.add(buildKey);
        BvVideoViewSink bvVideoViewSink = this.mVideoSinkMap.get(buildKey);
        if (bvVideoViewSink != null && this.rtcEngine != null) {
            if (EnvUtils.LOG_DEBUG) {
                C61064p.m237485a("VideoSinkManager", "[onStreamAdd]Rebind to new stream automatically");
            }
            if (z) {
                this.rtcEngine.setupRemoteScreenRender(bvVideoViewSink, str);
            } else {
                this.rtcEngine.setupRemoteVideoRender(bvVideoViewSink, str);
            }
            bvVideoViewSink.setStreamBound(true);
        } else if (this.rtcEngine == null) {
            C61064p.m237487c("VideoSinkManager", "[onStreamAdd]Engine null");
        }
    }

    public synchronized void onStreamRemove(String str, boolean z) {
        ThreadUtils.checkIsOnMainThreadSafely("[onStreamRemove]");
        if (EnvUtils.LOG_DEBUG) {
            C61064p.m237485a("VideoSinkManager", "[onStreamRemove]uid = " + str + ", screen = " + z);
        }
        String buildKey = buildKey(str, z);
        this.mStreamSet.remove(buildKey);
        BvVideoViewSink bvVideoViewSink = this.mVideoSinkMap.get(buildKey);
        if (bvVideoViewSink != null) {
            bvVideoViewSink.setStreamBound(false);
        }
    }

    private void add(String str, boolean z, AbsVideoViewRenderer absVideoViewRenderer) {
        String buildKey = buildKey(str, z);
        if (absVideoViewRenderer.getTag(R.id.rtc_video_stream_key) != null) {
            String str2 = (String) absVideoViewRenderer.getTag(R.id.rtc_video_stream_key);
            if (!str2.equals(buildKey)) {
                if (EnvUtils.LOG_DEBUG) {
                    C61064p.m237485a("VideoSinkManager", "[add][1]view = " + absVideoViewRenderer + " old = " + str2 + ", new = " + buildKey);
                }
                BvVideoViewSink bvVideoViewSink = this.mVideoSinkMap.get(str2);
                if (bvVideoViewSink != null) {
                    bvVideoViewSink.remove(absVideoViewRenderer);
                    absVideoViewRenderer.release();
                    C61064p.m237486b("VideoSinkManager", "[add]remove old = " + str2 + ", new = " + buildKey);
                }
            } else {
                return;
            }
        }
        if (EnvUtils.LOG_DEBUG) {
            C61064p.m237485a("VideoSinkManager", "[add][2]view = " + absVideoViewRenderer + "new = " + buildKey);
        }
        BvVideoViewSink bvVideoViewSink2 = this.mVideoSinkMap.get(buildKey);
        if (bvVideoViewSink2 != null && bvVideoViewSink2.indexOf(absVideoViewRenderer) == -1) {
            absVideoViewRenderer.init(bvVideoViewSink2.getEglBaseContext());
            absVideoViewRenderer.setTag(R.id.rtc_video_stream_key, buildKey);
            bvVideoViewSink2.add(absVideoViewRenderer);
        }
    }

    public synchronized void bindRenderView(View view, String str, boolean z) {
        ThreadUtils.checkIsOnMainThreadSafely("[bindRenderView]");
        if (TextUtils.isEmpty(str)) {
            C61064p.m237487c("VideoSinkManager", "[bindRenderView]Uid is empty.");
            return;
        }
        if (EnvUtils.LOG_DEBUG) {
            C61064p.m237485a("VideoSinkManager", "[bindRenderView]Uid = " + str + ", view = " + view + ", screen = " + z);
        }
        AbsVideoViewRenderer absVideoViewRenderer = (AbsVideoViewRenderer) view;
        String buildKey = buildKey(str, z);
        createSinkIfAbsent(str, z);
        add(str, z, absVideoViewRenderer);
        BvVideoViewSink bvVideoViewSink = this.mVideoSinkMap.get(buildKey);
        if (this.mStreamSet.contains(buildKey) && !bvVideoViewSink.isStreamBound() && this.rtcEngine != null) {
            bvVideoViewSink.setStreamBound(true);
            if (EnvUtils.LOG_DEBUG) {
                C61064p.m237485a("VideoSinkManager", "[bindRenderView]Bind to stream: " + absVideoViewRenderer);
            }
            if (z) {
                this.rtcEngine.setupRemoteScreenRender(bvVideoViewSink, str);
            } else {
                this.rtcEngine.setupRemoteVideoRender(bvVideoViewSink, str);
            }
        } else if (this.rtcEngine == null) {
            C61064p.m237487c("VideoSinkManager", "[bindRenderView]Engine null");
        }
    }
}
