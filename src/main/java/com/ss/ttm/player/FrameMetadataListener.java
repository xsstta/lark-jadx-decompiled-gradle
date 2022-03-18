package com.ss.ttm.player;

import java.util.Map;

public interface FrameMetadataListener {
    void frameDTSNotify(int i, long j, long j2);

    void onFrameAboutToBeRendered(int i, long j, long j2, Map<Integer, String> map);

    void updateFrameTerminatedDTS(int i, long j, long j2);
}
