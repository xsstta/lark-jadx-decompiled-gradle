package com.bytedance.ee.bear.todocenter.parser;

import com.bytedance.ee.log.C13479a;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.todocenter.parser.c */
public class C11707c {

    /* renamed from: a */
    private static final Map<String, String> f31498a;

    static {
        HashMap hashMap = new HashMap();
        f31498a = hashMap;
        hashMap.put("&nbsp;", " ");
        hashMap.put("&iexcl;", "¡");
        hashMap.put("&cent;", "¢");
        hashMap.put("&pound;", "£");
        hashMap.put("&curren;", "¤");
        hashMap.put("&yen;", "¥");
        hashMap.put("&brvbar;", "¦");
        hashMap.put("&sect;", "§");
        hashMap.put("&uml;", "¨");
        hashMap.put("&copy;", "©");
        hashMap.put("&ordf;", "ª");
        hashMap.put("&laquo;", "«");
        hashMap.put("&not;", "¬");
        hashMap.put("&shy;", "­");
        hashMap.put("&reg;", "®");
        hashMap.put("&macr;", "¯");
        hashMap.put("&deg;", "°");
        hashMap.put("&plusmn;", "±");
        hashMap.put("&sup2;", "²");
        hashMap.put("&sup3;", "³");
        hashMap.put("&acute;", "´");
        hashMap.put("&micro;", "µ");
        hashMap.put("&para;", "¶");
        hashMap.put("&middot;", "·");
        hashMap.put("&cedil;", "¸");
        hashMap.put("&sup1;", "¹");
        hashMap.put("&ordm;", "º");
        hashMap.put("&raquo;", "»");
        hashMap.put("&frac14;", "¼");
        hashMap.put("&frac12;", "½");
        hashMap.put("&frac34;", "¾");
        hashMap.put("&iquest;", "¿");
        hashMap.put("&Agrave;", "À");
        hashMap.put("&Aacute;", "Á");
        hashMap.put("&Acirc;", "Â");
        hashMap.put("&Atilde;", "Ã");
        hashMap.put("&Auml;", "Ä");
        hashMap.put("&Aring;", "Å");
        hashMap.put("&AElig;", "Æ");
        hashMap.put("&Ccedil;", "Ç");
        hashMap.put("&Egrave;", "È");
        hashMap.put("&Eacute;", "É");
        hashMap.put("&Ecirc;", "Ê");
        hashMap.put("&Euml;", "Ë");
        hashMap.put("&Igrave;", "Ì");
        hashMap.put("&Iacute;", "Í");
        hashMap.put("&Icirc;", "Î");
        hashMap.put("&Iuml;", "Ï");
        hashMap.put("&ETH;", "Ð");
        hashMap.put("&Ntilde;", "Ñ");
        hashMap.put("&Ograve;", "Ò");
        hashMap.put("&Oacute;", "Ó");
        hashMap.put("&Ocirc;", "Ô");
        hashMap.put("&Otilde;", "Õ");
        hashMap.put("&Ouml;", "Ö");
        hashMap.put("&times;", "×");
        hashMap.put("&Oslash;", "Ø");
        hashMap.put("&Ugrave;", "Ù");
        hashMap.put("&Uacute;", "Ú");
        hashMap.put("&Ucirc;", "Û");
        hashMap.put("&Uuml;", "Ü");
        hashMap.put("&Yacute;", "Ý");
        hashMap.put("&THORN;", "Þ");
        hashMap.put("&szlig;", "ß");
        hashMap.put("&agrave;", "à");
        hashMap.put("&aacute;", "á");
        hashMap.put("&acirc;", "â");
        hashMap.put("&atilde;", "ã");
        hashMap.put("&auml;", "ä");
        hashMap.put("&aring;", "å");
        hashMap.put("&aelig;", "æ");
        hashMap.put("&ccedil;", "ç");
        hashMap.put("&egrave;", "è");
        hashMap.put("&eacute;", "é");
        hashMap.put("&ecirc;", "ê");
        hashMap.put("&euml;", "ë");
        hashMap.put("&igrave;", "ì");
        hashMap.put("&iacute;", "í");
        hashMap.put("&icirc;", "î");
        hashMap.put("&iuml;", "ï");
        hashMap.put("&eth;", "ð");
        hashMap.put("&ntilde;", "ñ");
        hashMap.put("&ograve;", "ò");
        hashMap.put("&oacute;", "ó");
        hashMap.put("&ocirc;", "ô");
        hashMap.put("&otilde;", "õ");
        hashMap.put("&ouml;", "ö");
        hashMap.put("&divide;", "÷");
        hashMap.put("&oslash;", "ø");
        hashMap.put("&ugrave;", "ù");
        hashMap.put("&uacute;", "ú");
        hashMap.put("&ucirc;", "û");
        hashMap.put("&uuml;", "ü");
        hashMap.put("&yacute;", "ý");
        hashMap.put("&thorn;", "þ");
        hashMap.put("&yuml;", "ÿ");
        hashMap.put("&quot;", "\"");
        hashMap.put("&amp;", ContainerUtils.FIELD_DELIMITER);
        hashMap.put("&lt;", "<");
        hashMap.put("&gt;", ">");
        hashMap.put("&apos;", "'");
        hashMap.put("&OElig;", "Œ");
        hashMap.put("&oelig;", "œ");
        hashMap.put("&Scaron;", "Š");
        hashMap.put("&scaron;", "š");
        hashMap.put("&Yuml;", "Ÿ");
        hashMap.put("&circ;", "ˆ");
        hashMap.put("&tilde;", "˜");
        hashMap.put("&ensp;", " ");
        hashMap.put("&emsp;", " ");
        hashMap.put("&thinsp;", " ");
        hashMap.put("&zwnj;", "‌");
        hashMap.put("&zwj;", "‍");
        hashMap.put("&lrm;", "‎");
        hashMap.put("&rlm;", "‏");
        hashMap.put("&ndash;", "–");
        hashMap.put("&mdash;", "—");
        hashMap.put("&lsquo;", "‘");
        hashMap.put("&rsquo;", "’");
        hashMap.put("&sbquo;", "‚");
        hashMap.put("&ldquo;", "“");
        hashMap.put("&rdquo;", "”");
        hashMap.put("&bdquo;", "„");
        hashMap.put("&dagger;", "†");
        hashMap.put("&Dagger;", "‡");
        hashMap.put("&permil;", "‰");
        hashMap.put("&lsaquo;", "‹");
        hashMap.put("&rsaquo;", "›");
        hashMap.put("&euro;", "€");
        hashMap.put("&fnof;", "ƒ");
        hashMap.put("&Alpha;", "Α");
        hashMap.put("&Beta;", "Β");
        hashMap.put("&Gamma;", "Γ");
        hashMap.put("&Delta;", "Δ");
        hashMap.put("&Epsilon;", "Ε");
        hashMap.put("&Zeta;", "Ζ");
        hashMap.put("&Eta;", "Η");
        hashMap.put("&Theta;", "Θ");
        hashMap.put("&Iota;", "Ι");
        hashMap.put("&Kappa;", "Κ");
        hashMap.put("&Lambda;", "Λ");
        hashMap.put("&Mu;", "Μ");
        hashMap.put("&Nu;", "Ν");
        hashMap.put("&Xi;", "Ξ");
        hashMap.put("&Omicron;", "Ο");
        hashMap.put("&Pi;", "Π");
        hashMap.put("&Rho;", "Ρ");
        hashMap.put("&Sigma;", "Σ");
        hashMap.put("&Tau;", "Τ");
        hashMap.put("&Upsilon;", "Υ");
        hashMap.put("&Phi;", "Φ");
        hashMap.put("&Chi;", "Χ");
        hashMap.put("&Psi;", "Ψ");
        hashMap.put("&Omega;", "Ω");
        hashMap.put("&alpha;", "α");
        hashMap.put("&beta;", "β");
        hashMap.put("&gamma;", "γ");
        hashMap.put("&delta;", "δ");
        hashMap.put("&epsilon;", "ε");
        hashMap.put("&zeta;", "ζ");
        hashMap.put("&eta;", "η");
        hashMap.put("&theta;", "θ");
        hashMap.put("&iota;", "ι");
        hashMap.put("&kappa;", "κ");
        hashMap.put("&lambda;", "λ");
        hashMap.put("&mu;", "μ");
        hashMap.put("&nu;", "ν");
        hashMap.put("&xi;", "ξ");
        hashMap.put("&omicron;", "ο");
        hashMap.put("&pi;", "π");
        hashMap.put("&rho;", "ρ");
        hashMap.put("&sigmaf;", "ς");
        hashMap.put("&sigma;", "σ");
        hashMap.put("&tau;", "τ");
        hashMap.put("&upsilon;", "υ");
        hashMap.put("&phi;", "φ");
        hashMap.put("&chi;", "χ");
        hashMap.put("&psi;", "ψ");
        hashMap.put("&omega;", "ω");
        hashMap.put("&thetasym;", "ϑ");
        hashMap.put("&upsih;", "ϒ");
        hashMap.put("&piv;", "ϖ");
        hashMap.put("&bull;", "•");
        hashMap.put("&hellip;", "…");
        hashMap.put("&prime;", "′");
        hashMap.put("&Prime;", "″");
        hashMap.put("&oline;", "‾");
        hashMap.put("&frasl;", "⁄");
        hashMap.put("&weierp;", "℘");
        hashMap.put("&image;", "ℑ");
        hashMap.put("&real;", "ℜ");
        hashMap.put("&trade;", "™");
        hashMap.put("&alefsym;", "ℵ");
        hashMap.put("&larr;", "←");
        hashMap.put("&uarr;", "↑");
        hashMap.put("&rarr;", "→");
        hashMap.put("&darr;", "↓");
        hashMap.put("&harr;", "↔");
        hashMap.put("&crarr;", "↵");
        hashMap.put("&lArr;", "⇐");
        hashMap.put("&uArr;", "⇑");
        hashMap.put("&rArr;", "⇒");
        hashMap.put("&dArr;", "⇓");
        hashMap.put("&hArr;", "⇔");
        hashMap.put("&forall;", "∀");
        hashMap.put("&part;", "∂");
        hashMap.put("&exist;", "∃");
        hashMap.put("&empty;", "∅");
        hashMap.put("&nabla;", "∇");
        hashMap.put("&isin;", "∈");
        hashMap.put("&notin;", "∉");
        hashMap.put("&ni;", "∋");
        hashMap.put("&prod;", "∏");
        hashMap.put("&sum;", "∑");
        hashMap.put("&minus;", "−");
        hashMap.put("&lowast;", "∗");
        hashMap.put("&radic;", "√");
        hashMap.put("&prop;", "∝");
        hashMap.put("&infin;", "∞");
        hashMap.put("&ang;", "∠");
        hashMap.put("&and;", "∧");
        hashMap.put("&or;", "∨");
        hashMap.put("&cap;", "∩");
        hashMap.put("&cup;", "∪");
        hashMap.put("&int;", "∫");
        hashMap.put("&there4;", "∴");
        hashMap.put("&sim;", "∼");
        hashMap.put("&cong;", "≅");
        hashMap.put("&asymp;", "≈");
        hashMap.put("&ne;", "≠");
        hashMap.put("&equiv;", "≡");
        hashMap.put("&le;", "≤");
        hashMap.put("&ge;", "≥");
        hashMap.put("&sub;", "⊂");
        hashMap.put("&sup;", "⊃");
        hashMap.put("&nsub;", "⊄");
        hashMap.put("&sube;", "⊆");
        hashMap.put("&supe;", "⊇");
        hashMap.put("&oplus;", "⊕");
        hashMap.put("&otimes;", "⊗");
        hashMap.put("&perp;", "⊥");
        hashMap.put("&sdot;", "⋅");
        hashMap.put("&lceil;", "⌈");
        hashMap.put("&rceil;", "⌉");
        hashMap.put("&lfloor;", "⌊");
        hashMap.put("&rfloor;", "⌋");
        hashMap.put("&lang;", "〈");
        hashMap.put("&rang;", "〉");
        hashMap.put("&loz;", "◊");
        hashMap.put("&spades;", "♠");
        hashMap.put("&clubs;", "♣");
        hashMap.put("&hearts;", "♥");
        hashMap.put("&diams;", "♦");
    }

    /* renamed from: a */
    public static String m48544a(String str) {
        int i;
        try {
            if (str.charAt(1) != '#') {
                return f31498a.get(str);
            }
            char charAt = str.charAt(2);
            if (charAt != 'x') {
                if (charAt != 'X') {
                    i = Integer.parseInt(str.substring(2, str.length() - 1));
                    return new String(Character.toChars(i));
                }
            }
            i = Integer.parseInt(str.substring(3, str.length() - 1), 16);
            return new String(Character.toChars(i));
        } catch (Exception e) {
            C13479a.m54759a("HtmlParseUtils", "getTransformChar() error, code=" + str, e);
            return str;
        }
    }
}