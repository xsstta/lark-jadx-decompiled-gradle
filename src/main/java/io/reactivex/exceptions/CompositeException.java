package io.reactivex.exceptions;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    /* renamed from: io.reactivex.exceptions.CompositeException$a */
    static final class C68302a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }

        C68302a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.exceptions.CompositeException$b */
    public static abstract class AbstractC68303b {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo237976a(Object obj);

        AbstractC68303b() {
        }
    }

    public List<Throwable> getExceptions() {
        return this.exceptions;
    }

    public String getMessage() {
        return this.message;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public int size() {
        return this.exceptions.size();
    }

    public synchronized Throwable getCause() {
        if (this.cause == null) {
            C68302a aVar = new C68302a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.exceptions.iterator();
            C68302a aVar2 = aVar;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th : getListOfCauses(next)) {
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        aVar2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    aVar2 = getRootCause(aVar2);
                }
            }
            this.cause = aVar;
        }
        return this.cause;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.exceptions.CompositeException$c */
    public static final class C68304c extends AbstractC68303b {

        /* renamed from: a */
        private final PrintStream f171630a;

        C68304c(PrintStream printStream) {
            this.f171630a = printStream;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.exceptions.CompositeException.AbstractC68303b
        /* renamed from: a */
        public void mo237976a(Object obj) {
            this.f171630a.println(obj);
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$d */
    static final class C68305d extends AbstractC68303b {

        /* renamed from: a */
        private final PrintWriter f171631a;

        C68305d(PrintWriter printWriter) {
            this.f171631a = printWriter;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.exceptions.CompositeException.AbstractC68303b
        /* renamed from: a */
        public void mo237976a(Object obj) {
            this.f171631a.println(obj);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace(new C68304c(printStream));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CompositeException(java.lang.Throwable... r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x000e
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "exceptions was null"
            r2.<init>(r0)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            goto L_0x0012
        L_0x000e:
            java.util.List r2 = java.util.Arrays.asList(r2)
        L_0x0012:
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.exceptions.CompositeException.<init>(java.lang.Throwable[]):void");
    }

    private List<Throwable> getListOfCauses(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause2 = th.getCause();
        if (cause2 != null && cause2 != th) {
            while (true) {
                arrayList.add(cause2);
                Throwable cause3 = cause2.getCause();
                if (cause3 == null || cause3 == cause2) {
                    break;
                }
                cause2 = cause3;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public Throwable getRootCause(Throwable th) {
        Throwable cause2 = th.getCause();
        if (cause2 == null || this.cause == cause2) {
            return th;
        }
        while (true) {
            Throwable cause3 = cause2.getCause();
            if (cause3 == null || cause3 == cause2) {
                return cause2;
            }
            cause2 = cause3;
        }
        return cause2;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace(new C68305d(printWriter));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
            this.exceptions = unmodifiableList;
            this.message = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    private void printStackTrace(AbstractC68303b bVar) {
        StringBuilder sb = new StringBuilder((int) SmActions.ACTION_ONTHECALL_EXIT);
        sb.append(this);
        sb.append('\n');
        StackTraceElement[] stackTrace = getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            appendStackTrace(sb, th, "\t");
            i++;
        }
        bVar.mo237976a(sb.toString());
    }

    private void appendStackTrace(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            appendStackTrace(sb, th.getCause(), "");
        }
    }
}
