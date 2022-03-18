package com.ss.android.lark.utils;

import android.os.Build;
import com.ss.android.lark.log.Log;
import com.ss.android.vesdk.C63937ah;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0007J\u0018\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u0019H\u0002J\u0018\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u0019H\u0002J\u0018\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR!\u0010\f\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\tR!\u0010\u0010\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\tR\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R+\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001a\u0010\u001bR+\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00198BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001e\u0010\u001bR\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R+\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00198BX\u0002¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b#\u0010\u001b¨\u0006*"}, d2 = {"Lcom/ss/android/lark/utils/VeHWUtils;", "", "()V", "TAG", "", "canUseHwDecodeForH264", "", "canUseHwDecodeForH264$annotations", "getCanUseHwDecodeForH264", "()Z", "canUseHwDecodeForH264$delegate", "Lkotlin/Lazy;", "canUseHwDecodeForH265", "canUseHwDecodeForH265$annotations", "getCanUseHwDecodeForH265", "canUseHwDecodeForH265$delegate", "canUseHwEncodeForH264", "canUseHwEncodeForH264$annotations", "getCanUseHwEncodeForH264", "canUseHwEncodeForH264$delegate", "hwDecode264", "Lcom/ss/android/lark/utils/HWDecode;", "hwDecode265", "hwDecodeWhite264", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getHwDecodeWhite264", "()Ljava/util/ArrayList;", "hwDecodeWhite264$delegate", "hwDecodeWhite265", "getHwDecodeWhite265", "hwDecodeWhite265$delegate", "hwEncode264", "Lcom/ss/android/lark/utils/HWEncode;", "hwEncodeBlack264", "getHwEncodeBlack264", "hwEncodeBlack264$delegate", "configHwDecode", "", "getDefaultHWDecodeWhite264", "getDefaultHWDecodeWhite265", "getDefaultHWEncodeBlack264", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.utils.al */
public final class VeHWUtils {

    /* renamed from: a */
    public static final VeHWUtils f142315a = new VeHWUtils();

    /* renamed from: b */
    private static final HWDecode f142316b = VideoSettingUtils.m224296c().getFeature().getHwDecode264();

    /* renamed from: c */
    private static final HWDecode f142317c = VideoSettingUtils.m224296c().getFeature().getHwDecode265();

    /* renamed from: d */
    private static final HWEncode f142318d = VideoSettingUtils.m224296c().getFeature().getHwEncode264();

    /* renamed from: e */
    private static final Lazy f142319e = LazyKt.lazy(C57793d.INSTANCE);

    /* renamed from: f */
    private static final Lazy f142320f = LazyKt.lazy(C57794e.INSTANCE);

    /* renamed from: g */
    private static final Lazy f142321g = LazyKt.lazy(C57795f.INSTANCE);

    /* renamed from: h */
    private static final Lazy f142322h = LazyKt.lazy(C57790a.INSTANCE);

    /* renamed from: i */
    private static final Lazy f142323i = LazyKt.lazy(C57791b.INSTANCE);

    /* renamed from: j */
    private static final Lazy f142324j = LazyKt.lazy(C57792c.INSTANCE);

    /* renamed from: d */
    public static final boolean m224273d() {
        return ((Boolean) f142322h.getValue()).booleanValue();
    }

    /* renamed from: e */
    public static final boolean m224274e() {
        return ((Boolean) f142323i.getValue()).booleanValue();
    }

    /* renamed from: f */
    public static final boolean m224275f() {
        return ((Boolean) f142324j.getValue()).booleanValue();
    }

    /* renamed from: a */
    public final ArrayList<String> mo196100a() {
        return (ArrayList) f142319e.getValue();
    }

    /* renamed from: b */
    public final ArrayList<String> mo196101b() {
        return (ArrayList) f142320f.getValue();
    }

    /* renamed from: c */
    public final ArrayList<String> mo196102c() {
        return (ArrayList) f142321g.getValue();
    }

    private VeHWUtils() {
    }

