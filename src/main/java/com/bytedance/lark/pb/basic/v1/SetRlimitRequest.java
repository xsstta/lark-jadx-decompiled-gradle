package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetRlimitRequest extends Message<SetRlimitRequest, C15278a> {
    public static final ProtoAdapter<SetRlimitRequest> ADAPTER = new C15279b();
    public static final Integer DEFAULT_RLIM_CUR = 0;
    public static final Integer DEFAULT_RLIM_MAX = 0;
    private static final long serialVersionUID = 0;
    public final Integer rlim_cur;
    public final Integer rlim_max;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetRlimitRequest$b */
    private static final class C15279b extends ProtoAdapter<SetRlimitRequest> {
        C15279b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetRlimitRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetRlimitRequest setRlimitRequest) {
            int i;
            int i2 = 0;
            if (setRlimitRequest.rlim_cur != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, setRlimitRequest.rlim_cur);
            } else {
                i = 0;
            }
            if (setRlimitRequest.rlim_max != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, setRlimitRequest.rlim_max);
            }
            return i + i2 + setRlimitRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetRlimitRequest decode(ProtoReader protoReader) throws IOException {
            C15278a aVar = new C15278a();
            aVar.f40474a = 0;
            aVar.f40475b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40474a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40475b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetRlimitRequest setRlimitRequest) throws IOException {
            if (setRlimitRequest.rlim_cur != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, setRlimitRequest.rlim_cur);
            }
            if (setRlimitRequest.rlim_max != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, setRlimitRequest.rlim_max);
            }
            protoWriter.writeBytes(setRlimitRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetRlimitRequest$a */
    public static final class C15278a extends Message.Builder<SetRlimitRequest, C15278a> {

        /* renamed from: a */
        public Integer f40474a;

        /* renamed from: b */
        public Integer f40475b;

        /* renamed from: a */
        public SetRlimitRequest build() {
            return new SetRlimitRequest(this.f40474a, this.f40475b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15278a mo55599a(Integer num) {
            this.f40474a = num;
            return this;
        }

        /* renamed from: b */
        public C15278a mo55601b(Integer num) {
            this.f40475b = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15278a newBuilder() {
        C15278a aVar = new C15278a();
        aVar.f40474a = this.rlim_cur;
        aVar.f40475b = this.rlim_max;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SetRlimitRequest");
        StringBuilder sb = new StringBuilder();
        if (this.rlim_cur != null) {
            sb.append(", rlim_cur=");
            sb.append(this.rlim_cur);
        }
        if (this.rlim_max != null) {
            sb.append(", rlim_max=");
            sb.append(this.rlim_max);
        }
        StringBuilder replace = sb.replace(0, 2, "SetRlimitRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetRlimitRequest(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public SetRlimitRequest(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rlim_cur = num;
        this.rlim_max = num2;
    }
}
