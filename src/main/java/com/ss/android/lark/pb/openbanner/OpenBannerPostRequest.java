package com.ss.android.lark.pb.openbanner;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class OpenBannerPostRequest extends Message<OpenBannerPostRequest, C49990a> {
    public static final ProtoAdapter<OpenBannerPostRequest> ADAPTER = new C49991b();
    private static final long serialVersionUID = 0;
    public final ContainerTag mcontainer_tag;
    public final String mcontext;
    public final String mresource_id;
    public final String mresource_type;
    public final String mtarget_id;
    public final TargetType mtarget_type;
    public final String muser_id;
    public final String mvalue;

    /* renamed from: com.ss.android.lark.pb.openbanner.OpenBannerPostRequest$b */
    private static final class C49991b extends ProtoAdapter<OpenBannerPostRequest> {
        C49991b() {
            super(FieldEncoding.LENGTH_DELIMITED, OpenBannerPostRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(OpenBannerPostRequest openBannerPostRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, openBannerPostRequest.mtarget_id) + TargetType.ADAPTER.encodedSizeWithTag(2, openBannerPostRequest.mtarget_type);
            int i6 = 0;
            if (openBannerPostRequest.mcontainer_tag != null) {
                i = ContainerTag.ADAPTER.encodedSizeWithTag(3, openBannerPostRequest.mcontainer_tag);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (openBannerPostRequest.mcontext != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, openBannerPostRequest.mcontext);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (openBannerPostRequest.muser_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, openBannerPostRequest.muser_id);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (openBannerPostRequest.mresource_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, openBannerPostRequest.mresource_id);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (openBannerPostRequest.mresource_type != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, openBannerPostRequest.mresource_type);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (openBannerPostRequest.mvalue != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, openBannerPostRequest.mvalue);
            }
            return i11 + i6 + openBannerPostRequest.unknownFields().size();
        }

        /* renamed from: a */
        public OpenBannerPostRequest decode(ProtoReader protoReader) throws IOException {
            C49990a aVar = new C49990a();
            aVar.f125027a = "";
            aVar.f125030d = "";
            aVar.f125031e = "";
            aVar.f125032f = "";
            aVar.f125033g = "";
            aVar.f125034h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125027a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125028b = TargetType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f125029c = ContainerTag.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            aVar.f125030d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125031e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125032f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125033g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125034h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OpenBannerPostRequest openBannerPostRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, openBannerPostRequest.mtarget_id);
            TargetType.ADAPTER.encodeWithTag(protoWriter, 2, openBannerPostRequest.mtarget_type);
            if (openBannerPostRequest.mcontainer_tag != null) {
                ContainerTag.ADAPTER.encodeWithTag(protoWriter, 3, openBannerPostRequest.mcontainer_tag);
            }
            if (openBannerPostRequest.mcontext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, openBannerPostRequest.mcontext);
            }
            if (openBannerPostRequest.muser_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, openBannerPostRequest.muser_id);
            }
            if (openBannerPostRequest.mresource_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, openBannerPostRequest.mresource_id);
            }
            if (openBannerPostRequest.mresource_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, openBannerPostRequest.mresource_type);
            }
            if (openBannerPostRequest.mvalue != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, openBannerPostRequest.mvalue);
            }
            protoWriter.writeBytes(openBannerPostRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.openbanner.OpenBannerPostRequest$a */
    public static final class C49990a extends Message.Builder<OpenBannerPostRequest, C49990a> {

        /* renamed from: a */
        public String f125027a;

        /* renamed from: b */
        public TargetType f125028b;

        /* renamed from: c */
        public ContainerTag f125029c;

        /* renamed from: d */
        public String f125030d;

        /* renamed from: e */
        public String f125031e;

        /* renamed from: f */
        public String f125032f;

        /* renamed from: g */
        public String f125033g;

        /* renamed from: h */
        public String f125034h;

        /* renamed from: a */
        public OpenBannerPostRequest build() {
            TargetType targetType;
            String str = this.f125027a;
            if (str != null && (targetType = this.f125028b) != null) {
                return new OpenBannerPostRequest(str, targetType, this.f125029c, this.f125030d, this.f125031e, this.f125032f, this.f125033g, this.f125034h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mtarget_id", this.f125028b, "mtarget_type");
        }

        /* renamed from: a */
        public C49990a mo173767a(ContainerTag containerTag) {
            this.f125029c = containerTag;
            return this;
        }

        /* renamed from: b */
        public C49990a mo173771b(String str) {
            this.f125030d = str;
            return this;
        }

        /* renamed from: c */
        public C49990a mo173772c(String str) {
            this.f125031e = str;
            return this;
        }

        /* renamed from: d */
        public C49990a mo173773d(String str) {
            this.f125032f = str;
            return this;
        }

        /* renamed from: e */
        public C49990a mo173774e(String str) {
            this.f125033g = str;
            return this;
        }

        /* renamed from: f */
        public C49990a mo173775f(String str) {
            this.f125034h = str;
            return this;
        }

        /* renamed from: a */
        public C49990a mo173768a(TargetType targetType) {
            this.f125028b = targetType;
            return this;
        }

        /* renamed from: a */
        public C49990a mo173769a(String str) {
            this.f125027a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49990a newBuilder() {
        C49990a aVar = new C49990a();
        aVar.f125027a = this.mtarget_id;
        aVar.f125028b = this.mtarget_type;
        aVar.f125029c = this.mcontainer_tag;
        aVar.f125030d = this.mcontext;
        aVar.f125031e = this.muser_id;
        aVar.f125032f = this.mresource_id;
        aVar.f125033g = this.mresource_type;
        aVar.f125034h = this.mvalue;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", target_id=");
        sb.append(this.mtarget_id);
        sb.append(", target_type=");
        sb.append(this.mtarget_type);
        if (this.mcontainer_tag != null) {
            sb.append(", container_tag=");
            sb.append(this.mcontainer_tag);
        }
        if (this.mcontext != null) {
            sb.append(", context=");
            sb.append(this.mcontext);
        }
        if (this.muser_id != null) {
            sb.append(", user_id=");
            sb.append(this.muser_id);
        }
        if (this.mresource_id != null) {
            sb.append(", resource_id=");
            sb.append(this.mresource_id);
        }
        if (this.mresource_type != null) {
            sb.append(", resource_type=");
            sb.append(this.mresource_type);
        }
        if (this.mvalue != null) {
            sb.append(", value=");
            sb.append(this.mvalue);
        }
        StringBuilder replace = sb.replace(0, 2, "OpenBannerPostRequest{");
        replace.append('}');
        return replace.toString();
    }

    public OpenBannerPostRequest(String str, TargetType targetType, ContainerTag containerTag, String str2, String str3, String str4, String str5, String str6) {
        this(str, targetType, containerTag, str2, str3, str4, str5, str6, ByteString.EMPTY);
    }

    public OpenBannerPostRequest(String str, TargetType targetType, ContainerTag containerTag, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtarget_id = str;
        this.mtarget_type = targetType;
        this.mcontainer_tag = containerTag;
        this.mcontext = str2;
        this.muser_id = str3;
        this.mresource_id = str4;
        this.mresource_type = str5;
        this.mvalue = str6;
    }
}