    /* renamed from: h */
    public final ArrayList<String> mo196103h() {
        return CollectionsKt.arrayListOf("pbam00", "oppo r9 plusm a", "pbbm30", "pbbm00", "pbat00", "oppo r9sk", "vivo y66", "pdbm00", "v1930a", "vivo x9", "pcam10", "mp1718", "vivo y55a", "oppo r9 plustm a", "v1901a", "vivo x9s", "oppo r11s", "pcam00", "vivo y85a", "pchm10", "vivo y66l", "vivo y55", "vivo x9s l", "pbfm00", "vivo y71a", "pbbt00", "vivo y55l", "oppo r11", "pbem00", "vivo y71", "vivo x9s plus", "oppo r9st", "padm00", "oppo r11st", "v1934a", "v1928a", "oppo a77", "vivo y85", "g0245d", "ppa-al20", "vivo y53", "vivo x9s plus l", "v2002a", "v1965a", "vivo x9l", "vivo y53l", "pbft00", "vivo x9plus", "lenovo l78011", "padt00", "hlk-al00", "vivo x20a", "redmi 5a", "vivo y83a", "stk-al00", "ask-al00x", "oppo a77t", "vivo y66i a", "oppo r11t", "yu fly f9", "mi 6x", "redmi 5 plus", "vivo y66i", "yal-l21", "v1962a", "oppo a83", "redmi note 7", "v1818t", "huawei mla-al10", "pbcm30", "v1818ca", "8848 m5", "1707-a01", "v1813a", "vivo y51", "pact00", "art-al00x", "jsn-al00a", "vivo x7", "dig-al00", "dub-al00", "vivo x7plus", "nx569h", "nokia x6", "hlte217t", "vivo y51a", "1801-a01", "redmi 7", "vivo y83", "redmi note 5", "pcat00", "pcem00", "v1913a", "oppo a57", "pchm30", "oppo r7sm", "hlte300t", "le x620", "oppo a33", "vivo x20", "v1838a", "pdkm00", "hlte200t", "oppo r9s plust", "nx563j", "1807-a01", "paam00", "pcat10", "v1945a", "vivo z1i", "pdam10", "redmi note 3", "pbbt30", "redmi 5", "v1831a", "redmi note 8", "pbcm10", "lnd-al30", "v1818a", "v1732a", "mi 5x", "oppo r9s", "oppo r11s plus", "redmi 8a", "oppo a83t", "v1730ea", "mi 8 lite", "v1731ca", "vivo x21a", "pcgm00", "redmi 6 pro", "v1818ct", "jkm-al00b", "v1911a", "v1813t", "v1813ba", "pdvm00", "vivo v3max a", "ldn-al00", "pacm00", "v1932a", "vog-l29", "1803-a01", "vivo y79a", "1809-a01", "redmi 8", "v1732t", "gionee gn5007", "os105", "gionee m7", "bkk-al10", "redmi 7a", "vivo x9plus l", "pcpm00", "oppo r9skt", "pdkt00", "pckm80", "glk-al00", "redmi 4a", "gionee m7l", "oppo a59s", "sea-al10", "mp1602", "cam-tl00", "r7plusm", "oppo a33m", "pcdm10", "mi 6", "oppo r11s plust", "vivo x20plus a", "mi 8 se", "gionee s10", "vivo xplay6", "vivo y79", "v1832a", "art-al00m", "mp1710", "atu-al10", "oppo a73", "v1809a", "oppo r11 plus", "redmi note 5a", "gionee s10l", "cmcc m761", "ine-lx2r", "paat00", "oc105", "jsn-al00", "lenovo l38041", "redmi note 4x", "lra-al00", "mar-lx2", "od103", "mi 8", "pbct10", "mp1701", "v1941a", "huawei mla-tl10", "g0215d", "hry-al00a", "pafm00", "huawei caz-al10", "brq-an00", "ele-l29", "nx619j", "pot-al00a", "oppo a73t", "v1816a", "ine-lx2", "oppo r11 plusk", "ang-an00", "oneplus a5010", "vivo x21", "aum-al20", "vivo x6s a", "dub-al00a", "oppo a37m", "vivo x21i a", "bkl-al20", "sla-al00", "dub-tl00", "trt-al00a", "spn-al00", "vivo z3x", "nx629j", "vivo x20plus", "mar-al00", "aqm-al00", "v1813bt", "oneplus a5000", "oe106", "mi max 2", "sm-g9350", "vtr-al00", "col-al10", "m654", "pdym20", "hry-al00ta", "vivo xplay5a", "cdy-an00", "dub-al20", "moa-al20", "redmi note 8 pro", "jkm-al00", "hwi-al00", "mha-al00", "redmi 4x", "stf-al10", "8848 m4", "ine-al00", "huawei caz-tl20", "vivo y75a", "ars-al00", "nx616j", "le x820", "bkk-al00", "vivo x21i", "nx659j", "dli-al10", "pcnm00", "v1963a", "v2020a", "cam-al00", "jny-al10", "1713-a01", "vce-al00", "jkm-tl00", "v1836a", "mp1605", "vivo v3", "hlte200m", "rmx1971", "stf-al00", "gionee gn5007l", "sm-g9280", "v1816t", "v1921a", "moa-al00", "mi 5", "trt-al00", "huawei tag-al00", "pdpm00", "duk-al20", "med-al00", "oppo r9s plus", "mp1709", "gm1910", "dvc-an20", "pdyt20", "bln-al40", "par-al00", "tel-an00a", "aka-al10", "ldn-al20", "mxw-an00", "trt-tl10a", "redmi 6", "rmx1901", "redmi note 7 pro", "pbdm00", "oppo r7splus", "hlte213t", "huawei rio-al00", "oppo a59m", "pra-al00x", "mi max 3", "vivo y75", "mi cc 9e", "pra-al00", "nx609j", "mp1603", "v2001a", "bln-tl10", "m6 note", "v1838t", "cph1969", "vivo x6splus d", "nx611j", "pcdm00", "vivo y51t l", "cph2059", "oppo a79", "are-al00", "aum-tl20", "vky-al00", "jat-al00", "redmi note 2", "redmi note 4", "alp-al00", "cdy-an90", "atu-tl10", "hlte215t", "trt-tl10", "jsn-tl00", "vivo x21ud a", "sm-a515f", "rmx1851", "pclm50", "sm-g9500", "ask-al20", "hlk-al10", "v1938t", "mix 2", "oneplus a6010", "wlz-an00", "gionee f6l", "gm1900", "20200308", "mi 5s", "vivo y37", "oppo r9m", "sm-g9550", "20190808", "pdcm00", "cun-al00", "bln-al10", "nokia x7", "sne-al00", "oppo a57t", "cor-al10", "aqm-al10", "ta-1041", "oppo a53", "els-nx9", "v2031a", "vivo y75s", "sm-a715f", "mya-al10", "pdpt00", "v1990a", "cph2015", "redmi s2", "jef-an00", "od105", "xt1943-1", "nem-al10", "clt-l29", "cdy-tn00", "huawei nxt-al10", "v1829t", "hma-al00", "m2003j15sc", "oneplus a3010", "pccm00", "lya-l29", "pot-al10", "gionee f6", "nx531j", "oppo a79k", "v1901t", "mrd-al00", "s5", "mi max", "lnd-al40", "cun-tl00", "os103", "hlte510t", "bac-al00", "was-al00", "vivo y31a", "vivo x6a", "skr-a0", "stk-tl00", "hlte212t", "mi 9 se", "lio-an00", "dli-tl20", "sm-g6200", "ksa-al10", "v1913t", "v2034a", "cph1819", "lld-al00", "ldn-tl20", "are-al10", "lon-al00", "sea-al00", "sm-c7000", "jkm-al00a", "8848 m6", "mix 2s", "pcet00", "pdnm00", "ana-an00", "mi cc 9", "frd-al10", "vivo 1906", "v1831t", "sm-c9000", "cdy-an20", "ine-tl00", "vivo y35a", "r7plus", "oppo a79t", "pct-al10", "vivo nex", "nx595j", "eva-al00", "jer-an10", "redmi 3s", "huawei caz-tl10", "hd1900", "oppo a79kt", "lld-al20", "v1814a", "lld-al10", "de106", "med-al20", "le x520", "s58", "huawei vns-al00", "mi 9", "hlte216t", "redmi 4", "yal-al00", "eva-al10", "rvl-al09", "dvc-tn20", "bkl-al00", "vog-al00", "jkm-lx2", "rmx1991", "oppo r9tm", "vivo 1907", "vivo 1901", "sm-g9250", "rmx2111", "rne-al00", "mi play", "cdy-nx9b", "kiw-al10", "v2020ca", "pcdt10", "sm-n960f", "20190619g", "bkk-tl00", "ldn-tl00", "nx569j", "lnd-tl40", "kkg-an00", "ele-al00", "fla-al10", "hlte500t", "hry-al00t", "pahm00", "vce-l22", "oppo a53m", "clt-al00", "lenovo l38012", "ane-al00", "els-an00", "bln-al20", "eml-tl00", "pic-al00", "tas-al00", "wkg-an00", "vtr-tl00", "huawei tit-tl00", "cph1907", "nx612j", "v2005a", "pdnt00", "m2004j19c", "v1914a", "oxf-an00", "pra-tl10", "sm-g9600", "clt-al01", "v1821a", "lenovo l38111", "m2006c3lc", "frl-an00a", "huawei tag-tl00", "sm-n9500", "mi 8 ud", "cmcc m670", "in2010", "vivo x5m", "eml-al00", "mi 4lte", "vivo x7l", "lld-al30", "sm-n950f", "sm-a7050", "cdy-tn90", "mar-tl00", "frd-al00", "v1924a", "nx651j", "wlz-al10", "fla-al20", "cor-al00", "202018", "v1950a", "20190418q", "jef-an20", "mi pad 4", "redmi k20 pro", "pot-al00", "cph1607", "le x528", "vivo 1920", "hry-al00", "vivo xplay6l", "yok-an10", "alp-tl00", "letv x500", "redmi k30 5g", "peat00", "med-tl00", "lio-l29", "mi-4c", "bln-al30", "bmh-an10", "tnn-an00", "tel-tn00", "vivo 1902", "v1832t", "v1981a", "redmi k30", "sm-n975f", "tel-an00", "5g", "cdy-tn20", "20190419q", "ane-tl00", "mi note lte", "letv x501", "bnd-tl10", "pclm10", "9e(x9)", "tnnh-an00", "sm-g9730", "redmi note 9 pro", "art-tl00x", "vie-al10", "redmi k20", "pdem10", "vivo y53n", "bkl-tl10", "m850", "huawei tit-al00", "hisense f23", "fla-tl10", "sm-g9750", "vivo y31", "sm-a750gn", "vivo x6plus a", "kuliao k10", "vog-al10", "cph1917", "sm-a315g", "ta-1000", "mi note 2", "m12pro", "m2 e", "ldn-al10", "v1814t", "peam00", "m836", "oxf-an10", "vivo nex s", "v1938ct", "knt-al10", "vivo 1904", "tas-an00", "eva-tl00", "xt2125-4", "nx523j_v1", "noh-an00", "cnd-an00", "cdy-an95", "sm-g8870", "16 x", "m850a", "skw-a0", "in2020", "dvc-an00", "vivo x21ud", "oppo a37t", "201906", "hd1910", "was-tl10", "bac-tl00", "sm-n9600", "sm-g977n", "v1824a", "col-tl10", "vivo 1723", "pot-tl00a", "vce-tl00", "oppo r9km", "vivo 1915", "mi cc9 pro", "jer-an20", "sm-a6060", "oppo k7", "20200606", "rmx2200", "sm-a505f", "awm-a0", "mrd-tl00", "huawei mla-al00", "v2023a", "stf-tl10", "fig-tl10", "hlte310t", "rmx2142", "v1936a", "v1986a", "redmi k30i 5g", "ath-al00", "cph1989", "sm-g955f", "sm-c7010", "paft00", "cph1979", "sm-a9000", "par-tl00", "hlte210t", "knt-al20", "jny-lx1", "meizu s6", "jef-tn00", "vivo 1806", "20190620g", "redmi k30 pro", "sm-g8850", "m1 metal", "sm-a9200", "zte v0840", "redmi 6a", "sm-a217f", "duk-tl30", "m1822", "v2012a", "mi 10", "vivo x6splus a", "lenovo l78121", "cdl-an50", "m1852", "evr-al00", "oppo r9t", "note9", "v1955a", "redmi k20 pro premium edition", "rmx2030", "ebg-an00", "ars-tl00", "pbet00", "huawei nxt-tl00", "huawei mla-tl00", "ana-nx9", "mp1713", "cph2113", "vivo 1935", "sm-g6100", "pckm00", "cph1933", "16th", "vivo x9i", "cph1951", "hlk-al00a", "m5s", "jef-nx9", "pdat10", "sm-c5000", "pcrt01", "pdem30", "m2002j9e", "vivo 1819", "shark kle-a0", "mx5", "mha-tl00", "redmi 3x", "mha-l29", "edi-al10", "pdhm00", "vivo 1933", "dlt-a0", "mix", "v1829a", "hnr550t", "sm-g950f", "sm-w2019", "par-lx9", "xt1941-2", "jsn-l22", "sea-a0", "jer-tn10", "mxw-tn00", "lenovo l38011", "protruly v10s", "16th plus", "jat-tl00", "redmi pro", "lio-an00m", "v1916a", "knt-ul10", "p381", "mi cc 9 meitu edition", "hisense e77", "kiw-tl00", "pbdt00", "vivo 1804", "plk-al10", "mate 30 max", "vky-tl00", "tas-l29", "1605-a01", "pic-tl00", "redmi note 8t", "sm-n960n", "gn5001s", "gioneef40", "20190325d", "cph2109", "cam-tl00h", "mx6", "g8142", "cpn-al00", "lenovo tb-x606f", "jsc-an00", "hry-tl00", "nx608j", "lio-al00", "sm-g9300", "mi 9 transparent edition", "cph2127", "pchm00", "sugar y9", "cph1901", "nx606j", "dt1901a", "sm-g9508", "iplay_20", "cph2083", "bos-a0", "hma-tl00", "glk-tl00", "sm-a9100", "1711-a01", "sm-j3308", "v1923a", "ags-l09", "tel-an10", "readboy_g500x", "sm-j7008", "eva-dl00", "ple-703l", "cph1723", "xt1925-10", "wkg-tn00", "sm-g610f", "lya-al00p", "lio-an00p", "kb2000", "vivo 1818", "readboy_c15", "sm-n9200", "nx529j", "meizu 16xs", "sm-a307gn", "vivo v3max", "bah-w09", "m2004j7ac", "pcrm00", "sm-g5510", "hlte226t", "vivo x6d", "asus_i001da", "vivo v3m a", "16t", "neo-al00", "mya-tl10", "glk-lx1u", "sugar f11", "lld-tl10", "umix6", "vivo z1", "lya-al00", "vivo x20plus ud", "r7plust", "v2027", "sht-al09", "cph1911", "v2011a", "rmx1931", "are-tl00", "lenovo l79031", "bnd-al10", "u27", "scm-w09", "gome 2018x38a", "yal-al50", "cph1877", "vivo 1938", "aqm-tl00", "16s", "vivo x5pro d", "sm-g9208", "sm-c7100", "sm-n9760", "mi 10 pro", "c106", "cph1719", "rmx2121");
    }

