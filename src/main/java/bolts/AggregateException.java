package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AggregateException extends Exception {
    private static final long serialVersionUID = 1;
    private List<Throwable> innerThrowables;

    public List<Throwable> getInnerThrowables() {
        return this.innerThrowables;
    }

    public Throwable[] getCauses() {
        List<Throwable> list = this.innerThrowables;
        return (Throwable[]) list.toArray(new Throwable[list.size()]);
    }

    public List<Exception> getErrors() {
        ArrayList arrayList = new ArrayList();
        List<Throwable> list = this.innerThrowables;
        if (list == null) {
            return arrayList;
        }
        for (Throwable th : list) {
            if (th instanceof Exception) {
                arrayList.add((Exception) th);
            } else {
                arrayList.add(new Exception(th));
            }
        }
        return arrayList;
    }

    public AggregateException(List<? extends Throwable> list) {
        this("There were multiple errors.", list);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append((CharSequence) Integer.toString(i));
            printStream.append(": ");
            th.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append((CharSequence) Integer.toString(i));
            printWriter.append(": ");
            th.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }

    public AggregateException(String str, Throwable[] thArr) {
        this(str, Arrays.asList(thArr));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AggregateException(java.lang.String r2, java.util.List<? extends java.lang.Throwable> r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0010
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0010
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r1.<init>(r2, r0)
            java.util.List r2 = java.util.Collections.unmodifiableList(r3)
            r1.innerThrowables = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bolts.AggregateException.<init>(java.lang.String, java.util.List):void");
    }
}
