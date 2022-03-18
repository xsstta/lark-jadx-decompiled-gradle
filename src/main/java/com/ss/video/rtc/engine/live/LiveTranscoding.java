package com.ss.video.rtc.engine.live;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.video.rtc.engine.utils.LogUtil;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveTranscoding {
    private String action = "";
    private JSONObject advancedConfig;
    private AudioConfig audio;
    private Layout layout;
    private String url;
    private VideoConfig video;

    public enum AACProfile {
        LC("LC"),
        MAIN("MAIN"),
        HEV1("HEv1"),
        HEV2("HEv2");
        
        private String AacProfile = "LC";

        public String getValue() {
            return this.AacProfile;
        }

        private AACProfile(String str) {
            this.AacProfile = str;
        }
    }

    public static class Layout {
        public String appData;
        public String backgroundColor;
        public Region[] regions;

        public String getAppData() {
            return this.appData;
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public Region[] getRegions() {
            return this.regions;
        }

        public static class Builder {
            private String appData = "";
            private String backgroundColor = "#000000";
            private ArrayList<Region> regions;

            public Layout builder() {
                Layout layout = new Layout();
                ArrayList<Region> arrayList = this.regions;
                if (arrayList != null) {
                    layout.regions = (Region[]) arrayList.toArray(new Region[arrayList.size()]);
                }
                layout.appData = this.appData;
                layout.backgroundColor = this.backgroundColor;
                return layout;
            }

            public Builder appData(String str) {
                this.appData = str;
                return this;
            }

            public Builder backgroundColor(String str) {
                this.backgroundColor = str;
                return this;
            }

            public Builder addRegoin(Region region) {
                if (this.regions == null) {
                    this.regions = new ArrayList<>();
                }
                this.regions.add(region);
                return this;
            }
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Object jSONObject2 = new JSONObject();
            try {
                Region[] regionArr = this.regions;
                if (regionArr != null) {
                    for (Region region : regionArr) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("uid", region.uid);
                        jSONObject3.put("x", region.f165139x);
                        jSONObject3.put("y", region.f165140y);
                        jSONObject3.put("w", region.f165138w);
                        jSONObject3.put(C14002h.f36692e, region.f165137h);
                        jSONObject3.put("zorder", region.zorder);
                        jSONObject3.put("alpha", region.alpha);
                        jSONObject3.put("contentControl", region.contentControl);
                        jSONObject3.put("renderMode", region.renderMode);
                        jSONArray.put(jSONObject3);
                    }
                }
                jSONObject.put("canvas", jSONObject2);
                jSONObject.put("regions", jSONArray);
                jSONObject.put("app_data", this.appData);
                return jSONObject.toString();
            } catch (JSONException e) {
                LogUtil.m257134w("LiveTranscoding", "create layout json message happen exception", e);
                return null;
            }
        }

        public static class Region {
            public double alpha;
            public int contentControl;

            /* renamed from: h */
            public double f165137h;
            public int renderMode;
            public String uid;

            /* renamed from: w */
            public double f165138w;

            /* renamed from: x */
            public double f165139x;

            /* renamed from: y */
            public double f165140y;
            public int zorder;

            public Region alpha(double d) {
                this.alpha = d;
                return this;
            }

            public Region contentControl(int i) {
                this.contentControl = i;
                return this;
            }

            public Region renderMode(int i) {
                this.renderMode = i;
                return this;
            }

            public Region uid(String str) {
                this.uid = str;
                return this;
            }

            public Region zorder(int i) {
                this.zorder = i;
                return this;
            }

            public Region position(double d, double d2) {
                this.f165139x = d;
                this.f165140y = d2;
                return this;
            }

            public Region size(double d, double d2) {
                this.f165138w = d;
                this.f165137h = d2;
                return this;
            }
        }

        public void setAppData(String str) {
            this.appData = str;
        }

        public void setBackgroundColor(String str) {
            this.backgroundColor = str;
        }

        public void setRegions(Region[] regionArr) {
            this.regions = regionArr;
        }
    }

    public AudioConfig getAudio() {
        return this.audio;
    }

    public Layout getLayout() {
        return this.layout;
    }

    public String getUrl() {
        return this.url;
    }

    public VideoConfig getVideo() {
        return this.video;
    }

    public static LiveTranscoding getDefualtLiveTranscode() {
        VideoConfig videoConfig = new VideoConfig();
        videoConfig.setCodec("H264").setFps(30).setGop(60).setKBitRate(ParticipantRepo.f117150c).setHeight(640).setWidth(360).setLowLatency(true);
        AudioConfig audioConfig = new AudioConfig();
        audioConfig.setCodec("AAC").setSampleRate(44100).setChannels(1).setKBitRate(16).setAacProfile(AACProfile.LC);
        Layout.Builder builder = new Layout.Builder();
        builder.backgroundColor("#000000").appData("");
        LiveTranscoding liveTranscoding = new LiveTranscoding();
        liveTranscoding.setAudio(audioConfig);
        liveTranscoding.setVideo(videoConfig);
        liveTranscoding.setLayout(builder.builder());
        liveTranscoding.setUrl(null);
        return liveTranscoding;
    }

    public JSONObject getTranscodeMessage() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        try {
            jSONObject.put("codec", this.video.codec);
            jSONObject.put("fps", this.video.fps);
            jSONObject.put("gop", this.video.gop);
            jSONObject.put("lowLatency", this.video.lowLatency);
            jSONObject.put("bitRate", this.video.bitRate);
            jSONObject.put("width", this.video.width);
            jSONObject.put("height", this.video.height);
            jSONObject2.put("codec", this.audio.codec);
            jSONObject2.put("bitRate", this.audio.bitRate);
            jSONObject2.put("sampleRate", this.audio.sampleRate);
            jSONObject2.put("channels", this.audio.channels);
            jSONObject2.put("profile", this.audio.aacProfile);
            jSONObject4.put("bgnd", this.layout.backgroundColor);
            if (this.layout.regions != null) {
                Layout.Region[] regionArr = this.layout.regions;
                int i = 0;
                for (int length = regionArr.length; i < length; length = length) {
                    Layout.Region region = regionArr[i];
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("uid", region.uid);
                    jSONObject8.put("x", region.f165139x);
                    jSONObject8.put("y", region.f165140y);
                    jSONObject8.put("w", region.f165138w);
                    jSONObject8.put(C14002h.f36692e, region.f165137h);
                    jSONObject8.put("zorder", region.zorder);
                    jSONObject8.put("alpha", region.alpha);
                    jSONObject8.put("contentControl", region.contentControl);
                    jSONObject8.put("renderMode", region.renderMode);
                    jSONArray.put(jSONObject8);
                    i++;
                    jSONObject = jSONObject;
                    regionArr = regionArr;
                }
            }
            jSONObject3.put("canvas", jSONObject4);
            jSONObject3.put("regions", jSONArray);
            jSONObject3.put("app_data", this.layout.appData);
            jSONObject5.put("url", this.url);
            jSONObject6.put("transcode", jSONObject5);
            jSONObject6.put("video", jSONObject);
            jSONObject6.put("audio", jSONObject2);
            jSONObject6.put("layout", jSONObject3);
            jSONObject6.put("advancedConfig", this.advancedConfig);
            jSONObject7.put(ShareHitPoint.f121869d, "transcode");
            jSONObject7.put("action", this.action);
            jSONObject7.put("transcodeMeta", jSONObject6);
            return jSONObject7;
        } catch (JSONException e) {
            LogUtil.m257134w("LiveTranscoding", "get json message happen exception", e);
            return null;
        }
    }

    public static class AudioConfig {
        public String aacProfile = AACProfile.LC.getValue();
        public int bitRate = 16000;
        public int channels = 1;
        public String codec = "AAC";
        public int sampleRate = 44100;

        public AudioConfig setChannels(int i) {
            this.channels = i;
            return this;
        }

        public AudioConfig setCodec(String str) {
            this.codec = str;
            return this;
        }

        public AudioConfig setSampleRate(int i) {
            this.sampleRate = i;
            return this;
        }

        public AudioConfig setAacProfile(AACProfile aACProfile) {
            this.aacProfile = aACProfile.getValue();
            return this;
        }

        public AudioConfig setKBitRate(int i) {
            this.bitRate = i * 1000;
            return this;
        }
    }

    public static class VideoConfig {
        public int bitRate = 500000;
        public String codec = "H264";
        public int fps = 30;
        public int gop = 60;
        public int height = 640;
        public boolean lowLatency = true;
        public int width = 360;

        public VideoConfig setCodec(String str) {
            this.codec = str;
            return this;
        }

        public VideoConfig setFps(int i) {
            this.fps = i;
            return this;
        }

        public VideoConfig setGop(int i) {
            this.gop = i;
            return this;
        }

        public VideoConfig setHeight(int i) {
            this.height = i;
            return this;
        }

        public VideoConfig setLowLatency(boolean z) {
            this.lowLatency = z;
            return this;
        }

        public VideoConfig setWidth(int i) {
            this.width = i;
            return this;
        }

        public VideoConfig setKBitRate(int i) {
            this.bitRate = i * 1000;
            return this;
        }
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setAdvancedConfig(JSONObject jSONObject) {
        this.advancedConfig = jSONObject;
    }

    public void setAudio(AudioConfig audioConfig) {
        this.audio = audioConfig;
    }

    public void setLayout(Layout layout2) {
        this.layout = layout2;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVideo(VideoConfig videoConfig) {
        this.video = videoConfig;
    }
}
