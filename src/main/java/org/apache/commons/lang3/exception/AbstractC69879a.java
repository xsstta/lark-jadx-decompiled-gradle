package org.apache.commons.lang3.exception;

import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.tuple.Pair;

/* renamed from: org.apache.commons.lang3.exception.a */
public interface AbstractC69879a {
    AbstractC69879a addContextValue(String str, Object obj);

    List<Pair<String, Object>> getContextEntries();

    Set<String> getContextLabels();

    List<Object> getContextValues(String str);

    Object getFirstContextValue(String str);

    String getFormattedExceptionMessage(String str);

    AbstractC69879a setContextValue(String str, Object obj);
}
