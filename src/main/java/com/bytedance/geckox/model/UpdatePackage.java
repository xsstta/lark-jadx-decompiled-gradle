package com.bytedance.geckox.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class UpdatePackage {
    @SerializedName("access_key")
    private String accessKey;
    @SerializedName("channel")
    private String channel;
    @SerializedName("channel_index")
    private int channelIndex;
    @SerializedName("content")
    private Content content;
    @SerializedName("from")
    private List<String> from;
    @SerializedName("group_name")
    private String groupName;
    private long localVersion;
    @SerializedName("package_type")
    private int packageType;
    @SerializedName("package_version")
    private long version;

    public static final class FileType {
    }

    public static class Content {
        @SerializedName("package")
        public Package fullPackage;
        @SerializedName("patch")
        public Package patch;
        @SerializedName("strategies")
        public Strategy strategy;

        public Strategy getStrategy() {
            return this.strategy;
        }
    }

    public static class Package {
        @SerializedName("id")
        long id;
        @SerializedName("size")
        long length;
        @SerializedName("md5")
        String md5;
        String url;
        @SerializedName("url_list")
        List<String> urlList;

        public Package() {
        }

        public long getId() {
            return this.id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public String toString() {
            return "Package{url='" + this.url + '\'' + ", md5='" + this.md5 + '\'' + '}';
        }

        public void setId(int i) {
            this.id = (long) i;
        }

        public void setLength(long j) {
            this.length = j;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public Package(int i, List<String> list, String str) {
            this.id = (long) i;
            this.urlList = list;
            this.md5 = str;
        }
    }

    public static class Strategy {
        @SerializedName("del_if_download_failed")
        private int deleteIfFail;
        @SerializedName("del_old_pkg_before_download")
        private int deleteOldPackageBeforeDownload;
        @SerializedName("need_unzip")
        private int needUnzip;

        public int getDeleteIfFail() {
            return this.deleteIfFail;
        }

        public int getDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public int getNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(int i) {
            this.deleteIfFail = i;
        }

        public void setDeleteOldPackageBeforeDownload(int i) {
            this.deleteOldPackageBeforeDownload = i;
        }

        public void setNeedUnzip(int i) {
            this.needUnzip = i;
        }
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Content getContent() {
        return this.content;
    }

    public List<String> getFrom() {
        return this.from;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public long getVersion() {
        return this.version;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public UpdatePackage() {
        this.content = new Content();
    }

    public boolean isFullUpdate() {
        if (getFullPackage() == null || getFullPackage().getUrlList().size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean isPatchUpdate() {
        if (getPatch() == null || getPatch().getUrlList().size() <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "UpdatePackage{version=" + this.version + ", channel='" + this.channel + '\'' + ", content=" + this.content + ", packageType=" + this.packageType + '}';
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i) {
        this.channelIndex = i;
    }

    public void setContent(Content content2) {
        this.content = content2;
    }

    public void setFrom(List<String> list) {
        this.from = list;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLocalVersion(long j) {
        this.localVersion = j;
    }

    public void setPackageType(int i) {
        this.packageType = i;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public void setFullPackage(Package r2) {
        this.content.fullPackage = r2;
    }

    public void setPatch(Package r2) {
        this.content.patch = r2;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public UpdatePackage(long j, String str, Package r4, Package r5) {
        this.version = j;
        this.channel = str;
        Content content2 = new Content();
        this.content = content2;
        content2.fullPackage = r4;
        this.content.patch = r5;
    }
}
