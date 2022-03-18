package kotlinx.coroutines.channels;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Channel", "Lkotlinx/coroutines/channels/Channel;", "E", "capacity", "", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.channels.i */
public final class C69379i {
    /* renamed from: a */
    public static final <E> Channel<E> m266614a(int i) {
        if (i == -2) {
            return new ArrayChannel(Channel.f173515a.mo242839a());
        }
        if (i == -1) {
            return new ConflatedChannel();
        }
        if (i == 0) {
            return new RendezvousChannel();
        }
        if (i != Integer.MAX_VALUE) {
            return new ArrayChannel(i);
        }
        return new LinkedListChannel();
    }
}
