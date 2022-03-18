package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class TodoAttachment extends Message<TodoAttachment, C19641a> {
    public static final ProtoAdapter<TodoAttachment> ADAPTER = new C19642b();
    public static final Integer DEFAULT_POSITION = 0;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final String file_size;
    public final String file_token;
    public final ImageSet image_set;
    public final String name;
    public final Integer position;
    public final Type type;
    public final String uploader_user_id;

    public enum Type implements WireEnum {
        UNKNOWN_TYPE(0),
        IMAGE(1);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i != 1) {
                return null;
            }
            return IMAGE;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoAttachment$b */
    private static final class C19642b extends ProtoAdapter<TodoAttachment> {
        C19642b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoAttachment.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoAttachment todoAttachment) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (todoAttachment.file_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, todoAttachment.file_token);
            } else {
                i = 0;
            }
            if (todoAttachment.file_size != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, todoAttachment.file_size);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (todoAttachment.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, todoAttachment.name);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (todoAttachment.type != null) {
                i4 = Type.ADAPTER.encodedSizeWithTag(4, todoAttachment.type);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (todoAttachment.uploader_user_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, todoAttachment.uploader_user_id);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (todoAttachment.position != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, todoAttachment.position);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (todoAttachment.image_set != null) {
                i7 = ImageSet.ADAPTER.encodedSizeWithTag(7, todoAttachment.image_set);
            }
            return i12 + i7 + todoAttachment.unknownFields().size();
        }

        /* renamed from: a */
        public TodoAttachment decode(ProtoReader protoReader) throws IOException {
            C19641a aVar = new C19641a();
            aVar.f48052a = "";
            aVar.f48053b = "";
            aVar.f48054c = "";
            aVar.f48055d = Type.UNKNOWN_TYPE;
            aVar.f48056e = "";
            aVar.f48057f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f48052a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f48053b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f48054c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f48055d = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f48056e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f48057f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f48058g = ImageSet.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, TodoAttachment todoAttachment) throws IOException {
            if (todoAttachment.file_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, todoAttachment.file_token);
            }
            if (todoAttachment.file_size != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, todoAttachment.file_size);
            }
            if (todoAttachment.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, todoAttachment.name);
            }
            if (todoAttachment.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 4, todoAttachment.type);
            }
            if (todoAttachment.uploader_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, todoAttachment.uploader_user_id);
            }
            if (todoAttachment.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, todoAttachment.position);
            }
            if (todoAttachment.image_set != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 7, todoAttachment.image_set);
            }
            protoWriter.writeBytes(todoAttachment.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoAttachment$a */
    public static final class C19641a extends Message.Builder<TodoAttachment, C19641a> {

        /* renamed from: a */
        public String f48052a;

        /* renamed from: b */
        public String f48053b;

        /* renamed from: c */
        public String f48054c;

        /* renamed from: d */
        public Type f48055d;

        /* renamed from: e */
        public String f48056e;

        /* renamed from: f */
        public Integer f48057f;

        /* renamed from: g */
        public ImageSet f48058g;

        /* renamed from: a */
        public TodoAttachment build() {
            return new TodoAttachment(this.f48052a, this.f48053b, this.f48054c, this.f48055d, this.f48056e, this.f48057f, this.f48058g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19641a mo66639a(Type type) {
            this.f48055d = type;
            return this;
        }

        /* renamed from: b */
        public C19641a mo66642b(String str) {
            this.f48053b = str;
            return this;
        }

        /* renamed from: c */
        public C19641a mo66643c(String str) {
            this.f48054c = str;
            return this;
        }

        /* renamed from: d */
        public C19641a mo66644d(String str) {
            this.f48056e = str;
            return this;
        }

        /* renamed from: a */
        public C19641a mo66640a(String str) {
            this.f48052a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19641a newBuilder() {
        C19641a aVar = new C19641a();
        aVar.f48052a = this.file_token;
        aVar.f48053b = this.file_size;
        aVar.f48054c = this.name;
        aVar.f48055d = this.type;
        aVar.f48056e = this.uploader_user_id;
        aVar.f48057f = this.position;
        aVar.f48058g = this.image_set;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoAttachment");
        StringBuilder sb = new StringBuilder();
        if (this.file_token != null) {
            sb.append(", file_token=");
            sb.append(this.file_token);
        }
        if (this.file_size != null) {
            sb.append(", file_size=");
            sb.append(this.file_size);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.uploader_user_id != null) {
            sb.append(", uploader_user_id=");
            sb.append(this.uploader_user_id);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.image_set != null) {
            sb.append(", image_set=");
            sb.append(this.image_set);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoAttachment{");
        replace.append('}');
        return replace.toString();
    }

    public TodoAttachment(String str, String str2, String str3, Type type2, String str4, Integer num, ImageSet imageSet) {
        this(str, str2, str3, type2, str4, num, imageSet, ByteString.EMPTY);
    }

    public TodoAttachment(String str, String str2, String str3, Type type2, String str4, Integer num, ImageSet imageSet, ByteString byteString) {
        super(ADAPTER, byteString);
        this.file_token = str;
        this.file_size = str2;
        this.name = str3;
        this.type = type2;
        this.uploader_user_id = str4;
        this.position = num;
        this.image_set = imageSet;
    }
}
