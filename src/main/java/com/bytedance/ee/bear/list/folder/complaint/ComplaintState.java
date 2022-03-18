package com.bytedance.ee.bear.list.folder.complaint;

public enum ComplaintState {
    IN_THE_COMPLAINT(0),
    COMPLAINT_SUCCESS(1),
    COMPLAINT_FAIL(2);
    
    int result;

    public int getResult() {
        return this.result;
    }

    private ComplaintState(int i) {
        this.result = i;
    }
}
