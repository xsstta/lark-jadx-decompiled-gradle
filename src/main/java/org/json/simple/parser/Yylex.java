package org.json.simple.parser;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* access modifiers changed from: package-private */
public class Yylex {
    private static final int[] ZZ_ACTION = zzUnpackAction();
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();
    private static final char[] ZZ_CMAP = zzUnpackCMap("\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016ﾂ\u0000");
    private static final String[] ZZ_ERROR_MSG = {"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
    private static final int[] ZZ_LEXSTATE = {0, 0, 1, 1};
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();
    private static final int[] ZZ_TRANS = {2, 2, 3, 4, 2, 2, 2, 5, 2, 6, 2, 2, 7, 8, 2, 9, 2, 2, 2, 2, 2, 10, 11, 12, 13, 14, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 18, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, 19, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, 24, 25, 26, 27, 28, 29, 30, 31, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 35, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, 39, -1, 39, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, 42, -1, 42, -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, 43, -1, 43, -1, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, 44, -1, 44, -1, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1};
    private StringBuffer sb;
    private int yychar;
    private int yycolumn;
    private int yyline;
    private boolean zzAtBOL;
    private boolean zzAtEOF;
    private char[] zzBuffer;
    private int zzCurrentPos;
    private int zzEndRead;
    private int zzLexicalState;
    private int zzMarkedPos;
    private Reader zzReader;
    private int zzStartRead;
    private int zzState;

    Yylex(InputStream inputStream) {
        this(new InputStreamReader(inputStream));
    }

    Yylex(Reader reader) {
        this.zzBuffer = new char[16384];
        this.zzAtBOL = true;
        this.sb = new StringBuffer();
        this.zzReader = reader;
    }

    private boolean zzRefill() throws IOException {
        int read;
        int i = this.zzStartRead;
        if (i > 0) {
            char[] cArr = this.zzBuffer;
            System.arraycopy(cArr, i, cArr, 0, this.zzEndRead - i);
            int i2 = this.zzEndRead;
            int i3 = this.zzStartRead;
            this.zzEndRead = i2 - i3;
            this.zzCurrentPos -= i3;
            this.zzMarkedPos -= i3;
            this.zzStartRead = 0;
        }
        int i4 = this.zzCurrentPos;
        char[] cArr2 = this.zzBuffer;
        if (i4 >= cArr2.length) {
            char[] cArr3 = new char[(i4 * 2)];
            System.arraycopy(cArr2, 0, cArr3, 0, cArr2.length);
            this.zzBuffer = cArr3;
        }
        Reader reader = this.zzReader;
        char[] cArr4 = this.zzBuffer;
        int i5 = this.zzEndRead;
        int read2 = reader.read(cArr4, i5, cArr4.length - i5);
        if (read2 > 0) {
            this.zzEndRead += read2;
            return false;
        } else if (read2 != 0 || (read = this.zzReader.read()) == -1) {
            return true;
        } else {
            char[] cArr5 = this.zzBuffer;
            int i6 = this.zzEndRead;
            this.zzEndRead = i6 + 1;
            cArr5[i6] = (char) read;
            return false;
        }
    }

    private void zzScanError(int i) {
        String str;
        try {
            str = ZZ_ERROR_MSG[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            str = ZZ_ERROR_MSG[0];
        }
        throw new Error(str);
    }

    private static int zzUnpackAction(String str, int i, int[] iArr) {
        int i2;
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            int charAt = str.charAt(i3);
            int i5 = i4 + 1;
            int charAt2 = str.charAt(i4);
            while (true) {
                i2 = i + 1;
                iArr[i] = charAt2;
                charAt--;
                if (charAt <= 0) {
                    break;
                }
                i = i2;
            }
            i3 = i5;
            i = i2;
        }
        return i;
    }

    private static int[] zzUnpackAction() {
        int[] iArr = new int[45];
        zzUnpackAction("\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018", 0, iArr);
        return iArr;
    }

    private static int zzUnpackAttribute(String str, int i, int[] iArr) {
        int i2;
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            int charAt = str.charAt(i3);
            int i5 = i4 + 1;
            int charAt2 = str.charAt(i4);
            while (true) {
                i2 = i + 1;
                iArr[i] = charAt2;
                charAt--;
                if (charAt <= 0) {
                    break;
                }
                i = i2;
            }
            i3 = i5;
            i = i2;
        }
        return i;
    }

