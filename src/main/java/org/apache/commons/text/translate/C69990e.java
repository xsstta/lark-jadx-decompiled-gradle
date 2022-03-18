package org.apache.commons.text.translate;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: org.apache.commons.text.translate.e */
public class C69990e {

    /* renamed from: a */
    public static final Map<CharSequence, CharSequence> f174901a;

    /* renamed from: b */
    public static final Map<CharSequence, CharSequence> f174902b;

    /* renamed from: c */
    public static final Map<CharSequence, CharSequence> f174903c;

    /* renamed from: d */
    public static final Map<CharSequence, CharSequence> f174904d;

    /* renamed from: e */
    public static final Map<CharSequence, CharSequence> f174905e;

    /* renamed from: f */
    public static final Map<CharSequence, CharSequence> f174906f;

    /* renamed from: g */
    public static final Map<CharSequence, CharSequence> f174907g;

    /* renamed from: h */
    public static final Map<CharSequence, CharSequence> f174908h;

    /* renamed from: i */
    public static final Map<CharSequence, CharSequence> f174909i;

    /* renamed from: j */
    public static final Map<CharSequence, CharSequence> f174910j;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(" ", "&nbsp;");
        hashMap.put("¡", "&iexcl;");
        hashMap.put("¢", "&cent;");
        hashMap.put("£", "&pound;");
        hashMap.put("¤", "&curren;");
        hashMap.put("¥", "&yen;");
        hashMap.put("¦", "&brvbar;");
        hashMap.put("§", "&sect;");
        hashMap.put("¨", "&uml;");
        hashMap.put("©", "&copy;");
        hashMap.put("ª", "&ordf;");
        hashMap.put("«", "&laquo;");
        hashMap.put("¬", "&not;");
        hashMap.put("­", "&shy;");
        hashMap.put("®", "&reg;");
        hashMap.put("¯", "&macr;");
        hashMap.put("°", "&deg;");
        hashMap.put("±", "&plusmn;");
        hashMap.put("²", "&sup2;");
        hashMap.put("³", "&sup3;");
        hashMap.put("´", "&acute;");
        hashMap.put("µ", "&micro;");
        hashMap.put("¶", "&para;");
        hashMap.put("·", "&middot;");
        hashMap.put("¸", "&cedil;");
        hashMap.put("¹", "&sup1;");
        hashMap.put("º", "&ordm;");
        hashMap.put("»", "&raquo;");
        hashMap.put("¼", "&frac14;");
        hashMap.put("½", "&frac12;");
        hashMap.put("¾", "&frac34;");
        hashMap.put("¿", "&iquest;");
        hashMap.put("À", "&Agrave;");
        hashMap.put("Á", "&Aacute;");
        hashMap.put("Â", "&Acirc;");
        hashMap.put("Ã", "&Atilde;");
        hashMap.put("Ä", "&Auml;");
        hashMap.put("Å", "&Aring;");
        hashMap.put("Æ", "&AElig;");
        hashMap.put("Ç", "&Ccedil;");
        hashMap.put("È", "&Egrave;");
        hashMap.put("É", "&Eacute;");
        hashMap.put("Ê", "&Ecirc;");
        hashMap.put("Ë", "&Euml;");
        hashMap.put("Ì", "&Igrave;");
        hashMap.put("Í", "&Iacute;");
        hashMap.put("Î", "&Icirc;");
        hashMap.put("Ï", "&Iuml;");
        hashMap.put("Ð", "&ETH;");
        hashMap.put("Ñ", "&Ntilde;");
        hashMap.put("Ò", "&Ograve;");
        hashMap.put("Ó", "&Oacute;");
        hashMap.put("Ô", "&Ocirc;");
        hashMap.put("Õ", "&Otilde;");
        hashMap.put("Ö", "&Ouml;");
        hashMap.put("×", "&times;");
        hashMap.put("Ø", "&Oslash;");
        hashMap.put("Ù", "&Ugrave;");
        hashMap.put("Ú", "&Uacute;");
        hashMap.put("Û", "&Ucirc;");
        hashMap.put("Ü", "&Uuml;");
        hashMap.put("Ý", "&Yacute;");
        hashMap.put("Þ", "&THORN;");
        hashMap.put("ß", "&szlig;");
        hashMap.put("à", "&agrave;");
        hashMap.put("á", "&aacute;");
        hashMap.put("â", "&acirc;");
        hashMap.put("ã", "&atilde;");
        hashMap.put("ä", "&auml;");
        hashMap.put("å", "&aring;");
        hashMap.put("æ", "&aelig;");
        hashMap.put("ç", "&ccedil;");
        hashMap.put("è", "&egrave;");
        hashMap.put("é", "&eacute;");
        hashMap.put("ê", "&ecirc;");
        hashMap.put("ë", "&euml;");
        hashMap.put("ì", "&igrave;");
        hashMap.put("í", "&iacute;");
        hashMap.put("î", "&icirc;");
        hashMap.put("ï", "&iuml;");
        hashMap.put("ð", "&eth;");
        hashMap.put("ñ", "&ntilde;");
        hashMap.put("ò", "&ograve;");
        hashMap.put("ó", "&oacute;");
        hashMap.put("ô", "&ocirc;");
        hashMap.put("õ", "&otilde;");
        hashMap.put("ö", "&ouml;");
        hashMap.put("÷", "&divide;");
        hashMap.put("ø", "&oslash;");
        hashMap.put("ù", "&ugrave;");
        hashMap.put("ú", "&uacute;");
        hashMap.put("û", "&ucirc;");
        hashMap.put("ü", "&uuml;");
        hashMap.put("ý", "&yacute;");
        hashMap.put("þ", "&thorn;");
        hashMap.put("ÿ", "&yuml;");
        Map<CharSequence, CharSequence> unmodifiableMap = Collections.unmodifiableMap(hashMap);
        f174901a = unmodifiableMap;
        f174902b = Collections.unmodifiableMap(m268451a(unmodifiableMap));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ƒ", "&fnof;");
        hashMap2.put("Α", "&Alpha;");
        hashMap2.put("Β", "&Beta;");
        hashMap2.put("Γ", "&Gamma;");
        hashMap2.put("Δ", "&Delta;");
        hashMap2.put("Ε", "&Epsilon;");
        hashMap2.put("Ζ", "&Zeta;");
        hashMap2.put("Η", "&Eta;");
        hashMap2.put("Θ", "&Theta;");
        hashMap2.put("Ι", "&Iota;");
        hashMap2.put("Κ", "&Kappa;");
        hashMap2.put("Λ", "&Lambda;");
        hashMap2.put("Μ", "&Mu;");
        hashMap2.put("Ν", "&Nu;");
        hashMap2.put("Ξ", "&Xi;");
        hashMap2.put("Ο", "&Omicron;");
        hashMap2.put("Π", "&Pi;");
        hashMap2.put("Ρ", "&Rho;");
        hashMap2.put("Σ", "&Sigma;");
        hashMap2.put("Τ", "&Tau;");
        hashMap2.put("Υ", "&Upsilon;");
        hashMap2.put("Φ", "&Phi;");
        hashMap2.put("Χ", "&Chi;");
        hashMap2.put("Ψ", "&Psi;");
        hashMap2.put("Ω", "&Omega;");
        hashMap2.put("α", "&alpha;");
        hashMap2.put("β", "&beta;");
        hashMap2.put("γ", "&gamma;");
        hashMap2.put("δ", "&delta;");
        hashMap2.put("ε", "&epsilon;");
        hashMap2.put("ζ", "&zeta;");
        hashMap2.put("η", "&eta;");
        hashMap2.put("θ", "&theta;");
        hashMap2.put("ι", "&iota;");
        hashMap2.put("κ", "&kappa;");
        hashMap2.put("λ", "&lambda;");
        hashMap2.put("μ", "&mu;");
        hashMap2.put("ν", "&nu;");
        hashMap2.put("ξ", "&xi;");
        hashMap2.put("ο", "&omicron;");
        hashMap2.put("π", "&pi;");
        hashMap2.put("ρ", "&rho;");
        hashMap2.put("ς", "&sigmaf;");
        hashMap2.put("σ", "&sigma;");
        hashMap2.put("τ", "&tau;");
        hashMap2.put("υ", "&upsilon;");
        hashMap2.put("φ", "&phi;");
        hashMap2.put("χ", "&chi;");
        hashMap2.put("ψ", "&psi;");
        hashMap2.put("ω", "&omega;");
        hashMap2.put("ϑ", "&thetasym;");
        hashMap2.put("ϒ", "&upsih;");
        hashMap2.put("ϖ", "&piv;");
        hashMap2.put("•", "&bull;");
        hashMap2.put("…", "&hellip;");
        hashMap2.put("′", "&prime;");
        hashMap2.put("″", "&Prime;");
        hashMap2.put("‾", "&oline;");
        hashMap2.put("⁄", "&frasl;");
        hashMap2.put("℘", "&weierp;");
        hashMap2.put("ℑ", "&image;");
        hashMap2.put("ℜ", "&real;");
        hashMap2.put("™", "&trade;");
        hashMap2.put("ℵ", "&alefsym;");
        hashMap2.put("←", "&larr;");
        hashMap2.put("↑", "&uarr;");
        hashMap2.put("→", "&rarr;");
        hashMap2.put("↓", "&darr;");
        hashMap2.put("↔", "&harr;");
        hashMap2.put("↵", "&crarr;");
        hashMap2.put("⇐", "&lArr;");
        hashMap2.put("⇑", "&uArr;");
        hashMap2.put("⇒", "&rArr;");
        hashMap2.put("⇓", "&dArr;");
        hashMap2.put("⇔", "&hArr;");
        hashMap2.put("∀", "&forall;");
        hashMap2.put("∂", "&part;");
        hashMap2.put("∃", "&exist;");
        hashMap2.put("∅", "&empty;");
        hashMap2.put("∇", "&nabla;");
        hashMap2.put("∈", "&isin;");
        hashMap2.put("∉", "&notin;");
        hashMap2.put("∋", "&ni;");
        hashMap2.put("∏", "&prod;");
        hashMap2.put("∑", "&sum;");
        hashMap2.put("−", "&minus;");
        hashMap2.put("∗", "&lowast;");
        hashMap2.put("√", "&radic;");
        hashMap2.put("∝", "&prop;");
        hashMap2.put("∞", "&infin;");
        hashMap2.put("∠", "&ang;");
        hashMap2.put("∧", "&and;");
        hashMap2.put("∨", "&or;");
        hashMap2.put("∩", "&cap;");
        hashMap2.put("∪", "&cup;");
        hashMap2.put("∫", "&int;");
        hashMap2.put("∴", "&there4;");
        hashMap2.put("∼", "&sim;");
        hashMap2.put("≅", "&cong;");
        hashMap2.put("≈", "&asymp;");
        hashMap2.put("≠", "&ne;");
        hashMap2.put("≡", "&equiv;");
        hashMap2.put("≤", "&le;");
        hashMap2.put("≥", "&ge;");
        hashMap2.put("⊂", "&sub;");
        hashMap2.put("⊃", "&sup;");
        hashMap2.put("⊄", "&nsub;");
        hashMap2.put("⊆", "&sube;");
        hashMap2.put("⊇", "&supe;");
        hashMap2.put("⊕", "&oplus;");
        hashMap2.put("⊗", "&otimes;");
        hashMap2.put("⊥", "&perp;");
        hashMap2.put("⋅", "&sdot;");
        hashMap2.put("⌈", "&lceil;");
        hashMap2.put("⌉", "&rceil;");
        hashMap2.put("⌊", "&lfloor;");
        hashMap2.put("⌋", "&rfloor;");
        hashMap2.put("〈", "&lang;");
        hashMap2.put("〉", "&rang;");
        hashMap2.put("◊", "&loz;");
        hashMap2.put("♠", "&spades;");
        hashMap2.put("♣", "&clubs;");
        hashMap2.put("♥", "&hearts;");
        hashMap2.put("♦", "&diams;");
        hashMap2.put("Œ", "&OElig;");
        hashMap2.put("œ", "&oelig;");
        hashMap2.put("Š", "&Scaron;");
        hashMap2.put("š", "&scaron;");
        hashMap2.put("Ÿ", "&Yuml;");
        hashMap2.put("ˆ", "&circ;");
        hashMap2.put("˜", "&tilde;");
        hashMap2.put(" ", "&ensp;");
        hashMap2.put(" ", "&emsp;");
        hashMap2.put(" ", "&thinsp;");
        hashMap2.put("‌", "&zwnj;");
        hashMap2.put("‍", "&zwj;");
        hashMap2.put("‎", "&lrm;");
        hashMap2.put("‏", "&rlm;");
        hashMap2.put("–", "&ndash;");
        hashMap2.put("—", "&mdash;");
        hashMap2.put("‘", "&lsquo;");
        hashMap2.put("’", "&rsquo;");
        hashMap2.put("‚", "&sbquo;");
        hashMap2.put("“", "&ldquo;");
        hashMap2.put("”", "&rdquo;");
        hashMap2.put("„", "&bdquo;");
        hashMap2.put("†", "&dagger;");
        hashMap2.put("‡", "&Dagger;");
        hashMap2.put("‰", "&permil;");
        hashMap2.put("‹", "&lsaquo;");
        hashMap2.put("›", "&rsaquo;");
        hashMap2.put("€", "&euro;");
        Map<CharSequence, CharSequence> unmodifiableMap2 = Collections.unmodifiableMap(hashMap2);
        f174903c = unmodifiableMap2;
        f174904d = Collections.unmodifiableMap(m268451a(unmodifiableMap2));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("\"", "&quot;");
        hashMap3.put(ContainerUtils.FIELD_DELIMITER, "&amp;");
        hashMap3.put("<", "&lt;");
        hashMap3.put(">", "&gt;");
        Map<CharSequence, CharSequence> unmodifiableMap3 = Collections.unmodifiableMap(hashMap3);
        f174905e = unmodifiableMap3;
        f174906f = Collections.unmodifiableMap(m268451a(unmodifiableMap3));
        HashMap hashMap4 = new HashMap();
        hashMap4.put("'", "&apos;");
        Map<CharSequence, CharSequence> unmodifiableMap4 = Collections.unmodifiableMap(hashMap4);
        f174907g = unmodifiableMap4;
        f174908h = Collections.unmodifiableMap(m268451a(unmodifiableMap4));
        HashMap hashMap5 = new HashMap();
        hashMap5.put("\b", "\\b");
        hashMap5.put("\n", "\\n");
        hashMap5.put("\t", "\\t");
        hashMap5.put("\f", "\\f");
        hashMap5.put("\r", "\\r");
        Map<CharSequence, CharSequence> unmodifiableMap5 = Collections.unmodifiableMap(hashMap5);
        f174909i = unmodifiableMap5;
        f174910j = Collections.unmodifiableMap(m268451a(unmodifiableMap5));
    }

    /* renamed from: a */
    public static Map<CharSequence, CharSequence> m268451a(Map<CharSequence, CharSequence> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<CharSequence, CharSequence> entry : map.entrySet()) {
            hashMap.put(entry.getValue(), entry.getKey());
        }
        return hashMap;
    }
}
