package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/bean/Result;", "DATA", "Ljava/io/Serializable;", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "()Ljava/io/Serializable;", "setData", "(Ljava/io/Serializable;)V", "Ljava/io/Serializable;", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public class Result<DATA extends Serializable> implements Serializable {
    private int code;
    private DATA data;
    private String msg;

    public final int getCode() {
        return this.code;
    }

    public final DATA getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(DATA data2) {
        this.data = data2;
    }

    public final void setMsg(String str) {
        this.msg = str;
    }
}
