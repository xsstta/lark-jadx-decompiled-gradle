package com.bytedance.ee.bear.templates.preview.group;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class SceneTemplateData implements NonProguard {
    public String collection_id;
    public String cover_download_ur;
    public String cover_token;
    public String description;
    public int heat;
    public String id;
    public String name;
    public List<Scene> template_collection;

    public static class Extra implements NonProguard {
        public String decrypt_key;
        public String thumbnail;
        public int type;
    }

    public static class Scene implements NonProguard {
        public String cover_download_url;
        public int display_type;
        public String name;
        public String obj_token;
        public int obj_type;
        public Extra thumbnail_extra = new Extra();
    }
}
