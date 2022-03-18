package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class VCManageApplyResponse extends Message<VCManageApplyResponse, C50415a> {
    public static final ProtoAdapter<VCManageApplyResponse> ADAPTER = new C50416b();
    private static final long serialVersionUID = 0;
    public final Result mresult;

    public enum Result implements WireEnum {
        FAIL(0),
        SUCCESS(1),
        HOST_BUSY(2);
        
        public static final ProtoAdapter<Result> ADAPTER = ProtoAdapter.newEnumAdapter(Result.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Result fromValue(int i) {
            if (i == 0) {
                return FAIL;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return HOST_BUSY;
        }

        private Result(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VCManageApplyResponse$b */
    private static final class C50416b extends ProtoAdapter<VCManageApplyResponse> {
        C50416b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCManageApplyResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VCManageApplyResponse vCManageApplyResponse) {
            int i;
            if (vCManageApplyResponse.mresult != null) {
                i = Result.ADAPTER.encodedSizeWithTag(1, vCManageApplyResponse.mresult);
            } else {
                i = 0;
            }
            return i + vCManageApplyResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VCManageApplyResponse decode(ProtoReader protoReader) throws IOException {
            C50415a aVar = new C50415a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f125891a = Result.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCManageApplyResponse vCManageApplyResponse) throws IOException {
            if (vCManageApplyResponse.mresult != null) {
                Result.ADAPTER.encodeWithTag(protoWriter, 1, vCManageApplyResponse.mresult);
            }
            protoWriter.writeBytes(vCManageApplyResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VCManageApplyResponse$a */
    public static final class C50415a extends Message.Builder<VCManageApplyResponse, C50415a> {

        /* renamed from: a */
        public Result f125891a;

        /* renamed from: a */
        public VCManageApplyResponse build() {
            return new VCManageApplyResponse(this.f125891a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50415a newBuilder() {
        C50415a aVar = new C50415a();
        aVar.f125891a = this.mresult;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mresult != null) {
            sb.append(", result=");
            sb.append(this.mresult);
        }
        StringBuilder replace = sb.replace(0, 2, "VCManageApplyResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VCManageApplyResponse(Result result) {
        this(result, ByteString.EMPTY);
    }

    public VCManageApplyResponse(Result result, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mresult = result;
    }
}
