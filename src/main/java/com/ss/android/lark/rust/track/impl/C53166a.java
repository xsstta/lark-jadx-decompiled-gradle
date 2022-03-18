package com.ss.android.lark.rust.track.impl;

import com.bytedance.lark.pb.statistics.v1.Track;
import com.ss.android.lark.rust.track.impl.RustTrackEntity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.rust.track.impl.a */
public class C53166a {
    /* renamed from: a */
    private static Map<String, Object> m205776a(Track.TrackParams trackParams) {
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
    public static RustTrackEntity m205775a(Track track) {
        if (track == null) {
            return null;
        }
        RustTrackEntity rustTrackEntity = new RustTrackEntity();
        rustTrackEntity.setKey(track.key);
        rustTrackEntity.setTrackType(RustTrackEntity.TrackType.fromValue(track.type.getValue()));
        if (track.tea_param != null) {
            rustTrackEntity.setParams(m205776a(track.tea_param.params));
        }
        if (track.slardar_param != null) {
            rustTrackEntity.setCategory(m205776a(track.slardar_param.category));
            rustTrackEntity.setMetric(m205776a(track.slardar_param.metric));
            rustTrackEntity.setStatus(track.slardar_param.status.intValue());
        }
        return rustTrackEntity;
    }
}
