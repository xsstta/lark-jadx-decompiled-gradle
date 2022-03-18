package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpdateHongbaoRequest extends Message<UpdateHongbaoRequest, Builder> {
    public static final ProtoAdapter<UpdateHongbaoRequest> ADAPTER = new C18153a();
    public static final Boolean DEFAULT_CLICKED = false;
    public static final Boolean DEFAULT_GRABBED = false;
    public static final Boolean DEFAULT_GRABBED_FINISH = false;
    public static final HongbaoType DEFAULT_HONGBAO_TYPE = HongbaoType.NORMAL;
    private static final long serialVersionUID = 0;
    public final Boolean clicked;
    public final Boolean grabbed;
    public final Boolean grabbed_finish;
    public final HongbaoType hongbao_type;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateHongbaoRequest$a */
    private static final class C18153a extends ProtoAdapter<UpdateHongbaoRequest> {
        C18153a() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateHongbaoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateHongbaoRequest updateHongbaoRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, updateHongbaoRequest.id);
            int i4 = 0;
            if (updateHongbaoRequest.clicked != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, updateHongbaoRequest.clicked);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (updateHongbaoRequest.grabbed != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, updateHongbaoRequest.grabbed);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (updateHongbaoRequest.grabbed_finish != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, updateHongbaoRequest.grabbed_finish);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (updateHongbaoRequest.hongbao_type != null) {
                i4 = HongbaoType.ADAPTER.encodedSizeWithTag(5, updateHongbaoRequest.hongbao_type);
            }
            return i7 + i4 + updateHongbaoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateHongbaoRequest decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            builder.id = "";
            builder.clicked = false;
            builder.grabbed = false;
            builder.grabbed_finish = false;
            builder.hongbao_type = HongbaoType.NORMAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.id = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    builder.clicked = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    builder.grabbed = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    builder.grabbed_finish = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.hongbao_type = HongbaoType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateHongbaoRequest updateHongbaoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateHongbaoRequest.id);
            if (updateHongbaoRequest.clicked != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, updateHongbaoRequest.clicked);
            }
            if (updateHongbaoRequest.grabbed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, updateHongbaoRequest.grabbed);
            }
            if (updateHongbaoRequest.grabbed_finish != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, updateHongbaoRequest.grabbed_finish);
            }
            if (updateHongbaoRequest.hongbao_type != null) {
                HongbaoType.ADAPTER.encodeWithTag(protoWriter, 5, updateHongbaoRequest.hongbao_type);
            }
            protoWriter.writeBytes(updateHongbaoRequest.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<UpdateHongbaoRequest, Builder> {
        public Boolean clicked;
        public Boolean grabbed;
        public Boolean grabbed_finish;
        public HongbaoType hongbao_type;
        public String id;

        @Override // com.squareup.wire.Message.Builder
        public UpdateHongbaoRequest build() {
            String str = this.id;
            if (str != null) {
                return new UpdateHongbaoRequest(str, this.clicked, this.grabbed, this.grabbed_finish, this.hongbao_type, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }

        public Builder clicked(Boolean bool) {
            this.clicked = bool;
            return this;
        }

        public Builder grabbed(Boolean bool) {
            this.grabbed = bool;
            return this;
        }

        public Builder grabbed_finish(Boolean bool) {
            this.grabbed_finish = bool;
            return this;
        }

        public Builder hongbao_type(HongbaoType hongbaoType) {
            this.hongbao_type = hongbaoType;
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.clicked = this.clicked;
        builder.grabbed = this.grabbed;
        builder.grabbed_finish = this.grabbed_finish;
        builder.hongbao_type = this.hongbao_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateHongbaoRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.clicked != null) {
            sb.append(", clicked=");
            sb.append(this.clicked);
        }
        if (this.grabbed != null) {
            sb.append(", grabbed=");
            sb.append(this.grabbed);
        }
        if (this.grabbed_finish != null) {
            sb.append(", grabbed_finish=");
            sb.append(this.grabbed_finish);
        }
        if (this.hongbao_type != null) {
            sb.append(", hongbao_type=");
            sb.append(this.hongbao_type);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateHongbaoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateHongbaoRequest(String str, Boolean bool, Boolean bool2, Boolean bool3, HongbaoType hongbaoType) {
        this(str, bool, bool2, bool3, hongbaoType, ByteString.EMPTY);
    }

    public UpdateHongbaoRequest(String str, Boolean bool, Boolean bool2, Boolean bool3, HongbaoType hongbaoType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.clicked = bool;
        this.grabbed = bool2;
        this.grabbed_finish = bool3;
        this.hongbao_type = hongbaoType;
    }
}
