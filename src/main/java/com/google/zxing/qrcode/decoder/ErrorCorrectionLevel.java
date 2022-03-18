package com.google.zxing.qrcode.decoder;

public enum ErrorCorrectionLevel {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private static final ErrorCorrectionLevel[] FOR_BITS;
    private final int bits;

    public int getBits() {
        return this.bits;
    }

    static {
        ErrorCorrectionLevel errorCorrectionLevel;
        ErrorCorrectionLevel errorCorrectionLevel2;
        ErrorCorrectionLevel errorCorrectionLevel3;
        ErrorCorrectionLevel errorCorrectionLevel4;
        FOR_BITS = new ErrorCorrectionLevel[]{errorCorrectionLevel2, errorCorrectionLevel, errorCorrectionLevel4, errorCorrectionLevel3};
    }

    public static ErrorCorrectionLevel forBits(int i) {
        if (i >= 0) {
            ErrorCorrectionLevel[] errorCorrectionLevelArr = FOR_BITS;
            if (i < errorCorrectionLevelArr.length) {
                return errorCorrectionLevelArr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    private ErrorCorrectionLevel(int i) {
        this.bits = i;
    }
}
