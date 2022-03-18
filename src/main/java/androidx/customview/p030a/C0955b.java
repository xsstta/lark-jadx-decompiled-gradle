package androidx.customview.p030a;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: androidx.customview.a.b */
class C0955b {

    /* renamed from: androidx.customview.a.b$a */
    public interface AbstractC0956a<T> {
        /* renamed from: a */
        void mo4856a(T t, Rect rect);
    }

    /* renamed from: androidx.customview.a.b$b */
    public interface AbstractC0957b<T, V> {
        /* renamed from: a */
        int mo4858a(T t);

        /* renamed from: a */
        V mo4860a(T t, int i);
    }

    /* renamed from: a */
    private static int m4620a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: androidx.customview.a.b$c */
    private static class C0958c<T> implements Comparator<T> {

        /* renamed from: a */
        private final Rect f3585a = new Rect();

        /* renamed from: b */
        private final Rect f3586b = new Rect();

        /* renamed from: c */
        private final boolean f3587c;

        /* renamed from: d */
        private final AbstractC0956a<T> f3588d;

        C0958c(boolean z, AbstractC0956a<T> aVar) {
            this.f3587c = z;
            this.f3588d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f3585a;
            Rect rect2 = this.f3586b;
            this.f3588d.mo4856a(t, rect);
            this.f3588d.mo4856a(t2, rect2);
            if (rect.top < rect2.top) {
                return -1;
            }
            if (rect.top > rect2.top) {
                return 1;
            }
            if (rect.left < rect2.left) {
                if (this.f3587c) {
                    return 1;
                }
                return -1;
            } else if (rect.left > rect2.left) {
                if (this.f3587c) {
                    return -1;
                }
                return 1;
            } else if (rect.bottom < rect2.bottom) {
                return -1;
            } else {
                if (rect.bottom > rect2.bottom) {
                    return 1;
                }
                if (rect.right < rect2.right) {
                    if (this.f3587c) {
                        return 1;
                    }
                    return -1;
                } else if (rect.right <= rect2.right) {
                    return 0;
                } else {
                    if (this.f3587c) {
                        return -1;
                    }
                    return 1;
                }
            }
        }
    }

    /* renamed from: c */
    private static int m4630c(int i, Rect rect, Rect rect2) {
        return Math.max(0, m4631d(i, rect, rect2));
    }

    /* renamed from: e */
    private static int m4632e(int i, Rect rect, Rect rect2) {
        return Math.max(1, m4633f(i, rect, rect2));
    }

    /* renamed from: b */
    private static <T> T m4627b(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: d */
    private static int m4631d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: f */
    private static int m4633f(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: b */
    private static boolean m4628b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    } else if (rect.bottom <= rect2.top) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (rect.right <= rect2.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (rect.top >= rect2.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (rect.left >= rect2.right) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: g */
    private static int m4634g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    /* renamed from: a */
    private static <T> T m4623a(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: a */
    private static boolean m4624a(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m4626a(Rect rect, Rect rect2, int i) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    } else if ((rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom) {
                        return true;
                    } else {
                        return false;
                    }
                } else if ((rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right) {
                    return true;
                } else {
                    return false;
                }
            } else if ((rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top) {
                return true;
            } else {
                return false;
            }
        } else if ((rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m4629b(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean a = m4624a(i, rect, rect2);
        if (m4624a(i, rect, rect3) || !a) {
            return false;
        }
        if (m4628b(i, rect, rect3) && i != 17 && i != 66 && m4630c(i, rect, rect2) >= m4632e(i, rect, rect3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m4625a(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!m4626a(rect, rect2, i)) {
            return false;
        }
        if (!m4626a(rect, rect3, i) || m4629b(i, rect, rect2, rect3)) {
            return true;
        }
        if (!m4629b(i, rect, rect3, rect2) && m4620a(m4630c(i, rect, rect2), m4634g(i, rect, rect2)) < m4620a(m4630c(i, rect, rect3), m4634g(i, rect, rect3))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <L, T> T m4622a(L l, AbstractC0957b<L, T> bVar, AbstractC0956a<T> aVar, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int a = bVar.mo4858a(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < a; i2++) {
            T a2 = bVar.mo4860a(l, i2);
            if (a2 != t) {
                aVar.mo4856a(a2, rect3);
                if (m4625a(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a2;
                }
            }
        }
        return t2;
    }

    /* renamed from: a */
    public static <L, T> T m4621a(L l, AbstractC0957b<L, T> bVar, AbstractC0956a<T> aVar, T t, int i, boolean z, boolean z2) {
        int a = bVar.mo4858a(l);
        ArrayList arrayList = new ArrayList(a);
        for (int i2 = 0; i2 < a; i2++) {
            arrayList.add(bVar.mo4860a(l, i2));
        }
        Collections.sort(arrayList, new C0958c(z, aVar));
        if (i == 1) {
            return (T) m4627b(t, arrayList, z2);
        }
        if (i == 2) {
            return (T) m4623a(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }
}
