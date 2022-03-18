package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00017B\u0001\u0012$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007\u0012$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007\u0012$\b\u0002\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007\u0012$\b\u0002\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\u000bJ%\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J%\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J%\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J%\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J¡\u0001\u0010\u0015\u001a\u00020\u00002$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00072$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00072$\b\u0002\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00072$\b\u0002\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\u0006\u0010\u001a\u001a\u00020\u0006J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0006J\u0006\u0010!\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\u0006J\u0006\u0010#\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u0006J\u0006\u0010%\u001a\u00020\u0006J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\u0006\u0010'\u001a\u00020\u0017J\u0006\u0010(\u001a\u00020\u0017J\u0006\u0010)\u001a\u00020\u0017J\u0006\u0010*\u001a\u00020\u0017J\u0006\u0010+\u001a\u00020\u0017J\u0006\u0010,\u001a\u00020\u0017J\u0006\u0010-\u001a\u00020\u0017J\u0006\u0010.\u001a\u00020\u0017J\u0006\u0010/\u001a\u00020\u0017J\u0006\u00100\u001a\u00020\u0017J\u0006\u00101\u001a\u00020\u0017J\u0006\u00102\u001a\u00020\u0017J\u0006\u00103\u001a\u00020\u0017J\u0006\u00104\u001a\u00020\u0017J\t\u00105\u001a\u000206HÖ\u0001R-\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR-\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR-\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u00068"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BlockOptions;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "Lcom/bytedance/ee/util/io/NonProguard;", "securityMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "commentMap", "externalAccessMap", "linkShareMap", "(Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V", "getCommentMap", "()Ljava/util/HashMap;", "getExternalAccessMap", "getLinkShareMap", "getSecurityMap", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "getCommentEditBlockValue", "getCommentReadBlockValue", "getExternalAccessCloseBlockValue", "getExternalAccessOpenBlockValue", "getLinkShareAnyoneEditBlockValue", "getLinkShareAnyoneReadBlockValue", "getLinkShareCloseBlockValue", "getLinkShareInternalEditBlockValue", "getLinkShareInternalReadBlockValue", "getSecurityEditBlockValue", "getSecurityFaBlockValue", "getSecurityReadBlockValue", "hashCode", "isCommentEditDisable", "isCommentEnable", "isCommentReadDisable", "isExternalAccessCloseDisable", "isExternalAccessOpenDisable", "isLinkShareAnyoneEditDisable", "isLinkShareAnyoneReadDisable", "isLinkShareCloseDisable", "isLinkShareInternalEditDisable", "isLinkShareInternalReadDisable", "isSecurityEditDisable", "isSecurityEnable", "isSecurityFaDisable", "isSecurityReadDisable", "toString", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BlockOptions extends NetService.Result<Serializable> implements NonProguard {
    public static final Companion Companion = new Companion(null);
    private final HashMap<Integer, Integer> commentMap;
    private final HashMap<Integer, Integer> externalAccessMap;
    private final HashMap<Integer, Integer> linkShareMap;
    private final HashMap<Integer, Integer> securityMap;

    public BlockOptions() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.middleground.permission.permission.doc.BlockOptions */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlockOptions copy$default(BlockOptions blockOptions, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, int i, Object obj) {
        if ((i & 1) != 0) {
            hashMap = blockOptions.securityMap;
        }
        if ((i & 2) != 0) {
            hashMap2 = blockOptions.commentMap;
        }
        if ((i & 4) != 0) {
            hashMap3 = blockOptions.externalAccessMap;
        }
        if ((i & 8) != 0) {
            hashMap4 = blockOptions.linkShareMap;
        }
        return blockOptions.copy(hashMap, hashMap2, hashMap3, hashMap4);
    }

    public final HashMap<Integer, Integer> component1() {
        return this.securityMap;
    }

    public final HashMap<Integer, Integer> component2() {
        return this.commentMap;
    }

    public final HashMap<Integer, Integer> component3() {
        return this.externalAccessMap;
    }

    public final HashMap<Integer, Integer> component4() {
        return this.linkShareMap;
    }

    public final BlockOptions copy(HashMap<Integer, Integer> hashMap, HashMap<Integer, Integer> hashMap2, HashMap<Integer, Integer> hashMap3, HashMap<Integer, Integer> hashMap4) {
        Intrinsics.checkParameterIsNotNull(hashMap, "securityMap");
        Intrinsics.checkParameterIsNotNull(hashMap2, "commentMap");
        Intrinsics.checkParameterIsNotNull(hashMap3, "externalAccessMap");
        Intrinsics.checkParameterIsNotNull(hashMap4, "linkShareMap");
        return new BlockOptions(hashMap, hashMap2, hashMap3, hashMap4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockOptions)) {
            return false;
        }
        BlockOptions blockOptions = (BlockOptions) obj;
        return Intrinsics.areEqual(this.securityMap, blockOptions.securityMap) && Intrinsics.areEqual(this.commentMap, blockOptions.commentMap) && Intrinsics.areEqual(this.externalAccessMap, blockOptions.externalAccessMap) && Intrinsics.areEqual(this.linkShareMap, blockOptions.linkShareMap);
    }

    public int hashCode() {
        HashMap<Integer, Integer> hashMap = this.securityMap;
        int i = 0;
        int hashCode = (hashMap != null ? hashMap.hashCode() : 0) * 31;
        HashMap<Integer, Integer> hashMap2 = this.commentMap;
        int hashCode2 = (hashCode + (hashMap2 != null ? hashMap2.hashCode() : 0)) * 31;
        HashMap<Integer, Integer> hashMap3 = this.externalAccessMap;
        int hashCode3 = (hashCode2 + (hashMap3 != null ? hashMap3.hashCode() : 0)) * 31;
        HashMap<Integer, Integer> hashMap4 = this.linkShareMap;
        if (hashMap4 != null) {
            i = hashMap4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "BlockOptions(securityMap=" + this.securityMap + ", commentMap=" + this.commentMap + ", externalAccessMap=" + this.externalAccessMap + ", linkShareMap=" + this.linkShareMap + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BlockOptions$Companion;", "", "()V", "CONSTRAINTS_BY_CONTAINER", "", "CONSTRAINTS_BY_PARENT", "CONSTRAINTS_BY_SELF", "CONSTRAINTS_BY_TENANT", "NO_CONSTRAINTS", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.BlockOptions$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final HashMap<Integer, Integer> getCommentMap() {
        return this.commentMap;
    }

    public final HashMap<Integer, Integer> getExternalAccessMap() {
        return this.externalAccessMap;
    }

    public final HashMap<Integer, Integer> getLinkShareMap() {
        return this.linkShareMap;
    }

    public final HashMap<Integer, Integer> getSecurityMap() {
        return this.securityMap;
    }

    public final boolean isCommentEditDisable() {
        if (getCommentEditBlockValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isCommentEnable() {
        if (isCommentReadDisable() || isCommentEditDisable()) {
            return false;
        }
        return true;
    }

    public final boolean isCommentReadDisable() {
        if (getCommentReadBlockValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isExternalAccessCloseDisable() {
        if (getExternalAccessCloseBlockValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isExternalAccessOpenDisable() {
        if (getExternalAccessOpenBlockValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isLinkShareAnyoneEditDisable() {
        if (getLinkShareAnyoneEditBlockValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isLinkShareAnyoneReadDisable() {
        if (getLinkShareAnyoneReadBlockValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isLinkShareCloseDisable() {
        if (getLinkShareCloseBlockValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isLinkShareInternalEditDisable() {
        if (getLinkShareInternalEditBlockValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isLinkShareInternalReadDisable() {
        if (getLinkShareInternalReadBlockValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isSecurityEditDisable() {
        if (getSecurityEditBlockValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isSecurityFaDisable() {
        if (getSecurityFaBlockValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isSecurityReadDisable() {
        if (getSecurityReadBlockValue() != 0) {
            return true;
        }
        return false;
    }

    public final int getCommentEditBlockValue() {
        Integer num = this.commentMap.get(2);
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "commentMap[COMMENT_WITH_…T_PERM] ?: NO_CONSTRAINTS");
        return num.intValue();
    }

    public final int getCommentReadBlockValue() {
        Integer num = this.commentMap.get(1);
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "commentMap[COMMENT_WITH_…D_PERM] ?: NO_CONSTRAINTS");
        return num.intValue();
    }

    public final int getExternalAccessCloseBlockValue() {
        Integer num = this.externalAccessMap.get(2);
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "externalAccessMap[2] ?: NO_CONSTRAINTS");
        return num.intValue();
    }

    public final int getExternalAccessOpenBlockValue() {
        Integer num = this.externalAccessMap.get(1);
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "externalAccessMap[1] ?: NO_CONSTRAINTS");
        return num.intValue();
    }

    public final int getLinkShareAnyoneEditBlockValue() {
        Integer num = this.linkShareMap.get(5);
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "linkShareMap[LINK_SHARE_…E_EDIT] ?: NO_CONSTRAINTS");
        return num.intValue();
    }

    public final int getLinkShareAnyoneReadBlockValue() {
        Integer num = this.linkShareMap.get(4);
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "linkShareMap[LINK_SHARE_…E_READ] ?: NO_CONSTRAINTS");
        return num.intValue();
    }

    public final int getLinkShareCloseBlockValue() {
        Integer num = this.linkShareMap.get(1);
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "linkShareMap[LINK_SHARE_CLOSE] ?: NO_CONSTRAINTS");
        return num.intValue();
    }

    public final int getLinkShareInternalEditBlockValue() {
        Integer num = this.linkShareMap.get(3);
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "linkShareMap[LINK_SHARE_…L_EDIT] ?: NO_CONSTRAINTS");
        return num.intValue();
    }

    public final int getLinkShareInternalReadBlockValue() {
        Integer num = this.linkShareMap.get(2);
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "linkShareMap[LINK_SHARE_…L_READ] ?: NO_CONSTRAINTS");
        return num.intValue();
    }

    public final int getSecurityEditBlockValue() {
        Integer num = this.securityMap.get(2);
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "securityMap[SECURITY_WITH_EDIT] ?: NO_CONSTRAINTS");
        return num.intValue();
    }

    public final int getSecurityFaBlockValue() {
        Integer num = this.securityMap.get(3);
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "securityMap[SECURITY_WITH_FA] ?: NO_CONSTRAINTS");
        return num.intValue();
    }

    public final int getSecurityReadBlockValue() {
        Integer num = this.securityMap.get(1);
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "securityMap[SECURITY_WITH_READ] ?: NO_CONSTRAINTS");
        return num.intValue();
    }

    public final boolean isSecurityEnable() {
        if (isSecurityReadDisable() || isSecurityEditDisable() || isSecurityFaDisable()) {
            return false;
        }
        return true;
    }

    public BlockOptions(HashMap<Integer, Integer> hashMap, HashMap<Integer, Integer> hashMap2, HashMap<Integer, Integer> hashMap3, HashMap<Integer, Integer> hashMap4) {
        Intrinsics.checkParameterIsNotNull(hashMap, "securityMap");
        Intrinsics.checkParameterIsNotNull(hashMap2, "commentMap");
        Intrinsics.checkParameterIsNotNull(hashMap3, "externalAccessMap");
        Intrinsics.checkParameterIsNotNull(hashMap4, "linkShareMap");
        this.securityMap = hashMap;
        this.commentMap = hashMap2;
        this.externalAccessMap = hashMap3;
        this.linkShareMap = hashMap4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlockOptions(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HashMap() : hashMap, (i & 2) != 0 ? new HashMap() : hashMap2, (i & 4) != 0 ? new HashMap() : hashMap3, (i & 8) != 0 ? new HashMap() : hashMap4);
    }
}
