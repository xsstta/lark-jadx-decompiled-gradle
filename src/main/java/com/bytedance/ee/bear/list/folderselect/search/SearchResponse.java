package com.bytedance.ee.bear.list.folderselect.search;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class SearchResponse extends NetService.Result implements Serializable {
    private Data data;

    public static class Data implements Serializable {
        private C8433Entity entities;
        private boolean has_more;
        private String strategy;
        private List<String> tokens;
        private int total;

        /* renamed from: com.bytedance.ee.bear.list.folderselect.search.SearchResponse$Data$Entity */
        public static class C8433Entity implements Serializable {
            private Map<String, ObjsBean> objs;
            private Map<String, UsersBean> users;

            /* renamed from: com.bytedance.ee.bear.list.folderselect.search.SearchResponse$Data$Entity$ObjsBean */
            public static class ObjsBean implements Serializable {
                private String author;
                private String comment;
                private String create_uid;
                private String edit_name;
                private int edit_time;
                private String edit_uid;
                private ExtraBean extra;
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

                /* renamed from: com.bytedance.ee.bear.list.folderselect.search.SearchResponse$Data$Entity$ObjsBean$ExtraBean */
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
            }

            /* renamed from: com.bytedance.ee.bear.list.folderselect.search.SearchResponse$Data$Entity$UsersBean */
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

        public C8433Entity getEntities() {
            return this.entities;
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

        public void setEntities(C8433Entity entity) {
            this.entities = entity;
        }

        public void setHas_more(boolean z) {
            this.has_more = z;
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
