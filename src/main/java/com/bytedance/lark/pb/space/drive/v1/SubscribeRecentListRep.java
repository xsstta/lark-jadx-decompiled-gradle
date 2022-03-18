package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SubscribeRecentListRep extends Message<SubscribeRecentListRep, C19393a> {
    public static final ProtoAdapter<SubscribeRecentListRep> ADAPTER = new C19394b();
    public static final Boolean DEFAULT_RESULT = false;
    public static final ResultType DEFAULT_RESULT_TYPE = ResultType.ResultType_SUCCESS;
    private static final long serialVersionUID = 0;
    public final Boolean result;
    public final String result_msg;
    public final ResultType result_type;
    public final String subsc_sign;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.SubscribeRecentListRep$b */
    private static final class C19394b extends ProtoAdapter<SubscribeRecentListRep> {
        C19394b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeRecentListRep.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeRecentListRep subscribeRecentListRep) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, subscribeRecentListRep.result) + ResultType.ADAPTER.encodedSizeWithTag(2, subscribeRecentListRep.result_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, subscribeRecentListRep.result_msg);
            if (subscribeRecentListRep.subsc_sign != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, subscribeRecentListRep.subsc_sign);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + subscribeRecentListRep.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeRecentListRep decode(ProtoReader protoReader) throws IOException {
            C19393a aVar = new C19393a();
            aVar.f47687a = false;
            aVar.f47688b = ResultType.ResultType_SUCCESS;
            aVar.f47689c = "";
            aVar.f47690d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47687a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f47688b = ResultType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f47689c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47690d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubscribeRecentListRep subscribeRecentListRep) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, subscribeRecentListRep.result);
            ResultType.ADAPTER.encodeWithTag(protoWriter, 2, subscribeRecentListRep.result_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, subscribeRecentListRep.result_msg);
            if (subscribeRecentListRep.subsc_sign != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, subscribeRecentListRep.subsc_sign);
            }
            protoWriter.writeBytes(subscribeRecentListRep.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19393a newBuilder() {
        C19393a aVar = new C19393a();
        aVar.f47687a = this.result;
        aVar.f47688b = this.result_type;
        aVar.f47689c = this.result_msg;
        aVar.f47690d = this.subsc_sign;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.SubscribeRecentListRep$a */
    public static final class C19393a extends Message.Builder<SubscribeRecentListRep, C19393a> {

        /* renamed from: a */
        public Boolean f47687a;

        /* renamed from: b */
        public ResultType f47688b;

        /* renamed from: c */
        public String f47689c;

        /* renamed from: d */
        public String f47690d;

        /* renamed from: a */
        public SubscribeRecentListRep build() {
            ResultType resultType;
            String str;
            Boolean bool = this.f47687a;
            if (bool != null && (resultType = this.f47688b) != null && (str = this.f47689c) != null) {
                return new SubscribeRecentListRep(bool, resultType, str, this.f47690d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "result", this.f47688b, "result_type", this.f47689c, "result_msg");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "SubscribeRecentListRep");
        StringBuilder sb = new StringBuilder();
        sb.append(", result=");
        sb.append(this.result);
        sb.append(", result_type=");
        sb.append(this.result_type);
        sb.append(", result_msg=");
        sb.append(this.result_msg);
        if (this.subsc_sign != null) {
            sb.append(", subsc_sign=");
            sb.append(this.subsc_sign);
        }
        StringBuilder replace = sb.replace(0, 2, "SubscribeRecentListRep{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeRecentListRep(Boolean bool, ResultType resultType, String str, String str2) {
        this(bool, resultType, str, str2, ByteString.EMPTY);
    }

    public SubscribeRecentListRep(Boolean bool, ResultType resultType, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = bool;
        this.result_type = resultType;
        this.result_msg = str;
        this.subsc_sign = str2;
    }
}
