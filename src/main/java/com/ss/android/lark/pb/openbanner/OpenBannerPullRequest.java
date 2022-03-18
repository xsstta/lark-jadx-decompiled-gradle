package com.ss.android.lark.pb.openbanner;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class OpenBannerPullRequest extends Message<OpenBannerPullRequest, C49992a> {
    public static final ProtoAdapter<OpenBannerPullRequest> ADAPTER = new C49993b();
    private static final long serialVersionUID = 0;
    public final ContainerTag mcontainer_tag;
    public final String mcontext;
    public final String mtarget_id;
    public final TargetType mtarget_type;
    public final String muser_id;

    /* renamed from: com.ss.android.lark.pb.openbanner.OpenBannerPullRequest$b */
    private static final class C49993b extends ProtoAdapter<OpenBannerPullRequest> {
        C49993b() {
            super(FieldEncoding.LENGTH_DELIMITED, OpenBannerPullRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(OpenBannerPullRequest openBannerPullRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, openBannerPullRequest.mtarget_id) + TargetType.ADAPTER.encodedSizeWithTag(2, openBannerPullRequest.mtarget_type);
            int i3 = 0;
            if (openBannerPullRequest.mcontainer_tag != null) {
                i = ContainerTag.ADAPTER.encodedSizeWithTag(3, openBannerPullRequest.mcontainer_tag);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (openBannerPullRequest.mcontext != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, openBannerPullRequest.mcontext);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (openBannerPullRequest.muser_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, openBannerPullRequest.muser_id);
            }
            return i5 + i3 + openBannerPullRequest.unknownFields().size();
        }

        /* renamed from: a */
        public OpenBannerPullRequest decode(ProtoReader protoReader) throws IOException {
            C49992a aVar = new C49992a();
            aVar.f125035a = "";
            aVar.f125038d = "";
            aVar.f125039e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125035a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f125036b = TargetType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    try {
                        aVar.f125037c = ContainerTag.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f125038d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125039e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OpenBannerPullRequest openBannerPullRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, openBannerPullRequest.mtarget_id);
            TargetType.ADAPTER.encodeWithTag(protoWriter, 2, openBannerPullRequest.mtarget_type);
            if (openBannerPullRequest.mcontainer_tag != null) {
                ContainerTag.ADAPTER.encodeWithTag(protoWriter, 3, openBannerPullRequest.mcontainer_tag);
            }
            if (openBannerPullRequest.mcontext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, openBannerPullRequest.mcontext);
            }
            if (openBannerPullRequest.muser_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, openBannerPullRequest.muser_id);
            }
            protoWriter.writeBytes(openBannerPullRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.openbanner.OpenBannerPullRequest$a */
    public static final class C49992a extends Message.Builder<OpenBannerPullRequest, C49992a> {

        /* renamed from: a */
        public String f125035a;

        /* renamed from: b */
        public TargetType f125036b;

        /* renamed from: c */
        public ContainerTag f125037c;

        /* renamed from: d */
        public String f125038d;

        /* renamed from: e */
        public String f125039e;

        /* renamed from: a */
        public OpenBannerPullRequest build() {
            TargetType targetType;
            String str = this.f125035a;
            if (str != null && (targetType = this.f125036b) != null) {
                return new OpenBannerPullRequest(str, targetType, this.f125037c, this.f125038d, this.f125039e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mtarget_id", this.f125036b, "mtarget_type");
        }

        /* renamed from: a */
        public C49992a mo173779a(ContainerTag containerTag) {
            this.f125037c = containerTag;
            return this;
        }

        /* renamed from: b */
        public C49992a mo173783b(String str) {
            this.f125038d = str;
            return this;
        }

        /* renamed from: c */
        public C49992a mo173784c(String str) {
            this.f125039e = str;
            return this;
        }

        /* renamed from: a */
        public C49992a mo173780a(TargetType targetType) {
            this.f125036b = targetType;
            return this;
        }

        /* renamed from: a */
        public C49992a mo173781a(String str) {
            this.f125035a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49992a newBuilder() {
        C49992a aVar = new C49992a();
        aVar.f125035a = this.mtarget_id;
        aVar.f125036b = this.mtarget_type;
        aVar.f125037c = this.mcontainer_tag;
        aVar.f125038d = this.mcontext;
        aVar.f125039e = this.muser_id;
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
        StringBuilder replace = sb.replace(0, 2, "OpenBannerPullRequest{");
        replace.append('}');
        return replace.toString();
    }

    public OpenBannerPullRequest(String str, TargetType targetType, ContainerTag containerTag, String str2, String str3) {
        this(str, targetType, containerTag, str2, str3, ByteString.EMPTY);
    }

    public OpenBannerPullRequest(String str, TargetType targetType, ContainerTag containerTag, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtarget_id = str;
        this.mtarget_type = targetType;
        this.mcontainer_tag = containerTag;
        this.mcontext = str2;
        this.muser_id = str3;
    }
}
