package com.ss.android.lark.mm.module.player.speed.repo;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.mm.base.IMmSerializable;
import java.util.List;

public class SilenceResponse implements IMmSerializable {
    @JSONField(name = "details")
    private List<SilenceDetail> details;
    @JSONField(name = "toast")
    private String toast;
    @JSONField(name = "total")
    private Long total;

    public List<SilenceDetail> getDetails() {
        return this.details;
    }

    public String getToast() {
        return this.toast;
    }

    public Long getTotal() {
        return this.total;
    }

    public boolean isEmpty() {
        Long l = this.total;
        if (l == null || l.longValue() <= 0) {
            return true;
        }
        return false;
    }

    public void setDetails(List<SilenceDetail> list) {
        this.details = list;
    }

    public void setToast(String str) {
        this.toast = str;
    }

    public void setTotal(Long l) {
        this.total = l;
    }

    public static boolean validate(SilenceResponse silenceResponse) {
        if (silenceResponse == null || silenceResponse.details == null || silenceResponse.total == null) {
            return false;
        }
        return true;
    }
}
