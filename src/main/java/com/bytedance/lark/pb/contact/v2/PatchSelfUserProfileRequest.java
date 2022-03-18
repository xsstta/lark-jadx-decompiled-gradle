package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PatchSelfUserProfileRequest extends Message<PatchSelfUserProfileRequest, C16548a> {
    public static final ProtoAdapter<PatchSelfUserProfileRequest> ADAPTER = new C16549b();
    private static final long serialVersionUID = 0;
    public final String top_image_key;
    public final List<SelfUserProfileUpdateProperty> updateProperties;

    public enum SelfUserProfileUpdateProperty implements WireEnum {
        UNKNOWN(0),
        TOP_IMAGE(1);
        
        public static final ProtoAdapter<SelfUserProfileUpdateProperty> ADAPTER = ProtoAdapter.newEnumAdapter(SelfUserProfileUpdateProperty.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SelfUserProfileUpdateProperty fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return TOP_IMAGE;
        }

        private SelfUserProfileUpdateProperty(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.PatchSelfUserProfileRequest$b */
    private static final class C16549b extends ProtoAdapter<PatchSelfUserProfileRequest> {
        C16549b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchSelfUserProfileRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchSelfUserProfileRequest patchSelfUserProfileRequest) {
            int i;
            int encodedSizeWithTag = SelfUserProfileUpdateProperty.ADAPTER.asRepeated().encodedSizeWithTag(1, patchSelfUserProfileRequest.updateProperties);
            if (patchSelfUserProfileRequest.top_image_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, patchSelfUserProfileRequest.top_image_key);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + patchSelfUserProfileRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchSelfUserProfileRequest decode(ProtoReader protoReader) throws IOException {
            C16548a aVar = new C16548a();
            aVar.f42918b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42917a.add(SelfUserProfileUpdateProperty.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42918b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchSelfUserProfileRequest patchSelfUserProfileRequest) throws IOException {
            SelfUserProfileUpdateProperty.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, patchSelfUserProfileRequest.updateProperties);
            if (patchSelfUserProfileRequest.top_image_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, patchSelfUserProfileRequest.top_image_key);
            }
            protoWriter.writeBytes(patchSelfUserProfileRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.PatchSelfUserProfileRequest$a */
    public static final class C16548a extends Message.Builder<PatchSelfUserProfileRequest, C16548a> {

        /* renamed from: a */
        public List<SelfUserProfileUpdateProperty> f42917a = Internal.newMutableList();

        /* renamed from: b */
        public String f42918b;

        /* renamed from: a */
        public PatchSelfUserProfileRequest build() {
            return new PatchSelfUserProfileRequest(this.f42917a, this.f42918b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16548a mo58912a(String str) {
            this.f42918b = str;
            return this;
        }

        /* renamed from: a */
        public C16548a mo58913a(List<SelfUserProfileUpdateProperty> list) {
            Internal.checkElementsNotNull(list);
            this.f42917a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16548a newBuilder() {
        C16548a aVar = new C16548a();
        aVar.f42917a = Internal.copyOf("updateProperties", this.updateProperties);
        aVar.f42918b = this.top_image_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "PatchSelfUserProfileRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.updateProperties.isEmpty()) {
            sb.append(", updateProperties=");
            sb.append(this.updateProperties);
        }
        if (this.top_image_key != null) {
            sb.append(", top_image_key=");
            sb.append(this.top_image_key);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchSelfUserProfileRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchSelfUserProfileRequest(List<SelfUserProfileUpdateProperty> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public PatchSelfUserProfileRequest(List<SelfUserProfileUpdateProperty> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.updateProperties = Internal.immutableCopyOf("updateProperties", list);
        this.top_image_key = str;
    }
}
