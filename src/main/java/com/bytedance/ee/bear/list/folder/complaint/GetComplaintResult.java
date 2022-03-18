package com.bytedance.ee.bear.list.folder.complaint;

import com.bytedance.ee.bear.contract.NetService;

public class GetComplaintResult extends NetService.Result<Integer> {
    int result;

    public int getResult() {
        return this.result;
    }

    public void setResult(int i) {
        this.result = i;
    }
}