    /* renamed from: i */
    public final ArrayList<String> mo196104i() {
        return CollectionsKt.arrayListOf("nwe-an10", "cph2173", "peem00", "ana-al00", "wlz", "m2011k2c", "pedm00", "sm-g9910", "sm-g9960", "sm-g9980", "cph2207", "mrx-w29", "mrx-w39", "mrx-an19", "amz-an00", "oxf", "ore-an00", "oxp-an00", "asus_i003d", "cph2201", "win-al10", "ore-an10", "els-nx9", "scmr-w09", "sm-n986w", "908sh", "asus_i002d", "txl-an10", "scmr-al09", "v2024a", "mrx-w19", "els-n39", "els-n04", "ebg-tn00", "sm-n976xc", "sm-g996u1", "oxf-an10", "sm-g998u1", "sh-r50", "ebg-an10", "ana-tn00", "sm-g996u", "els-tn00", "sm-g998u", "sm-g996w", "bsa-l29", "sm-g991u1", "sm-g991u", "sm-f916n", "mrx-w09", "ebg-an00", "sea", "sm-f900w", "sm-g998w", "sm-g998n", "yal", "sm-n976u", "sm-n986u1", "ana-nx9", "sm-g991w", "mrx-al09", "sm-n986u", "v2011a", "sm-g996n", "v1981a", "xiaomi mi 10t", "m2007j3sc", "wlz-al10", "sh-01m", "shv47", "asus_i003dd", "wlz-an00", "shg01", "sm-g996b", "sm-n976q", "sm-g998b", "rmx2085", "ana-lx4", "mrx-al19", "sm-f907b", "sh-04l", "sm-g991b", "dt1901a", "sm-t867r4", "sm-n9810", "m2007j3sg", "906sh", "dt1902a", "sh-m13", "mi 10t pro", "bxx-al00", "noh-an00", "oxf-an00", "rmx2081", "j9260", "808sh", "sm-g973c", "sm-g981u1", "lio-n29", "sh-m14", "sm-g986w", "sm-g975xu", "sm-n975xu", "sm-n975c", "sm-g981w", "901so", "scv45", "noh-nx9", "shv44", "sm-f9000", "asus_i005da", "krj-w09", "sm-g988u1", "so-03l", "sm-g981u", "motorola edge plus", "sh-r10a", "sm-g988w", "sm-n986b", "sc-05l", "sm-g986u", "sm-g988u", "surface duo", "zs661ks", "tah-n29m", "zs670ks", "kb2001", "p717", "sm-n9860", "sc-03l", "sm-g986u1", "sm-g973xu", "jef-tn20", "bmh-an10", "sm-n976v", "802so", "zte a2020n3 pro", "sm-n975u", "jef-an00", "sm-f900u1", "babygroot", "sm-w2020", "ana-an00", "bmh-tn10", "sm-t875", "jef-tn00", "v1955a", "sm-t867u", "kb2005", "sm-f9160", "sm-f916u", "rmx2121", "tah-an00m", "rmx2075", "sm-g9810", "jer-an10", "jer-tn20", "sm-f916b", "zte a2020ru pro", "lio-an00p", "sm-t866n", "tas-tn00", "in2021", "opg01", "sm-g9860", "lenovo z5 pro gt", "sm-f900f", "sm-t870", "v1950a", "j9150", "kul-an00", "m2007j1sc", "sm-g9880", "pdsm00", "sm-f907n", "scg02", "sm-t860", "sm-n970u", "scv47", "sc-52a", "jer-tn10", "kb2003", "sm-g988n", "sm-n981u", "sm-f916w", "v2049a", "sm-g981v", "sm-n981u1", "sm-g991n", "sm-g986n", "sm-f916u1", "sm-n981n", "sm-t976b", "in2025", "sm-n970u1", "scg01", "sm-n970xu", "sm-n970w", "sm-f900u", "sm-f707w", "sm-t970", "sm-g977t", "m2007j3sy", "sog01", "sm-n981w", "bnf-an00", "in2015", "shark kle-a1", "sm-g970xu", "m1928", "zte axon 10 pro", "sm-g981n", "in2011", "xq-at51", "in2013", "sm-n9760", "sm-g770u1", "zs630kl", "sm-t860x", "i1927", "sm-g781v", "txl-an00", "in2019", "lan-an00", "sm-g977p", "oce-an10", "sm-n975w", "sm-n9750", "sm-t865n", "renoace2_eva", "sm-t865", "in2017", "v1824ba", "sm-g781u1", "sm-n975u1", "in2023", "els-an00", "sm-f707u1", "sm-a9080", "sm-g781w", "zs671ks", "sm-g781u", "poco f2 pro", "sm-f7070", "lm-g900", "penm00", "pepm00", "peqm00", "rmx2205", "v2118a", "v2121a", "m2011k2g", "sm-g977u", "sm-f707b", "lenovo l79041", "zte a2020u pro", "ele-tl00", "vog-l04", "asus_i001d", "royole flexpai 2", "sm-g781n", "sc51aa", "hw-02l", "xq-as72", "evr-n29", "sm-f700u", "rai-an10", "lenovo z6 pro", "j8270", "m2011j18c", "a001lg", "dt2002c", "j8210", "cdy-tn00", "sm-g781b", "v2085a", "901lg", "le2125", "yal-l21", "sm-g770f", "ele-l09", "in2010", "cdy-an00", "sm-f707u", "asus_i001dd", "vivo 1912", "nop-an00", "krj-an00", "sm-a908b", "yal-al10", "v1986a", "els-an10", "902zt", "rmx2076", "sm-g975w", "sm-g770x", "cph1921", "cdy", "cdy-an90", "sm-f707n", "m2102k1c", "sm-g975u", "bah3-w59", "sm-g7810", "scv41", "cdy-tn90", "cmcc m970", "jef-an20", "tas-an00", "asus_i005dc", "hd1925", "sm-t875n", "j9180", "sm-t976n", "zte a2020 sp", "scv44", "sm-g986b", "sm-t867v", "vrd-w10", "tas-l29", "oneplus 7t", "cdy-an95", "pdhm00", "bah3-an10", "mi 10 pro", "pcct30", "bmh-an20", "kb2000", "cdy-an20", "in2020", "lio-l29", "sm-g988b", "l-51a", "sm-n9700", "sm-f700f", "sm-t867", "lya-l0c", "sh-51a", "oneplus 7", "nx627j", "rmx2072", "sm-g780f", "pdet10", "lya-l09", "ac2001", "htc 2q4d200", "j8110", "ele-l29", "jer-an20", "asus_i001db", "sm-g981b", "8848 m6", "asus_i001de", "vivo 1913", "lio-an00", "yal-l41", "v2055a", "m2007j3si", "ac2003", "scg06", "win-an00", "vog-l29", "vrd-w09", "sm-t878u", "hd1907", "kb2007", "htc u20 5g", "sm-t978u", "a002so", "cdy-tn20", "lio-al00", "vrd-al09", "zs660kl", "gm1925", "oneplus 7t pro", "xq-at52", "sm-f700u1", "vrd-al10", "scv42", "scg03", "v1916a", "zte a2020g pro", "v1922a", "v1924a", "oneplus kb2023", "hd1901", "lm-q920n", "tp1803", "asus_i01wdx", "oneplus in2015", "vog-l09", "sog02", "oneplus in2023", "sov41", "hd1903", "lm-v600", "lya-l29", "asus_i001da", "meizu 17", "hma-l29", "vivo 2005", "pccm40", "sm-t975", "vivo td1903", "de106", "hp laptop 15-bs0xx", "zte a2020n2 pro", "so-01m", "tas-tl00", "scm-w09", "xq-as52", "sm-g970w", "j8170", "sm-m515f", "gm1903", "m2006j10c", "sc-01m", "bzt3-w09", "ele-l04", "le2123", "mi 9t pro", "cdy-nx9b", "m2012k11ag", "sm-t975n", "nx629j", "ztg01", "scm-al09", "mi9 pro 5g", "sea-lx1", "sm-n985f", "j9210", "lm-f100n", "lm-f100", "xq-at42", "sm-n980f", "sm-g970u", "moto g 5g plus", "rmx2083", "tas-al00", "hd1911", "sov40", "cdy-nx9a", "gm1911", "meizu 17 pro", "sc-04l", "conquest_s16", "sm-f700n", "gm1901", "bnn-an00", "lio-an00m", "motorola one 5g uw", "sm-g970u1", "sm-g980f", "hma-l09", "m2007j3sp", "evr-l29", "m2007j20ci", "tel-an10", "asus_i001dc", "scg05", "nle-al00", "sm-g985f", "asus_i01wd", "sea-tl10", "motorola one 5g", "lm-g710ulm", "sea-al10", "sm-n981b", "sm-g973w", "v2005a", "gm1913", "sm-g973u", "hd1905", "hd1913", "sm-g9758", "sea-lx3", "lenovo l78051", "gm1920", "ry1201", "v1824a", "sm-n975x", "sm-g973u1", "fin-an00", "gm1917", "sm-g9738", "16s pro", "v2001a", "motorola razr (2020)", "xq-at72", "sc-51a", "rmx2202", "amz-al00", "zr01", "le2127", "mi 10", "sm-a908n", "redmi k30 pro", "sm-f700w", "tel-tn00", "sc-53a", "pixel 4", "cph1919", "meizu 18 pro", "mi 9", "bah3-w09", "cey-an00", "m2102j20sg", "sm-f7000", "v2045", "sm-g9730", "v2046", "m2102k1ac", "tah-an00", "16t", "sm-g9750", "m2012k11c", "bzt3-al00", "zte a2021g", "htc 5g hub", "m2012k11ac", "sm-n986n", "mi mix 3 5g", "16s", "m2102j2sc", "pct-tl10", "rmx1931", "v2020a", "pcct00", "xq-as62", "orange neva jet", "yal-tl00", "yal-al00", "lio-tl00", "nx659j", "oneplus 7pro", "cph2005", "motorola one fusion+", "pixel 4 xl", "vog-al00", "rai-an00", "nx669j", "v2020ca", "redmi k20 pro", "ele-al00", "vog-al10", "redmi k30 pro zoom edition", "vivo 2018", "bah3-al00", "sm-w2021", "tny-tl00", "tny-al00", "sm-g975u1", "v2006", "so-51a", "lya-al00", "sm-a716u", "j9110", "lya-al10", "aris", "m2007j20ct", "vog-tl00", "pct", "sm-a715x", "lya-tl00", "pclm10", "vivo 2006", "pccm00", "evr-an00", "nnr-an10", "sm-a716v", "lya-al00p", "gm1915", "pct-al10", "nokia 8.3 5g", "redmi k20 pro premium edition", "m2007j20cg", "mi 9 roy", "evr-al00", "evr-tl00", "rmx2052", "motorola edge", "pdem10", "royole flexpai", "asus_z01qd", "sm-a516b", "a001op", "t790w", "lm-g850", "mi 9 transparent edition", "pdem30", "hma-tl00", "rmx2071", "hma-al00", "so-04k", "sm-n960xu", "m2004j7bc", "lenovo l78032", "jny", "lenovo l79031", "pcrt01", "rmx2142", "sm-g965xu", "fin-an10", "pdrm00", "gm1900", "sm-g975xc", "rmx2173", "sh-z20", "pan-l29", "moto g(9) plus", "meizu 18", "rmx2176", "zte a2020 pro", "pdkt00", "m2004j7ac", "zte a2021h", "beryllium", "hd1910", "jef-nx9", "v1930", "ikd-tn00", "rny-tl50", "sm-a516u", "so-52a", "oneplus 7 pro", "rha-an00m", "lm-g900n", "gm1910", "sm-g9708", "hd1900", "sea-tl00", "lm-v450", "tet-an00", "zs600kl", "lm-g810", "i1928", "sm-n976b", "note 9s", "scg04", "lm-g900tm", "t790z", "sm-a715w", "sm-a516u1", "t790y", "sm-g9700", "hlk-l42", "m2007j17c", "sm-a5160", "cph2249", "rmx2144", "m2002j9g", "fro-an00", "v2023a", "sm-g960xu", "android-x86_64", "motorola razr 5g", "sm-a516v", "cph2065", "noh-an01", "shark ksr-a0", "sm-n970x", "lm-v510n", "shark kle-h0", "cph2091", "zte a2021", "cph2025", "xig01", "hlk-l41", "l-52a", "sm-a716u1", "lm-v500", "hus-tn00", "bphone b86", "mi note 10 lite", "sm-n975f", "nnj-an00", "bah3-l09", "xt2071-4", "vivo 2004", "pct-l29", "zte a2121", "e7110", "oppo k7", "sm-g889a", "cph2089", "redmi k30 5g speed", "sm-e5260", "yok-an10", "iplay30", "spn", "poco x3", "rmx2063", "ney-an00", "t799b", "aris pro", "surya", "vivo 1939", "lio-l09", "mi cc9e", "702so", "mi 10t", "mp1801", "h8116", "pixel 5a", "rmx2170", "rmx2117", "v1962ba", "sm-a805x", "m2002j9e", "rny-al50", "rmx3031", "cee-tl00", "sm-a716s", "v2073a", "m2002j9s", "shark mbu-h0", "kjr-w09", "tel-an00", "lm-g910n", "lenovo tb-j706l", "shark prs-a0", "redmi note 9 pro max", "sm-n976n", "hnb-an10", "ysl-an10", "spn-tl00", "cph2023", "poco x3 nfc", "m2007j22c", "hlk-al00a", "iplay40", "sm-a516n", "t790s", "xt2125-4", "m10_plus_eea", "zte 9000n", "scg07", "t799h", "cnd-an00", "fro-al00", "lm-v40", "live 4", "rmx2200", "redmi note 9s", "sea-al00", "rmx2201", "sc-54a", "sov39", "yal-al50", "sov37", "pixel 4a (5g)", "chl-lx3", "mi note 10 pro", "m2101k9g", "sm-g970x", "h8166", "m2007j17g", "spn-al00", "ang-an00", "sm-a716b", "sm-n971n", "oneplus a6000", "redmi k30i 5g", "oneplus a6003", "f-51a", "infinix x687", "rmx2051", "oneplus a6013", "jny-lx2", "h8276", "tel-an00a", "brq-an00", "v2025", "hus", "h8296", "jny-lx1", "pdst00", "dcn-an00", "zs620kl", "sm-m625f", "pixel 5", "sm-a715f", "aqm-al10", "hitv105c", "h8314", "vivo 1919", "pecm30", "z6750m", "h9493", "m2101k9c", "lm-g910", "finney u1", "mi note 10", "h8266", "h8216", "a002sh", "sm-a426b", "tecno ce9", "sm-g975x", "shg02", "oce-an50", "h8324", "hus-an90", "nami", "pdpt00", "lm-v500n", "poco m2 pro", "sm-n770x", "oppo a11", "sm-g973x", "lm-q620", "armor 7e", "lm-g820", "sm-g960x", "cdl-an50", "hlk-al10", "rmx1993", "ris-al10", "shark kle-a0", "rmx1992", "frl-an00a", "lm-g710v", "sea-lx2", "basic", "rmx2111", "pdcm00", "dvc-an20", "pclm50", "moto g 5g", "cph2145", "dvc-an00", "h9436", "pdpm00", "g011c", "nokia 8 v 5g uw", "oneplus a6010", "801so", "zs661ks-6a006in", "lm-q730n", "bv9900pro", "infinix x687b", "pdym10", "vivo nex s", "sov38", "803sh", "g0515d", "h8416", "motorola one hyper", "dvc-tn20", "pixel 4a", "hisense u30", "lm-g820n", "jny-al10", "motorola one 5g ace", "pdkm00", "hlk-al00", "samsung galaxy s6 edge", "curtana", "rmx2025", "cph2009", "joyeuse", "s95", "pcrm00", "rmx2112", "sh-03k", "zte a2019 pro", "sm-n970f", "pegt00", "tucana", "v2080a", "aosp_begonia", "moto z? force", "mi 10 ultra", "sm-a705xc", "htc desire 20+", "h1t1000", "sm-a7160", "nokia 9", "pixel 3 xl", "dlt-h0", "pdnt00", "706sh", "nx651j", "m2101k7ai", "qh-s50", "pdyt20", "asus_z01rd", "skw-h0", "sm-g965x", "perm00", "zte 8012n", "ikd-an00", "poco x2", "v1821t", "sh-m09", "lm-k920", "sm-t575", "exodus 1", "moto g stylus (xt2115dl)", "tecno ce9h", "l-41a", "so-03k", "sm-n960x", "htc desire 21 pro 5g", "so-05k", "pdnm00", "t781", "v1914a", "shark mbu-a0", "kyg01", "mxw-an00", "sm-g970f", "cp03", "ert-l29", "phone 2", "rmx2002", "sc-01l", "rmx2151", "v1821a", "armor 10 5g", "sm-a326b", "redmi k30 5g", "f-52a", "pixel 3", "mxw-tn00", "redmi note 9 pro", "sm-a4260", "v2040", "sh-m10", "rmx2086", "sm-n960w", "frl-tn00", "peat00", "rmx3092", "zte a2019g pro", "sm-n770f", "9330", "mi cc9 pro premium edition", "sh-z10", "sm-g975f", "dlt-a0", "armor 9", "sm-a805f", "d188", "lenovo l78121", "sm-n960u", "conquest-s16", "tnnh-an00", "rmx2061", "rmx2003", "sc-03k", "sm-g965u1", "scv39", "peam00", "x3-ex", "sm-g965u", "sm-g9650", "mi 8 se+", "sm-g973f", "m10_air_eea", "m2101k9ag", "rmx2161", "mi 8 pro", "lenovo tb-j706f", "sm-a326u", "t780h", "vivo 1818", "sm-w2019", "m40_eea", "wkg-tn00", "p710", "cph2107", "sh-c02", "sh-m16", "phytium android prototype", "cph2159", "v2031a", "g90 pro", "m2101k7ag", "pdym20", "per-al00", "vivo 1921", "rmx2155", "ktd-an00", "pegm00", "be2025", "rmx2163", "mi mix 3", "m40(n6h8)", "sm-a8050", "be2028", "s96pro", "rmx2001", "sm-g965w", "cph2036", "bl6000pro", "sh-s40p", "live", "sm-g977b", "vivo 1909", "cph1907", "wp10", "nx616j", "cph2037", "le2117", "be2029", "v2048a", "sm-n960u1", "mi 8 explorer edition", "mi mix 2s", "sm-g960w", "agm x3", "m2101k6g", "cph2119", "sm-g960n", "sm-g960u1", "pie-l29", "sm-a7070", "m2012k10c", "cph2125", "samsungg955f", "redmi k30", "s5 pro", "moto g stylus (2021)", "m2007j22g", "v2061a", "xt1789-05", "m40_row", "sh-rm15", "so-01l", "mix 3", "sm-g960u", "vivo x21a");
    }

