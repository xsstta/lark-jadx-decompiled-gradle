package com.bytedance.ttnet;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.AddCommonParam;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.ExtraInfo;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.Multipart;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.PartMap;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Streaming;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface INetworkApi {
    @GET
    Call<String> doGet(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @FormUrlEncoded
    @POST
    Call<String> doPost(@MaxLength int i, @Url String str, @QueryMap Map<String, String> map, @FieldMap(encode = true) Map<String, String> map2, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @GET
    @Streaming
    Call<TypedInput> downloadFile(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map);

    @GET
    @Streaming
    Call<TypedInput> downloadFile(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @POST
    Call<String> postBody(@MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @Body TypedOutput typedOutput, @HeaderList List<Header> list);

    @Multipart
    @POST
    Call<String> postMultiPart(@MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @PartMap Map<String, TypedOutput> map2, @HeaderList List<Header> list);
}
