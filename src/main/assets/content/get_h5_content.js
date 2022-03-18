(function($){
var titleEle = [].slice.call($.document.head.getElementsByTagName('title'))[0];
var title = (titleEle && titleEle.innerText) || "";
var descEle = [].slice.call(document.head.getElementsByTagName('meta')).find(function(a){return a.getAttribute('name')==="description"});
var desc = (descEle && descEle.getAttribute('content')) || "";
if(!desc){
desc=document.body.innerText.replace(/\n/g, " ");
}

//新的img解析方案
var min_image_size=100;
var imgs=document.querySelectorAll('body img');
var iconUrl = '';
for (var i = 0; i<imgs.length;i++) {
    var img = imgs[i];
    if (img.naturalWidth>min_image_size&&img.naturalHeight>min_image_size) {
        iconUrl=img.src;
        break;
    }
}


return {title: title.replace(/[\n\t]/g, "").replace(/^\s+/g, "").replace(/\s+$/, ""), desc: desc, iconUrl: iconUrl}
})(window);