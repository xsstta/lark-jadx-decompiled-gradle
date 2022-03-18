package com.ss.android.lark.feed.app.team.entity;

import com.larksuite.framework.callback.Entity.ErrorResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/feed/app/team/entity/ChatVisibilityUpdateResult;", "", "()V", "Error", "Success", "Lcom/ss/android/lark/feed/app/team/entity/ChatVisibilityUpdateResult$Success;", "Lcom/ss/android/lark/feed/app/team/entity/ChatVisibilityUpdateResult$Error;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.entity.a */
public abstract class ChatVisibilityUpdateResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/feed/app/team/entity/ChatVisibilityUpdateResult$Error;", "Lcom/ss/android/lark/feed/app/team/entity/ChatVisibilityUpdateResult;", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;)V", "getError", "()Lcom/larksuite/framework/callback/Entity/ErrorResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.entity.a$a */
    public static final class Error extends ChatVisibilityUpdateResult {

        /* renamed from: a */
        private final ErrorResult f97122a;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Error) && Intrinsics.areEqual(this.f97122a, ((Error) obj).f97122a);
            }
            return true;
        }

        public int hashCode() {
            ErrorResult errorResult = this.f97122a;
            if (errorResult != null) {
                return errorResult.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Error(error=" + this.f97122a + ")";
        }

        /* renamed from: a */
        public final ErrorResult mo138713a() {
            return this.f97122a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(ErrorResult errorResult) {
            super(null);
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            this.f97122a = errorResult;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/feed/app/team/entity/ChatVisibilityUpdateResult$Success;", "Lcom/ss/android/lark/feed/app/team/entity/ChatVisibilityUpdateResult;", "chat", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "(Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;)V", "getChat", "()Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.entity.a$b */
    public static final class Success extends ChatVisibilityUpdateResult {

        /* renamed from: a */
        private final C37874d f97123a;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Success) && Intrinsics.areEqual(this.f97123a, ((Success) obj).f97123a);
            }
            return true;
        }

        public int hashCode() {
            C37874d dVar = this.f97123a;
            if (dVar != null) {
                return dVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Success(chat=" + this.f97123a + ")";
        }

        /* renamed from: a */
        public final C37874d mo138717a() {
            return this.f97123a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(C37874d dVar) {
            super(null);
            Intrinsics.checkParameterIsNotNull(dVar, "chat");
            this.f97123a = dVar;
        }
    }

    private ChatVisibilityUpdateResult() {
    }

    public /* synthetic */ ChatVisibilityUpdateResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
