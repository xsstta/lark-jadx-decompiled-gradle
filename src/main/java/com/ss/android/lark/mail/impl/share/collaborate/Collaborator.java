package com.ss.android.lark.mail.impl.share.collaborate;

import com.bytedance.lark.pb.email.client.v1.CollaboratorType;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.client.v1.UserPayload;
import java.io.Serializable;
import java.util.List;

public class Collaborator implements Serializable {
    public String avatar;
    public String cn_name;
    public PermissionCode code;
    public CollaboratorType collaboratorType;
    public String department;
    public String email_address;
    public String en_name;
    public List<PermissionCode> permissionActionList;
    public String user_id;

    public UserPayload toUserPayload() {
        return new UserPayload(this.user_id, this.code, this.collaboratorType);
    }

    public Collaborator(String str, CollaboratorType collaboratorType2) {
        this.user_id = str;
        this.collaboratorType = collaboratorType2;
    }
}
