package com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004J\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\r\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004J\u0010\u0010\u0014\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0015\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0015\u0010\u0016\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/SendLinkParams;", "Ljava/io/Serializable;", "()V", "members", "", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/SendLinkParams$MembersBean;", "remark", "", "token", ShareHitPoint.f121869d, "", "Ljava/lang/Integer;", "getMembers", "getRemark", "getToken", "getType", "()Ljava/lang/Integer;", "setMembers", "", "owners", "setRemark", "setToken", "setType", "(Ljava/lang/Integer;)V", "MembersBean", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SendLinkParams implements Serializable {
    private List<MembersBean> members;
    private String remark;
    private String token;
    private Integer type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/SendLinkParams$MembersBean;", "Ljava/io/Serializable;", "()V", "owner_id", "", "getOwner_id", "()Ljava/lang/String;", "setOwner_id", "(Ljava/lang/String;)V", "owner_type", "", "getOwner_type", "()Ljava/lang/Integer;", "setOwner_type", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class MembersBean implements Serializable {
        private String owner_id;
        private Integer owner_type;

        public final String getOwner_id() {
            return this.owner_id;
        }

        public final Integer getOwner_type() {
            return this.owner_type;
        }

        public final void setOwner_id(String str) {
            this.owner_id = str;
        }

        public final void setOwner_type(Integer num) {
            this.owner_type = num;
        }
    }

    public final List<MembersBean> getMembers() {
        return this.members;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final String getToken() {
        return this.token;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setMembers(List<MembersBean> list) {
        this.members = list;
    }

    public final void setRemark(String str) {
        this.remark = str;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setType(Integer num) {
        this.type = num;
    }
}
