package org.apache.commons.net;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import org.apache.commons.net.util.ListenerList;

public class ProtocolCommandSupport implements Serializable {
    private static final long serialVersionUID = -8017692739988399978L;
    private final ListenerList __listeners = new ListenerList();
    private final Object __source;

    public int getListenerCount() {
        return this.__listeners.getListenerCount();
    }

    public void addProtocolCommandListener(AbstractC69938d dVar) {
        this.__listeners.addListener(dVar);
    }

    public void removeProtocolCommandListener(AbstractC69938d dVar) {
        this.__listeners.removeListener(dVar);
    }

    public ProtocolCommandSupport(Object obj) {
        this.__source = obj;
    }

    public void fireCommandSent(String str, String str2) {
        ProtocolCommandEvent protocolCommandEvent = new ProtocolCommandEvent(this.__source, str, str2);
        Iterator<EventListener> it = this.__listeners.iterator();
        while (it.hasNext()) {
            ((AbstractC69938d) it.next()).mo245782a(protocolCommandEvent);
        }
    }

    public void fireReplyReceived(int i, String str) {
        ProtocolCommandEvent protocolCommandEvent = new ProtocolCommandEvent(this.__source, i, str);
        Iterator<EventListener> it = this.__listeners.iterator();
        while (it.hasNext()) {
            ((AbstractC69938d) it.next()).mo245783b(protocolCommandEvent);
        }
    }
}
