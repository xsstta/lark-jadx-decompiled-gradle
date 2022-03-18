package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class NotifyAppLagRequest extends Message<NotifyAppLagRequest, C15101a> {
    public static final ProtoAdapter<NotifyAppLagRequest> ADAPTER = new C15102b();
    public static final LagLevel DEFAULT_LAG_LEVEL = LagLevel.SLIGHTLY;
    private static final long serialVersionUID = 0;
    public final LagLevel lag_level;

    public enum LagLevel implements WireEnum {
        NONE(0),
        SLIGHTLY(1),
        MODERATELY(3),
        SEVERELY(4),
        FATALLY(5);
        
        public static final ProtoAdapter<LagLevel> ADAPTER = ProtoAdapter.newEnumAdapter(LagLevel.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static LagLevel fromValue(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return SLIGHTLY;
            }
            if (i == 3) {
                return MODERATELY;
            }
            if (i == 4) {
                return SEVERELY;
            }
            if (i != 5) {
                return null;
            }
            return FATALLY;
        }

        private LagLevel(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.NotifyAppLagRequest$b */
    private static final class C15102b extends ProtoAdapter<NotifyAppLagRequest> {
        C15102b() {
            super(FieldEncoding.LENGTH_DELIMITED, NotifyAppLagRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(NotifyAppLagRequest notifyAppLagRequest) {
            int i;
            if (notifyAppLagRequest.lag_level != null) {
                i = LagLevel.ADAPTER.encodedSizeWithTag(1, notifyAppLagRequest.lag_level);
            } else {
                i = 0;
            }
            return i + notifyAppLagRequest.unknownFields().size();
        }

        /* renamed from: a */
        public NotifyAppLagRequest decode(ProtoReader protoReader) throws IOException {
            C15101a aVar = new C15101a();
            aVar.f40029a = LagLevel.SLIGHTLY;
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
                        aVar.f40029a = LagLevel.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NotifyAppLagRequest notifyAppLagRequest) throws IOException {
            if (notifyAppLagRequest.lag_level != null) {
                LagLevel.ADAPTER.encodeWithTag(protoWriter, 1, notifyAppLagRequest.lag_level);
            }
            protoWriter.writeBytes(notifyAppLagRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.NotifyAppLagRequest$a */
    public static final class C15101a extends Message.Builder<NotifyAppLagRequest, C15101a> {

        /* renamed from: a */
        public LagLevel f40029a;

        /* renamed from: a */
        public NotifyAppLagRequest build() {
            return new NotifyAppLagRequest(this.f40029a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15101a mo55091a(LagLevel lagLevel) {
            this.f40029a = lagLevel;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15101a newBuilder() {
        C15101a aVar = new C15101a();
        aVar.f40029a = this.lag_level;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "NotifyAppLagRequest");
        StringBuilder sb = new StringBuilder();
        if (this.lag_level != null) {
            sb.append(", lag_level=");
            sb.append(this.lag_level);
        }
        StringBuilder replace = sb.replace(0, 2, "NotifyAppLagRequest{");
        replace.append('}');
        return replace.toString();
    }

    public NotifyAppLagRequest(LagLevel lagLevel) {
        this(lagLevel, ByteString.EMPTY);
    }

    public NotifyAppLagRequest(LagLevel lagLevel, ByteString byteString) {
        super(ADAPTER, byteString);
        this.lag_level = lagLevel;
    }
}
