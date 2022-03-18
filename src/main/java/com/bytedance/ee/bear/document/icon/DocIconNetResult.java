package com.bytedance.ee.bear.document.icon;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import java.util.Map;

public class DocIconNetResult extends NetService.Result<Data> implements NonProguard {

    public static class Data implements NonProguard {
        public List<Category> data;

        public String toString() {
            return "DocIconData{categories=" + this.data + '}';
        }
    }

    public static class Category implements NonProguard {
        public int category_id;
        public List<Section> data;
        public Map<String, String> title;

        public String toString() {
            return "Category{category_id=" + this.category_id + ", title=" + this.title + ", sections=" + this.data + '}';
        }
    }

    public static class Section implements NonProguard {
        public int category_id;
        public List<Icon> data;
        public Map<String, String> sub_title;
        public int type;

        public String toString() {
            return "Section{category_id=" + this.category_id + ", sub_title=" + this.sub_title + ", icons=" + this.data + '}';
        }
    }

    public static class Icon implements NonProguard {
        public String fs_unit;
        public int id;
        public String key;
        public Map<String, String> name;
        public int type;

        public String toString() {
            return "Icon{id=" + this.id + ", key='" + this.key + '\'' + ", type=" + this.type + ", fs_unit='" + this.fs_unit + '\'' + ", name=" + this.name + '}';
        }
    }
}
