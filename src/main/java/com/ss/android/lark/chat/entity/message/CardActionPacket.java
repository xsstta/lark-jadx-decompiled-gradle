package com.ss.android.lark.chat.entity.message;

import com.ss.android.lark.chat.entity.message.CardAction;
import java.io.Serializable;
import okio.ByteString;

public class CardActionPacket implements Serializable {
    private String cid;
    private CardAction.Parameters parameters;
    private ByteString payload;

    public String getCid() {
        return this.cid;
    }

    public CardAction.Parameters getParameters() {
        return this.parameters;
    }

    public ByteString getPayload() {
        return this.payload;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setParameters(CardAction.Parameters parameters2) {
        this.parameters = parameters2;
    }

    public void setPayload(ByteString byteString) {
        this.payload = byteString;
    }
}
