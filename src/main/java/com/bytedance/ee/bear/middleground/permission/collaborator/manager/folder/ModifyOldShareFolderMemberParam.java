package com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder;

import java.io.Serializable;
import java.util.List;

public class ModifyOldShareFolderMemberParam implements Serializable {
    private List<Owner> owners;
    private String space_id;

    public static class Owner implements Serializable {
        private String id;
        private int perm;
        private int type;

        public String getId() {
            return this.id;
        }

        public int getPerm() {
            return this.perm;
        }

        public int getType() {
            return this.type;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setPerm(int i) {
            this.perm = i;
        }

        public void setType(int i) {
            this.type = i;
        }
    }

    public List<Owner> getOwners() {
        return this.owners;
    }

    public String getSpace_id() {
        return this.space_id;
    }

    public void setOwners(List<Owner> list) {
        this.owners = list;
    }

    public void setSpace_id(String str) {
        this.space_id = str;
    }
}
