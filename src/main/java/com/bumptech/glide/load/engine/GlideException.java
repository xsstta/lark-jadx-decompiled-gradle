package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException extends Exception {
    private static final StackTraceElement[] EMPTY_ELEMENTS = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private Exception exception;
    private AbstractC2265c key;

    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    public Exception getOrigin() {
        return this.exception;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        addRootCauses(this, arrayList);
        return arrayList;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String str = "";
        sb.append(this.dataClass != null ? ", " + this.dataClass : str);
        sb.append(this.dataSource != null ? ", " + this.dataSource : str);
        if (this.key != null) {
            str = ", " + this.key;
        }
        sb.append(str);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" causes:");
        }
        for (Throwable th : rootCauses) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace((Appendable) printStream);
    }

    public void setOrigin(Exception exc) {
        this.exception = exc;
    }

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C2270a implements Appendable {

        /* renamed from: a */
        private final Appendable f7606a;

        /* renamed from: b */
        private boolean f7607b = true;

        /* renamed from: a */
        private CharSequence m9718a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        C2270a(Appendable appendable) {
            this.f7606a = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = m9718a(charSequence);
            return append(a, 0, a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f7607b) {
                this.f7607b = false;
                this.f7606a.append("  ");
            }
            if (c == '\n') {
                z = true;
            }
            this.f7607b = z;
            this.f7606a.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = m9718a(charSequence);
            boolean z = false;
            if (this.f7607b) {
                this.f7607b = false;
                this.f7606a.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f7607b = z;
            this.f7606a.append(a, i, i2);
            return this;
        }
    }

    private void printStackTrace(Appendable appendable) {
        appendExceptionMessage(this, appendable);
        appendCauses(getCauses(), new C2270a(appendable));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace((Appendable) printWriter);
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), rootCauses.get(i));
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public void setLoggingDetails(AbstractC2265c cVar, DataSource dataSource2) {
        setLoggingDetails(cVar, dataSource2, null);
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    private static void appendCauses(List<Throwable> list, Appendable appendable) {
        try {
            appendCausesWrapped(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(EMPTY_ELEMENTS);
        this.causes = list;
    }

    private void addRootCauses(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable th2 : ((GlideException) th).getCauses()) {
                addRootCauses(th2, list);
            }
            return;
        }
        list.add(th);
    }

    private static void appendCausesWrapped(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).printStackTrace(appendable);
            } else {
                appendExceptionMessage(th, appendable);
            }
            i = i2;
        }
    }

    private static void appendExceptionMessage(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* access modifiers changed from: package-private */
    public void setLoggingDetails(AbstractC2265c cVar, DataSource dataSource2, Class<?> cls) {
        this.key = cVar;
        this.dataSource = dataSource2;
        this.dataClass = cls;
    }
}
