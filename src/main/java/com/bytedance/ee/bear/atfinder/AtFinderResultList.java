package com.bytedance.ee.bear.atfinder;

import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.util.io.NonProguard;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class AtFinderResultList implements NonProguard {
    private DATA data;

    public String toString() {
        return "AtFinderResultList{}";
    }

    public static class DATA implements Serializable {
        private ENTITIES entities;
        private List<AtObject> result_list;

        public ENTITIES getEntities() {
            return this.entities;
        }

        public List<AtObject> getResult_list() {
            return this.result_list;
        }

        public String toString() {
            return "DATA{result_list=" + this.result_list + ", entities=" + this.entities + '}';
        }

        public void setEntities(ENTITIES entities2) {
            this.entities = entities2;
        }

        public void setResult_list(List<AtObject> list) {
            this.result_list = list;
        }
    }

    public static class ENTITIES implements Serializable {
        private Map<String, AtObject> chats;
        private Map<String, AtObject> groups;
        private Map<String, AtObject> notes;
        private Map<String, AtObject> users;

        public String toString() {
            return "ENTITIES{}";
        }

        public Map<String, AtObject> getChats() {
            return this.chats;
        }

        public Map<String, AtObject> getGroups() {
            return this.groups;
        }

        public Map<String, AtObject> getNotes() {
            return this.notes;
        }

        public Map<String, AtObject> getUsers() {
            return this.users;
        }

        public void setChats(Map<String, AtObject> map) {
            this.chats = map;
        }

        public void setGroups(Map<String, AtObject> map) {
            this.groups = map;
        }

        public void setNotes(Map<String, AtObject> map) {
            this.notes = map;
        }

        public void setUsers(Map<String, AtObject> map) {
            this.users = map;
        }
    }

    public AtFinderResultList() {
    }

    public DATA getData() {
        return this.data;
    }

    public void setData(DATA data2) {
        this.data = data2;
    }

    public AtFinderResultList(DATA data2) {
        this.data = data2;
    }
}
