package com.bytedance.apm.agent.instrumentation.okhttp3;

import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.AbstractC69699e;
import okio.AbstractC69701g;
import okio.AbstractC69723u;
import okio.C69694c;
import okio.C69705k;

public class InterceptorImpl implements Interceptor {

    private class ResponseBodyWrapper extends ResponseBody {
        private AbstractC69699e bufferedSource;
        private final Response response;
        private final ResponseBody responseBody;
        public long totalBytesRead;
        private final TransactionState transactionState;

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.responseBody.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.responseBody.contentType();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, okhttp3.ResponseBody
        public void close() {
            this.responseBody.close();
            end();
        }

        public void end() {
            if (!this.transactionState.isComplete()) {
                this.transactionState.setBytesReceived(this.totalBytesRead);
                MonitorRecorder.reportMonitorData(this.transactionState, this.response);
            }
        }

        @Override // okhttp3.ResponseBody
        public AbstractC69699e source() {
            if (this.bufferedSource == null) {
                this.bufferedSource = C69705k.m267590a(source(this.responseBody.source()));
            }
            return this.bufferedSource;
        }

        private AbstractC69723u source(AbstractC69723u uVar) {
            return new AbstractC69701g(uVar) {
                /* class com.bytedance.apm.agent.instrumentation.okhttp3.InterceptorImpl.ResponseBodyWrapper.C27621 */

                @Override // okio.AbstractC69701g, okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    super.close();
                    ResponseBodyWrapper.this.end();
                }

                @Override // okio.AbstractC69701g, okio.AbstractC69723u
                public long read(C69694c cVar, long j) throws IOException {
                    long read = super.read(cVar, j);
                    if (read >= 0) {
                        ResponseBodyWrapper.this.totalBytesRead += read;
                    }
                    return read;
                }
            };
        }

        public ResponseBodyWrapper(Response response2, TransactionState transactionState2) {
            this.response = response2;
            this.responseBody = response2.body();
            this.transactionState = transactionState2;
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        String header = request.header("User-Agent");
        if (header != null && header.contains("tt")) {
            return chain.proceed(request);
        }
        TransactionState transactionState = new TransactionState();
        MonitorRecorder.recordRequest(request, transactionState);
        try {
            Response proceed = chain.proceed(request);
            MonitorRecorder.recordResponse(proceed, transactionState);
            if (transactionState.getReceivedBytes() >= 0 || TextUtils.isEmpty(proceed.header("Transfer-Encoding"))) {
                MonitorRecorder.reportMonitorData(transactionState, proceed);
                return proceed;
            }
            transactionState.addAssistData("Transfer-Encoding", proceed.header("Transfer-Encoding"));
            return proceed.newBuilder().body(new ResponseBodyWrapper(proceed, transactionState)).build();
        } catch (IOException e) {
            MonitorRecorder.reportExceptionMonitor(transactionState, e);
            throw e;
        }
    }
}
