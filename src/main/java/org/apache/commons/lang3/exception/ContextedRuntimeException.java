package org.apache.commons.lang3.exception;

import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.tuple.Pair;

public class ContextedRuntimeException extends RuntimeException implements AbstractC69879a {
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

    public ContextedRuntimeException() {
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

    public ContextedRuntimeException(String str) {
        super(str);
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedRuntimeException(Throwable th) {
        super(th);
        this.exceptionContext = new DefaultExceptionContext();
    }

    @Override // org.apache.commons.lang3.exception.AbstractC69879a
    public ContextedRuntimeException addContextValue(String str, Object obj) {
        this.exceptionContext.addContextValue(str, obj);
        return this;
    }

    @Override // org.apache.commons.lang3.exception.AbstractC69879a
    public ContextedRuntimeException setContextValue(String str, Object obj) {
        this.exceptionContext.setContextValue(str, obj);
        return this;
    }

    public ContextedRuntimeException(String str, Throwable th) {
        super(str, th);
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedRuntimeException(String str, Throwable th, AbstractC69879a aVar) {
        super(str, th);
        this.exceptionContext = aVar == null ? new DefaultExceptionContext() : aVar;
    }
}
