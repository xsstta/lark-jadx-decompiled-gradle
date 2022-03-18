package com.bytedance.ee.bear.search.model;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class SearchResponse extends NetService.Result implements Serializable {
    private Data data;

    public static class Data implements Serializable {
        private List<Candidates> candidates;
        private C10869Entity entities;
        private boolean has_more;
        private List<String> query_correction;
        private List<String> query_suggestion;
        private List<SpaceData> spaces;
        private String strategy;
        private List<String> tokens;
        private int total;

        /* renamed from: com.bytedance.ee.bear.search.model.SearchResponse$Data$Entity */
        public static class C10869Entity implements Serializable {
            private Map<String, ObjsBean> objs;
            private Map<String, UsersBean> users;

            /* renamed from: com.bytedance.ee.bear.search.model.SearchResponse$Data$Entity$ObjsBean */
            public static class ObjsBean implements Serializable {
                private String author;
                private String comment;
                private String create_uid;
                private String edit_name;
                private int edit_time;
                private String edit_uid;
                private ExtraBean extra;
                private String icon_fsunit;
                private String icon_key;
                private int icon_type;
                private boolean isCached;
                private boolean is_external;
                private boolean is_pined;
                private boolean is_share_folder;
                private boolean is_share_root;
                private boolean is_stared;
                private int open_time;
                private String owner_id;
                private int owner_type = -1;
                private String preview;
                private int share_version = -1;
                private String space_id;
                private String subtype;
                private String title;
                private String token;
                private int type;
                private String url;
                private List<WikiInfo> wiki_infos;

                /* renamed from: com.bytedance.ee.bear.search.model.SearchResponse$Data$Entity$ObjsBean$ExtraBean */
                public static class ExtraBean implements Serializable {
                    private long data_version;
                    private String icon;
                    private int icon_encrypted_type;
                    private String icon_key;
                    private String icon_nonce;
                    private String subtype;
                    private long version;

                    public long getData_version() {
                        return this.data_version;
                    }

                    public String getIcon() {
                        return this.icon;
                    }

                    public int getIcon_encrypted_type() {
                        return this.icon_encrypted_type;
                    }

                    public String getIcon_key() {
                        return this.icon_key;
                    }

                    public String getIcon_nonce() {
                        return this.icon_nonce;
                    }

                    public String getSubtype() {
                        return this.subtype;
                    }

                    public long getVersion() {
                        return this.version;
                    }

                    public void setData_version(long j) {
                        this.data_version = j;
                    }

                    public void setIcon(String str) {
                        this.icon = str;
                    }

                    public void setIcon_encrypted_type(int i) {
                        this.icon_encrypted_type = i;
                    }

                    public void setIcon_key(String str) {
                        this.icon_key = str;
                    }

                    public void setIcon_nonce(String str) {
                        this.icon_nonce = str;
                    }

                    public void setSubtype(String str) {
                        this.subtype = str;
                    }

                    public void setVersion(long j) {
                        this.version = j;
                    }
                }

                public String getAuthor() {
                    return this.author;
                }

                public String getComment() {
                    return this.comment;
                }

                public String getCreate_uid() {
                    return this.create_uid;
                }

                public String getEdit_name() {
                    return this.edit_name;
                }

                public int getEdit_time() {
                    return this.edit_time;
                }

                public String getEdit_uid() {
                    return this.edit_uid;
                }

                public ExtraBean getExtra() {
                    return this.extra;
                }

                public String getIcon_fsunit() {
                    return this.icon_fsunit;
                }

                public String getIcon_key() {
                    return this.icon_key;
                }

                public int getIcon_type() {
                    return this.icon_type;
                }

                public int getOpen_time() {
                    return this.open_time;
                }

                public String getOwner_id() {
                    return this.owner_id;
                }

                public int getOwner_type() {
                    return this.owner_type;
                }

                public String getPreview() {
                    return this.preview;
                }

                public int getShare_version() {
                    return this.share_version;
                }

                public String getSpace_id() {
                    return this.space_id;
                }

                public String getSubtype() {
                    return this.subtype;
                }

                public String getTitle() {
                    return this.title;
                }

                public String getToken() {
                    return this.token;
                }

                public int getType() {
                    return this.type;
                }

                public String getUrl() {
                    return this.url;
                }

                public List<WikiInfo> getWiki_infos() {
                    return this.wiki_infos;
                }

                public boolean isCached() {
                    return this.isCached;
                }

                public boolean isIs_external() {
                    return this.is_external;
                }

                public boolean isIs_share_folder() {
                    return this.is_share_folder;
                }

                public boolean isIs_share_root() {
                    return this.is_share_root;
                }

                public boolean isPined() {
                    return this.is_pined;
                }

                public boolean isStared() {
                    return this.is_stared;
                }

                public void setAuthor(String str) {
                    this.author = str;
                }

                public void setCached(boolean z) {
                    this.isCached = z;
                }

                public void setComment(String str) {
                    this.comment = str;
                }

                public void setCreate_uid(String str) {
                    this.create_uid = str;
                }

                public void setEdit_name(String str) {
                    this.edit_name = str;
                }

                public void setEdit_time(int i) {
                    this.edit_time = i;
                }

                public void setEdit_uid(String str) {
                    this.edit_uid = str;
                }

                public void setExtra(ExtraBean extraBean) {
                    this.extra = extraBean;
                }

                public void setIcon_fsunit(String str) {
                    this.icon_fsunit = str;
                }

                public void setIcon_key(String str) {
                    this.icon_key = str;
                }

                public void setIcon_type(int i) {
                    this.icon_type = i;
                }

                public void setIs_external(boolean z) {
                    this.is_external = z;
                }

                public void setIs_pined(boolean z) {
                    this.is_pined = z;
                }

                public void setIs_share_folder(boolean z) {
                    this.is_share_folder = z;
                }

                public void setIs_share_root(boolean z) {
                    this.is_share_root = z;
                }

                public void setIs_stared(boolean z) {
                    this.is_stared = z;
                }

                public void setOpen_time(int i) {
                    this.open_time = i;
                }

                public void setOwner_id(String str) {
                    this.owner_id = str;
                }

                public void setOwner_type(int i) {
                    this.owner_type = i;
                }

                public void setPreview(String str) {
                    this.preview = str;
                }

                public void setShare_version(int i) {
                    this.share_version = i;
                }

                public void setSpace_id(String str) {
                    this.space_id = str;
                }

                public void setSubtype(String str) {
                    this.subtype = str;
                }

                public void setTitle(String str) {
                    this.title = str;
                }

                public void setToken(String str) {
                    this.token = str;
                }

                public void setType(int i) {
                    this.type = i;
                }

                public void setUrl(String str) {
                    this.url = str;
                }

                public void setWiki_infos(List<WikiInfo> list) {
                    this.wiki_infos = list;
                }
            }

            /* renamed from: com.bytedance.ee.bear.search.model.SearchResponse$Data$Entity$UsersBean */
            public static class UsersBean implements Serializable {
                private String avatar_url;
                private String cn_name;
                private String email;
                private String en_name;
                private String id;
                private String mobile;
                private String name;
                private String suid;
                private String tenant_id;
                private String tenant_name;

                public String getAvatar_url() {
                    return this.avatar_url;
                }

                public String getCn_name() {
                    return this.cn_name;
                }

                public String getEmail() {
                    return this.email;
                }

                public String getEn_name() {
                    return this.en_name;
                }

                public String getId() {
                    return this.id;
                }

                public String getMobile() {
                    return this.mobile;
                }

                public String getName() {
                    return this.name;
                }

                public String getSuid() {
                    return this.suid;
                }

                public String getTenant_id() {
                    return this.tenant_id;
                }

                public String getTenant_name() {
                    return this.tenant_name;
                }

                public void setAvatar_url(String str) {
                    this.avatar_url = str;
                }

                public void setCn_name(String str) {
                    this.cn_name = str;
                }

                public void setEmail(String str) {
                    this.email = str;
                }

                public void setEn_name(String str) {
                    this.en_name = str;
                }

                public void setId(String str) {
                    this.id = str;
                }

                public void setMobile(String str) {
                    this.mobile = str;
                }

                public void setName(String str) {
                    this.name = str;
                }

                public void setSuid(String str) {
                    this.suid = str;
                }

                public void setTenant_id(String str) {
                    this.tenant_id = str;
                }

                public void setTenant_name(String str) {
                    this.tenant_name = str;
                }
            }

            public Map<String, ObjsBean> getObjs() {
                return this.objs;
            }

            public Map<String, UsersBean> getUsers() {
                return this.users;
            }

            public void setObjs(Map<String, ObjsBean> map) {
                this.objs = map;
            }

            public void setUsers(Map<String, UsersBean> map) {
                this.users = map;
            }
        }

        public static class SpaceData implements NonProguard {
            private int attr;
            private String description;
            private HomePageBean home_page;
            private boolean is_star;
            private String space_icon;
            private String space_id;
            private String space_name;

            public static class HomePageBean implements NonProguard {
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

            public SpaceData() {
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

            public String getSpace_icon() {
                return this.space_icon;
            }

            public String getSpace_id() {
                return this.space_id;
            }

            public String getSpace_name() {
                return this.space_name;
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

            public void setSpace_icon(String str) {
                this.space_icon = str;
            }

            public void setSpace_id(String str) {
                this.space_id = str;
            }

            public void setSpace_name(String str) {
                this.space_name = str;
            }

            public SpaceData(String str, String str2) {
                this.space_id = str;
                this.space_name = str2;
            }
        }

        public static class Candidates implements Serializable {
            private String avatar_url;
            private String cn_name;
            private String department_name;
            private String en_name;
            private String group_description;
            private boolean is_cross_tenant;
            private boolean is_external;
            private String owner_id;
            private String owner_name;
            private int owner_type;

            public String getAvatar_url() {
                return this.avatar_url;
            }

            public String getCn_name() {
                return this.cn_name;
            }

            public String getDepartment_name() {
                return this.department_name;
            }

            public String getEn_name() {
                return this.en_name;
            }

            public String getGroup_description() {
                return this.group_description;
            }

            public String getOwner_id() {
                return this.owner_id;
            }

            public String getOwner_name() {
                return this.owner_name;
            }

            public int getOwner_type() {
                return this.owner_type;
            }

            public boolean isIs_cross_tenant() {
                return this.is_cross_tenant;
            }

            public boolean isIs_external() {
                return this.is_external;
            }

            public void setAvatar_url(String str) {
                this.avatar_url = str;
            }

            public void setCn_name(String str) {
                this.cn_name = str;
            }

            public void setDepartment_name(String str) {
                this.department_name = str;
            }

            public void setEn_name(String str) {
                this.en_name = str;
            }

            public void setGroup_description(String str) {
                this.group_description = str;
            }

            public void setIs_cross_tenant(boolean z) {
                this.is_cross_tenant = z;
            }

            public void setIs_external(boolean z) {
                this.is_external = z;
            }

            public void setOwner_id(String str) {
                this.owner_id = str;
            }

            public void setOwner_name(String str) {
                this.owner_name = str;
            }

            public void setOwner_type(int i) {
                this.owner_type = i;
            }
        }

        public static class WikiInfo implements NonProguard {
            private String space_id;
            private String wiki_token;
            private String wiki_url;

            public String getSpace_id() {
                return this.space_id;
            }

            public String getWiki_token() {
                return this.wiki_token;
            }

            public String getWiki_url() {
                return this.wiki_url;
            }

            public void setSpace_id(String str) {
                this.space_id = str;
            }

            public void setWiki_token(String str) {
                this.wiki_token = str;
            }

            public void setWiki_url(String str) {
                this.wiki_url = str;
            }
        }

        public List<Candidates> getCandidates() {
            return this.candidates;
        }

        public C10869Entity getEntities() {
            return this.entities;
        }

        public List<String> getQuery_correction() {
            return this.query_correction;
        }

        public List<String> getQuery_suggestion() {
            return this.query_suggestion;
        }

        public List<SpaceData> getSpaces() {
            return this.spaces;
        }

        public String getStrategy() {
            return this.strategy;
        }

        public List<String> getTokens() {
            return this.tokens;
        }

        public int getTotal() {
            return this.total;
        }

        public boolean isHas_more() {
            return this.has_more;
        }

        public void setCandidates(List<Candidates> list) {
            this.candidates = list;
        }

        public void setEntities(C10869Entity entity) {
            this.entities = entity;
        }

        public void setHas_more(boolean z) {
            this.has_more = z;
        }

        public void setQuery_correction(List<String> list) {
            this.query_correction = list;
        }

        public void setQuery_suggestion(List<String> list) {
            this.query_suggestion = list;
        }

        public void setSpaces(List<SpaceData> list) {
            this.spaces = list;
        }

        public void setStrategy(String str) {
            this.strategy = str;
        }

        public void setTokens(List<String> list) {
            this.tokens = list;
        }

        public void setTotal(int i) {
            this.total = i;
        }
    }

    @Override // com.bytedance.ee.bear.contract.NetService.Result
    public Data getData() {
        return this.data;
    }

    public void setData(Data data2) {
        this.data = data2;
    }
}
