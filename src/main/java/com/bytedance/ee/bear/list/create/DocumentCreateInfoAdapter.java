package com.bytedance.ee.bear.list.create;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.DocumentCreateHelper;
import com.bytedance.ee.util.io.NonProguard;

public class DocumentCreateInfoAdapter extends NetService.Result<InnerData> {

    public static class InnerData implements NonProguard {
        @JSONField(name = "is_share_folder")
        boolean isShareFolder;
        @JSONField(name = "obj_token")
        String objToken;
        @JSONField(name = "obj_type")
        int objType;
        @JSONField(name = "obj_url")
        String objUrl;
        @JSONField(name = "owner_type")
        int ownerType;
        @JSONField(name = "template_token")
        String templateToken;
        @JSONField(name = "title")
        String title;
        String token;
        int type;

        @JSONField(name = "obj_token")
        public String getObjToken() {
            return this.objToken;
        }

        @JSONField(name = "obj_type")
        public int getObjType() {
            return this.objType;
        }

        @JSONField(name = "obj_url")
        public String getObjUrl() {
            return this.objUrl;
        }

        @JSONField(name = "owner_type")
        public int getOwnerType() {
            return this.ownerType;
        }

        @JSONField(name = "template_token")
        public String getTemplateToken() {
            return this.templateToken;
        }

        @JSONField(name = "title")
        public String getTitle() {
            return this.title;
        }

        public String getToken() {
            return this.token;
        }

        public int getType() {
            return this.type;
        }

        @JSONField(name = "is_share_folder")
        public boolean isShareFolder() {
            return this.isShareFolder;
        }

        @JSONField(name = "obj_token")
        public void setObjToken(String str) {
            this.objToken = str;
        }

        @JSONField(name = "obj_type")
        public void setObjType(int i) {
            this.objType = i;
        }

        @JSONField(name = "obj_url")
        public void setObjUrl(String str) {
            this.objUrl = str;
        }

        @JSONField(name = "owner_type")
        public void setOwnerType(int i) {
            this.ownerType = i;
        }

        @JSONField(name = "is_share_folder")
        public void setShareFolder(boolean z) {
            this.isShareFolder = z;
        }

        @JSONField(name = "template_token")
        public void setTemplateToken(String str) {
            this.templateToken = str;
        }

        @JSONField(name = "title")
        public void setTitle(String str) {
            this.title = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setType(int i) {
            this.type = i;
        }
    }

    public DocumentCreateHelper.DocumentCreateEntity toDocumentCreateInfo() {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        boolean z;
        int i2;
        DocumentCreateHelper.DocumentCreateEntity documentCreateEntity = new DocumentCreateHelper.DocumentCreateEntity();
        documentCreateEntity.code = this.code;
        documentCreateEntity.msg = this.msg;
        String str5 = "";
        if (this.data == null) {
            str = str5;
        } else {
            str = ((InnerData) this.data).token;
        }
        documentCreateEntity.token = str;
        if (this.data == null) {
            str2 = str5;
        } else {
            str2 = ((InnerData) this.data).objToken;
        }
        documentCreateEntity.objToken = str2;
        if (this.data == null) {
            str3 = str5;
        } else {
            str3 = ((InnerData) this.data).templateToken;
        }
        documentCreateEntity.templateToken = str3;
        if (this.data == null) {
            str4 = str5;
        } else {
            str4 = ((InnerData) this.data).title;
        }
        documentCreateEntity.title = str4;
        if (this.data != null) {
            str5 = ((InnerData) this.data).objUrl;
        }
        documentCreateEntity.url = str5;
        int i3 = 0;
        if (this.data == null) {
            i = 0;
        } else {
            i = ((InnerData) this.data).ownerType;
        }
        documentCreateEntity.ownerType = i;
        if (this.data == null) {
            z = false;
        } else {
            z = ((InnerData) this.data).isShareFolder;
        }
        documentCreateEntity.isShareFolder = z;
        if (this.data == null) {
            i2 = 0;
        } else {
            i2 = ((InnerData) this.data).type;
        }
        documentCreateEntity.type = i2;
        if (this.data != null) {
            i3 = ((InnerData) this.data).objType;
        }
        documentCreateEntity.objType = i3;
        return documentCreateEntity;
    }
}
