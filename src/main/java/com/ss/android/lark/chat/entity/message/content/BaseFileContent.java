package com.ss.android.lark.chat.entity.message.content;

import com.ss.android.lark.chat.entity.message.content.BaseFileContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u000f\b&\u0018\u0000 4*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002:\u0003456B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u00101\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u00103\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0006\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\u000b\u001a\u00020\u00058FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001c\u0010 \u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R \u0010#\u001a\u00020\u0017X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0003\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010'\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u0003\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001c¨\u00067"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "T", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "()V", "isFromDrive", "", "()Z", "isInMyNutStore", "setInMyNutStore", "(Z)V", "isLanTransfer", "isLanTransferring", "isLanTransferring$delegate", "Lkotlin/Lazy;", "isSender", "setSender", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "lanTransStatus", "", "lanTransStatus$annotations", "getLanTransStatus", "()I", "setLanTransStatus", "(I)V", "name", "getName", "setName", "nameSpace", "getNameSpace", "setNameSpace", "saveToDrive", "saveToDrive$annotations", "getSaveToDrive", "setSaveToDrive", "size", "", "getSize", "()J", "setSize", "(J)V", ShareHitPoint.f121868c, "source$annotations", "getSource", "setSource", "isContentSame", "diffable", "isItemSame", "Companion", "Source", "TransStatus", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseFileContent<T extends BaseFileContent<T>> extends Content {
    public static final Companion Companion = new Companion(null);
    private boolean isInMyNutStore;
    private final Lazy isLanTransferring$delegate = LazyKt.lazy(new C34013b(this));
    private boolean isSender;
    private String key = "";
    private int lanTransStatus;
    private String name = "";
    private String nameSpace;
    private int saveToDrive = -1;
    private long size;
    private int source = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent$Source;", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent$TransStatus;", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransStatus {
    }

    public static /* synthetic */ void lanTransStatus$annotations() {
    }

    public static /* synthetic */ void saveToDrive$annotations() {
    }

    public static /* synthetic */ void source$annotations() {
    }

    public final boolean isLanTransferring() {
        return ((Boolean) this.isLanTransferring$delegate.getValue()).booleanValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent$Companion;", "", "()V", "ABORT_BY_RECEIVER", "", "ABORT_BY_SENDER", "ACCEPT", "CANCEL", "LAN_TRANS", "LARK_SERVER", "OFFLINE_MODE", "PENDING", "REFUSE", "SOURCE_NUT_STORE", "SOURCE_UNKNOWN", "TRANS_DONE", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.message.content.BaseFileContent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getKey() {
        return this.key;
    }

    public final int getLanTransStatus() {
        return this.lanTransStatus;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNameSpace() {
        return this.nameSpace;
    }

    public final int getSaveToDrive() {
        return this.saveToDrive;
    }

    public final long getSize() {
        return this.size;
    }

    public final int getSource() {
        return this.source;
    }

    public final boolean isInMyNutStore() {
        return this.isInMyNutStore;
    }

    public final boolean isSender() {
        return this.isSender;
    }

    public final boolean isFromDrive() {
        if (this.source == 2) {
            return true;
        }
        return false;
    }

    public final boolean isLanTransfer() {
        if (this.source == 3) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.message.content.BaseFileContent$b */
    static final class C34013b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ BaseFileContent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34013b(BaseFileContent baseFileContent) {
            super(0);
            this.this$0 = baseFileContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (!this.this$0.isLanTransfer() || (this.this$0.getLanTransStatus() != 1 && this.this$0.getLanTransStatus() != 0)) {
                return false;
            }
            return true;
        }
    }

    public final void setInMyNutStore(boolean z) {
        this.isInMyNutStore = z;
    }

    public final void setLanTransStatus(int i) {
        this.lanTransStatus = i;
    }

    public final void setNameSpace(String str) {
        this.nameSpace = str;
    }

    public final void setSaveToDrive(int i) {
        this.saveToDrive = i;
    }

    public final void setSender(boolean z) {
        this.isSender = z;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.key = str;
    }

    public final void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isContentSame(Content content) {
        if (content instanceof BaseFileContent) {
            BaseFileContent baseFileContent = (BaseFileContent) content;
            if (this.source == baseFileContent.source && this.lanTransStatus == baseFileContent.lanTransStatus && this.isSender == baseFileContent.isSender) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isItemSame(Content content) {
        if (content == null || !(content instanceof BaseFileContent) || !Intrinsics.areEqual(this.key, ((BaseFileContent) content).key)) {
            return false;
        }
        return true;
    }
}
