package com.bytedance.ee.bear.wikiv2.spacedetail;

import com.bytedance.ee.util.io.NonProguard;
import java.io.Serializable;
import java.util.List;

public class SpaceBean implements NonProguard {
    private int attr;
    private String description;
    private HomePageBean home_page;
    private boolean is_star;
    private List<MembersBean> members;
    private SpaceCoverBean space_cover;
    private String space_icon;
    private String space_id;
    private String space_name;
    private String tenant_id;

    public static class HomePageBean implements Serializable {
        private String obj_token;
        private int obj_type;
        private String wiki_token;

        public String getObj_token() {
            return this.obj_token;
        }

        public int getObj_type() {
            return this.obj_type;
        }

        public String getWiki_token() {
            return this.wiki_token;
        }

        public void setObj_token(String str) {
            this.obj_token = str;
        }

        public void setObj_type(int i) {
            this.obj_type = i;
        }

        public void setWiki_token(String str) {
            this.wiki_token = str;
        }
    }

    public static class MembersBean implements Serializable {
        public static int MEMBER_ADMIN = 2;
        public static int MEMBER_MEMBER = 1;
        public static int MEMBER_VISITOR;
        private String description;
        private String icon_url;
        private String member_en_name;
        private String member_id;
        private String member_name;
        private int member_role;
        private int member_type = -1;

        public String getDescription() {
            return this.description;
        }

        public String getIcon_url() {
            return this.icon_url;
        }

        public String getMember_en_name() {
            return this.member_en_name;
        }

        public String getMember_id() {
            return this.member_id;
        }

        public String getMember_name() {
            return this.member_name;
        }

        public int getMember_role() {
            return this.member_role;
        }

        public int getMember_type() {
            return this.member_type;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setIcon_url(String str) {
            this.icon_url = str;
        }

        public void setMember_en_name(String str) {
            this.member_en_name = str;
        }

        public void setMember_id(String str) {
            this.member_id = str;
        }

        public void setMember_name(String str) {
            this.member_name = str;
        }

        public void setMember_role(int i) {
            this.member_role = i;
        }

        public void setMember_type(int i) {
            this.member_type = i;
        }
    }

    public static class SpaceCoverBean implements Serializable {
        private String color_value;
        private boolean is_graph_dark;
        private String key;
        private String origin;
        private String thumbnail;

        public String getColor_value() {
            return this.color_value;
        }

        public String getKey() {
            return this.key;
        }

        public String getOrigin() {
            return this.origin;
        }

        public String getThumbnail() {
            return this.thumbnail;
        }

        public boolean isIs_graph_dark() {
            return this.is_graph_dark;
        }

        public void setColor_value(String str) {
            this.color_value = str;
        }

        public void setIs_graph_dark(boolean z) {
            this.is_graph_dark = z;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setOrigin(String str) {
            this.origin = str;
        }

        public void setThumbnail(String str) {
            this.thumbnail = str;
        }
    }

    public int getAttr() {
        return this.attr;
    }

    public String getDescription() {
        return this.description;
    }

    public HomePageBean getHome_page() {
        return this.home_page;
    }

    public List<MembersBean> getMembers() {
        return this.members;
    }

    public SpaceCoverBean getSpace_cover() {
        return this.space_cover;
    }

    public String getSpace_icon() {
        return this.space_icon;
    }

    public String getSpace_id() {
        return this.space_id;
    }

    public String getSpace_name() {
        return this.space_name;
    }

    public String getTenant_id() {
        return this.tenant_id;
    }

    public boolean isIs_star() {
        return this.is_star;
    }

    public void setAttr(int i) {
        this.attr = i;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setHome_page(HomePageBean homePageBean) {
        this.home_page = homePageBean;
    }

    public void setIs_star(boolean z) {
        this.is_star = z;
    }

    public void setMembers(List<MembersBean> list) {
        this.members = list;
    }

    public void setSpace_cover(SpaceCoverBean spaceCoverBean) {
        this.space_cover = spaceCoverBean;
    }

    public void setSpace_icon(String str) {
        this.space_icon = str;
    }

    public void setSpace_id(String str) {
        this.space_id = str;
    }

    public void setSpace_name(String str) {
        this.space_name = str;
    }

    public void setTenant_id(String str) {
        this.tenant_id = str;
    }
}