    private static int[] zzUnpackAttribute() {
        int[] iArr = new int[45];
        zzUnpackAttribute("\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t", 0, iArr);
        return iArr;
    }

    private static char[] zzUnpackCMap(String str) {
        int i;
        char[] cArr = new char[65536];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 90) {
            int i4 = i2 + 1;
            int charAt = str.charAt(i2);
            int i5 = i4 + 1;
            char charAt2 = str.charAt(i4);
            while (true) {
                i = i3 + 1;
                cArr[i3] = charAt2;
                charAt--;
                if (charAt <= 0) {
                    break;
                }
                i3 = i;
            }
            i2 = i5;
            i3 = i;
        }
        return cArr;
    }

    private static int zzUnpackRowMap(String str, int i, int[] iArr) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            iArr[i] = (str.charAt(i2) << 16) | str.charAt(i3);
            i++;
            i2 = i3 + 1;
        }
        return i;
    }

    private static int[] zzUnpackRowMap() {
        int[] iArr = new int[45];
        zzUnpackRowMap("\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u00006\u0000¢\u0000½\u0000Ø\u00006\u00006\u00006\u00006\u00006\u00006\u0000ó\u0000Ď\u00006\u0000ĩ\u0000ń\u0000ş\u0000ź\u0000ƕ\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000ư\u0000ǋ\u0000Ǧ\u0000Ǧ\u0000ȁ\u0000Ȝ\u0000ȷ\u0000ɒ\u00006\u00006\u0000ɭ\u0000ʈ\u00006", 0, iArr);
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public int getPosition() {
        return this.yychar;
    }

    public final void yybegin(int i) {
        this.zzLexicalState = i;
    }

    public final char yycharat(int i) {
        return this.zzBuffer[this.zzStartRead + i];
    }

    public final void yyclose() throws IOException {
        this.zzAtEOF = true;
        this.zzEndRead = this.zzStartRead;
        Reader reader = this.zzReader;
        if (reader != null) {
            reader.close();
        }
    }

    public final int yylength() {
        return this.zzMarkedPos - this.zzStartRead;
    }

    public Yytoken yylex() throws IOException, ParseException {
        char c;
        StringBuffer stringBuffer;
        char c2;
        int i;
        int i2 = this.zzEndRead;
        char[] cArr = this.zzBuffer;
        char[] cArr2 = ZZ_CMAP;
        int[] iArr = ZZ_TRANS;
        int[] iArr2 = ZZ_ROWMAP;
        int[] iArr3 = ZZ_ATTRIBUTE;
        while (true) {
            int i3 = this.zzMarkedPos;
            this.yychar += i3 - this.zzStartRead;
            this.zzStartRead = i3;
            this.zzCurrentPos = i3;
            this.zzState = ZZ_LEXSTATE[this.zzLexicalState];
            int i4 = -1;
            int i5 = i3;
            int i6 = -1;
            while (true) {
                if (i3 < i2) {
                    i = i3 + 1;
                    c = cArr[i3];
                } else if (!this.zzAtEOF) {
                    this.zzCurrentPos = i3;
                    this.zzMarkedPos = i5;
                    boolean zzRefill = zzRefill();
                    int i7 = this.zzCurrentPos;
                    i5 = this.zzMarkedPos;
                    char[] cArr3 = this.zzBuffer;
                    int i8 = this.zzEndRead;
                    if (zzRefill) {
                        cArr = cArr3;
                        i2 = i8;
                    } else {
                        i = i7 + 1;
                        i2 = i8;
                        c = cArr3[i7];
                        cArr = cArr3;
                    }
                }
                int i9 = iArr[iArr2[this.zzState] + cArr2[c]];
                if (i9 != i4) {
                    this.zzState = i9;
                    int i10 = iArr3[i9];
                    if ((i10 & 1) != 1) {
                        i4 = -1;
                    } else if ((i10 & 8) == 8) {
                        i5 = i;
                        i6 = i9;
                    } else {
                        i4 = -1;
                        i5 = i;
                        i6 = i9;
                    }
                    i3 = i;
                }
            }
            c = 65535;
            this.zzMarkedPos = i5;
            if (i6 >= 0) {
                i6 = ZZ_ACTION[i6];
            }
            switch (i6) {
                case 1:
                    throw new ParseException(this.yychar, 0, new Character(yycharat(0)));
                case 2:
                    return new Yytoken(0, Long.valueOf(yytext()));
                case 3:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                case 26:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR:
                case 29:
                case 30:
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 4:
                    StringBuffer stringBuffer2 = this.sb;
                    stringBuffer2.delete(0, stringBuffer2.length());
                    yybegin(2);
                    continue;
                case 5:
                    return new Yytoken(1, null);
                case 6:
                    return new Yytoken(2, null);
                case 7:
                    return new Yytoken(3, null);
                case 8:
                    return new Yytoken(4, null);
                case 9:
                    return new Yytoken(5, null);
                case 10:
                    return new Yytoken(6, null);
                case 11:
                    this.sb.append(yytext());
                    continue;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    stringBuffer = this.sb;
                    c2 = '\\';
                    break;
                case 13:
                    yybegin(0);
                    return new Yytoken(0, this.sb.toString());
                case 14:
                    stringBuffer = this.sb;
                    c2 = '\"';
                    break;
                case 15:
                    stringBuffer = this.sb;
                    c2 = '/';
                    break;
                case 16:
                    this.sb.append('\b');
                    continue;
                case 17:
                    stringBuffer = this.sb;
                    c2 = '\f';
                    break;
                case 18:
                    stringBuffer = this.sb;
                    c2 = '\n';
                    break;
                case 19:
                    stringBuffer = this.sb;
                    c2 = '\r';
                    break;
                case 20:
                    stringBuffer = this.sb;
                    c2 = '\t';
                    break;
                case 21:
                    return new Yytoken(0, Double.valueOf(yytext()));
                case 22:
                    return new Yytoken(0, null);
                case 23:
                    return new Yytoken(0, Boolean.valueOf(yytext()));
                case 24:
                    try {
                        this.sb.append((char) Integer.parseInt(yytext().substring(2), 16));
                        continue;
                    } catch (Exception e) {
                        throw new ParseException(this.yychar, 2, e);
                    }
                default:
                    if (c == 65535 && this.zzStartRead == this.zzCurrentPos) {
                        this.zzAtEOF = true;
                        return null;
                    }
                    zzScanError(1);
                    continue;
                    break;
            }
            stringBuffer.append(c2);
        }
    }

    public void yypushback(int i) {
        if (i > yylength()) {
            zzScanError(2);
        }
        this.zzMarkedPos -= i;
    }

    public final void yyreset(Reader reader) {
        this.zzReader = reader;
        this.zzAtBOL = true;
        this.zzAtEOF = false;
        this.zzStartRead = 0;
        this.zzEndRead = 0;
        this.zzMarkedPos = 0;
        this.zzCurrentPos = 0;
        this.yycolumn = 0;
        this.yychar = 0;
        this.yyline = 0;
        this.zzLexicalState = 0;
    }

    public final int yystate() {
        return this.zzLexicalState;
    }

    public final String yytext() {
        char[] cArr = this.zzBuffer;
        int i = this.zzStartRead;
        return new String(cArr, i, this.zzMarkedPos - i);
    }
}
