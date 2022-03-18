package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FollowState extends Message<FollowState, C50577a> {
    public static final ProtoAdapter<FollowState> ADAPTER = new C50578b();
    public static final FollowDataType DEFAULT_DATA_TYPE = FollowDataType.FOLLOW_DATA_UNKNOWN;
    private static final long serialVersionUID = 0;
    public final FollowDataType data_type;
    public final String sender;
    public final FollowWebData web_data;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowState$b */
    private static final class C50578b extends ProtoAdapter<FollowState> {
        C50578b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowState.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowState followState) {
            int i;
            int encodedSizeWithTag = FollowDataType.ADAPTER.encodedSizeWithTag(1, followState.data_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, followState.sender);
            if (followState.web_data != null) {
                i = FollowWebData.ADAPTER.encodedSizeWithTag(10, followState.web_data);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + followState.unknownFields().size();
        }

        /* renamed from: a */
        public FollowState decode(ProtoReader protoReader) throws IOException {
            C50577a aVar = new C50577a();
            aVar.f126260a = FollowDataType.FOLLOW_DATA_UNKNOWN;
            aVar.f126261b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126260a = FollowDataType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126261b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 10) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126262c = FollowWebData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FollowState followState) throws IOException {
            FollowDataType.ADAPTER.encodeWithTag(protoWriter, 1, followState.data_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, followState.sender);
            if (followState.web_data != null) {
                FollowWebData.ADAPTER.encodeWithTag(protoWriter, 10, followState.web_data);
            }
            protoWriter.writeBytes(followState.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50577a newBuilder() {
        C50577a aVar = new C50577a();
        aVar.f126260a = this.data_type;
        aVar.f126261b = this.sender;
        aVar.f126262c = this.web_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowState$a */
    public static final class C50577a extends Message.Builder<FollowState, C50577a> {

        /* renamed from: a */
        public FollowDataType f126260a;

        /* renamed from: b */
        public String f126261b;

        /* renamed from: c */
        public FollowWebData f126262c;

        /* renamed from: a */
        public FollowState build() {
            String str;
            FollowDataType followDataType = this.f126260a;
            if (followDataType != null && (str = this.f126261b) != null) {
                return new FollowState(followDataType, str, this.f126262c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(followDataType, "data_type", this.f126261b, "sender");
        }

        /* renamed from: a */
        public C50577a mo175112a(FollowDataType followDataType) {
            this.f126260a = followDataType;
            return this;
        }

        /* renamed from: a */
        public C50577a mo175113a(FollowWebData followWebData) {
            this.f126262c = followWebData;
            return this;
        }

        /* renamed from: a */
        public C50577a mo175114a(String str) {
            this.f126261b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FollowState");
        StringBuilder sb = new StringBuilder();
        sb.append(", data_type=");
        sb.append(this.data_type);
        sb.append(", sender=");
        sb.append(this.sender);
        if (this.web_data != null) {
            sb.append(", web_data=");
            sb.append(this.web_data);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowState{");
        replace.append('}');
        return replace.toString();
    }

    public FollowState(FollowDataType followDataType, String str, FollowWebData followWebData) {
        this(followDataType, str, followWebData, ByteString.EMPTY);
    }

    public FollowState(FollowDataType followDataType, String str, FollowWebData followWebData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data_type = followDataType;
        this.sender = str;
        this.web_data = followWebData;
    }
}
