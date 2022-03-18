package com.bytedance.ee.bear.wikiv2.searchv2;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wikiv2.home.api.SpaceCover;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12451a;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import java.util.Map;

public class WikiSearchPuller extends AbstractC12451a<Params, Data> {

    public static class Data implements NonProguard {
        public C12344Entity entities;
        public boolean has_more;
        public List<SpacesInfo> spaces;
        public List<String> tokens;
        public int total;

        /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchPuller$Data$Entity */
        public static class C12344Entity implements NonProguard {
            public Map<String, ObjsBean> objs;
            public Map<String, UsersBean> users;

            /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchPuller$Data$Entity$ObjsBean */
            public static class ObjsBean implements NonProguard {
                public String author;
                public String comment;
                public String create_uid;
                public String edit_name;
                public long edit_time;
                public String edit_uid;
                public boolean is_external;
                public long open_time;
                public String owner_id;
                public String preview;
                public String subtype;
                public String title;
                public String token;
                public int type;
                public String url;
                public long user_edit_time;
                public List<WikiInfo> wiki_infos;

                /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchPuller$Data$Entity$ObjsBean$WikiInfo */
                public static class WikiInfo implements NonProguard {
                    public List<String> main_path;
                    public String space_id;
                    public String space_name;
                    public String wiki_token;
                    public String wiki_url;
                }
            }

            /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchPuller$Data$Entity$UsersBean */
            public static class UsersBean implements NonProguard {
                public String avatar_url;
                public String cn_name;
                public String email;
                public String en_name;
                public String id;
                public String mobile;
                public String name;
                public String suid;
                public String tenant_id;
                public String tenant_name;
            }
        }

        public static class SpacesInfo implements NonProguard {
            public int attr;
            public String description;
            public HomePageInfo home_page;
            public boolean is_star;
            public SpaceCover spaceCover;
            public String space_icon;
            public String space_id;
            public String space_name;
            public int wiki_scope;

            public static class HomePageInfo implements NonProguard {
                public String obj_token;
                public int obj_type;
                public String wiki_token;
            }
        }
    }

    public static class Params implements NonProguard {
        public int count;
        public int need_main_path;
        public int offset;
        public String query;
        public String search_field;
        public int search_type;
        public String source;
        public String space_id;
        public Integer wiki_space_type;

        public String toString() {
            return "query = " + this.query + " offset = " + this.offset + " space_id = " + this.space_id + " search_field = " + this.search_field + " search_type = " + this.search_type + " source = " + this.source;
        }
    }

    WikiSearchPuller(NetService netService) {
        super(netService, "/api/search/search_wiki/", 2);
    }
}
