package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetShortcutsRequest extends Message<GetShortcutsRequest, C17188a> {
    public static final ProtoAdapter<GetShortcutsRequest> ADAPTER = new C17189b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Boolean DEFAULT_STREAM_RESP_LATEST_DATA = false;
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Boolean stream_resp_latest_data;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetShortcutsRequest$b */
    private static final class C17189b extends ProtoAdapter<GetShortcutsRequest> {
        C17189b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetShortcutsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetShortcutsRequest getShortcutsRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getShortcutsRequest.count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getShortcutsRequest.count);
            } else {
                i = 0;
            }
            if (getShortcutsRequest.sync_data_strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getShortcutsRequest.sync_data_strategy);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getShortcutsRequest.stream_resp_latest_data != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getShortcutsRequest.stream_resp_latest_data);
            }
            return i4 + i3 + getShortcutsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetShortcutsRequest decode(ProtoReader protoReader) throws IOException {
            C17188a aVar = new C17188a();
            aVar.f43958a = 0;
            aVar.f43959b = SyncDataStrategy.FORCE_SERVER;
            aVar.f43960c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43958a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f43959b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43960c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetShortcutsRequest getShortcutsRequest) throws IOException {
            if (getShortcutsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getShortcutsRequest.count);
            }
            if (getShortcutsRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getShortcutsRequest.sync_data_strategy);
            }
            if (getShortcutsRequest.stream_resp_latest_data != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getShortcutsRequest.stream_resp_latest_data);
            }
            protoWriter.writeBytes(getShortcutsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetShortcutsRequest$a */
    public static final class C17188a extends Message.Builder<GetShortcutsRequest, C17188a> {

        /* renamed from: a */
        public Integer f43958a;

        /* renamed from: b */
        public SyncDataStrategy f43959b;

        /* renamed from: c */
        public Boolean f43960c;

        /* renamed from: a */
        public GetShortcutsRequest build() {
            return new GetShortcutsRequest(this.f43958a, this.f43959b, this.f43960c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17188a newBuilder() {
        C17188a aVar = new C17188a();
        aVar.f43958a = this.count;
        aVar.f43959b = this.sync_data_strategy;
        aVar.f43960c = this.stream_resp_latest_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetShortcutsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        if (this.stream_resp_latest_data != null) {
            sb.append(", stream_resp_latest_data=");
            sb.append(this.stream_resp_latest_data);
        }
        StringBuilder replace = sb.replace(0, 2, "GetShortcutsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetShortcutsRequest(Integer num, SyncDataStrategy syncDataStrategy, Boolean bool) {
        this(num, syncDataStrategy, bool, ByteString.EMPTY);
    }

    public GetShortcutsRequest(Integer num, SyncDataStrategy syncDataStrategy, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count = num;
        this.sync_data_strategy = syncDataStrategy;
        this.stream_resp_latest_data = bool;
    }
}
