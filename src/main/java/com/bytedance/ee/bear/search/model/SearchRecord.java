package com.bytedance.ee.bear.search.model;

import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.util.p702e.C13657b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SearchRecord implements Serializable {
    private List<Integer> file_types = new ArrayList();
    private List<Folder> folder = new ArrayList();
    private String from;
    private List<Group> group = new ArrayList();
    private String highlight;
    private int main_page_option;
    private List<Integer> obj_types = new ArrayList();
    private String open_time;
    private boolean own_by_user;
    private List<Owner> owner = new ArrayList();
    private String query;
    private boolean search_quick_access;
    private String source;
    private List<Space> space = new ArrayList();
    private String token;
    private int type;

    public static class Space implements Serializable {
        public String space_id_str;
        public String space_name;
    }

    public static class Folder implements Serializable {
        private String name;
        private String token;

        public String getName() {
            return this.name;
        }

        public String getToken() {
            return this.token;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setToken(String str) {
            this.token = str;
        }
    }

    public static class Group implements Serializable {
        private String avatar_key;
        private String avatar_url;
        private String group_id_str;
        private String owner_name;
        private int owner_type;

        public String getAvatar_key() {
            return this.avatar_key;
        }

        public String getAvatar_url() {
            return this.avatar_url;
        }

        public String getGroup_id_str() {
            return this.group_id_str;
        }

        public String getOwner_name() {
            return this.owner_name;
        }

        public int getOwner_type() {
            return this.owner_type;
        }

        public int hashCode() {
            return Objects.hash(this.owner_name, this.group_id_str, Integer.valueOf(this.owner_type), this.avatar_key, this.avatar_url);
        }

        public void setAvatar_key(String str) {
            this.avatar_key = str;
        }

        public void setAvatar_url(String str) {
            this.avatar_url = str;
        }

        public void setGroup_id_str(String str) {
            this.group_id_str = str;
        }

        public void setOwner_name(String str) {
            this.owner_name = str;
        }

        public void setOwner_type(int i) {
            this.owner_type = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Group group = (Group) obj;
            if (this.owner_type != group.owner_type || !Objects.equals(this.owner_name, group.owner_name) || !Objects.equals(this.group_id_str, group.group_id_str) || !Objects.equals(this.avatar_key, group.avatar_key) || !Objects.equals(this.avatar_url, group.avatar_url)) {
                return false;
            }
            return true;
        }
    }

    public static class Owner implements Serializable {
        private String avatar_key;
        private String avatar_url;
        private String en_name;
        private String name;
        private String user_id_str;

        public String getAvatar_key() {
            return this.avatar_key;
        }

        public String getAvatar_url() {
            return this.avatar_url;
        }

        public String getEn_name() {
            return this.en_name;
        }

        public String getName() {
            return this.name;
        }

        public String getUser_id_str() {
            return this.user_id_str;
        }

        public int hashCode() {
            return Objects.hash(this.name, this.en_name, this.user_id_str, this.avatar_url);
        }

        public void setAvatar_key(String str) {
            this.avatar_key = str;
        }

        public void setAvatar_url(String str) {
            this.avatar_url = str;
        }

        public void setEn_name(String str) {
            this.en_name = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setUser_id_str(String str) {
            this.user_id_str = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Owner owner = (Owner) obj;
            if (!Objects.equals(this.name, owner.name) || !Objects.equals(this.en_name, owner.en_name) || !Objects.equals(this.user_id_str, owner.user_id_str) || !Objects.equals(this.avatar_url, owner.avatar_url)) {
                return false;
            }
            return true;
        }
    }

    public List<Integer> getFile_types() {
        return this.file_types;
    }

    public List<Folder> getFolder() {
        return this.folder;
    }

    public String getFrom() {
        return this.from;
    }

    public List<Group> getGroup() {
        return this.group;
    }

    public String getHighlight() {
        return this.highlight;
    }

    public int getMain_page_option() {
        return this.main_page_option;
    }

    public List<Integer> getObj_types() {
        return this.obj_types;
    }

    public String getOpen_time() {
        return this.open_time;
    }

    public List<Owner> getOwner() {
        return this.owner;
    }

    public String getQuery() {
        return this.query;
    }

    public String getSource() {
        return this.source;
    }

    public List<Space> getSpace() {
        return this.space;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public boolean isOwn_by_user() {
        return this.own_by_user;
    }

    public boolean isSearch_quick_access() {
        return this.search_quick_access;
    }

    public void setFile_types(List<Integer> list) {
        this.file_types = list;
    }

    public void setFolder(List<Folder> list) {
        this.folder = list;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setGroup(List<Group> list) {
        this.group = list;
    }

    public void setHighlight(String str) {
        this.highlight = str;
    }

    public void setMain_page_option(int i) {
        this.main_page_option = i;
    }

    public void setObj_types(List<Integer> list) {
        this.obj_types = list;
    }

    public void setOpen_time(String str) {
        this.open_time = str;
    }

    public void setOwn_by_user(boolean z) {
        this.own_by_user = z;
    }

    public void setOwner(List<Owner> list) {
        this.owner = list;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setSearch_quick_access(boolean z) {
        this.search_quick_access = z;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSpace(List<Space> list) {
        this.space = list;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public static Owner account2Owner(AccountService.Account account) {
        Owner owner2 = new Owner();
        owner2.setUser_id_str(account.f14584a);
        owner2.setName(account.f14585b);
        owner2.setEn_name(account.f14596m);
        owner2.setAvatar_url(account.f14589f);
        return owner2;
    }

    public static Group chatInfo2Group(ChatInfo chatInfo) {
        Group group2 = new Group();
        group2.setGroup_id_str(chatInfo.getChatId());
        group2.setOwner_type(chatInfo.getChatType());
        group2.setAvatar_url(chatInfo.getAvatarUrl());
        return group2;
    }

    public static ChatInfo group2ChaInfo(Group group2) {
        ChatInfo chatInfo = new ChatInfo();
        chatInfo.setChatId(group2.getGroup_id_str());
        chatInfo.setChatType(group2.getOwner_type());
        chatInfo.setAvatarUrl(group2.getAvatar_url());
        return chatInfo;
    }

    public static OwnerInfo owner2OwnerInfo(Owner owner2) {
        OwnerInfo ownerInfo = new OwnerInfo();
        ownerInfo.setOwnerId(owner2.getUser_id_str());
        ownerInfo.setAvatarUrl(owner2.getAvatar_url());
        return ownerInfo;
    }

    public static Owner ownerInfo2Owner(OwnerInfo ownerInfo) {
        Owner owner2 = new Owner();
        owner2.setUser_id_str(ownerInfo.getOwnerId());
        owner2.setAvatar_url(ownerInfo.getAvatarUrl());
        return owner2;
    }

    public void setOwnByUser(AccountService.Account account) {
        this.own_by_user = true;
        this.owner.clear();
        this.owner.add(account2Owner(account));
    }

    public void setAllWithOwner(List<OwnerInfo> list) {
        this.own_by_user = false;
        this.owner.clear();
        if (!C13657b.m55421a(list)) {
            for (OwnerInfo ownerInfo : list) {
                this.owner.add(ownerInfo2Owner(ownerInfo));
            }
        }
    }
}
