package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MGetEntityCardRequest extends Message<MGetEntityCardRequest, C49495a> {
    public static final ProtoAdapter<MGetEntityCardRequest> ADAPTER = new C49496b();
    public static final Boolean DEFAULT_IS_GROUP = false;
    private static final long serialVersionUID = 0;
    public final String mapp_context;
    public final String mbiz;
    public final List<String> mentity_ids;
    public final Boolean mis_group;
    public final String mkey;
    public final RenderType mrender_type;
    public final String mscene;

    /* renamed from: com.ss.android.lark.pb.ai.MGetEntityCardRequest$b */
    private static final class C49496b extends ProtoAdapter<MGetEntityCardRequest> {
        C49496b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetEntityCardRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetEntityCardRequest mGetEntityCardRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetEntityCardRequest.mentity_ids);
            int i6 = 0;
            if (mGetEntityCardRequest.mkey != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mGetEntityCardRequest.mkey);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (mGetEntityCardRequest.mis_group != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mGetEntityCardRequest.mis_group);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (mGetEntityCardRequest.mrender_type != null) {
                i3 = RenderType.ADAPTER.encodedSizeWithTag(4, mGetEntityCardRequest.mrender_type);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (mGetEntityCardRequest.mbiz != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(20, mGetEntityCardRequest.mbiz);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (mGetEntityCardRequest.mscene != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(21, mGetEntityCardRequest.mscene);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (mGetEntityCardRequest.mapp_context != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(22, mGetEntityCardRequest.mapp_context);
            }
            return i11 + i6 + mGetEntityCardRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetEntityCardRequest decode(ProtoReader protoReader) throws IOException {
            C49495a aVar = new C49495a();
            aVar.f124088b = "";
            aVar.f124089c = false;
            aVar.f124091e = "";
            aVar.f124092f = "";
            aVar.f124093g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124087a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f124088b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124089c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    switch (nextTag) {
                        case 20:
                            aVar.f124091e = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 21:
                            aVar.f124092f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 22:
                            aVar.f124093g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    try {
                        aVar.f124090d = RenderType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetEntityCardRequest mGetEntityCardRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetEntityCardRequest.mentity_ids);
            if (mGetEntityCardRequest.mkey != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mGetEntityCardRequest.mkey);
            }
            if (mGetEntityCardRequest.mis_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mGetEntityCardRequest.mis_group);
            }
            if (mGetEntityCardRequest.mrender_type != null) {
                RenderType.ADAPTER.encodeWithTag(protoWriter, 4, mGetEntityCardRequest.mrender_type);
            }
            if (mGetEntityCardRequest.mbiz != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, mGetEntityCardRequest.mbiz);
            }
            if (mGetEntityCardRequest.mscene != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, mGetEntityCardRequest.mscene);
            }
            if (mGetEntityCardRequest.mapp_context != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, mGetEntityCardRequest.mapp_context);
            }
            protoWriter.writeBytes(mGetEntityCardRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.MGetEntityCardRequest$a */
    public static final class C49495a extends Message.Builder<MGetEntityCardRequest, C49495a> {

        /* renamed from: a */
        public List<String> f124087a = Internal.newMutableList();

        /* renamed from: b */
        public String f124088b;

        /* renamed from: c */
        public Boolean f124089c;

        /* renamed from: d */
        public RenderType f124090d;

        /* renamed from: e */
        public String f124091e;

        /* renamed from: f */
        public String f124092f;

        /* renamed from: g */
        public String f124093g;

        /* renamed from: a */
        public MGetEntityCardRequest build() {
            return new MGetEntityCardRequest(this.f124087a, this.f124088b, this.f124089c, this.f124090d, this.f124091e, this.f124092f, this.f124093g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49495a mo172657a(RenderType renderType) {
            this.f124090d = renderType;
            return this;
        }

        /* renamed from: b */
        public C49495a mo172662b(String str) {
            this.f124091e = str;
            return this;
        }

        /* renamed from: c */
        public C49495a mo172663c(String str) {
            this.f124092f = str;
            return this;
        }

        /* renamed from: a */
        public C49495a mo172658a(Boolean bool) {
            this.f124089c = bool;
            return this;
        }

        /* renamed from: a */
        public C49495a mo172659a(String str) {
            this.f124088b = str;
            return this;
        }

        /* renamed from: a */
        public C49495a mo172660a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f124087a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49495a newBuilder() {
        C49495a aVar = new C49495a();
        aVar.f124087a = Internal.copyOf("mentity_ids", this.mentity_ids);
        aVar.f124088b = this.mkey;
        aVar.f124089c = this.mis_group;
        aVar.f124090d = this.mrender_type;
        aVar.f124091e = this.mbiz;
        aVar.f124092f = this.mscene;
        aVar.f124093g = this.mapp_context;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mentity_ids.isEmpty()) {
            sb.append(", entity_ids=");
            sb.append(this.mentity_ids);
        }
        if (this.mkey != null) {
            sb.append(", key=");
            sb.append(this.mkey);
        }
        if (this.mis_group != null) {
            sb.append(", is_group=");
            sb.append(this.mis_group);
        }
        if (this.mrender_type != null) {
            sb.append(", render_type=");
            sb.append(this.mrender_type);
        }
        if (this.mbiz != null) {
            sb.append(", biz=");
            sb.append(this.mbiz);
        }
        if (this.mscene != null) {
            sb.append(", scene=");
            sb.append(this.mscene);
        }
        if (this.mapp_context != null) {
            sb.append(", app_context=");
            sb.append(this.mapp_context);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetEntityCardRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetEntityCardRequest(List<String> list, String str, Boolean bool, RenderType renderType, String str2, String str3, String str4) {
        this(list, str, bool, renderType, str2, str3, str4, ByteString.EMPTY);
    }

    public MGetEntityCardRequest(List<String> list, String str, Boolean bool, RenderType renderType, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mentity_ids = Internal.immutableCopyOf("mentity_ids", list);
        this.mkey = str;
        this.mis_group = bool;
        this.mrender_type = renderType;
        this.mbiz = str2;
        this.mscene = str3;
        this.mapp_context = str4;
    }
}
