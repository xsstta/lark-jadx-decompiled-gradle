package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0000R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData;", "Ljava/io/Serializable;", "()V", "bizDataList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData$BizData;", "getBizDataList", "()Ljava/util/List;", "copy", "BizData", "Type", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SchemaExtraData implements Serializable {
    private final List<BizData> bizDataList = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData$Type;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "RESOURCE_APPROVAL_INFO", "APPROVAL_REQUEST", "RESOURCE_STRATEGY", "RESOURCE_REQUISITION", "RESOURCE_CUSTOMIZATION", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Type {
        UNKNOWN(0),
        RESOURCE_APPROVAL_INFO(1),
        APPROVAL_REQUEST(2),
        RESOURCE_STRATEGY(3),
        RESOURCE_REQUISITION(4),
        RESOURCE_CUSTOMIZATION(5);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @JvmStatic
        public static final Type valueOf(int i) {
            return Companion.mo119977a(i);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData$Type$Companion;", "", "()V", "valueOf", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData$Type;", "value", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData$Type$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final Type mo119977a(int i) {
                if (i == 0) {
                    return Type.UNKNOWN;
                }
                if (i == 1) {
                    return Type.RESOURCE_APPROVAL_INFO;
                }
                if (i == 2) {
                    return Type.APPROVAL_REQUEST;
                }
                if (i == 3) {
                    return Type.RESOURCE_STRATEGY;
                }
                if (i == 4) {
                    return Type.RESOURCE_REQUISITION;
                }
                if (i != 5) {
                    return Type.UNKNOWN;
                }
                return Type.RESOURCE_CUSTOMIZATION;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010/\u001a\u00020\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData$BizData;", "Ljava/io/Serializable;", "()V", "approvalInfo", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceApprovalInfo;", "getApprovalInfo", "()Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceApprovalInfo;", "setApprovalInfo", "(Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceApprovalInfo;)V", "approverUserIdList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getApproverUserIdList", "()Ljava/util/ArrayList;", "createUserId", "getCreateUserId", "()Ljava/lang/String;", "setCreateUserId", "(Ljava/lang/String;)V", "reason", "getReason", "setReason", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "getResourceCustomization", "()Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "setResourceCustomization", "(Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;)V", "resourceRequisition", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceRequisition;", "getResourceRequisition", "()Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceRequisition;", "setResourceRequisition", "(Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceRequisition;)V", "resourceStrategy", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceStrategy;", "getResourceStrategy", "()Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceStrategy;", "setResourceStrategy", "(Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceStrategy;)V", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData$Type;", "getType", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData$Type;", "setType", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData$Type;)V", "copy", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class BizData implements Serializable {
        private SchemaExtraData.ResourceApprovalInfo approvalInfo;
        private final ArrayList<String> approverUserIdList = new ArrayList<>();
        private String createUserId = "";
        private String reason = "";
        private SchemaExtraData.ResourceCustomization resourceCustomization;
        private SchemaExtraData.ResourceRequisition resourceRequisition;
        private SchemaExtraData.ResourceStrategy resourceStrategy;
        private Type type = Type.UNKNOWN;

        public final SchemaExtraData.ResourceApprovalInfo getApprovalInfo() {
            return this.approvalInfo;
        }

        public final ArrayList<String> getApproverUserIdList() {
            return this.approverUserIdList;
        }

        public final String getCreateUserId() {
            return this.createUserId;
        }

        public final String getReason() {
            return this.reason;
        }

        public final SchemaExtraData.ResourceCustomization getResourceCustomization() {
            return this.resourceCustomization;
        }

        public final SchemaExtraData.ResourceRequisition getResourceRequisition() {
            return this.resourceRequisition;
        }

        public final SchemaExtraData.ResourceStrategy getResourceStrategy() {
            return this.resourceStrategy;
        }

        public final Type getType() {
            return this.type;
        }

        public final BizData copy() {
            SchemaExtraData.ResourceCustomization resourceCustomization2;
            SchemaExtraData.ResourceCustomization.C16010a newBuilder;
            BizData bizData = new BizData();
            bizData.type = this.type;
            bizData.approverUserIdList.addAll(this.approverUserIdList);
            bizData.approvalInfo = this.approvalInfo;
            bizData.reason = this.reason;
            bizData.createUserId = this.createUserId;
            bizData.resourceStrategy = this.resourceStrategy;
            bizData.resourceRequisition = this.resourceRequisition;
            SchemaExtraData.ResourceCustomization resourceCustomization3 = this.resourceCustomization;
            if (resourceCustomization3 == null || (newBuilder = resourceCustomization3.newBuilder()) == null) {
                resourceCustomization2 = null;
            } else {
                resourceCustomization2 = newBuilder.build();
            }
            bizData.resourceCustomization = resourceCustomization2;
            return bizData;
        }

        public final void setApprovalInfo(SchemaExtraData.ResourceApprovalInfo resourceApprovalInfo) {
            this.approvalInfo = resourceApprovalInfo;
        }

        public final void setResourceCustomization(SchemaExtraData.ResourceCustomization resourceCustomization2) {
            this.resourceCustomization = resourceCustomization2;
        }

        public final void setResourceRequisition(SchemaExtraData.ResourceRequisition resourceRequisition2) {
            this.resourceRequisition = resourceRequisition2;
        }

        public final void setResourceStrategy(SchemaExtraData.ResourceStrategy resourceStrategy2) {
            this.resourceStrategy = resourceStrategy2;
        }

        public final void setCreateUserId(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.createUserId = str;
        }

        public final void setReason(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.reason = str;
        }

        public final void setType(Type type2) {
            Intrinsics.checkParameterIsNotNull(type2, "<set-?>");
            this.type = type2;
        }
    }

    public final List<BizData> getBizDataList() {
        return this.bizDataList;
    }

    public final SchemaExtraData copy() {
        SchemaExtraData schemaExtraData = new SchemaExtraData();
        Iterator<T> it = this.bizDataList.iterator();
        while (it.hasNext()) {
            schemaExtraData.bizDataList.add(it.next().copy());
        }
        return schemaExtraData;
    }
}
