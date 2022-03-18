package com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese;

import java.io.Serializable;

public class RefreshTicketData implements Serializable {
    public boolean success;
    public String ticket;

    public String getTicket() {
        return this.ticket;
    }

    public boolean isSuccess() {
        return this.success;
    }
}
