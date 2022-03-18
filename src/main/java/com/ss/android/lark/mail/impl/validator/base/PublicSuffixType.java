package com.ss.android.lark.mail.impl.validator.base;

public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY('!', '?');
    
    private final char innerNodeCode;
    private final char leafNodeCode;

    /* access modifiers changed from: package-private */
    public char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    /* access modifiers changed from: package-private */
    public char getLeafNodeCode() {
        return this.leafNodeCode;
    }

    static PublicSuffixType fromIsPrivate(boolean z) {
        if (z) {
            return PRIVATE;
        }
        return REGISTRY;
    }

    static PublicSuffixType fromCode(char c) {
        PublicSuffixType[] values = values();
        for (PublicSuffixType publicSuffixType : values) {
            if (publicSuffixType.getInnerNodeCode() == c || publicSuffixType.getLeafNodeCode() == c) {
                return publicSuffixType;
            }
        }
        throw new IllegalArgumentException("No enum corresponding to given code: " + c);
    }

    private PublicSuffixType(char c, char c2) {
        this.innerNodeCode = c;
        this.leafNodeCode = c2;
    }
}
