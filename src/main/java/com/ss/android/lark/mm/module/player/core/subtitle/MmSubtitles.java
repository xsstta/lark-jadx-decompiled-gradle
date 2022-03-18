package com.ss.android.lark.mm.module.player.core.subtitle;

import com.bytedance.common.utility.collection.CollectionUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MmSubtitles implements Serializable {
    public List<MmSubtitleLine> subtitles = new ArrayList();

    public List<MmSubtitleLine> getList() {
        return this.subtitles;
    }

    public boolean isEmpty() {
        return CollectionUtils.isEmpty(this.subtitles);
    }

    public String toString() {
        return "MmSubtitles{list=" + this.subtitles + '}';
    }

    public void add(MmSubtitleLine mmSubtitleLine) {
        mmSubtitleLine.setIndex(this.subtitles.size());
        this.subtitles.add(mmSubtitleLine);
    }

    public List<MmSubtitleLine> findLines(long j) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(this.subtitles)) {
            return null;
        }
        for (MmSubtitleLine mmSubtitleLine : this.subtitles) {
            if (j >= mmSubtitleLine.getStart_ms() && j <= mmSubtitleLine.getStop_ms()) {
                arrayList.add(mmSubtitleLine);
            }
        }
        Collections.sort(arrayList, new Comparator<MmSubtitleLine>() {
            /* class com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitles.C466941 */

            /* renamed from: a */
            public int compare(MmSubtitleLine mmSubtitleLine, MmSubtitleLine mmSubtitleLine2) {
                return Long.compare(mmSubtitleLine.getStart_ms(), mmSubtitleLine2.getStart_ms());
            }
        });
        return arrayList;
    }

    public List<MmSubtitleLine> findLinesForPodcast(long j) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(this.subtitles)) {
            return null;
        }
        if (j < this.subtitles.get(0).start_ms) {
            arrayList.add(this.subtitles.get(0));
            return arrayList;
        }
        List<MmSubtitleLine> list = this.subtitles;
        if (j > list.get(list.size() - 1).stop_ms) {
            List<MmSubtitleLine> list2 = this.subtitles;
            arrayList.add(list2.get(list2.size() - 1));
            return arrayList;
        }
        for (MmSubtitleLine mmSubtitleLine : this.subtitles) {
            if (j >= mmSubtitleLine.getStart_ms() && j < mmSubtitleLine.getStop_ms()) {
                arrayList.add(mmSubtitleLine);
            }
        }
        Collections.sort(arrayList, new Comparator<MmSubtitleLine>() {
            /* class com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitles.C466952 */

            /* renamed from: a */
            public int compare(MmSubtitleLine mmSubtitleLine, MmSubtitleLine mmSubtitleLine2) {
                return Long.compare(mmSubtitleLine.getStart_ms(), mmSubtitleLine2.getStart_ms());
            }
        });
        return arrayList;
    }
}
