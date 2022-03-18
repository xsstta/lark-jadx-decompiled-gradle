package com.bytedance.ee.bear.p526r;

import android.text.SpannableStringBuilder;
import com.bytedance.ee.bear.p398i.C7838i;
import com.bytedance.ee.bear.span.HyperLinkSpan;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.ee.bear.r.e */
public class C10606e {

    /* renamed from: a */
    private Pattern f28465a = Pattern.compile("[-a-zA-z:0-9%_+~#@.\\\\/]", 2);

    /* renamed from: b */
    private Matcher f28466b;

    /* renamed from: c */
    private Pattern f28467c = Pattern.compile("(((https?|s?ftp|ftps|nfs|ssh)://)?)(([-A-Za-z0-9%_+~#@][-A-Za-z:0-9%_+~#@\\\\]{0,256}\\.){1,50})(com|cn|tk|de|net|org|uk|info|nl|ru|hk)", 2);

    /* renamed from: d */
    private Matcher f28468d;

    /* renamed from: e */
    private List<C7838i> f28469e = new ArrayList();

    /* renamed from: f */
    private int f28470f = -1;

    /* renamed from: g */
    private boolean f28471g;

    /* renamed from: b */
    public boolean mo40089b(int i, int i2) {
        return i >= 0 && i2 > 0;
    }

    /* renamed from: c */
    public boolean mo40091c(int i, int i2) {
        return i > 0 && i2 == 0;
    }

    /* renamed from: a */
    public int mo40076a() {
        return this.f28470f;
    }

    /* renamed from: b */
    public void mo40088b(SpannableStringBuilder spannableStringBuilder) {
        if (this.f28471g) {
            mo40082a(spannableStringBuilder);
        }
    }

    /* renamed from: a */
    public boolean mo40085a(String str) {
        Matcher matcher = this.f28467c.matcher(str);
        this.f28468d = matcher;
        return matcher.matches();
    }

    /* renamed from: a */
    public int mo40077a(int i) {
        for (int i2 = 0; i2 < this.f28469e.size(); i2++) {
            if (this.f28469e.get(i2).f21154a == i) {
                return this.f28469e.get(i2).f21155b;
            }
        }
        return i;
    }

    /* renamed from: b */
    public int mo40086b(int i) {
        for (int i2 = 0; i2 < this.f28469e.size(); i2++) {
            if (this.f28469e.get(i2).f21155b == i) {
                return this.f28469e.get(i2).f21154a;
            }
        }
        return i;
    }

    /* renamed from: d */
    public int mo40092d(int i) {
        for (int i2 = 0; i2 < this.f28469e.size(); i2++) {
            if (this.f28469e.get(i2).f21154a <= i && this.f28469e.get(i2).f21155b >= i) {
                return this.f28469e.get(i2).f21154a;
            }
        }
        return i;
    }

