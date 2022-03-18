package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Result;", "", "action", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiAction;", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiAction;)V", "getAction", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiAction;", "expandUid", "", "getExpandUid", "()Ljava/lang/String;", "setExpandUid", "(Ljava/lang/String;)V", "toString", "Companion", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Loading;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Err;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Ok;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.e */
public abstract class Result {

    /* renamed from: a */
    public static final Companion f33436a = new Companion(null);

    /* renamed from: b */
    private String f33437b;

    /* renamed from: c */
    private final WikiAction f33438c;

    @JvmStatic
    /* renamed from: a */
    public static final Err m51904a(WikiAction wikiAction, Throwable th) {
        return f33436a.mo47508a(wikiAction, th);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Loading m51905a(WikiAction wikiAction) {
        return f33436a.mo47509a(wikiAction);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Ok m51906a(WikiAction wikiAction, WikiUIList kVar) {
        return f33436a.mo47510a(wikiAction, kVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Result$Companion;", "", "()V", "err", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Err;", "action", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiAction;", "", "loading", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Loading;", "ok", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Ok;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Loading mo47509a(WikiAction wikiAction) {
            Intrinsics.checkParameterIsNotNull(wikiAction, "action");
            return new Loading(wikiAction);
        }

        @JvmStatic
        /* renamed from: a */
        public final Err mo47508a(WikiAction wikiAction, Throwable th) {
            Intrinsics.checkParameterIsNotNull(wikiAction, "action");
            Intrinsics.checkParameterIsNotNull(th, "err");
            return new Err(wikiAction, th);
        }

        @JvmStatic
        /* renamed from: a */
        public final Ok mo47510a(WikiAction wikiAction, WikiUIList kVar) {
            Intrinsics.checkParameterIsNotNull(wikiAction, "action");
            return new Ok(wikiAction, kVar);
        }
    }

    /* renamed from: j */
    public final String mo47505j() {
        return this.f33437b;
    }

    /* renamed from: k */
    public final WikiAction mo47506k() {
        return this.f33438c;
    }

    public String toString() {
        return getClass().getSimpleName() + "(action=" + this.f33438c + ')';
    }

    /* renamed from: i */
    public final void mo47504i(String str) {
        this.f33437b = str;
    }

    private Result(WikiAction wikiAction) {
        this.f33438c = wikiAction;
    }

    public /* synthetic */ Result(WikiAction wikiAction, DefaultConstructorMarker defaultConstructorMarker) {
        this(wikiAction);
    }
}
