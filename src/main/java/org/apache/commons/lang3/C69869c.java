package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
/* renamed from: org.apache.commons.lang3.c */
public final class C69869c implements Serializable, Iterable<Character> {
    private static final long serialVersionUID = 8270183163158333422L;

    /* renamed from: a */
    private transient String f174648a;
    public final char end;
    public final boolean negated;
    public final char start;

    /* renamed from: org.apache.commons.lang3.c$a */
    private static class C69871a implements Iterator<Character> {

        /* renamed from: a */
        private char f174649a;

        /* renamed from: b */
        private final C69869c f174650b;

        /* renamed from: c */
        private boolean f174651c;

        public boolean hasNext() {
            return this.f174651c;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public Character next() {
            if (this.f174651c) {
                char c = this.f174649a;
                m268151b();
                return Character.valueOf(c);
            }
            throw new NoSuchElementException();
        }

        /* renamed from: b */
        private void m268151b() {
            if (this.f174650b.negated) {
                char c = this.f174649a;
                if (c == 65535) {
                    this.f174651c = false;
                } else if (c + 1 != this.f174650b.start) {
                    this.f174649a = (char) (this.f174649a + 1);
                } else if (this.f174650b.end == 65535) {
                    this.f174651c = false;
                } else {
                    this.f174649a = (char) (this.f174650b.end + 1);
                }
            } else if (this.f174649a < this.f174650b.end) {
                this.f174649a = (char) (this.f174649a + 1);
            } else {
                this.f174651c = false;
            }
        }

        private C69871a(C69869c cVar) {
            this.f174650b = cVar;
            this.f174651c = true;
            if (!cVar.negated) {
                this.f174649a = cVar.start;
            } else if (cVar.start != 0) {
                this.f174649a = 0;
            } else if (cVar.end == 65535) {
                this.f174651c = false;
            } else {
                this.f174649a = (char) (cVar.end + 1);
            }
        }
    }

    public char getEnd() {
        return this.end;
    }

    public char getStart() {
        return this.start;
    }

    public boolean isNegated() {
        return this.negated;
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return new C69871a();
    }

    public int hashCode() {
        return this.start + 'S' + (this.end * 7) + (this.negated ? 1 : 0);
    }

    public String toString() {
        if (this.f174648a == null) {
            StringBuilder sb = new StringBuilder(4);
            if (isNegated()) {
                sb.append('^');
            }
            sb.append(this.start);
            if (this.start != this.end) {
                sb.append('-');
                sb.append(this.end);
            }
            this.f174648a = sb.toString();
        }
        return this.f174648a;
    }

    public static C69869c is(char c) {
        return new C69869c(c, c, false);
    }

    public static C69869c isNot(char c) {
        return new C69869c(c, c, true);
    }

    public boolean contains(char c) {
        boolean z;
        if (c < this.start || c > this.end) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.negated) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C69869c)) {
            return false;
        }
        C69869c cVar = (C69869c) obj;
        if (this.start == cVar.start && this.end == cVar.end && this.negated == cVar.negated) {
            return true;
        }
        return false;
    }

    public boolean contains(C69869c cVar) {
        boolean z;
        if (cVar != null) {
            z = true;
        } else {
            z = false;
        }
        C69882g.m268179a(z, "The Range must not be null", new Object[0]);
        if (this.negated) {
            if (cVar.negated) {
                if (this.start < cVar.start || this.end > cVar.end) {
                    return false;
                }
                return true;
            } else if (cVar.end < this.start || cVar.start > this.end) {
                return true;
            } else {
                return false;
            }
        } else if (cVar.negated) {
            if (this.start == 0 && this.end == 65535) {
                return true;
            }
            return false;
        } else if (this.start > cVar.start || this.end < cVar.end) {
            return false;
        } else {
            return true;
        }
    }

    public static C69869c isIn(char c, char c2) {
        return new C69869c(c, c2, false);
    }

    public static C69869c isNotIn(char c, char c2) {
        return new C69869c(c, c2, true);
    }

    private C69869c(char c, char c2, boolean z) {
        if (c > c2) {
            c2 = c;
            c = c2;
        }
        this.start = c;
        this.end = c2;
        this.negated = z;
    }
}
