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

public final class ShareObject extends Message<ShareObject, C18071a> {
    public static final ProtoAdapter<ShareObject> ADAPTER = new C18072b();
    private static final long serialVersionUID = 0;
    public final FileManagerObject file_manager_object;

    public static final class FileManagerObject extends Message<FileManagerObject, C18069a> {
        public static final ProtoAdapter<FileManagerObject> ADAPTER = new C18070b();
        private static final long serialVersionUID = 0;
        public final String file_key;
        public final String origin_message_id;

        /* renamed from: com.bytedance.lark.pb.im.v1.ShareObject$FileManagerObject$b */
        private static final class C18070b extends ProtoAdapter<FileManagerObject> {
            C18070b() {
                super(FieldEncoding.LENGTH_DELIMITED, FileManagerObject.class);
            }

            /* renamed from: a */
            public int encodedSize(FileManagerObject fileManagerObject) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, fileManagerObject.file_key);
                if (fileManagerObject.origin_message_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, fileManagerObject.origin_message_id);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + fileManagerObject.unknownFields().size();
            }

            /* renamed from: a */
            public FileManagerObject decode(ProtoReader protoReader) throws IOException {
                C18069a aVar = new C18069a();
                aVar.f45197a = "";
                aVar.f45198b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45197a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45198b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FileManagerObject fileManagerObject) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fileManagerObject.file_key);
                if (fileManagerObject.origin_message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, fileManagerObject.origin_message_id);
                }
                protoWriter.writeBytes(fileManagerObject.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.ShareObject$FileManagerObject$a */
        public static final class C18069a extends Message.Builder<FileManagerObject, C18069a> {

            /* renamed from: a */
            public String f45197a;

            /* renamed from: b */
            public String f45198b;

            /* renamed from: a */
            public FileManagerObject build() {
                String str = this.f45197a;
                if (str != null) {
                    return new FileManagerObject(str, this.f45198b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "file_key");
            }

            /* renamed from: a */
            public C18069a mo62722a(String str) {
                this.f45197a = str;
                return this;
            }

            /* renamed from: b */
            public C18069a mo62724b(String str) {
                this.f45198b = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C18069a newBuilder() {
            C18069a aVar = new C18069a();
            aVar.f45197a = this.file_key;
            aVar.f45198b = this.origin_message_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "FileManagerObject");
            StringBuilder sb = new StringBuilder();
            sb.append(", file_key=");
            sb.append(this.file_key);
            if (this.origin_message_id != null) {
                sb.append(", origin_message_id=");
                sb.append(this.origin_message_id);
            }
            StringBuilder replace = sb.replace(0, 2, "FileManagerObject{");
            replace.append('}');
            return replace.toString();
        }

        public FileManagerObject(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public FileManagerObject(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.file_key = str;
            this.origin_message_id = str2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareObject$b */
    private static final class C18072b extends ProtoAdapter<ShareObject> {
        C18072b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareObject.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareObject shareObject) {
            int i;
            if (shareObject.file_manager_object != null) {
                i = FileManagerObject.ADAPTER.encodedSizeWithTag(1, shareObject.file_manager_object);
            } else {
                i = 0;
            }
            return i + shareObject.unknownFields().size();
        }

        /* renamed from: a */
        public ShareObject decode(ProtoReader protoReader) throws IOException {
            C18071a aVar = new C18071a();
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
                    aVar.mo62728a(FileManagerObject.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareObject shareObject) throws IOException {
            if (shareObject.file_manager_object != null) {
                FileManagerObject.ADAPTER.encodeWithTag(protoWriter, 1, shareObject.file_manager_object);
            }
            protoWriter.writeBytes(shareObject.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareObject$a */
    public static final class C18071a extends Message.Builder<ShareObject, C18071a> {

        /* renamed from: a */
        public FileManagerObject f45199a;

        /* renamed from: a */
        public ShareObject build() {
            return new ShareObject(this.f45199a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18071a mo62728a(FileManagerObject fileManagerObject) {
            this.f45199a = fileManagerObject;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18071a newBuilder() {
        C18071a aVar = new C18071a();
        aVar.f45199a = this.file_manager_object;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ShareObject");
        StringBuilder sb = new StringBuilder();
        if (this.file_manager_object != null) {
            sb.append(", file_manager_object=");
            sb.append(this.file_manager_object);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareObject{");
        replace.append('}');
        return replace.toString();
    }

    public ShareObject(FileManagerObject fileManagerObject) {
        this(fileManagerObject, ByteString.EMPTY);
    }

    public ShareObject(FileManagerObject fileManagerObject, ByteString byteString) {
        super(ADAPTER, byteString);
        this.file_manager_object = fileManagerObject;
    }
}
