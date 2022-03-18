package com.bytedance.ee.bear.search.model;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.larksuite.framework.utils.CollectionUtils;
import java.io.Serializable;
import java.util.List;

public class SearchHistoryResponse extends NetService.Result {
    private Data data;

    public static class Data implements Serializable {
        private List<SearchHistory> history;

        public List<SearchHistory> getHistory() {
            return this.history;
        }

        public void setHistory(List<SearchHistory> list) {
            this.history = list;
        }
    }

    public static class SearchHistory implements Serializable {
        private List<Integer> file_types;
        private List<SearchRecord.Folder> folder;
        private List<SearchRecord.Group> group;
        private int main_page_option;
        private List<Integer> obj_types;
        private String open_time;
        private boolean own_by_user;
        private List<SearchRecord.Owner> owner;
        private String query;
        private boolean search_quick_access;
        private List<SearchRecord.Space> space;
        private String user_id;

        public List<Integer> getFile_types() {
            return this.file_types;
        }

        public List<SearchRecord.Folder> getFolder() {
            return this.folder;
        }

        public List<SearchRecord.Group> getGroup() {
            return this.group;
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

        public List<SearchRecord.Owner> getOwner() {
            return this.owner;
        }

        public String getQuery() {
            return this.query;
        }

        public List<SearchRecord.Space> getSpace() {
            return this.space;
        }

        public String getUser_id() {
            return this.user_id;
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

        public void setFolder(List<SearchRecord.Folder> list) {
            this.folder = list;
        }

        public void setGroup(List<SearchRecord.Group> list) {
            this.group = list;
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

        public void setOwner(List<SearchRecord.Owner> list) {
            this.owner = list;
        }

        public void setQuery(String str) {
            this.query = str;
        }

        public void setSearch_quick_access(boolean z) {
            this.search_quick_access = z;
        }

        public void setSpace(List<SearchRecord.Space> list) {
            this.space = list;
        }

        public void setUser_id(String str) {
            this.user_id = str;
        }
    }

    @Override // com.bytedance.ee.bear.contract.NetService.Result
    public Data getData() {
        return this.data;
    }

    public void setData(Data data2) {
        this.data = data2;
    }

    public static SearchRecord searchHistory2SearchRecord(SearchHistory searchHistory) {
        SearchRecord searchRecord = new SearchRecord();
        searchRecord.setQuery(searchHistory.getQuery());
        if (!CollectionUtils.isEmpty(searchHistory.getOwner())) {
            searchRecord.setOwner(searchHistory.getOwner());
        }
        if (!CollectionUtils.isEmpty(searchHistory.getGroup())) {
            searchRecord.setGroup(searchHistory.getGroup());
        }
        if (!CollectionUtils.isEmpty(searchHistory.getFolder())) {
            searchRecord.setFolder(searchHistory.getFolder());
        }
        if (!CollectionUtils.isEmpty(searchHistory.getObj_types())) {
            searchRecord.setObj_types(searchHistory.getObj_types());
        }
        if (!CollectionUtils.isEmpty(searchHistory.getFile_types())) {
            searchRecord.setFile_types(searchHistory.getFile_types());
        }
        if (!CollectionUtils.isEmpty(searchHistory.getSpace())) {
            searchRecord.setSpace(searchHistory.getSpace());
        }
        searchRecord.setOpen_time(searchHistory.getOpen_time());
        searchRecord.setSearch_quick_access(searchHistory.isSearch_quick_access());
        searchRecord.setOwn_by_user(searchHistory.isOwn_by_user());
        searchRecord.setMain_page_option(searchHistory.getMain_page_option());
        return searchRecord;
    }
}
