package com.bytedance.ee.bear.bitable.card.model.jsmodel;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.bytedance.ee.bear.bitable.card.model.enums.ECardOperation;
import com.bytedance.ee.util.io.NonProguard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CardOperationModel implements NonProguard {
    @JSONField(serialzeFeatures = {SerializerFeature.WriteEnumUsingToString})
    private ECardOperation action;
    private String baseId;
    private PayloadBean payload;
    private String tableId;
    private long timestamp;
    private String transactionId;

    public static class PayloadBean implements NonProguard {
        private String baseId;
        private LinkSourceInfoBean linkSourceInfo;
        private String newRecordId;
        private boolean notify;
        private String oldRecordId;
        private String recordId;
        private String tableId;
        private TargetBean target;
        private String type;
        @JSONField(serialzeFeatures = {SerializerFeature.WriteMapNullValue})
        private Object value;

        @Retention(RetentionPolicy.SOURCE)
        public @interface EditType {
        }

        public static class LinkSourceInfoBean implements NonProguard {
            private String baseId;
            private String fieldId;
            private String recordId;
            private String tableId;

            public String getBaseId() {
                return this.baseId;
            }

            public String getFieldId() {
                return this.fieldId;
            }

            public String getRecordId() {
                return this.recordId;
            }

            public String getTableId() {
                return this.tableId;
            }

            public void setBaseId(String str) {
                this.baseId = str;
            }

            public void setFieldId(String str) {
                this.fieldId = str;
            }

            public void setRecordId(String str) {
                this.recordId = str;
            }

            public void setTableId(String str) {
                this.tableId = str;
            }

            public LinkSourceInfoBean(String str, String str2, String str3, String str4) {
                this.baseId = str;
                this.tableId = str2;
                this.recordId = str3;
                this.fieldId = str4;
            }
        }

        public static class TargetBean implements NonProguard {
            private String baseId;
            private String fieldId;
            private String recordId;
            private String tableId;
            private String viewId;

            public String getBaseId() {
                return this.baseId;
            }

            public String getFieldId() {
                return this.fieldId;
            }

            public String getRecordId() {
                return this.recordId;
            }

            public String getTableId() {
                return this.tableId;
            }

            public String getViewId() {
                return this.viewId;
            }

            public void setBaseId(String str) {
                this.baseId = str;
            }

            public void setFieldId(String str) {
                this.fieldId = str;
            }

            public void setRecordId(String str) {
                this.recordId = str;
            }

            public void setTableId(String str) {
                this.tableId = str;
            }

            public void setViewId(String str) {
                this.viewId = str;
            }

            public TargetBean(String str, String str2) {
                this.tableId = str;
                this.viewId = str2;
            }
        }

        public String getBaseId() {
            return this.baseId;
        }

        public LinkSourceInfoBean getLinkSourceInfo() {
            return this.linkSourceInfo;
        }

        public String getNewRecordId() {
            return this.newRecordId;
        }

        public String getOldRecordId() {
            return this.oldRecordId;
        }

        public String getRecordId() {
            return this.recordId;
        }

        public String getTableId() {
            return this.tableId;
        }

        public TargetBean getTarget() {
            return this.target;
        }

        public String getType() {
            return this.type;
        }

        public Object getValue() {
            return this.value;
        }

        public boolean isNotify() {
            return this.notify;
        }

        public void setBaseId(String str) {
            this.baseId = str;
        }

        public void setLinkSourceInfoBean(LinkSourceInfoBean linkSourceInfoBean) {
            this.linkSourceInfo = linkSourceInfoBean;
        }

        public void setNewRecordId(String str) {
            this.newRecordId = str;
        }

        public void setNotify(boolean z) {
            this.notify = z;
        }

        public void setOldRecordId(String str) {
            this.oldRecordId = str;
        }

        public void setRecordId(String str) {
            this.recordId = str;
        }

        public void setTableId(String str) {
            this.tableId = str;
        }

        public void setTarget(TargetBean targetBean) {
            this.target = targetBean;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setValue(Object obj) {
            this.value = obj;
        }
    }

    public ECardOperation getAction() {
        return this.action;
    }

    public String getBaseId() {
        return this.baseId;
    }

    public PayloadBean getPayload() {
        return this.payload;
    }

    public String getTableId() {
        return this.tableId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }

    public void setAction(ECardOperation eCardOperation) {
        this.action = eCardOperation;
    }

    public void setBaseId(String str) {
        this.baseId = str;
    }

    public void setPayload(PayloadBean payloadBean) {
        this.payload = payloadBean;
    }

    public void setTableId(String str) {
        this.tableId = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }

    public CardOperationModel(String str, String str2) {
        this.baseId = str;
        this.tableId = str2;
    }

    public CardOperationModel(String str, String str2, ECardOperation eCardOperation) {
        this.baseId = str;
        this.tableId = str2;
        this.action = eCardOperation;
    }
}
