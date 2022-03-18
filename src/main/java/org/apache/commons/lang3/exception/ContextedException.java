package org.apache.commons.lang3.exception;

import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.tuple.Pair;

public class ContextedException extends Exception implements AbstractC69879a {
    private static final long serialVersionUID = 20110706;
    private final AbstractC69879a exceptionContext;

    @Override // org.apache.commons.lang3.exception.AbstractC69879a
    public List<Pair<String, Object>> getContextEntries() {
        return this.exceptionContext.getContextEntries();
    }

    @Override // org.apache.commons.lang3.exception.AbstractC69879a
    public Set<String> getContextLabels() {
        return this.exceptionContext.getContextLabels();
    }

    public String getRawMessage() {
        return super.getMessage();
    }

    public ContextedException() {
        this.exceptionContext = new DefaultExceptionContext();
    }

    public String getMessage() {
        return getFormattedExceptionMessage(super.getMessage());
    }

    @Override // org.apache.commons.lang3.exception.AbstractC69879a
    public List<Object> getContextValues(String str) {
        return this.exceptionContext.getContextValues(str);
    }

    @Override // org.apache.commons.lang3.exception.AbstractC69879a
    public Object getFirstContextValue(String str) {
        return this.exceptionContext.getFirstContextValue(str);
    }

    @Override // org.apache.commons.lang3.exception.AbstractC69879a
    public String getFormattedExceptionMessage(String str) {
        return this.exceptionContext.getFormattedExceptionMessage(str);
    }

    public ContextedException(String str) {
        super(str);
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedException(Throwable th) {
        super(th);
        this.exceptionContext = new DefaultExceptionContext();
    }

    @Override // org.apache.commons.lang3.exception.AbstractC69879a
    public ContextedException addContextValue(String str, Object obj) {
        this.exceptionContext.addContextValue(str, obj);
        return this;
    }

    @Override // org.apache.commons.lang3.exception.AbstractC69879a
    public ContextedException setContextValue(String str, Object obj) {
        this.exceptionContext.setContextValue(str, obj);
        return this;
    }

    public ContextedException(String str, Throwable th) {
        super(str, th);
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedException(String str, Throwable th, AbstractC69879a aVar) {
        super(str, th);
        this.exceptionContext = aVar == null ? new DefaultExceptionContext() : aVar;
    }
}
