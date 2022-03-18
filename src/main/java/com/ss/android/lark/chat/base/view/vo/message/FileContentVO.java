package com.ss.android.lark.chat.base.view.vo.message;

import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0013\u001a\u00020\u00148FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/FileContentVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/BaseFileContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/FileContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/FileContent;)V", "filePath", "", "getFilePath", "()Ljava/lang/String;", "filePath$delegate", "Lkotlin/Lazy;", "fileState", "Lcom/ss/android/lark/chat/entity/message/content/FileState;", "getFileState", "()Lcom/ss/android/lark/chat/entity/message/content/FileState;", "fileState$delegate", "mime", "getMime", "mime$delegate", "progress", "", "getProgress", "()I", "progress$delegate", "isContentSame", "", "diffable", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.d */
public final class FileContentVO extends BaseFileContentVO<FileContent> {

    /* renamed from: a */
    private final Lazy f84826a;

    /* renamed from: b */
    private final Lazy f84827b;

    /* renamed from: c */
    private final Lazy f84828c;

    /* renamed from: d */
    private final Lazy f84829d;

    /* renamed from: o */
    public final String mo121838o() {
        return (String) this.f84826a.getValue();
    }

    /* renamed from: p */
    public final String mo121839p() {
        return (String) this.f84827b.getValue();
    }

    /* renamed from: q */
    public final FileState mo121840q() {
        return (FileState) this.f84828c.getValue();
    }

    /* renamed from: r */
    public final int mo121841r() {
        return ((Number) this.f84829d.getValue()).intValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/message/content/FileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.d$b */
    static final class C32973b extends Lambda implements Function0<FileState> {
        final /* synthetic */ FileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32973b(FileContent fileContent) {
            super(0);
            this.$content = fileContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FileState invoke() {
            return this.$content.getFileState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.d$d */
    static final class C32975d extends Lambda implements Function0<Integer> {
        final /* synthetic */ FileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32975d(FileContent fileContent) {
            super(0);
            this.$content = fileContent;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return this.$content.getProgress();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.d$a */
    static final class C32972a extends Lambda implements Function0<String> {
        final /* synthetic */ FileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32972a(FileContent fileContent) {
            super(0);
            this.$content = fileContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String filePath = this.$content.getFilePath();
            if (filePath != null) {
                return filePath;
            }
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.d$c */
    static final class C32974c extends Lambda implements Function0<String> {
        final /* synthetic */ FileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32974c(FileContent fileContent) {
            super(0);
            this.$content = fileContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getMime();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileContentVO(FileContent fileContent) {
        super(fileContent);
        Intrinsics.checkParameterIsNotNull(fileContent, "content");
        this.f84826a = LazyKt.lazy(new C32974c(fileContent));
        this.f84827b = LazyKt.lazy(new C32972a(fileContent));
        this.f84828c = LazyKt.lazy(new C32973b(fileContent));
        this.f84829d = LazyKt.lazy(new C32975d(fileContent));
    }

    @Override // com.ss.android.lark.chat.base.view.vo.message.BaseFileContentVO, com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        if (!super.mo121780a(aVar) || aVar == null || !(aVar instanceof FileContentVO)) {
            return false;
        }
        FileContentVO dVar = (FileContentVO) aVar;
        if (mo121840q() == dVar.mo121840q() && mo121841r() == dVar.mo121841r()) {
            return true;
        }
        return false;
    }
}
