package com.ss.android.lark.team.entity;

import java.io.Serializable;
import java.util.List;

public class ReorderItemsRequest implements Serializable {
    private static final long serialVersionUID = -6434635710493837330L;
    private List<OrderChange> newOrder;
    private long parentId;

    public static class OrderChange implements Serializable {
        private static final long serialVersionUID = 535503733554705892L;
        private long itemId;
        private long preItemId;

        public long getItemId() {
            return this.itemId;
        }

        public long getPreItemId() {
            return this.preItemId;
        }

        public void setItemId(long j) {
            this.itemId = j;
        }

        public void setPreItemId(long j) {
            this.preItemId = j;
        }
    }

    public List<OrderChange> getNewOrder() {
        return this.newOrder;
    }

    public long getParentId() {
        return this.parentId;
    }

    public void setNewOrder(List<OrderChange> list) {
        this.newOrder = list;
    }

    public void setParentId(long j) {
        this.parentId = j;
    }
}
