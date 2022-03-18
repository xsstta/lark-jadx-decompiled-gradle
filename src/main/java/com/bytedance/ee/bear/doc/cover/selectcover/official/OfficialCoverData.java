package com.bytedance.ee.bear.doc.cover.selectcover.official;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0004\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$Data;", "()V", "handlePrioritize", "", "CoverItem", "CoverSeries", "Data", "Series", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class OfficialCoverData extends NetService.Result<Data> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$CoverItem;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "mimeType", "getMimeType", "setMimeType", "priority", "", "getPriority", "()I", "setPriority", "(I)V", "token", "getToken", "setToken", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class CoverItem implements NonProguard {
        private String id;
        @JSONField(name = "mime_type")
        private String mimeType;
        private int priority;
        private String token;

        public final String getId() {
            return this.id;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final String getToken() {
            return this.token;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setMimeType(String str) {
            this.mimeType = str;
        }

        public final void setPriority(int i) {
            this.priority = i;
        }

        public final void setToken(String str) {
            this.token = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$CoverSeries;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "candidateCovers", "", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$CoverItem;", "getCandidateCovers", "()Ljava/util/List;", "setCandidateCovers", "(Ljava/util/List;)V", "series", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$Series;", "getSeries", "()Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$Series;", "setSeries", "(Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$Series;)V", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class CoverSeries implements NonProguard {
        @JSONField(name = "candidate_covers")
        private List<CoverItem> candidateCovers;
        private Series series;

        public final List<CoverItem> getCandidateCovers() {
            return this.candidateCovers;
        }

        public final Series getSeries() {
            return this.series;
        }

        public final void setCandidateCovers(List<CoverItem> list) {
            this.candidateCovers = list;
        }

        public final void setSeries(Series series2) {
            this.series = series2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$Data;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "coverSeriesList", "", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$CoverSeries;", "getCoverSeriesList", "()Ljava/util/List;", "setCoverSeriesList", "(Ljava/util/List;)V", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Data implements NonProguard {
        @JSONField(name = "cover_series")
        private List<CoverSeries> coverSeriesList;

        public final List<CoverSeries> getCoverSeriesList() {
            return this.coverSeriesList;
        }

        public final void setCoverSeriesList(List<CoverSeries> list) {
            this.coverSeriesList = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$Series;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "en", "", "getEn", "()Ljava/lang/String;", "setEn", "(Ljava/lang/String;)V", "jp", "getJp", "setJp", "seriesId", "getSeriesId", "setSeriesId", "zh", "getZh", "setZh", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Series implements NonProguard {
        private String en;

        /* renamed from: jp  reason: collision with root package name */
        private String f175416jp;
        @JSONField(name = "series_id")
        private String seriesId;
        private String zh;

        public final String getEn() {
            return this.en;
        }

        public final String getJp() {
            return this.f175416jp;
        }

        public final String getSeriesId() {
            return this.seriesId;
        }

        public final String getZh() {
            return this.zh;
        }

        public final void setEn(String str) {
            this.en = str;
        }

        public final void setJp(String str) {
            this.f175416jp = str;
        }

        public final void setSeriesId(String str) {
            this.seriesId = str;
        }

        public final void setZh(String str) {
            this.zh = str;
        }
    }

    public final void handlePrioritize() {
        List<CoverSeries> coverSeriesList;
        List<CoverSeries> reversed;
        List<CoverItem> reversed2;
        Data data = (Data) this.data;
        if (!(data == null || (coverSeriesList = data.getCoverSeriesList()) == null || (reversed = CollectionsKt.reversed(coverSeriesList)) == null)) {
            int i = 0;
            for (CoverSeries coverSeries : reversed) {
                List<CoverItem> candidateCovers = coverSeries.getCandidateCovers();
                if (!(candidateCovers == null || (reversed2 = CollectionsKt.reversed(candidateCovers)) == null)) {
                    for (CoverItem coverItem : reversed2) {
                        coverItem.setPriority(i);
                        i++;
                    }
                }
            }
        }
    }
}
