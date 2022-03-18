package com.bytedance.ee.bear.bitable.card.model.jsmodel.permission;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/PermissionRequestBean;", "Lcom/bytedance/ee/util/io/NonProguard;", "entity", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/PermissionEntity;", "operation", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/OperationType;", "param", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/ParamBean;", "(Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/PermissionEntity;Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/OperationType;Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/ParamBean;)V", "getEntity", "()Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/PermissionEntity;", "setEntity", "(Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/PermissionEntity;)V", "getOperation", "()Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/OperationType;", "setOperation", "(Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/OperationType;)V", "getParam", "()Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/ParamBean;", "setParam", "(Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/ParamBean;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PermissionRequestBean implements NonProguard {
    private PermissionEntity entity;
    private OperationType operation;
    private ParamBean param;

    public PermissionRequestBean() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PermissionRequestBean copy$default(PermissionRequestBean permissionRequestBean, PermissionEntity permissionEntity, OperationType operationType, ParamBean paramBean, int i, Object obj) {
        if ((i & 1) != 0) {
            permissionEntity = permissionRequestBean.entity;
        }
        if ((i & 2) != 0) {
            operationType = permissionRequestBean.operation;
        }
        if ((i & 4) != 0) {
            paramBean = permissionRequestBean.param;
        }
        return permissionRequestBean.copy(permissionEntity, operationType, paramBean);
    }

    public final PermissionEntity component1() {
        return this.entity;
    }

    public final OperationType component2() {
        return this.operation;
    }

    public final ParamBean component3() {
        return this.param;
    }

    public final PermissionRequestBean copy(PermissionEntity permissionEntity, OperationType operationType, ParamBean paramBean) {
        return new PermissionRequestBean(permissionEntity, operationType, paramBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionRequestBean)) {
            return false;
        }
        PermissionRequestBean permissionRequestBean = (PermissionRequestBean) obj;
        return Intrinsics.areEqual(this.entity, permissionRequestBean.entity) && Intrinsics.areEqual(this.operation, permissionRequestBean.operation) && Intrinsics.areEqual(this.param, permissionRequestBean.param);
    }

    public int hashCode() {
        PermissionEntity permissionEntity = this.entity;
        int i = 0;
        int hashCode = (permissionEntity != null ? permissionEntity.hashCode() : 0) * 31;
        OperationType operationType = this.operation;
        int hashCode2 = (hashCode + (operationType != null ? operationType.hashCode() : 0)) * 31;
        ParamBean paramBean = this.param;
        if (paramBean != null) {
            i = paramBean.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "PermissionRequestBean(entity=" + this.entity + ", operation=" + this.operation + ", param=" + this.param + ")";
    }

    public final PermissionEntity getEntity() {
        return this.entity;
    }

    public final OperationType getOperation() {
        return this.operation;
    }

    public final ParamBean getParam() {
        return this.param;
    }

    public final void setEntity(PermissionEntity permissionEntity) {
        this.entity = permissionEntity;
    }

    public final void setOperation(OperationType operationType) {
        this.operation = operationType;
    }

    public final void setParam(ParamBean paramBean) {
        this.param = paramBean;
    }

    public PermissionRequestBean(PermissionEntity permissionEntity, OperationType operationType, ParamBean paramBean) {
        this.entity = permissionEntity;
        this.operation = operationType;
        this.param = paramBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PermissionRequestBean(PermissionEntity permissionEntity, OperationType operationType, ParamBean paramBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : permissionEntity, (i & 2) != 0 ? null : operationType, (i & 4) != 0 ? null : paramBean);
    }
}
