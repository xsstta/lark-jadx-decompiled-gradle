package com.bytedance.apm.impl;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.AddCommonParam;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface RetrofitMonitorService {
    @GET
    Call<TypedInput> fetch(@Url String str, @QueryMap Map<String, String> map, @AddCommonParam boolean z);

    @POST
    Call<TypedInput> report(@Url String str, @Body TypedOutput typedOutput, @HeaderList List<Header> list, @AddCommonParam boolean z);
}
