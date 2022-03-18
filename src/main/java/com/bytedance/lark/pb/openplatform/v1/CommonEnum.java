package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class CommonEnum extends Message<CommonEnum, C18643a> {
    public static final ProtoAdapter<CommonEnum> ADAPTER = new C18644b();
    private static final long serialVersionUID = 0;

    public enum LoadStrategy implements WireEnum {
        Local(1),
        Net(2);
        
        public static final ProtoAdapter<LoadStrategy> ADAPTER = ProtoAdapter.newEnumAdapter(LoadStrategy.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static LoadStrategy fromValue(int i) {
            if (i == 1) {
                return Local;
            }
            if (i != 2) {
                return null;
            }
            return Net;
        }

        private LoadStrategy(int i) {
            this.value = i;
        }
    }

    public enum OpenAppFeatureType implements WireEnum {
        MiniApp(1),
        H5(2);
        
        public static final ProtoAdapter<OpenAppFeatureType> ADAPTER = ProtoAdapter.newEnumAdapter(OpenAppFeatureType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static OpenAppFeatureType fromValue(int i) {
            if (i == 1) {
                return MiniApp;
            }
            if (i != 2) {
                return null;
            }
            return H5;
        }

        private OpenAppFeatureType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.CommonEnum$b */
    private static final class C18644b extends ProtoAdapter<CommonEnum> {
        C18644b() {
            super(FieldEncoding.LENGTH_DELIMITED, CommonEnum.class);
        }

        /* renamed from: a */
        public int encodedSize(CommonEnum commonEnum) {
            return commonEnum.unknownFields().size();
        }

        /* renamed from: a */
        public CommonEnum decode(ProtoReader protoReader) throws IOException {
            C18643a aVar = new C18643a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CommonEnum commonEnum) throws IOException {
            protoWriter.writeBytes(commonEnum.unknownFields());
        }
    }

    public CommonEnum() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.CommonEnum$a */
    public static final class C18643a extends Message.Builder<CommonEnum, C18643a> {
        /* renamed from: a */
        public CommonEnum build() {
            return new CommonEnum(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18643a newBuilder() {
        C18643a aVar = new C18643a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "CommonEnum");
        StringBuilder replace = new StringBuilder().replace(0, 2, "CommonEnum{");
        replace.append('}');
        return replace.toString();
    }

    public CommonEnum(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
