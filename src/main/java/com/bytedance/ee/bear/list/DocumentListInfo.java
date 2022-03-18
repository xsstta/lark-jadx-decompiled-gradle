package com.bytedance.ee.bear.list;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import java.util.ArrayList;
import java.util.HashMap;

public class DocumentListInfo extends NetService.Result {
    private boolean all_visited;
    private String checkId;
    private ArrayList<Document> documentList;
    private HashMap<String, Document> fakeTokenMap;
    private boolean hasMore;
    private boolean has_hidden;
    private String lastLabel;
    private String nextId;
    private Document parent;
    private ShareFolderUserPermission parentPermission;
    private int total;

    public String getCheckId() {
        return this.checkId;
    }

    public ArrayList<Document> getDocumentList() {
        return this.documentList;
    }

    public HashMap<String, Document> getFakeTokenMap() {
        return this.fakeTokenMap;
    }

    public String getLastLabel() {
        return this.lastLabel;
    }

    public String getNextId() {
        return this.nextId;
    }

    public Document getParent() {
        return this.parent;
    }

    public ShareFolderUserPermission getParentPermission() {
        return this.parentPermission;
    }

    public int getTotal() {
        return this.total;
    }

    public boolean isAll_visited() {
        return this.all_visited;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public boolean isHas_hidden() {
        return this.has_hidden;
    }

    public String toString() {
        return "DocumentListInfo{documentList= " + this.documentList + ", fakeTokenMap= " + this.fakeTokenMap + ", hasMore= " + this.hasMore + ", total= " + this.total + ", checkId= " + this.checkId + ", nextId= " + this.nextId + ", all_visited= " + this.all_visited + ", has_hidden= " + this.has_hidden + "} " + super.toString();
    }

    public void setAll_visited(boolean z) {
        this.all_visited = z;
    }

    public void setCheckId(String str) {
        this.checkId = str;
    }

    public void setDocumentList(ArrayList<Document> arrayList) {
        this.documentList = arrayList;
    }

    public void setFakeTokenMap(HashMap<String, Document> hashMap) {
        this.fakeTokenMap = hashMap;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setHas_hidden(boolean z) {
        this.has_hidden = z;
    }

    public void setLastLabel(String str) {
        this.lastLabel = str;
    }

    public void setNextId(String str) {
        this.nextId = str;
    }

    public void setParent(Document document) {
        this.parent = document;
    }

    public void setParentPermission(ShareFolderUserPermission shareFolderUserPermission) {
        this.parentPermission = shareFolderUserPermission;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