    /* renamed from: j */
    public final ArrayList<String> mo196105j() {
        return CollectionsKt.arrayListOf("SM-T285YD", "SM-J530K", "SM-T567V", "SM-J400G", "SM-J400F", "SM-N910W8", "SM-J530G", "SM-J530F", "SM-J810G", "SM-J415FN", "SM-J810M", "SM-J330N", "SM-J330L", "SM-J700T", "SM-T900", "SM-J330F", "SM-P355Y", "smartphone", "SM-N900T", "sm-j710f", "SM-P585N0", "SM-T555", "SM-N900A", "M5c", "MP1605", "SM-J415GN", "Moto C", "Smart550", "O51", "SM-T819Y", "SM-T3777", "SM-P588C", "SM-J600G", "SM-J600F", "SM-J510S", "SM-J600L", "SM-J510H", "SM-J510L", "SM-J510F", "SM-T385L", "SM-T385C", "SM-T719Y", "SM-J730F", "SM-J200H", "SM-T235Y", "P100", "SM-T210R", "MOON", "SM-J701M", "Micromax Q4311", "SM-J701F", "M8 Pro", "SM-T380C", "SM-N910H", "SM-P605", "SM-N910P", "SM-N910V", "SM-T230NW", "SM-J610FN", "SM-J610F", "SM-J610G", "SM-J320FN", "SM-T210", "SM-T215", "SM-T520", "SM-N920F", "SM-N920G", "SM-T280", "SM-T285", "Moto C Plus", "SM-T110", "SM-J320N0", "SM-J720F", "SM-N750L", "SM-J250F", "SM-J250G", "SM-N750S", "SM-J320H", "SM-N920W8", "SM-T239C", "SM-J500M", "SM-T815Y", "SM-P585Y", "Smartphone", "SM-T231", "SM-T230", "SM-J200Y", "SM-T595C", "SM-T825C", "SM-T357T", "SM-J415F", "SM-T378S", "SM-N750", "SM-J727T1", "SM-J600GT", "SM-T815", "SM-J500FN", "SM-J330FN", "SM-T385", "SM-P555", "SM-J260G", "SOP-M6", "SOP-M7", "SUGAR C-88Dual", "TCL i718M", "SOL26", "SOP-H7", "SPR", "Sunny2 Plus", "T801", "SUGAR Y8 MAX", "SUBOR_R30", "TD-928", "T06", "SYXROBOT_OMD_H", "T8+", "T1001", "TA-1012", "SOV32", "SOV33", "T81", "SWW1617", "SUNELAN-P530Q", "SUBOR_R30+", "T9000", "T10", "T11", "StudentPad", "SO-03H", "Sunelanmobile S1", "SO-03F", "T6", "TA-1004", "T900", "T97", "T90", "TECNO ID5b", "Tak-L6U/T", "TECNO Camon CX", "SO-04H", "T-ONE", "SUBOR_H10", "Tcc", "SS129T", "TA-1053", "TA-1052", "T950S", "SUBOR_R9", "TECNO CA8", "Sun005", "SUBOR S5", "T1006S", "TECNO ID6", "Student_Tablet", "T8-S", "SO-01H", "TbooK 10 S(E6N7)", "SW17W08", "SUBOR 2017-02", "TCL V760", "T805S", "T20(T2E1)", "TECNO CF8", "SO-02J", "T805c", "SUBOR_R10", "SUGAR Y7 MAX", "TBF90", "SUGAR Y12", "SUGAR Y15", "SOP-P10", "SOAP R11 lite", "TA-1038", "SPR-AL00", "Sony_Z3V_VZW", "TA-1033", "TA-1032", "ST327T", "Streak  10 Pro (4G)", "T55", "T1 7.0", "T101", "T100", "T16E", "T105", "T106", "T109", "SNE-LX2", "STF", "TCL Y660", "TECNO CX Air", "TA-1020", "T7", "T10M", "SUBOR_K10PLUS", "TBF80", "TCL P528D", "SOP-S10", "T607F", "T500", "SUBOR_R10++", "v18", "Teetot F01", "V919 3G Air Core8", "U_Pro", "UOOGOU T12", "VFD 620", "Venus_V3_5010", "Tinai D1", "UOOGOU T6", "VIDO-M80", "V15(R17)", "U51", "US818", "V10 4G", "TETC-S6", "TongLu.T11", "U65GT", "U507", "V10_Pro", "VDVD X21", "VFD 900", "TH-NA6S", "Tinai K1", "Tinai K2", "VDVD IX21(IX20)", "VDVD IX21", "TIT-AL00", "V21-X", "UG905", "U PULSE LITE", "UNNO E3", "TETC-V5", "verykools5702", "TengLian V8", "VClub-001", "TECNO Phantom7", "U9_Pro", "V5S", "U Ultra", "TETC-F7", "V1600S", "V9-T", "V5+", "U27", "U22", "Umix1", "Umix6", "UNNO P8", "U63 PLUS C", "TETC-A8", "UIMI F7", "US688", "U89C", "U32A", "U89L", "U818", "TETC-H1", "TETC-H7", "u1055", "V21", "U83-D", "u2", "TETC-F7 Plus", "u12", "UIMI4", "UOOUOG", "UOOGOU F9", "Tonglu.T10", "V", "V975s Core8", "V1730EA", "V ONE", "VDVD IX20(IX21)", "U51GT-C4B", "TOMMY2", "VE4528", "UNC-A1", "V15 Max", "Uer", "V96 3G", "V820w DualOS", "TECNO IN6", "TECNO IN1", "TL99G", "U63 PLUS B", "TETC-F6S", "UNNO E3+PLUS", "V2", "U63 PLUS A", "U63YR", "V975s CORE4", "V3991AN", "TX9", "V21(X21S)", "V18", "U5482", "TW18", "US828", "UMI-R1", "VEN-L22", "WarGod", "W506", "W507", "vivo X6A", "ViVK X20", "X21", "X22", "VIVO X21", "vivo X23", "vivo PD1616B", "WHY2017", "vivo 1812", "weiimi X1", "X21(OX2)", "vivo x21", "X21S", "X16HD 3G(M5J5)", "W2017", "X11S", "vivo x5m", "vivo X5Pro", "vivo S11t", "X106", "X101", "vivo 1801", "View XL", "X2 SE", "VIMX PRIVMA X8+", "wt88047", "wzcs10m", "W9000", "vivo", "vivl v17", "WEllPHONE", "weiimi X1 pro", "x21", "vivo X1S", "WA1L", "VS986", "vivo 1612", "vivo Y51", "VOGA2", "vivo TD1608", "VOTO VT898", "X1 Dual", "VK815", "VS990", "VOTO GT17", "VS996", "vivo 1723", "vivo 1724", "vivo 1606A", "WP_V2", "WP_V1", "WDB-D6", "vivo Xshot", "VKY_AL00", "VIE-AL10N", "W_P200CM", "ViVK X20S", "X2", "virtual machine 2", "WA1", "VIVK X20S", "WP V7", "WX6s", "VIVO X6A", "WP V8", "VOVI", "W800", "WSK-001", "WELAI F1", "WII", "wt86047", "wallet2018", "W560", "VPad-K10", "WAS-LX3", "WAS-LX1", "WP-S6", "VPad-A107", "WNH V2", "X21(X20)", "WAS-LX1A", "VIVK X20", "WAS-L03T", "vivo 1719", "vivo Y51L", "X plus", "VPad P12", "wolunka", "X20(X9S)", "WBO V1", "VK6S plus", "vivo V3 A", "vivo Y97", "VOORCA", "weishili", "vivo PD1709", "YNBD-01", "YunOS", "Yingshan", "XPELL R11", "X25", "XT1080", "Y22", "Y23", "XT1925-10", "Y25", "X23", "YLT X9-P10", "XZY", "YD201", "YLT X9-Mi6 plus", "YEPEN_DX6", "Xshitou-NT18", "X4-40", "X98 Air II(HG9M)", "Y16", "Y12", "XT1943-1", "yeechuiXplus", "X5PROD", "YM-R8", "XT1924-9", "X80HD(G2N9)", "xiaomi 6", "Y02", "XBW_K20", "Y01", "Y07", "Y09", "XP8800", "YLT X9 Phone X", "X5max_PRO", "Y108", "X9076", "Y102", "X6 PLUS A", "Xs Max", "YAS-AL01", "XT1710-02", "YT886-12", "XT1032", "YT886-10", "YOGA Tablet 2-1050LC", "YT866-10", "YLT X9-S8", "X805", "XL39h", "XT1585", "X80 Pro (E3E9)", "Y60", "Y61", "XT1941-2", "Y51", "vivo Y51", "Y51A", "vivo Y51A", "X80HD(G2N3)", "YLT X9-R11s", "xp9800", "X5-6", "XT1609", "Xiaomi 8", "Y600D-C00", "XR", "XS", "XT1562", "x7", "x5", "XP9800", "YOGA Tablet 2-1050F", "XT1942-1", "Xs MAX", "X9006", "YINGSHAN", "Y700", "X6D", "X98 Plus II (C2D6)", "YINGSAN", "X80HD(G2N5)", "YOORD", "YT-A2", "XT1575", "XT1572", "X9s", "X86", "xiaomi   8", "X600", "XM-W", "YK5001", "XT1663", "X7PLUS", "XT1706", "Y37", "Y803-9", "XT1929-15", "X8 Plus", "Z016", "XIAOXYE P9", "Y1", "Сonstellation Х", "Z97-W", "ZTE A530", "ZTE A520S", "ΧS Max", "Z103", "ZL10", "ZTE BLADE V0730", "ZTE A0620", "ZTE Q207T", "ΧS", "ZJ338", "ZTE BLADE V0710", "Z60", "Z1 PRO", "ZBH-BIHEE A5", "Х", "ZUG_5S_Q", "Z3 Pro LTE", "ZTE A0722", "ZYVM4", "Z8", "ZTE A606", "ZTE BLADE V7 LITE", "ZTE BLADE A510", "ZTE V890", "Z1", "Χs", "ZOL", "Z10", "ZTE N909", "ZH960", "ZTE S36", "ZTE Q529E", "Z963U", "Z90", "ZD-P1-HL", "ZTE BLADE V0800", "Zl7-A", "ZH1", "ZTE Q801U", "ZTE BV0850", "Χ", "ZTE A0622", "ZJ108", "ZTE A2017U", "ZTE Q805T", "ZhongCheng V1", "ZTE V0920", "Z7 LITE", "ZTE BLADE A0622", "ZX100", "ZTE BLADE V0720", "OPPO R9 Plusm A", "OPPO R9 Plustm A");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.al$d */
    static final class C57793d extends Lambda implements Function0<ArrayList<String>> {
        public static final C57793d INSTANCE = new C57793d();

        C57793d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<String> invoke() {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.addAll(VeHWUtils.f142315a.mo196103h());
            VeHWUtils alVar = VeHWUtils.f142315a;
            arrayList.addAll(VeHWUtils.f142316b.getWhiteListPlus());
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.al$e */
    static final class C57794e extends Lambda implements Function0<ArrayList<String>> {
        public static final C57794e INSTANCE = new C57794e();

        C57794e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<String> invoke() {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.addAll(VeHWUtils.f142315a.mo196104i());
            VeHWUtils alVar = VeHWUtils.f142315a;
            arrayList.addAll(VeHWUtils.f142317c.getWhiteListPlus());
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.al$f */
    static final class C57795f extends Lambda implements Function0<ArrayList<String>> {
        public static final C57795f INSTANCE = new C57795f();

        C57795f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<String> invoke() {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.addAll(VeHWUtils.f142315a.mo196105j());
            VeHWUtils alVar = VeHWUtils.f142315a;
            arrayList.addAll(VeHWUtils.f142318d.getBlackListPlus());
            return arrayList;
        }
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m224276g() {
        boolean d = m224273d();
        HWDecode hWDecode = f142316b;
        C63937ah.m250999a(d, hWDecode.getMinSide());
        C63937ah.m251000a(m224273d(), hWDecode.getFpsLowerLimit(), hWDecode.getHighFPSMinSide());
        boolean e = m224274e();
        HWDecode hWDecode2 = f142317c;
        C63937ah.m251003b(e, hWDecode2.getMinSide());
        C63937ah.m251004b(m224274e(), hWDecode2.getFpsLowerLimit(), hWDecode2.getHighFPSMinSide());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.al$a */
    static final class C57790a extends Lambda implements Function0<Boolean> {
        public static final C57790a INSTANCE = new C57790a();

        C57790a() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            String str = Build.MODEL;
            Intrinsics.checkExpressionValueIsNotNull(str, "Build.MODEL");
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                boolean contains = VeHWUtils.f142315a.mo196100a().contains(lowerCase);
                Log.m165389i("VeHWUtils", "current model: " + lowerCase + ", can use hw decode for H264: " + contains);
                return contains;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.al$b */
    static final class C57791b extends Lambda implements Function0<Boolean> {
        public static final C57791b INSTANCE = new C57791b();

        C57791b() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            String str = Build.MODEL;
            Intrinsics.checkExpressionValueIsNotNull(str, "Build.MODEL");
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                boolean contains = VeHWUtils.f142315a.mo196101b().contains(lowerCase);
                Log.m165389i("VeHWUtils", "current model: " + lowerCase + ", can use hw decode for H265: " + contains);
                return contains;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.al$c */
    static final class C57792c extends Lambda implements Function0<Boolean> {
        public static final C57792c INSTANCE = new C57792c();

        C57792c() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            String str = Build.MODEL;
            Intrinsics.checkExpressionValueIsNotNull(str, "Build.MODEL");
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                boolean z = !VeHWUtils.f142315a.mo196102c().contains(lowerCase);
                Log.m165389i("VeHWUtils", "current model: " + lowerCase + ", can use hw encode for H264: " + z);
                return z;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }
}
