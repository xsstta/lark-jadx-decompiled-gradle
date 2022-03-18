package com.ss.android.lark.wschannelprocess.pushtrack;

import com.bytedance.lark.pb.statistics.v1.Track;
import com.ss.android.lark.wschannelprocess.pushtrack.RustTrackEntity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.wschannelprocess.pushtrack.a */
public class C59313a {
    /* renamed from: a */
    private static Map<String, Object> m230313a(Track.TrackParams trackParams) {
        if (trackParams == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (trackParams.int_param != null) {
            hashMap.putAll(trackParams.int_param);
        }
        if (trackParams.string_param == null) {
            return hashMap;
        }
        hashMap.putAll(trackParams.string_param);
        return hashMap;
    }

    /* renamed from: a */
    public static RustTrackEntity m230312a(Track track) {
        if (track == null) {
            return null;
        }
        RustTrackEntity rustTrackEntity = new RustTrackEntity();
        rustTrackEntity.setKey(track.key);
        rustTrackEntity.setTrackType(RustTrackEntity.TrackType.fromValue(track.type.getValue()));
        if (track.tea_param != null) {
            rustTrackEntity.setParams(m230313a(track.tea_param.params));
        }
        if (track.slardar_param != null) {
            rustTrackEntity.setCategory(m230313a(track.slardar_param.category));
            rustTrackEntity.setMetric(m230313a(track.slardar_param.metric));
            rustTrackEntity.setStatus(track.slardar_param.status.intValue());
        }
        return rustTrackEntity;
    }
}
