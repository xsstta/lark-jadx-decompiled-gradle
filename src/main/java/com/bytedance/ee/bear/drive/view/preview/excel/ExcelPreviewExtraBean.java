package com.bytedance.ee.bear.drive.view.preview.excel;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class ExcelPreviewExtraBean implements NonProguard {
    private MainBean main;
    private List<SheetsBean> sheets;
    private StyleBean style;

    public static class MainBean implements NonProguard {
        private long file_id;
        private String name;
        private long version;

        public long getFile_id() {
            return this.file_id;
        }

        public String getName() {
            return this.name;
        }

        public long getVersion() {
            return this.version;
        }

        public String toString() {
            return "MainBean{name='" + this.name + '\'' + ", file_id=" + this.file_id + ", version=" + this.version + '}';
        }

        public void setFile_id(long j) {
            this.file_id = j;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setVersion(long j) {
            this.version = j;
        }
    }

    public static class SheetsBean implements NonProguard {
        private long file_id;
        private String name;
        private long size;
        private long version;

        public long getFile_id() {
            return this.file_id;
        }

        public String getName() {
            return this.name;
        }

        public long getSize() {
            return this.size;
        }

        public long getVersion() {
            return this.version;
        }

        public void setFile_id(long j) {
            this.file_id = j;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setSize(long j) {
            this.size = j;
        }

        public void setVersion(long j) {
            this.version = j;
        }
    }

    public static class StyleBean implements NonProguard {
        private long file_id;
        private String name;
        private long version;

        public long getFile_id() {
            return this.file_id;
        }

        public String getName() {
            return this.name;
        }

        public long getVersion() {
            return this.version;
        }

        public String toString() {
            return "StyleBean{name='" + this.name + '\'' + ", file_id=" + this.file_id + ", version=" + this.version + '}';
        }

        public void setFile_id(long j) {
            this.file_id = j;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setVersion(long j) {
            this.version = j;
        }
    }

    public MainBean getMain() {
        return this.main;
    }

    public List<SheetsBean> getSheets() {
        return this.sheets;
    }

    public StyleBean getStyle() {
        return this.style;
    }

    public String toString() {
        return "ExcelPreviewExtraBean{main=" + this.main + ", style=" + this.style + ", sheets=" + this.sheets + '}';
    }

    public void setMain(MainBean mainBean) {
        this.main = mainBean;
    }

    public void setSheets(List<SheetsBean> list) {
        this.sheets = list;
    }

    public void setStyle(StyleBean styleBean) {
        this.style = styleBean;
    }
}
