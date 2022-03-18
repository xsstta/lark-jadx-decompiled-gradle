package androidx.activity.contextaware;

import android.content.Context;

public interface ContextAware {
    void addOnContextAvailableListener(AbstractC0205b bVar);

    Context peekAvailableContext();

    void removeOnContextAvailableListener(AbstractC0205b bVar);
}
