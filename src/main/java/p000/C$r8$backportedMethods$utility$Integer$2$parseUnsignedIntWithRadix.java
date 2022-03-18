package p000;

/* renamed from: $r8$backportedMethods$utility$Integer$2$parseUnsignedIntWithRadix  reason: invalid class name */
public /* synthetic */ class C$r8$backportedMethods$utility$Integer$2$parseUnsignedIntWithRadix {
    public static /* synthetic */ int parseUnsignedInt(String str, int i) {
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long parseLong = Long.parseLong(str, i);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }
}
