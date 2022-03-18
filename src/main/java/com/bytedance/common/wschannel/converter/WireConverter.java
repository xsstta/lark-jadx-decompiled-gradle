package com.bytedance.common.wschannel.converter;

import com.bytedance.common.wschannel.model.Frame;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.squareup.wire.Wire;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

class WireConverter implements MsgConverter {
    WireConverter() {
    }

    @Override // com.bytedance.common.wschannel.converter.MsgConverter
    public WsChannelMsg decode(byte[] bArr) throws IOException {
        Frame decode = Frame.ADAPTER.decode(bArr);
        long longValue = ((Long) Wire.get(decode.seqid, Frame.DEFAULT_SEQID)).longValue();
        long longValue2 = ((Long) Wire.get(decode.logid, Frame.DEFAULT_LOGID)).longValue();
        int intValue = ((Integer) Wire.get(decode.service, Frame.DEFAULT_SERVICE)).intValue();
        int intValue2 = ((Integer) Wire.get(decode.method, Frame.DEFAULT_METHOD)).intValue();
        List<Frame.ExtendedEntry> list = (List) Wire.get(decode.headers, Collections.emptyList());
        String str = (String) Wire.get(decode.payload_encoding, "");
        String str2 = (String) Wire.get(decode.payload_type, "");
        byte[] byteArray = ((ByteString) Wire.get(decode.payload, Frame.DEFAULT_PAYLOAD)).toByteArray();
        WsChannelMsg wsChannelMsg = new WsChannelMsg();
        wsChannelMsg.setLogId(longValue2);
        wsChannelMsg.setSeqId(longValue);
        wsChannelMsg.setService(intValue);
        wsChannelMsg.setMethod(intValue2);
        if (list != null && list.size() >= 0) {
            ArrayList arrayList = new ArrayList();
            for (Frame.ExtendedEntry extendedEntry : list) {
                WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                msgHeader.setKey((String) Wire.get(extendedEntry.key, ""));
                msgHeader.setValue((String) Wire.get(extendedEntry.value, ""));
                arrayList.add(msgHeader);
            }
            wsChannelMsg.setMsgHeaders(arrayList);
        }
        wsChannelMsg.setPayloadEncoding(str);
        wsChannelMsg.setPayloadType(str2);
        wsChannelMsg.setPayload(byteArray);
        return wsChannelMsg;
    }

    @Override // com.bytedance.common.wschannel.converter.MsgConverter
    public byte[] encode(WsChannelMsg wsChannelMsg) {
        ByteString byteString;
        if (wsChannelMsg == null) {
            return null;
        }
        if (wsChannelMsg.getPayload() != null) {
            byteString = ByteString.of(wsChannelMsg.getPayload());
        } else {
            byteString = ByteString.EMPTY;
        }
        Frame.Builder method = new Frame.Builder().logid(Long.valueOf(wsChannelMsg.getLogId())).seqid(Long.valueOf(wsChannelMsg.getSeqId())).service(Integer.valueOf(wsChannelMsg.getService())).payload_encoding(wsChannelMsg.getPayloadEncoding()).payload_type(wsChannelMsg.getPayloadType()).payload(byteString).method(Integer.valueOf(wsChannelMsg.getMethod()));
        List<WsChannelMsg.MsgHeader> msgHeaders = wsChannelMsg.getMsgHeaders();
        ArrayList arrayList = new ArrayList();
        if (msgHeaders != null) {
            for (WsChannelMsg.MsgHeader msgHeader : msgHeaders) {
                arrayList.add(new Frame.ExtendedEntry.Builder().key(msgHeader.getKey()).value(msgHeader.getValue()).build());
            }
        }
        if (!arrayList.isEmpty()) {
            method.headers(arrayList);
        }
        return Frame.ADAPTER.encode(method.build());
    }
}
