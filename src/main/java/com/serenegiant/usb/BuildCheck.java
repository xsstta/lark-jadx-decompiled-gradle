package com.serenegiant.usb;

import android.os.Build;

final class BuildCheck {
    private BuildCheck() {
    }

    public static boolean isAPI1() {
        return check(1);
    }

    public static boolean isAPI10() {
        return check(10);
    }

    public static boolean isAPI11() {
        return check(11);
    }

    public static boolean isAPI12() {
        return check(12);
    }

    public static boolean isAPI13() {
        return check(13);
    }

    public static boolean isAPI14() {
        return check(14);
    }

    public static boolean isAPI15() {
        return check(15);
    }

    public static boolean isAPI16() {
        return check(16);
    }

    public static boolean isAPI17() {
        return check(17);
    }

    public static boolean isAPI18() {
        return check(18);
    }

    public static boolean isAPI19() {
        return check(19);
    }

    public static boolean isAPI2() {
        return check(2);
    }

    public static boolean isAPI20() {
        return check(20);
    }

    public static boolean isAPI21() {
        return check(21);
    }

    public static boolean isAPI22() {
        return check(22);
    }

    public static boolean isAPI23() {
        return check(23);
    }

    public static boolean isAPI24() {
        return check(24);
    }

    public static boolean isAPI25() {
        return check(25);
    }

    public static boolean isAPI26() {
        return check(26);
    }

    public static boolean isAPI27() {
        return check(27);
    }

    public static boolean isAPI3() {
        return check(3);
    }

    public static boolean isAPI4() {
        return check(4);
    }

    public static boolean isAPI5() {
        return check(5);
    }

    public static boolean isAPI6() {
        return check(6);
    }

    public static boolean isAPI7() {
        return check(7);
    }

    public static boolean isAPI8() {
        return check(8);
    }

    public static boolean isAPI9() {
        return check(9);
    }

    public static boolean isAndroid1_5() {
        return check(3);
    }

    public static boolean isAndroid1_6() {
        return check(4);
    }

    public static boolean isAndroid2_0() {
        return check(5);
    }

    public static boolean isAndroid2_2() {
        return check(8);
    }

    public static boolean isAndroid2_3() {
        return check(9);
    }

    public static boolean isAndroid2_3_3() {
        return check(10);
    }

    public static boolean isAndroid3() {
        return check(11);
    }

    public static boolean isAndroid3_1() {
        return check(12);
    }

    public static boolean isAndroid3_2() {
        return check(13);
    }

    public static boolean isAndroid4() {
        return check(14);
    }

    public static boolean isAndroid4_0_3() {
        return check(15);
    }

    public static boolean isAndroid4_1() {
        return check(16);
    }

    public static boolean isAndroid4_2() {
        return check(17);
    }

    public static boolean isAndroid4_3() {
        return check(18);
    }

    public static boolean isAndroid4_4() {
        return check(19);
    }

    public static boolean isAndroid5() {
        return check(21);
    }

    public static boolean isAndroid6() {
        return check(23);
    }

    public static boolean isAndroid7() {
        return check(24);
    }

    public static boolean isAndroid8() {
        return check(26);
    }

    public static boolean isBase() {
        return check(1);
    }

    public static boolean isBase11() {
        return check(2);
    }

    public static boolean isCupcake() {
        return check(3);
    }

    public static boolean isDonut() {
        return check(4);
    }

    public static boolean isEclair() {
        return check(5);
    }

    public static boolean isEclair01() {
        return check(6);
    }

    public static boolean isEclairMR1() {
        return check(7);
    }

    public static boolean isFroyo() {
        return check(8);
    }

    public static boolean isGingerBread() {
        return check(9);
    }

    public static boolean isGingerBreadMR1() {
        return check(10);
    }

    public static boolean isHoneyComb() {
        return check(11);
    }

    public static boolean isHoneyCombMR1() {
        return check(12);
    }

    public static boolean isHoneyCombMR2() {
        return check(13);
    }

    public static boolean isIcecreamSandwich() {
        return check(14);
    }

    public static boolean isIcecreamSandwichMR1() {
        return check(15);
    }

    public static boolean isJellyBean() {
        return check(16);
    }

    public static boolean isJellyBeanMR2() {
        return check(18);
    }

    public static boolean isJellyBeanMr1() {
        return check(17);
    }

    public static boolean isKitKat() {
        return check(19);
    }

    public static boolean isKitKatWatch() {
        return check(20);
    }

    public static boolean isL() {
        return check(21);
    }

    public static boolean isLollipop() {
        return check(21);
    }

    public static boolean isM() {
        return check(23);
    }

    public static boolean isMarshmallow() {
        return check(23);
    }

    public static boolean isN() {
        return check(24);
    }

    public static boolean isNMR1() {
        return check(25);
    }

    public static boolean isNougat() {
        return check(24);
    }

    public static boolean isNougatMR1() {
        return check(25);
    }

    public static boolean isO() {
        return check(26);
    }

    public static boolean isOMR1() {
        return check(27);
    }

    public static boolean isOreo() {
        return check(26);
    }

    public static boolean isOreoMR1() {
        return check(27);
    }

    public static boolean isCurrentDevelopment() {
        if (Build.VERSION.SDK_INT == 10000) {
            return true;
        }
        return false;
    }

    public static boolean isLollipopMR1() {
        if (Build.VERSION.SDK_INT >= 22) {
            return true;
        }
        return false;
    }

    private static final boolean check(int i) {
        if (Build.VERSION.SDK_INT >= i) {
            return true;
        }
        return false;
    }
}
