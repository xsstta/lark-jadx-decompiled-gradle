package com.ss.android.lark.doc.entity;

import android.text.TextUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class DocCard implements AbstractC26248b<DocCard>, Serializable {
    private String docId;
    private Extra extra;
    private String groupId;
    private String messageId;
    private List<DocPermission> permissions;
    private DocPermission receiverPermission;
    private Boolean senderIsExternal;
    private String shareInfo;
    private long shareStatus;
    private boolean shouldRender;
    private DocPermission userPermission;

    public String getDocId() {
        return this.docId;
    }

    public Extra getExtra() {
        return this.extra;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public DocPermission getReceiverPermission() {
        return this.receiverPermission;
    }

    public String getShareInfo() {
        return this.shareInfo;
    }

    public long getShareStatus() {
        return this.shareStatus;
    }

    public DocPermission getUserPermission() {
        return this.userPermission;
    }

    public boolean isShouldRender() {
        return this.shouldRender;
    }

    public List<DocPermission> getPermissions() {
        List<DocPermission> list = this.permissions;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public boolean getSenderIsExternal() {
        Boolean bool = this.senderIsExternal;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public boolean isEmpty() {
        if (TextUtils.isEmpty(this.messageId) || TextUtils.isEmpty(this.docId)) {
            return true;
        }
        return false;
    }

    public DocPermission getCurrentDocPerm() {
        if (this.permissions.size() == 1) {
            return this.permissions.get(0);
        }
        for (DocPermission docPermission : this.permissions) {
            if (docPermission.isSet()) {
                return docPermission;
            }
        }
        DocPermission docPermission2 = new DocPermission();
        docPermission2.setIsSet(true);
        docPermission2.setRead(true);
        return docPermission2;
    }

    public String toString() {
        return "shouldRender" + this.shouldRender + "sharedStatus" + this.shareStatus + "permissions().size()" + getPermissions().size();
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.docId;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        List<DocPermission> list = this.permissions;
        if (list != null) {
            i2 = 0;
            for (DocPermission docPermission : list) {
                i2 += docPermission.hashCode();
            }
        } else {
            i2 = 0;
        }
        int i5 = ((i * 31) + i2) * 31;
        String str2 = this.shareInfo;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        DocPermission docPermission2 = this.userPermission;
        if (docPermission2 != null) {
            i4 = docPermission2.hashCode();
        }
        return ((i6 + i4) * 31) + ((int) this.shareStatus);
    }

    public void setDocId(String str) {
        this.docId = str;
    }

    public void setExtra(Extra extra2) {
        this.extra = extra2;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setPermissions(List<DocPermission> list) {
        this.permissions = list;
    }

    public void setReceiverPermission(DocPermission docPermission) {
        this.receiverPermission = docPermission;
    }

    public void setSenderIsExternal(Boolean bool) {
        this.senderIsExternal = bool;
    }

    public void setShareInfo(String str) {
        this.shareInfo = str;
    }

    public void setShareStatus(long j) {
        this.shareStatus = j;
    }

    public void setShouldRender(boolean z) {
        this.shouldRender = z;
    }

    public void setUserPermission(DocPermission docPermission) {
        this.userPermission = docPermission;
    }

    public boolean isItemSame(DocCard docCard) {
        String str;
        String str2 = this.messageId;
        if (docCard == null) {
            str = "";
        } else {
            str = docCard.getMessageId();
        }
        return TextUtils.equals(str2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return isContentSame((DocCard) obj);
    }

    private boolean permissionEquals(List<DocPermission> list) {
        boolean z;
        if (list == null && this.permissions == null) {
            return true;
        }
        if (list == null || this.permissions == null) {
            return false;
        }
        for (DocPermission docPermission : list) {
            Iterator<DocPermission> it = this.permissions.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (docPermission.equals(it.next())) {
                        z = true;
                        continue;
                        break;
                    }
                } else {
                    z = false;
                    continue;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public boolean isContentSame(DocCard docCard) {
        if (docCard != null && TextUtils.equals(this.docId, docCard.getDocId()) && TextUtils.equals(this.shareInfo, docCard.getShareInfo()) && Objects.equals(this.userPermission, docCard.userPermission) && this.shareStatus == docCard.getShareStatus()) {
            return permissionEquals(docCard.getPermissions());
        }
        return false;
    }
}
