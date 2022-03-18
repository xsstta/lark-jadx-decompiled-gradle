package com.ss.android.lark.moments.impl.publish.draft;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001&BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0006\u0010$\u001a\u00020%R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/draft/MomentsDraftData;", "", "categoryId", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "image", "", "Lcom/ss/android/lark/moments/impl/publish/draft/ImageData;", "media", "Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;", "identity", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "(Ljava/lang/String;Lcom/ss/android/lark/widget/richtext/RichText;Ljava/util/List;Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;)V", "getCategoryId", "()Ljava/lang/String;", "getIdentity", "()Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "getImage", "()Ljava/util/List;", "getMedia", "()Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "toTransactionData", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.draft.a */
public final class MomentsDraftData {

    /* renamed from: a */
    public static final Companion f120721a = new Companion(null);

    /* renamed from: b */
    private final String f120722b;

    /* renamed from: c */
    private final RichText f120723c;

    /* renamed from: d */
    private final List<ImageData> f120724d;

    /* renamed from: e */
    private final VideoGridInfo f120725e;

    /* renamed from: f */
    private final MomentsPublishViewModel.IdentityType f120726f;

    public MomentsDraftData() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MomentsDraftData)) {
            return false;
        }
        MomentsDraftData aVar = (MomentsDraftData) obj;
        return Intrinsics.areEqual(this.f120722b, aVar.f120722b) && Intrinsics.areEqual(this.f120723c, aVar.f120723c) && Intrinsics.areEqual(this.f120724d, aVar.f120724d) && Intrinsics.areEqual(this.f120725e, aVar.f120725e) && Intrinsics.areEqual(this.f120726f, aVar.f120726f);
    }

    public int hashCode() {
        String str = this.f120722b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        RichText richText = this.f120723c;
        int hashCode2 = (hashCode + (richText != null ? richText.hashCode() : 0)) * 31;
        List<ImageData> list = this.f120724d;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        VideoGridInfo videoGridInfo = this.f120725e;
        int hashCode4 = (hashCode3 + (videoGridInfo != null ? videoGridInfo.hashCode() : 0)) * 31;
        MomentsPublishViewModel.IdentityType identityType = this.f120726f;
        if (identityType != null) {
            i = identityType.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "MomentsDraftData(categoryId=" + this.f120722b + ", richText=" + this.f120723c + ", image=" + this.f120724d + ", media=" + this.f120725e + ", identity=" + this.f120726f + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/draft/MomentsDraftData$Companion;", "", "()V", "DRAFT_PUBLISH_KEY_CATEGORY_ID", "", "DRAFT_PUBLISH_KEY_IDENTITY", "DRAFT_PUBLISH_KEY_IMAGE", "DRAFT_PUBLISH_KEY_MEDIA", "DRAFT_PUBLISH_KEY_RICH_TEXT", "parseToDraftData", "Lcom/ss/android/lark/moments/impl/publish/draft/MomentsDraftData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.draft.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsDraftData mo168030a(TransationData jVar) {
            if (jVar != null) {
                return new MomentsDraftData((String) jVar.mo147174a("category_id"), (RichText) jVar.mo147174a("rich_text"), (List) jVar.mo147174a("image"), (VideoGridInfo) jVar.mo147174a("media"), (MomentsPublishViewModel.IdentityType) jVar.mo147174a("identity"));
            }
            return null;
        }
    }

    /* renamed from: b */
    public final String mo168022b() {
        return this.f120722b;
    }

    /* renamed from: c */
    public final RichText mo168023c() {
        return this.f120723c;
    }

    /* renamed from: d */
    public final List<ImageData> mo168024d() {
        return this.f120724d;
    }

    /* renamed from: e */
    public final VideoGridInfo mo168025e() {
        return this.f120725e;
    }

    /* renamed from: f */
    public final MomentsPublishViewModel.IdentityType mo168027f() {
        return this.f120726f;
    }

    /* renamed from: a */
    public final TransationData mo168021a() {
        TransationData jVar = new TransationData();
        jVar.mo147176a("category_id", this.f120722b);
        jVar.mo147176a("rich_text", this.f120723c);
        jVar.mo147176a("image", this.f120724d);
        jVar.mo147176a("media", this.f120725e);
        jVar.mo147176a("identity", this.f120726f);
        return jVar;
    }

    public MomentsDraftData(String str, RichText richText, List<ImageData> list, VideoGridInfo videoGridInfo, MomentsPublishViewModel.IdentityType identityType) {
        this.f120722b = str;
        this.f120723c = richText;
        this.f120724d = list;
        this.f120725e = videoGridInfo;
        this.f120726f = identityType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MomentsDraftData(String str, RichText richText, List list, VideoGridInfo videoGridInfo, MomentsPublishViewModel.IdentityType identityType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : richText, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : videoGridInfo, (i & 16) != 0 ? null : identityType);
    }
}
