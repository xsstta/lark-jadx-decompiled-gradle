package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.HttpCodec;

public final class StreamAllocation {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final Address address;
    public final Call call;
    private final Object callStackTrace;
    private boolean canceled;
    private HttpCodec codec;
    private RealConnection connection;
    private final ConnectionPool connectionPool;
    public final EventListener eventListener;
    protected int recycleCount;
    private int refusedStreamCount;
    private boolean released;
    private boolean reportedAcquired;
    private Route route;
    private RouteSelector.Selection routeSelection;
    private final RouteSelector routeSelector;

    public int recycleCount() {
        return this.recycleCount;
    }

    public Route route() {
        return this.route;
    }

    public synchronized RealConnection connection() {
        return this.connection;
    }

    private RouteDatabase routeDatabase() {
        return Internal.instance.routeDatabase(this.connectionPool);
    }

    public HttpCodec codec() {
        HttpCodec httpCodec;
        synchronized (this.connectionPool) {
            httpCodec = this.codec;
        }
        return httpCodec;
    }

    private Socket releaseIfNoNewStreams() {
        RealConnection realConnection = this.connection;
        if (realConnection == null || !realConnection.noNewStreams) {
            return null;
        }
        return deallocate(false, false, true);
    }

    public void cancel() {
        HttpCodec httpCodec;
        RealConnection realConnection;
        synchronized (this.connectionPool) {
            this.canceled = true;
            httpCodec = this.codec;
            realConnection = this.connection;
        }
        if (httpCodec != null) {
            httpCodec.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public boolean hasMoreRoutes() {
        RouteSelector.Selection selection;
        if (this.route != null || (((selection = this.routeSelection) != null && selection.hasNext()) || this.routeSelector.hasNext())) {
            return true;
        }
        return false;
    }

    public String toString() {
        RealConnection connection2 = connection();
        if (connection2 != null) {
            return connection2.toString();
        }
        return this.address.toString();
    }

    public void noNewStreams() {
        RealConnection realConnection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            realConnection = this.connection;
            deallocate = deallocate(true, false, false);
            if (this.connection != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public void release() {
        RealConnection realConnection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            realConnection = this.connection;
            deallocate = deallocate(false, true, false);
            if (this.connection != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    private void updateRequestIpInfo(RealConnection realConnection) {
        Request request = this.call.request();
        if (request != null) {
            request.setIpAddrStr(getConnectionIpStr(realConnection));
        }
    }

    private String getConnectionIpStr(RealConnection realConnection) {
        if (realConnection == null && realConnection.route() == null && realConnection.route().socketAddress() == null) {
            return "";
        }
        return realConnection.route().socketAddress().getAddress().getHostAddress();
    }

    private void release(RealConnection realConnection) {
        int size = realConnection.allocations.size();
        for (int i = 0; i < size; i++) {
            if (realConnection.allocations.get(i).get() == this) {
                realConnection.allocations.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public Socket releaseAndAcquire(RealConnection realConnection) {
        if (this.codec == null && this.connection.allocations.size() == 1) {
            Socket deallocate = deallocate(true, false, false);
            this.connection = realConnection;
            realConnection.allocations.add(this.connection.allocations.get(0));
            return deallocate;
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void streamFailed(java.io.IOException r7) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.streamFailed(java.io.IOException):void");
    }

    public static final class StreamAllocationReference extends WeakReference<StreamAllocation> {
        public final Object callStackTrace;

        StreamAllocationReference(StreamAllocation streamAllocation, Object obj) {
            super(streamAllocation);
            this.callStackTrace = obj;
        }
    }

    public void acquire(RealConnection realConnection, boolean z) {
        if (this.connection == null) {
            this.connection = realConnection;
            this.reportedAcquired = z;
            realConnection.allocations.add(new StreamAllocationReference(this, this.callStackTrace));
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.internal.http.HttpCodec newStream(okhttp3.OkHttpClient r8, okhttp3.Interceptor.Chain r9, boolean r10) {
        /*
            r7 = this;
            int r1 = r9.connectTimeoutMillis()
            int r2 = r9.readTimeoutMillis()
            int r3 = r9.writeTimeoutMillis()
            int r4 = r8.pingIntervalMillis()
            boolean r5 = r8.retryOnConnectionFailure()
            r0 = r7
            r6 = r10
            okhttp3.internal.connection.RealConnection r10 = r0.findHealthyConnection(r1, r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x002d }
            okhttp3.internal.http.HttpCodec r8 = r10.newCodec(r8, r9, r7)     // Catch:{ IOException -> 0x002b }
            r7.updateRequestIpInfo(r10)     // Catch:{ IOException -> 0x002b }
            okhttp3.ConnectionPool r9 = r7.connectionPool     // Catch:{ IOException -> 0x002b }
            monitor-enter(r9)     // Catch:{ IOException -> 0x002b }
            r7.codec = r8     // Catch:{ all -> 0x0028 }
            monitor-exit(r9)     // Catch:{ all -> 0x0028 }
            return r8
        L_0x0028:
            r8 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0028 }
            throw r8
        L_0x002b:
            r8 = move-exception
            goto L_0x002f
        L_0x002d:
            r8 = move-exception
            r10 = 0
        L_0x002f:
            if (r10 == 0) goto L_0x0034
            r7.updateRequestIpInfo(r10)
        L_0x0034:
            okhttp3.internal.connection.RouteException r9 = new okhttp3.internal.connection.RouteException
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.newStream(okhttp3.OkHttpClient, okhttp3.Interceptor$Chain, boolean):okhttp3.internal.http.HttpCodec");
    }

    private Socket deallocate(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.codec = null;
        }
        if (z2) {
            this.released = true;
        }
        RealConnection realConnection = this.connection;
        if (realConnection == null) {
            return null;
        }
        if (z) {
            realConnection.noNewStreams = true;
        }
        if (this.codec != null) {
            return null;
        }
        if (!this.released && !this.connection.noNewStreams) {
            return null;
        }
        release(this.connection);
        if (this.connection.allocations.isEmpty()) {
            this.connection.idleAtNanos = System.nanoTime();
            if (Internal.instance.connectionBecameIdle(this.connectionPool, this.connection)) {
                socket = this.connection.socket();
                this.connection = null;
                return socket;
            }
        }
        socket = null;
        this.connection = null;
        return socket;
    }

    public void streamFinished(boolean z, HttpCodec httpCodec, long j, IOException iOException) {
        RealConnection realConnection;
        Socket deallocate;
        boolean z2;
        this.eventListener.responseBodyEnd(this.call, j);
        synchronized (this.connectionPool) {
            if (httpCodec != null) {
                if (httpCodec == this.codec) {
                    if (!z) {
                        this.connection.successCount++;
                        this.recycleCount = this.connection.successCount;
                    }
                    realConnection = this.connection;
                    deallocate = deallocate(z, false, true);
                    if (this.connection != null) {
                        realConnection = null;
                    }
                    z2 = this.released;
                }
            }
            throw new IllegalStateException("expected " + this.codec + " but was " + httpCodec);
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (iOException != null) {
            this.eventListener.callFailed(this.call, iOException);
        } else if (z2) {
            this.eventListener.callEnd(this.call);
        }
    }

    public StreamAllocation(ConnectionPool connectionPool2, Address address2, Call call2, EventListener eventListener2, Object obj) {
        this.connectionPool = connectionPool2;
        this.address = address2;
        this.call = call2;
        this.eventListener = eventListener2;
        this.routeSelector = new RouteSelector(address2, routeDatabase(), call2, eventListener2);
        this.callStackTrace = obj;
    }

    private RealConnection findConnection(int i, int i2, int i3, int i4, boolean z) throws IOException {
        RealConnection realConnection;
        Socket releaseIfNoNewStreams;
        RealConnection realConnection2;
        Socket socket;
        boolean z2;
        Route route2;
        boolean z3;
        RouteSelector.Selection selection;
        synchronized (this.connectionPool) {
            if (this.released) {
                throw new IllegalStateException("released");
            } else if (this.codec != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.canceled) {
                realConnection = this.connection;
                releaseIfNoNewStreams = releaseIfNoNewStreams();
                realConnection2 = this.connection;
                socket = null;
                if (realConnection2 != null) {
                    realConnection = null;
                } else {
                    realConnection2 = null;
                }
                if (!this.reportedAcquired) {
                    realConnection = null;
                }
                if (realConnection2 == null) {
                    Internal.instance.get(this.connectionPool, this.address, this, null);
                    RealConnection realConnection3 = this.connection;
                    if (realConnection3 != null) {
                        realConnection2 = realConnection3;
                        z2 = true;
                        route2 = null;
                    } else {
                        route2 = this.route;
                    }
                } else {
                    route2 = null;
                }
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        Util.closeQuietly(releaseIfNoNewStreams);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (z2) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
        }
        if (realConnection2 != null) {
            return realConnection2;
        }
        if (route2 != null || ((selection = this.routeSelection) != null && selection.hasNext())) {
            z3 = false;
        } else {
            this.routeSelection = this.routeSelector.next();
            z3 = true;
        }
        synchronized (this.connectionPool) {
            if (!this.canceled) {
                if (z3) {
                    List<Route> all = this.routeSelection.getAll();
                    int size = all.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        Route route3 = all.get(i5);
                        Internal.instance.get(this.connectionPool, this.address, this, route3);
                        RealConnection realConnection4 = this.connection;
                        if (realConnection4 != null) {
                            this.route = route3;
                            realConnection2 = realConnection4;
                            z2 = true;
                            break;
                        }
                        i5++;
                    }
                }
                if (!z2) {
                    if (route2 == null) {
                        route2 = this.routeSelection.next();
                    }
                    this.route = route2;
                    this.refusedStreamCount = 0;
                    realConnection2 = new RealConnection(this.connectionPool, route2);
                    acquire(realConnection2, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (z2) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
            return realConnection2;
        }
        realConnection2.connect(i, i2, i3, i4, z, this.call, this.eventListener);
        routeDatabase().connected(realConnection2.route());
        synchronized (this.connectionPool) {
            this.reportedAcquired = true;
            Internal.instance.put(this.connectionPool, realConnection2);
            if (realConnection2.isMultiplexed()) {
                socket = Internal.instance.deduplicate(this.connectionPool, this.address, this);
                realConnection2 = this.connection;
            }
        }
        Util.closeQuietly(socket);
        this.eventListener.connectionAcquired(this.call, realConnection2);
        return realConnection2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.isHealthy(r9) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.connection.RealConnection findHealthyConnection(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            okhttp3.internal.connection.RealConnection r0 = r3.findConnection(r4, r5, r6, r7, r8)
            okhttp3.ConnectionPool r1 = r3.connectionPool
            monitor-enter(r1)
            int r2 = r0.successCount     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.isHealthy(r9)
            if (r1 != 0) goto L_0x0018
            r3.noNewStreams()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.findHealthyConnection(int, int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }
}
