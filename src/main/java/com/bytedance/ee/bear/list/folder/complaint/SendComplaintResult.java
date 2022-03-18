package com.bytedance.ee.bear.list.folder.complaint;

import com.bytedance.ee.bear.contract.NetService;

public class SendComplaintResult extends NetService.Result {
    private int complaintId;

    public int getComplaintId() {
        return this.complaintId;
    }

    public void setComplaintId(int i) {
        this.complaintId = i;
    }
}
