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

public final class CancelSubscribeRecentListRep extends Message<CancelSubscribeRecentListRep, C19317a> {
    public static final ProtoAdapter<CancelSubscribeRecentListRep> ADAPTER = new C19318b();
    public static final Boolean DEFAULT_RESULT = false;
    public static final ResultType DEFAULT_RESULT_TYPE = ResultType.ResultType_SUCCESS;
    private static final long serialVersionUID = 0;
    public final Boolean result;
    public final ResultType result_type;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelSubscribeRecentListRep$b */
    private static final class C19318b extends ProtoAdapter<CancelSubscribeRecentListRep> {
        C19318b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelSubscribeRecentListRep.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelSubscribeRecentListRep cancelSubscribeRecentListRep) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, cancelSubscribeRecentListRep.result) + ResultType.ADAPTER.encodedSizeWithTag(2, cancelSubscribeRecentListRep.result_type) + cancelSubscribeRecentListRep.unknownFields().size();
        }

        /* renamed from: a */
        public CancelSubscribeRecentListRep decode(ProtoReader protoReader) throws IOException {
            C19317a aVar = new C19317a();
            aVar.f47509a = false;
            aVar.f47510b = ResultType.ResultType_SUCCESS;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47509a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47510b = ResultType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelSubscribeRecentListRep cancelSubscribeRecentListRep) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, cancelSubscribeRecentListRep.result);
            ResultType.ADAPTER.encodeWithTag(protoWriter, 2, cancelSubscribeRecentListRep.result_type);
            protoWriter.writeBytes(cancelSubscribeRecentListRep.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19317a newBuilder() {
        C19317a aVar = new C19317a();
        aVar.f47509a = this.result;
        aVar.f47510b = this.result_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelSubscribeRecentListRep$a */
    public static final class C19317a extends Message.Builder<CancelSubscribeRecentListRep, C19317a> {

        /* renamed from: a */
        public Boolean f47509a;

        /* renamed from: b */
        public ResultType f47510b;

        /* renamed from: a */
        public CancelSubscribeRecentListRep build() {
            ResultType resultType;
            Boolean bool = this.f47509a;
            if (bool != null && (resultType = this.f47510b) != null) {
                return new CancelSubscribeRecentListRep(bool, resultType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "result", this.f47510b, "result_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CancelSubscribeRecentListRep");
        StringBuilder sb = new StringBuilder();
        sb.append(", result=");
        sb.append(this.result);
        sb.append(", result_type=");
        sb.append(this.result_type);
        StringBuilder replace = sb.replace(0, 2, "CancelSubscribeRecentListRep{");
        replace.append('}');
        return replace.toString();
    }

    public CancelSubscribeRecentListRep(Boolean bool, ResultType resultType) {
        this(bool, resultType, ByteString.EMPTY);
    }

    public CancelSubscribeRecentListRep(Boolean bool, ResultType resultType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = bool;
        this.result_type = resultType;
    }
}
