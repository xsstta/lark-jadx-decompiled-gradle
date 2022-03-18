package com.ss.android.lark.biz.core.api.resource;

import android.util.ArrayMap;
import com.bytedance.lark.pb.media.v1.GetStickerSetArchiveDownloadStateResponse;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.Map;

public class StickerSetDownloadState implements Serializable {
    private Map<String, State> mDownloadState = new ArrayMap(16);

    public enum State {
        UNKNOWN(0),
        DOWNLOADED(1),
        PART_DOWNLOADED(2),
        NOT_DOWNLOADED(3);
        
        private int mValue;

        public int getNumber() {
            return this.mValue;
        }

        public static State valueOf(int i) {
            return forNumber(i);
        }

        public static State forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return DOWNLOADED;
            }
            if (i == 2) {
                return PART_DOWNLOADED;
            }
            if (i != 3) {
                return null;
            }
            return NOT_DOWNLOADED;
        }

        private State(int i) {
            this.mValue = i;
        }
    }

    public boolean isDownloaded(String str) {
        Map<String, State> map = this.mDownloadState;
        if (map != null && map.get(str) == State.DOWNLOADED) {
            return true;
        }
        return false;
    }

    public void parse(Map<String, GetStickerSetArchiveDownloadStateResponse.State> map) {
        if (map == null) {
            Log.m165382e("StickerSetDownloadState parse called. GetStickerSetArchiveDownloadStateResponse.State is null");
            return;
        }
        for (Map.Entry<String, GetStickerSetArchiveDownloadStateResponse.State> entry : map.entrySet()) {
            this.mDownloadState.put(entry.getKey(), State.forNumber(entry.getValue().getValue()));
        }
    }
}