    /* renamed from: c */
    public void mo40090c(int i) {
        Iterator<C7838i> it = this.f28469e.iterator();
        while (it.hasNext()) {
            C7838i next = it.next();
            if (next.f21154a <= i && next.f21155b >= i) {
                C13479a.m54772d("HyperLinkProcessor", "remove start " + next.f21154a + " end " + next.f21155b);
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public void mo40082a(SpannableStringBuilder spannableStringBuilder) {
        this.f28469e.clear();
        HyperLinkSpan[] fVarArr = (HyperLinkSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), HyperLinkSpan.class);
        for (int i = 0; i < fVarArr.length; i++) {
            int spanStart = spannableStringBuilder.getSpanStart(fVarArr[i]);
            int spanEnd = spannableStringBuilder.getSpanEnd(fVarArr[i]);
            this.f28469e.add(new C7838i(spanStart, spanEnd, spannableStringBuilder.subSequence(spanStart, spanEnd).toString()));
            C13479a.m54772d("HyperLinkProcessor", "updateSpanList start " + spanStart + " end " + spanEnd + " url " + ((Object) spannableStringBuilder.subSequence(spanStart, spanEnd)));
        }
    }

    /* renamed from: a */
    public void mo40083a(C7838i iVar) {
        for (int i = 0; i < this.f28469e.size(); i++) {
            if (this.f28469e.get(i).f21154a == iVar.f21154a) {
                this.f28469e.get(i).f21155b = iVar.f21155b;
                return;
            }
        }
        this.f28469e.add(iVar);
    }

    /* renamed from: a */
    public boolean mo40084a(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            Matcher matcher = this.f28465a.matcher(String.valueOf(charSequence.charAt(i)));
            this.f28466b = matcher;
            if (!matcher.matches()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public int mo40078a(int i, CharSequence charSequence) {
        do {
            i--;
            if (i < 0) {
                break;
            }
        } while (mo40084a((CharSequence) String.valueOf(charSequence.charAt(i))));
        return i + 1;
    }

    /* renamed from: b */
    public int mo40087b(int i, CharSequence charSequence) {
        while (i < charSequence.length() && mo40084a((CharSequence) String.valueOf(charSequence.charAt(i)))) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public void mo40079a(int i, int i2) {
        for (int i3 = 0; i3 < this.f28469e.size(); i3++) {
            if (i == this.f28469e.get(i3).f21155b) {
                this.f28469e.get(i3).f21154a = i2;
                C13479a.m54772d("HyperLinkProcessor", "update input  start " + this.f28469e.get(i3).f21154a + " end " + i);
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo40080a(int i, int i2, int i3) {
        this.f28471g = false;
        this.f28470f = -1;
        if (mo40089b(i3, i2)) {
            for (int i4 = 0; i4 < this.f28469e.size(); i4++) {
                if (i == this.f28469e.get(i4).f21154a) {
                    C13479a.m54772d("HyperLinkProcessor", "add at start");
                    this.f28470f = 1;
                    int i5 = i2 - i3;
                    this.f28469e.get(i4).f21154a += i5;
                    this.f28469e.get(i4).f21155b += i5;
                } else if (i > this.f28469e.get(i4).f21154a && i < this.f28469e.get(i4).f21155b) {
                    C13479a.m54772d("HyperLinkProcessor", "add in center");
                    this.f28470f = 2;
                    this.f28469e.get(i4).f21155b += i2 - i3;
                } else if (i == this.f28469e.get(i4).f21155b) {
                    C13479a.m54772d("HyperLinkProcessor", "add at end");
                    this.f28470f = 3;
                } else if (this.f28469e.get(i4).f21154a > i && this.f28469e.get(i4).f21155b > i) {
                    int i6 = i2 - i3;
                    this.f28469e.get(i4).f21154a += i6;
                    this.f28469e.get(i4).f21155b += i6;
                }
            }
            if (this.f28470f == -1) {
                C13479a.m54772d("HyperLinkProcessor", "add at common");
                this.f28470f = 0;
            }
        } else if (mo40091c(i3, i2)) {
            this.f28471g = true;
            int i7 = i + i3;
            for (int i8 = 0; i8 < this.f28469e.size(); i8++) {
                if (i7 == this.f28469e.get(i8).f21154a) {
                    C13479a.m54772d("HyperLinkProcessor", "delete at start");
                    this.f28470f = 1;
                    int i9 = i3 - i2;
                    this.f28469e.get(i8).f21154a -= i9;
                    this.f28469e.get(i8).f21155b -= i9;
                } else if (i7 > this.f28469e.get(i8).f21154a && i7 < this.f28469e.get(i8).f21155b) {
                    C13479a.m54772d("HyperLinkProcessor", "delete in center start " + this.f28469e.get(i8).f21154a + " end " + this.f28469e.get(i8).f21155b);
                    this.f28470f = 2;
                    C7838i iVar = this.f28469e.get(i8);
                    iVar.f21155b = iVar.f21155b - (i3 - i2);
                } else if (i7 == this.f28469e.get(i8).f21155b) {
                    C13479a.m54772d("HyperLinkProcessor", "delete at end");
                    this.f28470f = 3;
                    this.f28469e.get(i8).f21155b -= i3 - i2;
                } else if (this.f28469e.get(i8).f21154a > i7 && this.f28469e.get(i8).f21155b > i7) {
                    int i10 = i3 - i2;
                    this.f28469e.get(i8).f21154a -= i10;
                    this.f28469e.get(i8).f21155b -= i10;
                }
            }
            if (this.f28470f == -1) {
                C13479a.m54772d("HyperLinkProcessor", "delete at common");
                this.f28470f = 0;
            }
        }
    }

    /* renamed from: a */
    public void mo40081a(int i, int i2, int i3, String str) {
        int i4 = 0;
        while (true) {
            if (i4 >= this.f28469e.size()) {
                break;
            } else if (i == this.f28469e.get(i4).f21155b) {
                this.f28469e.get(i4).f21155b += i2;
                break;
            } else {
                i4++;
            }
        }
        this.f28469e.add(new C7838i(i3, i + i2, str));
    }
}
