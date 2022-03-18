package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetVCTabHistoryListRequest extends Message<GetVCTabHistoryListRequest, C50693a> {
    public static final ProtoAdapter<GetVCTabHistoryListRequest> ADAPTER = new C50694b();
    public static final Long DEFAULT_MAX_NUM = 0L;
    public static final Boolean DEFAULT_SUPPORT_CAL = false;
    private static final long serialVersionUID = 0;
    public final String history_id;
    public final Long max_num;
    public final Boolean support_cal;
    public final String time_zone;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVCTabHistoryListRequest$b */
    private static final class C50694b extends ProtoAdapter<GetVCTabHistoryListRequest> {
        C50694b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVCTabHistoryListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVCTabHistoryListRequest getVCTabHistoryListRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getVCTabHistoryListRequest.history_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getVCTabHistoryListRequest.history_id);
            } else {
                i = 0;
            }
            if (getVCTabHistoryListRequest.max_num != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, getVCTabHistoryListRequest.max_num);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (getVCTabHistoryListRequest.time_zone != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getVCTabHistoryListRequest.time_zone);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getVCTabHistoryListRequest.support_cal != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getVCTabHistoryListRequest.support_cal);
            }
            return i6 + i4 + getVCTabHistoryListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetVCTabHistoryListRequest decode(ProtoReader protoReader) throws IOException {
            C50693a aVar = new C50693a();
            aVar.f126422a = "";
            aVar.f126423b = 0L;
            aVar.f126424c = "";
            aVar.f126425d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126422a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126423b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126424c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126425d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVCTabHistoryListRequest getVCTabHistoryListRequest) throws IOException {
            if (getVCTabHistoryListRequest.history_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getVCTabHistoryListRequest.history_id);
            }
            if (getVCTabHistoryListRequest.max_num != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getVCTabHistoryListRequest.max_num);
            }
            if (getVCTabHistoryListRequest.time_zone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getVCTabHistoryListRequest.time_zone);
            }
            if (getVCTabHistoryListRequest.support_cal != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getVCTabHistoryListRequest.support_cal);
            }
            protoWriter.writeBytes(getVCTabHistoryListRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVCTabHistoryListRequest$a */
    public static final class C50693a extends Message.Builder<GetVCTabHistoryListRequest, C50693a> {

        /* renamed from: a */
        public String f126422a;

        /* renamed from: b */
        public Long f126423b;

        /* renamed from: c */
        public String f126424c;

        /* renamed from: d */
        public Boolean f126425d;

        /* renamed from: a */
        public GetVCTabHistoryListRequest build() {
            return new GetVCTabHistoryListRequest(this.f126422a, this.f126423b, this.f126424c, this.f126425d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50693a newBuilder() {
        C50693a aVar = new C50693a();
        aVar.f126422a = this.history_id;
        aVar.f126423b = this.max_num;
        aVar.f126424c = this.time_zone;
        aVar.f126425d = this.support_cal;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVCTabHistoryListRequest");
        StringBuilder sb = new StringBuilder();
        if (this.history_id != null) {
            sb.append(", history_id=");
            sb.append(this.history_id);
        }
        if (this.max_num != null) {
            sb.append(", max_num=");
            sb.append(this.max_num);
        }
        if (this.time_zone != null) {
            sb.append(", time_zone=");
            sb.append(this.time_zone);
        }
        if (this.support_cal != null) {
            sb.append(", support_cal=");
            sb.append(this.support_cal);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVCTabHistoryListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetVCTabHistoryListRequest(String str, Long l, String str2, Boolean bool) {
        this(str, l, str2, bool, ByteString.EMPTY);
    }

    public GetVCTabHistoryListRequest(String str, Long l, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.history_id = str;
        this.max_num = l;
        this.time_zone = str2;
        this.support_cal = bool;
    }
}
